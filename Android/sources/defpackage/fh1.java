package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: fh1  reason: default package */
public final class fh1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fh1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.b = callScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fh1 fh1 = new fh1(continuation, this.b);
        fh1.a = obj;
        return fh1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fh1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ze1 ze1;
        p0g p0g;
        l21 l21;
        boolean z = false;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        l31 l31 = (l31) this.a;
        boolean areEqual = Intrinsics.areEqual((Object) l31, (Object) k31.a);
        CallScreen callScreen = this.b;
        if (areEqual) {
            gga gga = CallScreen.J0;
            callScreen.g0(false);
        } else if (l31 instanceof j31) {
            pn1 pn1 = ((j31) l31).a;
            gga gga2 = CallScreen.J0;
            callScreen.getClass();
            evf evf = pn1.c;
            boolean z2 = evf != null;
            y7e.C(callScreen.m0(), callScreen.h0(), (Function0) null);
            p11 h0 = callScreen.h0();
            int i = 8;
            h0.setVisibility(z2 ? 0 : 8);
            h0.setAvatar((evf == null || (l21 = evf.c) == null) ? null : l21.c);
            if (h0.getVisibility() == 0) {
                h0.setName(evf != null ? evf.a : null);
                h0.setStatus(evf != null ? evf.b : null);
                boolean z3 = evf != null ? evf.d : false;
                int i2 = evf != null ? evf.e : false ? pqa.b : pqa.a;
                int i3 = ykc.call_cancel;
                n11 n11 = new n11(h0, 1);
                tm1 tm1 = h0.E0;
                tm1.b0(z3, i2, i3, n11);
                tm1.a0(pqa.c, ykc.call_recall, new n11(h0, 0));
                tm1.X(evf != null ? evf.f : false);
            }
            nr7 nr7 = pn1.d;
            boolean z4 = nr7 != null;
            if (y7e.I(callScreen.o0()) || z4) {
                y7e.C(callScreen.o0(), callScreen.i0(), (Function0) null);
                callScreen.i0().setActive(z4);
                jk1 i0 = callScreen.i0();
                if (z4) {
                    if (nr7 == null || (ze1 = nr7.a) == null) {
                        ze1 = ze1.c;
                    }
                    i0.setParticipantId(ze1);
                    if (nr7 == null || (p0g = nr7.e) == null) {
                        p0g = p0g.o;
                    }
                    if (i0.Q0 != p0g) {
                        i0.Q0 = p0g;
                        AppCompatImageView appCompatImageView = i0.I0;
                        int ordinal = p0g.ordinal();
                        if (ordinal == 0) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setImageResource(pqa.D);
                            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(ykc.call_user_item_more));
                            ct.G(appCompatImageView, 300, new pb(5, appCompatImageView, i0));
                        } else if (ordinal == 1) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setImageResource(pqa.M);
                            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(sqa.L0));
                            ct.G(appCompatImageView, 300, new hk1(i0, 0));
                        } else if (ordinal == 2 || ordinal == 3) {
                            appCompatImageView.setVisibility(8);
                            appCompatImageView.setContentDescription((CharSequence) null);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    boolean z5 = nr7 != null ? nr7.c : false;
                    if (!Intrinsics.areEqual((Object) i0.L0, (Object) Boolean.valueOf(z5))) {
                        i0.L0 = Boolean.valueOf(z5);
                        AppCompatImageView appCompatImageView2 = i0.J0;
                        if (z5) {
                            i = 0;
                        }
                        appCompatImageView2.setVisibility(i);
                    }
                    i0.setLabel(nr7 != null ? nr7.b : null);
                    if (nr7 != null) {
                        z = nr7.d;
                    }
                    if (!Intrinsics.areEqual((Object) i0.M0, (Object) Boolean.valueOf(z))) {
                        i0.M0 = Boolean.valueOf(z);
                        i0.M();
                    }
                }
            }
            zd0 zd0 = pn1.f;
            if (zd0 != null) {
                y7e.C(callScreen.m0(), callScreen.h0(), (Function0) null);
                callScreen.h0().setAvatar(zd0);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
