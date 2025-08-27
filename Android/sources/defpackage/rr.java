package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.appearancesettings.AppearanceSettingsScreen;

/* renamed from: rr  reason: default package */
public final class rr extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AppearanceSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rr(AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.b = appearanceSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rr rrVar = new rr(this.b, continuation);
        rrVar.a = obj;
        return rrVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rr) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.w.G((List) this.a);
        return Unit.INSTANCE;
    }
}
