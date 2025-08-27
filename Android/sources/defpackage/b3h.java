package defpackage;

import com.google.android.gms.internal.play_billing.zzdn;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: b3h  reason: default package */
public final class b3h {
    public static final b3h f = new b3h(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public b3h(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static b3h b() {
        return new b3h(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int Y;
        int Z;
        int Y2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    Y2 = wzg.Y(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int Y3 = wzg.Y(i5 << 3);
                    int e2 = ((fzg) this.c[i3]).e();
                    i2 = wzg.Y(e2) + e2 + Y3 + i2;
                } else if (i6 == 3) {
                    int Y4 = wzg.Y(i5 << 3);
                    Y = Y4 + Y4;
                    Z = ((b3h) this.c[i3]).a();
                } else if (i6 == 5) {
                    ((Integer) this.c[i3]).getClass();
                    Y2 = wzg.Y(i5 << 3) + 4;
                } else {
                    int i7 = zzdn.a;
                    throw new IllegalStateException(new IOException("Protocol message tag had invalid wire type."));
                }
                i2 = Y2 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.c[i3]).longValue();
                Y = wzg.Y(i8);
                Z = wzg.Z(longValue);
            }
            i2 = Z + Y + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (this.e) {
            e(this.a + 1);
            int[] iArr = this.b;
            int i2 = this.a;
            iArr[i2] = i;
            this.c[i2] = obj;
            this.a = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(p1e p1e) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    p1e.A(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    p1e.w(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    p1e.p(i4, (fzg) obj);
                } else if (i3 == 3) {
                    ((wzg) p1e.a).R(i4, 3);
                    ((b3h) obj).d(p1e);
                    ((wzg) p1e.a).R(i4, 4);
                } else if (i3 == 5) {
                    p1e.v(i4, ((Integer) obj).intValue());
                } else {
                    int i5 = zzdn.a;
                    throw new RuntimeException(new IOException("Protocol message tag had invalid wire type."));
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b3h)) {
            return false;
        }
        b3h b3h = (b3h) obj;
        int i = this.a;
        if (i == b3h.a) {
            int[] iArr = this.b;
            int[] iArr2 = b3h.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = b3h.c;
                    int i3 = this.a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
