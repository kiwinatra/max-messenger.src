package defpackage;

import android.content.SharedPreferences;
import kotlin.Lazy;

/* renamed from: sdg  reason: default package */
public final /* synthetic */ class sdg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ udg b;

    public /* synthetic */ sdg(udg udg, int i) {
        this.a = i;
        this.b = udg;
    }

    public final void run() {
        boolean z = true;
        udg udg = this.b;
        switch (this.a) {
            case 0:
                vdg vdg = (vdg) udg.a.getValue();
                edb edb = (edb) udg.e.getValue();
                edb.getClass();
                String[] strArr = edb.d;
                int i = 0;
                while (true) {
                    if (i < 2) {
                        String str = strArr[i];
                        fj fjVar = edb.c;
                        if (((SharedPreferences) ((Lazy) fjVar.c).getValue()).getBoolean(str, false) || q8.d(edb.a, str) != 0) {
                            i++;
                        } else {
                            z68.c("udg", "forceContactsSync", new Object[0]);
                            String[] strArr2 = edb.d;
                            boolean b2 = edb.b(edb.f);
                            SharedPreferences.Editor edit = ((SharedPreferences) ((Lazy) fjVar.c).getValue()).edit();
                            for (int i2 = 0; i2 < 2; i2++) {
                                edit.putBoolean(strArr2[i2], b2);
                            }
                            edit.apply();
                        }
                    } else {
                        z = false;
                    }
                }
                vdg.d(z);
                return;
            case 1:
                udg.getClass();
                ivb.y.w.a(udg.m);
                return;
            default:
                ((vdg) udg.a.getValue()).c();
                return;
        }
    }
}
