package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bl7  reason: default package */
public final class bl7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ cl7 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl7(cl7 cl7, Continuation continuation) {
        super(2, continuation);
        this.a = cl7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bl7(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bl7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r7)
            cl7 r6 = r6.a
            xme r7 = r6.x
            java.lang.Object r7 = r7.getValue()
            mac r7 = (defpackage.mac) r7
            android.graphics.Bitmap r7 = r7.c
            r0 = 0
            if (r7 != 0) goto L_0x0016
            return r0
        L_0x0016:
            kotlin.Lazy r1 = r6.o
            java.lang.Object r2 = r1.getValue()
            po5 r2 = (defpackage.po5) r2
            java.io.File r2 = r2.m()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "qr_tmp.png"
            r3.<init>(r2, r4)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x004b }
            r5 = 100
            r7.compress(r4, r5, r2)     // Catch:{ all -> 0x004b }
            java.lang.Object r7 = r1.getValue()     // Catch:{ all -> 0x004b }
            po5 r7 = (defpackage.po5) r7     // Catch:{ all -> 0x004b }
            kotlin.Lazy r6 = r6.b     // Catch:{ all -> 0x004b }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x004b }
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ all -> 0x004b }
            android.net.Uri r6 = r7.f(r6, r3)     // Catch:{ all -> 0x004b }
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            return r6
        L_0x004b:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004d }
        L_0x004d:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
