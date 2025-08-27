package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;

/* renamed from: p49  reason: default package */
public final class p49 extends SuspendLambda implements Function2 {
    public final /* synthetic */ r49 a;
    public final /* synthetic */ Collection b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p49(r49 r49, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.a = r49;
        this.b = collection;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p49(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p49) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        r49 r49 = this.a;
        Set set = SequencesKt.toSet(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence((Iterable) r49.w0.a.getValue()), new vq7(12, (Object) this.b)), new wg7(14)));
        r49.Y = set;
        m39 m39 = new m39(r49.b, r49.c, set);
        t39 t39 = r49.x;
        t39.getClass();
        ev0.v(t39.b, (CoroutineContext) null, (f14) null, new s39(t39, m39, (Continuation) null), 3);
        return Unit.INSTANCE;
    }
}
