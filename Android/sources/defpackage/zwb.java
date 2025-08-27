package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: zwb  reason: default package */
public final class zwb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileChangeLinkScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zwb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.b = profileChangeLinkScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zwb zwb = new zwb(continuation, this.b);
        zwb.a = obj;
        return zwb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zwb) create((e02) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e02 e02 = (e02) this.a;
        KProperty[] kPropertyArr = ProfileChangeLinkScreen.Y;
        ProfileChangeLinkScreen profileChangeLinkScreen = this.b;
        profileChangeLinkScreen.f0().setTitle(e02.a);
        ProfileChangeLinkScreen.c0(profileChangeLinkScreen).setEnabled(e02.c);
        ProfileChangeLinkScreen.c0(profileChangeLinkScreen).setProgressEnabled(e02.d);
        int ordinal = profileChangeLinkScreen.e0().ordinal();
        int i = 0;
        if (ordinal == 0) {
            ProfileChangeLinkScreen.c0(profileChangeLinkScreen).setVisibility(0);
        } else if (ordinal == 1) {
            OneMeButton c0 = ProfileChangeLinkScreen.c0(profileChangeLinkScreen);
            if (!e02.b) {
                i = 8;
            }
            c0.setVisibility(i);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
