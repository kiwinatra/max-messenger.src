package defpackage;

import android.app.PendingIntent;

/* renamed from: bxg  reason: default package */
public final class bxg extends f5d {
    public final PendingIntent a;
    public final boolean b;

    public bxg(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.a = pendingIntent;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f5d) {
            f5d f5d = (f5d) obj;
            return this.a.equals(((bxg) f5d).a) && this.b == ((bxg) f5d).b;
        }
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return tr1.m(tr1.p("ReviewInfo{pendingIntent=", this.a.toString(), ", isNoOp="), this.b, "}");
    }
}
