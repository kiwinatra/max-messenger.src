package defpackage;

import android.content.Context;

/* renamed from: g58  reason: default package */
public final class g58 implements o5g {
    public final String a;
    public final Context b;
    public final String c = g58.class.getName();

    public g58(Context context, String str) {
        this.a = str;
        this.b = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        kotlin.jdk7.AutoCloseableKt.closeFinally(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:12:0x0038, B:19:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            java.lang.String r12 = r11.c
            a67 r0 = defpackage.z68.b
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x001b
        L_0x0008:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x001b
            w78 r2 = defpackage.w78.o
            java.lang.String r3 = r11.a
            java.lang.String r4 = "Fetch video. Local fetcher, path "
            java.lang.String r3 = defpackage.a81.m(r4, r3)
            r0.d(r2, r12, r3, r1)
        L_0x001b:
            r2 = 0
            android.media.MediaMetadataRetriever r12 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x004b }
            r12.<init>()     // Catch:{ all -> 0x004b }
            android.content.Context r0 = r11.b     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = r11.a     // Catch:{ all -> 0x0041 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x0041 }
            r12.setDataSource(r0, r4)     // Catch:{ all -> 0x0041 }
            android.graphics.Point r0 = defpackage.o5a.D(r12)     // Catch:{ all -> 0x0041 }
            int r2 = defpackage.o5a.A(r12)     // Catch:{ all -> 0x003f }
            long r2 = (long) r2     // Catch:{ all -> 0x003f }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003f }
            kotlin.jdk7.AutoCloseableKt.closeFinally(r12, r1)     // Catch:{ all -> 0x003c }
            goto L_0x0062
        L_0x003c:
            r12 = move-exception
            r1 = r0
            goto L_0x004c
        L_0x003f:
            r1 = move-exception
            goto L_0x0045
        L_0x0041:
            r0 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
        L_0x0045:
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r4 = move-exception
            kotlin.jdk7.AutoCloseableKt.closeFinally(r12, r1)     // Catch:{ all -> 0x003c }
            throw r4     // Catch:{ all -> 0x003c }
        L_0x004b:
            r12 = move-exception
        L_0x004c:
            java.lang.String r0 = r11.c
            java.lang.String r4 = r11.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Can't get video params for path "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            defpackage.z68.f(r0, r4, r12)
            r0 = r1
        L_0x0062:
            ik5 r12 = new ik5
            p5g r5 = defpackage.p5g.MP4
            java.lang.String r6 = r11.a
            r11 = 0
            if (r0 == 0) goto L_0x006f
            int r1 = r0.x
            r7 = r1
            goto L_0x0070
        L_0x006f:
            r7 = r11
        L_0x0070:
            if (r0 == 0) goto L_0x0074
            int r11 = r0.y
        L_0x0074:
            r8 = r11
            int r9 = (int) r2
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            kk5 r11 = new kk5
            java.util.List r12 = kotlin.collections.CollectionsKt.listOf(r12)
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g58.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
