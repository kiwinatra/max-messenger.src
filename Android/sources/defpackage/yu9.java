package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Rational;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: yu9  reason: default package */
public class yu9 implements uye, aub, u2f, uoe, yye, k69, qk3, nj6, p4, t0d, kxg {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ yu9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        q55 q55 = (q55) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r1 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 12: goto L_0x0048;
                default: goto L_0x0005;
            }
        L_0x0005:
            kotlin.Unit r4 = (kotlin.Unit) r4
            java.lang.Object r3 = r3.b
            ce r3 = (defpackage.ce) r3
            boolean r4 = r3.a
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r3.b
            voc r4 = (defpackage.voc) r4
            java.lang.String r0 = "OwnTalkingReporter"
            java.lang.String r1 = "on voice stop detected and reported"
            r4.log(r0, r1)
            java.lang.Object r4 = r3.w
            d9d r4 = (defpackage.d9d) r4
            r0 = 0
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = r4.b
            ef1 r4 = (defpackage.ef1) r4
            ye1 r1 = r4.a
            boolean r2 = r1.d()
            r1.n = r0
            boolean r1 = r1.d()
            if (r2 == r1) goto L_0x0045
            ye1 r1 = r4.a
            ue1 r2 = r1.a
            if (r2 != 0) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            zwd r2 = r4.c(r2)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            r4.e(r2, r1)
        L_0x0045:
            r3.a = r0
        L_0x0047:
            return
        L_0x0048:
            java.lang.Float r4 = (java.lang.Float) r4
            java.lang.Object r3 = r3.b
            bvf r3 = (defpackage.bvf) r3
            xme r3 = r3.a
            r3.setValue(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu9.accept(java.lang.Object):void");
    }

    public void b(gpe gpe) {
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [sda, mhf] */
    public void c(z3f z3f) {
        d4f d4f;
        if (!ev0.s()) {
            iw3.a(((kub) this.b).getContext()).execute(new sx8(27, this, z3f));
            return;
        }
        su1 su1 = z3f.e;
        ((kub) this.b).w0 = su1.n();
        lub lub = ((kub) this.b).z;
        Rect e = su1.f().e();
        lub.getClass();
        lub.a = new Rational(e.width(), e.height());
        synchronized (lub) {
            lub.c = e;
        }
        z3f.c(iw3.a(((kub) this.b).getContext()), new u00((Object) this, (Object) su1, (Object) z3f, 25));
        kub kub = (kub) this.b;
        sda sda = kub.b;
        hub hub = kub.a;
        if (!(sda instanceof d4f) || kub.c(z3f, hub)) {
            kub kub2 = (kub) this.b;
            if (kub.c(z3f, kub2.a)) {
                kub kub3 = (kub) this.b;
                ? sda2 = new sda(kub3, kub3.o);
                sda2.i = false;
                sda2.k = new AtomicReference();
                d4f = sda2;
            } else {
                kub kub4 = (kub) this.b;
                d4f = new d4f(kub4, kub4.o);
            }
            kub2.b = d4f;
        }
        qu1 n = su1.n();
        kub kub5 = (kub) this.b;
        eub eub = new eub(n, kub5.w, kub5.b);
        ((kub) this.b).x.set(eub);
        su1.a().d(iw3.a(((kub) this.b).getContext()), eub);
        ((kub) this.b).b.l(z3f, new u00((Object) this, (Object) eub, (Object) su1, 26));
        kub kub6 = (kub) this.b;
        if (kub6.indexOfChild(kub6.c) == -1) {
            kub kub7 = (kub) this.b;
            kub7.addView(kub7.c);
        }
        ((kub) this.b).getClass();
    }

    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    public boolean e(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) ((srd) this.b).o;
        if (viewPager2.D0) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    public void f(gpe gpe) {
        KProperty[] kPropertyArr = StickersScreen.Y;
        StickersScreen stickersScreen = (StickersScreen) this.b;
        if (((vw9) stickersScreen.e0().k().e.a.getValue()).a) {
            bx9 k = stickersScreen.e0().k();
            long j = gpe.a;
            aje u = ev0.u(k.a, ((osa) k.b).a(), f14.b, new zw9(k, j, (Continuation) null));
            k.f.setValue(k, bx9.g[0], u);
            return;
        }
        nue nue = nue.b;
        long j2 = gpe.a;
        ta4 W0 = nue.W0();
        W0.b(":stickers/preview?sticker_id=" + j2, (Bundle) null);
    }

    public void g(Throwable th) {
        ((nr4) this.b).s();
    }

    public Object get() {
        return Boolean.valueOf(((hq) ((fq) ((q4) this.b).g(fq.class))).u());
    }

    public boolean h(m69 m69, MenuItem menuItem) {
        k69 k69 = ((Toolbar) this.b).a1;
        return k69 != null && k69.h(m69, menuItem);
    }

    public void i(String str, rk3 rk3) {
        fbb fbb = (fbb) this.b;
        fbb.getClass();
        fbb.i(str, new yug(fbb, rk3, 0));
    }

    public void j() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public long k(int i) {
        y64.g(i == 0);
        return 0;
    }

    public go1 l(Object obj) {
        ev0.g();
        return m5a.F(new pbb(0, this, obj));
    }

    public void m() {
        View view;
        View view2 = (View) this.b;
        if (view2 != null) {
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new vg(view, 6));
            }
        }
    }

    public void o(m69 m69) {
        Toolbar toolbar = (Toolbar) this.b;
        w7 w7Var = toolbar.a.v;
        if (w7Var == null || !w7Var.i()) {
            Iterator it = toolbar.S0.b.iterator();
            while (it.hasNext()) {
                ((vc6) ((j79) it.next())).a.t(m69);
            }
        }
        k69 k69 = toolbar.a1;
        if (k69 != null) {
            k69.o(m69);
        }
    }

    public List p(long j) {
        return j >= 0 ? (List) this.b : Collections.emptyList();
    }

    public int t() {
        return 1;
    }

    public Object y() {
        Context context = ((m5h) ((kxg) this.b)).a.a;
        if (context != null) {
            return new f7h(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ yu9(int i, boolean z) {
        this.a = i;
    }

    public yu9(ArrayList arrayList) {
        this.a = 0;
        this.b = Collections.unmodifiableList(arrayList);
    }

    public yu9(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new ece(10);
                return;
            default:
                this.b = (ExtraCroppingQuirk) qn4.a.g(ExtraCroppingQuirk.class);
                return;
        }
    }

    public void accept(Object obj, Object obj2) {
        qdf qdf = (qdf) obj2;
        i1h i1h = (i1h) obj;
        j68 j68 = (j68) this.b;
        vzg.f("locationSettingsRequest can't be null", j68 != null);
        j7h j7h = (j7h) i1h.o();
        s0h s0h = new s0h(0, qdf);
        Parcel H0 = j7h.H0();
        gzg.b(H0, j68);
        H0.writeStrongBinder(s0h);
        H0.writeString((String) null);
        j7h.I0(H0, 63);
    }
}
