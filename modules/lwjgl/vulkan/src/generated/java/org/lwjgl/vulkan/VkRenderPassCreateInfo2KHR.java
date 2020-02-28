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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkRenderPassCreateInfo2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassCreateInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderPassCreateFlags flags;
 *     uint32_t attachmentCount;
 *     {@link VkAttachmentDescription2 VkAttachmentDescription2} const * pAttachments;
 *     uint32_t subpassCount;
 *     {@link VkSubpassDescription2 VkSubpassDescription2} const * pSubpasses;
 *     uint32_t dependencyCount;
 *     {@link VkSubpassDependency2 VkSubpassDependency2} const * pDependencies;
 *     uint32_t correlatedViewMaskCount;
 *     uint32_t const * pCorrelatedViewMasks;
 * }</code></pre>
 */
public class VkRenderPassCreateInfo2KHR extends VkRenderPassCreateInfo2 {

    /**
     * Creates a {@code VkRenderPassCreateInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassCreateInfo2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderPassCreateInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderPassCreateInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkRenderPassCreateInfo2KHR flags(@NativeType("VkRenderPassCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentDescription2.Buffer} to the {@code pAttachments} field. */
    @Override
    public VkRenderPassCreateInfo2KHR pAttachments(@Nullable @NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.Buffer value) { npAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDescription2.Buffer} to the {@code pSubpasses} field. */
    @Override
    public VkRenderPassCreateInfo2KHR pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) { npSubpasses(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDependency2.Buffer} to the {@code pDependencies} field. */
    @Override
    public VkRenderPassCreateInfo2KHR pDependencies(@Nullable @NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.Buffer value) { npDependencies(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelatedViewMasks} field. */
    @Override
    public VkRenderPassCreateInfo2KHR pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCorrelatedViewMasks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderPassCreateInfo2KHR set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkAttachmentDescription2.Buffer pAttachments,
        VkSubpassDescription2.Buffer pSubpasses,
        @Nullable VkSubpassDependency2.Buffer pDependencies,
        @Nullable IntBuffer pCorrelatedViewMasks
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pAttachments(pAttachments);
        pSubpasses(pSubpasses);
        pDependencies(pDependencies);
        pCorrelatedViewMasks(pCorrelatedViewMasks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassCreateInfo2KHR set(VkRenderPassCreateInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2KHR malloc() {
        return wrap(VkRenderPassCreateInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2KHR calloc() {
        return wrap(VkRenderPassCreateInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreateInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderPassCreateInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2KHR} instance for the specified memory address. */
    public static VkRenderPassCreateInfo2KHR create(long address) {
        return wrap(VkRenderPassCreateInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreateInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderPassCreateInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderPassCreateInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreateInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassCreateInfo2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassCreateInfo2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2KHR mallocStack(MemoryStack stack) {
        return wrap(VkRenderPassCreateInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2KHR callocStack(MemoryStack stack) {
        return wrap(VkRenderPassCreateInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassCreateInfo2KHR} structs. */
    public static class Buffer extends VkRenderPassCreateInfo2.Buffer {

        private static final VkRenderPassCreateInfo2KHR ELEMENT_FACTORY = VkRenderPassCreateInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkRenderPassCreateInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreateInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassCreateInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreateInfo2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassCreateInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo2KHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentDescription2.Buffer} to the {@code pAttachments} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer pAttachments(@Nullable @NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.Buffer value) { VkRenderPassCreateInfo2KHR.npAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDescription2.Buffer} to the {@code pSubpasses} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) { VkRenderPassCreateInfo2KHR.npSubpasses(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDependency2.Buffer} to the {@code pDependencies} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer pDependencies(@Nullable @NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.Buffer value) { VkRenderPassCreateInfo2KHR.npDependencies(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelatedViewMasks} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassCreateInfo2KHR.npCorrelatedViewMasks(address(), value); return this; }

    }

}