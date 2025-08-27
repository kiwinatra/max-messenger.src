package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.settings.SettingsListScreen;

/* renamed from: d2e  reason: default package */
public final class d2e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SettingsListScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d2e(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.b = settingsListScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        d2e d2e = new d2e(this.b, continuation);
        d2e.a = obj;
        return d2e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d2e) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.w0.G((List) this.a);
        return Unit.INSTANCE;
    }
}
