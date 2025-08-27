package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: pue  reason: default package */
public final class pue extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ StickersSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pue(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.b = stickersSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pue pue = new pue(continuation, this.b);
        pue.a = obj;
        return pue;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pue) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.v.G((List) this.a);
        return Unit.INSTANCE;
    }
}
