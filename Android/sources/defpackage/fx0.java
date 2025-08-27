package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: fx0  reason: default package */
public final class fx0 {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final int c;
    public long d;
    public File e;
    public OutputStream f;
    public long g;
    public long h;
    public final Object i;
    public Object j;
    public BufferedOutputStream k;

    public fx0(cx0 cx0) {
        cx0.getClass();
        this.i = cx0;
        this.b = 5242880;
        this.c = 20480;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                OutputStream outputStream = this.f;
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        t0g.h(this.f);
                        this.f = null;
                        File file = this.e;
                        this.e = null;
                        long j2 = this.g;
                        sae sae = (sae) ((cx0) this.i);
                        synchronized (sae) {
                            if (file.exists()) {
                                if (j2 == 0) {
                                    file.delete();
                                    return;
                                }
                                vae b2 = vae.b(file, j2, sae.c);
                                b2.getClass();
                                ey0 m = sae.c.m(b2.a);
                                m.getClass();
                                y64.j(m.b(b2.b, b2.c));
                                long a2 = mv3.a(m.e);
                                if (a2 != -1) {
                                    y64.j(b2.b + b2.c <= a2);
                                }
                                sae.getClass();
                                sae.b(b2);
                                try {
                                    sae.c.x();
                                    sae.notifyAll();
                                    return;
                                } catch (IOException e2) {
                                    throw new IOException(e2);
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        t0g.h(this.f);
                        this.f = null;
                        File file2 = this.e;
                        this.e = null;
                        file2.delete();
                        throw th;
                    }
                } else {
                    return;
                }
            default:
                OutputStream outputStream2 = this.f;
                if (outputStream2 != null) {
                    try {
                        outputStream2.flush();
                        v0g.h(this.f);
                        this.f = null;
                        File file3 = this.e;
                        this.e = null;
                        long j3 = this.g;
                        tae tae = (tae) ((bx0) this.i);
                        synchronized (tae) {
                            if (file3.exists()) {
                                if (j3 == 0) {
                                    file3.delete();
                                    return;
                                }
                                wae b3 = wae.b(file3, j3, -9223372036854775807L, tae.c);
                                b3.getClass();
                                fy0 j4 = tae.c.j(b3.a);
                                j4.getClass();
                                n79.n(j4.c(b3.b, b3.c));
                                long a3 = nv3.a(j4.e);
                                if (a3 != -1) {
                                    n79.n(b3.b + b3.c <= a3);
                                }
                                if (tae.d != null) {
                                    try {
                                        tae.d.J(b3.c, file3.getName(), b3.w);
                                    } catch (IOException e3) {
                                        throw new IOException(e3);
                                    } catch (IOException e4) {
                                        throw new IOException(e4);
                                    }
                                }
                                tae.b(b3);
                                tae.c.s();
                                tae.notifyAll();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        v0g.h(this.f);
                        this.f = null;
                        File file4 = this.e;
                        this.e = null;
                        file4.delete();
                        throw th2;
                    }
                } else {
                    return;
                }
        }
    }

    public void b(p74 p74) {
        File c2;
        p74 p742 = p74;
        long j2 = p742.g;
        long min = j2 == -1 ? -1 : Math.min(j2 - this.h, this.d);
        String str = p742.h;
        int i2 = t0g.a;
        long j3 = p742.f + this.h;
        sae sae = (sae) ((cx0) this.i);
        synchronized (sae) {
            try {
                sae.d();
                ey0 m = sae.c.m(str);
                m.getClass();
                y64.j(m.b(j3, min));
                if (!sae.a.exists()) {
                    sae.e(sae.a);
                    sae.k();
                }
                os7 os7 = sae.b;
                if (min != -1) {
                    os7.a(sae, min);
                } else {
                    os7.getClass();
                }
                File file = new File(sae.a, Integer.toString(sae.e.nextInt(10)));
                if (!file.exists()) {
                    sae.e(file);
                }
                c2 = vae.c(file, m.a, j3, System.currentTimeMillis());
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e = c2;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        if (this.c > 0) {
            b5d b5d = (b5d) this.k;
            if (b5d == null) {
                this.k = new b5d(fileOutputStream, this.c, 0);
            } else {
                b5d.a(fileOutputStream);
            }
            this.f = (b5d) this.k;
        } else {
            this.f = fileOutputStream;
        }
        this.g = 0;
    }

    public void c(q74 q74) {
        File c2;
        q74 q742 = q74;
        long j2 = q742.g;
        long j3 = -1;
        if (j2 != -1) {
            j3 = Math.min(j2 - this.h, this.d);
        }
        long j4 = j3;
        String str = q742.h;
        int i2 = v0g.a;
        long j5 = q742.f + this.h;
        tae tae = (tae) ((bx0) this.i);
        synchronized (tae) {
            try {
                tae.d();
                fy0 j6 = tae.c.j(str);
                j6.getClass();
                n79.n(j6.c(j5, j4));
                if (!tae.a.exists()) {
                    tae.e(tae.a);
                    tae.n();
                }
                tae.b.c(tae, str, j5, j4);
                File file = new File(tae.a, Integer.toString(tae.f.nextInt(10)));
                if (!file.exists()) {
                    tae.e(file);
                }
                c2 = wae.c(file, j6.a, j5, System.currentTimeMillis());
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e = c2;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        if (this.c > 0) {
            b5d b5d = (b5d) this.k;
            if (b5d == null) {
                this.k = new b5d(fileOutputStream, this.c, 1);
            } else {
                b5d.a(fileOutputStream);
            }
            this.f = (b5d) this.k;
        } else {
            this.f = fileOutputStream;
        }
        this.g = 0;
    }

    public fx0(bx0 bx0) {
        bx0.getClass();
        this.i = bx0;
        this.b = 5242880;
        this.c = 20480;
    }
}
