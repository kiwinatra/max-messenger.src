package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: w2d  reason: default package */
public abstract class w2d {
    public final ca6 a;
    public final tb7 b;
    public final long c;
    public final List o;
    public final List v;
    public final List w;
    public final cpc x;

    public w2d(ca6 ca6, List list, tod tod, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        y64.g(!list.isEmpty());
        this.a = ca6;
        this.b = tb7.p(list);
        this.o = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.x = tod.a(this);
        this.c = t0g.J(tod.b, 1000000, tod.a);
    }

    public abstract String a();

    public abstract p64 c();

    public abstract cpc d();
}
