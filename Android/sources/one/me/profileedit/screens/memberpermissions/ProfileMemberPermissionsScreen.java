package one.me.profileedit.screens.memberpermissions;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profileedit/screens/memberpermissions/ProfileMemberPermissionsScreen;", "Lone/me/sdk/arch/Widget;", "La4c;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nProfileMemberPermissionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileMemberPermissionsScreen.kt\none/me/profileedit/screens/memberpermissions/ProfileMemberPermissionsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,172:1\n235#2,10:173\n1#3:183\n24#4:184\n24#4:193\n24#4:194\n24#4:195\n24#4:196\n142#5,8:185\n*S KotlinDebug\n*F\n+ 1 ProfileMemberPermissionsScreen.kt\none/me/profileedit/screens/memberpermissions/ProfileMemberPermissionsScreen\n*L\n47#1:173,10\n97#1:184\n125#1:193\n129#1:194\n132#1:195\n133#1:196\n97#1:185,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class ProfileMemberPermissionsScreen extends Widget implements a4c {
    public static final /* synthetic */ int o = 0;
    public final yh7 a;
    public final Lazy b;
    public final b4c c;

    public ProfileMemberPermissionsScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = yh7.d;
        this.b = createViewModelLazy(q4c.class, new zfa(17, new bg2(bundle, 4)));
        this.c = new b4c(((aua) bzb.a.getAccessor().g(aua.class)).a(), this);
    }

    public final q4c c0() {
        return (q4c) this.b.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final boolean handleBack() {
        xag.h(c0().w0, p33.b);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d4c d4c = new d4c(this, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        b0h.H(linearLayout, new o(3, (Continuation) null, 10));
        d4c.invoke(linearLayout);
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final void onViewCreated(View view) {
        bs0.K(new ps5(c0().v0, new p2c(2, this.c, b4c.class, "submitList", "submitList(Ljava/util/List;)V", 4, 1), 5), getViewLifecycleScope());
        bs0.K(new ps5(c0().w0, new SuspendLambda(2, (Continuation<Object>) null), 5), getViewLifecycleScope());
    }

    public ProfileMemberPermissionsScreen(long j) {
        this(o54.f(TuplesKt.to("id", Long.valueOf(j))));
    }
}
