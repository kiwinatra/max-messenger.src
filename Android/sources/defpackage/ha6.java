package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ha6  reason: default package */
public final class ha6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ d19 o;
    public final /* synthetic */ List v;
    public final /* synthetic */ long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ha6(List list, CharSequence charSequence, d19 d19, List list2, long j, Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = charSequence;
        this.o = d19;
        this.v = list2;
        this.w = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ha6(this.b, this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ha6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.a
            r2 = 3
            r3 = 0
            r4 = 2
            d19 r5 = r13.o
            r6 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r6) goto L_0x001f
            if (r1 != r4) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00a5
        L_0x0017:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x005f
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r14)
            java.util.List r14 = r13.b
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            kotlin.coroutines.CoroutineContext r1 = r13.getContext()
            jx3 r1 = defpackage.e14.a(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r14, 10)
            r7.<init>(r8)
            java.util.Iterator r14 = r14.iterator()
        L_0x003f:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x0056
            java.lang.Object r8 = r14.next()
            fa6 r9 = new fa6
            r9.<init>(r8, r3, r5)
            nk4 r8 = defpackage.ev0.d(r1, r3, r9, r2)
            r7.add(r8)
            goto L_0x003f
        L_0x0056:
            r13.a = r6
            java.lang.Object r14 = defpackage.j4b.g(r7, r13)
            if (r14 != r0) goto L_0x005f
            return r0
        L_0x005f:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            cx4 r1 = new cx4
            r7 = 25
            r1.<init>(r7)
            java.util.List r14 = kotlin.collections.CollectionsKt.sortedWith(r14, r1)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            kotlin.coroutines.CoroutineContext r1 = r13.getContext()
            jx3 r1 = defpackage.e14.a(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r14, 10)
            r7.<init>(r8)
            java.util.Iterator r14 = r14.iterator()
        L_0x0083:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x009c
            java.lang.Object r8 = r14.next()
            ga6 r9 = new ga6
            long r10 = r13.w
            r9.<init>(r8, r3, r10)
            nk4 r8 = defpackage.ev0.d(r1, r3, r9, r2)
            r7.add(r8)
            goto L_0x0083
        L_0x009c:
            r13.a = r4
            java.lang.Object r14 = defpackage.j4b.g(r7, r13)
            if (r14 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            java.util.List r14 = (java.util.List) r14
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x00b0
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L_0x00b0:
            java.lang.CharSequence r0 = r13.c
            if (r0 == 0) goto L_0x00ee
            boolean r1 = kotlin.text.StringsKt.isBlank(r0)
            if (r1 == 0) goto L_0x00bb
            goto L_0x00ee
        L_0x00bb:
            java.lang.Object r1 = r5.a
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            ar6 r1 = (defpackage.ar6) r1
            java.util.List r1 = r1.a(r3, r0)
            java.lang.String r10 = r0.toString()
            kvd r0 = new kvd
            if (r1 != 0) goto L_0x00d5
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00d5:
            r12 = r1
            r8 = 0
            r11 = 1
            r7 = r0
            r7.<init>(r8, r10, r11, r12)
            mvd r1 = new mvd
            r1.<init>(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.List r14 = kotlin.collections.CollectionsKt.plus(r0, r14)
        L_0x00ee:
            java.util.List r13 = r13.v
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x00f6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r0 = r13.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.util.LinkedList r2 = new java.util.LinkedList
            r3 = r14
            java.util.Collection r3 = (java.util.Collection) r3
            r2.<init>(r3)
            kud r3 = new kud
            r4 = 2
            r3.<init>(r0, r2, r4)
            r3.e = r6
            jvd r0 = new jvd
            r0.<init>(r3)
            java.lang.Object r1 = r5.c
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            jqg r1 = (defpackage.jqg) r1
            r1.a(r0)
            goto L_0x00f6
        L_0x0129:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
