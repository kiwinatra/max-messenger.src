package one.me.startconversation.channel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@SourceDebugExtension({"SMAP\nPickSubscribersScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickSubscribersScreen.kt\none/me/startconversation/channel/PickSubscribersScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,192:1\n420#2:193\n420#2:194\n55#3,12:195\n365#4:207\n24#5:208\n184#6,2:209\n*S KotlinDebug\n*F\n+ 1 PickSubscribersScreen.kt\none/me/startconversation/channel/PickSubscribersScreen\n*L\n42#1:193\n43#1:194\n75#1:195,12\n182#1:207\n65#1:208\n65#1:209,2\n*E\n"})
@SuppressLint({"ValidController"})
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/channel/PickSubscribersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Legb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
public final class PickSubscribersScreen extends AbstractPickerScreen<egb> {
    public static final /* synthetic */ KProperty[] w0;
    public final Lazy X;
    public z3a Y;
    public final xme Z;
    public final sn0 v0;
    public final is y;
    public final is z;

    static {
        Class<PickSubscribersScreen> cls = PickSubscribersScreen.class;
        w0 = new KProperty[]{rae.s(cls, "selectedIds", "getSelectedIds()[J", 0), wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public PickSubscribersScreen(Bundle bundle) {
        super(bundle);
        this.y = new is(long[].class, "selected_ids");
        this.z = new is(Long.class, "id");
        this.X = LazyKt.lazy(new lgb(0));
        this.Z = f6e.a(new igf(g1b.w));
        this.v0 = binding(new mgb(this, 0));
        bs0.K(new ps5(l0().x, new ogb(this, (Continuation) null), 5), getLifecycleScope());
        zr0 zr0 = new zr0((zx3) this, (Function0) new mgb(this, 1));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 11));
        }
    }

    public final Iterable c0() {
        bs0.K(new ps5(l0().x, new qgb(this, (Continuation) null), 5), getViewLifecycleScope());
        return CollectionsKt.listOf(n0());
    }

    public final ojb d0() {
        return (i39) wke.a.getAccessor().g(i39.class);
    }

    public final Widget e0(String str) {
        return new PickerMembersListWidget(str, 0, false, 6, (DefaultConstructorMarker) null);
    }

    public final h3b f0(Context context) {
        h3b d = o54.d(context, (AttributeSet) null);
        d.setId(f1b.p);
        d.setTitle(g1b.e);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new ngb(this, 0)));
        return d;
    }

    public final ukb g0() {
        KProperty kProperty = w0[1];
        long longValue = ((Number) this.z.a(this)).longValue();
        wke wke = wke.a;
        return new egb(longValue, wke.getAccessor().h(rl.class), wke.getAccessor().h(gaf.class), wke.getAccessor().h(qx2.class), wke.getAccessor().h(kgb.class), wke.getAccessor().h(rh3.class));
    }

    public final xme i0() {
        return this.Z;
    }

    public final Set m0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set<Long> set = longArray != null ? ArraysKt.toSet(longArray) : null;
        return set == null ? SetsKt.emptySet() : set;
    }

    public final OneMeButton n0() {
        KProperty kProperty = w0[2];
        return (OneMeButton) this.v0.getValue();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(((egb) l0().c).h, new rgb(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public PickSubscribersScreen(long j) {
        this(o54.f(TuplesKt.to("id", Long.valueOf(j))));
    }
}
