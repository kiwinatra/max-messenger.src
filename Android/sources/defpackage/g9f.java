package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g9f  reason: default package */
public final class g9f extends SuspendLambda implements Function2 {
    public final /* synthetic */ zc4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ tqd c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g9f(zc4 zc4, String str, tqd tqd, Continuation continuation) {
        super(2, continuation);
        this.a = zc4;
        this.b = str;
        this.c = tqd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g9f(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g9f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        kotlin.io.CloseableKt.closeFinally(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r5)
            zc4 r5 = r4.a
            java.lang.Object r0 = r5.a
            po5 r0 = (defpackage.po5) r0
            java.lang.String r1 = r4.b
            java.io.File r0 = r0.r(r1)
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r2 = "zc4"
            java.lang.String r3 = "applyEditActions: started"
            defpackage.z68.c(r2, r3, new java.lang.Object[0])
            java.lang.Object r3 = r5.c
            android.content.Context r3 = (android.content.Context) r3
            android.content.ContentResolver r3 = r3.getContentResolver()
            tqd r4 = r4.c
            android.net.Uri r4 = r4.c
            java.io.InputStream r4 = r3.openInputStream(r4)
            defpackage.j4b.R(r4, r0)     // Catch:{ all -> 0x0048 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0048 }
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r4, r0)
            java.lang.Object r4 = r5.b
            bud r4 = (defpackage.bud) r4
            defpackage.o5a.W(r4, r1)
            defpackage.o5a.X(r4, r1, r1)
            java.lang.String r4 = "applyEditActions: finished"
            defpackage.z68.c(r2, r4, new java.lang.Object[0])
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x0048:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g9f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
