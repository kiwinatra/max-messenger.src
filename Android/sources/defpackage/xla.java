package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* renamed from: xla  reason: default package */
public abstract class xla {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public Function0 c;

    public xla(boolean z) {
        this.a = z;
    }

    public void a() {
    }

    public abstract void b();

    public void c(we0 we0) {
    }

    public void d() {
    }

    public final void e() {
        for (jw1 cancel : this.b) {
            cancel.cancel();
        }
    }

    public final void f(boolean z) {
        this.a = z;
        Function0 function0 = this.c;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
