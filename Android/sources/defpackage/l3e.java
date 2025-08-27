package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.sdk.arch.Widget;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;

/* renamed from: l3e  reason: default package */
public final class l3e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SettingsPrivacyScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l3e(Continuation continuation, SettingsPrivacyScreen settingsPrivacyScreen) {
        super(2, continuation);
        this.b = settingsPrivacyScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l3e l3e = new l3e(continuation, this.b);
        l3e.a = obj;
        return l3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l3e) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e0b e0b = new e0b((Widget) this.b);
        e0b.i((String) this.a);
        e0b.j();
        return Unit.INSTANCE;
    }
}
