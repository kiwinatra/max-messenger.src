package defpackage;

import java.util.HashMap;

/* renamed from: t3d  reason: default package */
public final class t3d extends hl4 {
    public final boolean c;
    public final ta7 d;
    public final yvb e;
    public boolean f = false;
    public final gn7 g;
    public final /* synthetic */ u3d h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t3d(u3d u3d, zi0 zi0, yvb yvb, boolean z, ta7 ta7) {
        super(zi0);
        this.h = u3d;
        this.e = yvb;
        ik0 ik0 = (ik0) yvb;
        Boolean bool = ik0.a.s;
        this.c = bool != null ? bool.booleanValue() : z;
        this.d = ta7;
        this.g = new gn7(u3d.a, new syc(1, this));
        ik0.a(new o57(this, zi0, false, 2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r7 != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r13, java.lang.Object r14) {
        /*
            r12 = this;
            j55 r14 = (defpackage.j55) r14
            boolean r0 = r12.f
            if (r0 == 0) goto L_0x0008
            goto L_0x00d1
        L_0x0008:
            boolean r0 = defpackage.zi0.a(r13)
            r1 = 1
            zi0 r2 = r12.b
            if (r14 != 0) goto L_0x0019
            if (r0 == 0) goto L_0x00d1
            r12 = 0
            r2.g(r1, r12)
            goto L_0x00d1
        L_0x0019:
            r14.m0()
            h97 r3 = r14.c
            yvb r4 = r12.e
            ik0 r4 = (defpackage.ik0) r4
            qa7 r5 = r4.a
            ta7 r6 = r12.d
            boolean r7 = r12.c
            sa7 r6 = r6.createImageTranscoder(r3, r7)
            r6.getClass()
            r14.m0()
            h97 r7 = r14.c
            h97 r8 = defpackage.h97.c
            r9 = 3
            r10 = 0
            if (r7 != r8) goto L_0x003c
            r8 = r9
            goto L_0x0084
        L_0x003c:
            r14.m0()
            h97 r7 = r14.c
            boolean r7 = r6.c(r7)
            r8 = 2
            if (r7 != 0) goto L_0x0049
            goto L_0x0084
        L_0x0049:
            f8d r7 = r5.j
            boolean r11 = r7.a
            if (r11 != 0) goto L_0x0070
            int r11 = defpackage.go7.b(r7, r14)
            if (r11 != 0) goto L_0x006e
            boolean r7 = r7.a
            if (r7 == 0) goto L_0x005d
            r14.v = r10
            r7 = r10
            goto L_0x006c
        L_0x005d:
            a00 r7 = defpackage.go7.a
            r14.m0()
            int r11 = r14.v
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r7 = r7.contains(r11)
        L_0x006c:
            if (r7 == 0) goto L_0x0070
        L_0x006e:
            r7 = r1
            goto L_0x0071
        L_0x0070:
            r7 = r10
        L_0x0071:
            if (r7 != 0) goto L_0x0080
            f8d r7 = r5.j
            v3d r5 = r5.i
            boolean r5 = r6.d(r14, r7, r5)
            if (r5 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r5 = r10
            goto L_0x0081
        L_0x0080:
            r5 = r1
        L_0x0081:
            if (r5 == 0) goto L_0x0084
            r8 = r1
        L_0x0084:
            if (r0 != 0) goto L_0x0089
            if (r8 != r9) goto L_0x0089
            goto L_0x00d1
        L_0x0089:
            if (r8 == r1) goto L_0x00bd
            h97 r12 = defpackage.eg4.a
            qa7 r0 = r4.a
            if (r3 == r12) goto L_0x009c
            h97 r12 = defpackage.eg4.k
            if (r3 != r12) goto L_0x0096
            goto L_0x009c
        L_0x0096:
            f8d r12 = r0.j
            r12.getClass()
            goto L_0x00b9
        L_0x009c:
            f8d r12 = r0.j
            boolean r12 = r12.a
            if (r12 != 0) goto L_0x00b9
            r14.m0()
            int r12 = r14.o
            if (r12 == 0) goto L_0x00b9
            r14.m0()
            int r12 = r14.o
            r0 = -1
            if (r12 == r0) goto L_0x00b9
            j55 r14 = defpackage.j55.a(r14)
            if (r14 == 0) goto L_0x00b9
            r14.o = r10
        L_0x00b9:
            r2.g(r13, r14)
            goto L_0x00d1
        L_0x00bd:
            gn7 r12 = r12.g
            boolean r13 = r12.e(r14, r13)
            if (r13 != 0) goto L_0x00c6
            goto L_0x00d1
        L_0x00c6:
            if (r0 != 0) goto L_0x00ce
            boolean r13 = r4.f()
            if (r13 == 0) goto L_0x00d1
        L_0x00ce:
            r12.c()
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3d.h(int, java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.HashMap, xb7] */
    public final xb7 m(j55 j55, v3d v3d, jq5 jq5, String str) {
        String str2;
        long j;
        yvb yvb = this.e;
        if (!((ik0) yvb).c.i(yvb, "ResizeAndRotateProducer")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        j55.m0();
        sb.append(j55.w);
        sb.append("x");
        j55.m0();
        sb.append(j55.x);
        String sb2 = sb.toString();
        if (v3d != null) {
            str2 = v3d.a + "x" + v3d.b;
        } else {
            str2 = "Unspecified";
        }
        HashMap hashMap = new HashMap();
        j55.m0();
        hashMap.put("Image format", String.valueOf(j55.c));
        hashMap.put("Original size", sb2);
        hashMap.put("Requested size", str2);
        gn7 gn7 = this.g;
        synchronized (gn7) {
            j = gn7.i - gn7.h;
        }
        hashMap.put("queueTime", String.valueOf(j));
        hashMap.put("Transcoder id", str);
        hashMap.put("Transcoding result", String.valueOf(jq5));
        return new HashMap(hashMap);
    }
}
