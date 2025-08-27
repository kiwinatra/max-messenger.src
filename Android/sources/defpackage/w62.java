package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: w62  reason: default package */
public final class w62 {
    public long A;
    public List B;
    public h72 C;
    public e72 D;
    public String E;
    public jq5 F;
    public int G;
    public String H;
    public List I;
    public int J;
    public b72 K;
    public long L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;
    public int Q;
    public ts R = new qae(0);
    public int S;
    public nl T;
    public long U;
    public int V;
    public long W;
    public int X;
    public long Y;
    public long Z;
    public long a;
    public List a0;
    public l72 b;
    public long b0;
    public k72 c;
    public long c0;
    public long d;
    public zq0 d0 = zq0.c;
    public Map e;
    public long e0;
    public long f;
    public pt4 f0;
    public String g;
    public long g0;
    public String h;
    public long h0;
    public String i;
    public boolean i0;
    public long j;
    public Map j0;
    public long k;
    public long k0;
    public long l;
    public boolean l0;
    public int m;
    public i72 m0 = null;
    public g72 n = new g72();
    public long n0;
    public String o;
    public String o0;
    public d72 p;
    public long p0;
    public z62 q;
    public long q0;
    public z62 r;
    public int r0 = 2;
    public z62 s;
    public z62 t;
    public z62 u;
    public z62 v;
    public z62 w;
    public long x;
    public List y;
    public List z;

    public final void a(x62 x62) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(x62);
    }

    public final m72 b() {
        return new m72(this);
    }

    public final d72 c() {
        d72 d72 = this.p;
        return d72 != null ? d72 : d72.i;
    }

    public final List d() {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        return this.B;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [qae, java.util.Map] */
    public final Map e() {
        if (this.e == null) {
            this.e = new qae(2);
        }
        return this.e;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qae, ts] */
    /* JADX WARNING: type inference failed for: r3v1, types: [qae, ts] */
    public final void f(Map map) {
        if (map == null) {
            this.R = new qae(2);
            return;
        }
        ? qae = new qae(map.size());
        this.R = qae;
        qae.putAll(map);
    }
}
