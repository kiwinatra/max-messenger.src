package defpackage;

/* renamed from: j4d  reason: default package */
public final class j4d {
    public y2d a;
    public y8c b;
    public int c = -1;
    public String d;
    public jw6 e;
    public e4 f = new e4(20);
    public ptc g;
    public k4d h;
    public k4d i;
    public k4d j;
    public long k;
    public long l;
    public ce m;

    public static void b(k4d k4d, String str) {
        if (k4d == null) {
            return;
        }
        if (k4d.x != null) {
            throw new IllegalArgumentException(str.concat(".body != null").toString());
        } else if (k4d.y != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
        } else if (k4d.z != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
        } else if (k4d.X != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
        }
    }

    public final k4d a() {
        int i2 = this.c;
        if (i2 >= 0) {
            y2d y2d = this.a;
            if (y2d != null) {
                y8c y8c = this.b;
                if (y8c != null) {
                    String str = this.d;
                    if (str != null) {
                        return new k4d(y2d, y8c, str, i2, this.e, this.f.n(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(("code < 0: " + this.c).toString());
    }
}
