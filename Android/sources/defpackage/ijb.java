package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatsTabWidget;

/* renamed from: ijb  reason: default package */
public final class ijb extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ PickerChatsTabWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ijb(PickerChatsTabWidget pickerChatsTabWidget, Continuation continuation) {
        super(2, continuation);
        this.b = pickerChatsTabWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ijb ijb = new ijb(this.b, continuation);
        ijb.a = ((Boolean) obj).booleanValue();
        return ijb;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ijb) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        KProperty[] kPropertyArr = PickerChatsTabWidget.Z;
        PickerChatsTabWidget pickerChatsTabWidget = this.b;
        pickerChatsTabWidget.d0().setUserInputEnabled(!z);
        esf.a(pickerChatsTabWidget.c0(), pickerChatsTabWidget.Y);
        pickerChatsTabWidget.c0().setVisibility(z ^ true ? 0 : 8);
        return Unit.INSTANCE;
    }
}
