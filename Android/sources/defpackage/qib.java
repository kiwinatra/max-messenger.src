package defpackage;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.picker.PickerChatsListWidget;

/* renamed from: qib  reason: default package */
public final class qib extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerChatsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qib(PickerChatsListWidget pickerChatsListWidget, Continuation continuation) {
        super(2, continuation);
        this.b = pickerChatsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qib qib = new qib(this.b, continuation);
        qib.a = obj;
        return qib;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qib) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        PickerChatsListWidget pickerChatsListWidget = this.b;
        PickerChatsListWidget.d0(pickerChatsListWidget, (Pair) this.a, pickerChatsListWidget.Y);
        return Unit.INSTANCE;
    }
}
