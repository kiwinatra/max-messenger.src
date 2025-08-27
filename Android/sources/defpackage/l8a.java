package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: l8a  reason: default package */
public final class l8a extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l8a(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.b = neuroAvatarsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l8a l8a = new l8a(continuation, this.b);
        l8a.a = obj;
        return l8a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l8a) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof v7a) {
            ((ecb) n88.a.getAccessor().g(ecb.class)).c();
            f98 f98 = f98.b;
            f98.getClass();
            Unit unit = Unit.INSTANCE;
            f98.W0().b(":chat-list", (Bundle) null);
        } else if (v5a instanceof pa4) {
            f98.b.Y0((pa4) v5a);
        } else if (v5a instanceof p33) {
            this.b.getRouter().C();
        }
        return Unit.INSTANCE;
    }
}
