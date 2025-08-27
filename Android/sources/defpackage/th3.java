package defpackage;

import kotlin.Result;
import kotlin.Unit;

/* renamed from: th3  reason: default package */
public final class th3 implements qh3 {
    public final /* synthetic */ rh3 a;
    public final /* synthetic */ kw1 b;

    public th3(rh3 rh3, lw1 lw1) {
        this.a = rh3;
        this.b = lw1;
    }

    public final void a() {
        rh3 rh3 = this.a;
        if (rh3.e()) {
            rh3.d(this);
            Result.Companion companion = Result.Companion;
            this.b.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
        }
    }

    public final void b() {
        rh3 rh3 = this.a;
        if (rh3.e()) {
            rh3.d(this);
            Result.Companion companion = Result.Companion;
            this.b.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
        }
    }
}
