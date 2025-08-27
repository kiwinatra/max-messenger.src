package one.me.chats.picker.contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@SourceDebugExtension({"SMAP\nContactsPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactsPickerScreen.kt\none/me/chats/picker/contacts/ContactsPickerScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n419#2:166\n410#2,8:182\n55#3,12:167\n24#4:179\n184#5,2:180\n543#6,6:190\n*S KotlinDebug\n*F\n+ 1 ContactsPickerScreen.kt\none/me/chats/picker/contacts/ContactsPickerScreen\n*L\n45#1:166\n137#1:182,8\n54#1:167,12\n106#1:179\n106#1:180,2\n147#1:190,6\n*E\n"})
@SuppressLint({"ValidController"})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chats/picker/contacts/ContactsPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lbu3;", "Lu5a;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "requestCode", "(I)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
public final class ContactsPickerScreen extends AbstractPickerScreen<bu3> implements u5a {
    public static final /* synthetic */ KProperty[] X = {wj6.p(ContactsPickerScreen.class, "requestCode", "getRequestCode()I", 0)};
    public final is y;
    public final zc4 z;

    public ContactsPickerScreen(Bundle bundle) {
        super(bundle);
        this.y = new is(Integer.class, 0, "contacts.picker.request_code.key");
        zr0 zr0 = new zr0((zx3) this, (Function0) new nm1(18, this));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 1));
        }
        cs2 cs2 = cs2.a;
        this.z = new zc4(cs2.getAccessor().h(x23.class), cs2.getAccessor().h(gaf.class), (Lazy) null, 12);
    }

    public final Iterable c0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setText(jra.I);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        layoutParams.setMargins(roundToInt, roundToInt, roundToInt, roundToInt);
        oneMeButton.setLayoutParams(layoutParams);
        ct.G(oneMeButton, 300, new x4(29, (Object) this));
        bs0.K(new ps5(l0().x, new xt3(oneMeButton, (Continuation) null), 5), getViewLifecycleScope());
        return CollectionsKt.listOf(oneMeButton);
    }

    public final ojb d0() {
        return new zqd(cs2.a.getAccessor().h(cp3.class), this.z, false, 8);
    }

    public final Widget e0(String str) {
        return new PickerContactsListWidget(str, (DefaultConstructorMarker) null);
    }

    public final h3b f0(Context context) {
        h3b d = o54.d(context, (AttributeSet) null);
        d.setId(hra.Z);
        d.setTitle(jra.J);
        d.setForm(z2b.a);
        d.setLeftActions(new q2b(new rx2(5, this)));
        return d;
    }

    public final ukb g0() {
        cs2 cs2 = cs2.a;
        return new bu3(this.z, cs2.getAccessor().h(cp3.class), cs2.getAccessor().h(gaf.class));
    }

    public final xme i0() {
        return f6e.a(new igf(jra.H));
    }

    public final jgd m() {
        return jgd.CHAT_SHARE_CONTACT;
    }

    public final Set m0(Bundle bundle) {
        return SetsKt.emptySet();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        b0h.H(view, new zt3(3, (Continuation) null, 0));
        bs0.K(new ps5(ct.k(((bu3) l0().c).g, getViewLifecycleOwner().getLifecycle(), iu7.o), new yt3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ContactsPickerScreen(int i) {
        this(o54.f(TuplesKt.to("contacts.picker.request_code.key", Integer.valueOf(i))));
    }
}
