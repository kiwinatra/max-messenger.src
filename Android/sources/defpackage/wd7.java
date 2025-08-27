package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wd7  reason: default package */
public final class wd7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ vk6 a;
    public final /* synthetic */ yd7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wd7(vk6 vk6, yd7 yd7, Continuation continuation) {
        super(2, continuation);
        this.a = vk6;
        this.b = yd7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wd7(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wd7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r12)
            sk6 r12 = defpackage.sk6.a
            vk6 r0 = r11.a
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x0016
            r11 = -1
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
            return r11
        L_0x0016:
            java.util.List r12 = r0.d()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            r1 = 0
            r2 = r1
        L_0x0022:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0060
            java.lang.Object r3 = r12.next()
            pk6 r3 = (defpackage.pk6) r3
            yd7 r4 = r11.b
            android.content.ContentResolver r5 = r4.o
            android.net.Uri r6 = r3.i()
            java.lang.String r4 = r3.f()
            java.lang.String[] r7 = new java.lang.String[]{r4}
            java.lang.String r8 = r0.e(r3)
            java.lang.String[] r9 = r0.a(r3)
            r10 = 0
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)
            if (r3 == 0) goto L_0x005d
            int r4 = r3.getCount()     // Catch:{ all -> 0x0056 }
            r5 = 0
            kotlin.io.CloseableKt.closeFinally(r3, r5)
            goto L_0x005e
        L_0x0056:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r12 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r11)
            throw r12
        L_0x005d:
            r4 = r1
        L_0x005e:
            int r2 = r2 + r4
            goto L_0x0022
        L_0x0060:
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
