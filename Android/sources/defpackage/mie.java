package defpackage;

import java.math.BigInteger;

/* renamed from: mie  reason: default package */
public final class mie extends kie {
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mie(long j, String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, String str2, aqg aqg, Boolean bool) {
        super(2, j, str, bigInteger, bigInteger2, bigInteger3, str2, aqg, bool);
        this.l = j2;
        this.m = j3;
        this.n = j4;
        this.o = j5;
        this.p = j6;
        this.q = j7;
        this.r = j8;
        this.s = j9;
    }

    public final String toString() {
        return "VideoSend{ssrc=" + this.c + ", transportId='" + this.d + "', trackId='" + this.e + "', packetsSent=" + this.h + ", packetsLost=" + this.i + ", bytesSent=" + this.j + ", nacksReceived=" + this.l + ", pliReceived=" + this.m + ", firReceived=" + this.n + ", framesEncoded=" + this.o + ", adaptationChanges=" + this.p + ", avgEncodeMs=" + this.q + ", frameWidth=" + this.r + ", frameHeight=" + this.s + ", isMediaShare=" + this.k + ", unknown=" + this.g + '}';
    }
}
