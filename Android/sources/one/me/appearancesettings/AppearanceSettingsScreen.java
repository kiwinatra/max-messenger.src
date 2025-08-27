package one.me.appearancesettings;

import android.annotation.SuppressLint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appearancesettings/AppearanceSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "appearance-settings_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAppearanceSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppearanceSettingsScreen.kt\none/me/appearancesettings/AppearanceSettingsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ContextExt.kt\none/me/common/ext/ContextExtKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 9 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n235#2,10:258\n20#3:268\n20#3:269\n20#3:271\n28#4:270\n24#4:272\n24#4:282\n24#4:283\n24#4:286\n24#4:289\n24#4:290\n24#4:293\n24#4:294\n24#4:297\n49#5:273\n51#5:277\n46#6:274\n51#6:276\n105#7:275\n20#8:278\n21#8:299\n186#9,2:279\n186#9:281\n187#9:284\n186#9:285\n187#9:287\n186#9:288\n187#9:291\n186#9:292\n187#9:295\n186#9:296\n187#9:298\n1#10:300\n*S KotlinDebug\n*F\n+ 1 AppearanceSettingsScreen.kt\none/me/appearancesettings/AppearanceSettingsScreen\n*L\n60#1:258,10\n112#1:268\n129#1:269\n155#1:271\n132#1:270\n173#1:272\n194#1:282\n195#1:283\n198#1:286\n203#1:289\n204#1:290\n207#1:293\n208#1:294\n211#1:297\n177#1:273\n177#1:277\n177#1:274\n177#1:276\n177#1:275\n187#1:278\n187#1:299\n188#1:279,2\n193#1:281\n193#1:284\n197#1:285\n197#1:287\n202#1:288\n202#1:291\n206#1:292\n206#1:295\n210#1:296\n210#1:298\n*E\n"})
@SuppressLint({"ValidController"})
public final class AppearanceSettingsScreen extends Widget {
    public static final /* synthetic */ KProperty[] y;
    public final w28 a = new w28(new m(9), (Function0) null, 6);
    public final Lazy b = createViewModelLazy(as.class, new s(4, new m(10)));
    public final ReadOnlyProperty c = viewBinding(mna.d);
    public final ReadOnlyProperty o = viewBinding(mna.h);
    public final Lazy v;
    public final t56 w;
    public final Lazy x;

