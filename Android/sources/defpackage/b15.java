package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: b15  reason: default package */
public final class b15 extends ela {
    public static final Rect v0 = new Rect();
    public static final Pattern w0 = Pattern.compile("[\\.,…\\:\\s]*$", 32);
    public boolean b;
    public boolean c;
    public CharSequence o;
    public int v = IntCompanionObject.MAX_VALUE;
    public float w = 1.0f;
    public float x;
    public Pattern y = w0;
    public boolean z;

    public b15(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    private final int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / a("").getLineBottom(0);
    }

    private final int getLinesCount() {
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    public final StaticLayout a(CharSequence charSequence) {
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
        return new StaticLayout(charSequence, getPaint(), ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - i2) - i3) - i, Layout.Alignment.ALIGN_NORMAL, this.w, this.x, false);
    }

    public final Rect getBottomLineRect() {
        int lineCount = getLayout().getLineCount();
        int i = lineCount - 1;
        Rect rect = v0;
        if (i < 0) {
            rect.setEmpty();
        } else {
            int lineStart = getLayout().getLineStart(i);
            float lineWidth = getLayout().getLineWidth(i);
            rect.top = getLayout().getLineTop(i);
            rect.bottom = getLayout().getLineTop(lineCount);
            rect.left = lineStart;
            rect.right = MathKt.roundToInt(((float) lineStart) + lineWidth);
        }
        return rect;
    }

    public int getMaxLines() {
        return this.v;
    }

    public final void onDraw(Canvas canvas) {
        CharSequence charSequence;
        if (this.b && (charSequence = this.o) != null) {
            CharSequence charSequence2 = "…";
            if (this.z) {
                charSequence2 = TextUtils.concat(new CharSequence[]{charSequence2, charSequence.subSequence(charSequence.length() - 1, charSequence.length())});
            }
            StaticLayout a = a(charSequence);
            int linesCount = getLinesCount();
            if (linesCount > 0 && a.getLineCount() > linesCount) {
                int lineEnd = a.getLineEnd(linesCount - 1) + 1;
                if (lineEnd >= charSequence.length()) {
                    lineEnd = charSequence.length() - 1;
                }
                CharSequence subSequence = charSequence.subSequence(0, lineEnd);
                while (true) {
                    if (a(TextUtils.concat(new CharSequence[]{subSequence, charSequence2})).getLineCount() > linesCount && lineEnd - 1 > 0) {
                        subSequence = subSequence.subSequence(0, lineEnd);
                    }
                }
                if (subSequence instanceof Spanned) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                    Matcher matcher = this.y.matcher(subSequence);
                    if (matcher.find()) {
                        spannableStringBuilder.replace(matcher.start(), subSequence.length(), charSequence2);
                    }
                    charSequence = spannableStringBuilder;
                } else {
                    charSequence = TextUtils.concat(new CharSequence[]{this.y.matcher(subSequence).replaceFirst(""), charSequence2});
                }
            }
            if (!Intrinsics.areEqual((Object) charSequence, (Object) getText())) {
                this.c = true;
                try {
                    setText(charSequence);
                } finally {
                    this.c = false;
                }
            }
            this.b = false;
        }
        super.onDraw(canvas);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b = true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if ((!this.c && this.o == null) || charSequence == null || !charSequence.equals(this.o)) {
            this.o = charSequence;
            this.b = true;
        }
    }

    public final void setEndPunctuationPattern(Pattern pattern) {
        if (pattern == null) {
            pattern = w0;
        }
        this.y = pattern;
    }

    public final void setLineSpacing(float f, float f2) {
        this.x = f;
        this.w = f2;
        super.setLineSpacing(f, f2);
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.v = i;
        this.b = true;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.b = true;
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        this.b = true;
    }

    public final void setSaveLastCharPosition(boolean z2) {
        this.z = z2;
    }
}
