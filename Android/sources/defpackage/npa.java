package defpackage;

import android.app.Activity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.appupdate.forceupdate.ForceUpdateScreen;

/* renamed from: npa  reason: default package */
public final class npa extends SuspendLambda implements Function2 {
    public final /* synthetic */ opa a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public npa(opa opa, Continuation continuation) {
        super(2, continuation);
        this.a = opa;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new npa(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((npa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Activity d = ((bta) this.a.f.getValue()).e().x().d();
        m27 m27 = null;
        MainActivity mainActivity = d instanceof MainActivity ? (MainActivity) d : null;
        if (mainActivity == null) {
            return Unit.INSTANCE;
        }
        RootController i = q8.i(mainActivity);
        i9d i9d = (i9d) CollectionsKt.lastOrNull(i.x().e());
        if ((i9d != null ? i9d.a : null) instanceof ForceUpdateScreen) {
            return Unit.INSTANCE;
        }
        if (!i.x().e().isEmpty()) {
            m27 = new m27(0);
        }
        i.x().R(iq.n(new ForceUpdateScreen(), m27, m27));
        return Unit.INSTANCE;
    }
}
