package defpackage;

import java.io.Serializable;

/* renamed from: wvd  reason: default package */
public final class wvd implements Serializable {
    public final long a;
    public final String b;
    public final String c;
    public final String o;
    public final boolean v;

    public wvd(long j, String str, String str2, String str3, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.v = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{=");
        sb.append(this.a);
        sb.append(", current=");
        return tr1.m(sb, this.v, "}");
    }
}
