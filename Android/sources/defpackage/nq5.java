package defpackage;

import kotlin.UByte;

/* renamed from: nq5  reason: default package */
public final class nq5 extends qn0 {
    public static int f(int i, byte[] bArr) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }
}
