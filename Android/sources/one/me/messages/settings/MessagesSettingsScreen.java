package one.me.messages.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/messages/settings/MessagesSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "message-settings_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMessagesSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagesSettingsScreen.kt\none/me/messages/settings/MessagesSettingsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n235#2,10:121\n410#2,8:140\n17#3,8:131\n1#4:139\n*S KotlinDebug\n*F\n+ 1 MessagesSettingsScreen.kt\none/me/messages/settings/MessagesSettingsScreen\n*L\n37#1:121,10\n109#1:140,8\n65#1:131,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class MessagesSettingsScreen extends Widget {
    public static final /* synthetic */ KProperty[] w = {wj6.p(MessagesSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final w28 a = new w28(new h49(5), (Function0) null, 6);
    public final yh7 b = yh7.d;
    public final Lazy c;
    public final ReadOnlyProperty o;
    public final k1e v;

    public MessagesSettingsScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        Lazy<VM> createViewModelLazy = createViewModelLazy(gp9.class, new i76(28, new h49(6)));
        this.c = createViewModelLazy;
        this.o = viewBinding(kwa.a);
        k1e k1e = new k1e(new ch2(18, this), ((aua) bp9.a.getAccessor().g(aua.class)).a());
        this.v = k1e;
        bs0.K(new ps5(((gp9) createViewModelLazy.getValue()).o, new wq0(2, k1e, k1e.class, "submitList", "submitList(Ljava/util/List;)V", 4, 21), 5), getLifecycleScope());
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        h3b d = o54.d(linearLayout.getContext(), (AttributeSet) null);
        d.setId(kwa.b);
        d.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        d.setTitle(lwa.c);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new vq7(18, (Object) this)));
        linearLayout.addView(d);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(kwa.a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.v);
        recyclerView.j(new mnd(fu4.k.e(recyclerView.getContext()).f(), new p79(17), (h9) null, 12));
        recyclerView.j(new jz0(2));
        linearLayout.addView(recyclerView);
        b0h.H(linearLayout, new o(3, (Continuation) null, 6));
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.o.getValue(this, w[0])).setAdapter((tyc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(ct.k(((gp9) this.c.getValue()).v, getViewLifecycleOwner().getLifecycle(), iu7.o), new fp9((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
