package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.aboutappsettings.AboutAppSettingsScreen;

/* renamed from: q  reason: default package */
public final class q extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AboutAppSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Continuation continuation, AboutAppSettingsScreen aboutAppSettingsScreen) {
        super(2, continuation);
        this.b = aboutAppSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q qVar = new q(continuation, this.b);
        qVar.a = obj;
        return qVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        boolean areEqual = Intrinsics.areEqual((Object) v5a, (Object) p33.b);
        AboutAppSettingsScreen aboutAppSettingsScreen = this.b;
        if (areEqual) {
            aboutAppSettingsScreen.getRouter().C();
        } else if (v5a instanceof u) {
            b59.k(aboutAppSettingsScreen.getContext(), ((u) v5a).b);
        }
        return Unit.INSTANCE;
    }
}
