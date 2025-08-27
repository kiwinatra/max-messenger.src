package one.me.sdk.sections;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/sdk/sections/SectionRecyclerWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "sections-widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSectionRecyclerWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionRecyclerWidget.kt\none/me/sdk/sections/SectionRecyclerWidget\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,69:1\n24#2:70\n142#3,8:71\n*S KotlinDebug\n*F\n+ 1 SectionRecyclerWidget.kt\none/me/sdk/sections/SectionRecyclerWidget\n*L\n62#1:70\n62#1:71,8\n*E\n"})
public abstract class SectionRecyclerWidget extends Widget {
    public static final /* synthetic */ KProperty[] c = {wj6.p(SectionRecyclerWidget.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final ReadOnlyProperty a = viewBinding(bza.n);
    public final p3a b = new p3a((Object) this);

    public SectionRecyclerWidget() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public abstract t56 c0();

    public abstract k1e d0();

    public final RecyclerView e0(int i) {
        rd3 rd3 = new rd3(d0(), c0());
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(bza.n);
        recyclerView.setAdapter(rd3);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        float f = (float) 12;
        recyclerView.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        k2b f2 = fu4.k.e(recyclerView.getContext()).f();
        p3a p3a = this.b;
        recyclerView.j(new mnd(f2, p3a, (h9) null, 12));
        recyclerView.j(new ar4(p3a, i));
        return recyclerView;
    }
}
