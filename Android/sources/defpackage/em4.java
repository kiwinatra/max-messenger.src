package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: em4  reason: default package */
public final class em4 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, xad] */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.fm4 r7, int r8, java.util.ArrayList r9, defpackage.xad r10) {
        /*
            r6 = this;
            gng r7 = r7.d
            xad r0 = r7.c
            if (r0 != 0) goto L_0x00e1
            java.lang.Object r0 = r6.c
            uj3 r0 = (defpackage.uj3) r0
            s27 r1 = r0.d
            if (r7 == r1) goto L_0x00e1
            w2g r0 = r0.e
            if (r7 != r0) goto L_0x0014
            goto L_0x00e1
        L_0x0014:
            if (r10 != 0) goto L_0x002a
            xad r10 = new xad
            r10.<init>()
            r0 = 0
            r10.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.b = r0
            r10.a = r7
            r9.add(r10)
        L_0x002a:
            r7.c = r10
            java.util.ArrayList r0 = r10.b
            r0.add(r7)
            fm4 r0 = r7.h
            java.util.ArrayList r1 = r0.k
            java.util.Iterator r1 = r1.iterator()
        L_0x0039:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r1.next()
            cm4 r2 = (defpackage.cm4) r2
            boolean r3 = r2 instanceof defpackage.fm4
            if (r3 == 0) goto L_0x0039
            fm4 r2 = (defpackage.fm4) r2
            r6.a(r2, r8, r9, r10)
            goto L_0x0039
        L_0x004f:
            fm4 r1 = r7.i
            java.util.ArrayList r2 = r1.k
            java.util.Iterator r2 = r2.iterator()
        L_0x0057:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006d
            java.lang.Object r3 = r2.next()
            cm4 r3 = (defpackage.cm4) r3
            boolean r4 = r3 instanceof defpackage.fm4
            if (r4 == 0) goto L_0x0057
            fm4 r3 = (defpackage.fm4) r3
            r6.a(r3, r8, r9, r10)
            goto L_0x0057
        L_0x006d:
            r2 = 1
            if (r8 != r2) goto L_0x0095
            boolean r3 = r7 instanceof defpackage.w2g
            if (r3 == 0) goto L_0x0095
            r3 = r7
            w2g r3 = (defpackage.w2g) r3
            fm4 r3 = r3.k
            java.util.ArrayList r3 = r3.k
            java.util.Iterator r3 = r3.iterator()
        L_0x007f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0095
            java.lang.Object r4 = r3.next()
            cm4 r4 = (defpackage.cm4) r4
            boolean r5 = r4 instanceof defpackage.fm4
            if (r5 == 0) goto L_0x007f
            fm4 r4 = (defpackage.fm4) r4
            r6.a(r4, r8, r9, r10)
            goto L_0x007f
        L_0x0095:
            java.util.ArrayList r0 = r0.l
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r0.next()
            fm4 r3 = (defpackage.fm4) r3
            r6.a(r3, r8, r9, r10)
            goto L_0x009b
        L_0x00ab:
            java.util.ArrayList r0 = r1.l
            java.util.Iterator r0 = r0.iterator()
        L_0x00b1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c1
            java.lang.Object r1 = r0.next()
            fm4 r1 = (defpackage.fm4) r1
            r6.a(r1, r8, r9, r10)
            goto L_0x00b1
        L_0x00c1:
            if (r8 != r2) goto L_0x00e1
            boolean r0 = r7 instanceof defpackage.w2g
            if (r0 == 0) goto L_0x00e1
            w2g r7 = (defpackage.w2g) r7
            fm4 r7 = r7.k
            java.util.ArrayList r7 = r7.l
            java.util.Iterator r7 = r7.iterator()
        L_0x00d1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r7.next()
            fm4 r0 = (defpackage.fm4) r0
            r6.a(r0, r8, r9, r10)
            goto L_0x00d1
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em4.a(fm4, int, java.util.ArrayList, xad):void");
    }

    public void b(uj3 uj3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        uj3 uj32 = uj3;
        Iterator it = uj32.q0.iterator();
        while (it.hasNext()) {
            tj3 tj3 = (tj3) it.next();
            int[] iArr = tj3.p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (tj3.g0 == 8) {
                tj3.a = true;
            } else {
                float f2 = tj3.w;
                if (f2 < 1.0f && i7 == 3) {
                    tj3.r = 2;
                }
                float f3 = tj3.z;
                if (f3 < 1.0f && i8 == 3) {
                    tj3.s = 2;
                }
                if (tj3.W > c44.DEFAULT_ASPECT_RATIO) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        tj3.r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        tj3.s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (tj3.r == 0) {
                            tj3.r = 3;
                        }
                        if (tj3.s == 0) {
                            tj3.s = 3;
                        }
                    }
                }
                aj3 aj3 = tj3.K;
                aj3 aj32 = tj3.I;
                if (i7 == 3 && tj3.r == 1 && (aj32.f == null || aj3.f == null)) {
                    i7 = 2;
                }
                aj3 aj33 = tj3.L;
                aj3 aj34 = tj3.J;
                int i9 = (i8 == 3 && tj3.s == 1 && (aj34.f == null || aj33.f == null)) ? 2 : i8;
                s27 s27 = tj3.d;
                s27.d = i7;
                int i10 = tj3.r;
                s27.a = i10;
                w2g w2g = tj3.e;
                w2g.d = i9;
                int i11 = tj3.s;
                w2g.a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q = tj3.q();
                    if (i7 == 4) {
                        i4 = (uj3.q() - aj32.g) - aj3.g;
                        i7 = 1;
                    } else {
                        i4 = q;
                    }
                    int k = tj3.k();
                    if (i9 == 4) {
                        i5 = (uj3.k() - aj34.g) - aj33.g;
                        i6 = 1;
                    } else {
                        i5 = k;
                        i6 = i9;
                    }
                    f(i7, i4, i6, i5, tj3);
                    tj3.d.e.d(tj3.q());
                    tj3.e.e.d(tj3.k());
                    tj3.a = true;
                } else {
                    int[] iArr2 = uj32.p0;
                    aj3[] aj3Arr = tj3.Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, tj3);
                        }
                        int k2 = tj3.k();
                        f(1, (int) ((((float) k2) * tj3.W) + 0.5f), 1, k2, tj3);
                        tj3.d.e.d(tj3.q());
                        tj3.e.e.d(tj3.k());
                        tj3.a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, tj3);
                        tj3.d.e.m = tj3.q();
                    } else {
                        if (i10 == 2) {
                            int i12 = iArr2[0];
                            if (i12 == 1 || i12 == 4) {
                                f(1, (int) ((f2 * ((float) uj3.q())) + 0.5f), i9, tj3.k(), tj3);
                                tj3.d.e.d(tj3.q());
                                tj3.e.e.d(tj3.k());
                                tj3.a = true;
                            }
                        } else if (aj3Arr[0].f == null || aj3Arr[1].f == null) {
                            f(2, 0, i9, 0, tj3);
                            tj3.d.e.d(tj3.q());
                            tj3.e.e.d(tj3.k());
                            tj3.a = true;
                        }
                        i = 3;
                    }
                    if (i9 == i) {
                        if (i7 != 2 && i7 != 1) {
                            i2 = i;
                            i3 = 1;
                            if (i7 == i2 && i9 == i2) {
                                if (i10 != i3 || i11 == i3) {
                                    f(2, 0, 2, 0, tj3);
                                    tj3.d.e.m = tj3.q();
                                    tj3.e.e.m = tj3.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i3] == 1) {
                                    f(1, (int) ((f2 * ((float) uj3.q())) + 0.5f), 1, (int) ((f3 * ((float) uj3.k())) + 0.5f), tj3);
                                    tj3.d.e.d(tj3.q());
                                    tj3.e.e.d(tj3.k());
                                    tj3.a = true;
                                }
                            }
                        } else if (i11 == i) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, tj3);
                            }
                            int q2 = tj3.q();
                            float f4 = tj3.W;
                            if (tj3.X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q2, 1, (int) ((((float) q2) * f4) + 0.5f), tj3);
                            tj3.d.e.d(tj3.q());
                            tj3.e.e.d(tj3.k());
                            tj3.a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, tj3);
                            tj3.e.e.m = tj3.k();
                        } else if (i11 == 2) {
                            int i13 = iArr2[1];
                            if (i13 == 1 || i13 == 4) {
                                f(i7, tj3.q(), 1, (int) ((f3 * ((float) uj3.k())) + 0.5f), tj3);
                                tj3.d.e.d(tj3.q());
                                tj3.e.e.d(tj3.k());
                                tj3.a = true;
                            }
                        } else if (aj3Arr[2].f == null || aj3Arr[3].f == null) {
                            f(2, 0, i9, 0, tj3);
                            tj3.d.e.d(tj3.q());
                            tj3.e.e.d(tj3.k());
                            tj3.a = true;
                        }
                    }
                    i3 = 1;
                    i2 = 3;
                    if (i10 != i3) {
                    }
                    f(2, 0, 2, 0, tj3);
                    tj3.d.e.m = tj3.q();
                    tj3.e.e.m = tj3.k();
                }
            }
        }
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.e;
        arrayList.clear();
        uj3 uj3 = (uj3) this.d;
        uj3.d.f();
        uj3.e.f();
        arrayList.add(uj3.d);
        arrayList.add(uj3.e);
        Iterator it = uj3.q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            tj3 tj3 = (tj3) it.next();
            if (tj3 instanceof iv6) {
                gng gng = new gng(tj3);
                tj3.d.f();
                tj3.e.f();
                gng.f = ((iv6) tj3).u0;
                arrayList.add(gng);
            } else {
                if (tj3.x()) {
                    if (tj3.b == null) {
                        tj3.b = new yy1(tj3, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(tj3.b);
                } else {
                    arrayList.add(tj3.d);
                }
                if (tj3.y()) {
                    if (tj3.c == null) {
                        tj3.c = new yy1(tj3, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(tj3.c);
                } else {
                    arrayList.add(tj3.e);
                }
                if (tj3 instanceof cy6) {
                    arrayList.add(new gng(tj3));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((gng) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            gng gng2 = (gng) it3.next();
            if (gng2.b != uj3) {
                gng2.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        uj3 uj32 = (uj3) this.c;
        e(uj32.d, 0, arrayList2);
        e(uj32.e, 1, arrayList2);
        this.a = false;
    }

    public int d(uj3 uj3, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f2;
        uj3 uj32 = uj3;
        int i3 = i;
        ArrayList arrayList2 = (ArrayList) this.f;
        int size = arrayList2.size();
        long j2 = 0;
        int i4 = 0;
        long j3 = 0;
        while (i4 < size) {
            gng gng = ((xad) arrayList2.get(i4)).a;
            if (!(gng instanceof yy1) ? i3 != 0 ? (gng instanceof w2g) : (gng instanceof s27) : ((yy1) gng).f == i3) {
                fm4 fm4 = (i3 == 0 ? uj32.d : uj32.e).h;
                fm4 fm42 = (i3 == 0 ? uj32.d : uj32.e).i;
                boolean contains = gng.h.l.contains(fm4);
                fm4 fm43 = gng.i;
                boolean contains2 = fm43.l.contains(fm42);
                long j4 = gng.j();
                fm4 fm44 = gng.h;
                if (!contains || !contains2) {
                    arrayList = arrayList2;
                    i2 = i4;
                    j = contains ? Math.max(xad.b(fm44, (long) fm44.f), ((long) fm44.f) + j4) : contains2 ? Math.max(-xad.a(fm43, (long) fm43.f), ((long) (-fm43.f)) + j4) : (gng.j() + ((long) fm44.f)) - ((long) fm43.f);
                } else {
                    long b2 = xad.b(fm44, j2);
                    arrayList = arrayList2;
                    long a2 = xad.a(fm43, j2);
                    long j5 = b2 - j4;
                    int i5 = fm43.f;
                    i2 = i4;
                    if (j5 >= ((long) (-i5))) {
                        j5 += (long) i5;
                    }
                    long j6 = (long) fm44.f;
                    long j7 = ((-a2) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    tj3 tj3 = gng.b;
                    if (i3 == 0) {
                        f2 = tj3.d0;
                    } else if (i3 == 1) {
                        f2 = tj3.e0;
                    } else {
                        tj3.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = (float) (f2 > c44.DEFAULT_ASPECT_RATIO ? (long) ((((float) j5) / (1.0f - f2)) + (((float) j7) / f2)) : 0);
                    j = (((long) fm44.f) + ((((long) ((f3 * f2) + 0.5f)) + j4) + ((long) i2a.f(1.0f, f2, f3, 0.5f)))) - ((long) fm43.f);
                }
            } else {
                arrayList = arrayList2;
                j = j2;
                i2 = i4;
            }
            j3 = Math.max(j3, j);
            i4 = i2 + 1;
            arrayList2 = arrayList;
            uj32 = uj3;
            j2 = 0;
        }
        return (int) j3;
    }

    public void e(gng gng, int i, ArrayList arrayList) {
        fm4 fm4;
        Iterator it = gng.h.k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fm4 = gng.i;
            if (!hasNext) {
                break;
            }
            cm4 cm4 = (cm4) it.next();
            if (cm4 instanceof fm4) {
                a((fm4) cm4, i, arrayList, (xad) null);
            } else if (cm4 instanceof gng) {
                a(((gng) cm4).h, i, arrayList, (xad) null);
            }
        }
        Iterator it2 = fm4.k.iterator();
        while (it2.hasNext()) {
            cm4 cm42 = (cm4) it2.next();
            if (cm42 instanceof fm4) {
                a((fm4) cm42, i, arrayList, (xad) null);
            } else if (cm42 instanceof gng) {
                a(((gng) cm42).i, i, arrayList, (xad) null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((w2g) gng).k.k.iterator();
            while (it3.hasNext()) {
                cm4 cm43 = (cm4) it3.next();
                if (cm43 instanceof fm4) {
                    a((fm4) cm43, i, arrayList, (xad) null);
                }
            }
        }
    }

    public void f(int i, int i2, int i3, int i4, tj3 tj3) {
        xl0 xl0 = (xl0) this.h;
        xl0.b = i;
        xl0.d = i3;
        xl0.e = i2;
        xl0.f = i4;
        ((l8c) this.g).c(tj3, xl0);
        tj3.O(xl0.g);
        tj3.L(xl0.h);
        tj3.E = xl0.c;
        tj3.I(xl0.i);
    }

    public void g() {
        ql0 ql0;
        Iterator it = ((uj3) this.c).q0.iterator();
        while (it.hasNext()) {
            tj3 tj3 = (tj3) it.next();
            if (!tj3.a) {
                int[] iArr = tj3.p0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = tj3.r;
                int i4 = tj3.s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                uo4 uo4 = tj3.d.e;
                boolean z3 = uo4.j;
                uo4 uo42 = tj3.e.e;
                boolean z4 = uo42.j;
                if (z3 && z4) {
                    f(1, uo4.g, 1, uo42.g, tj3);
                    tj3.a = true;
                } else if (z3 && z) {
                    f(1, uo4.g, 2, uo42.g, tj3);
                    if (i2 == 3) {
                        tj3.e.e.m = tj3.k();
                    } else {
                        tj3.e.e.d(tj3.k());
                        tj3.a = true;
                    }
                } else if (z4 && z2) {
                    f(2, uo4.g, 1, uo42.g, tj3);
                    if (i == 3) {
                        tj3.d.e.m = tj3.q();
                    } else {
                        tj3.d.e.d(tj3.q());
                        tj3.a = true;
                    }
                }
                if (tj3.a && (ql0 = tj3.e.l) != null) {
                    ql0.d(tj3.a0);
                }
            }
        }
    }
}
