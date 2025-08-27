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

/* renamed from: uhb  reason: default package */
public final class uhb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vhb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uhb(vhb vhb, Continuation continuation) {
        super(2, continuation);
        this.c = vhb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        uhb uhb = new uhb(this.c, continuation);
        uhb.b = obj;
        return uhb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uhb) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Set<Number> set = (Set) this.b;
            boolean isEmpty = set.isEmpty();
            vhb vhb = this.c;
            if (isEmpty) {
                vhb.o.setValue(MapsKt.emptyMap());
            } else {
                CharSequence charSequence = (CharSequence) vhb.z.getValue();
                if (!(charSequence == null || charSequence.length() == 0)) {
                    xag.h(vhb.y, xhb.a);
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                for (Number longValue : set) {
                    arrayList.add(vhb.b.k(longValue.longValue()));
                }
                zm4 zm4 = new zm4((bs5[]) CollectionsKt.toList(arrayList).toArray(new bs5[0]), 4);
                zqa zqa = new zqa(3, (Object) vhb.o);
                this.a = 1;
                if (bs0.t(zm4, zqa, this) == coroutine_suspended) {
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
