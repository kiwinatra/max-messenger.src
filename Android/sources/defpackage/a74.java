package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: a74  reason: default package */
public final class a74 implements s74 {
    public final cya a;
    public final f6d b;
    public final z6d c;
    public final g6d d;
    public final c7d e;
    public final q7d f;
    public final o7d g;
    public final p7d h;
    public final v4g i;
    public final izf j;
    public final yf9 k;
    public final ju4 l;
    public final pq3 m;
    public final cc2 n;
    public final ic1 o;
    public final ere p;
    public final fi5 q;
    public final rh5 r;
    public final wuc s;
    public final ze4 t;
    public final gk u;

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, yf9] */
    public a74(cya cya, m95 m95, bjd bjd, x23 x23, Lazy lazy, rl rlVar, gaf gaf, rk rkVar, Lazy lazy2) {
        cya cya2 = cya;
        this.a = cya2;
        this.b = new f6d(cya, lazy2);
        bjd bjd2 = bjd;
        Lazy lazy3 = lazy;
        this.c = new z6d(cya, bjd, LazyKt.lazyOf(gaf), lazy);
        this.d = new g6d((j6d) cya);
        this.e = new c7d(cya);
        m95 m952 = m95;
        this.f = new q7d(cya, m95);
        this.g = new o7d(gaf, cya);
        this.h = new p7d((j6d) cya);
        ? obj = new Object();
        obj.a = cya2;
        this.k = obj;
        this.l = new ju4(cya);
        this.j = new izf(LazyKt.lazy(new nm1(23, cya)));
        this.i = new v4g(cya);
        this.m = new pq3(cya);
        this.n = new cc2(cya);
        this.o = new ic1(cya);
        this.p = new ere(cya);
        this.q = new fi5(cya);
        this.r = new rh5(cya);
        this.s = new wuc(cya, x23);
        this.t = new ze4(cya);
        this.u = new gk(rlVar, cya, x23, gaf, rkVar, m95);
    }

    public final void a() {
        ((OneMeRoomDatabase) this.a.m()).c();
    }

    public final void b() {
        ((OneMeRoomDatabase) this.a.m()).l();
    }

    public final void c() {
        ((OneMeRoomDatabase) this.a.m()).r();
    }
}
