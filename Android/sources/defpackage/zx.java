package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;

/* renamed from: zx  reason: default package */
public final class zx implements nde {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ zx(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void O(rt0 rt0, long j) {
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                n79.l(rt0.b, 0, j);
                while (j > 0) {
                    hod hod = rt0.a;
                    long j2 = 0;
                    while (true) {
                        if (j2 < ((long) 65536)) {
                            j2 += (long) (hod.c - hod.b);
                            if (j2 >= j) {
                                j2 = j;
                            } else {
                                hod = hod.f;
                            }
                        }
                    }
                    cy cyVar = (cy) obj;
                    cyVar.i();
                    try {
                        ((nde) obj2).O(rt0, j2);
                        Unit unit = Unit.INSTANCE;
                        if (!cyVar.j()) {
                            j -= j2;
                        } else {
                            throw cyVar.k((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (cyVar.j()) {
                            e = cyVar.k(e);
                        }
                        throw e;
                    } finally {
                        cyVar.j();
                    }
                }
                return;
            default:
                n79.l(rt0.b, 0, j);
                while (j > 0) {
                    ((lkf) obj2).f();
                    hod hod2 = rt0.a;
                    int min = (int) Math.min(j, (long) (hod2.c - hod2.b));
                    ((OutputStream) obj).write(hod2.a, hod2.b, min);
                    int i = hod2.b + min;
                    hod2.b = i;
                    long j3 = (long) min;
                    j -= j3;
                    rt0.b -= j3;
                    if (i == hod2.c) {
                        rt0.a = hod2.a();
                        zod.a(hod2);
                    }
                }
                return;
        }
    }

    public final void close() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                cy cyVar = (cy) obj;
                cyVar.i();
                try {
                    ((nde) this.c).close();
                    Unit unit = Unit.INSTANCE;
                    if (cyVar.j()) {
                        throw cyVar.k((IOException) null);
                    }
                    return;
                } catch (IOException e) {
                    e = e;
                    if (cyVar.j()) {
                        e = cyVar.k(e);
                    }
                    throw e;
                } finally {
                    cyVar.j();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    public final void flush() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                cy cyVar = (cy) obj;
                cyVar.i();
                try {
                    ((nde) this.c).flush();
                    Unit unit = Unit.INSTANCE;
                    if (cyVar.j()) {
                        throw cyVar.k((IOException) null);
                    }
                    return;
                } catch (IOException e) {
                    e = e;
                    if (cyVar.j()) {
                        e = cyVar.k(e);
                    }
                    throw e;
                } finally {
                    cyVar.j();
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final lkf q() {
        switch (this.a) {
            case 0:
                return (cy) this.b;
            default:
                return (lkf) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.sink(" + ((nde) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.b) + ')';
        }
    }
}
