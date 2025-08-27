package defpackage;

import androidx.work.WorkRequest;

/* renamed from: vd5  reason: default package */
public final class vd5 {
    public final long a;
    public final long b;
    public final float c;
    public final float d;

    public vd5(int i, long j, float f) {
        j = (i & 1) != 0 ? 500 : j;
        f = (i & 4) != 0 ? 1.5f : f;
        this.a = j;
        this.b = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.c = f;
        this.d = 0.2f;
        if (j < 1) {
            throw new IllegalArgumentException("Interval is invalid. Must be greater than 1.".toString());
        } else if (WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS < j) {
            throw new IllegalArgumentException("maxInterval is invalid. Must be greater or equal than Interval.".toString());
        } else if (((double) f) >= 1.0d) {
            double d2 = (double) 0.2f;
            if (d2 < 0.0d || 1.0d <= d2) {
                throw new IllegalArgumentException("Range is invalid. Must be greater or equal 0.0 and lower than 1.0.".toString());
            }
        } else {
            throw new IllegalArgumentException("Multiplier is invalid. Must be greater than 1.0.".toString());
        }
    }
}
