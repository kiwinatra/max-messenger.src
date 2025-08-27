package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.picker.PickerChatsTabWidget;

/* renamed from: fjb  reason: default package */
public final class fjb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerChatsTabWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fjb(PickerChatsTabWidget pickerChatsTabWidget, Continuation continuation) {
        super(2, continuation);
        this.b = pickerChatsTabWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fjb fjb = new fjb(this.b, continuation);
        fjb.a = obj;
        return fjb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fjb) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        PickerChatsTabWidget pickerChatsTabWidget = this.b;
        pickerChatsTabWidget.y.o = list;
        pickerChatsTabWidget.X.P(list);
        return Unit.INSTANCE;
    }
}
