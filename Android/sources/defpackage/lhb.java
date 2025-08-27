package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lhb  reason: default package */
public final class lhb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ whb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lhb(whb whb, Continuation continuation) {
        super(2, continuation);
        this.c = whb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lhb lhb = new lhb(this.c, continuation);
        lhb.b = obj;
        return lhb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lhb) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Set<Number> set = (Set) this.b;
            boolean isEmpty = set.isEmpty();
            whb whb = this.c;
            if (isEmpty) {
                whb.y.setValue(MapsKt.emptyMap());
                whb.X.setValue(MapsKt.emptyMap());
            } else {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                for (Number longValue : set) {
                    arrayList.add(((my2) ((qx2) whb.o.getValue())).o(longValue.longValue()));
                }
                zm4 zm4 = new zm4((bs5[]) CollectionsKt.toList(arrayList).toArray(new bs5[0]), 3);
                khb khb = new khb(whb, (Continuation) null);
                this.a = 1;
                if (bs0.t(zm4, khb, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
