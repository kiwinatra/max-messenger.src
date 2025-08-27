package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatsListWidget;

/* renamed from: rib  reason: default package */
public final class rib extends SuspendLambda implements Function2 {
    public final /* synthetic */ PickerChatsListWidget a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rib(PickerChatsListWidget pickerChatsListWidget, Continuation continuation) {
        super(2, continuation);
        this.a = pickerChatsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rib(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rib) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = PickerChatsListWidget.Z;
        this.a.e0().a0();
        return Unit.INSTANCE;
    }
}
