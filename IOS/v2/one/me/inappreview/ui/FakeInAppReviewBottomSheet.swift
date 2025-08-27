package one.me.inappreview.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inappreview/ui/FakeInAppReviewBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "in-app-review_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFakeInAppReviewBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FakeInAppReviewBottomSheet.kt\none/me/inappreview/ui/FakeInAppReviewBottomSheet\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 5 Ripple.kt\none/me/sdk/uikit/common/RippleKt\n+ 6 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 7 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n+ 8 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,249:1\n28#2:250\n28#2:251\n24#2:265\n24#2:267\n24#2:268\n24#2:271\n24#2:272\n24#2:275\n24#2:278\n24#2:279\n24#2:282\n24#2:283\n24#2:284\n24#2:287\n24#2:288\n24#2:289\n24#2:290\n24#2:293\n24#2:294\n24#2:295\n24#2:296\n24#2:299\n24#2:300\n24#2:301\n1#3:252\n55#4,12:253\n23#5:266\n23#5:317\n20#6:269\n21#6:298\n186#7:270\n187#7:273\n186#7:274\n187#7:276\n186#7:277\n187#7:280\n186#7:281\n187#7:285\n186#7:286\n187#7:291\n186#7:292\n187#7:297\n30#8:302\n91#8,14:303\n*S KotlinDebug\n*F\n+ 1 FakeInAppReviewBottomSheet.kt\none/me/inappreview/ui/FakeInAppReviewBottomSheet\n*L\n47#1:250\n51#1:251\n87#1:265\n118#1:267\n126#1:268\n154#1:271\n155#1:272\n160#1:275\n164#1:278\n165#1:279\n169#1:282\n170#1:283\n171#1:284\n175#1:287\n176#1:288\n177#1:289\n178#1:290\n182#1:293\n183#1:294\n184#1:295\n185#1:296\n198#1:299\n208#1:300\n215#1:301\n71#1:253,12\n106#1:266\n58#1:317\n152#1:269\n152#1:298\n153#1:270\n153#1:273\n158#1:274\n158#1:276\n163#1:277\n163#1:280\n168#1:281\n168#1:285\n174#1:286\n174#1:291\n181#1:292\n181#1:297\n238#1:302\n238#1:303,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class FakeInAppReviewBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ KProperty[] F0;
    public final ShapeDrawable A0;
    public final ShapeDrawable B0;
    public final Lazy C0;
    public final ne4 D0;
    public boolean E0;
    public final ReadOnlyProperty w0 = viewBinding(nua.a);
    public final ReadOnlyProperty x0 = viewBinding(nua.h);
    public final ShapeDrawable y0;
    public final ShapeDrawable z0;

    static {
        Class<FakeInAppReviewBottomSheet> cls = FakeInAppReviewBottomSheet.class;
        F0 = new KProperty[]{wj6.p(cls, "rateView", "getRateView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), wj6.p(cls, "thankView", "getThankView()Landroid/widget/FrameLayout;", 0)};
    }

    public FakeInAppReviewBottomSheet() {
        super((Bundle) null, 1, (DefaultConstructorMarker) null);
        float[] fArr = {vo4.c().getDisplayMetrics().density * 50.0f, vo4.c().getDisplayMetrics().density * 50.0f, vo4.c().getDisplayMetrics().density * 50.0f, vo4.c().getDisplayMetrics().density * 50.0f, vo4.c().getDisplayMetrics().density * 50.0f, vo4.c().getDisplayMetrics().density * 50.0f, vo4.c().getDisplayMetrics().density * 50.0f, vo4.c().getDisplayMetrics().density * 50.0f};
        this.y0 = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(vo4.c().getDisplayMetrics().density * 1.0f);
        this.z0 = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable2.getPaint().setColor(-16611745);
        this.A0 = shapeDrawable2;
        this.B0 = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        this.C0 = LazyKt.lazy(new u75(2, this));
        this.D0 = new ne4(24, this);
        this.E0 = true;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [androidx.constraintlayout.widget.ConstraintLayout, tpc, android.view.View, java.lang.Object, android.view.ViewGroup] */
    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(nua.a);
        AppCompatImageView appCompatImageView = new AppCompatImageView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatImageView.setId(nua.b);
        appCompatImageView.setImageDrawable(appCompatImageView.getContext().getPackageManager().getApplicationIcon(appCompatImageView.getContext().getApplicationInfo()));
        float f = (float) 44;
        constraintLayout.addView(appCompatImageView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView.setId(nua.g);
        puf.c.b(appCompatTextView, uy4.b);
        appCompatTextView.setText(qad.aa);
        js9 js9 = fu4.k;
        appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().e);
        constraintLayout.addView(appCompatTextView, -2, -2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView2.setId(nua.f);
        puf.j.b(appCompatTextView2, uy4.b);
        appCompatTextView2.setText(pua.d);
        appCompatTextView2.setTextColor(js9.e(appCompatTextView2.getContext()).f().getText().h);
        constraintLayout.addView(appCompatTextView2, -2, -2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView3.setId(nua.c);
        appCompatTextView3.setGravity(17);
        appCompatTextView3.setBackground(new RippleDrawable(ColorStateList.valueOf(js9.e(appCompatTextView3.getContext()).f().b().a.b), this.z0, this.y0));
        appCompatTextView3.setText(pua.b);
        appCompatTextView3.setTextColor(-16611745);
        ct.G(appCompatTextView3, 300, new vg5(this, 0));
        constraintLayout.addView(appCompatTextView3, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView4.setId(nua.e);
        appCompatTextView4.setGravity(17);
        appCompatTextView4.setBackground(this.B0);
        appCompatTextView4.setTextColor(js9.e(appCompatTextView4.getContext()).f().getText().h);
        appCompatTextView4.setText(pua.c);
        constraintLayout.addView(appCompatTextView4, 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        Context context = constraintLayout.getContext();
        ? constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.E0 = -1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < 5) {
            ImageView imageView = new ImageView(context);
            imageView.setId(View.generateViewId());
            int i2 = i + 1;
            imageView.setContentDescription(imageView.getResources().getQuantityString(oua.b, i2, new Object[]{Integer.valueOf(i2)}));
            imageView.setImageDrawable(new EnhancedVectorDrawable(context, mua.c));
            imageView.setOnClickListener(new mg3(constraintLayout2, i, 1));
            b0h.H(imageView, new xd2(3, (Continuation) null, 4));
            float f2 = (float) 28;
            constraintLayout2.addView(imageView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
            arrayList.add(imageView);
            i = i2;
            appCompatTextView3 = appCompatTextView3;
        }
        AppCompatTextView appCompatTextView5 = appCompatTextView3;
        pj3 h = ct.h(constraintLayout2);
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ImageView imageView2 = (ImageView) next;
            if (i3 == 0) {
                int id = imageView2.getId();
                h.e(id, 6, 0, 6);
                h.e(id, 7, ((ImageView) arrayList.get(1)).getId(), 6);
                h.j(id).d.V = 1;
            } else if (i3 == arrayList.size() - 1) {
                int id2 = imageView2.getId();
                h.e(id2, 6, ((ImageView) arrayList.get(i3 - 1)).getId(), 7);
                h.e(id2, 7, 0, 7);
            } else {
                int id3 = imageView2.getId();
                h.e(id3, 6, ((ImageView) arrayList.get(i3 - 1)).getId(), 7);
                h.e(id3, 7, ((ImageView) arrayList.get(i4)).getId(), 6);
            }
            i3 = i4;
        }
        h.a(constraintLayout2);
        constraintLayout2.setContentDescription(constraintLayout2.getResources().getQuantityString(oua.a, 5, new Object[]{Integer.valueOf(constraintLayout2.getSelected()), 5}));
        constraintLayout2.setId(nua.d);
        constraintLayout2.setOnSelectListener(new u00((Object) appCompatTextView4, (Object) this, (Object) frameLayout2, 9));
        constraintLayout.addView(constraintLayout2, -1, -2);
        View view = constraintLayout2;
        b0h.H(constraintLayout, new wg5(this, appCompatTextView, appCompatTextView2, appCompatTextView4, constraintLayout2, (Continuation) null));
        pj3 h2 = ct.h(constraintLayout);
        int id4 = appCompatImageView.getId();
        h2.e(id4, 3, 0, 3);
        float f3 = (float) 24;
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h2, 3, id4, 4));
        h2.e(id4, 6, 0, 6);
        new ila(h2, 6, id4, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
        int id5 = appCompatTextView.getId();
        h2.e(id5, 3, appCompatImageView.getId(), 3);
        h2.e(id5, 6, appCompatImageView.getId(), 7);
        ila ila = new ila(h2, 6, id5, 4);
        float f4 = (float) 12;
        ila.e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        int id6 = appCompatTextView2.getId();
        h2.e(id6, 3, appCompatTextView.getId(), 4);
        new ila(h2, 3, id6, 4).e(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
        h2.e(id6, 6, appCompatImageView.getId(), 7);
        new ila(h2, 6, id6, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        int id7 = view.getId();
        h2.e(id7, 3, appCompatTextView2.getId(), 4);
        float f5 = (float) 40;
        tr1.u(f5, vo4.c().getDisplayMetrics().density, new ila(h2, 3, id7, 4));
        h2.e(id7, 6, 0, 6);
        float f6 = (float) 20;
        tr1.u(f6, vo4.c().getDisplayMetrics().density, new ila(h2, 6, id7, 4));
        h2.e(id7, 7, 0, 7);
        new ila(h2, 7, id7, 4).e(MathKt.roundToInt(f6 * vo4.c().getDisplayMetrics().density));
        int id8 = appCompatTextView5.getId();
        h2.e(id8, 3, view.getId(), 4);
        tr1.u(f5, vo4.c().getDisplayMetrics().density, new ila(h2, 3, id8, 4));
        h2.e(id8, 6, 0, 6);
        new ila(h2, 6, id8, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        h2.e(id8, 7, appCompatTextView4.getId(), 6);
        float f7 = (float) 8;
        tr1.u(f7, vo4.c().getDisplayMetrics().density, new ila(h2, 7, id8, 4));
        h2.e(id8, 4, 0, 4);
        new ila(h2, 4, id8, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
        int id9 = appCompatTextView4.getId();
        h2.e(id9, 3, view.getId(), 4);
        new ila(h2, 3, id9, 4).e(MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density));
        h2.e(id9, 6, appCompatTextView5.getId(), 7);
        tr1.u(f7, vo4.c().getDisplayMetrics().density, new ila(h2, 6, id9, 4));
        h2.e(id9, 7, 0, 7);
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h2, 7, id9, 4));
        h2.e(id9, 4, 0, 4);
        new ila(h2, 4, id9, 4).e(MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        h2.a(constraintLayout);
        frameLayout2.addView(constraintLayout);
        zr0 zr0 = new zr0((zx3) this, (Function0) new j35(7, (Object) frameLayout2, (Object) this));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 4));
        }
        return frameLayout2;
    }
}
