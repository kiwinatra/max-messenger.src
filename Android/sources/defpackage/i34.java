package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.channels.CreateChannelViewModel;

/* renamed from: i34  reason: default package */
public final class i34 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CreateChannelViewModel a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i34(CreateChannelViewModel createChannelViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.a = createChannelViewModel;
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new i34(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i34) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CreateChannelViewModel createChannelViewModel = this.a;
        bud bud = createChannelViewModel.f;
        String str = this.b;
        o5a.X(bud, str, str);
        o5a.W(createChannelViewModel.f, str);
        return Unit.INSTANCE;
    }
}
