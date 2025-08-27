package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* renamed from: wu1  reason: default package */
public class wu1 extends fbf {
    public final CameraCharacteristics E(String str) {
        try {
            return ((CameraManager) this.b).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.a(e);
        }
    }

    public final void Y(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.b).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.a(e);
        }
    }

    public final void a0(tsd tsd, rr1 rr1) {
        ((CameraManager) this.b).registerAvailabilityCallback(tsd, rr1);
    }

    public final void f0(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.b).unregisterAvailabilityCallback(availabilityCallback);
    }
}
