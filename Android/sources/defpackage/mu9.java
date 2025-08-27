package defpackage;

/* renamed from: mu9  reason: default package */
public final class mu9 {
    public final lpf a;
    public final bqf b;
    public final zpf c;
    public final etf d;
    public int e;

    public mu9(lpf lpf, bqf bqf, zpf zpf) {
        this.a = lpf;
        this.b = bqf;
        this.c = zpf;
        this.d = "audio/true-hd".equals(lpf.f.n) ? new etf(1) : null;
    }
}
