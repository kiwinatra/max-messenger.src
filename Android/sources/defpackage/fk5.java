package defpackage;

import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: fk5  reason: default package */
public final class fk5 implements r74 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fk5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    private final void f(i0 i0Var) {
    }

    public final void a(i0 i0Var) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                kw1 kw1 = (kw1) obj;
                if (!kw1.isCancelled() && i0Var.h()) {
                    Result.Companion companion = Result.Companion;
                    kw1.resumeWith(Result.m23constructorimpl(i0Var.e()));
                    return;
                }
                return;
            default:
                v4d v4d = (v4d) obj;
                if (i0Var.f()) {
                    if (i0Var == v4d.h) {
                        v4d.l((Object) null, false, i0Var.a);
                        return;
                    }
                    return;
                } else if (i0Var.h()) {
                    v4d.getClass();
                    return;
                } else {
                    return;
                }
        }
    }

    public final void b(i0 i0Var) {
        switch (this.a) {
            case 0:
                return;
            default:
                v4d v4d = (v4d) this.b;
                if (i0Var == v4d.h) {
                    v4d.k(i0Var.d());
                    return;
                }
                return;
        }
    }

    public final void c(i0 i0Var) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                kw1 kw1 = (kw1) obj;
                if (kw1.isActive()) {
                    Throwable c = i0Var.c();
                    if (c == null) {
                        c = new IllegalStateException("fail");
                    }
                    Result.Companion companion = Result.Companion;
                    kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(c)));
                    return;
                }
                return;
            default:
                ((v4d) obj).getClass();
                return;
        }
    }

    public final void d() {
        switch (this.a) {
            case 0:
                kw1 kw1 = (kw1) this.b;
                if (kw1.isActive()) {
                    kw1.q((Throwable) null);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
