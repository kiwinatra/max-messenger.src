package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import one.me.chats.picker.PickerChatsListWidget;

/* renamed from: sib  reason: default package */
public final class sib extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerChatsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sib(PickerChatsListWidget pickerChatsListWidget, Continuation continuation) {
        super(2, continuation);
        this.b = pickerChatsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sib sib = new sib(this.b, continuation);
        sib.a = obj;
        return sib;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sib) create((shb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        PickerChatsListWidget pickerChatsListWidget = this.b;
        tyc tyc = (tyc) CollectionsKt.first(pickerChatsListWidget.z.F());
        String str = ((shb) this.a).a;
        fhb fhb = pickerChatsListWidget.X;
        fhb fhb2 = pickerChatsListWidget.Y;
        rd3 rd3 = pickerChatsListWidget.z;
        if (str == null || StringsKt.isBlank(str)) {
            if (tyc != fhb) {
                fbf fbf = pickerChatsListWidget.o;
                if (fbf != null) {
                    fbf.B(pickerChatsListWidget.e0());
                }
                rd3.H(fhb2);
                rd3.E(fhb);
                pickerChatsListWidget.o = y7e.n(pickerChatsListWidget.e0());
            }
        } else if (tyc != fhb2) {
            fbf fbf2 = pickerChatsListWidget.o;
            if (fbf2 != null) {
                fbf2.B(pickerChatsListWidget.e0());
            }
            rd3.H(fhb);
            rd3.E(fhb2);
            pickerChatsListWidget.o = y7e.n(pickerChatsListWidget.e0());
        }
        return Unit.INSTANCE;
    }
}
