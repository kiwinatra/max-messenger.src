package defpackage;

import java.util.Hashtable;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* renamed from: wy0  reason: default package */
public final /* synthetic */ class wy0 implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz0 b;
    public final /* synthetic */ ue1 c;

    public /* synthetic */ wy0(hz0 hz0, ue1 ue1, int i) {
        this.a = i;
        this.b = hz0;
        this.c = ue1;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                hz0 hz0 = this.b;
                ef1 ef1 = hz0.n1;
                ef1.getClass();
                ye1 ye1 = (ye1) CollectionsKt.firstOrNull(ef1.m((zwd) null, CollectionsKt.listOf(this.c)));
                pt6 pt6 = hz0.h1;
                if (ye1 != null) {
                    ((Hashtable) pt6.d).remove(ye1);
                    return;
                } else {
                    pt6.getClass();
                    return;
                }
            default:
                hz0 hz02 = this.b;
                if (this.c.equals(hz02.G1)) {
                    hz02.G1 = null;
                    hz02.k(b51.G0, (Object) null);
                    return;
                }
                return;
        }
    }
}
