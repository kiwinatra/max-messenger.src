package defpackage;

/* renamed from: ko0  reason: default package */
public class ko0 implements xvb {
    public final /* synthetic */ int a;
    public final z59 b;
    public final cd4 c;
    public final xvb d;

    public /* synthetic */ ko0(z59 z59, cd4 cd4, xvb xvb, int i) {
        this.a = i;
        this.b = z59;
        this.c = cd4;
        this.d = xvb;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f0, code lost:
        if (r7 != false) goto L_0x01f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.zi0 r13, defpackage.yvb r14) {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L_0x015e;
                case 1: goto L_0x0082;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = r14
            ik0 r0 = (defpackage.ik0) r0
            bwb r1 = r0.c
            qa7 r2 = r0.a
            bsb r3 = r2.q
            xvb r4 = r12.d
            if (r3 == 0) goto L_0x007e
            qx0 r3 = r3.b()
            if (r3 != 0) goto L_0x0019
            goto L_0x007e
        L_0x0019:
            java.lang.String r3 = "PostprocessedBitmapMemoryCacheProducer"
            r1.j(r14, r3)
            cd4 r5 = r12.c
            java.lang.Object r6 = r0.o
            io0 r5 = r5.j(r2, r6)
            r6 = 1
            boolean r7 = r2.d(r6)
            z59 r12 = r12.b
            r8 = 0
            if (r7 == 0) goto L_0x0035
            y33 r7 = r12.get(r5)
            goto L_0x0036
        L_0x0035:
            r7 = r8
        L_0x0036:
            java.lang.String r9 = "cached_value_found"
            if (r7 == 0) goto L_0x005f
            boolean r12 = r1.i(r14, r3)
            if (r12 == 0) goto L_0x0046
            java.lang.String r12 = "true"
            java.util.Map r8 = defpackage.xb7.a(r9, r12)
        L_0x0046:
            r1.a(r14, r3, r8)
            r1.e(r14, r3, r6)
            java.lang.String r12 = "memory_bitmap"
            java.lang.String r14 = "postprocessed"
            r0.h(r12, r14)
            r12 = 1065353216(0x3f800000, float:1.0)
            r13.i(r12)
            r13.g(r6, r7)
            r7.close()
            goto L_0x0081
        L_0x005f:
            r0 = 2
            boolean r0 = r2.d(r0)
            k55 r2 = new k55
            zqd r12 = (defpackage.zqd) r12
            r2.<init>((defpackage.zi0) r13, (defpackage.io0) r5, (defpackage.zqd) r12, (boolean) r0)
            boolean r12 = r1.i(r14, r3)
            if (r12 == 0) goto L_0x0077
            java.lang.String r12 = "false"
            java.util.Map r8 = defpackage.xb7.a(r9, r12)
        L_0x0077:
            r1.a(r14, r3, r8)
            r4.a(r2, r14)
            goto L_0x0081
        L_0x007e:
            r4.a(r13, r14)
        L_0x0081:
            return
        L_0x0082:
            java.lang.String r0 = "EncodedMemoryCacheProducer"
            defpackage.tf6.P()     // Catch:{ all -> 0x00b8 }
            r1 = r14
            ik0 r1 = (defpackage.ik0) r1     // Catch:{ all -> 0x00b8 }
            bwb r1 = r1.c     // Catch:{ all -> 0x00b8 }
            r1.j(r14, r0)     // Catch:{ all -> 0x00b8 }
            r2 = r14
            ik0 r2 = (defpackage.ik0) r2     // Catch:{ all -> 0x00b8 }
            qa7 r2 = r2.a     // Catch:{ all -> 0x00b8 }
            cd4 r3 = r12.c     // Catch:{ all -> 0x00b8 }
            r4 = r14
            ik0 r4 = (defpackage.ik0) r4     // Catch:{ all -> 0x00b8 }
            java.lang.Object r4 = r4.o     // Catch:{ all -> 0x00b8 }
            r3.getClass()     // Catch:{ all -> 0x00b8 }
            android.net.Uri r2 = r2.b     // Catch:{ all -> 0x00b8 }
            uae r2 = r3.g(r2)     // Catch:{ all -> 0x00b8 }
            r3 = r14
            ik0 r3 = (defpackage.ik0) r3     // Catch:{ all -> 0x00b8 }
            qa7 r3 = r3.a     // Catch:{ all -> 0x00b8 }
            r4 = 4
            boolean r3 = r3.d(r4)     // Catch:{ all -> 0x00b8 }
            z59 r4 = r12.b
            r5 = 0
            if (r3 == 0) goto L_0x00bb
            y33 r3 = r4.get(r2)     // Catch:{ all -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r12 = move-exception
            goto L_0x015a
        L_0x00bb:
            r3 = r5
        L_0x00bc:
            java.lang.String r6 = "memory_encoded"
            r7 = 1
            java.lang.String r8 = "cached_value_found"
            if (r3 == 0) goto L_0x00fc
            j55 r12 = new j55     // Catch:{ all -> 0x00f6 }
            r12.<init>(r3)     // Catch:{ all -> 0x00f6 }
            boolean r2 = r1.i(r14, r0)     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x00d7
            java.lang.String r2 = "true"
            java.util.Map r5 = defpackage.xb7.a(r8, r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x00d7
        L_0x00d5:
            r13 = move-exception
            goto L_0x00f8
        L_0x00d7:
            r1.a(r14, r0, r5)     // Catch:{ all -> 0x00d5 }
            r1.e(r14, r0, r7)     // Catch:{ all -> 0x00d5 }
            ik0 r14 = (defpackage.ik0) r14     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "default"
            r14.h(r6, r0)     // Catch:{ all -> 0x00d5 }
            r14 = 1065353216(0x3f800000, float:1.0)
            r13.i(r14)     // Catch:{ all -> 0x00d5 }
            r13.g(r7, r12)     // Catch:{ all -> 0x00d5 }
            defpackage.j55.b(r12)     // Catch:{ all -> 0x00f6 }
        L_0x00ef:
            defpackage.y33.U(r3)     // Catch:{ all -> 0x00b8 }
            defpackage.tf6.P()
            goto L_0x0155
        L_0x00f6:
            r12 = move-exception
            goto L_0x0156
        L_0x00f8:
            defpackage.j55.b(r12)     // Catch:{ all -> 0x00f6 }
            throw r13     // Catch:{ all -> 0x00f6 }
        L_0x00fc:
            r9 = r14
            ik0 r9 = (defpackage.ik0) r9     // Catch:{ all -> 0x00f6 }
            pa7 r9 = r9.v     // Catch:{ all -> 0x00f6 }
            int r9 = r9.a     // Catch:{ all -> 0x00f6 }
            r10 = 3
            java.lang.String r11 = "false"
            if (r9 < r10) goto L_0x0126
            boolean r12 = r1.i(r14, r0)     // Catch:{ all -> 0x00f6 }
            if (r12 == 0) goto L_0x0113
            java.util.Map r12 = defpackage.xb7.a(r8, r11)     // Catch:{ all -> 0x00f6 }
            goto L_0x0114
        L_0x0113:
            r12 = r5
        L_0x0114:
            r1.a(r14, r0, r12)     // Catch:{ all -> 0x00f6 }
            r12 = 0
            r1.e(r14, r0, r12)     // Catch:{ all -> 0x00f6 }
            java.lang.String r12 = "nil-result"
            ik0 r14 = (defpackage.ik0) r14     // Catch:{ all -> 0x00f6 }
            r14.h(r6, r12)     // Catch:{ all -> 0x00f6 }
            r13.g(r7, r5)     // Catch:{ all -> 0x00f6 }
            goto L_0x00ef
        L_0x0126:
            k55 r6 = new k55     // Catch:{ all -> 0x00f6 }
            r7 = r14
            ik0 r7 = (defpackage.ik0) r7     // Catch:{ all -> 0x00f6 }
            qa7 r7 = r7.a     // Catch:{ all -> 0x00f6 }
            r9 = 8
            boolean r7 = r7.d(r9)     // Catch:{ all -> 0x00f6 }
            r9 = r14
            ik0 r9 = (defpackage.ik0) r9     // Catch:{ all -> 0x00f6 }
            da7 r9 = r9.Z     // Catch:{ all -> 0x00f6 }
            f7a r9 = r9.v     // Catch:{ all -> 0x00f6 }
            r9.getClass()     // Catch:{ all -> 0x00f6 }
            zqd r4 = (defpackage.zqd) r4     // Catch:{ all -> 0x00f6 }
            r6.<init>((defpackage.zi0) r13, (defpackage.zqd) r4, (defpackage.uae) r2, (boolean) r7)     // Catch:{ all -> 0x00f6 }
            boolean r13 = r1.i(r14, r0)     // Catch:{ all -> 0x00f6 }
            if (r13 == 0) goto L_0x014c
            java.util.Map r5 = defpackage.xb7.a(r8, r11)     // Catch:{ all -> 0x00f6 }
        L_0x014c:
            r1.a(r14, r0, r5)     // Catch:{ all -> 0x00f6 }
            xvb r12 = r12.d     // Catch:{ all -> 0x00f6 }
            r12.a(r6, r14)     // Catch:{ all -> 0x00f6 }
            goto L_0x00ef
        L_0x0155:
            return
        L_0x0156:
            defpackage.y33.U(r3)     // Catch:{ all -> 0x00b8 }
            throw r12     // Catch:{ all -> 0x00b8 }
        L_0x015a:
            defpackage.tf6.P()
            throw r12
        L_0x015e:
            defpackage.tf6.P()     // Catch:{ all -> 0x0191 }
            r0 = r14
            ik0 r0 = (defpackage.ik0) r0     // Catch:{ all -> 0x0191 }
            bwb r0 = r0.c     // Catch:{ all -> 0x0191 }
            java.lang.String r1 = r12.d()     // Catch:{ all -> 0x0191 }
            r0.j(r14, r1)     // Catch:{ all -> 0x0191 }
            r1 = r14
            ik0 r1 = (defpackage.ik0) r1     // Catch:{ all -> 0x0191 }
            qa7 r1 = r1.a     // Catch:{ all -> 0x0191 }
            r2 = r14
            ik0 r2 = (defpackage.ik0) r2     // Catch:{ all -> 0x0191 }
            java.lang.Object r2 = r2.o     // Catch:{ all -> 0x0191 }
            cd4 r3 = r12.c     // Catch:{ all -> 0x0191 }
            io0 r1 = r3.e(r1, r2)     // Catch:{ all -> 0x0191 }
            r2 = r14
            ik0 r2 = (defpackage.ik0) r2     // Catch:{ all -> 0x0191 }
            qa7 r2 = r2.a     // Catch:{ all -> 0x0191 }
            r3 = 1
            boolean r2 = r2.d(r3)     // Catch:{ all -> 0x0191 }
            r4 = 0
            if (r2 == 0) goto L_0x0194
            z59 r2 = r12.b     // Catch:{ all -> 0x0191 }
            y33 r2 = r2.get(r1)     // Catch:{ all -> 0x0191 }
            goto L_0x0195
        L_0x0191:
            r12 = move-exception
            goto L_0x025e
        L_0x0194:
            r2 = r4
        L_0x0195:
            java.lang.String r5 = "memory_bitmap"
            java.lang.String r6 = "cached_value_found"
            if (r2 == 0) goto L_0x01f6
            java.lang.Object r7 = r2.e0()     // Catch:{ all -> 0x0191 }
            k97 r7 = (defpackage.k97) r7     // Catch:{ all -> 0x0191 }
            java.util.Map r7 = r7.getExtras()     // Catch:{ all -> 0x0191 }
            r8 = r14
            ik0 r8 = (defpackage.ik0) r8     // Catch:{ all -> 0x0191 }
            r8.putExtras(r7)     // Catch:{ all -> 0x0191 }
            java.lang.Object r7 = r2.e0()     // Catch:{ all -> 0x0191 }
            v33 r7 = (defpackage.v33) r7     // Catch:{ all -> 0x0191 }
            tac r7 = r7.getQualityInfo()     // Catch:{ all -> 0x0191 }
            bc7 r7 = (defpackage.bc7) r7     // Catch:{ all -> 0x0191 }
            boolean r7 = r7.c     // Catch:{ all -> 0x0191 }
            if (r7 == 0) goto L_0x01ea
            java.lang.String r8 = r12.d()     // Catch:{ all -> 0x0191 }
            java.lang.String r9 = r12.d()     // Catch:{ all -> 0x0191 }
            boolean r9 = r0.i(r14, r9)     // Catch:{ all -> 0x0191 }
            if (r9 == 0) goto L_0x01d0
            java.lang.String r9 = "true"
            java.util.Map r9 = defpackage.xb7.a(r6, r9)     // Catch:{ all -> 0x0191 }
            goto L_0x01d1
        L_0x01d0:
            r9 = r4
        L_0x01d1:
            r0.a(r14, r8, r9)     // Catch:{ all -> 0x0191 }
            java.lang.String r8 = r12.d()     // Catch:{ all -> 0x0191 }
            r0.e(r14, r8, r3)     // Catch:{ all -> 0x0191 }
            java.lang.String r8 = r12.c()     // Catch:{ all -> 0x0191 }
            r9 = r14
            ik0 r9 = (defpackage.ik0) r9     // Catch:{ all -> 0x0191 }
            r9.h(r5, r8)     // Catch:{ all -> 0x0191 }
            r8 = 1065353216(0x3f800000, float:1.0)
            r13.i(r8)     // Catch:{ all -> 0x0191 }
        L_0x01ea:
            r13.g(r7, r2)     // Catch:{ all -> 0x0191 }
            r2.close()     // Catch:{ all -> 0x0191 }
            if (r7 == 0) goto L_0x01f6
        L_0x01f2:
            defpackage.tf6.P()
            goto L_0x025d
        L_0x01f6:
            r2 = r14
            ik0 r2 = (defpackage.ik0) r2     // Catch:{ all -> 0x0191 }
            pa7 r2 = r2.v     // Catch:{ all -> 0x0191 }
            int r2 = r2.a     // Catch:{ all -> 0x0191 }
            r7 = 4
            java.lang.String r8 = "false"
            if (r2 < r7) goto L_0x022e
            java.lang.String r1 = r12.d()     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = r12.d()     // Catch:{ all -> 0x0191 }
            boolean r2 = r0.i(r14, r2)     // Catch:{ all -> 0x0191 }
            if (r2 == 0) goto L_0x0215
            java.util.Map r2 = defpackage.xb7.a(r6, r8)     // Catch:{ all -> 0x0191 }
            goto L_0x0216
        L_0x0215:
            r2 = r4
        L_0x0216:
            r0.a(r14, r1, r2)     // Catch:{ all -> 0x0191 }
            java.lang.String r1 = r12.d()     // Catch:{ all -> 0x0191 }
            r2 = 0
            r0.e(r14, r1, r2)     // Catch:{ all -> 0x0191 }
            java.lang.String r12 = r12.c()     // Catch:{ all -> 0x0191 }
            ik0 r14 = (defpackage.ik0) r14     // Catch:{ all -> 0x0191 }
            r14.h(r5, r12)     // Catch:{ all -> 0x0191 }
            r13.g(r3, r4)     // Catch:{ all -> 0x0191 }
            goto L_0x01f2
        L_0x022e:
            r2 = r14
            ik0 r2 = (defpackage.ik0) r2     // Catch:{ all -> 0x0191 }
            qa7 r2 = r2.a     // Catch:{ all -> 0x0191 }
            r3 = 2
            boolean r2 = r2.d(r3)     // Catch:{ all -> 0x0191 }
            zi0 r13 = r12.e(r13, r1, r2)     // Catch:{ all -> 0x0191 }
            java.lang.String r1 = r12.d()     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = r12.d()     // Catch:{ all -> 0x0191 }
            boolean r2 = r0.i(r14, r2)     // Catch:{ all -> 0x0191 }
            if (r2 == 0) goto L_0x024e
            java.util.Map r4 = defpackage.xb7.a(r6, r8)     // Catch:{ all -> 0x0191 }
        L_0x024e:
            r0.a(r14, r1, r4)     // Catch:{ all -> 0x0191 }
            defpackage.tf6.P()     // Catch:{ all -> 0x0191 }
            xvb r12 = r12.d     // Catch:{ all -> 0x0191 }
            r12.a(r13, r14)     // Catch:{ all -> 0x0191 }
            defpackage.tf6.P()     // Catch:{ all -> 0x0191 }
            goto L_0x01f2
        L_0x025d:
            return
        L_0x025e:
            defpackage.tf6.P()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko0.a(zi0, yvb):void");
    }

    public String c() {
        return "pipe_bg";
    }

    public String d() {
        return "BitmapMemoryCacheProducer";
    }

    public zi0 e(zi0 zi0, io0 io0, boolean z) {
        return new k55(this, zi0, io0, z);
    }
}
