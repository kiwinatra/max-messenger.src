package defpackage;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;

/* renamed from: dj0  reason: default package */
public abstract class dj0 implements j74 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public q74 o;

    public dj0(boolean z) {
        this.a = z;
    }

    public final void H(brf brf) {
        brf.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(brf)) {
            arrayList.add(brf);
            this.c++;
        }
    }

    public final void a(int i) {
        q74 q74 = this.o;
        int i2 = v0g.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            boolean z = this.a;
            wc4 wc4 = (wc4) ((brf) this.b.get(i3));
            synchronized (wc4) {
                k0d k0d = wc4.n;
                if (z && (q74.i & 8) != 8) {
                    wc4.h += (long) i;
                }
            }
        }
    }

    public final void b() {
        q74 q74 = this.o;
        int i = v0g.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            boolean z = this.a;
            wc4 wc4 = (wc4) ((brf) this.b.get(i2));
            synchronized (wc4) {
                try {
                    k0d k0d = wc4.n;
                    if (z && (q74.i & 8) != 8) {
                        n79.n(wc4.f > 0);
                        wc4.c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (elapsedRealtime - wc4.g);
                        wc4.i += (long) i3;
                        long j = wc4.j;
                        long j2 = wc4.h;
                        wc4.j = j + j2;
                        if (i3 > 0) {
                            wc4.e.a((((float) j2) * 8000.0f) / ((float) i3), (int) Math.sqrt((double) j2));
                            if (wc4.i < 2000) {
                                if (wc4.j >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                }
                                wc4.c(i3, wc4.h, wc4.k);
                                wc4.g = elapsedRealtime;
                                wc4.h = 0;
                            }
                            wc4.k = (long) wc4.e.b();
                            wc4.c(i3, wc4.h, wc4.k);
                            wc4.g = elapsedRealtime;
                            wc4.h = 0;
                        }
                        wc4.f--;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        this.o = null;
    }

    public final void c() {
        for (int i = 0; i < this.c; i++) {
            ((brf) this.b.get(i)).getClass();
        }
    }

    public final void d(q74 q74) {
        this.o = q74;
        for (int i = 0; i < this.c; i++) {
            boolean z = this.a;
            wc4 wc4 = (wc4) ((brf) this.b.get(i));
            synchronized (wc4) {
                try {
                    k0d k0d = wc4.n;
                    if (z && (q74.i & 8) != 8) {
                        if (wc4.f == 0) {
                            wc4.c.getClass();
                            wc4.g = SystemClock.elapsedRealtime();
                        }
                        wc4.f++;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }
}
