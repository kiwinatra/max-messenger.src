package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: sjb  reason: default package */
public final class sjb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerContactsListWidget b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sjb(Continuation continuation, PickerContactsListWidget pickerContactsListWidget, View view) {
        super(2, continuation);
        this.b = pickerContactsListWidget;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sjb sjb = new sjb(continuation, this.b, this.c);
        sjb.a = obj;
        return sjb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sjb) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        PickerContactsListWidget pickerContactsListWidget = this.b;
        pickerContactsListWidget.x.G(list);
        boolean z = !StringsKt.isBlank((CharSequence) pickerContactsListWidget.d0().X.a.getValue());
        sn0 sn0 = pickerContactsListWidget.X;
        int i = 0;
        if (z) {
            View view = this.c;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                f6e.c(viewGroup, (View) sn0.getValue(), -1);
            }
            pickerContactsListWidget.e0().setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
            OneMeEmptyView oneMeEmptyView = (OneMeEmptyView) sn0.getValue();
            if (list == null || !list.isEmpty()) {
                i = 4;
            }
            oneMeEmptyView.setVisibility(i);
        } else {
            pickerContactsListWidget.e0().setVisibility(0);
            ((OneMeEmptyView) sn0.getValue()).setVisibility(4);
        }
        return Unit.INSTANCE;
    }
}
