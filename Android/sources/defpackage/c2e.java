package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.settings.SettingsListScreen;

/* renamed from: c2e  reason: default package */
public final class c2e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SettingsListScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c2e(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.b = settingsListScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c2e c2e = new c2e(this.b, continuation);
        c2e.a = obj;
        return c2e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c2e) create((z3e) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        z3e z3e = (z3e) this.a;
        KProperty[] kPropertyArr = SettingsListScreen.y0;
        SettingsListScreen settingsListScreen = this.b;
        settingsListScreen.f0().setTopBarContent(z3e);
        ((h3b) settingsListScreen.x.getValue(settingsListScreen, SettingsListScreen.y0[1])).setTitle((CharSequence) z3e.c);
        return Unit.INSTANCE;
    }
}
