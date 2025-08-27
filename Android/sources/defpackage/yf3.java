package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: yf3  reason: default package */
public final class yf3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ConfirmPinCodeScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yf3(Continuation continuation, ConfirmPinCodeScreen confirmPinCodeScreen) {
        super(2, continuation);
        this.b = confirmPinCodeScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yf3 yf3 = new yf3(continuation, this.b);
        yf3.a = obj;
        return yf3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yf3) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int ordinal = ((bg3) this.a).ordinal();
        ConfirmPinCodeScreen confirmPinCodeScreen = this.b;
        if (ordinal == 0) {
            ConfirmPinCodeScreen.c0(confirmPinCodeScreen).setErrorText((CharSequence) null);
            lg3 lg3 = ConfirmPinCodeScreen.c0(confirmPinCodeScreen).H0;
            int childCount = lg3.getChildCount();
            for (int i = 0; i < childCount; i++) {
                lg7 J0 = lg3.J0(i);
                if (J0 != null) {
                    ((oee) J0).F0.setText((CharSequence) null);
                }
            }
            lg3.M0();
            ConfirmPinCodeScreen.c0(confirmPinCodeScreen).setState(ig3.NORMAL);
        } else if (ordinal == 1) {
            ConfirmPinCodeScreen.c0(confirmPinCodeScreen).setErrorText((CharSequence) null);
            ConfirmPinCodeScreen.c0(confirmPinCodeScreen).setState(ig3.SUCCESS);
        } else if (ordinal == 2) {
            ConfirmPinCodeScreen.c0(confirmPinCodeScreen).setErrorText(q8.p(gmc.oneme_settings_privacy_onboarding_error_pin_code_equals, confirmPinCodeScreen.getContext()));
            ConfirmPinCodeScreen.c0(confirmPinCodeScreen).setState(ig3.ERROR);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
