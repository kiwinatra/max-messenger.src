package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: qd3  reason: default package */
public final class qd3 implements sa7 {
    public static final qd3 c = new qd3(true, 1);
    public final boolean a;
    public final int b;

    public /* synthetic */ qd3(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public String a() {
        return "SimpleImageTranscoder";
    }

    public jq5 b(j55 j55, f69 f69, f8d f8d, v3d v3d, ColorSpace colorSpace) {
        Bitmap bitmap;
        jq5 jq5;
        j55 j552 = j55;
        ColorSpace colorSpace2 = colorSpace;
        Integer num = 85;
        f8d f8d2 = f8d == null ? f8d.b : f8d;
        int i = 1;
        int h = !this.a ? 1 : y7e.h(f8d2, v3d, j552, this.b);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = h;
        if (colorSpace2 != null) {
            options.inPreferredColorSpace = colorSpace2;
        }
        try {
            Matrix matrix = null;
            Bitmap decodeStream = BitmapFactory.decodeStream(j55.n(), (Rect) null, options);
            if (decodeStream == null) {
                bg5.c("SimpleImageTranscoder");
                return new jq5(2, 6);
            }
            a00 a00 = go7.a;
            j55.m0();
            if (go7.a.contains(Integer.valueOf(j552.v))) {
                int a2 = go7.a(f8d2, j552);
                Matrix matrix2 = new Matrix();
                if (a2 == 2) {
                    matrix2.setScale(-1.0f, 1.0f);
                } else if (a2 == 7) {
                    matrix2.setRotate(-90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (a2 == 4) {
                    matrix2.setRotate(180.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (a2 == 5) {
                    matrix2.setRotate(90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                }
                matrix = matrix2;
            } else {
                int b2 = go7.b(f8d2, j552);
                if (b2 != 0) {
                    matrix = new Matrix();
                    matrix.setRotate((float) b2);
                }
            }
            Matrix matrix3 = matrix;
            if (matrix3 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix3, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmap = decodeStream;
                    try {
                        bg5.d("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                        jq5 = new jq5(2, 6);
                        bitmap.recycle();
                        decodeStream.recycle();
                        return jq5;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), f69);
                if (h > 1) {
                    i = 0;
                }
                jq5 = new jq5(i, 6);
            } catch (OutOfMemoryError e2) {
                e = e2;
                bg5.d("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                jq5 = new jq5(2, 6);
                bitmap.recycle();
                decodeStream.recycle();
                return jq5;
            }
            bitmap.recycle();
            decodeStream.recycle();
            return jq5;
        } catch (OutOfMemoryError e3) {
            bg5.d("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new jq5(2, 6);
        }
    }

    public boolean c(h97 h97) {
        return h97 == eg4.k || h97 == eg4.a;
    }

    public boolean d(j55 j55, f8d f8d, v3d v3d) {
        if (f8d == null) {
            f8d = f8d.b;
        }
        return this.a && y7e.h(f8d, v3d, j55, this.b) > 1;
    }

    public qd3(int i, boolean z) {
        this.b = i;
        this.a = z;
    }
}
