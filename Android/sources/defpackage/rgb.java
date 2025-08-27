package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: rgb  reason: default package */
public final class rgb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickSubscribersScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rgb(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.b = pickSubscribersScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rgb rgb = new rgb(this.b, continuation);
        rgb.a = obj;
        return rgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rgb) create((agb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        agb agb = (agb) this.a;
        boolean z = agb instanceof zfb;
        PickSubscribersScreen pickSubscribersScreen = this.b;
        if (z) {
            KProperty[] kPropertyArr = PickSubscribersScreen.w0;
            pickSubscribersScreen.n0().setProgressEnabled(false);
            ble.b.p1(new vq7(pickSubscribersScreen, agb));
        } else if (Intrinsics.areEqual((Object) agb, (Object) yfb.a)) {
            KProperty[] kPropertyArr2 = PickSubscribersScreen.w0;
            pickSubscribersScreen.n0().setProgressEnabled(false);
            ble.b.p1(new ngb(pickSubscribersScreen, 1));
            e0b e0b = new e0b((Widget) pickSubscribersScreen);
            e0b.h(new igf(g1b.a));
            e0b.f(new o0b(cad.u1));
            e0b.j();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
