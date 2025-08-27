package defpackage;

import java.util.concurrent.Executor;

/* renamed from: du1  reason: default package */
public final class du1 implements tk3 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ tk3 b;
    public final /* synthetic */ eu1 c;

    public du1(eu1 eu1, Executor executor, a0 a0Var) {
        this.c = eu1;
        this.a = executor;
        this.b = a0Var;
    }

    public final void accept(Object obj) {
        h8g h8g = (h8g) obj;
        if (h8g instanceof c8g) {
            if (!ev0.s()) {
                this.a.execute(new pr1(4, this));
            } else {
                eu1 eu1 = this.c;
                nyc nyc = (nyc) eu1.h.remove(this);
                if (nyc != null && eu1.g == nyc) {
                    eu1.g = null;
                }
            }
        }
        this.b.accept(h8g);
    }
}
