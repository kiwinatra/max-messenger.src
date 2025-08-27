package defpackage;

/* renamed from: tr4  reason: default package */
public final class tr4 extends ij0 {
    public final String b;
    public final String c;
    public final String o;
    public final long v;

    public tr4(long j, long j2, String str, String str2, String str3) {
        super(j);
        this.b = str;
        this.c = str2;
        this.o = str3 == null ? "" : str3;
        this.v = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadCompleteEvent{url='");
        sb.append(this.b);
        sb.append("', path='");
        sb.append(this.c);
        sb.append("', attachLocalId='");
        sb.append(this.o);
        sb.append("', messageId=");
        return i2a.j(sb, this.v, '}');
    }
}
