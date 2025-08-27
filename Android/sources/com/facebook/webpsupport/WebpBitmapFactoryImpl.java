package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@cr4
public class WebpBitmapFactoryImpl {
    @cr4
    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            return options.inBitmap;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.inTempStorage;
     */
    @defpackage.cr4
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] getInTempStorageFromOptions(android.graphics.BitmapFactory.Options r0) {
        /*
            if (r0 == 0) goto L_0x0007
            byte[] r0 = r0.inTempStorage
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.getInTempStorageFromOptions(android.graphics.BitmapFactory$Options):byte[]");
    }

    @cr4
    private static float getScaleFromOptions(BitmapFactory.Options options) {
        float f = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f = 1.0f / ((float) i);
        }
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        return (i2 == 0 || i3 == 0 || i2 == options.inScreenDensity) ? f : ((float) i3) / ((float) i2);
    }

    @cr4
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        kne.n();
        return originalDecodeByteArray(bArr, i, i2, options);
    }

    @cr4
    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        FileInputStream fileInputStream;
        Bitmap bitmap = null;
        try {
            fileInputStream = new FileInputStream(str);
            bitmap = hookDecodeStream(fileInputStream, (Rect) null, options);
            fileInputStream.close();
        } catch (Exception unused) {
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return bitmap;
        throw th;
    }

    @cr4
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        byte[] bArr;
        kne.n();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        if (nativeSeek != -1) {
            InputStream fileInputStream = new FileInputStream(fileDescriptor);
            if (!fileInputStream.markSupported()) {
                fileInputStream = new BufferedInputStream(fileInputStream, 20);
            }
            try {
                fileInputStream.mark(20);
                if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
                    bArr = new byte[20];
                }
                try {
                    fileInputStream.read(bArr, 0, 20);
                    fileInputStream.reset();
                } catch (IOException unused) {
                }
                nativeSeek(fileDescriptor, nativeSeek, true);
                Bitmap originalDecodeFileDescriptor = originalDecodeFileDescriptor(fileDescriptor, rect, options);
                try {
                    fileInputStream.close();
                    return originalDecodeFileDescriptor;
                } catch (Throwable unused2) {
                    return originalDecodeFileDescriptor;
                }
            } catch (Throwable unused3) {
            }
        } else {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        throw th;
    }

    @cr4
    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        InputStream openRawResource;
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            openRawResource = resources.openRawResource(i, typedValue);
            bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, (Rect) null, options);
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        if (bitmap != null || options == null || options.inBitmap == null) {
            return bitmap;
        }
        throw new IllegalArgumentException("Problem decoding into existing bitmap");
        throw th;
    }

    @cr4
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    @cr4
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        kne.n();
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        return originalDecodeStream(inputStream, rect, options);
    }

    @cr4
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    @cr4
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    @cr4
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    @cr4
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @cr4
    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @cr4
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @cr4
    private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @cr4
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @cr4
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @cr4
    private static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @cr4
    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    @cr4
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @cr4
    @SuppressLint({"NewApi"})
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    @cr4
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @cr4
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @cr4
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @cr4
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    @cr4
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @cr4
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, (BitmapFactory.Options) null);
    }

    @cr4
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, (BitmapFactory.Options) null);
    }

    @cr4
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, (Rect) null, (BitmapFactory.Options) null);
    }

    @cr4
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, (BitmapFactory.Options) null);
    }

    @cr4
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, (Rect) null, (BitmapFactory.Options) null);
    }
}
