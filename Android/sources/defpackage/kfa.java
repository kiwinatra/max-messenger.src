package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: kfa  reason: default package */
public final class kfa extends ej0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw1 b;

    public /* synthetic */ kfa(lw1 lw1, int i) {
        this.a = i;
        this.b = lw1;
    }

    public final void d() {
        switch (this.a) {
            case 0:
                kw1 kw1 = this.b;
                if (kw1.isActive()) {
                    kw1.q(new Throwable("Cancelled with fresco pipeline"));
                    return;
                }
                return;
            default:
                kw1 kw12 = this.b;
                if (kw12.isActive()) {
                    kw12.q(new Throwable("Cancelled with fresco pipeline"));
                    return;
                }
                return;
        }
    }

    public final void e(i0 i0Var) {
        kw1 kw1 = this.b;
        switch (this.a) {
            case 0:
                if (kw1.isActive()) {
                    Result.Companion companion = Result.Companion;
                    kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(new Throwable("Fetch failed", i0Var.c()))));
                    return;
                }
                return;
            default:
                kw1.resumeWith(Result.m23constructorimpl((Object) null));
                return;
        }
    }

    public final void f(i0 i0Var) {
        kw1 kw1 = this.b;
        switch (this.a) {
            case 0:
                if (kw1.isActive()) {
                    Result.Companion companion = Result.Companion;
                    kw1.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
                    return;
                }
                return;
            default:
                if (!i0Var.h()) {
                    kw1.resumeWith(Result.m23constructorimpl((Object) null));
                    return;
                }
                y33 o = y33.o((y33) i0Var.e());
                if (o == null) {
                    kw1.resumeWith(Result.m23constructorimpl((Object) null));
                    return;
                }
                Result.Companion companion2 = Result.Companion;
                kw1.resumeWith(Result.m23constructorimpl(o.e0()));
                return;
        }
    }
}
