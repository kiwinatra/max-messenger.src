package ru.ok.messages.media.attaches;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Lazy;
import ru.ok.messages.stickers.widgets.StickerView;

public class FileAttachView extends ConstraintLayout implements wx9 {
    public static final Typeface h1 = Typeface.create("sans-serif", 0);
    public static final Typeface i1 = Typeface.create("sans-serif", 1);
    public id3 E0;
    public ro4 F0;
    public o20 G0;
    public MessageAttachmentsLayout H0;
    public ViewStub I0;
    public ViewStub J0;
    public StickerView K0;
    public AppCompatTextView L0;
    public AppCompatTextView M0;
    public AppCompatTextView N0;
    public AppCompatImageView O0;
    public AppCompatImageView P0;
    public DraweeViewWithSensitiveWarningIcon Q0;
    public SimpleDraweeView R0;
    public AppCompatTextView S0;
    public AppCompatImageView T0;
    public a89 U0;
    public l20 V0;
    public il5 W0;
    public boolean X0;
    public ws0 Y0;
    public cud Z0;
    public xx9 a1;
    public scf b1;
    public iz c1;
    public Barrier d1;
    public ju8 e1;
    public ju8 f1;
    public View.OnLongClickListener g1;

    public FileAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        O();
    }

    public static void L(FileAttachView fileAttachView) {
        if (fileAttachView.N()) {
            xx9 musicAttachViewController = fileAttachView.getMusicAttachViewController();
            if (musicAttachViewController.c != null) {
                musicAttachViewController.getClass();
                if (!musicAttachViewController.a.c.p(0)) {
                    musicAttachViewController.b.z();
                }
                gg9 gg9 = (gg9) musicAttachViewController.c;
                w28 w28 = gg9.U0.a.a.x0;
                t3a t3a = gg9.b1;
                if (t3a != null) {
                    w28.F(0);
                    Iterator it = ((Set) ((l2a) t3a).a).iterator();
                    if (it.hasNext()) {
                        p99 p99 = ((k0a) it.next()).v;
                        p99.getClass();
                        p99.e.getClass();
                        r62.O();
                        throw null;
                    }
                }
            }
        } else if (ld8.Y(fileAttachView.V0) || fileAttachView.V0.n != d20.v) {
            fileAttachView.P(true, true);
        }
    }

    private xx9 getMusicAttachViewController() {
        if (!N()) {
            this.a1 = new xx9(this);
        }
        return this.a1;
    }

    private String getSubtitleForDownload() {
        long j = this.V0.t;
        if (j <= 0) {
            return getContext().getString(qad.x2);
        }
        return g63.i(ghf.x(this.V0.u, false, (Context) null), "/", ghf.w(ghf.m(j), this.V0.t, (Context) null, true));
    }

    private String getSubtitleForUpload() {
        l20 l20 = this.V0;
        if (l20.p <= c44.DEFAULT_ASPECT_RATIO) {
            return getContext().getString(qad.A2);
        }
        int m = ghf.m(l20.j.b);
        l20 l202 = this.V0;
        return g63.i(ghf.x((long) ((l202.p / 100.0f) * ((float) l202.j.b)), false, (Context) null), "/", ghf.w(m, this.V0.j.b, (Context) null, true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004c, code lost:
        r3 = (r3 = r7.j).d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0264  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M(defpackage.a32 r18, defpackage.a89 r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            iz r3 = r0.c1
            ha9 r4 = r1.a
            r3.a(r4)
            r0.U0 = r1
            ha9 r1 = r1.a
            w28 r1 = r1.x0
            g20 r3 = defpackage.g20.X
            l20 r1 = r1.I(r3)
            r0.V0 = r1
            r0.X0 = r2
            cud r1 = r0.Z0
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f83musicfilesenabled
            r5 = 0
            r1.m(r4, r5)
            l20 r1 = r0.V0
            s10 r1 = r1.j
            java.lang.String r1 = r1.c
            boolean r1 = defpackage.scf.f(r1, r5)
            l20 r4 = r0.V0
            boolean r4 = defpackage.ld8.Y(r4)
            l20 r6 = r0.V0
            boolean r6 = defpackage.ld8.W(r6)
            l20 r7 = r0.V0
            r8 = 1
            if (r7 == 0) goto L_0x0058
            g20 r9 = r7.a
            if (r9 == r3) goto L_0x0048
            goto L_0x0058
        L_0x0048:
            s10 r3 = r7.j
            if (r3 == 0) goto L_0x0058
            l20 r3 = r3.d
            if (r3 == 0) goto L_0x0058
            boolean r3 = r3.h()
            if (r3 == 0) goto L_0x0058
            r3 = r8
            goto L_0x0059
        L_0x0058:
            r3 = r5
        L_0x0059:
            scf r7 = r0.b1
            ws0 r2 = r7.c(r2)
            r0.Y0 = r2
            r2 = 8
            r7 = 2
            if (r3 != 0) goto L_0x007f
            if (r6 != 0) goto L_0x007f
            if (r4 != 0) goto L_0x007f
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r9 = r0.H0
            if (r9 == 0) goto L_0x0071
            r9.setVisibility(r2)
        L_0x0071:
            ru.ok.messages.stickers.widgets.StickerView r9 = r0.K0
            if (r9 == 0) goto L_0x0078
            r9.setVisibility(r2)
        L_0x0078:
            androidx.constraintlayout.widget.Barrier r9 = r0.d1
            r9.setMargin(r5)
            goto L_0x0119
        L_0x007f:
            androidx.constraintlayout.widget.Barrier r9 = r0.d1
            ro4 r10 = r0.F0
            int r10 = r10.j
            r9.setMargin(r10)
            if (r4 != 0) goto L_0x00c2
            if (r6 == 0) goto L_0x008d
            goto L_0x00c2
        L_0x008d:
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r9 = r0.H0
            if (r9 == 0) goto L_0x0094
            r9.setVisibility(r2)
        L_0x0094:
            ru.ok.messages.stickers.widgets.StickerView r9 = r0.K0
            if (r9 != 0) goto L_0x00a7
            android.view.ViewStub r9 = r0.J0
            android.view.View r9 = r9.inflate()
            ru.ok.messages.stickers.widgets.StickerView r9 = (ru.ok.messages.stickers.widgets.StickerView) r9
            r0.K0 = r9
            android.view.View$OnLongClickListener r10 = r0.g1
            r9.setOnLongClickListener(r10)
        L_0x00a7:
            ru.ok.messages.stickers.widgets.StickerView r9 = r0.K0
            r9.setVisibility(r5)
            ru.ok.messages.stickers.widgets.StickerView r9 = r0.K0
            a89 r10 = r0.U0
            ha9 r10 = r10.a
            s10 r10 = r10.g()
            l20 r10 = r10.d
            f20 r10 = r10.f
            boe r10 = defpackage.hd8.u(r10)
            r9.p(r10)
            goto L_0x0119
        L_0x00c2:
            ru.ok.messages.stickers.widgets.StickerView r9 = r0.K0
            if (r9 == 0) goto L_0x00c9
            r9.setVisibility(r2)
        L_0x00c9:
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r9 = r0.H0
            if (r9 != 0) goto L_0x00d7
            android.view.ViewStub r9 = r0.I0
            android.view.View r9 = r9.inflate()
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r9 = (ru.ok.messages.media.attaches.MessageAttachmentsLayout) r9
            r0.H0 = r9
        L_0x00d7:
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r9 = r0.H0
            ju8 r10 = r0.e1
            ju8 r11 = r0.f1
            p89 r12 = r9.v
            r12.L0 = r10
            r12.M0 = r11
            p89 r9 = r9.getView()
            il5 r10 = r0.W0
            r9.setAttachClickListener(r10)
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r9 = r0.H0
            p89 r9 = r9.getView()
            a89 r10 = r0.U0
            mc9 r10 = r10.c
            if (r10 == 0) goto L_0x00fe
            int r10 = r10.a
            if (r10 != r7) goto L_0x00fe
            r10 = r8
            goto L_0x00ff
        L_0x00fe:
            r10 = r5
        L_0x00ff:
            r9.setForwarded(r10)
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r9 = r0.H0
            p89 r9 = r9.getView()
            r9.setSenderVisible(r5)
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r9 = r0.H0
            r9.setVisibility(r5)
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r9 = r0.H0
            a89 r10 = r0.U0
            r11 = r18
            r9.a(r11, r10)
        L_0x0119:
            l20 r9 = r0.V0
            androidx.appcompat.widget.AppCompatTextView r10 = r0.L0
            android.text.TextUtils$TruncateAt r11 = android.text.TextUtils.TruncateAt.MIDDLE
            r10.setEllipsize(r11)
            androidx.appcompat.widget.AppCompatTextView r10 = r0.L0
            r10.getContext()
            s10 r9 = r9.j
            java.lang.String r9 = r9.c
            r10.setText(r9)
            l20 r9 = r0.V0
            r10 = 0
            if (r4 == 0) goto L_0x013e
            androidx.appcompat.widget.AppCompatTextView r9 = r0.S0
            r9.setVisibility(r2)
            androidx.appcompat.widget.AppCompatImageView r9 = r0.T0
            r9.setVisibility(r2)
            goto L_0x018b
        L_0x013e:
            if (r1 == 0) goto L_0x014b
            androidx.appcompat.widget.AppCompatTextView r9 = r0.S0
            r9.setVisibility(r2)
            androidx.appcompat.widget.AppCompatImageView r9 = r0.T0
            r9.setVisibility(r2)
            goto L_0x018b
        L_0x014b:
            a89 r11 = r0.U0
            boolean r11 = defpackage.ld8.g0(r9, r11)
            if (r11 != 0) goto L_0x0181
            androidx.appcompat.widget.AppCompatTextView r11 = r0.S0
            r11.setVisibility(r5)
            if (r9 != 0) goto L_0x015c
            r11 = r10
            goto L_0x0162
        L_0x015c:
            s10 r11 = r9.j
            java.lang.String r11 = defpackage.ld8.J(r11)
        L_0x0162:
            if (r11 == 0) goto L_0x0174
            androidx.appcompat.widget.AppCompatTextView r11 = r0.S0
            if (r9 != 0) goto L_0x016a
            r9 = r10
            goto L_0x0170
        L_0x016a:
            s10 r9 = r9.j
            java.lang.String r9 = defpackage.ld8.J(r9)
        L_0x0170:
            r11.setText(r9)
            goto L_0x017b
        L_0x0174:
            androidx.appcompat.widget.AppCompatTextView r9 = r0.S0
            java.lang.String r11 = "FILE"
            r9.setText(r11)
        L_0x017b:
            androidx.appcompat.widget.AppCompatImageView r9 = r0.T0
            r9.setVisibility(r2)
            goto L_0x018b
        L_0x0181:
            androidx.appcompat.widget.AppCompatTextView r9 = r0.S0
            r9.setVisibility(r2)
            androidx.appcompat.widget.AppCompatImageView r9 = r0.T0
            r9.setVisibility(r2)
        L_0x018b:
            l20 r9 = r0.V0
            if (r4 != 0) goto L_0x0297
            if (r6 != 0) goto L_0x0297
            if (r3 == 0) goto L_0x0195
            goto L_0x0297
        L_0x0195:
            com.facebook.drawee.view.SimpleDraweeView r3 = r0.R0
            lv4 r3 = r3.getHierarchy()
            sp6 r3 = (defpackage.sp6) r3
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            ws0 r6 = r0.Y0
            qs0 r6 = r6.a
            int r6 = r6.i
            r4.<init>(r6)
            r3.i(r4, r8)
            r3 = 4
            if (r1 == 0) goto L_0x01cf
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r4 = r0.Q0
            r4.setVisibility(r5)
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r4 = r0.Q0
            lv4 r4 = r4.getHierarchy()
            sp6 r4 = (defpackage.sp6) r4
            android.content.Context r6 = r17.getContext()
            int r7 = defpackage.nad.C2
            android.graphics.drawable.Drawable r6 = defpackage.ew3.b(r6, r7)
            r4.i(r6, r8)
            com.facebook.drawee.view.SimpleDraweeView r4 = r0.R0
            r4.setVisibility(r3)
            goto L_0x029c
        L_0x01cf:
            com.facebook.drawee.view.SimpleDraweeView r4 = r0.R0
            r4.setVisibility(r5)
            a89 r4 = r0.U0
            boolean r4 = defpackage.ld8.g0(r9, r4)
            id3 r6 = r0.E0
            qra r6 = (defpackage.qra) r6
            q4 r6 = r6.getAccessor()
            java.lang.Class<nb9> r11 = defpackage.nb9.class
            java.lang.Object r6 = r6.g(r11)
            nb9 r6 = (defpackage.nb9) r6
            s10 r11 = r9.j
            r6.getClass()
            l20 r6 = r11.d
            if (r6 == 0) goto L_0x020a
            g20 r11 = r6.a
            int r11 = r11.ordinal()
            if (r11 == r7) goto L_0x0204
            r7 = 3
            if (r11 == r7) goto L_0x01ff
            goto L_0x020a
        L_0x01ff:
            k20 r6 = r6.d
            java.lang.String r6 = r6.c
            goto L_0x0226
        L_0x0204:
            x10 r6 = r6.b
            boolean r7 = r6.v
            if (r7 == 0) goto L_0x020c
        L_0x020a:
            r6 = r10
            goto L_0x0226
        L_0x020c:
            java.lang.String r7 = r6.b
            boolean r11 = defpackage.cvg.A(r7)
            if (r11 != 0) goto L_0x0216
            r6 = r7
            goto L_0x0226
        L_0x0216:
            java.lang.String r6 = r6.a
            boolean r7 = defpackage.cvg.A(r6)
            if (r7 != 0) goto L_0x020a
            kl0 r7 = defpackage.kl0.b
            jl0 r11 = defpackage.jl0.a
            java.lang.String r6 = defpackage.cjf.A(r6, r7, r11)
        L_0x0226:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0264
            o20 r6 = r0.G0
            android.graphics.drawable.BitmapDrawable r4 = r6.b(r9, r4)
            if (r4 == 0) goto L_0x025e
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r6 = r0.Q0
            r6.setVisibility(r3)
            com.facebook.drawee.view.SimpleDraweeView r3 = r0.R0
            lv4 r3 = r3.getHierarchy()
            sp6 r3 = (defpackage.sp6) r3
            ydd r6 = defpackage.ydd.m
            r3.i(r4, r8)
            vdd r3 = r3.f(r8)
            xdd r4 = r3.v
            boolean r4 = defpackage.hsg.k(r4, r6)
            if (r4 == 0) goto L_0x0253
            goto L_0x029c
        L_0x0253:
            r3.v = r6
            r3.w = r10
            r3.p()
            r3.invalidateSelf()
            goto L_0x029c
        L_0x025e:
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r4 = r0.Q0
            r4.setVisibility(r3)
            goto L_0x029c
        L_0x0264:
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r3 = r0.Q0
            r3.setVisibility(r5)
            s10 r3 = r9.j
            l20 r3 = r3.d
            a89 r4 = r0.U0
            boolean r3 = defpackage.ld8.g0(r3, r4)
            android.content.Context r11 = r17.getContext()
            android.net.Uri r12 = defpackage.po5.s(r6)
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r4 = r0.Q0
            gv4 r13 = r4.getController()
            ro4 r4 = r0.F0
            int r15 = r4.E
            r14 = r15
            r16 = r3
            jnb r4 = defpackage.ryg.q(r11, r12, r13, r14, r15, r16)
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r6 = r0.Q0
            r6.setNeedToDrawSensitiveWarningIcon(r3)
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r3 = r0.Q0
            r3.setController(r4)
            goto L_0x029c
        L_0x0297:
            com.facebook.drawee.view.SimpleDraweeView r3 = r0.R0
            r3.setVisibility(r2)
        L_0x029c:
            l20 r3 = r0.V0
            d20 r3 = r3.n
            boolean r3 = r3.d()
            r6 = 0
            if (r3 == 0) goto L_0x02f0
            androidx.appcompat.widget.AppCompatImageView r3 = r0.O0
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            boolean r3 = r3 instanceof defpackage.r20
            if (r3 != 0) goto L_0x02d7
            r20 r3 = new r20
            android.content.Context r4 = r17.getContext()
            r3.<init>(r4)
            ws0 r4 = r0.Y0
            qs0 r4 = r4.a
            int r4 = r4.g
            android.graphics.Paint r5 = r3.m
            r5.setColor(r4)
            r3.l = r8
            ws0 r4 = r0.Y0
            r3.d(r4)
            androidx.appcompat.widget.AppCompatImageView r4 = r0.O0
            r4.setImageDrawable(r3)
            androidx.appcompat.widget.AppCompatImageView r3 = r0.O0
            r3.setBackground(r10)
        L_0x02d7:
            androidx.appcompat.widget.AppCompatImageView r3 = r0.O0
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            l20 r4 = r0.V0
            float r4 = r4.p
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.setLevel(r4)
            androidx.appcompat.widget.AppCompatImageView r3 = r0.O0
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_XY
            r3.setScaleType(r4)
            goto L_0x035b
        L_0x02f0:
            l20 r3 = r0.V0
            d20 r3 = r3.n
            boolean r3 = r3.c()
            l20 r4 = r0.V0
            s10 r4 = r4.j
            long r11 = r4.a
            int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x0307
            boolean r4 = r0.X0
            if (r4 != 0) goto L_0x0307
            r5 = r8
        L_0x0307:
            if (r3 != 0) goto L_0x0314
            if (r5 == 0) goto L_0x030c
            goto L_0x0314
        L_0x030c:
            androidx.appcompat.widget.AppCompatImageView r3 = r0.O0
            int r4 = defpackage.cad.w0
            r3.setImageResource(r4)
            goto L_0x031b
        L_0x0314:
            androidx.appcompat.widget.AppCompatImageView r3 = r0.O0
            int r4 = defpackage.cad.y0
            r3.setImageResource(r4)
        L_0x031b:
            androidx.appcompat.widget.AppCompatImageView r3 = r0.O0
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            if (r3 != 0) goto L_0x0354
            androidx.appcompat.widget.AppCompatImageView r3 = r0.O0
            ws0 r4 = r0.Y0
            qs0 r4 = r4.a
            int r4 = r4.g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.graphics.drawable.GradientDrawable r4 = defpackage.i8b.K(r4, r10, r10)
            ws0 r5 = r0.Y0
            qs0 r5 = r5.a
            int r5 = r5.g
            scf r9 = r0.b1
            r9.getClass()
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            int r5 = defpackage.j4b.l0(r9, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.graphics.drawable.GradientDrawable r5 = defpackage.i8b.K(r5, r10, r10)
            android.graphics.drawable.StateListDrawable r4 = defpackage.i8b.T(r4, r5, r10)
            r3.setBackground(r4)
        L_0x0354:
            androidx.appcompat.widget.AppCompatImageView r3 = r0.O0
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER
            r3.setScaleType(r4)
        L_0x035b:
            ws0 r3 = r0.Y0
            zs0 r3 = r3.b
            int r3 = r3.e
            androidx.appcompat.widget.AppCompatTextView r3 = r0.N0
            r3.setVisibility(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = r0.S0
            ws0 r3 = r0.Y0
            xs0 r3 = r3.c
            int r3 = r3.f
            r2.setTextColor(r3)
            androidx.appcompat.widget.AppCompatTextView r2 = r0.L0
            ws0 r3 = r0.Y0
            zs0 r3 = r3.b
            int r3 = r3.d
            r2.setTextColor(r3)
            androidx.appcompat.widget.AppCompatImageView r2 = r0.O0
            js9 r3 = defpackage.fu4.k
            android.content.Context r4 = r17.getContext()
            fu4 r3 = r3.e(r4)
            k2b r3 = r3.f()
            hq2 r3 = r3.a()
            ws0 r3 = r3.a(r8)
            xs0 r3 = r3.c
            int r3 = r3.a
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r2.setImageTintList(r3)
            l20 r2 = r0.V0
            d20 r2 = r2.n
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x03cd
            ws0 r1 = r0.Y0
            zs0 r1 = r1.b
            int r1 = r1.e
            l20 r2 = r0.V0
            s10 r2 = r2.j
            long r2 = r2.a
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x03be
            java.lang.String r2 = r17.getSubtitleForDownload()
            goto L_0x03c2
        L_0x03be:
            java.lang.String r2 = r17.getSubtitleForUpload()
        L_0x03c2:
            androidx.appcompat.widget.AppCompatTextView r3 = r0.M0
            r3.setTextColor(r1)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.M0
            r1.setText(r2)
            goto L_0x03f9
        L_0x03cd:
            ws0 r2 = r0.Y0
            zs0 r2 = r2.b
            int r2 = r2.e
            androidx.appcompat.widget.AppCompatTextView r3 = r0.M0
            r3.setTextColor(r2)
            if (r1 == 0) goto L_0x03ea
            androidx.appcompat.widget.AppCompatTextView r1 = r0.M0
            android.content.Context r2 = r1.getContext()
            int r3 = defpackage.qad.X9
            java.lang.String r2 = r2.getString(r3)
            r1.setText(r2)
            goto L_0x03f9
        L_0x03ea:
            androidx.appcompat.widget.AppCompatTextView r1 = r0.M0
            l20 r2 = r0.V0
            s10 r2 = r2.j
            long r2 = r2.b
            java.lang.String r2 = defpackage.ghf.x(r2, r8, r10)
            r1.setText(r2)
        L_0x03f9:
            boolean r1 = r17.N()
            if (r1 == 0) goto L_0x0408
            xx9 r1 = r17.getMusicAttachViewController()
            r1.getClass()
            r0.a1 = r10
        L_0x0408:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.FileAttachView.M(a32, a89, boolean):void");
    }

    public final boolean N() {
        return this.a1 != null;
    }

    public final void O() {
        this.E0 = ym.e();
        getContext();
        this.F0 = ro4.b();
        this.G0 = ((qra) this.E0).h();
        this.Z0 = ((qra) this.E0).y().b;
        nb9 nb9 = (nb9) ((qra) this.E0).getAccessor().g(nb9.class);
        Context context = getContext();
        Lazy lazy = scf.b0;
        this.b1 = j4b.k0(context);
        this.c1 = (iz) ((sjd) tr1.h((qra) this.E0)).getAccessor().g(iz.class);
        ViewStub viewStub = new ViewStub(getContext());
        this.I0 = viewStub;
        viewStub.setId(lic.view_file_attach__attachments);
        this.I0.setInflatedId(lic.view_file_attach__attachments);
        this.I0.setLayoutResource(ujc.ll_view_file_attach__message_attachments_layout_view);
        fj3 fj3 = new fj3(-2, -2);
        fj3.i = 0;
        fj3.t = 0;
        fj3.v = 0;
        int i = this.F0.j;
        fj3.rightMargin = i;
        fj3.leftMargin = i;
        fj3.W = true;
        addView(this.I0, fj3);
        this.J0 = new ViewStub(getContext());
        fj3 fj32 = new fj3(-2, -2);
        this.J0.setId(lic.view_file_attach__sticker);
        this.J0.setInflatedId(lic.view_file_attach__sticker);
        this.J0.setLayoutResource(ujc.ll_view_file_attach__sticker_view);
        fj32.i = 0;
        fj32.t = 0;
        fj32.v = 0;
        addView(this.J0, fj32);
        Barrier barrier = new Barrier(getContext());
        this.d1 = barrier;
        barrier.setId(lic.view_file_attach__big_preview_barrier);
        this.d1.setType(3);
        this.d1.setReferencedIds(new int[]{lic.view_file_attach__attachments, lic.view_file_attach__sticker});
        addView(this.d1, new fj3(-2, -2));
        int i2 = this.F0.z;
        fj3 fj33 = new fj3(i2, i2);
        fj33.j = lic.view_file_attach__big_preview_barrier;
        fj33.l = 0;
        fj33.t = 0;
        fj33.setMarginStart(this.F0.j);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.R0 = simpleDraweeView;
        simpleDraweeView.setId(lic.view_file_attach__iv_bg);
        b9d b9d = new b9d();
        float[] fArr = new float[8];
        b9d.c = fArr;
        Arrays.fill(fArr, (float) this.F0.k);
        ((sp6) this.R0.getHierarchy()).n(b9d);
        this.R0.setClickable(false);
        addView(this.R0, fj33);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.S0 = appCompatTextView;
        appCompatTextView.setGravity(17);
        this.S0.setTypeface(i1);
        this.S0.setTextSize(0, this.F0.S);
        this.S0.setTextColor(this.b1.t);
        AppCompatTextView appCompatTextView2 = this.S0;
        int i3 = this.F0.b;
        appCompatTextView2.setPadding(i3, i3, i3, i3);
        this.S0.setMaxLines(1);
        AppCompatTextView appCompatTextView3 = this.S0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
        appCompatTextView3.setEllipsize(truncateAt);
        this.S0.setAllCaps(true);
        fj3 fj34 = new fj3(0, 0);
        int i4 = lic.view_file_attach__iv_bg;
        fj34.i = i4;
        fj34.t = i4;
        fj34.v = i4;
        fj34.l = i4;
        addView(this.S0, fj34);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.T0 = appCompatImageView;
        appCompatImageView.setImageDrawable(ew3.b(getContext(), nad.w1));
        fj3 fj35 = new fj3(-2, -2);
        int i5 = lic.view_file_attach__iv_bg;
        fj35.i = i5;
        fj35.t = i5;
        fj35.v = i5;
        fj35.l = i5;
        addView(this.T0, fj35);
        DraweeViewWithSensitiveWarningIcon draweeViewWithSensitiveWarningIcon = new DraweeViewWithSensitiveWarningIcon(getContext());
        this.Q0 = draweeViewWithSensitiveWarningIcon;
        ((sp6) draweeViewWithSensitiveWarningIcon.getHierarchy()).h(ydd.m);
        b9d b9d2 = new b9d();
        float[] fArr2 = new float[8];
        b9d2.c = fArr2;
        Arrays.fill(fArr2, (float) this.F0.f);
        ((sp6) this.Q0.getHierarchy()).n(b9d2);
        this.Q0.setClickable(false);
        fj3 fj36 = new fj3(0, 0);
        int i6 = lic.view_file_attach__iv_bg;
        fj36.i = i6;
        fj36.t = i6;
        fj36.v = i6;
        fj36.l = i6;
        addView(this.Q0, fj36);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.P0 = appCompatImageView2;
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER);
        fj3 fj37 = new fj3(-2, -2);
        int i7 = lic.view_file_attach__iv_bg;
        fj37.i = i7;
        fj37.t = i7;
        fj37.v = i7;
        fj37.l = i7;
        ct.G(this.P0, 800, new hl5(this, 0));
        addView(this.P0, fj37);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.L0 = appCompatTextView4;
        appCompatTextView4.setId(lic.view_file_attach__tv_title);
        AppCompatTextView appCompatTextView5 = this.L0;
        int i8 = this.F0.j;
        WeakHashMap weakHashMap = gag.a;
        appCompatTextView5.setPaddingRelative(i8, 0, i8, 0);
        AppCompatTextView appCompatTextView6 = this.L0;
        Typeface typeface = h1;
        appCompatTextView6.setTypeface(typeface);
        this.L0.setSingleLine();
        this.L0.setTextSize(0, this.F0.T);
        this.L0.setEllipsize(truncateAt);
        this.L0.setTextColor(this.b1.G);
        this.L0.setIncludeFontPadding(false);
        fj3 fj38 = new fj3(0, -2);
        int i9 = lic.view_file_attach__iv_bg;
        fj38.i = i9;
        fj38.s = i9;
        fj38.u = lic.view_file_attach__btn_load;
        fj38.k = lic.view_file_attach__tv_subtitle;
        fj38.L = 1;
        fj38.K = 2;
        fj38.E = c44.DEFAULT_ASPECT_RATIO;
        fj38.x = this.F0.j;
        fj38.topMargin = 0;
        addView(this.L0, fj38);
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.M0 = appCompatTextView7;
        appCompatTextView7.setId(lic.view_file_attach__tv_subtitle);
        AppCompatTextView appCompatTextView8 = this.M0;
        int i10 = this.F0.j;
        appCompatTextView8.setPaddingRelative(i10, 0, i10, 0);
        this.M0.setTypeface(typeface);
        this.M0.setSingleLine();
        this.M0.setTextSize(0, this.F0.T);
        AppCompatTextView appCompatTextView9 = this.M0;
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        appCompatTextView9.setEllipsize(truncateAt2);
        this.M0.setTextColor(this.b1.w);
        this.M0.setIncludeFontPadding(false);
        fj3 fj39 = new fj3(0, -2);
        fj39.j = lic.view_file_attach__tv_title;
        fj39.s = lic.view_file_attach__iv_bg;
        fj39.u = lic.view_file_attach__btn_load;
        fj39.k = lic.view_file_attach__tv_duration;
        fj39.L = 1;
        fj39.E = c44.DEFAULT_ASPECT_RATIO;
        addView(this.M0, fj39);
        AppCompatTextView appCompatTextView10 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.N0 = appCompatTextView10;
        appCompatTextView10.setId(lic.view_file_attach__tv_duration);
        AppCompatTextView appCompatTextView11 = this.N0;
        int i11 = this.F0.j;
        appCompatTextView11.setPaddingRelative(i11, 0, i11, 0);
        this.N0.setTypeface(typeface);
        this.N0.setSingleLine();
        this.N0.setTextSize(0, this.F0.S);
        this.N0.setEllipsize(truncateAt2);
        this.N0.setTextColor(this.b1.w);
        this.N0.setVisibility(8);
        fj3 fj310 = new fj3(0, -2);
        fj310.j = lic.view_file_attach__tv_subtitle;
        int i12 = lic.view_file_attach__iv_bg;
        fj310.s = i12;
        fj310.u = lic.view_file_attach__btn_load;
        fj310.l = i12;
        fj310.L = 1;
        fj310.E = c44.DEFAULT_ASPECT_RATIO;
        addView(this.N0, fj310);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.O0 = appCompatImageView3;
        appCompatImageView3.setId(lic.view_file_attach__btn_load);
        this.O0.setScaleType(ImageView.ScaleType.FIT_XY);
        this.O0.setImageTintList(ColorStateList.valueOf(fu4.k.e(getContext()).f().a().a(true).c.a));
        int i13 = this.F0.w;
        fj3 fj311 = new fj3(i13, i13);
        fj311.j = lic.view_file_attach__big_preview_barrier;
        fj311.v = 0;
        fj311.setMarginEnd(this.F0.f);
        ct.G(this.O0, 800, new hl5(this, 1));
        addView(this.O0, fj311);
        y64.n(this, new b5(11, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r10 = (defpackage.gg9) r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P(boolean r11, boolean r12) {
        /*
            r10 = this;
            il5 r10 = r10.W0
            if (r10 == 0) goto L_0x003f
            gg9 r10 = (defpackage.gg9) r10
            t3a r0 = r10.b1
            if (r0 == 0) goto L_0x003f
            of9 r10 = r10.U0
            a89 r10 = r10.a
            ha9 r1 = r10.a
            w28 r1 = r1.x0
            g20 r2 = defpackage.g20.X
            l20 r9 = r1.I(r2)
            l2a r0 = (defpackage.l2a) r0
            java.lang.Object r0 = r0.a
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003f
            java.lang.Object r1 = r0.next()
            k0a r1 = (defpackage.k0a) r1
            n99 r1 = r1.b
            ll5 r2 = r1.v0
            ru.ok.messages.views.fragments.base.FrgBase r4 = r1.w
            r7 = 1
            r8 = 0
            r1 = r2
            r2 = r10
            r3 = r9
            r5 = r11
            r6 = r12
            r1.P(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0022
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.FileAttachView.P(boolean, boolean):void");
    }

    public p89 getMessageAttachmentsView() {
        if (this.H0 == null) {
            this.H0 = (MessageAttachmentsLayout) this.I0.inflate();
        }
        return this.H0.getView();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (N()) {
            xx9 musicAttachViewController = getMusicAttachViewController();
            getContext();
            if (musicAttachViewController.d) {
                musicAttachViewController.getClass();
                if (0 != 0) {
                    musicAttachViewController.getClass();
                }
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (N()) {
            getMusicAttachViewController().d = true;
        }
    }

    public void setArtistName(CharSequence charSequence) {
        this.M0.setVisibility(0);
        this.M0.setText(charSequence);
    }

    public void setDurationText(String str) {
        this.N0.setText(str);
    }

    public void setListener(il5 il5) {
        this.W0 = il5;
        if (N()) {
            this.a1.c = il5;
        }
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        StickerView stickerView = this.K0;
        if (stickerView != null) {
            stickerView.setOnLongClickListener(onLongClickListener);
        }
        this.g1 = onLongClickListener;
    }

    public void setPipRequestListener(o89 o89) {
        getMessageAttachmentsView().setPipRequestListener(o89);
    }

    public void setPlayButtonPauseSelector(boolean z) {
        this.P0.setImageDrawable(iq.E(cad.K0, this.Y0.c.f, getContext()));
    }

    public void setPlayButtonPlaySelector(boolean z) {
        this.P0.setImageDrawable(iq.E(cad.O0, this.Y0.c.f, getContext()));
    }

    public void setPlayButtonPreview(String str) {
    }

    public void setTrackName(CharSequence charSequence) {
        this.L0.setText(charSequence);
    }

    public final void z() {
        r20 r20 = new r20(getContext());
        r20.m.setColor(0);
        r20.c = this.F0.A;
        r20.d = true;
        r20.d(this.Y0);
        this.P0.setImageDrawable(r20);
    }
}
