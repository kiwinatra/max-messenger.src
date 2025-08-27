package defpackage;

import java.util.zip.Deflater;

/* renamed from: uk4  reason: default package */
public final class uk4 implements nde {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final Object c;
    public final Object o;

    public uk4(rt0 rt0, Deflater deflater) {
        this.c = new ftc(rt0);
        this.o = deflater;
    }

    public final void O(rt0 rt0, long j) {
        Object obj = this.o;
        switch (this.a) {
            case 0:
                n79.l(rt0.b, 0, j);
                while (j > 0) {
                    hod hod = rt0.a;
                    int min = (int) Math.min(j, (long) (hod.c - hod.b));
                    ((Deflater) obj).setInput(hod.a, hod.b, min);
                    a(false);
                    long j2 = (long) min;
                    rt0.b -= j2;
                    int i = hod.b + min;
                    hod.b = i;
                    if (i == hod.c) {
                        rt0.a = hod.a();
                        zod.a(hod);
                    }
                    j -= j2;
                }
                return;
            default:
                if (!this.b) {
                    long j3 = rt0.b;
                    byte[] bArr = u0g.a;
                    if (j < 0 || 0 > j3 || j3 < j) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    ((wu0) ((u9) obj).x).O(rt0, j);
                    return;
                }
                throw new IllegalStateException("closed".toString());
        }
    }

    public void a(boolean z) {
        hod s0;
        int i;
        wu0 wu0 = (wu0) this.c;
        rt0 buffer = wu0.getBuffer();
        while (true) {
            s0 = buffer.s0(1);
            Deflater deflater = (Deflater) this.o;
            byte[] bArr = s0.a;
            if (z) {
                int i2 = s0.c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                int i3 = s0.c;
                i = deflater.deflate(bArr, i3, 8192 - i3);
            }
            if (i > 0) {
                s0.c += i;
                buffer.b += (long) i;
                wu0.F();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (s0.b == s0.c) {
            buffer.a = s0.a();
            zod.a(s0);
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                Deflater deflater = (Deflater) this.o;
                if (!this.b) {
                    try {
                        deflater.finish();
                        a(false);
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        deflater.end();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    try {
                        ((wu0) this.c).close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    this.b = true;
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
                return;
            default:
                if (!this.b) {
                    this.b = true;
                    u9 u9Var = (u9) this.o;
                    u9Var.getClass();
                    dc6 dc6 = (dc6) this.c;
                    lkf lkf = dc6.e;
                    dc6.e = lkf.d;
                    lkf.a();
                    lkf.b();
                    u9Var.b = 3;
                    return;
                }
                return;
        }
    }

    public final void flush() {
        switch (this.a) {
            case 0:
                a(true);
                ((wu0) this.c).flush();
                return;
            default:
                if (!this.b) {
                    ((wu0) ((u9) this.o).x).flush();
                    return;
                }
                return;
        }
    }

    public final lkf q() {
        switch (this.a) {
            case 0:
                return ((wu0) this.c).q();
            default:
                return (dc6) this.c;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DeflaterSink(" + ((wu0) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public uk4(u9 u9Var) {
        this.o = u9Var;
        this.c = new dc6(((wu0) u9Var.x).q());
    }
}
