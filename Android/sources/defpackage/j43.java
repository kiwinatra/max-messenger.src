package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import kotlin.uuid.Uuid;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: j43  reason: default package */
public final class j43 {
    public final ByteBuffer a;

    public j43(byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        this.a = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int a(int i) {
        return m(i) + 1;
    }

    public static int b(int i, byte[] bArr) {
        return j(bArr.length) + bArr.length + m(i);
    }

    public static int c(int i) {
        return m(i) + 8;
    }

    public static int d(int i, int i2, Object obj) {
        switch (i2) {
            case 1:
                Double d = (Double) obj;
                return c(i);
            case 2:
                Float f = (Float) obj;
                return e(i);
            case 3:
                return h(i, ((Long) obj).longValue());
            case 4:
                long longValue = ((Long) obj).longValue();
                return k(longValue) + m(i);
            case 5:
                return f(i, ((Integer) obj).intValue());
            case 6:
                Long l = (Long) obj;
                return m(i) + 8;
            case 7:
                Integer num = (Integer) obj;
                return m(i) + 4;
            case 8:
                Boolean bool = (Boolean) obj;
                return a(i);
            case 9:
                return l(i, (String) obj);
            case 10:
                return ((ad9) obj).getSerializedSize() + (m(i) * 2);
            case 11:
                return i(i, (ad9) obj);
            case 12:
                return b(i, (byte[]) obj);
            case 13:
                return n(i, ((Integer) obj).intValue());
            case Protos.Attaches.Attach.LOCATION /*14*/:
                int intValue = ((Integer) obj).intValue();
                return j(intValue) + m(i);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Integer num2 = (Integer) obj;
                return m(i) + 4;
            case 16:
                Long l2 = (Long) obj;
                return m(i) + 8;
            case LangUtils.HASH_SEED /*17*/:
                int intValue2 = ((Integer) obj).intValue();
                return j((intValue2 >> 31) ^ (intValue2 << 1)) + m(i);
            case 18:
                long longValue2 = ((Long) obj).longValue();
                return k((longValue2 >> 63) ^ (longValue2 << 1)) + m(i);
            default:
                throw new IllegalArgumentException(wj6.h(i2, "Unknown type: "));
        }
    }

    public static int e(int i) {
        return m(i) + 4;
    }

    public static int f(int i, int i2) {
        return g(i2) + m(i);
    }

    public static int g(int i) {
        if (i >= 0) {
            return j(i);
        }
        return 10;
    }

    public static int h(int i, long j) {
        return k(j) + m(i);
    }

    public static int i(int i, ad9 ad9) {
        int m = m(i);
        int serializedSize = ad9.getSerializedSize();
        return j(serializedSize) + serializedSize + m;
    }

    public static int j(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int k(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int l(int i, String str) {
        int m = m(i);
        int q = q(str);
        return j(q) + q + m;
    }

    public static int m(int i) {
        return j(i << 3);
    }

    public static int n(int i, int i2) {
        return j(i2) + m(i);
    }

    public static int o(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        char charAt;
        int length = charSequence.length();
        int i4 = i2 + i;
        int i5 = 0;
        while (i5 < length && (i3 = i5 + i) < i4 && (charAt = charSequence.charAt(i5)) < 128) {
            bArr[i3] = (byte) charAt;
            i5++;
        }
        if (i5 == length) {
            return i + length;
        }
        int i6 = i + i5;
        while (i5 < length) {
            char charAt2 = charSequence.charAt(i5);
            if (charAt2 < 128 && i6 < i4) {
                bArr[i6] = (byte) charAt2;
                i6++;
            } else if (charAt2 < 2048 && i6 <= i4 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> 6) | 960);
                i6 += 2;
                bArr[i7] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i6 <= i4 - 3) {
                bArr[i6] = (byte) ((charAt2 >>> 12) | 480);
                int i8 = i6 + 2;
                bArr[i6 + 1] = (byte) (((charAt2 >>> 6) & 63) | Uuid.SIZE_BITS);
                i6 += 3;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
            } else if (i6 <= i4 - 4) {
                int i9 = i5 + 1;
                if (i9 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i9);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                        bArr[i6 + 1] = (byte) (((codePoint >>> 12) & 63) | Uuid.SIZE_BITS);
                        int i10 = i6 + 3;
                        bArr[i6 + 2] = (byte) (((codePoint >>> 6) & 63) | Uuid.SIZE_BITS);
                        i6 += 4;
                        bArr[i10] = (byte) ((codePoint & 63) | Uuid.SIZE_BITS);
                        i5 = i9;
                    } else {
                        i5 = i9;
                    }
                }
                StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                sb.append(i5 - 1);
                throw new IllegalArgumentException(sb.toString());
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i6);
            }
            i5++;
        }
        return i6;
    }

    public static void p(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(o(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt < 128) {
                    byteBuffer.put((byte) charAt);
                } else if (charAt < 2048) {
                    byteBuffer.put((byte) ((charAt >>> 6) | 960));
                    byteBuffer.put((byte) ((charAt & '?') | 128));
                } else if (charAt < 55296 || 57343 < charAt) {
                    byteBuffer.put((byte) ((charAt >>> 12) | 480));
                    byteBuffer.put((byte) (((charAt >>> 6) & 63) | Uuid.SIZE_BITS));
                    byteBuffer.put((byte) ((charAt & '?') | 128));
                } else {
                    int i2 = i + 1;
                    if (i2 != charSequence.length()) {
                        char charAt2 = charSequence.charAt(i2);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            int codePoint = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | Uuid.SIZE_BITS));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | Uuid.SIZE_BITS));
                            byteBuffer.put((byte) ((codePoint & 63) | Uuid.SIZE_BITS));
                            i = i2;
                        } else {
                            i = i2;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                    sb.append(i - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
                i++;
            }
        }
    }

    public static int q(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new IllegalArgumentException(wj6.h(i2, "Unpaired surrogate at index "));
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public final void A(int i) {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.putInt(i);
            return;
        }
        throw new CodedOutputByteBufferNano$OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
    }

    public final void B(long j) {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() >= 8) {
            byteBuffer.putLong(j);
            return;
        }
        throw new CodedOutputByteBufferNano$OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
    }

    public final void C(int i) {
        while ((i & -128) != 0) {
            z((i & 127) | Uuid.SIZE_BITS);
            i >>>= 7;
        }
        z(i);
    }

    public final void D(long j) {
        while ((-128 & j) != 0) {
            z((((int) j) & 127) | Uuid.SIZE_BITS);
            j >>>= 7;
        }
        z((int) j);
    }

    public final void E(int i, String str) {
        F(i, 2);
        ByteBuffer byteBuffer = this.a;
        try {
            int j = j(str.length());
            if (j == j(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= j) {
                    byteBuffer.position(position + j);
                    p(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    C((position2 - position) - j);
                    byteBuffer.position(position2);
                    return;
                }
                throw new CodedOutputByteBufferNano$OutOfSpaceException(position + j, byteBuffer.limit());
            }
            C(q(str));
            p(str, byteBuffer);
        } catch (BufferOverflowException e) {
            CodedOutputByteBufferNano$OutOfSpaceException codedOutputByteBufferNano$OutOfSpaceException = new CodedOutputByteBufferNano$OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
            codedOutputByteBufferNano$OutOfSpaceException.initCause(e);
            throw codedOutputByteBufferNano$OutOfSpaceException;
        }
    }

    public final void F(int i, int i2) {
        C((i << 3) | i2);
    }

    public final void G(int i, int i2) {
        F(i, 0);
        C(i2);
    }

    public final void r(int i, boolean z) {
        F(i, 0);
        z(z ? 1 : 0);
    }

    public final void s(int i, byte[] bArr) {
        F(i, 2);
        C(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new CodedOutputByteBufferNano$OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
    }

    public final void t(double d, int i) {
        F(i, 1);
        B(Double.doubleToLongBits(d));
    }

    public final void u(int i, int i2, Object obj) {
        switch (i2) {
            case 1:
                t(((Double) obj).doubleValue(), i);
                return;
            case 2:
                v(((Float) obj).floatValue(), i);
                return;
            case 3:
                x(i, ((Long) obj).longValue());
                return;
            case 4:
                long longValue = ((Long) obj).longValue();
                F(i, 0);
                D(longValue);
                return;
            case 5:
                w(i, ((Integer) obj).intValue());
                return;
            case 6:
                long longValue2 = ((Long) obj).longValue();
                F(i, 1);
                B(longValue2);
                return;
            case 7:
                int intValue = ((Integer) obj).intValue();
                F(i, 5);
                A(intValue);
                return;
            case 8:
                r(i, ((Boolean) obj).booleanValue());
                return;
            case 9:
                E(i, (String) obj);
                return;
            case 10:
                F(i, 3);
                ((ad9) obj).writeTo(this);
                F(i, 4);
                return;
            case 11:
                y(i, (ad9) obj);
                return;
            case 12:
                s(i, (byte[]) obj);
                return;
            case 13:
                G(i, ((Integer) obj).intValue());
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                int intValue2 = ((Integer) obj).intValue();
                F(i, 0);
                C(intValue2);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                int intValue3 = ((Integer) obj).intValue();
                F(i, 5);
                A(intValue3);
                return;
            case 16:
                long longValue3 = ((Long) obj).longValue();
                F(i, 1);
                B(longValue3);
                return;
            case LangUtils.HASH_SEED /*17*/:
                int intValue4 = ((Integer) obj).intValue();
                F(i, 0);
                C((intValue4 << 1) ^ (intValue4 >> 31));
                return;
            case 18:
                long longValue4 = ((Long) obj).longValue();
                F(i, 0);
                D((longValue4 >> 63) ^ (longValue4 << 1));
                return;
            default:
                throw new IOException(wj6.h(i2, "Unknown type: "));
        }
    }

    public final void v(float f, int i) {
        F(i, 5);
        A(Float.floatToIntBits(f));
    }

    public final void w(int i, int i2) {
        F(i, 0);
        if (i2 >= 0) {
            C(i2);
        } else {
            D((long) i2);
        }
    }

    public final void x(int i, long j) {
        F(i, 0);
        D(j);
    }

    public final void y(int i, ad9 ad9) {
        F(i, 2);
        C(ad9.getCachedSize());
        ad9.writeTo(this);
    }

    public final void z(int i) {
        byte b = (byte) i;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b);
            return;
        }
        throw new CodedOutputByteBufferNano$OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
    }
}
