package defpackage;

import android.content.ContentResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h48  reason: default package */
public final class h48 {
    public static final /* synthetic */ int h = 0;
    public final sv0 a;
    public final s04 b;
    public final s48 c;
    public final gaf d;
    public final jx3 e;
    public final sqd f;
    public Map g = MapsKt.emptyMap();

    public h48(sv0 sv0, s04 s04, jtb jtb, s48 s48, gaf gaf, ContentResolver contentResolver, ln5 ln5) {
        this.a = sv0;
        this.b = s04;
        this.c = s48;
        this.d = gaf;
        osa osa = (osa) gaf;
        jx3 a2 = e14.a(osa.a());
        this.e = a2;
        this.f = new sqd(((ltb) jtb).c, new p7d(15, (Object) contentResolver, (Object) ln5));
        bs0.K(bs0.F(new ps5(((yd7) s48).Z, new f48(this, (Continuation) null), 5), osa.a()), e14.g(a2, s04));
    }

    public final List a(String str) {
        if (str == null) {
            return CollectionsKt.emptyList();
        }
        if (Intrinsics.areEqual((Object) str, (Object) "SELECTED_MEDIA_ALBUM")) {
            sqd sqd = this.f;
            sqd.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = sqd.a.iterator();
            while (it.hasNext()) {
                uqd uqd = (uqd) it.next();
                if (uqd.f) {
                    arrayList.add(uqd.a);
                }
            }
            return arrayList;
        }
        wk6 wk6 = (wk6) this.g.get(str);
        if (wk6 == null) {
            return CollectionsKt.emptyList();
        }
        Iterable<k48> d2 = ((yd7) this.c).d(wk6.a);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(d2, 10));
        for (k48 M : d2) {
            arrayList2.add(cvg.M(M));
        }
        return arrayList2;
    }
}
