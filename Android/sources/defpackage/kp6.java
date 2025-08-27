package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: kp6  reason: default package */
public final class kp6 implements Runnable {
    public static final ThreadLocal v = new ThreadLocal();
    public static final cx4 w = new cx4(27);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList o;

    public static pzc c(RecyclerView recyclerView, int i, long j) {
        int I = recyclerView.w.I();
        for (int i2 = 0; i2 < I; i2++) {
            pzc V = RecyclerView.V(recyclerView.w.H(i2));
            if (V.c == i && !V.z()) {
                return null;
            }
        }
        hzc hzc = recyclerView.c;
        try {
            recyclerView.g0();
            pzc j2 = hzc.j(i, j);
            if (j2 != null) {
                if (!j2.y() || j2.z()) {
                    hzc.a(j2, false);
                } else {
                    hzc.g(j2.a);
                }
            }
            return j2;
        } finally {
            recyclerView.h0(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.E0) {
            if (RecyclerView.J1 && !this.a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            } else if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        e13 e13 = recyclerView.p1;
        e13.a = i;
        e13.b = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: jp6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: jp6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: jp6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r16) {
        /*
            r15 = this;
            r0 = r15
            java.util.ArrayList r1 = r0.a
            int r2 = r1.size()
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x000a:
            if (r4 >= r2) goto L_0x0023
            java.lang.Object r6 = r1.get(r4)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            int r7 = r6.getWindowVisibility()
            if (r7 != 0) goto L_0x0020
            e13 r7 = r6.p1
            r7.c(r6, r3)
            int r6 = r7.d
            int r5 = r5 + r6
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0023:
            java.util.ArrayList r0 = r0.o
            r0.ensureCapacity(r5)
            r4 = r3
            r5 = r4
        L_0x002a:
            r6 = 1
            if (r4 >= r2) goto L_0x0084
            java.lang.Object r7 = r1.get(r4)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r8 = r7.getWindowVisibility()
            if (r8 == 0) goto L_0x003a
            goto L_0x0081
        L_0x003a:
            e13 r8 = r7.p1
            int r9 = r8.a
            int r9 = java.lang.Math.abs(r9)
            int r10 = r8.b
            int r10 = java.lang.Math.abs(r10)
            int r10 = r10 + r9
            r9 = r3
        L_0x004a:
            int r11 = r8.d
            int r11 = r11 * 2
            if (r9 >= r11) goto L_0x0081
            int r11 = r0.size()
            if (r5 < r11) goto L_0x005f
            jp6 r11 = new jp6
            r11.<init>()
            r0.add(r11)
            goto L_0x0065
        L_0x005f:
            java.lang.Object r11 = r0.get(r5)
            jp6 r11 = (defpackage.jp6) r11
        L_0x0065:
            int[] r12 = r8.c
            int r13 = r9 + 1
            r13 = r12[r13]
            if (r13 > r10) goto L_0x006f
            r14 = r6
            goto L_0x0070
        L_0x006f:
            r14 = r3
        L_0x0070:
            r11.a = r14
            r11.b = r10
            r11.c = r13
            r11.d = r7
            r12 = r12[r9]
            r11.e = r12
            int r5 = r5 + 1
            int r9 = r9 + 2
            goto L_0x004a
        L_0x0081:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x0084:
            cx4 r1 = w
            java.util.Collections.sort(r0, r1)
            r1 = r3
        L_0x008a:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x012a
            java.lang.Object r2 = r0.get(r1)
            jp6 r2 = (defpackage.jp6) r2
            androidx.recyclerview.widget.RecyclerView r4 = r2.d
            if (r4 != 0) goto L_0x009c
            goto L_0x012a
        L_0x009c:
            boolean r5 = r2.a
            if (r5 == 0) goto L_0x00a6
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00a8
        L_0x00a6:
            r7 = r16
        L_0x00a8:
            int r5 = r2.e
            pzc r4 = c(r4, r5, r7)
            if (r4 == 0) goto L_0x0119
            java.lang.ref.WeakReference r5 = r4.b
            if (r5 == 0) goto L_0x0119
            boolean r5 = r4.y()
            if (r5 == 0) goto L_0x0119
            boolean r5 = r4.z()
            if (r5 != 0) goto L_0x0119
            java.lang.ref.WeakReference r4 = r4.b
            java.lang.Object r4 = r4.get()
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            if (r4 != 0) goto L_0x00cb
            goto L_0x0119
        L_0x00cb:
            boolean r5 = r4.P0
            if (r5 == 0) goto L_0x00da
            mqf r5 = r4.w
            int r5 = r5.I()
            if (r5 == 0) goto L_0x00da
            r4.q0()
        L_0x00da:
            e13 r5 = r4.p1
            r5.c(r4, r6)
            int r7 = r5.d
            if (r7 == 0) goto L_0x0119
            java.lang.String r7 = "RV Nested Prefetch"
            android.os.Trace.beginSection(r7)     // Catch:{ all -> 0x010d }
            lzc r7 = r4.q1     // Catch:{ all -> 0x010d }
            tyc r8 = r4.y0     // Catch:{ all -> 0x010d }
            r7.e = r6     // Catch:{ all -> 0x010d }
            int r8 = r8.j()     // Catch:{ all -> 0x010d }
            r7.f = r8     // Catch:{ all -> 0x010d }
            r7.h = r3     // Catch:{ all -> 0x010d }
            r7.i = r3     // Catch:{ all -> 0x010d }
            r7.j = r3     // Catch:{ all -> 0x010d }
            r7 = r3
        L_0x00fb:
            int r8 = r5.d     // Catch:{ all -> 0x010d }
            int r8 = r8 * 2
            if (r7 >= r8) goto L_0x010f
            int[] r8 = r5.c     // Catch:{ all -> 0x010d }
            r8 = r8[r7]     // Catch:{ all -> 0x010d }
            r9 = r16
            c(r4, r8, r9)     // Catch:{ all -> 0x010d }
            int r7 = r7 + 2
            goto L_0x00fb
        L_0x010d:
            r0 = move-exception
            goto L_0x0115
        L_0x010f:
            r9 = r16
            android.os.Trace.endSection()
            goto L_0x011b
        L_0x0115:
            android.os.Trace.endSection()
            throw r0
        L_0x0119:
            r9 = r16
        L_0x011b:
            r2.a = r3
            r2.b = r3
            r2.c = r3
            r4 = 0
            r2.d = r4
            r2.e = r3
            int r1 = r1 + 1
            goto L_0x008a
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp6.b(long):void");
    }

    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j == 0) {
                    this.b = 0;
                    Trace.endSection();
                    return;
                }
                b(TimeUnit.MILLISECONDS.toNanos(j) + this.c);
                this.b = 0;
                Trace.endSection();
            }
        } finally {
            this.b = 0;
            Trace.endSection();
        }
    }
}
