package defpackage;

import android.content.Context;
import android.os.Build;
import android.renderscript.RenderScript;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: p35  reason: default package */
public final /* synthetic */ class p35 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p35(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public final Object invoke() {
        js9 js9 = fu4.k;
        Display display = null;
        Context context = this.b;
        switch (this.a) {
            case 0:
                RLottieImageView rLottieImageView = new RLottieImageView(context, (AttributeSet) null);
                rLottieImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                rLottieImageView.setVisibility(8);
                return rLottieImageView;
            case 1:
                int i = EndlessRecyclerView2.g2;
                if (Build.VERSION.SDK_INT >= 30) {
                    display = context.getDisplay();
                } else {
                    WindowManager windowManager = (WindowManager) fw3.b(context, WindowManager.class);
                    if (windowManager != null) {
                        display = windowManager.getDefaultDisplay();
                    }
                }
                float refreshRate = display != null ? display.getRefreshRate() : 0.0f;
                return Long.valueOf(refreshRate > c44.DEFAULT_ASPECT_RATIO ? MathKt.roundToLong(((float) 1000000000) / refreshRate) : 160000000);
            case 2:
                gy gyVar = new gy(context, 2);
                return new vc4((Context) gyVar.o, (HashMap) gyVar.v, gyVar.c, (b7f) gyVar.w, gyVar.b);
            case 3:
                return new ud4(context);
            case 4:
                return new cq0(context);
            case 5:
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                puf.o.b(appCompatTextView, uy4.b);
                appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                float f = (float) 12;
                appCompatTextView.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), appCompatTextView.getPaddingBottom());
                appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().b);
                return appCompatTextView;
            case 6:
                cob cob = new cob(context);
                cob.a(cad.w0);
                return cob;
            case 7:
                return RenderScript.create(context);
            case 8:
                ela ela = new ela(context);
                puf.D.b(ela, uy4.b);
                ela.setMaxLines(1);
                ela.setEllipsize(TextUtils.TruncateAt.END);
                float f2 = (float) 12;
                ela.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), ela.getPaddingTop(), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), ela.getPaddingBottom());
                ela.setTextColor(l2b.i.e);
                gsg.h(ela);
                return ela;
            case 9:
                View view = new View(context);
                view.setBackgroundColor(l2b.h.k);
                return view;
            case 10:
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
                appCompatTextView2.setTextColor(js9.e(appCompatTextView2.getContext()).f().getText().b);
                puf.o.b(appCompatTextView2, uy4.b);
                appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                float f3 = (float) 12;
                appCompatTextView2.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), appCompatTextView2.getPaddingBottom());
                return appCompatTextView2;
            case 11:
                xle xle = new xle(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                xle.setLayoutParams(layoutParams);
                return xle;
            case 12:
                ImageView imageView = new ImageView(context);
                imageView.setId(dad.U);
                float f4 = (float) 36;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density));
                layoutParams2.gravity = 80;
                layoutParams2.setMargins(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                imageView.setLayoutParams(layoutParams2);
                int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
                imageView.setImageResource(cad.d1);
                b0h.H(imageView, new xd2(3, (Continuation) null, 1));
                return imageView;
            case 13:
                return new OneMeAvatarView(context, (AttributeSet) null);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
                oneMeDraweeView.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 4.0f));
                ig5 ig5 = ((sp6) oneMeDraweeView.getHierarchy()).e;
                ig5.Z = 0;
                if (ig5.Y == 1) {
                    ig5.Y = 0;
                }
                return oneMeDraweeView;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                int i2 = OneMeAvatarView.E0;
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, ffc.ic_add_button_28);
                hi7.Y(enhancedVectorDrawable, "background", js9.e(context).f().c().a.f);
                hi7.Y(enhancedVectorDrawable, "plus", js9.e(context).f().getIcon().b);
                return enhancedVectorDrawable;
            case 16:
                int i3 = OneMeAvatarView.E0;
                EnhancedVectorDrawable enhancedVectorDrawable2 = new EnhancedVectorDrawable(context, zec.ic_online_24);
                hi7.Y(enhancedVectorDrawable2, "online", a81.g(js9, context).e);
                int i4 = js9.e(context).f().c().i;
                VectorPath findPath = enhancedVectorDrawable2.findPath("online");
                if (findPath != null) {
                    findPath.setStrokeColor(i4);
                    enhancedVectorDrawable2.invalidatePath();
                }
                return enhancedVectorDrawable2;
            case LangUtils.HASH_SEED:
                int i5 = OneMeAvatarView.E0;
                EnhancedVectorDrawable enhancedVectorDrawable3 = new EnhancedVectorDrawable(context, zec.ic_delete_filled_apart_24);
                js9.e(context).f().getIcon().getClass();
                hi7.Y(enhancedVectorDrawable3, "cross", -1);
                hi7.Y(enhancedVectorDrawable3, "circle_background", a81.g(js9, context).i);
                return enhancedVectorDrawable3;
            case 18:
                KProperty[] kPropertyArr = OneMeButton.z0;
                return new AppCompatImageView(context, (AttributeSet) null);
            case 19:
                KProperty[] kPropertyArr2 = OneMeButton.z0;
                return new AppCompatImageView(context, (AttributeSet) null);
            case 20:
                KProperty[] kPropertyArr3 = OneMeButton.z0;
                return new TextView(context);
            case 21:
                ImageView imageView2 = new ImageView(context);
                float f5 = (float) 24;
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5), MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density)));
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return imageView2;
            case 22:
                AppCompatTextView appCompatTextView3 = new AppCompatTextView(context, (AttributeSet) null);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams3.topMargin = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                float f6 = (float) 6;
                layoutParams3.leftMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f6);
                layoutParams3.rightMargin = MathKt.roundToInt(f6 * vo4.c().getDisplayMetrics().density);
                appCompatTextView3.setLayoutParams(layoutParams3);
                appCompatTextView3.setGravity(1);
                appCompatTextView3.setMaxLines(1);
                appCompatTextView3.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView3.setTextColor(js9.e(appCompatTextView3.getContext()).f().getText().e);
                puf.r.b(appCompatTextView3, uy4.b);
                return appCompatTextView3;
            case 23:
                AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
                appCompatImageView.setId(dad.k);
                fj3 fj3 = new fj3(0, 0);
                fj3.t = 0;
                fj3.i = 0;
                fj3.v = 0;
                fj3.l = 0;
                appCompatImageView.setLayoutParams(fj3);
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return appCompatImageView;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                ImageView imageView3 = new ImageView(context);
                imageView3.setId(dad.m);
                fj3 fj32 = new fj3(-2, -2);
                int i6 = dad.n;
                fj32.i = i6;
                fj32.v = i6;
                fj32.l = i6;
                fj32.t = i6;
                imageView3.setLayoutParams(fj32);
                b0h.H(imageView3, new xd2(3, (Continuation) null, 2));
                return imageView3;
            case 25:
                return new EnhancedVectorDrawable(context, lya.m);
            case 26:
                int i7 = OneMeContactsChipGroup.F0;
                return new ContextThemeWrapper(context, hnc.Theme_MaterialComponents);
            case 27:
                ImageView imageView4 = new ImageView(context);
                imageView4.setId(dad.X);
                float f7 = (float) 28;
                fj3 fj33 = new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f7), MathKt.roundToInt(f7 * vo4.c().getDisplayMetrics().density));
                int i8 = dad.Y;
                fj33.i = i8;
                fj33.v = i8;
                fj33.l = i8;
                fj33.t = i8;
                imageView4.setLayoutParams(fj33);
                b0h.H(imageView4, new xd2(3, (Continuation) null, 3));
                return imageView4;
            case 28:
                return new EnhancedVectorDrawable(context, lya.m);
            default:
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, (AttributeSet) null);
                appCompatImageView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return appCompatImageView2;
        }
    }
}
