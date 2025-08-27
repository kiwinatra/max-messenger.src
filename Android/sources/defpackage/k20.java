package defpackage;

import java.util.Arrays;

/* renamed from: k20  reason: default package */
public final class k20 {
    public static final k20 q = new h20().a();
    public final long a;
    public final long b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final String g;
    public final String h;
    public final byte[] i;
    public final long j;
    public final j20 k;
    public final String l;
    public final zy m;
    public final boolean n;
    public final int o;
    public final int p;

    public k20(h20 h20) {
        this.a = h20.a;
        this.b = h20.e;
        this.c = h20.d;
        this.d = h20.b;
        this.e = h20.c;
        this.f = h20.j;
        this.g = h20.f;
        this.h = h20.g;
        this.i = (byte[]) h20.n;
        this.j = h20.k;
        this.k = (j20) h20.o;
        this.l = h20.h;
        this.m = (zy) h20.p;
        this.n = h20.l;
        this.o = h20.i;
        this.p = h20.m;
    }

    public final h20 a() {
        h20 h20 = new h20();
        h20.a = this.a;
        h20.e = this.b;
        h20.d = this.c;
        h20.b = this.d;
        h20.c = this.e;
        h20.j = this.f;
        h20.f = this.g;
        h20.g = this.h;
        h20.n = this.i;
        h20.k = this.j;
        h20.o = this.k;
        h20.h = this.l;
        h20.p = this.m;
        h20.l = this.n;
        h20.i = this.o;
        h20.m = this.p;
        return h20;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.i);
        StringBuilder sb = new StringBuilder("Video{videoId=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", thumbnail='");
        sb.append(this.c);
        sb.append("', width=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append(", live=");
        sb.append(this.f);
        sb.append(", externalUrl='");
        sb.append(this.g);
        sb.append("', externalSiteName='");
        sb.append(this.h);
        sb.append("', previewData=");
        sb.append(arrays);
        sb.append(", startTime=");
        sb.append(this.j);
        sb.append(", convertOptions=");
        sb.append(this.k);
        sb.append(", token='");
        sb.append(this.l);
        sb.append("', videoCollage=");
        sb.append(this.m);
        sb.append(", ignoreAutoplay=");
        sb.append(this.n);
        sb.append(", audioTrackIndex=");
        sb.append(this.o);
        sb.append(", audioGroupIndex=");
        return wj6.l(sb, this.p, "}");
    }
}
