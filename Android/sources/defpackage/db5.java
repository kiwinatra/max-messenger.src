package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.UShort;

/* renamed from: db5  reason: default package */
public final class db5 extends FilterOutputStream {
    public static final byte[] x = "Exif\u0000\u0000".getBytes(oa5.d);
    public final sa5 a;
    public final byte[] b = new byte[1];
    public final ByteBuffer c = ByteBuffer.allocate(4);
    public int o = 0;
    public int v;
    public int w;

    public db5(ByteArrayOutputStream byteArrayOutputStream, sa5 sa5) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.a = sa5;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        sa5 sa5;
        int i5;
        byte[] bArr2 = bArr;
        int i6 = 0;
        int i7 = 1;
        int i8 = i;
        int i9 = i2;
        while (true) {
            int i10 = this.v;
            if ((i10 > 0 || this.w > 0 || this.o != 2) && i9 > 0) {
                if (i10 > 0) {
                    int min = Math.min(i9, i10);
                    i9 -= min;
                    this.v -= min;
                    i8 += min;
                }
                int i11 = this.w;
                if (i11 > 0) {
                    int min2 = Math.min(i9, i11);
                    this.out.write(bArr2, i8, min2);
                    i9 -= min2;
                    this.w -= min2;
                    i8 += min2;
                }
                if (i9 != 0) {
                    int i12 = this.o;
                    int i13 = 4;
                    ByteBuffer byteBuffer = this.c;
                    if (i12 != 0) {
                        if (i12 == i7) {
                            int min3 = Math.min(i9, 4 - byteBuffer.position());
                            byteBuffer.put(bArr2, i8, min3);
                            i8 += min3;
                            i9 -= min3;
                            if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                                this.out.write(byteBuffer.array(), i6, 2);
                                byteBuffer.rewind();
                            }
                            if (byteBuffer.position() >= 4) {
                                byteBuffer.rewind();
                                short s = byteBuffer.getShort();
                                if (s == -31) {
                                    this.v = (byteBuffer.getShort() & UShort.MAX_VALUE) - 2;
                                    this.o = 2;
                                } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                                    this.out.write(byteBuffer.array(), i6, 4);
                                    this.w = (byteBuffer.getShort() & UShort.MAX_VALUE) - 2;
                                } else {
                                    this.out.write(byteBuffer.array(), i6, 4);
                                    this.o = 2;
                                }
                                byteBuffer.rewind();
                            } else {
                                return;
                            }
                        }
                        i3 = i6;
                        i4 = i7;
                    } else {
                        int min4 = Math.min(i9, 2 - byteBuffer.position());
                        byteBuffer.put(bArr2, i8, min4);
                        i8 += min4;
                        i9 -= min4;
                        if (byteBuffer.position() >= 2) {
                            byteBuffer.rewind();
                            if (byteBuffer.getShort() == -40) {
                                this.out.write(byteBuffer.array(), i6, 2);
                                this.o = i7;
                                byteBuffer.rewind();
                                pw0 pw0 = new pw0(this.out, ByteOrder.BIG_ENDIAN, i6);
                                pw0.d(-31);
                                int[] iArr = new int[4];
                                int[] iArr2 = new int[4];
                                eb5[] eb5Arr = sa5.c;
                                int i14 = i6;
                                while (true) {
                                    sa5 = this.a;
                                    if (i14 >= i13) {
                                        break;
                                    }
                                    eb5 eb5 = eb5Arr[i14];
                                    int i15 = i6;
                                    while (true) {
                                        eb5[] eb5Arr2 = sa5.c;
                                        if (i15 >= i13) {
                                            break;
                                        }
                                        sa5.a(i15).remove(eb5.b);
                                        i15 += i7;
                                        i13 = 4;
                                    }
                                    i14 += i7;
                                    i13 = 4;
                                }
                                boolean isEmpty = sa5.a(i7).isEmpty();
                                ByteOrder byteOrder = sa5.b;
                                if (!isEmpty) {
                                    sa5.a(i6).put(sa5.c[i7].b, oa5.a(0, byteOrder));
                                }
                                if (!sa5.a(2).isEmpty()) {
                                    sa5.a(i6).put(sa5.c[2].b, oa5.a(0, byteOrder));
                                }
                                if (!sa5.a(3).isEmpty()) {
                                    sa5.a(i7).put(sa5.c[3].b, oa5.a(0, byteOrder));
                                }
                                int i16 = i6;
                                while (true) {
                                    eb5[] eb5Arr3 = sa5.c;
                                    if (i16 >= 4) {
                                        break;
                                    }
                                    int i17 = i6;
                                    for (Map.Entry value : sa5.a(i16).entrySet()) {
                                        oa5 oa5 = (oa5) value.getValue();
                                        int i18 = oa5.f[oa5.a] * oa5.b;
                                        if (i18 > 4) {
                                            i17 += i18;
                                        }
                                    }
                                    iArr2[i16] = iArr2[i16] + i17;
                                    i16 += i7;
                                    i6 = 0;
                                }
                                int i19 = 0;
                                int i20 = 8;
                                while (true) {
                                    eb5[] eb5Arr4 = sa5.c;
                                    if (i19 >= 4) {
                                        break;
                                    }
                                    if (!sa5.a(i19).isEmpty()) {
                                        iArr[i19] = i20;
                                        i20 += (sa5.a(i19).size() * 12) + 6 + iArr2[i19];
                                    }
                                    i19 += i7;
                                }
                                int i21 = i20 + 8;
                                if (!sa5.a(i7).isEmpty()) {
                                    sa5.a(0).put(sa5.c[i7].b, oa5.a((long) iArr[i7], byteOrder));
                                }
                                if (!sa5.a(2).isEmpty()) {
                                    i5 = i21;
                                    sa5.a(0).put(sa5.c[2].b, oa5.a((long) iArr[2], byteOrder));
                                } else {
                                    i5 = i21;
                                }
                                if (!sa5.a(3).isEmpty()) {
                                    sa5.a(i7).put(sa5.c[3].b, oa5.a((long) iArr[3], byteOrder));
                                }
                                pw0.d((short) i5);
                                pw0.write(x);
                                pw0.d(byteOrder == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
                                pw0.c = byteOrder;
                                pw0.d((short) 42);
                                pw0.b((int) 8);
                                int i22 = 0;
                                while (true) {
                                    eb5[] eb5Arr5 = sa5.c;
                                    if (i22 >= 4) {
                                        break;
                                    }
                                    if (!sa5.a(i22).isEmpty()) {
                                        pw0.d((short) sa5.a(i22).size());
                                        int size = (sa5.a(i22).size() * 12) + iArr[i22] + 2 + 4;
                                        for (Map.Entry entry : sa5.a(i22).entrySet()) {
                                            eb5 eb52 = (eb5) ((HashMap) ra5.f.get(i22)).get(entry.getKey());
                                            bs0.q(eb52, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                                            oa5 oa52 = (oa5) entry.getValue();
                                            int i23 = oa5.f[oa52.a];
                                            int i24 = oa52.b;
                                            int i25 = i23 * i24;
                                            pw0.d((short) eb52.a);
                                            pw0.d((short) oa52.a);
                                            pw0.b(i24);
                                            if (i25 > 4) {
                                                pw0.b((int) ((long) size));
                                                size += i25;
                                            } else {
                                                pw0.write(oa52.c);
                                                if (i25 < 4) {
                                                    for (int i26 = 4; i25 < i26; i26 = 4) {
                                                        pw0.b.write(0);
                                                        i25++;
                                                    }
                                                }
                                            }
                                        }
                                        pw0.b((int) 0);
                                        for (Map.Entry value2 : sa5.a(i22).entrySet()) {
                                            byte[] bArr3 = ((oa5) value2.getValue()).c;
                                            if (bArr3.length > 4) {
                                                pw0.write(bArr3, 0, bArr3.length);
                                            }
                                        }
                                    }
                                    i22++;
                                    i7 = 1;
                                }
                                i4 = i7;
                                i3 = 0;
                                pw0.c = ByteOrder.BIG_ENDIAN;
                            } else {
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                        } else {
                            return;
                        }
                    }
                    i7 = i4;
                    i6 = i3;
                } else {
                    return;
                }
            }
        }
        if (i9 > 0) {
            this.out.write(bArr2, i8, i9);
        }
    }

    public final void write(int i) {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        write(bArr);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
