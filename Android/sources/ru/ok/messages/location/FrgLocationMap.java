package ru.ok.messages.location;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.views.fragments.base.FrgBase;

public class FrgLocationMap extends FrgBase implements yh6, vh6, th6 {
    public pd6 B1;
    public g1a C1;
    public eud D1;
    public taf E1;
    public d18 F1;
    public w58 G1;
    public long H1;
    public int I1;
    public boolean J1;

    public final String V2() {
        return "PICK_LOCATION";
    }

    public final void b3(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 301) {
            this.D1.K();
        }
    }

    public final boolean d3() {
        g1a g1a = this.C1;
        if (g1a.A0.d != 3) {
            return false;
        }
        g1a.W();
        return true;
    }

    public final void e0(long j, long j2) {
        this.q1.c().f("LIVE_LOCATION_RESTART", "VIEWER");
        eud eud = this.D1;
        eud.o = new y55(3, j, j2, this);
        eud.K();
    }

    public final void e3(int i, String[] strArr, int[] iArr) {
        if (eud.t(i)) {
            this.D1.I(i, strArr, iArr);
        }
    }

    public final void h3(pf8 pf8) {
        Context O1 = O1();
        if (O1 != null) {
            s58 s58 = pf8.a;
            double d = s58.a;
            ArrayList arrayList = gsg.j;
            ((fp4) ((qra) ((id3) this.p1.b)).getAccessor().g(fp4.class)).getClass();
            String str = "https://maps.google.com/maps?f=d&daddr=" + d + "," + s58.b;
            String str2 = pf8.e;
            if (!(str2 == null || str2.length() == 0)) {
                try {
                    str = str + " (" + URLEncoder.encode(str2, "utf-8") + ")";
                } catch (UnsupportedEncodingException e) {
                    z68.f(it6.class.getName(), "Can't encode name ".concat(str2), e);
                }
            }
            try {
                O1.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (ActivityNotFoundException e2) {
                z68.f("gsg", "openDirections: ", e2);
                int i = qad.B5;
                Handler handler = hi7.j;
                hi7.b0(0, O1, O1.getString(i));
            }
            this.q1.c().e("LOCATION_MAP_DIRECTION_CLICK");
        }
    }

    public final void k0(long j) {
        if (this.G1.c == 1) {
            this.q1.c().f("LIVE_LOCATION_STOP", "VIEWER");
        } else {
            this.q1.c().f("LIVE_LOCATION_STOP", "PICKER");
        }
        this.C1.W();
        j18 j18 = (j18) this.F1;
        if (j18.Z.G(j) != null) {
            j18.v.a(j18.z0.c(new z60(j18, j, 6)));
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [qd8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9, types: [qd8, java.lang.Object] */
    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g68 g68;
        long j;
        boolean z;
        s58 s58;
        qd8 qd8;
        rd8 rd8;
        x58 x58;
        String str2;
        Bundle bundle2 = bundle;
        Context O1 = O1();
        c cVar = this.D0;
        pf8 pf8 = null;
        if (O1 == null || cVar == null || this.x == null) {
            z68.f("ru.ok.messages.location.FrgLocationMap", "Context or fragmentManager is null", (Throwable) null);
            return null;
        }
        this.D1 = new eud(this.q1.l(), (FrgBase) this);
        this.F1 = ((sjd) tr1.h((qra) ((id3) this.p1.b))).p();
        yva s = this.q1.s();
        km3 i = this.q1.i();
        ae8 ae8 = (ae8) ((qra) ((id3) this.p1.b)).getAccessor().g(ae8.class);
        nd c = this.q1.c();
        g68 g682 = (g68) this.q1.getAccessor().g(g68.class);
        this.E1 = (taf) this.q1.getAccessor().g(taf.class);
        long s2 = ((ltb) this.q1.u()).a.s();
        int i2 = jad.H;
        String S1 = S1(i2);
        this.H1 = this.x.getLong("ru.ok.tamtam.extra.CHAT_ID");
        this.I1 = this.x.getInt("ru.ok.tamtam.extra.REQUEST_CODE");
        a32 G = this.q1.g().G(this.H1);
        if (G == null) {
            z68.f("ru.ok.messages.location.FrgLocationMap", "Chat is null", (Throwable) null);
            return null;
        }
        boolean N = G.N();
        Bundle bundle3 = this.x;
        s58 s582 = s58.x;
        if (bundle3 == null) {
            z = N;
            s58 = s582;
            g68 = g682;
            str = "ru.ok.messages.location.FrgLocationMap";
            j = 0;
        } else {
            long j2 = bundle3.getLong("ru.ok.tamtam.extra.MESSAGE_ID");
            g68 = g682;
            long j3 = this.x.getLong("ru.ok.tamtam.extra.CONTACT_ID");
            s58 s583 = (s58) this.x.getSerializable("ru.ok.tamtam.extra.LOCATION");
            if (s583 == null) {
                s583 = s582;
            }
            boolean z2 = this.x.getBoolean("ru.ok.tamtam.extra.LIVE");
            str = "ru.ok.messages.location.FrgLocationMap";
            long j4 = this.x.getLong("ru.ok.tamtam.extra.DATE");
            s58 = s582;
            boolean z3 = this.x.getBoolean("ru.ok.tamtam.extra.ACTIVE");
            z = N;
            String string = this.x.getString("ru.ok.tamtam.extra.DEVICE_ID");
            j = 0;
            if (j2 == 0) {
                pf8 = null;
            } else {
                if (j3 == ((ltb) this.q1.u()).a.s()) {
                    str2 = S1(i2);
                } else {
                    vk3 p = i.p(j3, false);
                    str2 = p != null ? p.f() : null;
                }
                of8 of8 = new of8(s583);
                of8.c = j2;
                of8.b = j3;
                of8.e = str2;
                of8.h = z2;
                of8.j = j4;
                of8.d = tf8.c;
                of8.k = z3;
                of8.l = string;
                pf8 = new pf8(of8);
            }
        }
        this.J1 = pf8 == null;
        w58 w58 = (bundle2 == null || (x58 = (x58) bundle2.getParcelable("ru.ok.tamtam.extra.VIEW_STATE")) == null) ? null : x58.a;
        if (w58 == null) {
            boolean z4 = !G.b.J.b(32);
            Bundle bundle4 = this.x;
            if (bundle4 != null) {
                z4 &= !bundle4.getBoolean("ru.ok.tamtam.extra.DISABLE_LIVE", false);
            }
            u58 u58 = new u58();
            u58.a = z4;
            if (pf8 == null) {
                u58.c = 2;
                u58.d = 2;
                u58.h = -1;
            } else {
                u58.c = 1;
                u58.d = 1;
                u58.h = pf8.c;
            }
            u58.i = z;
            u58.j = ((ltb) this.q1.u()).a.g.getBoolean("app.dev.live.location.debug.view", false);
            a33 a33 = ((ltb) this.q1.u()).a;
            a33.getClass();
            u58.k = a33.g.getBoolean("app.dev.randomize.my.live.location", false);
            w58 = new w58(u58);
        }
        this.G1 = w58;
        ltb y = ((qra) ((id3) this.p1.b)).y();
        int i3 = y.c.g.getInt("app.location.map.type", 1);
        qd8 qd82 = (bundle2 == null || (rd8 = (rd8) bundle2.getParcelable("ru.ok.tamtam.extra.MAP_CONFIG")) == null) ? null : rd8.a;
        if (qd82 == null) {
            float f = 14.0f;
            if (pf8 == null) {
                ? obj = new Object();
                obj.a = 1.401298464324817E-45d;
                obj.b = 1.401298464324817E-45d;
                obj.c = false;
                obj.d = true;
                obj.e = true;
                obj.f = i3;
                obj.g = 14.0f;
                obj.h = c44.DEFAULT_ASPECT_RATIO;
                obj.i = c44.DEFAULT_ASPECT_RATIO;
                qd8 = new qd8(obj);
            } else {
                Bundle bundle5 = this.x;
                float f2 = bundle5 == null ? 14.0f : bundle5.getFloat("ru.ok.tamtam.extra.ZOOM", 14.0f);
                s58 s584 = pf8.a;
                double d = s584.a;
                if (f2 > c44.DEFAULT_ASPECT_RATIO) {
                    f = f2;
                }
                ? obj2 = new Object();
                obj2.a = d;
                obj2.b = s584.b;
                obj2.c = false;
                obj2.d = true;
                obj2.e = true;
                obj2.f = i3;
                obj2.g = f;
                obj2.h = c44.DEFAULT_ASPECT_RATIO;
                obj2.i = c44.DEFAULT_ASPECT_RATIO;
                qd8 = new qd8(obj2);
            }
            qd82 = qd8;
        }
        s58 s585 = bundle2 != null ? (s58) bundle2.getSerializable("ru.ok.tamtam.extra.LAST_LOCATION") : null;
        s58 s586 = s585 == null ? s58 : s585;
        boolean z5 = bundle2 != null ? bundle2.getBoolean("ru.ok.tamtam.extra.KEEP_CURRENT_LOCATION", true) : true;
        new WeakReference(this);
        new WeakReference((Object) null);
        ch d2 = ((qra) ((id3) this.p1.b)).d();
        jbf H = ((qra) ((id3) this.p1.b)).H();
        fn4 k = this.q1.k();
        long j5 = pf8 == null ? j : pf8.c;
        c cVar2 = this.D0;
        d18 d18 = this.F1;
        H.getClass();
        f3a f3a = new f3a(O1, viewGroup, s, i, ae8, c, cVar2, j5, d2, d18, y, ((kbf) H).a(), k, F2().getBoolean("ru.ok.tamtam.extra.REGULAR_SENDING", true), ((qra) ((id3) this.p1.b)).D());
        g1a g1a = r0;
        f3a f3a2 = f3a;
        String str3 = str;
        g1a g1a2 = new g1a(this.G1, qd82, s586, z5, f3a, g68, this.E1, this.F1, s2, this.H1, S1, pf8, this, i, this.D1, k, H, this.q1.u());
        this.C1 = g1a;
        if (this.G1.c != 1 && bundle == null) {
            this.D1.K();
        }
        f3a2.c();
        View view = (View) f3a2.c;
        if (view != null) {
            return view;
        }
        z68.f(str3, "Root view is null", (Throwable) null);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r2.v();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l2() {
        /*
            r2 = this;
            super.l2()
            androidx.fragment.app.b r2 = r2.M1()
            if (r2 == 0) goto L_0x0026
            boolean r0 = r2 instanceof ru.ok.messages.location.ActLocationMap
            if (r0 == 0) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            ed6 r2 = r2.v()
            int r0 = defpackage.lic.frg_location_map__map
            androidx.fragment.app.a r0 = r2.D(r0)
            if (r0 == 0) goto L_0x0026
            xe0 r1 = new xe0
            r1.<init>(r2)
            r1.j(r0)
            r2 = 1
            r1.e(r2)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.location.FrgLocationMap.l2():void");
    }

    public final void m2() {
        super.m2();
        g1a g1a = this.C1;
        if (g1a != null) {
            dac dac = g1a.E0;
            if (dac != null) {
                dac.b();
            }
            g1a.F0.b();
            j18 j18 = (j18) g1a.x;
            j18.o(g1a, g1a.z);
            j18.n();
            jbd.c(g1a.I0);
            jbd.c(g1a.o);
            jbd.c(g1a.H0);
            f3a f3a = (f3a) g1a.a;
            vd8 vd8 = f3a.K0;
            if (vd8 != null) {
                vd8.b();
            }
            f3a.A0.animate().cancel();
            ValueAnimator valueAnimator = f3a.N0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            f3a.o.dispose();
            this.C1 = null;
        }
    }

    public final void q0() {
    }

    public final void r() {
        this.C1.Z();
    }

    public final void t2() {
        super.t2();
        g1a g1a = this.C1;
        if (g1a != null) {
            g1a.v.d(g1a);
            ((f3a) g1a.a).getClass();
            jbd.c(g1a.G0);
        }
    }

    public final void w2() {
        super.w2();
        ((qra) ((id3) this.p1.b)).w().f(this.J1 ? jgd.CHAT_SHARE_LOCATION : jgd.CHAT_LOCATION_VIEWER, h8b.e);
        g1a g1a = this.C1;
        if (g1a != null) {
            g1a.v.b(g1a);
            g1a.Z();
            ((f3a) g1a.a).getClass();
            dac dac = g1a.E0;
            if (dac != null && g1a.A0.c == 1) {
                dac.d(Boolean.TRUE);
            }
            jbd.c(g1a.G0);
            long q = (long) ((ltb) g1a.y0).b.q();
            lja s = jha.o(q, q, TimeUnit.SECONDS, xfd.a()).s(qe.a());
            or7 or7 = new or7(new c1a(g1a, 6), new q0a(9), m58.e);
            s.a(or7);
            g1a.G0 = or7;
        }
    }

    public final void x0() {
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        g1a g1a = this.C1;
        w58 w58 = g1a.A0;
        qd8 e0 = ((f3a) g1a.a).e0();
        s58 s58 = g1a.B0;
        boolean z = g1a.D0;
        bundle.putParcelable("ru.ok.tamtam.extra.VIEW_STATE", new x58(w58));
        bundle.putParcelable("ru.ok.tamtam.extra.MAP_CONFIG", new rd8(e0));
        bundle.putSerializable("ru.ok.tamtam.extra.LAST_LOCATION", s58);
        bundle.putBoolean("ru.ok.tamtam.extra.KEEP_CURRENT_LOCATION", z);
    }
}
