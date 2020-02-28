/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkSamplerReductionModeCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerReductionModeCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSamplerReductionMode reductionMode;
 * }</code></pre>
 */
public class VkSamplerReductionModeCreateInfoEXT extends VkSamplerReductionModeCreateInfo {

    /**
     * Creates a {@code VkSamplerReductionModeCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerReductionModeCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSamplerReductionModeCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSamplerReductionModeCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code reductionMode} field. */
    @Override
    public VkSamplerReductionModeCreateInfoEXT reductionMode(@NativeType("VkSamplerReductionMode") int value) { nreductionMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSamplerReductionModeCreateInfoEXT set(
        int sType,
        long pNext,
        int reductionMode
    ) {
        sType(sType);
        pNext(pNext);
        reductionMode(reductionMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerReductionModeCreateInfoEXT set(VkSamplerReductionModeCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerReductionModeCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerReductionModeCreateInfoEXT malloc() {
        return wrap(VkSamplerReductionModeCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSamplerReductionModeCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerReductionModeCreateInfoEXT calloc() {
        return wrap(VkSamplerReductionModeCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSamplerReductionModeCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSamplerReductionModeCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSamplerReductionModeCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerReductionModeCreateInfoEXT} instance for the specified memory address. */
    public static VkSamplerReductionModeCreateInfoEXT create(long address) {
        return wrap(VkSamplerReductionModeCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerReductionModeCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkSamplerReductionModeCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSamplerReductionModeCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerReductionModeCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerReductionModeCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSamplerReductionModeCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSamplerReductionModeCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSamplerReductionModeCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSamplerReductionModeCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerReductionModeCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkSamplerReductionModeCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSamplerReductionModeCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerReductionModeCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkSamplerReductionModeCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSamplerReductionModeCreateInfoEXT} structs. */
    public static class Buffer extends VkSamplerReductionModeCreateInfo.Buffer {

        private static final VkSamplerReductionModeCreateInfoEXT ELEMENT_FACTORY = VkSamplerReductionModeCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSamplerReductionModeCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerReductionModeCreateInfoEXT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkSamplerReductionModeCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSamplerReductionModeCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerReductionModeCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSamplerReductionModeCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSamplerReductionModeCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code reductionMode} field. */
        @Override
        public VkSamplerReductionModeCreateInfoEXT.Buffer reductionMode(@NativeType("VkSamplerReductionMode") int value) { VkSamplerReductionModeCreateInfoEXT.nreductionMode(address(), value); return this; }

    }

}