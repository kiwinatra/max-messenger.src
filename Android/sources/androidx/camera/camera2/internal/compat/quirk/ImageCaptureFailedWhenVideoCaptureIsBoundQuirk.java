package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;

public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {
    public static boolean e() {
        return "blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean f() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            String str = Build.DEVICE;
            if ("gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i() {
        return "vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    public final boolean b() {
        if (!e() && !f() && !i() && !g()) {
            String str = Build.MODEL;
            if ((!"pixel 4 xl".equalsIgnoreCase(str) || Build.VERSION.SDK_INT != 29) && ((!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto e13".equalsIgnoreCase(str)) && !h())) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        return e() || f() || i() || g();
    }
}
