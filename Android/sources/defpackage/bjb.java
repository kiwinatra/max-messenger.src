package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: bjb  reason: default package */
public final class bjb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerChatsListWidget2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjb(Continuation continuation, PickerChatsListWidget2 pickerChatsListWidget2) {
        super(2, continuation);
        this.b = pickerChatsListWidget2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bjb bjb = new bjb(continuation, this.b);
        bjb.a = obj;
        return bjb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bjb) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        PickerChatsListWidget2 pickerChatsListWidget2 = this.b;
        tyc tyc = (tyc) pickerChatsListWidget2.z.F().get(0);
        boolean isBlank = StringsKt.isBlank((String) this.a);
        fhb fhb = pickerChatsListWidget2.Y;
        fhb fhb2 = pickerChatsListWidget2.X;
        rd3 rd3 = pickerChatsListWidget2.z;
        if (isBlank) {
            if (!Intrinsics.areEqual((Object) tyc, (Object) fhb2)) {
                fbf fbf = pickerChatsListWidget2.v;
                if (fbf != null) {
                    fbf.B(pickerChatsListWidget2.f0());
                }
                rd3.H(fhb);
                rd3.E(fhb2);
                pickerChatsListWidget2.f0().setRefreshingNext(PickerChatsListWidget2.d0(pickerChatsListWidget2));
                pickerChatsListWidget2.v = y7e.n(pickerChatsListWidget2.f0());
            }
        } else if (!Intrinsics.areEqual((Object) tyc, (Object) fhb)) {
            fbf fbf2 = pickerChatsListWidget2.v;
            if (fbf2 != null) {
                fbf2.B(pickerChatsListWidget2.f0());
            }
            rd3.H(fhb2);
            rd3.E(fhb);
            pickerChatsListWidget2.f0().setRefreshingNext(PickerChatsListWidget2.d0(pickerChatsListWidget2));
            pickerChatsListWidget2.v = y7e.n(pickerChatsListWidget2.f0());
        }
        return Unit.INSTANCE;
    }
}
