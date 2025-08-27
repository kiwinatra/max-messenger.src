package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: qy4  reason: default package */
public final class qy4 implements v05, w05 {
    public final /* synthetic */ int a;
    public final Object b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    public Object g;

    public qy4(int i, List list) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.g = new zpf[list.size()];
                this.f = -9223372036854775807L;
                return;
            default:
                this.b = list;
                this.g = new ypf[list.size()];
                this.f = -9223372036854775807L;
                return;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
            case 1:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
            case 2:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
            default:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
        }
    }

    public void f(l8b l8b) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 1:
                if (this.c) {
                    if (this.d == 2) {
                        if (l8b.a() == 0) {
                            z2 = false;
                        } else {
                            if (l8b.u() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (l8b.a() == 0) {
                            z = false;
                        } else {
                            if (l8b.u() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = l8b.b;
                    int a2 = l8b.a();
                    for (zpf b2 : (zpf[]) this.g) {
                        l8b.G(i);
                        b2.b(l8b, a2, 0);
                    }
                    this.e += a2;
                    return;
                }
                return;
            default:
                n79.o((zpf) this.g);
                if (this.c) {
                    int a3 = l8b.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a3, 10 - i2);
                        byte[] bArr = l8b.a;
                        int i3 = l8b.b;
                        l8b l8b2 = (l8b) this.b;
                        System.arraycopy(bArr, i3, l8b2.a, this.e, min);
                        if (this.e + min == 10) {
                            l8b2.G(0);
                            if (73 == l8b2.u() && 68 == l8b2.u() && 51 == l8b2.u()) {
                                l8b2.H(3);
                                this.d = l8b2.t() + 10;
                            } else {
                                i8b.V("Discarding invalid ID3 tag");
                                this.c = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a3, this.d - this.e);
                    ((zpf) this.g).b(l8b, min2, 0);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    public void g(boolean z) {
        int i;
        switch (this.a) {
            case 1:
                if (this.c) {
                    n79.n(this.f != -9223372036854775807L);
                    for (zpf a2 : (zpf[]) this.g) {
                        a2.a(this.f, 1, this.e, 0, (xpf) null);
                    }
                    this.c = false;
                    return;
                }
                return;
            default:
                n79.o((zpf) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    n79.n(this.f != -9223372036854775807L);
                    ((zpf) this.g).a(this.f, 1, this.d, 0, (xpf) null);
                    this.c = false;
                    return;
                }
                return;
        }
    }

    public void h(g1g g1g) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.d == 2) {
                        if (g1g.c() == 0) {
                            z2 = false;
                        } else {
                            if (g1g.v() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (g1g.c() == 0) {
                            z = false;
                        } else {
                            if (g1g.v() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = g1g.b;
                    int c2 = g1g.c();
                    for (ypf c3 : (ypf[]) this.g) {
                        g1g.H(i);
                        c3.c(c2, g1g);
                    }
                    this.e += c2;
                    return;
                }
                return;
            default:
                y64.k((ypf) this.g);
                if (this.c) {
                    int c4 = g1g.c();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(c4, 10 - i2);
                        byte[] bArr = g1g.a;
                        int i3 = g1g.b;
                        g1g g1g2 = (g1g) this.b;
                        System.arraycopy(bArr, i3, g1g2.a, this.e, min);
                        if (this.e + min == 10) {
                            g1g2.H(0);
                            if (73 == g1g2.v() && 68 == g1g2.v() && 51 == g1g2.v()) {
                                g1g2.I(3);
                                this.d = g1g2.u() + 10;
                            } else {
                                this.c = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(c4, this.d - this.e);
                    ((ypf) this.g).c(min2, g1g);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    public final void i(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != -9223372036854775807L) {
                        this.f = j;
                    }
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            case 1:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            case 2:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != -9223372036854775807L) {
                        this.f = j;
                    }
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
            default:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public void j() {
        int i;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.f != -9223372036854775807L) {
                        for (ypf b2 : (ypf[]) this.g) {
                            b2.b(this.f, 1, this.e, 0, (wpf) null);
                        }
                    }
                    this.c = false;
                    return;
                }
                return;
            default:
                y64.k((ypf) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    long j = this.f;
                    if (j != -9223372036854775807L) {
                        ((ypf) this.g).b(j, 1, i, 0, (wpf) null);
                    }
                    this.c = false;
                    return;
                }
                return;
        }
    }

    public void k(xf5 xf5, qtf qtf) {
        switch (this.a) {
            case 1:
                int i = 0;
                while (true) {
                    zpf[] zpfArr = (zpf[]) this.g;
                    if (i < zpfArr.length) {
                        ptf ptf = (ptf) ((List) this.b).get(i);
                        qtf.a();
                        qtf.b();
                        zpf B = xf5.B(qtf.e, 3);
                        ba6 ba6 = new ba6();
                        qtf.b();
                        ba6.a = qtf.f;
                        ba6.m = vq9.l("application/dvbsubs");
                        ba6.p = Collections.singletonList(ptf.b);
                        ba6.d = ptf.a;
                        B.e(new ea6(ba6));
                        zpfArr[i] = B;
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                qtf.a();
                qtf.b();
                zpf B2 = xf5.B(qtf.e, 5);
                this.g = B2;
                ba6 ba62 = new ba6();
                qtf.b();
                ba62.a = qtf.f;
                ba62.m = vq9.l("application/id3");
                B2.e(new ea6(ba62));
                return;
        }
    }

    public void l(wf5 wf5, qtf qtf) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    ypf[] ypfArr = (ypf[]) this.g;
                    if (i < ypfArr.length) {
                        otf otf = (otf) ((List) this.b).get(i);
                        qtf.a();
                        qtf.b();
                        ypf B = wf5.B(qtf.e, 3);
                        aa6 aa6 = new aa6();
                        qtf.b();
                        aa6.a = qtf.f;
                        aa6.k = "application/dvbsubs";
                        aa6.m = Collections.singletonList(otf.b);
                        aa6.c = otf.a;
                        B.d(new ca6(aa6));
                        ypfArr[i] = B;
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                qtf.a();
                qtf.b();
                ypf B2 = wf5.B(qtf.e, 5);
                this.g = B2;
                aa6 aa62 = new aa6();
                qtf.b();
                aa62.a = qtf.f;
                aa62.k = "application/id3";
                B2.d(new ca6(aa62));
                return;
        }
    }

    public qy4(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new l8b(10);
                this.f = -9223372036854775807L;
                return;
            default:
                this.b = new g1g(10);
                this.f = -9223372036854775807L;
                return;
        }
    }
}
