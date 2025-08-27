package defpackage;

/* renamed from: sn5  reason: default package */
public final class sn5 {
    public final long a;
    public final String b;
    public final String c;

    public sn5(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileUploadInfo{fileId=");
        sb.append(this.a);
        sb.append(", token='");
        sb.append(!cvg.A(this.b));
        sb.append("', url='");
        return wj6.n(sb, this.c, "'}");
    }
}
