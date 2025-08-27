package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: uk7  reason: default package */
public final class uk7 extends SuspendLambda implements Function2 {
    public String a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;
    public final /* synthetic */ xk7 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uk7(xk7 xk7, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.o = str2;
        this.v = xk7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new uk7(this.v, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uk7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.b
            r2 = 3
            r3 = 2
            r4 = 1
            xk7 r5 = r9.v
            if (r1 == 0) goto L_0x002a
            if (r1 == r4) goto L_0x0024
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0095
        L_0x0018:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x007a
        L_0x0024:
            java.lang.String r1 = r9.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x005b
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = r9.c
            r10.append(r1)
            java.lang.String r1 = " "
            r10.append(r1)
            java.lang.String r1 = r9.o
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            kotlin.text.Regex r6 = r5.w0
            java.lang.String r7 = ""
            java.lang.String r10 = r6.replace((java.lang.CharSequence) r10, (java.lang.String) r7)
            r9.a = r10
            r9.b = r4
            java.lang.Object r1 = defpackage.xk7.j(r5, r10, r1, r9)
            if (r1 != r0) goto L_0x0058
            return r0
        L_0x0058:
            r8 = r1
            r1 = r10
            r10 = r8
        L_0x005b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0066
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x0066:
            kotlin.Lazy r10 = r5.c
            java.lang.Object r10 = r10.getValue()
            oq6 r10 = (defpackage.oq6) r10
            r4 = 0
            r9.a = r4
            r9.b = r3
            java.lang.Object r10 = r10.a(r1, r9)
            if (r10 != r0) goto L_0x007a
            return r0
        L_0x007a:
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x00b5
            long r3 = r10.longValue()
            kotlin.Lazy r10 = r5.o
            java.lang.Object r10 = r10.getValue()
            qx2 r10 = (defpackage.qx2) r10
            r9.b = r2
            my2 r10 = (defpackage.my2) r10
            java.lang.Object r10 = r10.u(r3, r9)
            if (r10 != r0) goto L_0x0095
            return r0
        L_0x0095:
            a32 r10 = (defpackage.a32) r10
            if (r10 == 0) goto L_0x00b2
            s85 r9 = r5.x
            ek7 r0 = defpackage.ek7.b
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ":chats?id="
            r0.<init>(r1)
            long r1 = r10.a
            java.lang.String r10 = "&type=local"
            java.lang.String r10 = defpackage.wj6.m(r0, r1, r10)
            defpackage.a81.r(r10, r9)
        L_0x00b2:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x00b5:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
