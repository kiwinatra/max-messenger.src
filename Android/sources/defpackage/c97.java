package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: c97  reason: default package */
public final class c97 {
    public static final c97 c;
    public final Bitmap.Config a;
    public final Bitmap.Config b;

    static {
        xe8 xe8 = new xe8(15, false);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        xe8.b = config;
        xe8.c = config;
        c = new c97(xe8);
    }

    public c97(xe8 xe8) {
        this.a = (Bitmap.Config) xe8.b;
        this.b = (Bitmap.Config) xe8.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c97.class != obj.getClass()) {
            return false;
        }
        c97 c97 = (c97) obj;
        return this.a == c97.a && this.b == c97.b;
    }

    public final int hashCode() {
        int ordinal = (this.a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.b;
        return (ordinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        w28 K = hsg.K(this);
        K.v(100, "minDecodeIntervalMs");
        K.v(IntCompanionObject.MAX_VALUE, "maxDimensionPx");
        K.w("decodePreviewFrame", false);
        K.w("useLastFrameForPreview", false);
        K.w("useEncodedImageForPreview", false);
        K.w("decodeAllFrames", false);
        K.w("forceStaticImage", false);
        K.x(this.a.name(), "bitmapConfigName");
        K.x(this.b.name(), "animatedBitmapConfigName");
        K.x((Object) null, "customImageDecoder");
        K.x((Object) null, "bitmapTransformation");
        K.x((Object) null, "colorSpace");
        return wj6.n(sb, K.toString(), "}");
    }
}
