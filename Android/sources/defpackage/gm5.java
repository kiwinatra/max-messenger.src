package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gm5  reason: default package */
public final class gm5 extends SuspendLambda implements Function2 {
    public final /* synthetic */ File a;
    public final /* synthetic */ hm5 b;
    public final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gm5(File file, hm5 hm5, boolean z, Continuation continuation) {
        super(2, continuation);
        this.a = file;
        this.b = hm5;
        this.c = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gm5(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gm5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030 A[Catch:{ all -> 0x001d }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[Catch:{ all -> 0x001d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038 A[Catch:{ all -> 0x001d }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[Catch:{ all -> 0x001d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            hm5 r0 = r11.b
            java.io.File r1 = r11.a
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = r1.getName()     // Catch:{ all -> 0x001d }
            java.lang.String r12 = defpackage.o5a.r(r12)     // Catch:{ all -> 0x001d }
            if (r12 == 0) goto L_0x001f
            int r2 = r12.length()     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            r6 = r12
            goto L_0x0022
        L_0x001d:
            r11 = move-exception
            goto L_0x004e
        L_0x001f:
            java.lang.String r12 = "*/*"
            goto L_0x001b
        L_0x0022:
            boolean r10 = r11.c     // Catch:{ all -> 0x001d }
            android.content.Context r11 = r0.a     // Catch:{ all -> 0x001d }
            java.lang.String r12 = "download"
            java.lang.Object r11 = r11.getSystemService(r12)     // Catch:{ all -> 0x001d }
            boolean r12 = r11 instanceof android.app.DownloadManager     // Catch:{ all -> 0x001d }
            if (r12 == 0) goto L_0x0034
            android.app.DownloadManager r11 = (android.app.DownloadManager) r11     // Catch:{ all -> 0x001d }
        L_0x0032:
            r2 = r11
            goto L_0x0036
        L_0x0034:
            r11 = 0
            goto L_0x0032
        L_0x0036:
            if (r2 != 0) goto L_0x0039
            goto L_0x006d
        L_0x0039:
            java.lang.String r3 = r1.getName()     // Catch:{ all -> 0x001d }
            java.lang.String r4 = r1.getName()     // Catch:{ all -> 0x001d }
            java.lang.String r7 = r1.getAbsolutePath()     // Catch:{ all -> 0x001d }
            long r8 = r1.length()     // Catch:{ all -> 0x001d }
            r5 = 0
            r2.addCompletedDownload(r3, r4, r5, r6, r7, r8, r10)     // Catch:{ all -> 0x001d }
            goto L_0x006d
        L_0x004e:
            java.lang.String r12 = defpackage.hm5.g
            java.lang.String r1 = "fail!"
            defpackage.z68.f(r12, r1, r11)
            r0.getClass()
            kotlin.reflect.KProperty[] r12 = defpackage.hm5.f
            r1 = 1
            r12 = r12[r1]
            hs7 r12 = r0.b
            java.lang.Object r12 = r12.get()
            m95 r12 = (defpackage.m95) r12
            ru.ok.tamtam.util.HandledException r0 = new ru.ok.tamtam.util.HandledException
            r0.<init>(r11)
            ((defpackage.uta) r12).c(r0, false)
        L_0x006d:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
