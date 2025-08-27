package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c23  reason: default package */
public final class c23 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ d23 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c23(d23 d23, long j, Continuation continuation) {
        super(2, continuation);
        this.b = d23;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c23(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c23) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [pt4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.a
            r2 = 1
            if (r1 == 0) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00f0
        L_0x0010:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0018:
            kotlin.ResultKt.throwOnFailure(r13)
            d23 r13 = r12.b
            java.lang.Object r13 = r13.b
            java.lang.String r13 = (java.lang.String) r13
            long r3 = r12.c
            a67 r1 = defpackage.z68.b
            r5 = 0
            if (r1 != 0) goto L_0x0029
            goto L_0x003a
        L_0x0029:
            boolean r6 = r1.c()
            if (r6 == 0) goto L_0x003a
            w78 r6 = defpackage.w78.o
            java.lang.String r7 = "start clear draft for chatId:"
            java.lang.String r3 = defpackage.wj6.i(r3, r7)
            r1.d(r6, r13, r3, r5)
        L_0x003a:
            d23 r13 = r12.b
            java.lang.Object r13 = r13.c
            kotlin.Lazy r13 = (kotlin.Lazy) r13
            java.lang.Object r13 = r13.getValue()
            qx2 r13 = (defpackage.qx2) r13
            long r3 = r12.c
            my2 r13 = (defpackage.my2) r13
            etc r13 = r13.o(r3)
            ome r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            a32 r13 = (defpackage.a32) r13
            if (r13 != 0) goto L_0x0066
            d23 r12 = r12.b
            java.lang.Object r12 = r12.b
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "can't clear draft because chat is null"
            defpackage.z68.c(r12, r13, new java.lang.Object[0])
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x0066:
            m72 r1 = r13.b
            pt4 r1 = r1.f0
            boolean r3 = r1 instanceof defpackage.mta
            if (r3 == 0) goto L_0x0071
            r5 = r1
            mta r5 = (defpackage.mta) r5
        L_0x0071:
            if (r5 != 0) goto L_0x0081
            d23 r12 = r12.b
            java.lang.Object r12 = r12.b
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "Draft empty in chat don't need clear"
            defpackage.z68.c(r12, r13, new java.lang.Object[0])
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x0081:
            d23 r1 = r12.b
            java.lang.Object r1 = r1.b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "Clear local draft"
            defpackage.z68.c(r1, r3, new java.lang.Object[0])
            d23 r1 = r12.b
            r12.a = r2
            r1.getClass()
            long r2 = r13.a
            java.lang.String r4 = "dropAllDrafts "
            java.lang.String r2 = defpackage.wj6.i(r2, r4)
            java.lang.Object r3 = r1.b
            java.lang.String r3 = (java.lang.String) r3
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            m72 r2 = r13.b
            pt4 r3 = r2.f0
            if (r3 == 0) goto L_0x00de
            java.lang.Long r3 = r5.e
            if (r3 == 0) goto L_0x00b1
            long r2 = r3.longValue()
            goto L_0x00b3
        L_0x00b1:
            long r2 = r2.g0
        L_0x00b3:
            java.lang.Object r4 = r1.w
            kotlin.Lazy r4 = (kotlin.Lazy) r4
            java.lang.Object r4 = r4.getValue()
            bud r4 = (defpackage.bud) r4
            akd r4 = (defpackage.akd) r4
            boolean r4 = r4.w()
            if (r4 != 0) goto L_0x00c7
            r2 = 0
        L_0x00c7:
            r9 = r2
            java.lang.Object r2 = r1.c
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            java.lang.Object r2 = r2.getValue()
            qx2 r2 = (defpackage.qx2) r2
            my2 r2 = (defpackage.my2) r2
            long r7 = r13.a
            r62 r6 = r2.n()
            r11 = 0
            r6.n(r7, r9, r11)
        L_0x00de:
            long r2 = r13.a
            java.lang.Object r12 = r1.g(r2, r5, r12)
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r12 != r13) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
        L_0x00ed:
            if (r12 != r0) goto L_0x00f0
            return r0
        L_0x00f0:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c23.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
