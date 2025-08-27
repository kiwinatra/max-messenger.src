package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: bv1  reason: default package */
public final class bv1 implements u4b {
    public final /* synthetic */ int a;
    public boolean b;

    public /* synthetic */ bv1(int i, boolean z) {
        this.a = i;
    }

    public static bx1 d(bx1 bx1) {
        u40 u40 = new u40();
        u40.c = bx1.c;
        for (lk4 add : Collections.unmodifiableList(bx1.a)) {
            ((HashSet) u40.e).add(add);
        }
        u40.c(bx1.b);
        pz9 c = pz9.c();
        c.f(vs1.o0(CaptureRequest.FLASH_MODE), 0);
        u40.c(new wie(9, (Object) c5b.a(c)));
        return u40.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0016, code lost:
        if (r1.b != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0018, code lost:
        wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r1.b != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a() {
        /*
            r1 = this;
            int r0 = r1.a
            monitor-enter(r1)
            switch(r0) {
                case 1: goto L_0x0014;
                default: goto L_0x0006;
            }
        L_0x0006:
            boolean r0 = r1.b     // Catch:{ all -> 0x000e }
            if (r0 != 0) goto L_0x0010
            r1.wait()     // Catch:{ all -> 0x000e }
            goto L_0x0006
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            throw r0
        L_0x0014:
            boolean r0 = r1.b     // Catch:{ all -> 0x001c }
            if (r0 != 0) goto L_0x001e
            r1.wait()     // Catch:{ all -> 0x001c }
            goto L_0x0014
        L_0x001c:
            r0 = move-exception
            goto L_0x0020
        L_0x001e:
            monitor-exit(r1)
            return
        L_0x0020:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv1.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b() {
        /*
            r2 = this;
            int r0 = r2.a
            monitor-enter(r2)
            switch(r0) {
                case 1: goto L_0x0020;
                default: goto L_0x0006;
            }
        L_0x0006:
            r0 = 0
        L_0x0007:
            boolean r1 = r2.b     // Catch:{ all -> 0x000f }
            if (r1 != 0) goto L_0x0013
            r2.wait()     // Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0007
        L_0x000f:
            r0 = move-exception
            goto L_0x001e
        L_0x0011:
            r0 = 1
            goto L_0x0007
        L_0x0013:
            if (r0 == 0) goto L_0x001c
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x000f }
            r0.interrupt()     // Catch:{ all -> 0x000f }
        L_0x001c:
            monitor-exit(r2)
            return
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            throw r0
        L_0x0020:
            r0 = 0
        L_0x0021:
            boolean r1 = r2.b     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x002d
            r2.wait()     // Catch:{ InterruptedException -> 0x002b }
            goto L_0x0021
        L_0x0029:
            r0 = move-exception
            goto L_0x0038
        L_0x002b:
            r0 = 1
            goto L_0x0021
        L_0x002d:
            if (r0 == 0) goto L_0x0036
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0029 }
            r0.interrupt()     // Catch:{ all -> 0x0029 }
        L_0x0036:
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv1.b():void");
    }

    public synchronized void c() {
        this.b = false;
    }

    public synchronized boolean e() {
        return this.b;
    }

    public boolean f(ArrayList arrayList, boolean z) {
        if (!this.b || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean g() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 1:
                    if (this.b) {
                        return false;
                    }
                    this.b = true;
                    notifyAll();
                    return true;
                default:
                    if (this.b) {
                        return false;
                    }
                    this.b = true;
                    notifyAll();
                    return true;
            }
        }
    }

    public void h() {
        this.b = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i(java.util.ArrayList r2, boolean r3) {
        /*
            r1 = this;
            boolean r1 = r1.b
            r0 = 0
            if (r1 == 0) goto L_0x002c
            if (r3 != 0) goto L_0x0008
            goto L_0x002c
        L_0x0008:
            java.util.Iterator r1 = r2.iterator()
        L_0x000c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.next()
            android.hardware.camera2.CaptureRequest r2 = (android.hardware.camera2.CaptureRequest) r2
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 2
            if (r2 == r3) goto L_0x002a
            r3 = 3
            if (r2 != r3) goto L_0x000c
        L_0x002a:
            r1 = 1
            return r1
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv1.i(java.util.ArrayList, boolean):boolean");
    }

    public /* synthetic */ bv1(int i, boolean z, boolean z2) {
        this.a = i;
    }

    public /* synthetic */ bv1(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public bv1(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = ((StillCaptureFlashStopRepeatingQuirk) qn4.a.g(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                return;
            case 7:
                this.b = nn4.a.g(SurfaceOrderQuirk.class) != null;
                return;
            case 8:
                this.b = qn4.a.g(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                return;
            default:
                this.b = false;
                return;
        }
    }

    public bv1(ykb ykb, int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = ykb.e(UseTorchAsFlashQuirk.class);
                return;
            default:
                this.b = ykb.e(Preview3AThreadCrashQuirk.class);
                return;
        }
    }

    public bv1(Context context) {
        this.a = 12;
        context.getApplicationContext();
    }
}
