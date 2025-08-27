package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.aboutappsettings.AboutAppSettingsScreen;

/* renamed from: p  reason: default package */
public final class p extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AboutAppSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Continuation continuation, AboutAppSettingsScreen aboutAppSettingsScreen) {
        super(2, continuation);
        this.b = aboutAppSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        p pVar = new p(continuation, this.b);
        pVar.a = obj;
        return pVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.b.G((List) this.a);
        return Unit.INSTANCE;
    }
}
