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
 * Structure describing descriptor indexing properties that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDescriptorIndexingProperties} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code maxUpdateAfterBindDescriptorsInAllPools} &ndash; the maximum number of descriptors (summed over all descriptor types) that <b>can</b> be created across all pools that are created with the {@link VK12#VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT} bit set. Pool creation <b>may</b> fail when this limit is exceeded, or when the space this limit represents is unable to satisfy a pool creation due to fragmentation.</li>
 * <li>{@code shaderUniformBufferArrayNonUniformIndexingNative} &ndash; a boolean value indicating whether uniform buffer descriptors natively support nonuniform indexing. If this is {@link VK10#VK_FALSE FALSE}, then a single dynamic instance of an instruction that nonuniformly indexes an array of uniform buffers <b>may</b> execute multiple times in order to access all the descriptors.</li>
 * <li>{@code shaderSampledImageArrayNonUniformIndexingNative} &ndash; a boolean value indicating whether sampler and image descriptors natively support nonuniform indexing. If this is {@link VK10#VK_FALSE FALSE}, then a single dynamic instance of an instruction that nonuniformly indexes an array of samplers or images <b>may</b> execute multiple times in order to access all the descriptors.</li>
 * <li>{@code shaderStorageBufferArrayNonUniformIndexingNative} &ndash; a boolean value indicating whether storage buffer descriptors natively support nonuniform indexing. If this is {@link VK10#VK_FALSE FALSE}, then a single dynamic instance of an instruction that nonuniformly indexes an array of storage buffers <b>may</b> execute multiple times in order to access all the descriptors.</li>
 * <li>{@code shaderStorageImageArrayNonUniformIndexingNative} &ndash; a boolean value indicating whether storage image descriptors natively support nonuniform indexing. If this is {@link VK10#VK_FALSE FALSE}, then a single dynamic instance of an instruction that nonuniformly indexes an array of storage images <b>may</b> execute multiple times in order to access all the descriptors.</li>
 * <li>{@code shaderInputAttachmentArrayNonUniformIndexingNative} &ndash; a boolean value indicating whether input attachment descriptors natively support nonuniform indexing. If this is {@link VK10#VK_FALSE FALSE}, then a single dynamic instance of an instruction that nonuniformly indexes an array of input attachments <b>may</b> execute multiple times in order to access all the descriptors.</li>
 * <li>{@code robustBufferAccessUpdateAfterBind} &ndash; a boolean value indicating whether <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> <b>can</b> be enabled in a device simultaneously with {@code descriptorBindingUniformBufferUpdateAfterBind}, {@code descriptorBindingStorageBufferUpdateAfterBind}, {@code descriptorBindingUniformTexelBufferUpdateAfterBind}, and/or {@code descriptorBindingStorageTexelBufferUpdateAfterBind}. If this is {@link VK10#VK_FALSE FALSE}, then either {@code robustBufferAccess} <b>must</b> be disabled or all of these update-after-bind features <b>must</b> be disabled.</li>
 * <li>{@code quadDivergentImplicitLod} &ndash; a boolean value indicating whether implicit level of detail calculations for image operations have well-defined results when the image and/or sampler objects used for the instruction are not uniform within a quad. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#textures-derivative-image-operations">Derivative Image Operations</a>.</li>
 * <li>{@code maxPerStageDescriptorUpdateAfterBindSamplers} &ndash; similar to {@code maxPerStageDescriptorSamplers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxPerStageDescriptorUpdateAfterBindUniformBuffers} &ndash; similar to {@code maxPerStageDescriptorUniformBuffers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxPerStageDescriptorUpdateAfterBindStorageBuffers} &ndash; similar to {@code maxPerStageDescriptorStorageBuffers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxPerStageDescriptorUpdateAfterBindSampledImages} &ndash; similar to {@code maxPerStageDescriptorSampledImages} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxPerStageDescriptorUpdateAfterBindStorageImages} &ndash; similar to {@code maxPerStageDescriptorStorageImages} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxPerStageDescriptorUpdateAfterBindInputAttachments} &ndash; similar to {@code maxPerStageDescriptorInputAttachments} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxPerStageUpdateAfterBindResources} &ndash; similar to {@code maxPerStageResources} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxDescriptorSetUpdateAfterBindSamplers} &ndash; similar to {@code maxDescriptorSetSamplers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxDescriptorSetUpdateAfterBindUniformBuffers} &ndash; similar to {@code maxDescriptorSetUniformBuffers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxDescriptorSetUpdateAfterBindUniformBuffersDynamic} &ndash; similar to {@code maxDescriptorSetUniformBuffersDynamic} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxDescriptorSetUpdateAfterBindStorageBuffers} &ndash; similar to {@code maxDescriptorSetStorageBuffers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxDescriptorSetUpdateAfterBindStorageBuffersDynamic} &ndash; similar to {@code maxDescriptorSetStorageBuffersDynamic} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxDescriptorSetUpdateAfterBindSampledImages} &ndash; similar to {@code maxDescriptorSetSampledImages} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxDescriptorSetUpdateAfterBindStorageImages} &ndash; similar to {@code maxDescriptorSetStorageImages} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxDescriptorSetUpdateAfterBindInputAttachments} &ndash; similar to {@code maxDescriptorSetInputAttachments} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDescriptorIndexingProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxUpdateAfterBindDescriptorsInAllPools;
 *     VkBool32 shaderUniformBufferArrayNonUniformIndexingNative;
 *     VkBool32 shaderSampledImageArrayNonUniformIndexingNative;
 *     VkBool32 shaderStorageBufferArrayNonUniformIndexingNative;
 *     VkBool32 shaderStorageImageArrayNonUniformIndexingNative;
 *     VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative;
 *     VkBool32 robustBufferAccessUpdateAfterBind;
 *     VkBool32 quadDivergentImplicitLod;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindSamplers;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindUniformBuffers;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindStorageBuffers;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindSampledImages;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindStorageImages;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindInputAttachments;
 *     uint32_t maxPerStageUpdateAfterBindResources;
 *     uint32_t maxDescriptorSetUpdateAfterBindSamplers;
 *     uint32_t maxDescriptorSetUpdateAfterBindUniformBuffers;
 *     uint32_t maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
 *     uint32_t maxDescriptorSetUpdateAfterBindStorageBuffers;
 *     uint32_t maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
 *     uint32_t maxDescriptorSetUpdateAfterBindSampledImages;
 *     uint32_t maxDescriptorSetUpdateAfterBindStorageImages;
 *     uint32_t maxDescriptorSetUpdateAfterBindInputAttachments;
 * }</code></pre>
 */
