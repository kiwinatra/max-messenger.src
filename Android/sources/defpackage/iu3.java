package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: iu3  reason: default package */
public final class iu3 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ String v;
    public final /* synthetic */ ju3 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iu3(ju3 ju3, String str, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.w = ju3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        iu3 iu3 = new iu3(this.w, this.v, continuation);
        iu3.o = obj;
        return iu3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iu3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.c
            r2 = 0
            r3 = 3
            r4 = 5
            r5 = 4
            r6 = 2
            r7 = 1
            ju3 r8 = r13.w
            if (r1 == 0) goto L_0x0070
            if (r1 == r7) goto L_0x0060
            if (r1 == r6) goto L_0x0050
            if (r1 == r3) goto L_0x003f
            if (r1 == r5) goto L_0x002f
            if (r1 != r4) goto L_0x0027
            java.lang.Object r0 = r13.a
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r13 = r13.o
            d14 r13 = (defpackage.d14) r13
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0104
        L_0x0027:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x002f:
            java.lang.Object r1 = r13.a
            mk4 r1 = (defpackage.mk4) r1
            java.lang.Object r3 = r13.o
            d14 r3 = (defpackage.d14) r3
            kotlin.ResultKt.throwOnFailure(r14)
            r10 = r1
            r1 = r14
            r14 = r3
            goto L_0x00f1
        L_0x003f:
            java.lang.Object r0 = r13.b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r13.a
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r13 = r13.o
            d14 r13 = (defpackage.d14) r13
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00dc
        L_0x0050:
            java.lang.Object r1 = r13.b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r13.a
            mk4 r4 = (defpackage.mk4) r4
            java.lang.Object r5 = r13.o
            d14 r5 = (defpackage.d14) r5
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00c8
        L_0x0060:
            java.lang.Object r1 = r13.b
            mk4 r1 = (defpackage.mk4) r1
            java.lang.Object r4 = r13.a
            mk4 r4 = (defpackage.mk4) r4
            java.lang.Object r5 = r13.o
            d14 r5 = (defpackage.d14) r5
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00b4
        L_0x0070:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.o
            d14 r14 = (defpackage.d14) r14
            java.lang.String r1 = r13.v
            if (r1 == 0) goto L_0x0119
            int r9 = r1.length()
            if (r9 != 0) goto L_0x0083
            goto L_0x0119
        L_0x0083:
            gu3 r9 = new gu3
            r9.<init>(r8, r1, r2)
            nk4 r9 = defpackage.ev0.d(r14, r2, r9, r3)
            hu3 r10 = new hu3
            r10.<init>(r8, r1, r2)
            nk4 r10 = defpackage.ev0.d(r14, r2, r10, r3)
            he r11 = r8.c
            if (r11 == 0) goto L_0x00e4
            fu3 r4 = new fu3
            r4.<init>(r8, r1, r2)
            nk4 r1 = defpackage.ev0.d(r14, r2, r4, r3)
            r13.o = r14
            r13.a = r10
            r13.b = r1
            r13.c = r7
            java.lang.Object r4 = r9.a(r13)
            if (r4 != r0) goto L_0x00b1
            return r0
        L_0x00b1:
            r5 = r14
            r14 = r4
            r4 = r10
        L_0x00b4:
            java.util.List r14 = (java.util.List) r14
            r13.o = r5
            r13.a = r4
            r13.b = r14
            r13.c = r6
            java.lang.Object r1 = r1.a(r13)
            if (r1 != r0) goto L_0x00c5
            return r0
        L_0x00c5:
            r12 = r1
            r1 = r14
            r14 = r12
        L_0x00c8:
            java.util.List r14 = (java.util.List) r14
            r13.o = r5
            r13.a = r1
            r13.b = r14
            r13.c = r3
            java.lang.Object r13 = r4.a(r13)
            if (r13 != r0) goto L_0x00d9
            return r0
        L_0x00d9:
            r0 = r14
            r14 = r13
            r13 = r5
        L_0x00dc:
            java.util.List r14 = (java.util.List) r14
            po3 r3 = new po3
            r3.<init>(r1, r0, r14)
            goto L_0x010b
        L_0x00e4:
            r13.o = r14
            r13.a = r10
            r13.c = r5
            java.lang.Object r1 = r9.a(r13)
            if (r1 != r0) goto L_0x00f1
            return r0
        L_0x00f1:
            java.util.List r1 = (java.util.List) r1
            r13.o = r14
            r13.a = r1
            r13.c = r4
            java.lang.Object r13 = r10.a(r13)
            if (r13 != r0) goto L_0x0100
            return r0
        L_0x0100:
            r0 = r1
            r12 = r14
            r14 = r13
            r13 = r12
        L_0x0104:
            java.util.List r14 = (java.util.List) r14
            po3 r3 = new po3
            r3.<init>(r0, r2, r14)
        L_0x010b:
            defpackage.e14.e(r13)
            xme r13 = r8.h
            r13.getClass()
            r13.m(r2, r3)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L_0x0119:
            xme r13 = r8.h
            ome r14 = r8.b
            java.lang.Object r14 = r14.getValue()
            r13.setValue(r14)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
