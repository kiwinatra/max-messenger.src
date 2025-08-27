package defpackage;

import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.util.LinkedHashMap;

/* renamed from: ev7  reason: default package */
public abstract class ev7 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final bv7 a(Activity activity, boolean z) {
        bv7 bv7;
        bv7 bv72 = (bv7) a.get(activity);
        if (bv72 == null) {
            bv72 = null;
            if (!z || !(activity instanceof b)) {
                Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("LifecycleHandler");
                if (findFragmentByTag instanceof bv7) {
                    bv7 = (bv7) findFragmentByTag;
                }
            } else {
                a E = ((b) activity).v().E("LifecycleHandler");
                if (E instanceof bv7) {
                    bv7 = (bv7) E;
                }
            }
            bv72 = bv7;
        }
        if (bv72 != null) {
            bv72.o1(activity);
        }
        return bv72;
    }
}
