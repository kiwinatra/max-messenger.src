package com.my.tracker.obfuscated;

public final class f2 implements d2 {
    private final int a;
    private long b;
    private long c;

    public f2(int i) {
        this(i, 0, 0);
    }

    public void a(long j) {
        this.c += j;
    }

    public long b() {
        return this.b;
    }

    public void c(long j) {
        this.b += j;
    }

    public void g() {
        this.b = 0;
        this.c = 0;
    }

    /* renamed from: h */
    public f2 clone() {
        try {
            f2 f2Var = (f2) super.clone();
            f2Var.g();
            f2Var.a(this.c);
            f2Var.c(this.b);
            return f2Var;
        } catch (CloneNotSupportedException unused) {
            return new f2(this.a, this.b, this.c);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb;
        String m = wj6.m(new StringBuilder("total time = "), this.b + this.c, " ms : ");
        String str2 = "foreground = " + this.b;
        if (this.a == 0) {
            str = "[App Time   TS] id = " + this.a;
            sb = new StringBuilder("useful background = ");
        } else {
            str = "[Time Based TS] id = " + this.a;
            sb = new StringBuilder("background = ");
        }
        sb.append(this.c);
        return str + ", " + m + str2 + ", " + sb.toString();
    }

    public f2(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public int a() {
        return this.a;
    }

    public long c() {
        return this.c;
    }
}
