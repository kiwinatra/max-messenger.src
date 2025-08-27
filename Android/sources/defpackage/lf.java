package defpackage;

import com.facebook.animated.gif.GifImage;

/* renamed from: lf  reason: default package */
public final class lf {
    public static final GifImage a;
    public static final GifImage b;

    static {
        GifImage gifImage;
        GifImage gifImage2 = null;
        try {
            gifImage = GifImage.class.newInstance();
        } catch (Throwable unused) {
            gifImage = null;
        }
        a = gifImage;
        try {
            gifImage2 = (GifImage) Class.forName("com.facebook.animated.webp.WebPImage").newInstance();
        } catch (Throwable unused2) {
        }
        b = gifImage2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [tgg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [yi0, t33] */
    public static t33 a(String str, c97 c97, GifImage gifImage) {
        c97.getClass();
        ? obj = new Object();
        obj.b = gifImage;
        obj.c = null;
        obj.o = null;
        obj.a = str;
        m7f q = obj.q();
        ? yi0 = new yi0();
        yi0.o = q;
        yi0.v = true;
        return yi0;
    }
}
