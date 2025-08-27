package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: g7g  reason: default package */
public final class g7g extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ VideoMessageWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g7g(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.b = videoMessageWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g7g(continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g7g) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            VideoMessageWidget videoMessageWidget = this.b;
            jv7 viewLifecycleOwner = videoMessageWidget.getViewLifecycleOwner();
            iu7 iu7 = iu7.v;
            f7g f7g = new f7g((Continuation) null, videoMessageWidget);
            this.a = 1;
            if (gsg.x(viewLifecycleOwner, iu7, f7g, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
