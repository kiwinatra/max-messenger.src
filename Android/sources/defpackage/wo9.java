package defpackage;

import kotlin.Lazy;

/* renamed from: wo9  reason: default package */
public final class wo9 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public wo9(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d A[EDGE_INSN: B:30:0x008d->B:27:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.List r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.uo9
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uo9 r0 = (defpackage.uo9) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            uo9 r0 = new uo9
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            wo9 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Lazy r6 = r4.a
            java.lang.Object r6 = r6.getValue()
            to9 r6 = (defpackage.to9) r6
            java.util.Collection r5 = (java.util.Collection) r5
            r0.a = r4
            r0.o = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto L_0x005d
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x005d
            goto L_0x008d
        L_0x005d:
            java.util.Iterator r5 = r6.iterator()
        L_0x0061:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x008d
            java.lang.Object r6 = r5.next()
            ha9 r6 = (defpackage.ha9) r6
            boolean r6 = r6.o()
            if (r6 == 0) goto L_0x0061
            kotlin.Lazy r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            epa r4 = (defpackage.epa) r4
            kotlin.Lazy r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            edb r4 = (defpackage.edb) r4
            java.lang.String[] r5 = defpackage.edb.m
            boolean r4 = r4.b(r5)
            if (r4 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r3 = 0
        L_0x008d:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo9.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r23, java.util.List r25, kotlin.coroutines.Continuation r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            boolean r3 = r2 instanceof defpackage.vo9
            if (r3 == 0) goto L_0x0019
            r3 = r2
            vo9 r3 = (defpackage.vo9) r3
            int r4 = r3.x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.x = r4
            goto L_0x001e
        L_0x0019:
            vo9 r3 = new vo9
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.v
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.x
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0058
            if (r5 == r8) goto L_0x0046
            if (r5 != r6) goto L_0x003e
            long r0 = r3.o
            long r9 = r3.c
            java.lang.Object r5 = r3.b
            java.util.Iterator r5 = (java.util.Iterator) r5
            wo9 r11 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00ae
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            long r0 = r3.c
            java.lang.Object r5 = r3.b
            java.util.List r5 = (java.util.List) r5
            wo9 r9 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r20 = r0
            r1 = r5
            r0 = r9
            r9 = r20
            goto L_0x006c
        L_0x0058:
            kotlin.ResultKt.throwOnFailure(r2)
            r3.a = r0
            r3.b = r1
            r9 = r23
            r3.c = r9
            r3.x = r8
            java.lang.Object r2 = r0.a(r1, r3)
            if (r2 != r4) goto L_0x006c
            return r4
        L_0x006c:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0079
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            return r0
        L_0x0079:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r1 = kotlin.collections.CollectionsKt.toSet(r1)
            java.util.Iterator r1 = r1.iterator()
            r11 = r0
            r5 = r1
        L_0x0085:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            kotlin.Lazy r2 = r11.a
            java.lang.Object r2 = r2.getValue()
            to9 r2 = (defpackage.to9) r2
            r3.a = r11
            r3.b = r5
            r3.c = r9
            r3.o = r0
            r3.x = r6
            java.lang.Object r2 = r2.a(r0, r3)
            if (r2 != r4) goto L_0x00ae
            return r4
        L_0x00ae:
            ha9 r2 = (defpackage.ha9) r2
            if (r2 != 0) goto L_0x00b7
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            return r0
        L_0x00b7:
            bl4 r12 = r2.S0
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x00ed
            if (r12 != r8) goto L_0x00e7
            tvd r15 = new tvd
            long r18 = java.lang.System.currentTimeMillis()
            cl4 r2 = r2.R0
            if (r2 == 0) goto L_0x00d2
            boolean r2 = r2.b
            if (r2 != r8) goto L_0x00d2
            r17 = r8
            goto L_0x00d4
        L_0x00d2:
            r17 = r7
        L_0x00d4:
            r12 = r15
            r13 = r9
            r2 = r15
            r15 = r0
            r12.<init>(r13, r15, r17, r18)
            kotlin.Lazy r0 = r11.b
            java.lang.Object r0 = r0.getValue()
            jqg r0 = (defpackage.jqg) r0
            r0.a(r2)
            goto L_0x0085
        L_0x00e7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ed:
            yud r2 = new yud
            r2.<init>(r9, r0)
            kotlin.Lazy r0 = r11.b
            java.lang.Object r0 = r0.getValue()
            jqg r0 = (defpackage.jqg) r0
            r0.a(r2)
            goto L_0x0085
        L_0x00fe:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo9.b(long, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
