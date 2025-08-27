package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;

public class ExtraCroppingQuirk implements icc {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("SM-T580", (Object) null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", (Object) null);
        hashMap.put("SM-G570M", (Object) null);
        hashMap.put("SM-G610F", (Object) null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size e(int i) {
        if (!f()) {
            return null;
        }
        int y = tr1.y(i);
        if (y == 0) {
            return new Size(1920, 1080);
        }
        if (y == 1) {
            return new Size(1280, 720);
        }
        if (y != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }

    public static boolean f() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        HashMap hashMap = a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!hashMap.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) hashMap.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
