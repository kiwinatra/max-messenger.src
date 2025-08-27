package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.WindowManager;

/* renamed from: p1a  reason: default package */
public final class p1a extends w1 {
    public final jtb b;
    public final i1a c;
    public tff o;

    public p1a(i1a i1a, tff tff, ltb ltb) {
        this.c = i1a;
        this.o = tff;
        this.b = ltb;
    }

    public final yia W() {
        if (U()) {
            return new yia(new imd(((s3a) this.a).X, 1), new q0a(15), 3);
        }
        throw new IllegalStateException("can't return text changes without view");
    }

    public final int X() {
        if (U()) {
            return ((s3a) this.a).X.getSelectionStart();
        }
        return 0;
    }

    public final CharSequence Y() {
        return !U() ? "" : ((s3a) this.a).X.getText();
    }

    public final Point Z(ClickableSpan clickableSpan) {
        ClickableSpan clickableSpan2 = clickableSpan;
        s3a s3a = (s3a) this.a;
        s3a.getClass();
        Rect rect = new Rect();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s3a.X.getText());
        Layout layout = s3a.X.getLayout();
        double spanEnd = (double) spannableStringBuilder.getSpanEnd(clickableSpan2);
        int spanStart = (int) ((double) spannableStringBuilder.getSpanStart(clickableSpan2));
        double primaryHorizontal = (double) layout.getPrimaryHorizontal(spanStart);
        int i = (int) spanEnd;
        double primaryHorizontal2 = (double) layout.getPrimaryHorizontal(i);
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineForOffset2 = layout.getLineForOffset(i);
        boolean z = lineForOffset != lineForOffset2;
        layout.getLineBounds(lineForOffset, rect);
        int[] iArr = {0, 0};
        s3a.X.getLocationOnScreen(iArr);
        double compoundPaddingTop = (double) (s3a.X.getCompoundPaddingTop() + (iArr[1] - s3a.X.getScrollY()));
        boolean z2 = z;
        rect.top = (int) (((double) rect.top) + compoundPaddingTop);
        rect.bottom = (int) (((double) rect.bottom) + compoundPaddingTop);
        WindowManager windowManager = (WindowManager) s3a.X.getContext().getSystemService("window");
        if (z2) {
            if (rect.top > windowManager.getDefaultDisplay().getHeight() - rect.bottom) {
                primaryHorizontal2 = (double) layout.getLineRight(lineForOffset);
            } else {
                rect = new Rect();
                layout.getLineBounds(lineForOffset2, rect);
                rect.top = (int) (((double) rect.top) + compoundPaddingTop);
                rect.bottom = (int) (((double) rect.bottom) + compoundPaddingTop);
                primaryHorizontal = (double) layout.getLineLeft(lineForOffset2);
            }
        }
        int compoundPaddingLeft = (int) ((((((double) iArr[0]) + primaryHorizontal) + ((double) s3a.X.getCompoundPaddingLeft())) - ((double) s3a.X.getScrollX())) + ((double) rect.left));
        rect.left = compoundPaddingLeft;
        rect.right = (int) ((((double) compoundPaddingLeft) + primaryHorizontal2) - primaryHorizontal);
        return new Point(rect.left, rect.top);
    }

    public final String a0() {
        return !U() ? "" : ((s3a) this.a).e0();
    }
}
