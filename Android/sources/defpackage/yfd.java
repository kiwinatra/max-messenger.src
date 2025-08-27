package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: yfd  reason: default package */
public abstract class yfd {
    public static final String a = h88.V("Schedulers");

    public static void a(ve3 ve3, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            ypg y = workDatabase.y();
            workDatabase.c();
            try {
                ArrayList g = y.g(ve3.h);
                ArrayList f = y.f();
                if (g.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = g.iterator();
                    while (it.hasNext()) {
                        y.o(currentTimeMillis, ((xpg) it.next()).a);
                    }
                }
                workDatabase.r();
                workDatabase.l();
                if (g.size() > 0) {
                    xpg[] xpgArr = (xpg[]) g.toArray(new xpg[g.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        mfd mfd = (mfd) it2.next();
                        if (mfd.c()) {
                            mfd.e(xpgArr);
                        }
                    }
                }
                if (f.size() > 0) {
                    xpg[] xpgArr2 = (xpg[]) f.toArray(new xpg[f.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        mfd mfd2 = (mfd) it3.next();
                        if (!mfd2.c()) {
                            mfd2.e(xpgArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
    }
}
