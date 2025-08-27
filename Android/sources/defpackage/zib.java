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
import kotlin.jvm.internal.Intrinsics;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: zib  reason: default package */
public final class zib extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerChatsListWidget2 b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zib(Continuation continuation, PickerChatsListWidget2 pickerChatsListWidget2, View view) {
        super(2, continuation);
        this.b = pickerChatsListWidget2;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zib zib = new zib(continuation, this.b, this.c);
        zib.a = obj;
        return zib;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zib) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        PickerChatsListWidget2 pickerChatsListWidget2 = this.b;
        pickerChatsListWidget2.Y.G(list);
        int i = 0;
        if (pickerChatsListWidget2.getView() != null) {
            pickerChatsListWidget2.f0().setRefreshingNext(false);
        }
        if (Intrinsics.areEqual((Object) pickerChatsListWidget2.b, (Object) "all.chat.folder")) {
            View view = this.c;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            sn0 sn0 = pickerChatsListWidget2.Z;
            if (viewGroup != null) {
                f6e.c(viewGroup, (View) sn0.getValue(), -1);
            }
            pickerChatsListWidget2.f0().setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
            OneMeEmptyView oneMeEmptyView = (OneMeEmptyView) sn0.getValue();
            if (list == null || !list.isEmpty()) {
                i = 4;
            }
            oneMeEmptyView.setVisibility(i);
        }
        return Unit.INSTANCE;
    }
}
