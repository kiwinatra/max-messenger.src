package com.facebook.fresco.ui.common;

import com.facebook.fresco.ui.common.ControllerListener2;
import kotlin.jvm.JvmStatic;

public class a implements ControllerListener2 {
    public static final aj0 Companion = new Object();
    /* access modifiers changed from: private */
    public static final ControllerListener2<?> NO_OP_LISTENER = new Object();

    @JvmStatic
    public static final <I> ControllerListener2<I> getNoOpListener() {
        Companion.getClass();
        return NO_OP_LISTENER;
    }

    public void onEmptyEvent(Object obj) {
    }

    public void onFailure(String str, Throwable th, ControllerListener2.Extras extras) {
    }

    public void onFinalImageSet(String str, Object obj, ControllerListener2.Extras extras) {
    }

    public void onIntermediateImageFailed(String str) {
    }

    public void onIntermediateImageSet(String str, Object obj) {
    }

    public void onRelease(String str, ControllerListener2.Extras extras) {
    }

    public void onSubmit(String str, Object obj, ControllerListener2.Extras extras) {
    }
}
