package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xd7  reason: default package */
public final class xd7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ yd7 a;
    public final /* synthetic */ vk6 b;
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xd7(yd7 yd7, vk6 vk6, int i, Continuation continuation) {
        super(2, continuation);
        this.a = yd7;
        this.b = vk6;
        this.c = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xd7(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xd7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        yd7 yd7 = this.a;
        ConcurrentHashMap concurrentHashMap = yd7.y0;
        vk6 vk6 = this.b;
        List list = (List) concurrentHashMap.get(vk6);
        if (list == null) {
            return Unit.INSTANCE;
        }
        int i = vk6 instanceof uk6 ? 40 : this.c;
        if (list.size() <= i) {
            return Unit.INSTANCE;
        }
        yd7.y0.put(vk6, list.subList(0, i));
        return Unit.INSTANCE;
    }
}
