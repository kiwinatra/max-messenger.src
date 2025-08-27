package defpackage;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.picker.PickerChatsListWidget;

/* renamed from: mib  reason: default package */
public final class mib extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerChatsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mib(PickerChatsListWidget pickerChatsListWidget, Continuation continuation) {
        super(2, continuation);
        this.b = pickerChatsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mib mib = new mib(this.b, continuation);
        mib.a = obj;
        return mib;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mib) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        PickerChatsListWidget pickerChatsListWidget = this.b;
        PickerChatsListWidget.d0(pickerChatsListWidget, (Pair) this.a, pickerChatsListWidget.X);
        return Unit.INSTANCE;
    }
}
