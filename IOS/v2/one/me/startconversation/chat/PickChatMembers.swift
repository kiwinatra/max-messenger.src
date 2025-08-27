package one.me.startconversation.chat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
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

@SourceDebugExtension({"SMAP\nPickChatMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickChatMembers.kt\none/me/startconversation/chat/PickChatMembers\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,138:1\n420#2:139\n410#2,8:152\n55#3,12:140\n24#4:160\n184#5,2:161\n*S KotlinDebug\n*F\n+ 1 PickChatMembers.kt\none/me/startconversation/chat/PickChatMembers\n*L\n41#1:139\n66#1:152,8\n57#1:140,12\n97#1:160\n97#1:161,2\n*E\n"})
@SuppressLint({"ValidController"})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/startconversation/chat/PickChatMembers;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lsfb;", "<init>", "()V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
public final class PickChatMembers extends AbstractPickerScreen<sfb> {
    public static final /* synthetic */ KProperty[] Z = {rae.s(PickChatMembers.class, "selectedIds", "getSelectedIds()[J", 0)};
    public final w28 X = new w28(new pna(29), (Function0) null, 6);
    public final xme Y = f6e.a(new igf(g1b.w));
    public final is y = new is(long[].class, "selected_ids");
    public final Lazy z = wke.a.getAccessor().h(edb.class);

    public PickChatMembers() {
        super(new Bundle(0));
        bs0.K(new ps5(l0().x, new ofb((Continuation) null, this), 5), getLifecycleScope());
        zr0 zr0 = new zr0((zx3) this, (Function0) new ifb(1, this));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 10));
        }
    }

    public final Iterable c0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setText(jra.Q);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        layoutParams.setMargins(roundToInt, roundToInt, roundToInt, roundToInt);
        oneMeButton.setLayoutParams(layoutParams);
        ct.G(oneMeButton, 300, new u99(15, (Object) this));
        bs0.K(new ps5(l0().x, new pfb(oneMeButton, (Continuation) null), 5), getViewLifecycleScope());
        return CollectionsKt.listOf(oneMeButton);
    }

    public final ojb d0() {
        return (i39) wke.a.getAccessor().g(i39.class);
    }

    public final Widget e0(String str) {
        return new PickerMembersListWidget(str, 0, false, 6, (DefaultConstructorMarker) null);
    }

    public final h3b f0(Context context) {
        h3b d = o54.d(context, (AttributeSet) null);
        d.setId(f1b.k);
        d.setTitle(g1b.g);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new vq7(25, (Object) this)));
        return d;
    }

    public final ukb g0() {
        return new sfb();
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

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            eng eng = new eng(this, 1);
            String[] strArr2 = edb.e;
            int i2 = qad.t6;
            int i3 = qad.U6;
            ((edb) this.z.getValue()).getClass();
            edb.k(eng, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(ct.k(((sfb) l0().c).e, getViewLifecycleOwner().getLifecycle(), iu7.o), new qfb((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
