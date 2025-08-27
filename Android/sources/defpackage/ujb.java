package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: ujb  reason: default package */
public final class ujb extends SuspendLambda implements Function2 {
    public final /* synthetic */ PickerContactsListWidget a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ujb(PickerContactsListWidget pickerContactsListWidget, Continuation continuation) {
        super(2, continuation);
        this.a = pickerContactsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ujb(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ujb) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = PickerContactsListWidget.x0;
        PickerContactsListWidget pickerContactsListWidget = this.a;
        kne.K(pickerContactsListWidget.e0(), new tjb(pickerContactsListWidget.e0(), 0));
        return Unit.INSTANCE;
    }
}
