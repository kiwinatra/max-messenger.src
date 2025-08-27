package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ga2  reason: default package */
public final class ga2 extends SuspendLambda implements Function2 {
    public ia2 a;
    public int b;
    public final /* synthetic */ ia2 c;
    public final /* synthetic */ String o;
    public final /* synthetic */ String v;
    public final /* synthetic */ CharSequence w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ga2(ia2 ia2, String str, String str2, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.c = ia2;
        this.o = str;
        this.v = str2;
        this.w = charSequence;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ga2(this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ga2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.b
            r2 = 1
            r3 = 0
            ia2 r4 = r10.c
            r5 = 3
            r6 = 2
            if (r1 == 0) goto L_0x002a
            if (r1 == r2) goto L_0x0026
            if (r1 == r6) goto L_0x0020
            if (r1 != r5) goto L_0x0018
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0072
        L_0x0018:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0020:
            ia2 r4 = r10.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0065
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0054
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = defpackage.ia2.K0
            c6d r11 = r4.g()
            java.lang.CharSequence r1 = r10.w
            if (r1 == 0) goto L_0x003c
            java.lang.String r1 = r1.toString()
            goto L_0x003d
        L_0x003c:
            r1 = r3
        L_0x003d:
            r10.b = r2
            r11.getClass()
            z5d r7 = new z5d
            java.lang.String r8 = r10.v
            java.lang.String r9 = r10.o
            r7.<init>(r11, r8, r1, r9)
            i6d r11 = r11.a
            java.lang.Object r11 = defpackage.i8b.r(r11, r7, r10)
            if (r11 != r0) goto L_0x0054
            return r0
        L_0x0054:
            java.lang.String r11 = defpackage.ia2.K0
            c6d r11 = r4.g()
            r10.a = r4
            r10.b = r6
            java.lang.Object r11 = r11.e(r10)
            if (r11 != r0) goto L_0x0065
            return r0
        L_0x0065:
            java.util.List r11 = (java.util.List) r11
            r10.a = r3
            r10.b = r5
            java.lang.Object r10 = defpackage.ia2.n(r4, r11, r2, r10)
            if (r10 != r0) goto L_0x0072
            return r0
        L_0x0072:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