    static {
        Class<AppearanceSettingsScreen> cls = AppearanceSettingsScreen.class;
        y = new KProperty[]{wj6.p(cls, "chatPreview", "getChatPreview()Lone/me/appearancesettings/view/ChatAppearanceSelectorView;", 0), wj6.p(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public AppearanceSettingsScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        er erVar = er.a;
        Lazy h = erVar.getAccessor().h(aua.class);
        this.v = h;
        this.w = new t56((Object) new jr(c0()), ((aua) h.getValue()).a(), 3);
        this.x = erVar.getAccessor().h(fq.class);
    }

    public final as c0() {
        return (as) this.b.getValue();
    }

    public final yh7 getInsetsConfig() {
        yh7 yh7 = yh7.c;
        return yh7.d;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        u32 u32 = new u32(getContext(), ((aua) this.v.getValue()).a());
        u32.setId(mna.d);
        u32.setBackgroundSelectedListener(new nr(c0()));
        ev0.v(getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new or(u32, this, (Continuation) null), 3);
        h3b d = o54.d(getContext(), (AttributeSet) null);
        d.setId(mna.j);
        d.setForm(z2b.a);
        d.setTitle(nna.j);
        d.setLeftActions(new p2b(new l(10, this)));
        TextView textView = new TextView(getContext());
        textView.setId(mna.i);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ogf ogf = puf.t;
        ogf.b(textView, uy4.b);
        js9 js9 = fu4.k;
        textView.setTextColor(js9.e(textView.getContext()).f().getText().f);
        textView.setText(q8.p(nna.h, textView.getContext()));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(mna.h);
        recyclerView.setLayoutParams(new fj3(-1, 0));
        recyclerView.setAdapter(this.w);
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.j(new fr(0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        TextView textView2 = new TextView(getContext());
        textView2.setId(mna.f);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ogf.b(textView2, uy4.b);
        textView2.setTextColor(js9.e(textView2.getContext()).f().getText().f);
        textView2.setText(q8.p(nna.d, textView2.getContext()));
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = vo4.c().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        iq.a0(shapeDrawable, js9.e(getContext()).f().c().f);
        c0b c0b = new c0b(getContext());
        c0b.setId(mna.g);
        c0b.setLayoutParams(new fj3(0, 0));
        c0b.setValueFrom(c44.DEFAULT_ASPECT_RATIO);
        c0b.setValueTo(5.0f);
        c0b.setStepSize(1.0f);
        c0b.setValue((float) ((pid) ((fq) this.x.getValue())).d("app.extra.text.size.mode", 1));
        c0b.setBackground(shapeDrawable);
        TextView textView3 = new TextView(getContext());
        textView3.setId(mna.e);
        textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        puf.C.b(textView3, uy4.b);
        textView3.setTextColor(js9.e(textView3.getContext()).f().getText().f);
        textView3.setText(q8.p(nna.c, textView3.getContext()));
        ct.G(textView3, 300, new pb(1, c0b, textView3));
        c0b.z0.add(new kr(textView3, this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = (float) 12;
        float f2 = (float) 16;
        ShapeDrawable shapeDrawable2 = shapeDrawable;
        constraintLayout.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        constraintLayout.setLayoutParams(layoutParams);
        er erVar = er.a;
        bs0.K(new ps5(bs0.F(new wb(1, ((rta) erVar.getAccessor().g(rta.class)).a, this), ((osa) ((gaf) erVar.getAccessor().h(gaf.class).getValue())).a()), new pr(u32, (Continuation) null), 5), getViewLifecycleScope());
        constraintLayout.addView(u32);
        constraintLayout.addView(textView);
        constraintLayout.addView(recyclerView);
        constraintLayout.addView(textView2);
        constraintLayout.addView(textView3);
        constraintLayout.addView(c0b);
        pj3 h = ct.h(constraintLayout);
        int id = u32.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        int id2 = textView.getId();
        h.e(id2, 3, u32.getId(), 4);
        float f3 = (float) 24;
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 3, id2, 4));
        h.e(id2, 6, 0, 6);
        new ila(h, 6, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        int id3 = recyclerView.getId();
        h.e(id3, 3, textView.getId(), 4);
        float f4 = (float) 6;
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
        h.e(id3, 6, 0, 6);
        h.e(id3, 7, 0, 7);
        int id4 = textView2.getId();
        h.e(id4, 3, recyclerView.getId(), 4);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 3, id4, 4));
        h.e(id4, 6, 0, 6);
        new ila(h, 6, id4, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        int id5 = textView3.getId();
        h.e(id5, 3, recyclerView.getId(), 4);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 3, id5, 4));
        h.e(id5, 7, 0, 7);
        new ila(h, 7, id5, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        int id6 = c0b.getId();
        h.e(id6, 3, textView2.getId(), 4);
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 3, id6, 4));
        h.e(id6, 6, 0, 6);
        h.e(id6, 7, 0, 7);
        h.a(constraintLayout);
        LinearLayout linearLayout = new LinearLayout(getContext());
        h88.g(linearLayout);
        linearLayout.setOrientation(1);
        linearLayout.addView(d);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.addView(constraintLayout);
        linearLayout.addView(scrollView);
        b0h.H(linearLayout, new mr(this, textView, textView2, textView3, shapeDrawable2, u32, (Continuation) null));
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final void onViewCreated(View view) {
        o5a.O(new ps5(c0().D0, new rr(this, (Continuation) null), 5), getViewLifecycleScope());
        o5a.O(new ps5(c0().G0, new sr(this, (Continuation) null), 5), getViewLifecycleScope());
        o5a.O(new ps5(c0().E0, new SuspendLambda(2, (Continuation<Object>) null), 5), getViewLifecycleScope());
        c0().u();
    }
}
