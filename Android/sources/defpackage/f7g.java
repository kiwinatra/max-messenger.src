package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: f7g  reason: default package */
public final class f7g extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ VideoMessageWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f7g(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.b = videoMessageWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new f7g(continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f7g) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = VideoMessageWidget.X;
            VideoMessageWidget videoMessageWidget = this.b;
            s6g d0 = videoMessageWidget.d0();
            KProperty kProperty = VideoMessageWidget.X[0];
            this.a = 1;
            if (((y6g) d0).k((kub) videoMessageWidget.c.getValue(videoMessageWidget, kProperty), this) == coroutine_suspended) {
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
