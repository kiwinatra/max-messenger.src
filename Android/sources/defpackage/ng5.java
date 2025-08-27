package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.WindowManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: ng5  reason: default package */
public final class ng5 implements yg5 {
    public static final /* synthetic */ KProperty[] i = {rae.s(ng5.class, "pipStateJob", "getPipStateJob()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f = LazyKt.lazy(LazyThreadSafetyMode.NONE, new kg5(this, 0));
    public rf1 g;
    public final wie h = o5a.U();

    public ng5(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy3;
        this.b = lazy4;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy5;
    }

    public final rf1 a(Context context, e9d e9d) {
        rf1 rf1 = new rf1(context);
        rf1.setPipTheme(l2b.a);
        rf1.setPipMode(of1.c);
        rf1.setApplicationPipDepended(new ox0(11, (Object) this, (Object) rf1));
        rf1.setListener(new lg5(e9d));
        rf1.setVideoLayoutUpdatesControllerProvider(new kg5(this, 1));
        return rf1;
    }

    public final wmb b() {
        return (wmb) this.f.getValue();
    }

    public final WindowManager c() {
        Context context;
        rf1 rf1 = this.g;
        if (rf1 == null || (context = rf1.getContext()) == null) {
            return null;
        }
        return (WindowManager) context.getSystemService("window");
    }

    public final void d(long j) {
        z68.c("FakePipController", "try to hide local pip", new Object[0]);
        rf1 rf1 = this.g;
        if (rf1 != null) {
            if (!y7e.F(rf1)) {
                z68.c("FakePipController", "local pip in hidden progress", new Object[0]);
                return;
            }
            String str = ((mp1) ((dp1) this.e.getValue())).j().c;
            vne vne = (vne) ((nf1) this.a.getValue());
            xme xme = vne.a;
            if (xme.getValue() == une.b) {
                tq1 tq1 = (tq1) vne.c.getValue();
                tq1.getClass();
                tq1.a(tq1, "PIP_ENABLED", str, (String) null, 0, (String) null, (String) null, false, 116);
            }
            xme.m((Object) null, une.a);
            y7e.j(rf1, false, j, new wk(14, this, rf1));
        }
    }

    public final void e(Activity activity, e9d e9d) {
        z68.c("FakePipController", "start preparing local pip", new Object[0]);
        try {
            if (this.g != null) {
                z68.c("FakePipController", "local pip already prepared", new Object[0]);
                return;
            }
            rf1 a2 = a(activity, e9d);
            this.g = a2;
            a2.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            a2.d((v4b) b().w.a.getValue());
            WindowManager c2 = c();
            if (c2 != null) {
                WindowManager.LayoutParams windowsViewLayoutParams = a2.getWindowsViewLayoutParams();
                c91 c91 = (c91) ((b91) this.b.getValue());
                c91.getClass();
                PointF pointF = c91.b;
                PointF pointF2 = new PointF(pointF.x, pointF.y);
                windowsViewLayoutParams.x = (int) pointF2.x;
                windowsViewLayoutParams.y = (int) pointF2.y;
                Unit unit = Unit.INSTANCE;
                c2.addView(a2, windowsViewLayoutParams);
            }
            b().o = a2;
            aje v = ev0.v((cp1) this.c.getValue(), ((osa) ((gaf) this.d.getValue())).c(), (f14) null, new mg5(this, (Continuation) null), 2);
            this.h.setValue(this, i[0], v);
        } catch (IllegalArgumentException e2) {
            z68.f("FakePipController", "can't prepare local pip", e2);
        }
    }
}
