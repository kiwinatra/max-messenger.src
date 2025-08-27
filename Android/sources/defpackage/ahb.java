package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatController;

/* renamed from: ahb  reason: default package */
public final class ahb extends SuspendLambda implements Function2 {
    public final /* synthetic */ PickerChatController a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahb(PickerChatController pickerChatController, Continuation continuation) {
        super(2, continuation);
        this.a = pickerChatController;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ahb(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ahb) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = PickerChatController.z0;
        h88.f(this.a.e0(), PickerChatController.A0, (Function1) null);
        return Unit.INSTANCE;
    }
}
