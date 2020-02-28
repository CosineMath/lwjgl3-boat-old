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
 * See {@link VkPhysicalDeviceVariablePointersFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVariablePointerFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 variablePointersStorageBuffer;
 *     VkBool32 variablePointers;
 * }</code></pre>
 */
public class VkPhysicalDeviceVariablePointerFeatures extends VkPhysicalDeviceVariablePointersFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceVariablePointerFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVariablePointerFeatures(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceVariablePointerFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceVariablePointerFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
    @Override
    public VkPhysicalDeviceVariablePointerFeatures variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code variablePointers} field. */
    @Override
    public VkPhysicalDeviceVariablePointerFeatures variablePointers(@NativeType("VkBool32") boolean value) { nvariablePointers(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceVariablePointerFeatures set(
        int sType,
        long pNext,
        boolean variablePointersStorageBuffer,
        boolean variablePointers
    ) {
        sType(sType);
        pNext(pNext);
        variablePointersStorageBuffer(variablePointersStorageBuffer);
        variablePointers(variablePointers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVariablePointerFeatures set(VkPhysicalDeviceVariablePointerFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVariablePointerFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointerFeatures malloc() {
        return wrap(VkPhysicalDeviceVariablePointerFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointerFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointerFeatures calloc() {
        return wrap(VkPhysicalDeviceVariablePointerFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointerFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVariablePointerFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVariablePointerFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointerFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceVariablePointerFeatures create(long address) {
        return wrap(VkPhysicalDeviceVariablePointerFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVariablePointerFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVariablePointerFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVariablePointerFeatures} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceVariablePointerFeatures mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointerFeatures} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceVariablePointerFeatures callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVariablePointerFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointerFeatures mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVariablePointerFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVariablePointerFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointerFeatures callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVariablePointerFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVariablePointerFeatures} structs. */
    public static class Buffer extends VkPhysicalDeviceVariablePointersFeatures.Buffer {

        private static final VkPhysicalDeviceVariablePointerFeatures ELEMENT_FACTORY = VkPhysicalDeviceVariablePointerFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVariablePointerFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVariablePointerFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVariablePointerFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceVariablePointerFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVariablePointerFeatures.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceVariablePointerFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVariablePointerFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
        @Override
        public VkPhysicalDeviceVariablePointerFeatures.Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointerFeatures.nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code variablePointers} field. */
        @Override
        public VkPhysicalDeviceVariablePointerFeatures.Buffer variablePointers(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointerFeatures.nvariablePointers(address(), value ? 1 : 0); return this; }

    }

}