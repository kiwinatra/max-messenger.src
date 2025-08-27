package defpackage;

import com.my.tracker.obfuscated.w1;

/* renamed from: avg  reason: default package */
public final /* synthetic */ class avg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w1 b;

    public /* synthetic */ avg(w1 w1Var, int i) {
        this.a = i;
        this.b = w1Var;
    }

    public final void run() {
        int i = this.a;
        w1 w1Var = this.b;
        switch (i) {
            case 0:
                w1Var.a();
                return;
            default:
                w1Var.b();
                return;
        }
    }
}
