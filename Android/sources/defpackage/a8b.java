package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: a8b  reason: default package */
public abstract class a8b {
    public static final kz0 a;
    public static final kz0 b;
    public static final kz0 c;
    public static final kz0 d;
    public static final kz0 e;
    public static final kz0 f;
    public static final kz0 g;
    public static final kz0 h;
    public static final kz0 i;
    public static final kz0 j;
    public static final kz0 k;

    static {
        long j2 = (long) qqa.f;
        igf igf = new igf(sqa.i);
        int i2 = pqa.g0;
        a1e a1e = a1e.a;
        jnd jnd = jnd.a;
        a = new kz0(igf, j2, (h1e) null, (igf) null, (f1e) a1e, Integer.valueOf(i2), 0, 816);
        b = new kz0(new igf(sqa.h), (long) qqa.s, (h1e) null, (igf) null, (f1e) a1e, Integer.valueOf(nad.P0), 0, 816);
        long j3 = (long) qqa.k;
        int i3 = sqa.m;
        igf igf2 = new igf(i3);
        int i4 = pqa.R;
        c = new kz0(igf2, j3, (h1e) null, (igf) null, (f1e) a1e, Integer.valueOf(i4), 0, 816);
        d = new kz0(new igf(sqa.q), (long) qqa.m, (h1e) null, (igf) null, (f1e) a1e, Integer.valueOf(i4), 0, 816);
        igf igf3 = new igf(i3);
        h1e h1e = h1e.o;
        new kz0(igf3, (long) qqa.l, h1e, new igf(sqa.n), (f1e) a1e, Integer.valueOf(i4), 0, 256);
        long j4 = (long) qqa.g;
        int i5 = sqa.j;
        igf igf4 = new igf(i5);
        int i6 = pqa.L;
        int i7 = qqa.T;
        e = new kz0(igf4, j4, (h1e) null, (igf) null, (f1e) a1e, Integer.valueOf(i6), i7, 560);
        f = new kz0(new igf(sqa.p), (long) qqa.i, (h1e) null, (igf) null, (f1e) null, Integer.valueOf(pqa.W), i7, 624);
        g = new kz0(new igf(sqa.k), (long) qqa.j, (h1e) null, (igf) null, (f1e) null, Integer.valueOf(pqa.K), i7, 112);
        new kz0(new igf(i5), (long) qqa.h, h1e, (ngf) new igf(sqa.l), (f1e) a1e, Integer.valueOf(i6), i7, false);
        long j5 = (long) qqa.r0;
        int i8 = sqa.d0;
        igf igf5 = new igf(i8);
        int i9 = pqa.q;
        h = new kz0(igf5, j5, (h1e) null, (igf) null, (f1e) a1e, Integer.valueOf(i9), 0, 816);
        i = new kz0(new igf(i8), j5, h1e, (igf) null, (f1e) a1e, Integer.valueOf(i9), 0, 288);
        long j6 = (long) qqa.s0;
        int i10 = sqa.f0;
        igf igf6 = new igf(i10);
        int i11 = sqa.e0;
        igf igf7 = new igf(i11);
        int i12 = pqa.V;
        j = new kz0(igf6, j6, (h1e) null, igf7, (f1e) a1e, Integer.valueOf(i12), 0, 784);
        k = new kz0(new igf(i10), j6, h1e, new igf(i11), (f1e) a1e, Integer.valueOf(i12), 0, 256);
    }

    public static List a(li1 li1) {
        List createListBuilder = CollectionsKt.createListBuilder();
        boolean z = li1.c;
        boolean z2 = li1.a;
        boolean z3 = li1.b;
        if (z && ((!z2 || !z) && !z3)) {
            createListBuilder.add(g);
        } else if (!z || (!z3 && !z2)) {
            createListBuilder.add(e);
        } else {
            createListBuilder.add(f);
        }
        return CollectionsKt.build(createListBuilder);
    }
}
