package defpackage;

import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: fga  reason: default package */
public final class fga extends xag {
    public static final /* synthetic */ KProperty[] A0;
    public final etc X;
    public final etc Y;
    public final xme Z;
    public final mbf b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final xme v0;
    public final Lazy w;
    public final s85 w0 = new s85(0);
    public final xme x;
    public final wie x0 = o5a.U();
    public final etc y;
    public final wie y0 = o5a.U();
    public final xme z;
    public final wie z0 = o5a.U();

    static {
        Class<fga> cls = fga.class;
        A0 = new KProperty[]{rae.s(cls, "resetDefaultsJob", "getResetDefaultsJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "changeAllNotificationsEnabledJob", "getChangeAllNotificationsEnabledJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "changeShowContentJob", "getChangeShowContentJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public fga() {
        rfa rfa = rfa.a;
        mbf mbf = (mbf) rfa.getAccessor().g(mbf.class);
        Lazy h = rfa.getAccessor().h(fq.class);
        Lazy h2 = rfa.getAccessor().h(rl.class);
        Lazy h3 = rfa.getAccessor().h(gaf.class);
        Lazy h4 = rfa.getAccessor().h(qwa.class);
        this.b = mbf;
        this.c = h;
        this.o = h2;
        this.v = h3;
        this.w = h4;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.x = a;
        this.y = new etc(a);
        xme a2 = f6e.a(Boolean.valueOf(!mbf.c()));
        this.z = a2;
        this.X = new etc(a2);
        this.Y = new etc(f6e.a(Boolean.valueOf(mbf.c())));
        xme a3 = f6e.a(Boolean.valueOf(mbf.c()));
        this.Z = a3;
        xme a4 = f6e.a(0);
        this.v0 = a4;
        co1 h5 = kv0.h(((pid) j()).j);
        co1 h6 = kv0.h(((pid) j()).k);
        etc etc = new etc(a3);
        etc etc2 = new etc(a4);
        bs5[] bs5Arr = {h5, h6, etc, etc2};
        bs0.K(bs0.F(new ps5(new wb(18, bs5Arr, new cga(this, (Continuation) null)), new aga(this, (Continuation) null), 5), ((osa) ((gaf) h3.getValue())).b()), this.a);
    }

    public static igf k(int i) {
        return i != 0 ? i != 1 ? i != 2 ? new igf(swa.t) : new igf(swa.u) : new igf(swa.s) : new igf(swa.t);
    }

    public final fq j() {
        return (fq) this.c.getValue();
    }

    public final void l(long j) {
        int i = (j > ((long) rwa.m) ? 1 : (j == ((long) rwa.m) ? 0 : -1));
        Lazy lazy = this.v;
        KProperty[] kPropertyArr = A0;
        if (i == 0) {
            aje u = ev0.u(this.a, ((osa) ((gaf) lazy.getValue())).b(), f14.b, new dga(this, (Continuation) null));
            this.y0.setValue(this, kPropertyArr[1], u);
            return;
        }
        int i2 = (j > ((long) rwa.k) ? 1 : (j == ((long) rwa.k) ? 0 : -1));
        s85 s85 = this.w0;
        if (i2 == 0) {
            wea.b.getClass();
            xag.h(s85, new pa4(":settings/notifications/dialog"));
        } else if (j == ((long) rwa.d)) {
            wea.b.getClass();
            xag.h(s85, new pa4(":settings/notifications/chat"));
        } else if (j == ((long) rwa.s)) {
            wea.b.getClass();
            xag.h(s85, new pa4(":settings/notifications/other"));
        } else if (j == ((long) rwa.w)) {
            this.z0.setValue(this, kPropertyArr[2], xag.g(this, ((osa) ((gaf) lazy.getValue())).b(), (f14) null, new bga(this, (Continuation) null), 2));
        } else if (j == ((long) rwa.o)) {
            xag.h(s85, tfa.b);
        }
    }
}
