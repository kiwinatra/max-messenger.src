package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: eh1  reason: default package */
public final class eh1 extends ConstraintLayout implements oi1, mi1 {
    public final /* synthetic */ CallScreen E0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eh1(CallScreen callScreen, Context context) {
        super(context);
        this.E0 = callScreen;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(l2b.d.i);
        setId(kgc.call_screen_container_id);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(kgc.call_bottom_control_container);
        fj3 fj3 = new fj3(-2, -2);
        fj3.P = MathKt.roundToInt(((float) 348) * vo4.c().getDisplayMetrics().density);
        frameLayout.setLayoutParams(fj3);
        float f = (float) 12;
        frameLayout.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density));
        jdb jdb = jdb.o;
        h88.f(frameLayout, new yh7((jdb) null, new nr0(jdb, mr0.a, false), 1), (Function1) null);
        callScreen.Y.a(frameLayout, lmb.b);
        boolean isLaidOut = frameLayout.isLaidOut();
        mmb mmb = callScreen.Y;
        if (!isLaidOut || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new ch1(callScreen, 1));
        } else {
            mmb.c();
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(kgc.call_top_control_container);
        jdb jdb2 = anf.a;
        h88.f(frameLayout2, new yh7(jdb, (nr0) null, 2), (Function1) null);
        mmb.a(frameLayout2, lmb.a);
        if (!frameLayout2.isLaidOut() || frameLayout2.isLayoutRequested()) {
            frameLayout2.addOnLayoutChangeListener(new ch1(callScreen, 2));
        } else {
            mmb.c();
        }
        zy3 l0 = callScreen.l0();
        frameLayout2.addOnLayoutChangeListener((View.OnLayoutChangeListener) l0.e.getValue());
        l0.c = frameLayout2;
        frameLayout.addOnLayoutChangeListener((View.OnLayoutChangeListener) l0.f.getValue());
        l0.d = frameLayout;
        addView(callScreen.q0());
        addView(callScreen.o0());
        addView(callScreen.n0());
        addView(frameLayout);
        addView(callScreen.m0());
        addView(frameLayout2, 0, -2);
        pj3 h = ct.h(this);
        int id = callScreen.q0().getId();
        h.e(id, 6, 0, 6);
        h.e(id, 3, 0, 3);
        h.e(id, 7, 0, 7);
        h.e(id, 4, 0, 4);
        int id2 = frameLayout2.getId();
        h.e(id2, 3, 0, 3);
        h.e(id2, 6, 0, 6);
        h.e(id2, 7, 0, 7);
        int id3 = callScreen.o0().getId();
        h.e(id3, 3, frameLayout2.getId(), 4);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
        h.e(id3, 6, 0, 6);
        h.e(id3, 7, 0, 7);
        int id4 = callScreen.n0().getId();
        h.e(id4, 3, 0, 3);
        h.e(id4, 6, 0, 6);
        h.e(id4, 7, 0, 7);
        int id5 = frameLayout.getId();
        h.e(id5, 4, 0, 4);
        h.e(id5, 6, 0, 6);
        h.e(id5, 7, 0, 7);
        int id6 = callScreen.m0().getId();
        h.e(id6, 3, 0, 3);
        h.e(id6, 4, 0, 4);
        h.e(id6, 6, 0, 6);
        h.e(id6, 7, 0, 7);
        h.a(this);
    }

    public final void C(long j, List list, boolean z) {
        rk1 d0 = CallScreen.d0(this.E0);
        if (d0 != null) {
            d0.C(j, list, z);
        }
    }

    public final void a(boolean z) {
        CallScreen callScreen = this.E0;
        callScreen.y = false;
        if (z) {
            rk1 d0 = CallScreen.d0(callScreen);
            if (d0 != null) {
                d0.a(true);
            }
            callScreen.e0(true);
        }
    }

    public final void b(boolean z) {
        CallScreen callScreen = this.E0;
        callScreen.y = true;
        if (!z) {
            callScreen.p0().m(false);
            callScreen.e0(false);
        }
    }

    public final void e(RectF rectF, boolean z) {
        rk1 d0 = CallScreen.d0(this.E0);
        if (d0 != null) {
            d0.e(rectF, z);
        }
    }

    public final void g(boolean z) {
        CallScreen callScreen = this.E0;
        callScreen.y = true;
        if (!z) {
            callScreen.p0().m(false);
        }
        callScreen.e0(false);
        rk1 d0 = CallScreen.d0(callScreen);
        if (d0 != null) {
            d0.g(z);
        }
    }

    public boolean getShouldScaleMainOpponent() {
        rk1 d0 = CallScreen.d0(this.E0);
        if (d0 != null) {
            return d0.getShouldScaleMainOpponent();
        }
        return false;
    }

    public final void x(boolean z) {
        CallScreen callScreen = this.E0;
        callScreen.y = false;
        if (z) {
            if (y7e.I(callScreen.o0())) {
                callScreen.i0().setAlpha(1.0f);
            }
            callScreen.e0(true);
            rk1 d0 = CallScreen.d0(callScreen);
            if (d0 != null) {
                d0.x(true);
            }
        }
    }

    public final void y(long j, List list, boolean z) {
        CallScreen callScreen = this.E0;
        rk1 d0 = CallScreen.d0(callScreen);
        if (d0 != null) {
            d0.y(j, list, z);
        }
        if (y7e.I(callScreen.o0())) {
            callScreen.i0().y(j, list, z);
        }
    }
}
