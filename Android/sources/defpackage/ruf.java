package defpackage;

import com.fasterxml.jackson.core.exc.StreamReadException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.uuid.Uuid;

/* renamed from: ruf  reason: default package */
public final class ruf extends m8b {
    public static final int W0 = np7.ALLOW_TRAILING_COMMA.b;
    public static final int X0 = np7.ALLOW_NUMERIC_LEADING_ZEROS.b;
    public static final int Y0 = np7.ALLOW_NON_NUMERIC_NUMBERS.b;
    public static final int Z0 = np7.ALLOW_MISSING_VALUES.b;
    public static final int a1 = np7.ALLOW_SINGLE_QUOTES.b;
    public static final int b1 = np7.ALLOW_UNQUOTED_FIELD_NAMES.b;
    public static final int c1 = np7.ALLOW_COMMENTS.b;
    public static final int d1 = np7.ALLOW_YAML_COMMENTS.b;
    public static final int[] e1 = t22.d;
    public static final int[] f1 = t22.c;
    public final rw0 Q0;
    public int[] R0 = new int[16];
    public boolean S0;
    public InputStream T0;
    public byte[] U0;
    public final boolean V0;

    public ruf(o67 o67, int i, InputStream inputStream, rw0 rw0, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(o67, i);
        this.T0 = inputStream;
        this.Q0 = rw0;
        this.U0 = bArr;
        this.v = i2;
        this.w = i3;
        this.z = i2 - i4;
        this.x = (long) ((-i2) + i4);
        this.V0 = z;
    }

