package one.me.chatscreen.videomsg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/chatscreen/videomsg/VideoMessageWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVideoMessageWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoMessageWidget.kt\none/me/chatscreen/videomsg/VideoMessageWidget\n+ 2 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 3 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 Widget.kt\none/me/sdk/arch/Widget\n+ 8 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n*L\n1#1,234:1\n5#2:235\n5#2:236\n5#2:237\n9#3,6:238\n15#3:245\n1#4:244\n1#4:249\n24#5:246\n24#5:247\n24#5:248\n24#5:250\n24#5:251\n24#5:252\n24#5:255\n28#5:256\n24#5:257\n24#5:276\n172#6,2:253\n157#6,8:258\n256#6,2:266\n256#6,2:279\n256#6,2:281\n410#7,8:268\n23#8:277\n23#8:278\n*S KotlinDebug\n*F\n+ 1 VideoMessageWidget.kt\none/me/chatscreen/videomsg/VideoMessageWidget\n*L\n63#1:235\n71#1:236\n72#1:237\n79#1:238,6\n79#1:245\n79#1:244\n99#1:246\n105#1:247\n119#1:248\n131#1:250\n134#1:251\n136#1:252\n153#1:255\n159#1:256\n161#1:257\n64#1:276\n136#1:253,2\n161#1:258,8\n162#1:266,2\n92#1:279,2\n95#1:281,2\n185#1:268,8\n71#1:277\n72#1:278\n*E\n"})
@SuppressLint({"ValidController"})
public final class VideoMessageWidget extends Widget {
    public static final /* synthetic */ KProperty[] X;
    public final yh7 a;
    public final Lazy b = un2.a.getAccessor().h(s6g.class);
    public final ReadOnlyProperty c = viewBinding(lra.t);
    public final ReadOnlyProperty o = viewBinding(lra.v);
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public ViewPropertyAnimator y;
    public ScaleGestureDetector z;

    static {
        Class<VideoMessageWidget> cls = VideoMessageWidget.class;
        X = new KProperty[]{wj6.p(cls, "cameraPreview", "getCameraPreview()Landroidx/camera/view/PreviewView;", 0), wj6.p(cls, "torchButton", "getTorchButton()Landroid/widget/ImageView;", 0)};
    }

    public VideoMessageWidget() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        jdb jdb = jdb.b;
        jdb jdb2 = anf.a;
        this.a = new yh7(jdb, (nr0) null);
        Lazy lazy = tn2.a;
        i2g i2g = new i2g(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.v = LazyKt.lazy(lazyThreadSafetyMode, i2g);
        this.w = LazyKt.lazy(lazyThreadSafetyMode, new b7g(this, 0));
        this.x = LazyKt.lazy(lazyThreadSafetyMode, new b7g(this, 1));
    }

    public static void c0(FrameLayout frameLayout, int i, Function1 function1) {
        ImageView imageView = new ImageView(frameLayout.getContext());
        float f = (float) 40;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        layoutParams.leftMargin = i;
        layoutParams.bottomMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        imageView.setLayoutParams(layoutParams);
        int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        b0h.H(imageView, new xd2(3, (Continuation) null, 9));
        function1.invoke(imageView);
        frameLayout.addView(imageView);
    }

    public final s6g d0() {
        return (s6g) this.b.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setOnTouchListener(new d4a(1));
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        kub kub = new kub(frameLayout.getContext());
        kub.setId(lra.t);
        float f = (float) 328;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        layoutParams2.gravity = 17;
        kub.setLayoutParams(layoutParams2);
        kub.setOnTouchListener(new ng1(12, this));
        kub.setKeepScreenOn(true);
        frameLayout.addView(kub);
        aq0 aq0 = new aq0(frameLayout.getContext(), 0, 10.0f, false, false);
        aq0.i = new c7g(kub, 0);
        aq0.j = new c7g(kub, 1);
        frameLayout.setBackground(aq0);
        c0(frameLayout, MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), new z6g(this, 1));
        c0(frameLayout, MathKt.roundToInt(((float) 72) * vo4.c().getDisplayMetrics().density), new z6g(this, 2));
        TextView textView = new TextView(frameLayout.getContext());
        textView.setId(lra.u);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((InsetDrawable) this.v.getValue(), (Drawable) null, (Drawable) null, (Drawable) null);
        puf.o.b(textView, uy4.b);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vo4.c().getDisplayMetrics().density * 6.0f);
        textView.setBackground(gradientDrawable);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density), textView.getPaddingBottom());
        textView.setVisibility(8);
        textView.setText("0:02,15");
        b0h.H(textView, new qrb((Object) this, (Continuation) null, 18));
        frameLayout.addView(textView);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        y6g y6g = (y6g) d0();
        y6g.getClass();
        z68.c(y6g.class.getName(), "releaseAll videoMessage", new Object[0]);
        tu1 tu1 = y6g.B0;
        if (tu1 != null) {
            tu1.b.e(hu7.ON_DESTROY);
        }
        y6g.B0 = null;
        Boolean bool = Boolean.FALSE;
        xme xme = y6g.x0;
        xme.getClass();
        xme.m((Object) null, bool);
        y6g.y = null;
        cvb cvb = y6g.v;
        if (cvb != null) {
            cvb.f();
        }
        y6g.v = null;
        y6g.X = null;
        y6g.z = null;
        y6g.x = null;
        y6g.C0.compareAndSet(true, false);
        ViewPropertyAnimator viewPropertyAnimator = this.y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.z = null;
    }

    public final void onViewCreated(View view) {
        this.z = new ScaleGestureDetector(getContext(), new d7g(this));
        ev0.v(getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new g7g((Continuation) null, this), 3);
        jv7 jv7 = ((y6g) d0()).B0;
        if (jv7 == null) {
            jv7 = getViewLifecycleOwner();
        }
        ((kub) this.c.getValue(this, X[0])).getPreviewStreamState().e(jv7, new wv1(1, new z6g(this, 0)));
        bs0.K(new ps5(ct.k(((y6g) d0()).Z, getViewLifecycleOwner().getLifecycle(), iu7.o), new e7g((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
