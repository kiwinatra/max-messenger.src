package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;

/* renamed from: bt7  reason: default package */
public final class bt7 implements rh3 {
    public final rh3 a;
    public final /* synthetic */ q4 b;

    public bt7(q4 q4Var, Context context, ExecutorService executorService, er7 er7, Lazy lazy) {
        this.b = q4Var;
        this.a = new xh3(context, executorService, er7, lazy);
    }

    public final boolean a() {
        return this.a.a();
    }

    public final mi3 b() {
        return this.a.b();
    }

    public final void c(qh3 qh3) {
        this.a.c(qh3);
    }

    public final void d(qh3 qh3) {
        this.a.d(qh3);
    }

    public final boolean e() {
        return this.a.e();
    }

    public final boolean f() {
        if (this.a.f()) {
            return true;
        }
        ((fn4) this.b.g(fn4.class)).e();
        return false;
    }

    public final void invalidate() {
        this.a.invalidate();
    }
}
