package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fd7  reason: default package */
public final class fd7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ArrayList a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fd7(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.a = arrayList;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fd7(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fd7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new ed7(0));
        }
        return Unit.INSTANCE;
    }
}
