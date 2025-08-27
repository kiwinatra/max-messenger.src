package defpackage;

import java.io.Closeable;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.IntCompanionObject;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.msgpack.core.MessageInsufficientBufferException;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessagePackException;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import ru.ok.tamtam.nano.Protos;

/* renamed from: pf9  reason: default package */
public final class pf9 implements Closeable {
    public static final MessageBuffer x0 = MessageBuffer.wrap(new byte[0]);
    public final MessageBuffer X = MessageBuffer.allocate(8);
    public int Y;
    public StringBuilder Z;
    public final boolean a;
    public final boolean b;
    public final CodingErrorAction c;
    public final CodingErrorAction o;
    public final int v;
    public CharsetDecoder v0;
    public final int w;
    public CharBuffer w0;
    public final MessageBufferInput x;
    public MessageBuffer y = x0;
    public int z;

    public pf9(ArrayBufferInput arrayBufferInput, ed9 ed9) {
        this.x = arrayBufferInput;
        this.a = ed9.a;
        this.b = ed9.b;
        this.c = ed9.c;
        this.o = ed9.o;
        this.v = ed9.v;
        this.w = ed9.x;
    }

    public static MessageIntegerOverflowException V(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(((long) (i & IntCompanionObject.MAX_VALUE)) + 2147483648L));
    }

    public static MessageIntegerOverflowException e0(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.RuntimeException, org.msgpack.core.MessagePackException] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.RuntimeException, org.msgpack.core.MessagePackException] */
    public static MessagePackException s0(String str, byte b2) {
        hb9 hb9 = hb9.U0[b2 & UByte.MAX_VALUE];
        if (hb9 == hb9.NEVER_USED) {
            return new RuntimeException(wj6.k("Expected ", str, ", but encountered 0xC1 \"NEVER_USED\" byte"));
        }
        String p = wzf.p(hb9.a());
        return new RuntimeException(String.format("Expected %s, but got %s (%02x)", new Object[]{str, p.substring(0, 1) + p.substring(1).toLowerCase(), Byte.valueOf(b2)}));
    }

    public final void A() {
        int i;
        int m0;
        int i2 = 1;
        while (i2 > 0) {
            byte readByte = readByte();
            switch (hb9.U0[readByte & UByte.MAX_VALUE].ordinal()) {
                case 1:
                    i = readByte & 15;
                    break;
                case 2:
                    i2 += readByte & 15;
                    continue;
                case 3:
                    r0(readByte & 31);
                    continue;
                case 5:
                    throw new RuntimeException("Encountered 0xC1 \"NEVER_USED\" byte");
                case 7:
                case 28:
                    r0(readByte() & UByte.MAX_VALUE);
                    continue;
                case 8:
                case 29:
                    r0(m0());
                    continue;
                case 9:
                case 30:
                    r0(p0());
                    continue;
                case 10:
                    r0((readByte() & UByte.MAX_VALUE) + 1);
                    continue;
                case 11:
                    r0(m0() + 1);
                    continue;
                case 12:
                    r0(p0() + 1);
                    continue;
                case 13:
                case LangUtils.HASH_SEED:
                case 21:
                    r0(4);
                    continue;
                case Protos.Attaches.Attach.LOCATION /*14*/:
                case 18:
                case 22:
                    r0(8);
                    continue;
                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                case 19:
                    r0(1);
                    continue;
                case 16:
                case 20:
                    r0(2);
                    continue;
                case 23:
                    r0(2);
                    continue;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                    r0(3);
                    continue;
                case 25:
                    r0(5);
                    continue;
                case 26:
                    r0(9);
                    continue;
                case 27:
                    r0(17);
                    continue;
                case 31:
                    m0 = m0();
                    break;
                case 32:
                    m0 = p0();
                    break;
                case 33:
                    i = m0();
                    break;
                case 34:
                    i = p0();
                    break;
            }
            m0 = i * 2;
            i2 += m0;
            i2--;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r4.throwException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0134, code lost:
        throw new java.lang.RuntimeException("Unexpected UTF-8 multibyte sequence");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0() {
        /*
            r8 = this;
            java.lang.String r0 = "Unexpected UTF-8 multibyte sequence"
            int r1 = r8.z0()
            if (r1 != 0) goto L_0x000b
            java.lang.String r8 = ""
            return r8
        L_0x000b:
            int r2 = r8.v
            if (r1 > r2) goto L_0x015b
            java.nio.charset.CharsetDecoder r2 = r8.v0
            if (r2 != 0) goto L_0x0030
            int r2 = r8.w
            java.nio.CharBuffer r2 = java.nio.CharBuffer.allocate(r2)
            r8.w0 = r2
            java.nio.charset.Charset r2 = defpackage.fd9.a
            java.nio.charset.CharsetDecoder r2 = r2.newDecoder()
            java.nio.charset.CodingErrorAction r3 = r8.c
            java.nio.charset.CharsetDecoder r2 = r2.onMalformedInput(r3)
            java.nio.charset.CodingErrorAction r3 = r8.o
            java.nio.charset.CharsetDecoder r2 = r2.onUnmappableCharacter(r3)
            r8.v0 = r2
            goto L_0x0033
        L_0x0030:
            r2.reset()
        L_0x0033:
            java.lang.StringBuilder r2 = r8.Z
            r3 = 0
            if (r2 != 0) goto L_0x0040
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r8.Z = r2
            goto L_0x0043
        L_0x0040:
            r2.setLength(r3)
        L_0x0043:
            org.msgpack.core.buffer.MessageBuffer r2 = r8.y
            int r2 = r2.size()
            int r4 = r8.z
            int r2 = r2 - r4
            if (r2 < r1) goto L_0x0053
            java.lang.String r8 = r8.a(r1)
            return r8
        L_0x0053:
            if (r1 <= 0) goto L_0x014e
            org.msgpack.core.buffer.MessageBuffer r2 = r8.y     // Catch:{ CharacterCodingException -> 0x006b }
            int r2 = r2.size()     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r8.z     // Catch:{ CharacterCodingException -> 0x006b }
            int r2 = r2 - r4
            if (r2 < r1) goto L_0x006e
            java.lang.StringBuilder r0 = r8.Z     // Catch:{ CharacterCodingException -> 0x006b }
            java.lang.String r1 = r8.a(r1)     // Catch:{ CharacterCodingException -> 0x006b }
            r0.append(r1)     // Catch:{ CharacterCodingException -> 0x006b }
            goto L_0x014e
        L_0x006b:
            r8 = move-exception
            goto L_0x0155
        L_0x006e:
            if (r2 != 0) goto L_0x0074
            r8.U()     // Catch:{ CharacterCodingException -> 0x006b }
            goto L_0x0053
        L_0x0074:
            org.msgpack.core.buffer.MessageBuffer r5 = r8.y     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.ByteBuffer r4 = r5.sliceAsByteBuffer(r4, r2)     // Catch:{ CharacterCodingException -> 0x006b }
            int r5 = r4.position()     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r6 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            r6.clear()     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.charset.CharsetDecoder r6 = r8.v0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r7 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.charset.CoderResult r6 = r6.decode(r4, r7, r3)     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r4.position()     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r4 - r5
            int r5 = r8.z     // Catch:{ CharacterCodingException -> 0x006b }
            int r5 = r5 + r4
            r8.z = r5     // Catch:{ CharacterCodingException -> 0x006b }
            int r1 = r1 - r4
            java.lang.StringBuilder r5 = r8.Z     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r7 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.Buffer r7 = r7.flip()     // Catch:{ CharacterCodingException -> 0x006b }
            r5.append(r7)     // Catch:{ CharacterCodingException -> 0x006b }
            boolean r5 = r6.isError()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 == 0) goto L_0x00aa
            r8.o(r6)     // Catch:{ CharacterCodingException -> 0x006b }
        L_0x00aa:
            boolean r5 = r6.isUnderflow()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 == 0) goto L_0x0053
            if (r4 >= r2) goto L_0x0053
            org.msgpack.core.buffer.MessageBuffer r2 = r8.y     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r8.z     // Catch:{ CharacterCodingException -> 0x006b }
            byte r2 = r2.getByte(r4)     // Catch:{ CharacterCodingException -> 0x006b }
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = ~r2     // Catch:{ CharacterCodingException -> 0x006b }
            int r2 = r2 << 24
            int r2 = java.lang.Integer.numberOfLeadingZeros(r2)     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)     // Catch:{ CharacterCodingException -> 0x006b }
            org.msgpack.core.buffer.MessageBuffer r4 = r8.y     // Catch:{ CharacterCodingException -> 0x006b }
            int r5 = r8.z     // Catch:{ CharacterCodingException -> 0x006b }
            int r6 = r4.size()     // Catch:{ CharacterCodingException -> 0x006b }
            int r7 = r8.z     // Catch:{ CharacterCodingException -> 0x006b }
            int r6 = r6 - r7
            r4.getBytes(r5, r6, r2)     // Catch:{ CharacterCodingException -> 0x006b }
        L_0x00d5:
            r8.U()     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r2.remaining()     // Catch:{ CharacterCodingException -> 0x006b }
            org.msgpack.core.buffer.MessageBuffer r5 = r8.y     // Catch:{ CharacterCodingException -> 0x006b }
            int r5 = r5.size()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 < r4) goto L_0x013c
            org.msgpack.core.buffer.MessageBuffer r5 = r8.y     // Catch:{ CharacterCodingException -> 0x006b }
            r5.getBytes(r3, r4, r2)     // Catch:{ CharacterCodingException -> 0x006b }
            r8.z = r4     // Catch:{ CharacterCodingException -> 0x006b }
            r2.position(r3)     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r4 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            r4.clear()     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.charset.CharsetDecoder r4 = r8.v0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r5 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.charset.CoderResult r4 = r4.decode(r2, r5, r3)     // Catch:{ CharacterCodingException -> 0x006b }
            boolean r5 = r4.isError()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 == 0) goto L_0x0104
            r8.o(r4)     // Catch:{ CharacterCodingException -> 0x006b }
        L_0x0104:
            boolean r5 = r4.isOverflow()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 != 0) goto L_0x012c
            boolean r5 = r4.isUnderflow()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 == 0) goto L_0x011a
            int r5 = r2.position()     // Catch:{ CharacterCodingException -> 0x006b }
            int r6 = r2.limit()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 < r6) goto L_0x012c
        L_0x011a:
            int r2 = r2.limit()     // Catch:{ CharacterCodingException -> 0x006b }
            int r1 = r1 - r2
            java.lang.StringBuilder r2 = r8.Z     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r4 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.Buffer r4 = r4.flip()     // Catch:{ CharacterCodingException -> 0x006b }
            r2.append(r4)     // Catch:{ CharacterCodingException -> 0x006b }
            goto L_0x0053
        L_0x012c:
            r4.throwException()     // Catch:{ Exception -> 0x0135 }
            org.msgpack.core.MessageFormatException r8 = new org.msgpack.core.MessageFormatException     // Catch:{ Exception -> 0x0135 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0135 }
            throw r8     // Catch:{ Exception -> 0x0135 }
        L_0x0135:
            r8 = move-exception
            org.msgpack.core.MessageFormatException r1 = new org.msgpack.core.MessageFormatException     // Catch:{ CharacterCodingException -> 0x006b }
            r1.<init>(r0, r8)     // Catch:{ CharacterCodingException -> 0x006b }
            throw r1     // Catch:{ CharacterCodingException -> 0x006b }
        L_0x013c:
            org.msgpack.core.buffer.MessageBuffer r4 = r8.y     // Catch:{ CharacterCodingException -> 0x006b }
            int r5 = r4.size()     // Catch:{ CharacterCodingException -> 0x006b }
            r4.getBytes(r3, r5, r2)     // Catch:{ CharacterCodingException -> 0x006b }
            org.msgpack.core.buffer.MessageBuffer r4 = r8.y     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r4.size()     // Catch:{ CharacterCodingException -> 0x006b }
            r8.z = r4     // Catch:{ CharacterCodingException -> 0x006b }
            goto L_0x00d5
        L_0x014e:
            java.lang.StringBuilder r8 = r8.Z     // Catch:{ CharacterCodingException -> 0x006b }
            java.lang.String r8 = r8.toString()     // Catch:{ CharacterCodingException -> 0x006b }
            return r8
        L_0x0155:
            org.msgpack.core.MessageStringCodingException r0 = new org.msgpack.core.MessageStringCodingException
            r0.<init>(r8)
            throw r0
        L_0x015b:
            org.msgpack.core.MessageSizeException r8 = new org.msgpack.core.MessageSizeException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "cannot unpack a String of size larger than %,d: %,d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf9.A0():java.lang.String");
    }

    public final q1 B0() {
        BigInteger bigInteger;
        double d;
        de5 de5;
        de5 de52;
        hb9 n = n();
        int i = 0;
        switch (tr1.y(n.a())) {
            case 0:
                readByte();
                return ac7.a;
            case 1:
                return v0() ? hb7.b : hb7.c;
            case 2:
                if (n != hb9.UINT64) {
                    return new ub7(x0());
                }
                byte readByte = readByte();
                if (o54.z(readByte)) {
                    bigInteger = BigInteger.valueOf((long) readByte);
                } else {
                    switch (readByte) {
                        case -52:
                            bigInteger = BigInteger.valueOf((long) (readByte() & UByte.MAX_VALUE));
                            break;
                        case -51:
                            bigInteger = BigInteger.valueOf((long) (readShort() & UShort.MAX_VALUE));
                            break;
                        case -50:
                            int readInt = readInt();
                            if (readInt >= 0) {
                                bigInteger = BigInteger.valueOf((long) readInt);
                                break;
                            } else {
                                bigInteger = BigInteger.valueOf(((long) (readInt & IntCompanionObject.MAX_VALUE)) + 2147483648L);
                                break;
                            }
                        case -49:
                            long readLong = readLong();
                            if (readLong >= 0) {
                                bigInteger = BigInteger.valueOf(readLong);
                                break;
                            } else {
                                bigInteger = BigInteger.valueOf(readLong - Long.MIN_VALUE).setBit(63);
                                break;
                            }
                        case -48:
                            bigInteger = BigInteger.valueOf((long) readByte());
                            break;
                        case -47:
                            bigInteger = BigInteger.valueOf((long) readShort());
                            break;
                        case -46:
                            bigInteger = BigInteger.valueOf((long) readInt());
                            break;
                        case -45:
                            bigInteger = BigInteger.valueOf(readLong());
                            break;
                        default:
                            throw s0("Integer", readByte);
                    }
                }
                return new eb7(bigInteger);
            case 3:
                byte readByte2 = readByte();
                if (readByte2 == -54) {
                    d = (double) k0(4).getFloat(this.Y);
                } else if (readByte2 == -53) {
                    d = k0(8).getDouble(this.Y);
                } else {
                    throw s0("Float", readByte2);
                }
                return new lb7(d);
            case 4:
                return new p1(q0(z0()));
            case 5:
                return new p1(q0(u0()));
            case 6:
                int t0 = t0();
                c1g[] c1gArr = new c1g[t0];
                while (i < t0) {
                    c1gArr[i] = B0();
                    i++;
                }
                return t0 == 0 ? bb7.b : new bb7(c1gArr);
            case 7:
                int y0 = y0() * 2;
                c1g[] c1gArr2 = new c1g[y0];
                while (i < y0) {
                    c1gArr2[i] = B0();
                    c1gArr2[i + 1] = B0();
                    i += 2;
                }
                return y0 == 0 ? zb7.b : new zb7(c1gArr2);
            case 8:
                byte readByte3 = readByte();
                switch (readByte3) {
                    case -57:
                        MessageBuffer k0 = k0(2);
                        de5 = new de5(k0.getByte(this.Y + 1), k0.getByte(this.Y) & UByte.MAX_VALUE);
                        break;
                    case -56:
                        MessageBuffer k02 = k0(3);
                        de52 = new de5(k02.getByte(this.Y + 2), k02.getShort(this.Y) & UShort.MAX_VALUE);
                        break;
                    case -55:
                        MessageBuffer k03 = k0(5);
                        int i2 = k03.getInt(this.Y);
                        if (i2 >= 0) {
                            de52 = new de5(k03.getByte(this.Y + 4), i2);
                            break;
                        } else {
                            throw new MessagePackException();
                        }
                    default:
                        switch (readByte3) {
                            case -44:
                                de52 = new de5(readByte(), 1);
                                break;
                            case -43:
                                de5 = new de5(readByte(), 2);
                                break;
                            case -42:
                                de5 = new de5(readByte(), 4);
                                break;
                            case -41:
                                de5 = new de5(readByte(), 8);
                                break;
                            case -40:
                                de5 = new de5(readByte(), 16);
                                break;
                            default:
                                throw s0("Ext", readByte3);
                        }
                }
                de5 = de52;
                return new nb7(de5.a, q0(de5.b));
            default:
                throw new RuntimeException("Unknown value type");
        }
    }

    public final void U() {
        MessageBuffer next = this.x.next();
        if (next != null) {
            this.y.size();
            this.y = next;
            this.z = 0;
            return;
        }
        throw new MessageInsufficientBufferException();
    }

    public final String a(int i) {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        if (this.c == codingErrorAction && this.o == codingErrorAction && this.y.hasArray()) {
            String str = new String(this.y.array(), this.y.arrayOffset() + this.z, i, fd9.a);
            this.z += i;
            return str;
        }
        try {
            CharBuffer decode = this.v0.decode(this.y.sliceAsByteBuffer(this.z, i));
            this.z += i;
            return decode.toString();
        } catch (CharacterCodingException e) {
            throw new RuntimeException(e);
        }
    }

    public final void close() {
        this.y = x0;
        this.z = 0;
        this.x.close();
    }

    public final MessageBuffer k0(int i) {
        int size = this.y.size();
        int i2 = this.z;
        int i3 = size - i2;
        if (i3 >= i) {
            this.Y = i2;
            this.z = i2 + i;
            return this.y;
        }
        MessageBuffer messageBuffer = this.X;
        if (i3 > 0) {
            messageBuffer.putMessageBuffer(0, this.y, i2, i3);
            i -= i3;
        } else {
            i3 = 0;
        }
        while (true) {
            U();
            int size2 = this.y.size();
            if (size2 >= i) {
                messageBuffer.putMessageBuffer(i3, this.y, 0, i);
                this.z = i;
                this.Y = 0;
                return messageBuffer;
            }
            messageBuffer.putMessageBuffer(i3, this.y, 0, size2);
            i -= size2;
            i3 += size2;
        }
    }

    public final boolean m() {
        while (this.y.size() <= this.z) {
            MessageBuffer next = this.x.next();
            if (next == null) {
                return false;
            }
            this.y.size();
            this.y = next;
            this.z = 0;
        }
        return true;
    }

    public final int m0() {
        return readShort() & UShort.MAX_VALUE;
    }

    public final hb9 n() {
        if (m()) {
            return hb9.U0[this.y.getByte(this.z) & UByte.MAX_VALUE];
        }
        throw new MessageInsufficientBufferException();
    }

    public final void o(CoderResult coderResult) {
        if ((coderResult.isMalformed() && this.c == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.o == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    public final int p0() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new MessagePackException();
    }

    public final byte[] q0(int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int size = this.y.size();
            int i3 = this.z;
            int i4 = size - i3;
            if (i4 >= i) {
                this.y.getBytes(i3, bArr, i2, i);
                this.z += i;
                return bArr;
            }
            this.y.getBytes(i3, bArr, i2, i4);
            i2 += i4;
            i -= i4;
            this.z += i4;
            U();
        }
    }

    public final void r0(int i) {
        while (true) {
            int size = this.y.size();
            int i2 = this.z;
            int i3 = size - i2;
            if (i3 >= i) {
                this.z = i2 + i;
                return;
            }
            this.z = i2 + i3;
            i -= i3;
            U();
        }
    }

    public final byte readByte() {
        int size = this.y.size();
        int i = this.z;
        if (size > i) {
            byte b2 = this.y.getByte(i);
            this.z++;
            return b2;
        }
        U();
        if (this.y.size() <= 0) {
            return readByte();
        }
        byte b3 = this.y.getByte(0);
        this.z = 1;
        return b3;
    }

    public final int readInt() {
        return k0(4).getInt(this.Y);
    }

    public final long readLong() {
        return k0(8).getLong(this.Y);
    }

    public final short readShort() {
        return k0(2).getShort(this.Y);
    }

    public final int t0() {
        byte readByte = readByte();
        if ((readByte & -16) == -112) {
            return readByte & 15;
        }
        if (readByte == -36) {
            return m0();
        }
        if (readByte == -35) {
            return p0();
        }
        throw s0("Array", readByte);
    }

    public final int u0() {
        int i;
        byte readByte = readByte();
        if ((readByte & -32) == -96) {
            return readByte & 31;
        }
        int i2 = -1;
        switch (readByte) {
            case -60:
                i = readByte() & UByte.MAX_VALUE;
                break;
            case -59:
                i = m0();
                break;
            case -58:
                i = p0();
                break;
            default:
                i = -1;
                break;
        }
        if (i >= 0) {
            return i;
        }
        if (this.a) {
            switch (readByte) {
                case -39:
                    i2 = readByte() & UByte.MAX_VALUE;
                    break;
                case -38:
                    i2 = m0();
                    break;
                case -37:
                    i2 = p0();
                    break;
            }
            if (i2 >= 0) {
                return i2;
            }
        }
        throw s0("Binary", readByte);
    }

    public final boolean v0() {
        byte readByte = readByte();
        if (readByte == -62) {
            return false;
        }
        if (readByte == -61) {
            return true;
        }
        throw s0("boolean", readByte);
    }

    public final int w0() {
        byte readByte = readByte();
        if (o54.z(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                return readByte() & UByte.MAX_VALUE;
            case -51:
                return readShort() & UShort.MAX_VALUE;
            case -50:
                int readInt = readInt();
                if (readInt >= 0) {
                    return readInt;
                }
                throw V(readInt);
            case -49:
                long readLong = readLong();
                if (readLong >= 0 && readLong <= 2147483647L) {
                    return (int) readLong;
                }
                throw e0(readLong);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long readLong2 = readLong();
                if (readLong2 >= -2147483648L && readLong2 <= 2147483647L) {
                    return (int) readLong2;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong2));
            default:
                throw s0("Integer", readByte);
        }
    }

    public final long x0() {
        byte readByte = readByte();
        if (o54.z(readByte)) {
            return (long) readByte;
        }
        switch (readByte) {
            case -52:
                return (long) (readByte() & UByte.MAX_VALUE);
            case -51:
                return (long) (readShort() & UShort.MAX_VALUE);
            case -50:
                int readInt = readInt();
                return readInt < 0 ? ((long) (readInt & IntCompanionObject.MAX_VALUE)) + 2147483648L : (long) readInt;
            case -49:
                long readLong = readLong();
                if (readLong >= 0) {
                    return readLong;
                }
                throw e0(readLong);
            case -48:
                return (long) readByte();
            case -47:
                return (long) readShort();
            case -46:
                return (long) readInt();
            case -45:
                return readLong();
            default:
                throw s0("Integer", readByte);
        }
    }

    public final int y0() {
        byte readByte = readByte();
        if ((readByte & -16) == Byte.MIN_VALUE) {
            return readByte & 15;
        }
        if (readByte == -34) {
            return m0();
        }
        if (readByte == -33) {
            return p0();
        }
        throw s0("Map", readByte);
    }

    public final int z0() {
        int i;
        byte readByte = readByte();
        if ((readByte & -32) == -96) {
            return readByte & 31;
        }
        int i2 = -1;
        switch (readByte) {
            case -39:
                i = readByte() & UByte.MAX_VALUE;
                break;
            case -38:
                i = m0();
                break;
            case -37:
                i = p0();
                break;
            default:
                i = -1;
                break;
        }
        if (i >= 0) {
            return i;
        }
        if (this.b) {
            switch (readByte) {
                case -60:
                    i2 = readByte() & UByte.MAX_VALUE;
                    break;
                case -59:
                    i2 = m0();
                    break;
                case -58:
                    i2 = p0();
                    break;
            }
            if (i2 >= 0) {
                return i2;
            }
        }
        throw s0("String", readByte);
    }
}
