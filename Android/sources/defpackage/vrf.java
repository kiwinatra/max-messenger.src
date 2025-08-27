package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* renamed from: vrf  reason: default package */
public abstract class vrf {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
