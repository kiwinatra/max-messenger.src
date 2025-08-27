package defpackage;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.view.View;

/* renamed from: qy7  reason: default package */
public final class qy7 implements TransformationMethod {
    public ny7 a;
    public int b;
    public final boolean c;
    public final boolean d;
    public final a94 e;

    public qy7() {
        this(0, 15);
    }

    public static void a(Spannable spannable) {
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        if (spans != null) {
            for (Object obj : spans) {
                if (obj instanceof my7) {
                    ((my7) obj).a = null;
                } else if (obj instanceof k6c) {
                    ((k6c) obj).c = null;
                } else if (obj instanceof xw6) {
                    ((xw6) obj).c = null;
                } else if (obj instanceof lq0) {
                    ((lq0) obj).c = null;
                } else if (obj instanceof xa9) {
                    ((xa9) obj).c = null;
                } else if (obj instanceof ky7) {
                    ((ky7) obj).c = null;
                }
            }
        }
    }

    public final void b(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            if (spans != null) {
                for (Object c2 : spans) {
                    c(c2);
                }
            }
        }
    }

    public final void c(Object obj) {
        if (obj != null) {
            if (obj instanceof my7) {
                ((my7) obj).a = this.a;
            } else if (obj instanceof k6c) {
                ((k6c) obj).c = new oy7(this);
            } else if (obj instanceof xw6) {
                ((xw6) obj).c = new ly7(this, obj);
            } else if (obj instanceof lq0) {
                ((lq0) obj).c = new ly7(this, obj);
            } else if (obj instanceof xa9) {
                ((xa9) obj).c = new py7(this);
            } else if (obj instanceof ky7) {
                ((ky7) obj).c = new ly7(this, obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r3 = defpackage.bk3.o(((android.widget.TextView) r5).getText(), r3.b, r3.c, r3.d, new defpackage.vq7(2, (java.lang.Object) r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence r4, android.view.View r5) {
        /*
            r3 = this;
            int r0 = r3.b
            if (r0 != 0) goto L_0x001f
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000d
            vi4 r0 = defpackage.vi4.f0
            goto L_0x0017
        L_0x000d:
            android.content.Context r0 = r5.getContext()
            kotlin.Lazy r1 = defpackage.scf.b0
            scf r0 = defpackage.j4b.k0(r0)
        L_0x0017:
            ws0 r0 = r0.h
            zs0 r0 = r0.b
            int r0 = r0.b
            r3.b = r0
        L_0x001f:
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0024
            return r4
        L_0x0024:
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.CharSequence r5 = r5.getText()
            int r0 = r3.b
            vq7 r1 = new vq7
            r2 = 2
            r1.<init>((int) r2, (java.lang.Object) r3)
            boolean r2 = r3.c
            boolean r3 = r3.d
            android.text.Spannable r3 = defpackage.bk3.o(r5, r0, r2, r3, r1)
            if (r3 != 0) goto L_0x003d
            return r4
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy7.getTransformation(java.lang.CharSequence, android.view.View):java.lang.CharSequence");
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy7(int i, int i2) {
        this((ny7) null, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0, false);
    }

    public qy7(ny7 ny7, int i, boolean z, boolean z2) {
        this.a = ny7;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = new a94();
    }
}
