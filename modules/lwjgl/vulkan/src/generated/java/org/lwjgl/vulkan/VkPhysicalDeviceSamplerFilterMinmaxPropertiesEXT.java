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
 * See {@link VkPhysicalDeviceSamplerFilterMinmaxProperties}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 filterMinmaxSingleComponentFormats;
 *     VkBool32 filterMinmaxImageComponentMapping;
 * }</code></pre>
 */
public class VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT extends VkPhysicalDeviceSamplerFilterMinmaxProperties {

    /**
     * Creates a {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT set(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer {

        private static final VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.npNext(address(), value); return this; }

    }

}