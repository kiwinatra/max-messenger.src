package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;

/* renamed from: qx3  reason: default package */
public final class qx3 extends hg9 {
    public rt6 G0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: android.text.Spannable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P(one.me.messages.list.loader.MessageModel r8, java.util.List r9) {
        /*
            r7 = this;
            int r9 = r8.F0
            ig9 r0 = new ig9
            r0.<init>(r9)
            r7.F0 = r0
            r9 = 0
            android.view.View r0 = r7.a
            zc9 r1 = r8.w0
            if (r1 == 0) goto L_0x0023
            long r2 = r1.a
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0023
            pb r2 = new pb
            r3 = 29
            r2.<init>(r3, r7, r1)
            defpackage.ct.G(r0, 300, r2)
            goto L_0x0029
        L_0x0023:
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setOnClickListener(r9)
        L_0x0029:
            java.lang.CharSequence r1 = r8.o
            boolean r2 = r1 instanceof android.text.Spannable
            if (r2 == 0) goto L_0x0032
            r9 = r1
            android.text.Spannable r9 = (android.text.Spannable) r9
        L_0x0032:
            if (r9 == 0) goto L_0x0053
            int r2 = r9.length()
            r3 = 0
            java.lang.Class<em3> r4 = defpackage.em3.class
            java.lang.Object[] r9 = r9.getSpans(r3, r2, r4)
            em3[] r9 = (defpackage.em3[]) r9
            if (r9 == 0) goto L_0x0053
            int r2 = r9.length
        L_0x0044:
            if (r3 >= r2) goto L_0x0053
            r4 = r9[r3]
            rt3 r5 = new rt3
            r6 = 4
            r5.<init>((int) r6, (java.lang.Object) r7)
            r4.b = r5
            int r3 = r3 + 1
            goto L_0x0044
        L_0x0053:
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setText(r1)
            r7.Q(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx3.P(one.me.messages.list.loader.MessageModel, java.util.List):void");
    }

    public final void k(a93 a93) {
        TextView textView = (TextView) this.a;
        textView.setTextColor(a93.b.a);
        Drawable background = textView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(a93.a.j);
        }
    }
}
