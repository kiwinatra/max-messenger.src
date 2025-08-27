package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: ajb  reason: default package */
public final class ajb extends SuspendLambda implements Function2 {
    public final /* synthetic */ PickerChatsListWidget2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajb(Continuation continuation, PickerChatsListWidget2 pickerChatsListWidget2) {
        super(2, continuation);
        this.a = pickerChatsListWidget2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ajb(continuation, this.a);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ajb) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = PickerChatsListWidget2.w0;
        this.a.f0().a0();
        return Unit.INSTANCE;
    }
}
