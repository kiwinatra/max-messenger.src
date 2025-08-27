package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: rue  reason: default package */
public final class rue extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ StickersSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rue(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.b = stickersSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rue rue = new rue(continuation, this.b);
        rue.a = obj;
        return rue;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rue) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        KProperty[] kPropertyArr = StickersSettingsScreen.w;
        StickersSettingsScreen stickersSettingsScreen = this.b;
        stickersSettingsScreen.getClass();
        if (v5a instanceof p33) {
            stickersSettingsScreen.getRouter().C();
        } else if (v5a instanceof pa4) {
            nue.b.Y0((pa4) v5a);
        }
        return Unit.INSTANCE;
    }
}
