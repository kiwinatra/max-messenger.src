package defpackage;

import android.widget.FrameLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: bs8  reason: default package */
public final class bs8 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ FrameLayout b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bs8(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                bs8 bs8 = new bs8(3, continuation, 0);
                bs8.b = frameLayout;
                return bs8.invokeSuspend(Unit.INSTANCE);
            case 1:
                bs8 bs82 = new bs8(3, continuation, 1);
                bs82.b = frameLayout;
                return bs82.invokeSuspend(Unit.INSTANCE);
            case 2:
                bs8 bs83 = new bs8(3, continuation, 2);
                bs83.b = frameLayout;
                return bs83.invokeSuspend(Unit.INSTANCE);
            case 3:
                bs8 bs84 = new bs8(3, continuation, 3);
                bs84.b = frameLayout;
                return bs84.invokeSuspend(Unit.INSTANCE);
            default:
                bs8 bs85 = new bs8(3, continuation, 4);
                bs85.b = frameLayout;
                return bs85.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout = this.b;
                frameLayout.setBackgroundColor(fu4.k.f(frameLayout).c().j);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout2 = this.b;
                frameLayout2.setBackgroundColor(fu4.k.f(frameLayout2).c().k);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout3 = this.b;
                frameLayout3.setBackgroundColor(fu4.k.f(frameLayout3).a().f().a.a);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout4 = this.b;
                frameLayout4.setBackgroundColor(fu4.k.f(frameLayout4).c().i);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout5 = this.b;
                frameLayout5.setBackgroundColor(fu4.k.f(frameLayout5).c().i);
                return Unit.INSTANCE;
        }
    }
}
