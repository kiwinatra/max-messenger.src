package defpackage;

/* renamed from: c9g  reason: default package */
public final class c9g {
    public final String a;
    public final long b;
    public final String c;

    public c9g(long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoUploadInfo{url='");
        sb.append(this.a);
        sb.append("', videoId=");
        sb.append(this.b);
        sb.append(", token='");
        sb.append(!cvg.A(this.c));
        sb.append("'}");
        return sb.toString();
    }
}
