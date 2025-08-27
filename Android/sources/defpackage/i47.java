package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: i47  reason: default package */
public final class i47 implements Closeable {
    public static final Logger x = Logger.getLogger(n37.class.getName());
    public final rt0 a;
    public int b = 16384;
    public boolean c;
    public final f37 o;
    public final wu0 v;
    public final boolean w;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, rt0] */
    public i47(wu0 wu0, boolean z) {
        this.v = wu0;
        this.w = z;
        ? obj = new Object();
        this.a = obj;
        this.o = new f37(obj);
    }

    public final synchronized void a(a0e a0e) {
        try {
            if (!this.c) {
                int i = this.b;
                int i2 = a0e.a;
                if ((i2 & 32) != 0) {
                    i = a0e.b[5];
                }
                this.b = i;
                int i3 = -1;
                if (((i2 & 2) != 0 ? a0e.b[1] : -1) != -1) {
                    f37 f37 = this.o;
                    if ((i2 & 2) != 0) {
                        i3 = a0e.b[1];
                    }
                    f37.getClass();
                    int min = Math.min(i3, 16384);
                    int i4 = f37.c;
                    if (i4 != min) {
                        if (min < i4) {
                            f37.a = Math.min(f37.a, min);
                        }
                        f37.b = true;
                        f37.c = min;
                        int i5 = f37.g;
                        if (min < i5) {
                            if (min == 0) {
                                ArraysKt___ArraysJvmKt.fill$default((Object[]) f37.d, (Object) null, 0, 0, 6, (Object) null);
                                f37.e = f37.d.length - 1;
                                f37.f = 0;
                                f37.g = 0;
                            } else {
                                f37.a(i5 - min);
                            }
                        }
                    }
                }
                d(0, 0, 4, 1);
                this.v.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z, int i, rt0 rt0, int i2) {
        if (!this.c) {
            d(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                this.v.O(rt0, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void close() {
        this.c = true;
        this.v.close();
    }

    public final void d(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = x;
        if (logger.isLoggable(level)) {
            logger.fine(n37.a(false, i, i2, i3, i4));
        }
        if (i2 > this.b) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.b + ": " + i2).toString());
        } else if ((((int) 2147483648L) & i) == 0) {
            byte[] bArr = u0g.a;
            int i5 = (i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
            wu0 wu0 = this.v;
            wu0.D(i5);
            wu0.D((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            wu0.D(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            wu0.D(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
            wu0.D(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
            wu0.B(i & IntCompanionObject.MAX_VALUE);
        } else {
            throw new IllegalArgumentException(wj6.h(i, "reserved bit set: ").toString());
        }
    }

    public final synchronized void flush() {
        if (!this.c) {
            this.v.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void g(int i, byte[] bArr, int i2) {
        try {
            if (this.c) {
                throw new IOException("closed");
            } else if (tr1.y(i2) != -1) {
                boolean z = false;
                d(0, bArr.length + 8, 7, 0);
                this.v.B(i);
                this.v.B(tr1.y(i2));
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.v.write(bArr);
                }
                this.v.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(int i, int i2, boolean z) {
        if (!this.c) {
            d(0, 8, 6, z ? 1 : 0);
            this.v.B(i);
            this.v.B(i2);
            this.v.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m(int i, int i2) {
        if (this.c) {
            throw new IOException("closed");
        } else if (tr1.y(i2) != -1) {
            d(i, 4, 3, 0);
            this.v.B(tr1.y(i2));
            this.v.flush();
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final synchronized void n(int i, long j) {
        if (this.c) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        } else {
            d(i, 4, 8, 0);
            this.v.B((int) j);
            this.v.flush();
        }
    }

    public final void o(int i, long j) {
        while (j > 0) {
            long min = Math.min((long) this.b, j);
            j -= min;
            d(i, (int) min, 9, j == 0 ? 4 : 0);
            this.v.O(this.a, min);
        }
    }
}
