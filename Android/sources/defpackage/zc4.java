package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: zc4  reason: default package */
public final class zc4 implements Provider, zi6 {
    public static final w7b w = new Object();
    public static int x;
    public static final /* synthetic */ int y = 0;
    public final Object a;
    public final Object b;
    public final Object c;
    public Object o;
    public Object v;

    public /* synthetic */ zc4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
        this.v = obj5;
    }

    public void a(j05 j05, h05 h05, boolean z) {
        jbd.c((ao1) this.v);
        jbf jbf = (jbf) this.b;
        Resources resources = (Resources) this.a;
        lbe b2 = (h05 == null || !h05.o) ? ((g7a) this.c).b(resources, jbf) : ((g7a) this.o).b(resources, jbf);
        ao1 ao1 = new ao1(3, new p5((Object) this, (Object) j05, (Parcelable) h05, z, 4), new y3a(8, (Object) this));
        b2.l(ao1);
        this.v = ao1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x001c
            cia r0 = defpackage.jha.k(r1)
            goto L_0x00ae
        L_0x001c:
            java.lang.Object r2 = r0.b
            zf0 r2 = (defpackage.zf0) r2
            int r3 = r2.c
            r4 = 1
            int r3 = r3 + r4
            r2.c = r3
            r5 = 3
            r6 = 0
            if (r3 <= r5) goto L_0x002d
        L_0x002b:
            r8 = r6
            goto L_0x0087
        L_0x002d:
            vd5 r5 = r2.a
            long r8 = r5.a
            float r8 = (float) r8
            float r9 = r5.c
            double r9 = (double) r9
            float r3 = (float) r3
            r11 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r11
            double r12 = (double) r3
            double r9 = java.lang.Math.pow(r9, r12)
            float r3 = (float) r9
            float r8 = r8 * r3
            long r9 = r5.b
            float r3 = (float) r9
            float r8 = java.lang.Math.min(r8, r3)
            long r8 = (long) r8
            float r5 = r5.d
            r10 = 0
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x0050
            goto L_0x006d
        L_0x0050:
            float r8 = (float) r8
            float r5 = r5 * r8
            float r9 = r8 - r5
            float r9 = java.lang.Math.max(r9, r11)
            long r9 = (long) r9
            float r5 = r5 + r8
            float r3 = java.lang.Math.min(r5, r3)
            long r11 = (long) r3
            double r13 = java.lang.Math.random()
            long r11 = r11 - r9
            r15 = 1
            long r11 = r11 + r15
            double r11 = (double) r11
            double r13 = r13 * r11
            int r3 = (int) r13
            long r11 = (long) r3
            long r8 = r9 + r11
        L_0x006d:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0072
            goto L_0x002b
        L_0x0072:
            if (r3 < 0) goto L_0x00b5
            long r10 = r2.d
            long r10 = r10 + r8
            r2.d = r10
            long r12 = r2.b
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0081
            r3 = r4
            goto L_0x0082
        L_0x0081:
            r3 = 0
        L_0x0082:
            if (r3 != r4) goto L_0x0085
            goto L_0x002b
        L_0x0085:
            if (r3 != 0) goto L_0x00af
        L_0x0087:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00a3
            int r2 = r2.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r0.c
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r3.invoke(r1, r2)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r0 = r0.o
            lfd r0 = (defpackage.lfd) r0
            ala r0 = defpackage.jha.A(r8, r1, r0)
            goto L_0x00ae
        L_0x00a3:
            java.lang.Object r0 = r0.v
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
            cia r0 = defpackage.jha.k(r1)
        L_0x00ae:
            return r0
        L_0x00af:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Interval is invalid. Must be greater than 0."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc4.apply(java.lang.Object):java.lang.Object");
    }

    public void b() {
        ev0.g();
        pk4 pk4 = (pk4) this.c;
        pk4.getClass();
        ev0.g();
        ja0 ja0 = (ja0) pk4.d;
        Objects.requireNonNull(ja0);
        obd obd = (obd) pk4.b;
        Objects.requireNonNull(obd);
        pk4.getClass();
        za7 za7 = ja0.b;
        Objects.requireNonNull(za7);
        za7.a();
        za7 za72 = ja0.b;
        Objects.requireNonNull(za72);
        hd8.J(za72.e).d(new ex1(obd, 0), ryg.G());
        za7 za73 = ja0.c;
        if (za73 != null) {
            za73.a();
            hd8.J(ja0.c.e).d(new ex1((obd) null, 1), ryg.G());
        }
        ((pvb) this.o).getClass();
    }

    public Object c(Continuation continuation) {
        return ev0.I(((osa) ((gaf) ((Lazy) this.o).getValue())).b(), new hrd(this, (Continuation) null), continuation);
    }

    public Object get() {
        return new ci4((Executor) ((Provider) this.a).get(), (tp9) ((Provider) this.b).get(), (rm7) ((Provider) this.c).get(), (g95) ((Provider) this.o).get(), (q6f) ((Provider) this.v).get());
    }

    public zc4(Context context, voc voc, sjf sjf) {
        this.a = context;
        this.b = voc;
        this.c = sjf;
        this.v = new ao(4, this);
    }

    public zc4(Lazy lazy, Lazy lazy2, Lazy lazy3, Set set) {
        this.a = lazy3;
        this.b = set;
        this.c = lazy;
        this.o = lazy2;
        AtomicReference atomicReference = new AtomicReference(SetsKt.emptySet());
        this.v = atomicReference;
        if (!set.isEmpty()) {
            atomicReference.updateAndGet(new r76(1, this, new LinkedHashSet()));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc4(Lazy lazy, Lazy lazy2, Lazy lazy3, int i) {
        this(lazy, lazy2, (i & 4) != 0 ? null : lazy3, SetsKt.emptySet());
    }

    public zc4(po5 po5, bud bud, m95 m95, Context context, gaf gaf) {
        this.a = po5;
        this.b = bud;
        this.c = context;
        this.o = gaf;
        this.v = new faf(m95, new duc(19));
    }

    public zc4(ynb ynb, pv0 pv0, Bitmap.Config config, ExecutorService executorService) {
        this.a = ynb;
        this.b = pv0;
        this.c = config;
        this.o = executorService;
        this.v = new SparseArray();
    }

    public zc4(Context context, Resources resources, jbf jbf, g7a g7a, g7a g7a2) {
        this.a = resources;
        this.b = jbf;
        this.c = g7a;
        this.o = g7a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: npg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: vp9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: bt1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: bt1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: npg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: npg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: bt1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: bt1} */
    /* JADX WARNING: type inference failed for: r7v4, types: [pk4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, ejd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zc4(defpackage.z87 r19, android.util.Size r20, boolean r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 17
            r3 = 2
            r5 = 1
            r6 = 0
            r18.<init>()
            defpackage.ev0.g()
            r0.a = r1
            la0 r7 = defpackage.zzf.m0
            r8 = 0
            java.lang.Object r7 = r1.k(r7, r8)
            ds1 r7 = (defpackage.ds1) r7
            if (r7 == 0) goto L_0x01b1
            u40 r9 = new u40
            r9.<init>()
            r7.a(r1, r9)
            bx1 r7 = r9.d()
            r0.b = r7
            pk4 r7 = new pk4
            r7.<init>()
            r7.a = r8
            r7.e = r8
            r0.c = r7
            pvb r9 = new pvb
            il7 r10 = defpackage.ryg.F()
            la0 r11 = defpackage.fl7.Q
            java.lang.Object r10 = r1.k(r11, r10)
            java.util.concurrent.Executor r10 = (java.util.concurrent.Executor) r10
            java.util.Objects.requireNonNull(r10)
            r9.<init>(r10)
            r0.o = r9
            int r10 = r19.getInputFormat()
            la0 r11 = defpackage.z87.v
            java.lang.Object r11 = r1.k(r11, r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L_0x005f
            int r11 = r11.intValue()
        L_0x005d:
            r15 = r11
            goto L_0x0076
        L_0x005f:
            la0 r11 = defpackage.m97.D
            java.lang.Object r11 = r1.k(r11, r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L_0x0073
            int r11 = r11.intValue()
            r12 = 4101(0x1005, float:5.747E-42)
            if (r11 != r12) goto L_0x0073
            r15 = r12
            goto L_0x0076
        L_0x0073:
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x0076:
            la0 r11 = defpackage.z87.x
            java.lang.Object r1 = r1.k(r11, r8)
            defpackage.rae.w(r1)
            ja0 r1 = new ja0
            ez4 r8 = new ez4
            r8.<init>()
            ez4 r14 = new ez4
            r14.<init>()
            r11 = r1
            r12 = r20
            r13 = r10
            r19 = r14
            r14 = r15
            r4 = r15
            r15 = r21
            r16 = r8
            r17 = r19
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.v = r1
            java.lang.Object r0 = r7.d
            ja0 r0 = (defpackage.ja0) r0
            if (r0 != 0) goto L_0x00ac
            java.lang.Object r0 = r7.b
            obd r0 = (defpackage.obd) r0
            if (r0 != 0) goto L_0x00ac
            r0 = r5
            goto L_0x00ad
        L_0x00ac:
            r0 = r6
        L_0x00ad:
            java.lang.String r11 = "CaptureNode does not support recreation yet."
            defpackage.bs0.r(r11, r0)
            r7.d = r1
            r0 = r21 ^ 1
            fx1 r11 = new fx1
            r11.<init>(r6, r7)
            r12 = 4
            if (r0 == 0) goto L_0x00fc
            vp9 r0 = new vp9
            int r13 = r20.getWidth()
            int r14 = r20.getHeight()
            r0.<init>(r13, r14, r10, r12)
            fx1 r12 = r0.b
            bt1[] r13 = new defpackage.bt1[r3]
            r13[r6] = r11
            r13[r5] = r12
            java.util.List r11 = java.util.Arrays.asList(r13)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x00e3
            dt1 r11 = new dt1
            r11.<init>()
            goto L_0x00f6
        L_0x00e3:
            int r12 = r11.size()
            if (r12 != r5) goto L_0x00f0
            java.lang.Object r11 = r11.get(r6)
            bt1 r11 = (defpackage.bt1) r11
            goto L_0x00f6
        L_0x00f0:
            ct1 r12 = new ct1
            r12.<init>(r11)
            r11 = r12
        L_0x00f6:
            dx1 r12 = new dx1
            r12.<init>(r7, r6)
            goto L_0x0114
        L_0x00fc:
            npg r0 = new npg
            int r13 = r20.getWidth()
            int r14 = r20.getHeight()
            he r12 = defpackage.b59.n(r13, r14, r10, r12)
            r0.<init>((int) r2, (java.lang.Object) r12)
            r7.e = r0
            dx1 r12 = new dx1
            r12.<init>(r7, r5)
        L_0x0114:
            r1.a = r11
            android.view.Surface r11 = r0.getSurface()
            java.util.Objects.requireNonNull(r11)
            za7 r13 = r1.b
            if (r13 != 0) goto L_0x0123
            r13 = r5
            goto L_0x0124
        L_0x0123:
            r13 = r6
        L_0x0124:
            java.lang.String r14 = "The surface is already set."
            defpackage.bs0.r(r14, r13)
            za7 r13 = new za7
            r14 = r20
            r13.<init>(r11, r14, r10)
            r1.b = r13
            obd r1 = new obd
            r1.<init>(r0)
            r7.b = r1
            ms1 r1 = new ms1
            r1.<init>(r3, r7)
            ew6 r11 = defpackage.ryg.G()
            r0.k(r1, r11)
            r8.b = r12
            dx1 r0 = new dx1
            r0.<init>(r7, r3)
            r1 = r19
            r1.b = r0
            ub0 r0 = new ub0
            ez4 r1 = new ez4
            r1.<init>()
            ez4 r3 = new ez4
            r3.<init>()
            r0.<init>(r1, r3, r10, r4)
            r7.c = r0
            r9.b = r0
            mvb r0 = new mvb
            r0.<init>(r9, r6)
            r1.b = r0
            mvb r0 = new mvb
            r0.<init>(r9, r5)
            r3.b = r0
            sq6 r0 = new sq6
            r0.<init>(r2)
            r9.c = r0
            er7 r0 = new er7
            ykb r1 = r9.j
            r0.<init>((defpackage.ykb) r1)
            r9.d = r0
            t9a r0 = new t9a
            r1 = 13
            r0.<init>(r1)
            r9.f = r0
            ejd r0 = new ejd
            r0.<init>()
            r9.e = r0
            gga r0 = new gga
            r0.<init>((int) r1)
            r9.g = r0
            sx6 r0 = new sx6
            r0.<init>(r1)
            r9.i = r0
            r0 = 35
            if (r10 == r0) goto L_0x01a7
            boolean r0 = r9.k
            if (r0 == 0) goto L_0x01b0
        L_0x01a7:
            v9a r0 = new v9a
            r1 = 13
            r0.<init>((int) r1)
            r9.h = r0
        L_0x01b0:
            return
        L_0x01b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Implementation is missing option unpacker for "
            r2.<init>(r3)
            java.lang.String r3 = r19.toString()
            la0 r4 = defpackage.cdf.g0
            java.lang.Object r1 = r1.k(r4, r3)
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc4.<init>(z87, android.util.Size, boolean):void");
    }

    public zc4(ArrayList arrayList, List list) {
        this.a = arrayList;
        this.b = list;
        this.o = new SparseBooleanArray();
        this.c = new qae(0);
        int size = arrayList.size();
        int i = IntCompanionObject.MIN_VALUE;
        y7b y7b = null;
        for (int i2 = 0; i2 < size; i2++) {
            y7b y7b2 = (y7b) arrayList.get(i2);
            int i3 = y7b2.e;
            if (i3 > i) {
                y7b = y7b2;
                i = i3;
            }
        }
        this.v = y7b;
    }
}
