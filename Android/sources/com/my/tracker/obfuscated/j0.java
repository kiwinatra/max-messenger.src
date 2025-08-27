package com.my.tracker.obfuscated;

import java.util.ArrayList;

public class j0 extends g2 {
    public ArrayList a(long j, boolean z) {
        x2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(z) + "onTick: start collecting foreground TimeSpents");
        if (z) {
            f(j);
            a(j);
        }
        ArrayList a = a();
        this.b.clear();
        x2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(z) + "onTick: collected " + a.size() + " foreground TimeSpents");
        return a;
    }

    public void b(long j) {
    }

    public void c(long j) {
        x2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "updating all running foreground TimeSpents timestamps (size = " + this.a.size() + ", new timestamp = " + j + ")");
        a(j);
    }

    public void d(long j) {
        f(j);
    }

    public void e(long j) {
    }

    public void f(long j) {
        x2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "slicing all running foreground TimeSpents (size = " + this.a.size() + ")");
        for (int i = 0; i < this.a.size(); i++) {
            a(j, (u1) this.a.valueAt(i));
        }
    }

    public void a(int i, long j, boolean z) {
        if (!z) {
            j = -2147483648L;
        }
        this.a.put(i, new v1(i, j));
        x2.c("TimeSpent: " + a(z) + "registered new foreground TimeSpent with id = " + i);
    }

    public void b(int i, long j, boolean z) {
        u1 u1Var = (u1) this.a.get(i);
        if (u1Var != null) {
            if (z) {
                a(j, u1Var);
            }
            this.a.remove(i);
            x2.c("TimeSpent: " + a(z) + "stopped foreground TimeSpent, id = " + i);
            return;
        }
        x2.c("TimeSpent: " + a(z) + " can't stop foreground TimeSpent with id = " + i + " (reason: not found)");
        throw new Exception();
    }

    public void a(long j, u1 u1Var) {
        d2 a = a(u1Var.a());
        long e = j - u1Var.e();
        if (x2.a()) {
            long b = a.b();
            StringBuilder sb = new StringBuilder("TimeSpentCore: ForegroundTimeSpentsManager: ");
            sb.append(a(true));
            sb.append("slicing foreground TimeSpent, id = ");
            sb.append(u1Var.a());
            tr1.v(sb, ", ", b, "(existed ms) + ");
            sb.append(e);
            tr1.v(sb, "(add ms) = ", b + e, "(total ms), timestamp = ");
            sb.append(j);
            x2.a(sb.toString());
        }
        a.c(e);
    }
}
