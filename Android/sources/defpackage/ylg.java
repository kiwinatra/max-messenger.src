package defpackage;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;
import org.apache.http.protocol.HTTP;

/* renamed from: ylg  reason: default package */
public abstract class ylg {
    public static final WebpBitmapFactoryImpl a = null;
    public static boolean b = false;
    public static final byte[] c = a("RIFF");
    public static final byte[] d = a("WEBP");
    public static final byte[] e = a("VP8 ");
    public static final byte[] f = a("VP8L");
    public static final byte[] g = a("VP8X");

    public static byte[] a(String str) {
        try {
            return str.getBytes(HTTP.ASCII);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean b(int i, byte[] bArr) {
        return i >= 20 && c(bArr, c, 0) && c(bArr, d, 8);
    }

    public static boolean c(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2 == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
