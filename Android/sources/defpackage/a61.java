package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: a61  reason: default package */
public final class a61 extends ConstraintLayout implements uy3 {
    public final Lazy E0;
    public final Lazy F0;
    public final ViewStub G0;
    public final ViewPager2 H0;
    public final fv6 I0;
    public final o61 J0;
    public final Lazy K0;
    public b L0;
    public z51 M0;
    public p6g N0;
    public vy3 O0;
    public final gi0 P0 = new gi0(1, this);

    public a61(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        y51 y51 = new y51(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E0 = LazyKt.lazy(lazyThreadSafetyMode, y51);
        this.F0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context, 7));
        this.K0 = LazyKt.lazy(lazyThreadSafetyMode, new s2(6, (Object) context, (Object) this));
        setLayoutParams(new fj3(-1, -1));
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(qqa.b1);
        this.H0 = viewPager2;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(qqa.a1);
        this.G0 = viewStub;
        o61 o61 = new o61(new y35(7, (Object) this), new vs6(6, (Object) this), new y51(this, 1), new y51(this, 2));
        viewPager2.setAdapter(o61);
        this.J0 = o61;
        fv6 fv6 = new fv6(context);
        fv6.setId(kgc.call_users_speakers_view_tab_layout);
        fv6.setBackgroundColor(0);
        fv6.setVisibility(8);
        this.I0 = fv6;
        addView(viewPager2, getScreenInfo().g ? (getScreenInfo().a * 9) / 16 : 0, getScreenInfo().f ? getScreenInfo().b : 0);
        addView(fv6, MathKt.roundToInt(((float) 80) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density));
        addView(viewStub, -2, -2);
        pj3 h = ct.h(this);
        int id = viewPager2.getId();
        h.e(id, 4, fv6.getId(), 3);
        tr1.u((float) 6, vo4.c().getDisplayMetrics().density, new ila(h, 4, id, 4));
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        h.e(id, 3, 0, 3);
        int id2 = fv6.getId();
        h.e(id2, 4, 0, 4);
        tr1.u((float) 8, vo4.c().getDisplayMetrics().density, new ila(h, 4, id2, 4));
        h.e(id2, 6, 0, 6);
        h.e(id2, 7, 0, 7);
        int id3 = viewStub.getId();
        h.e(id3, 6, viewPager2.getId(), 6);
        new ila(h, 6, id3, 4).e(MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density));
        h.e(id3, 4, fv6.getId(), 4);
        h.e(id3, 3, fv6.getId(), 3);
        h.e(id3, 7, fv6.getId(), 6);
        h.j(id3).d.l0 = true;
        h.j(id3).d.w = c44.DEFAULT_ASPECT_RATIO;
        h.a(this);
    }

    public static final void L(a61 a61, int i) {
        a61.getClass();
        boolean z = true;
        if (i <= 1) {
            z = false;
        }
        boolean z2 = z;
        ViewStub viewStub = a61.G0;
        if (y7e.I(viewStub) || z2) {
            y7e.C(viewStub, a61.getScrollToStartView(), (Function0) null);
            y7e.k(a61.getScrollToStartView(), z2, 0, (Function1) null, 6);
        }
    }

    private final av6 getMediator() {
        return (av6) this.E0.getValue();
    }

    private final wgd getScreenInfo() {
        return (wgd) this.F0.getValue();
    }

    private final TextView getScrollToStartView() {
        return (TextView) this.K0.getValue();
    }

    public final void m(ty3 ty3) {
        kne.Q(this, ty3.b());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        av6 mediator = getMediator();
        if (!mediator.c) {
            mediator.c = true;
            ViewPager2 viewPager2 = mediator.a;
            tyc adapter = viewPager2.getAdapter();
            mediator.d = adapter;
            if (adapter != null) {
                t45 t45 = new t45(4, mediator);
                mediator.f = t45;
                adapter.A(t45);
                zu6 zu6 = new zu6(mediator.b);
                mediator.e = zu6;
                viewPager2.b(zu6);
                mediator.a();
            } else {
                throw new IllegalStateException("Attached before view pager has an adapter".toString());
            }
        }
        this.H0.b(this.P0);
    }

    public final void onDetachedFromWindow() {
        tyc tyc;
        super.onDetachedFromWindow();
        av6 mediator = getMediator();
        if (mediator.c) {
            mediator.c = false;
            t45 t45 = mediator.f;
            if (!(t45 == null || (tyc = mediator.d) == null)) {
                tyc.D(t45);
            }
            mediator.f = null;
            mediator.d = null;
            zu6 zu6 = mediator.e;
            if (zu6 != null) {
                mediator.a.g(zu6);
            }
            mediator.e = null;
        }
        this.H0.g(this.P0);
    }

    public final void q(ty3 ty3) {
        kne.R(this, ty3.b());
    }

    public final void setControlsMediator(vy3 vy3) {
        this.O0 = vy3;
    }

    public final void setListener(z51 z51) {
        this.M0 = z51;
    }

    public final void setOpponents(List<y4b> list) {
        this.J0.G(list);
        int i = 0;
        if (!(list.size() > 1)) {
            i = 8;
        }
        fv6 fv6 = this.I0;
        fv6.setVisibility(i);
        fv6.b(list.size(), Math.min(list.size() - 1, this.H0.getCurrentItem()));
        vy3 vy3 = this.O0;
        if (vy3 != null) {
            zy3 zy3 = (zy3) vy3;
            q(zy3.j);
            m(zy3.k);
        }
    }

    public final void setOpponentsViewPool(b bVar) {
        this.L0 = bVar;
    }

    public final void setVideoLayoutUpdatesController(p6g p6g) {
        this.N0 = p6g;
    }

    public final List v(sy3 sy3, sy3 sy32) {
        return CollectionsKt.emptyList();
    }
}
