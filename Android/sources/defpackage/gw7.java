package defpackage;

import java.util.Arrays;
import kotlin.uuid.Uuid;

/* renamed from: gw7  reason: default package */
public final class gw7 {
    public static boolean p = false;
    public static int q = 1000;
    public boolean a;
    public int b;
    public final vub c;
    public int d;
    public int e;
    public vs[] f;
    public boolean g;
    public boolean[] h;
    public int i;
    public int j;
    public int k;
    public final g6d l;
    public sfe[] m;
    public int n;
    public vs o;

    /* JADX WARNING: type inference failed for: r1v2, types: [vub, java.lang.Object, vs] */
    public gw7() {
        this.a = false;
        this.b = 0;
        this.d = 32;
        this.e = 32;
        this.f = null;
        this.g = false;
        this.h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new sfe[q];
        this.n = 0;
        this.f = new vs[32];
        s();
        g6d g6d = new g6d(3, false);
        g6d.b = new wqb();
        g6d.c = new wqb();
        g6d.o = new sfe[32];
        this.l = g6d;
        ? vsVar = new vs(g6d);
        vsVar.f = new sfe[Uuid.SIZE_BITS];
        vsVar.g = new sfe[Uuid.SIZE_BITS];
        vsVar.h = 0;
        vsVar.i = new fj(18, (Object) vsVar);
        this.c = vsVar;
        this.o = new vs(g6d);
    }

