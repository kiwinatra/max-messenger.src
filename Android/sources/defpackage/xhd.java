package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import java.util.EnumMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: xhd  reason: default package */
public final class xhd extends LinearLayout {
    public static final AccelerateDecelerateInterpolator v0 = new AccelerateDecelerateInterpolator();
    public Function0 a = new red(4);
    public final Lazy b;
    public Function0 c;
    public final Lazy o;
    public Function0 v;
    public final Lazy w;
    public final EnumMap x;
    public final EnumMap y;
    public final EnumMap z;

    public xhd(Context context) {
        super(context);
        qhd qhd = new qhd(context, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = LazyKt.lazy(lazyThreadSafetyMode, qhd);
        this.c = new red(5);
        this.o = LazyKt.lazy(lazyThreadSafetyMode, new qhd(context, this, 1));
        this.v = new red(6);
        this.w = LazyKt.lazy(lazyThreadSafetyMode, new qhd(context, this, 2));
        Class<rhd> cls = rhd.class;
        this.x = new EnumMap(cls);
        this.y = new EnumMap(cls);
        this.z = new EnumMap(cls);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
    }

    public static void a(rhd rhd, EnumMap enumMap, EnumMap enumMap2, Function1 function1) {
        ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(rhd);
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(rhd);
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            valueAnimator2.cancel();
        }
        enumMap2.put(rhd, (Object) null);
        enumMap.put(rhd, function1.invoke(valueAnimator));
    }

    private final ohd getMentionButton() {
        return (ohd) this.o.getValue();
    }

    private final ohd getReactionButton() {
        return (ohd) this.w.getValue();
    }

    private final ohd getScrollToBottomButton() {
        return (ohd) this.b.getValue();
    }

    public final void b(rhd rhd) {
        ohd d = d(rhd);
        EnumMap enumMap = this.y;
        if (enumMap.get(rhd) == null) {
            ViewParent parent = d.getParent();
            EnumMap enumMap2 = this.x;
            if (parent != null || enumMap2.get(rhd) != null) {
                EnumMap enumMap3 = this.z;
                Function0 function0 = (Function0) enumMap3.remove(rhd);
                if (function0 != null) {
                    function0.invoke();
                }
                if (isInLayout()) {
                    enumMap.put(rhd, new ValueAnimator());
                    enumMap3.put(rhd, rcg.b(this, new thd(this, rhd)));
                    return;
                }
                ohd d2 = d(rhd);
                a(rhd, enumMap, enumMap2, new whd(d2, this, rhd, this, d2));
            }
        }
    }

    public final void c(rhd rhd) {
        ohd d = d(rhd);
        EnumMap enumMap = this.x;
        if (enumMap.get(rhd) == null) {
            ViewParent parent = d.getParent();
            EnumMap enumMap2 = this.y;
            if (parent == null || enumMap2.get(rhd) != null) {
                EnumMap enumMap3 = this.z;
                Function0 function0 = (Function0) enumMap3.remove(rhd);
                if (function0 != null) {
                    function0.invoke();
                }
                if (isInLayout()) {
                    enumMap.put(rhd, new ValueAnimator());
                    enumMap3.put(rhd, rcg.b(this, new vs2(d, this, rhd)));
                    return;
                }
                if (d.getParent() != null) {
                    removeView(d);
                }
                if (rhd == rhd.a) {
                    addView(d, getChildCount());
                } else {
                    addView(d, 0);
                }
                a(rhd, enumMap, enumMap2, new ep1(d, this, rhd, 14));
            }
        }
    }

    public final ohd d(rhd rhd) {
        int i = shd.$EnumSwitchMapping$0[rhd.ordinal()];
        if (i == 1) {
            return getScrollToBottomButton();
        }
        if (i == 2) {
            return getMentionButton();
        }
        if (i == 3) {
            return getReactionButton();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void setOnClickListener(Function1<? super rhd, Unit> function1) {
        this.a = new uzb(1, function1);
        this.c = new uzb(2, function1);
        this.v = new uzb(3, function1);
    }
}
