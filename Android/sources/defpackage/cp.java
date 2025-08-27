package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cp  reason: default package */
public final class cp implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Object o;

    public /* synthetic */ cp(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = i;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [int] */
    /* JADX WARNING: type inference failed for: r0v3, types: [int] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = r11.c
            int r3 = r11.b
            java.lang.Object r4 = r11.o
            int r11 = r11.a
            switch(r11) {
                case 0: goto L_0x014b;
                case 1: goto L_0x0141;
                case 2: goto L_0x011b;
                case 3: goto L_0x001f;
                case 4: goto L_0x0017;
                default: goto L_0x000d;
            }
        L_0x000d:
            androidx.work.impl.foreground.SystemForegroundService r4 = (androidx.work.impl.foreground.SystemForegroundService) r4
            android.app.NotificationManager r11 = r4.v
            android.app.Notification r2 = (android.app.Notification) r2
            r11.notify(r3, r2)
            return
        L_0x0017:
            z6f r2 = (defpackage.z6f) r2
            android.content.Intent r4 = (android.content.Intent) r4
            r2.a(r3, r4)
            return
        L_0x001f:
            zz7 r2 = (defpackage.zz7) r2
            java.lang.String r11 = "Less than 0 remaining futures"
            kz7 r4 = (defpackage.kz7) r4
            java.util.concurrent.atomic.AtomicInteger r5 = r4.o
            java.util.ArrayList r6 = r4.b
            boolean r7 = r4.isDone()
            boolean r8 = r4.c
            if (r7 != 0) goto L_0x0115
            if (r6 != 0) goto L_0x0035
            goto L_0x0115
        L_0x0035:
            r7 = 0
            boolean r9 = r2.isDone()     // Catch:{ CancellationException -> 0x00d3, ExecutionException -> 0x0072, RuntimeException -> 0x0070, Error -> 0x006e }
            java.lang.String r10 = "Tried to set value from future which is not done"
            defpackage.bs0.r(r10, r9)     // Catch:{ CancellationException -> 0x00d3, ExecutionException -> 0x0072, RuntimeException -> 0x0070, Error -> 0x006e }
            java.lang.Object r2 = defpackage.hd8.A(r2)     // Catch:{ CancellationException -> 0x00d3, ExecutionException -> 0x0072, RuntimeException -> 0x0070, Error -> 0x006e }
            r6.set(r3, r2)     // Catch:{ CancellationException -> 0x00d3, ExecutionException -> 0x0072, RuntimeException -> 0x0070, Error -> 0x006e }
            int r2 = r5.decrementAndGet()
            if (r2 < 0) goto L_0x004d
            r0 = r1
        L_0x004d:
            defpackage.bs0.r(r11, r0)
            if (r2 != 0) goto L_0x011a
            java.util.ArrayList r11 = r4.b
            if (r11 == 0) goto L_0x0062
            do1 r0 = r4.w
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
        L_0x005d:
            r0.b(r1)
            goto L_0x011a
        L_0x0062:
            boolean r11 = r4.isDone()
            defpackage.bs0.r(r7, r11)
            goto L_0x011a
        L_0x006b:
            r2 = move-exception
            goto L_0x00d9
        L_0x006e:
            r2 = move-exception
            goto L_0x0074
        L_0x0070:
            r2 = move-exception
            goto L_0x0091
        L_0x0072:
            r2 = move-exception
            goto L_0x00b0
        L_0x0074:
            do1 r3 = r4.w     // Catch:{ all -> 0x006b }
            r3.d(r2)     // Catch:{ all -> 0x006b }
            int r2 = r5.decrementAndGet()
            if (r2 < 0) goto L_0x0080
            r0 = r1
        L_0x0080:
            defpackage.bs0.r(r11, r0)
            if (r2 != 0) goto L_0x011a
            java.util.ArrayList r11 = r4.b
            if (r11 == 0) goto L_0x0062
            do1 r0 = r4.w
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            goto L_0x005d
        L_0x0091:
            if (r8 == 0) goto L_0x0098
            do1 r3 = r4.w     // Catch:{ all -> 0x006b }
            r3.d(r2)     // Catch:{ all -> 0x006b }
        L_0x0098:
            int r2 = r5.decrementAndGet()
            if (r2 < 0) goto L_0x009f
            r0 = r1
        L_0x009f:
            defpackage.bs0.r(r11, r0)
            if (r2 != 0) goto L_0x011a
            java.util.ArrayList r11 = r4.b
            if (r11 == 0) goto L_0x0062
            do1 r0 = r4.w
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            goto L_0x005d
        L_0x00b0:
            if (r8 == 0) goto L_0x00bb
            do1 r3 = r4.w     // Catch:{ all -> 0x006b }
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ all -> 0x006b }
            r3.d(r2)     // Catch:{ all -> 0x006b }
        L_0x00bb:
            int r2 = r5.decrementAndGet()
            if (r2 < 0) goto L_0x00c2
            r0 = r1
        L_0x00c2:
            defpackage.bs0.r(r11, r0)
            if (r2 != 0) goto L_0x011a
            java.util.ArrayList r11 = r4.b
            if (r11 == 0) goto L_0x0062
            do1 r0 = r4.w
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            goto L_0x005d
        L_0x00d3:
            if (r8 == 0) goto L_0x00fc
            r4.cancel(r0)     // Catch:{ all -> 0x006b }
            goto L_0x00fc
        L_0x00d9:
            int r3 = r5.decrementAndGet()
            if (r3 < 0) goto L_0x00e0
            r0 = r1
        L_0x00e0:
            defpackage.bs0.r(r11, r0)
            if (r3 != 0) goto L_0x00fb
            java.util.ArrayList r11 = r4.b
            if (r11 == 0) goto L_0x00f4
            do1 r0 = r4.w
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            r0.b(r1)
            goto L_0x00fb
        L_0x00f4:
            boolean r11 = r4.isDone()
            defpackage.bs0.r(r7, r11)
        L_0x00fb:
            throw r2
        L_0x00fc:
            int r2 = r5.decrementAndGet()
            if (r2 < 0) goto L_0x0103
            r0 = r1
        L_0x0103:
            defpackage.bs0.r(r11, r0)
            if (r2 != 0) goto L_0x011a
            java.util.ArrayList r11 = r4.b
            if (r11 == 0) goto L_0x0062
            do1 r0 = r4.w
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            goto L_0x005d
        L_0x0115:
            java.lang.String r11 = "Future was done before all dependencies completed"
            defpackage.bs0.r(r11, r8)
        L_0x011a:
            return
        L_0x011b:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r11 = r2.size()
            if (r3 == r1) goto L_0x0133
        L_0x0123:
            if (r0 >= r11) goto L_0x0140
            java.lang.Object r3 = r2.get(r0)
            q15 r3 = (defpackage.q15) r3
            r5 = r4
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r3.h(r5)
            int r0 = r0 + r1
            goto L_0x0123
        L_0x0133:
            if (r0 >= r11) goto L_0x0140
            java.lang.Object r3 = r2.get(r0)
            q15 r3 = (defpackage.q15) r3
            r3.i()
            int r0 = r0 + r1
            goto L_0x0133
        L_0x0140:
            return
        L_0x0141:
            int r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.f0
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            android.view.View r2 = (android.view.View) r2
            r4.N(r3, r2, r0)
            return
        L_0x014b:
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setTypeface(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp.run():void");
    }

    public /* synthetic */ cp(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }

    public cp(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = 1;
        this.o = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }

    public cp(List list, int i, Throwable th) {
        this.a = 2;
        bs0.q(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
        this.o = th;
    }
}
