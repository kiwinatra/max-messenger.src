package defpackage;

import android.graphics.drawable.Drawable;
import android.text.DynamicLayout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.ArraysKt;

/* renamed from: wgf  reason: default package */
public abstract class wgf {
    public static final ArrayList a;

    static {
        ArrayList arrayList = new ArrayList();
        for (Object next : ArraysKt.toList((T[]) DynamicLayout.class.getDeclaredClasses())) {
            if (SpanWatcher.class.isAssignableFrom((Class) next)) {
                arrayList.add(next);
            }
        }
        a = arrayList;
    }

    public static final boolean a(TextView textView, Object obj) {
        Object[] spans;
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null || (spans = spanned.getSpans(0, textView.length(), obj.getClass())) == null) {
            return false;
        }
        for (Object obj2 : spans) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    public static final l2g b(TextView textView) {
        Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        if (drawable instanceof l2g) {
            return (l2g) drawable;
        }
        return null;
    }

    public static final void c(TextView textView, Object obj) {
        int spanStart;
        int spanEnd;
        if (a(textView, obj)) {
            CharSequence text = textView.getText();
            Object[] objArr = null;
            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
            if (spannable == null) {
                textView.invalidate();
                return;
            }
            CharSequence text2 = textView.getText();
            Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
            if (spanned != null) {
                objArr = spanned.getSpans(0, textView.getText().length(), SpanWatcher.class);
            }
            if (objArr == null) {
                objArr = new SpanWatcher[0];
            }
            SpanWatcher[] spanWatcherArr = (SpanWatcher[]) objArr;
            if (spanWatcherArr.length != 0 && (spanStart = spannable.getSpanStart(obj)) != -1 && (spanEnd = spannable.getSpanEnd(obj)) >= spanStart) {
                for (SpanWatcher spanWatcher : spanWatcherArr) {
                    ArrayList arrayList = a;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Class) it.next()) == spanWatcher.getClass()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    spanWatcher.onSpanChanged(spannable, obj, spanStart, spanEnd, spanStart, spanEnd);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean d(android.widget.TextView r2) {
        /*
            l2g r0 = b(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0017
            m2g r0 = r0.a
            if (r0 != 0) goto L_0x000c
            goto L_0x0017
        L_0x000c:
            float r2 = f(r2)
            m2g r2 = defpackage.m5a.S(r2)
            if (r2 == r0) goto L_0x0017
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgf.d(android.widget.TextView):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r2.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(android.widget.TextView r1, defpackage.l2g r2) {
        /*
            r0 = 0
            r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r0, r2, r0)
            if (r2 == 0) goto L_0x001d
            m2g r2 = r2.a
            if (r2 == 0) goto L_0x001d
            int r2 = r2.b
            float r2 = (float) r2
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            r1.setCompoundDrawablePadding(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgf.e(android.widget.TextView, l2g):void");
    }

    public static final float f(TextView textView) {
        return textView.getPaint().getTextSize() / textView.getResources().getDisplayMetrics().density;
    }
}
