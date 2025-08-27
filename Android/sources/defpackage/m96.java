package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: m96  reason: default package */
public final class m96 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ k2b b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ TextView o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m96(TextView textView, TextView textView2, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = textView;
        this.o = textView2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                m96 m96 = new m96(this.c, this.o, (Continuation) obj3, 0);
                m96.b = (k2b) obj2;
                return m96.invokeSuspend(Unit.INSTANCE);
            case 1:
                LinearLayout linearLayout = (LinearLayout) obj;
                m96 m962 = new m96(this.c, this.o, (Continuation) obj3, 1);
                m962.b = (k2b) obj2;
                return m962.invokeSuspend(Unit.INSTANCE);
            default:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                m96 m963 = new m96(this.c, this.o, (Continuation) obj3, 2);
                m963.b = (k2b) obj2;
                return m963.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                k2b k2b = this.b;
                this.c.setTextColor(k2b.getText().e);
                this.o.setTextColor(k2b.getText().e);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                k2b k2b2 = this.b;
                this.c.setTextColor(k2b2.getText().e);
                this.o.setTextColor(k2b2.getText().f);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                k2b k2b3 = this.b;
                this.c.setTextColor(k2b3.getText().e);
                this.o.setTextColor(k2b3.getText().h);
                return Unit.INSTANCE;
        }
    }
}
