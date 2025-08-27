package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.ArrayDeque;

/* renamed from: b88  reason: default package */
public final class b88 {
    public final Context a;
    public final Object b = new Object();
    public volatile int c = 1;
    public ArrayDeque d;
    public int e = 1;
    public File f;
    public int g;
    public final ConcurrentLinkedQueue h = new ConcurrentLinkedQueue();
    public final long i = System.currentTimeMillis();

    public b88(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:47|48|49|50|58) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0126 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10) {
        /*
            r9 = this;
            r0 = 1
            int r1 = r9.c
            int r1 = defpackage.tr1.b(r1, r10)
            if (r1 < 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.Object r1 = r9.b
            monitor-enter(r1)
            int r2 = r9.c     // Catch:{ all -> 0x008e }
            int r3 = defpackage.tr1.b(r2, r10)     // Catch:{ all -> 0x008e }
            if (r3 < 0) goto L_0x0017
            monitor-exit(r1)
            return
        L_0x0017:
            android.content.Context r3 = r9.a     // Catch:{ all -> 0x008e }
            java.lang.String r4 = defpackage.o54.r()     // Catch:{ all -> 0x008e }
            java.lang.String r5 = r3.getPackageName()     // Catch:{ all -> 0x008e }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x002a
            java.lang.String r4 = "tracer"
            goto L_0x0044
        L_0x002a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "tracer-"
            r5.<init>(r6)     // Catch:{ all -> 0x008e }
            r6 = 45
            r7 = 58
            java.lang.String r4 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r4, (char) r7, (char) r6, false, 4, (java.lang.Object) null)     // Catch:{ all -> 0x008e }
            java.lang.String r4 = android.net.Uri.encode(r4)     // Catch:{ all -> 0x008e }
            r5.append(r4)     // Catch:{ all -> 0x008e }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x008e }
        L_0x0044:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x008e }
            java.io.File r3 = r3.getCacheDir()     // Catch:{ all -> 0x008e }
            r5.<init>(r3, r4)     // Catch:{ all -> 0x008e }
            java.lang.String r3 = "logs"
            java.io.File r3 = kotlin.io.FilesKt.resolve((java.io.File) r5, (java.lang.String) r3)     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "a.log"
            java.io.File r4 = kotlin.io.FilesKt.resolve((java.io.File) r3, (java.lang.String) r4)     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "b.log"
            java.io.File r5 = kotlin.io.FilesKt.resolve((java.io.File) r3, (java.lang.String) r5)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "stash-a.log"
            java.io.File r6 = kotlin.io.FilesKt.resolve((java.io.File) r3, (java.lang.String) r6)     // Catch:{ all -> 0x008e }
            java.lang.String r7 = "stash-b.log"
            java.io.File r3 = kotlin.io.FilesKt.resolve((java.io.File) r3, (java.lang.String) r7)     // Catch:{ all -> 0x008e }
            int r2 = defpackage.tr1.y(r2)     // Catch:{ all -> 0x008e }
            r7 = 3
            r8 = 2
            if (r2 == 0) goto L_0x00c4
            if (r2 == r0) goto L_0x0099
            if (r2 != r8) goto L_0x0091
            int[] r0 = defpackage.a88.$EnumSwitchMapping$1     // Catch:{ all -> 0x008e }
            int r2 = defpackage.tr1.y(r10)     // Catch:{ all -> 0x008e }
            r0 = r0[r2]     // Catch:{ all -> 0x008e }
            if (r0 != r7) goto L_0x0086
            r0 = 0
            r9.d = r0     // Catch:{ all -> 0x008e }
            goto L_0x012e
        L_0x0086:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            java.lang.String r10 = "Unreachable code"
            r9.<init>(r10)     // Catch:{ all -> 0x008e }
            throw r9     // Catch:{ all -> 0x008e }
        L_0x008e:
            r9 = move-exception
            goto L_0x0134
        L_0x0091:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            java.lang.String r10 = "Unreachable code"
            r9.<init>(r10)     // Catch:{ all -> 0x008e }
            throw r9     // Catch:{ all -> 0x008e }
        L_0x0099:
            int r0 = defpackage.tr1.y(r10)     // Catch:{ all -> 0x008e }
            if (r0 == r8) goto L_0x00b2
            if (r0 != r7) goto L_0x00aa
            java.io.File[] r0 = new java.io.File[]{r6, r3}     // Catch:{ all -> 0x008e }
            defpackage.wc8.a(r0)     // Catch:{ all -> 0x008e }
            goto L_0x012e
        L_0x00aa:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            java.lang.String r10 = "Unreachable code"
            r9.<init>(r10)     // Catch:{ all -> 0x008e }
            throw r9     // Catch:{ all -> 0x008e }
        L_0x00b2:
            java.io.File[] r0 = new java.io.File[]{r6, r3}     // Catch:{ all -> 0x008e }
            kotlin.collections.ArrayDeque r0 = defpackage.wc8.b(r0)     // Catch:{ all -> 0x008e }
            r9.d = r0     // Catch:{ all -> 0x008e }
            java.io.File[] r0 = new java.io.File[]{r6, r3}     // Catch:{ all -> 0x008e }
            defpackage.wc8.a(r0)     // Catch:{ all -> 0x008e }
            goto L_0x012e
        L_0x00c4:
            int r2 = defpackage.tr1.y(r10)     // Catch:{ all -> 0x008e }
            if (r2 == r0) goto L_0x00f7
            if (r2 == r8) goto L_0x00e5
            if (r2 != r7) goto L_0x00dd
            java.io.File[] r0 = new java.io.File[]{r6, r3}     // Catch:{ all -> 0x008e }
            defpackage.wc8.a(r0)     // Catch:{ all -> 0x008e }
            java.io.File[] r0 = new java.io.File[]{r4, r5}     // Catch:{ all -> 0x008e }
            defpackage.wc8.a(r0)     // Catch:{ all -> 0x008e }
            goto L_0x012e
        L_0x00dd:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            java.lang.String r10 = "Unreachable code"
            r9.<init>(r10)     // Catch:{ all -> 0x008e }
            throw r9     // Catch:{ all -> 0x008e }
        L_0x00e5:
            java.io.File[] r0 = new java.io.File[]{r4, r5}     // Catch:{ all -> 0x008e }
            kotlin.collections.ArrayDeque r0 = defpackage.wc8.b(r0)     // Catch:{ all -> 0x008e }
            r9.d = r0     // Catch:{ all -> 0x008e }
            java.io.File[] r0 = new java.io.File[]{r4, r5}     // Catch:{ all -> 0x008e }
            defpackage.wc8.a(r0)     // Catch:{ all -> 0x008e }
            goto L_0x012e
        L_0x00f7:
            java.io.File[] r2 = new java.io.File[]{r6, r3}     // Catch:{ all -> 0x008e }
            defpackage.wc8.a(r2)     // Catch:{ all -> 0x008e }
            kotlin.Pair r2 = kotlin.TuplesKt.to(r4, r6)     // Catch:{ all -> 0x008e }
            kotlin.Pair r3 = kotlin.TuplesKt.to(r5, r3)     // Catch:{ all -> 0x008e }
            kotlin.Pair[] r2 = new kotlin.Pair[]{r2, r3}     // Catch:{ all -> 0x008e }
            r3 = 0
        L_0x010b:
            if (r3 >= r8) goto L_0x012e
            r4 = r2[r3]     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r4.component1()     // Catch:{ all -> 0x008e }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x008e }
            java.lang.Object r4 = r4.component2()     // Catch:{ all -> 0x008e }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x008e }
            boolean r6 = r5.exists()     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0122
            goto L_0x012c
        L_0x0122:
            r5.renameTo(r4)     // Catch:{ IOException -> 0x0126 }
            goto L_0x012c
        L_0x0126:
            r5.toString()     // Catch:{ all -> 0x008e }
            java.util.Objects.toString(r4)     // Catch:{ all -> 0x008e }
        L_0x012c:
            int r3 = r3 + r0
            goto L_0x010b
        L_0x012e:
            r9.c = r10     // Catch:{ all -> 0x008e }
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x008e }
            monitor-exit(r1)
            return
        L_0x0134:
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b88.a(int):void");
    }
}
