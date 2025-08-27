package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t92  reason: default package */
public final class t92 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ ia2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t92(List list, ia2 ia2, Continuation continuation) {
        super(2, continuation);
        this.c = list;
        this.o = ia2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t92 t92 = new t92(this.c, this.o, continuation);
        t92.b = obj;
        return t92;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.a
            java.util.List r3 = r0.c
            r4 = 1
            ia2 r5 = r0.o
            if (r2 == 0) goto L_0x0024
            if (r2 != r4) goto L_0x001c
            java.lang.Object r0 = r0.b
            d14 r0 = (defpackage.d14) r0
            kotlin.ResultKt.throwOnFailure(r22)
            r2 = r0
            r0 = r22
            goto L_0x0042
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r22)
            java.lang.Object r2 = r0.b
            d14 r2 = (defpackage.d14) r2
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x004e
            java.lang.String r6 = defpackage.ia2.K0
            c6d r6 = r5.g()
            r0.b = r2
            r0.a = r4
            java.lang.Object r0 = r6.e(r0)
            if (r0 != r1) goto L_0x0042
            return r1
        L_0x0042:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x004e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x004e:
            kotlin.Lazy r0 = r5.a
            java.lang.Object r0 = r0.getValue()
            eef r0 = (defpackage.eef) r0
            idb r1 = defpackage.idb.TYPE_CONFIG
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r0 = r0.i(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0066:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x008c
            java.lang.Object r1 = r0.next()
            tdf r1 = (defpackage.tdf) r1
            hdb r4 = r1.f
            boolean r6 = r4 instanceof defpackage.ke3
            if (r6 == 0) goto L_0x0066
            ke3 r4 = (defpackage.ke3) r4
            boolean r4 = r4.z
            if (r4 == 0) goto L_0x0066
            kotlin.Lazy r4 = r5.a
            java.lang.Object r4 = r4.getValue()
            eef r4 = (defpackage.eef) r4
            long r6 = r1.a
            r4.d(r6)
            goto L_0x0066
        L_0x008c:
            boolean r0 = defpackage.e14.f(r2)
            if (r0 != 0) goto L_0x0095
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0095:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00a9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x011f
            java.lang.Object r4 = r3.next()
            zx5 r4 = (defpackage.zx5) r4
            r82 r15 = new r82
            java.lang.String r7 = r4.a
            java.lang.CharSequence r6 = r4.b
            java.lang.String r8 = r6.toString()
            java.util.List r6 = r4.z
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r10 = kotlin.collections.CollectionsKt.toSet(r6)
            java.util.Set r11 = kotlin.collections.SetsKt.emptySet()
            java.util.List r6 = r4.w0
            java.util.ArrayList r6 = defpackage.qe8.v(r6)
            if (r6 != 0) goto L_0x00d7
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00d7:
            r14 = r6
            java.lang.Long r6 = r4.x0
            if (r6 == 0) goto L_0x00e3
            long r12 = r6.longValue()
        L_0x00e0:
            r16 = r12
            goto L_0x00e6
        L_0x00e3:
            r12 = 0
            goto L_0x00e0
        L_0x00e6:
            java.util.List r13 = r4.z0
            java.util.Set r12 = r4.A0
            java.lang.String r9 = r4.c
            java.util.Set r6 = r4.w
            r21 = r3
            boolean r3 = r4.X
            r20 = r5
            java.util.Map r5 = r4.y0
            r18 = r6
            r6 = r15
            r19 = r12
            r12 = r18
            r18 = r13
            r13 = r3
            r3 = r15
            r15 = r16
            r17 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19)
            r0.add(r3)
            boolean r3 = r4.y
            if (r3 == 0) goto L_0x011a
            boolean r3 = r4.b()
            if (r3 != 0) goto L_0x011a
            java.lang.String r3 = r4.a
            r1.add(r3)
        L_0x011a:
            r3 = r21
            r5 = r20
            goto L_0x00a9
        L_0x011f:
            r20 = r5
            boolean r2 = defpackage.e14.f(r2)
            if (r2 != 0) goto L_0x012a
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x012a:
            r2 = r20
            kotlin.Lazy r3 = r2.v0
            java.lang.Object r3 = r3.getValue()
            rl r3 = (defpackage.rl) r3
            jna r3 = (defpackage.jna) r3
            r3.getClass()
            ke3 r4 = new ke3
            jtb r5 = r3.D()
            ltb r5 = (defpackage.ltb) r5
            a33 r5 = r5.a
            long r7 = r5.n()
            long[] r14 = defpackage.jna.g
            r11 = 0
            r15 = 1
            r9 = 0
            r12 = 0
            r13 = 0
            r6 = r4
            r16 = r0
            r17 = r1
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16, r17)
            defpackage.jna.A(r3, r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.J0
            r1 = 0
            r0.set(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
