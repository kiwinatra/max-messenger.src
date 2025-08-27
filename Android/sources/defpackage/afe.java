package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.KProperty;

/* renamed from: afe  reason: default package */
public final class afe {
    public static final /* synthetic */ KProperty[] e;
    public final d14 a;
    public final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new red(27));
    public final wie c = o5a.U();
    public final wie d = o5a.U();

    static {
        Class<afe> cls = afe.class;
        e = new KProperty[]{rae.s(cls, "infiniteAnimationJob", "getInfiniteAnimationJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "stateAnimationJob", "getStateAnimationJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public afe(vu7 vu7) {
        this.a = vu7;
    }

    public static void a(lg7 lg7, int i) {
        if (lg7 != null) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(((oee) lg7).F0.getCurrentTextColor()), Integer.valueOf(i)});
            ofObject.setDuration(200);
            ofObject.addUpdateListener(new uee(lg7, 1));
            ofObject.start();
        }
    }

    public final void b() {
        KProperty[] kPropertyArr = e;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.c;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
    }
}
