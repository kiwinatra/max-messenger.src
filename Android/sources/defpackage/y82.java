package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: y82  reason: default package */
public final class y82 extends SuspendLambda implements Function2 {
    public ia2 a;
    public int b;
    public final /* synthetic */ Collection c;
    public final /* synthetic */ ia2 o;
    public final /* synthetic */ long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y82(Set set, ia2 ia2, long j, Continuation continuation) {
        super(2, continuation);
        this.c = set;
        this.o = ia2;
        this.v = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new y82((Set) this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y82) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.b
            r2 = 1
            ia2 r3 = r10.o
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x002a
            if (r1 == r2) goto L_0x0026
            if (r1 == r5) goto L_0x0020
            if (r1 != r4) goto L_0x0018
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x008f
        L_0x0018:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0020:
            ia2 r3 = r10.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0081
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0070
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.Collection r11 = r10.c
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r11, 10)
            r1.<init>(r6)
            java.util.Iterator r11 = r11.iterator()
        L_0x003e:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0055
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            r32 r7 = new r32
            long r8 = r10.v
            r7.<init>(r8, r6)
            r1.add(r7)
            goto L_0x003e
        L_0x0055:
            java.lang.String r11 = defpackage.ia2.K0
            c6d r11 = r3.g()
            r10.b = r2
            r11.getClass()
            ni r6 = new ni
            r7 = 24
            r6.<init>(r7, r11, r1)
            i6d r11 = r11.a
            java.lang.Object r11 = defpackage.i8b.r(r11, r6, r10)
            if (r11 != r0) goto L_0x0070
            return r0
        L_0x0070:
            java.lang.String r11 = defpackage.ia2.K0
            c6d r11 = r3.g()
            r10.a = r3
            r10.b = r5
            java.lang.Object r11 = r11.e(r10)
            if (r11 != r0) goto L_0x0081
            return r0
        L_0x0081:
            java.util.List r11 = (java.util.List) r11
            r1 = 0
            r10.a = r1
            r10.b = r4
            java.lang.Object r10 = defpackage.ia2.n(r3, r11, r2, r10)
            if (r10 != r0) goto L_0x008f
            return r0
        L_0x008f:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y82.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
