package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: o9d  reason: default package */
public final class o9d {
    public final /* synthetic */ int a;
    public final n9d b;
    public s9d c;
    public jo4 d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;

    public o9d(n9d n9d) {
        this.a = 0;
        this.c = null;
        this.d = null;
        this.e = TimeUnit.MILLISECONDS.toMillis(200);
        this.f = TimeUnit.SECONDS.toMillis(4);
        this.g = 2.0f;
        this.h = 0.1f;
        this.b = n9d;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "RtcCommandConfig{command=" + this.b + ", sentListener=null, successListener=" + this.c + ", errorListener=" + this.d + ", maxRetryCount=0, minRetryTimeoutMs=" + this.e + ", maxRetryTimeoutMs=" + this.f + ", retryBackoffFactor=" + this.g + ", retryBackoffJitter=" + this.h + '}';
            default:
                return super.toString();
        }
    }

    public o9d(o9d o9d) {
        this.a = 1;
        n9d n9d = o9d.b;
        if (n9d != null) {
            long j = o9d.e;
            if (j >= 0) {
                long j2 = o9d.f;
                if (j2 >= 0) {
                    float f2 = o9d.g;
                    if (f2 >= c44.DEFAULT_ASPECT_RATIO) {
                        float f3 = o9d.h;
                        if (f3 >= c44.DEFAULT_ASPECT_RATIO) {
                            this.b = n9d;
                            this.c = o9d.c;
                            this.d = o9d.d;
                            this.e = j;
                            this.f = j2;
                            this.g = f2;
                            this.h = f3;
                            return;
                        }
                        throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + f3);
                    }
                    throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + f2);
                }
                throw new IllegalArgumentException(wj6.i(j2, "Illegal 'maxRetryTimeoutMs' value: "));
            }
            throw new IllegalArgumentException(wj6.i(j, "Illegal 'minRetryTimeoutMs' value: "));
        }
        throw new IllegalArgumentException("Illegal 'command' value: null");
    }
}
