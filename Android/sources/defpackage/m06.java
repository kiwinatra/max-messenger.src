package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: m06  reason: default package */
public final class m06 extends xag {
    public static final /* synthetic */ KProperty[] D0;
    public volatile zx5 A0;
    public final wie B0 = o5a.U();
    public final wie C0 = o5a.U();
    public final Lazy X;
    public final xme Y;
    public final etc Z;
    public final String b;
    public final long c;
    public final gaf o;
    public final u82 v;
    public final xme v0;
    public final Lazy w;
    public final etc w0;
    public final Lazy x;
    public final s85 x0 = new s85(0);
    public final Lazy y;
    public final AtomicReference y0 = new AtomicReference(new LinkedHashSet());
    public final Lazy z;
    public final AtomicReference z0 = new AtomicReference(xa8.a());

    static {
        Class<m06> cls = m06.class;
        D0 = new KProperty[]{rae.s(cls, "addChatsClickJob", "getAddChatsClickJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "addChatsResultJob", "getAddChatsResultJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public m06(String str, long j) {
        i66 i66 = i66.a;
        gaf gaf = (gaf) i66.getAccessor().g(gaf.class);
        Lazy h = i66.getAccessor().h(x23.class);
        Lazy h2 = i66.getAccessor().h(fq2.class);
        Lazy h3 = i66.getAccessor().h(qx2.class);
        Lazy h4 = i66.getAccessor().h(xva.class);
        Lazy h5 = i66.getAccessor().h(my2.class);
        this.b = str;
        this.c = j;
        this.o = gaf;
        this.v = (u82) i66.getAccessor().g(u82.class);
        this.w = h;
        this.x = h2;
        this.y = h3;
        this.z = h4;
        this.X = h5;
        xme a = f6e.a(new oz5());
        this.Y = a;
        this.Z = new etc(a);
        xme a2 = f6e.a(CollectionsKt.emptyList());
        this.v0 = a2;
        this.w0 = new etc(a2);
        if (str != null) {
            a.m((Object) null, new pz5(str, (CharSequence) null, 5));
            xag.g(this, ((osa) gaf).b(), (f14) null, new tz5(this, h4, h2, (Continuation) null), 2);
            return;
        }
        a.m((Object) null, new oz5());
        if (j != 0) {
            xag.g(this, ((osa) gaf).b(), (f14) null, new a06(this, h2, (Continuation) null), 2);
            return;
        }
        a2.setValue(CollectionsKt.listOf(new jz5((mgf) null, true), new l16(2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.m06 r13, java.util.Set r14, kotlin.coroutines.Continuation r15) {
        /*
            boolean r0 = r15 instanceof defpackage.j06
            if (r0 == 0) goto L_0x0013
            r0 = r15
            j06 r0 = (defpackage.j06) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.z = r1
            goto L_0x0018
        L_0x0013:
            j06 r0 = new j06
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.x
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r4) goto L_0x003a
            java.util.Iterator r13 = r0.w
            ws r14 = r0.v
            jz9 r2 = r0.o
            java.util.Set r5 = r0.c
            zx5 r6 = r0.b
            m06 r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r15)
            r11 = r7
            r7 = r14
            r14 = r11
            goto L_0x00a4
        L_0x003a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r15)
            zx5 r15 = r13.A0
            java.util.concurrent.atomic.AtomicReference r2 = r13.y0
            md2 r5 = new md2
            r6 = 3
            r5.<init>(r6)
            java.lang.Object r2 = r2.updateAndGet(r5)
            java.util.Set r2 = (java.util.Set) r2
            java.util.concurrent.atomic.AtomicReference r5 = r13.z0
            md2 r6 = new md2
            r7 = 4
            r6.<init>(r7)
            java.lang.Object r5 = r5.updateAndGet(r6)
            jz9 r5 = (defpackage.jz9) r5
            ws r6 = new ws
            r6.<init>((int) r3)
            java.util.Iterator r14 = r14.iterator()
            r11 = r14
            r14 = r13
            r13 = r11
            r12 = r5
            r5 = r2
            r2 = r12
        L_0x0072:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x00d1
            java.lang.Object r7 = r13.next()
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            kotlin.Lazy r9 = r14.y
            java.lang.Object r9 = r9.getValue()
            qx2 r9 = (defpackage.qx2) r9
            r0.a = r14
            r0.b = r15
            r0.c = r5
            r0.o = r2
            r0.v = r6
            r0.w = r13
            r0.z = r4
            java.lang.Object r7 = r9.d(r7, r0)
            if (r7 != r1) goto L_0x00a0
            goto L_0x0137
        L_0x00a0:
            r11 = r6
            r6 = r15
            r15 = r7
            r7 = r11
        L_0x00a4:
            a32 r15 = (defpackage.a32) r15
            m72 r8 = r15.b
            long r8 = r8.a
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
            r7.add(r8)
            if (r6 == 0) goto L_0x00cb
            java.util.Set r8 = r6.Y
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x00cb
            java.util.Set r8 = r6.Y
            m72 r9 = r15.b
            long r9 = r9.a
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            boolean r8 = r8.contains(r9)
            if (r8 != 0) goto L_0x00ce
        L_0x00cb:
            r5.add(r15)
        L_0x00ce:
            r15 = r6
            r6 = r7
            goto L_0x0072
        L_0x00d1:
            if (r15 == 0) goto L_0x00f9
            java.util.Set r13 = r15.Y
            if (r13 == 0) goto L_0x00f9
            java.util.Iterator r13 = r13.iterator()
        L_0x00db:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x00f9
            java.lang.Object r15 = r13.next()
            java.lang.Number r15 = (java.lang.Number) r15
            long r0 = r15.longValue()
            java.lang.Long r15 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            boolean r15 = r6.contains(r15)
            if (r15 != 0) goto L_0x00db
            r2.e(r0)
            goto L_0x00db
        L_0x00f9:
            boolean r13 = r2.c()
            if (r13 != 0) goto L_0x0109
            boolean r13 = r5.isEmpty()
            r13 = r13 ^ r4
            if (r13 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r13 = r3
            goto L_0x010a
        L_0x0109:
            r13 = r4
        L_0x010a:
            xme r15 = r14.Y
            java.lang.Object r15 = r15.getValue()
            boolean r15 = r15 instanceof defpackage.pz5
            if (r15 == 0) goto L_0x0135
            xme r14 = r14.Y
        L_0x0116:
            java.lang.Object r15 = r14.getValue()
            r0 = r15
            qz5 r0 = (defpackage.qz5) r0
            pz5 r0 = (defpackage.pz5) r0
            if (r13 != 0) goto L_0x0128
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            r1 = r3
            goto L_0x0129
        L_0x0128:
            r1 = r4
        L_0x0129:
            r2 = 0
            r5 = 3
            pz5 r0 = defpackage.pz5.b(r0, r2, r1, r5)
            boolean r15 = r14.b(r15, r0)
            if (r15 == 0) goto L_0x0116
        L_0x0135:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0137:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m06.j(m06, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11, types: [kotlin.coroutines.Continuation, q04] */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01aa, code lost:
        if (r12.z() == true) goto L_0x01b3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(defpackage.m06 r25, kotlin.coroutines.Continuation r26) {
        /*
            r0 = r25
            r1 = r26
            boolean r2 = r1 instanceof defpackage.k06
            if (r2 == 0) goto L_0x0017
            r2 = r1
            k06 r2 = (defpackage.k06) r2
            int r3 = r2.w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.w = r3
            goto L_0x001c
        L_0x0017:
            k06 r2 = new k06
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.o
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.w
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003c
            if (r4 != r6) goto L_0x0034
            java.lang.Object r0 = r2.c
            tz9 r4 = r2.b
            m06 r7 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0094
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r1)
            xme r1 = r0.v0
            r4 = r1
        L_0x0042:
            java.lang.Object r1 = r4.getValue()
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            zx5 r7 = r0.A0
            if (r7 == 0) goto L_0x00a9
            java.util.Set r7 = r7.Y
            if (r7 == 0) goto L_0x00a9
            kotlin.coroutines.CoroutineContext r8 = r2.getContext()
            jx3 r8 = defpackage.e14.a(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r7, 10)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x0066:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x007e
            java.lang.Object r10 = r7.next()
            l06 r11 = new l06
            r11.<init>(r10, r5, r0)
            r10 = 3
            nk4 r10 = defpackage.ev0.d(r8, r5, r11, r10)
            r9.add(r10)
            goto L_0x0066
        L_0x007e:
            r2.a = r0
            r2.b = r4
            r2.c = r1
            r2.w = r6
            java.lang.Object r7 = defpackage.j4b.g(r9, r2)
            if (r7 != r3) goto L_0x008e
            goto L_0x01e7
        L_0x008e:
            r24 = r7
            r7 = r0
            r0 = r1
            r1 = r24
        L_0x0094:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00a7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.filterNotNull(r1)
            r24 = r1
            r1 = r0
            r0 = r7
            r7 = r4
            r4 = r2
            r2 = r24
            goto L_0x00ac
        L_0x00a7:
            r1 = r0
            r0 = r7
        L_0x00a9:
            r7 = r4
            r4 = r2
            r2 = r5
        L_0x00ac:
            if (r2 != 0) goto L_0x00b2
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00b2:
            java.util.concurrent.atomic.AtomicReference r8 = r0.z0
            java.lang.Object r8 = r8.get()
            jz9 r8 = (defpackage.jz9) r8
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.concurrent.atomic.AtomicReference r9 = r0.y0
            java.lang.Object r9 = r9.get()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r9)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00d3:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x00ee
            java.lang.Object r10 = r2.next()
            r11 = r10
            a32 r11 = (defpackage.a32) r11
            m72 r11 = r11.b
            long r11 = r11.a
            boolean r11 = r8.a(r11)
            if (r11 != 0) goto L_0x00d3
            r9.add(r10)
            goto L_0x00d3
        L_0x00ee:
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()
            xme r8 = r0.Y
            java.lang.Object r8 = r8.getValue()
            qz5 r8 = (defpackage.qz5) r8
            java.lang.CharSequence r8 = r8.a()
            if (r8 != 0) goto L_0x0102
            java.lang.String r8 = ""
        L_0x0102:
            jz5 r10 = new jz5
            mgf r11 = new mgf
            r11.<init>(r8)
            zx5 r8 = r0.A0
            if (r8 == 0) goto L_0x0110
            java.util.Set r8 = r8.A0
            goto L_0x0111
        L_0x0110:
            r8 = r5
        L_0x0111:
            if (r8 != 0) goto L_0x0117
            java.util.Set r8 = kotlin.collections.SetsKt.emptySet()
        L_0x0117:
            a26 r12 = defpackage.a26.NO_TITLE_EDIT
            boolean r8 = r8.contains(r12)
            r8 = r8 ^ r6
            r10.<init>(r11, r8)
            r2.add(r10)
            l16 r8 = new l16
            boolean r10 = r9.isEmpty()
            r10 = r10 ^ r6
            if (r10 == 0) goto L_0x0131
            r10 = 536870914(0x20000002, float:1.0842024E-19)
            goto L_0x0132
        L_0x0131:
            r10 = 2
        L_0x0132:
            r8.<init>(r10)
            r2.add(r8)
            java.util.Iterator r8 = r9.iterator()
            r11 = 0
        L_0x013d:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x01c8
            java.lang.Object r12 = r8.next()
            int r13 = r11 + 1
            if (r11 >= 0) goto L_0x014e
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x014e:
            a32 r12 = (defpackage.a32) r12
            int r14 = r9.size()
            int r14 = r14 - r6
            if (r11 != r14) goto L_0x015d
            r11 = -2147483644(0xffffffff80000004, float:-5.6E-45)
        L_0x015a:
            r23 = r11
            goto L_0x0161
        L_0x015d:
            r11 = 1073741828(0x40000004, float:2.000001)
            goto L_0x015a
        L_0x0161:
            kotlin.Lazy r11 = r0.w
            java.lang.Object r11 = r11.getValue()
            x23 r11 = (defpackage.x23) r11
            android.net.Uri r11 = m(r12, r11)
            m16 r15 = new m16
            m72 r14 = r12.b
            long r5 = r14.a
            if (r11 == 0) goto L_0x017c
            java.lang.String r11 = r11.toString()
            r17 = r11
            goto L_0x017e
        L_0x017c:
            r17 = 0
        L_0x017e:
            kotlin.Lazy r11 = r0.x
            java.lang.Object r11 = r11.getValue()
            fq2 r11 = (defpackage.fq2) r11
            vb2 r11 = (defpackage.vb2) r11
            r11.getClass()
            r12.l0()
            java.lang.CharSequence r11 = r12.X
            long r19 = r12.g()
            r12.m0()
            java.lang.CharSequence r14 = r12.v0
            boolean r16 = r12.Y()
            if (r16 != 0) goto L_0x01b2
            vk3 r12 = r12.m()
            if (r12 == 0) goto L_0x01ad
            boolean r12 = r12.z()
            r10 = 1
            if (r12 != r10) goto L_0x01ae
            goto L_0x01b3
        L_0x01ad:
            r10 = 1
        L_0x01ae:
            r12 = r14
            r22 = 0
            goto L_0x01b6
        L_0x01b2:
            r10 = 1
        L_0x01b3:
            r22 = r10
            r12 = r14
        L_0x01b6:
            r14 = r15
            r10 = r15
            r15 = r5
            r18 = r11
            r21 = r12
            r14.<init>(r15, r17, r18, r19, r21, r22, r23)
            r2.add(r10)
            r11 = r13
            r5 = 0
            r6 = 1
            goto L_0x013d
        L_0x01c8:
            zx5 r5 = r0.A0
            if (r5 == 0) goto L_0x01db
            java.util.Set r5 = r5.A0
            a26 r6 = defpackage.a26.NO_DELETE
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x01db
            oy5 r5 = defpackage.oy5.a
            r2.add(r5)
        L_0x01db:
            java.util.List r2 = kotlin.collections.CollectionsKt.build(r2)
            boolean r1 = r7.b(r1, r2)
            if (r1 == 0) goto L_0x01e8
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
        L_0x01e7:
            return r3
        L_0x01e8:
            r2 = r4
            r4 = r7
            r5 = 0
            r6 = 1
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m06.k(m06, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Uri m(a32 a32, x23 x23) {
        Uri d;
        vk3 m = a32.m();
        if (m != null && (d = yd0.d(m, ((qjd) x23).p(), false)) != null) {
            return d;
        }
        String h = a32.h(kl0.b, jl0.a);
        if (h == null) {
            return null;
        }
        if (StringsKt.isBlank(h)) {
            h = null;
        }
        if (h != null) {
            return o5a.x(h);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(long r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.concurrent.atomic.AtomicReference r3 = r0.y0
            java.lang.Object r3 = r3.get()
            java.util.Set r3 = (java.util.Set) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0017
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0017
            goto L_0x003f
        L_0x0017:
            java.util.Iterator r4 = r3.iterator()
        L_0x001b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()
            a32 r5 = (defpackage.a32) r5
            m72 r5 = r5.b
            long r5 = r5.a
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x001b
            hg2 r4 = new hg2
            r5 = 2
            r4.<init>(r1, r5)
            rz5 r5 = new rz5
            r6 = 0
            r5.<init>(r6, r4)
            r3.removeIf(r5)
            goto L_0x004a
        L_0x003f:
            java.util.concurrent.atomic.AtomicReference r3 = r0.z0
            java.lang.Object r3 = r3.get()
            jz9 r3 = (defpackage.jz9) r3
            r3.e(r1)
        L_0x004a:
            xme r3 = r0.v0
        L_0x004c:
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x005e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x007c
            java.lang.Object r7 = r5.next()
            r8 = r7
            lz7 r8 = (defpackage.lz7) r8
            boolean r9 = r8 instanceof defpackage.m16
            if (r9 == 0) goto L_0x0078
            m16 r8 = (defpackage.m16) r8
            long r8 = r8.a
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x0078
            goto L_0x005e
        L_0x0078:
            r6.add(r7)
            goto L_0x005e
        L_0x007c:
            java.util.List r5 = kotlin.collections.CollectionsKt.toMutableList(r6)
            int r6 = r5.size()
            java.util.ListIterator r6 = r5.listIterator(r6)
        L_0x0088:
            boolean r7 = r6.hasPrevious()
            if (r7 == 0) goto L_0x012f
            java.lang.Object r7 = r6.previous()
            lz7 r7 = (defpackage.lz7) r7
            boolean r8 = r7 instanceof defpackage.oy5
            r9 = 1
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x0088
            int r6 = r5.lastIndexOf(r7)
            int r8 = r7.i()
            r10 = 1073741824(0x40000000, float:2.0)
            r10 = r10 & r8
            if (r10 == 0) goto L_0x00cf
            boolean r10 = r7 instanceof defpackage.m16
            if (r10 == 0) goto L_0x00cf
            m16 r7 = (defpackage.m16) r7
            m16 r8 = new m16
            long r11 = r7.a
            java.lang.String r13 = r7.b
            java.lang.CharSequence r14 = r7.c
            long r9 = r7.o
            java.lang.CharSequence r15 = r7.v
            boolean r7 = r7.w
            r19 = -2147483644(0xffffffff80000004, float:-5.6E-45)
            r16 = r9
            r10 = r8
            r9 = r15
            r15 = r16
            r17 = r9
            r18 = r7
            r10.<init>(r11, r13, r14, r15, r17, r18, r19)
            r5.set(r6, r8)
            goto L_0x00e3
        L_0x00cf:
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = r8 & r9
            if (r8 == 0) goto L_0x00e3
            boolean r8 = r7 instanceof defpackage.l16
            if (r8 == 0) goto L_0x00e3
            l16 r7 = (defpackage.l16) r7
            l16 r7 = new l16
            r8 = 2
            r7.<init>(r8)
            r5.set(r6, r7)
        L_0x00e3:
            boolean r4 = r3.b(r4, r5)
            if (r4 == 0) goto L_0x004c
            zx5 r3 = r0.A0
            r4 = 0
            if (r3 == 0) goto L_0x0101
            java.util.Set r3 = r3.Y
            if (r3 == 0) goto L_0x0101
            java.lang.Long r1 = java.lang.Long.valueOf(r21)
            boolean r1 = r3.contains(r1)
            r2 = 1
            if (r1 != r2) goto L_0x00ff
            r1 = r2
            goto L_0x0103
        L_0x00ff:
            r1 = r4
            goto L_0x0103
        L_0x0101:
            r2 = 1
            goto L_0x00ff
        L_0x0103:
            xme r3 = r0.Y
            java.lang.Object r3 = r3.getValue()
            boolean r3 = r3 instanceof defpackage.pz5
            if (r3 == 0) goto L_0x012e
            xme r0 = r0.Y
        L_0x010f:
            java.lang.Object r3 = r0.getValue()
            r5 = r3
            qz5 r5 = (defpackage.qz5) r5
            pz5 r5 = (defpackage.pz5) r5
            if (r1 != 0) goto L_0x0121
            boolean r6 = r5.c
            if (r6 == 0) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            r6 = r4
            goto L_0x0122
        L_0x0121:
            r6 = r2
        L_0x0122:
            r7 = 3
            r8 = 0
            pz5 r5 = defpackage.pz5.b(r5, r8, r6, r7)
            boolean r3 = r0.b(r3, r5)
            if (r3 == 0) goto L_0x010f
        L_0x012e:
            return
        L_0x012f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "List contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m06.l(long):void");
    }

    public final void n() {
        xag.g(this, ((osa) this.o).b(), (f14) null, new h06((qz5) this.Z.a.getValue(), this, (Continuation) null), 2);
    }
}
