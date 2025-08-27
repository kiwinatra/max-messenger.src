package defpackage;

import kotlin.Lazy;

/* renamed from: hz  reason: default package */
public final class hz {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public hz(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
    }

    /* JADX WARNING: type inference failed for: r3v10, types: [odf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v10, types: [odf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v15, types: [odf, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0146 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ha9 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            w28 r2 = r1.x0
            r3 = 0
            if (r2 == 0) goto L_0x000e
            int r4 = r2.G()
            goto L_0x000f
        L_0x000e:
            r4 = r3
        L_0x000f:
            r5 = r3
            r6 = r5
        L_0x0011:
            if (r5 >= r4) goto L_0x014d
            if (r2 == 0) goto L_0x001b
            l20 r7 = r2.F(r5)
            if (r7 != 0) goto L_0x0020
        L_0x001b:
            r10 = r3
            r16 = r4
            goto L_0x0146
        L_0x0020:
            boolean r8 = r7.f()
            r9 = 1
            kotlin.Lazy r10 = r0.e
            long r11 = r1.b
            java.lang.String r13 = r7.q
            if (r8 == 0) goto L_0x0072
            x10 r8 = r7.b
            boolean r14 = r8.v
            if (r14 == 0) goto L_0x0072
            ed2 r7 = r17.b()
            boolean r7 = r7.c(r3)
            if (r7 == 0) goto L_0x006d
            odf r7 = new odf
            r7.<init>()
            r7.a = r11
            r7.b = r13
            long r14 = r8.y
            r7.e = r14
            java.lang.String r8 = r8.z
            r7.g = r8
            r7.h = r9
            r7.i = r9
            pdf r8 = new pdf
            r8.<init>(r7)
            java.lang.Object r7 = r10.getValue()
            uk5 r7 = (defpackage.uk5) r7
            r7.a(r8)
            ed2 r7 = r17.b()
            boolean r7 = r7.c(r9)
            r10 = r3
            r16 = r4
            goto L_0x0131
        L_0x006d:
            r10 = r3
            r16 = r4
            goto L_0x0130
        L_0x0072:
            boolean r8 = r7.a()
            if (r8 == 0) goto L_0x00cf
            ed2 r8 = r17.b()
            jtb r8 = r8.d
            ltb r8 = (defpackage.ltb) r8
            hq r8 = r8.c
            ls7 r8 = r8.g
            java.lang.String r14 = "app.media.load.audio"
            int r8 = r8.getInt(r14, r3)
            r15 = -1
            if (r8 == r15) goto L_0x00cb
            odf r8 = new odf
            r8.<init>()
            r8.a = r11
            r8.b = r13
            i10 r7 = r7.e
            r16 = r4
            long r3 = r7.a
            r8.d = r3
            java.lang.String r3 = r7.b
            r8.g = r3
            r8.h = r9
            r8.i = r9
            pdf r3 = new pdf
            r3.<init>(r8)
            java.lang.Object r4 = r10.getValue()
            uk5 r4 = (defpackage.uk5) r4
            r4.a(r3)
            ed2 r3 = r17.b()
            jtb r4 = r3.d
            ltb r4 = (defpackage.ltb) r4
            hq r4 = r4.c
            ls7 r4 = r4.g
            r8 = 0
            int r4 = r4.getInt(r14, r8)
            boolean r7 = r3.d(r4)
            r10 = r8
            goto L_0x0131
        L_0x00cb:
            r16 = r4
            r10 = r3
            goto L_0x0130
        L_0x00cf:
            r8 = r3
            r16 = r4
            boolean r3 = r7.h()
            if (r3 == 0) goto L_0x012f
            ed2 r3 = r17.b()
            boolean r3 = r3.f(r8)
            if (r3 == 0) goto L_0x012d
            odf r3 = new odf
            r3.<init>()
            r3.a = r11
            r3.b = r13
            f20 r4 = r7.f
            long r7 = r4.a
            r3.f = r7
            java.lang.String r7 = r4.e
            r3.g = r7
            r3.h = r9
            r3.i = r9
            pdf r7 = new pdf
            r7.<init>(r3)
            java.lang.Object r3 = r10.getValue()
            uk5 r3 = (defpackage.uk5) r3
            r3.a(r7)
            kotlin.Lazy r3 = r0.c
            java.lang.Object r7 = r3.getValue()
            ou8 r7 = (defpackage.ou8) r7
            qva r7 = (defpackage.qva) r7
            java.lang.String r8 = r4.f
            r10 = 0
            r7.f(r8, r10)
            java.lang.Object r3 = r3.getValue()
            ou8 r3 = (defpackage.ou8) r3
            qva r3 = (defpackage.qva) r3
            java.lang.String r4 = r4.b
            r3.f(r4, r10)
            ed2 r3 = r17.b()
            boolean r7 = r3.f(r9)
            goto L_0x0131
        L_0x012d:
            r10 = 0
            goto L_0x0130
        L_0x012f:
            r10 = r8
        L_0x0130:
            r7 = r10
        L_0x0131:
            if (r7 == 0) goto L_0x0146
            kotlin.Lazy r3 = r0.b
            java.lang.Object r3 = r3.getValue()
            fa9 r3 = (defpackage.fa9) r3
            rx0 r4 = new rx0
            r6 = 21
            r4.<init>(r6)
            r3.x(r11, r13, r4)
            r6 = r9
        L_0x0146:
            int r5 = r5 + 1
            r3 = r10
            r4 = r16
            goto L_0x0011
        L_0x014d:
            if (r6 == 0) goto L_0x0165
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            sv0 r0 = (defpackage.sv0) r0
            twf r7 = new twf
            long r5 = r1.b
            r2 = 0
            long r3 = r1.z
            r1 = r7
            r1.<init>(r2, r3, r5)
            r0.c(r7)
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz.a(ha9):void");
    }

    public final ed2 b() {
        return (ed2) this.a.getValue();
    }
}
