package defpackage;

/* renamed from: pdf  reason: default package */
public final class pdf {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final long o;

    public pdf(odf odf) {
        long j2 = odf.a;
        this.a = j2;
        String str = odf.b;
        this.b = str;
        this.c = odf.c;
        this.d = odf.d;
        this.e = odf.e;
        this.f = odf.f;
        this.j = odf.j;
        this.k = odf.k;
        this.g = odf.g;
        this.h = odf.h;
        this.i = odf.i;
        this.l = odf.l;
        this.m = odf.m;
        this.n = odf.n;
        this.o = (j2 * 31) + ((long) str.hashCode());
    }

    public final boolean a() {
        return this.c > 0 || this.d > 0 || this.e > 0 || this.j > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskAttachDownloadData{messageId=");
        sb.append(this.a);
        sb.append(", attachId='");
        sb.append(this.b);
        sb.append("', videoId=");
        sb.append(this.c);
        sb.append(", audioId=");
        sb.append(this.d);
        sb.append(", mp4GifId=");
        sb.append(this.e);
        sb.append(", stickerId=");
        sb.append(this.f);
        sb.append(", url='");
        sb.append(this.g);
        sb.append("', notifyProgress=");
        sb.append(this.h);
        sb.append(", checkAutoLoadConnection=");
        sb.append(this.i);
        sb.append(", fileId=");
        sb.append(this.j);
        sb.append(", fileName='");
        sb.append(this.k);
        sb.append("', invalidateCount=");
        sb.append(this.l);
        sb.append(", useOriginalExtension=");
        sb.append(this.m);
        sb.append(", notCopyVideoToGallery=");
        return tr1.m(sb, this.n, "}");
    }
}
