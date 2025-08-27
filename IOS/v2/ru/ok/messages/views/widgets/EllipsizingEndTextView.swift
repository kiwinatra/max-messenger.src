package ru.ok.messages.views.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.animoji.views.AnimojiTextView;

public class EllipsizingEndTextView extends AnimojiTextView {
    public static final Pattern C0 = Pattern.compile("[\\.,…;\\:\\s]*$", 32);
    public Pattern A0;
    public boolean B0;
    public boolean v0;
    public CharSequence w0;
    public int x0;
    public float y0 = 1.0f;
    public boolean z;
    public float z0 = c44.DEFAULT_ASPECT_RATIO;

    public EllipsizingEndTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.setEllipsize((TextUtils.TruncateAt) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091});
        setMaxLines(obtainStyledAttributes.getInt(0, IntCompanionObject.MAX_VALUE));
        obtainStyledAttributes.recycle();
        setEndPunctuationPattern(C0);
    }

    private int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / l("").getLineBottom(0);
    }

    private int getLinesCount() {
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    @SuppressLint({"Override"})
    public int getMaxLines() {
        return this.x0;
    }

    public final StaticLayout l(CharSequence charSequence) {
        int i;
        int i2;
        Drawable[] compoundDrawables = getCompoundDrawables();
        int i3 = 0;
        Drawable drawable = compoundDrawables[0];
        if (drawable != null) {
            i2 = drawable.getIntrinsicWidth();
            i = getCompoundDrawablePadding();
        } else {
            i2 = 0;
            i = 0;
        }
        Drawable drawable2 = compoundDrawables[2];
        if (drawable2 != null) {
            i3 = drawable2.getIntrinsicWidth();
            i += getCompoundDrawablePadding();
        }
        return new StaticLayout(charSequence, getPaint(), ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - i2) - i3) - i, Layout.Alignment.ALIGN_NORMAL, this.y0, this.z0, false);
    }

    public final void onDraw(Canvas canvas) {
        if (this.z) {
            CharSequence charSequence = "…";
            if (this.B0) {
                CharSequence charSequence2 = this.w0;
                charSequence = TextUtils.concat(new CharSequence[]{charSequence, charSequence2.subSequence(charSequence2.length() - 1, this.w0.length())});
            }
            CharSequence charSequence3 = this.w0;
            StaticLayout l = l(charSequence3);
            int linesCount = getLinesCount();
            SpannableStringBuilder spannableStringBuilder = charSequence3;
            if (linesCount > 0) {
                spannableStringBuilder = charSequence3;
                if (l.getLineCount() > linesCount) {
                    int lineEnd = l.getLineEnd(linesCount - 1) + 1;
                    if (lineEnd >= this.w0.length()) {
                        lineEnd = this.w0.length() - 1;
                    }
                    CharSequence subSequence = this.w0.subSequence(0, lineEnd);
                    while (true) {
                        if (l(TextUtils.concat(new CharSequence[]{subSequence, charSequence})).getLineCount() > linesCount && lineEnd - 1 > 0) {
                            subSequence = subSequence.subSequence(0, lineEnd);
                        }
                    }
                    if (subSequence instanceof SpannedString) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(subSequence);
                        Matcher matcher = this.A0.matcher(subSequence);
                        spannableStringBuilder = spannableStringBuilder2;
                        if (matcher.find()) {
                            spannableStringBuilder2.replace(matcher.start(), ((SpannedString) subSequence).length(), charSequence);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                    } else {
                        spannableStringBuilder = TextUtils.concat(new CharSequence[]{this.A0.matcher(subSequence).replaceFirst(""), charSequence});
                    }
                }
            }
            if (!TextUtils.equals(spannableStringBuilder, getText())) {
                this.v0 = true;
                try {
                    setText(spannableStringBuilder);
                } finally {
                    this.v0 = false;
                }
            }
            this.z = false;
        }
        super.onDraw(canvas);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.z = true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if ((!this.v0 && this.w0 == null) || !charSequence.equals(this.w0)) {
            this.w0 = charSequence;
            this.z = true;
        }
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.A0 = pattern;
    }

    public final void setLineSpacing(float f, float f2) {
        this.z0 = f;
        this.y0 = f2;
        super.setLineSpacing(f, f2);
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.x0 = i;
        this.z = true;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.z = true;
    }

    public void setSaveLastCharPosition(boolean z2) {
        this.B0 = z2;
    }
}
