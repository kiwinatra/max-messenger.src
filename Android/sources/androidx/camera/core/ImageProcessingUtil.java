package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;

public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static ha7 a(obd obd, byte[] bArr) {
        bs0.n(obd.f() == 256);
        bArr.getClass();
        Surface surface = obd.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            return null;
        }
        return obd.e();
    }

    public static Bitmap b(ha7 ha7) {
        if (ha7.n0() == 35) {
            int width = ha7.getWidth();
            int height = ha7.getHeight();
            int f0 = ha7.w()[0].f0();
            int f02 = ha7.w()[1].f0();
            int f03 = ha7.w()[2].f0();
            int e0 = ha7.w()[0].e0();
            int e02 = ha7.w()[1].e0();
            Bitmap createBitmap = Bitmap.createBitmap(ha7.getWidth(), ha7.getHeight(), Bitmap.Config.ARGB_8888);
            int rowBytes = createBitmap.getRowBytes();
            if (nativeConvertAndroid420ToBitmap(ha7.w()[0].d0(), f0, ha7.w()[1].d0(), f02, ha7.w()[2].d0(), f03, e0, e02, createBitmap, rowBytes, width, height) == 0) {
                return createBitmap;
            }
            throw new UnsupportedOperationException("YUV to RGB conversion failed");
        }
        throw new IllegalArgumentException("Input image format must be YUV_420_888");
    }

    public static l87 c(ha7 ha7, ja7 ja7, ByteBuffer byteBuffer, int i, boolean z) {
        int i2 = i;
        if (!(ha7.n0() == 35 && ha7.w().length == 3)) {
            return null;
        }
        System.currentTimeMillis();
        if (i2 != 0 && i2 != 90 && i2 != 180 && i2 != 270) {
            return null;
        }
        Surface surface = ja7.getSurface();
        int width = ha7.getWidth();
        int height = ha7.getHeight();
        int f0 = ha7.w()[0].f0();
        int f02 = ha7.w()[1].f0();
        int f03 = ha7.w()[2].f0();
        int e0 = ha7.w()[0].e0();
        int e02 = ha7.w()[1].e0();
        if (nativeConvertAndroid420ToABGR(ha7.w()[0].d0(), f0, ha7.w()[1].d0(), f02, ha7.w()[2].d0(), f03, e0, e02, surface, byteBuffer, width, height, z ? e0 : 0, z ? e02 : 0, z ? e02 : 0, i) != 0) {
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            a++;
        }
        ha7 e = ja7.e();
        if (e == null) {
            return null;
        }
        l87 l87 = new l87(e);
        l87.a(new ga7(e, ha7));
        return l87;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void f(byte[] bArr, Surface surface) {
        surface.getClass();
        nativeWriteJpegToSurface(bArr, surface);
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
