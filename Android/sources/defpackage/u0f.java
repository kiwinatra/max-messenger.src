package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: u0f  reason: default package */
public final class u0f extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ v0f b;
    public final /* synthetic */ CharSequence c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0f(v0f v0f, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.b = v0f;
        this.c = charSequence;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new u0f(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u0f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.a
            r3 = 1
            java.lang.CharSequence r4 = r0.c
            r5 = 3
            r6 = 2
            r7 = 0
            v0f r8 = r0.b
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            if (r2 == r6) goto L_0x0025
            if (r2 != r5) goto L_0x001d
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x017b
        L_0x001d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r18)
            r2 = r18
            goto L_0x008b
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x0049
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r18)
            i69 r2 = r8.w
            java.util.List r2 = r2.b(r4)
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L_0x004c
            n6e r2 = r8.E0
            r0.a = r3
            java.lang.Object r0 = r2.a(r7, r0)
            if (r0 != r1) goto L_0x0049
            return r1
        L_0x0049:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x004c:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0057:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x006f
            java.lang.Object r9 = r2.next()
            xa9 r9 = (defpackage.xa9) r9
            ta9 r9 = r9.a
            long r9 = r9.a
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            r3.add(r9)
            goto L_0x0057
        L_0x006f:
            b33 r2 = r8.O0
            if (r2 == 0) goto L_0x008e
            r0.a = r6
            java.lang.Object r6 = r2.b
            gaf r6 = (defpackage.gaf) r6
            osa r6 = (defpackage.osa) r6
            q04 r6 = r6.a()
            f0f r9 = new f0f
            r9.<init>(r2, r3, r7)
            java.lang.Object r2 = defpackage.ev0.I(r6, r9, r0)
            if (r2 != r1) goto L_0x008b
            return r1
        L_0x008b:
            java.util.List r2 = (java.util.List) r2
            goto L_0x008f
        L_0x008e:
            r2 = r7
        L_0x008f:
            if (r2 != 0) goto L_0x0095
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0095:
            l15 r3 = r8.Q0
            if (r3 == 0) goto L_0x009e
            java.util.ArrayList r2 = r3.C(r2)
            goto L_0x009f
        L_0x009e:
            r2 = r7
        L_0x009f:
            q0f r3 = new q0f
            r6 = 1
            r3.<init>(r8, r6)
            i69 r6 = r8.w
            r6.getClass()
            if (r4 == 0) goto L_0x016e
            boolean r9 = kotlin.text.StringsKt.isBlank(r4)
            if (r9 == 0) goto L_0x00b4
            goto L_0x016e
        L_0x00b4:
            android.text.SpannableStringBuilder r9 = r6.b
            r9.clear()
            r9.clearSpans()
            r9.append(r4)
            if (r2 == 0) goto L_0x00ee
            int r10 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            int r10 = kotlin.collections.MapsKt.mapCapacity(r10)
            r11 = 16
            int r10 = kotlin.ranges.RangesKt.coerceAtLeast((int) r10, (int) r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r10)
            java.util.Iterator r2 = r2.iterator()
        L_0x00d8:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x00ef
            java.lang.Object r10 = r2.next()
            o0f r10 = (defpackage.o0f) r10
            long r12 = r10.a
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11.put(r12, r10)
            goto L_0x00d8
        L_0x00ee:
            r11 = r7
        L_0x00ef:
            if (r11 != 0) goto L_0x00f5
            java.util.Map r11 = kotlin.collections.MapsKt.emptyMap()
        L_0x00f5:
            java.util.List r2 = r6.b(r4)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00ff:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x016c
            java.lang.Object r4 = r2.next()
            xa9 r4 = (defpackage.xa9) r4
            int r10 = r9.getSpanStart(r4)
            int r12 = r9.getSpanEnd(r4)
            r13 = -1
            if (r10 == r13) goto L_0x0169
            if (r12 == r13) goto L_0x0169
            java.lang.CharSequence r13 = r9.subSequence(r10, r12)
            r13.toString()
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            java.lang.Object[] r13 = r9.getSpans(r10, r12, r13)
            int r14 = r13.length
            r15 = 0
            r16 = r7
        L_0x0129:
            if (r15 >= r14) goto L_0x013d
            r7 = r13[r15]
            if (r16 != 0) goto L_0x0135
            boolean r5 = r7 instanceof defpackage.xa9
            if (r5 == 0) goto L_0x0135
            r16 = r7
        L_0x0135:
            r9.removeSpan(r7)
            int r15 = r15 + 1
            r5 = 3
            r7 = 0
            goto L_0x0129
        L_0x013d:
            ta9 r4 = r4.a
            long r4 = r4.a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r11.get(r4)
            o0f r4 = (defpackage.o0f) r4
            if (r4 == 0) goto L_0x0169
            r6 r5 = new r6
            r7 = 13
            r5.<init>(r7, r3)
            j0f r7 = new j0f
            kotlin.jvm.functions.Function0 r13 = r6.a
            r7.<init>(r13, r4, r5)
            r4 = 17
            r9.setSpan(r7, r10, r12, r4)
            r5 = r16
            xa9 r5 = (defpackage.xa9) r5
            if (r5 == 0) goto L_0x0169
            r9.setSpan(r5, r10, r12, r4)
        L_0x0169:
            r5 = 3
            r7 = 0
            goto L_0x00ff
        L_0x016c:
            r7 = r9
            goto L_0x016f
        L_0x016e:
            r7 = 0
        L_0x016f:
            n6e r2 = r8.E0
            r3 = 3
            r0.a = r3
            java.lang.Object r0 = r2.a(r7, r0)
            if (r0 != r1) goto L_0x017b
            return r1
        L_0x017b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u0f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
