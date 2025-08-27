package one.me.sdk.uikit.common.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lone/me/sdk/uikit/common/button/OneMeTitleSubtitleButton;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lphf;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "title", "", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOneMeTitleSubtitleButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMeTitleSubtitleButton.kt\none/me/sdk/uikit/common/button/OneMeTitleSubtitleButton\n+ 2 Ripple.kt\none/me/sdk/uikit/common/RippleKt\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n26#2,6:109\n24#3:115\n24#3:116\n24#3:117\n24#3:118\n163#4,2:119\n29#5:121\n47#5,2:123\n29#5:125\n47#5,2:126\n1#6:122\n*S KotlinDebug\n*F\n+ 1 OneMeTitleSubtitleButton.kt\none/me/sdk/uikit/common/button/OneMeTitleSubtitleButton\n*L\n44#1:109,6\n52#1:115\n53#1:116\n54#1:117\n55#1:118\n51#1:119,2\n69#1:121\n69#1:123,2\n73#1:125\n73#1:126,2\n*E\n"})
public final class OneMeTitleSubtitleButton extends AppCompatTextView implements phf {
    public final TextAppearanceSpan v0;
    public final zpa w0 = zpa.a;
    public SpannableString x;
    public final xpa x0 = xpa.a;
    public SpannableString y;
    public final ShapeDrawable y0;
    public final TextAppearanceSpan z;
    public final RippleDrawable z0;

    @JvmOverloads
    public OneMeTitleSubtitleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = new TextAppearanceSpan(context, nya.b);
        this.v0 = new TextAppearanceSpan(context, nya.a);
        aqa aqa = aqa.c;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.y0 = shapeDrawable;
        js9 js9 = fu4.k;
        int i = js9.e(getContext()).f().b().a.c;
        this.z0 = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        setGravity(17);
        setMinimumHeight(y64.y(aqa));
        setOutlineProvider(new n04(y64.d(aqa)));
        float f = (float) 20;
        float f2 = (float) 4;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        onThemeChanged(js9.e(getContext()).f());
    }

    public final void j(CharSequence charSequence, CharSequence charSequence2) {
        SpannableString valueOf;
        SpannableString spannableString;
        SpannableString spannableString2 = null;
        if (charSequence != this.x) {
            if (charSequence == null || (spannableString = SpannableString.valueOf(charSequence)) == null) {
                spannableString = null;
            } else {
                spannableString.setSpan(this.z, 0, charSequence.length(), 17);
            }
            this.x = spannableString;
        }
        if (charSequence2 != this.y) {
            if (!(charSequence2 == null || (valueOf = SpannableString.valueOf(charSequence2)) == null)) {
                valueOf.setSpan(this.v0, 0, charSequence2.length(), 17);
                spannableString2 = valueOf;
            }
            this.y = spannableString2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence3 = this.x;
        if (charSequence3 == null) {
            charSequence3 = "";
        }
        SpannableStringBuilder append = spannableStringBuilder.append(charSequence3);
        SpannableString spannableString3 = this.y;
        if (spannableString3 != null) {
            append.append(10);
            append.append(spannableString3);
        }
        setText(append);
    }

    public final void onThemeChanged(k2b k2b) {
        js9 js9 = fu4.k;
        k2b f = js9.e(getContext()).f();
        boolean isEnabled = isEnabled();
        zpa zpa = this.w0;
        xpa xpa = this.x0;
        setTextColor(y64.H(f, zpa, xpa, isEnabled));
        zv0 b = y64.b(js9.e(getContext()).f(), zpa, xpa, isEnabled());
        Paint paint = this.y0.getPaint();
        Integer num = b.a;
        paint.setColor(num != null ? num.intValue() : 0);
        ColorStateList valueOf = ColorStateList.valueOf(b.b);
        RippleDrawable rippleDrawable = this.z0;
        rippleDrawable.setColor(valueOf);
        setBackground(rippleDrawable);
        invalidate();
    }

    public final void setSubtitle(CharSequence charSequence) {
        j(this.x, charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        j(charSequence, this.y);
    }
}
