package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ls5  reason: default package */
public final class ls5 extends SuspendLambda implements Function2 {
    public va3 a;
    public wtc b;
    public int c;
    public long o;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ bs5 x;
    public final /* synthetic */ long y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ls5(long j, bs5 bs5, Continuation continuation) {
        super(2, continuation);
        this.x = bs5;
        this.y = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ls5 ls5 = new ls5(this.y, this.x, continuation);
        ls5.w = obj;
        return ls5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ls5) create((cwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002a
            if (r2 != r3) goto L_0x0022
            long r5 = r0.o
            int r2 = r0.c
            wtc r7 = r0.b
            va3 r8 = r0.a
            java.lang.Object r9 = r0.w
            cwb r9 = (defpackage.cwb) r9
            kotlin.ResultKt.throwOnFailure(r20)
            r10 = r3
            r3 = r20
            goto L_0x00c5
        L_0x0022:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r2 = r0.w
            cwb r2 = (defpackage.cwb) r2
            qm7 r5 = defpackage.kv0.b()
            ks5 r6 = new ks5
            bs5 r7 = r0.x
            r6.<init>(r7, r5, r4)
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            cu0 r8 = defpackage.cu0.a
            f14 r9 = defpackage.f14.a
            r10 = 4
            r11 = 2147483647(0x7fffffff, float:NaN)
            ru0 r8 = defpackage.o54.a(r11, r10, r8)
            kotlin.coroutines.CoroutineContext r7 = defpackage.o04.b(r2, r7)
            zvb r10 = new zvb
            r10.<init>(r7, r8)
            r10.j0(r9, r10, r6)
            long r6 = r0.y
            r9 = r2
            r8 = r5
            r5 = r6
            r7 = r10
            r2 = r11
        L_0x005d:
            upd r15 = new upd
            kotlin.coroutines.CoroutineContext r10 = r19.getContext()
            r15.<init>(r10)
            r12 = r8
            qn7 r12 = (defpackage.qn7) r12
            r12.getClass()
            pn7 r10 = defpackage.pn7.a
            r11 = 3
            java.lang.Object r10 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, r11)
            r13 = r10
            kotlin.jvm.functions.Function3 r13 = (kotlin.jvm.functions.Function3) r13
            wpd r14 = defpackage.wpd.a
            hs5 r11 = new hs5
            r11.<init>(r7, r2, r9, r4)
            spd r10 = new spd
            bpa r16 = defpackage.ld9.o
            r17 = 0
            r20 = r10
            r18 = r11
            r11 = r15
            r3 = r15
            r15 = r16
            r16 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r10 = 0
            r11 = r20
            r3.f(r11, r10)
            is5 r10 = new is5
            r10.<init>(r7, r2, r9, r4)
            long r11 = defpackage.xk4.e(r5)
            defpackage.q8.I(r3, r11, r10)
            r0.w = r9
            r0.a = r8
            r0.b = r7
            r0.c = r2
            r0.o = r5
            r10 = 1
            r0.v = r10
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = defpackage.upd.w
            java.lang.Object r11 = r11.get(r3)
            boolean r11 = r11 instanceof defpackage.spd
            if (r11 == 0) goto L_0x00be
            java.lang.Object r3 = r3.c(r0)
            goto L_0x00c2
        L_0x00be:
            java.lang.Object r3 = r3.d(r0)
        L_0x00c2:
            if (r3 != r1) goto L_0x00c5
            return r1
        L_0x00c5:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x00d0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00d0:
            r3 = r10
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
