package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageWriter;
import android.text.Spannable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: oj0  reason: default package */
public final /* synthetic */ class oj0 implements ice, vu, qk3, fn7, h08, i08, lp8, hy8, zi6, p6f {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ oj0(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.o = obj2;
    }

    public Object a() {
        ((zyf) this.c).d.a((tc0) this.o, this.b + 1, false);
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [qae, java.util.Map] */
    /* JADX WARNING: type inference failed for: r3v0, types: [u62, java.lang.Object] */
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                w62 w62 = (w62) obj;
                ((r62) this.c).getClass();
                ? qae = new qae(0);
                for (Long l : (List) this.o) {
                    ? obj2 = new Object();
                    obj2.b = l.longValue();
                    obj2.a = this.b;
                    qae.put(l, new v62(obj2));
                }
                w62.R.putAll(qae);
                return;
            default:
                ehf ehf = (ehf) obj;
                int ordinal = ((sy7) this.o).ordinal();
                Spannable spannable = (Spannable) this.c;
                int i = this.b;
                if (ordinal == 1) {
                    spannable.setSpan(new xw6(ehf.c, i), ehf.a, ehf.b, 33);
                    return;
                } else if (ordinal == 2) {
                    spannable.setSpan(new lq0(ehf.c, i), ehf.a, ehf.b, 33);
                    return;
                } else if (ordinal == 3) {
                    spannable.setSpan(new k6c(ehf.c, i), ehf.a, ehf.b, 33);
                    return;
                } else {
                    return;
                }
        }
    }

    public Object apply(Object obj) {
        List list = (List) obj;
        ruc ruc = (ruc) this.c;
        ruc.getClass();
        int size = list.size();
        gb3 n = jha.n(list);
        int i = this.b;
        if (size == i) {
            return n;
        }
        z68.c("ruc", "getRecentContactsOldWay", new Object[0]);
        return new rha(jha.f(n, new mha(jha.n((List) this.o), new quc(ruc, 2), 1).m(new qbb(10), IntCompanionObject.MAX_VALUE)), new dre(17)).y((long) i);
    }

    public void b(cx8 cx8) {
        iy8 iy8 = (iy8) this.c;
        iy8.getClass();
        zp8 zp8 = (zp8) this.o;
        if (TextUtils.isEmpty(zp8.a)) {
            i8b.V("onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        zz7 k = iy8.w.k(cx8, tb7.t(ft7.h(zp8)));
        cs csVar = new cs(iy8, cx8, this.b);
        k.d(new uj6(0, k, csVar), dp4.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0179 A[Catch:{ all -> 0x01e4, all -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01bb A[Catch:{ all -> 0x01e4, all -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bd A[Catch:{ all -> 0x01e4, all -> 0x0170 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(defpackage.j55 r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            if (r1 == 0) goto L_0x0239
            java.lang.Object r3 = r0.c
            v94 r3 = (defpackage.v94) r3
            yvb r4 = r3.c
            ik0 r4 = (defpackage.ik0) r4
            qa7 r5 = r4.a
            r21.m0()
            h97 r6 = r1.c
            java.lang.String r6 = r6.a
            java.lang.String r7 = "image_format"
            r4.putExtra(r7, r6)
            android.net.Uri r4 = r5.b
            r14 = 0
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = r4.toString()
            goto L_0x0029
        L_0x0028:
            r4 = r14
        L_0x0029:
            r1.Y = r4
            java.lang.Object r4 = r0.o
            w94 r4 = (defpackage.w94) r4
            nt4 r6 = r5.t
            if (r6 != 0) goto L_0x0035
            nt4 r6 = r4.e
        L_0x0035:
            r7 = 16
            boolean r7 = defpackage.zi0.l(r2, r7)
            nt4 r8 = defpackage.nt4.a
            if (r6 == r8) goto L_0x0045
            nt4 r8 = defpackage.nt4.b
            if (r6 != r8) goto L_0x005d
            if (r7 != 0) goto L_0x005d
        L_0x0045:
            boolean r4 = r4.f
            if (r4 != 0) goto L_0x0051
            android.net.Uri r4 = r5.b
            boolean r4 = defpackage.mzf.e(r4)
            if (r4 != 0) goto L_0x005d
        L_0x0051:
            f8d r4 = r5.j
            v3d r5 = r5.i
            int r0 = r0.b
            int r0 = defpackage.y7e.h(r4, r5, r1, r0)
            r1.y = r0
        L_0x005d:
            yvb r15 = r3.c
            r0 = r15
            ik0 r0 = (defpackage.ik0) r0
            da7 r4 = r0.Z
            f7a r4 = r4.v
            r4.getClass()
            int r13 = r3.h
            r21.m0()
            h97 r4 = r1.c
            h97 r5 = defpackage.eg4.a
            if (r4 == r5) goto L_0x007c
            boolean r4 = defpackage.zi0.b(r22)
            if (r4 == 0) goto L_0x007c
            goto L_0x0239
        L_0x007c:
            boolean r4 = r3.f
            if (r4 != 0) goto L_0x0239
            boolean r4 = defpackage.j55.k0(r21)
            if (r4 != 0) goto L_0x0088
            goto L_0x0239
        L_0x0088:
            r21.m0()
            h97 r4 = r1.c
            h97 r5 = defpackage.eg4.c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            java.lang.String r12 = "DecodeProducer"
            bwb r11 = r3.d
            if (r4 == 0) goto L_0x00e6
            r21.m0()
            int r4 = r1.w
            long r4 = (long) r4
            r21.m0()
            int r6 = r1.x
            long r6 = (long) r6
            c97 r8 = r3.e
            android.graphics.Bitmap$Config r9 = r8.a
            int r9 = defpackage.vo0.b(r9)
            long r4 = r4 * r6
            long r6 = (long) r9
            long r4 = r4 * r6
            r6 = 104857600(0x6400000, double:5.1806538E-316)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00e6
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r21.m0()
            int r2 = r1.w
            r21.m0()
            int r1 = r1.x
            java.lang.String r4 = "Image is too big to attempt decoding: w = "
            java.lang.String r5 = ", h = "
            java.lang.String r6 = ", pixel config = "
            java.lang.StringBuilder r1 = defpackage.a81.n(r4, r2, r5, r1, r6)
            android.graphics.Bitmap$Config r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = ", max bitmap size = 104857600"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r11.d(r15, r12, r0, r14)
            r3.q(r0)
            goto L_0x0239
        L_0x00e6:
            r21.m0()
            h97 r4 = r1.c
            java.lang.String r4 = r4.a
            java.lang.String r5 = "unknown"
            if (r4 != 0) goto L_0x00f3
            r10 = r5
            goto L_0x00f4
        L_0x00f3:
            r10 = r4
        L_0x00f4:
            r21.m0()
            int r4 = r1.w
            r21.m0()
            int r6 = r1.x
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = "x"
            r7.append(r4)
            r7.append(r6)
            java.lang.String r16 = r7.toString()
            int r6 = r1.y
            java.lang.String r17 = java.lang.String.valueOf(r6)
            boolean r9 = defpackage.zi0.a(r22)
            if (r9 == 0) goto L_0x0128
            r7 = 8
            boolean r7 = defpackage.zi0.l(r2, r7)
            if (r7 != 0) goto L_0x0128
            r7 = 1
            goto L_0x0129
        L_0x0128:
            r7 = 0
        L_0x0129:
            r8 = 4
            boolean r8 = defpackage.zi0.l(r2, r8)
            qa7 r0 = r0.a
            v3d r0 = r0.i
            if (r0 == 0) goto L_0x014c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r14 = r0.a
            r5.append(r14)
            r5.append(r4)
            int r0 = r0.b
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r14 = r0
            goto L_0x014d
        L_0x014c:
            r14 = r5
        L_0x014d:
            gn7 r4 = r3.g     // Catch:{ all -> 0x0170 }
            monitor-enter(r4)     // Catch:{ all -> 0x0170 }
            r0 = r7
            long r6 = r4.i     // Catch:{ all -> 0x0232 }
            r18 = r13
            r19 = r14
            long r13 = r4.h     // Catch:{ all -> 0x0232 }
            long r6 = r6 - r13
            monitor-exit(r4)     // Catch:{ all -> 0x0170 }
            r4 = r15
            ik0 r4 = (defpackage.ik0) r4     // Catch:{ all -> 0x0170 }
            qa7 r4 = r4.a     // Catch:{ all -> 0x0170 }
            android.net.Uri r4 = r4.b     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0170 }
            if (r0 != 0) goto L_0x0173
            if (r8 == 0) goto L_0x016b
            goto L_0x0173
        L_0x016b:
            int r5 = r3.n(r1)     // Catch:{ all -> 0x0170 }
            goto L_0x0177
        L_0x0170:
            r0 = move-exception
            goto L_0x0235
        L_0x0173:
            int r5 = r21.o()     // Catch:{ all -> 0x0170 }
        L_0x0177:
            if (r0 != 0) goto L_0x0182
            if (r8 == 0) goto L_0x017c
            goto L_0x0182
        L_0x017c:
            bc7 r0 = r3.o()     // Catch:{ all -> 0x0170 }
        L_0x0180:
            r8 = r0
            goto L_0x0185
        L_0x0182:
            bc7 r0 = defpackage.bc7.d     // Catch:{ all -> 0x0170 }
            goto L_0x0180
        L_0x0185:
            r11.j(r15, r12)     // Catch:{ all -> 0x0170 }
            v33 r14 = r3.r(r1, r5, r8)     // Catch:{ DecodeException -> 0x01f7, Exception -> 0x01f2 }
            int r0 = r1.y     // Catch:{ Exception -> 0x01ed }
            r4 = 1
            if (r0 == r4) goto L_0x0194
            r0 = r2 | 16
            goto L_0x0195
        L_0x0194:
            r0 = r2
        L_0x0195:
            r4 = r3
            r5 = r14
            r2 = r11
            r11 = r16
            r13 = r12
            r12 = r19
            r20 = r0
            r1 = r13
            r0 = r18
            r13 = r17
            xb7 r4 = r4.m(r5, r6, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01e9 }
            r2.a(r15, r1, r4)     // Catch:{ all -> 0x01e9 }
            r1 = r21
            r3.t(r1, r14, r0)     // Catch:{ all -> 0x0170 }
            w94 r0 = r3.i     // Catch:{ all -> 0x0170 }
            b8d r0 = r0.j     // Catch:{ all -> 0x0170 }
            java.lang.Object r0 = r0.a     // Catch:{ all -> 0x0170 }
            r9 = r0
            u6h r9 = (defpackage.u6h) r9     // Catch:{ all -> 0x0170 }
            if (r14 != 0) goto L_0x01bd
            r14 = 0
            goto L_0x01cf
        L_0x01bd:
            s9a r8 = defpackage.y33.v     // Catch:{ all -> 0x0170 }
            r9.c()     // Catch:{ all -> 0x0170 }
            boolean r0 = r14 instanceof android.graphics.Bitmap     // Catch:{ all -> 0x0170 }
            jd4 r0 = new jd4     // Catch:{ all -> 0x0170 }
            r11 = 1
            r6 = r0
            r7 = r14
            r5 = 0
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0170 }
            r14 = r0
        L_0x01cf:
            boolean r0 = defpackage.zi0.a(r20)     // Catch:{ all -> 0x01e4 }
            r3.s(r0)     // Catch:{ all -> 0x01e4 }
            zi0 r0 = r3.b     // Catch:{ all -> 0x01e4 }
            r2 = r20
            r0.g(r2, r14)     // Catch:{ all -> 0x01e4 }
            defpackage.y33.U(r14)     // Catch:{ all -> 0x0170 }
            defpackage.j55.b(r21)
            goto L_0x0239
        L_0x01e4:
            r0 = move-exception
            defpackage.y33.U(r14)     // Catch:{ all -> 0x0170 }
            throw r0     // Catch:{ all -> 0x0170 }
        L_0x01e9:
            r0 = move-exception
            r1 = r21
            goto L_0x0235
        L_0x01ed:
            r0 = move-exception
            r2 = r11
            r13 = r12
            r5 = r14
            goto L_0x021c
        L_0x01f2:
            r0 = move-exception
            r2 = r11
            r13 = r12
        L_0x01f5:
            r5 = 0
            goto L_0x021c
        L_0x01f7:
            r0 = move-exception
            r2 = r11
            r13 = r12
            r5 = 0
            r11 = r0
            j55 r0 = r11.a     // Catch:{ Exception -> 0x021a }
            java.lang.String r12 = "ProgressiveDecoder"
            java.lang.String r14 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
            java.lang.String r5 = r11.getMessage()     // Catch:{ Exception -> 0x021a }
            java.lang.String r1 = r0.m()     // Catch:{ Exception -> 0x021a }
            int r0 = r0.o()     // Catch:{ Exception -> 0x021a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x021a }
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r4, r1, r0}     // Catch:{ Exception -> 0x021a }
            defpackage.bg5.o(r12, r14, r0)     // Catch:{ Exception -> 0x021a }
            throw r11     // Catch:{ Exception -> 0x021a }
        L_0x021a:
            r0 = move-exception
            goto L_0x01f5
        L_0x021c:
            r4 = r3
            r11 = r16
            r12 = r19
            r1 = r13
            r13 = r17
            xb7 r4 = r4.m(r5, r6, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0170 }
            r2.d(r15, r1, r0, r4)     // Catch:{ all -> 0x0170 }
            r3.q(r0)     // Catch:{ all -> 0x0170 }
            defpackage.j55.b(r21)
            goto L_0x0239
        L_0x0232:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0232 }
            throw r0     // Catch:{ all -> 0x0170 }
        L_0x0235:
            defpackage.j55.b(r21)
            throw r0
        L_0x0239:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj0.c(j55, int):void");
    }

    public void d(i67 i67, int i) {
        switch (this.a) {
            case 6:
                np8 np8 = (np8) this.c;
                oxd oxd = np8.k;
                oxd.getClass();
                int f = oxd.a.f();
                int i2 = this.b;
                ir8 ir8 = (ir8) this.o;
                wp8 wp8 = np8.c;
                if (f >= 2) {
                    i67.E0(wp8, i, i2, ir8.d(true));
                    return;
                }
                i67.E(wp8, i, i2 + 1, ir8.d(true));
                i67.L(wp8, i, i2);
                return;
            default:
                np8 np82 = (np8) this.c;
                np82.getClass();
                qb7 o2 = tb7.o();
                int i3 = 0;
                while (true) {
                    List list = (List) this.o;
                    if (i3 < list.size()) {
                        o2.a(((ir8) list.get(i3)).d(true));
                        i3++;
                    } else {
                        i67.U(np82.c, i, this.b, new gv0(o2.j()));
                        return;
                    }
                }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:31|(2:42|43)|44|45|46|47) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:32|33|34|35|36|37|38|39) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00dd */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x00ba=Splitter:B:36:0x00ba, B:46:0x00dd=Splitter:B:46:0x00dd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(defpackage.pbe r9) {
        /*
            r8 = this;
            int r0 = r8.b
            java.lang.Object r1 = r8.o
            java.lang.Object r2 = r8.c
            int r8 = r8.a
            switch(r8) {
                case 0: goto L_0x008c;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1f r2 = (defpackage.r1f) r2
            java.util.ArrayList r8 = r2.q
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x006c
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x006c
            a32 r3 = r2.n
            long r3 = r3.a
            mq0 r5 = r2.d
            r5.getClass()
            ln5 r5 = r5.a     // Catch:{ Exception -> 0x0035 }
            po5 r5 = (defpackage.po5) r5     // Catch:{ Exception -> 0x0035 }
            java.io.File r5 = r5.e(r3)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r5 = defpackage.cjf.D(r5)     // Catch:{ Exception -> 0x0035 }
            if (r5 == 0) goto L_0x0049
            nq0 r5 = (defpackage.nq0) r5     // Catch:{ Exception -> 0x0035 }
            goto L_0x004a
        L_0x0035:
            r5 = move-exception
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = r5.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r4 = "mq0"
            java.lang.String r5 = "Failed to load botCommands, chatId = %d, exception message = %s"
            defpackage.z68.c(r4, r5, r3)
        L_0x0049:
            r5 = 0
        L_0x004a:
            if (r5 != 0) goto L_0x004d
            goto L_0x006c
        L_0x004d:
            java.util.Map r3 = r5.b
            java.util.HashMap r3 = (java.util.HashMap) r3
            rt6 r4 = r2.f
            r4.getClass()
            java.util.List r5 = r5.a
            if (r5 != 0) goto L_0x005f
            java.util.List r3 = java.util.Collections.emptyList()
            goto L_0x0069
        L_0x005f:
            ba r6 = new ba
            r7 = 3
            r6.<init>(r7, r4, r3)
            java.util.ArrayList r3 = defpackage.cjf.F(r5, r6)
        L_0x0069:
            r2.g(r3)
        L_0x006c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r8)
            yze r8 = r2.d()
            java.lang.String r1 = (java.lang.String) r1
            p3a r2 = r2.e
            java.util.List r8 = r2.u(r1, r0, r3, r8)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            boolean r8 = r9.f()
            if (r8 != 0) goto L_0x008b
            r9.a(r0)
        L_0x008b:
            return
        L_0x008c:
            vd8 r2 = (defpackage.vd8) r2
            u9a r8 = r2.i
            r8.getClass()
            android.content.Context r1 = (android.content.Context) r1
            android.content.res.Resources r8 = r1.getResources()
            java.io.InputStream r8 = r8.openRawResource(r0)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00d3 }
            r1.<init>()     // Catch:{ IOException -> 0x00d3 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]     // Catch:{ IOException -> 0x00d3 }
        L_0x00a6:
            r4 = 0
            int r5 = r8.read(r3, r4, r2)     // Catch:{ all -> 0x00b2 }
            r6 = -1
            if (r5 == r6) goto L_0x00b4
            r1.write(r3, r4, r5)     // Catch:{ all -> 0x00b2 }
            goto L_0x00a6
        L_0x00b2:
            r9 = move-exception
            goto L_0x00d5
        L_0x00b4:
            r8.close()     // Catch:{ IOException -> 0x00b7 }
        L_0x00b7:
            r1.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            byte[] r8 = r1.toByteArray()     // Catch:{ IOException -> 0x00d3 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x00d3 }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r8, r2)     // Catch:{ IOException -> 0x00d3 }
            be8 r8 = new be8     // Catch:{ IOException -> 0x00d3 }
            r8.<init>(r1)     // Catch:{ IOException -> 0x00d3 }
            ce8 r0 = new ce8
            r0.<init>(r8)
            r9.a(r0)
            return
        L_0x00d3:
            r8 = move-exception
            goto L_0x00de
        L_0x00d5:
            if (r8 == 0) goto L_0x00da
            r8.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            r1.close()     // Catch:{ IOException -> 0x00dd }
        L_0x00dd:
            throw r9     // Catch:{ IOException -> 0x00d3 }
        L_0x00de:
            android.content.res.Resources$NotFoundException r9 = new android.content.res.Resources$NotFoundException
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read resource "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj0.h(pbe):void");
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                rob rob = (rob) obj;
                rob.getClass();
                rob.E((tob) this.c, (tob) this.o, this.b);
                return;
            default:
                sob sob = (sob) obj;
                int i = this.b;
                sob.p(i);
                sob.q((uob) this.c, (uob) this.o, i);
                return;
        }
    }

    public /* synthetic */ oj0(ruc ruc, List list) {
        this.a = 10;
        this.c = ruc;
        this.b = 10;
        this.o = list;
    }

    public /* synthetic */ oj0(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
    }

    public /* synthetic */ oj0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }

    /* renamed from: apply  reason: collision with other method in class */
    public zz7 m1544apply(Object obj) {
        ha7 ha7;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        ks1 ks1 = (ks1) this.c;
        ks1.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((List) this.o).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            lr1 lr1 = ks1.d;
            if (hasNext) {
                bx1 bx1 = (bx1) it.next();
                u40 u40 = new u40(bx1);
                it1 it1 = null;
                int i = bx1.c;
                if (i == 5) {
                    esg esg = lr1.l;
                    if (!esg.d && !esg.c) {
                        try {
                            ha7 = (ha7) esg.b.c();
                        } catch (NoSuchElementException unused) {
                            ha7 = null;
                        }
                        if (ha7 != null) {
                            esg esg2 = lr1.l;
                            esg2.getClass();
                            Image a0 = ha7.a0();
                            ImageWriter imageWriter = esg2.j;
                            if (!(imageWriter == null || a0 == null)) {
                                try {
                                    imageWriter.queueInputImage(a0);
                                    l97 imageInfo = ha7.getImageInfo();
                                    if (imageInfo instanceof jt1) {
                                        it1 = ((jt1) imageInfo).a;
                                    }
                                } catch (IllegalStateException e) {
                                    e.getMessage();
                                }
                            }
                        }
                    }
                }
                if (it1 != null) {
                    u40.h = it1;
                } else {
                    int i2 = (ks1.a != 3 || ks1.f) ? (i == -1 || i == 5) ? 2 : -1 : 4;
                    if (i2 != -1) {
                        u40.c = i2;
                    }
                }
                zq0 zq0 = ks1.e;
                if (zq0.b && this.b == 0 && zq0.a) {
                    pz9 c2 = pz9.c();
                    c2.f(vs1.o0(CaptureRequest.CONTROL_AE_MODE), 3);
                    u40.c(new wie(9, (Object) c5b.a(c2)));
                }
                arrayList.add(m5a.F(new ba(11, ks1, u40)));
                arrayList2.add(u40.d());
            } else {
                lr1.z(arrayList2);
                return hd8.b(arrayList);
            }
        }
    }
}
