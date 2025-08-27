package defpackage;

import kotlin.Lazy;

/* renamed from: na9  reason: default package */
public final class na9 {
    public final String a = na9.class.getName();
    public final Lazy b;
    public final Lazy c;

    public na9(Lazy lazy, Lazy lazy2) {
        this.b = lazy;
        this.c = lazy2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(boolean r9, java.util.List r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ma9
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ma9 r0 = (defpackage.ma9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            ma9 r0 = new ma9
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            boolean r9 = r0.c
            java.util.List r8 = r0.b
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            na9 r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x005a
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Lazy r11 = r8.b
            java.lang.Object r11 = r11.getValue()
            to9 r11 = (defpackage.to9) r11
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            r0.a = r8
            r4 = r10
            java.util.List r4 = (java.util.List) r4
            r0.b = r4
            r0.c = r9
            r0.w = r3
            java.lang.Object r11 = r11.b(r2, r0)
            if (r11 != r1) goto L_0x005a
            return r1
        L_0x005a:
            java.util.List r11 = (java.util.List) r11
            int r0 = r11.size()
            int r1 = r10.size()
            if (r0 == r1) goto L_0x0080
            int r10 = r10.size()
            int r0 = r11.size()
            java.lang.String r1 = "Requested to delete "
            java.lang.String r2 = " messages, but found only "
            java.lang.String r10 = defpackage.g63.h(r1, r10, r0, r2)
            java.lang.String r0 = r8.a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r10)
            defpackage.z68.f(r0, r10, r1)
        L_0x0080:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x008b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r11.next()
            r1 = r0
            ha9 r1 = (defpackage.ha9) r1
            long r1 = r1.z
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r1)
            java.lang.Object r2 = r10.get(r1)
            if (r2 != 0) goto L_0x00ac
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.put(r1, r2)
        L_0x00ac:
            java.util.List r2 = (java.util.List) r2
            r2.add(r0)
            goto L_0x008b
        L_0x00b2:
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00ba:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0115
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r0 = r11.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            kotlin.Lazy r0 = r8.c
            java.lang.Object r0 = r0.getValue()
            r7 = r0
            jqg r7 = (defpackage.jqg) r7
            kotlin.collections.CollectionsKt.emptyList()
            bl4 r6 = defpackage.bl4.REGULAR
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r11, 10)
            r3.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x00f3:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r11.next()
            ha9 r0 = (defpackage.ha9) r0
            long r4 = r0.b
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            r3.add(r0)
            goto L_0x00f3
        L_0x0109:
            nud r11 = new nud
            r4 = 0
            r0 = r11
            r5 = r9
            r0.<init>(r1, r3, r4, r5, r6)
            r7.a(r11)
            goto L_0x00ba
        L_0x0115:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na9.a(boolean, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
