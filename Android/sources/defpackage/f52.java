package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: f52  reason: default package */
public final class f52 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h52 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f52(h52 h52, Continuation continuation) {
        super(2, continuation);
        this.c = h52;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        f52 f52 = new f52(this.c, continuation);
        f52.b = obj;
        return f52;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f52) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.a
            r3 = 2
            r4 = 1
            r5 = 0
            h52 r6 = r0.c
            if (r2 == 0) goto L_0x002b
            if (r2 == r4) goto L_0x0024
            if (r2 != r3) goto L_0x001c
            java.lang.Object r0 = r0.b
            tz9 r0 = (defpackage.tz9) r0
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x0134
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r18)
            r2 = r18
            goto L_0x0092
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r0.b
            java.lang.String r2 = (java.lang.String) r2
            xme r7 = r6.h
            java.lang.Object r7 = r7.getValue()
            g02 r7 = (defpackage.g02) r7
            if (r7 == 0) goto L_0x003f
            java.lang.String r7 = r7.c
            goto L_0x0040
        L_0x003f:
            r7 = r5
        L_0x0040:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            r13 = r7 ^ 1
            xme r14 = r6.i
            if (r2 == 0) goto L_0x0172
            int r7 = r2.length()
            if (r7 != 0) goto L_0x0052
            goto L_0x0172
        L_0x0052:
            java.lang.Object r7 = r14.getValue()
            g02 r7 = (defpackage.g02) r7
            if (r7 == 0) goto L_0x006f
            if (r13 == 0) goto L_0x0064
            int r8 = defpackage.ixa.w
            igf r9 = new igf
            r9.<init>(r8)
            goto L_0x0065
        L_0x0064:
            r9 = r5
        L_0x0065:
            r10 = 0
            r11 = 0
            r12 = 35
            r8 = r2
            g02 r7 = defpackage.g02.a(r7, r8, r9, r10, r11, r12)
            goto L_0x0070
        L_0x006f:
            r7 = r5
        L_0x0070:
            r14.setValue(r7)
            if (r13 != 0) goto L_0x0078
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0078:
            kotlin.reflect.KProperty[] r7 = defpackage.h52.y
            gaf r7 = r6.p()
            osa r7 = (defpackage.osa) r7
            q04 r7 = r7.b()
            e52 r8 = new e52
            r8.<init>(r6, r2, r5)
            r0.a = r4
            java.lang.Object r2 = defpackage.ev0.I(r7, r8, r0)
            if (r2 != r1) goto L_0x0092
            return r1
        L_0x0092:
            qaf r2 = (defpackage.qaf) r2
            if (r2 == 0) goto L_0x014d
            xme r4 = r6.i
            uz1 r7 = defpackage.uz1.a
            tz1 r8 = defpackage.tz1.a
            java.lang.String r9 = r2.b
            java.lang.String r2 = r2.o
            if (r2 == 0) goto L_0x00b4
            int r10 = r2.length()
            if (r10 != 0) goto L_0x00a9
            goto L_0x00b4
        L_0x00a9:
            sz1 r10 = new sz1
            mgf r11 = new mgf
            r11.<init>(r2)
            r10.<init>(r11)
            goto L_0x00dd
        L_0x00b4:
            java.lang.String r2 = "service.unavailable"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r2)
            if (r2 != 0) goto L_0x00dc
            java.lang.String r2 = "service.timeout"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00c5
            goto L_0x00dc
        L_0x00c5:
            java.lang.String r2 = "io.exception"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00cf
            r10 = r8
            goto L_0x00dd
        L_0x00cf:
            vz1 r10 = new vz1
            int r2 = defpackage.qad.u1
            igf r11 = new igf
            r11.<init>(r2)
            r10.<init>(r11)
            goto L_0x00dd
        L_0x00dc:
            r10 = r7
        L_0x00dd:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r8)
            if (r2 != 0) goto L_0x0128
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r7)
            if (r2 == 0) goto L_0x00ea
            goto L_0x0128
        L_0x00ea:
            boolean r0 = r10 instanceof defpackage.sz1
            xme r1 = r6.i
            if (r0 == 0) goto L_0x010c
            java.lang.Object r0 = r1.getValue()
            r11 = r0
            g02 r11 = (defpackage.g02) r11
            if (r11 == 0) goto L_0x0149
            sz1 r10 = (defpackage.sz1) r10
            int r0 = defpackage.jya.I
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            ngf r13 = r10.a
            r15 = 1
            r12 = 0
            r16 = 7
            g02 r5 = defpackage.g02.a(r11, r12, r13, r14, r15, r16)
            goto L_0x0149
        L_0x010c:
            java.lang.Object r0 = r1.getValue()
            r10 = r0
            g02 r10 = (defpackage.g02) r10
            if (r10 == 0) goto L_0x0149
            mgf r12 = new mgf
            r12.<init>(r9)
            int r0 = defpackage.jya.I
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            r11 = 0
            r14 = 1
            r15 = 7
            g02 r5 = defpackage.g02.a(r10, r11, r12, r13, r14, r15)
            goto L_0x0149
        L_0x0128:
            r0.b = r4
            r0.a = r3
            java.lang.Object r0 = r6.r(r10, r0)
            if (r0 != r1) goto L_0x0133
            return r1
        L_0x0133:
            r0 = r4
        L_0x0134:
            xme r1 = r6.i
            java.lang.Object r1 = r1.getValue()
            r6 = r1
            g02 r6 = (defpackage.g02) r6
            if (r6 == 0) goto L_0x0148
            r9 = 0
            r10 = 1
            r7 = 0
            r8 = 0
            r11 = 7
            g02 r5 = defpackage.g02.a(r6, r7, r8, r9, r10, r11)
        L_0x0148:
            r4 = r0
        L_0x0149:
            r4.setValue(r5)
            goto L_0x016f
        L_0x014d:
            xme r0 = r6.i
            java.lang.Object r1 = r0.getValue()
            r6 = r1
            g02 r6 = (defpackage.g02) r6
            if (r6 == 0) goto L_0x016c
            int r1 = defpackage.ixa.v
            igf r8 = new igf
            r8.<init>(r1)
            int r1 = defpackage.jya.J
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            r7 = 0
            r10 = 0
            r11 = 7
            g02 r5 = defpackage.g02.a(r6, r7, r8, r9, r10, r11)
        L_0x016c:
            r0.setValue(r5)
        L_0x016f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0172:
            java.lang.Object r0 = r14.getValue()
            r7 = r0
            g02 r7 = (defpackage.g02) r7
            if (r7 == 0) goto L_0x018a
            int r0 = defpackage.ixa.Y1
            igf r9 = new igf
            r9.<init>(r0)
            r10 = 0
            r11 = 1
            r12 = 3
            r8 = r2
            g02 r5 = defpackage.g02.a(r7, r8, r9, r10, r11, r12)
        L_0x018a:
            r14.setValue(r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f52.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
