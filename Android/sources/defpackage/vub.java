package defpackage;

import java.util.Arrays;

/* renamed from: vub  reason: default package */
public final class vub extends vs {
    public sfe[] f;
    public sfe[] g;
    public int h;
    public fj i;

    public final sfe d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.h; i3++) {
            sfe[] sfeArr = this.f;
            sfe sfe = sfeArr[i3];
            if (!zArr[sfe.b]) {
                fj fjVar = this.i;
                fjVar.b = sfe;
                int i4 = 8;
                if (i2 != -1) {
                    sfe sfe2 = sfeArr[i2];
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f2 = sfe2.y[i4];
                        float f3 = ((sfe) fjVar.b).y[i4];
                        if (f3 == f2) {
                            i4--;
                        } else if (f3 >= f2) {
                        }
                    }
                } else {
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f4 = ((sfe) fjVar.b).y[i4];
                        if (f4 > c44.DEFAULT_ASPECT_RATIO) {
                            break;
                        } else if (f4 < c44.DEFAULT_ASPECT_RATIO) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f[i2];
    }

    public final boolean e() {
        return this.h == 0;
    }

    public final void i(gw7 gw7, vs vsVar, boolean z) {
        vs vsVar2 = vsVar;
        sfe sfe = vsVar2.a;
        if (sfe != null) {
            ls lsVar = vsVar2.d;
            int f2 = lsVar.f();
            for (int i2 = 0; i2 < f2; i2++) {
                sfe g2 = lsVar.g(i2);
                float h2 = lsVar.h(i2);
                fj fjVar = this.i;
                fjVar.b = g2;
                boolean z2 = g2.a;
                float[] fArr = sfe.y;
                if (z2) {
                    boolean z3 = true;
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr2 = ((sfe) fjVar.b).y;
                        float f3 = (fArr[i3] * h2) + fArr2[i3];
                        fArr2[i3] = f3;
                        if (Math.abs(f3) < 1.0E-4f) {
                            ((sfe) fjVar.b).y[i3] = 0.0f;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        ((vub) fjVar.c).k((sfe) fjVar.b);
                    }
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f4 = fArr[i4];
                        if (f4 != c44.DEFAULT_ASPECT_RATIO) {
                            float f5 = f4 * h2;
                            if (Math.abs(f5) < 1.0E-4f) {
                                f5 = 0.0f;
                            }
                            ((sfe) fjVar.b).y[i4] = f5;
                        } else {
                            ((sfe) fjVar.b).y[i4] = 0.0f;
                        }
                    }
                    j(g2);
                }
                this.b = (vsVar2.b * h2) + this.b;
            }
            k(sfe);
        }
    }

    public final void j(sfe sfe) {
        int i2;
        int i3 = this.h + 1;
        sfe[] sfeArr = this.f;
        if (i3 > sfeArr.length) {
            sfe[] sfeArr2 = (sfe[]) Arrays.copyOf(sfeArr, sfeArr.length * 2);
            this.f = sfeArr2;
            this.g = (sfe[]) Arrays.copyOf(sfeArr2, sfeArr2.length * 2);
        }
        sfe[] sfeArr3 = this.f;
        int i4 = this.h;
        sfeArr3[i4] = sfe;
        int i5 = i4 + 1;
        this.h = i5;
        if (i5 > 1 && sfeArr3[i4].b > sfe.b) {
            int i6 = 0;
            while (true) {
                i2 = this.h;
                if (i6 >= i2) {
                    break;
                }
                this.g[i6] = this.f[i6];
                i6++;
            }
            Arrays.sort(this.g, 0, i2, new ed7(9));
            for (int i7 = 0; i7 < this.h; i7++) {
                this.f[i7] = this.g[i7];
            }
        }
        sfe.a = true;
        sfe.a(this);
    }

    public final void k(sfe sfe) {
        int i2 = 0;
        while (i2 < this.h) {
            if (this.f[i2] == sfe) {
                while (true) {
                    int i3 = this.h;
                    if (i2 < i3 - 1) {
                        sfe[] sfeArr = this.f;
                        int i4 = i2 + 1;
                        sfeArr[i2] = sfeArr[i4];
                        i2 = i4;
                    } else {
                        this.h = i3 - 1;
                        sfe.a = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i2 = 0; i2 < this.h; i2++) {
            sfe sfe = this.f[i2];
            fj fjVar = this.i;
            fjVar.b = sfe;
            str = str + fjVar + " ";
        }
        return str;
    }
}
