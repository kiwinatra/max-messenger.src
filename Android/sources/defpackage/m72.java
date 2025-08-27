package defpackage;

import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: m72  reason: default package */
public final class m72 {
    public final long A;
    public final List B;
    public final e72 C;
    public final int D;
    public final String E;
    public final List F;
    public final int G;
    public final b72 H;
    public final String I;
    public final jq5 J;
    public final h72 K;
    public final long L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final long P;
    public final int Q;
    public final Map R;
    public final int S;
    public final nl T;
    public final long U;
    public final int V;
    public final long W;
    public final int X;
    public final long Y;
    public final long Z;
    public final long a;
    public final List a0;
    public final l72 b;
    public final long b0;
    public final k72 c;
    public final long c0;
    public final long d;
    public final long d0;
    public final Map e;
    public final zq0 e0;
    public final long f;
    public final pt4 f0;
    public final String g;
    public final long g0;
    public final String h;
    public final long h0;
    public final String i;
    public boolean i0;
    public final long j;
    public final long j0;
    public final long k;
    public final boolean k0;
    public final long l;
    public final long l0;
    public final int m;
    public final String m0;
    public final g72 n;
    public final Map n0;
    public final String o;
    public final i72 o0;
    public final d72 p;
    public final long p0;
    public final z62 q;
    public final long q0;
    public final z62 r;
    public final int r0;
    public final z62 s;
    public final z62 t;
    public final z62 u;
    public final z62 v;
    public final z62 w;
    public final long x;
    public final List y;
    public final List z;

    public m72(w62 w62) {
        this.a = w62.a;
        l72 l72 = w62.b;
        if (l72 == null) {
            this.b = l72.a;
        } else {
            this.b = l72;
        }
        k72 k72 = w62.c;
        if (k72 == null) {
            this.c = k72.a;
        } else {
            this.c = k72;
        }
        this.d = w62.d;
        Map map = w62.e;
        this.e = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f = w62.f;
        this.g = w62.g;
        this.h = w62.h;
        this.i = w62.i;
        this.j = w62.j;
        this.k = w62.k;
        this.l = w62.l;
        this.m = w62.m;
        g72 g72 = w62.n;
        this.n = g72 != null ? g72.b(true) : new g72();
        this.o = w62.o;
        this.p = w62.p;
        this.q = w62.q;
        this.r = w62.r;
        this.s = w62.s;
        this.t = w62.t;
        this.u = w62.u;
        this.v = w62.v;
        this.w = w62.w;
        this.x = w62.x;
        List list = w62.y;
        this.y = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        List list2 = w62.z;
        this.z = list2 != null ? Collections.unmodifiableList(list2) : Collections.emptyList();
        this.A = w62.A;
        List list3 = w62.B;
        this.B = list3 != null ? Collections.unmodifiableList(list3) : Collections.emptyList();
        this.C = w62.D;
        this.D = w62.G;
        this.E = w62.H;
        List list4 = w62.I;
        if (list4 == null) {
            this.F = Collections.emptyList();
        } else {
            this.F = list4;
        }
        this.G = w62.J;
        b72 b72 = w62.K;
        if (b72 == null) {
            this.H = b72.j;
        } else {
            this.H = b72;
        }
        this.r0 = w62.r0;
        this.I = w62.E;
        jq5 jq5 = w62.F;
        this.J = jq5 == null ? jq5.d : jq5;
        this.K = w62.C;
        this.L = w62.L;
        this.M = w62.M;
        this.N = w62.N;
        this.O = w62.O;
        this.P = w62.P;
        this.Q = w62.Q;
        this.R = w62.R;
        this.S = w62.S;
        this.T = w62.T;
        this.U = w62.U;
        this.V = w62.V;
        this.W = w62.W;
        this.X = w62.X;
        this.Y = w62.Y;
        this.Z = w62.Z;
        this.a0 = w62.a0;
        this.b0 = w62.b0;
        this.c0 = w62.c0;
        this.e0 = w62.d0;
        this.d0 = w62.e0;
        this.f0 = w62.f0;
        this.g0 = w62.g0;
        this.h0 = w62.h0;
        this.i0 = w62.i0;
        this.n0 = w62.j0;
        this.j0 = w62.k0;
        this.k0 = w62.l0;
        this.o0 = w62.m0;
        this.l0 = w62.n0;
        this.m0 = w62.o0;
        this.p0 = w62.p0;
        this.q0 = w62.q0;
    }

    public final d72 a() {
        d72 d72 = this.p;
        return d72 != null ? d72 : d72.i;
    }

