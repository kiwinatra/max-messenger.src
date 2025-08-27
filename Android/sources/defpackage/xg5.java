package defpackage;

import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: xg5  reason: default package */
public final class xg5 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ AppCompatTextView b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj;
                xg5 xg5 = new xg5(this.b, (Continuation) obj3);
                xg5.c = (k2b) obj2;
                return xg5.invokeSuspend(Unit.INSTANCE);
            case 1:
                xg5 xg52 = new xg5(3, (Continuation) obj3, 1);
                xg52.b = (AppCompatTextView) obj;
                xg52.c = (k2b) obj2;
                return xg52.invokeSuspend(Unit.INSTANCE);
            case 2:
                xg5 xg53 = new xg5(3, (Continuation) obj3, 2);
                xg53.b = (AppCompatTextView) obj;
                xg53.c = (k2b) obj2;
                return xg53.invokeSuspend(Unit.INSTANCE);
            case 3:
                xg5 xg54 = new xg5(3, (Continuation) obj3, 3);
                xg54.b = (AppCompatTextView) obj;
                xg54.c = (k2b) obj2;
                return xg54.invokeSuspend(Unit.INSTANCE);
            case 4:
                xg5 xg55 = new xg5(3, (Continuation) obj3, 4);
                xg55.b = (AppCompatTextView) obj;
                xg55.c = (k2b) obj2;
                return xg55.invokeSuspend(Unit.INSTANCE);
            default:
                xg5 xg56 = new xg5(3, (Continuation) obj3, 5);
                xg56.b = (AppCompatTextView) obj;
                xg56.c = (k2b) obj2;
                return xg56.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.b.setTextColor(this.c.getText().e);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                this.b.setTextColor(this.c.getText().b);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                this.b.setTextColor(this.c.getText().e);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                this.b.setTextColor(this.c.getText().f);
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                this.b.setTextColor(this.c.getText().g);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                AppCompatTextView appCompatTextView = this.b;
                this.c.getText().getClass();
                appCompatTextView.setTextColor(-16745729);
                return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xg5(AppCompatTextView appCompatTextView, Continuation continuation) {
        super(3, continuation);
        this.a = 0;
        this.b = appCompatTextView;
    }
}
