package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

/* renamed from: f48  reason: default package */
public final class f48 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ h48 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f48(h48 h48, Continuation continuation) {
        super(2, continuation);
        this.b = h48;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        f48 f48 = new f48(this.b, continuation);
        f48.a = obj;
        return f48;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f48) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h48 h48 = this.b;
        h48.getClass();
        z68.c("h48", "albums loaded", new Object[0]);
        Iterable<wk6> iterable = (List) this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(((wk6) next).a.b(), next);
        }
        h48.g = linkedHashMap;
        ij0 ij0 = new ij0();
        sv0 sv0 = h48.a;
        sv0.c(ij0);
        for (wk6 wk6 : iterable) {
            sv0.c(new i48(wk6.a.b()));
        }
        pm7 pm7 = ((yd7) h48.c).w0;
        if (pm7 != null && pm7.e0()) {
            sqd sqd = h48.f;
            sqd.getClass();
            z68.c("sqd", "refreshSelectedMedias()", new Object[0]);
            CopyOnWriteArraySet copyOnWriteArraySet = sqd.a;
            List q = cjf.q(copyOnWriteArraySet, new nqd(0, (ws) SequencesKt___SequencesKt.toCollection(SequencesKt.map(SequencesKt.flattenSequenceOfIterable(SequencesKt.map(CollectionsKt.asSequence(iterable), new vq7(3, (Object) h48))), new wg7(7)), new ws(0))));
            z68.c("sqd", "refreshSelectedMedias(), itemsForRemoveCount = " + q.size(), new Object[0]);
            copyOnWriteArraySet.removeAll(q);
            if (!q.isEmpty()) {
                sqd.p();
            }
        }
        return Unit.INSTANCE;
    }
}
