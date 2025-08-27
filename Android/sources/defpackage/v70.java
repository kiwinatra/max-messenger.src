package defpackage;

import android.media.AudioTrack;
import androidx.work.WorkRequest;

/* renamed from: v70  reason: default package */
public final class v70 {
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final Object g;

    public v70(AudioTrack audioTrack, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.g = new u70(audioTrack);
                a();
                return;
            default:
                if (t0g.a >= 19) {
                    this.g = new t70(audioTrack);
                    a();
                    return;
                }
                this.g = null;
                b(3);
                return;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                if (((t70) this.g) != null) {
                    b(0);
                    return;
                }
                return;
            default:
                if (((u70) this.g) != null) {
                    b(0);
                    return;
                }
                return;
        }
    }

    public final void b(int i) {
        switch (this.a) {
            case 0:
                this.b = i;
                if (i == 0) {
                    this.e = 0;
                    this.f = -1;
                    this.c = System.nanoTime() / 1000;
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                } else if (i == 1) {
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                } else if (i == 2 || i == 3) {
                    this.d = 10000000;
                    return;
                } else if (i == 4) {
                    this.d = 500000;
                    return;
                } else {
                    throw new IllegalStateException();
                }
            default:
                this.b = i;
                if (i == 0) {
                    this.e = 0;
                    this.f = -1;
                    this.c = System.nanoTime() / 1000;
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                } else if (i == 1) {
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                } else if (i == 2 || i == 3) {
                    this.d = 10000000;
                    return;
                } else if (i == 4) {
                    this.d = 500000;
                    return;
                } else {
                    throw new IllegalStateException();
                }
        }
    }
}
