package defpackage;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: cb4  reason: default package */
public final class cb4 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;

    public cb4(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = true;
                this.c = 65536;
                this.f = 0;
                this.g = new hd[100];
                return;
            case 2:
                return;
            default:
                this.b = true;
                this.c = 65536;
                this.f = 0;
                this.g = new gd[100];
                return;
        }
    }

    public void a(RecyclerView recyclerView) {
        int i = this.f;
        if (i >= 0) {
            this.f = -1;
            recyclerView.c0(i);
            this.b = false;
        } else if (this.b) {
            Interpolator interpolator = (Interpolator) this.g;
            if (interpolator == null || this.e >= 1) {
                int i2 = this.e;
                if (i2 >= 1) {
                    recyclerView.n1.c(this.c, this.d, i2, interpolator);
                    this.b = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(int r2) {
        /*
            r1 = this;
            int r0 = r1.a
            monitor-enter(r1)
            switch(r0) {
                case 0: goto L_0x001b;
                default: goto L_0x0006;
            }
        L_0x0006:
            int r0 = r1.d     // Catch:{ all -> 0x0015 }
            if (r2 >= r0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r1.d = r2     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            r1.c()     // Catch:{ all -> 0x0015 }
            goto L_0x0017
        L_0x0015:
            r2 = move-exception
            goto L_0x0019
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            throw r2
        L_0x001b:
            int r0 = r1.d     // Catch:{ all -> 0x002a }
            if (r2 >= r0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r1.d = r2     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x002c
            r1.c()     // Catch:{ all -> 0x002a }
            goto L_0x002c
        L_0x002a:
            r2 = move-exception
            goto L_0x002e
        L_0x002c:
            monitor-exit(r1)
            return
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb4.b(int):void");
    }

    public synchronized void c() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    int max = Math.max(0, t0g.g(this.d, this.c) - this.e);
                    int i2 = this.f;
                    if (max < i2) {
                        Arrays.fill((gd[]) this.g, max, i2, (Object) null);
                        this.f = max;
                        return;
                    }
                    return;
                default:
                    int max2 = Math.max(0, v0g.g(this.d, this.c) - this.e);
                    int i3 = this.f;
                    if (max2 < i3) {
                        Arrays.fill((hd[]) this.g, max2, i3, (Object) null);
                        this.f = max2;
                        return;
                    }
                    return;
            }
        }
    }

    public void d(int i, int i2, int i3, Interpolator interpolator) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.g = interpolator;
        this.b = true;
    }
}
