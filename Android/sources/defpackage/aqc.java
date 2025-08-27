package defpackage;

/* renamed from: aqc  reason: default package */
public final class aqc extends eqc {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final long e;
    public final long f;

    public aqc(long j, long j2, long j3, float f2, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f2;
        this.e = j4;
        this.f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqc)) {
            return false;
        }
        aqc aqc = (aqc) obj;
        return this.a == aqc.a && this.b == aqc.b && this.c == aqc.c && Float.compare(this.d, aqc.d) == 0 && this.e == aqc.e && this.f == aqc.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + wzf.i(g63.c(wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Downloading(messageId=");
        sb.append(this.a);
        sb.append(", totalBytes=");
        sb.append(this.b);
        sb.append(", fileId=");
        sb.append(this.c);
        sb.append(", progress=");
        sb.append(this.d);
        sb.append(", bytesDownloaded=");
        sb.append(this.e);
        sb.append(", fileSize=");
        return wj6.m(sb, this.f, ")");
    }
}
