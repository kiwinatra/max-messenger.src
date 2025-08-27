package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import kotlin.KotlinVersion;

/* renamed from: kla  reason: default package */
public final class kla {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    public final Object g;

    public kla(int i) {
        switch (i) {
            case 1:
                this.f = new int[KotlinVersion.MAX_COMPONENT_VALUE];
                this.g = new l8b((int) KotlinVersion.MAX_COMPONENT_VALUE);
                return;
            default:
                this.f = new int[KotlinVersion.MAX_COMPONENT_VALUE];
                this.g = new g1g((int) KotlinVersion.MAX_COMPONENT_VALUE);
                return;
        }
    }

    public boolean a(gf4 gf4, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        g1g g1g = (g1g) this.g;
        g1g.E(27);
        try {
            z2 = gf4.q(g1g.a, 0, 27, z);
        } catch (EOFException e2) {
            if (z) {
                z2 = false;
            } else {
                throw e2;
            }
        }
        if (!z2 || g1g.w() != 1332176723) {
            return false;
        }
        if (g1g.v() == 0) {
            this.a = g1g.v();
            this.b = g1g.k();
            g1g.m();
            g1g.m();
            g1g.m();
            int v = g1g.v();
            this.c = v;
            this.d = v + 27;
            g1g.E(v);
            try {
                z3 = gf4.q(g1g.a, 0, this.c, z);
            } catch (EOFException e3) {
                if (z) {
                    z3 = false;
                } else {
                    throw e3;
                }
            }
            if (!z3) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                int v2 = g1g.v();
                this.f[i] = v2;
                this.e += v2;
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw ParserException.c("unsupported bit stream revision");
        }
    }

    public boolean b(hf4 hf4, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        l8b l8b = (l8b) this.g;
        l8b.D(27);
        try {
            z2 = hf4.q(l8b.a, 0, 27, z);
        } catch (EOFException e2) {
            if (z) {
                z2 = false;
            } else {
                throw e2;
            }
        }
        if (!z2 || l8b.w() != 1332176723) {
            return false;
        }
        if (l8b.u() == 0) {
            this.a = l8b.u();
            this.b = l8b.j();
            l8b.l();
            l8b.l();
            l8b.l();
            int u = l8b.u();
            this.c = u;
            this.d = u + 27;
            l8b.D(u);
            try {
                z3 = hf4.q(l8b.a, 0, this.c, z);
            } catch (EOFException e3) {
                if (z) {
                    z3 = false;
                } else {
                    throw e3;
                }
            }
            if (!z3) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                int u2 = l8b.u();
                this.f[i] = u2;
                this.e += u2;
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw androidx.media3.common.ParserException.c("unsupported bit stream revision");
        }
    }

    public boolean c(gf4 gf4, long j) {
        int i;
        boolean z;
        y64.g(gf4.o == gf4.r());
        g1g g1g = (g1g) this.g;
        g1g.E(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i != 0 && gf4.o + 4 >= j) {
                break;
            }
            try {
                z = gf4.q(g1g.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            g1g.H(0);
            if (g1g.w() == 1332176723) {
                gf4.w = 0;
                return true;
            }
            gf4.z(1);
        }
        do {
            if ((i != 0 && gf4.o >= j) || gf4.e() == -1) {
                return false;
            }
            break;
        } while (gf4.e() == -1);
        return false;
    }

    public boolean d(hf4 hf4, long j) {
        int i;
        boolean z;
        n79.g(hf4.o == hf4.r());
        l8b l8b = (l8b) this.g;
        l8b.D(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i != 0 && hf4.o + 4 >= j) {
                break;
            }
            try {
                z = hf4.q(l8b.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            l8b.G(0);
            if (l8b.w() == 1332176723) {
                hf4.w = 0;
                return true;
            }
            hf4.z(1);
        }
        do {
            if ((i != 0 && hf4.o >= j) || hf4.e(1) == -1) {
                return false;
            }
            break;
        } while (hf4.e(1) == -1);
        return false;
    }
}
