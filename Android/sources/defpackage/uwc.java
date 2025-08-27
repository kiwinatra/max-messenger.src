package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: uwc  reason: default package */
public final class uwc extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ FrameLayout b;
    public final /* synthetic */ RecordControlsWidget c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uwc(RecordControlsWidget recordControlsWidget, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                uwc uwc = new uwc(this.c, continuation, 0);
                uwc.b = frameLayout;
                return uwc.invokeSuspend(Unit.INSTANCE);
            default:
                uwc uwc2 = new uwc(this.c, continuation, 1);
                uwc2.b = frameLayout;
                return uwc2.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        js9 js9 = fu4.k;
        RecordControlsWidget recordControlsWidget = this.c;
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout = this.b;
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                js9.f(frameLayout).e().getClass();
                ((GradientDrawable) recordControlsWidget.O0.getValue()).setColor(-16745729);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout2 = this.b;
                KProperty[] kPropertyArr2 = RecordControlsWidget.g1;
                js9.f(frameLayout2).e().getClass();
                ((GradientDrawable) recordControlsWidget.N0.getValue()).setColor(i8b.Y(0.2f, -16745729));
                return Unit.INSTANCE;
        }
    }
}
