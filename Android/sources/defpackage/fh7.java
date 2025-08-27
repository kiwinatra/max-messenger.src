package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: fh7  reason: default package */
public final class fh7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InputPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fh7(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.b = inputPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fh7 fh7 = new fh7(continuation, this.b);
        fh7.a = obj;
        return fh7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fh7) create((v88) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v88 v88 = (v88) this.a;
        KProperty[] kPropertyArr = InputPhoneScreen.D0;
        InputPhoneScreen inputPhoneScreen = this.b;
        OneMeButton e0 = inputPhoneScreen.e0();
        e0.setProgressEnabled(false);
        e0.setClickable(true);
        if (v88 instanceof q88) {
            InputPhoneScreen.d0(inputPhoneScreen, ((q88) v88).c.a(inputPhoneScreen.getContext()));
        } else if (v88 instanceof r88) {
            InputPhoneScreen.d0(inputPhoneScreen, ((r88) v88).c.a(inputPhoneScreen.getContext()));
        } else if (v88 instanceof s88) {
            ld9.R(inputPhoneScreen);
        } else {
            CharSequence charSequence = null;
            if (v88 instanceof u88) {
                u88 u88 = (u88) v88;
                ((r80) inputPhoneScreen.A0.getValue()).a(new p80(u88.e));
                inputPhoneScreen.a.getClass();
                CharSequence a2 = u88.c.a(inputPhoneScreen.getContext());
                if (a2 != null) {
                    ngf ngf = u88.d;
                    if (ngf != null) {
                        charSequence = ngf.a(inputPhoneScreen.getContext());
                    }
                    e0b e0b = new e0b((Widget) inputPhoneScreen);
                    e0b.i(a2);
                    e0b.b(charSequence);
                    e0b.e(1);
                    e0b.j();
                }
            } else if (v88 == null) {
                InputPhoneScreen.d0(inputPhoneScreen, (CharSequence) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
