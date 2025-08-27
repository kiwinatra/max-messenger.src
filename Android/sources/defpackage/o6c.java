package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: o6c  reason: default package */
public abstract class o6c {
    public static final z3d a = new Object();
    public static final Object b = new Object();
    public static v9a c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? m6c.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static v9a b() {
        v9a v9a = new v9a(17);
        c = v9a;
        a.i(v9a);
        return c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:38|39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00cc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            if (r19 != 0) goto L_0x0007
            v9a r0 = c
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r1 = b
            monitor-enter(r1)
            if (r19 != 0) goto L_0x0015
            v9a r0 = c     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0015
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x0012:
            r0 = move-exception
            goto L_0x00d6
        L_0x0015:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0012 }
            r2 = 30
            if (r0 != r2) goto L_0x0020
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x0020:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.lang.String r3 = "/data/misc/profiles/ref/"
            java.lang.String r4 = r18.getPackageName()     // Catch:{ all -> 0x0012 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0012 }
            java.lang.String r3 = "primary.prof"
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0012 }
            long r2 = r0.length()     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0012 }
            r4 = 0
            r5 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0046
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
            r0 = r7
            goto L_0x0047
        L_0x0046:
            r0 = r4
        L_0x0047:
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.lang.String r10 = "/data/misc/profiles/cur/0/"
            java.lang.String r11 = r18.getPackageName()     // Catch:{ all -> 0x0012 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0012 }
            java.lang.String r10 = "primary.prof"
            r8.<init>(r9, r10)     // Catch:{ all -> 0x0012 }
            long r16 = r8.length()     // Catch:{ all -> 0x0012 }
            boolean r8 = r8.exists()     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x0069
            int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0069
            r5 = r7
            goto L_0x006a
        L_0x0069:
            r5 = r4
        L_0x006a:
            long r14 = a(r18)     // Catch:{ NameNotFoundException -> 0x00d1 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.io.File r8 = r18.getFilesDir()     // Catch:{ all -> 0x0012 }
            java.lang.String r9 = "profileInstalled"
            r6.<init>(r8, r9)     // Catch:{ all -> 0x0012 }
            boolean r8 = r6.exists()     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x0089
            n6c r8 = defpackage.n6c.a(r6)     // Catch:{ IOException -> 0x0084 }
            goto L_0x008a
        L_0x0084:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x0089:
            r8 = 0
        L_0x008a:
            r9 = 2
            if (r8 == 0) goto L_0x009a
            long r10 = r8.c     // Catch:{ all -> 0x0012 }
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x009a
            int r10 = r8.b     // Catch:{ all -> 0x0012 }
            if (r10 != r9) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r4 = r10
            goto L_0x00a1
        L_0x009a:
            if (r0 == 0) goto L_0x009e
            r4 = r7
            goto L_0x00a1
        L_0x009e:
            if (r5 == 0) goto L_0x00a1
            r4 = r9
        L_0x00a1:
            if (r19 == 0) goto L_0x00a8
            if (r5 == 0) goto L_0x00a8
            if (r4 == r7) goto L_0x00a8
            r4 = r9
        L_0x00a8:
            if (r8 == 0) goto L_0x00b9
            int r0 = r8.b     // Catch:{ all -> 0x0012 }
            if (r0 != r9) goto L_0x00b9
            if (r4 != r7) goto L_0x00b9
            long r9 = r8.d     // Catch:{ all -> 0x0012 }
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b9
            r0 = 3
            r13 = r0
            goto L_0x00ba
        L_0x00b9:
            r13 = r4
        L_0x00ba:
            n6c r0 = new n6c     // Catch:{ all -> 0x0012 }
            r12 = 1
            r11 = r0
            r11.<init>(r12, r13, r14, r16)     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x00c9
            boolean r2 = r8.equals(r0)     // Catch:{ all -> 0x0012 }
            if (r2 != 0) goto L_0x00cc
        L_0x00c9:
            r0.b(r6)     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x00d1:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x00d6:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o6c.c(android.content.Context, boolean):void");
    }
}
