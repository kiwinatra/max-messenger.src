package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ob2  reason: default package */
public final class ob2 implements ComponentCallbacks {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ob2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Set<we3> set;
        switch (this.a) {
            case 0:
                vb2 vb2 = (vb2) this.b;
                vb2.w.i(-1);
                vb2.y.i(-1);
                return;
            case 1:
                xe3 xe3 = (xe3) this.b;
                int diff = configuration.diff(xe3.b);
                xe3.b = new Configuration(configuration);
                ConcurrentHashMap concurrentHashMap = xe3.a;
                for (Integer num : concurrentHashMap.keySet()) {
                    if (!((num.intValue() & diff) == 0 || (set = (Set) concurrentHashMap.get(num)) == null)) {
                        for (we3 a2 : set) {
                            a2.a();
                        }
                    }
                }
                return;
            default:
                ((ox0) this.b).getClass();
                int i = configuration.uiMode & 48;
                p53 p53 = i != 16 ? i != 32 ? p53.c : p53.b : p53.a;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    w78 w78 = w78.o;
                    String hexString = Integer.toHexString(configuration.uiMode & 48);
                    a67.d(w78, "SystemThemeObserver", "onConfigurationChanged scheme=" + p53 + ", uiMode=0x" + hexString, (Throwable) null);
                }
                xme xme = (xme) ((ox0) this.b).c;
                xme.getClass();
                xme.m((Object) null, p53);
                return;
        }
    }

    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                vb2 vb2 = (vb2) this.b;
                vb2.w.i(-1);
                vb2.y.i(-1);
                return;
            default:
                return;
        }
    }

    public ob2(xe3 xe3, Context context) {
        this.a = 1;
        this.b = xe3;
    }
}
