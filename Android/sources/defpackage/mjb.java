package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.picker.chats.PickerChatsTabWidget2;

/* renamed from: mjb  reason: default package */
public final class mjb extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ PickerChatsTabWidget2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mjb(PickerChatsTabWidget2 pickerChatsTabWidget2, Continuation continuation) {
        super(2, continuation);
        this.b = pickerChatsTabWidget2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mjb mjb = new mjb(this.b, continuation);
        mjb.a = ((Boolean) obj).booleanValue();
        return mjb;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((mjb) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        int i = 0;
        PickerChatsTabWidget2 pickerChatsTabWidget2 = this.b;
        if (z) {
            KProperty[] kPropertyArr = PickerChatsTabWidget2.Z;
            if (pickerChatsTabWidget2.d0().getCurrentItem() != 0) {
                pickerChatsTabWidget2.d0().e(0, false);
            }
        }
        KProperty[] kPropertyArr2 = PickerChatsTabWidget2.Z;
        pickerChatsTabWidget2.d0().setUserInputEnabled(!z);
        esf.a(pickerChatsTabWidget2.c0(), pickerChatsTabWidget2.Y);
        c2b c0 = pickerChatsTabWidget2.c0();
        if (!(!z)) {
            i = 8;
        }
        c0.setVisibility(i);
        return Unit.INSTANCE;
    }
}
