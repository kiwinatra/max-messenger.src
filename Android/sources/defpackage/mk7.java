package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: mk7  reason: default package */
public final class mk7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InviteByPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mk7(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.b = inviteByPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mk7 mk7 = new mk7(continuation, this.b);
        mk7.a = obj;
        return mk7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mk7) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof pa4) {
            ek7.b.Y0((pa4) v5a);
        }
        InviteByPhoneScreen inviteByPhoneScreen = this.b;
        kr7.z(inviteByPhoneScreen);
        View view = inviteByPhoneScreen.getView();
        if (view != null) {
            Boxing.boxBoolean(view.postDelayed(new y86(17, (Object) inviteByPhoneScreen), 600));
        }
        return Unit.INSTANCE;
    }
}