    public static final int k1(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    public final void A1() {
        if (this.v >= this.w) {
            e1();
        }
        byte[] bArr = this.U0;
        int i = this.v;
        int i2 = i + 1;
        this.v = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= this.w) {
                e1();
            }
            byte[] bArr2 = this.U0;
            int i3 = this.v;
            int i4 = i3 + 1;
            this.v = i4;
            byte b2 = bArr2[i3];
            if ((b2 & 192) != 128) {
                t1(b2 & UByte.MAX_VALUE, i4);
                throw null;
            }
            return;
        }
        t1(b & UByte.MAX_VALUE, i2);
        throw null;
    }

    public final void B1() {
        if (this.v >= this.w) {
            e1();
        }
        byte[] bArr = this.U0;
        int i = this.v;
        int i2 = i + 1;
        this.v = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= this.w) {
                e1();
            }
            byte[] bArr2 = this.U0;
            int i3 = this.v;
            int i4 = i3 + 1;
            this.v = i4;
            byte b2 = bArr2[i3];
            if ((b2 & 192) == 128) {
                if (i4 >= this.w) {
                    e1();
                }
                byte[] bArr3 = this.U0;
                int i5 = this.v;
                int i6 = i5 + 1;
                this.v = i6;
                byte b3 = bArr3[i5];
                if ((b3 & 192) != 128) {
                    t1(b3 & UByte.MAX_VALUE, i6);
                    throw null;
                }
                return;
            }
            t1(b2 & UByte.MAX_VALUE, i4);
            throw null;
        }
        t1(b & UByte.MAX_VALUE, i2);
        throw null;
    }

    public final int C1() {
        byte b;
        while (true) {
            if (this.v < this.w || d1()) {
                byte[] bArr = this.U0;
                int i = this.v;
                int i2 = i + 1;
                this.v = i2;
                b = bArr[i] & UByte.MAX_VALUE;
                if (b > 32) {
                    if (b == 47) {
                        x1();
                    } else if (b != 35 || (this.a & d1) == 0) {
                        return b;
                    } else {
                        y1();
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.y++;
                    this.z = i2;
                } else if (b == 13) {
                    v1();
                } else if (b != 9) {
                    K0(b);
                    throw null;
                }
            } else {
                throw new StreamReadException(this, "Unexpected end-of-input within/between " + this.Z.e() + " entries");
            }
        }
        return b;
    }

    public final int D1() {
        byte b;
        while (true) {
            if (this.v < this.w || d1()) {
                byte[] bArr = this.U0;
                int i = this.v;
                int i2 = i + 1;
                this.v = i2;
                b = bArr[i] & UByte.MAX_VALUE;
                if (b > 32) {
                    if (b == 47) {
                        x1();
                    } else if (b != 35 || (this.a & d1) == 0) {
                        return b;
                    } else {
                        y1();
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.y++;
                    this.z = i2;
                } else if (b == 13) {
                    v1();
                } else if (b != 9) {
                    K0(b);
                    throw null;
                }
            } else {
                z0();
                return -1;
            }
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a A[LOOP:0: B:9:0x003a->B:12:0x0045, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E0() {
        /*
            r14 = this;
            super.E0()
            rw0 r0 = r14.Q0
            rw0 r1 = r0.a
            if (r1 == 0) goto L_0x0049
            boolean r2 = r0.o
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0049
            qw0 r2 = new qw0
            r2.<init>(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r1.b
            java.lang.Object r4 = r1.get()
            qw0 r4 = (defpackage.qw0) r4
            int r5 = r4.b
            int r6 = r2.b
            if (r6 != r5) goto L_0x0023
            goto L_0x0047
        L_0x0023:
            r5 = 6000(0x1770, float:8.408E-42)
            if (r6 <= r5) goto L_0x003a
            qw0 r2 = new qw0
            r13 = 512(0x200, float:7.175E-43)
            int[] r10 = new int[r13]
            r5 = 128(0x80, float:1.794E-43)
            java.lang.String[] r11 = new java.lang.String[r5]
            r12 = 448(0x1c0, float:6.28E-43)
            r8 = 64
            r9 = 4
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x003a:
            boolean r5 = r1.compareAndSet(r4, r2)
            if (r5 == 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            java.lang.Object r5 = r1.get()
            if (r5 == r4) goto L_0x003a
        L_0x0047:
            r0.o = r3
        L_0x0049:
            boolean r0 = r14.V0
            if (r0 == 0) goto L_0x005c
            byte[] r0 = r14.U0
            if (r0 == 0) goto L_0x005c
            byte[] r1 = defpackage.m8b.H0
            if (r0 == r1) goto L_0x005c
            r14.U0 = r1
            o67 r14 = r14.c
            r14.b(r0)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ruf.E0():void");
    }

    public final void E1() {
        this.X = this.y;
        this.Y = this.v - this.z;
    }

    public final int F1() {
        if (this.v >= this.w && !d1()) {
            return 48;
        }
        byte[] bArr = this.U0;
        int i = this.v;
        byte b = bArr[i] & UByte.MAX_VALUE;
        if (b < 48 || b > 57) {
            return 48;
        }
        if ((this.a & X0) != 0) {
            this.v = i + 1;
            if (b == 48) {
                do {
                    if (this.v >= this.w && !d1()) {
                        break;
                    }
                    byte[] bArr2 = this.U0;
                    int i2 = this.v;
                    b = bArr2[i2] & UByte.MAX_VALUE;
                    if (b < 48 || b > 57) {
                        return 48;
                    }
                    this.v = i2 + 1;
                } while (b == 48);
            }
            return b;
        }
        F0("Invalid numeric value: Leading zeroes not allowed");
        throw null;
    }

    public final void G1(int i) {
        int i2 = this.v + 1;
        this.v = i2;
        if (i == 9) {
            return;
        }
        if (i == 10) {
            this.y++;
            this.z = i2;
        } else if (i == 13) {
            v1();
        } else if (i != 32) {
            J0(i, "Expected space separating root-level values");
            throw null;
        }
    }

    public final String H1(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        char c;
        int i5;
        char c2;
        int i6;
        int i7;
        int i8;
        int[] iArr2 = iArr;
        int i9 = i;
        int i10 = i2;
        int i11 = 240;
        int i12 = 224;
        boolean z = true;
        int i13 = ((i9 << 2) - 4) + i10;
        if (i10 < 4) {
            int i14 = i9 - 1;
            i3 = iArr2[i14];
            iArr2[i14] = i3 << ((4 - i10) << 3);
        } else {
            i3 = 0;
        }
        wef wef = this.w0;
        char[] m = wef.m();
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            int i17 = iArr2[i15 >> 2] >> ((3 - (i15 & 3)) << 3);
            int i18 = i17 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i19 = i15 + 1;
            if (i18 > 127) {
                if ((i17 & 224) == 192) {
                    i7 = i17 & 31;
                    i6 = 1;
                } else if ((i17 & 240) == i12) {
                    i7 = i17 & 15;
                    i6 = 2;
                } else if ((i17 & 248) == i11) {
                    i7 = i17 & 7;
                    i6 = 3;
                } else {
                    r1(i18);
                    throw null;
                }
                if (i19 + i6 <= i13) {
                    int i20 = iArr2[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                    i19 = i15 + 2;
                    if ((i20 & 192) == 128) {
                        int i21 = (i20 & 63) | (i7 << 6);
                        if (i6 > 1) {
                            c = 3;
                            int i22 = iArr2[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                            i19 = i15 + 3;
                            if ((i22 & 192) == 128) {
                                int i23 = (i21 << 6) | (i22 & 63);
                                if (i6 > 2) {
                                    int i24 = iArr2[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                                    i19 = i15 + 4;
                                    if ((i24 & 192) == 128) {
                                        i18 = (i23 << 6) | (i24 & 63);
                                        i8 = 2;
                                    } else {
                                        s1(i24 & KotlinVersion.MAX_COMPONENT_VALUE);
                                        throw null;
                                    }
                                } else {
                                    i18 = i23;
                                    i8 = 2;
                                }
                            } else {
                                s1(i22);
                                throw null;
                            }
                        } else {
                            c = 3;
                            i18 = i21;
                            i8 = 2;
                        }
                        if (i6 > i8) {
                            int i25 = i18 - 65536;
                            int i26 = i16;
                            if (i26 >= m.length) {
                                char[] cArr = (char[]) wef.j;
                                int length = cArr.length;
                                int i27 = length + (length >> 1);
                                if (i27 > 65536) {
                                    i27 = length + (length >> 2);
                                }
                                m = Arrays.copyOf(cArr, i27);
                                wef.j = m;
                            }
                            m[i26] = (char) ((i25 >> 10) + 55296);
                            i18 = (i25 & 1023) | 56320;
                            i5 = i26 + 1;
                        } else {
                            i4 = i16;
                            i5 = i4;
                        }
                    } else {
                        s1(i20);
                        throw null;
                    }
                } else {
                    wp7 wp7 = wp7.NOT_AVAILABLE;
                    G0(" in field name");
                    throw null;
                }
            } else {
                i4 = i16;
                c = 3;
                i5 = i4;
            }
            i15 = i19;
            if (i5 >= m.length) {
                char[] cArr2 = (char[]) wef.j;
                int length2 = cArr2.length;
                int i28 = (length2 >> 1) + length2;
                if (i28 > 65536) {
                    c2 = 2;
                    i28 = (length2 >> 2) + length2;
                } else {
                    c2 = 2;
                }
                char[] copyOf = Arrays.copyOf(cArr2, i28);
                wef.j = copyOf;
                m = copyOf;
            } else {
                c2 = 2;
            }
            i16 = i5 + 1;
            m[i5] = (char) i18;
            char c3 = c;
            char c4 = c2;
            i11 = 240;
            z = true;
            i12 = 224;
        }
        boolean z2 = z;
        String str = new String(m, 0, i16);
        if (i10 < 4) {
            iArr2[i9 - 1] = i3;
        }
        return this.Q0.f(str, iArr2, i9);
    }

    public final String I1(int i, int i2) {
        int k1 = k1(i, i2);
        String j = this.Q0.j(k1);
        if (j != null) {
            return j;
        }
        int[] iArr = this.R0;
        iArr[0] = k1;
        return H1(iArr, 1, i2);
    }

    public final String J1(int i, int i2, int i3) {
        int k1 = k1(i2, i3);
        String k = this.Q0.k(i, k1);
        if (k != null) {
            return k;
        }
        int[] iArr = this.R0;
        iArr[0] = i;
        iArr[1] = k1;
        return H1(iArr, 2, i3);
    }

    public final String K1(int i, int i2, int i3, int i4) {
        int k1 = k1(i3, i4);
        String l = this.Q0.l(i, i2, k1);
        if (l != null) {
            return l;
        }
        int[] iArr = this.R0;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = k1(k1, i4);
        return H1(iArr, 3, i4);
    }

    public final String L1(int i, int i2, int i3, int[] iArr) {
        if (i >= iArr.length) {
            iArr = m8b.O0(iArr.length, iArr);
            this.R0 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = k1(i2, i3);
        String m = this.Q0.m(i4, iArr);
        return m == null ? H1(iArr, i4, i3) : m;
    }

    public final int M1() {
        if (this.v >= this.w) {
            e1();
        }
        byte[] bArr = this.U0;
        int i = this.v;
        this.v = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public final String N1(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        while (true) {
            if (f1[i3] != 0) {
                if (i3 == 34) {
                    if (i4 > 0) {
                        if (i >= iArr.length) {
                            iArr = m8b.O0(iArr.length, iArr);
                            this.R0 = iArr;
                        }
                        iArr[i] = k1(i2, i4);
                        i = 1 + i;
                    }
                    String m = this.Q0.m(i, iArr);
                    return m == null ? H1(iArr, i, i4) : m;
                }
                if (i3 != 92) {
                    L0(i3, "name");
                } else {
                    i3 = U0();
                }
                if (i3 > 127) {
                    int i7 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = m8b.O0(iArr.length, iArr);
                            this.R0 = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i5 = i2 << 8;
                        i6 = (i3 >> 6) | 192;
                    } else {
                        int i8 = (i2 << 8) | (i3 >> 12) | 224;
                        r8++;
                        if (r8 >= 4) {
                            if (i >= iArr.length) {
                                iArr = m8b.O0(iArr.length, iArr);
                                this.R0 = iArr;
                            }
                            iArr[i] = i8;
                            i++;
                            r8 = 0;
                        } else {
                            i7 = i8;
                        }
                        i5 = i7 << 8;
                        i6 = ((i3 >> 6) & 63) | Uuid.SIZE_BITS;
                    }
                    i2 = i5 | i6;
                    i4 = r8 + 1;
                    i3 = (i3 & 63) | Uuid.SIZE_BITS;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = m8b.O0(iArr.length, iArr);
                    this.R0 = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.v < this.w || d1()) {
                byte[] bArr = this.U0;
                int i9 = this.v;
                this.v = i9 + 1;
                i3 = bArr[i9] & UByte.MAX_VALUE;
            } else {
                wp7 wp7 = wp7.NOT_AVAILABLE;
                G0(" in field name");
                throw null;
            }
        }
    }

    public final String O1(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.R0;
        iArr[0] = i;
        iArr[1] = i2;
        return N1(2, i3, i4, i5, iArr);
    }

    public final int T0(int i) {
        int i2;
        char c;
        int i3 = i & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i3 <= 127) {
            return i3;
        }
        if ((i & 224) == 192) {
            i2 = i & 31;
            c = 1;
        } else if ((i & 240) == 224) {
            i2 = i & 15;
            c = 2;
        } else if ((i & 248) == 240) {
            i2 = i & 7;
            c = 3;
        } else {
            r1(i & KotlinVersion.MAX_COMPONENT_VALUE);
            throw null;
        }
        int M1 = M1();
        if ((M1 & 192) == 128) {
            int i4 = (i2 << 6) | (M1 & 63);
            if (c > 1) {
                int M12 = M1();
                if ((M12 & 192) == 128) {
                    i4 = (i4 << 6) | (M12 & 63);
                    if (c > 2) {
                        int M13 = M1();
                        if ((M13 & 192) == 128) {
                            return (i4 << 6) | (M13 & 63);
                        }
                        s1(M13 & KotlinVersion.MAX_COMPONENT_VALUE);
                        throw null;
                    }
                } else {
                    s1(M12 & KotlinVersion.MAX_COMPONENT_VALUE);
                    throw null;
                }
            }
            return i4;
        }
        s1(M1 & KotlinVersion.MAX_COMPONENT_VALUE);
        throw null;
    }

    public final char U0() {
        if (this.v < this.w || d1()) {
            byte[] bArr = this.U0;
            int i = this.v;
            this.v = i + 1;
            byte b = bArr[i];
            if (b == 34 || b == 47 || b == 92) {
                return (char) b;
            }
            if (b == 98) {
                return 8;
            }
            if (b == 102) {
                return 12;
            }
            if (b == 110) {
                return 10;
            }
            if (b == 114) {
                return 13;
            }
            if (b == 116) {
                return 9;
            }
            if (b != 117) {
                char T02 = (char) T0(b);
                A0(T02);
                return T02;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < 4) {
                if (this.v < this.w || d1()) {
                    byte[] bArr2 = this.U0;
                    int i4 = this.v;
                    this.v = i4 + 1;
                    byte b2 = bArr2[i4] & UByte.MAX_VALUE;
                    int i5 = t22.i[b2];
                    if (i5 >= 0) {
                        i3 = (i3 << 4) | i5;
                        i2++;
                    } else {
                        J0(b2, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    wp7 wp7 = wp7.NOT_AVAILABLE;
                    G0(" in character escape sequence");
                    throw null;
                }
            }
            return (char) i3;
        }
        wp7 wp72 = wp7.NOT_AVAILABLE;
        G0(" in character escape sequence");
        throw null;
    }

    public final int V0(int i) {
        if (this.v >= this.w) {
            e1();
        }
        byte[] bArr = this.U0;
        int i2 = this.v;
        int i3 = i2 + 1;
        this.v = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & 63);
        }
        t1(b & UByte.MAX_VALUE, i3);
        throw null;
    }

    public final int W0(int i) {
        if (this.v >= this.w) {
            e1();
        }
        int i2 = i & 15;
        byte[] bArr = this.U0;
        int i3 = this.v;
        int i4 = i3 + 1;
        this.v = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = (i2 << 6) | (b & 63);
            if (i4 >= this.w) {
                e1();
            }
            byte[] bArr2 = this.U0;
            int i5 = this.v;
            int i6 = i5 + 1;
            this.v = i6;
            byte b3 = bArr2[i5];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            t1(b3 & UByte.MAX_VALUE, i6);
            throw null;
        }
        t1(b & UByte.MAX_VALUE, i4);
        throw null;
    }

    public final int X0(int i) {
        int i2 = i & 15;
        byte[] bArr = this.U0;
        int i3 = this.v;
        int i4 = i3 + 1;
        this.v = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = (i2 << 6) | (b & 63);
            int i5 = i3 + 2;
            this.v = i5;
            byte b3 = bArr[i4];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            t1(b3 & UByte.MAX_VALUE, i5);
            throw null;
        }
        t1(b & UByte.MAX_VALUE, i4);
        throw null;
    }

    public final int Y0(int i) {
        if (this.v >= this.w) {
            e1();
        }
        byte[] bArr = this.U0;
        int i2 = this.v;
        int i3 = i2 + 1;
        this.v = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            byte b2 = ((i & 7) << 6) | (b & 63);
            if (i3 >= this.w) {
                e1();
            }
            byte[] bArr2 = this.U0;
            int i4 = this.v;
            int i5 = i4 + 1;
            this.v = i5;
            byte b3 = bArr2[i4];
            if ((b3 & 192) == 128) {
                byte b4 = (b2 << 6) | (b3 & 63);
                if (i5 >= this.w) {
                    e1();
                }
                byte[] bArr3 = this.U0;
                int i6 = this.v;
                int i7 = i6 + 1;
                this.v = i7;
                byte b5 = bArr3[i6];
                if ((b5 & 192) == 128) {
                    return ((b4 << 6) | (b5 & 63)) - UByte.MIN_VALUE;
                }
                t1(b5 & UByte.MAX_VALUE, i7);
                throw null;
            }
            t1(b3 & UByte.MAX_VALUE, i5);
            throw null;
        }
        t1(b & UByte.MAX_VALUE, i3);
        throw null;
    }

    public final void Z0() {
        int i = this.v;
        if (i >= this.w) {
            e1();
            i = this.v;
        }
        wef wef = this.w0;
        char[] m = wef.m();
        int min = Math.min(this.w, m.length + i);
        byte[] bArr = this.U0;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & UByte.MAX_VALUE;
            if (e1[b] == 0) {
                i++;
                m[i2] = (char) b;
                i2++;
            } else if (b == 34) {
                this.v = i + 1;
                wef.g = i2;
                return;
            }
        }
        this.v = i;
        a1(m, i2);
    }

    public final void a1(char[] cArr, int i) {
        byte[] bArr = this.U0;
        while (true) {
            int i2 = this.v;
            if (i2 >= this.w) {
                e1();
                i2 = this.v;
            }
            int length = cArr.length;
            int i3 = 0;
            wef wef = this.w0;
            if (i >= length) {
                cArr = wef.o();
                i = 0;
            }
            int min = Math.min(this.w, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this.v = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & UByte.MAX_VALUE;
                int i6 = e1[i5];
                if (i6 != 0) {
                    this.v = i4;
                    if (i5 == 34) {
                        wef.g = i;
                        return;
                    }
                    if (i6 == 1) {
                        i5 = U0();
                    } else if (i6 == 2) {
                        i5 = V0(i5);
                    } else if (i6 == 3) {
                        i5 = this.w - i4 >= 2 ? X0(i5) : W0(i5);
                    } else if (i6 == 4) {
                        int Y02 = Y0(i5);
                        int i7 = i + 1;
                        cArr[i] = (char) ((Y02 >> 10) | 55296);
                        if (i7 >= cArr.length) {
                            cArr = wef.o();
                            i = 0;
                        } else {
                            i = i7;
                        }
                        i5 = (Y02 & 1023) | 56320;
                    } else if (i5 < 32) {
                        L0(i5, "string value");
                    } else {
                        q1(i5);
                        throw null;
                    }
                    if (i >= cArr.length) {
                        cArr = wef.o();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) i5;
                } else {
                    cArr[i] = (char) i5;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ?, r4v1 ?, r4v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final defpackage.wp7 b1(
/*
Method generation error in method: ruf.b1(int, boolean):wp7, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r13 != 44) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r12.Z.b() == false) goto L_0x0148;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.wp7 c1(int r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 39
            int r2 = r12.a
            r3 = 0
            r4 = 1
            if (r13 == r1) goto L_0x009a
            r1 = 73
            int r5 = Y0
            if (r13 == r1) goto L_0x0084
            r1 = 78
            if (r13 == r1) goto L_0x006e
            r1 = 93
            if (r13 == r1) goto L_0x0049
            r1 = 125(0x7d, float:1.75E-43)
            if (r13 == r1) goto L_0x0068
            r1 = 43
            if (r13 == r1) goto L_0x0025
            r0 = 44
            if (r13 == r0) goto L_0x0053
            goto L_0x0148
        L_0x0025:
            int r13 = r12.v
            int r1 = r12.w
            if (r13 < r1) goto L_0x0038
            boolean r13 = r12.d1()
            if (r13 == 0) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            wp7 r13 = defpackage.wp7.VALUE_NUMBER_INT
            r12.H0(r13)
            throw r3
        L_0x0038:
            byte[] r13 = r12.U0
            int r1 = r12.v
            int r2 = r1 + 1
            r12.v = r2
            byte r13 = r13[r1]
            r13 = r13 & 255(0xff, float:3.57E-43)
            wp7 r12 = r12.b1(r13, r0)
            return r12
        L_0x0049:
            qp7 r0 = r12.Z
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0053
            goto L_0x0148
        L_0x0053:
            qp7 r0 = r12.Z
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0068
            int r0 = Z0
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0068
            int r13 = r12.v
            int r13 = r13 - r4
            r12.v = r13
            wp7 r12 = defpackage.wp7.VALUE_NULL
            return r12
        L_0x0068:
            java.lang.String r0 = "expected a value"
            r12.J0(r13, r0)
            throw r3
        L_0x006e:
            java.lang.String r13 = "NaN"
            r12.h1(r4, r13)
            r0 = r2 & r5
            if (r0 == 0) goto L_0x007e
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            wp7 r12 = r12.R0(r13, r0)
            return r12
        L_0x007e:
            java.lang.String r13 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r12.F0(r13)
            throw r3
        L_0x0084:
            java.lang.String r13 = "Infinity"
            r12.h1(r4, r13)
            r0 = r2 & r5
            if (r0 == 0) goto L_0x0094
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            wp7 r12 = r12.R0(r13, r0)
            return r12
        L_0x0094:
            java.lang.String r13 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r12.F0(r13)
            throw r3
        L_0x009a:
            int r5 = a1
            r2 = r2 & r5
            if (r2 == 0) goto L_0x0148
            wef r2 = r12.w0
            char[] r13 = r2.m()
            byte[] r5 = r12.U0
            r6 = r0
        L_0x00a8:
            int r7 = r12.v
            int r8 = r12.w
            if (r7 < r8) goto L_0x00b1
            r12.e1()
        L_0x00b1:
            int r7 = r13.length
            if (r6 < r7) goto L_0x00b9
            char[] r13 = r2.o()
            r6 = r0
        L_0x00b9:
            int r7 = r12.w
            int r8 = r12.v
            int r9 = r13.length
            int r9 = r9 - r6
            int r9 = r9 + r8
            if (r9 >= r7) goto L_0x00c3
            r7 = r9
        L_0x00c3:
            int r8 = r12.v
            if (r8 >= r7) goto L_0x00a8
            int r9 = r8 + 1
            r12.v = r9
            byte r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r10 = e1
            if (r8 == r1) goto L_0x00df
            r11 = r10[r8]
            if (r11 == 0) goto L_0x00d8
            goto L_0x00df
        L_0x00d8:
            int r9 = r6 + 1
            char r8 = (char) r8
            r13[r6] = r8
            r6 = r9
            goto L_0x00c3
        L_0x00df:
            if (r8 != r1) goto L_0x00e6
            r2.g = r6
            wp7 r12 = defpackage.wp7.VALUE_STRING
            return r12
        L_0x00e6:
            r7 = r10[r8]
            if (r7 == r4) goto L_0x0134
            r10 = 2
            if (r7 == r10) goto L_0x012f
            r11 = 3
            if (r7 == r11) goto L_0x0120
            r9 = 4
            if (r7 == r9) goto L_0x0100
            r13 = 32
            if (r8 >= r13) goto L_0x00fc
            java.lang.String r13 = "string value"
            r12.L0(r8, r13)
        L_0x00fc:
            r12.q1(r8)
            throw r3
        L_0x0100:
            int r7 = r12.Y0(r8)
            int r8 = r6 + 1
            int r9 = r7 >> 10
            r10 = 55296(0xd800, float:7.7486E-41)
            r9 = r9 | r10
            char r9 = (char) r9
            r13[r6] = r9
            int r6 = r13.length
            if (r8 < r6) goto L_0x0118
            char[] r13 = r2.o()
            r6 = r0
            goto L_0x0119
        L_0x0118:
            r6 = r8
        L_0x0119:
            r7 = r7 & 1023(0x3ff, float:1.434E-42)
            r8 = 56320(0xdc00, float:7.8921E-41)
            r7 = r7 | r8
            goto L_0x0138
        L_0x0120:
            int r7 = r12.w
            int r7 = r7 - r9
            if (r7 < r10) goto L_0x012a
            int r7 = r12.X0(r8)
            goto L_0x0138
        L_0x012a:
            int r7 = r12.W0(r8)
            goto L_0x0138
        L_0x012f:
            int r7 = r12.V0(r8)
            goto L_0x0138
        L_0x0134:
            char r7 = r12.U0()
        L_0x0138:
            int r8 = r13.length
            if (r6 < r8) goto L_0x0140
            char[] r13 = r2.o()
            r6 = r0
        L_0x0140:
            int r8 = r6 + 1
            char r7 = (char) r7
            r13[r6] = r7
            r6 = r8
            goto L_0x00a8
        L_0x0148:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r13)
            if (r0 == 0) goto L_0x0165
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            char r13 = (char) r13
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = r12.M0()
            r12.u1(r13, r0)
            throw r3
        L_0x0165:
            java.lang.String r0 = r12.M0()
            java.lang.String r1 = "expected a valid value "
            java.lang.String r0 = r1.concat(r0)
            r12.J0(r13, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ruf.c1(int):wp7");
    }

    public final boolean d1() {
        byte[] bArr;
        int length;
        InputStream inputStream = this.T0;
        if (inputStream == null || (length = bArr.length) == 0) {
            return false;
        }
        int read = inputStream.read((bArr = this.U0), 0, length);
        if (read > 0) {
            int i = this.w;
            this.x += (long) i;
            this.z -= i;
            this.v = 0;
            this.w = read;
            return true;
        }
        w0();
        if (read == 0) {
            throw new IOException(wj6.l(new StringBuilder("InputStream.read() returned 0 characters when trying to read "), this.U0.length, " bytes"));
        }
        return false;
    }

    public final void e1() {
        if (!d1()) {
            G0(" in " + this.b);
            throw null;
        }
    }

    public final void f1() {
        byte b;
        int i = this.v;
        if (i + 4 < this.w) {
            byte[] bArr = this.U0;
            int i2 = i + 1;
            if (bArr[i] == 97) {
                int i3 = i + 2;
                if (bArr[i2] == 108) {
                    int i4 = i + 3;
                    if (bArr[i3] == 115) {
                        int i5 = i + 4;
                        if (bArr[i4] == 101 && ((b = bArr[i5] & UByte.MAX_VALUE) < 48 || b == 93 || b == 125)) {
                            this.v = i5;
                            return;
                        }
                    }
                }
            }
        }
        i1(1, "false");
    }

    public final void g1() {
        byte b;
        int i = this.v;
        if (i + 3 < this.w) {
            byte[] bArr = this.U0;
            int i2 = i + 1;
            if (bArr[i] == 117) {
                int i3 = i + 2;
                if (bArr[i2] == 108) {
                    int i4 = i + 3;
                    if (bArr[i3] == 108 && ((b = bArr[i4] & UByte.MAX_VALUE) < 48 || b == 93 || b == 125)) {
                        this.v = i4;
                        return;
                    }
                }
            }
        }
        i1(1, "null");
    }

    public final void h1(int i, String str) {
        int length = str.length();
        if (this.v + length >= this.w) {
            i1(i, str);
            return;
        }
        while (this.U0[this.v] == str.charAt(i)) {
            int i2 = this.v + 1;
            this.v = i2;
            i++;
            if (i >= length) {
                byte b = this.U0[i2] & UByte.MAX_VALUE;
                if (b >= 48 && b != 93 && b != 125 && Character.isJavaIdentifierPart((char) T0(b))) {
                    u1(str.substring(0, i), M0());
                    throw null;
                }
                return;
            }
        }
        u1(str.substring(0, i), M0());
        throw null;
    }

    public final void i1(int i, String str) {
        int i2;
        byte b;
        int length = str.length();
        do {
            if ((this.v < this.w || d1()) && this.U0[this.v] == str.charAt(i)) {
                i2 = this.v + 1;
                this.v = i2;
                i++;
            } else {
                u1(str.substring(0, i), M0());
                throw null;
            }
        } while (i < length);
        if ((i2 < this.w || d1()) && (b = this.U0[this.v] & UByte.MAX_VALUE) >= 48 && b != 93 && b != 125 && Character.isJavaIdentifierPart((char) T0(b))) {
            u1(str.substring(0, i), M0());
            throw null;
        }
    }

    public final void j1() {
        byte b;
        int i = this.v;
        if (i + 3 < this.w) {
            byte[] bArr = this.U0;
            int i2 = i + 1;
            if (bArr[i] == 114) {
                int i3 = i + 2;
                if (bArr[i2] == 117) {
                    int i4 = i + 3;
                    if (bArr[i3] == 101 && ((b = bArr[i4] & UByte.MAX_VALUE) < 48 || b == 93 || b == 125)) {
                        this.v = i4;
                        return;
                    }
                }
            }
        }
        i1(1, "true");
    }

    public final wp7 l1(char[] cArr, int i, int i2, boolean z, int i3) {
        boolean z2;
        wef wef = this.w0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = wef.o();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            int i4 = 0;
            while (true) {
                if (this.v >= this.w && !d1()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.U0;
                int i5 = this.v;
                this.v = i5 + 1;
                i2 = bArr[i5] & UByte.MAX_VALUE;
                if (i2 < 48 || i2 > 57) {
                    z2 = false;
                } else {
                    i4++;
                    if (i >= cArr.length) {
                        cArr = wef.o();
                        i = 0;
                    }
                    cArr[i] = (char) i2;
                    i++;
                }
            }
            z2 = false;
            if (i4 == 0) {
                Q0(i2, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            z2 = false;
        }
        if (r13 == 101 || r13 == 69) {
            if (i >= cArr.length) {
                cArr = wef.o();
                i = 0;
            }
            int i6 = i + 1;
            cArr[i] = (char) r13;
            if (this.v >= this.w) {
                e1();
            }
            byte[] bArr2 = this.U0;
            int i7 = this.v;
            this.v = i7 + 1;
            byte b = bArr2[i7] & UByte.MAX_VALUE;
            if (b == 45 || b == 43) {
                if (i6 >= cArr.length) {
                    cArr = wef.o();
                    i6 = 0;
                }
                int i8 = i6 + 1;
                cArr[i6] = (char) b;
                if (this.v >= this.w) {
                    e1();
                }
                byte[] bArr3 = this.U0;
                int i9 = this.v;
                this.v = i9 + 1;
                b = bArr3[i9] & UByte.MAX_VALUE;
                i6 = i8;
            }
            r13 = b;
            int i10 = 0;
            while (true) {
                if (r13 < 48 || r13 > 57) {
                    break;
                }
                i10++;
                if (i6 >= cArr.length) {
                    cArr = wef.o();
                    i6 = 0;
                }
                int i11 = i6 + 1;
                cArr[i6] = (char) r13;
                if (this.v >= this.w && !d1()) {
                    z2 = true;
                    i6 = i11;
                    break;
                }
                byte[] bArr4 = this.U0;
                int i12 = this.v;
                this.v = i12 + 1;
                r13 = bArr4[i12] & UByte.MAX_VALUE;
                i6 = i11;
            }
            if (i10 != 0) {
                i = i6;
            } else {
                Q0(r13, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.v--;
            if (this.Z.d()) {
                G1(r13);
            }
        }
        wef.g = i;
        this.F0 = z;
        this.G0 = i3;
        this.z0 = 0;
        return wp7.VALUE_NUMBER_FLOAT;
    }

    public final wp7 m1() {
        if (!rp7.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.b.a(this.a)) {
            return c1(46);
        }
        return l1(this.w0.m(), 0, 46, false, 0);
    }

    public final wp7 n1() {
        int i;
        byte b;
        wef wef = this.w0;
        char[] m = wef.m();
        m[0] = '-';
        if (this.v >= this.w) {
            e1();
        }
        byte[] bArr = this.U0;
        int i2 = this.v;
        this.v = i2 + 1;
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        if (i3 <= 48) {
            if (i3 != 48) {
                return b1(i3, true);
            }
            i3 = F1();
        } else if (i3 > 57) {
            return b1(i3, true);
        }
        m[1] = (char) i3;
        int i4 = 2;
        int min = Math.min(this.w, (this.v + m.length) - 2);
        int i5 = 1;
        while (true) {
            i = this.v;
            if (i >= min) {
                return o1(m, i4, true, i5);
            }
            byte[] bArr2 = this.U0;
            this.v = i + 1;
            b = bArr2[i] & UByte.MAX_VALUE;
            if (b >= 48 && b <= 57) {
                i5++;
                m[i4] = (char) b;
                i4++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return l1(m, i4, b, true, i5);
        }
        this.v = i;
        wef.g = i4;
        if (this.Z.d()) {
            G1(b);
        }
        return S0(i5, true);
    }

    public final lp7 o() {
        Object y0 = y0();
        long j = this.x;
        return new lp7(this.y, (this.v - this.z) + 1, ((long) this.v) + j, -1, y0);
    }

    public final wp7 o1(char[] cArr, int i, boolean z, int i2) {
        wef wef;
        int i3;
        byte b;
        char[] cArr2 = cArr;
        int i4 = i;
        int i5 = i2;
        while (true) {
            int i6 = this.v;
            int i7 = this.w;
            wef = this.w0;
            if (i6 < i7 || d1()) {
                byte[] bArr = this.U0;
                i3 = this.v;
                this.v = i3 + 1;
                b = bArr[i3] & UByte.MAX_VALUE;
                if (b <= 57 && b >= 48) {
                    if (i4 >= cArr2.length) {
                        i4 = 0;
                        cArr2 = wef.o();
                    }
                    cArr2[i4] = (char) b;
                    i5++;
                    i4++;
                }
            } else {
                wef.g = i4;
                return S0(i5, z);
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return l1(cArr2, i4, b, z, i5);
        }
        this.v = i3;
        wef.g = i4;
        if (this.Z.d()) {
            G1(this.U0[this.v] & UByte.MAX_VALUE);
        }
        return S0(i5, z);
    }

    public final wp7 p1(int i) {
        int i2;
        byte b;
        wef wef = this.w0;
        char[] m = wef.m();
        if (i == 48) {
            i = F1();
        }
        m[0] = (char) i;
        int i3 = 1;
        int min = Math.min(this.w, (this.v + m.length) - 1);
        int i4 = 1;
        while (true) {
            i2 = this.v;
            if (i2 >= min) {
                return o1(m, i3, false, i4);
            }
            byte[] bArr = this.U0;
            this.v = i2 + 1;
            b = bArr[i2] & UByte.MAX_VALUE;
            if (b >= 48 && b <= 57) {
                i4++;
                m[i3] = (char) b;
                i3++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return l1(m, i3, b, false, i4);
        }
        this.v = i2;
        wef.g = i3;
        if (this.Z.d()) {
            G1(b);
        }
        return S0(i4, false);
    }

    public final void q1(int i) {
        if (i < 32) {
            K0(i);
            throw null;
        } else {
            r1(i);
            throw null;
        }
    }

    public final String r0() {
        wp7 wp7 = this.b;
        wp7 wp72 = wp7.VALUE_STRING;
        wef wef = this.w0;
        if (wp7 == wp72) {
            if (!this.S0) {
                return wef.l();
            }
            this.S0 = false;
            int i = this.v;
            if (i >= this.w) {
                e1();
                i = this.v;
            }
            char[] m = wef.m();
            int min = Math.min(this.w, m.length + i);
            byte[] bArr = this.U0;
            int i2 = 0;
            while (true) {
                if (i >= min) {
                    break;
                }
                byte b = bArr[i] & UByte.MAX_VALUE;
                if (e1[b] == 0) {
                    i++;
                    m[i2] = (char) b;
                    i2++;
                } else if (b == 34) {
                    this.v = i + 1;
                    wef.g = i2;
                    if (wef.f > 0) {
                        return wef.l();
                    }
                    String str = i2 == 0 ? "" : new String((char[]) wef.j, 0, i2);
                    wef.c = str;
                    return str;
                }
            }
            this.v = i;
            a1(m, i2);
            return wef.l();
        } else if (wp7 == null) {
            return null;
        } else {
            int i3 = wp7.o;
            return i3 != 5 ? (i3 == 6 || i3 == 7 || i3 == 8) ? wef.l() : wp7.a : this.Z.f;
        }
    }

    public final void r1(int i) {
        F0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
        throw null;
    }

    public final char[] s0() {
        wp7 wp7 = this.b;
        if (wp7 == null) {
            return null;
        }
        int i = wp7.o;
        if (i != 5) {
            if (i != 6) {
                if (!(i == 7 || i == 8)) {
                    return wp7.b;
                }
            } else if (this.S0) {
                this.S0 = false;
                Z0();
            }
            return this.w0.r();
        }
        if (!this.y0) {
            String str = this.Z.f;
            int length = str.length();
            char[] cArr = this.x0;
            if (cArr == null) {
                o67 o67 = this.c;
                if (((char[]) o67.h) == null) {
                    char[] a = ((eu0) o67.d).a(3, length);
                    o67.h = a;
                    this.x0 = a;
                } else {
                    throw new IllegalStateException("Trying to call same allocXxx() method second time");
                }
            } else if (cArr.length < length) {
                this.x0 = new char[length];
            }
            str.getChars(0, length, this.x0, 0);
            this.y0 = true;
        }
        return this.x0;
    }

    public final void s1(int i) {
        F0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
        throw null;
    }

    public final int t0() {
        wp7 wp7 = this.b;
        if (wp7 == null) {
            return 0;
        }
        int i = wp7.o;
        if (i == 5) {
            return this.Z.f.length();
        }
        if (i != 6) {
            if (!(i == 7 || i == 8)) {
                return wp7.b.length;
            }
        } else if (this.S0) {
            this.S0 = false;
            Z0();
        }
        return this.w0.t();
    }

    public final void t1(int i, int i2) {
        this.v = i2;
        s1(i);
        throw null;
    }

    public final int u0() {
        wp7 wp7 = this.b;
        if (wp7 == null) {
            return 0;
        }
        int i = wp7.o;
        if (i != 6) {
            if (!(i == 7 || i == 8)) {
                return 0;
            }
        } else if (this.S0) {
            this.S0 = false;
            Z0();
        }
        int i2 = this.w0.d;
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    public final void u1(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.v >= this.w && !d1()) {
                break;
            }
            byte[] bArr = this.U0;
            int i = this.v;
            this.v = i + 1;
            char T02 = (char) T0(bArr[i]);
            if (!Character.isJavaIdentifierPart(T02)) {
                break;
            }
            sb.append(T02);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new StreamReadException(this, "Unrecognized token '" + sb + "': was expecting " + str2);
    }

    public final wp7 v0() {
        int i;
        int i2;
        String str;
        int i3;
        wp7 wp7;
        byte b;
        byte b2;
        String N1;
        String K1;
        String str2;
        int i4;
        int i5;
        int C1;
        if (this.b == wp7.FIELD_NAME) {
            this.y0 = false;
            wp7 wp72 = this.v0;
            this.v0 = null;
            if (wp72 == wp7.START_ARRAY) {
                this.Z = this.Z.f(this.X, this.Y);
            } else if (wp72 == wp7.START_OBJECT) {
                this.Z = this.Z.g(this.X, this.Y);
            }
            this.b = wp72;
            return wp72;
        }
        this.z0 = 0;
        if (this.S0) {
            this.S0 = false;
            byte[] bArr = this.U0;
            while (true) {
                int i6 = this.v;
                int i7 = this.w;
                if (i6 >= i7) {
                    e1();
                    i6 = this.v;
                    i7 = this.w;
                }
                while (true) {
                    if (i6 >= i7) {
                        this.v = i6;
                        break;
                    }
                    int i8 = i6 + 1;
                    byte b3 = bArr[i6] & UByte.MAX_VALUE;
                    int i9 = e1[b3];
                    if (i9 != 0) {
                        this.v = i8;
                        if (b3 == 34) {
                            break;
                        } else if (i9 == 1) {
                            U0();
                        } else if (i9 == 2) {
                            z1();
                        } else if (i9 == 3) {
                            A1();
                        } else if (i9 == 4) {
                            B1();
                        } else if (b3 < 32) {
                            L0(b3, "string value");
                        } else {
                            q1(b3);
                            throw null;
                        }
                    } else {
                        i6 = i8;
                    }
                }
            }
        }
        if (this.v < this.w || d1()) {
            byte[] bArr2 = this.U0;
            int i10 = this.v;
            int i11 = i10 + 1;
            this.v = i11;
            i = bArr2[i10] & UByte.MAX_VALUE;
            if (i <= 32) {
                if (i != 32) {
                    if (i == 10) {
                        this.y++;
                        this.z = i11;
                    } else if (i == 13) {
                        v1();
                    } else if (i != 9) {
                        K0(i);
                        throw null;
                    }
                }
                while (true) {
                    int i12 = this.v;
                    if (i12 >= this.w) {
                        i = D1();
                        break;
                    }
                    byte[] bArr3 = this.U0;
                    int i13 = i12 + 1;
                    this.v = i13;
                    byte b4 = bArr3[i12] & UByte.MAX_VALUE;
                    if (b4 > 32) {
                        if (b4 == 47 || b4 == 35) {
                            this.v = i12;
                            i = D1();
                        } else {
                            i = b4;
                        }
                    } else if (b4 != 32) {
                        if (b4 == 10) {
                            this.y++;
                            this.z = i13;
                        } else if (b4 == 13) {
                            v1();
                        } else if (b4 != 9) {
                            K0(b4);
                            throw null;
                        }
                    }
                }
            } else if (i == 47 || i == 35) {
                this.v = i10;
                i = D1();
            }
        } else {
            z0();
            i = -1;
        }
        if (i < 0) {
            close();
            this.b = null;
            return null;
        } else if (i == 93) {
            E1();
            if (this.Z.b()) {
                this.Z = this.Z.c;
                wp7 wp73 = wp7.END_ARRAY;
                this.b = wp73;
                return wp73;
            }
            I0('}', 93);
            throw null;
        } else if (i == 125) {
            E1();
            if (this.Z.c()) {
                this.Z = this.Z.c;
                wp7 wp74 = wp7.END_OBJECT;
                this.b = wp74;
                return wp74;
            }
            I0(']', 125);
            throw null;
        } else {
            qp7 qp7 = this.Z;
            int i14 = qp7.b + 1;
            qp7.b = i14;
            boolean z = qp7.a != 0 && i14 > 0;
            int i15 = this.a;
            if (z) {
                if (i == 44) {
                    while (true) {
                        int i16 = this.v;
                        if (i16 >= this.w) {
                            C1 = C1();
                            break;
                        }
                        byte[] bArr4 = this.U0;
                        int i17 = i16 + 1;
                        this.v = i17;
                        byte b5 = bArr4[i16] & UByte.MAX_VALUE;
                        if (b5 > 32) {
                            if (b5 == 47 || b5 == 35) {
                                this.v = i16;
                                C1 = C1();
                            } else {
                                C1 = b5;
                            }
                        } else if (b5 != 32) {
                            if (b5 == 10) {
                                this.y++;
                                this.z = i17;
                            } else if (b5 == 13) {
                                v1();
                            } else if (b5 != 9) {
                                K0(b5);
                                throw null;
                            }
                        }
                    }
                    if ((W0 & i15) != 0 && (i == 93 || i == 125)) {
                        if (i == 125) {
                            E1();
                            if (this.Z.c()) {
                                this.Z = this.Z.c;
                                wp7 wp75 = wp7.END_OBJECT;
                                this.b = wp75;
                                return wp75;
                            }
                            I0(']', 125);
                            throw null;
                        }
                        E1();
                        if (this.Z.b()) {
                            this.Z = this.Z.c;
                            wp7 wp76 = wp7.END_ARRAY;
                            this.b = wp76;
                            return wp76;
                        }
                        I0('}', 93);
                        throw null;
                    }
                } else {
                    J0(i, "was expecting comma to separate " + this.Z.e() + " entries");
                    throw null;
                }
            }
            if (!this.Z.c()) {
                E1();
                if (i == 34) {
                    this.S0 = true;
                    wp7 wp77 = wp7.VALUE_STRING;
                    this.b = wp77;
                    return wp77;
                } else if (i == 45) {
                    wp7 n1 = n1();
                    this.b = n1;
                    return n1;
                } else if (i == 46) {
                    wp7 m1 = m1();
                    this.b = m1;
                    return m1;
                } else if (i == 91) {
                    this.Z = this.Z.f(this.X, this.Y);
                    wp7 wp78 = wp7.START_ARRAY;
                    this.b = wp78;
                    return wp78;
                } else if (i == 102) {
                    f1();
                    wp7 wp79 = wp7.VALUE_FALSE;
                    this.b = wp79;
                    return wp79;
                } else if (i == 110) {
                    g1();
                    wp7 wp710 = wp7.VALUE_NULL;
                    this.b = wp710;
                    return wp710;
                } else if (i == 116) {
                    j1();
                    wp7 wp711 = wp7.VALUE_TRUE;
                    this.b = wp711;
                    return wp711;
                } else if (i != 123) {
                    switch (i) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            wp7 p1 = p1(i);
                            this.b = p1;
                            return p1;
                        default:
                            wp7 c12 = c1(i);
                            this.b = c12;
                            return c12;
                    }
                } else {
                    this.Z = this.Z.g(this.X, this.Y);
                    wp7 wp712 = wp7.START_OBJECT;
                    this.b = wp712;
                    return wp712;
                }
            } else {
                int i18 = this.v;
                int[] iArr = f1;
                String str3 = "";
                if (i != 34) {
                    rw0 rw0 = this.Q0;
                    char c = '\'';
                    if (i != 39 || (i15 & a1) == 0) {
                        if ((b1 & i15) != 0) {
                            int[] iArr2 = t22.f;
                            if (iArr2[i] == 0) {
                                int[] iArr3 = this.R0;
                                int i19 = 0;
                                int i20 = 0;
                                int i21 = 0;
                                while (true) {
                                    if (i19 < 4) {
                                        i19++;
                                        i21 = i | (i21 << 8);
                                    } else {
                                        if (i20 >= iArr3.length) {
                                            iArr3 = m8b.O0(iArr3.length, iArr3);
                                            this.R0 = iArr3;
                                        }
                                        iArr3[i20] = i21;
                                        i21 = i;
                                        i20++;
                                        i19 = 1;
                                    }
                                    if (this.v < this.w || d1()) {
                                        byte[] bArr5 = this.U0;
                                        int i22 = this.v;
                                        i = bArr5[i22] & UByte.MAX_VALUE;
                                        if (iArr2[i] != 0) {
                                            if (i19 > 0) {
                                                if (i20 >= iArr3.length) {
                                                    iArr3 = m8b.O0(iArr3.length, iArr3);
                                                    this.R0 = iArr3;
                                                }
                                                iArr3[i20] = i21;
                                                i20++;
                                            }
                                            str2 = rw0.m(i20, iArr3);
                                            if (str2 == null) {
                                                str2 = H1(iArr3, i20, i19);
                                            }
                                        } else {
                                            this.v = i22 + 1;
                                        }
                                    } else {
                                        wp7 wp713 = wp7.NOT_AVAILABLE;
                                        G0(" in field name");
                                        throw null;
                                    }
                                }
                            } else {
                                J0(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                                throw null;
                            }
                        } else {
                            J0((char) T0(i), "was expecting double-quote to start field name");
                            throw null;
                        }
                    } else if (i18 < this.w || d1()) {
                        byte[] bArr6 = this.U0;
                        int i23 = this.v;
                        this.v = i23 + 1;
                        char c2 = bArr6[i23] & 255;
                        if (c2 != '\'') {
                            int[] iArr4 = this.R0;
                            int i24 = 0;
                            int i25 = 0;
                            int i26 = 0;
                            while (c2 != c) {
                                if (!(iArr[c2] == 0 || c2 == '\"')) {
                                    if (c2 != '\\') {
                                        L0(c2, "name");
                                    } else {
                                        c2 = U0();
                                    }
                                    if (c2 > 127) {
                                        if (i4 >= 4) {
                                            if (i24 >= iArr4.length) {
                                                iArr4 = m8b.O0(iArr4.length, iArr4);
                                                this.R0 = iArr4;
                                            }
                                            iArr4[i24] = i26;
                                            i24++;
                                            i4 = 0;
                                            i26 = 0;
                                        }
                                        if (c2 < 2048) {
                                            i5 = (i26 << 8) | (c2 >> 6) | 192;
                                            i4++;
                                        } else {
                                            int i27 = (i26 << 8) | (c2 >> 12) | 224;
                                            int i28 = i4 + 1;
                                            if (i28 >= 4) {
                                                if (i24 >= iArr4.length) {
                                                    iArr4 = m8b.O0(iArr4.length, iArr4);
                                                    this.R0 = iArr4;
                                                }
                                                iArr4[i24] = i27;
                                                i24++;
                                                i27 = 0;
                                                i28 = 0;
                                            }
                                            i5 = (i27 << 8) | ((c2 >> 6) & 63) | Uuid.SIZE_BITS;
                                            i4 = i28 + 1;
                                        }
                                        i26 = i5;
                                        c2 = (c2 & '?') | 128;
                                    }
                                }
                                if (i4 < 4) {
                                    i25 = i4 + 1;
                                    i26 = c2 | (i26 << 8);
                                } else {
                                    if (i24 >= iArr4.length) {
                                        iArr4 = m8b.O0(iArr4.length, iArr4);
                                        this.R0 = iArr4;
                                    }
                                    iArr4[i24] = i26;
                                    i26 = c2;
                                    i24++;
                                    i25 = 1;
                                }
                                if (this.v < this.w || d1()) {
                                    byte[] bArr7 = this.U0;
                                    int i29 = this.v;
                                    this.v = i29 + 1;
                                    c2 = bArr7[i29] & 255;
                                    c = '\'';
                                } else {
                                    wp7 wp714 = wp7.NOT_AVAILABLE;
                                    G0(" in field name");
                                    throw null;
                                }
                            }
                            if (i4 > 0) {
                                if (i24 >= iArr4.length) {
                                    iArr4 = m8b.O0(iArr4.length, iArr4);
                                    this.R0 = iArr4;
                                }
                                iArr4[i24] = k1(i26, i4);
                                i24++;
                            }
                            str2 = rw0.m(i24, iArr4);
                            if (str2 == null) {
                                str2 = H1(iArr4, i24, i4);
                            }
                        }
                        str = str3;
                        i2 = 45;
                    } else {
                        wp7 wp715 = wp7.NOT_AVAILABLE;
                        G0(": was expecting closing ''' for field name");
                        throw null;
                    }
                    str3 = str2;
                    str = str3;
                    i2 = 45;
                } else {
                    int i30 = 13 + i18;
                    int i31 = this.w;
                    if (i30 <= i31) {
                        i2 = 45;
                        byte[] bArr8 = this.U0;
                        int i32 = i18 + 1;
                        this.v = i32;
                        byte b6 = bArr8[i18] & UByte.MAX_VALUE;
                        if (iArr[b6] == 0) {
                            int i33 = i18 + 2;
                            this.v = i33;
                            byte b7 = bArr8[i32] & UByte.MAX_VALUE;
                            if (iArr[b7] == 0) {
                                byte b8 = b7 | (b6 << 8);
                                int i34 = i18 + 3;
                                this.v = i34;
                                byte b9 = bArr8[i33] & UByte.MAX_VALUE;
                                if (iArr[b9] == 0) {
                                    byte b10 = (b8 << 8) | b9;
                                    int i35 = i18 + 4;
                                    this.v = i35;
                                    byte b11 = bArr8[i34] & UByte.MAX_VALUE;
                                    if (iArr[b11] == 0) {
                                        int i36 = (b10 << 8) | b11;
                                        int i37 = i18 + 5;
                                        this.v = i37;
                                        byte b12 = bArr8[i35] & UByte.MAX_VALUE;
                                        if (iArr[b12] == 0) {
                                            int i38 = i18 + 6;
                                            this.v = i38;
                                            byte b13 = bArr8[i37] & UByte.MAX_VALUE;
                                            if (iArr[b13] == 0) {
                                                byte b14 = b13 | (b12 << 8);
                                                int i39 = i18 + 7;
                                                this.v = i39;
                                                byte b15 = bArr8[i38] & UByte.MAX_VALUE;
                                                if (iArr[b15] == 0) {
                                                    byte b16 = (b14 << 8) | b15;
                                                    int i40 = i18 + 8;
                                                    this.v = i40;
                                                    byte b17 = bArr8[i39] & UByte.MAX_VALUE;
                                                    if (iArr[b17] == 0) {
                                                        int i41 = (b16 << 8) | b17;
                                                        int i42 = i18 + 9;
                                                        this.v = i42;
                                                        byte b18 = bArr8[i40] & UByte.MAX_VALUE;
                                                        if (iArr[b18] == 0) {
                                                            int i43 = 10 + i18;
                                                            this.v = i43;
                                                            byte b19 = bArr8[i42] & UByte.MAX_VALUE;
                                                            if (iArr[b19] != 0) {
                                                                N1 = b19 == 34 ? K1(i36, i41, b18, 1) : O1(i36, i41, b18, b19, 1);
                                                            } else {
                                                                byte b20 = b19 | (b18 << 8);
                                                                int i44 = i18 + 11;
                                                                this.v = i44;
                                                                byte b21 = bArr8[i43] & UByte.MAX_VALUE;
                                                                if (iArr[b21] == 0) {
                                                                    byte b22 = (b20 << 8) | b21;
                                                                    int i45 = i18 + 12;
                                                                    this.v = i45;
                                                                    byte b23 = bArr8[i44] & UByte.MAX_VALUE;
                                                                    if (iArr[b23] == 0) {
                                                                        int i46 = (b22 << 8) | b23;
                                                                        this.v = i30;
                                                                        byte b24 = bArr8[i45] & UByte.MAX_VALUE;
                                                                        if (iArr[b24] == 0) {
                                                                            int[] iArr5 = this.R0;
                                                                            iArr5[0] = i36;
                                                                            iArr5[1] = i41;
                                                                            iArr5[2] = i46;
                                                                            byte b25 = b24;
                                                                            int i47 = 3;
                                                                            while (true) {
                                                                                int i48 = this.v;
                                                                                int i49 = i48 + 4;
                                                                                if (i49 > this.w) {
                                                                                    N1 = N1(i47, 0, b25, 0, this.R0);
                                                                                    break;
                                                                                }
                                                                                int i50 = i48 + 1;
                                                                                this.v = i50;
                                                                                byte b26 = bArr8[i48] & UByte.MAX_VALUE;
                                                                                if (iArr[b26] != 0) {
                                                                                    N1 = b26 == 34 ? L1(i47, b25, 1, this.R0) : N1(i47, b25, b26, 1, this.R0);
                                                                                } else {
                                                                                    byte b27 = (b25 << 8) | b26;
                                                                                    int i51 = i48 + 2;
                                                                                    this.v = i51;
                                                                                    byte b28 = bArr8[i50] & UByte.MAX_VALUE;
                                                                                    if (iArr[b28] != 0) {
                                                                                        N1 = b28 == 34 ? L1(i47, b27, 2, this.R0) : N1(i47, b27, b28, 2, this.R0);
                                                                                    } else {
                                                                                        byte b29 = (b27 << 8) | b28;
                                                                                        int i52 = i48 + 3;
                                                                                        this.v = i52;
                                                                                        byte b30 = bArr8[i51] & UByte.MAX_VALUE;
                                                                                        if (iArr[b30] != 0) {
                                                                                            N1 = b30 == 34 ? L1(i47, b29, 3, this.R0) : N1(i47, b29, b30, 3, this.R0);
                                                                                        } else {
                                                                                            int i53 = (b29 << 8) | b30;
                                                                                            this.v = i49;
                                                                                            byte b31 = bArr8[i52] & UByte.MAX_VALUE;
                                                                                            if (iArr[b31] != 0) {
                                                                                                N1 = b31 == 34 ? L1(i47, i53, 4, this.R0) : N1(i47, i53, b31, 4, this.R0);
                                                                                            } else {
                                                                                                int[] iArr6 = this.R0;
                                                                                                if (i47 >= iArr6.length) {
                                                                                                    this.R0 = m8b.O0(i47, iArr6);
                                                                                                }
                                                                                                this.R0[i47] = i53;
                                                                                                b25 = b31;
                                                                                                i47++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            N1 = b24 == 34 ? K1(i36, i41, i46, 4) : O1(i36, i41, i46, b24, 4);
                                                                        }
                                                                    } else if (b23 == 34) {
                                                                        K1 = K1(i36, i41, b22, 3);
                                                                    } else {
                                                                        N1 = O1(i36, i41, b22, b23, 3);
                                                                    }
                                                                } else if (b21 == 34) {
                                                                    K1 = K1(i36, i41, b20, 2);
                                                                } else {
                                                                    N1 = O1(i36, i41, b20, b21, 2);
                                                                }
                                                                N1 = K1;
                                                            }
                                                        } else if (b18 == 34) {
                                                            N1 = J1(i36, i41, 4);
                                                        } else {
                                                            int[] iArr7 = this.R0;
                                                            iArr7[0] = i36;
                                                            N1 = N1(1, i41, b18, 4, iArr7);
                                                        }
                                                    } else if (b17 == 34) {
                                                        N1 = J1(i36, b16, 3);
                                                    } else {
                                                        int[] iArr8 = this.R0;
                                                        iArr8[0] = i36;
                                                        N1 = N1(1, b16, b17, 3, iArr8);
                                                    }
                                                } else if (b15 == 34) {
                                                    N1 = J1(i36, b14, 2);
                                                } else {
                                                    int[] iArr9 = this.R0;
                                                    iArr9[0] = i36;
                                                    N1 = N1(1, b14, b15, 2, iArr9);
                                                }
                                            } else if (b13 == 34) {
                                                N1 = J1(i36, b12, 1);
                                            } else {
                                                int[] iArr10 = this.R0;
                                                iArr10[0] = i36;
                                                N1 = N1(1, b12, b13, 1, iArr10);
                                            }
                                            str3 = N1;
                                        } else {
                                            str3 = b12 == 34 ? I1(i36, 4) : N1(0, i36, b12, 4, this.R0);
                                        }
                                    } else {
                                        str3 = b11 == 34 ? I1(b10, 3) : N1(0, b10, b11, 3, this.R0);
                                    }
                                } else {
                                    str3 = b9 == 34 ? I1(b8, 2) : N1(0, b8, b9, 2, this.R0);
                                }
                            } else {
                                str3 = b7 == 34 ? I1(b6, 1) : N1(0, b6, b7, 1, this.R0);
                            }
                        } else if (b6 != 34) {
                            str3 = N1(0, 0, b6, 0, this.R0);
                        }
                    } else if (i18 < i31 || d1()) {
                        byte[] bArr9 = this.U0;
                        int i54 = this.v;
                        this.v = i54 + 1;
                        byte b32 = bArr9[i54] & UByte.MAX_VALUE;
                        if (b32 == 34) {
                            i2 = 45;
                        } else {
                            i2 = 45;
                            str3 = N1(0, 0, b32, 0, this.R0);
                        }
                    } else {
                        wp7 wp716 = wp7.NOT_AVAILABLE;
                        G0(": was expecting closing '\"' for name");
                        throw null;
                    }
                    str = str3;
                }
                this.Z.h(str);
                this.b = wp7.FIELD_NAME;
                int i55 = this.v;
                if (i55 + 4 >= this.w) {
                    i3 = w1(false);
                } else {
                    byte[] bArr10 = this.U0;
                    byte b33 = bArr10[i55];
                    if (b33 == 58) {
                        int i56 = 1 + i55;
                        this.v = i56;
                        b = bArr10[i56];
                        if (b <= 32) {
                            if (b == 32 || b == 9) {
                                int i57 = i55 + 2;
                                this.v = i57;
                                b2 = bArr10[i57];
                                if (b2 > 32) {
                                    if (b2 == 47 || b2 == 35) {
                                        i3 = w1(true);
                                    } else {
                                        this.v = i55 + 3;
                                        i3 = b2;
                                    }
                                }
                            }
                            i3 = w1(true);
                        } else if (b == 47 || b == 35) {
                            i3 = w1(true);
                        } else {
                            this.v = i55 + 2;
                        }
                    } else {
                        if (b33 == 32 || b33 == 9) {
                            int i58 = i55 + 1;
                            this.v = i58;
                            b33 = bArr10[i58];
                        }
                        if (b33 == 58) {
                            int i59 = this.v;
                            int i60 = 1 + i59;
                            this.v = i60;
                            b = bArr10[i60];
                            if (b <= 32) {
                                if (b == 32 || b == 9) {
                                    int i61 = i59 + 2;
                                    this.v = i61;
                                    b2 = bArr10[i61];
                                    if (b2 > 32) {
                                        if (b2 == 47 || b2 == 35) {
                                            i3 = w1(true);
                                        } else {
                                            this.v = i59 + 3;
                                            i3 = b2;
                                        }
                                    }
                                }
                                i3 = w1(true);
                            } else if (b == 47 || b == 35) {
                                i3 = w1(true);
                            } else {
                                this.v = i59 + 2;
                            }
                        } else {
                            i3 = w1(false);
                        }
                    }
                    i3 = b;
                }
                E1();
                if (i3 == 34) {
                    this.S0 = true;
                    this.v0 = wp7.VALUE_STRING;
                    return this.b;
                }
                if (i3 == i2) {
                    wp7 = n1();
                } else if (i3 == 46) {
                    wp7 = m1();
                } else if (i3 == 91) {
                    wp7 = wp7.START_ARRAY;
                } else if (i3 == 102) {
                    f1();
                    wp7 = wp7.VALUE_FALSE;
                } else if (i3 == 110) {
                    g1();
                    wp7 = wp7.VALUE_NULL;
                } else if (i3 == 116) {
                    j1();
                    wp7 = wp7.VALUE_TRUE;
                } else if (i3 != 123) {
                    switch (i3) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            wp7 = p1(i3);
                            break;
                        default:
                            wp7 = c1(i3);
                            break;
                    }
                } else {
                    wp7 = wp7.START_OBJECT;
                }
                this.v0 = wp7;
                return this.b;
            }
        }
    }

    public final void v1() {
        if (this.v < this.w || d1()) {
            byte[] bArr = this.U0;
            int i = this.v;
            if (bArr[i] == 10) {
                this.v = i + 1;
            }
        }
        this.y++;
        this.z = this.v;
    }

    public final void w0() {
        if (this.T0 != null) {
            if (this.c.b || np7.AUTO_CLOSE_SOURCE.a(this.a)) {
                this.T0.close();
            }
            this.T0 = null;
        }
    }

    public final int w1(boolean z) {
        while (true) {
            if (this.v < this.w || d1()) {
                byte[] bArr = this.U0;
                int i = this.v;
                int i2 = i + 1;
                this.v = i2;
                byte b = bArr[i] & UByte.MAX_VALUE;
                if (b > 32) {
                    if (b == 47) {
                        x1();
                    } else if (b == 35 && (this.a & d1) != 0) {
                        y1();
                    } else if (z) {
                        return b;
                    } else {
                        if (b == 58) {
                            z = true;
                        } else {
                            J0(b, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.y++;
                    this.z = i2;
                } else if (b == 13) {
                    v1();
                } else if (b != 9) {
                    K0(b);
                    throw null;
                }
            } else {
                G0(" within/between " + this.Z.e() + " entries");
                throw null;
            }
        }
    }

    public final void x1() {
        if ((this.a & c1) == 0) {
            J0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this.v < this.w || d1()) {
            byte[] bArr = this.U0;
            int i = this.v;
            this.v = i + 1;
            byte b = bArr[i] & UByte.MAX_VALUE;
            if (b == 47) {
                y1();
            } else if (b == 42) {
                int[] iArr = t22.g;
                while (true) {
                    if (this.v >= this.w && !d1()) {
                        break;
                    }
                    byte[] bArr2 = this.U0;
                    int i2 = this.v;
                    int i3 = i2 + 1;
                    this.v = i3;
                    byte b2 = bArr2[i2] & UByte.MAX_VALUE;
                    int i4 = iArr[b2];
                    if (i4 != 0) {
                        if (i4 == 2) {
                            z1();
                        } else if (i4 == 3) {
                            A1();
                        } else if (i4 == 4) {
                            B1();
                        } else if (i4 == 10) {
                            this.y++;
                            this.z = i3;
                        } else if (i4 == 13) {
                            v1();
                        } else if (i4 == 42) {
                            if (i3 >= this.w && !d1()) {
                                break;
                            }
                            byte[] bArr3 = this.U0;
                            int i5 = this.v;
                            if (bArr3[i5] == 47) {
                                this.v = i5 + 1;
                                return;
                            }
                        } else {
                            q1(b2);
                            throw null;
                        }
                    }
                }
                G0(" in a comment");
                throw null;
            } else {
                J0(b, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            G0(" in a comment");
            throw null;
        }
    }

    public final void y1() {
        int[] iArr = t22.g;
        while (true) {
            if (this.v < this.w || d1()) {
                byte[] bArr = this.U0;
                int i = this.v;
                int i2 = i + 1;
                this.v = i2;
                byte b = bArr[i] & UByte.MAX_VALUE;
                int i3 = iArr[b];
                if (i3 != 0) {
                    if (i3 == 2) {
                        z1();
                    } else if (i3 == 3) {
                        A1();
                    } else if (i3 == 4) {
                        B1();
                    } else if (i3 == 10) {
                        this.y++;
                        this.z = i2;
                        return;
                    } else if (i3 == 13) {
                        v1();
                        return;
                    } else if (i3 != 42 && i3 < 0) {
                        q1(b);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void z1() {
        if (this.v >= this.w) {
            e1();
        }
        byte[] bArr = this.U0;
        int i = this.v;
        int i2 = i + 1;
        this.v = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            t1(b & UByte.MAX_VALUE, i2);
            throw null;
        }
    }
}
