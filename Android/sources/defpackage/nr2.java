package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: nr2  reason: default package */
public final class nr2 extends AnimatorListenerAdapter {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ qk3 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Runnable o;
    public final /* synthetic */ or2 v;
    public final /* synthetic */ mqf w;

    public nr2(mqf mqf, Runnable runnable, qk3 qk3, float f, Runnable runnable2, or2 or2) {
        this.w = mqf;
        this.a = runnable;
        this.b = qk3;
        this.c = f;
        this.o = runnable2;
        this.v = or2;
    }

    public final void onAnimationEnd(Animator animator) {
        try {
            this.b.accept(Float.valueOf(this.c));
        } catch (Throwable th) {
            z68.b("mqf", "animateContainer: failed to update final value", th);
        }
        Runnable runnable = this.o;
        if (runnable != null) {
            runnable.run();
        }
        mqf mqf = this.w;
        ((ArrayList) mqf.c).remove(this.v);
        mqf.T();
    }

    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
