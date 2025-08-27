package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: iyf  reason: default package */
public final class iyf implements ds5 {
    public final /* synthetic */ UploadFileAttachWorker a;
    public final /* synthetic */ Ref.LongRef b;

    public iyf(UploadFileAttachWorker uploadFileAttachWorker, Ref.LongRef longRef) {
        this.a = uploadFileAttachWorker;
        this.b = longRef;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Continuation continuation) {
        tf9 tf9 = (tf9) obj;
        return e(continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.hyf
            if (r0 == 0) goto L_0x0013
            r0 = r13
            hyf r0 = (defpackage.hyf) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            hyf r0 = new hyf
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r6) goto L_0x0042
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00f6
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            java.lang.Object r12 = r0.a
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r12 = (ru.ok.tamtam.upload.workers.UploadFileAttachWorker) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00e9
        L_0x0042:
            kotlin.jvm.internal.Ref$LongRef r12 = r0.b
            java.lang.Object r2 = r0.a
            iyf r2 = (defpackage.iyf) r2
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00ad
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r13)
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r13 = r12.a
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x0056
            goto L_0x0073
        L_0x0056:
            boolean r7 = r2.c()
            if (r7 == 0) goto L_0x0073
            w78 r7 = defpackage.w78.o
            float r13 = r13.z0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "File upload: progress="
            r8.<init>(r9)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            java.lang.String r8 = "UploadFileAttachWorker"
            r2.d(r7, r8, r13, r3)
        L_0x0073:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r13 = r12.a
            float r2 = r13.z0
            boolean r13 = r13.needToShowNotification(r2)
            if (r13 == 0) goto L_0x00f9
            kotlin.jvm.internal.Ref$LongRef r13 = r12.b
            long r7 = r13.element
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00b6
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r2 = r12.a
            r0.a = r12
            r0.b = r13
            r0.v = r6
            kotlin.Lazy r6 = r2.v0
            java.lang.Object r6 = r6.getValue()
            gaf r6 = (defpackage.gaf) r6
            osa r6 = (defpackage.osa) r6
            q04 r6 = r6.b()
            dyf r7 = new dyf
            r7.<init>(r2, r3)
            java.lang.Object r2 = defpackage.ev0.I(r6, r7, r0)
            if (r2 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            r11 = r2
            r2 = r12
            r12 = r13
            r13 = r11
        L_0x00ad:
            java.lang.Number r13 = (java.lang.Number) r13
            long r6 = r13.longValue()
            r12.element = r6
            r12 = r2
        L_0x00b6:
            kotlin.jvm.internal.Ref$LongRef r13 = r12.b
            long r6 = r13.element
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r13 = r12.a
            kotlin.Lazy r13 = r13.Z
            java.lang.Object r13 = r13.getValue()
            jtb r13 = (defpackage.jtb) r13
            ltb r13 = (defpackage.ltb) r13
            cud r13 = r13.b
            r13.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f64maxdownloadedsizefornotifykb
            r8 = 1024(0x400, float:1.435E-42)
            long r8 = (long) r8
            long r8 = r13.r(r2, r8)
            int r13 = (int) r8
            long r8 = (long) r13
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x00f9
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r12 = r12.a
            r0.a = r12
            r0.b = r3
            r0.v = r5
            java.lang.Object r13 = r12.getForegroundInfo(r0)
            if (r13 != r1) goto L_0x00e9
            return r1
        L_0x00e9:
            o96 r13 = (defpackage.o96) r13
            r0.a = r3
            r0.v = r4
            java.lang.Object r12 = r12.setForeground(r13, r0)
            if (r12 != r1) goto L_0x00f6
            return r1
        L_0x00f6:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x00f9:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyf.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
