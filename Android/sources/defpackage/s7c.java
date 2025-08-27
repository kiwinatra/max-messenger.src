package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: s7c  reason: default package */
public final class s7c {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public boolean g;
    public final qp6 h;

    public s7c(qp6 qp6) {
        qp6.getClass();
        this.h = qp6;
    }

    public final boolean a(rqb rqb) {
        int read;
        int i = this.e;
        while (this.a != 6 && (read = rqb.read()) != -1) {
            try {
                int i2 = this.c;
                this.c = i2 + 1;
                if (this.g) {
                    this.a = 6;
                    this.g = false;
                    return false;
                }
                int i3 = this.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    this.a = 5;
                                } else if (i3 != 5) {
                                    cvg.q(false);
                                } else {
                                    int i4 = ((this.b << 8) + read) - 2;
                                    n54.R(rqb, (long) i4);
                                    this.c += i4;
                                    this.a = 2;
                                }
                            } else if (read == 255) {
                                this.a = 3;
                            } else if (read == 0) {
                                this.a = 2;
                            } else if (read == 217) {
                                this.g = true;
                                int i5 = i2 - 1;
                                int i6 = this.d;
                                if (i6 > 0) {
                                    this.f = i5;
                                }
                                this.d = i6 + 1;
                                this.e = i6;
                                this.a = 2;
                            } else {
                                if (read == 218) {
                                    int i7 = i2 - 1;
                                    int i8 = this.d;
                                    if (i8 > 0) {
                                        this.f = i7;
                                    }
                                    this.d = i8 + 1;
                                    this.e = i8;
                                }
                                if (read != 1) {
                                    if (read < 208 || read > 215) {
                                        if (!(read == 217 || read == 216)) {
                                            this.a = 4;
                                        }
                                    }
                                }
                                this.a = 2;
                            }
                        } else if (read == 255) {
                            this.a = 3;
                        }
                    } else if (read == 216) {
                        this.a = 2;
                    } else {
                        this.a = 6;
                    }
                } else if (read == 255) {
                    this.a = 1;
                } else {
                    this.a = 6;
                }
                this.b = read;
            } catch (IOException e2) {
                n54.I(e2);
                throw null;
            }
        }
        return (this.a == 6 || this.e == i) ? false : true;
    }

    public final boolean b(j55 j55) {
        if (this.a == 6 || j55.o() <= this.c) {
            return false;
        }
        InputStream n = j55.n();
        n.getClass();
        qp6 qp6 = this.h;
        rqb rqb = new rqb(n, (byte[]) qp6.get(16384), qp6);
        try {
            n54.R(rqb, (long) this.c);
            boolean a2 = a(rqb);
            a43.b(rqb);
            return a2;
        } catch (IOException e2) {
            n54.I(e2);
            throw null;
        } catch (Throwable th) {
            a43.b(rqb);
            throw th;
        }
    }
}
