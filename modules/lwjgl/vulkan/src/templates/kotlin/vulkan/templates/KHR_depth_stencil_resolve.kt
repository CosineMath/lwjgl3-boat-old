/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_depth_stencil_resolve = "KHRDepthStencilResolve".nativeClassVK("KHR_depth_stencil_resolve", type = "device", postfix = KHR) {
    documentation =
        """
        This extension adds support for automatically resolving multisampled depth/stencil attachments in a subpass in a similar manner as for color attachments.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_depth_stencil_resolve}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>200</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRCreateRenderpass2 VK_KHR_create_renderpass2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_depth_stencil_resolve:%20&amp;body=@janharald%20">janharald</a></li>
            </ul></dd>

            <dt>Last Modified Date</dt>
            <dd>2018-04-09</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt>Contributors</dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Andrew Garrard, Samsung Electronics</li>
                <li>Soowan Park, Samsung Electronics</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DEPTH_STENCIL_RESOLVE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_DEPTH_STENCIL_RESOLVE_EXTENSION_NAME".."VK_KHR_depth_stencil_resolve"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR".."1000199000",
        "STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR".."1000199001"
    )

    EnumConstant(
        "Extends {@code VkResolveModeFlagBits}.",

        "RESOLVE_MODE_NONE_KHR".."0",
        "RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR".enum(0x00000001),
        "RESOLVE_MODE_AVERAGE_BIT_KHR".enum(0x00000002),
        "RESOLVE_MODE_MIN_BIT_KHR".enum(0x00000004),
        "RESOLVE_MODE_MAX_BIT_KHR".enum(0x00000008)
    )
}