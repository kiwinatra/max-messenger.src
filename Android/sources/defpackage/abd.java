package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: abd  reason: default package */
public final class abd implements ya3, gce, pi8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw1 b;

    public /* synthetic */ abd(lw1 lw1, int i) {
        this.a = i;
        this.b = lw1;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 1:
                this.b.resumeWith(Result.m23constructorimpl(obj));
                return;
            default:
                this.b.resumeWith(Result.m23constructorimpl(obj));
                return;
        }
    }

    public void b() {
        kw1 kw1 = this.b;
        switch (this.a) {
            case 0:
                Result.Companion companion = Result.Companion;
                kw1.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
                return;
            default:
                kw1.resumeWith(Result.m23constructorimpl((Object) null));
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                ((lw1) this.b).k(new jkb(14, (Object) mq4));
                return;
            case 1:
                ((lw1) this.b).k(new jkb(14, (Object) mq4));
                return;
            default:
                ((lw1) this.b).k(new jkb(14, (Object) mq4));
                return;
        }
    }

    public final void onError(Throwable th) {
        kw1 kw1 = this.b;
        switch (this.a) {
            case 0:
                Result.Companion companion = Result.Companion;
                kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
                return;
            case 1:
                Result.Companion companion2 = Result.Companion;
                kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
                return;
            default:
                Result.Companion companion3 = Result.Companion;
                kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
                return;
        }
    }
}
