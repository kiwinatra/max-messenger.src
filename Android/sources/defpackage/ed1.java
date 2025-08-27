package defpackage;

import android.widget.LinearLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: ed1  reason: default package */
public final class ed1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ LinearLayout b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinearLayout linearLayout = (LinearLayout) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                ed1 ed1 = new ed1(3, continuation, 0);
                ed1.b = linearLayout;
                return ed1.invokeSuspend(Unit.INSTANCE);
            case 1:
                ed1 ed12 = new ed1(3, continuation, 1);
                ed12.b = linearLayout;
                return ed12.invokeSuspend(Unit.INSTANCE);
            default:
                ed1 ed13 = new ed1(3, continuation, 2);
                ed13.b = linearLayout;
                return ed13.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(l2b.d.f);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                LinearLayout linearLayout = this.b;
                linearLayout.setBackgroundColor(fu4.k.f(linearLayout).c().k);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                LinearLayout linearLayout2 = this.b;
                linearLayout2.setBackgroundColor(fu4.k.f(linearLayout2).c().h);
                return Unit.INSTANCE;
        }
    }
}
