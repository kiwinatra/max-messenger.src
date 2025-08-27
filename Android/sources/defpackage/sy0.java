package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: sy0  reason: default package */
public final /* synthetic */ class sy0 implements n9e {
    public final /* synthetic */ hz0 a;
    public final /* synthetic */ ue1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ List o;
    public final /* synthetic */ Runnable v;
    public final /* synthetic */ Runnable w;

    public /* synthetic */ sy0(hz0 hz0, ue1 ue1, boolean z, List list, Runnable runnable, Runnable runnable2) {
        this.a = hz0;
        this.b = ue1;
        this.c = z;
        this.o = list;
        this.v = runnable;
        this.w = runnable2;
    }

    public final void k(JSONObject jSONObject) {
        ye1 ye1;
        hz0 hz0 = this.a;
        hz0.getClass();
        if (jSONObject.optString("error").isEmpty()) {
            ef1 ef1 = hz0.n1;
            ef1.getClass();
            LinkedHashSet<ye1> linkedHashSet = new LinkedHashSet<>();
            ye1 ye12 = ef1.a;
            ue1 ue1 = ye12.a;
            ue1 ue12 = this.b;
            if (ue1 == null || !ue1.equals(ue12)) {
                Set<ue1> set = (Set) ef1.h.get(ue12.a);
                if (set != null) {
                    for (ue1 ue13 : set) {
                        zwd zwd = (zwd) ef1.g.get(ue13);
                        if (!(zwd == null || (ye1 = (ye1) ef1.d(zwd).get(ue13)) == null)) {
                            linkedHashSet.add(ye1);
                        }
                    }
                }
            } else {
                linkedHashSet.add(ye12);
            }
            if (!linkedHashSet.isEmpty()) {
                for (ye1 ye13 : linkedHashSet) {
                    boolean z = this.c;
                    List list = this.o;
                    if (z) {
                        ye13.d.removeAll(list);
                    } else {
                        ye13.d.addAll(list);
                    }
                }
                hz0.k(b51.F0, linkedHashSet);
            }
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Runnable runnable2 = this.w;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
