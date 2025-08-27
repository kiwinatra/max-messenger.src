package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: mvg  reason: default package */
public final class mvg {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final ct6 a;

    public mvg(ct6 ct6) {
        this.a = ct6;
    }

    public final e5h a(e5h e5h) {
        ct6 ct6 = this.a;
        ct6.getClass();
        boolean z = true;
        if (!e5h.n && !((Boolean) BasePendingResult.o.get()).booleanValue()) {
            z = false;
        }
        e5h.n = z;
        ht6 ht6 = ct6.X;
        ht6.getClass();
        vvg vvg = new vvg(new ewg(e5h), ht6.z.get(), ct6);
        ws9 ws9 = ht6.v0;
        ws9.sendMessage(ws9.obtainMessage(4, vvg));
        return e5h;
    }
}
