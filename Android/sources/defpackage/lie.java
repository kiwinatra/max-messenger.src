package defpackage;

import java.math.BigInteger;

/* renamed from: lie  reason: default package */
public final class lie extends jie {
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final Double t;
    public final Double u;
    public final long v;
    public final long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lie(long j, String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, String str2, long j10, Double d, Double d2, aqg aqg, long j11, long j12) {
        super(2, j, str, bigInteger, bigInteger2, bigInteger3, j2, str2, aqg);
        this.l = j3;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = j8;
        this.r = j9;
        this.s = j10;
        this.t = d;
        this.u = d2;
        this.v = j11;
        this.w = j12;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRecv{ssrc=");
        sb.append(this.c);
        sb.append(", transportId='");
        sb.append(this.d);
        sb.append("', trackId='");
        sb.append(this.e);
        sb.append("', packetsReceived=");
        sb.append(this.h);
        sb.append(", packetsLost=");
        sb.append(this.i);
        sb.append(", bytesReceived=");
        sb.append(this.j);
        sb.append(", jitterBufferMs=");
        sb.append(this.k);
        sb.append(", nacksSent=");
        sb.append(this.l);
        sb.append(", pliSent=");
        sb.append(this.m);
        sb.append(", firSent=");
        sb.append(this.n);
        sb.append(", framesDecoded=");
        sb.append(this.o);
        sb.append(", framesReceived=");
        sb.append(this.p);
        sb.append(", frameHeight=");
        sb.append(this.q);
        sb.append(", frameWidth=");
        sb.append(this.r);
        sb.append(", unknown=");
        sb.append(this.g);
        sb.append(", framesDropped=");
        return i2a.j(sb, this.s, '}');
    }
}
