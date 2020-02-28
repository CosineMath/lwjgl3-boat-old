/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glEGLImageTargetTexStorageEXTPROC) (jint, intptr_t, intptr_t);
typedef void (APIENTRY *glEGLImageTargetTextureStorageEXTPROC) (jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTEGLImageStorage_nglEGLImageTargetTexStorageEXT__IJJ(JNIEnv *__env, jclass clazz, jint target, jlong imageAddress, jlong attrib_listAddress) {
    glEGLImageTargetTexStorageEXTPROC glEGLImageTargetTexStorageEXT = (glEGLImageTargetTexStorageEXTPROC)tlsGetFunction(426);
    intptr_t image = (intptr_t)imageAddress;
    intptr_t attrib_list = (intptr_t)attrib_listAddress;
    UNUSED_PARAM(clazz)
    glEGLImageTargetTexStorageEXT(target, image, attrib_list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTEGLImageStorage_nglEGLImageTargetTextureStorageEXT__IJJ(JNIEnv *__env, jclass clazz, jint texture, jlong imageAddress, jlong attrib_listAddress) {
    glEGLImageTargetTextureStorageEXTPROC glEGLImageTargetTextureStorageEXT = (glEGLImageTargetTextureStorageEXTPROC)tlsGetFunction(427);
    intptr_t image = (intptr_t)imageAddress;
    intptr_t attrib_list = (intptr_t)attrib_listAddress;
    UNUSED_PARAM(clazz)
    glEGLImageTargetTextureStorageEXT(texture, image, attrib_list);
}

EXTERN_C_EXIT
