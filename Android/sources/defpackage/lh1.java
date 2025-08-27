package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: lh1  reason: default package */
public final class lh1 extends SuspendLambda implements Function3 {
    public /* synthetic */ vag a;
    public /* synthetic */ List b;
    public final /* synthetic */ CallScreen c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lh1(Continuation continuation, CallScreen callScreen) {
        super(3, continuation);
        this.c = callScreen;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lh1 lh1 = new lh1((Continuation) obj3, this.c);
        lh1.a = (vag) obj;
        lh1.b = (List) obj2;
        return lh1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        vag vag = this.a;
        List list = this.b;
        vag.a.getClass();
        int i2 = uag.$EnumSwitchMapping$0[vag.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = 0;
        } else if (i2 == 3) {
            i = 1;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        CallScreen callScreen = this.c;
        if (i < 0 || i >= list.size()) {
            gga gga = CallScreen.J0;
            i = Math.min(callScreen.q0().getCurrentItem(), list.size() - 1);
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        gga gga2 = CallScreen.J0;
        ((xc1) callScreen.B0.getValue()).H(list, new kh1((Object) booleanRef, (Object) callScreen, i, 0));
        booleanRef.element = CallScreen.c0(callScreen, i, "main");
        return Unit.INSTANCE;
    }
}
