package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: l75  reason: default package */
public final class l75 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ EnterPinCodeScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l75(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.b = enterPinCodeScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l75 l75 = new l75(continuation, this.b);
        l75.a = obj;
        return l75;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l75) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Unit unit = (Unit) this.a;
        fma onBackPressedDispatcher = this.b.getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.d();
        }
        return Unit.INSTANCE;
    }
}
