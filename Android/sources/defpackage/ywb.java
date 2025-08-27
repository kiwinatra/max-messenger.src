package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: ywb  reason: default package */
public final class ywb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileChangeLinkScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ywb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.b = profileChangeLinkScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ywb ywb = new ywb(continuation, this.b);
        ywb.a = obj;
        return ywb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ywb) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((v5a) this.a) instanceof p33) {
            KProperty[] kPropertyArr = ProfileChangeLinkScreen.Y;
            ProfileChangeLinkScreen profileChangeLinkScreen = this.b;
            profileChangeLinkScreen.d0();
            profileChangeLinkScreen.getRouter().B(profileChangeLinkScreen);
        }
        return Unit.INSTANCE;
    }
}
