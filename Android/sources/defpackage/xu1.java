package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* renamed from: xu1  reason: default package */
public final class xu1 extends wu1 {
    public final Set G() {
        try {
            return ((CameraManager) this.b).getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.a(e);
        }
    }
}
