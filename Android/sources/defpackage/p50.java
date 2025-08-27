package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;
import one.me.sdk.arch.Widget;

/* renamed from: p50  reason: default package */
public final class p50 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p50(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        tge tge;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                q50 q50 = (q50) this.b;
                pm7 pm7 = q50.Q0;
                l50 l50 = (l50) obj;
                if (pm7 == null || !pm7.isActive()) {
                    q50.Q0 = bs0.K(new ps5(l50.k, new n50(q50, (Continuation) null), 5), sag.b(view));
                }
                pm7 pm72 = q50.P0;
                if (pm72 == null || !pm72.isActive()) {
                    q50.P0 = bs0.K(new ps5(l50.l, new o50(q50, (Continuation) null), 5), sag.b(view));
                    return;
                }
                return;
            case 1:
                rc2 rc2 = (rc2) this.b;
                pm7 pm73 = rc2.J0;
                if (pm73 == null || !pm73.isActive()) {
                    rc2.J0 = bs0.K(new ps5((ome) obj, new qc2(rc2, (Continuation) null), 5), sag.b(view));
                    return;
                }
                return;
            case 2:
                zm5 zm5 = (zm5) this.b;
                pm7 pm74 = zm5.D0;
                if (pm74 == null || !pm74.isActive()) {
                    zm5.D0 = bs0.K(new ps5(((bl5) obj).n, new ym5(zm5, (Continuation) null), 5), sag.b(view));
                    return;
                }
                return;
            case 3:
                e eVar = (e) this.b;
                a aVar = eVar.c;
                eVar.k();
                ViewGroup viewGroup = (ViewGroup) aVar.S0.getParent();
                p9a K = ((sc6) obj).a.K();
                Object tag = viewGroup.getTag(whc.special_effects_controller_view_tag);
                if (tag instanceof tge) {
                    tge = (tge) tag;
                } else {
                    K.getClass();
                    tge = new tge(viewGroup);
                    viewGroup.setTag(whc.special_effects_controller_view_tag, tge);
                }
                tge.h();
                return;
            case 4:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = gag.a;
                t9g.c((View) obj);
                return;
            case 5:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                h19 h19 = (h19) obj;
                h19.setPadding(h19.getPaddingLeft(), h19.getPaddingTop(), h19.getPaddingRight(), MathKt.roundToInt((iog.g((View) null, h19.getRootWindowInsets()).a.f(2).d > 0 ? (float) 2 : (float) 8) * vo4.c().getDisplayMetrics().density));
                return;
            case 6:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                ((f6f) obj).requestApplyInsets();
                return;
            case 7:
                return;
            case 8:
                hde hde = (hde) this.b;
                pm7 pm75 = hde.G0;
                if (pm75 == null || !pm75.isActive()) {
                    hde.G0 = bs0.K(new ps5(((ede) obj).d, new gde(hde, (Continuation) null), 5), sag.b(view));
                    return;
                }
                return;
            case 9:
                jde jde = (jde) this.b;
                pm7 pm76 = jde.I0;
                if (pm76 == null || !pm76.isActive()) {
                    jde.I0 = bs0.K(new ps5(((ede) obj).d, new ide(jde, (Continuation) null), 5), sag.b(view));
                    return;
                }
                return;
            case 10:
                bnf bnf = (bnf) this.b;
                if (bnf != null) {
                    bnf.B((RecyclerView) view);
                }
                this.b = y7e.n((RecyclerView) obj);
                return;
            case 11:
                bi4 bi4 = dq4.a;
                jx3 a2 = e14.a(lc8.a);
                this.b = a2;
                bs0.K(new ps5(new ps5(new on2(scf.e0, 28), new ucf(view, (Continuation) null)), new vcf((wcf) obj, view, (Continuation) null), 5), a2);
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                lv7 lv7 = ((v6b) this.c).a;
                if (lv7 == null) {
                    lv7 = null;
                }
                lv7.e(hu7.ON_DESTROY);
                return;
            case 8:
            case 9:
                return;
            case 10:
                bnf bnf = (bnf) this.b;
                if (bnf != null) {
                    bnf.B((RecyclerView) view);
                }
                this.b = null;
                return;
            case 11:
                try {
                    jx3 jx3 = (jx3) this.b;
                    if (jx3 != null) {
                        e14.c(jx3, (CancellationException) null);
                    }
                    this.b = null;
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 12:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                w4g w4g = (w4g) this.c;
                h9g h9g = (h9g) w4g.Q();
                if (h9g.b != null && h9g.getChildCount() > 0) {
                    w4g.a();
                    return;
                }
                return;
            default:
                z68.c(ev0.y((Widget) this.b), "lifecycle: postCreateView invoke onViewDetachedFromWindow", new Object[0]);
                view.removeOnAttachStateChangeListener(this);
                ((dng) this.c).a = true;
                return;
        }
    }

    public /* synthetic */ p50(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public p50(sc6 sc6, e eVar) {
        this.a = 3;
        this.c = sc6;
        this.b = eVar;
    }
}
