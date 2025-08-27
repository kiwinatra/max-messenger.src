package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;

/* renamed from: xk7  reason: default package */
public final class xk7 extends xag implements oh3 {
    public static final p9a y0 = new p9a(13);
    public static final /* synthetic */ KProperty[] z0;
    public final xme X;
    public final etc Y;
    public final wie Z;
    public final /* synthetic */ abg b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final wie v0;
    public final Lazy w;
    public final Regex w0;
    public final s85 x = new s85(0);
    public int x0;
    public final n6e y;
    public final g12 z;

    static {
        Class<xk7> cls = xk7.class;
        z0 = new KProperty[]{rae.s(cls, "findContactByPhoneJob", "getFindContactByPhoneJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;", 0)};
    }

    public xk7() {
        bk7 bk7 = bk7.a;
        Lazy h = bk7.getAccessor().h(oq6.class);
        Lazy h2 = bk7.getAccessor().h(aeb.class);
        Lazy h3 = bk7.getAccessor().h(qx2.class);
        Lazy h4 = bk7.getAccessor().h(eu3.class);
        Lazy h5 = bk7.getAccessor().h(rh3.class);
        Lazy h6 = bk7.getAccessor().h(gaf.class);
        abg abg = new abg(h5, new wg7(6));
        this.b = abg;
        this.c = h;
        this.o = h3;
        this.v = h4;
        this.w = h6;
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.y = b2;
        this.z = bs0.M(b2, new on2(abg.o, 28));
        xme a = f6e.a(xsa.b);
        this.X = a;
        va1 va1 = new va1(3, a, this, h6, h2);
        w14 w14 = new w14((ysa) a.getValue(), IntCompanionObject.MAX_VALUE, new igf(xua.j));
        this.Y = bs0.X(va1, this.a, z6e.a, w14);
        this.Z = o5a.U();
        this.v0 = o5a.U();
        this.w0 = new Regex("[^0-9+]");
        this.x0 = IntCompanionObject.MAX_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.xk7 r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof defpackage.qk7
            if (r0 == 0) goto L_0x0013
            r0 = r9
            qk7 r0 = (defpackage.qk7) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            qk7 r0 = new qk7
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.a
            ngf r6 = (defpackage.ngf) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0097
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            java.lang.Object r6 = r0.a
            xk7 r6 = (defpackage.xk7) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x006f
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r9)
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0054
            int r7 = defpackage.ead.f0
            igf r8 = new igf
            r8.<init>(r7)
        L_0x0051:
            r7 = r6
            r6 = r8
            goto L_0x0083
        L_0x0054:
            int r8 = r7.length()
            int r9 = r6.x0
            if (r8 <= r9) goto L_0x0064
            int r7 = defpackage.ead.g0
            igf r8 = new igf
            r8.<init>(r7)
            goto L_0x0051
        L_0x0064:
            r0.a = r6
            r0.o = r4
            java.lang.Object r9 = k(r7, r6, r0)
            if (r9 != r1) goto L_0x006f
            goto L_0x009f
        L_0x006f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L_0x007f
            int r7 = defpackage.xua.e
            igf r8 = new igf
            r8.<init>(r7)
            goto L_0x0051
        L_0x007f:
            r7 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0083:
            if (r6 == 0) goto L_0x0097
            n6e r7 = r7.y
            gk7 r8 = new gk7
            r8.<init>(r6)
            r0.a = r6
            r0.o = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x0097
            goto L_0x009f
        L_0x0097:
            if (r6 != 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r4 = 0
        L_0x009b:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk7.j(xk7, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(java.lang.String r8, defpackage.xk7 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.rk7
            if (r0 == 0) goto L_0x0013
            r0 = r10
            rk7 r0 = (defpackage.rk7) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            rk7 r0 = new rk7
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Long r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0070
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r2 = r8.length()
            r5 = r4
        L_0x0041:
            if (r5 >= r2) goto L_0x0055
            char r6 = r8.charAt(r5)
            char r6 = (char) r6
            char r7 = (char) r6
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 == 0) goto L_0x0052
            r10.append(r6)
        L_0x0052:
            int r5 = r5 + 1
            goto L_0x0041
        L_0x0055:
            java.lang.String r8 = r10.toString()
            java.lang.Long r8 = kotlin.text.StringsKt.toLongOrNull(r8)
            kotlin.Lazy r9 = r9.v
            java.lang.Object r9 = r9.getValue()
            eu3 r9 = (defpackage.eu3) r9
            r0.a = r8
            r0.c = r3
            vk3 r10 = r9.d()
            if (r10 != r1) goto L_0x0070
            return r1
        L_0x0070:
            vk3 r10 = (defpackage.vk3) r10
            long r9 = r10.s()
            if (r8 != 0) goto L_0x0079
            goto L_0x0082
        L_0x0079:
            long r0 = r8.longValue()
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r3 = r4
        L_0x0083:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk7.k(java.lang.String, xk7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final dtc e() {
        return this.b.o;
    }

    public final void i() {
        KProperty[] kPropertyArr = z0;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.Z;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
        KProperty kProperty2 = kPropertyArr[1];
        wie wie2 = this.v0;
        pm7 pm72 = (pm7) wie2.getValue(this, kProperty2);
        if (pm72 != null) {
            pm72.b((CancellationException) null);
        }
        wie2.setValue(this, kPropertyArr[1], (Object) null);
    }
}
