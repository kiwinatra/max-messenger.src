package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: okb  reason: default package */
public final class okb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerMembersListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public okb(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.b = pickerMembersListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        okb okb = new okb(this.b, continuation);
        okb.a = obj;
        return okb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((okb) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = (String) this.a;
        PickerMembersListWidget pickerMembersListWidget = this.b;
        if (str == null || StringsKt.isBlank(str)) {
            KProperty[] kPropertyArr = PickerMembersListWidget.v0;
            tyc adapter = pickerMembersListWidget.f0().getAdapter();
            fhb fhb = pickerMembersListWidget.w;
            if (!Intrinsics.areEqual((Object) adapter, (Object) fhb)) {
                fbf fbf = pickerMembersListWidget.X;
                if (fbf != null) {
                    fbf.B(pickerMembersListWidget.f0());
                }
                pickerMembersListWidget.f0().O0(fhb, false);
                pickerMembersListWidget.X = y7e.n(pickerMembersListWidget.f0());
                if (pickerMembersListWidget.d0()) {
                    EndlessRecyclerView2 f0 = pickerMembersListWidget.f0();
                    n27 n27 = pickerMembersListWidget.Y;
                    if (n27 != null) {
                        f0.r0(n27);
                    }
                    pickerMembersListWidget.Y = null;
                    nwe nwe = pickerMembersListWidget.Z;
                    if (nwe != null) {
                        f0.r0(nwe);
                    }
                    pickerMembersListWidget.Z = null;
                    pickerMembersListWidget.c0(pickerMembersListWidget.f0());
                }
            }
        } else {
            KProperty[] kPropertyArr2 = PickerMembersListWidget.v0;
            tyc adapter2 = pickerMembersListWidget.f0().getAdapter();
            fhb fhb2 = pickerMembersListWidget.x;
            if (!Intrinsics.areEqual((Object) adapter2, (Object) fhb2)) {
                fbf fbf2 = pickerMembersListWidget.X;
                if (fbf2 != null) {
                    fbf2.B(pickerMembersListWidget.f0());
                }
                pickerMembersListWidget.f0().O0(fhb2, false);
                pickerMembersListWidget.X = y7e.n(pickerMembersListWidget.f0());
                if (pickerMembersListWidget.d0()) {
                    EndlessRecyclerView2 f02 = pickerMembersListWidget.f0();
                    n27 n272 = pickerMembersListWidget.Y;
                    if (n272 != null) {
                        f02.r0(n272);
                    }
                    pickerMembersListWidget.Y = null;
                    nwe nwe2 = pickerMembersListWidget.Z;
                    if (nwe2 != null) {
                        f02.r0(nwe2);
                    }
                    pickerMembersListWidget.Z = null;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
