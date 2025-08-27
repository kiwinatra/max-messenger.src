package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.appearancesettings.AppearanceSettingsScreen;

/* renamed from: sr  reason: default package */
public final class sr extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AppearanceSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sr(AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.b = appearanceSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sr srVar = new sr(this.b, continuation);
        srVar.a = obj;
        return srVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sr) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = AppearanceSettingsScreen.y;
        AppearanceSettingsScreen appearanceSettingsScreen = this.b;
        appearanceSettingsScreen.getClass();
        ((u32) appearanceSettingsScreen.c.getValue(appearanceSettingsScreen, AppearanceSettingsScreen.y[0])).setThemeItems((List) this.a);
        return Unit.INSTANCE;
    }
}
