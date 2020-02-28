/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.libdivide;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.util.concurrent.*;
import java.util.function.*;

import static java.lang.Math.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

@Test()
public class LibDivideTest {

    private static final int RANDOM_NUMERS = 10000;
    private static final int RANDOM_DENOMS = 100;

    // libdivide.h uses #pragma pack(push, 1) by default, which LWJGL disables.
    // This makes sure it is not reverted by mistake.
    public void testStructLayout() {
        assertEquals(LibDivideS32.SIZEOF, 8);
        assertEquals(LibDivideS32BranchFree.SIZEOF, 8);
        assertEquals(LibDivideU32.SIZEOF, 8);
        assertEquals(LibDivideU32BranchFree.SIZEOF, 8);

        assertEquals(LibDivideS32.ALIGNOF, 4);
        assertEquals(LibDivideS32BranchFree.ALIGNOF, 4);
        assertEquals(LibDivideU32.ALIGNOF, 4);
        assertEquals(LibDivideU32BranchFree.ALIGNOF, 4);

        assertEquals(LibDivideS64.SIZEOF, 16);
        assertEquals(LibDivideS64BranchFree.SIZEOF, 16);
        assertEquals(LibDivideU64.SIZEOF, 16);
        assertEquals(LibDivideU64BranchFree.SIZEOF, 16);

        assertEquals(LibDivideS64.ALIGNOF, 8);
        assertEquals(LibDivideS64BranchFree.ALIGNOF, 8);
        assertEquals(LibDivideU64.ALIGNOF, 8);
        assertEquals(LibDivideU64BranchFree.ALIGNOF, 8);
    }

    public void testS32() {
        Native32 doNative = (numer, denom) -> numer / denom;

        test32(
            LibDivideS32::mallocStack,
            LibDivide::libdivide_s32_gen_ref,
            LibDivide::libdivide_s32_gen,
            doNative,
            LibDivide::libdivide_s32_do_ref,
            LibDivide::libdivide_s32_do,
            false
        );

        test32(
            LibDivideS32BranchFree::mallocStack,
            LibDivide::libdivide_s32_branchfree_gen_ref,
            LibDivide::libdivide_s32_branchfree_gen,
            doNative,
            LibDivide::libdivide_s32_branchfree_do_ref,
            LibDivide::libdivide_s32_branchfree_do,
            false
        );
    }

    public void testU32() {
        Native32 doNative = Integer::divideUnsigned;

        test32(
            LibDivideU32::mallocStack,
            LibDivide::libdivide_u32_gen_ref,
            LibDivide::libdivide_u32_gen,
            doNative,
            LibDivide::libdivide_u32_do_ref,
            LibDivide::libdivide_u32_do,
            false
        );

        test32(
            LibDivideU32BranchFree::mallocStack,
            LibDivide::libdivide_u32_branchfree_gen_ref,
            LibDivide::libdivide_u32_branchfree_gen,
            doNative,
            LibDivide::libdivide_u32_branchfree_do_ref,
            LibDivide::libdivide_u32_branchfree_do,
            true
        );
    }

    public void testS64() {
        Native64 doNative = (numer, denom) -> numer / denom;

        test64(
            LibDivideS64::mallocStack,
            LibDivide::libdivide_s64_gen_ref,
            LibDivide::libdivide_s64_gen,
            doNative,
            LibDivide::libdivide_s64_do_ref,
            LibDivide::libdivide_s64_do,
            false
        );

        test64(
            LibDivideS64BranchFree::mallocStack,
            LibDivide::libdivide_s64_branchfree_gen_ref,
            LibDivide::libdivide_s64_branchfree_gen,
            doNative,
            LibDivide::libdivide_s64_branchfree_do_ref,
            LibDivide::libdivide_s64_branchfree_do,
            false
        );
    }

    public void testU64() {
        Native64 doNative = Long::divideUnsigned;

        test64(
            LibDivideU64::mallocStack,
            LibDivide::libdivide_u64_gen_ref,
            LibDivide::libdivide_u64_gen,
            doNative,
            LibDivide::libdivide_u64_do_ref,
            LibDivide::libdivide_u64_do,
            false
        );

        test64(
            LibDivideU64BranchFree::mallocStack,
            LibDivide::libdivide_u64_branchfree_gen_ref,
            LibDivide::libdivide_u64_branchfree_gen,
            doNative,
            LibDivide::libdivide_u64_branchfree_do_ref,
            LibDivide::libdivide_u64_branchfree_do,
            true
        );
    }

    private interface Gen32<T extends Struct> {
        T apply(int denom, T __result);
    }

    private interface Do32<T extends Struct> {
        int apply(int numer, T denom);
    }

    private interface Native32 {
        int apply(int numer, int denom);
    }

