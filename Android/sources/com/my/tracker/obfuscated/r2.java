package com.my.tracker.obfuscated;

public abstract class r2 {
    public static boolean a(q2 q2Var) {
        e2 a = q2Var.a();
        if (a != null && a.b() > 0) {
            return true;
        }
        e2[] d = q2Var.d();
        if (d != null && d.length > 0) {
            return true;
        }
        v[] b = q2Var.b();
        return b != null && b.length > 0;
    }

    private static boolean b(q2 q2Var) {
        e2 a = q2Var.a();
        if (a == null) {
            return true;
        }
        boolean z = a.c() > 0;
        boolean z2 = q2Var.d() == null || q2Var.d().length == 0;
        if (!z || !z2) {
            return a.a() == 0;
        }
        return false;
    }

    public static boolean c(q2 q2Var) {
        if (!a(q2Var.c())) {
            return false;
        }
        return b(q2Var);
    }

    private static boolean a(long j) {
        if (j > 0) {
            return true;
        }
        x2.a("TimeSpentTickDtoValidator: dto timestamp should be > 0, actual = " + j);
        return false;
    }
}
