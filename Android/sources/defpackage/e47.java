package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.Unit;

/* renamed from: e47  reason: default package */
public final class e47 implements nde {
    public final rt0 a = new Object();
    public boolean b;
    public final boolean c;
    public final /* synthetic */ h47 o;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, rt0] */
    public e47(h47 h47, boolean z) {
        this.o = h47;
        this.c = z;
    }

    public final void O(rt0 rt0, long j) {
        byte[] bArr = u0g.a;
        rt0 rt02 = this.a;
        rt02.O(rt0, j);
        while (rt02.b >= PlaybackStateCompat.ACTION_PREPARE) {
            a(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r12.o.j.m();
        r12.o.b();
        r1 = r12.o;
        r10 = java.lang.Math.min(r1.d - r1.c, r12.a.b);
        r1 = r12.o;
        r1.c += r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r13 == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r10 != r12.a.b) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r1.f() != 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r8 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        r13 = kotlin.Unit.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r13) {
        /*
            r12 = this;
            h47 r0 = r12.o
            monitor-enter(r0)
            h47 r1 = r12.o     // Catch:{ all -> 0x005f }
            g47 r1 = r1.j     // Catch:{ all -> 0x005f }
            r1.i()     // Catch:{ all -> 0x005f }
        L_0x000a:
            h47 r1 = r12.o     // Catch:{ all -> 0x0028 }
            long r2 = r1.c     // Catch:{ all -> 0x0028 }
            long r4 = r1.d     // Catch:{ all -> 0x0028 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x002a
            boolean r2 = r12.c     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x002a
            boolean r2 = r12.b     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x002a
            int r1 = r1.f()     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x002a
            h47 r1 = r12.o     // Catch:{ all -> 0x0028 }
            r1.k()     // Catch:{ all -> 0x0028 }
            goto L_0x000a
        L_0x0028:
            r13 = move-exception
            goto L_0x0089
        L_0x002a:
            h47 r1 = r12.o     // Catch:{ all -> 0x005f }
            g47 r1 = r1.j     // Catch:{ all -> 0x005f }
            r1.m()     // Catch:{ all -> 0x005f }
            h47 r1 = r12.o     // Catch:{ all -> 0x005f }
            r1.b()     // Catch:{ all -> 0x005f }
            h47 r1 = r12.o     // Catch:{ all -> 0x005f }
            long r2 = r1.d     // Catch:{ all -> 0x005f }
            long r4 = r1.c     // Catch:{ all -> 0x005f }
            long r2 = r2 - r4
            rt0 r1 = r12.a     // Catch:{ all -> 0x005f }
            long r4 = r1.b     // Catch:{ all -> 0x005f }
            long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x005f }
            h47 r1 = r12.o     // Catch:{ all -> 0x005f }
            long r2 = r1.c     // Catch:{ all -> 0x005f }
            long r2 = r2 + r10
            r1.c = r2     // Catch:{ all -> 0x005f }
            if (r13 == 0) goto L_0x0061
            rt0 r13 = r12.a     // Catch:{ all -> 0x005f }
            long r2 = r13.b     // Catch:{ all -> 0x005f }
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0061
            int r13 = r1.f()     // Catch:{ all -> 0x005f }
            if (r13 != 0) goto L_0x0061
            r13 = 1
        L_0x005d:
            r8 = r13
            goto L_0x0063
        L_0x005f:
            r12 = move-exception
            goto L_0x0091
        L_0x0061:
            r13 = 0
            goto L_0x005d
        L_0x0063:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x005f }
            monitor-exit(r0)
            h47 r13 = r12.o
            g47 r13 = r13.j
            r13.i()
            h47 r13 = r12.o     // Catch:{ all -> 0x0080 }
            a47 r6 = r13.n     // Catch:{ all -> 0x0080 }
            int r7 = r13.m     // Catch:{ all -> 0x0080 }
            rt0 r9 = r12.a     // Catch:{ all -> 0x0080 }
            r6.n(r7, r8, r9, r10)     // Catch:{ all -> 0x0080 }
            h47 r12 = r12.o
            g47 r12 = r12.j
            r12.m()
            return
        L_0x0080:
            r13 = move-exception
            h47 r12 = r12.o
            g47 r12 = r12.j
            r12.m()
            throw r13
        L_0x0089:
            h47 r12 = r12.o     // Catch:{ all -> 0x005f }
            g47 r12 = r12.j     // Catch:{ all -> 0x005f }
            r12.m()     // Catch:{ all -> 0x005f }
            throw r13     // Catch:{ all -> 0x005f }
        L_0x0091:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e47.a(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r0 = r13.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r0.h.c != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r13.a.b <= 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r13.a.b <= 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r1 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r0.n.n(r0.m, true, (defpackage.rt0) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r0 = r13.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r13.b = true;
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r13.o.n.flush();
        r13.o.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r13 = this;
            h47 r0 = r13.o
            byte[] r1 = defpackage.u0g.a
            monitor-enter(r0)
            boolean r1 = r13.b     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            h47 r1 = r13.o     // Catch:{ all -> 0x005d }
            int r1 = r1.f()     // Catch:{ all -> 0x005d }
            r2 = 1
            if (r1 != 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x005d }
            monitor-exit(r0)
            h47 r0 = r13.o
            e47 r3 = r0.h
            boolean r3 = r3.c
            if (r3 != 0) goto L_0x0045
            rt0 r3 = r13.a
            long r3 = r3.b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
        L_0x002c:
            rt0 r0 = r13.a
            long r0 = r0.b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
            r13.a(r2)
            goto L_0x002c
        L_0x0038:
            if (r1 == 0) goto L_0x0045
            a47 r7 = r0.n
            int r8 = r0.m
            r11 = 0
            r9 = 1
            r10 = 0
            r7.n(r8, r9, r10, r11)
        L_0x0045:
            h47 r0 = r13.o
            monitor-enter(r0)
            r13.b = r2     // Catch:{ all -> 0x005a }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x005a }
            monitor-exit(r0)
            h47 r0 = r13.o
            a47 r0 = r0.n
            r0.flush()
            h47 r13 = r13.o
            r13.a()
            return
        L_0x005a:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        L_0x005d:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e47.close():void");
    }

    public final void flush() {
        h47 h47 = this.o;
        byte[] bArr = u0g.a;
        synchronized (h47) {
            this.o.b();
            Unit unit = Unit.INSTANCE;
        }
        while (this.a.b > 0) {
            a(false);
            this.o.n.flush();
        }
    }

    public final lkf q() {
        return this.o.j;
    }
}
