package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: w70  reason: default package */
public final class w70 {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public final er7 a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public v70 f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public w70(er7 er7) {
        this.a = er7;
        if (t0g.a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * ((long) this.g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (t0g.a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    public final boolean b(long j2) {
        if (j2 <= a()) {
            if (this.h) {
                AudioTrack audioTrack = this.c;
                audioTrack.getClass();
                if (!(audioTrack.getPlayState() == 2 && a() == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }
}
