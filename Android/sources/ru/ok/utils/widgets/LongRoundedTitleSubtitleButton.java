package ru.ok.utils.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lwcf;", "", "title", "", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLongRoundedTitleSubtitleButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongRoundedTitleSubtitleButton.kt\nru/ok/utils/widgets/LongRoundedTitleSubtitleButton\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 4 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,73:1\n233#2,3:74\n49#3,2:77\n45#3:79\n29#4:80\n47#4,2:82\n29#4:84\n47#4,2:85\n1#5:81\n24#6:87\n*S KotlinDebug\n*F\n+ 1 LongRoundedTitleSubtitleButton.kt\nru/ok/utils/widgets/LongRoundedTitleSubtitleButton\n*L\n34#1:74,3\n40#1:77,2\n40#1:79\n45#1:80\n45#1:82,2\n48#1:84\n48#1:85,2\n70#1:87\n*E\n"})
public final class LongRoundedTitleSubtitleButton extends AppCompatButton implements wcf {
    public CharSequence o;
    public CharSequence v;
    public final TextAppearanceSpan w;
    public final TextAppearanceSpan x;

    @JvmOverloads
    public LongRoundedTitleSubtitleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        scf scf;
        this.w = new TextAppearanceSpan(context, cnc.UiUtils_TextAppearance_LongRoundedTitleSubtitleButton_Title);
        this.x = new TextAppearanceSpan(context, cnc.UiUtils_TextAppearance_LongRoundedTitleSubtitleButton_Subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, boc.LongRoundedTitleSubtitleButton);
        String string = obtainStyledAttributes.getString(boc.LongRoundedTitleSubtitleButton_lrts_title);
        String string2 = obtainStyledAttributes.getString(boc.LongRoundedTitleSubtitleButton_lrts_subtitle);
        b(string == null ? "" : string, string2 == null ? "" : string2);
        Unit unit = Unit.INSTANCE;
        obtainStyledAttributes.recycle();
        setGravity(17);
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context2);
        }
        L0(scf);
    }

    public final void L0(scf scf) {
        iq.f(scf, this, MathKt.roundToInt(((float) 42) * vo4.c().getDisplayMetrics().density), 0, 0, 60);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        SpannableString valueOf;
        SpannableString valueOf2;
        CharSequence charSequence3 = this.o;
        SpannableString spannableString = null;
        SpannableString spannableString2 = charSequence3;
        if (charSequence != charSequence3) {
            if (charSequence == null || (valueOf2 = SpannableString.valueOf(charSequence)) == null) {
                spannableString2 = null;
            } else {
                valueOf2.setSpan(this.w, 0, charSequence.length(), 17);
                spannableString2 = valueOf2;
            }
        }
        this.o = spannableString2;
        CharSequence charSequence4 = this.v;
        if (charSequence2 != charSequence4) {
            if (!(charSequence2 == null || (valueOf = SpannableString.valueOf(charSequence2)) == null)) {
                valueOf.setSpan(this.x, 0, charSequence2.length(), 17);
                spannableString = valueOf;
            }
            charSequence4 = spannableString;
        }
        this.v = charSequence4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence5 = this.o;
        if (charSequence5 == null) {
            charSequence5 = "";
        }
        SpannableStringBuilder append = spannableStringBuilder.append(charSequence5);
        CharSequence charSequence6 = this.v;
        if (charSequence6 != null) {
            append.append("\n").append(charSequence6);
        }
        setText(append);
    }

    public final void setSubtitle(CharSequence charSequence) {
        b(this.o, charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        b(charSequence, this.v);
    }
}
