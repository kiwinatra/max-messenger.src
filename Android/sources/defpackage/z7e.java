package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: z7e  reason: default package */
public final class z7e extends SuspendLambda implements Function2 {
    public ArrayList a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ c8e v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z7e(c8e c8e, Continuation continuation) {
        super(2, continuation);
        this.v = c8e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        z7e z7e = new z7e(this.v, continuation);
        z7e.o = obj;
        return z7e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z7e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 == r4) goto L_0x0024
            if (r1 != r3) goto L_0x001c
            java.util.Iterator r1 = r9.b
            java.util.ArrayList r4 = r9.a
            java.lang.Object r5 = r9.o
            d14 r5 = (defpackage.d14) r5
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00a0
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0024:
            java.util.ArrayList r1 = r9.a
            java.lang.Object r4 = r9.o
            d14 r4 = (defpackage.d14) r4
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0067
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.o
            d14 r10 = (defpackage.d14) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            c8e r5 = r9.v
            kotlin.Lazy r5 = r5.z
            java.lang.Object r5 = r5.getValue()
            w7e r5 = (defpackage.w7e) r5
            r1.add(r5)
            c8e r5 = r9.v
            kotlin.Lazy r5 = r5.c
            java.lang.Object r5 = r5.getValue()
            qx2 r5 = (defpackage.qx2) r5
            r9.o = r10
            r9.a = r1
            r9.c = r4
            my2 r5 = (defpackage.my2) r5
            r62 r4 = r5.n()
            java.util.ArrayList r4 = r4.B(r2)
            if (r4 != r0) goto L_0x0064
            return r0
        L_0x0064:
            r8 = r4
            r4 = r10
            r10 = r8
        L_0x0067:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            v00 r5 = defpackage.r62.I
            java.util.List r10 = kotlin.collections.CollectionsKt.sortedWith(r10, r5)
            defpackage.e14.e(r4)
            java.util.Iterator r10 = r10.iterator()
            r5 = r4
            r4 = r1
            r1 = r10
        L_0x0079:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00ac
            java.lang.Object r10 = r1.next()
            a32 r10 = (defpackage.a32) r10
            int r6 = r4.size()
            r7 = 5
            if (r6 >= r7) goto L_0x00ac
            defpackage.e14.e(r5)
            c8e r6 = r9.v
            r9.o = r5
            r9.a = r4
            r9.b = r1
            r9.c = r3
            java.lang.Object r10 = defpackage.c8e.b(r6, r10, r9)
            if (r10 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            w7e r10 = (defpackage.w7e) r10
            if (r10 == 0) goto L_0x0079
            boolean r10 = r4.add(r10)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            goto L_0x0079
        L_0x00ac:
            c8e r9 = r9.v
            java.lang.String r9 = r9.X
            a67 r10 = defpackage.z68.b
            if (r10 != 0) goto L_0x00b5
            goto L_0x00ca
        L_0x00b5:
            boolean r0 = r10.c()
            if (r0 == 0) goto L_0x00ca
            w78 r0 = defpackage.w78.o
            int r1 = r4.size()
            java.lang.String r3 = "buildShortcuts: result size: "
            java.lang.String r1 = defpackage.wj6.h(r1, r3)
            r10.d(r0, r9, r1, r2)
        L_0x00ca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
