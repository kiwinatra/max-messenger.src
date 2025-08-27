package one.me.complaintbottomsheet;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/complaintbottomsheet/ComplaintBottomSheet;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "complaint-bottomsheet_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nComplaintBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintBottomSheet.kt\none/me/complaintbottomsheet/ComplaintBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 FlowExt.kt\nru/ok/tamtam/coroutines/FlowExtKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 6 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,121:1\n420#2:122\n235#2,10:123\n410#2,8:143\n74#3,10:133\n1863#4,2:151\n135#5,3:153\n138#5,8:170\n33#6,14:156\n*S KotlinDebug\n*F\n+ 1 ComplaintBottomSheet.kt\none/me/complaintbottomsheet/ComplaintBottomSheet\n*L\n40#1:122\n42#1:123,10\n79#1:143,8\n73#1:133,10\n97#1:151,2\n111#1:153,3\n111#1:170,8\n111#1:156,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class ComplaintBottomSheet extends Widget implements qg3 {
    public static final /* synthetic */ KProperty[] v = {wj6.p(ComplaintBottomSheet.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0)};
    public final is a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;

    public ComplaintBottomSheet() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final void g(int i, Bundle bundle) {
        la3 la3 = (la3) this.b.getValue();
        la3.getClass();
        z93[] values = z93.values();
        z93 z93 = (i < 0 || i > values.length + -1) ? null : values[i];
        if (z93 != null) {
            ((jna) ((rl) la3.c.getValue())).j(la3.b, z93);
            xag.h(la3.v, ja3.a);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Lazy lazy = this.b;
        etc etc = ((la3) lazy.getValue()).o;
        ju7 lifecycle = getViewLifecycleOwner().getLifecycle();
        iu7 iu7 = iu7.o;
        bs0.K(new sbd(new ea3(ct.k(etc, lifecycle, iu7), (Continuation) null, this)), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((la3) lazy.getValue()).v, getViewLifecycleOwner().getLifecycle(), iu7), new ba3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComplaintBottomSheet(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }

    public ComplaintBottomSheet(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(Long.class, "chat_id");
        this.b = createViewModelLazy(la3.class, new rn2(16, new aa3(this, 0)));
        this.c = LazyKt.lazy(new oq2(10));
        this.o = LazyKt.lazy(new aa3(this, 1));
    }

    public ComplaintBottomSheet(long j) {
        this(o54.f(TuplesKt.to("chat_id", Long.valueOf(j))));
    }
}
