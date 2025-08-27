package defpackage;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: na8  reason: default package */
public final class na8 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ oa8 b;
    public final /* synthetic */ CharSequence c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public na8(oa8 oa8, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.b = oa8;
        this.c = charSequence;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new na8(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((na8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        CharSequence charSequence = this.c;
        oa8 oa8 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            i21 i21 = new i21(new ArrayList(), new eu5(new k26(bs0.D(new k26(new fs5(1, oa8.b.g()), 24), new ia8(charSequence, (Continuation) null)), 25), 2), new y98(3, (Continuation) null, 1));
            aa8 aa8 = new aa8(oa8, 1);
            this.a = 1;
            Object e = i21.e(new tu5(aa8, 29), this);
            if (e != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                e = Unit.INSTANCE;
            }
            if (e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (oa8.x.isEmpty()) {
            LinkedBlockingQueue linkedBlockingQueue = oa8.x;
            linkedBlockingQueue.put(CollectionsKt.listOf("По запросу \"" + charSequence + "\" ничего не найдено!"));
        }
        return Unit.INSTANCE;
    }
}
