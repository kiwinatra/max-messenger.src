package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hrd  reason: default package */
public final class hrd extends SuspendLambda implements Function2 {
    public Set a;
    public zc4 b;
    public Iterator c;
    public int o;
    public final /* synthetic */ zc4 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hrd(zc4 zc4, Continuation continuation) {
        super(2, continuation);
        this.v = zc4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hrd(this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hrd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.o
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            java.util.Iterator r1 = r9.c
            zc4 r3 = r9.b
            java.util.Set r4 = r9.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0082
        L_0x0015:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r10)
            zc4 r10 = r9.v
            java.lang.Object r1 = r10.v
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.Object r1 = r1.get()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
            r4 = r3
            r3 = r10
        L_0x0037:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00a6
            java.lang.Object r10 = r1.next()
            dkb r10 = (defpackage.dkb) r10
            ckb r5 = r10.b
            ckb r6 = defpackage.ckb.a
            long r7 = r10.a
            if (r5 == r6) goto L_0x0094
            java.lang.Object r10 = r3.a
            kotlin.Lazy r10 = (kotlin.Lazy) r10
            if (r10 != 0) goto L_0x0052
            goto L_0x0094
        L_0x0052:
            ckb r10 = defpackage.ckb.b
            if (r5 != r10) goto L_0x008f
            java.lang.Object r10 = r3.c
            kotlin.Lazy r10 = (kotlin.Lazy) r10
            java.lang.Object r10 = r10.getValue()
            x23 r10 = (defpackage.x23) r10
            qjd r10 = (defpackage.qjd) r10
            long r5 = r10.s()
            long r5 = r5 ^ r7
            java.lang.Object r10 = r3.a
            kotlin.Lazy r10 = (kotlin.Lazy) r10
            java.lang.Object r10 = r10.getValue()
            qx2 r10 = (defpackage.qx2) r10
            r9.a = r4
            r9.b = r3
            r9.c = r1
            r9.o = r2
            my2 r10 = (defpackage.my2) r10
            java.lang.Object r10 = r10.u(r5, r9)
            if (r10 != r0) goto L_0x0082
            return r0
        L_0x0082:
            a32 r10 = (defpackage.a32) r10
            if (r10 == 0) goto L_0x008d
            long r5 = r10.a
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            goto L_0x0098
        L_0x008d:
            r10 = 0
            goto L_0x0098
        L_0x008f:
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            goto L_0x0098
        L_0x0094:
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
        L_0x0098:
            if (r10 == 0) goto L_0x0037
            long r5 = r10.longValue()
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r4.add(r10)
            goto L_0x0037
        L_0x00a6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