    public static int n(Object obj) {
        sfe sfe = ((aj3) obj).i;
        if (sfe != null) {
            return (int) (sfe.v + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: sfe} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sfe a(int r6) {
        /*
            r5 = this;
            g6d r0 = r5.l
            java.lang.Object r0 = r0.c
            wqb r0 = (defpackage.wqb) r0
            int r1 = r0.b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.a
            r4 = r3[r1]
            r3[r1] = r2
            r0.b = r1
            r2 = r4
        L_0x0016:
            sfe r2 = (defpackage.sfe) r2
            if (r2 != 0) goto L_0x0022
            sfe r2 = new sfe
            r2.<init>(r6)
            r2.Z = r6
            goto L_0x0027
        L_0x0022:
            r2.c()
            r2.Z = r6
        L_0x0027:
            int r6 = r5.n
            int r0 = q
            if (r6 < r0) goto L_0x003b
            int r0 = r0 * 2
            q = r0
            sfe[] r6 = r5.m
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            sfe[] r6 = (defpackage.sfe[]) r6
            r5.m = r6
        L_0x003b:
            sfe[] r6 = r5.m
            int r0 = r5.n
            int r1 = r0 + 1
            r5.n = r1
            r6[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw7.a(int):sfe");
    }

    public final void b(sfe sfe, sfe sfe2, int i2, float f2, sfe sfe3, sfe sfe4, int i3, int i4) {
        vs l2 = l();
        if (sfe2 == sfe3) {
            l2.d.j(sfe, 1.0f);
            l2.d.j(sfe4, 1.0f);
            l2.d.j(sfe2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.j(sfe, 1.0f);
            l2.d.j(sfe2, -1.0f);
            l2.d.j(sfe3, -1.0f);
            l2.d.j(sfe4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                l2.b = (float) ((-i2) + i3);
            }
        } else if (f2 <= c44.DEFAULT_ASPECT_RATIO) {
            l2.d.j(sfe, -1.0f);
            l2.d.j(sfe2, 1.0f);
            l2.b = (float) i2;
        } else if (f2 >= 1.0f) {
            l2.d.j(sfe4, -1.0f);
            l2.d.j(sfe3, 1.0f);
            l2.b = (float) (-i3);
        } else {
            float f3 = 1.0f - f2;
            l2.d.j(sfe, f3 * 1.0f);
            l2.d.j(sfe2, f3 * -1.0f);
            l2.d.j(sfe3, -1.0f * f2);
            l2.d.j(sfe4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                l2.b = (((float) i3) * f2) + (((float) (-i2)) * f3);
            }
        }
        if (i4 != 8) {
            l2.a(this, i4);
        }
        c(l2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        if (r4.Y <= 1) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c6, code lost:
        if (r4.Y <= 1) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00db, code lost:
        if (r4.Y <= 1) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e8, code lost:
        if (r4.Y <= 1) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.vs r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.o()
        L_0x0016:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x01a6
            vs[] r2 = r0.f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x007d
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x006d
            ls r6 = r1.d
            int r6 = r6.f()
            r7 = 0
        L_0x002b:
            java.util.ArrayList r8 = r1.c
            if (r7 >= r6) goto L_0x0044
            ls r9 = r1.d
            sfe r9 = r9.g(r7)
            int r10 = r9.c
            if (r10 != r5) goto L_0x003e
            boolean r10 = r9.w
            if (r10 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r8.add(r9)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006b
            r7 = 0
        L_0x004b:
            if (r7 >= r6) goto L_0x0067
            java.lang.Object r9 = r8.get(r7)
            sfe r9 = (defpackage.sfe) r9
            boolean r10 = r9.w
            if (r10 == 0) goto L_0x005b
            r1.h(r0, r9, r3)
            goto L_0x0064
        L_0x005b:
            vs[] r10 = r0.f
            int r9 = r9.c
            r9 = r10[r9]
            r1.i(r0, r9, r3)
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0067:
            r8.clear()
            goto L_0x0022
        L_0x006b:
            r2 = r3
            goto L_0x0022
        L_0x006d:
            sfe r2 = r1.a
            if (r2 == 0) goto L_0x007d
            ls r2 = r1.d
            int r2 = r2.f()
            if (r2 != 0) goto L_0x007d
            r1.e = r3
            r0.a = r3
        L_0x007d:
            boolean r2 = r17.e()
            if (r2 == 0) goto L_0x0084
            return
        L_0x0084:
            float r2 = r1.b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0095
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.b = r2
            ls r2 = r1.d
            r2.i()
        L_0x0095:
            ls r2 = r1.d
            int r2 = r2.f()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        L_0x00a3:
            if (r8 >= r2) goto L_0x00f7
            ls r15 = r1.d
            float r15 = r15.h(r8)
            ls r4 = r1.d
            sfe r4 = r4.g(r8)
            int r5 = r4.Z
            if (r5 != r3) goto L_0x00d1
            if (r9 != 0) goto L_0x00c0
            int r5 = r4.Y
            if (r5 > r3) goto L_0x00bc
            goto L_0x00cf
        L_0x00bc:
            r12 = 0
        L_0x00bd:
            r9 = r4
            r11 = r15
            goto L_0x00f3
        L_0x00c0:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c9
            int r5 = r4.Y
            if (r5 > r3) goto L_0x00bc
            goto L_0x00cf
        L_0x00c9:
            if (r12 != 0) goto L_0x00f3
            int r5 = r4.Y
            if (r5 > r3) goto L_0x00f3
        L_0x00cf:
            r12 = r3
            goto L_0x00bd
        L_0x00d1:
            if (r9 != 0) goto L_0x00f3
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f3
            if (r10 != 0) goto L_0x00e2
            int r5 = r4.Y
            if (r5 > r3) goto L_0x00de
            goto L_0x00f1
        L_0x00de:
            r14 = 0
        L_0x00df:
            r10 = r4
            r13 = r15
            goto L_0x00f3
        L_0x00e2:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00eb
            int r5 = r4.Y
            if (r5 > r3) goto L_0x00de
            goto L_0x00f1
        L_0x00eb:
            if (r14 != 0) goto L_0x00f3
            int r5 = r4.Y
            if (r5 > r3) goto L_0x00f3
        L_0x00f1:
            r14 = r3
            goto L_0x00df
        L_0x00f3:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a3
        L_0x00f7:
            if (r9 == 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r9 = r10
        L_0x00fb:
            if (r9 != 0) goto L_0x00ff
            r2 = r3
            goto L_0x0103
        L_0x00ff:
            r1.g(r9)
            r2 = 0
        L_0x0103:
            ls r4 = r1.d
            int r4 = r4.f()
            if (r4 != 0) goto L_0x010d
            r1.e = r3
        L_0x010d:
            if (r2 == 0) goto L_0x0195
            int r2 = r0.i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0119
            r16.o()
        L_0x0119:
            r2 = 3
            sfe r2 = r0.a(r2)
            int r4 = r0.b
            int r4 = r4 + r3
            r0.b = r4
            int r5 = r0.i
            int r5 = r5 + r3
            r0.i = r5
            r2.b = r4
            g6d r5 = r0.l
            java.lang.Object r8 = r5.o
            sfe[] r8 = (defpackage.sfe[]) r8
            r8[r4] = r2
            r1.a = r2
            int r4 = r0.j
            r16.h(r17)
            int r8 = r0.j
            int r4 = r4 + r3
            if (r8 != r4) goto L_0x0195
            vs r4 = r0.o
            r4.getClass()
            r4.a = r7
            ls r8 = r4.d
            r8.b()
            r8 = 0
        L_0x014b:
            ls r9 = r1.d
            int r9 = r9.f()
            if (r8 >= r9) goto L_0x0167
            ls r9 = r1.d
            sfe r9 = r9.g(r8)
            ls r10 = r1.d
            float r10 = r10.h(r8)
            ls r11 = r4.d
            r11.a(r9, r10, r3)
            int r8 = r8 + 1
            goto L_0x014b
        L_0x0167:
            vs r4 = r0.o
            r0.r(r4)
            int r4 = r2.c
            r8 = -1
            if (r4 != r8) goto L_0x0193
            sfe r4 = r1.a
            if (r4 != r2) goto L_0x017e
            sfe r2 = r1.f(r7, r2)
            if (r2 == 0) goto L_0x017e
            r1.g(r2)
        L_0x017e:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x0187
            sfe r2 = r1.a
            r2.e(r0, r1)
        L_0x0187:
            java.lang.Object r2 = r5.b
            wqb r2 = (defpackage.wqb) r2
            r2.a(r1)
            int r2 = r0.j
            int r2 = r2 - r3
            r0.j = r2
        L_0x0193:
            r4 = r3
            goto L_0x0196
        L_0x0195:
            r4 = 0
        L_0x0196:
            sfe r2 = r1.a
            if (r2 == 0) goto L_0x01a5
            int r2 = r2.Z
            if (r2 == r3) goto L_0x01a7
            float r2 = r1.b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01a5
            goto L_0x01a7
        L_0x01a5:
            return
        L_0x01a6:
            r4 = 0
        L_0x01a7:
            if (r4 != 0) goto L_0x01ac
            r16.h(r17)
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw7.c(vs):void");
    }

    public final void d(sfe sfe, int i2) {
        int i3 = sfe.c;
        if (i3 == -1) {
            sfe.d(this, (float) i2);
            for (int i4 = 0; i4 < this.b + 1; i4++) {
                sfe sfe2 = ((sfe[]) this.l.o)[i4];
            }
        } else if (i3 != -1) {
            vs vsVar = this.f[i3];
            if (vsVar.e) {
                vsVar.b = (float) i2;
            } else if (vsVar.d.f() == 0) {
                vsVar.e = true;
                vsVar.b = (float) i2;
            } else {
                vs l2 = l();
                if (i2 < 0) {
                    l2.b = (float) (i2 * -1);
                    l2.d.j(sfe, 1.0f);
                } else {
                    l2.b = (float) i2;
                    l2.d.j(sfe, -1.0f);
                }
                c(l2);
            }
        } else {
            vs l3 = l();
            l3.a = sfe;
            float f2 = (float) i2;
            sfe.v = f2;
            l3.b = f2;
            l3.e = true;
            c(l3);
        }
    }

    public final void e(sfe sfe, sfe sfe2, int i2, int i3) {
        if (i3 == 8 && sfe2.w && sfe.c == -1) {
            sfe.d(this, sfe2.v + ((float) i2));
            return;
        }
        vs l2 = l();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            l2.b = (float) i2;
        }
        if (!z) {
            l2.d.j(sfe, -1.0f);
            l2.d.j(sfe2, 1.0f);
        } else {
            l2.d.j(sfe, 1.0f);
            l2.d.j(sfe2, -1.0f);
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    public final void f(sfe sfe, sfe sfe2, int i2, int i3) {
        vs l2 = l();
        sfe m2 = m();
        m2.o = 0;
        l2.b(sfe, sfe2, m2, i2);
        if (i3 != 8) {
            l2.d.j(j(i3), (float) ((int) (l2.d.e(m2) * -1.0f)));
        }
        c(l2);
    }

    public final void g(sfe sfe, sfe sfe2, int i2, int i3) {
        vs l2 = l();
        sfe m2 = m();
        m2.o = 0;
        l2.c(sfe, sfe2, m2, i2);
        if (i3 != 8) {
            l2.d.j(j(i3), (float) ((int) (l2.d.e(m2) * -1.0f)));
        }
        c(l2);
    }

    public final void h(vs vsVar) {
        int i2;
        if (vsVar.e) {
            vsVar.a.d(this, vsVar.b);
        } else {
            vs[] vsVarArr = this.f;
            int i3 = this.j;
            vsVarArr[i3] = vsVar;
            sfe sfe = vsVar.a;
            sfe.c = i3;
            this.j = i3 + 1;
            sfe.e(this, vsVar);
        }
        if (this.a) {
            int i4 = 0;
            while (i4 < this.j) {
                if (this.f[i4] == null) {
                    System.out.println("WTF");
                }
                vs vsVar2 = this.f[i4];
                if (vsVar2 != null && vsVar2.e) {
                    vsVar2.a.d(this, vsVar2.b);
                    ((wqb) this.l.b).a(vsVar2);
                    this.f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.j;
                        if (i5 >= i2) {
                            break;
                        }
                        vs[] vsVarArr2 = this.f;
                        int i7 = i5 - 1;
                        vs vsVar3 = vsVarArr2[i5];
                        vsVarArr2[i7] = vsVar3;
                        sfe sfe2 = vsVar3.a;
                        if (sfe2.c == i5) {
                            sfe2.c = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f[i6] = null;
                    }
                    this.j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i2 = 0; i2 < this.j; i2++) {
            vs vsVar = this.f[i2];
            vsVar.a.v = vsVar.b;
        }
    }

    public final sfe j(int i2) {
        if (this.i + 1 >= this.e) {
            o();
        }
        sfe a2 = a(4);
        int i3 = this.b + 1;
        this.b = i3;
        this.i++;
        a2.b = i3;
        a2.o = i2;
        ((sfe[]) this.l.o)[i3] = a2;
        vub vub = this.c;
        vub.i.b = a2;
        float[] fArr = a2.y;
        Arrays.fill(fArr, c44.DEFAULT_ASPECT_RATIO);
        fArr[a2.o] = 1.0f;
        vub.j(a2);
        return a2;
    }

    public final sfe k(Object obj) {
        sfe sfe = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof aj3) {
            aj3 aj3 = (aj3) obj;
            sfe = aj3.i;
            if (sfe == null) {
                aj3.k();
                sfe = aj3.i;
            }
            int i2 = sfe.b;
            g6d g6d = this.l;
            if (i2 == -1 || i2 > this.b || ((sfe[]) g6d.o)[i2] == null) {
                if (i2 != -1) {
                    sfe.c();
                }
                int i3 = this.b + 1;
                this.b = i3;
                this.i++;
                sfe.b = i3;
                sfe.Z = 1;
                ((sfe[]) g6d.o)[i3] = sfe;
            }
        }
        return sfe;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: vs} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.vs l() {
        /*
            r5 = this;
            g6d r5 = r5.l
            java.lang.Object r0 = r5.b
            wqb r0 = (defpackage.wqb) r0
            int r1 = r0.b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.a
            r4 = r3[r1]
            r3[r1] = r2
            r0.b = r1
            goto L_0x0017
        L_0x0016:
            r4 = r2
        L_0x0017:
            vs r4 = (defpackage.vs) r4
            if (r4 != 0) goto L_0x0021
            vs r4 = new vs
            r4.<init>(r5)
            goto L_0x002e
        L_0x0021:
            r4.a = r2
            ls r5 = r4.d
            r5.b()
            r5 = 0
            r4.b = r5
            r5 = 0
            r4.e = r5
        L_0x002e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw7.l():vs");
    }

    public final sfe m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        sfe a2 = a(3);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        a2.b = i2;
        ((sfe[]) this.l.o)[i2] = a2;
        return a2;
    }

    public final void o() {
        int i2 = this.d * 2;
        this.d = i2;
        this.f = (vs[]) Arrays.copyOf(this.f, i2);
        g6d g6d = this.l;
        g6d.o = (sfe[]) Arrays.copyOf((sfe[]) g6d.o, this.d);
        int i3 = this.d;
        this.h = new boolean[i3];
        this.e = i3;
        this.k = i3;
    }

    public final void p() {
        vub vub = this.c;
        if (vub.e()) {
            i();
        } else if (this.g) {
            for (int i2 = 0; i2 < this.j; i2++) {
                if (!this.f[i2].e) {
                    q(vub);
                    return;
                }
            }
            i();
        } else {
            q(vub);
        }
    }

    public final void q(vs vsVar) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.j) {
                break;
            }
            vs vsVar2 = this.f[i2];
            int i3 = 1;
            if (vsVar2.a.Z != 1) {
                float f2 = vsVar2.b;
                float f3 = c44.DEFAULT_ASPECT_RATIO;
                if (f2 < c44.DEFAULT_ASPECT_RATIO) {
                    boolean z = false;
                    int i4 = 0;
                    while (!z) {
                        i4 += i3;
                        float f4 = Float.MAX_VALUE;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < this.j) {
                            vs vsVar3 = this.f[i7];
                            if (vsVar3.a.Z != i3 && !vsVar3.e && vsVar3.b < f3) {
                                int f5 = vsVar3.d.f();
                                int i9 = 0;
                                while (i9 < f5) {
                                    sfe g2 = vsVar3.d.g(i9);
                                    float e2 = vsVar3.d.e(g2);
                                    if (e2 > f3) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f6 = g2.x[i10] / e2;
                                            if ((f6 < f4 && i10 == i8) || i10 > i8) {
                                                i8 = i10;
                                                i6 = g2.b;
                                                i5 = i7;
                                                f4 = f6;
                                            }
                                        }
                                    }
                                    i9++;
                                    f3 = c44.DEFAULT_ASPECT_RATIO;
                                }
                            }
                            i7++;
                            f3 = c44.DEFAULT_ASPECT_RATIO;
                            i3 = 1;
                        }
                        if (i5 != -1) {
                            vs vsVar4 = this.f[i5];
                            vsVar4.a.c = -1;
                            vsVar4.g(((sfe[]) this.l.o)[i6]);
                            sfe sfe = vsVar4.a;
                            sfe.c = i5;
                            sfe.e(this, vsVar4);
                        } else {
                            z = true;
                        }
                        if (i4 > this.i / 2) {
                            z = true;
                        }
                        f3 = c44.DEFAULT_ASPECT_RATIO;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        r(vsVar);
        i();
    }

    public final void r(vs vsVar) {
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 < this.i * 2) {
                sfe sfe = vsVar.a;
                if (sfe != null) {
                    this.h[sfe.b] = true;
                }
                sfe d2 = vsVar.d(this.h);
                if (d2 != null) {
                    boolean[] zArr = this.h;
                    int i4 = d2.b;
                    if (!zArr[i4]) {
                        zArr[i4] = true;
                    } else {
                        return;
                    }
                }
                if (d2 != null) {
                    float f2 = Float.MAX_VALUE;
                    int i5 = -1;
                    for (int i6 = 0; i6 < this.j; i6++) {
                        vs vsVar2 = this.f[i6];
                        if (vsVar2.a.Z != 1 && !vsVar2.e && vsVar2.d.c(d2)) {
                            float e2 = vsVar2.d.e(d2);
                            if (e2 < c44.DEFAULT_ASPECT_RATIO) {
                                float f3 = (-vsVar2.b) / e2;
                                if (f3 < f2) {
                                    i5 = i6;
                                    f2 = f3;
                                }
                            }
                        }
                    }
                    if (i5 > -1) {
                        vs vsVar3 = this.f[i5];
                        vsVar3.a.c = -1;
                        vsVar3.g(d2);
                        sfe sfe2 = vsVar3.a;
                        sfe2.c = i5;
                        sfe2.e(this, vsVar3);
                    }
                } else {
                    z = true;
                }
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i2 = 0; i2 < this.j; i2++) {
            vs vsVar = this.f[i2];
            if (vsVar != null) {
                ((wqb) this.l.b).a(vsVar);
            }
            this.f[i2] = null;
        }
    }

    public final void t() {
        g6d g6d;
        int i2 = 0;
        while (true) {
            g6d = this.l;
            sfe[] sfeArr = (sfe[]) g6d.o;
            if (i2 >= sfeArr.length) {
                break;
            }
            sfe sfe = sfeArr[i2];
            if (sfe != null) {
                sfe.c();
            }
            i2++;
        }
        wqb wqb = (wqb) g6d.c;
        sfe[] sfeArr2 = this.m;
        int i3 = this.n;
        wqb.getClass();
        if (i3 > sfeArr2.length) {
            i3 = sfeArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            sfe sfe2 = sfeArr2[i4];
            int i5 = wqb.b;
            Object[] objArr = wqb.a;
            if (i5 < objArr.length) {
                objArr[i5] = sfe2;
                wqb.b = i5 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((sfe[]) g6d.o, (Object) null);
        this.b = 0;
        vub vub = this.c;
        vub.h = 0;
        vub.b = c44.DEFAULT_ASPECT_RATIO;
        this.i = 1;
        for (int i6 = 0; i6 < this.j; i6++) {
            vs vsVar = this.f[i6];
        }
        s();
        this.j = 0;
        this.o = new vs(g6d);
    }
}
