package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public class ExtraSupportedSurfaceCombinationsQuirk implements icc {
    public static final k3f a;
    public static final k3f b;
    public static final HashSet c = new HashSet(Arrays.asList(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"}));
    public static final HashSet d = new HashSet(Arrays.asList(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"}));

    static {
        k3f k3f = new k3f();
        l3f l3f = l3f.VGA;
        rae.t(2, l3f, 0, k3f);
        l3f l3f2 = l3f.PREVIEW;
        rae.t(1, l3f2, 0, k3f);
        l3f l3f3 = l3f.MAXIMUM;
        rae.t(2, l3f3, 0, k3f);
        a = k3f;
        k3f k3f2 = new k3f();
        k3f2.a(new jc0(1, l3f2, 0));
        k3f2.a(new jc0(1, l3f, 0));
        rae.t(2, l3f3, 0, k3f2);
        b = k3f2;
    }

    public static boolean e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
