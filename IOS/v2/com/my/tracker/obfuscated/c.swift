package com.my.tracker.obfuscated;

import java.util.ArrayList;

public class c extends g2 {
    public ArrayList a(long j, boolean z) {
        x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z) + "onTick: start collecting anytime TimeSpents");
        b(j, z);
        a(j);
        ArrayList a = a();
        this.b.clear();
        x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z) + "onTick: collected " + a.size() + " anytime TimeSpents");
        return a;
    }

    public void b(long j) {
        x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(false) + "updating all running anytime TimeSpents timestamps (size = " + this.a.size() + ", new timestamp = " + j + ")");
        a(j);
    }

    public void c(long j) {
        x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(true) + "updating all running anytime TimeSpents timestamps (size = " + this.a.size() + ", new timestamp = " + j + ")");
        a(j);
    }

    public void d(long j) {
        b(j, true);
    }

    public void e(long j) {
        b(j, false);
    }

    public void a(int i, long j, boolean z) {
        this.a.put(i, new v1(i, j));
        x2.c("TimeSpent: " + a(z) + "registered new anytime TimeSpent with id = " + i);
    }

    public void b(long j, boolean z) {
        x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z) + "slicing all running anytime TimeSpents (size = " + this.a.size() + ")");
        for (int i = 0; i < this.a.size(); i++) {
            a(j, (u1) this.a.valueAt(i), z);
        }
    }

    public void a(long j, u1 u1Var, boolean z) {
        d2 a = a(u1Var.a());
        long e = j - u1Var.e();
        if (x2.a()) {
            long b = z ? a.b() : a.c();
            StringBuilder sb = new StringBuilder("TimeSpentCore: AnytimeTimeSpentsManager: ");
            sb.append(a(z));
            sb.append("slicing anytime TimeSpent, id = ");
            sb.append(u1Var.a());
            tr1.v(sb, ", ", b, "(existed ms) + ");
            sb.append(e);
            tr1.v(sb, "(add ms) = ", b + e, "(total ms), timestamp = ");
            sb.append(j);
            x2.a(sb.toString());
        }
        if (z) {
            a.c(e);
        } else {
            a.a(e);
        }
    }

    public void b(int i, long j, boolean z) {
        u1 u1Var = (u1) this.a.get(i);
        if (u1Var != null) {
            a(j, u1Var, z);
            this.a.remove(i);
            x2.c("TimeSpent: " + a(z) + "stopped anytime TimeSpent, id = " + i);
            return;
        }
        x2.c("TimeSpent: " + a(z) + "can't stop anytime TimeSpent with id = " + i + " (reason: not found)");
        throw new Exception();
    }
}
