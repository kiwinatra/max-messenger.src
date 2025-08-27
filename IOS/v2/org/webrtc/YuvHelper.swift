package org.webrtc;

import java.nio.ByteBuffer;

public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        ByteBuffer byteBuffer5 = byteBuffer;
        ByteBuffer byteBuffer6 = byteBuffer2;
        ByteBuffer byteBuffer7 = byteBuffer3;
        nativeABGRToI420((ByteBuffer) checkNotNull(byteBuffer, "src"), i, (ByteBuffer) checkNotNull(byteBuffer2, "dstY"), i2, (ByteBuffer) checkNotNull(byteBuffer3, "dstU"), i3, (ByteBuffer) checkNotNull(byteBuffer4, "dstV"), i4, i5, i6);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7, int i8, int i9) {
        ByteBuffer byteBuffer5 = byteBuffer4;
        int i10 = (i5 + 1) / 2;
        int i11 = i6 * i5;
        int i12 = i6 * i7;
        int i13 = (i8 * i10) + i12;
        int i14 = (i8 * i9) + i12;
        int i15 = ((i10 - 1) * i8) + i14 + ((i4 + 1) / 2);
        if (byteBuffer4.capacity() >= i15) {
            byteBuffer5.limit(i11);
            byteBuffer5.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer5.limit(i13);
            byteBuffer5.position(i12);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer5.limit(i15);
            byteBuffer5.position(i14);
            I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i6, slice2, i8, byteBuffer4.slice(), i8, i4, i5);
            return;
        }
        throw new IllegalArgumentException(g63.h("Expected destination buffer capacity to be at least ", i15, byteBuffer4.capacity(), " was "));
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        ByteBuffer byteBuffer5 = byteBuffer4;
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer5, "dst");
        int i7 = i6 % 180;
        int i8 = i7 == 0 ? i4 : i5;
        int i9 = i7 == 0 ? i5 : i4;
        int i10 = (i8 + 1) / 2;
        int i11 = i9 * i8;
        int i12 = ((i9 + 1) / 2) * i10;
        int i13 = (i12 * 2) + i11;
        if (byteBuffer4.capacity() >= i13) {
            byteBuffer5.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer5.position(i11);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer5.position(i12 + i11);
            nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i8, slice2, i10, byteBuffer4.slice(), i10, i4, i5, i6);
            return;
        }
        throw new IllegalArgumentException(g63.h("Expected destination buffer capacity to be at least ", i13, byteBuffer4.capacity(), " was "));
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        ByteBuffer byteBuffer5 = byteBuffer4;
        int i8 = (i4 + 1) / 2;
        int i9 = i6 * i5;
        int i10 = i6 * i7;
        int i11 = (((i5 + 1) / 2) * i8 * 2) + i10;
        if (byteBuffer4.capacity() >= i11) {
            byteBuffer5.limit(i9);
            byteBuffer5.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer5.limit(i11);
            byteBuffer5.position(i10);
            int i12 = i8 * 2;
            I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i6, byteBuffer4.slice(), i12, i4, i5);
            return;
        }
        throw new IllegalArgumentException(g63.h("Expected destination buffer capacity to be at least ", i11, byteBuffer4.capacity(), " was "));
    }

    private static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(tr1.j(str, " should not be null"));
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        nativeCopyPlane((ByteBuffer) checkNotNull(byteBuffer, "src"), i, (ByteBuffer) checkNotNull(byteBuffer2, "dst"), i2, i3, i4);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstUV");
        if (i6 <= 0 || i7 <= 0) {
            throw new IllegalArgumentException("I420ToNV12: width and height should not be negative");
        }
        nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5, (i4 + 1) / 2, (i5 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i6, i7, (i6 + 1) / 2, (i7 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        if (i7 <= 0 || i8 <= 0) {
            throw new IllegalArgumentException("I420Copy: width and height should not be negative");
        }
        nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
    }
}
