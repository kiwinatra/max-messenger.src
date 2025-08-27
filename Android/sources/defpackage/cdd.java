package defpackage;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: cdd  reason: default package */
public final class cdd {
    public final String a = cdd.class.getName();
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public cdd(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
    }

    public final Object a(long j, String str, long j2, long j3, boolean z, Continuation continuation) {
        Object I = ev0.I(((osa) ((gaf) this.d.getValue())).b(), new bdd(this, j3, j2, str, j, z, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }
}
