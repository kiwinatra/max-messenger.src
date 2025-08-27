package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: lk7  reason: default package */
public final class lk7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InviteByPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lk7(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.b = inviteByPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lk7 lk7 = new lk7(continuation, this.b);
        lk7.a = obj;
        return lk7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lk7) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        w14 w14 = (w14) this.a;
        ysa ysa = w14.a;
        KProperty[] kPropertyArr = InviteByPhoneScreen.z0;
        InviteByPhoneScreen inviteByPhoneScreen = this.b;
        inviteByPhoneScreen.getClass();
        KProperty kProperty = InviteByPhoneScreen.z0[6];
        inviteByPhoneScreen.x0.b(inviteByPhoneScreen, ysa);
        ij7 ij7 = inviteByPhoneScreen.w0;
        Lazy lazy = inviteByPhoneScreen.v0;
        int i = w14.b;
        ysa ysa2 = w14.a;
        if (ij7 == null) {
            ij7 ij72 = new ij7((aeb) lazy.getValue(), ysa2.a, ysa2.b, i);
            inviteByPhoneScreen.w0 = ij72;
            inviteByPhoneScreen.e0().z.addTextChangedListener(ij72);
        } else {
            ij7.b(ysa2.b, ysa2.a);
            ij7 ij73 = inviteByPhoneScreen.w0;
            if (ij73 != null) {
                ij73.w = i;
            }
        }
        xk7 f0 = inviteByPhoneScreen.f0();
        aeb aeb = (aeb) lazy.getValue();
        teb e = aeb.e(ysa2.a);
        f0.x0 = !aeb.m(e) ? IntCompanionObject.MAX_VALUE : aeb.d(e, 1).length();
        CharSequence a2 = w14.c.a(inviteByPhoneScreen.getContext());
        if (a2 == null) {
            a2 = "";
        }
        zwa e0 = inviteByPhoneScreen.e0();
        e0.setHint(a2);
        e0.setCountry(ysa2);
        return Unit.INSTANCE;
    }
}
