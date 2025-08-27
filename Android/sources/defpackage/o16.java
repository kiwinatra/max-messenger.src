package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: o16  reason: default package */
public final class o16 extends SuspendLambda implements Function2 {
    public Set a;
    public int b;
    public final /* synthetic */ p16 c;
    public final /* synthetic */ String o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o16(p16 p16, String str, Continuation continuation) {
        super(2, continuation);
        this.c = p16;
        this.o = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o16(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o16) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.b
            r2 = 3
            r3 = 2
            p16 r4 = r11.c
            r8 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r8) goto L_0x0026
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0086
        L_0x0018:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0020:
            java.util.Set r1 = r11.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0073
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0038
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r12)
            zc4 r12 = r4.a
            r11.b = r8
            java.lang.Object r12 = r12.c(r11)
            if (r12 != r0) goto L_0x0038
            return r0
        L_0x0038:
            r1 = r12
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r9 = r11.o
            boolean r12 = kotlin.text.StringsKt.isBlank(r9)
            r12 = r12 ^ r8
            if (r12 == 0) goto L_0x0073
            kotlin.Lazy r12 = r4.b
            java.lang.Object r12 = r12.getValue()
            u82 r12 = (defpackage.u82) r12
            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r1)
            r11.a = r1
            r11.b = r3
            ia2 r12 = (defpackage.ia2) r12
            r12.getClass()
            z82 r3 = new z82
            r10 = 0
            r5 = r3
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            kotlin.coroutines.CoroutineContext r12 = r12.x
            java.lang.Object r12 = defpackage.ev0.I(r12, r3, r11)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r12 != r3) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
        L_0x0070:
            if (r12 != r0) goto L_0x0073
            return r0
        L_0x0073:
            n6e r12 = r4.d
            n16 r3 = new n16
            r3.<init>(r1)
            r1 = 0
            r11.a = r1
            r11.b = r2
            java.lang.Object r11 = r12.a(r3, r11)
            if (r11 != r0) goto L_0x0086
            return r0
        L_0x0086:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o16.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
