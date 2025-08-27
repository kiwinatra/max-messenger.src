package defpackage;

import org.json.HTTP;

/* renamed from: j37  reason: default package */
public final class j37 implements nde {
    public final dc6 a;
    public boolean b;
    public final /* synthetic */ u9 c;

    public j37(u9 u9Var) {
        this.c = u9Var;
        this.a = new dc6(((wu0) u9Var.x).q());
    }

    public final void O(rt0 rt0, long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (j != 0) {
            u9 u9Var = this.c;
            ((wu0) u9Var.x).Q(j);
            wu0 wu0 = (wu0) u9Var.x;
            wu0.M(HTTP.CRLF);
            wu0.O(rt0, j);
            wu0.M(HTTP.CRLF);
        }
    }

    public final synchronized void close() {
        if (!this.b) {
            this.b = true;
            ((wu0) this.c.x).M("0\r\n\r\n");
            u9 u9Var = this.c;
            dc6 dc6 = this.a;
            u9Var.getClass();
            lkf lkf = dc6.e;
            dc6.e = lkf.d;
            lkf.a();
            lkf.b();
            this.c.b = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.b) {
            ((wu0) this.c.x).flush();
        }
    }

    public final lkf q() {
        return this.a;
    }
}
