package defpackage;

import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.e0;
import com.my.tracker.obfuscated.s;

/* renamed from: dtg  reason: default package */
public final /* synthetic */ class dtg implements s {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ dtg(e0 e0Var, int i) {
        this.a = i;
        this.b = e0Var;
    }

    public final void a(Object obj) {
        int i = this.a;
        e0 e0Var = this.b;
        switch (i) {
            case 0:
                e0Var.b((Boolean) obj);
                return;
            case 1:
                e0Var.c((Boolean) obj);
                return;
            case 2:
                e0Var.b((String) obj);
                return;
            case 3:
                e0Var.a((b3) obj);
                return;
            default:
                e0Var.c((b3) obj);
                return;
        }
    }
}
