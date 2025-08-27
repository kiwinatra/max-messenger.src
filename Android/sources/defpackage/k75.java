package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.properties.ReadOnlyProperty;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: k75  reason: default package */
public final class k75 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ EnterPinCodeScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k75(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.b = enterPinCodeScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k75 k75 = new k75(continuation, this.b);
        k75.a = obj;
        return k75;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k75) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        p75 p75 = (p75) this.a;
        EnterPinCodeScreen enterPinCodeScreen = this.b;
        zx3 targetController = enterPinCodeScreen.getTargetController();
        j75 j75 = targetController instanceof j75 ? (j75) targetController : null;
        int ordinal = p75.ordinal();
        ReadOnlyProperty readOnlyProperty = enterPinCodeScreen.o;
        if (ordinal == 0) {
            ((mlb) readOnlyProperty.getValue(enterPinCodeScreen, EnterPinCodeScreen.v[0])).setState(ig3.SUCCESS);
        } else if (ordinal == 1) {
            ((mlb) readOnlyProperty.getValue(enterPinCodeScreen, EnterPinCodeScreen.v[0])).setState(ig3.ERROR);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (j75 != null) {
            y3e c0 = ((SettingsPrivacyScreen) j75).c0();
            c0.getClass();
            int ordinal2 = p75.ordinal();
            if (ordinal2 == 0) {
                long j = c0.E0;
                if (j == uza.g) {
                    xag.g(c0, ((osa) c0.o).a(), (f14) null, new s3e(c0, (Continuation) null), 2);
                } else if (j == uza.h) {
                    c0.q(xzd.i);
                } else if (j == uza.d) {
                    c0.q(xzd.h);
                } else if (j == uza.b) {
                    c0.q(xzd.j);
                }
                c0.E0 = 0;
            } else if (ordinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
