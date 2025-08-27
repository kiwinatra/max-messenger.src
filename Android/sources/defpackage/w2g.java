package defpackage;

/* renamed from: w2g  reason: default package */
public final class w2g extends gng {
    public fm4 k;
    public ql0 l;

    public final void a(cm4 cm4) {
        int i;
        float f;
        float f2;
        float f3;
        if (tr1.y(this.j) != 3) {
            uo4 uo4 = this.e;
            if (uo4.c && !uo4.j && this.d == 3) {
                tj3 tj3 = this.b;
                int i2 = tj3.s;
                if (i2 == 2) {
                    tj3 tj32 = tj3.T;
                    if (tj32 != null) {
                        uo4 uo42 = tj32.e.e;
                        if (uo42.j) {
                            uo4.d((int) ((((float) uo42.g) * tj3.z) + 0.5f));
                        }
                    }
                } else if (i2 == 3) {
                    uo4 uo43 = tj3.d.e;
                    if (uo43.j) {
                        int i3 = tj3.X;
                        if (i3 == -1) {
                            f = (float) uo43.g;
                            f2 = tj3.W;
                        } else if (i3 == 0) {
                            f3 = ((float) uo43.g) * tj3.W;
                            i = (int) (f3 + 0.5f);
                            uo4.d(i);
                        } else if (i3 != 1) {
                            i = 0;
                            uo4.d(i);
                        } else {
                            f = (float) uo43.g;
                            f2 = tj3.W;
                        }
                        f3 = f / f2;
                        i = (int) (f3 + 0.5f);
                        uo4.d(i);
                    }
                }
            }
            fm4 fm4 = this.h;
            if (fm4.c) {
                fm4 fm42 = this.i;
                if (fm42.c) {
                    if (!fm4.j || !fm42.j || !uo4.j) {
                        if (!uo4.j && this.d == 3) {
                            tj3 tj33 = this.b;
                            if (tj33.r == 0 && !tj33.y()) {
                                int i4 = ((fm4) fm4.l.get(0)).g + fm4.f;
                                int i5 = ((fm4) fm42.l.get(0)).g + fm42.f;
                                fm4.d(i4);
                                fm42.d(i5);
                                uo4.d(i5 - i4);
                                return;
                            }
                        }
                        if (!uo4.j && this.d == 3 && this.a == 1 && fm4.l.size() > 0 && fm42.l.size() > 0) {
                            int i6 = (((fm4) fm42.l.get(0)).g + fm42.f) - (((fm4) fm4.l.get(0)).g + fm4.f);
                            int i7 = uo4.m;
                            if (i6 < i7) {
                                uo4.d(i6);
                            } else {
                                uo4.d(i7);
                            }
                        }
                        if (uo4.j && fm4.l.size() > 0 && fm42.l.size() > 0) {
                            fm4 fm43 = (fm4) fm4.l.get(0);
                            fm4 fm44 = (fm4) fm42.l.get(0);
                            int i8 = fm43.g;
                            int i9 = fm4.f + i8;
                            int i10 = fm44.g;
                            int i11 = fm42.f + i10;
                            float f4 = this.b.e0;
                            if (fm43 == fm44) {
                                f4 = 0.5f;
                            } else {
                                i8 = i9;
                                i10 = i11;
                            }
                            fm4.d((int) ((((float) ((i10 - i8) - uo4.g)) * f4) + ((float) i8) + 0.5f));
                            fm42.d(fm4.g + uo4.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        tj3 tj34 = this.b;
        l(tj34.J, tj34.L, 1);
    }

    /* JADX WARNING: type inference failed for: r0v114, types: [ql0, uo4] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r0 = r14.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r14 = this;
            tj3 r0 = r14.b
            boolean r1 = r0.a
            uo4 r2 = r14.e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.k()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.j
            fm4 r1 = r14.i
            fm4 r3 = r14.h
            r4 = 3
            r5 = 1
            r6 = 4
            if (r0 != 0) goto L_0x0084
            tj3 r0 = r14.b
            int[] r7 = r0.p0
            r7 = r7[r5]
            r14.d = r7
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x002d
            ql0 r0 = new ql0
            r0.<init>(r14)
            r14.l = r0
        L_0x002d:
            int r0 = r14.d
            if (r0 == r4) goto L_0x00b2
            if (r0 != r6) goto L_0x0078
            tj3 r7 = r14.b
            tj3 r7 = r7.T
            if (r7 == 0) goto L_0x0078
            int[] r8 = r7.p0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x0078
            int r0 = r7.k()
            tj3 r4 = r14.b
            aj3 r4 = r4.J
            int r4 = r4.e()
            int r0 = r0 - r4
            tj3 r4 = r14.b
            aj3 r4 = r4.L
            int r4 = r4.e()
            int r0 = r0 - r4
            w2g r4 = r7.e
            fm4 r4 = r4.h
            tj3 r5 = r14.b
            aj3 r5 = r5.J
            int r5 = r5.e()
            defpackage.gng.b(r3, r4, r5)
            w2g r3 = r7.e
            fm4 r3 = r3.i
            tj3 r14 = r14.b
            aj3 r14 = r14.L
            int r14 = r14.e()
            int r14 = -r14
            defpackage.gng.b(r1, r3, r14)
            r2.d(r0)
            return
        L_0x0078:
            if (r0 != r5) goto L_0x00b2
            tj3 r0 = r14.b
            int r0 = r0.k()
            r2.d(r0)
            goto L_0x00b2
        L_0x0084:
            int r0 = r14.d
            if (r0 != r6) goto L_0x00b2
            tj3 r0 = r14.b
            tj3 r7 = r0.T
            if (r7 == 0) goto L_0x00b2
            int[] r8 = r7.p0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x00b2
            w2g r2 = r7.e
            fm4 r2 = r2.h
            aj3 r0 = r0.J
            int r0 = r0.e()
            defpackage.gng.b(r3, r2, r0)
            w2g r0 = r7.e
            fm4 r0 = r0.i
            tj3 r14 = r14.b
            aj3 r14 = r14.L
            int r14 = r14.e()
            int r14 = -r14
            defpackage.gng.b(r1, r0, r14)
            return
        L_0x00b2:
            boolean r0 = r2.j
            fm4 r7 = r14.k
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x01d6
            tj3 r10 = r14.b
            boolean r11 = r10.a
            if (r11 == 0) goto L_0x01d6
            aj3[] r0 = r10.Q
            r11 = r0[r9]
            aj3 r12 = r11.f
            if (r12 == 0) goto L_0x0132
            r13 = r0[r4]
            aj3 r13 = r13.f
            if (r13 == 0) goto L_0x0132
            boolean r0 = r10.y()
            if (r0 == 0) goto L_0x00ee
            tj3 r0 = r14.b
            aj3[] r0 = r0.Q
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f = r0
            tj3 r0 = r14.b
            aj3[] r0 = r0.Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f = r0
            goto L_0x0125
        L_0x00ee:
            tj3 r0 = r14.b
            aj3[] r0 = r0.Q
            r0 = r0[r9]
            fm4 r0 = defpackage.gng.h(r0)
            if (r0 == 0) goto L_0x0107
            tj3 r2 = r14.b
            aj3[] r2 = r2.Q
            r2 = r2[r9]
            int r2 = r2.e()
            defpackage.gng.b(r3, r0, r2)
        L_0x0107:
            tj3 r0 = r14.b
            aj3[] r0 = r0.Q
            r0 = r0[r4]
            fm4 r0 = defpackage.gng.h(r0)
            if (r0 == 0) goto L_0x0121
            tj3 r2 = r14.b
            aj3[] r2 = r2.Q
            r2 = r2[r4]
            int r2 = r2.e()
            int r2 = -r2
            defpackage.gng.b(r1, r0, r2)
        L_0x0121:
            r3.b = r5
            r1.b = r5
        L_0x0125:
            tj3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.gng.b(r7, r3, r14)
            goto L_0x036c
        L_0x0132:
            if (r12 == 0) goto L_0x0159
            fm4 r0 = defpackage.gng.h(r11)
            if (r0 == 0) goto L_0x036c
            tj3 r4 = r14.b
            aj3[] r4 = r4.Q
            r4 = r4[r9]
            int r4 = r4.e()
            defpackage.gng.b(r3, r0, r4)
            int r0 = r2.g
            defpackage.gng.b(r1, r3, r0)
            tj3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.gng.b(r7, r3, r14)
            goto L_0x036c
        L_0x0159:
            r5 = r0[r4]
            aj3 r9 = r5.f
            if (r9 == 0) goto L_0x0186
            fm4 r0 = defpackage.gng.h(r5)
            if (r0 == 0) goto L_0x0179
            tj3 r5 = r14.b
            aj3[] r5 = r5.Q
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            defpackage.gng.b(r1, r0, r4)
            int r0 = r2.g
            int r0 = -r0
            defpackage.gng.b(r3, r1, r0)
        L_0x0179:
            tj3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.gng.b(r7, r3, r14)
            goto L_0x036c
        L_0x0186:
            r0 = r0[r6]
            aj3 r4 = r0.f
            if (r4 == 0) goto L_0x01a4
            fm4 r0 = defpackage.gng.h(r0)
            if (r0 == 0) goto L_0x036c
            defpackage.gng.b(r7, r0, r8)
            tj3 r14 = r14.b
            int r14 = r14.a0
            int r14 = -r14
            defpackage.gng.b(r3, r7, r14)
            int r14 = r2.g
            defpackage.gng.b(r1, r3, r14)
            goto L_0x036c
        L_0x01a4:
            boolean r0 = r10 instanceof defpackage.cy6
            if (r0 != 0) goto L_0x036c
            tj3 r0 = r10.T
            if (r0 == 0) goto L_0x036c
            r0 = 7
            aj3 r0 = r10.i(r0)
            aj3 r0 = r0.f
            if (r0 != 0) goto L_0x036c
            tj3 r0 = r14.b
            tj3 r4 = r0.T
            w2g r4 = r4.e
            fm4 r4 = r4.h
            int r0 = r0.s()
            defpackage.gng.b(r3, r4, r0)
            int r0 = r2.g
            defpackage.gng.b(r1, r3, r0)
            tj3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.gng.b(r7, r3, r14)
            goto L_0x036c
        L_0x01d6:
            if (r0 != 0) goto L_0x022d
            int r0 = r14.d
            if (r0 != r4) goto L_0x022d
            tj3 r0 = r14.b
            int r10 = r0.s
            if (r10 == r9) goto L_0x020d
            if (r10 == r4) goto L_0x01e5
            goto L_0x0230
        L_0x01e5:
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x0230
            tj3 r0 = r14.b
            int r10 = r0.r
            if (r10 != r4) goto L_0x01f2
            goto L_0x0230
        L_0x01f2:
            s27 r0 = r0.d
            uo4 r0 = r0.e
            java.util.ArrayList r10 = r2.l
            r10.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r5
            java.util.ArrayList r0 = r2.k
            r0.add(r3)
            java.util.ArrayList r0 = r2.k
            r0.add(r1)
            goto L_0x0230
        L_0x020d:
            tj3 r0 = r0.T
            if (r0 != 0) goto L_0x0212
            goto L_0x0230
        L_0x0212:
            w2g r0 = r0.e
            uo4 r0 = r0.e
            java.util.ArrayList r10 = r2.l
            r10.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r5
            java.util.ArrayList r0 = r2.k
            r0.add(r3)
            java.util.ArrayList r0 = r2.k
            r0.add(r1)
            goto L_0x0230
        L_0x022d:
            r2.b(r14)
        L_0x0230:
            tj3 r0 = r14.b
            aj3[] r10 = r0.Q
            r11 = r10[r9]
            aj3 r12 = r11.f
            if (r12 == 0) goto L_0x028d
            r13 = r10[r4]
            aj3 r13 = r13.f
            if (r13 == 0) goto L_0x028d
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0260
            tj3 r0 = r14.b
            aj3[] r0 = r0.Q
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f = r0
            tj3 r0 = r14.b
            aj3[] r0 = r0.Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f = r0
            goto L_0x0280
        L_0x0260:
            tj3 r0 = r14.b
            aj3[] r0 = r0.Q
            r0 = r0[r9]
            fm4 r0 = defpackage.gng.h(r0)
            tj3 r1 = r14.b
            aj3[] r1 = r1.Q
            r1 = r1[r4]
            fm4 r1 = defpackage.gng.h(r1)
            if (r0 == 0) goto L_0x0279
            r0.b(r14)
        L_0x0279:
            if (r1 == 0) goto L_0x027e
            r1.b(r14)
        L_0x027e:
            r14.j = r6
        L_0x0280:
            tj3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0362
            ql0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
            goto L_0x0362
        L_0x028d:
            r13 = 0
            if (r12 == 0) goto L_0x02d9
            fm4 r0 = defpackage.gng.h(r11)
            if (r0 == 0) goto L_0x0362
            tj3 r6 = r14.b
            aj3[] r6 = r6.Q
            r6 = r6[r9]
            int r6 = r6.e()
            defpackage.gng.b(r3, r0, r6)
            r14.c(r1, r3, r5, r2)
            tj3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x02b1
            ql0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
        L_0x02b1:
            int r0 = r14.d
            if (r0 != r4) goto L_0x0362
            tj3 r0 = r14.b
            float r1 = r0.W
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0362
            s27 r0 = r0.d
            int r1 = r0.d
            if (r1 != r4) goto L_0x0362
            uo4 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            java.util.ArrayList r0 = r2.l
            tj3 r1 = r14.b
            s27 r1 = r1.d
            uo4 r1 = r1.e
            r0.add(r1)
            r2.a = r14
            goto L_0x0362
        L_0x02d9:
            r9 = r10[r4]
            aj3 r11 = r9.f
            r12 = -1
            if (r11 == 0) goto L_0x0303
            fm4 r0 = defpackage.gng.h(r9)
            if (r0 == 0) goto L_0x0362
            tj3 r6 = r14.b
            aj3[] r6 = r6.Q
            r4 = r6[r4]
            int r4 = r4.e()
            int r4 = -r4
            defpackage.gng.b(r1, r0, r4)
            r14.c(r3, r1, r12, r2)
            tj3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0362
            ql0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
            goto L_0x0362
        L_0x0303:
            r6 = r10[r6]
            aj3 r9 = r6.f
            if (r9 == 0) goto L_0x031b
            fm4 r0 = defpackage.gng.h(r6)
            if (r0 == 0) goto L_0x0362
            defpackage.gng.b(r7, r0, r8)
            ql0 r0 = r14.l
            r14.c(r3, r7, r12, r0)
            r14.c(r1, r3, r5, r2)
            goto L_0x0362
        L_0x031b:
            boolean r6 = r0 instanceof defpackage.cy6
            if (r6 != 0) goto L_0x0362
            tj3 r6 = r0.T
            if (r6 == 0) goto L_0x0362
            w2g r6 = r6.e
            fm4 r6 = r6.h
            int r0 = r0.s()
            defpackage.gng.b(r3, r6, r0)
            r14.c(r1, r3, r5, r2)
            tj3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x033c
            ql0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
        L_0x033c:
            int r0 = r14.d
            if (r0 != r4) goto L_0x0362
            tj3 r0 = r14.b
            float r1 = r0.W
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0362
            s27 r0 = r0.d
            int r1 = r0.d
            if (r1 != r4) goto L_0x0362
            uo4 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            java.util.ArrayList r0 = r2.l
            tj3 r1 = r14.b
            s27 r1 = r1.d
            uo4 r1 = r1.e
            r0.add(r1)
            r2.a = r14
        L_0x0362:
            java.util.ArrayList r14 = r2.l
            int r14 = r14.size()
            if (r14 != 0) goto L_0x036c
            r2.c = r5
        L_0x036c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w2g.d():void");
    }

    public final void e() {
        fm4 fm4 = this.h;
        if (fm4.j) {
            this.b.Z = fm4.g;
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        fm4 fm4 = this.h;
        fm4.c();
        fm4.j = false;
        fm4 fm42 = this.i;
        fm42.c();
        fm42.j = false;
        fm4 fm43 = this.k;
        fm43.c();
        fm43.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
