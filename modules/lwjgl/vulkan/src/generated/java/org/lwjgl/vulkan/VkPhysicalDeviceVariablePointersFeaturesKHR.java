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
 * struct VkPhysicalDeviceVariablePointersFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 variablePointersStorageBuffer;
 *     VkBool32 variablePointers;
 * }</code></pre>
 */
public class VkPhysicalDeviceVariablePointersFeaturesKHR extends VkPhysicalDeviceVariablePointersFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceVariablePointersFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVariablePointersFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceVariablePointersFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceVariablePointersFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
    @Override
    public VkPhysicalDeviceVariablePointersFeaturesKHR variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code variablePointers} field. */
    @Override
    public VkPhysicalDeviceVariablePointersFeaturesKHR variablePointers(@NativeType("VkBool32") boolean value) { nvariablePointers(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceVariablePointersFeaturesKHR set(
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
    public VkPhysicalDeviceVariablePointersFeaturesKHR set(VkPhysicalDeviceVariablePointersFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVariablePointersFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceVariablePointersFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointersFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceVariablePointersFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointersFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVariablePointersFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointersFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceVariablePointersFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVariablePointersFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVariablePointersFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVariablePointersFeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointersFeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVariablePointersFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVariablePointersFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVariablePointersFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVariablePointersFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVariablePointersFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceVariablePointersFeatures.Buffer {

        private static final VkPhysicalDeviceVariablePointersFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVariablePointersFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVariablePointersFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVariablePointersFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVariablePointersFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVariablePointersFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
        @Override
        public VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointersFeaturesKHR.nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code variablePointers} field. */
        @Override
        public VkPhysicalDeviceVariablePointersFeaturesKHR.Buffer variablePointers(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointersFeaturesKHR.nvariablePointers(address(), value ? 1 : 0); return this; }

    }

}