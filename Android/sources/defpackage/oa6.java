package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: oa6  reason: default package */
public final class oa6 extends SuspendLambda implements Function2 {
    public nk4 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List o;
    public final /* synthetic */ List v;
    public final /* synthetic */ qa6 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ CharSequence y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oa6(List list, List list2, qa6 qa6, boolean z, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.o = list;
        this.v = list2;
        this.w = qa6;
        this.x = z;
        this.y = charSequence;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        oa6 oa6 = new oa6(this.o, this.v, this.w, this.x, this.y, continuation);
        oa6.c = obj;
        return oa6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oa6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 3
            r4 = 0
            r5 = 2
            qa6 r6 = r0.w
            r7 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r7) goto L_0x0023
            if (r2 != r5) goto L_0x001b
            kotlin.ResultKt.throwOnFailure(r21)
            r2 = r21
            goto L_0x00e8
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            nk4 r2 = r0.a
            java.lang.Object r8 = r0.c
            ra3 r8 = (defpackage.ra3) r8
            kotlin.ResultKt.throwOnFailure(r21)
            r9 = r21
            goto L_0x0080
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r21)
            java.lang.Object r2 = r0.c
            d14 r2 = (defpackage.d14) r2
            sa3 r8 = defpackage.kne.b()
            la6 r9 = new la6
            r9.<init>(r6, r8, r4)
            nk4 r2 = defpackage.ev0.d(r2, r4, r9, r3)
            java.util.List r9 = r0.o
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            kotlin.coroutines.CoroutineContext r10 = r20.getContext()
            jx3 r10 = defpackage.e14.a(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r9, 10)
            r11.<init>(r12)
            java.util.Iterator r9 = r9.iterator()
        L_0x005c:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0073
            java.lang.Object r12 = r9.next()
            ma6 r13 = new ma6
            r13.<init>(r12, r4, r6)
            nk4 r12 = defpackage.ev0.d(r10, r4, r13, r3)
            r11.add(r12)
            goto L_0x005c
        L_0x0073:
            r0.c = r8
            r0.a = r2
            r0.b = r7
            java.lang.Object r9 = defpackage.j4b.g(r11, r0)
            if (r9 != r1) goto L_0x0080
            return r1
        L_0x0080:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            cx4 r10 = new cx4
            r11 = 26
            r10.<init>(r11)
            java.util.List r9 = kotlin.collections.CollectionsKt.sortedWith(r9, r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            kotlin.coroutines.CoroutineContext r10 = r20.getContext()
            jx3 r15 = defpackage.e14.a(r10)
            java.util.ArrayList r14 = new java.util.ArrayList
            int r10 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r9, 10)
            r14.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
        L_0x00a4:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00d9
            java.lang.Object r11 = r9.next()
            na6 r13 = new na6
            boolean r12 = r0.x
            qa6 r10 = r0.w
            r16 = 0
            r17 = r10
            r10 = r13
            r18 = r12
            r12 = r16
            r7 = r13
            r13 = r8
            r5 = r14
            r14 = r18
            r19 = r15
            r15 = r17
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r10 = r19
            nk4 r7 = defpackage.ev0.d(r10, r4, r7, r3)
            r5.add(r7)
            r14 = r5
            r15 = r10
            r5 = 2
            r7 = 1
            goto L_0x00a4
        L_0x00d9:
            r5 = r14
            r0.c = r4
            r0.a = r4
            r2 = 2
            r0.b = r2
            java.lang.Object r2 = defpackage.j4b.g(r5, r0)
            if (r2 != r1) goto L_0x00e8
            return r1
        L_0x00e8:
            java.util.List r2 = (java.util.List) r2
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x00f3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00f3:
            java.util.List r1 = kotlin.collections.CollectionsKt.createListBuilder()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            java.lang.CharSequence r2 = r0.y
            if (r2 == 0) goto L_0x012f
            boolean r3 = kotlin.text.StringsKt.isBlank(r2)
            if (r3 == 0) goto L_0x0107
            goto L_0x012f
        L_0x0107:
            kotlin.Lazy r3 = r6.d
            java.lang.Object r3 = r3.getValue()
            ar6 r3 = (defpackage.ar6) r3
            java.util.List r3 = r3.a(r4, r2)
            java.lang.String r10 = r2.toString()
            kvd r2 = new kvd
            if (r3 != 0) goto L_0x011f
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L_0x011f:
            r12 = r3
            r8 = 0
            r11 = 1
            r7 = r2
            r7.<init>(r8, r10, r11, r12)
            mvd r3 = new mvd
            r3.<init>(r2)
            r1.add(r3)
        L_0x012f:
            java.util.List r1 = kotlin.collections.CollectionsKt.build(r1)
            java.util.List r0 = r0.v
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x013b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x016d
            java.lang.Object r2 = r0.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.util.LinkedList r4 = new java.util.LinkedList
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            r4.<init>(r5)
            kud r5 = new kud
            r7 = 2
            r5.<init>(r2, r4, r7)
            r2 = 1
            r5.e = r2
            jvd r3 = new jvd
            r3.<init>(r5)
            kotlin.Lazy r4 = r6.b
            java.lang.Object r4 = r4.getValue()
            jqg r4 = (defpackage.jqg) r4
            r4.a(r3)
            goto L_0x013b
        L_0x016d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
