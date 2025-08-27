package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.collections.SetsKt;

/* renamed from: gb9  reason: default package */
public final class gb9 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public gb9(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
    }

    public static a89 a(gb9 gb9, ha9 ha9) {
        gb9 gb92 = gb9;
        ha9 ha92 = ha9;
        SetsKt.emptySet();
        gb9.getClass();
        ha9 ha93 = ha92.A0;
        mc9 mc9 = ha93 != null ? new mc9(ha92.y0, ha92.z0, a(gb92, ha93), ha92.B0, ha92.C0, ha92.H0, ha92.I0) : null;
        ha9 ha94 = ha92.J0;
        return new a89(ha9, ((km3) gb92.a.getValue()).p(ha92.w, true), mc9, ha94 != null ? a(gb92, ha94) : null, ((esb) gb92.b.getValue()).c(ha92), (cd9) gb92.c.getValue(), (ff9) gb92.d.getValue(), (fq2) gb92.e.getValue(), 0);
    }

    public final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a(this, (ha9) it.next()));
        }
        return arrayList2;
    }
}
