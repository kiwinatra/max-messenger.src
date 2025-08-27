package one.me.profile.screens.addmembers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@SourceDebugExtension({"SMAP\nAddChatMembersScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddChatMembersScreen.kt\none/me/profile/screens/addmembers/AddChatMembersScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 7 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n*L\n1#1,199:1\n419#2:200\n420#2:201\n410#2,8:214\n55#3,12:202\n33#3,14:230\n256#4,2:222\n24#5:224\n184#6,2:225\n135#7,3:227\n138#7,8:244\n*S KotlinDebug\n*F\n+ 1 AddChatMembersScreen.kt\none/me/profile/screens/addmembers/AddChatMembersScreen\n*L\n50#1:200\n51#1:201\n78#1:214,8\n66#1:202,12\n185#1:230,14\n121#1:222,2\n123#1:224\n123#1:225,2\n185#1:227,3\n185#1:244,8\n*E\n"})
@SuppressLint({"ValidController"})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profile/screens/addmembers/AddChatMembersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lha;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
public final class AddChatMembersScreen extends AbstractPickerScreen<ha> implements qg3 {
    public static final /* synthetic */ KProperty[] Z;
    public final w28 X;
    public final xme Y;
    public final is y;
    public final is z;

    static {
        Class<AddChatMembersScreen> cls = AddChatMembersScreen.class;
        Z = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), rae.s(cls, "selectedIds", "getSelectedIds()[J", 0)};
    }

    public AddChatMembersScreen(Bundle bundle) {
        super(bundle);
        this.y = new is(Long.class, 0L, "chat_id");
        this.z = new is(long[].class, "selected_ids");
        this.X = new w28(new m(2), (Function0) null, 6);
        this.Y = f6e.a(new igf(lxa.d));
        bs0.K(new ps5(l0().x, new ia((Continuation) null, this), 5), getLifecycleScope());
        zr0 zr0 = new zr0((zx3) this, (Function0) new j6(3, this));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 0));
        }
    }

    public final Iterable c0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setText(((ha) l0().c).h ? lxa.c : lxa.b);
        oneMeButton.c(1, false);
        oneMeButton.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        layoutParams.setMargins(roundToInt, roundToInt, roundToInt, roundToInt);
        oneMeButton.setLayoutParams(layoutParams);
        ct.G(oneMeButton, 300, new x4(7, (Object) this));
        bs0.K(new ps5(l0().x, new ja(oneMeButton, (Continuation) null), 5), getViewLifecycleScope());
        return CollectionsKt.listOf(oneMeButton);
    }

    public final ojb d0() {
        return (i39) jxb.a.getAccessor().g(i39.class);
    }

    public final Widget e0(String str) {
        KProperty kProperty = Z[0];
        return new PickerMembersListWidget(str, ((Number) this.y.a(this)).longValue(), true, (DefaultConstructorMarker) null);
    }

    public final h3b f0(Context context) {
        h3b d = o54.d(context, (AttributeSet) null);
        d.setId(jxa.k);
        d.setTitle(((ha) l0().c).h ? lxa.f : lxa.e);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new l(4, this)));
        return d;
    }

    public final void g(int i, Bundle bundle) {
        if (i != jxa.h) {
            ha haVar = (ha) l0().c;
            Set set = (Set) l0().x.a.getValue();
            d14 d14 = haVar.d;
            aje aje = null;
            if (d14 != null) {
                aje = ev0.u(d14, ((osa) ((gaf) haVar.c.getValue())).b(), f14.b, new ga(i, haVar, set, (Continuation) null));
            }
            haVar.g.setValue(haVar, ha.i[0], aje);
        }
    }

    public final ukb g0() {
        KProperty kProperty = Z[0];
        long longValue = ((Number) this.y.a(this)).longValue();
        jxb jxb = jxb.a;
        return new ha(longValue, jxb.c(), jxb.f());
    }

    public final pgd getScreenDelegate() {
        return this.X;
    }

    public final xme i0() {
        return this.Y;
    }

    public final Set m0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set<Long> set = longArray != null ? ArraysKt.toSet(longArray) : null;
        return set == null ? SetsKt.emptySet() : set;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(ct.k(((ha) l0().c).f, getViewLifecycleOwner().getLifecycle(), iu7.o), new ka((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public AddChatMembersScreen(long j) {
        this(o54.f(TuplesKt.to("chat_id", Long.valueOf(j))));
    }
}
