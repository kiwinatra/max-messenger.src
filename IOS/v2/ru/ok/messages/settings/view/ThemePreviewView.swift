package ru.ok.messages.settings.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import ru.ok.messages.messages.widgets.layouts.OutgoingMessageLayout;

public class ThemePreviewView extends FrameLayout {
    public static final /* synthetic */ int z = 0;
    public final ro4 a;
    public final SimpleDraweeView b;
    public final TextView c;
    public final le7 o;
    public final le7 v;
    public int w;
    public final Path x = new Path();
    public ValueAnimator y;

    public ThemePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(getContext(), ujc.view_theme_preview, this);
        getContext();
        this.a = ro4.b();
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById(lic.frg_background_select__iv_current_bg);
        this.b = simpleDraweeView;
        ((sp6) simpleDraweeView.getHierarchy()).h(nf0.d);
        TextView textView = (TextView) findViewById(lic.row_message_date__tv_text);
        this.c = textView;
        textView.setText(getContext().getString(qad.l9));
        mu8 t = ((qra) ym.e()).t();
        ju8 r = t.r(nu8.c);
        ju8 r2 = t.r(nu8.a);
        ju8 r3 = t.r(nu8.b);
        this.o = new le7((kg9) findViewById(lic.frg_background_select__ll_message_in), r, r2, r3);
        this.v = new le7((OutgoingMessageLayout) findViewById(lic.frg_background_select__ll_message_out), r, r2, r3);
    }

    public static a89 b(int i, String str) {
        ha9 ha9 = r0;
        ha9 ha92 = new ha9((long) i, 0, 0, 0, ym.v.c().a.m(), ym.e().a(), 0, str, oa9.SENDING, qe9.ACTIVE, ym.v.c().a.m(), (String) null, (String) null, (w28) null, 0, 0, 0, (ha9) null, (String) null, (String) null, false, 0, 0, 2, 0, 0, (ha9) null, 0, 0, 0, 0, 0, (List) null, (xd9) null, (cl4) null);
        eaf.a().getClass();
        gb9 gb9 = (gb9) ((sjd) eaf.b()).getAccessor().g(gb9.class);
        gb9.getClass();
        return gb9.a(gb9, ha9);
    }

    public final void a(int i) {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.y.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.w, i});
        this.y = ofInt;
        ofInt.addUpdateListener(new z00(26, (Object) this));
        this.y.setDuration(300);
        this.y.start();
    }

    public final void c(scf scf, Uri uri, ef9 ef9) {
        ColorDrawable d = nf0.d(uri);
        SimpleDraweeView simpleDraweeView = this.b;
        if (d != null) {
            simpleDraweeView.setController((gv4) null);
            simpleDraweeView.setBackground(d);
            boolean z2 = true;
            int color = d.getColor();
            float[] fArr = new float[3];
            ThreadLocal threadLocal = w53.a;
            w53.a(Color.red(color), Color.green(color), Color.blue(color), fArr);
            if (fArr[2] >= 0.6f) {
                z2 = false;
            }
            d(scf, z2, ef9);
            return;
        }
        simpleDraweeView.setBackgroundColor(scf.y);
        d(scf, scf.c, ef9);
        knb a2 = ld9.p.get();
        a2.l = simpleDraweeView.getController();
        a2.c(uri);
        a2.h = new whf(this, scf, ef9);
        simpleDraweeView.setController(a2.a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e9, code lost:
        r9 = defpackage.oa9.SENT;
        r12 = r12.X;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.scf r23, boolean r24, defpackage.ef9 r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            le7 r4 = r0.o
            kg9 r5 = r4.H0
            r5.setDarkTheme(r2)
            le7 r5 = r0.v
            kg9 r6 = r5.H0
            ru.ok.messages.messages.widgets.layouts.OutgoingMessageLayout r6 = (ru.ok.messages.messages.widgets.layouts.OutgoingMessageLayout) r6
            r6.setDarkTheme(r2)
            gg9 r2 = r4.F0
            if (r2 == 0) goto L_0x001f
            r2.c(r1)
        L_0x001f:
            gg9 r2 = r5.F0
            if (r2 == 0) goto L_0x0026
            r2.c(r1)
        L_0x0026:
            w62 r2 = new w62
            r2.<init>()
            r6 = 1
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.util.Map r6 = java.util.Collections.singletonMap(r8, r6)
            r2.e = r6
            m72 r12 = new m72
            r12.<init>(r2)
            eaf r2 = defpackage.eaf.a()
            r2.getClass()
            z9f r2 = defpackage.eaf.b()
            sjd r2 = (defpackage.sjd) r2
            q4 r6 = r2.getAccessor()
            java.lang.Class<o82> r7 = defpackage.o82.class
            java.lang.Object r6 = r6.g(r7)
            r7 = r6
            o82 r7 = (defpackage.o82) r7
            r14 = 0
            r15 = 0
            r8 = 0
            r10 = 0
            r13 = 0
            a32 r6 = r7.a(r8, r10, r12, r13, r14, r15)
            km3 r2 = r2.i()
            r6.p0(r2)
            android.content.Context r2 = r22.getContext()
            int r7 = defpackage.qad.m9
            java.lang.String r2 = r2.getString(r7)
            r7 = -1
            a89 r2 = b(r7, r2)
            android.content.Context r7 = r22.getContext()
            int r8 = defpackage.qad.n9
            java.lang.String r7 = r7.getString(r8)
            r8 = -2
            a89 r7 = b(r8, r7)
            kg9 r8 = r4.H0
            gg9 r9 = r8.getMessageView()
            r9.setTextLayoutRepository(r3)
            of9 r9 = new of9
            r10 = 0
            r9.<init>(r2, r10)
            bt0 r11 = defpackage.bt0.a
            of9 r11 = r4.E0
            ha9 r12 = r2.a
            if (r11 == 0) goto L_0x00ab
            a89 r11 = r11.a
            ha9 r11 = r11.a
            long r13 = r11.b
            long r10 = r12.b
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
        L_0x00ab:
            r4.E0 = r9
            android.view.View r10 = r4.D0
            r11 = 0
            r10.setBackgroundColor(r11)
            gg9 r10 = r4.F0
            r10.setHighlighted(r11)
            gg9 r10 = r4.F0
            int r17 = r4.q()
            boolean r21 = r6.K()
            r20 = 1
            r16 = r10
            r18 = r6
            r19 = r9
            r16.f(r17, r18, r19, r20, r21)
            gg9 r9 = r4.F0
            r10 = 0
            r9.setSelected(r10)
            r8.b(r2)
            ru.ok.messages.views.widgets.TamAvatarView r9 = r8.w0
            r10 = 8
            if (r9 != 0) goto L_0x00dd
            goto L_0x00e0
        L_0x00dd:
            r9.setVisibility(r10)
        L_0x00e0:
            bl4 r9 = r12.S0
            boolean r9 = r9.b()
            r11 = 1
            if (r9 == 0) goto L_0x00f5
            oa9 r9 = defpackage.oa9.SENT
            oa9 r12 = r12.X
            if (r12 == r9) goto L_0x00f3
            oa9 r9 = defpackage.oa9.READ
            if (r12 != r9) goto L_0x00f5
        L_0x00f3:
            r9 = r11
            goto L_0x00f6
        L_0x00f5:
            r9 = 0
        L_0x00f6:
            a89 r12 = r2.b()
            if (r12 == 0) goto L_0x010b
            boolean r13 = r12.e()
            if (r13 != 0) goto L_0x0109
            ha9 r12 = r12.a
            int r12 = r12.T0
            r13 = 5
            if (r12 != r13) goto L_0x010b
        L_0x0109:
            r12 = r11
            goto L_0x010c
        L_0x010b:
            r12 = 0
        L_0x010c:
            if (r9 == 0) goto L_0x0118
            boolean r9 = r6.K()
            if (r9 != 0) goto L_0x0116
            if (r12 == 0) goto L_0x0118
        L_0x0116:
            r9 = r11
            goto L_0x0119
        L_0x0118:
            r9 = 0
        L_0x0119:
            r12 = 0
            if (r9 != 0) goto L_0x0122
            androidx.appcompat.widget.AppCompatImageView r13 = r8.y
            if (r13 != 0) goto L_0x0122
            goto L_0x01b6
        L_0x0122:
            androidx.appcompat.widget.AppCompatImageView r13 = r8.y
            if (r13 != 0) goto L_0x01a0
            androidx.appcompat.widget.AppCompatImageView r13 = r8.d()
            if (r13 == 0) goto L_0x0198
            int r14 = defpackage.lic.view_channel_forward__forward
            r13.setId(r14)
            boolean r14 = r13.isInEditMode()
            if (r14 == 0) goto L_0x013a
            vi4 r14 = defpackage.vi4.f0
            goto L_0x0144
        L_0x013a:
            android.content.Context r14 = r13.getContext()
            kotlin.Lazy r15 = defpackage.scf.b0
            scf r14 = defpackage.j4b.k0(r14)
        L_0x0144:
            int r14 = r14.r
            boolean r15 = r13.isInEditMode()
            if (r15 == 0) goto L_0x014f
            vi4 r15 = defpackage.vi4.f0
            goto L_0x0159
        L_0x014f:
            android.content.Context r15 = r13.getContext()
            kotlin.Lazy r16 = defpackage.scf.b0
            scf r15 = defpackage.j4b.k0(r15)
        L_0x0159:
            r15.getClass()
            r15 = 1055286886(0x3ee66666, float:0.45)
            int r14 = defpackage.j4b.l0(r15, r14)
            boolean r15 = r13.isInEditMode()
            if (r15 == 0) goto L_0x016c
            vi4 r15 = defpackage.vi4.f0
            goto L_0x0176
        L_0x016c:
            android.content.Context r15 = r13.getContext()
            kotlin.Lazy r16 = defpackage.scf.b0
            scf r15 = defpackage.j4b.k0(r15)
        L_0x0176:
            int r15 = r15.B
            android.graphics.drawable.RippleDrawable r14 = defpackage.i8b.J(r14, r15)
            r13.setBackground(r14)
            boolean r14 = r13.isInEditMode()
            if (r14 == 0) goto L_0x0188
            vi4 r14 = defpackage.vi4.f0
            goto L_0x0192
        L_0x0188:
            android.content.Context r14 = r13.getContext()
            kotlin.Lazy r15 = defpackage.scf.b0
            scf r14 = defpackage.j4b.k0(r14)
        L_0x0192:
            int r14 = r14.u
            r13.setColorFilter(r14)
            goto L_0x0199
        L_0x0198:
            r13 = r12
        L_0x0199:
            r8.y = r13
            boolean r13 = r8.A0
            r8.setDarkTheme(r13)
        L_0x01a0:
            androidx.appcompat.widget.AppCompatImageView r13 = r8.y
            if (r13 == 0) goto L_0x01ac
            jg9 r14 = new jg9
            r14.<init>((defpackage.kg9) r8, (defpackage.a89) r2)
            defpackage.ct.G(r13, 300, r14)
        L_0x01ac:
            androidx.appcompat.widget.AppCompatImageView r13 = r8.y
            if (r13 == 0) goto L_0x01b6
            if (r9 == 0) goto L_0x01b3
            r10 = 0
        L_0x01b3:
            r13.setVisibility(r10)
        L_0x01b6:
            r8.c(r2)
            r4.M(r11)
            gg9 r2 = r5.F0
            r2.setTextLayoutRepository(r3)
            of9 r2 = new of9
            r3 = 0
            r2.<init>(r7, r3)
            of9 r3 = r5.E0
            ha9 r4 = r7.a
            if (r3 == 0) goto L_0x01d7
            a89 r3 = r3.a
            ha9 r3 = r3.a
            long r8 = r3.b
            long r10 = r4.b
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
        L_0x01d7:
            r5.E0 = r2
            android.view.View r3 = r5.D0
            r8 = 0
            r3.setBackgroundColor(r8)
            gg9 r3 = r5.F0
            r3.setHighlighted(r8)
            gg9 r3 = r5.F0
            int r17 = r5.q()
            r20 = 0
            r21 = 0
            r16 = r3
            r18 = r6
            r19 = r2
            r16.f(r17, r18, r19, r20, r21)
            gg9 r2 = r5.F0
            r3 = 0
            r2.setSelected(r3)
            kg9 r2 = r5.H0
            ru.ok.messages.messages.widgets.layouts.OutgoingMessageLayout r2 = (ru.ok.messages.messages.widgets.layouts.OutgoingMessageLayout) r2
            r2.c(r7)
            r2.g(r4)
            r2.b(r7)
            r5.M(r3)
            int r2 = r1.u
            android.widget.TextView r3 = r0.c
            r3.setTextColor(r2)
            int r1 = r1.s
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            ro4 r2 = r0.a
            int r2 = r2.n
            android.graphics.drawable.GradientDrawable r1 = defpackage.i8b.O(r1, r12, r12, r2)
            r3.setBackground(r1)
            r22.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.settings.view.ThemePreviewView.d(scf, boolean, ef9):void");
    }

    public final void dispatchDraw(Canvas canvas) {
        Path path = this.x;
        path.reset();
        path.addRect((float) (getMeasuredWidth() - this.w), c44.DEFAULT_ASPECT_RATIO, (float) getMeasuredWidth(), (float) getMeasuredHeight(), Path.Direction.CW);
        int save = canvas.save();
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ViewGroup viewGroup = (ViewGroup) findViewById(lic.view_theme_preview__ll_messages);
        setMeasuredDimension(viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
    }
}
