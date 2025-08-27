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
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: mkb  reason: default package */
public final class mkb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerMembersListWidget b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mkb(Continuation continuation, PickerMembersListWidget pickerMembersListWidget, View view) {
        super(2, continuation);
        this.b = pickerMembersListWidget;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mkb mkb = new mkb(continuation, this.b, this.c);
        mkb.a = obj;
        return mkb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mkb) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        PickerMembersListWidget pickerMembersListWidget = this.b;
        pickerMembersListWidget.x.G(list);
        View view = this.c;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        sn0 sn0 = pickerMembersListWidget.y;
        if (viewGroup != null) {
            f6e.c(viewGroup, (View) sn0.getValue(), -1);
        }
        EndlessRecyclerView2 f0 = pickerMembersListWidget.f0();
        int i = 0;
        f0.setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
        OneMeEmptyView oneMeEmptyView = (OneMeEmptyView) sn0.getValue();
        if (list == null || !list.isEmpty()) {
            i = 4;
        }
        oneMeEmptyView.setVisibility(i);
        return Unit.INSTANCE;
    }
}
