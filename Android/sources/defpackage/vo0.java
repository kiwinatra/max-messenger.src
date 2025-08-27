package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;

/* renamed from: vo0  reason: default package */
public abstract class vo0 {
    public static final Lazy a = LazyKt.lazy(new m(19));

    /* JADX WARNING: type inference failed for: r4v2, types: [wsb, java.lang.Object] */
    public static final wsb a(InputStream inputStream) {
        Pair pair = null;
        if (inputStream != null) {
            Lazy lazy = a;
            ByteBuffer byteBuffer = (ByteBuffer) ((xqb) lazy.getValue()).c();
            if (byteBuffer == null) {
                qv0 qv0 = r94.a;
                byteBuffer = ByteBuffer.allocate(16384);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                options.inTempStorage = byteBuffer.array();
                BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                ColorSpace colorSpace = options.outColorSpace;
                int i = options.outWidth;
                int i2 = options.outHeight;
                ? obj = new Object();
                obj.a = colorSpace;
                if (i != -1) {
                    if (i2 != -1) {
                        pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                }
                obj.b = pair;
                return obj;
            } finally {
                ((xqb) lazy.getValue()).b(byteBuffer);
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public static final int b(Bitmap.Config config) {
        switch (config == null ? -1 : uo0.$EnumSwitchMapping$0[config.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int c(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            throw new IllegalArgumentException(wj6.h(i, "width must be > 0, width is: ").toString());
        } else if (i2 > 0) {
            int b = b(config);
            int i3 = i * i2 * b;
            if (i3 > 0) {
                return i3;
            }
            StringBuilder n = a81.n("size must be > 0: size: ", i3, ", width: ", i, ", height: ");
            n.append(i2);
            n.append(", pixelSize: ");
            n.append(b);
            throw new IllegalStateException(n.toString().toString());
        } else {
            throw new IllegalArgumentException(wj6.h(i2, "height must be > 0, height is: ").toString());
        }
    }

    public static final int d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
