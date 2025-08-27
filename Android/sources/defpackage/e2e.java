package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.settings.SettingsListScreen;

/* renamed from: e2e  reason: default package */
public final class e2e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SettingsListScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e2e(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.b = settingsListScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        e2e e2e = new e2e(this.b, continuation);
        e2e.a = obj;
        return e2e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e2e) create((n85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        n85 n85 = (n85) this.a;
        y1e y1e = n85 instanceof y1e ? (y1e) n85 : null;
        if (y1e instanceof y1e) {
            SettingsListScreen settingsListScreen = this.b;
            b59.k(settingsListScreen.getContext(), y1e.a);
            CharSequence a2 = y1e.b.a(settingsListScreen.getContext());
            if (a2 == null) {
                return Unit.INSTANCE;
            }
            if (b59.C()) {
                e0b e0b = (e0b) settingsListScreen.y.getValue();
                e0b.f(new o0b(cad.t));
                e0b.i(a2);
                e0b.j();
            }
        }
        return Unit.INSTANCE;
    }
}
