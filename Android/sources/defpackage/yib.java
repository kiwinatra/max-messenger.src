package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: yib  reason: default package */
public final class yib extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerChatsListWidget2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yib(Continuation continuation, PickerChatsListWidget2 pickerChatsListWidget2) {
        super(2, continuation);
        this.b = pickerChatsListWidget2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yib yib = new yib(continuation, this.b);
        yib.a = obj;
        return yib;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yib) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        PickerChatsListWidget2 pickerChatsListWidget2 = this.b;
        boolean d0 = PickerChatsListWidget2.d0(pickerChatsListWidget2);
        pickerChatsListWidget2.X.G((List) this.a);
        if (pickerChatsListWidget2.getView() != null) {
            pickerChatsListWidget2.f0().setRefreshingNext(d0);
        }
        return Unit.INSTANCE;
    }
}
