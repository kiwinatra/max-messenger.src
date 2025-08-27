package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: y98  reason: default package */
public final class y98 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ List b;
    public /* synthetic */ List c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y98(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                y98 y98 = new y98(3, continuation, 0);
                y98.b = list;
                y98.c = list2;
                return y98.invokeSuspend(Unit.INSTANCE);
            case 1:
                y98 y982 = new y98(3, continuation, 1);
                y982.b = list;
                y982.c = list2;
                return y982.invokeSuspend(Unit.INSTANCE);
            case 2:
                y98 y983 = new y98(3, continuation, 2);
                y983.b = list;
                y983.c = list2;
                return y983.invokeSuspend(Unit.INSTANCE);
            default:
                y98 y984 = new y98(3, continuation, 3);
                y984.b = list;
                y984.c = list2;
                return y984.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                List list = this.b;
                list.addAll(this.c);
                return list;
            case 1:
                ResultKt.throwOnFailure(obj);
                List list2 = this.b;
                list2.addAll(this.c);
                return list2;
            case 2:
                ResultKt.throwOnFailure(obj);
                List list3 = this.c;
                Collection collection = this.b;
                return collection.isEmpty() ? list3 : collection;
            default:
                ResultKt.throwOnFailure(obj);
                return CollectionsKt.plus(this.b, this.c);
        }
    }
}
