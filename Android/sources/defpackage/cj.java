package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: cj  reason: default package */
public abstract class cj extends AppCompatEditText {
    public boolean w;
    public uk[] x;
    public final bj y = new bj(0, this);

    public cj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setLayerType(1, (Paint) null);
    }

    public final boolean getAnimojiEnabled() {
        return this.w;
    }

    public final uk[] getCachedSpans$animoji_release() {
        return this.x;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        uk[] ukVarArr = this.x;
        if (ukVarArr != null) {
            for (uk ukVar : ukVarArr) {
                ukVar.a.removeParentView(this.y);
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        boolean z = ii.b;
        if (z) {
            ii.a.getClass();
        }
        super.onDraw(canvas);
        if (z) {
            ii.a.getClass();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: uk[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: uk[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: uk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: uk[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: uk[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            fk r12 = defpackage.ii.c
            if (r12 == 0) goto L_0x00bf
            boolean r12 = r10.w
            if (r12 != 0) goto L_0x000a
            goto L_0x00bf
        L_0x000a:
            boolean r12 = r11 instanceof android.text.Spannable
            r13 = 0
            if (r12 == 0) goto L_0x0013
            r12 = r11
            android.text.Spannable r12 = (android.text.Spannable) r12
            goto L_0x0014
        L_0x0013:
            r12 = r13
        L_0x0014:
            java.lang.Class<uk> r14 = defpackage.uk.class
            bj r0 = r10.y
            r1 = 0
            if (r12 == 0) goto L_0x0034
            uk[] r2 = r10.x
            if (r2 == 0) goto L_0x002d
            int r3 = r2.length
            r4 = r1
        L_0x0021:
            if (r4 >= r3) goto L_0x002d
            r5 = r2[r4]
            one.me.rlottie.RLottieDrawable r5 = r5.a
            r5.removeParentView(r0)
            int r4 = r4 + 1
            goto L_0x0021
        L_0x002d:
            int r2 = r12.length()
            defpackage.ld8.m0(r12, r14, r1, r2)
        L_0x0034:
            s15 r12 = defpackage.s15.a()     // Catch:{ all -> 0x003b }
            r12.h(r11)     // Catch:{ all -> 0x003b }
        L_0x003b:
            fk r12 = defpackage.ii.c
            if (r11 == 0) goto L_0x0098
            int r2 = r11.length()
            if (r2 != 0) goto L_0x0046
            goto L_0x0098
        L_0x0046:
            boolean r2 = r11 instanceof android.text.Spannable
            if (r2 != 0) goto L_0x004b
            goto L_0x0098
        L_0x004b:
            java.util.List r2 = r12.b(r11)
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            defpackage.ryg.e(r10, r3)
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0069:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0092
            java.lang.Object r5 = r2.next()
            qi r5 = (defpackage.qi) r5
            java.lang.String r6 = r5.a
            java.util.concurrent.ConcurrentHashMap r7 = r12.c
            java.lang.Object r7 = r7.get(r6)
            one.me.rlottie.RLottieDrawable r7 = (one.me.rlottie.RLottieDrawable) r7
            if (r7 != 0) goto L_0x0083
            r8 = r13
            goto L_0x008c
        L_0x0083:
            fsb r8 = new fsb
            int r9 = r5.c
            int r5 = r5.d
            r8.<init>(r6, r7, r9, r5)
        L_0x008c:
            if (r8 == 0) goto L_0x0069
            r4.add(r8)
            goto L_0x0069
        L_0x0092:
            defpackage.ryg.d(r3, r4, r12)
            defpackage.ryg.V(r11)
        L_0x0098:
            if (r11 == 0) goto L_0x00ae
            int r12 = r11.length()
            boolean r2 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x00ac }
            if (r2 == 0) goto L_0x00a5
            android.text.Spanned r11 = (android.text.Spanned) r11     // Catch:{ all -> 0x00ac }
            goto L_0x00a6
        L_0x00a5:
            r11 = r13
        L_0x00a6:
            if (r11 == 0) goto L_0x00ac
            java.lang.Object[] r13 = r11.getSpans(r1, r12, r14)     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            uk[] r13 = (defpackage.uk[]) r13
        L_0x00ae:
            r10.x = r13
            if (r13 == 0) goto L_0x00bf
            int r10 = r13.length
        L_0x00b3:
            if (r1 >= r10) goto L_0x00bf
            r11 = r13[r1]
            one.me.rlottie.RLottieDrawable r11 = r11.a
            r11.addParentView(r0)
            int r1 = r1 + 1
            goto L_0x00b3
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void setAnimojiEnabled(boolean z) {
        if (this.w != z) {
            Editable text = getText();
            if (text != null) {
                onTextChanged(text, 0, text.length(), text.length());
            }
            this.w = z;
        }
    }

    public final void setCachedSpans$animoji_release(uk[] ukVarArr) {
        this.x = ukVarArr;
    }

    public final void setLayerType(int i, Paint paint) {
        super.setLayerType(1, paint);
    }
}
