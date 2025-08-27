package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: v6d  reason: default package */
public final class v6d extends SuspendLambda implements Function2 {
    public z6d a;
    public Collection b;
    public Iterator c;
    public Collection o;
    public int v;
    public final /* synthetic */ z6d w;
    public final /* synthetic */ Collection x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v6d(z6d z6d, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.w = z6d;
        this.x = collection;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new v6d(this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v6d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.v
            r2 = 1
            z6d r3 = r8.w
            r4 = 2
            if (r1 == 0) goto L_0x002d
            if (r1 == r2) goto L_0x0029
            if (r1 != r4) goto L_0x0021
            java.util.Collection r1 = r8.o
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r2 = r8.c
            java.util.Collection r3 = r8.b
            java.util.Collection r3 = (java.util.Collection) r3
            z6d r5 = r8.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00bf
        L_0x0021:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008d
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r9)
            aj9 r9 = r3.d()
            r8.v = r2
            r9.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "SELECT * FROM messages WHERE id IN ("
            r1.append(r5)
            java.util.Collection r5 = r8.x
            int r6 = r5.size()
            defpackage.n79.c(r1, r6)
            java.lang.String r7 = ")"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            d7d r1 = defpackage.d7d.a(r6, r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x005d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0079
            java.lang.Object r6 = r5.next()
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 != 0) goto L_0x006f
            r1.X(r2)
            goto L_0x0076
        L_0x006f:
            long r6 = r6.longValue()
            r1.k(r2, r6)
        L_0x0076:
            int r2 = r2 + 1
            goto L_0x005d
        L_0x0079:
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            yi9 r5 = new yi9
            r6 = 1
            r5.<init>(r9, r1, r6)
            i6d r9 = r9.a
            java.lang.Object r9 = defpackage.i8b.q(r9, r2, r5, r8)
            if (r9 != r0) goto L_0x008d
            return r0
        L_0x008d:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r9, 10)
            r1.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
        L_0x009d:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00c7
            java.lang.Object r9 = r2.next()
            ya9 r9 = (defpackage.ya9) r9
            r8.a = r3
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            r8.b = r5
            r8.c = r2
            r8.o = r5
            r8.v = r4
            java.lang.Object r9 = r3.h(r9, r8)
            if (r9 != r0) goto L_0x00bd
            return r0
        L_0x00bd:
            r5 = r3
            r3 = r1
        L_0x00bf:
            ha9 r9 = (defpackage.ha9) r9
            r1.add(r9)
            r1 = r3
            r3 = r5
            goto L_0x009d
        L_0x00c7:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
