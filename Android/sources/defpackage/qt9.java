package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* renamed from: qt9  reason: default package */
public final class qt9 {
    public long a;
    public long b;
    public TimeInterpolator c = null;
    public int d = 0;
    public int e = 1;

    public qt9(long j) {
        this.a = j;
        this.b = 150;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.a);
        objectAnimator.setDuration(this.b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.d);
        objectAnimator.setRepeatMode(this.e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : xg.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt9)) {
            return false;
        }
        qt9 qt9 = (qt9) obj;
        if (this.a == qt9.a && this.b == qt9.b && this.d == qt9.d && this.e == qt9.e) {
            return b().getClass().equals(qt9.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(qt9.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return wj6.l(sb, this.e, "}\n");
    }
}
