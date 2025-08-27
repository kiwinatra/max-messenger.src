package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l92  reason: default package */
public final class l92 extends SuspendLambda implements Function2 {
    public List a;
    public a0a b;
    public ia2 c;
    public int o;
    public final /* synthetic */ ia2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l92(ia2 ia2, Continuation continuation) {
        super(2, continuation);
        this.v = ia2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new l92(this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 2
            r4 = 1
            ia2 r5 = r0.v
            if (r2 == 0) goto L_0x002c
            if (r2 == r4) goto L_0x0026
            if (r2 != r3) goto L_0x001e
            ia2 r1 = r0.c
            a0a r2 = r0.b
            java.util.List r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            kotlin.ResultKt.throwOnFailure(r26)
            goto L_0x0057
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r26)
            r2 = r26
            goto L_0x003e
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r26)
            java.lang.String r2 = defpackage.ia2.K0
            c6d r2 = r5.g()
            r0.o = r4
            java.lang.Object r2 = r2.e(r0)
            if (r2 != r1) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r2 = (java.util.List) r2
            a0a r4 = r5.B0
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r0.a = r6
            r0.b = r4
            r0.c = r5
            r0.o = r3
            java.lang.Object r0 = r4.d(r0)
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r2
            r2 = r4
            r1 = r5
        L_0x0057:
            r3 = 0
            kotlin.Lazy r1 = r1.F0     // Catch:{ all -> 0x0089 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0089 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0089 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0089 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0089 }
            r4.<init>()     // Catch:{ all -> 0x0089 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0089 }
        L_0x006b:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x0089 }
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0089 }
            r7 = r6
            j5d r7 = (defpackage.j5d) r7     // Catch:{ all -> 0x0089 }
            r8 = r0
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ all -> 0x0089 }
            boolean r9 = r8 instanceof java.util.Collection     // Catch:{ all -> 0x0089 }
            if (r9 == 0) goto L_0x008c
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ all -> 0x0089 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0089 }
            if (r9 == 0) goto L_0x008c
            goto L_0x00a7
        L_0x0089:
            r0 = move-exception
            goto L_0x013c
        L_0x008c:
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0089 }
        L_0x0090:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0089 }
            if (r9 == 0) goto L_0x00a7
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0089 }
            j5d r9 = (defpackage.j5d) r9     // Catch:{ all -> 0x0089 }
            java.util.Set r9 = r9.e     // Catch:{ all -> 0x0089 }
            java.util.Set r10 = r7.e     // Catch:{ all -> 0x0089 }
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)     // Catch:{ all -> 0x0089 }
            if (r9 == 0) goto L_0x0090
            goto L_0x006b
        L_0x00a7:
            r4.add(r6)     // Catch:{ all -> 0x0089 }
            goto L_0x006b
        L_0x00ab:
            r2.e(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10)
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L_0x00bb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013b
            java.lang.Object r2 = r1.next()
            j5d r2 = (defpackage.j5d) r2
            c6d r3 = r5.g()
            java.lang.String r4 = r2.a
            java.util.ArrayList r15 = r3.f(r4)
            zx5 r3 = new zx5
            kotlin.Lazy r4 = r5.v
            java.lang.Object r4 = r4.getValue()
            xva r4 = (defpackage.xva) r4
            wa9 r6 = defpackage.wa9.a
            java.lang.String r6 = r2.b
            java.util.List r7 = r2.h
            java.lang.CharSequence r8 = r4.a(r6, r7, defpackage.wa9.b, false, 0, true)
            java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
            ws r4 = new ws
            r4.<init>((java.util.Collection) r15)
            java.util.Set r18 = kotlin.collections.SetsKt.emptySet()
            java.util.Set r19 = kotlin.collections.SetsKt.emptySet()
            if (r7 != 0) goto L_0x00ff
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            r20 = r6
            goto L_0x0101
        L_0x00ff:
            r20 = r7
        L_0x0101:
            java.util.Map r6 = r2.j
            if (r6 != 0) goto L_0x0109
            java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()
        L_0x0109:
            r22 = r6
            java.util.List r6 = r2.k
            if (r6 != 0) goto L_0x0113
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0113:
            r23 = r6
            java.util.Set r6 = r2.l
            if (r6 != 0) goto L_0x011d
            java.util.Set r6 = kotlin.collections.SetsKt.emptySet()
        L_0x011d:
            r24 = r6
            boolean r6 = r2.g
            r16 = r6
            java.lang.Long r6 = r2.i
            r21 = r6
            java.lang.String r7 = r2.a
            java.lang.String r9 = r2.c
            int r10 = r2.d
            java.util.Set r12 = r2.e
            r13 = 0
            r14 = 0
            r6 = r3
            r17 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.add(r3)
            goto L_0x00bb
        L_0x013b:
            return r0
        L_0x013c:
            r2.e(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
