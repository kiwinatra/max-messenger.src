package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: st0  reason: default package */
public final class st0 {
    public final q04 a;
    public final q04 b;
    public final long c;
    public final Function1 d;
    public final Function2 e;
    public final Function1 f;
    public final Function2 g;
    public final String h = "Buffer:LogController";
    public final n6e i;
    public final n6e j;
    public final AtomicBoolean k;
    public final ArrayList l;
    public final CopyOnWriteArrayList m;

    public st0(q04 q04, q04 q042, long j2, vq7 vq7, i78 i78, wk wkVar, wq0 wq0) {
        this.a = q04;
        this.b = q042;
        this.c = j2;
        this.d = vq7;
        this.e = i78;
        this.f = wkVar;
        this.g = wq0;
        jx3 a2 = e14.a(CoroutineContext.Element.DefaultImpls.plus(kr7.b(), q042));
        cu0 cu0 = cu0.b;
        this.i = m5a.b(1, 0, cu0, 2);
        this.j = m5a.b(0, IntCompanionObject.MAX_VALUE, cu0, 1);
        this.k = new AtomicBoolean(false);
        this.l = new ArrayList();
        this.m = new CopyOnWriteArrayList();
        ev0.v(a2, (CoroutineContext) null, (f14) null, new qt0(this, (Continuation) null), 3);
    }

    public static final Object a(st0 st0, pt0 pt0) {
        CopyOnWriteArrayList copyOnWriteArrayList = st0.m;
        boolean z = !copyOnWriteArrayList.isEmpty();
        ArrayList arrayList = st0.l;
        if (z) {
            arrayList.addAll(copyOnWriteArrayList);
            copyOnWriteArrayList.clear();
        }
        if (!(!arrayList.isEmpty())) {
            return Unit.INSTANCE;
        }
        List list = CollectionsKt.toList(arrayList);
        arrayList.clear();
        Object c2 = st0.c(list, pt0);
        return c2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c2 : Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.jt0
            if (r0 == 0) goto L_0x0013
            r0 = r6
            jt0 r0 = (defpackage.jt0) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            jt0 r0 = new jt0
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0060
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            sa3 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0054
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r6)
            sa3 r6 = defpackage.kne.b()
            n6e r5 = r5.i
            m6f r2 = new m6f
            r2.<init>(r6)
            r0.a = r6
            r0.o = r4
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r5 = r6
        L_0x0054:
            r6 = 0
            r0.a = r6
            r0.o = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L_0x0060
            return r1
        L_0x0060:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st0.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ac A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.mt0
            if (r0 == 0) goto L_0x0013
            r0 = r9
            mt0 r0 = (defpackage.mt0) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            mt0 r0 = new mt0
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            long r7 = r0.c
            java.util.ArrayList r1 = r0.b
            st0 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0030 }
            goto L_0x00a5
        L_0x0030:
            r7 = move-exception
            goto L_0x00e8
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0049:
            boolean r2 = r8.hasNext()
            r4 = 0
            if (r2 == 0) goto L_0x007f
            java.lang.Object r2 = r8.next()
            kotlin.Result$Companion r5 = kotlin.Result.Companion     // Catch:{ all -> 0x0061 }
            kotlin.jvm.functions.Function1 r5 = r7.d     // Catch:{ all -> 0x0061 }
            java.lang.Object r2 = r5.invoke(r2)     // Catch:{ all -> 0x0061 }
            java.lang.Object r2 = kotlin.Result.m23constructorimpl(r2)     // Catch:{ all -> 0x0061 }
            goto L_0x006c
        L_0x0061:
            r2 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m23constructorimpl(r2)
        L_0x006c:
            java.lang.Throwable r5 = kotlin.Result.m26exceptionOrNullimpl(r2)
            if (r5 != 0) goto L_0x0074
            r4 = r2
            goto L_0x0079
        L_0x0074:
            kotlin.jvm.functions.Function1 r2 = r7.f
            r2.invoke(r5)
        L_0x0079:
            if (r4 == 0) goto L_0x0049
            r9.add(r4)
            goto L_0x0049
        L_0x007f:
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L_0x0088
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x0088:
            long r5 = java.lang.System.nanoTime()
            q04 r8 = r7.a     // Catch:{ all -> 0x00e5 }
            nt0 r2 = new nt0     // Catch:{ all -> 0x00e5 }
            r2.<init>(r7, r9, r4)     // Catch:{ all -> 0x00e5 }
            r0.a = r7     // Catch:{ all -> 0x00e5 }
            r0.b = r9     // Catch:{ all -> 0x00e5 }
            r0.c = r5     // Catch:{ all -> 0x00e5 }
            r0.w = r3     // Catch:{ all -> 0x00e5 }
            java.lang.Object r8 = defpackage.ev0.I(r8, r2, r0)     // Catch:{ all -> 0x00e5 }
            if (r8 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            r0 = r7
            r1 = r9
            r7 = r5
        L_0x00a5:
            boolean r9 = r1.isEmpty()     // Catch:{ all -> 0x0030 }
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x00ed
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0030 }
            long r2 = r2 - r7
            kotlin.time.DurationUnit r7 = kotlin.time.DurationUnit.NANOSECONDS     // Catch:{ all -> 0x0030 }
            long r7 = kotlin.time.DurationKt.toDuration((long) r2, (kotlin.time.DurationUnit) r7)     // Catch:{ all -> 0x0030 }
            long r7 = kotlin.time.Duration.m1371getInWholeMillisecondsimpl(r7)     // Catch:{ all -> 0x0030 }
            kotlin.jvm.functions.Function2 r9 = r0.g     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = r0.h     // Catch:{ all -> 0x0030 }
            int r1 = r1.size()     // Catch:{ all -> 0x0030 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r3.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = "inserted "
            r3.append(r4)     // Catch:{ all -> 0x0030 }
            r3.append(r1)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = " items in "
            r3.append(r1)     // Catch:{ all -> 0x0030 }
            r3.append(r7)     // Catch:{ all -> 0x0030 }
            java.lang.String r7 = "ms"
            r3.append(r7)     // Catch:{ all -> 0x0030 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0030 }
            r9.invoke(r2, r7)     // Catch:{ all -> 0x0030 }
            goto L_0x00ed
        L_0x00e5:
            r8 = move-exception
            r0 = r7
            r7 = r8
        L_0x00e8:
            kotlin.jvm.functions.Function1 r8 = r0.f
            r8.invoke(r7)
        L_0x00ed:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st0.c(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
