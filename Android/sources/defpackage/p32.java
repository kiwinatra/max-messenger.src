package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: p32  reason: default package */
public final class p32 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ q32 b;
    public final /* synthetic */ List c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p32(q32 q32, List list, Continuation continuation) {
        super(2, continuation);
        this.b = q32;
        this.c = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p32(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p32) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a32 j = this.b.j();
            if (j == null) {
                return Unit.INSTANCE;
            }
            List list = this.c;
            Iterable<Object> iterable = list;
            jx3 a2 = e14.a(getContext());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (Object o32 : iterable) {
                arrayList.add(ev0.d(a2, (q04) null, new o32(o32, (Continuation) null, this.b, j, list), 3));
            }
            this.a = 1;
            if (j4b.g(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
