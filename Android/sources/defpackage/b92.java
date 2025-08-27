package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: b92  reason: default package */
public final class b92 extends SuspendLambda implements Function2 {
    public String a;
    public ia2 b;
    public int c;
    public final /* synthetic */ ia2 o;
    public final /* synthetic */ String v;
    public final /* synthetic */ CharSequence w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b92(ia2 ia2, String str, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.o = ia2;
        this.v = str;
        this.w = charSequence;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new b92(this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.c
            r2 = 1
            ia2 r3 = r10.o
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x0030
            if (r1 == r2) goto L_0x002c
            if (r1 == r5) goto L_0x0021
            if (r1 != r4) goto L_0x0019
            java.lang.String r10 = r10.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0078
        L_0x0019:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0021:
            ia2 r3 = r10.b
            java.lang.String r1 = r10.a
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r1
            r1 = r11
            r11 = r9
            goto L_0x0067
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0052
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = defpackage.ia2.K0
            c6d r11 = r3.g()
            r10.c = r2
            r11.getClass()
            ep1 r1 = new ep1
            java.lang.String r6 = r10.v
            java.lang.CharSequence r7 = r10.w
            r8 = 11
            r1.<init>(r11, r6, r7, r8)
            i6d r11 = r11.a
            java.lang.Object r11 = defpackage.n6d.a(r11, r1, r10)
            if (r11 != r0) goto L_0x0052
            return r0
        L_0x0052:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = defpackage.ia2.K0
            c6d r1 = r3.g()
            r10.a = r11
            r10.b = r3
            r10.c = r5
            java.lang.Object r1 = r1.e(r10)
            if (r1 != r0) goto L_0x0067
            return r0
        L_0x0067:
            java.util.List r1 = (java.util.List) r1
            r10.a = r11
            r5 = 0
            r10.b = r5
            r10.c = r4
            java.lang.Object r10 = defpackage.ia2.n(r3, r1, r2, r10)
            if (r10 != r0) goto L_0x0077
            return r0
        L_0x0077:
            r10 = r11
        L_0x0078:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
