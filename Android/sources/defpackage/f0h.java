package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: f0h  reason: default package */
public final class f0h implements s6h, vma, lma, hma {
    public final /* synthetic */ int a;
    public final Executor b;
    public final mx3 c;
    public final s7h o;

    public /* synthetic */ f0h(Executor executor, mx3 mx3, s7h s7h, int i) {
        this.a = i;
        this.b = executor;
        this.c = mx3;
        this.o = s7h;
    }

    public void a(Object obj) {
        this.o.n(obj);
    }

    public final void b(Task task) {
        switch (this.a) {
            case 0:
                this.b.execute(new tvg((s6h) this, task, 1));
                return;
            default:
                this.b.execute(new r1h((s6h) this, task, 0));
                return;
        }
    }

    public void onFailure(Exception exc) {
        this.o.m(exc);
    }

    public void r() {
        this.o.o();
    }
}
