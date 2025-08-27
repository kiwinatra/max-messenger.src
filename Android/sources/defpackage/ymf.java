package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: ymf  reason: default package */
public final class ymf extends PopupWindow implements phf {
    public final ImageView X;
    public final Handler Y;
    public mgd Z;
    public final View a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 o;
    public final wmf v;
    public final Lazy v0;
    public final vmf w;
    public final ImageView x;
    public final TextView y;
    public final TextView z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymf(Context context, View view, Function0 function0, Function0 function02, wmf wmf, vmf vmf, int i) {
        this(context, view, function0, (i & 8) != 0 ? new tmf(0, function0) : function02, (Function0) (i & 16) != 0 ? new tmf(1, function0) : null, (i & 32) != 0 ? wmf.b : wmf, (i & 64) != 0 ? vmf.a : vmf);
    }

    public static void b(ymf ymf, View view, boolean z2, umf umf, int i) {
        umf umf2 = (i & 4) != 0 ? null : umf;
        ymf.getClass();
        int i2 = dad.M0;
        Object tag = view.getTag(i2);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z2) {
                if (umf2 != null) {
                    umf2.invoke();
                    return;
                }
                return;
            }
        }
        boolean areEqual = Intrinsics.areEqual(tag, (Object) "fade_in");
        boolean areEqual2 = Intrinsics.areEqual(tag, (Object) "fade_out");
        if (areEqual && z2) {
            return;
        }
        if (!areEqual2 || z2) {
            String str = z2 ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener((Animation.AnimationListener) null);
            }
            float alpha = view.getAlpha();
            float f = z2 ? 1.0f : 0.0f;
            float f2 = z2 ? vo4.c().getDisplayMetrics().density * 24.0f : vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO;
            float f3 = z2 ? vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO : vo4.c().getDisplayMetrics().density * 24.0f;
            if (z2) {
                view.setTranslationY(f2);
            }
            view.animate().setDuration(150).alpha(f).translationY(f3).setInterpolator(z2 ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new xmf(view, i2, str, alpha, f, z2, f3, umf2)).start();
        }
    }

    public final void a() {
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, false, new umf(this, 0), 2);
        }
    }

    public final void c(Integer num) {
        ImageView imageView = this.x;
        imageView.setVisibility(0);
        Function0 function0 = this.o;
        imageView.setImageTintList(function0 != null ? ColorStateList.valueOf(((Number) function0.invoke()).intValue()) : null);
        imageView.setImageResource(num.intValue());
        TextView textView = this.y;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
            textView.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void d(ngf ngf) {
        TextView textView = this.y;
        textView.setText(ngf.a(textView.getContext()));
    }

    public final void dismiss() {
        super.dismiss();
        try {
            mgd mgd = this.Z;
            if (mgd != null) {
                this.Y.removeCallbacks(mgd);
            }
        } catch (Exception e) {
            z68.o(ymf.class.getName(), e.getMessage(), e);
        }
        this.Z = null;
    }

    public final void e(Point point, int i, long j) {
        mgd mgd = this.Z;
        Handler handler = this.Y;
        if (mgd != null) {
            handler.removeCallbacks(mgd);
            this.Z = null;
        }
        showAtLocation(this.a, i, point.x - (getWidth() / 2), point.y);
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, true, (umf) null, 6);
        }
        mgd mgd2 = new mgd(29, this);
        handler.postDelayed(mgd2, j);
        this.Z = mgd2;
    }

    public final void onThemeChanged(k2b k2b) {
        Function0 function0 = this.b;
        k2b k2b2 = (k2b) function0.invoke();
        ImageView imageView = this.x;
        Function0 function02 = this.o;
        imageView.setImageTintList(function02 != null ? ColorStateList.valueOf(((Number) function02.invoke()).intValue()) : null);
        this.y.setTextColor(ColorStateList.valueOf(k2b2.getText().e));
        ((qmf) this.v0.getValue()).onThemeChanged(k2b);
        ImageView imageView2 = this.X;
        ((k2b) function0.invoke()).getIcon().getClass();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
    }

    public ymf(Context context, View view, Function0 function0, Function0 function02, Function0 function03, wmf wmf, vmf vmf) {
        Context context2 = context;
        wmf wmf2 = wmf;
        this.a = view;
        this.b = function0;
        this.c = function02;
        this.o = function03;
        this.v = wmf2;
        this.w = vmf;
        this.Y = new Handler(Looper.getMainLooper());
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new umf(this, 1));
        this.v0 = lazy;
        k2b k2b = (k2b) function0.invoke();
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(false);
        ImageView imageView = new ImageView(context2);
        imageView.setId(dad.O0);
        imageView.setLayoutParams(new fj3(-2, -2));
        imageView.setVisibility(8);
        this.x = imageView;
        TextView textView = new TextView(context2);
        textView.setId(dad.Q0);
        textView.setLayoutParams(new fj3(-1, -2));
        textView.setGravity(17);
        textView.setMaxLines(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(ColorStateList.valueOf(k2b.getText().e));
        puf.o.b(textView, uy4.b);
        this.y = textView;
        ImageView imageView2 = new ImageView(context2);
        imageView2.setId(dad.N0);
        float f = (float) 20;
        imageView2.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        imageView2.setImageResource(cad.i0);
        ((k2b) function0.invoke()).getIcon().getClass();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
        ct.G(imageView2, 300, new dte(5, this));
        imageView2.setVisibility(8);
        this.X = imageView2;
        TextView textView2 = new TextView(context2);
        textView2.setId(dad.P0);
        textView2.setLayoutParams(new fj3(-1, -2));
        textView2.setGravity(17);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(ColorStateList.valueOf(k2b.getText().f));
        puf.r.b(textView2, uy4.b);
        textView2.setVisibility(8);
        this.z = textView2;
        ConstraintLayout constraintLayout = new ConstraintLayout(context2);
        float f2 = (float) 10;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2) + (wmf2 == wmf.a ? MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) : 0);
        int roundToInt2 = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density) + (wmf2 == wmf.b ? MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) : 0);
        float f3 = (float) 12;
        constraintLayout.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), roundToInt, MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), roundToInt2);
        constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        constraintLayout.setBackground((qmf) lazy.getValue());
        constraintLayout.addView(imageView2);
        constraintLayout.addView(imageView);
        constraintLayout.addView(textView);
        constraintLayout.addView(textView2);
        constraintLayout.setVisibility(8);
        pj3 h = ct.h(constraintLayout);
        int id = imageView2.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 7, 0, 7);
        int id2 = imageView.getId();
        h.e(id2, 6, 0, 6);
        h.e(id2, 7, 0, 7);
        h.e(id2, 3, 0, 3);
        h.e(id2, 4, textView.getId(), 3);
        h.j(id2).d.W = 2;
        int id3 = textView.getId();
        h.e(id3, 3, imageView.getId(), 4);
        h.e(id3, 6, 0, 6);
        h.e(id3, 7, imageView2.getId(), 6);
        h.e(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        h.e(id4, 3, textView.getId(), 4);
        new ila(h, 3, id4, 4).e(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
        h.e(id4, 7, textView.getId(), 7);
        h.e(id4, 6, textView.getId(), 6);
        h.e(id4, 4, 0, 4);
        h.a(constraintLayout);
        setContentView(constraintLayout);
    }
}
