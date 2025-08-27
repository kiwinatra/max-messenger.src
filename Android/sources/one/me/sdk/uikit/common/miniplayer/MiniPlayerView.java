package one.me.sdk.uikit.common.miniplayer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import one.me.sdk.richvector.EnhancedVectorDrawable;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0010KB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\rJ2\u0010\u0014\u001a\u00020\u000b2#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)R$\u0010.\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00108\u0006@BX\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00104\u001a\u00020/8G¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0017\u001a\u0002058G¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u001a\u001a\u0002058G¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0017\u0010>\u001a\u00020/8G¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R\u0017\u0010A\u001a\u00020/8G¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u00103R\u0017\u0010!\u001a\u00020B8G¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8BX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lone/me/sdk/uikit/common/miniplayer/MiniPlayerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lphf;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View$OnClickListener;", "clickListener", "", "setOnPlaybackClickListener", "(Landroid/view/View$OnClickListener;)V", "setOnCloseClickListener", "Lkotlin/Function1;", "Lpr9;", "Lkotlin/ParameterName;", "name", "current", "setOnPlaybackSpeedClick", "(Lkotlin/jvm/functions/Function1;)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "", "isPlaying", "setIsPlaying", "(Z)V", "", "progress", "setProgress", "(F)V", "value", "setPlaybackSpeed", "(Lpr9;)V", "Landroid/view/View;", "getTooltipAnchor", "()Landroid/view/View;", "E0", "Lpr9;", "getPlaybackSpeed", "()Lpr9;", "playbackSpeed", "Landroid/widget/ImageView;", "F0", "Landroid/widget/ImageView;", "getPlaybackButton", "()Landroid/widget/ImageView;", "playbackButton", "Landroid/widget/TextView;", "G0", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "H0", "getSubtitle", "I0", "getPlaybackSpeedButton", "playbackSpeedButton", "J0", "getCloseButton", "closeButton", "Lcw7;", "K0", "Lcw7;", "getProgress", "()Lcw7;", "Landroid/graphics/drawable/Drawable;", "getSelectableItemOvalBackground", "()Landroid/graphics/drawable/Drawable;", "selectableItemOvalBackground", "or9", "common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMiniPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniPlayerView.kt\none/me/sdk/uikit/common/miniplayer/MiniPlayerView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,288:1\n1279#2,2:289\n1293#2,4:291\n24#3:295\n24#3:296\n24#3:297\n24#3:300\n24#3:301\n24#3:302\n24#3:303\n24#3:304\n24#3:305\n24#3:306\n24#3:309\n24#3:310\n24#3:313\n24#3:314\n24#3:315\n172#4,2:298\n172#4,2:307\n172#4,2:311\n*S KotlinDebug\n*F\n+ 1 MiniPlayerView.kt\none/me/sdk/uikit/common/miniplayer/MiniPlayerView\n*L\n39#1:289,2\n39#1:291,4\n55#1:295\n57#1:296\n63#1:297\n76#1:300\n77#1:301\n90#1:302\n92#1:303\n95#1:304\n106#1:305\n110#1:306\n119#1:309\n123#1:310\n133#1:313\n136#1:314\n137#1:315\n63#1:298,2\n110#1:307,2\n123#1:311,2\n*E\n"})
public final class MiniPlayerView extends ConstraintLayout implements phf {
    public pr9 E0;
    public final ImageView F0;
    public final TextView G0;
    public final TextView H0;
    public final ImageView I0;
    public final ImageView J0;
    public final cw7 K0;

