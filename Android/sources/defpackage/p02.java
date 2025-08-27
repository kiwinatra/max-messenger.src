package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: p02  reason: default package */
public final class p02 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChangeOwnerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p02(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.b = changeOwnerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        p02 p02 = new p02(continuation, this.b);
        p02.a = obj;
        return p02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p02) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        q02 q02 = (q02) this.a;
        if (q02 instanceof q02) {
            e0b e0b = new e0b((Widget) this.b);
            e0b.h(q02.a);
            Integer num = q02.b;
            if (num != null) {
                e0b.f(new o0b(num.intValue()));
            }
            e0b.j();
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
