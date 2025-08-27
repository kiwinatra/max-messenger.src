package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: ds  reason: default package */
public final class ds extends Lambda implements Function0 {
    public static final ds b = new ds(0, 0);
    public static final ds c = new ds(0, 1);
    public static final ds o = new ds(0, 2);
    public static final ds v = new ds(0, 3);
    public static final ds w = new ds(0, 4);
    public static final ds x = new ds(0, 5);
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ds(int i, int i2) {
        super(i);
        this.a = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: l04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: l04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: l04} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            r0 = 0
            r1 = 9
            r2 = 0
            int r5 = r5.a
            switch(r5) {
                case 0: goto L_0x0110;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00a9;
                case 3: goto L_0x005e;
                case 4: goto L_0x0036;
                default: goto L_0x0009;
            }
        L_0x0009:
            kof r5 = defpackage.kof.a
            java.util.Map r5 = defpackage.kof.c()
            frg r3 = defpackage.iq.c
            java.lang.Object r5 = r5.get(r3)
            boolean r3 = r5 instanceof defpackage.l04
            if (r3 == 0) goto L_0x001c
            r2 = r5
            l04 r2 = (defpackage.l04) r2
        L_0x001c:
            if (r2 != 0) goto L_0x0026
            xe8 r5 = new xe8
            r5.<init>((int) r1)
            r5.f()
        L_0x0026:
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>(r0)
            td3 r0 = new td3
            r1 = 4
            r0.<init>(r1, r5)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            return r5
        L_0x0036:
            kof r5 = defpackage.kof.a
            java.util.Map r5 = defpackage.kof.c()
            frg r0 = defpackage.iq.c
            java.lang.Object r5 = r5.get(r0)
            boolean r0 = r5 instanceof defpackage.l04
            if (r0 == 0) goto L_0x0049
            r2 = r5
            l04 r2 = (defpackage.l04) r2
        L_0x0049:
            if (r2 != 0) goto L_0x0053
            xe8 r5 = new xe8
            r5.<init>((int) r1)
            r5.f()
        L_0x0053:
            qg r5 = new qg
            r0 = 1
            r5.<init>(r0)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor(r5)
            return r5
        L_0x005e:
            android.content.Context r5 = defpackage.kof.d
            if (r5 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r5 = r2
        L_0x0064:
            kof r0 = defpackage.kof.a
            java.util.Map r0 = defpackage.kof.c()
            frg r3 = defpackage.iq.c
            java.lang.Object r0 = r0.get(r3)
            boolean r3 = r0 instanceof defpackage.l04
            if (r3 == 0) goto L_0x0077
            r2 = r0
            l04 r2 = (defpackage.l04) r2
        L_0x0077:
            if (r2 != 0) goto L_0x0083
            xe8 r0 = new xe8
            r0.<init>((int) r1)
            l04 r2 = new l04
            r2.<init>(r0)
        L_0x0083:
            n57 r0 = new n57
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r3 = "TracerSDK/1.0.8 App/"
            java.lang.String r4 = " "
            java.lang.StringBuilder r1 = defpackage.tr1.p(r3, r1, r4)
            java.lang.String r3 = "http.agent"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            if (r3 == 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            java.lang.String r3 = "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)"
        L_0x009c:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            int r2 = r2.b
            r0.<init>(r2, r5, r1)
            return r0
        L_0x00a9:
            gx4 r5 = new gx4
            android.content.Context r0 = defpackage.kof.d
            if (r0 == 0) goto L_0x00b0
            r2 = r0
        L_0x00b0:
            java.lang.String r0 = defpackage.o54.r()
            java.lang.String r1 = r2.getPackageName()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x00c1
            java.lang.String r0 = "tracer"
            goto L_0x00db
        L_0x00c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "tracer-"
            r1.<init>(r3)
            r3 = 58
            r4 = 45
            java.lang.String r0 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r0, (char) r3, (char) r4, false, 4, (java.lang.Object) null)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00db:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r2.getCacheDir()
            r1.<init>(r2, r0)
            java.lang.String r0 = "drops.json"
            java.io.File r0 = kotlin.io.FilesKt.resolve((java.io.File) r1, (java.lang.String) r0)
            r5.<init>(r0)
            return r5
        L_0x00ee:
            kof r5 = defpackage.kof.a
            java.util.Map r5 = defpackage.kof.c()
            frg r1 = defpackage.ev0.g
            java.lang.Object r5 = r5.get(r1)
            boolean r1 = r5 instanceof defpackage.vp4
            if (r1 == 0) goto L_0x0101
            r2 = r5
            vp4 r2 = (defpackage.vp4) r2
        L_0x0101:
            if (r2 != 0) goto L_0x010f
            y35 r5 = new y35
            r1 = 18
            r5.<init>((int) r1, (boolean) r0)
            vp4 r2 = new vp4
            r2.<init>(r5)
        L_0x010f:
            return r2
        L_0x0110:
            android.app.Application r5 = ru.ok.android.commons.app.ApplicationProvider.a
            android.app.Application r5 = defpackage.kv0.w()
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x012f }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x012f }
            r3 = 30
            if (r1 < r3) goto L_0x0131
            android.content.pm.InstallSourceInfo r5 = r0.getInstallSourceInfo(r5)     // Catch:{ all -> 0x012f }
            java.lang.String r5 = r5.getInstallingPackageName()     // Catch:{ all -> 0x012f }
            goto L_0x0135
        L_0x012f:
            r5 = move-exception
            goto L_0x013a
        L_0x0131:
            java.lang.String r5 = r0.getInstallerPackageName(r5)     // Catch:{ all -> 0x012f }
        L_0x0135:
            java.lang.Object r5 = kotlin.Result.m23constructorimpl(r5)     // Catch:{ all -> 0x012f }
            goto L_0x0144
        L_0x013a:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m23constructorimpl(r5)
        L_0x0144:
            boolean r0 = kotlin.Result.m29isFailureimpl(r5)
            if (r0 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r2 = r5
        L_0x014c:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds.invoke():java.lang.Object");
    }
}
