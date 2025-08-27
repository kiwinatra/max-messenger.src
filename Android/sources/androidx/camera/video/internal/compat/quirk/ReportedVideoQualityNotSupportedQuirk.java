package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;

public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    public static boolean e() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList(new String[]{"JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1"}).contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean h() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    public final boolean a(qu1 qu1, yb0 yb0) {
        if (e() || f()) {
            return yb0 == yb0.g;
        }
        if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            return yb0 == yb0.e || yb0 == yb0.f;
        }
        if (g()) {
            return qu1.h() == 0 && (yb0 == yb0.f || yb0 == yb0.e);
        }
        if (h()) {
            return qu1.h() == 1 && yb0 == yb0.g;
        }
        return false;
    }

    public final boolean b() {
        return e() || f() || g() || h();
    }
}
