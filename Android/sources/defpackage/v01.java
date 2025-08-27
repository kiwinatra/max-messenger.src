package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: v01  reason: default package */
public final class v01 extends ConstraintLayout {
    public static final /* synthetic */ int Q0 = 0;
    public final Lazy E0;
    public final Lazy F0;
    public final p8d G0;
    public final p8d H0;
    public final p8d I0;
    public final p8d J0;
    public y01 K0;
    public aj8 L0;
    public aj8 M0;
    public u41 N0;
    public ymf O0;
    public final Lazy P0;

    public v01(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m mVar = new m(22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E0 = LazyKt.lazy(lazyThreadSafetyMode, mVar);
        this.F0 = LazyKt.lazy(lazyThreadSafetyMode, new m(23));
        this.P0 = LazyKt.lazy(lazyThreadSafetyMode, new j6(14, this));
        setLayoutParams(new fj3(0, -2));
        View view = new View(context);
        view.setId(kgc.call_bottom_panel_background);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#5F2D2D31"));
        view.setBackground(shapeDrawable);
        addView(view, -1, MathKt.roundToInt(((float) 76) * vo4.c().getDisplayMetrics().density));
        p8d p8d = new p8d(context, (AttributeSet) null);
        p8d.setId(kgc.call_dinamic);
        p8d.setListener(new ba(6, this, p8d));
        float f = (float) 50;
        p8d.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        p8d.setButtonPadding(MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density));
        this.G0 = p8d;
        addView(p8d);
        p8d p8d2 = new p8d(context, (AttributeSet) null);
        p8d2.setId(kgc.call_microphone);
        p8d.P(p8d2, cad.H0);
        p8d2.setListener(new u01(this, 0));
        p8d2.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        float f2 = (float) 4;
        p8d2.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        this.H0 = p8d2;
        addView(p8d2);
        p8d p8d3 = new p8d(context, (AttributeSet) null);
        p8d3.setId(kgc.call_video);
        p8d.P(p8d3, cad.U0);
        p8d3.setListener(new u01(this, 1));
        p8d3.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        p8d3.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        this.I0 = p8d3;
        addView(p8d3);
        p8d p8d4 = new p8d(context, (AttributeSet) null);
        p8d4.setId(kgc.call_more);
        p8d.P(p8d4, cad.u0);
        p8d4.setAccessibility(Integer.valueOf(ykc.call_more_accessibility));
        p8d4.setListener(new u01(this, 2));
        p8d4.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        p8d4.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        this.J0 = p8d4;
        addView(p8d4);
        p8d p8d5 = new p8d(context, (AttributeSet) null);
        p8d5.setId(kgc.call_cancel);
        p8d.P(p8d5, cad.N0);
        p8d5.setAccessibility(Integer.valueOf(ykc.call_cancel_accessibility));
        p8d5.setListener(new u01(this, 3));
        p8d5.setMode(k8d.c);
        p8d5.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        p8d5.setButtonPadding(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        addView(p8d5);
        pj3 h = ct.h(this);
        int id = p8d.getId();
        h.e(id, 4, p8d3.getId(), 4);
        h.e(id, 7, p8d2.getId(), 6);
        h.e(id, 6, 0, 6);
        h.e(id, 3, p8d3.getId(), 3);
        int id2 = p8d2.getId();
        h.e(id2, 4, p8d3.getId(), 4);
        h.e(id2, 7, p8d3.getId(), 6);
        h.e(id2, 6, p8d.getId(), 7);
        h.e(id2, 3, p8d3.getId(), 3);
        int id3 = p8d3.getId();
        h.e(id3, 4, 0, 4);
        h.e(id3, 3, 0, 3);
        h.e(id3, 7, p8d4.getId(), 6);
        h.e(id3, 6, p8d2.getId(), 7);
        int id4 = p8d4.getId();
        h.e(id4, 4, p8d3.getId(), 4);
        h.e(id4, 7, p8d5.getId(), 6);
        h.e(id4, 6, p8d3.getId(), 7);
        h.e(id4, 3, p8d3.getId(), 3);
        int id5 = p8d5.getId();
        h.e(id5, 4, p8d3.getId(), 4);
        h.e(id5, 7, 0, 7);
        h.e(id5, 6, p8d4.getId(), 7);
        h.e(id5, 3, p8d3.getId(), 3);
        int id6 = view.getId();
        h.e(id6, 4, p8d3.getId(), 4);
        h.e(id6, 7, 0, 7);
        h.e(id6, 6, 0, 6);
        h.e(id6, 3, p8d3.getId(), 3);
        h.a(this);
    }

    public static void L(v01 v01) {
        y01 y01 = v01.K0;
        if (y01 != null) {
            v01.getContainer();
            KProperty[] kPropertyArr = CallBottomPanelWidget.y;
            CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((grg) y01).b;
            if (!((jj1) callBottomPanelWidget.d0()).n()) {
                b11 c0 = callBottomPanelWidget.c0();
                jj1 jj1 = (jj1) callBottomPanelWidget.e0().c;
                k91 k91 = (k91) jj1.C0.a.getValue();
                boolean z = true;
                boolean z2 = !k91.g;
                l21 l21 = k91.f;
                if ((l21 != null ? l21.a : null) == null) {
                    z = false;
                }
                boolean a = k91.i.a();
                boolean n = jj1.n();
                List createListBuilder = CollectionsKt.createListBuilder();
                if (z2) {
                    createListBuilder.add(new g7());
                }
                if (z) {
                    createListBuilder.add(new j7());
                }
                if (n) {
                    if (a) {
                        createListBuilder.add(new i7());
                    } else {
                        createListBuilder.add(new h7());
                    }
                }
                c0.f(CollectionsKt.build(createListBuilder));
            }
        }
    }

    public static void M(p8d p8d, int i, ngf ngf) {
        l2b.f.getClass();
        p8d.N(i, -1);
        p8d.setMode(k8d.x);
        p8d.setAccessibility(ngf);
    }

    public static void O(p8d p8d, int i, ngf ngf) {
        l2b.f.getClass();
        p8d.N(i, -15987442);
        p8d.setMode(k8d.o);
        p8d.setAccessibility(ngf);
    }

    public static void S(p8d p8d, int i, int i2, aj8 aj8, ngf ngf, ngf ngf2) {
        int ordinal = aj8.ordinal();
        if (ordinal == 0) {
            O(p8d, i2, ngf2);
        } else if (ordinal == 1) {
            M(p8d, i, ngf);
        } else if (ordinal == 2 || ordinal == 3) {
            p8d.N(i2, l2b.f.c);
            p8d.setMode(k8d.x);
            p8d.setAccessibility(ngf2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final float[] getBgRadius() {
        return (float[]) this.E0.getValue();
    }

    private final t21 getCallContextMenuDelegate() {
        return (t21) this.F0.getValue();
    }

    private final View getContainer() {
        return (View) this.P0.getValue();
    }

    private final int getContextHeight() {
        int measuredHeight = getContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return g63.b((float) 6, vo4.c().getDisplayMetrics().density, measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
    }

    public final void N() {
        t21 callContextMenuDelegate = getCallContextMenuDelegate();
        hx3 hx3 = callContextMenuDelegate.a;
        if (hx3 != null) {
            hx3.dismiss();
        }
        callContextMenuDelegate.a = null;
        ymf ymf = this.O0;
        if (ymf != null) {
            ymf.dismiss();
        }
    }

    public final void P(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            t21 callContextMenuDelegate = getCallContextMenuDelegate();
            Context context = getContext();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            int i = 0;
            for (Object next : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                u41 u41 = (u41) next;
                arrayList2.add(new a54(u41.getIcon(), i, u41.getTitle()));
                i = i2;
            }
            hx3 a = callContextMenuDelegate.a(context, arrayList2, new u00((Object) callContextMenuDelegate, (Object) this, (Object) arrayList, 1));
            int roundToInt = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
            int contextHeight = getContextHeight();
            p8d p8d = this.G0;
            a.showAtLocation(p8d, 8388691, roundToInt, contextHeight);
            a.setOnDismissListener(new t01(this, 1));
            u41 u412 = this.N0;
            if (u412 == null) {
                return;
            }
            if (u412 instanceof q41) {
                q41 q41 = (q41) u412;
                M(p8d, q41.c, q41.f);
                return;
            }
            O(p8d, u412.a(), u412.getContentDescription());
        }
    }

    public final void Q() {
        int i;
        igf igf = new igf(sqa.F0);
        int i2 = pqa.z;
        int[] iArr = new int[2];
        p8d p8d = this.H0;
        p8d.getLocationOnScreen(iArr);
        Integer orNull = ArraysKt.getOrNull(iArr, 0);
        if (orNull != null) {
            i = a81.e((float) 8, vo4.c().getDisplayMetrics().density, orNull.intValue() - (p8d.getWidth() / 2));
        } else {
            i = a81.e((float) 8, vo4.c().getDisplayMetrics().density, (int) p8d.getX());
        }
        Point point = new Point(i, getContextHeight());
        ymf ymf = this.O0;
        if (ymf == null || !ymf.isShowing()) {
            ymf ymf2 = this.O0;
            if (ymf2 != null) {
                ymf2.dismiss();
            }
            ymf ymf3 = new ymf(getContext(), (View) p8d, (Function0) new m(24), (Function0) new m(25), (wmf) null, (vmf) null, 96);
            ymf3.d(igf);
            ymf3.c(Integer.valueOf(i2));
            ymf3.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
            ymf3.setOnDismissListener(new t01(this, 0));
            this.O0 = ymf3;
            return;
        }
        ymf ymf4 = this.O0;
        if (ymf4 != null) {
            ymf4.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        }
    }

    public final void R(List list) {
        if (!list.isEmpty()) {
            t21 callContextMenuDelegate = getCallContextMenuDelegate();
            hx3 a = callContextMenuDelegate.a(getContext(), list, new ba(5, callContextMenuDelegate, this));
            int contextHeight = getContextHeight();
            p8d p8d = this.J0;
            a.showAtLocation(p8d, 81, 0, contextHeight);
            a.setOnDismissListener(new t01(this, 2));
            O(p8d, cad.u0, new igf(ykc.call_more_accessibility));
        }
    }

    public final void setAudioInfo(u41 u41) {
        if (!Intrinsics.areEqual((Object) this.N0, (Object) u41)) {
            this.N0 = u41;
            int a = u41.a();
            ngf contentDescription = u41.getContentDescription();
            S(this.G0, a, a, u41 instanceof q41 ? aj8.c : aj8.b, contentDescription, contentDescription);
        }
    }

    public final void setClickListener(y01 y01) {
        this.K0 = y01;
    }

    public final void setMicrophoneEnabled(aj8 aj8) {
        if (this.L0 != aj8) {
            this.L0 = aj8;
            S(this.H0, cad.I0, cad.H0, aj8, new igf(ykc.call_microphone_enabled_accessibility), new igf(ykc.call_microphone_disabled_accessibility));
        }
    }

    public final void setVideoEnabled(aj8 aj8) {
        if (this.M0 != aj8) {
            this.M0 = aj8;
            S(this.I0, cad.V0, cad.U0, aj8, new igf(ykc.call_video_enabled_accessibility), new igf(ykc.call_video_disabled_accessibility));
        }
    }
}
