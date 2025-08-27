package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;

/* renamed from: a29  reason: default package */
public final class a29 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaTypePickerWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a29(Continuation continuation, MediaTypePickerWidget mediaTypePickerWidget) {
        super(2, continuation);
        this.b = mediaTypePickerWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        a29 a29 = new a29(continuation, this.b);
        a29.a = obj;
        return a29;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a29) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = MediaTypePickerWidget.w;
        MediaTypePickerWidget mediaTypePickerWidget = this.b;
        mediaTypePickerWidget.getClass();
        KProperty kProperty = MediaTypePickerWidget.w[2];
        ((y19) this.a).getClass();
        ((h19) mediaTypePickerWidget.o.getValue()).setSelected(u19.a);
        return Unit.INSTANCE;
    }
}
