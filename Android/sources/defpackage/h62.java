package defpackage;

import java.util.List;

/* renamed from: h62  reason: default package */
public final /* synthetic */ class h62 implements qk3, kj4, eo1, gz8, pk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h62(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: uc9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: uc9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.a
            switch(r0) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0081;
                case 4: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            ypb r15 = (defpackage.ypb) r15
            java.lang.Object r0 = r14.c
            i30 r0 = (defpackage.i30) r0
            boolean r14 = r14.b
            r15.a0(r0, r14)
            return
        L_0x0011:
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r0 = r14.c
            r1 = r0
            ru.ok.messages.views.fragments.FrgContactProfile r1 = (ru.ok.messages.views.fragments.FrgContactProfile) r1
            r1.getClass()
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0022
            goto L_0x0080
        L_0x0022:
            java.util.Iterator r0 = r15.iterator()
            r2 = 0
        L_0x0027:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0063
            java.lang.Object r3 = r0.next()
            uc9 r3 = (defpackage.uc9) r3
            boolean r4 = r14.b
            if (r4 == 0) goto L_0x004d
            long r4 = r3.b
            sjd r6 = r1.q1
            jtb r6 = r6.u()
            ltb r6 = (defpackage.ltb) r6
            a33 r6 = r6.a
            long r6 = r6.s()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0027
            r2 = r3
            goto L_0x0063
        L_0x004d:
            long r4 = r3.b
            sjd r6 = r1.q1
            jtb r6 = r6.u()
            ltb r6 = (defpackage.ltb) r6
            a33 r6 = r6.a
            long r6 = r6.s()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0027
            r2 = r3
            goto L_0x0027
        L_0x0063:
            if (r2 != 0) goto L_0x006d
            r14 = 0
            java.lang.Object r14 = r15.get(r14)
            r2 = r14
            uc9 r2 = (defpackage.uc9) r2
        L_0x006d:
            long r14 = r1.X1
            long r4 = r2.a
            s58 r8 = r2.c
            boolean r12 = r2.e
            long r6 = r2.b
            long r10 = r2.d
            java.lang.String r13 = r2.f
            r2 = r14
            r9 = r12
            ru.ok.messages.location.ActLocationMap.T(r1, r2, r4, r6, r8, r9, r10, r12, r13)
        L_0x0080:
            return
        L_0x0081:
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r0 = r14.c
            r1 = r0
            ru.ok.messages.views.fragments.FrgChatProfile r1 = (ru.ok.messages.views.fragments.FrgChatProfile) r1
            r1.getClass()
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0092
            goto L_0x00f2
        L_0x0092:
            java.util.Iterator r0 = r15.iterator()
            r2 = 0
        L_0x0097:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00d3
            java.lang.Object r3 = r0.next()
            uc9 r3 = (defpackage.uc9) r3
            boolean r4 = r14.b
            if (r4 == 0) goto L_0x00bd
            long r4 = r3.b
            sjd r6 = r1.q1
            jtb r6 = r6.u()
            ltb r6 = (defpackage.ltb) r6
            a33 r6 = r6.a
            long r6 = r6.s()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0097
            r2 = r3
            goto L_0x00d3
        L_0x00bd:
            long r4 = r3.b
            sjd r6 = r1.q1
            jtb r6 = r6.u()
            ltb r6 = (defpackage.ltb) r6
            a33 r6 = r6.a
            long r6 = r6.s()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0097
            r2 = r3
            goto L_0x0097
        L_0x00d3:
            if (r2 != 0) goto L_0x00dd
            r14 = 0
            java.lang.Object r14 = r15.get(r14)
            r2 = r14
            uc9 r2 = (defpackage.uc9) r2
        L_0x00dd:
            a32 r14 = r1.X1
            long r14 = r14.a
            long r4 = r2.a
            s58 r8 = r2.c
            boolean r12 = r2.e
            long r6 = r2.b
            long r10 = r2.d
            java.lang.String r13 = r2.f
            r2 = r14
            r9 = r12
            ru.ok.messages.location.ActLocationMap.T(r1, r2, r4, r6, r8, r9, r10, r12, r13)
        L_0x00f2:
            return
        L_0x00f3:
            w62 r15 = (defpackage.w62) r15
            d72 r0 = r15.c()
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List r2 = r0.b
            r1.<init>(r2)
            boolean r2 = r14.b
            java.lang.Object r14 = r14.c
            a72 r14 = (defpackage.a72) r14
            if (r2 == 0) goto L_0x010c
            r1.add(r14)
            goto L_0x010f
        L_0x010c:
            r1.remove(r14)
        L_0x010f:
            c72 r14 = r0.a()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r14.b = r0
            d72 r14 = r14.b()
            r15.p = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h62.accept(java.lang.Object):void");
    }

    public k0d b(int i, rpf rpf, int[] iArr) {
        qb7 o = tb7.o();
        for (int i2 = 0; i2 < rpf.a; i2++) {
            int i3 = i;
            rpf rpf2 = rpf;
            int i4 = i2;
            o.a(new xi4(i3, rpf2, i4, (dj4) this.c, iArr[i2], this.b));
        }
        return o.j();
    }

    public Object g(yx8 yx8, cx8 cx8, int i) {
        switch (this.a) {
            case 5:
                k0d t = tb7.t((ir8) this.c);
                boolean z = this.b;
                return yx8.q(cx8, t, z ? -1 : yx8.s.d0(), z ? -9223372036854775807L : yx8.s.h());
            default:
                boolean z2 = this.b;
                return yx8.q(cx8, (k0d) ((List) this.c), z2 ? -1 : yx8.s.d0(), z2 ? -9223372036854775807L : yx8.s.h());
        }
    }

    public Object r(do1 do1) {
        switch (this.a) {
            case 2:
                wx5 wx5 = (wx5) this.c;
                wx5.getClass();
                wx5.b.execute(new hu2((Object) wx5, this.b, (Object) do1, 1));
                return "enableExternalFlashAeMode";
            default:
                bof bof = (bof) this.c;
                bof.getClass();
                boolean z = this.b;
                bof.d.execute(new hu2((Object) bof, (Object) do1, z, 4));
                return "enableTorch: " + z;
        }
    }

    public /* synthetic */ h62(boolean z, a72 a72) {
        this.a = 0;
        this.b = z;
        this.c = a72;
    }
}
