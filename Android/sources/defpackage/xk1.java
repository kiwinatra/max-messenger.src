package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* renamed from: xk1  reason: default package */
public final class xk1 {
    public static final Set o;
    public final p7d a;
    public final voc b;
    public final d6a c;
    public final nfd d;
    public final rt6 e;
    public final zqd f;
    public final rjf g;
    public final nob h = new Object();
    public final ay2 i = new ay2();
    public final fu4 j;
    public final kq9 k;
    public final d19 l;
    public final g6d m;
    public final pf6 n;

    static {
        yk1[] values = yk1.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (yk1 yk1 : values) {
            arrayList.add(yk1.a);
        }
        o = CollectionsKt.toSet(arrayList);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [nob, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [kq9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, d19] */
    public xk1(p7d p7d, voc voc, d6a d6a, nfd nfd, rt6 rt6, zqd zqd, sjf sjf) {
        this.a = p7d;
        this.b = voc;
        this.c = d6a;
        this.d = nfd;
        this.e = rt6;
        this.f = zqd;
        this.g = sjf;
        this.j = new fu4(voc);
        ? obj = new Object();
        obj.a = new xe8(16, false);
        obj.b = new yl4(0);
        obj.c = new yl4(0);
        obj.o = new yl4(0);
        obj.v = new yl4(0);
        obj.w = new xga();
        this.k = obj;
        ? obj2 = new Object();
        obj2.b = new xe8(16, false);
        obj2.c = new xga();
        obj2.a = new xe8(16, false);
        this.l = obj2;
        this.m = new g6d(10);
        this.n = new pf6(10);
    }
}
