package defpackage;

import kotlin.Lazy;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: j89  reason: default package */
public final class j89 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public j89(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.List r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.f89
            if (r0 == 0) goto L_0x0013
            r0 = r6
            f89 r0 = (defpackage.f89) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            f89 r0 = new f89
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            j89 r4 = r0.a
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
            boolean r5 = r6.isEmpty()
            r0 = 0
            if (r5 == 0) goto L_0x0059
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r4
        L_0x0059:
            kotlin.Lazy r5 = r4.d
            java.lang.Object r5 = r5.getValue()
            qx2 r5 = (defpackage.qx2) r5
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r6)
            ha9 r1 = (defpackage.ha9) r1
            long r1 = r1.z
            my2 r5 = (defpackage.my2) r5
            etc r5 = r5.o(r1)
            ome r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            a32 r5 = (defpackage.a32) r5
            if (r5 != 0) goto L_0x007e
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r4
        L_0x007e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L_0x008e
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x008e
            goto L_0x00a6
        L_0x008e:
            java.util.Iterator r6 = r6.iterator()
        L_0x0092:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00a6
            java.lang.Object r1 = r6.next()
            ha9 r1 = (defpackage.ha9) r1
            boolean r1 = r4.b(r5, r1)
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0092
            r3 = r0
        L_0x00a6:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j89.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b(a32 a32, ha9 ha9) {
        if (!a32.N()) {
            boolean y = a32.y();
            boolean z = ((vj5) g()).p() && a32.z() && ha9.w == ((qjd) f()).s();
            boolean z2 = ((vj5) g()).p() && (a32.e0() || ld9.F(a32.f(a32.w), 1024));
            if (a32.K()) {
                return y || z || z2;
            }
            if (y && (a32.e0() || a32.c0())) {
                return true;
            }
        }
        if (ha9.p()) {
            return false;
        }
        long s = ((qjd) f()).s();
        long j = ha9.w;
        if (j != s && (j != 0 || !a32.H())) {
            return false;
        }
        if (a32.H() && j != 0) {
            return false;
        }
        akd akd = (akd) ((bud) this.f.getValue());
        akd.getClass();
        if ((((qjd) f()).m() - ha9.o) / ((long) 1000) >= ((long) ((int) akd.r(PmsKey.f34edittimeout, (long) 86400)))) {
            return false;
        }
        return ha9.c != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0143, code lost:
        if (kotlin.text.StringsKt.isBlank(r0) == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0149, code lost:
        if (defpackage.ld8.U(r8) != false) goto L_0x014b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r13, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.g89
            if (r0 == 0) goto L_0x0013
            r0 = r15
            g89 r0 = (defpackage.g89) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            g89 r0 = new g89
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            long r13 = r0.b
            j89 r12 = r0.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x004d
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.Lazy r15 = r12.a
            java.lang.Object r15 = r15.getValue()
            to9 r15 = (defpackage.to9) r15
            r0.a = r12
            r0.b = r13
            r0.v = r3
            java.lang.Object r15 = r15.a(r13, r0)
            if (r15 != r1) goto L_0x004d
            return r1
        L_0x004d:
            ha9 r15 = (defpackage.ha9) r15
            if (r15 != 0) goto L_0x0056
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
            return r12
        L_0x0056:
            boolean r0 = r15.z()
            if (r0 == 0) goto L_0x0061
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
            return r12
        L_0x0061:
            kotlin.Lazy r0 = r12.b
            java.lang.Object r0 = r0.getValue()
            gb9 r0 = (defpackage.gb9) r0
            a89 r0 = defpackage.gb9.a(r0, r15)
            kotlin.Lazy r1 = r12.d
            java.lang.Object r1 = r1.getValue()
            qx2 r1 = (defpackage.qx2) r1
            long r4 = r15.z
            my2 r1 = (defpackage.my2) r1
            etc r1 = r1.o(r4)
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            a32 r1 = (defpackage.a32) r1
            if (r1 != 0) goto L_0x008c
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
            return r12
        L_0x008c:
            x23 r2 = r12.f()
            qjd r2 = (defpackage.qjd) r2
            long r4 = r2.s()
            long r6 = r15.w
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r4 = 0
            if (r2 != 0) goto L_0x009f
            r2 = r3
            goto L_0x00a0
        L_0x009f:
            r2 = r4
        L_0x00a0:
            java.util.List r5 = kotlin.collections.CollectionsKt.createListBuilder()
            cd9 r8 = r12.h()
            boolean r8 = r8.b(r1, r0)
            if (r8 == 0) goto L_0x00b3
            c89 r8 = defpackage.c89.Y
            r5.add(r8)
        L_0x00b3:
            cd9 r8 = r12.h()
            boolean r8 = r8.d(r1, r0)
            if (r8 == 0) goto L_0x00c2
            c89 r8 = defpackage.c89.v
            r5.add(r8)
        L_0x00c2:
            cd9 r8 = r12.h()
            r8.getClass()
            ha9 r8 = r0.a
            boolean r9 = defpackage.cd9.c(r1, r8)
            if (r9 == 0) goto L_0x00d6
            c89 r9 = defpackage.c89.a
            r5.add(r9)
        L_0x00d6:
            kotlin.Lazy r9 = r12.f
            java.lang.Object r9 = r9.getValue()
            bud r9 = (defpackage.bud) r9
            akd r9 = (defpackage.akd) r9
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r10 = ru.ok.tamtam.android.prefs.PmsKey.f36extfilesharing
            boolean r9 = r9.m(r10, r4)
            if (r9 == 0) goto L_0x00f9
            int r9 = r8.b()
            if (r9 != r3) goto L_0x00f9
            boolean r9 = r8.A()
            if (r9 == 0) goto L_0x00f9
            r9 = r3
            goto L_0x00fa
        L_0x00f9:
            r9 = r4
        L_0x00fa:
            uj5 r10 = r12.g()
            vj5 r10 = (defpackage.vj5) r10
            r10.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r11 = ru.ok.tamtam.android.prefs.PmsKey.f37extsharingvideo
            boolean r10 = r10.m(r11, r4)
            if (r10 == 0) goto L_0x0119
            int r10 = r8.b()
            if (r10 != r3) goto L_0x0119
            boolean r10 = r8.G()
            if (r10 == 0) goto L_0x0119
            r10 = r3
            goto L_0x011a
        L_0x0119:
            r10 = r4
        L_0x011a:
            if (r9 != 0) goto L_0x011e
            if (r10 == 0) goto L_0x0123
        L_0x011e:
            c89 r9 = defpackage.c89.w0
            r5.add(r9)
        L_0x0123:
            java.lang.String r9 = r8.y
            if (r9 == 0) goto L_0x012d
            boolean r9 = kotlin.text.StringsKt.isBlank(r9)
            if (r9 == 0) goto L_0x014b
        L_0x012d:
            mc9 r0 = r0.c
            if (r0 == 0) goto L_0x013c
            a89 r0 = r0.c
            if (r0 == 0) goto L_0x013c
            ha9 r0 = r0.a
            if (r0 == 0) goto L_0x013c
            java.lang.String r0 = r0.y
            goto L_0x013d
        L_0x013c:
            r0 = 0
        L_0x013d:
            if (r0 == 0) goto L_0x0145
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x014b
        L_0x0145:
            boolean r0 = defpackage.ld8.U(r8)
            if (r0 == 0) goto L_0x0150
        L_0x014b:
            c89 r0 = defpackage.c89.b
            r5.add(r0)
        L_0x0150:
            c89 r0 = defpackage.c89.o
            r5.add(r0)
            g20 r0 = defpackage.g20.c
            w28 r8 = r15.x0
            if (r8 == 0) goto L_0x0186
            java.lang.Object r9 = r8.b
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L_0x0162
            goto L_0x0186
        L_0x0162:
            g20 r10 = defpackage.g20.o
            boolean r10 = r15.n(r10)
            if (r10 != 0) goto L_0x0173
            boolean r10 = r15.n(r0)
            if (r10 == 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            r10 = r4
            goto L_0x0174
        L_0x0173:
            r10 = r3
        L_0x0174:
            int r9 = r9.size()
            if (r9 != r3) goto L_0x017c
            r9 = r3
            goto L_0x017d
        L_0x017c:
            r9 = r4
        L_0x017d:
            if (r10 == 0) goto L_0x0186
            if (r9 == 0) goto L_0x0186
            c89 r9 = defpackage.c89.Z
            r5.add(r9)
        L_0x0186:
            if (r8 == 0) goto L_0x01a0
            java.lang.Object r8 = r8.b
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L_0x018f
            goto L_0x01a0
        L_0x018f:
            boolean r0 = r15.n(r0)
            if (r0 == 0) goto L_0x01a0
            int r0 = r8.size()
            if (r0 != r3) goto L_0x01a0
            c89 r0 = defpackage.c89.v0
            r5.add(r0)
        L_0x01a0:
            boolean r0 = r15.x()
            if (r0 != 0) goto L_0x01cb
            boolean r0 = r1.x()
            if (r0 == 0) goto L_0x01cb
            long r8 = r15.c
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cb
            a89 r0 = r1.v
            if (r0 == 0) goto L_0x01c6
            ha9 r0 = r0.a
            long r8 = r0.b
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x01c6
            c89 r13 = defpackage.c89.z
            r5.add(r13)
            goto L_0x01cb
        L_0x01c6:
            c89 r13 = defpackage.c89.y
            r5.add(r13)
        L_0x01cb:
            x23 r13 = r12.f()
            qjd r13 = (defpackage.qjd) r13
            long r13 = r13.s()
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x01e8
            uj5 r13 = r12.g()
            boolean r13 = defpackage.cd9.a(r1, r13, r4)
            if (r13 == 0) goto L_0x01e8
            c89 r13 = defpackage.c89.c
            r5.add(r13)
        L_0x01e8:
            c89 r13 = defpackage.c89.X
            r5.add(r13)
            uj5 r13 = r12.g()
            boolean r13 = defpackage.cd9.a(r1, r13, r2)
            if (r13 == 0) goto L_0x01fc
            c89 r13 = defpackage.c89.w
            r5.add(r13)
        L_0x01fc:
            boolean r12 = r12.b(r1, r15)
            if (r12 == 0) goto L_0x0207
            c89 r12 = defpackage.c89.x
            r5.add(r12)
        L_0x0207:
            java.util.List r12 = kotlin.collections.CollectionsKt.build(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j89.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(long r9, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.h89
            if (r0 == 0) goto L_0x0013
            r0 = r11
            h89 r0 = (defpackage.h89) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            h89 r0 = new h89
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            long r9 = r0.b
            j89 r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x004d
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Lazy r11 = r8.a
            java.lang.Object r11 = r11.getValue()
            to9 r11 = (defpackage.to9) r11
            r0.a = r8
            r0.b = r9
            r0.v = r3
            java.lang.Object r11 = r11.a(r9, r0)
            if (r11 != r1) goto L_0x004d
            return r1
        L_0x004d:
            ha9 r11 = (defpackage.ha9) r11
            if (r11 != 0) goto L_0x0056
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            return r8
        L_0x0056:
            boolean r0 = r11.z()
            if (r0 == 0) goto L_0x0061
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            return r8
        L_0x0061:
            kotlin.Lazy r0 = r8.b
            java.lang.Object r0 = r0.getValue()
            gb9 r0 = (defpackage.gb9) r0
            a89 r0 = defpackage.gb9.a(r0, r11)
            kotlin.Lazy r1 = r8.d
            java.lang.Object r1 = r1.getValue()
            qx2 r1 = (defpackage.qx2) r1
            long r4 = r11.z
            my2 r1 = (defpackage.my2) r1
            etc r1 = r1.o(r4)
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            a32 r1 = (defpackage.a32) r1
            if (r1 != 0) goto L_0x008c
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            return r8
        L_0x008c:
            x23 r2 = r8.f()
            qjd r2 = (defpackage.qjd) r2
            long r4 = r2.s()
            long r6 = r11.w
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()
            c89 r4 = defpackage.c89.b
            r2.add(r4)
            cd9 r4 = r8.h()
            boolean r4 = r4.d(r1, r0)
            if (r4 == 0) goto L_0x00b6
            c89 r4 = defpackage.c89.v
            r2.add(r4)
        L_0x00b6:
            cd9 r4 = r8.h()
            r4.getClass()
            ha9 r0 = r0.a
            boolean r0 = defpackage.cd9.c(r1, r0)
            if (r0 == 0) goto L_0x00ca
            c89 r0 = defpackage.c89.a
            r2.add(r0)
        L_0x00ca:
            boolean r0 = r11.x()
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r1.x()
            if (r0 == 0) goto L_0x00f5
            long r4 = r11.c
            r6 = 0
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x00f5
            a89 r11 = r1.v
            if (r11 == 0) goto L_0x00f0
            ha9 r11 = r11.a
            long r4 = r11.b
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x00f0
            c89 r9 = defpackage.c89.z
            r2.add(r9)
            goto L_0x00f5
        L_0x00f0:
            c89 r9 = defpackage.c89.y
            r2.add(r9)
        L_0x00f5:
            uj5 r8 = r8.g()
            boolean r8 = defpackage.cd9.a(r1, r8, r3)
            if (r8 == 0) goto L_0x0104
            c89 r8 = defpackage.c89.w
            r2.add(r8)
        L_0x0104:
            java.util.List r8 = kotlin.collections.CollectionsKt.build(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j89.d(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.util.Set r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.i89
            if (r0 == 0) goto L_0x0013
            r0 = r8
            i89 r0 = (defpackage.i89) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            i89 r0 = new i89
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            j89 r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0049
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.Lazy r8 = r6.a
            java.lang.Object r8 = r8.getValue()
            to9 r8 = (defpackage.to9) r8
            r0.a = r6
            r0.o = r3
            java.lang.Object r8 = r8.b(r7, r0)
            if (r8 != r1) goto L_0x0049
            return r1
        L_0x0049:
            java.util.List r8 = (java.util.List) r8
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x0056
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            return r6
        L_0x0056:
            kotlin.Lazy r7 = r6.d
            java.lang.Object r7 = r7.getValue()
            qx2 r7 = (defpackage.qx2) r7
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r8)
            ha9 r0 = (defpackage.ha9) r0
            long r0 = r0.z
            my2 r7 = (defpackage.my2) r7
            etc r7 = r7.o(r0)
            ome r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            a32 r7 = (defpackage.a32) r7
            if (r7 != 0) goto L_0x007b
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            return r6
        L_0x007b:
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            c89 r1 = defpackage.c89.b
            r0.add(r1)
            java.util.Iterator r1 = r8.iterator()
        L_0x0088:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r1.next()
            ha9 r2 = (defpackage.ha9) r2
            cd9 r4 = r6.h()
            r4.getClass()
            boolean r2 = defpackage.cd9.c(r7, r2)
            if (r2 != 0) goto L_0x0088
            goto L_0x00a7
        L_0x00a2:
            c89 r1 = defpackage.c89.a
            r0.add(r1)
        L_0x00a7:
            java.util.Iterator r8 = r8.iterator()
        L_0x00ab:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00d5
            java.lang.Object r1 = r8.next()
            ha9 r1 = (defpackage.ha9) r1
            long r1 = r1.w
            x23 r4 = r6.f()
            qjd r4 = (defpackage.qjd) r4
            long r4 = r4.s()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x00c9
            r1 = r3
            goto L_0x00ca
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            uj5 r2 = r6.g()
            boolean r1 = defpackage.cd9.a(r7, r2, r1)
            if (r1 != 0) goto L_0x00ab
            goto L_0x00da
        L_0x00d5:
            c89 r6 = defpackage.c89.w
            r0.add(r6)
        L_0x00da:
            java.util.List r6 = kotlin.collections.CollectionsKt.build(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j89.e(java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final x23 f() {
        return (x23) this.e.getValue();
    }

    public final uj5 g() {
        return (uj5) this.g.getValue();
    }

    public final cd9 h() {
        return (cd9) this.c.getValue();
    }
}
