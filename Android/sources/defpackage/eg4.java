package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: eg4  reason: default package */
public abstract class eg4 {
    public static final h97 a;
    public static final h97 b;
    public static final h97 c;
    public static final h97 d;
    public static final h97 e;
    public static final h97 f;
    public static final h97 g;
    public static final h97 h;
    public static final h97 i;
    public static final h97 j;
    public static final h97 k;
    public static final h97 l = new h97("DNG", "dng");
    public static final h97 m;
    public static final h97 n;
    public static final List o;

    static {
        h97 h97 = new h97("JPEG", "jpeg");
        a = h97;
        h97 h972 = new h97("PNG", "png");
        b = h972;
        h97 h973 = new h97("GIF", "gif");
        c = h973;
        h97 h974 = new h97("BMP", "bmp");
        d = h974;
        h97 h975 = new h97("ICO", "ico");
        e = h975;
        h97 h976 = new h97("WEBP_SIMPLE", "webp");
        f = h976;
        h97 h977 = new h97("WEBP_LOSSLESS", "webp");
        g = h977;
        h97 h978 = new h97("WEBP_EXTENDED", "webp");
        h = h978;
        h97 h979 = new h97("WEBP_EXTENDED_WITH_ALPHA", "webp");
        i = h979;
        h97 h9710 = new h97("WEBP_ANIMATED", "webp");
        j = h9710;
        h97 h9711 = new h97("HEIF", "heif");
        k = h9711;
        h97 h9712 = new h97("BINARY_XML", "xml");
        m = h9712;
        h97 h9713 = new h97("AVIF", "avif");
        n = h9713;
        o = CollectionsKt.listOf(h97, h972, h973, h974, h975, h976, h977, h978, h979, h9710, h9711, h9712, h9713);
    }
}
