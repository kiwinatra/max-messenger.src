package defpackage;

import java.util.Arrays;
import kotlin.uuid.Uuid;

/* renamed from: za8  reason: default package */
public abstract class za8 {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[Uuid.SIZE_BITS];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        a = bArr;
    }
}
