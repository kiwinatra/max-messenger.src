package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ZslDisablerQuirk implements icc {
    public static final List a = Arrays.asList(new String[]{"SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1"});
    public static final List b = Arrays.asList(new String[]{"MI 8"});

    public static boolean e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