    /* JADX WARNING: type inference failed for: r3v25, types: [cw7, mk0, android.widget.ProgressBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v10, types: [tv7, qv4] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MiniPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        EnumEntries enumEntries = or9.z;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntries, 10)), 16));
        for (Object next : enumEntries) {
            linkedHashMap.put(next, Integer.valueOf(((or9) next).a));
        }
        pr9 pr9 = pr9.a;
        this.E0 = pr9;
        ImageView imageView = new ImageView(getContext());
        or9 or9 = or9.PLAYBACK;
        imageView.setId(or9.a);
        float f = (float) 40;
        fj3 fj3 = new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        fj3.t = 0;
        float f2 = (float) 4;
        fj3.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        fj3.i = 0;
        fj3.l = 0;
        imageView.setLayoutParams(fj3);
        imageView.setBackground(getSelectableItemOvalBackground());
        js9 js9 = fu4.k;
        js9.e(imageView.getContext()).f().getIcon().getClass();
        imageView.setColorFilter(-16745729);
        int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        imageView.setImageResource(ffc.ic_play_24_filled);
        this.F0 = imageView;
        TextView textView = new TextView(getContext());
        or9 or92 = or9.TITLE;
        textView.setId(or92.a);
        fj3 fj32 = new fj3(0, -2);
        int i = or92.a;
        textView.setId(i);
        fj32.i = 0;
        int i2 = or9.a;
        fj32.s = i2;
        or9 or93 = or9.SPEED;
        fj32.u = or93.a;
        or9 or94 = or9.SUBTITLE;
        fj32.k = or94.a;
        fj32.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        float f3 = (float) 6;
        fj32.topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
        textView.setLayoutParams(fj32);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        puf.p.b(textView, uy4.b);
        textView.setTextColor(js9.e(textView.getContext()).f().getText().e);
        this.G0 = textView;
        TextView textView2 = new TextView(getContext());
        textView2.setId(or94.a);
        fj3 fj33 = new fj3(0, -2);
        fj33.j = i;
        fj33.topMargin = MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density);
        fj33.s = i2;
        fj33.setMarginStart(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        int i3 = or93.a;
        fj33.u = i3;
        fj33.l = 0;
        fj33.bottomMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
        textView2.setLayoutParams(fj33);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        puf.r.b(textView2, uy4.b);
        textView2.setTextColor(js9.e(textView2.getContext()).f().getText().f);
        this.H0 = textView2;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(i3);
        fj3 fj34 = new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        or9 or95 = or9.CLOSE;
        fj34.u = or95.a;
        fj34.i = 0;
        fj34.l = 0;
        int roundToInt2 = MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density);
        imageView2.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        imageView2.setLayoutParams(fj34);
        imageView2.setBackground(getSelectableItemOvalBackground());
        L(imageView2, pr9);
        this.I0 = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        imageView3.setId(or95.a);
        fj3 fj35 = new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        fj35.v = 0;
        fj35.i = 0;
        fj35.l = 0;
        int roundToInt3 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        imageView3.setPadding(roundToInt3, roundToInt3, roundToInt3, roundToInt3);
        imageView3.setLayoutParams(fj35);
        imageView3.setImageResource(ffc.cross_16);
        imageView3.setImageTintList(ColorStateList.valueOf(js9.e(imageView3.getContext()).f().getIcon().i));
        imageView3.setBackground(getSelectableItemOvalBackground());
        this.J0 = imageView3;
        ? mk0 = new mk0(getContext(), (AttributeSet) null, edc.linearProgressIndicatorStyle, cw7.y0);
        dw7 dw7 = (dw7) mk0.a;
        ? qv4 = new qv4(dw7);
        qv4.b = 300.0f;
        Context context2 = mk0.getContext();
        mk0.setIndeterminateDrawable(new ue7(context2, dw7, qv4, dw7.h == 0 ? new uv7(dw7) : new wv7(context2, dw7)));
        mk0.setProgressDrawable(new rm4(mk0.getContext(), dw7, qv4));
        mk0.setId(or9.PROGRESS.a);
        float f4 = (float) 2;
        fj3 fj36 = new fj3(-1, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        fj36.l = 0;
        mk0.setLayoutParams(fj36);
        mk0.setTrackCornerRadius(MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
        mk0.setTrackThickness(MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density));
        mk0.setMin(0);
        mk0.setMax(1000);
        mk0.setProgress(0);
        mk0.setTrackColor(0);
        js9.e(mk0.getContext()).f().c().a.getClass();
        mk0.setIndicatorColor(-16745729);
        this.K0 = mk0;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(imageView);
        addView(textView);
        addView(textView2);
        addView(imageView2);
        addView(imageView3);
        addView(mk0);
    }

    private final Drawable getSelectableItemOvalBackground() {
        return new RippleDrawable(ColorStateList.valueOf(fu4.k.e(getContext()).f().b().a.c), (Drawable) null, new ShapeDrawable(new OvalShape()));
    }

    public final void L(ImageView imageView, pr9 pr9) {
        int i;
        int ordinal = pr9.ordinal();
        if (ordinal == 0) {
            i = ffc.speed_1x;
        } else if (ordinal == 1) {
            i = ffc.speed_1_5x;
        } else if (ordinal == 2) {
            i = ffc.speed_2x;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(imageView.getContext(), i);
        js9 js9 = fu4.k;
        hi7.Y(enhancedVectorDrawable, "border", js9.e(imageView.getContext()).f().getIcon().g);
        hi7.Y(enhancedVectorDrawable, "text", js9.e(imageView.getContext()).f().getIcon().i);
        imageView.setImageDrawable(enhancedVectorDrawable);
        this.E0 = pr9;
    }

    @Deprecated(message = "Public view-getters are prohibited in design-system and will be removed soon")
    public final ImageView getCloseButton() {
        return this.J0;
    }

    @Deprecated(message = "Public view-getters are prohibited in design-system and will be removed soon")
    public final ImageView getPlaybackButton() {
        return this.F0;
    }

    public final pr9 getPlaybackSpeed() {
        return this.E0;
    }

    @Deprecated(message = "Public view-getters are prohibited in design-system and will be removed soon")
    public final ImageView getPlaybackSpeedButton() {
        return this.I0;
    }

    @Deprecated(message = "Public view-getters are prohibited in design-system and will be removed soon")
    public final cw7 getProgress() {
        return this.K0;
    }

    @Deprecated(message = "Public view-getters are prohibited in design-system and will be removed soon")
    public final TextView getSubtitle() {
        return this.H0;
    }

    @Deprecated(message = "Public view-getters are prohibited in design-system and will be removed soon")
    public final TextView getTitle() {
        return this.G0;
    }

    public final View getTooltipAnchor() {
        return this.I0;
    }

    public final void onThemeChanged(k2b k2b) {
        ImageView imageView = this.F0;
        imageView.setBackground(getSelectableItemOvalBackground());
        js9 js9 = fu4.k;
        js9.e(imageView.getContext()).f().getIcon().getClass();
        imageView.setColorFilter(-16745729);
        this.G0.setTextColor(js9.e(getContext()).f().getText().e);
        this.H0.setTextColor(js9.e(getContext()).f().getText().f);
        ImageView imageView2 = this.I0;
        Drawable drawable = imageView2.getDrawable();
        EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
        if (enhancedVectorDrawable != null) {
            hi7.Y(enhancedVectorDrawable, "border", js9.e(imageView2.getContext()).f().getIcon().g);
            hi7.Y(enhancedVectorDrawable, "text", js9.e(imageView2.getContext()).f().getIcon().i);
        }
        imageView2.setBackground(getSelectableItemOvalBackground());
        ImageView imageView3 = this.J0;
        imageView3.setImageTintList(ColorStateList.valueOf(js9.f(imageView3).getIcon().i));
        imageView3.setBackground(getSelectableItemOvalBackground());
        js9.e(getContext()).f().c().a.getClass();
        this.K0.setIndicatorColor(-16745729);
    }

    public final void setIsPlaying(boolean z) {
        this.F0.setImageResource(z ? ffc.ic_pause_24_filled : ffc.ic_play_24_filled);
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.J0;
        if (onClickListener == null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            ct.G(imageView, 1000, onClickListener);
        }
    }

    public final void setOnPlaybackClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.F0;
        if (onClickListener == null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            ct.G(imageView, 200, onClickListener);
        }
    }

    public final void setOnPlaybackSpeedClick(Function1<? super pr9, Unit> function1) {
        ImageView imageView = this.I0;
        if (function1 == null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            ct.G(imageView, 200, new h24(22, (Object) function1, (Object) this));
        }
    }

    public final void setPlaybackSpeed(pr9 pr9) {
        L(this.I0, pr9);
    }

    public final void setProgress(float f) {
        cw7 cw7 = this.K0;
        cw7.setProgress(RangesKt.coerceIn((int) ((f * ((float) (cw7.getMax() - cw7.getMin()))) + ((float) cw7.getMin())), cw7.getMin(), cw7.getMax()));
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.H0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }
}
