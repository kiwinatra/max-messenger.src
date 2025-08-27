package defpackage;

import java.util.EnumSet;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: cjb  reason: default package */
public final class cjb extends xag {
    public final Lazy b;
    public final etc c;

    public cjb(fua fua, gaf gaf, jua jua) {
        Lazy lazy = rjd.F1;
        this.b = lazy;
        xme a = f6e.a(CollectionsKt.listOf(new y16("all.chat.folder", jua.a.getString(qad.E2), (CharSequence) null, r14.b, EnumSet.allOf(a26.class))));
        this.c = new etc(a);
        osa osa = (osa) gaf;
        bs0.K(bs0.F(new ps5(bs0.F(new i21(((ia2) ((u82) lazy.getValue())).j(), fua.f, new x2(this, (Continuation) null, 22), 4), osa.a()), new zqa(a, 8), 5), osa.c()), this.a);
    }
}
