package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.Flushable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

/* renamed from: gd9  reason: default package */
public final class gd9 implements Closeable, Flushable {
    public static final boolean y;
    public final int a;
    public final int b;
    public final boolean c;
    public final MessageBufferOutput o;
    public MessageBuffer v;
    public int w = 0;
    public CharsetEncoder x;

    static {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i = cls.getField("SDK_INT").getInt(cls.getConstructor((Class[]) null).newInstance((Object[]) null));
            if (i >= 14 && i < 21) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
        }
        y = z;
    }

    public gd9(OutputStreamBufferOutput outputStreamBufferOutput, dd9 dd9) {
        this.o = outputStreamBufferOutput;
        this.a = dd9.a;
        this.b = dd9.b;
        this.c = dd9.o;
    }

    public final void U(String str) {
        byte[] bytes = str.getBytes(fd9.a);
        n(bytes.length);
        int length = bytes.length;
        MessageBuffer messageBuffer = this.v;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i = this.w;
            if (size - i >= length && length <= this.b) {
                this.v.putBytes(i, bytes, 0, length);
                this.w += length;
                return;
            }
        }
        flush();
        this.o.add(bytes, 0, length);
    }

    public final void V(byte b2) {
        b(1);
        MessageBuffer messageBuffer = this.v;
        int i = this.w;
        this.w = i + 1;
        messageBuffer.putByte(i, b2);
    }

    public final int a(int i, String str) {
        if (this.x == null) {
            CharsetEncoder newEncoder = fd9.a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.x = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        this.x.reset();
        MessageBuffer messageBuffer = this.v;
        ByteBuffer sliceAsByteBuffer = messageBuffer.sliceAsByteBuffer(i, messageBuffer.size() - i);
        int position = sliceAsByteBuffer.position();
        CoderResult encode = this.x.encode(CharBuffer.wrap(str), sliceAsByteBuffer, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new RuntimeException(e);
            }
        }
        if (!encode.isUnderflow() || encode.isOverflow() || !this.x.flush(sliceAsByteBuffer).isUnderflow()) {
            return -1;
        }
        return sliceAsByteBuffer.position() - position;
    }

    public final void b(int i) {
        MessageBuffer messageBuffer = this.v;
        MessageBufferOutput messageBufferOutput = this.o;
        if (messageBuffer == null) {
            this.v = messageBufferOutput.next(i);
        } else if (this.w + i >= messageBuffer.size()) {
            this.o.writeBuffer(this.w);
            this.v = null;
            this.w = 0;
            this.v = messageBufferOutput.next(i);
        }
    }

    public final void close() {
        MessageBufferOutput messageBufferOutput = this.o;
        try {
            flush();
        } finally {
            messageBufferOutput.close();
        }
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("array size must be >= 0");
        } else if (i < 16) {
            V((byte) (i | -112));
        } else if (i < 65536) {
            p0((byte) -36, (short) i);
        } else {
            k0((byte) -35, i);
        }
    }

    public final void e0(byte b2, byte b3) {
        b(2);
        MessageBuffer messageBuffer = this.v;
        int i = this.w;
        this.w = i + 1;
        messageBuffer.putByte(i, b2);
        MessageBuffer messageBuffer2 = this.v;
        int i2 = this.w;
        this.w = i2 + 1;
        messageBuffer2.putByte(i2, b3);
    }

    public final void flush() {
        int i = this.w;
        if (i > 0) {
            this.o.writeBuffer(i);
            this.v = null;
            this.w = 0;
        }
        this.o.flush();
    }

    public final void g(int i) {
        if (i < -32) {
            if (i < -32768) {
                k0((byte) -46, i);
            } else if (i < -128) {
                p0((byte) -47, (short) i);
            } else {
                e0((byte) -48, (byte) i);
            }
        } else if (i < 128) {
            V((byte) i);
        } else if (i < 256) {
            e0((byte) -52, (byte) i);
        } else if (i < 65536) {
            p0((byte) -51, (short) i);
        } else {
            k0((byte) -50, i);
        }
    }

    public final void j(long j) {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    m0((byte) -45, j);
                } else {
                    k0((byte) -46, (int) j);
                }
            } else if (j < -128) {
                p0((byte) -47, (short) ((int) j));
            } else {
                e0((byte) -48, (byte) ((int) j));
            }
        } else if (j < 128) {
            V((byte) ((int) j));
        } else if (j < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            if (j < 256) {
                e0((byte) -52, (byte) ((int) j));
            } else {
                p0((byte) -51, (short) ((int) j));
            }
        } else if (j < 4294967296L) {
            k0((byte) -50, (int) j);
        } else {
            m0((byte) -49, j);
        }
    }

    public final void k0(byte b2, int i) {
        b(5);
        MessageBuffer messageBuffer = this.v;
        int i2 = this.w;
        this.w = i2 + 1;
        messageBuffer.putByte(i2, b2);
        this.v.putInt(this.w, i);
        this.w += 4;
    }

    public final void m(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("map size must be >= 0");
        } else if (i < 16) {
            V((byte) (i | -128));
        } else if (i < 65536) {
            p0((byte) -34, (short) i);
        } else {
            k0((byte) -33, i);
        }
    }

    public final void m0(byte b2, long j) {
        b(9);
        MessageBuffer messageBuffer = this.v;
        int i = this.w;
        this.w = i + 1;
        messageBuffer.putByte(i, b2);
        this.v.putLong(this.w, j);
        this.w += 8;
    }

    public final void n(int i) {
        if (i < 32) {
            V((byte) (i | -96));
        } else if (this.c && i < 256) {
            e0((byte) -39, (byte) i);
        } else if (i < 65536) {
            p0((byte) -38, (short) i);
        } else {
            k0((byte) -37, i);
        }
    }

    public final void o(String str) {
        if (str.length() <= 0) {
            n(0);
        } else if (y || str.length() < this.a) {
            U(str);
        } else {
            if (str.length() < 256) {
                b((str.length() * 6) + 3);
                int a2 = a(this.w + 2, str);
                if (a2 >= 0) {
                    if (this.c && a2 < 256) {
                        MessageBuffer messageBuffer = this.v;
                        int i = this.w;
                        this.w = i + 1;
                        messageBuffer.putByte(i, (byte) -39);
                        MessageBuffer messageBuffer2 = this.v;
                        int i2 = this.w;
                        this.w = i2 + 1;
                        messageBuffer2.putByte(i2, (byte) a2);
                        this.w += a2;
                        return;
                    } else if (a2 < 65536) {
                        MessageBuffer messageBuffer3 = this.v;
                        int i3 = this.w;
                        messageBuffer3.putMessageBuffer(i3 + 3, messageBuffer3, i3 + 2, a2);
                        MessageBuffer messageBuffer4 = this.v;
                        int i4 = this.w;
                        this.w = i4 + 1;
                        messageBuffer4.putByte(i4, (byte) -38);
                        this.v.putShort(this.w, (short) a2);
                        this.w = this.w + 2 + a2;
                        return;
                    } else {
                        throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                    }
                }
            } else if (str.length() < 65536) {
                b((str.length() * 6) + 5);
                int a3 = a(this.w + 3, str);
                if (a3 >= 0) {
                    if (a3 < 65536) {
                        MessageBuffer messageBuffer5 = this.v;
                        int i5 = this.w;
                        this.w = i5 + 1;
                        messageBuffer5.putByte(i5, (byte) -38);
                        this.v.putShort(this.w, (short) a3);
                        this.w = this.w + 2 + a3;
                        return;
                    } else if (((long) a3) < 4294967296L) {
                        MessageBuffer messageBuffer6 = this.v;
                        int i6 = this.w;
                        messageBuffer6.putMessageBuffer(i6 + 5, messageBuffer6, i6 + 3, a3);
                        MessageBuffer messageBuffer7 = this.v;
                        int i7 = this.w;
                        this.w = i7 + 1;
                        messageBuffer7.putByte(i7, (byte) -37);
                        this.v.putInt(this.w, a3);
                        this.w = this.w + 4 + a3;
                        return;
                    } else {
                        throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                    }
                }
            }
            U(str);
        }
    }

    public final void p0(byte b2, short s) {
        b(3);
        MessageBuffer messageBuffer = this.v;
        int i = this.w;
        this.w = i + 1;
        messageBuffer.putByte(i, b2);
        this.v.putShort(this.w, s);
        this.w += 2;
    }
}
