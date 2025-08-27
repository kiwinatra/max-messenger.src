package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: ax1  reason: default package */
public final class ax1 extends bt1 {
    public final CameraCaptureSession.CaptureCallback a;

    public ax1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
