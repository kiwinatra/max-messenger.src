package ru.ok.messages.settings.caching;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.views.dialogs.ProgressDialog;

public class FrgCachingSettings extends FrgBaseSettings implements vx0 {
    public final hq E1 = ym.v.c().c;
    public String F1 = "";
    public String[] G1;
    public wx0 H1;

    public final void C(int i, Object obj) {
    }

    public final void E(int i, Object obj) {
        if (i == lic.setting_caching_time) {
            String[] strArr = {S1(qad.z4), S1(qad.B4), S1(qad.A4), S1(qad.C4)};
            cg8 cg8 = new cg8(G2());
            cg8.r(qad.y4);
            cg8.h(strArr, new w13(this, strArr, 2));
            cg8.g();
        } else if (i == lic.setting_caching_limit) {
            l9e l9e = new l9e(O1());
            int i2 = this.r1.l;
            e9e configBuilder = l9e.getConfigBuilder();
            configBuilder.b = c44.DEFAULT_ASPECT_RATIO;
            configBuilder.d = c44.DEFAULT_ASPECT_RATIO;
            boolean z = true;
            configBuilder.c = (float) (this.G1.length - 1);
            long j = this.E1.g.getLong("app.media.caching.limit", -1);
            configBuilder.d = (float) (j == 536870912 ? 0 : j == 1073741824 ? 1 : j == 2147483648L ? 2 : j == 4294967296L ? 3 : 4);
            int i3 = this.r1.N;
            configBuilder.j = i3;
            configBuilder.r = i3;
            ro4 ro4 = this.m1;
            int i4 = ro4.b;
            configBuilder.f = i4;
            configBuilder.k = i2;
            configBuilder.w = i2;
            configBuilder.g = i4;
            configBuilder.l = i2;
            configBuilder.G = 1.0f;
            int i5 = ro4.f;
            configBuilder.h = i5;
            configBuilder.i = ro4.h;
            configBuilder.E = true;
            configBuilder.D = -1;
            configBuilder.C = ro4.n;
            configBuilder.B = i2;
            configBuilder.W = true;
            configBuilder.A = true;
            configBuilder.m = this.G1.length - 1;
            configBuilder.K = ro4.e;
            configBuilder.L = i5;
            l9e l9e2 = configBuilder.a;
            l9e2.getClass();
            l9e2.b = configBuilder.b;
            l9e2.c = configBuilder.c;
            l9e2.o = configBuilder.d;
            l9e2.v = configBuilder.e;
            l9e2.w = configBuilder.f;
            l9e2.x = configBuilder.g;
            l9e2.y = configBuilder.h;
            l9e2.z = configBuilder.i;
            l9e2.v0 = configBuilder.j;
            l9e2.w0 = configBuilder.k;
            l9e2.x0 = configBuilder.l;
            l9e2.y0 = configBuilder.m;
            l9e2.z0 = configBuilder.n;
            l9e2.A0 = configBuilder.o;
            l9e2.B0 = configBuilder.p;
            l9e2.C0 = configBuilder.q;
            l9e2.D0 = configBuilder.r;
            l9e2.E0 = configBuilder.s;
            l9e2.F0 = configBuilder.t;
            l9e2.G0 = configBuilder.u;
            l9e2.H0 = configBuilder.v;
            l9e2.I0 = configBuilder.w;
            l9e2.J0 = configBuilder.x;
            l9e2.M0 = configBuilder.y;
            l9e2.K0 = configBuilder.z;
            l9e2.L0 = configBuilder.A;
            e9e e9e = l9e2.p1;
            String[] strArr2 = e9e.F;
            l9e2.q1 = strArr2;
            if (strArr2 == null || strArr2.length <= 0) {
                z = false;
            }
            l9e2.r1 = z;
            l9e2.s1 = e9e.G;
            l9e2.t1 = e9e.H;
            l9e2.u1 = e9e.I;
            l9e2.K1 = e9e.J;
            l9e2.L1 = e9e.U;
            l9e2.N1 = e9e.T;
            l9e2.U0 = configBuilder.B;
            l9e2.V0 = configBuilder.C;
            l9e2.W0 = configBuilder.D;
            l9e2.v1 = configBuilder.E;
            l9e2.A1 = configBuilder.L;
            l9e2.z1 = configBuilder.K;
            l9e2.B1 = configBuilder.M;
            int i6 = configBuilder.N;
            l9e2.Y0 = i6;
            l9e2.X0 = i6;
            int i7 = configBuilder.O;
            l9e2.a1 = i7;
            l9e2.Z0 = i7;
            l9e2.R0 = configBuilder.Q;
            l9e2.Q0 = configBuilder.P;
            l9e2.S0 = configBuilder.S;
            l9e2.w1 = configBuilder.R;
            l9e2.N0 = configBuilder.V;
            l9e2.O0 = configBuilder.W;
            l9e2.d();
            l9e2.e();
            l9e2.c();
            l9e2.p1 = null;
            l9e2.requestLayout();
            l9e.setValueFormatListener(new jg6(this));
            iq.t(l9e, this.m1.v);
            iq.r(l9e, this.m1.v);
            cg8 cg82 = new cg8(G2());
            cg82.r(qad.w4);
            cg82.s(l9e).n(qad.y1, new w13(this, l9e, 1)).g();
        } else if (i == lic.setting_caching_clear_cache) {
            wx0 wx0 = this.H1;
            synchronized (wx0) {
                try {
                    if (wx0.k == null) {
                        wx0.h.H1();
                        lja s = wx0.c().x(wx0.f).s(wx0.g);
                        or7 or7 = new or7(new sx0(wx0, 4), new sx0(wx0, 5), m58.e);
                        s.a(or7);
                        wx0.a(or7);
                    } else {
                        wx0.h.F((ArrayList) wx0.k.c);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void F(ArrayList arrayList) {
        RecyclerView recyclerView = new RecyclerView(G2(), (AttributeSet) null);
        O1();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(new t13(O1(), arrayList));
        cg8 cg8 = new cg8(G2());
        cg8.r(qad.O4);
        cg8.s(recyclerView).n(qad.N4, new w13(this, arrayList, 3)).g();
    }

    public final void H1() {
        a E = this.D0.E("ru.ok.messages.views.dialogs.ProgressDialog");
        if ((E instanceof ProgressDialog ? (ProgressDialog) E : null) == null) {
            g3(true);
        }
    }

    public final String V2() {
        return "SETTINGS_MEDIA_CACHING";
    }

    public final void Y(String str) {
        this.F1 = str;
        if (this.o1) {
            k3();
        }
    }

    public final void h2(Context context) {
        super.h2(context);
        this.G1 = new String[]{"512MB", "1GB", "2GB", "4GB", S1(qad.x4)};
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        sjd sjd = (sjd) tr1.h((qra) ((id3) this.p1.b));
        this.H1 = new wx0((pl5) sjd.getAccessor().g(pl5.class), ((qra) ((id3) this.p1.b)).i(), new u13(O1()), sjd.A(), xfd.a(), qe.a(), new jg6(this), this);
    }

    public final ArrayList i3() {
        ArrayList arrayList = new ArrayList();
        int i = lic.setting_caching_time;
        String S1 = S1(qad.y4);
        hq hqVar = this.E1;
        int i2 = hqVar.g.getInt("app.media.caching.time", 0);
        arrayList.add(fyd.c(i, S1, i2 != 1 ? i2 != 2 ? i2 != 3 ? S1(qad.z4) : S1(qad.C4) : S1(qad.A4) : S1(qad.B4)));
        int i3 = lic.setting_caching_limit;
        String S12 = S1(qad.w4);
        long j = hqVar.g.getLong("app.media.caching.limit", -1);
        fyd c = fyd.c(i3, S12, j <= 0 ? S1(qad.x4) : ghf.x(j, false, (Context) null));
        c.X = true;
        arrayList.add(c);
        arrayList.add(new fyd(lic.setting_caching_clear_cache, S1(qad.O4), S1(qad.P4), this.F1, (Object) null, 1));
        return arrayList;
    }

    public final void j1() {
        a E = this.D0.E("ru.ok.messages.views.dialogs.ProgressDialog");
        if ((E instanceof ProgressDialog ? (ProgressDialog) E : null) == null) {
            f3(qad.L4, false);
        }
    }

    public final String j3() {
        return S1(qad.M4);
    }

    public final void p1() {
        hi7.b0(0, G2(), S1(qad.K4));
    }

    public final void r1() {
        hi7.b0(0, G2(), S1(qad.t1));
    }

    public final void w2() {
        super.w2();
        this.H1.b();
        ((qra) ((id3) this.p1.b)).w().f(jgd.SETTINGS_CACHE, h8b.e);
    }
}
