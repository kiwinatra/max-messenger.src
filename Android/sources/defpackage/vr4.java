package defpackage;

/* renamed from: vr4  reason: default package */
public final class vr4 extends ij0 {
    public final String b;
    public final String c;
    public final long o;

    public vr4(String str, String str2, long j, long j2) {
        super(j);
        this.b = str;
        this.c = str2 == null ? "" : str2;
        this.o = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadErrorEvent{url='");
        sb.append(this.b);
        sb.append("', attachLocalId='");
        return wj6.n(sb, this.c, "'}");
    }
}
