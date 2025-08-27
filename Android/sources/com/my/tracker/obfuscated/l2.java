package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerParams;
import java.util.Objects;

public final class l2 implements u2, t2 {
    private static volatile l2 g;
    final i2 a = new i2(h2.a, new jrf(20, (Object) this));
    private y2 b;
    private Context c;
    o2 d;
    m2 e;
    k2 f;

    private l2() {
    }

    public static l2 c() {
        l2 l2Var = g;
        if (l2Var == null) {
            synchronized (l2.class) {
                try {
                    l2Var = g;
                    if (l2Var == null) {
                        l2Var = new l2();
                        g = l2Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return l2Var;
    }

    public static t2 d() {
        return c();
    }

    public static u2 e() {
        return c();
    }

    public synchronized void b() {
        x2.a("TimeSpentModule: onAppGoingBackground");
        if (this.d == null) {
            x2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.a.d();
        }
    }

    public synchronized void a(int i) {
        x2.a("TimeSpentModule: incrementEventTimeSpent id = " + i);
        if (this.d == null) {
            x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called incrementEventTimeSpent id = " + i + ")");
            return;
        }
        this.a.a(i);
    }

    public void b(q2 q2Var, Boolean bool, b3 b3Var) {
        x2.a("TimeSpentModule: core tick DTO collected, sending to repository...");
        if (this.d == null) {
            x2.b("TimeSpentModule: repository was not created, can't store and send this packet, drop");
        } else if (this.f == null) {
            x2.a("TimeSpentModule: packetGenerator was not initialized, drop");
        } else if (this.b == null) {
            x2.a("TimeSpentModule: config is not specified, drop");
        } else {
            m.d(new jh3(19, this, q2Var, bool, b3Var));
        }
    }

    public void a(y2 y2Var, Context context) {
        p2 a2 = p2.a(700, y2Var, context);
        this.d = a2;
        this.e = m2.a(10, y2Var, a2);
        i2 i2Var = this.a;
        Objects.requireNonNull(i2Var);
        rug rug = new rug(i2Var, 0);
        i2 i2Var2 = this.a;
        Objects.requireNonNull(i2Var2);
        y2Var.a((s) rug, (s) new rug(i2Var2, 1));
        MyTrackerParams m = y2Var.m();
        i2 i2Var3 = this.a;
        Objects.requireNonNull(i2Var3);
        rug rug2 = new rug(i2Var3, 2);
        i2 i2Var4 = this.a;
        Objects.requireNonNull(i2Var4);
        m.a(rug2, new rug(i2Var4, 3));
        this.a.a();
        this.f = new k2();
        this.c = context;
        this.b = y2Var;
        x2.a("TimeSpentModule: TimeSpentModule initialized");
    }

    public synchronized void b(int i, boolean z) {
        x2.a("TimeSpentModule: stopTimeSpent id = " + i + ", canUseInBackground = " + z);
        if (this.d == null) {
            x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called stopTimeSpent id = " + i + ")");
            return;
        }
        this.a.b(i, z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(q2 q2Var, Boolean bool, b3 b3Var) {
        if (!r2.a(q2Var)) {
            x2.a("TimeSpentModule: collected dto data is empty, no need to send");
            return;
        }
        if (!r2.c(q2Var)) {
            x2.a("TimeSpentModule: collected dto data is corrupted, sending anyway");
        }
        try {
            b3 b3Var2 = b3Var;
            q2 q2Var2 = q2Var;
            this.d.a(q2Var.c(), this.f.a(bool.booleanValue(), this.b.o(), b3Var2, q2Var2, this.b.h(), this.b.n(), this.c));
            x2.a("TimeSpentModule: successfully stored new time spent tick in repository, notifying sender...");
            this.e.c();
        } catch (Exception unused) {
            x2.b("TimeSpentModule: something went wrong while storing new timeSpentTick in repository, this tick didn't stored and wouldn't be sent");
        }
    }

    public synchronized void a() {
        x2.a("TimeSpentModule: onAppGoingForeground");
        if (this.d == null) {
            x2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.a.e();
        }
    }

    public synchronized void a(int i, boolean z) {
        x2.a("TimeSpentModule: startTimeSpent id = " + i + ", canUseInBackground = " + z);
        if (this.d == null) {
            x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called startTimeSpent id = " + i + ")");
            return;
        }
        this.a.a(i, z);
    }
}
