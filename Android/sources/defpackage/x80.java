package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;

/* renamed from: x80  reason: default package */
public final class x80 {
    public final Lazy a;
    public final Lazy b;

    public x80(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public final Object a(String str, w80 w80, Continuation continuation) {
        ((nd) this.a.getValue()).e("ACTION_AUTH_GET_CODE");
        yt ytVar = new yt(x3b.AUTH_REQUEST, 8);
        ytVar.t("phone", str);
        ytVar.t("type", w80.a);
        return ((ocf) ((coa) this.b.getValue()).a.getValue()).e(ytVar, continuation);
    }
}
