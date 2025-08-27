package defpackage;

import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: a23  reason: default package */
public final class a23 {
    public static final Set d = SetsKt.setOf(idb.TYPE_DRAFT_SAVE, idb.TYPE_DRAFT_DISCARD);
    public final String a = a23.class.getName();
    public final Lazy b;
    public final Lazy c;

    public a23(Lazy lazy, Lazy lazy2) {
        this.b = lazy;
        this.c = lazy2;
    }

    public final Object a(long j, ContinuationImpl continuationImpl) {
        Object I = ev0.I(((osa) ((gaf) this.b.getValue())).b(), new z13(this, j, (Continuation) null), continuationImpl);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }
}
