package defpackage;

import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.i2;
import com.my.tracker.obfuscated.s;

/* renamed from: rug  reason: default package */
public final /* synthetic */ class rug implements s {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ rug(i2 i2Var, int i) {
        this.a = i;
        this.b = i2Var;
    }

    public final void a(Object obj) {
        int i = this.a;
        i2 i2Var = this.b;
        switch (i) {
            case 0:
                i2Var.a((Boolean) obj);
                return;
            case 1:
                i2Var.b((Boolean) obj);
                return;
            case 2:
                i2Var.b((b3) obj);
                return;
            default:
                i2Var.a((b3) obj);
                return;
        }
    }
}
