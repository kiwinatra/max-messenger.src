package defpackage;

import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.loader.MessageModel;

/* renamed from: dx  reason: default package */
public final class dx extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gx b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dx(gx gxVar, Continuation continuation) {
        super(2, continuation);
        this.b = gxVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dx(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dx) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gx gxVar = this.b;
            if (gxVar.e.isInitialized()) {
                ((bsd) gxVar.e.getValue()).c();
            }
            Lazy lazy = gxVar.f;
            if (lazy.isInitialized()) {
                ((bsd) lazy.getValue()).c();
            }
            Iterable<MessageModel> iterable = ((wj9) gxVar.A.getValue()).a;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (MessageModel messageModel : iterable) {
                arrayList.add(Boxing.boxLong(messageModel.a));
            }
            eb9 eb9 = new eb9(arrayList);
            this.a = 1;
            if (gxVar.n(eb9, this) == coroutine_suspended) {
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
