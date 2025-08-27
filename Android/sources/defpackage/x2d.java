package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: x2d  reason: default package */
public abstract class x2d {
    public final ea6 a;
    public final tb7 b;
    public final long c;
    public final List o;
    public final List v;
    public final List w;
    public final dpc x;

    public x2d(ea6 ea6, List list, tod tod, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        n79.g(!list.isEmpty());
        this.a = ea6;
        this.b = tb7.p(list);
        this.o = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.x = tod.b(this);
        int i = v0g.a;
        this.c = v0g.a0(tod.b, 1000000, tod.a, RoundingMode.FLOOR);
    }

    public abstract String a();

    public abstract q64 c();

    public abstract dpc d();

    public final dpc e() {
        return this.x;
    }
}
