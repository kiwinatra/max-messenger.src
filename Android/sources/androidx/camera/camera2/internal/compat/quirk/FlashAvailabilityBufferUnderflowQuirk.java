package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;

public class FlashAvailabilityBufferUnderflowQuirk implements icc {
    public static final HashSet a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
