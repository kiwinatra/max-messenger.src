package defpackage;

import android.text.GetChars;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.CharBuffer;
import kotlin.uuid.Uuid;

/* renamed from: i6b  reason: default package */
public final class i6b extends Writer {
    public static final char[] v = {'n', 'u', 'l', 'l'};
    public final char[] a = new char[Math.max(Uuid.SIZE_BITS, 1)];
    public final byte[] b;
    public final OutputStream c;
    public final r0g o;

    public i6b(OutputStream outputStream) {
        r0g r0g = new r0g();
        this.c = outputStream;
        this.o = r0g;
        this.b = new byte[Math.max(Uuid.SIZE_BITS, 4)];
    }

    public final void a(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            write((String) charSequence, i, i2);
        } else if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            char[] cArr = this.a;
            int length = cArr.length;
            synchronized (this.lock) {
                while (i2 > 0) {
                    try {
                        int min = Math.min(length, i2);
                        int i3 = i + min;
                        sb.getChars(i, i3, cArr, 0);
                        write(cArr, 0, min);
                        i2 -= min;
                        i = i3;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } else if (charSequence instanceof StringBuffer) {
            StringBuffer stringBuffer = (StringBuffer) charSequence;
            char[] cArr2 = this.a;
            int length2 = cArr2.length;
            synchronized (this.lock) {
                while (i2 > 0) {
                    try {
                        int min2 = Math.min(length2, i2);
                        int i4 = i + min2;
                        stringBuffer.getChars(i, i4, cArr2, 0);
                        write(cArr2, 0, min2);
                        i2 -= min2;
                        i = i4;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else if (charSequence instanceof GetChars) {
            GetChars getChars = (GetChars) charSequence;
            char[] cArr3 = this.a;
            int length3 = cArr3.length;
            synchronized (this.lock) {
                while (i2 > 0) {
                    try {
                        int min3 = Math.min(length3, i2);
                        int i5 = i + min3;
                        getChars.getChars(i, i5, cArr3, 0);
                        write(cArr3, 0, min3);
                        i2 -= min3;
                        i = i5;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } else {
            if (charSequence instanceof CharBuffer) {
                CharBuffer charBuffer = (CharBuffer) charSequence;
                if (charBuffer.hasArray()) {
                    write(charBuffer.array(), charBuffer.arrayOffset() + i, i2);
                    return;
                }
            }
            char[] cArr4 = this.a;
            int length4 = cArr4.length;
            synchronized (this.lock) {
                while (i2 > 0) {
                    try {
                        int min4 = Math.min(length4, i2);
                        int i6 = i + min4;
                        int i7 = 0;
                        while (i7 < min4) {
                            cArr4[i7] = charSequence.charAt(i);
                            i7++;
                            i++;
                        }
                        write(cArr4, 0, min4);
                        i2 -= min4;
                        i = i6;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }

    public final void close() {
        int i;
        synchronized (this.lock) {
            r0g r0g = this.o;
            byte[] bArr = this.b;
            int length = bArr.length;
            if (r0g.c != 0) {
                i = r0g.b(0, bArr);
                r0g.c = 0;
            } else {
                i = 0;
            }
            this.c.write(this.b, 0, i);
            this.c.close();
        }
    }

    public final void flush() {
        synchronized (this.lock) {
            this.c.flush();
        }
    }

    public final void write(int i) {
        char[] cArr = this.a;
        cArr[0] = (char) i;
        write(cArr, 0, 1);
    }

    public final Writer append(char c2) {
        write((int) c2);
        return this;
    }

    public final void write(char[] cArr, int i, int i2) {
        synchronized (this.lock) {
            int i3 = i + i2;
            int i4 = i;
            int i5 = i2;
            while (i4 < i3) {
                try {
                    r0g r0g = this.o;
                    byte[] bArr = this.b;
                    long a2 = r0g.a(cArr, i4, i5, bArr, bArr.length);
                    this.c.write(this.b, 0, (int) a2);
                    i4 = (int) (a2 >> 32);
                    i5 = i3 - i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m1543append(char c2) {
        write((int) c2);
        return this;
    }

    public final Writer append(CharSequence charSequence) {
        if (charSequence == null) {
            write(v, 0, 4);
        } else {
            a(charSequence, 0, charSequence.length());
        }
        return this;
    }

    public final Writer append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            write(v, 0, 4);
        } else {
            a(charSequence, i, i2 - i);
        }
        return this;
    }

    public final void write(String str, int i, int i2) {
        char[] cArr = this.a;
        int length = cArr.length;
        synchronized (this.lock) {
            while (i2 > 0) {
                try {
                    int min = Math.min(length, i2);
                    int i3 = i + min;
                    str.getChars(i, i3, cArr, 0);
                    write(cArr, 0, min);
                    i2 -= min;
                    i = i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    public final void write(String str) {
        write(str, 0, str.length());
    }
}
