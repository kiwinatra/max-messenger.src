package defpackage;

import com.my.tracker.obfuscated.i2;

/* renamed from: nug  reason: default package */
public final /* synthetic */ class nug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ nug(i2 i2Var, int i) {
        this.a = i;
        this.b = i2Var;
    }

    public final void run() {
        int i = this.a;
        i2 i2Var = this.b;
        switch (i) {
            case 0:
                i2Var.f();
                return;
            default:
                i2Var.c();
                return;
        }
    }
}
