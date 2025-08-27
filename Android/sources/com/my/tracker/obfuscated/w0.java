package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.obfuscated.o1;

public abstract class w0 {
    public static void a(y2 y2Var, e0 e0Var, w1 w1Var, Context context) {
        m.a(new jh3(21, context, y2Var, e0Var, w1Var));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, y2 y2Var, e0 e0Var, w1 w1Var) {
        String str;
        String str2;
        boolean z;
        String str3;
        y2 y2Var2;
        long j;
        Context context2;
        e0 e0Var2 = e0Var;
        w1 w1Var2 = w1Var;
        PackageInfo a = t.a(context);
        if (a != null) {
            str2 = Long.toString(a.getLongVersionCode());
            str = a.versionName;
        } else {
            str2 = "";
            str = str2;
        }
        p1 a2 = p1.a(context);
        String a3 = a2.a();
        String g = y2Var.g();
        if (!g.equals(a2.c())) {
            x2.a("InstallHandler: tracking install");
            if (a != null) {
                j = v2.b(a.firstInstallTime);
                context2 = context;
                y2Var2 = y2Var;
            } else {
                context2 = context;
                y2Var2 = y2Var;
                j = 0;
            }
            o1 a4 = o1.a(e0Var2, y2Var2, context2);
            o1.a a5 = a4.a();
            e0Var2.a(j, t.b(context), a5);
            if (a5 == null) {
                a4.c();
            }
            a2.e(g);
            z = true;
        } else {
            Context context3 = context;
            y2 y2Var3 = y2Var;
            if (!str2.equals(a3)) {
                if (a3.isEmpty()) {
                    str3 = "InstallHandler: tracking update";
                } else {
                    str3 = "InstallHandler: tracking update from" + a3 + " to " + str2;
                }
                x2.a(str3);
                e0Var.a(a2.f(), a3, str, str2, t.b(context));
                z = true;
            } else {
                z = false;
            }
        }
        long j2 = a2.j();
        long a6 = v2.a();
        String b = y2Var.b();
        if (!TextUtils.isEmpty(b)) {
            if (a6 - j2 < 604800 || j2 == 0) {
                x2.a("InstallHandler: tracking apkPreinstallParams");
                e0Var2.d(b);
            } else {
                x2.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (!z) {
            x2.a("InstallHandler: no install/update");
            w1Var2.a(j2);
            return;
        }
        if (z) {
            a2.b(a6);
            w1Var2.a(a6);
        } else if (z) {
            w1Var2.a(j2);
        }
        a2.d(str2);
        a2.g(str);
        a2.c(a6);
    }
}
