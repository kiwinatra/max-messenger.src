package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: wc2  reason: default package */
public final class wc2 {
    public final j89 a;
    public final uj5 b;
    public final Lazy c = LazyKt.lazy(LazyThreadSafetyMode.NONE, new r52(3));

    public wc2(j89 j89, uj5 uj5) {
        this.a = j89;
        this.b = uj5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.a32 r9, defpackage.a89 r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.uc2
            if (r0 == 0) goto L_0x0013
            r0 = r11
            uc2 r0 = (defpackage.uc2) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            uc2 r0 = new uc2
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.util.List r8 = r0.o
            java.util.List r8 = (java.util.List) r8
            java.util.List r9 = r0.c
            java.util.List r9 = (java.util.List) r9
            a32 r10 = r0.b
            wc2 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r11
            r11 = r9
            r9 = r10
            r10 = r7
            goto L_0x008b
        L_0x0039:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.List r11 = kotlin.collections.CollectionsKt.createListBuilder()
            vk3 r2 = r10.b
            boolean r2 = r2.w
            uj5 r4 = r8.b
            boolean r2 = defpackage.cd9.a(r9, r4, r2)
            if (r2 == 0) goto L_0x0067
            pg3 r2 = new pg3
            int r4 = defpackage.jxa.X
            int r5 = defpackage.lxa.L1
            igf r6 = new igf
            r6.<init>(r5)
            og3 r5 = defpackage.og3.a
            r2.<init>(r4, r6, r5)
            r11.add(r2)
        L_0x0067:
            ha9 r10 = r10.a
            long r4 = r10.b
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            java.util.List r10 = kotlin.collections.CollectionsKt.listOf(r10)
            r0.a = r8
            r0.b = r9
            r2 = r11
            java.util.List r2 = (java.util.List) r2
            r0.c = r2
            r0.o = r2
            r0.x = r3
            j89 r2 = r8.a
            java.lang.Object r10 = r2.a(r10, r0)
            if (r10 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r0 = r8
            r8 = r11
        L_0x008b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00d2
            pg3 r10 = new pg3
            int r1 = defpackage.jxa.W
            boolean r2 = r9.N()
            if (r2 == 0) goto L_0x00c3
            vk3 r2 = r9.m()
            if (r2 == 0) goto L_0x00c3
            vk3 r9 = r9.m()
            if (r9 == 0) goto L_0x00ae
            java.lang.String r9 = r9.f()
            goto L_0x00af
        L_0x00ae:
            r9 = 0
        L_0x00af:
            if (r9 != 0) goto L_0x00b3
            java.lang.String r9 = ""
        L_0x00b3:
            int r2 = defpackage.lxa.C1
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            kgf r3 = new kgf
            java.util.List r9 = kotlin.collections.ArraysKt.toList((T[]) r9)
            r3.<init>(r2, r9)
            goto L_0x00ca
        L_0x00c3:
            int r9 = defpackage.lxa.B1
            igf r3 = new igf
            r3.<init>(r9)
        L_0x00ca:
            og3 r9 = defpackage.og3.a
            r10.<init>(r1, r3, r9)
            r8.add(r10)
        L_0x00d2:
            kotlin.Lazy r9 = r0.c
            java.lang.Object r9 = r9.getValue()
            pg3 r9 = (defpackage.pg3) r9
            r8.add(r9)
            java.util.List r8 = kotlin.collections.CollectionsKt.build(r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc2.a(a32, a89, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.a32 r7, defpackage.a89 r8, defpackage.m29 r9, kotlin.coroutines.Continuation r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.vc2
            if (r0 == 0) goto L_0x0013
            r0 = r10
            vc2 r0 = (defpackage.vc2) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            vc2 r0 = new vc2
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            ngf r6 = r0.c
            igf r7 = r0.b
            m29 r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00b6
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r10)
            boolean r10 = r9 instanceof defpackage.i29
            if (r10 == 0) goto L_0x0047
            int r2 = defpackage.lxa.G1
            igf r4 = new igf
            r4.<init>(r2)
            goto L_0x006a
        L_0x0047:
            boolean r2 = r9 instanceof defpackage.j29
            if (r2 == 0) goto L_0x0053
            int r2 = defpackage.lxa.I1
            igf r4 = new igf
            r4.<init>(r2)
            goto L_0x006a
        L_0x0053:
            boolean r2 = r9 instanceof defpackage.l29
            if (r2 == 0) goto L_0x005f
            int r2 = defpackage.lxa.K1
            igf r4 = new igf
            r4.<init>(r2)
            goto L_0x006a
        L_0x005f:
            boolean r2 = r9 instanceof defpackage.c29
            if (r2 == 0) goto L_0x00c4
            int r2 = defpackage.lxa.E1
            igf r4 = new igf
            r4.<init>(r2)
        L_0x006a:
            if (r10 == 0) goto L_0x0082
            int r10 = defpackage.lxa.F1
            r2 = r9
            i29 r2 = (defpackage.i29) r2
            java.lang.String r2 = r2.v
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            kgf r5 = new kgf
            java.util.List r2 = kotlin.collections.ArraysKt.toList((T[]) r2)
            r5.<init>(r10, r2)
            r2 = r5
            goto L_0x00a5
        L_0x0082:
            boolean r10 = r9 instanceof defpackage.j29
            if (r10 == 0) goto L_0x008e
            int r10 = defpackage.lxa.H1
            igf r2 = new igf
            r2.<init>(r10)
            goto L_0x00a5
        L_0x008e:
            boolean r10 = r9 instanceof defpackage.l29
            if (r10 == 0) goto L_0x009a
            int r10 = defpackage.lxa.J1
            igf r2 = new igf
            r2.<init>(r10)
            goto L_0x00a5
        L_0x009a:
            boolean r10 = r9 instanceof defpackage.c29
            if (r10 == 0) goto L_0x00be
            int r10 = defpackage.lxa.D1
            igf r2 = new igf
            r2.<init>(r10)
        L_0x00a5:
            r0.a = r9
            r0.b = r4
            r0.c = r2
            r0.w = r3
            java.lang.Object r10 = r6.a(r7, r8, r0)
            if (r10 != r1) goto L_0x00b4
            return r1
        L_0x00b4:
            r6 = r2
            r7 = r4
        L_0x00b6:
            java.util.List r10 = (java.util.List) r10
            lf2 r8 = new lf2
            r8.<init>(r9, r7, r6, r10)
            return r8
        L_0x00be:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x00c4:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc2.b(a32, a89, m29, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
