package defpackage;

import android.content.Context;

/* renamed from: ma0  reason: default package */
public final class ma0 extends u34 {
    public final Context a;
    public final lzf b;
    public final lzf c;
    public final String d;

    public ma0(Context context, lzf lzf, lzf lzf2, String str) {
        if (context != null) {
            this.a = context;
            if (lzf != null) {
                this.b = lzf;
                if (lzf2 != null) {
                    this.c = lzf2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u34)) {
            return false;
        }
        u34 u34 = (u34) obj;
        if (this.a.equals(((ma0) u34).a)) {
            ma0 ma0 = (ma0) u34;
            if (this.b.equals(ma0.b) && this.c.equals(ma0.c) && this.d.equals(ma0.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return wj6.n(sb, this.d, "}");
    }
}
