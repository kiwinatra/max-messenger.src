package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: uz4  reason: default package */
public final class uz4 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public uz4(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    public final Object a(long j, long j2, CharSequence charSequence, List list, boolean z, Continuation continuation) {
        Object I = ev0.I(((osa) ((gaf) this.c.getValue())).b(), new tz4(this, j, j2, charSequence, z, list, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }
}
