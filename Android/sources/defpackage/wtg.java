package defpackage;

import com.my.tracker.obfuscated.e0;

/* renamed from: wtg  reason: default package */
public final /* synthetic */ class wtg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ wtg(e0 e0Var, int i) {
        this.a = i;
        this.b = e0Var;
    }

    public final void run() {
        int i = this.a;
        e0 e0Var = this.b;
        switch (i) {
            case 0:
                e0Var.e();
                return;
            default:
                e0Var.f();
                return;
        }
    }
}
