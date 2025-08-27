package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;

/* renamed from: dd  reason: default package */
public class dd {
    public final zc a;
    public final int b;

    public dd(Context context) {
        this(context, ed.g(0, context));
    }

    public dd a(Drawable drawable) {
        this.a.c = drawable;
        return this;
    }

    public void b(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public void c(CharSequence[] charSequenceArr, boolean[] zArr, uw9 uw9) {
        zc zcVar = this.a;
        zcVar.p = charSequenceArr;
        zcVar.y = uw9;
        zcVar.u = zArr;
        zcVar.v = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: wc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: android.widget.ListAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: android.widget.ArrayAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: wc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: wc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: wc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ed create() {
        /*
            r13 = this;
            ed r0 = new ed
            zc r7 = r13.a
            android.content.Context r1 = r7.a
            int r13 = r13.b
            r0.<init>(r1, r13)
            android.view.View r13 = r7.e
            cd r8 = r0.w
            r9 = 0
            if (r13 == 0) goto L_0x0015
            r8.C = r13
            goto L_0x0036
        L_0x0015:
            java.lang.CharSequence r13 = r7.d
            if (r13 == 0) goto L_0x0022
            r8.e = r13
            android.widget.TextView r1 = r8.A
            if (r1 == 0) goto L_0x0022
            r1.setText(r13)
        L_0x0022:
            android.graphics.drawable.Drawable r13 = r7.c
            if (r13 == 0) goto L_0x0036
            r8.y = r13
            r8.x = r9
            android.widget.ImageView r1 = r8.z
            if (r1 == 0) goto L_0x0036
            r1.setVisibility(r9)
            android.widget.ImageView r1 = r8.z
            r1.setImageDrawable(r13)
        L_0x0036:
            java.lang.CharSequence r13 = r7.f
            if (r13 == 0) goto L_0x0043
            r8.f = r13
            android.widget.TextView r1 = r8.B
            if (r1 == 0) goto L_0x0043
            r1.setText(r13)
        L_0x0043:
            java.lang.CharSequence r13 = r7.g
            if (r13 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            android.content.DialogInterface$OnClickListener r1 = r7.h
            r2 = -1
            r8.c(r2, r13, r1)
        L_0x004e:
            java.lang.CharSequence r13 = r7.i
            if (r13 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            android.content.DialogInterface$OnClickListener r1 = r7.j
            r2 = -2
            r8.c(r2, r13, r1)
        L_0x0059:
            java.lang.CharSequence r13 = r7.k
            if (r13 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            android.content.DialogInterface$OnClickListener r1 = r7.l
            r2 = -3
            r8.c(r2, r13, r1)
        L_0x0064:
            java.lang.CharSequence[] r13 = r7.p
            r10 = 1
            r11 = 0
            if (r13 != 0) goto L_0x006e
            android.widget.ListAdapter r13 = r7.q
            if (r13 == 0) goto L_0x00d6
        L_0x006e:
            int r13 = r8.G
            android.view.LayoutInflater r1 = r7.b
            android.view.View r13 = r1.inflate(r13, r11)
            androidx.appcompat.app.AlertController$RecycleListView r13 = (androidx.appcompat.app.AlertController$RecycleListView) r13
            boolean r1 = r7.v
            if (r1 == 0) goto L_0x008b
            wc r12 = new wc
            java.lang.CharSequence[] r5 = r7.p
            int r4 = r8.H
            android.content.Context r3 = r7.a
            r1 = r12
            r2 = r7
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x008b:
            boolean r1 = r7.w
            if (r1 == 0) goto L_0x0092
            int r1 = r8.I
            goto L_0x0094
        L_0x0092:
            int r1 = r8.J
        L_0x0094:
            android.widget.ListAdapter r12 = r7.q
            if (r12 == 0) goto L_0x0099
            goto L_0x00a5
        L_0x0099:
            bd r12 = new bd
            java.lang.CharSequence[] r2 = r7.p
            android.content.Context r3 = r7.a
            r4 = 16908308(0x1020014, float:2.3877285E-38)
            r12.<init>(r3, r1, r4, r2)
        L_0x00a5:
            r8.D = r12
            int r1 = r7.x
            r8.E = r1
            android.content.DialogInterface$OnClickListener r1 = r7.r
            if (r1 == 0) goto L_0x00b8
            xc r1 = new xc
            r1.<init>(r7, r8)
            r13.setOnItemClickListener(r1)
            goto L_0x00c4
        L_0x00b8:
            android.content.DialogInterface$OnMultiChoiceClickListener r1 = r7.y
            if (r1 == 0) goto L_0x00c4
            yc r1 = new yc
            r1.<init>(r7, r13, r8)
            r13.setOnItemClickListener(r1)
        L_0x00c4:
            boolean r1 = r7.w
            if (r1 == 0) goto L_0x00cc
            r13.setChoiceMode(r10)
            goto L_0x00d4
        L_0x00cc:
            boolean r1 = r7.v
            if (r1 == 0) goto L_0x00d4
            r1 = 2
            r13.setChoiceMode(r1)
        L_0x00d4:
            r8.g = r13
        L_0x00d6:
            android.view.View r13 = r7.t
            if (r13 == 0) goto L_0x00e1
            r8.h = r13
            r8.i = r9
            r8.j = r9
            goto L_0x00eb
        L_0x00e1:
            int r13 = r7.s
            if (r13 == 0) goto L_0x00eb
            r8.h = r11
            r8.i = r13
            r8.j = r9
        L_0x00eb:
            boolean r13 = r7.m
            r0.setCancelable(r13)
            boolean r13 = r7.m
            if (r13 == 0) goto L_0x00f7
            r0.setCanceledOnTouchOutside(r10)
        L_0x00f7:
            r0.setOnCancelListener(r11)
            android.content.DialogInterface$OnDismissListener r13 = r7.n
            r0.setOnDismissListener(r13)
            android.content.DialogInterface$OnKeyListener r13 = r7.o
            if (r13 == 0) goto L_0x0106
            r0.setOnKeyListener(r13)
        L_0x0106:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd.create():ed");
    }

    public dd d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        zc zcVar = this.a;
        zcVar.i = charSequence;
        zcVar.j = onClickListener;
        return this;
    }

    public dd e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        zc zcVar = this.a;
        zcVar.g = charSequence;
        zcVar.h = onClickListener;
        return this;
    }

    public void f(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        zc zcVar = this.a;
        zcVar.p = charSequenceArr;
        zcVar.r = onClickListener;
        zcVar.x = i;
        zcVar.w = true;
    }

    public final ed g() {
        ed create = create();
        create.show();
        return create;
    }

    public Context getContext() {
        return this.a.a;
    }

    public dd setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        zc zcVar = this.a;
        zcVar.i = zcVar.a.getText(i);
        zcVar.j = onClickListener;
        return this;
    }

    public dd setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        zc zcVar = this.a;
        zcVar.g = zcVar.a.getText(i);
        zcVar.h = onClickListener;
        return this;
    }

    public dd setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public dd setView(View view) {
        zc zcVar = this.a;
        zcVar.t = view;
        zcVar.s = 0;
        return this;
    }

    public dd(Context context, int i) {
        this.a = new zc(new ContextThemeWrapper(context, ed.g(i, context)));
        this.b = i;
    }
}
