package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: gl3  reason: default package */
public final class gl3 extends LinearLayout implements o23 {
    public int a;
    public int b;
    public TextView c;
    public TextView o;
    public ImageView v;
    public fl3 v0;
    public ImageView w;
    public p7d w0;
    public TamAvatarView x;
    public ro4 x0;
    public or7 y;
    public km3 y0;
    public l20 z;

    private void setContactNameBackgroundColor(int i) {
        TextView textView = this.c;
        Drawable background = textView.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        int a2 = fw3.a(getContext(), i);
        if (color != a2) {
            textView.setBackgroundColor(a2);
        }
    }

    private void setPhonebookTextBackgroundColor(int i) {
        TextView textView = this.o;
        Drawable background = textView.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        int a2 = fw3.a(getContext(), i);
        if (color != a2) {
            textView.setBackgroundColor(a2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0120, code lost:
        if (r12.k == defpackage.tm3.a) goto L_0x0124;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.l20 r12, java.lang.Boolean r13) {
        /*
            r11 = this;
            r0 = 0
            r11.z = r12
            p7d r1 = new p7d
            n10 r12 = r12.k
            r1.<init>((defpackage.n10) r12)
            r11.w0 = r1
            android.content.Context r12 = r11.getContext()
            kotlin.Lazy r1 = defpackage.scf.b0
            scf r12 = defpackage.j4b.k0(r12)
            boolean r13 = r13.booleanValue()
            ws0 r12 = r12.c(r13)
            android.widget.TextView r13 = r11.c
            zs0 r1 = r12.b
            int r1 = r1.d
            r13.setTextColor(r1)
            android.widget.TextView r13 = r11.o
            zs0 r1 = r12.b
            int r1 = r1.e
            r13.setTextColor(r1)
            android.widget.ImageView r13 = r11.v
            xs0 r1 = r12.c
            int r2 = r1.d
            r13.setColorFilter(r2)
            android.widget.ImageView r13 = r11.w
            int r1 = r1.d
            r13.setColorFilter(r1)
            android.widget.ImageView r13 = r11.v
            qs0 r12 = r12.a
            int r1 = r12.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            android.graphics.drawable.GradientDrawable r1 = defpackage.i8b.K(r1, r2, r2)
            int r12 = r12.g
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            int r4 = defpackage.j4b.l0(r3, r12)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.graphics.drawable.GradientDrawable r4 = defpackage.i8b.K(r4, r2, r2)
            android.graphics.drawable.StateListDrawable r1 = defpackage.i8b.T(r1, r4, r2)
            r13.setBackground(r1)
            android.widget.ImageView r13 = r11.w
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            android.graphics.drawable.GradientDrawable r1 = defpackage.i8b.K(r1, r2, r2)
            int r12 = defpackage.j4b.l0(r3, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.graphics.drawable.GradientDrawable r12 = defpackage.i8b.K(r12, r2, r2)
            android.graphics.drawable.StateListDrawable r12 = defpackage.i8b.T(r1, r12, r2)
            r13.setBackground(r12)
            p7d r12 = r11.w0
            java.lang.Object r13 = r12.c
            vk3 r13 = (defpackage.vk3) r13
            r1 = 1
            if (r13 == 0) goto L_0x0093
            boolean r13 = r13.w
            if (r13 == 0) goto L_0x0093
            r13 = r1
            goto L_0x0094
        L_0x0093:
            r13 = r0
        L_0x0094:
            java.lang.Object r2 = r12.b
            n10 r2 = (defpackage.n10) r2
            long r3 = r2.b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00a2
            r3 = r1
            goto L_0x00a3
        L_0x00a2:
            r3 = r0
        L_0x00a3:
            java.lang.String r4 = r2.a
            boolean r4 = defpackage.cvg.A(r4)
            r4 = r4 ^ r1
            id3 r5 = defpackage.ym.e()
            qra r5 = (defpackage.qra) r5
            q4 r5 = r5.getAccessor()
            java.lang.Class<bl3> r6 = defpackage.bl3.class
            java.lang.Object r5 = r5.g(r6)
            bl3 r5 = (defpackage.bl3) r5
            java.lang.Object r5 = r12.c
            vk3 r5 = (defpackage.vk3) r5
            java.lang.String r5 = defpackage.bs0.H(r5, r2)
            android.widget.TextView r6 = r11.o
            r6.setVisibility(r0)
            android.widget.TextView r6 = r11.o
            r7 = -2
            defpackage.iq.Y(r6, r7)
            int r6 = defpackage.lad.u
            r11.setPhonebookTextBackgroundColor(r6)
            ru.ok.messages.views.widgets.TamAvatarView r8 = r11.x
            int r9 = defpackage.ie0.w0
            boolean r12 = r12.n(r8, r9, r9)
            if (r12 == 0) goto L_0x00f6
            or7 r12 = r11.y
            boolean r12 = defpackage.jbd.d(r12)
            if (r12 == 0) goto L_0x0106
            ru.ok.messages.views.widgets.TamAvatarView r12 = r11.x
            el3 r8 = new el3
            r8.<init>(r11, r0)
            r9 = 300(0x12c, double:1.48E-321)
            or7 r12 = defpackage.y64.m(r12, r9, r8)
            r11.y = r12
            goto L_0x0106
        L_0x00f6:
            or7 r12 = r11.y
            boolean r12 = defpackage.jbd.d(r12)
            if (r12 != 0) goto L_0x0106
            or7 r12 = r11.y
            r12.getClass()
            defpackage.qq4.a(r12)
        L_0x0106:
            km3 r12 = r11.y0
            l20 r8 = r11.z
            n10 r8 = r8.k
            long r8 = r8.b
            vk3 r12 = r12.p(r8, r0)
            if (r12 == 0) goto L_0x0123
            vm3 r12 = r12.a
            um3 r12 = r12.c
            sm3 r8 = r12.i
            if (r8 != 0) goto L_0x0123
            tm3 r12 = r12.k
            tm3 r8 = defpackage.tm3.a
            if (r12 != r8) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r1 = r0
        L_0x0124:
            r12 = 8
            if (r13 == 0) goto L_0x0138
            android.widget.TextView r13 = r11.o
            r13.setVisibility(r12)
            android.widget.ImageView r13 = r11.v
            r13.setVisibility(r12)
            android.widget.ImageView r13 = r11.w
            r13.setVisibility(r12)
            goto L_0x0191
        L_0x0138:
            if (r3 == 0) goto L_0x0154
            if (r1 == 0) goto L_0x0154
            android.widget.TextView r12 = r11.o
            android.content.res.Resources r13 = r11.getResources()
            int r1 = defpackage.qad.K1
            java.lang.CharSequence r13 = r13.getText(r1)
            r12.setText(r13)
            android.widget.ImageView r12 = r11.v
            r12.setVisibility(r0)
            r11.b(r4)
            goto L_0x0191
        L_0x0154:
            if (r3 == 0) goto L_0x016e
            android.widget.TextView r12 = r11.o
            android.content.res.Resources r13 = r11.getResources()
            int r1 = defpackage.qad.L1
            java.lang.CharSequence r13 = r13.getText(r1)
            r12.setText(r13)
            android.widget.ImageView r12 = r11.v
            r12.setVisibility(r0)
            r11.b(r4)
            goto L_0x0191
        L_0x016e:
            if (r4 == 0) goto L_0x01ae
            java.lang.String r13 = r2.d
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x01ae
            android.widget.TextView r13 = r11.o
            android.content.res.Resources r1 = r11.getResources()
            int r2 = defpackage.qad.M1
            java.lang.CharSequence r1 = r1.getText(r2)
            r13.setText(r1)
            android.widget.ImageView r13 = r11.v
            r13.setVisibility(r12)
            android.widget.ImageView r12 = r11.w
            r12.setVisibility(r0)
        L_0x0191:
            boolean r12 = android.text.TextUtils.isEmpty(r5)
            if (r12 == 0) goto L_0x0198
            goto L_0x01e7
        L_0x0198:
            r11.setContactNameBackgroundColor(r6)
            android.widget.TextView r12 = r11.c
            r11.getContext()
            r12.setText(r5)
            android.widget.TextView r12 = r11.c
            defpackage.iq.Y(r12, r7)
            android.widget.TextView r11 = r11.c
            defpackage.iq.L(r11, r0)
            goto L_0x01e7
        L_0x01ae:
            android.widget.ImageView r12 = r11.v
            r13 = 4
            r12.setVisibility(r13)
            android.widget.ImageView r12 = r11.w
            r12.setVisibility(r13)
            android.widget.TextView r12 = r11.c
            java.lang.String r13 = ""
            r12.setText(r13)
            android.widget.TextView r12 = r11.c
            int r1 = r11.a
            defpackage.iq.Y(r12, r1)
            int r12 = defpackage.lad.k
            r11.setContactNameBackgroundColor(r12)
            android.widget.TextView r1 = r11.c
            int r2 = r11.b
            defpackage.iq.L(r1, r2)
            android.widget.TextView r1 = r11.o
            r1.setVisibility(r0)
            android.widget.TextView r0 = r11.o
            r0.setText(r13)
            android.widget.TextView r13 = r11.o
            int r0 = r11.a
            defpackage.iq.Y(r13, r0)
            r11.setPhonebookTextBackgroundColor(r12)
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl3.a(l20, java.lang.Boolean):void");
    }

    public final void b(boolean z2) {
        if (z2) {
            this.w.setVisibility(0);
            iq.M(this.v, this.x0.f);
            return;
        }
        this.w.setVisibility(8);
        iq.M(this.v, 0);
    }

    public List<View> getClickableChildren() {
        return Arrays.asList(new View[]{this.v, this.w, this.x, this.c, this.o, findViewById(lic.view_contact_attach__tv_container)});
    }

    public void setListener(fl3 fl3) {
        this.v0 = fl3;
    }
}
