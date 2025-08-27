package defpackage;

import kotlin.text.Charsets;

/* renamed from: rf6  reason: default package */
public final class rf6 implements g97 {
    public static final rf6 a = new Object();
    public static final byte[] b = te8.d("<svg");
    public static final byte[] c = te8.d("<?xm");
    public static final int d;

    /* JADX WARNING: type inference failed for: r0v0, types: [rf6, java.lang.Object] */
    static {
        int length = "<svg".getBytes(Charsets.UTF_16).length;
        d = length;
    }

    public final h97 a(int i, byte[] bArr) {
        return (te8.p(bArr, b, 0) || te8.p(bArr, c, 0)) ? kr7.o : h97.c;
    }

    public final int b() {
        return d;
    }
}
