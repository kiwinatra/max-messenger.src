package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c92  reason: default package */
public final class c92 extends SuspendLambda implements Function2 {
    public ia2 a;
    public int b;
    public final /* synthetic */ ia2 c;
    public final /* synthetic */ String o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c92(ia2 ia2, String str, Continuation continuation) {
        super(2, continuation);
        this.c = ia2;
        this.o = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c92(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.b
            r2 = 1
            java.lang.String r3 = r11.o
            r4 = 3
            r5 = 2
            ia2 r6 = r11.c
            r7 = 4
            if (r1 == 0) goto L_0x0034
            if (r1 == r2) goto L_0x0030
            if (r1 == r5) goto L_0x002c
            if (r1 == r4) goto L_0x0025
            if (r1 != r7) goto L_0x001d
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00b7
        L_0x001d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0025:
            ia2 r6 = r11.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00a9
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0098
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0065
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = defpackage.ia2.K0
            c6d r12 = r6.g()
            r11.b = r2
            r12.getClass()
            java.lang.String r1 = "SELECT options FROM chat_folder WHERE id=? "
            d7d r1 = defpackage.d7d.a(r2, r1)
            if (r3 != 0) goto L_0x004e
            r1.X(r2)
            goto L_0x0051
        L_0x004e:
            r1.h(r2, r3)
        L_0x0051:
            android.os.CancellationSignal r8 = new android.os.CancellationSignal
            r8.<init>()
            b6d r9 = new b6d
            r10 = 5
            r9.<init>(r12, r1, r10)
            i6d r12 = r12.a
            java.lang.Object r12 = defpackage.i8b.q(r12, r8, r9, r11)
            if (r12 != r0) goto L_0x0065
            return r0
        L_0x0065:
            byte[] r12 = (byte[]) r12
            java.util.Set r12 = defpackage.tf6.M(r12)
            a26 r1 = defpackage.a26.NO_DELETE
            boolean r12 = r12.contains(r1)
            if (r12 == 0) goto L_0x007d
            java.lang.String r11 = defpackage.ia2.K0
            java.lang.String r12 = "try to delete not deleted folder!"
            defpackage.z68.p(r11, r12)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x007d:
            java.lang.String r12 = defpackage.ia2.K0
            c6d r12 = r6.g()
            r11.b = r5
            r12.getClass()
            wk r1 = new wk
            r5 = 29
            r1.<init>(r5, r12, r3)
            i6d r12 = r12.a
            java.lang.Object r12 = defpackage.n6d.a(r12, r1, r11)
            if (r12 != r0) goto L_0x0098
            return r0
        L_0x0098:
            java.lang.String r12 = defpackage.ia2.K0
            c6d r12 = r6.g()
            r11.a = r6
            r11.b = r4
            java.lang.Object r12 = r12.e(r11)
            if (r12 != r0) goto L_0x00a9
            return r0
        L_0x00a9:
            java.util.List r12 = (java.util.List) r12
            r1 = 0
            r11.a = r1
            r11.b = r7
            java.lang.Object r11 = defpackage.ia2.n(r6, r12, r2, r11)
            if (r11 != r0) goto L_0x00b7
            return r0
        L_0x00b7:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
