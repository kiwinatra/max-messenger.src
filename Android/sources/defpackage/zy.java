package defpackage;

import java.util.NoSuchElementException;
import kotlin.KotlinVersion;

/* renamed from: zy  reason: default package */
public final class zy implements wy, xy {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int o;
    public int v;
    public Object w;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zy(int i, byte b2) {
        this(16);
        this.a = i;
        switch (i) {
            case 4:
                return;
            default:
                this.b = 0;
                this.c = -1;
                this.o = 0;
                int[] iArr = new int[16];
                this.w = iArr;
                this.v = iArr.length - 1;
                return;
        }
    }

    public int a() {
        switch (this.a) {
            case 0:
                return -1;
            default:
                return -1;
        }
    }

    public int b() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public int c() {
        switch (this.a) {
            case 0:
                g1g g1g = (g1g) this.w;
                int i = this.c;
                if (i == 8) {
                    return g1g.v();
                }
                if (i == 16) {
                    return g1g.A();
                }
                int i2 = this.o;
                this.o = i2 + 1;
                if (i2 % 2 != 0) {
                    return this.v & 15;
                }
                int v2 = g1g.v();
                this.v = v2;
                return (v2 & 240) >> 4;
            default:
                l8b l8b = (l8b) this.w;
                int i3 = this.c;
                if (i3 == 8) {
                    return l8b.u();
                }
                if (i3 == 16) {
                    return l8b.A();
                }
                int i4 = this.o;
                this.o = i4 + 1;
                if (i4 % 2 != 0) {
                    return this.v & 15;
                }
                int u = l8b.u();
                this.v = u;
                return (u & 240) >> 4;
        }
    }

    public void d(int i) {
        int i2 = this.o;
        int[] iArr = (int[]) this.w;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i3 = this.b;
                int i4 = length2 - i3;
                System.arraycopy(iArr, i3, iArr2, 0, i4);
                System.arraycopy((int[]) this.w, 0, iArr2, i4, i3);
                this.b = 0;
                this.c = this.o - 1;
                this.w = iArr2;
                this.v = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i5 = (this.c + 1) & this.v;
        this.c = i5;
        ((int[]) this.w)[i5] = i;
        this.o++;
    }

    public void e(long j) {
        int i = this.o;
        long[] jArr = (long[]) this.w;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i2 = this.b;
                int i3 = length2 - i2;
                System.arraycopy(jArr, i2, jArr2, 0, i3);
                System.arraycopy((long[]) this.w, 0, jArr2, i3, i2);
                this.b = 0;
                this.c = this.o - 1;
                this.w = jArr2;
                this.v = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i4 = (this.c + 1) & this.v;
        this.c = i4;
        ((long[]) this.w)[i4] = j;
        this.o++;
    }

    public long f() {
        if (this.o != 0) {
            return ((long[]) this.w)[this.b];
        }
        throw new NoSuchElementException();
    }

    public int g() {
        int i = this.o;
        if (i != 0) {
            int i2 = this.b;
            int i3 = ((int[]) this.w)[i2];
            this.b = (i2 + 1) & this.v;
            this.o = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    public long h() {
        int i = this.o;
        if (i != 0) {
            int i2 = this.b;
            long j = ((long[]) this.w)[i2];
            this.b = this.v & (i2 + 1);
            this.o = i - 1;
            return j;
        }
        throw new NoSuchElementException();
    }

    public zy(int i) {
        this.a = 4;
        n79.g(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.b = 0;
        this.c = -1;
        this.o = 0;
        long[] jArr = new long[i];
        this.w = jArr;
        this.v = jArr.length - 1;
    }

    public zy(int i, int i2, int i3, int i4, String str) {
        this.a = 2;
        this.w = str;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.v = i4;
    }

    public zy(ry ryVar) {
        this.a = 0;
        g1g g1g = ryVar.c;
        this.w = g1g;
        g1g.H(12);
        this.c = g1g.y() & KotlinVersion.MAX_COMPONENT_VALUE;
        this.b = g1g.y();
    }

    public zy(sy syVar) {
        this.a = 1;
        l8b l8b = syVar.c;
        this.w = l8b;
        l8b.G(12);
        this.c = l8b.y() & KotlinVersion.MAX_COMPONENT_VALUE;
        this.b = l8b.y();
    }
}
