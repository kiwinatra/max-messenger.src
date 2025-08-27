package defpackage;

import com.my.tracker.obfuscated.p0;

/* renamed from: uug  reason: default package */
public final /* synthetic */ class uug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ uug(p0 p0Var, int i) {
        this.a = i;
        this.b = p0Var;
    }

    public final void run() {
        int i = this.a;
        p0 p0Var = this.b;
        switch (i) {
            case 0:
                p0.a(p0Var);
                return;
            default:
                p0Var.c();
                return;
        }
    }
}
