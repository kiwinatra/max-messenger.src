package one.me.sdk.uikit.qr;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001J6\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H ¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/sdk/uikit/qr/QrCodeGenerator;", "", "", "content", "logo", "", "size", "", "coordinates", "nativeGenerateQR", "(Ljava/lang/String;Ljava/lang/String;I[I)[I", "svg", "width", "height", "nativeRenderSvg", "(Ljava/lang/String;II)[I", "qr_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nQrCodeGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrCodeGenerator.kt\none/me/sdk/uikit/qr/QrCodeGenerator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public abstract class QrCodeGenerator {
    public static final ekd a = nac.a;
    public static final boolean b;

    static {
        boolean z;
        try {
            System.loadLibrary("qrcode");
            z = true;
        } catch (Throwable th) {
            a.getClass();
            z68.f("QrCodeGenerator", "Failed to load native library qrcode", th);
            z = false;
        }
        b = z;
    }

    public static Bitmap a(String str, int i, int i2, Bitmap bitmap) {
        int i3;
        int i4;
        Bitmap bitmap2;
        Bitmap bitmap3 = bitmap;
        Bitmap bitmap4 = null;
        int[] iArr = new int[4];
        int i5 = i;
        int[] nativeGenerateQR = nativeGenerateQR(str, bitmap3 != null ? "" : null, i5, iArr);
        if (nativeGenerateQR != null) {
            try {
                i4 = (int) Math.sqrt((double) nativeGenerateQR.length);
                i3 = MathKt.roundToInt(((double) i4) * 0.87d);
                Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(nativeGenerateQR, 0, i4, 0, 0, i4, i4);
                    bitmap2 = Bitmap.createScaledBitmap(createBitmap, i3, i3, false);
                } catch (Throwable th) {
                    th = th;
                    bitmap4 = createBitmap;
                    z68.f(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                    return bitmap4;
                }
            } catch (Throwable th2) {
                th = th2;
                z68.f(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                return bitmap4;
            }
        } else {
            bitmap2 = null;
            i4 = i5;
            i3 = i4;
        }
        try {
            Bitmap createBitmap2 = Bitmap.createBitmap(i4, i4, bitmap2.getConfig());
            Canvas canvas = new Canvas(createBitmap2);
            Path path = new Path();
            float f = (float) i2;
            path.addRoundRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) createBitmap2.getWidth(), (float) createBitmap2.getHeight(), f, f, Path.Direction.CW);
            float f2 = ((float) (i4 - i3)) / 2.0f;
            canvas.clipPath(path);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmap2, f2, f2, (Paint) null);
            if (bitmap3 != null) {
                Paint paint = new Paint(2);
                paint.setAntiAlias(true);
                Rect rect = new Rect();
                int i6 = iArr[0];
                rect.left = i6;
                int i7 = iArr[1];
                rect.top = i7;
                rect.bottom = i7 + iArr[2];
                rect.right = i6 + iArr[3];
                canvas.drawBitmap(bitmap3, (Rect) null, rect, paint);
            }
            bitmap2.recycle();
            return createBitmap2;
        } catch (Throwable th3) {
            th = th3;
            bitmap4 = bitmap2;
            z68.f(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
            return bitmap4;
        }
    }

    @JvmStatic
    private static final native int[] nativeGenerateQR(String str, String str2, int i, int[] iArr);

    @JvmStatic
    public static final native int[] nativeRenderSvg(String str, int i, int i2);
}
