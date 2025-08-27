package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* renamed from: vs1  reason: default package */
public final class vs1 extends wie {
    public static final la0 c = new la0(Integer.TYPE, (Object) null, "camera2.captureRequest.templateType");
    public static final la0 o = new la0(Long.TYPE, (Object) null, "camera2.cameraCaptureSession.streamUseCase");
    public static final la0 v = new la0(CameraDevice.StateCallback.class, (Object) null, "camera2.cameraDevice.stateCallback");
    public static final la0 w = new la0(CameraCaptureSession.StateCallback.class, (Object) null, "camera2.cameraCaptureSession.stateCallback");
    public static final la0 x = new la0(CameraCaptureSession.CaptureCallback.class, (Object) null, "camera2.cameraCaptureSession.captureCallback");
    public static final la0 y = new la0(String.class, (Object) null, "camera2.cameraCaptureSession.physicalCameraId");

    public static la0 o0(CaptureRequest.Key key) {
        return new la0(Object.class, key, "camera2.captureRequest.option." + key.getName());
    }
}