public class VkPhysicalDeviceDescriptorIndexingProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS,
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE,
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE,
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE,
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE,
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE,
        ROBUSTBUFFERACCESSUPDATEAFTERBIND,
        QUADDIVERGENTIMPLICITLOD,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS,
        MAXPERSTAGEUPDATEAFTERBINDRESOURCES,
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS,
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS,
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC,
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS,
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC,
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES,
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES,
        MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS = layout.offsetof(2);
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(3);
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(4);
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(5);
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(6);
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(7);
        ROBUSTBUFFERACCESSUPDATEAFTERBIND = layout.offsetof(8);
        QUADDIVERGENTIMPLICITLOD = layout.offsetof(9);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS = layout.offsetof(10);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS = layout.offsetof(11);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS = layout.offsetof(12);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES = layout.offsetof(13);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES = layout.offsetof(14);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS = layout.offsetof(15);
        MAXPERSTAGEUPDATEAFTERBINDRESOURCES = layout.offsetof(16);
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS = layout.offsetof(17);
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS = layout.offsetof(18);
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC = layout.offsetof(19);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS = layout.offsetof(20);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC = layout.offsetof(21);
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES = layout.offsetof(22);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES = layout.offsetof(23);
        MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS = layout.offsetof(24);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorIndexingProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorIndexingProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code maxUpdateAfterBindDescriptorsInAllPools} field. */
    @NativeType("uint32_t")
    public int maxUpdateAfterBindDescriptorsInAllPools() { return nmaxUpdateAfterBindDescriptorsInAllPools(address()); }
    /** Returns the value of the {@code shaderUniformBufferArrayNonUniformIndexingNative} field. */
    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexingNative() { return nshaderUniformBufferArrayNonUniformIndexingNative(address()) != 0; }
    /** Returns the value of the {@code shaderSampledImageArrayNonUniformIndexingNative} field. */
    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexingNative() { return nshaderSampledImageArrayNonUniformIndexingNative(address()) != 0; }
    /** Returns the value of the {@code shaderStorageBufferArrayNonUniformIndexingNative} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexingNative() { return nshaderStorageBufferArrayNonUniformIndexingNative(address()) != 0; }
    /** Returns the value of the {@code shaderStorageImageArrayNonUniformIndexingNative} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexingNative() { return nshaderStorageImageArrayNonUniformIndexingNative(address()) != 0; }
    /** Returns the value of the {@code shaderInputAttachmentArrayNonUniformIndexingNative} field. */
    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexingNative() { return nshaderInputAttachmentArrayNonUniformIndexingNative(address()) != 0; }
    /** Returns the value of the {@code robustBufferAccessUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean robustBufferAccessUpdateAfterBind() { return nrobustBufferAccessUpdateAfterBind(address()) != 0; }
    /** Returns the value of the {@code quadDivergentImplicitLod} field. */
    @NativeType("VkBool32")
    public boolean quadDivergentImplicitLod() { return nquadDivergentImplicitLod(address()) != 0; }
    /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindSamplers} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSamplers() { return nmaxPerStageDescriptorUpdateAfterBindSamplers(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindUniformBuffers} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindStorageBuffers} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindSampledImages} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() { return nmaxPerStageDescriptorUpdateAfterBindSampledImages(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindStorageImages} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() { return nmaxPerStageDescriptorUpdateAfterBindStorageImages(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindInputAttachments} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() { return nmaxPerStageDescriptorUpdateAfterBindInputAttachments(address()); }
    /** Returns the value of the {@code maxPerStageUpdateAfterBindResources} field. */
    @NativeType("uint32_t")
    public int maxPerStageUpdateAfterBindResources() { return nmaxPerStageUpdateAfterBindResources(address()); }
    /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindSamplers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSamplers() { return nmaxDescriptorSetUpdateAfterBindSamplers(address()); }
    /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindUniformBuffers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() { return nmaxDescriptorSetUpdateAfterBindUniformBuffers(address()); }
    /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindUniformBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(address()); }
    /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindStorageBuffers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() { return nmaxDescriptorSetUpdateAfterBindStorageBuffers(address()); }
    /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindStorageBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(address()); }
    /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindSampledImages} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSampledImages() { return nmaxDescriptorSetUpdateAfterBindSampledImages(address()); }
    /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindStorageImages} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageImages() { return nmaxDescriptorSetUpdateAfterBindStorageImages(address()); }
    /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindInputAttachments} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInputAttachments() { return nmaxDescriptorSetUpdateAfterBindInputAttachments(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorIndexingProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDescriptorIndexingProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorIndexingProperties set(
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
    public VkPhysicalDeviceDescriptorIndexingProperties set(VkPhysicalDeviceDescriptorIndexingProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorIndexingProperties malloc() {
        return wrap(VkPhysicalDeviceDescriptorIndexingProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorIndexingProperties calloc() {
        return wrap(VkPhysicalDeviceDescriptorIndexingProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorIndexingProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDescriptorIndexingProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorIndexingProperties create(long address) {
        return wrap(VkPhysicalDeviceDescriptorIndexingProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorIndexingProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDescriptorIndexingProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorIndexingProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorIndexingProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceDescriptorIndexingProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceDescriptorIndexingProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorIndexingProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorIndexingProperties mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDescriptorIndexingProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorIndexingProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorIndexingProperties callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDescriptorIndexingProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorIndexingProperties.PNEXT); }
    /** Unsafe version of {@link #maxUpdateAfterBindDescriptorsInAllPools}. */
    public static int nmaxUpdateAfterBindDescriptorsInAllPools(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS); }
    /** Unsafe version of {@link #shaderUniformBufferArrayNonUniformIndexingNative}. */
    public static int nshaderUniformBufferArrayNonUniformIndexingNative(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #shaderSampledImageArrayNonUniformIndexingNative}. */
    public static int nshaderSampledImageArrayNonUniformIndexingNative(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #shaderStorageBufferArrayNonUniformIndexingNative}. */
    public static int nshaderStorageBufferArrayNonUniformIndexingNative(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #shaderStorageImageArrayNonUniformIndexingNative}. */
    public static int nshaderStorageImageArrayNonUniformIndexingNative(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayNonUniformIndexingNative}. */
    public static int nshaderInputAttachmentArrayNonUniformIndexingNative(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #robustBufferAccessUpdateAfterBind}. */
    public static int nrobustBufferAccessUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.ROBUSTBUFFERACCESSUPDATEAFTERBIND); }
    /** Unsafe version of {@link #quadDivergentImplicitLod}. */
    public static int nquadDivergentImplicitLod(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.QUADDIVERGENTIMPLICITLOD); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindSamplers}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindSamplers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindUniformBuffers}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindStorageBuffers}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindSampledImages}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindSampledImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindStorageImages}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindStorageImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindInputAttachments}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindInputAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxPerStageUpdateAfterBindResources}. */
    public static int nmaxPerStageUpdateAfterBindResources(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEUPDATEAFTERBINDRESOURCES); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindSamplers}. */
    public static int nmaxDescriptorSetUpdateAfterBindSamplers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindUniformBuffers}. */
    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindUniformBuffersDynamic}. */
    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindStorageBuffers}. */
    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindStorageBuffersDynamic}. */
    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindSampledImages}. */
    public static int nmaxDescriptorSetUpdateAfterBindSampledImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindStorageImages}. */
    public static int nmaxDescriptorSetUpdateAfterBindStorageImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindInputAttachments}. */
    public static int nmaxDescriptorSetUpdateAfterBindInputAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorIndexingProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorIndexingProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorIndexingProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorIndexingProperties ELEMENT_FACTORY = VkPhysicalDeviceDescriptorIndexingProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorIndexingProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorIndexingProperties#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected VkPhysicalDeviceDescriptorIndexingProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorIndexingProperties.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorIndexingProperties.npNext(address()); }
        /** Returns the value of the {@code maxUpdateAfterBindDescriptorsInAllPools} field. */
        @NativeType("uint32_t")
        public int maxUpdateAfterBindDescriptorsInAllPools() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxUpdateAfterBindDescriptorsInAllPools(address()); }
        /** Returns the value of the {@code shaderUniformBufferArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexingNative() { return VkPhysicalDeviceDescriptorIndexingProperties.nshaderUniformBufferArrayNonUniformIndexingNative(address()) != 0; }
        /** Returns the value of the {@code shaderSampledImageArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexingNative() { return VkPhysicalDeviceDescriptorIndexingProperties.nshaderSampledImageArrayNonUniformIndexingNative(address()) != 0; }
        /** Returns the value of the {@code shaderStorageBufferArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexingNative() { return VkPhysicalDeviceDescriptorIndexingProperties.nshaderStorageBufferArrayNonUniformIndexingNative(address()) != 0; }
        /** Returns the value of the {@code shaderStorageImageArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexingNative() { return VkPhysicalDeviceDescriptorIndexingProperties.nshaderStorageImageArrayNonUniformIndexingNative(address()) != 0; }
        /** Returns the value of the {@code shaderInputAttachmentArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexingNative() { return VkPhysicalDeviceDescriptorIndexingProperties.nshaderInputAttachmentArrayNonUniformIndexingNative(address()) != 0; }
        /** Returns the value of the {@code robustBufferAccessUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean robustBufferAccessUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingProperties.nrobustBufferAccessUpdateAfterBind(address()) != 0; }
        /** Returns the value of the {@code quadDivergentImplicitLod} field. */
        @NativeType("VkBool32")
        public boolean quadDivergentImplicitLod() { return VkPhysicalDeviceDescriptorIndexingProperties.nquadDivergentImplicitLod(address()) != 0; }
        /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindSamplers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSamplers() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindSamplers(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindUniformBuffers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindStorageBuffers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindSampledImages} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSampledImages() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindSampledImages(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindStorageImages} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageImages() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindStorageImages(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindInputAttachments} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInputAttachments() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindInputAttachments(address()); }
        /** Returns the value of the {@code maxPerStageUpdateAfterBindResources} field. */
        @NativeType("uint32_t")
        public int maxPerStageUpdateAfterBindResources() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageUpdateAfterBindResources(address()); }
        /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindSamplers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSamplers() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindSamplers(address()); }
        /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindUniformBuffers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffers() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindUniformBuffers(address()); }
        /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindUniformBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(address()); }
        /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindStorageBuffers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffers() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindStorageBuffers(address()); }
        /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindStorageBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(address()); }
        /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindSampledImages} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSampledImages() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindSampledImages(address()); }
        /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindStorageImages} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageImages() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindStorageImages(address()); }
        /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindInputAttachments} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInputAttachments() { return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindInputAttachments(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorIndexingProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingProperties.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDescriptorIndexingProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorIndexingProperties.npNext(address(), value); return this; }

    }

}