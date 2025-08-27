package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.y2;
import java.util.Map;

public final class k2 extends q1 {
    private final q c = new q(65536);

    public synchronized byte[] a(boolean z, y2.a aVar, b3 b3Var, q2 q2Var, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        byte[] c2;
        y2.a aVar2 = aVar;
        synchronized (this) {
            if (context != null) {
                try {
                    f0 a = g0.a().a(aVar2.m, aVar2.g, aVar2.e, z, str, okHttpClientProvider, context);
                    this.c.a();
                    a(this.c, z, aVar, b3Var, a, q2Var);
                    c2 = this.c.c();
                    this.c.d();
                    a();
                } catch (Exception e) {
                    x2.b("TimeSpentMessageBuilder: something went wrong while generating tick packet", e);
                    throw new Exception(e);
                }
            } else {
                x2.b("TimeSpentMessageBuilder: context is empty");
                throw new Exception("TimeSpentMessageBuilder: context is empty");
            }
        }
        return c2;
    }

    private static void a(r1 r1Var, v[] vVarArr, q qVar) {
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                qVar.a();
                qVar.a(1, vVar.a());
                qVar.a(2, vVar.d());
                r1Var.a(38, qVar);
            }
        }
    }

    private static void a(r1 r1Var, e2 e2Var, e2[] e2VarArr, q qVar) {
        if (e2Var != null) {
            qVar.a();
            qVar.a(1, e2Var.a());
            qVar.a(2, e2Var.b());
            qVar.a(3, e2Var.c());
            r1Var.a(39, qVar);
        }
        if (e2VarArr != null) {
            for (e2 e2Var2 : e2VarArr) {
                qVar.a();
                qVar.a(1, e2Var2.a());
                qVar.a(2, e2Var2.b());
                qVar.a(3, e2Var2.c());
                r1Var.a(39, qVar);
            }
        }
    }

    private void a(r1 r1Var, boolean z, y2.a aVar, b3 b3Var, f0 f0Var, q2 q2Var) {
        String str;
        String str2;
        Map map = aVar.k.e;
        if (z || map.isEmpty()) {
            str2 = null;
            str = null;
        } else {
            str = (String) map.get("mac");
            str2 = (String) map.get("android_id");
        }
        r1Var.a(1, MyTracker.VERSION);
        r1Var.a(2, aVar.a);
        r1Var.a(3, q2Var.c());
        q1.a(r1Var, f0Var.a, f0Var.c, this.a, this.b);
        q1.a(r1Var, z, b3Var, this.a);
        q1.a(r1Var, str2, str, f0Var, this.a, this.b);
        if (!z) {
            q1.a(r1Var, f0Var.f, f0Var.b, f0Var.c, this.a);
            q1.a(r1Var, f0Var.g, this.a);
        }
        a(r1Var, q2Var.b(), this.a);
        a(r1Var, q2Var.a(), q2Var.d(), this.a);
    }
}
