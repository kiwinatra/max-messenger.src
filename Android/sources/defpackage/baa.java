package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.webrtc.PeerConnectionFactory;

/* renamed from: baa  reason: default package */
public final class baa {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final PeerConnectionFactory.EnhancerKind e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Runnable m;
    public final aaa n;

    public baa(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i2, int i3, int i4, int i5, int i6, boolean z5, si0 si0, aaa aaa) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = enhancerKind;
        this.f = str;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = z5;
        this.m = si0;
        this.n = aaa;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baa)) {
            return false;
        }
        baa baa = (baa) obj;
        baa.getClass();
        return this.a == baa.a && this.b == baa.b && this.c == baa.c && this.d == baa.d && this.e == baa.e && Intrinsics.areEqual((Object) this.f, (Object) baa.f) && this.g == baa.g && this.h == baa.h && this.i == baa.i && this.j == baa.j && this.k == baa.k && this.l == baa.l && Intrinsics.areEqual((Object) this.m, (Object) baa.m) && this.n == baa.n;
    }

    public final int hashCode() {
        int i2 = 0;
        int e2 = g63.e(g63.e(g63.e(g63.e(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d);
        PeerConnectionFactory.EnhancerKind enhancerKind = this.e;
        int hashCode = (e2 + (enhancerKind == null ? 0 : enhancerKind.hashCode())) * 31;
        String str = this.f;
        int e3 = g63.e(ryg.a(this.k, ryg.a(this.j, ryg.a(this.i, ryg.a(this.h, ryg.a(this.g, (hashCode + (str == null ? 0 : str.hashCode())) * 31))))), 31, this.l);
        Runnable runnable = this.m;
        int hashCode2 = (e3 + (runnable == null ? 0 : runnable.hashCode())) * 31;
        aaa aaa = this.n;
        if (aaa != null) {
            i2 = aaa.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "NoiseSuppressorActiveState(noiseSuppressorStuttering=false, serversideBasic=" + this.a + ", serversideAnn=" + this.b + ", clientsidePlatform=" + this.c + ", clientsideAnn=" + this.d + ", enhancerKind=" + this.e + ", filePath=" + this.f + ", inputSampleRate=" + this.g + ", outputSampleRate=" + this.h + ", fallbackTimeLimitMillis=" + this.i + ", fallbackStutterCountMillis=" + this.j + ", fallbackTimeframeMillis=" + this.k + ", logTimings=" + this.l + ", onNoiseSuppressorDisabledDueToStutter=" + this.m + ", kind=" + this.n + ")";
    }
}
