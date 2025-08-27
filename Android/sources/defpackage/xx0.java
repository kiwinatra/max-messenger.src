package defpackage;

import java.io.File;

/* renamed from: xx0  reason: default package */
public abstract class xx0 implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean o;
    public final File v;
    public final long w;

    public xx0(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.o = file != null;
        this.v = file;
        this.w = j3;
    }

    /* renamed from: a */
    public final int compareTo(xx0 xx0) {
        String str = xx0.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(xx0.a);
        }
        int i = ((this.b - xx0.b) > 0 ? 1 : ((this.b - xx0.b) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("[");
        sb.append(this.b);
        sb.append(", ");
        return wj6.m(sb, this.c, "]");
    }
}
