package one.me.devmenu.server;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/server/ServerHostBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nServerHostBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerHostBottomSheet.kt\none/me/devmenu/server/ServerHostBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 7 StringExt.kt\nru/ok/tamtam/shared/StringExtKt\n*L\n1#1,397:1\n235#2,10:398\n410#2,8:415\n410#2,8:423\n24#3:408\n24#3:414\n1#4:409\n256#5,2:410\n256#5,2:412\n49#6:431\n65#6,16:432\n93#6,3:448\n4#7:451\n*S KotlinDebug\n*F\n+ 1 ServerHostBottomSheet.kt\none/me/devmenu/server/ServerHostBottomSheet\n*L\n61#1:398,10\n154#1:415,8\n158#1:423,8\n90#1:408\n136#1:414\n113#1:410,2\n119#1:412,2\n127#1:431\n127#1:432,16\n127#1:448,3\n144#1:451\n*E\n"})
@SuppressLint({"ValidController"})
public final class ServerHostBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ KProperty[] E0;
    public final ReadOnlyProperty A0;
    public final ReadOnlyProperty B0;
    public final ReadOnlyProperty C0;
    public final ReadOnlyProperty D0;
    public final Lazy w0;
    public final AutoTransition x0 = new AutoTransition();
    public final t56 y0;
    public final ReadOnlyProperty z0;

    static {
        Class<ServerHostBottomSheet> cls = ServerHostBottomSheet.class;
        E0 = new KProperty[]{wj6.p(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "loaderView", "getLoaderView()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0), wj6.p(cls, "customContainer", "getCustomContainer()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), wj6.p(cls, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public ServerHostBottomSheet() {
        super((Bundle) null, 1, (DefaultConstructorMarker) null);
        Lazy<VM> createViewModelLazy = createViewModelLazy(c37.class, new zfa(21, new red(9)));
        this.w0 = createViewModelLazy;
        this.y0 = new t56((Object) new std((c37) createViewModelLazy.getValue()), ((aua) tm4.a.getAccessor().g(aua.class)).a(), 14);
        this.z0 = viewBinding(rgc.server_host_recycler);
        this.A0 = viewBinding(rgc.server_host_loader);
        this.B0 = viewBinding(rgc.server_host_container);
        this.C0 = viewBinding(rgc.server_host_input);
        this.D0 = viewBinding(rgc.server_host_custom_btn);
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Адрес сервера");
        puf.c.b(textView, uy4.b);
        textView.setTextColor(fu4.k.e(textView.getContext()).f().getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 16;
        layoutParams.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(rgc.server_host_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setAdapter(this.y0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        linearLayout.addView(recyclerView);
        aya aya = new aya(linearLayout.getContext());
        aya.setId(rgc.server_host_loader);
        linearLayout.setGravity(17);
        aya.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        aya.setAppearance(sxa.a);
        aya.setSize(vxa.a);
        aya.setVisibility(8);
        linearLayout.addView(aya);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(rgc.server_host_container);
        linearLayout2.setOrientation(1);
        linearLayout2.setVisibility(8);
        h2b h2b = new h2b(linearLayout2.getContext());
        h2b.setId(rgc.server_host_input);
        h2b.setLayoutParams(new fj3(-1, -2));
        h2b.setBackgroundColorAttr(Integer.valueOf(jya.a));
        h2b.setHint("Введите кастомный адрес");
        EditText editText = h2b.a;
        u2 u2Var = new u2(15, this);
        editText.addTextChangedListener(u2Var);
        editText.addTextChangedListener(u2Var);
        linearLayout2.addView(h2b);
        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), (AttributeSet) null);
        oneMeButton.setId(rgc.server_host_custom_btn);
        fj3 fj3 = new fj3(-1, -2);
        fj3.topMargin = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(fj3);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setText((CharSequence) "Установить");
        ct.G(oneMeButton, 300, new u99(24, (Object) this));
        linearLayout2.addView(oneMeButton);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Lazy lazy = this.w0;
        xme xme = ((c37) lazy.getValue()).y;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(xme, getViewLifecycleOwner().getLifecycle(), iu7), new ttd((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((c37) lazy.getValue()).z, getViewLifecycleOwner().getLifecycle(), iu7), new utd((Continuation) null, this, view), 5), getViewLifecycleScope());
    }
}
