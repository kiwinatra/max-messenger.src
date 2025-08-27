package one.me.devmenu.logsviewer;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/logsviewer/LogsViewerScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "h35", "w98", "logsviewer_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLogsViewerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogsViewerScreen.kt\none/me/devmenu/logsviewer/LogsViewerScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,155:1\n235#2,10:156\n49#3:166\n65#3,16:167\n93#3,3:183\n1#4:186\n32#5:187\n*S KotlinDebug\n*F\n+ 1 LogsViewerScreen.kt\none/me/devmenu/logsviewer/LogsViewerScreen\n*L\n49#1:156,10\n76#1:166\n76#1:167,16\n76#1:183,3\n84#1:187\n*E\n"})
@SuppressLint({"ValidController"})
public final class LogsViewerScreen extends Widget {
    public static final /* synthetic */ KProperty[] w = {wj6.p(LogsViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public static final int x = View.generateViewId();
    public final yh7 a = yh7.d;
    public final sn0 b = binding(new c28(1, this));
    public final Lazy c = createViewModelLazy(oa8.class, new i76(12, new ck7(21)));
    public final h35 o = new h35(c0().w);
    public final h35 v = new h35(c0().y);

    public LogsViewerScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public final oa8 c0() {
        return (oa8) this.c.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        KProperty kProperty = w[0];
        linearLayout.addView((h3b) this.b.getValue(), new FrameLayout.LayoutParams(-1, -2));
        EditText editText = new EditText(linearLayout.getContext());
        editText.setSingleLine(true);
        puf.k.b(editText, uy4.b);
        js9 js9 = fu4.k;
        editText.setTextColor(js9.e(editText.getContext()).f().getText().e);
        editText.addTextChangedListener(new u2(7, this));
        linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(linearLayout.getContext());
        view.setBackgroundColor(js9.e(view.getContext()).f().h().j);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 0.5d)));
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(linearLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setAdapter(this.o);
        endlessRecyclerView2.setThreshold(10);
        endlessRecyclerView2.j(new n27(new ColorDrawable(-16777216)));
        endlessRecyclerView2.setPager(new k71(4, this));
        bs0.K(new i21(c0().w, c0().y, new x2(endlessRecyclerView2, this, (Continuation) null, 14), 4), getViewLifecycleScope());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(endlessRecyclerView2, layoutParams);
        return linearLayout;
    }
}
