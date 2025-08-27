package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;

/* renamed from: sv1  reason: default package */
public abstract class sv1 {
    public static final jv1 a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new wt7(2));
        a = new jv1(linkedHashSet);
    }

    public static void a(Context context, p7d p7d, jv1 jv1) {
        Integer num;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT < 34 || wn0.b(context) == 0) {
            if (jv1 != null) {
                try {
                    num = jv1.b();
                    if (num == null) {
                        return;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            } else {
                num = null;
            }
            String str = Build.DEVICE;
            PackageManager packageManager = context.getPackageManager();
            try {
                if (packageManager.hasSystemFeature("android.hardware.camera")) {
                    if (jv1 != null) {
                        if (num.intValue() == 1) {
                        }
                    }
                    jv1.c.c(p7d.v());
                    i = 1;
                }
            } catch (IllegalArgumentException e) {
                illegalArgumentException = e;
            }
            try {
                if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                    if (jv1 != null) {
                        if (num.intValue() == 0) {
                        }
                    }
                    jv1.b.c(p7d.v());
                    i++;
                }
            } catch (IllegalArgumentException e2) {
                illegalArgumentException = e2;
            }
            try {
                a.c(p7d.v());
                i++;
            } catch (IllegalArgumentException unused2) {
            }
            if (illegalArgumentException != null) {
                p7d.v().toString();
                throw new CameraValidator$CameraIdListIncorrectException("Expected camera missing from device.", i, illegalArgumentException);
            }
            return;
        }
        LinkedHashSet v = p7d.v();
        if (!v.isEmpty()) {
            wn0.b(context);
            v.size();
            return;
        }
        throw new CameraValidator$CameraIdListIncorrectException("No cameras available", 0, (IllegalArgumentException) null);
    }
}
