package defpackage;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* renamed from: g0e  reason: default package */
public final class g0e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SettingsBlacklistScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0e(Continuation continuation, SettingsBlacklistScreen settingsBlacklistScreen) {
        super(2, continuation);
        this.b = settingsBlacklistScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        g0e g0e = new g0e(continuation, this.b);
        g0e.a = obj;
        return g0e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g0e) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Map map = (Map) this.a;
        KProperty[] kPropertyArr = SettingsBlacklistScreen.x;
        SettingsBlacklistScreen settingsBlacklistScreen = this.b;
        settingsBlacklistScreen.getClass();
        ((OneMeEmptyView) settingsBlacklistScreen.v.getValue(settingsBlacklistScreen, SettingsBlacklistScreen.x[1])).setVisibility(map.values().isEmpty() ? 0 : 8);
        settingsBlacklistScreen.w.G(CollectionsKt.toList(map.values()));
        return Unit.INSTANCE;
    }
}
