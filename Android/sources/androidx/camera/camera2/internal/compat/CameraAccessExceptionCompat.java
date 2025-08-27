package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CameraAccessExceptionCompat extends Exception {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{4, 5, 1, 2, 3})));
    public final int a;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{10001, 10002})));
    }

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.a = cameraAccessException.getReason();
    }

    public static CameraAccessExceptionCompat a(CameraAccessException cameraAccessException) {
        return new CameraAccessExceptionCompat(cameraAccessException);
    }

    public CameraAccessExceptionCompat(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", new Object[]{"CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str}), assertionError);
        this.a = 10002;
        if (b.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
