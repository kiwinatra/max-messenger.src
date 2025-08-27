package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.settings.SettingsListScreen;

/* renamed from: f2e  reason: default package */
public final class f2e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ SettingsListScreen o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f2e(co1 co1, Continuation continuation, SettingsListScreen settingsListScreen) {
        super(2, continuation);
        this.b = co1;
        this.o = settingsListScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        f2e f2e = new f2e((co1) this.b, continuation, this.o);
        f2e.a = obj;
        return f2e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f2e) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            tl6 tl6 = (tl6) a2;
            String str = null;
            sl6 sl6 = tl6 instanceof sl6 ? (sl6) tl6 : null;
            tqd tqd = sl6 != null ? sl6.a : null;
            if (tqd != null) {
                str = tqd.v;
            }
            if (!(str == null || tqd.w == null)) {
                SettingsListScreen settingsListScreen = this.o;
                KProperty[] kPropertyArr = SettingsListScreen.y0;
                settingsListScreen.g0().n(tqd.v, tqd.w);
            }
            obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (!this.c) {
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
