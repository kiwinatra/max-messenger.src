package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: upe  reason: default package */
public final class upe extends xag {
    public static final /* synthetic */ KProperty[] F0;
    public final etc A0;
    public final wie B0;
    public final wie C0;
    public final wie D0;
    public final wie E0;
    public final Lazy X;
    public final s85 Y = new s85(0);
    public final s85 Z = new s85(0);
    public final long b;
    public final gaf c;
    public final Lazy o;
    public final Lazy v;
    public final xme v0;
    public final Lazy w;
    public final etc w0;
    public final Lazy x;
    public final xme x0;
    public final Lazy y;
    public final etc y0;
    public final Lazy z;
    public final xme z0;

    static {
        Class<upe> cls = upe.class;
        F0 = new KProperty[]{rae.s(cls, "loadStickerJob", "getLoadStickerJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadChatTitleJob", "getLoadChatTitleJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "markFavoriteJob", "getMarkFavoriteJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "markStickerSetFavoriteJob", "getMarkStickerSetFavoriteJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public upe(long j, gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.b = j;
        this.c = gaf;
        this.o = lazy;
        this.v = lazy2;
        this.w = lazy3;
        this.x = lazy4;
        this.y = lazy5;
        this.z = lazy6;
        this.X = lazy7;
        xme a = f6e.a((Object) null);
        this.v0 = a;
        this.w0 = new etc(a);
        xme a2 = f6e.a("");
        this.x0 = a2;
        this.y0 = new etc(a2);
        xme a3 = f6e.a((Object) null);
        this.z0 = a3;
        this.A0 = new etc(a3);
        this.B0 = o5a.U();
        this.C0 = o5a.U();
        this.D0 = o5a.U();
        this.E0 = o5a.U();
    }

    public static gpe k(boe boe, boolean z2, Long l) {
        boe boe2 = boe;
        String str = boe2.y;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = boe2.o;
        }
        String str2 = str;
        boolean z3 = l != null && l.longValue() == boe2.a;
        int i = boe2.c;
        long j = boe2.a;
        long j2 = boe2.Z;
        return new gpe(j, j2, j2, str2, boe2.v0, boe2.b, i, z2, z3, 0, 2336);
    }

    public final void j(Long l) {
        gpe gpe = (gpe) this.v0.getValue();
        if (gpe != null) {
            long j = gpe.b;
            if (j != 0) {
                bs0.K(bs0.F(new ps5(new i21(kv0.h(((vqe) this.w.getValue()).b(j)), kv0.h(((ai5) this.y.getValue()).d(j)), ppe.a, 4), new qpe(this, l, (Continuation) null), 5), ((osa) this.c).b()), this.a);
                return;
            }
        }
        z68.c(upe.class.getName(), "Can't load sticker set because we haven't selected sticker or setId", new Object[0]);
    }

    public final void l(long j) {
        gpe gpe = (gpe) this.w0.a.getValue();
        if (gpe == null || gpe.a != j) {
            aje u = ev0.u(this.a, ((osa) this.c).b(), f14.b, new rpe(this, j, (Continuation) null));
            this.B0.setValue(this, F0[0], u);
        }
    }
}
