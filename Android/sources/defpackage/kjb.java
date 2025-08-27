package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.picker.chats.PickerChatsTabWidget2;

/* renamed from: kjb  reason: default package */
public final class kjb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerChatsTabWidget2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kjb(PickerChatsTabWidget2 pickerChatsTabWidget2, Continuation continuation) {
        super(2, continuation);
        this.b = pickerChatsTabWidget2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        kjb kjb = new kjb(this.b, continuation);
        kjb.a = obj;
        return kjb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kjb) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        PickerChatsTabWidget2 pickerChatsTabWidget2 = this.b;
        pickerChatsTabWidget2.y.o = list;
        pickerChatsTabWidget2.X.P(list);
        return Unit.INSTANCE;
    }
}
