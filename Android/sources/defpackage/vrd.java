package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: vrd  reason: default package */
public final class vrd {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public vrd(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
    }

    public final Object a(long j, CharSequence charSequence, List list, boolean z, Long l, Continuation continuation) {
        Object I = ev0.I(((osa) ((gaf) this.a.getValue())).b(), new urd(list, z, charSequence, this, j, l, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }
}
