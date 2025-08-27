package one.me.sdk.uikit.common.emptyview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016R/\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00198BX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lphf;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lp7e;", "getBackground", "()Lp7e;", "", "visibility", "", "setVisibility", "(I)V", "icon", "setIcon", "Lngf;", "title", "setTitle", "(Lngf;)V", "subtitle", "setSubtitle", "Lk2b;", "<set-?>", "I0", "Lkotlin/properties/ReadWriteProperty;", "getCustomTheme", "()Lk2b;", "setCustomTheme", "(Lk2b;)V", "customTheme", "getCurrentTheme", "currentTheme", "common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOneMeEmptyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMeEmptyView.kt\none/me/sdk/uikit/common/emptyview/OneMeEmptyView\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Delegates.kt\nkotlin/properties/Delegates\n+ 5 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 6 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n+ 7 TextSource.kt\none/me/sdk/uikit/common/TextSourceKt\n*L\n1#1,201:1\n28#2:202\n24#2:210\n24#2:211\n24#2:216\n24#2:219\n24#2:222\n256#3,2:203\n256#3,2:205\n256#3,2:227\n256#3,2:229\n256#3,2:231\n33#4,3:207\n20#5:212\n21#5:224\n186#6,2:213\n186#6:215\n187#6:217\n186#6:218\n187#6:220\n186#6:221\n187#6:223\n171#7:225\n171#7:226\n*S KotlinDebug\n*F\n+ 1 OneMeEmptyView.kt\none/me/sdk/uikit/common/emptyview/OneMeEmptyView\n*L\n55#1:202\n90#1:210\n103#1:211\n114#1:216\n120#1:219\n126#1:222\n74#1:203,2\n79#1:205,2\n160#1:227,2\n164#1:229,2\n172#1:231,2\n84#1:207,3\n104#1:212\n104#1:224\n105#1:213,2\n113#1:215\n113#1:217\n119#1:218\n119#1:220\n125#1:221\n125#1:223\n155#1:225\n159#1:226\n*E\n"})
public class OneMeEmptyView extends ConstraintLayout implements phf {
    public static final /* synthetic */ KProperty[] J0 = {rae.s(OneMeEmptyView.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;", 0)};
    public final ImageView E0;
    public final TextView F0;
    public final TextView G0;
    public final OneMeButton H0;
    public final bl I0 = new bl(20, this);

    @JvmOverloads
    public OneMeEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImageView imageView = new ImageView(context);
        imageView.setId(jic.oneme_empty_view_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setElevation(vo4.c().getDisplayMetrics().density * 8.0f);
        js9 js9 = fu4.k;
        imageView.setImageTintList(ColorStateList.valueOf(js9.e(imageView.getContext()).f().getIcon().b));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, kv0.c(js9.e(context).f()));
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        this.E0 = imageView;
        TextView textView = new TextView(context);
        textView.setId(jic.oneme_empty_view_title);
        puf.c.b(textView, uy4.b);
        this.F0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(jic.oneme_empty_view_subtitle);
        textView2.setMaxLines(4);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        puf.m.b(textView2, uy4.b);
        textView2.setVisibility(8);
        this.G0 = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setId(jic.oneme_empty_view_main_action);
        oneMeButton.setVisibility(8);
        oneMeButton.setAppearance(xpa.o);
        this.H0 = oneMeButton;
        Delegates delegates = Delegates.INSTANCE;
        float f = (float) 80;
        addView(imageView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        addView(textView, -2, -2);
        addView(textView2, 0, -2);
        addView(oneMeButton, -2, -2);
        onThemeChanged(js9.e(context).f());
        b0h.H(this, new sa((Object) context, (Continuation) null, 23, false));
        setBackground(new p7e(context));
        float f2 = (float) 32;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        pj3 h = ct.h(this);
        int id = imageView.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        h.e(id, 4, 0, 4);
        h.j(id).d.x = 0.4f;
        int id2 = textView.getId();
        h.e(id2, 3, imageView.getId(), 4);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 3, id2, 4));
        h.e(id2, 6, 0, 6);
        new ila(h, 6, id2, 4).e(roundToInt);
        h.e(id2, 7, 0, 7);
        new ila(h, 7, id2, 4).e(roundToInt);
        int id3 = textView2.getId();
        h.e(id3, 3, textView.getId(), 4);
        tr1.u((float) 8, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
        h.e(id3, 6, 0, 6);
        new ila(h, 6, id3, 4).e(roundToInt);
        h.e(id3, 7, 0, 7);
        new ila(h, 7, id3, 4).e(roundToInt);
        int id4 = oneMeButton.getId();
        h.e(id4, 3, textView2.getId(), 4);
        tr1.u((float) 24, vo4.c().getDisplayMetrics().density, new ila(h, 3, id4, 4));
        h.e(id4, 6, 0, 6);
        new ila(h, 6, id4, 4).e(roundToInt);
        h.e(id4, 7, 0, 7);
        new ila(h, 7, id4, 4).e(roundToInt);
        h.a(this);
    }

    /* access modifiers changed from: private */
    public final k2b getCurrentTheme() {
        k2b customTheme = getCustomTheme();
        return customTheme == null ? fu4.k.e(getContext()).f() : customTheme;
    }

    public final void M(String str, View.OnClickListener onClickListener) {
        OneMeButton oneMeButton = this.H0;
        oneMeButton.setVisibility(0);
        oneMeButton.setText((CharSequence) str);
        ct.G(oneMeButton, 300, onClickListener);
    }

    public final k2b getCustomTheme() {
        return (k2b) this.I0.getValue(this, J0[0]);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(getCurrentTheme());
        p7e background = getBackground();
        if (background != null) {
            background.start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p7e background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int top = this.E0.getTop();
            p7e background = getBackground();
            if (background != null) {
                background.a(top);
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        p7e background = getBackground();
        if (background != null) {
            background.setPadding(0, 0, 0, getPaddingBottom());
        }
    }

    public final void onThemeChanged(k2b k2b) {
        p7e background = getBackground();
        if (background != null) {
            background.onThemeChanged(getCurrentTheme());
        }
        ColorStateList valueOf = ColorStateList.valueOf(getCurrentTheme().getIcon().b);
        ImageView imageView = this.E0;
        imageView.setImageTintList(valueOf);
        ((GradientDrawable) imageView.getBackground()).setColors(kv0.c(getCurrentTheme()));
        this.F0.setTextColor(getCurrentTheme().getText().e);
        this.G0.setTextColor(getCurrentTheme().getText().f);
    }

    public final void setCustomTheme(k2b k2b) {
        this.I0.setValue(this, J0[0], k2b);
    }

    public final void setIcon(int i) {
        this.E0.setImageResource(i);
    }

    public final void setSubtitle(ngf ngf) {
        TextView textView = this.G0;
        textView.setText(ngf.a(textView.getContext()));
        CharSequence text = textView.getText();
        int i = 0;
        if (!(!(text == null || text.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setTitle(ngf ngf) {
        TextView textView = this.F0;
        textView.setText(ngf.a(textView.getContext()));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            p7e background = getBackground();
            if (background == null) {
                return false;
            }
            if (drawable != background) {
                int numberOfLayers = background.getNumberOfLayers();
                int i = 0;
                while (i < numberOfLayers) {
                    if (background.getDrawable(i) != drawable) {
                        i++;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public p7e getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof p7e) {
            return (p7e) background;
        }
        return null;
    }
}
