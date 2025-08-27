package one.me.calls.ui.bottomsheet.more;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/more/CallMoreBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "Lcd1;", "type", "(Ljava/lang/String;Lcd1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallMoreBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallMoreBottomSheet.kt\none/me/calls/ui/bottomsheet/more/CallMoreBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,157:1\n419#2:158\n255#2,9:159\n235#2,10:168\n410#2,8:188\n5#3:178\n17#4,8:179\n1#5:187\n24#6:196\n24#6:205\n24#6:206\n24#6:207\n28#6:208\n157#7,8:197\n*S KotlinDebug\n*F\n+ 1 CallMoreBottomSheet.kt\none/me/calls/ui/bottomsheet/more/CallMoreBottomSheet\n*L\n42#1:158\n44#1:159,9\n45#1:168,10\n90#1:188,8\n58#1:178\n71#1:179,8\n107#1:196\n114#1:205\n116#1:206\n117#1:207\n119#1:208\n107#1:197,8\n*E\n"})
public final class CallMoreBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ KProperty[] v0;
    public final ReadOnlyProperty X;
    public final Lazy Y;
    public final bd1 Z;
    public final Lazy y;
    public final Lazy z;

    static {
        Class<CallMoreBottomSheet> cls = CallMoreBottomSheet.class;
        v0 = new KProperty[]{wj6.p(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public CallMoreBottomSheet(Bundle bundle) {
        super(bundle);
        is isVar = new is(egd.class, new egd("default"), Widget.ARG_SCOPE_ID);
        KProperty kProperty = v0[0];
        this.y = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, jj1.class, (Function0) null);
        this.z = createViewModelLazy(gd1.class, new s(12, new s2(bundle, (Widget) this, 11)));
        this.X = viewBinding(qqa.U);
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new v11(13));
        this.Y = lazy;
        this.Z = new bd1(new grg(6, this), (nxc) lazy.getValue(), ((aua) oh1.a.getAccessor().g(aua.class)).a());
    }

    public final k2b g0() {
        return l2b.a;
    }

    public final void m0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(linearLayout.getContext());
        frameLayout2.setId(qqa.W);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 5) * vo4.c().getDisplayMetrics().density));
        layoutParams2.gravity = 49;
        float f = (float) 12;
        layoutParams2.topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        layoutParams2.bottomMargin = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout2.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 40.0f));
        frameLayout2.setBackgroundColor(l2b.f.g);
        linearLayout.addView(frameLayout2);
        if (((gd1) this.z.getValue()).b == cd1.a) {
            TextView textView = new TextView(linearLayout.getContext());
            textView.setText(sqa.g);
            textView.setId(qqa.X);
            puf.c.b(textView, uy4.b);
            textView.setTextColor(l2b.i.e);
            textView.setGravity(17);
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density));
            linearLayout.addView(textView);
        }
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(qqa.U);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Z);
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.j(new mnd(l2b.a, new d9d(19, this), new h9(26), 4));
        recyclerView.j(new jz0(0));
        linearLayout.addView(recyclerView);
        b0h.H(linearLayout, new ed1(3, (Continuation) null, 0));
        frameLayout.addView(linearLayout);
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.X.getValue(this, v0[1])).setAdapter((tyc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        List list;
        Lazy lazy = this.z;
        gd1 gd1 = (gd1) lazy.getValue();
        jj1 jj1 = (jj1) gd1.c;
        k91 k91 = (k91) jj1.C0.a.getValue();
        int ordinal = gd1.b.ordinal();
        if (ordinal != 0) {
            boolean z2 = true;
            if (ordinal == 1) {
                boolean z3 = k91.g;
                ni1 ni1 = k91.i;
                if (z3) {
                    kz0 kz0 = a8b.a;
                    boolean booleanValue = ((Boolean) jj1.z0.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) jj1.B0.getValue()).booleanValue();
                    vag vag = (vag) jj1.L0.a.getValue();
                    List createListBuilder = CollectionsKt.createListBuilder();
                    if (k91.l && !ni1.a()) {
                        z2 = false;
                    }
                    vag.a.getClass();
                    vag vag2 = vag.o;
                    if (vag == vag2 && z2) {
                        createListBuilder.add(a8b.k);
                    } else if (vag == vag2) {
                        createListBuilder.add(a8b.j);
                    } else if (js9.k(vag) && z2) {
                        createListBuilder.add(a8b.i);
                    } else if (js9.k(vag)) {
                        createListBuilder.add(a8b.h);
                    }
                    if (booleanValue) {
                        ni1.getClass();
                        if (ni1.a()) {
                            createListBuilder.add(a8b.d);
                        } else {
                            createListBuilder.add(a8b.c);
                        }
                    }
                    if (booleanValue2) {
                        createListBuilder.addAll(a8b.a(k91.j));
                    }
                    list = CollectionsKt.build(createListBuilder);
                } else {
                    kz0 kz02 = a8b.a;
                    boolean booleanValue3 = ((Boolean) jj1.A0.getValue()).booleanValue();
                    List createListBuilder2 = CollectionsKt.createListBuilder();
                    if (booleanValue3) {
                        ni1.getClass();
                        if (ni1.a()) {
                            createListBuilder2.add(a8b.d);
                        } else {
                            createListBuilder2.add(a8b.c);
                        }
                    }
                    createListBuilder2.add(a8b.b);
                    createListBuilder2.add(a8b.a);
                    list = CollectionsKt.build(createListBuilder2);
                }
            } else if (ordinal == 2) {
                kz0 kz03 = a8b.a;
                list = a8b.a(k91.j);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            list = CollectionsKt.emptyList();
        }
        this.Z.G(list);
        bs0.K(new ps5(ct.k(((gd1) lazy.getValue()).w, getViewLifecycleOwner().getLifecycle(), iu7.o), new dd1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public CallMoreBottomSheet(String str, cd1 cd1, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID), TuplesKt.to("open_type", cd1.name())));
    }
}
