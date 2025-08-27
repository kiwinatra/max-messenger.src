package defpackage;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: m99  reason: default package */
public final class m99 extends LinkMovementMethod {
    public static final m99 a = new LinkMovementMethod();

    public final void onTakeFocus(TextView textView, Spannable spannable, int i) {
        super.onTakeFocus(textView, spannable, i);
        if (textView.isInputMethodTarget()) {
            Selection.setSelection(spannable, spannable.length());
        }
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1 && action != 0) {
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX() + x;
        int scrollY = textView.getScrollY() + y;
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (!(!(clickableSpanArr.length == 0))) {
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        ClickableSpan clickableSpan = clickableSpanArr[0];
        if (action == 0) {
            Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
        } else if (action == 1) {
            clickableSpan.onClick(textView);
        }
        return true;
    }
}
