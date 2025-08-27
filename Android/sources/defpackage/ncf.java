package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: ncf  reason: default package */
public final class ncf implements lcf {
    public final /* synthetic */ kw1 a;

    public ncf(lw1 lw1) {
        this.a = lw1;
    }

    public final void e(ibf ibf) {
        kw1 kw1 = this.a;
        if (kw1.isActive()) {
            kw1.resumeWith(Result.m23constructorimpl(ibf));
        }
    }

    public final void h(qaf qaf) {
        kw1 kw1 = this.a;
        if (kw1.isActive()) {
            Result.Companion companion = Result.Companion;
            kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(new TamErrorException(qaf))));
        }
    }
}
