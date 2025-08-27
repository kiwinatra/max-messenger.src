package com.my.tracker.obfuscated;

public final class i {
    final u1 a = new v1(0, -2147483648L);
    final d2 b = new f2(0);
    int c = 0;

    private String a(String str, String str2) {
        return g63.j("app state changed ", str, "-> ", str2);
    }

    public boolean b() {
        int i = this.c;
        return i == 1 || i == 0;
    }

    public boolean c() {
        return this.c == 3;
    }

    public void d(long j) {
        f(j);
    }

    public void e(long j) {
        if (this.c == 1) {
            f(j);
        }
    }

    public void f(long j) {
        long e = j - this.a.e();
        if (x2.a()) {
            long b2 = this.c == 3 ? this.b.b() : this.b.c();
            StringBuilder sb = new StringBuilder("TimeSpentCore: AppTimeManager: ");
            sb.append(a());
            sb.append("slicing app TimeSpent, ");
            sb.append(b2);
            tr1.v(sb, "(existed ms) + ", e, "(add ms) = ");
            sb.append(b2 + e);
            sb.append("(total ms), timestamp = ");
            sb.append(j);
            x2.a(sb.toString());
        }
        int i = this.c;
        if (i == 1) {
            this.b.a(e);
        } else if (i != 3) {
            x2.a("TimeSpentCore: AppTimeManager: trying to slice app time, but now is useless background state - skip");
        } else {
            this.b.c(e);
        }
    }

    public void g(long j) {
        f(j);
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
        this.c = 0;
    }

    public void h(long j) {
        this.a.b(j);
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
        this.c = 1;
    }

    public void b(long j) {
        if (this.c == 1) {
            this.a.b(j);
        }
    }

    public void c(long j) {
        this.a.b(j);
    }

    public void d() {
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[FOREGROUND]"));
        this.c = 3;
    }

    public e2 a(long j) {
        x2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: start collecting app TimeSpent");
        if (this.c != 0) {
            f(j);
            this.a.b(j);
        }
        d2 clone = this.b.clone();
        this.b.g();
        x2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: collected app TimeSpent (foregroundMs = " + clone.b() + ", usefulBackgroundMs = " + clone.c() + ")");
        if (clone.b() == 0 && clone.c() == 0) {
            return null;
        }
        return clone;
    }

    private String a() {
        int i = this.c;
        if (i == 0) {
            return "[BACKGROUND(useless)] ";
        }
        if (i != 1) {
            return i != 3 ? "" : "[FOREGROUND] ";
        }
        return "[BACKGROUND(useful)] ";
    }

    public void a(int i) {
        int i2;
        if (i == 0) {
            x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
            i2 = 0;
        } else {
            x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
            i2 = 1;
        }
        this.c = i2;
    }
}
