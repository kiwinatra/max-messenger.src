package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* renamed from: q23  reason: default package */
public final class q23 extends LinkMovementMethod {
    public static final String m = Reflection.getOrCreateKotlinClass(q23.class).getSimpleName();
    public final p23 a;
    public final RectF b = new RectF();
    public String c;
    public WeakReference d;
    public Spannable e;
    public ClickableSpan f;
    public boolean g;
    public Function0 h;
    public boolean i;
    public Runnable j;
    public final q00 k;
    public final GestureDetector l;

    public q23(Context context, td8 td8) {
        this.a = td8;
        q00 q00 = new q00(7, this);
        this.k = q00;
        this.l = new GestureDetector(context, q00);
    }

    public static final ClickableSpan a(q23 q23, View view, Spannable spannable, MotionEvent motionEvent) {
        Layout layout;
        q23.getClass();
        if (view == null) {
            return null;
        }
        lf9 lf9 = view instanceof lf9 ? (lf9) view : null;
        if (lf9 == null || (layout = lf9.getLayout()) == null) {
            return null;
        }
        lf9 lf92 = (lf9) view;
        int x = ((int) motionEvent.getX()) - lf92.getPaddingLeft();
        int scrollY = lf92.getScrollY() + (((int) motionEvent.getY()) - lf92.getPaddingTop());
        int lineForVertical = layout.getLineForVertical(scrollY);
        float scrollX = (float) (lf92.getScrollX() + x);
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
            RectF rectF = q23.b;
            rectF.left = layout.getLineLeft(lineForVertical);
            rectF.top = (float) layout.getLineTop(lineForVertical);
            rectF.right = layout.getLineMax(lineForVertical) + rectF.left;
            rectF.bottom = (float) layout.getLineBottom(lineForVertical);
            if (!rectF.contains(scrollX, (float) scrollY)) {
                return null;
            }
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (!(clickableSpanArr.length == 0)) {
                return clickableSpanArr[0];
            }
            return null;
        } catch (Exception e2) {
            z68.f(m, "findClickableSpanUnderTouch failed:", e2);
            return null;
        }
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.d = new WeakReference(textView);
            this.e = spannable;
        }
        return this.l.onTouchEvent(motionEvent);
    }
}
