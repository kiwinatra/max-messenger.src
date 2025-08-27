package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* renamed from: pt5  reason: default package */
public final class pt5 extends SuspendLambda implements Function3 {
    public Ref.ObjectRef a;
    public Ref.LongRef b;
    public int c;
    public /* synthetic */ Object o;
    public /* synthetic */ Object v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ bs5 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pt5(hg2 hg2, bs5 bs5, Continuation continuation) {
        super(3, continuation);
        this.w = hg2;
        this.x = bs5;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bs5 bs5 = this.x;
        pt5 pt5 = new pt5((hg2) this.w, bs5, (Continuation) obj3);
        pt5.o = (d14) obj;
        pt5.v = (ds5) obj2;
        return pt5.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 == r5) goto L_0x002d
            if (r2 != r4) goto L_0x0025
            kotlin.jvm.internal.Ref$ObjectRef r2 = r0.a
            java.lang.Object r7 = r0.v
            wtc r7 = (defpackage.wtc) r7
            java.lang.Object r8 = r0.o
            ds5 r8 = (defpackage.ds5) r8
            kotlin.ResultKt.throwOnFailure(r21)
            r5 = r4
            r9 = r8
            r8 = r7
        L_0x0022:
            r7 = r2
            goto L_0x0130
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002d:
            kotlin.jvm.internal.Ref$LongRef r2 = r0.b
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.a
            java.lang.Object r8 = r0.v
            wtc r8 = (defpackage.wtc) r8
            java.lang.Object r9 = r0.o
            ds5 r9 = (defpackage.ds5) r9
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x00af
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r21)
            java.lang.Object r2 = r0.o
            d14 r2 = (defpackage.d14) r2
            java.lang.Object r7 = r0.v
            ds5 r7 = (defpackage.ds5) r7
            ot5 r8 = new ot5
            bs5 r9 = r0.x
            r8.<init>(r9, r6)
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            cu0 r10 = defpackage.cu0.a
            f14 r11 = defpackage.f14.a
            r12 = 4
            ru0 r10 = defpackage.o54.a(r3, r12, r10)
            kotlin.coroutines.CoroutineContext r2 = defpackage.o04.b(r2, r9)
            zvb r9 = new zvb
            r9.<init>(r2, r10)
            r9.j0(r11, r9, r8)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r8 = r9
            r9 = r7
            r7 = r2
        L_0x006f:
            T r2 = r7.element
            bpa r10 = defpackage.q8.g
            if (r2 == r10) goto L_0x0134
            kotlin.jvm.internal.Ref$LongRef r2 = new kotlin.jvm.internal.Ref$LongRef
            r2.<init>()
            T r10 = r7.element
            if (r10 == 0) goto L_0x00b1
            bpa r11 = defpackage.q8.e
            if (r10 != r11) goto L_0x0083
            r10 = r6
        L_0x0083:
            kotlin.jvm.functions.Function1 r12 = r0.w
            java.lang.Object r10 = r12.invoke(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            long r12 = r10.longValue()
            r2.element = r12
            r14 = 0
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 < 0) goto L_0x00b7
            if (r10 != 0) goto L_0x00b1
            T r10 = r7.element
            if (r10 != r11) goto L_0x009e
            r10 = r6
        L_0x009e:
            r0.o = r9
            r0.v = r8
            r0.a = r7
            r0.b = r2
            r0.c = r5
            java.lang.Object r10 = r9.a(r10, r0)
            if (r10 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r7.element = r6
        L_0x00b1:
            r19 = r7
            r7 = r2
            r2 = r19
            goto L_0x00c3
        L_0x00b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Debounce timeout should not be negative"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            upd r15 = new upd
            kotlin.coroutines.CoroutineContext r10 = r20.getContext()
            r15.<init>(r10)
            T r10 = r2.element
            if (r10 == 0) goto L_0x00da
            long r10 = r7.element
            lt5 r7 = new lt5
            r7.<init>(r9, r6, r2)
            defpackage.q8.I(r15, r10, r7)
        L_0x00da:
            m7f r7 = r8.c()
            mt5 r14 = new mt5
            r14.<init>(r9, r6, r2)
            spd r13 = new spd
            java.lang.Object r12 = r7.a
            java.lang.Object r10 = r7.c
            r16 = r10
            kotlin.jvm.functions.Function3 r16 = (kotlin.jvm.functions.Function3) r16
            r17 = 0
            java.lang.Object r10 = r7.b
            r18 = r10
            kotlin.jvm.functions.Function3 r18 = (kotlin.jvm.functions.Function3) r18
            java.lang.Object r7 = r7.o
            kotlin.jvm.functions.Function3 r7 = (kotlin.jvm.functions.Function3) r7
            r10 = r13
            r11 = r15
            r5 = r13
            r13 = r18
            r18 = r14
            r14 = r16
            r4 = r15
            r15 = r17
            r16 = r18
            r17 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r4.f(r5, r3)
            r0.o = r9
            r0.v = r8
            r0.a = r2
            r0.b = r6
            r5 = 2
            r0.c = r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.upd.w
            java.lang.Object r7 = r7.get(r4)
            boolean r7 = r7 instanceof defpackage.spd
            if (r7 == 0) goto L_0x0129
            java.lang.Object r4 = r4.c(r0)
            goto L_0x012d
        L_0x0129:
            java.lang.Object r4 = r4.d(r0)
        L_0x012d:
            if (r4 != r1) goto L_0x0022
            return r1
        L_0x0130:
            r4 = r5
            r5 = 1
            goto L_0x006f
        L_0x0134:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
