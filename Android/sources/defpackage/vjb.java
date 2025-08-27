package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: vjb  reason: default package */
public final class vjb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerContactsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vjb(PickerContactsListWidget pickerContactsListWidget, Continuation continuation) {
        super(2, continuation);
        this.b = pickerContactsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vjb vjb = new vjb(this.b, continuation);
        vjb.a = obj;
        return vjb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vjb) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean isBlank = StringsKt.isBlank((String) this.a);
        PickerContactsListWidget pickerContactsListWidget = this.b;
        if (isBlank) {
            KProperty[] kPropertyArr = PickerContactsListWidget.x0;
            tyc adapter = pickerContactsListWidget.e0().getAdapter();
            rd3 rd3 = pickerContactsListWidget.z;
            if (!Intrinsics.areEqual((Object) adapter, (Object) rd3)) {
                fbf fbf = pickerContactsListWidget.Z;
                if (fbf != null) {
                    fbf.B(pickerContactsListWidget.e0());
                }
                pickerContactsListWidget.e0().setAdapter(rd3);
                pickerContactsListWidget.Z = y7e.n(pickerContactsListWidget.e0());
                RecyclerView e0 = pickerContactsListWidget.e0();
                n27 n27 = pickerContactsListWidget.v0;
                if (n27 != null) {
                    e0.r0(n27);
                }
                pickerContactsListWidget.v0 = null;
                nwe nwe = pickerContactsListWidget.w0;
                if (nwe != null) {
                    e0.r0(nwe);
                }
                pickerContactsListWidget.w0 = null;
                pickerContactsListWidget.c0(pickerContactsListWidget.e0());
            }
        } else {
            KProperty[] kPropertyArr2 = PickerContactsListWidget.x0;
            tyc adapter2 = pickerContactsListWidget.e0().getAdapter();
            fhb fhb = pickerContactsListWidget.x;
            if (!Intrinsics.areEqual((Object) adapter2, (Object) fhb)) {
                fbf fbf2 = pickerContactsListWidget.Z;
                if (fbf2 != null) {
                    fbf2.B(pickerContactsListWidget.e0());
                }
                pickerContactsListWidget.e0().setAdapter(fhb);
                pickerContactsListWidget.Z = y7e.n(pickerContactsListWidget.e0());
                RecyclerView e02 = pickerContactsListWidget.e0();
                n27 n272 = pickerContactsListWidget.v0;
                if (n272 != null) {
                    e02.r0(n272);
                }
                pickerContactsListWidget.v0 = null;
                nwe nwe2 = pickerContactsListWidget.w0;
                if (nwe2 != null) {
                    e02.r0(nwe2);
                }
                pickerContactsListWidget.w0 = null;
            }
        }
        return Unit.INSTANCE;
    }
}
