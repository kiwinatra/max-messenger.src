package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* renamed from: j97  reason: default package */
public final class j97 {
    public static final byte[] b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    public final xv1 a;

    public j97(InputStream inputStream) {
        this.a = new xv1(24, (Object) inputStream);
    }

    public final int a() {
        InputStream inputStream;
        int i;
        short s;
        int i2;
        int i3;
        int i4;
        short read;
        xv1 xv1 = this.a;
        InputStream inputStream2 = (InputStream) xv1.b;
        int read2 = (inputStream2.read() & KotlinVersion.MAX_COMPONENT_VALUE) | ((inputStream2.read() << 8) & 65280);
        if ((read2 & 65496) != 65496 && read2 != 19789 && read2 != 18761) {
            return -1;
        }
        while (true) {
            inputStream = (InputStream) xv1.b;
            if (((short) (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE)) == 255 && (read = (short) (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE)) != 218 && read != 217) {
                i = (((inputStream.read() << 8) & 65280) | (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE)) - 2;
                if (read == 225) {
                    break;
                }
                long j = (long) i;
                long j2 = 0;
                if (j >= 0) {
                    long j3 = j;
                    while (j3 > 0) {
                        long skip = inputStream.skip(j3);
                        if (skip <= 0) {
                            if (inputStream.read() == -1) {
                                break;
                            }
                            skip = 1;
                        }
                        j3 -= skip;
                    }
                    j2 = j - j3;
                }
                if (j2 != j) {
                    break;
                }
            }
        }
        i = -1;
        if (i == -1) {
            return -1;
        }
        byte[] bArr = new byte[i];
        int i5 = i;
        while (i5 > 0) {
            int read3 = inputStream.read(bArr, i - i5, i5);
            if (read3 == -1) {
                break;
            }
            i5 -= read3;
        }
        if (i - i5 != i) {
            return -1;
        }
        byte[] bArr2 = b;
        boolean z = i > bArr2.length;
        if (z) {
            int i6 = 0;
            while (true) {
                if (i6 >= bArr2.length) {
                    break;
                } else if (bArr[i6] != bArr2[i6]) {
                    z = false;
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (!z) {
            return -1;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ByteBuffer byteBuffer = (ByteBuffer) wrap.order(byteOrder).limit(i);
        short s2 = byteBuffer.getShort(6);
        if (s2 != 19789 && s2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBuffer.order(byteOrder);
        int i7 = byteBuffer.getInt(10);
        short s3 = byteBuffer.getShort(i7 + 6);
        for (int i8 = 0; i8 < s3; i8++) {
            int i9 = (i8 * 12) + i7 + 8;
            if (byteBuffer.getShort(i9) == 274 && (s = byteBuffer.getShort(i9 + 2)) >= 1 && s <= 12 && (i2 = byteBuffer.getInt(i9 + 4)) >= 0 && (i3 = i2 + c[s]) <= 4 && (i4 = i9 + 8) >= 0 && i4 <= byteBuffer.remaining() && i3 >= 0 && i3 + i4 <= byteBuffer.remaining()) {
                return byteBuffer.getShort(i4);
            }
        }
        return -1;
    }
}
