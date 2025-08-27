package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: e7g  reason: default package */
public final class e7g extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ VideoMessageWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e7g(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.b = videoMessageWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        e7g e7g = new e7g(continuation, this.b);
        e7g.a = obj;
        return e7g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e7g) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        r6g r6g = (r6g) this.a;
        boolean z = r6g.b;
        VideoMessageWidget videoMessageWidget = this.b;
        Drawable drawable = z ? (Drawable) videoMessageWidget.w.getValue() : (Drawable) videoMessageWidget.x.getValue();
        KProperty[] kPropertyArr = VideoMessageWidget.X;
        videoMessageWidget.getClass();
        KProperty[] kPropertyArr2 = VideoMessageWidget.X;
        KProperty kProperty = kPropertyArr2[1];
        ReadOnlyProperty readOnlyProperty = videoMessageWidget.o;
        ((ImageView) readOnlyProperty.getValue(videoMessageWidget, kProperty)).setImageDrawable(drawable);
        ViewPropertyAnimator viewPropertyAnimator = videoMessageWidget.y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = ((ImageView) readOnlyProperty.getValue(videoMessageWidget, kPropertyArr2[1])).animate().alpha(r6g.a ? 1.0f : c44.DEFAULT_ASPECT_RATIO).setDuration(200).withEndAction(new uj6(27, videoMessageWidget, r6g));
        videoMessageWidget.y = withEndAction;
        if (withEndAction != null) {
            withEndAction.start();
        }
        return Unit.INSTANCE;
    }
}
