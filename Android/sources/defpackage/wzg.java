package defpackage;

import com.google.android.gms.internal.play_billing.zzci;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.uuid.Uuid;

/* renamed from: wzg  reason: default package */
public final class wzg extends ev0 {
    public static final Logger q = Logger.getLogger(wzg.class.getName());
    public static final boolean r = k3h.e;
    public p1e m;
    public final byte[] n;
    public final int o;
    public int p;

    public wzg(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.n = bArr;
            this.p = 0;
            this.o = i;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)}));
    }

    public static int V(int i, azg azg, l2h l2h) {
        int Y = Y(i << 3);
        return azg.a(l2h) + Y + Y;
    }

    public static int W(azg azg, l2h l2h) {
        int a = azg.a(l2h);
        return Y(a) + a;
    }

    public static int X(String str) {
        int i;
        try {
            i = r3h.c(str);
        } catch (q3h unused) {
            i = str.getBytes(y0h.a).length;
        }
        return Y(i) + i;
    }

    public static int Y(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int Z(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void J(byte b) {
        try {
            byte[] bArr = this.n;
            int i = this.p;
            this.p = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzci(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.p), Integer.valueOf(this.o), 1}), e);
        }
    }

    public final void K(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.n, this.p, i);
            this.p += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzci(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.p), Integer.valueOf(this.o), Integer.valueOf(i)}), e);
        }
    }

    public final void L(int i, fzg fzg) {
        S((i << 3) | 2);
        S(fzg.e());
        K(fzg.e(), fzg.b);
    }

    public final void M(int i, int i2) {
        S((i << 3) | 5);
        N(i2);
    }

    public final void N(int i) {
        try {
            byte[] bArr = this.n;
            int i2 = this.p;
            int i3 = i2 + 1;
            this.p = i3;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i2 + 2;
            this.p = i4;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i2 + 3;
            this.p = i5;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.p = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzci(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.p), Integer.valueOf(this.o), 1}), e);
        }
    }

    public final void O(int i, long j) {
        S((i << 3) | 1);
        P(j);
    }

    public final void P(long j) {
        try {
            byte[] bArr = this.n;
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i3 = i + 2;
            this.p = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i + 3;
            this.p = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i + 4;
            this.p = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i + 5;
            this.p = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i + 6;
            this.p = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i + 7;
            this.p = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.p = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzci(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.p), Integer.valueOf(this.o), 1}), e);
        }
    }

    public final void Q(int i, String str) {
        S((i << 3) | 2);
        int i2 = this.p;
        try {
            int Y = Y(str.length() * 3);
            int Y2 = Y(str.length());
            int i3 = this.o;
            byte[] bArr = this.n;
            if (Y2 == Y) {
                int i4 = i2 + Y2;
                this.p = i4;
                int b = r3h.b(bArr, i4, i3 - i4, str);
                this.p = i2;
                S((b - i2) - Y2);
                this.p = b;
                return;
            }
            S(r3h.c(str));
            int i5 = this.p;
            this.p = r3h.b(bArr, i5, i3 - i5, str);
        } catch (q3h e) {
            q3h q3h = e;
            this.p = i2;
            q.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", q3h);
            byte[] bytes = str.getBytes(y0h.a);
            try {
                int length = bytes.length;
                S(length);
                K(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzci(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new zzci(e3);
        }
    }

    public final void R(int i, int i2) {
        S((i << 3) | i2);
    }

    public final void S(int i) {
        while (true) {
            int i2 = i & -128;
            byte[] bArr = this.n;
            if (i2 == 0) {
                try {
                    int i3 = this.p;
                    this.p = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzci(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.p), Integer.valueOf(this.o), 1}), e);
                }
            } else {
                int i4 = this.p;
                this.p = i4 + 1;
                bArr[i4] = (byte) ((i | Uuid.SIZE_BITS) & KotlinVersion.MAX_COMPONENT_VALUE);
                i >>>= 7;
            }
        }
    }

    public final void T(int i, long j) {
        S(i << 3);
        U(j);
    }

    public final void U(long j) {
        boolean z = r;
        int i = this.o;
        byte[] bArr = this.n;
        if (!z || i - this.p < 10) {
            while ((j & -128) != 0) {
                int i2 = this.p;
                this.p = i2 + 1;
                bArr[i2] = (byte) ((((int) j) | Uuid.SIZE_BITS) & KotlinVersion.MAX_COMPONENT_VALUE);
                j >>>= 7;
            }
            try {
                int i3 = this.p;
                this.p = i3 + 1;
                bArr[i3] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzci(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.p), Integer.valueOf(i), 1}), e);
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & -128) == 0) {
                    int i5 = this.p;
                    this.p = i5 + 1;
                    j3h j3h = k3h.c;
                    j3h.j1(bArr, k3h.f + ((long) i5), (byte) i4);
                    return;
                }
                int i6 = this.p;
                this.p = i6 + 1;
                long j2 = k3h.f + ((long) i6);
                k3h.c.j1(bArr, j2, (byte) ((i4 | Uuid.SIZE_BITS) & KotlinVersion.MAX_COMPONENT_VALUE));
                j >>>= 7;
            }
        }
    }
}
