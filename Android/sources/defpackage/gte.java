package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: gte  reason: default package */
public final class gte extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ StickersScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gte(Continuation continuation, StickersScreen stickersScreen) {
        super(2, continuation);
        this.b = stickersScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gte gte = new gte(continuation, this.b);
        gte.a = obj;
        return gte;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gte) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        sve sve = (sve) this.a;
        KProperty[] kPropertyArr = StickersScreen.Y;
        StickersScreen stickersScreen = this.b;
        h3b d0 = stickersScreen.d0();
        CharSequence a2 = sve.a.a(stickersScreen.getContext());
        if (a2 == null) {
            a2 = "";
        }
        d0.setTitle(a2);
        String str = sve.b;
        if (str != null) {
            stickersScreen.d0().setSubtitle((CharSequence) str);
        }
        return Unit.INSTANCE;
    }
}
