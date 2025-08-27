package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* renamed from: z02  reason: default package */
public final class z02 extends qm implements lcf {
    public final String o;
    public final String v;
    public final int w = 4;

    public z02(long j, String str, String str2) {
        super(j);
        this.o = str;
        this.v = str2;
    }

    public final void e(ibf ibf) {
        fw9 fw9 = (fw9) ibf;
        Long l = (Long) l().n0(CollectionsKt.listOf(fw9.v)).get(0);
        ha9 r = o().r(o().g(l.longValue(), ((ltb) q()).a.s(), fw9.o));
        String str = this.v;
        if (!(str == null || str.length() == 0)) {
            rl i = i();
            ((jna) i).q(l.longValue(), this.v, fw9.c);
        }
        l().a0(l.longValue(), fw9.c, r);
        k().c(new a12(this.a, l.longValue()));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [u5b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [a00, java.util.AbstractCollection, java.util.ArrayList] */
    public final fbf g() {
        ox3 ox3 = r1;
        ox3 ox32 = new ox3(2, (Long) null, CollectionsKt.emptyList(), this.o, (String) null, (String) null, (String) null, (a20) null, (String) null, (String) null, true, this.w, (b89) null, (String) null, false, false);
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        ? arrayList = new ArrayList(1);
        arrayList.add(ox3);
        obj.c = arrayList;
        return new np2(0, 0, obj.a(), (Boolean) null, 0);
    }

    public final void h(qaf qaf) {
        k().c(new hj0(this.a, qaf));
    }
}
