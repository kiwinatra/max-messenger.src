package defpackage;

import android.text.InputFilter;

/* renamed from: kz5  reason: default package */
public final class kz5 extends kbe {
    public final h2b D0;
    public my5 E0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kz5(android.view.View r8) {
        /*
            r7 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r8 = r8.getContext()
            r0.<init>(r8)
            r7.<init>(r0)
            h2b r8 = new h2b
            android.content.Context r1 = r0.getContext()
            r8.<init>(r1)
            r7.D0 = r8
            int r1 = defpackage.tgc.oneme_folders_edit_folder_name_field
            r0.setId(r1)
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            int r1 = defpackage.iua.j
            android.content.Context r4 = r8.getContext()
            java.lang.String r1 = defpackage.q8.p(r1, r4)
            r8.setHint(r1)
            rx2 r1 = new rx2
            r4 = 14
            r1.<init>(r4, r7)
            android.widget.EditText r4 = r8.a
            u2 r5 = new u2
            r6 = 12
            r5.<init>(r6, r1)
            r4.addTextChangedListener(r5)
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r4 = 20
            r1.<init>(r4)
            r4 = 1
            android.text.InputFilter[] r4 = new android.text.InputFilter[r4]
            r5 = 0
            r4[r5] = r1
            r8.setFilters(r4)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r4 = 17
            r1.<init>(r2, r3, r4)
            r0.addView(r8, r1)
            sa r8 = new sa
            r1 = 0
            r2 = 11
            r8.<init>((java.lang.Object) r7, (kotlin.coroutines.Continuation) r1, (int) r2)
            defpackage.b0h.H(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz5.<init>(android.view.View):void");
    }

    public final void O() {
        this.E0 = null;
    }

    /* renamed from: P */
    public final void M(jz5 jz5) {
        boolean z = jz5.b;
        h2b h2b = this.D0;
        h2b.setEnabled(z);
        h2b.setTextColorAttr(jz5.b ? jya.K : jya.H);
        if (h2b.getText().length() == 0) {
            ngf ngf = jz5.a;
            CharSequence b = ngf != null ? ngf.b(this.a.getContext().getResources()) : null;
            if (b == null) {
                b = "";
            }
            h2b.setText(b);
        }
        h2b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(jz5.c)});
        this.E0 = null;
    }
}
