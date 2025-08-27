package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: bh7  reason: default package */
public final class bh7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InputPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bh7(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.b = inputPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bh7 bh7 = new bh7(continuation, this.b);
        bh7.a = obj;
        return bh7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bh7) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof zg7) {
            aj7 aj7 = (aj7) this.b.y0.getValue();
            zg7 zg7 = (zg7) v5a;
            String str = zg7.b;
            aj7.getClass();
            aj7.a(iq.n(new ConfirmPhoneScreen(str, zg7.c, zg7.d), (ey3) null, (ey3) null), "ConfirmPhoneScreen");
        } else if (v5a instanceof pa4) {
            f98.b.Y0((pa4) v5a);
        }
        return Unit.INSTANCE;
    }
}
