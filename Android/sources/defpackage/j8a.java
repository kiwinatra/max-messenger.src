package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: j8a  reason: default package */
public final class j8a extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j8a(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.b = neuroAvatarsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j8a j8a = new j8a(continuation, this.b);
        j8a.a = obj;
        return j8a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j8a) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        gqd gqd = (gqd) this.a;
        fqd fqd = gqd.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        if (fqd != null) {
            KProperty[] kPropertyArr = NeuroAvatarsScreen.K0;
            neuroAvatarsScreen.f0().setAvatarUrl(gqd.a.a());
        } else {
            KProperty[] kPropertyArr2 = NeuroAvatarsScreen.K0;
            neuroAvatarsScreen.f0().setCloseBadgeVisibility(false);
            onb onb = onb.a;
            rnb rnb = gqd.b;
            if (Intrinsics.areEqual((Object) rnb, (Object) onb)) {
                neuroAvatarsScreen.f0().setAvatarUrl((String) null);
                OneMeAvatarView.g(neuroAvatarsScreen.f0(), (Drawable) neuroAvatarsScreen.J0.getValue(), (joa) null, 30);
            } else if (rnb instanceof nnb) {
                neuroAvatarsScreen.f0().setAvatarUrl((String) null);
                nnb nnb = (nnb) rnb;
                neuroAvatarsScreen.f0().f(new gd0(nnb.a, nnb.b), true);
            } else if (rnb instanceof qnb) {
                neuroAvatarsScreen.f0().setAvatarUrl(((qnb) rnb).a);
            } else if (rnb instanceof pnb) {
                neuroAvatarsScreen.f0().setAvatarUrl(((pnb) rnb).a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
