package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: f86  reason: default package */
public final class f86 extends SuspendLambda implements Function2 {
    public Set a;
    public int b;
    public final /* synthetic */ l86 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f86(l86 l86, Continuation continuation) {
        super(2, continuation);
        this.c = l86;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new f86(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f86) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            l86 r6 = r14.c
            if (r1 == 0) goto L_0x0038
            if (r1 == r5) goto L_0x0031
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0150
        L_0x001b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0023:
            java.util.Set r1 = r14.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0109
        L_0x002a:
            java.util.Set r1 = r14.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00ec
        L_0x0031:
            java.util.Set r1 = r14.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00bd
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.concurrent.atomic.AtomicReference r15 = r6.Z
            java.lang.Object r15 = r15.get()
            java.util.Set r15 = (java.util.Set) r15
            if (r15 != 0) goto L_0x0048
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x0048:
            xme r1 = r6.v0
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            java.util.Iterator r7 = r15.iterator()
        L_0x005e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0074
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r10 = r1.contains(r8)
            if (r10 != 0) goto L_0x005e
            r9.add(r8)
            goto L_0x005e
        L_0x0074:
            java.util.Iterator r1 = r1.iterator()
        L_0x0078:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x008e
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r15.contains(r7)
            if (r8 != 0) goto L_0x0078
            r13.add(r7)
            goto L_0x0078
        L_0x008e:
            boolean r15 = r9.isEmpty()
            r15 = r15 ^ r5
            if (r15 == 0) goto L_0x00bc
            r14.a = r13
            r14.b = r5
            u82 r15 = r6.o
            ia2 r15 = (defpackage.ia2) r15
            r15.getClass()
            d92 r1 = new d92
            r12 = 0
            long r10 = r6.b
            r7 = r1
            r8 = r15
            r7.<init>(r8, r9, r10, r12)
            kotlin.coroutines.CoroutineContext r15 = r15.x
            java.lang.Object r15 = defpackage.ev0.I(r15, r1, r14)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r15 != r1) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
        L_0x00b9:
            if (r15 != r0) goto L_0x00bc
            return r0
        L_0x00bc:
            r1 = r13
        L_0x00bd:
            boolean r15 = r1.isEmpty()
            r15 = r15 ^ r5
            if (r15 == 0) goto L_0x00ec
            u82 r15 = r6.o
            r14.a = r1
            r14.b = r4
            ia2 r15 = (defpackage.ia2) r15
            r15.getClass()
            y82 r4 = new y82
            r12 = 0
            long r10 = r6.b
            r7 = r4
            r8 = r1
            r9 = r15
            r7.<init>(r8, r9, r10, r12)
            kotlin.coroutines.CoroutineContext r15 = r15.x
            java.lang.Object r15 = defpackage.ev0.I(r15, r4, r14)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r15 != r4) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
        L_0x00e9:
            if (r15 != r0) goto L_0x00ec
            return r0
        L_0x00ec:
            int r15 = r1.size()
            if (r15 <= 0) goto L_0x0150
            kotlin.Lazy r15 = r6.x
            java.lang.Object r15 = r15.getValue()
            qx2 r15 = (defpackage.qx2) r15
            r14.a = r1
            r14.b = r3
            my2 r15 = (defpackage.my2) r15
            long r3 = r6.b
            java.lang.Object r15 = r15.m(r3, r14)
            if (r15 != r0) goto L_0x0109
            return r0
        L_0x0109:
            a32 r15 = (defpackage.a32) r15
            r3 = 0
            if (r15 == 0) goto L_0x0115
            boolean r15 = r15.K()
            if (r15 != r5) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r5 = r3
        L_0x0116:
            android.content.Context r15 = r6.c
            android.content.res.Resources r15 = r15.getResources()
            if (r5 == 0) goto L_0x0121
            int r3 = defpackage.hua.a
            goto L_0x0123
        L_0x0121:
            int r3 = defpackage.hua.b
        L_0x0123:
            int r4 = r1.size()
            int r1 = r1.size()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r15 = r15.getQuantityString(r3, r4, r1)
            gaf r1 = r6.v
            osa r1 = (defpackage.osa) r1
            gc8 r1 = r1.c()
            e86 r3 = new e86
            r4 = 0
            r3.<init>(r6, r15, r4)
            r14.a = r4
            r14.b = r2
            java.lang.Object r14 = defpackage.ev0.I(r1, r3, r14)
            if (r14 != r0) goto L_0x0150
            return r0
        L_0x0150:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f86.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