    public final String b(kl0 kl0, jl0 jl0) {
        String str = this.h;
        if (URLUtil.isContentUrl(str) || URLUtil.isFileUrl(str)) {
            return str;
        }
        if (!cvg.A(str)) {
            return cjf.A(str, kl0, jl0);
        }
        return null;
    }

    public final int c() {
        if (this.b == l72.a) {
            return 2;
        }
        return this.D;
    }

    public final String d() {
        return b(kl0.c, jl0.a);
    }

    public final boolean e() {
        return !cvg.A(this.I);
    }

    public final boolean f() {
        return this.c == k72.a;
    }

    public final boolean g() {
        return this.b == l72.a;
    }

    public final boolean h(long j2) {
        if (this.a == 0 && this.b == l72.a && this.d == j2) {
            Map map = this.e;
            return map.size() == 1 && map.containsKey(Long.valueOf(j2));
        }
    }

    public final boolean i() {
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            if (this.c == k72.x) {
                return false;
            }
        } else if (ordinal != 1 && ordinal != 2) {
            throw new IllegalStateException("invalid chat type");
        } else if (this.a == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [qae, java.util.Map, ts] */
    public final w62 j() {
        w62 w62 = new w62();
        w62.a = this.a;
        w62.b = this.b;
        w62.c = this.c;
        w62.d = this.d;
        Map map = this.e;
        ? qae = new qae(map.size());
        qae.putAll(map);
        w62.e = qae;
        w62.f = this.f;
        w62.g = this.g;
        w62.h = this.h;
        w62.i = this.i;
        w62.j = this.j;
        w62.k = this.k;
        w62.l = this.l;
        w62.m = this.m;
        w62.n = this.n.b(false);
        w62.o = this.o;
        w62.p = this.p;
        w62.q = this.q;
        w62.r = this.r;
        w62.s = this.s;
        w62.t = this.t;
        w62.u = this.u;
        w62.v = this.v;
        w62.w = this.w;
        w62.x = this.x;
        w62.y = new ArrayList(this.y);
        w62.z = new ArrayList(this.z);
        w62.A = this.A;
        w62.B = new ArrayList(this.B);
        w62.C = this.K;
        w62.D = this.C;
        w62.r0 = this.r0;
        w62.E = this.I;
        w62.F = this.J;
        w62.G = this.D;
        w62.H = this.E;
        w62.I = new ArrayList(this.F);
        w62.J = this.G;
        w62.K = this.H;
        w62.L = this.L;
        w62.M = this.M;
        w62.N = this.N;
        w62.O = this.O;
        w62.P = this.P;
        w62.Q = this.Q;
        w62.f(this.R);
        w62.S = this.S;
        w62.T = this.T;
        w62.U = this.U;
        w62.V = this.V;
        w62.W = this.W;
        w62.X = this.X;
        w62.Y = this.Y;
        w62.Z = this.Z;
        w62.a0 = this.a0;
        w62.d0 = this.e0;
        w62.b0 = this.b0;
        w62.c0 = this.c0;
        w62.e0 = this.d0;
        w62.f0 = this.f0;
        w62.g0 = this.g0;
        w62.h0 = this.h0;
        w62.i0 = this.i0;
        w62.j0 = this.n0;
        w62.l0 = this.k0;
        w62.m0 = this.o0;
        w62.k0 = this.j0;
        w62.n0 = this.l0;
        w62.o0 = this.m0;
        w62.p0 = this.p0;
        w62.q0 = this.q0;
        return w62;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatData{serverId=");
        sb.append(this.a);
        sb.append(", type=");
        l72 l72 = this.b;
        sb.append(l72);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", owner=");
        sb.append(this.d);
        sb.append(", participants={");
        l72 l722 = l72.a;
        Map map = this.e;
        sb.append(l72 == l722 ? cvg.E(map.keySet()) : Integer.valueOf(map.size()));
        sb.append("}, title='");
        sb.append(this.g);
        sb.append("', lastMessageId=");
        sb.append(this.j);
        sb.append(", lastEventTime=");
        sb.append(this.k);
        sb.append(", newMessages=");
        sb.append(this.m);
        sb.append(", lastPushMessage=");
        sb.append(this.o0);
        sb.append(", markedAsUnread=");
        sb.append(this.k0);
        sb.append(", chatSettings=");
        sb.append(this.p);
        sb.append(", lastReactionMessageId= ");
        sb.append(this.l0);
        sb.append(", lastReaction");
        return g63.l(sb, this.m0, '}');
    }
}
