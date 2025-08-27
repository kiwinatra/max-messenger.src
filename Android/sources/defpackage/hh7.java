package defpackage;

import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: hh7  reason: default package */
public final class hh7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InputPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hh7(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.b = inputPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hh7 hh7 = new hh7(continuation, this.b);
        hh7.a = obj;
        return hh7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hh7) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        w14 w14 = (w14) this.a;
        InputPhoneScreen inputPhoneScreen = this.b;
        ((r80) inputPhoneScreen.A0.getValue()).a(new fbf(3, "phone_country_changed", bed.b(TuplesKt.to("phoneCountry", w14.a.a))));
        ysa ysa = w14.a;
        CharSequence charSequence = "";
        if (Intrinsics.areEqual((Object) charSequence, (Object) ysa.a)) {
            zwa f0 = inputPhoneScreen.f0();
            f0.z.removeTextChangedListener(inputPhoneScreen.x0);
            inputPhoneScreen.x0 = null;
        } else {
            ij7 ij7 = inputPhoneScreen.x0;
            int i = ysa.b;
            String str = ysa.a;
            int i2 = w14.b;
            if (ij7 == null) {
                ij7 ij72 = new ij7((aeb) inputPhoneScreen.w0.getValue(), str, i, i2);
                inputPhoneScreen.x0 = ij72;
                inputPhoneScreen.f0().z.addTextChangedListener(ij72);
            } else {
                ij7.b(i, str);
                ij7 ij73 = inputPhoneScreen.x0;
                if (ij73 != null) {
                    ij73.w = i2;
                }
            }
        }
        CharSequence a2 = w14.c.a(inputPhoneScreen.getContext());
        if (a2 != null) {
            charSequence = a2;
        }
        zwa f02 = inputPhoneScreen.f0();
        f02.setHint(charSequence);
        f02.setCountry(ysa);
        return Unit.INSTANCE;
    }
}
