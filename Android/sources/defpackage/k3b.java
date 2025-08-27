package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.sequences.SequencesKt;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: k3b  reason: default package */
public final class k3b extends LinearLayout implements ird {
    public final AppCompatTextView a;
    public final OneMeButton b;
    public final ArrayList c = new ArrayList();
    public AnimatorSet o;
    public j3b v = j3b.a;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;

    public k3b(Context context) {
        super(context, (AttributeSet) null);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(dad.J0);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setTextColor(fu4.k.e(appCompatTextView.getContext()).f().getText().e);
        appCompatTextView.setTextAlignment(5);
        appCompatTextView.setSingleLine();
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setSingleLine();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams);
        puf.x.b(appCompatTextView, uy4.b);
        this.a = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setMode(zpa.o);
        oneMeButton.setSize(aqa.b);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setId(dad.y0);
        oneMeButton.d(Integer.valueOf(cad.q0), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(marginLayoutParams);
        this.b = oneMeButton;
        pna pna = new pna(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = LazyKt.lazy(lazyThreadSafetyMode, pna);
        this.x = LazyKt.lazy(lazyThreadSafetyMode, new pna(26));
        this.y = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 7));
        setElevation(vo4.c().getDisplayMetrics().density * 10.0f);
        setGravity(16);
        addView(oneMeButton);
        addView(appCompatTextView);
    }

    public static void d(k3b k3b, Function1 function1, e3b e3b) {
        k3b.getPopupWindow().dismiss();
        function1.invoke(Integer.valueOf(e3b.a));
    }

    private final LinearInterpolator getAppearInterpolator() {
        return (LinearInterpolator) this.w.getValue();
    }

    private final LinearInterpolator getDisappearInterpolator() {
        return (LinearInterpolator) this.x.getValue();
    }

    private final PopupWindow getPopupWindow() {
        return (PopupWindow) this.y.getValue();
    }

    public final void a(String str, List list, Function0 function0, Function1 function1) {
        PopupWindow popupWindow;
        OneMeButton oneMeButton;
        Function1 function12 = function1;
        setSelectionTitle(str);
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
        arrayList.clear();
        Iterable iterable = list;
        List take = CollectionsKt.take(iterable, 5);
        List<e3b> drop = CollectionsKt.drop(iterable, 5);
        Collection collection = drop;
        boolean z = false;
        if (!collection.isEmpty()) {
            srb srb = new srb(getContext(), false);
            srb.setId(dad.G0);
            for (e3b e3b : drop) {
                rrb rrb = new rrb(srb.getContext(), z);
                rrb rrb2 = rrb;
                rrb.c(rrb, new igf(e3b.b), (Integer) null, true, true);
                rrb2.b(Integer.valueOf(e3b.c), Integer.valueOf(gdc.global_icon_primary));
                ct.G(rrb2, 300, new og5(this, function12, e3b, 1));
                srb.addView(rrb2, -1, -2);
                z = false;
            }
            popupWindow = getPopupWindow();
            popupWindow.setContentView(srb);
        } else {
            popupWindow = null;
        }
        int i = 0;
        for (Object next : take) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            e3b e3b2 = (e3b) next;
            if (i != 4 || !(!collection.isEmpty())) {
                OneMeButton oneMeButton2 = new OneMeButton(getContext(), (AttributeSet) null);
                oneMeButton2.setMode(zpa.o);
                oneMeButton2.setSize(aqa.b);
                oneMeButton2.setAppearance(xpa.o);
                oneMeButton2.setId(dad.z0);
                oneMeButton2.d(Integer.valueOf(e3b2.c), true);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMarginStart(MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
                oneMeButton2.setLayoutParams(marginLayoutParams);
                ct.G(oneMeButton2, 300, new h24(24, (Object) function12, (Object) e3b2));
                oneMeButton = oneMeButton2;
            } else {
                oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
                oneMeButton.setMode(zpa.o);
                oneMeButton.setSize(aqa.b);
                oneMeButton.setAppearance(xpa.o);
                oneMeButton.setId(dad.F0);
                oneMeButton.d(Integer.valueOf(zec.ic_more_vertical_filled_16), true);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.setMarginStart(MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(marginLayoutParams2);
                ct.G(oneMeButton, 300, new u99(12, (Object) popupWindow));
            }
            arrayList.add(oneMeButton);
            b59.w(oneMeButton, MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
            addView(oneMeButton);
            i = i2;
        }
        j3b j3b = this.v;
        j3b j3b2 = j3b.b;
        if (j3b != j3b2) {
            this.v = j3b2;
            setCloseListener(new vra(4, this, function0));
            e(true);
        }
    }

    public final void b() {
        this.v = j3b.a;
        e(false);
    }

    public final boolean c() {
        return this.v == j3b.b;
    }

    public final void e(boolean z) {
        AnimatorSet animatorSet = this.o;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        float alpha = getAlpha();
        float f = c44.DEFAULT_ASPECT_RATIO;
        float f2 = z ? 1.0f : 0.0f;
        long j = 200;
        if (!(alpha == c44.DEFAULT_ASPECT_RATIO || alpha == 1.0f)) {
            j = (long) (Math.abs(alpha - f2) * ((float) 200));
        }
        animatorSet2.setDuration(j);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{alpha, f2});
        ofFloat.setInterpolator(z ? getAppearInterpolator() : getDisappearInterpolator());
        ofFloat.addListener(new th2(this, alpha, z));
        boolean z2 = !z;
        if (z2) {
            f = 1.0f;
        }
        animatorSet2.playTogether(CollectionsKt.plus(SequencesKt.toList(SequencesKt.map(SequencesKt.filter(new mag(0, (ViewGroup) getParent()), new vq7(24, (Object) this)), new i3b(f, z2 ? getAppearInterpolator() : getDisappearInterpolator()))), ofFloat));
        animatorSet2.start();
        this.o = animatorSet2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            TouchDelegate touchDelegate = view.getTouchDelegate();
            if (touchDelegate != null && touchDelegate.onTouchEvent(motionEvent)) {
                if (motionEvent.getAction() == 1) {
                    view.performClick();
                }
            }
        }
        return true;
    }

    public final void setCloseListener(Function0<Unit> function0) {
        ct.G(this.b, 300, new e7(17, function0));
    }

    public final void setSelectionTitle(String str) {
        this.a.setText(str);
    }
}
