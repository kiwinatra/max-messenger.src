package defpackage;

import kotlin.UByte;

/* renamed from: wyg  reason: default package */
public abstract class wyg {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public abstract int a();

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof wyg) {
            wyg wyg = (wyg) obj;
            byte[] bArr = ((vyg) this).b;
            if (bArr.length * 8 == ((vyg) wyg).b.length * 8) {
                byte[] bArr2 = ((vyg) wyg).b;
                if (bArr.length == bArr2.length) {
                    z = true;
                    for (int i = 0; i < bArr.length; i++) {
                        z &= bArr[i] == bArr2[i];
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((vyg) this).b;
        if (bArr.length * 8 >= 32) {
            return a();
        }
        byte b = bArr[0] & UByte.MAX_VALUE;
        for (int i = 1; i < bArr.length; i++) {
            b |= (bArr[i] & UByte.MAX_VALUE) << (i * 8);
        }
        return b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(r0 + r0);
        for (byte b : ((vyg) this).b) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