    private static <T extends Struct> void test32(
        Function<MemoryStack, T> malloc,
        Gen32<T> genRef, Gen32<T> gen,
        Native32 doNative, Do32<T> doRef, Do32<T> doJava,
        boolean skipOne
    ) {
        try (MemoryStack stack = stackPush()) {
            T magic = malloc.apply(stack);

            // Corner cases
            int[] numers = {0, -1, 1, -2, 2, -3, 3, Integer.MIN_VALUE, Integer.MAX_VALUE};
            for (int d : numers) {
                if (d == 0 || (skipOne && d == 1)) {
                    continue;
                }
                test32(magic, genRef, gen, d);
                for (int n : numers) {
                    test32(magic, doNative, doRef, doJava, d, n);
                }
            }

            // Random
            ThreadLocalRandom rand = ThreadLocalRandom.current();
            for (int i = 0; i < RANDOM_DENOMS; i++) {
                int d;
                do {
                    d = rand.nextInt();
                } while (skipOne && d == 1);

                test32(magic, genRef, gen, d);
                for (int j = 0; j < RANDOM_NUMERS; j++) {
                    test32(magic, doNative, doRef, doJava, d, rand.nextInt());
                }
            }
        }
    }

    private static <T extends Struct> void test32(T magic, Gen32<T> genRef, Gen32<T> gen, int d) {
        genRef.apply(d, magic);

        int  m = memGetInt(magic.address());
        byte b = memGetByte(magic.address() + 4);

        memPutInt(magic.address(), 0);
        memPutByte(magic.address() + 4, (byte)0);

        gen.apply(d, magic);

        assertEquals(memGetInt(magic.address()), m);
        assertEquals(memGetByte(magic.address() + 4), b);
    }

    private static <T extends Struct> void test32(T magic, Native32 doNative, Do32<T> doRef, Do32<T> doJava, int d, int n) {
        int refNative = doNative.apply(n, d);

        int ref = doRef.apply(n, magic);
        if (ref != refNative) {
            throw new IllegalStateException(n + " / " + d + ", expected native [" + refNative + "] but found libdivide [" + ref + "]");
        }

        int java = doJava.apply(n, magic);
        if (java != ref) {
            throw new IllegalStateException(n + " / " + d + ", expected libdivide [" + ref + "] but found LWJGL [" + java + "]");
        }
    }

    private interface Gen64<T extends Struct> {
        T apply(long denom, T __result);
    }

    private interface Do64<T extends Struct> {
        long apply(long numer, T denom);
    }

    private interface Native64 {
        long apply(long numer, long denom);
    }

    private static <T extends Struct> void test64(
        Function<MemoryStack, T> malloc,
        Gen64<T> genRef, Gen64<T> gen,
        Native64 doNative, Do64<T> doRef, Do64<T> doJava,
        boolean skipOne
    ) {
        try (MemoryStack stack = stackPush()) {

            T magic = malloc.apply(stack);

            // Corner cases
            long[] numers = {0L, -1L, 1L, -2L, 2L, -3L, 3L, Integer.MIN_VALUE, Integer.MAX_VALUE, Long.MIN_VALUE, Long.MAX_VALUE};
            for (long d : numers) {
                if (d == 0L || (skipOne && d == 1L)) {
                    continue;
                }
                test64(magic, genRef, gen, d);
                for (long n : numers) {
                    test64(magic, doNative, doRef, doJava, d, n);
                }
            }

            // Random
            ThreadLocalRandom rand = ThreadLocalRandom.current();
            for (int i = 0; i < RANDOM_DENOMS; i++) {
                long d;
                do {
                    d = rand.nextLong();
                } while (skipOne && d == 1L);

                test64(magic, genRef, gen, d);
                for (int j = 0; j < RANDOM_NUMERS; j++) {
                    test64(magic, doNative, doRef, doJava, d, rand.nextLong());
                }
            }
        }
    }

    private static <T extends Struct> void test64(T magic, Gen64<T> genRef, Gen64<T> gen, long d) {
        genRef.apply(d, magic);

        long m = memGetLong(magic.address());
        byte b = memGetByte(magic.address() + 8);

        memPutLong(magic.address(), 0);
        memPutByte(magic.address() + 8, (byte)0);

        gen.apply(d, magic);

        assertEquals(memGetLong(magic.address()), m);
        assertEquals(memGetByte(magic.address() + 8), b);
    }

    private static <T extends Struct> void test64(T magic, Native64 doNative, Do64<T> doRef, Do64<T> doJava, long d, long n) {
        long refNative = doNative.apply(n, d);

        long ref = doRef.apply(n, magic);
        if (ref != refNative) {
            throw new IllegalStateException(n + " / " + d + ", expected native [" + refNative + "] but found libdivide [" + ref + "]");
        }

        long java = doJava.apply(n, magic);
        if (java != ref) {
            throw new IllegalStateException(n + " / " + d + ", expected libdivide [" + ref + "] but found LWJGL [" + java + "]");
        }
    }

}