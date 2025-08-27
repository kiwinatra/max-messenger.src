package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: ubf  reason: default package */
public final class ubf implements lcf {
    public final /* synthetic */ ube a;

    public ubf(pbe pbe) {
        this.a = pbe;
    }

    public final void e(ibf ibf) {
        ube ube = this.a;
        if (!((pbe) ube).f()) {
            ((pbe) ube).a(ibf);
        }
    }

    public final void h(qaf qaf) {
        ube ube = this.a;
        if (!((pbe) ube).f()) {
            ((pbe) ube).onError(new TamErrorException(qaf));
        }
    }
}
