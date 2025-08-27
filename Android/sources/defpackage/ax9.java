package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ax9  reason: default package */
public final class ax9 extends SuspendLambda implements Function2 {
    public Set a;
    public int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ cx9 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ax9(long j, cx9 cx9, Continuation continuation) {
        super(2, continuation);
        this.c = j;
        this.o = cx9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ax9(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ax9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Set set;
        Set set2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        cx9 cx9 = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.c;
            if (j == -1) {
                return Unit.INSTANCE;
            }
            Set set3 = ((ww9) cx9.f.getValue()).a;
            if (set3.isEmpty()) {
                set2 = SetsKt.setOf(Boxing.boxLong(j));
            } else if (set3.contains(Boxing.boxLong(j))) {
                set2 = CollectionsKt.toMutableSet(set3);
                set2.remove(Boxing.boxLong(j));
            } else {
                set2 = SetsKt___SetsKt.plus(set3, Boxing.boxLong(j));
            }
            this.a = set2;
            this.b = 1;
            Object emptyList = set2.isEmpty() ? CollectionsKt.emptyList() : set2.size() == 1 ? cx9.d(((wj9) cx9.c.getValue()).d(((Number) CollectionsKt.first(set2)).longValue()), this) : cx9.c(set2, this);
            if (emptyList == coroutine_suspended) {
                return coroutine_suspended;
            }
            Set set4 = set2;
            obj = emptyList;
            set = set4;
        } else if (i == 1) {
            set = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xme xme = cx9.f;
        ww9 ww9 = new ww9((List) obj, set);
        xme.getClass();
        xme.m((Object) null, ww9);
        return Unit.INSTANCE;
    }
}
