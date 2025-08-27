package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: vwc  reason: default package */
public final class vwc extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ k2b b;
    public final /* synthetic */ RecordControlsWidget c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vwc(RecordControlsWidget recordControlsWidget, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                vwc vwc = new vwc(this.c, (Continuation) obj3, 0);
                vwc.b = (k2b) obj2;
                return vwc.invokeSuspend(Unit.INSTANCE);
            case 1:
                View view2 = (View) obj;
                vwc vwc2 = new vwc(this.c, (Continuation) obj3, 1);
                vwc2.b = (k2b) obj2;
                return vwc2.invokeSuspend(Unit.INSTANCE);
            default:
                ImageView imageView = (ImageView) obj;
                vwc vwc3 = new vwc(this.c, (Continuation) obj3, 2);
                vwc3.b = (k2b) obj2;
                return vwc3.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        RecordControlsWidget recordControlsWidget = this.c;
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                k2b k2b = this.b;
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                ((GradientDrawable) recordControlsWidget.Q0.getValue()).setColor(k2b.getText().b);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                k2b k2b2 = this.b;
                KProperty[] kPropertyArr2 = RecordControlsWidget.g1;
                ((GradientDrawable) recordControlsWidget.Q0.getValue()).setColor(k2b2.getText().b);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                k2b k2b3 = this.b;
                KProperty[] kPropertyArr3 = RecordControlsWidget.g1;
                k2b3.getIcon().getClass();
                iq.a0((Drawable) recordControlsWidget.J0.getValue(), -1);
                k2b3.getIcon().getClass();
                iq.a0((Drawable) recordControlsWidget.I0.getValue(), -1);
                return Unit.INSTANCE;
        }
    }
}
