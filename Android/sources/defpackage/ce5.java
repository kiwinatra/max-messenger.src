package defpackage;

import android.graphics.RectF;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;

/* renamed from: ce5  reason: default package */
public final class ce5 extends LinkMovementMethod {
    public static volatile ce5 c;
    public final RectF a = new RectF();
    public ClickableSpan b;

    public static ce5 a() {
        ce5 ce5 = c;
        if (ce5 == null) {
            synchronized (ce5.class) {
                try {
                    ce5 = c;
                    if (ce5 == null) {
                        ce5 = new ce5();
                        c = ce5;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ce5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.widget.TextView r9, android.text.Spannable r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            float r0 = r11.getX()
            int r0 = (int) r0
            float r1 = r11.getY()
            int r1 = (int) r1
            int r2 = r9.getTotalPaddingLeft()
            int r0 = r0 - r2
            int r2 = r9.getTotalPaddingTop()
            int r1 = r1 - r2
            int r2 = r9.getScrollX()
            int r2 = r2 + r0
            int r0 = r9.getScrollY()
            int r0 = r0 + r1
            android.text.Layout r1 = r9.getLayout()
            int r3 = r1.getLineForVertical(r0)
            float r2 = (float) r2
            int r4 = r1.getOffsetForHorizontal(r3, r2)
            android.graphics.RectF r5 = r8.a
            float r6 = r1.getLineLeft(r3)
            r5.left = r6
            int r6 = r1.getLineTop(r3)
            float r6 = (float) r6
            r5.top = r6
            float r6 = r1.getLineMax(r3)
            float r7 = r5.left
            float r6 = r6 + r7
            r5.right = r6
            int r1 = r1.getLineBottom(r3)
            float r1 = (float) r1
            r5.bottom = r1
            float r0 = (float) r0
            boolean r0 = r5.contains(r2, r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x006a
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r10 = r10.getSpans(r4, r4, r0)
            int r0 = r10.length
            r3 = r1
        L_0x005b:
            if (r3 >= r0) goto L_0x006a
            r4 = r10[r3]
            boolean r5 = r4 instanceof android.text.style.ClickableSpan
            if (r5 == 0) goto L_0x0067
            r2 = r4
            android.text.style.ClickableSpan r2 = (android.text.style.ClickableSpan) r2
            goto L_0x006a
        L_0x0067:
            int r3 = r3 + 1
            goto L_0x005b
        L_0x006a:
            android.text.style.ClickableSpan r10 = r8.b
            r0 = 1
            if (r10 == 0) goto L_0x0071
            r10 = r0
            goto L_0x0072
        L_0x0071:
            r10 = r1
        L_0x0072:
            int r11 = r11.getAction()
            if (r11 == 0) goto L_0x008b
            if (r11 == r0) goto L_0x007f
            r8 = 2
            if (r11 == r8) goto L_0x007e
            return r1
        L_0x007e:
            return r10
        L_0x007f:
            if (r2 == 0) goto L_0x008a
            if (r10 == 0) goto L_0x008a
            android.text.style.ClickableSpan r8 = r8.b
            if (r2 != r8) goto L_0x008a
            r2.onClick(r9)
        L_0x008a:
            return r10
        L_0x008b:
            r8.b = r2
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce5.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
