package defpackage;

import kotlin.UByte;
import kotlin.text.Charsets;

/* renamed from: au0  reason: default package */
public abstract class au0 {
    public static final byte[] a = "0123456789abcdef".getBytes(Charsets.UTF_8);

    public static final String a(rt0 rt0, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (rt0.U(j2) == ((byte) 13)) {
                String p0 = rt0.p0(j2, Charsets.UTF_8);
                rt0.S(2);
                return p0;
            }
        }
        rt0.getClass();
        String p02 = rt0.p0(j, Charsets.UTF_8);
        rt0.S(1);
        return p02;
    }

    public static final int b(rt0 rt0, b5b b5b, boolean z) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        hod hod;
        int i4;
        hod hod2 = rt0.a;
        if (hod2 == null) {
            return z ? -2 : -1;
        }
        int i5 = hod2.b;
        int i6 = hod2.c;
        int[] iArr = b5b.b;
        byte[] bArr3 = hod2.a;
        hod hod3 = hod2;
        int i7 = -1;
        int i8 = 0;
        loop0:
        while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (hod3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = (i10 * -1) + i11;
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr3[i5] & UByte.MAX_VALUE) != iArr[i11]) {
                        return i7;
                    }
                    boolean z2 = i15 == i13;
                    if (i14 == i6) {
                        hod hod4 = hod3.f;
                        i4 = hod4.b;
                        int i16 = hod4.c;
                        bArr2 = hod4.a;
                        if (hod4 != hod2) {
                            int i17 = i16;
                            hod = hod4;
                            i6 = i17;
                        } else if (!z2) {
                            break loop0;
                        } else {
                            i6 = i16;
                            hod = null;
                        }
                    } else {
                        hod = hod3;
                        bArr2 = bArr3;
                        i4 = i14;
                    }
                    if (z2) {
                        i3 = iArr[i15];
                        int i18 = i4;
                        i = i6;
                        i2 = i18;
                        byte[] bArr4 = bArr2;
                        hod3 = hod;
                        bArr = bArr4;
                        break;
                    }
                    i5 = i4;
                    bArr3 = bArr2;
                    hod3 = hod;
                    i11 = i15;
                }
            } else {
                int i19 = i5 + 1;
                byte b = bArr3[i5] & UByte.MAX_VALUE;
                int i20 = i11 + i10;
                while (i11 != i20) {
                    if (b == iArr[i11]) {
                        i3 = iArr[i11 + i10];
                        if (i19 == i6) {
                            hod3 = hod3.f;
                            i2 = hod3.b;
                            i = hod3.c;
                            bArr = hod3.a;
                            if (hod3 == hod2) {
                                hod3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i = i6;
                            i2 = i19;
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            if (i3 >= 0) {
                return i3;
            }
            byte[] bArr5 = bArr;
            i8 = -i3;
            i5 = i2;
            i6 = i;
            bArr3 = bArr5;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
