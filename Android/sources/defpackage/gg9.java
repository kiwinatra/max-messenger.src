package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.reflect.KProperty;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.attaches.FileAttachView;
import ru.ok.messages.media.attaches.MessageAttachmentsLayout;
import ru.ok.messages.media.attaches.ShareAttachView;
import ru.ok.messages.media.attaches.ShareMediaView;
import ru.ok.messages.secret.widgets.TimerView;
import ru.ok.messages.stickers.widgets.StickerView;

/* renamed from: gg9  reason: default package */
public final class gg9 extends ViewGroup implements View.OnLongClickListener, l89, ee9, x4e, kb9, x20, j01, il5, fl3, m89, p58, ue9, ny7, jrc {
    public static final int p1 = ((int) ym.v.getResources().getDimension(ydc.message_min_width_contact_content));
    public final int A0;
    public final int B0;
    public final AppCompatTextView C0;
    public final lf9 D0;
    public final LinearLayout E0;
    public final AppCompatImageView F0;
    public final AppCompatTextView G0;
    public AppCompatImageView H0;
    public final MessageAttachmentsLayout I0;
    public AudioAttachView J0;
    public FileAttachView K0;
    public gl3 L0;
    public ve9 M0;
    public ShareAttachView N0;
    public l01 O0;
    public lb9 P0;
    public fe9 Q0;
    public z12 R0;
    public TimerView S0;
    public q58 T0;
    public of9 U0;
    public a32 V0;
    public boolean W0;
    public boolean X0;
    public bt0 Y0;
    public a93 Z0;
    public final ro4 a;
    public ws0 a1;
    public final taf b;
    public t3a b1;
    public final int c;
    public int c1;
    public final GradientDrawable d1;
    public scf e1;
    public final AppCompatTextView f1;
    public final AppCompatTextView g1;
    public hk h1;
    public ju8 i1;
    public ju8 j1;
    public ju8 k1;
    public gb8 l1;
    public a30 m1;
    public ef9 n1;
    public final int o;
    public int o1 = 0;
    public final int v;
    public final int v0;
    public final int w;
    public final int w0;
    public final int x;
    public final int x0;
    public final int y;
    public final int y0;
    public final int z;
    public final int z0;

    static {
        ym.v.getResources().getDimension(ydc.message_min_width);
    }

    /* JADX WARNING: type inference failed for: r4v33, types: [ru.ok.messages.media.attaches.MessageAttachmentsLayout, android.view.View, android.view.ViewGroup] */
    public gg9(Context context) {
        super(context, (AttributeSet) null, 0);
        getContext();
        ro4 b2 = ro4.b();
        this.a = b2;
        this.b = (taf) ((qra) ym.e()).getAccessor().g(taf.class);
        this.c = b2.g;
        this.o = b2.j;
        this.v = b2.p;
        this.w = b2.r;
        this.x = b2.k;
        this.y = b2.i;
        this.z = b2.f;
        this.v0 = b2.h;
        this.w0 = vo4.b((int) 2.0f);
        this.x0 = vo4.b((int) 6.0f);
        this.y0 = vo4.b((int) 254.0f);
        this.z0 = vo4.b((int) 240.0f);
        this.A0 = vo4.b((int) 150.0f);
        this.B0 = vo4.b((int) 128.0f);
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        this.e1 = j4b.k0(context2);
        ? viewGroup = new ViewGroup(getContext());
        viewGroup.b();
        this.I0 = viewGroup;
        addView(viewGroup);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.C0 = appCompatTextView;
        appCompatTextView.setId(lic.message_sender);
        this.C0.setIncludeFontPadding(false);
        this.C0.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.C0.setMaxLines(1);
        AppCompatTextView appCompatTextView2 = this.C0;
        int i = b2.k;
        appCompatTextView2.setPadding(i, 0, i, 0);
        this.C0.setTextSize(2, 14.0f);
        cvg.x(this.C0).b();
        this.C0.setEllipsize(TextUtils.TruncateAt.END);
        this.C0.setSingleLine(true);
        addView(this.C0);
        lf9 lf9 = new lf9(getContext(), 0);
        this.D0 = lf9;
        lf9.setId(lic.message_text);
        lf9 lf92 = this.D0;
        int i2 = b2.k;
        lf92.setPadding(i2, 0, i2, 0);
        this.D0.setLinkListener(this);
        this.D0.setTextAlignment(5);
        addView(this.D0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.E0 = linearLayout;
        linearLayout.setId(lic.message_date_layout);
        this.E0.setOrientation(0);
        this.E0.setGravity(80);
        addView(this.E0);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.f1 = appCompatTextView3;
        appCompatTextView3.setPadding(0, 0, b2.d, 0);
        this.f1.setMaxLines(1);
        this.f1.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.E0.addView(this.f1, layoutParams);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.g1 = appCompatTextView4;
        appCompatTextView4.setId(lic.message_date_separator);
        this.g1.setTextSize(2, 12.0f);
        this.g1.setText("•");
        this.g1.setPadding(0, 0, b2.b, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        this.E0.addView(this.g1, layoutParams2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.F0 = appCompatImageView;
        appCompatImageView.setId(lic.message_edit);
        this.F0.setPadding(0, 0, b2.b, b2.a);
        this.F0.setImageResource(nad.f0);
        this.E0.addView(this.F0, new LinearLayout.LayoutParams(-2, -2));
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.G0 = appCompatTextView5;
        appCompatTextView5.setId(lic.message_date);
        this.G0.setMaxLines(1);
        this.G0.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        this.E0.addView(this.G0, layoutParams3);
        c(this.e1);
        this.d1 = i8b.O(Integer.valueOf(this.e1.s), (Integer) null, (Integer) null, b2.n);
        this.D0.setOnLongClickListener(this);
        this.D0.setSingleClickAction(new zf9(this, 0));
        this.D0.setTryToSingleClickAction(new zf9(this, 1));
        ct.G(this.C0, 300, new ag9(this, 0));
        this.C0.setOnLongClickListener(this);
        ct.G(this.f1, 300, new ag9(this, 1));
        ct.G(this.G0, 300, new ag9(this, 2));
    }

    private void setSenderTextColor(a89 a89) {
        if (a89.b.n() != 0) {
            this.C0.setTextColor(this.a1.b.h);
        } else {
            this.C0.setTextColor(this.a1.b.g);
        }
    }

    public final void A(ju8 ju8, ju8 ju82, ju8 ju83) {
        this.i1 = ju8;
        this.j1 = ju82;
        this.k1 = ju83;
        p89 p89 = this.I0.v;
        p89.L0 = ju8;
        p89.M0 = ju82;
        FileAttachView fileAttachView = this.K0;
        if (fileAttachView != null) {
            fileAttachView.e1 = ju8;
            fileAttachView.f1 = ju82;
        }
        ShareAttachView shareAttachView = this.N0;
        if (shareAttachView != null) {
            shareAttachView.B0 = ju83;
            ShareMediaView shareMediaView = shareAttachView.w0;
            shareMediaView.L0 = ju8;
            shareMediaView.M0 = ju82;
        }
        ve9 ve9 = this.M0;
        if (ve9 != null) {
            ve9.setStickerMediaPlayerController(ju83);
        }
    }

    public final void B(View view) {
        MessageAttachmentsLayout messageAttachmentsLayout = this.I0;
        if (view != messageAttachmentsLayout) {
            messageAttachmentsLayout.setVisibility(8);
        }
        ve9 ve9 = this.M0;
        if (!(view == ve9 || ve9 == null)) {
            ve9.setVisibility(8);
        }
        AudioAttachView audioAttachView = this.J0;
        if (!(view == audioAttachView || audioAttachView == null)) {
            audioAttachView.setVisibility(8);
        }
        ShareAttachView shareAttachView = this.N0;
        if (!(view == shareAttachView || shareAttachView == null)) {
            shareAttachView.setVisibility(8);
        }
        l01 l01 = this.O0;
        if (!(view == l01 || l01 == null)) {
            l01.setVisibility(8);
        }
        FileAttachView fileAttachView = this.K0;
        if (!(view == fileAttachView || fileAttachView == null)) {
            fileAttachView.setVisibility(8);
        }
        gl3 gl3 = this.L0;
        if (!(view == gl3 || gl3 == null)) {
            gl3.setVisibility(8);
        }
        q58 q58 = this.T0;
        if (!(view == q58 || q58 == null)) {
            q58.setVisibility(8);
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void X(String str, sy7 sy7, ClickableSpan clickableSpan, View view) {
    }

    public final void Z0(ta9 ta9) {
    }

    public final void a() {
        if (this.b1 != null) {
            a89 a89 = this.U0.a;
        }
    }

    public final void b(l20 l20, View view) {
        t3a t3a = this.b1;
        if (t3a != null) {
            a89 a89 = this.U0.a;
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

    public final void c(scf scf) {
        jf9 jf9;
        this.e1 = scf;
        lf9 lf9 = this.D0;
        Layout layout = lf9.getLayout();
        if (!(layout == null || layout.getPaint().getColor() == scf.l || (jf9 = lf9.z0) == null)) {
            jf9.c.a(jf9, gf9.a);
        }
        Drawable background = getBackground();
        if (background instanceof r89) {
            r89 r89 = (r89) background;
            int[] iArr = scf.i.a.l;
            r89.getClass();
            KProperty[] kPropertyArr = r89.z;
            r89.v.setValue(r89, kPropertyArr[0], iArr);
            int[] iArr2 = scf.h.a.l;
            r89.w.setValue(r89, kPropertyArr[1], iArr2);
            r89.h = this.a1.d.b;
        }
    }

    /* JADX WARNING: type inference failed for: r1v23, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup, gl3] */
    /* JADX WARNING: type inference failed for: r3v31, types: [android.widget.FrameLayout, ru.ok.messages.media.attaches.ShareAttachView] */
    /* JADX WARNING: type inference failed for: r2v105, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, ru.ok.messages.media.attaches.FileAttachView] */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x070e, code lost:
        if (r1.w.m.h == r3.h) goto L_0x0721;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014f, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3 != null ? java.lang.Long.valueOf(r3.a) : null) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(int r21, defpackage.of9 r22, boolean r23, boolean r24) {
        /*
            r20 = this;
            r6 = r20
            r0 = r22
            r1 = r23
            r2 = 8
            r3 = 6
            r4 = 0
            r5 = 2
            r7 = 1
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r8 = r6.I0
            p89 r9 = r8.getView()
            r9.setAttachClickListener(r6)
            p89 r9 = r8.getView()
            r9.setAttachVideoListener(r6)
            a89 r9 = r0.a
            ha9 r9 = r9.a
            boolean r9 = r9.w()
            r10 = 0
            a89 r0 = r0.a
            r11 = -2
            if (r9 == 0) goto L_0x0088
            ha9 r1 = r0.a
            w28 r1 = r1.x0
            g20 r2 = defpackage.g20.v
            l20 r1 = r1.I(r2)
            if (r1 != 0) goto L_0x0038
            goto L_0x0755
        L_0x0038:
            ru.ok.messages.media.attaches.AudioAttachView r2 = r6.J0
            if (r2 != 0) goto L_0x0054
            ru.ok.messages.media.attaches.AudioAttachView r2 = new ru.ok.messages.media.attaches.AudioAttachView
            android.content.Context r4 = r20.getContext()
            r2.<init>(r4, r10, r3)
            r6.J0 = r2
            int r3 = r6.indexOfChild(r8)
            int r3 = r3 + r7
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r11, r11)
            r6.addView(r2, r3, r4)
        L_0x0054:
            ru.ok.messages.media.attaches.AudioAttachView r2 = r6.J0
            r2.setListener(r6)
            ru.ok.messages.media.attaches.AudioAttachView r11 = r6.J0
            of9 r12 = r6.U0
            boolean r2 = r6.X0
            float r15 = r1.p
            i10 r13 = r1.e
            d20 r14 = r1.n
            r18 = 0
            r16 = r2
            r17 = r24
            r11.i(r12, r13, r14, r15, r16, r17, r18)
            ru.ok.messages.media.attaches.AudioAttachView r1 = r6.J0
            r2 = 1148846080(0x447a0000, float:1000.0)
            r1.setTranslationZ(r2)
            ru.ok.messages.media.attaches.AudioAttachView r1 = r6.J0
            r1.setDelegate(r10)
            ru.ok.messages.media.attaches.AudioAttachView r1 = r6.J0
            a30 r2 = r6.m1
            r1.setAudioTranscriptionStateChangeListener(r2)
            ru.ok.messages.media.attaches.AudioAttachView r1 = r6.J0
            r6.B(r1)
            goto L_0x0755
        L_0x0088:
            ha9 r9 = r0.a
            boolean r9 = r9.A()
            if (r9 == 0) goto L_0x00df
            ru.ok.messages.media.attaches.FileAttachView r2 = r6.K0
            if (r2 != 0) goto L_0x00cc
            ru.ok.messages.media.attaches.FileAttachView r2 = new ru.ok.messages.media.attaches.FileAttachView
            android.content.Context r3 = r20.getContext()
            r2.<init>(r3)
            r2.O()
            r6.K0 = r2
            int r3 = r6.indexOfChild(r8)
            int r3 = r3 + r7
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r11, r11)
            r6.addView(r2, r3, r4)
            ju8 r2 = r6.i1
            if (r2 == 0) goto L_0x00bd
            ju8 r3 = r6.j1
            if (r3 == 0) goto L_0x00bd
            ru.ok.messages.media.attaches.FileAttachView r4 = r6.K0
            r4.e1 = r2
            r4.f1 = r3
        L_0x00bd:
            ru.ok.messages.media.attaches.FileAttachView r2 = r6.K0
            r2.setPipRequestListener(r10)
            ru.ok.messages.media.attaches.FileAttachView r2 = r6.K0
            bg9 r3 = new bg9
            r3.<init>(r6, r0, r7)
            r2.setOnLongClickListener(r3)
        L_0x00cc:
            ru.ok.messages.media.attaches.FileAttachView r2 = r6.K0
            r2.setListener(r6)
            ru.ok.messages.media.attaches.FileAttachView r2 = r6.K0
            a32 r3 = r6.V0
            r2.M(r3, r0, r1)
            ru.ok.messages.media.attaches.FileAttachView r1 = r6.K0
            r6.B(r1)
            goto L_0x0755
        L_0x00df:
            ha9 r9 = r0.a
            boolean r12 = r9.F()
            r13 = 0
            if (r12 == 0) goto L_0x01ec
            ve9 r1 = r6.M0
            if (r1 != 0) goto L_0x010e
            ve9 r1 = new ve9
            android.content.Context r2 = r20.getContext()
            r1.<init>(r2)
            r6.M0 = r1
            int r2 = r6.indexOfChild(r8)
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r11, r11)
            r6.addView(r1, r2, r3)
            ju8 r1 = r6.k1
            if (r1 == 0) goto L_0x010e
            ve9 r2 = r6.M0
            r2.setStickerMediaPlayerController(r1)
        L_0x010e:
            ve9 r1 = r6.M0
            r1.getClass()
            int r2 = r9.b()
            if (r2 != r7) goto L_0x01c9
            f20 r2 = r9.l()
            if (r2 != 0) goto L_0x0121
            goto L_0x01c9
        L_0x0121:
            a89 r2 = r1.b
            if (r2 == 0) goto L_0x0153
            ha9 r2 = r2.a
            long r11 = r2.b
            long r7 = r9.b
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0153
            f20 r2 = r2.l()
            if (r2 == 0) goto L_0x013c
            long r2 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x013d
        L_0x013c:
            r2 = r10
        L_0x013d:
            f20 r3 = r9.l()
            if (r3 == 0) goto L_0x014a
            long r7 = r3.a
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            goto L_0x014b
        L_0x014a:
            r3 = r10
        L_0x014b:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0153
            goto L_0x01c9
        L_0x0153:
            a89 r2 = r1.b
            if (r2 != 0) goto L_0x0159
        L_0x0157:
            r2 = r4
            goto L_0x017e
        L_0x0159:
            ha9 r2 = r2.a
            f20 r2 = r2.l()
            if (r2 != 0) goto L_0x0162
            goto L_0x0157
        L_0x0162:
            f20 r3 = r9.l()
            if (r3 != 0) goto L_0x0169
            goto L_0x0157
        L_0x0169:
            long r7 = r2.a
            int r2 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0171
            r2 = 1
            goto L_0x0172
        L_0x0171:
            r2 = r4
        L_0x0172:
            long r7 = r3.a
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x017a
            r3 = 1
            goto L_0x017b
        L_0x017a:
            r3 = r4
        L_0x017b:
            if (r2 == r3) goto L_0x0157
            r2 = 1
        L_0x017e:
            r1.b = r0
            w28 r3 = r9.x0
            if (r3 == 0) goto L_0x0189
            java.lang.Object r3 = r3.b
            java.util.List r3 = (java.util.List) r3
            goto L_0x018a
        L_0x0189:
            r3 = r10
        L_0x018a:
            if (r3 == 0) goto L_0x01bd
            java.lang.Object r3 = r3.get(r4)
            l20 r3 = (defpackage.l20) r3
            r1.c = r3
            f20 r3 = r9.l()
            boe r3 = defpackage.hd8.u(r3)
            se9 r5 = new se9
            r7 = r21
            r5.<init>(r7, r3)
            te9 r7 = r1.v
            r7.p(r5)
            if (r2 == 0) goto L_0x01ad
            r1.invalidate()
        L_0x01ad:
            boolean r2 = r3.w0
            r5 = 1
            r2 = r2 ^ r5
            java.lang.String r3 = r3.w
            boolean r3 = defpackage.cvg.A(r3)
            r3 = r3 ^ r5
            r2 = r2 & r3
            r1.b(r2)
            goto L_0x01c9
        L_0x01bd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c9:
            ve9 r1 = r6.M0
            r2 = 1
            r1.setLongClickable(r2)
            ve9 r1 = r6.M0
            r1.setListener(r6)
            ve9 r1 = r6.M0
            gb8 r2 = r6.l1
            r1.setLottieLayer(r2)
            ve9 r1 = r6.M0
            bg9 r2 = new bg9
            r2.<init>(r6, r0, r4)
            r1.setOnLongClickListener(r2)
            ve9 r1 = r6.M0
            r6.B(r1)
            goto L_0x0755
        L_0x01ec:
            boolean r7 = r9.E()
            if (r7 == 0) goto L_0x0444
            ru.ok.messages.media.attaches.ShareAttachView r3 = r6.N0
            if (r3 != 0) goto L_0x0235
            ru.ok.messages.media.attaches.ShareAttachView r3 = new ru.ok.messages.media.attaches.ShareAttachView
            android.content.Context r7 = r20.getContext()
            r3.<init>(r7)
            r7 = 1
            r3.z0 = r7
            r3.c()
            r6.N0 = r3
            r3.setMediaClickListener(r6)
            ru.ok.messages.media.attaches.ShareAttachView r3 = r6.N0
            int r8 = r6.indexOfChild(r8)
            int r8 = r8 + r7
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r12 = -1
            r7.<init>(r12, r11)
            r6.addView(r3, r8, r7)
            ju8 r3 = r6.i1
            if (r3 == 0) goto L_0x0230
            ju8 r7 = r6.j1
            if (r7 == 0) goto L_0x0230
            ju8 r8 = r6.k1
            if (r8 == 0) goto L_0x0230
            ru.ok.messages.media.attaches.ShareAttachView r12 = r6.N0
            r12.B0 = r8
            ru.ok.messages.media.attaches.ShareMediaView r8 = r12.w0
            r8.L0 = r3
            r8.M0 = r7
        L_0x0230:
            ru.ok.messages.media.attaches.ShareAttachView r3 = r6.N0
            r3.setPipRequestListener(r10)
        L_0x0235:
            ru.ok.messages.media.attaches.ShareAttachView r3 = r6.N0
            c20 r7 = r9.k()
            r3.getClass()
            scf r8 = r3.y0
            ws0 r8 = r8.c(r1)
            if (r1 == 0) goto L_0x0283
            android.view.View r1 = r3.w
            ys0 r12 = r8.d
            int r12 = r12.a
            r1.setBackgroundColor(r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            ro4 r12 = r3.a
            int r12 = r12.a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            ro4 r13 = r3.a
            int r13 = r13.h
            android.graphics.drawable.GradientDrawable r1 = defpackage.i8b.O(r1, r10, r12, r13)
            scf r12 = r3.y0
            int r12 = r12.j
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            ys0 r13 = r8.d
            int r13 = r13.a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            ro4 r14 = r3.a
            int r14 = r14.h
            android.graphics.drawable.GradientDrawable r12 = defpackage.i8b.O(r12, r13, r10, r14)
            android.graphics.drawable.StateListDrawable r1 = defpackage.i8b.T(r1, r12, r10)
            r3.setForeground(r1)
            goto L_0x02a8
        L_0x0283:
            android.view.View r1 = r3.w
            ys0 r12 = r8.d
            int r12 = r12.a
            r1.setBackgroundColor(r12)
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r4)
            ys0 r12 = r8.d
            int r12 = r12.a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            ro4 r13 = r3.a
            int r13 = r13.h
            android.graphics.drawable.GradientDrawable r12 = defpackage.i8b.O(r12, r10, r10, r13)
            android.graphics.drawable.StateListDrawable r1 = defpackage.i8b.T(r1, r12, r10)
            r3.setForeground(r1)
        L_0x02a8:
            qs0 r1 = r8.a
            int r1 = r1.h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            ro4 r8 = r3.a
            int r8 = r8.h
            android.graphics.drawable.GradientDrawable r1 = defpackage.i8b.O(r1, r10, r10, r8)
            r3.setBackground(r1)
            boolean r1 = r7.b()
            if (r1 == 0) goto L_0x02ce
            l20 r1 = r7.g
            boolean r8 = r1.g()
            if (r8 == 0) goto L_0x02ce
            c20 r8 = r1.g
            r3.b = r8
            goto L_0x02d7
        L_0x02ce:
            r3.b = r7
            w28 r1 = r9.x0
            l20 r1 = r1.F(r4)
            r7 = r10
        L_0x02d7:
            if (r7 != 0) goto L_0x02e4
            android.view.View r7 = r3.w
            r7.setVisibility(r2)
            ru.ok.messages.media.attaches.ShareAttachHeaderView r7 = r3.v
            r7.setVisibility(r2)
            goto L_0x02f7
        L_0x02e4:
            android.view.View r8 = r3.w
            r8.setVisibility(r4)
            ru.ok.messages.media.attaches.ShareAttachHeaderView r8 = r3.v
            r8.setVisibility(r4)
            ru.ok.messages.media.attaches.ShareAttachHeaderView r8 = r3.v
            boolean r9 = r0.f()
            r8.N(r9, r1, r7)
        L_0x02f7:
            ru.ok.messages.media.attaches.ShareAttachHeaderView r7 = r3.y
            boolean r8 = r0.f()
            c20 r9 = r3.b
            r7.N(r8, r1, r9)
            c20 r7 = r3.b
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x034a
            c20 r7 = r3.b
            l20 r7 = r7.g
            boolean r7 = r7.i()
            if (r7 == 0) goto L_0x034a
            ru.ok.messages.media.attaches.ShareMediaView r1 = r3.w0
            r1.p(r0)
            ru.ok.messages.media.attaches.ShareMediaView r1 = r3.w0
            r1.setVisibility(r4)
            c20 r1 = r3.b
            l20 r1 = r1.g
            boolean r1 = defpackage.ld8.c0(r1)
            if (r1 == 0) goto L_0x0337
            ru.ok.messages.media.attaches.ShareAttachBigImageBgView r1 = r3.v0
            r1.setVisibility(r4)
            ru.ok.messages.media.attaches.ShareAttachBigImageBgView r1 = r3.v0
            c20 r4 = r3.b
            l20 r4 = r4.g
            r1.n(r4)
            goto L_0x033c
        L_0x0337:
            ru.ok.messages.media.attaches.ShareAttachBigImageBgView r1 = r3.v0
            r1.setVisibility(r2)
        L_0x033c:
            ru.ok.messages.media.attaches.ShareAttachBigImageView r1 = r3.z
            r1.setVisibility(r2)
            ru.ok.messages.stickers.widgets.StickerView r1 = r3.x0
            if (r1 == 0) goto L_0x0420
            r1.setVisibility(r2)
            goto L_0x0420
        L_0x034a:
            c20 r7 = r3.b
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x03af
            c20 r7 = r3.b
            l20 r7 = r7.g
            boolean r7 = r7.h()
            if (r7 == 0) goto L_0x03af
            ru.ok.messages.stickers.widgets.StickerView r1 = r3.x0
            if (r1 != 0) goto L_0x038b
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r11, r11)
            r7 = 17
            r1.gravity = r7
            ru.ok.messages.stickers.widgets.StickerView r7 = new ru.ok.messages.stickers.widgets.StickerView
            android.content.Context r8 = r3.getContext()
            r7.<init>(r8, r10)
            r3.x0 = r7
            ju8 r8 = r3.B0
            r7.setStickerMediaPlayerController(r8)
            ru.ok.messages.stickers.widgets.StickerView r7 = r3.x0
            ro4 r8 = r3.a
            int r8 = r8.f
            java.util.WeakHashMap r9 = defpackage.gag.a
            r7.setPaddingRelative(r8, r4, r8, r8)
            android.widget.FrameLayout r7 = r3.o
            ru.ok.messages.stickers.widgets.StickerView r8 = r3.x0
            r7.addView(r8, r1)
        L_0x038b:
            ru.ok.messages.stickers.widgets.StickerView r1 = r3.x0
            r1.setVisibility(r4)
            ru.ok.messages.stickers.widgets.StickerView r1 = r3.x0
            c20 r4 = r3.b
            l20 r4 = r4.g
            f20 r4 = r4.f
            boe r4 = defpackage.hd8.u(r4)
            r1.p(r4)
            ru.ok.messages.media.attaches.ShareMediaView r1 = r3.w0
            r1.setVisibility(r2)
            ru.ok.messages.media.attaches.ShareAttachBigImageView r1 = r3.z
            r1.setVisibility(r2)
            ru.ok.messages.media.attaches.ShareAttachBigImageBgView r1 = r3.v0
            r1.setVisibility(r2)
            goto L_0x0420
        L_0x03af:
            c20 r7 = r3.b
            boolean r7 = r7.a()
            if (r7 == 0) goto L_0x03ce
            ru.ok.messages.media.attaches.ShareAttachBigImageView r4 = r3.z
            r4.n(r1)
            ru.ok.messages.media.attaches.ShareAttachBigImageBgView r4 = r3.v0
            r4.n(r1)
            ru.ok.messages.media.attaches.ShareMediaView r1 = r3.w0
            r1.setVisibility(r2)
            ru.ok.messages.stickers.widgets.StickerView r1 = r3.x0
            if (r1 == 0) goto L_0x0420
            r1.setVisibility(r2)
            goto L_0x0420
        L_0x03ce:
            c20 r7 = r3.b
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x040a
            c20 r7 = r3.b
            l20 r7 = r7.g
            boolean r7 = r7.f()
            if (r7 == 0) goto L_0x040a
            ru.ok.messages.media.attaches.ShareAttachBigImageView r7 = r3.z
            r7.n(r1)
            c20 r1 = r3.b
            l20 r1 = r1.g
            boolean r1 = defpackage.ld8.c0(r1)
            if (r1 == 0) goto L_0x03fd
            ru.ok.messages.media.attaches.ShareAttachBigImageBgView r1 = r3.v0
            r1.setVisibility(r4)
            ru.ok.messages.media.attaches.ShareAttachBigImageBgView r1 = r3.v0
            c20 r4 = r3.b
            l20 r4 = r4.g
            r1.n(r4)
        L_0x03fd:
            ru.ok.messages.media.attaches.ShareMediaView r1 = r3.w0
            r1.setVisibility(r2)
            ru.ok.messages.stickers.widgets.StickerView r1 = r3.x0
            if (r1 == 0) goto L_0x0420
            r1.setVisibility(r2)
            goto L_0x0420
        L_0x040a:
            ru.ok.messages.media.attaches.ShareAttachBigImageView r1 = r3.z
            r1.setVisibility(r2)
            ru.ok.messages.media.attaches.ShareAttachBigImageBgView r1 = r3.v0
            r1.setVisibility(r2)
            ru.ok.messages.media.attaches.ShareMediaView r1 = r3.w0
            r1.setVisibility(r2)
            ru.ok.messages.stickers.widgets.StickerView r1 = r3.x0
            if (r1 == 0) goto L_0x0420
            r1.setVisibility(r2)
        L_0x0420:
            r3.requestLayout()
            ru.ok.messages.media.attaches.ShareAttachView r1 = r6.N0
            r2 = 1
            r1.setLongClickable(r2)
            ru.ok.messages.media.attaches.ShareAttachView r1 = r6.N0
            ag9 r2 = new ag9
            r2.<init>((defpackage.gg9) r6, (defpackage.a89) r0)
            r1.setOnClickListener(r2)
            ru.ok.messages.media.attaches.ShareAttachView r1 = r6.N0
            bg9 r2 = new bg9
            r2.<init>(r6, r0, r5)
            r1.setOnLongClickListener(r2)
            ru.ok.messages.media.attaches.ShareAttachView r1 = r6.N0
            r6.B(r1)
            goto L_0x0755
        L_0x0444:
            boolean r7 = r9.x()
            if (r7 == 0) goto L_0x056e
            l01 r2 = r6.O0
            if (r2 != 0) goto L_0x0467
            l01 r2 = new l01
            android.content.Context r3 = r20.getContext()
            r2.<init>(r3)
            r6.O0 = r2
            int r3 = r6.indexOfChild(r8)
            r4 = 1
            int r3 = r3 + r4
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r11, r11)
            r6.addView(r2, r3, r4)
        L_0x0467:
            l01 r2 = r6.O0
            r2.setListener(r6)
            l01 r2 = r6.O0
            w28 r3 = r9.x0
            g20 r4 = defpackage.g20.y
            l20 r3 = r3.I(r4)
            r2.getClass()
            l10 r3 = r3.i
            int r4 = r3.c
            if (r4 != 0) goto L_0x0481
            goto L_0x0567
        L_0x0481:
            scf r7 = r2.v
            ws0 r7 = r7.c(r1)
            zs0 r7 = r7.b
            int r7 = r7.e
            android.widget.TextView r8 = r2.c
            r8.setTextColor(r7)
            int[] r7 = defpackage.k01.$EnumSwitchMapping$0
            int r9 = defpackage.tr1.y(r4)
            r9 = r7[r9]
            r11 = 1
            if (r9 != r11) goto L_0x049e
            int r9 = defpackage.qad.l0
            goto L_0x04a0
        L_0x049e:
            int r9 = defpackage.qad.Q
        L_0x04a0:
            long r11 = r3.e
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x04d1
            kotlin.jvm.internal.StringCompanionObject r13 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.String[] r13 = defpackage.ghf.c
            java.lang.String r11 = defpackage.b0h.c(r11)
            android.content.Context r12 = r2.getContext()
            java.lang.String r9 = r12.getString(r9)
            java.util.Locale r12 = java.util.Locale.getDefault()
            java.lang.String r9 = r9.toLowerCase(r12)
            java.lang.Object[] r9 = new java.lang.Object[]{r11, r9}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r9, r5)
            java.lang.String r9 = "%s %s"
            java.lang.String r5 = java.lang.String.format(r9, r5)
            r8.setText(r5)
        L_0x04cf:
            r5 = 1
            goto L_0x04d5
        L_0x04d1:
            r8.setText(r9)
            goto L_0x04cf
        L_0x04d5:
            r8 = r1 ^ 1
            android.widget.TextView r5 = r2.b
            android.widget.ImageView r9 = r2.o
            if (r1 == 0) goto L_0x0511
            boolean r11 = r3.c()
            if (r11 != 0) goto L_0x04ef
            boolean r11 = r3.a()
            if (r11 != 0) goto L_0x04ef
            boolean r11 = r3.d()
            if (r11 == 0) goto L_0x0511
        L_0x04ef:
            int r1 = defpackage.tr1.y(r4)
            r1 = r7[r1]
            r3 = 1
            if (r1 != r3) goto L_0x04fb
            int r1 = defpackage.nad.e2
            goto L_0x04fd
        L_0x04fb:
            int r1 = defpackage.nad.T0
        L_0x04fd:
            r9.setImageResource(r1)
            android.graphics.drawable.Drawable r1 = r9.getDrawable()
            scf r2 = r2.v
            int r2 = r2.z
            defpackage.iq.a0(r1, r2)
            int r1 = defpackage.qad.Y
            r5.setText(r1)
            goto L_0x0567
        L_0x0511:
            if (r1 == 0) goto L_0x0535
            int r1 = defpackage.tr1.y(r4)
            r1 = r7[r1]
            r3 = 1
            if (r1 != r3) goto L_0x051f
            int r1 = defpackage.nad.d2
            goto L_0x0521
        L_0x051f:
            int r1 = defpackage.nad.B0
        L_0x0521:
            r9.setImageResource(r1)
            android.graphics.drawable.Drawable r1 = r9.getDrawable()
            scf r2 = r2.v
            int r2 = r2.G
            defpackage.iq.a0(r1, r2)
            int r1 = defpackage.qad.X
            r5.setText(r1)
            goto L_0x0567
        L_0x0535:
            if (r8 == 0) goto L_0x0567
            int r4 = defpackage.tr1.y(r4)
            r4 = r7[r4]
            r7 = 1
            if (r4 != r7) goto L_0x0543
            int r4 = defpackage.nad.c2
            goto L_0x0545
        L_0x0543:
            int r4 = defpackage.nad.C
        L_0x0545:
            r9.setImageResource(r4)
            android.graphics.drawable.Drawable r4 = r9.getDrawable()
            scf r2 = r2.v
            ws0 r1 = r2.c(r1)
            qs0 r1 = r1.a
            int r1 = r1.e
            defpackage.iq.a0(r4, r1)
            boolean r1 = r3.a()
            if (r1 == 0) goto L_0x0562
            int r1 = defpackage.qad.a0
            goto L_0x0564
        L_0x0562:
            int r1 = defpackage.qad.Z
        L_0x0564:
            r5.setText(r1)
        L_0x0567:
            l01 r1 = r6.O0
            r6.B(r1)
            goto L_0x0755
        L_0x056e:
            boolean r1 = r9.y()
            if (r1 == 0) goto L_0x0638
            gl3 r1 = r6.L0
            if (r1 != 0) goto L_0x0619
            gl3 r1 = new gl3
            android.content.Context r2 = r20.getContext()
            r1.<init>(r2)
            r1.getContext()
            ro4 r2 = defpackage.ro4.b()
            r1.x0 = r2
            id3 r2 = defpackage.ym.e()
            qra r2 = (defpackage.qra) r2
            km3 r2 = r2.m()
            r1.y0 = r2
            ro4 r2 = r1.x0
            int r3 = r2.d
            r1.a = r3
            int r2 = r2.e
            r1.b = r2
            android.content.Context r2 = r1.getContext()
            int r3 = defpackage.ujc.view_contact_attach
            android.view.View.inflate(r2, r3, r1)
            r1.setOrientation(r4)
            ro4 r2 = r1.x0
            int r3 = r2.h
            int r2 = r2.f
            r1.setPadding(r3, r3, r2, r3)
            int r2 = defpackage.lic.view_contact_attach__tv_contact_name
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c = r2
            bhf r2 = defpackage.cvg.x(r2)
            r2.b()
            int r2 = defpackage.lic.view_contact_attach__tv_phonebook
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.o = r2
            float r3 = r2.getTextSize()
            r2.setTextSize(r4, r3)
            int r2 = defpackage.lic.view_contact_attach__avatar_view
            android.view.View r2 = r1.findViewById(r2)
            ru.ok.messages.views.widgets.TamAvatarView r2 = (ru.ok.messages.views.widgets.TamAvatarView) r2
            r1.x = r2
            int r2 = defpackage.lic.view_contact_attach__img_write
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.v = r2
            int r2 = defpackage.lic.view_contact_attach__img_save
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.w = r2
            android.widget.ImageView r2 = r1.v
            el3 r3 = new el3
            r4 = 1
            r3.<init>(r1, r4)
            defpackage.y64.n(r2, r3)
            android.widget.ImageView r2 = r1.w
            el3 r3 = new el3
            r3.<init>(r1, r5)
            defpackage.y64.n(r2, r3)
            r6.L0 = r1
            int r2 = r6.indexOfChild(r8)
            int r2 = r2 + r4
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r11, r11)
            r6.addView(r1, r2, r3)
        L_0x0619:
            gl3 r1 = r6.L0
            r1.setListener(r6)
            gl3 r1 = r6.L0
            w28 r2 = r9.x0
            g20 r3 = defpackage.g20.Y
            l20 r2 = r2.I(r3)
            boolean r3 = r6.X0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.a(r2, r3)
            gl3 r1 = r6.L0
            r6.B(r1)
            goto L_0x0755
        L_0x0638:
            boolean r1 = r9.B()
            if (r1 == 0) goto L_0x0727
            q58 r1 = r6.T0
            if (r1 != 0) goto L_0x065b
            q58 r1 = new q58
            android.content.Context r7 = r20.getContext()
            r1.<init>(r7)
            r6.T0 = r1
            int r7 = r6.indexOfChild(r8)
            r8 = 1
            int r7 = r7 + r8
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r8.<init>(r11, r11)
            r6.addView(r1, r7, r8)
        L_0x065b:
            q58 r1 = r6.T0
            r1.setListener(r6)
            q58 r1 = r6.T0
            android.view.View r7 = r1.z
            r7.setOnLongClickListener(r6)
            android.widget.LinearLayout r1 = r1.w0
            r1.setOnLongClickListener(r6)
            q58 r1 = r6.T0
            r1.getClass()
            w28 r7 = r9.x0
            g20 r8 = defpackage.g20.v0
            l20 r7 = r7.I(r8)
            int r8 = r1.v
            float r8 = (float) r8
            float[] r2 = new float[r2]
            r2[r4] = r8
            r11 = 1
            r2[r11] = r8
            r2[r5] = r8
            r5 = 3
            r2[r5] = r8
            r5 = 4
            r2[r5] = r8
            r5 = 5
            r2[r5] = r8
            r2[r3] = r8
            r3 = 7
            r2[r3] = r8
            r1.setCornersRadii(r2)
            vd8 r2 = r1.F0
            if (r2 == 0) goto L_0x06a7
            boolean r3 = r1.I0
            if (r3 != 0) goto L_0x06a7
            r2.i(r4)
            vd8 r2 = r1.F0
            r3 = 1
            r2.i(r3)
        L_0x06a7:
            l20 r2 = r1.w
            if (r2 == 0) goto L_0x0710
            if (r7 == 0) goto L_0x0710
            ha9 r3 = r1.x
            if (r3 == 0) goto L_0x0710
            java.lang.String r3 = r7.q
            java.lang.String r2 = r2.q
            boolean r2 = defpackage.ld8.x(r2, r3)
            if (r2 == 0) goto L_0x0710
            l20 r2 = r1.w
            d20 r3 = r2.n
            d20 r4 = r7.n
            if (r3 != r4) goto L_0x0710
            u10 r2 = r2.m
            s58 r2 = r2.a
            double r12 = r2.a
            u10 r3 = r7.m
            s58 r4 = r3.a
            double r14 = r4.a
            taf r5 = r6.b
            r11 = r5
            be r11 = (defpackage.be) r11
            r16 = r14
            double r14 = r2.b
            double r4 = r4.b
            r18 = r4
            boolean r2 = r11.f(r12, r14, r16, r18)
            if (r2 == 0) goto L_0x0710
            d18 r2 = r1.C0
            j18 r2 = (defpackage.j18) r2
            boolean r2 = r2.f(r9)
            boolean r4 = r1.y
            if (r2 != r4) goto L_0x0710
            d18 r2 = r1.C0
            j18 r2 = (defpackage.j18) r2
            qq3 r2 = r2.d(r9)
            d18 r4 = r1.C0
            ha9 r5 = r1.x
            j18 r4 = (defpackage.j18) r4
            qq3 r4 = r4.d(r5)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0710
            l20 r2 = r1.w
            u10 r2 = r2.m
            boolean r2 = r2.h
            boolean r3 = r3.h
            if (r2 == r3) goto L_0x0721
        L_0x0710:
            d18 r2 = r1.C0
            j18 r2 = (defpackage.j18) r2
            boolean r2 = r2.f(r9)
            r1.y = r2
            r1.w = r7
            r1.x = r9
            r1.b()
        L_0x0721:
            q58 r1 = r6.T0
            r6.B(r1)
            goto L_0x0755
        L_0x0727:
            r3 = 1
            boolean r1 = r9.o()
            if (r1 == 0) goto L_0x0752
            p89 r1 = r8.getView()
            mc9 r2 = r0.c
            if (r2 == 0) goto L_0x073b
            int r2 = r2.a
            if (r2 != r5) goto L_0x073b
            r4 = r3
        L_0x073b:
            r1.setForwarded(r4)
            p89 r1 = r8.getView()
            boolean r2 = r20.s()
            r1.setSenderVisible(r2)
            a32 r1 = r6.V0
            r8.a(r1, r0)
            r6.B(r8)
            goto L_0x0755
        L_0x0752:
            r6.B(r10)
        L_0x0755:
            ha9 r0 = r0.a
            boolean r0 = r0.w()
            if (r0 == 0) goto L_0x078e
            ru.ok.messages.media.attaches.AudioAttachView r5 = r6.J0
            int r0 = defpackage.ydc.expansion_area__audio_controls_container
            android.content.Context r1 = r20.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r3 = r1.getDimensionPixelSize(r0)
            r0 = r3
            r1 = r3
            r2 = r3
            r4 = r20
            defpackage.b59.x(r0, r1, r2, r3, r4, r5)
            ru.ok.messages.media.attaches.AudioAttachView r10 = r6.J0
            ru.ok.messages.views.widgets.audiowave.AudioWaveView r11 = r10.b
            int r0 = defpackage.ydc.expansion_area__audio_controls
            android.content.Context r1 = r10.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r9 = r1.getDimensionPixelSize(r0)
            r6 = r9
            r7 = r9
            r8 = r9
            defpackage.b59.x(r6, r7, r8, r9, r10, r11)
            goto L_0x0791
        L_0x078e:
            r6.setTouchDelegate(r10)
        L_0x0791:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg9.d(int, of9, boolean, boolean):void");
    }

    public final void e(a89 a89) {
        boolean n = n();
        this.E0.setVisibility(0);
        AppCompatTextView appCompatTextView = this.G0;
        gsb gsb = a89.v;
        gsb.g();
        appCompatTextView.setText(gsb.k);
        if (x() || (n && !q())) {
            this.G0.setTextColor(this.Z0.b.a);
            this.E0.setBackground(this.d1);
        } else {
            this.G0.setTextColor(this.a1.b.f);
            this.E0.setBackground((Drawable) null);
        }
        boolean w2 = a89.a.w();
        ro4 ro4 = this.a;
        if (w2) {
            LinearLayout linearLayout = this.E0;
            int i = ro4.d;
            linearLayout.setPadding(i, 0, i, 0);
            return;
        }
        LinearLayout linearLayout2 = this.E0;
        int i2 = ro4.d;
        int i3 = ro4.b;
        linearLayout2.setPadding(i2, i3, i2, i3);
    }

    /* JADX WARNING: type inference failed for: r6v41, types: [android.widget.LinearLayout, android.view.View, z12, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r13v17, types: [androidx.constraintlayout.widget.ConstraintLayout, ru.ok.messages.media.attaches.ShareAttachHeaderView, l2d] */
    /* JADX WARNING: type inference failed for: r11v28, types: [android.widget.LinearLayout, android.view.View, ru.ok.messages.views.widgets.BlockedAttachView] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x05ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r26, defpackage.a32 r27, defpackage.of9 r28, boolean r29, boolean r30) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            r2 = r28
            r3 = r29
            android.widget.LinearLayout r4 = r0.E0
            androidx.appcompat.widget.AppCompatImageView r6 = r0.F0
            r11 = 8
            r14 = 1
            r15 = 0
            androidx.appcompat.widget.AppCompatTextView r5 = r0.C0
            bt0 r7 = defpackage.bt0.a
            r0.U0 = r2
            r0.V0 = r1
            r0.X0 = r3
            scf r8 = r0.e1
            a93 r9 = r8.g
            r0.Z0 = r9
            ws0 r8 = r8.c(r3)
            r0.a1 = r8
            r0.W0 = r15
            a89 r8 = r2.a
            r0.i(r1, r8)
            js9 r9 = defpackage.fu4.k
            lf9 r13 = r0.D0
            r13.getClass()
            r13.b(r14)
            r0.Y0 = r7
            of9 r7 = r0.U0
            a89 r7 = r7.a
            mc9 r7 = r7.c
            r13 = 0
            r12 = -2
            if (r7 == 0) goto L_0x05d2
            int r7 = r7.a
            if (r7 != r14) goto L_0x05d2
            fe9 r7 = r0.Q0
            if (r7 != 0) goto L_0x006a
            fe9 r7 = new fe9
            android.content.Context r10 = r25.getContext()
            r7.<init>(r10)
            r0.Q0 = r7
            ef9 r10 = r0.n1
            r7.setTextLayoutRepository(r10)
            fe9 r7 = r0.Q0
            r7.setListener(r0)
            fe9 r7 = r0.Q0
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r10.<init>(r12, r12)
            r0.addView(r7, r14, r10)
        L_0x006a:
            fe9 r7 = r0.Q0
            r7.setVisibility(r15)
            fe9 r7 = r0.Q0
            of9 r10 = r0.U0
            a89 r10 = r10.a
            mc9 r10 = r10.c
            a89 r10 = r10.c
            boolean r12 = r0.X0
            r7.H0 = r10
            r7.A0 = r13
            androidx.appcompat.widget.AppCompatTextView r13 = r7.o
            java.lang.String r15 = r10.d(r1)
            r13.setText(r15)
            scf r13 = r7.C0
            ws0 r12 = r13.c(r12)
            r7.D0 = r12
            androidx.appcompat.widget.AppCompatTextView r13 = r7.o
            zs0 r15 = r12.b
            int r15 = r15.h
            r13.setTextColor(r15)
            androidx.appcompat.widget.AppCompatTextView r13 = r7.v
            zs0 r12 = r12.b
            int r12 = r12.c
            r13.setTextColor(r12)
            a89 r12 = r10.b()
            if (r12 == 0) goto L_0x00ad
            a89 r12 = r10.b()
            goto L_0x00ae
        L_0x00ad:
            r12 = r10
        L_0x00ae:
            ha9 r13 = r12.a
            java.lang.String r13 = r13.y
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            ha9 r15 = r12.a
            if (r13 != 0) goto L_0x00c1
            boolean r13 = r15.F()
            if (r13 != 0) goto L_0x00c1
            goto L_0x00e6
        L_0x00c1:
            boolean r13 = r15.w()
            if (r13 != 0) goto L_0x00e6
            boolean r13 = r15.A()
            if (r13 != 0) goto L_0x00e6
            boolean r13 = r15.y()
            if (r13 != 0) goto L_0x00e6
            boolean r13 = r15.B()
            if (r13 != 0) goto L_0x00e6
            boolean r13 = r15.x()
            if (r13 != 0) goto L_0x00e6
            lf9 r12 = r7.w
            r12.setVisibility(r11)
            goto L_0x019e
        L_0x00e6:
            ef9 r13 = r7.G0
            boolean r11 = defpackage.h88.M(r7)
            jf9 r11 = r13.e(r1, r12, r11, r14)
            lf9 r13 = r7.w
            java.util.List r16 = r12.a()
            boolean r16 = r16.isEmpty()
            r1 = r16 ^ 1
            defpackage.ryg.e(r13, r1)
            hk r1 = r7.z0
            if (r1 != 0) goto L_0x011a
            java.util.List r1 = r12.a()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x011a
            hk r1 = new hk
            lf9 r12 = r7.w
            r13 = 0
            r1.<init>(r12, r13)
            r7.z0 = r1
            r1.a()
        L_0x011a:
            if (r11 == 0) goto L_0x0197
            android.text.Layout r1 = r11.a()
            java.lang.CharSequence r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0197
            boolean r1 = r15.w()
            if (r1 == 0) goto L_0x0136
            int r1 = defpackage.nad.t
            r7.a(r1)
            goto L_0x017a
        L_0x0136:
            boolean r1 = r15.B()
            if (r1 == 0) goto L_0x0142
            int r1 = defpackage.nad.J0
            r7.a(r1)
            goto L_0x017a
        L_0x0142:
            boolean r1 = r15.A()
            if (r1 == 0) goto L_0x014f
            int r1 = defpackage.nad.j0
            r12 = 0
            r7.b(r12, r1)
            goto L_0x017a
        L_0x014f:
            boolean r1 = r15.y()
            if (r1 == 0) goto L_0x015a
            r1 = -1
            r7.a(r1)
            goto L_0x017a
        L_0x015a:
            boolean r1 = r15.x()
            if (r1 == 0) goto L_0x0176
            l10 r1 = r15.d()
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0170
            int r1 = defpackage.nad.Z1
            r7.a(r1)
            goto L_0x017a
        L_0x0170:
            int r1 = defpackage.nad.z
            r7.a(r1)
            goto L_0x017a
        L_0x0176:
            r1 = -1
            r7.a(r1)
        L_0x017a:
            android.text.Layout r1 = r11.a()
            android.text.TextPaint r1 = r1.getPaint()
            ws0 r12 = r7.D0
            zs0 r12 = r12.b
            int r12 = r12.i
            r1.setColor(r12)
            lf9 r1 = r7.w
            r1.setLayout(r11)
            lf9 r1 = r7.w
            r11 = 0
            r1.setVisibility(r11)
            goto L_0x019e
        L_0x0197:
            lf9 r1 = r7.w
            r11 = 8
            r1.setVisibility(r11)
        L_0x019e:
            lf9 r1 = r7.w
            int r1 = r1.getVisibility()
            ha9 r11 = r10.a
            if (r1 != 0) goto L_0x01b7
            boolean r1 = r11.y()
            if (r1 != 0) goto L_0x01b7
            r1 = 0
            r7.c(r1)
        L_0x01b2:
            r17 = r6
        L_0x01b4:
            r2 = 0
            goto L_0x05bc
        L_0x01b7:
            r1 = 0
            or7 r12 = r7.E0
            defpackage.jbd.c(r12)
            r7.F0 = r1
            w28 r1 = r11.x0
            boolean r12 = r11.o()
            ro4 r13 = r7.a
            if (r12 == 0) goto L_0x0237
            r12 = 0
            l20 r15 = r1.F(r12)
            boolean r15 = r15.s
            if (r15 == 0) goto L_0x0237
            android.widget.FrameLayout r11 = r7.x
            r11.setVisibility(r12)
            android.widget.FrameLayout r11 = r7.x
            r7.c(r11)
            ru.ok.messages.views.widgets.BlockedAttachView r11 = r7.y0
            if (r11 != 0) goto L_0x01f9
            ru.ok.messages.views.widgets.BlockedAttachView r11 = new ru.ok.messages.views.widgets.BlockedAttachView
            android.content.Context r12 = r7.getContext()
            r11.<init>(r12)
            r11.a()
            r7.y0 = r11
            android.widget.FrameLayout r12 = r7.x
            android.widget.FrameLayout$LayoutParams r15 = new android.widget.FrameLayout$LayoutParams
            r14 = -1
            r15.<init>(r14, r14)
            r12.addView(r11, r15)
        L_0x01f9:
            ru.ok.messages.views.widgets.BlockedAttachView r11 = r7.y0
            r12 = 0
            r11.setVisibility(r12)
            ru.ok.messages.views.widgets.BlockedAttachView r11 = r7.y0
            int r13 = r13.d
            float r13 = (float) r13
            r14 = 8
            float[] r15 = new float[r14]
            r15[r12] = r13
            r14 = 1
            r15[r14] = r13
            r14 = 2
            r15[r14] = r13
            r14 = 3
            r15[r14] = r13
            r14 = 4
            r15[r14] = r13
            r14 = 5
            r15[r14] = r13
            r14 = 6
            r15[r14] = r13
            r14 = 7
            r15[r14] = r13
            r11.setCorners(r15)
            ru.ok.messages.views.widgets.BlockedAttachView r11 = r7.y0
            android.content.Context r13 = r7.getContext()
            l20 r1 = r1.F(r12)
            java.lang.String r1 = defpackage.fhf.b(r13, r1)
            androidx.appcompat.widget.AppCompatTextView r11 = r11.a
            r11.setText(r1)
            goto L_0x01b2
        L_0x0237:
            g20 r12 = defpackage.g20.c
            boolean r14 = r11.n(r12)
            g20 r15 = defpackage.g20.o
            if (r14 != 0) goto L_0x024d
            boolean r14 = r11.n(r15)
            if (r14 != 0) goto L_0x024d
            boolean r14 = r11.F()
            if (r14 == 0) goto L_0x0252
        L_0x024d:
            r17 = r6
            r6 = 0
            goto L_0x038d
        L_0x0252:
            boolean r12 = r11.E()
            if (r12 == 0) goto L_0x02d4
            l2d r12 = r7.w0
            if (r12 != 0) goto L_0x02b4
            pj3 r12 = new pj3
            r12.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r13 = r7.c
            r12.d(r13)
            l2d r13 = new l2d
            android.content.Context r14 = r7.getContext()
            r13.<init>(r14)
            r7.w0 = r13
            int r14 = defpackage.lic.view_message_reply__share_attach_view
            r13.setId(r14)
            l2d r13 = r7.w0
            int r13 = r13.getId()
            r14 = -2
            r12.f(r13, r14)
            l2d r13 = r7.w0
            int r13 = r13.getId()
            r12.g(r13, r14)
            l2d r13 = r7.w0
            int r13 = r13.getId()
            r14 = 0
            r15 = 6
            r12.e(r13, r15, r14, r15)
            l2d r13 = r7.w0
            int r13 = r13.getId()
            lf9 r14 = r7.w
            int r14 = r14.getId()
            r17 = r6
            r6 = 3
            r15 = 4
            r12.e(r13, r6, r14, r15)
            androidx.constraintlayout.widget.ConstraintLayout r6 = r7.c
            l2d r13 = r7.w0
            r6.addView(r13)
            androidx.constraintlayout.widget.ConstraintLayout r6 = r7.c
            r12.a(r6)
            goto L_0x02b6
        L_0x02b4:
            r17 = r6
        L_0x02b6:
            l2d r6 = r7.w0
            boolean r12 = r10.f()
            r13 = 0
            l20 r1 = r1.F(r13)
            c20 r11 = r11.k()
            r6.N(r12, r1, r11)
            l2d r1 = r7.w0
            r1.setVisibility(r13)
            l2d r1 = r7.w0
            r7.c(r1)
            goto L_0x01b4
        L_0x02d4:
            r17 = r6
            boolean r1 = r11.y()
            if (r1 == 0) goto L_0x0387
            ru.ok.messages.views.widgets.TamAvatarView r1 = r7.x0
            if (r1 != 0) goto L_0x0361
            pj3 r1 = new pj3
            r1.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r6 = r7.c
            r1.d(r6)
            ru.ok.messages.views.widgets.TamAvatarView r6 = new ru.ok.messages.views.widgets.TamAvatarView
            android.content.Context r12 = r7.getContext()
            r14 = 0
            r15 = 6
            r6.<init>(r12, r14, r15)
            r7.x0 = r6
            int r12 = defpackage.lic.view_message_reply__avatar_view
            r6.setId(r12)
            ru.ok.messages.views.widgets.TamAvatarView r6 = r7.x0
            int r6 = r6.getId()
            int r12 = r13.v
            r1.f(r6, r12)
            ru.ok.messages.views.widgets.TamAvatarView r6 = r7.x0
            int r6 = r6.getId()
            int r12 = r13.v
            r1.g(r6, r12)
            ru.ok.messages.views.widgets.TamAvatarView r6 = r7.x0
            int r6 = r6.getId()
            r12 = 0
            r14 = 6
            r1.e(r6, r14, r12, r14)
            ru.ok.messages.views.widgets.TamAvatarView r6 = r7.x0
            int r6 = r6.getId()
            int r12 = defpackage.lic.view_message_reply__tv_author
            r14 = 4
            r15 = 3
            r1.e(r6, r15, r12, r14)
            ru.ok.messages.views.widgets.TamAvatarView r6 = r7.x0
            int r6 = r6.getId()
            int r12 = r13.b
            r14 = 2
            int r12 = r12 * r14
            r1.o(r6, r15, r12)
            lf9 r6 = r7.w
            int r6 = r6.getId()
            ru.ok.messages.views.widgets.TamAvatarView r12 = r7.x0
            int r12 = r12.getId()
            r14 = 6
            r15 = 7
            r1.e(r6, r14, r12, r15)
            lf9 r6 = r7.w
            int r6 = r6.getId()
            int r12 = r13.b
            r15 = 3
            int r12 = r12 * r15
            r1.o(r6, r14, r12)
            androidx.constraintlayout.widget.ConstraintLayout r6 = r7.c
            ru.ok.messages.views.widgets.TamAvatarView r12 = r7.x0
            r6.addView(r12)
            androidx.constraintlayout.widget.ConstraintLayout r6 = r7.c
            r1.a(r6)
        L_0x0361:
            p7d r1 = r7.A0
            if (r1 != 0) goto L_0x0370
            p7d r1 = new p7d
            n10 r6 = r11.e()
            r1.<init>((defpackage.n10) r6)
            r7.A0 = r1
        L_0x0370:
            p7d r1 = r7.A0
            ru.ok.messages.views.widgets.TamAvatarView r6 = r7.x0
            int r11 = r13.v
            r1.n(r6, r11, r11)
            ru.ok.messages.views.widgets.TamAvatarView r1 = r7.x0
            r6 = 0
            r1.setVisibility(r6)
            ru.ok.messages.views.widgets.TamAvatarView r1 = r7.x0
            r7.c(r1)
        L_0x0384:
            r2 = r6
            goto L_0x05bc
        L_0x0387:
            r1 = 0
            r6 = 0
            r7.c(r1)
            goto L_0x0384
        L_0x038d:
            android.widget.FrameLayout r14 = r7.x
            r14.setVisibility(r6)
            android.widget.FrameLayout r14 = r7.x
            r7.c(r14)
            l20 r1 = r1.F(r6)
            g20 r6 = r1.a
            r14 = 1124859904(0x430c0000, float:140.0)
            if (r6 != r12) goto L_0x03e7
            r13.getClass()
            int r6 = (int) r14
            int r12 = defpackage.vo4.b(r6)
            int r6 = defpackage.vo4.b(r6)
            android.widget.FrameLayout r15 = r7.x
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            r15.width = r12
            r15.height = r6
            android.widget.FrameLayout r6 = r7.x
            r6.setLayoutParams(r15)
            x10 r6 = r1.b
            boolean r12 = r6.v
            if (r12 == 0) goto L_0x03d3
            java.io.File r12 = defpackage.vz.d(r1)
            boolean r15 = r12.exists()
            if (r15 == 0) goto L_0x03d1
            android.net.Uri r12 = android.net.Uri.fromFile(r12)
            goto L_0x03db
        L_0x03d1:
            r12 = 0
            goto L_0x03db
        L_0x03d3:
            java.lang.String r12 = r6.a()
            android.net.Uri r12 = defpackage.po5.s(r12)
        L_0x03db:
            boolean r6 = r6.v
            if (r6 == 0) goto L_0x03e4
            ru.ok.messages.views.widgets.VideoInfoTextView r6 = r7.v0
            r6.k()
        L_0x03e4:
            r6 = r12
            goto L_0x04f4
        L_0x03e7:
            if (r6 == r15) goto L_0x0433
            boolean r6 = defpackage.ld8.Y(r1)
            if (r6 == 0) goto L_0x03f0
            goto L_0x0433
        L_0x03f0:
            g20 r6 = defpackage.g20.w
            g20 r12 = r1.a
            if (r12 != r6) goto L_0x0430
            r13.getClass()
            r6 = 1125122048(0x43100000, float:144.0)
            int r6 = (int) r6
            int r12 = defpackage.vo4.b(r6)
            r15 = 2
            int r12 = r12 / r15
            int r6 = defpackage.vo4.b(r6)
            int r6 = r6 / r15
            android.widget.FrameLayout r15 = r7.x
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            r15.width = r12
            r15.height = r6
            android.widget.FrameLayout r6 = r7.x
            r6.setLayoutParams(r15)
            f20 r6 = r1.f
            java.lang.String r12 = r6.h
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0428
            java.lang.String r6 = r6.h
            android.net.Uri r6 = defpackage.po5.s(r6)
            goto L_0x04f4
        L_0x0428:
            java.lang.String r6 = r6.b
            android.net.Uri r6 = defpackage.po5.s(r6)
            goto L_0x04f4
        L_0x0430:
            r6 = 0
            goto L_0x04f4
        L_0x0433:
            r7.F0 = r1
            r13.getClass()
            int r6 = (int) r14
            int r12 = defpackage.vo4.b(r6)
            int r6 = defpackage.vo4.b(r6)
            android.widget.FrameLayout r15 = r7.x
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            r15.width = r12
            r15.height = r6
            android.widget.FrameLayout r6 = r7.x
            r6.setLayoutParams(r15)
            boolean r6 = defpackage.ld8.Y(r1)
            if (r6 == 0) goto L_0x045d
            s10 r6 = r1.j
            l20 r6 = r6.d
            k20 r6 = r6.d
            goto L_0x045f
        L_0x045d:
            k20 r6 = r1.d
        L_0x045f:
            java.lang.String r12 = r6.c
            android.net.Uri r12 = defpackage.po5.s(r12)
            ru.ok.messages.views.widgets.VideoInfoTextView r15 = r7.v0
            r15.l(r6)
            id3 r15 = defpackage.ym.e()
            qra r15 = (defpackage.qra) r15
            ltb r15 = r15.y()
            boolean r15 = defpackage.ld8.x0(r15, r6)
            if (r15 == 0) goto L_0x04f0
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r15 = r7.z
            r14 = 0
            r15.setVisibility(r14)
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r15 = r7.z
            int r14 = r13.d
            float r14 = (float) r14
            r18 = r12
            r12 = 8
            float[] r2 = new float[r12]
            r12 = 0
            r2[r12] = r14
            r12 = 1
            r2[r12] = r14
            r12 = 2
            r2[r12] = r14
            r12 = 3
            r2[r12] = r14
            r12 = 4
            r2[r12] = r14
            r12 = 5
            r2[r12] = r14
            r12 = 6
            r2[r12] = r14
            r12 = 7
            r2[r12] = r14
            r15.setCorners(r2)
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r2 = r7.z
            r2.J0 = r6
            r2.M()
            or7 r2 = r7.E0
            defpackage.jbd.c(r2)
            id3 r2 = defpackage.ym.e()
            qra r2 = (defpackage.qra) r2
            ltb r2 = r2.y()
            l20 r6 = r7.F0
            boolean r2 = defpackage.ld8.b0(r2, r6)
            if (r2 != 0) goto L_0x04c5
            goto L_0x04f2
        L_0x04c5:
            r14 = 1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            hja r2 = defpackage.jha.p(r14, r2)
            lfd r6 = defpackage.qe.a()
            lja r2 = r2.s(r6)
            td8 r6 = new td8
            r12 = 16
            r6.<init>(r12, r7)
            p79 r12 = new p79
            r14 = 10
            r12.<init>(r14)
            dj6 r14 = defpackage.m58.e
            or7 r15 = new or7
            r15.<init>(r6, r12, r14)
            r2.a(r15)
            r7.E0 = r15
            goto L_0x04f2
        L_0x04f0:
            r18 = r12
        L_0x04f2:
            r6 = r18
        L_0x04f4:
            if (r6 == 0) goto L_0x0567
            boolean r2 = defpackage.ld8.g0(r1, r10)
            android.content.Context r19 = r7.getContext()
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r12 = r7.y
            gv4 r21 = r12.getController()
            r13.getClass()
            r12 = 1124859904(0x430c0000, float:140.0)
            int r12 = (int) r12
            int r22 = defpackage.vo4.b(r12)
            int r23 = defpackage.vo4.b(r12)
            r20 = r6
            r24 = r2
            jnb r12 = defpackage.ryg.q(r19, r20, r21, r22, r23, r24)
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r14 = r7.y
            r14.setNeedToDrawSensitiveWarningIcon(r2)
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r2 = r7.y
            r2.setController(r12)
            boolean r2 = r11.F()
            if (r2 != 0) goto L_0x054a
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r2 = r7.y
            lv4 r2 = r2.getHierarchy()
            sp6 r2 = (defpackage.sp6) r2
            int r11 = r13.d
            float r11 = (float) r11
            b9d r12 = new b9d
            r12.<init>()
            r13 = 8
            float[] r14 = new float[r13]
            r12.c = r14
            java.util.Arrays.fill(r14, r11)
            r11 = 1
            r12.h = r11
            r2.n(r12)
            goto L_0x0567
        L_0x054a:
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r2 = r7.y
            lv4 r2 = r2.getHierarchy()
            sp6 r2 = (defpackage.sp6) r2
            b9d r11 = new b9d
            r11.<init>()
            r12 = 8
            float[] r13 = new float[r12]
            r11.c = r13
            r12 = 0
            java.util.Arrays.fill(r13, r12)
            r12 = 1
            r11.h = r12
            r2.n(r11)
        L_0x0567:
            o20 r2 = r7.b
            boolean r11 = defpackage.ld8.g0(r1, r10)
            android.graphics.drawable.BitmapDrawable r1 = r2.b(r1, r11)
            if (r1 == 0) goto L_0x059b
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r2 = r7.y
            lv4 r2 = r2.getHierarchy()
            sp6 r2 = (defpackage.sp6) r2
            ydd r11 = defpackage.ydd.m
            r12 = 1
            r2.i(r1, r12)
            vdd r2 = r2.f(r12)
            xdd r12 = r2.v
            boolean r12 = defpackage.hsg.k(r12, r11)
            if (r12 == 0) goto L_0x058f
            r11 = 0
            goto L_0x05a8
        L_0x058f:
            r2.v = r11
            r11 = 0
            r2.w = r11
            r2.p()
            r2.invalidateSelf()
            goto L_0x05a8
        L_0x059b:
            r11 = 0
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r2 = r7.y
            lv4 r2 = r2.getHierarchy()
            sp6 r2 = (defpackage.sp6) r2
            r12 = 1
            r2.i(r11, r12)
        L_0x05a8:
            if (r6 != 0) goto L_0x05b6
            if (r1 == 0) goto L_0x05ad
            goto L_0x05b6
        L_0x05ad:
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r1 = r7.y
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x01b4
        L_0x05b6:
            ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon r1 = r7.y
            r2 = 0
            r1.setVisibility(r2)
        L_0x05bc:
            a89 r1 = r10.b()
            if (r1 == 0) goto L_0x05ca
            androidx.appcompat.widget.AppCompatTextView r1 = r7.v
            r1.setVisibility(r2)
            r2 = 8
            goto L_0x05dc
        L_0x05ca:
            androidx.appcompat.widget.AppCompatTextView r1 = r7.v
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x05dc
        L_0x05d2:
            r17 = r6
            r2 = r11
            fe9 r1 = r0.Q0
            if (r1 == 0) goto L_0x05dc
            r1.setVisibility(r2)
        L_0x05dc:
            r0.e(r8)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1
            r1.setVisibility(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.g1
            r1.setVisibility(r2)
            a89 r1 = r8.b()
            if (r1 == 0) goto L_0x0606
            a89 r1 = r8.b()
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x0604
            a89 r1 = r8.b()
            ha9 r1 = r1.a
            int r1 = r1.T0
            r2 = 5
            if (r1 != r2) goto L_0x0606
        L_0x0604:
            r1 = 1
            goto L_0x0607
        L_0x0606:
            r1 = 0
        L_0x0607:
            ha9 r2 = r8.a
            if (r30 != 0) goto L_0x0613
            if (r1 != 0) goto L_0x0613
            z12 r6 = r0.R0
            if (r6 != 0) goto L_0x0613
            goto L_0x0714
        L_0x0613:
            boolean r6 = r2.p()
            if (r6 == 0) goto L_0x061b
            goto L_0x0714
        L_0x061b:
            z12 r6 = r0.R0
            if (r6 != 0) goto L_0x066c
            z12 r6 = new z12
            android.content.Context r7 = r25.getContext()
            r10 = 0
            r11 = 0
            r6.<init>(r7, r10, r11, r11)
            int r10 = defpackage.ujc.view_channel_message_status
            android.view.View.inflate(r7, r10, r6)
            android.content.Context r7 = r6.getContext()
            scf r7 = defpackage.j4b.k0(r7)
            r6.c = r7
            int r7 = defpackage.lic.view_channel_message_status__tv_views
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.b = r7
            int r7 = defpackage.lic.view_channel_message_status__iv_views
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.a = r7
            int r7 = defpackage.lic.view_channel_message_status__divider
            android.view.View r7 = r6.findViewById(r7)
            r6.o = r7
            r0.R0 = r6
            r7 = 80
            r6.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            r7 = 16
            r6.gravity = r7
            z12 r7 = r0.R0
            r10 = 0
            r4.addView(r7, r10, r6)
        L_0x066c:
            z12 r6 = r0.R0
            if (r1 != 0) goto L_0x0676
            if (r30 == 0) goto L_0x0673
            goto L_0x0676
        L_0x0673:
            r7 = 8
            goto L_0x0677
        L_0x0676:
            r7 = 0
        L_0x0677:
            r6.setVisibility(r7)
            if (r1 != 0) goto L_0x067e
            if (r30 == 0) goto L_0x0714
        L_0x067e:
            boolean r1 = r25.x()
            if (r1 != 0) goto L_0x068a
            boolean r1 = r25.m()
            if (r1 == 0) goto L_0x0692
        L_0x068a:
            boolean r1 = r2.F()
            if (r1 != 0) goto L_0x0692
            r1 = 1
            goto L_0x0693
        L_0x0692:
            r1 = 0
        L_0x0693:
            z12 r6 = r0.R0
            scf r7 = r6.c
            if (r1 == 0) goto L_0x069c
            int r1 = r7.u
            goto L_0x069e
        L_0x069c:
            int r1 = r7.w
        L_0x069e:
            android.widget.ImageView r7 = r6.a
            r7.setColorFilter(r1)
            android.widget.TextView r7 = r6.b
            r7.setTextColor(r1)
            android.view.View r6 = r6.o
            r6.setBackgroundColor(r1)
            oa9 r1 = defpackage.oa9.SENDING
            oa9 r6 = r2.X
            if (r6 != r1) goto L_0x06b5
            r1 = 0
            goto L_0x06b6
        L_0x06b5:
            r1 = 1
        L_0x06b6:
            int r6 = r2.F0
            if (r6 != 0) goto L_0x06cc
            a89 r10 = r8.b()
            if (r10 == 0) goto L_0x06cc
            a89 r10 = r8.b()
            ha9 r10 = r10.a
            int r10 = r10.F0
            int r6 = java.lang.Math.max(r6, r10)
        L_0x06cc:
            int r1 = java.lang.Math.max(r1, r6)
            int r6 = defpackage.fhf.a
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r1 >= r6) goto L_0x06db
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0711
        L_0x06db:
            r6 = 1000000(0xf4240, float:1.401298E-39)
            java.lang.String r10 = "%1.1f%s"
            if (r1 >= r6) goto L_0x06fa
            java.util.Locale r6 = java.util.Locale.ENGLISH
            double r11 = (double) r1
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r11 = r11 / r13
            java.lang.Double r1 = java.lang.Double.valueOf(r11)
            java.lang.String r11 = "K"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r11}
            java.lang.String r1 = java.lang.String.format(r6, r10, r1)
            goto L_0x0711
        L_0x06fa:
            java.util.Locale r6 = java.util.Locale.ENGLISH
            double r11 = (double) r1
            r13 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r11 = r11 / r13
            java.lang.Double r1 = java.lang.Double.valueOf(r11)
            java.lang.String r11 = "M"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r11}
            java.lang.String r1 = java.lang.String.format(r6, r10, r1)
        L_0x0711:
            r7.setText(r1)
        L_0x0714:
            boolean r1 = r0.W0
            if (r1 == 0) goto L_0x0776
            mc9 r1 = r8.c
            if (r1 != 0) goto L_0x0780
            boolean r1 = r2.F()
            if (r1 != 0) goto L_0x0776
            boolean r1 = r2.B()
            if (r1 != 0) goto L_0x0776
            of9 r1 = r0.U0
            a89 r1 = r1.a
            ha9 r1 = r1.a
            boolean r1 = r1.w()
            if (r1 != 0) goto L_0x0779
            of9 r1 = r0.U0
            a89 r1 = r1.a
            ha9 r1 = r1.a
            boolean r1 = r1.E()
            if (r1 != 0) goto L_0x0779
            of9 r1 = r0.U0
            a89 r1 = r1.a
            ha9 r1 = r1.a
            boolean r1 = r1.A()
            if (r1 != 0) goto L_0x0779
            of9 r1 = r0.U0
            a89 r1 = r1.a
            ha9 r1 = r1.a
            boolean r1 = r1.y()
            if (r1 != 0) goto L_0x0779
            of9 r1 = r0.U0
            a89 r1 = r1.a
            ha9 r1 = r1.a
            boolean r1 = r1.x()
            if (r1 == 0) goto L_0x076d
            a32 r1 = r0.V0
            boolean r1 = r1.L()
            if (r1 == 0) goto L_0x076d
            goto L_0x0779
        L_0x076d:
            java.lang.String r1 = r2.y
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0776
            goto L_0x0779
        L_0x0776:
            r1 = 8
            goto L_0x07c7
        L_0x0779:
            boolean r1 = r25.n()
            if (r1 == 0) goto L_0x0780
            goto L_0x0776
        L_0x0780:
            boolean r1 = r27.K()
            if (r1 == 0) goto L_0x0799
            int r1 = r2.T0
            r6 = 4
            if (r1 != r6) goto L_0x0795
            ws0 r1 = r0.a1
            zs0 r1 = r1.b
            int r1 = r1.g
            r5.setTextColor(r1)
            goto L_0x079c
        L_0x0795:
            r0.setSenderTextColor(r8)
            goto L_0x079c
        L_0x0799:
            r0.setSenderTextColor(r8)
        L_0x079c:
            ro4 r1 = r0.a
            int r1 = r1.k
            r6 = 0
            r5.setPadding(r1, r6, r1, r6)
            boolean r1 = r27.K()
            if (r1 == 0) goto L_0x07b9
            boolean r1 = r8.e()
            if (r1 == 0) goto L_0x07b9
            java.lang.String r1 = r27.r()
            r5.setText(r1)
        L_0x07b7:
            r1 = 0
            goto L_0x07c3
        L_0x07b9:
            gsb r1 = r8.v
            java.lang.CharSequence r1 = r1.b()
            r5.setText(r1)
            goto L_0x07b7
        L_0x07c3:
            r5.setVisibility(r1)
            goto L_0x07ca
        L_0x07c7:
            r5.setVisibility(r1)
        L_0x07ca:
            of9 r1 = r0.U0
            a89 r1 = r1.a
            mc9 r1 = r1.c
            if (r1 == 0) goto L_0x08f5
            int r1 = r1.a
            r5 = 2
            if (r1 != r5) goto L_0x08f5
            id3 r1 = defpackage.ym.e()
            qra r1 = (defpackage.qra) r1
            eaf r1 = r1.F()
            r1.getClass()
            defpackage.eaf.b()
            of9 r1 = r0.U0
            a89 r1 = r1.a
            mc9 r1 = r1.c
            if (r1 == 0) goto L_0x07fc
            int r5 = r1.a
            r6 = 2
            if (r5 == r6) goto L_0x07f5
            goto L_0x07fc
        L_0x07f5:
            a89 r1 = r1.c
            vk3 r1 = r1.b
            r1.r()
        L_0x07fc:
            lb9 r1 = r0.P0
            if (r1 != 0) goto L_0x081a
            lb9 r1 = new lb9
            android.content.Context r5 = r25.getContext()
            r1.<init>(r5)
            r0.P0 = r1
            r1.setListener(r0)
            lb9 r1 = r0.P0
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r6 = -2
            r5.<init>(r6, r6)
            r6 = 1
            r0.addView(r1, r6, r5)
        L_0x081a:
            lb9 r1 = r0.P0
            r5 = 0
            r1.setVisibility(r5)
            lb9 r1 = r0.P0
            of9 r5 = r0.U0
            a89 r5 = r5.a
            r1.getClass()
            id3 r6 = defpackage.ym.e()
            long r6 = r6.a()
            r1.v = r6
            mc9 r6 = r5.c
            java.lang.String r6 = r6.d
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            mc9 r7 = r5.c
            if (r6 != 0) goto L_0x0856
            a89 r6 = r7.c
            ha9 r6 = r6.a
            int r6 = r6.T0
            r8 = 2
            if (r6 == r8) goto L_0x0856
            androidx.appcompat.widget.AppCompatTextView r6 = r1.c
            java.lang.String r7 = r7.d
            r6.setText(r7)
            androidx.appcompat.widget.AppCompatImageView r6 = r1.o
            r7 = 0
            r6.setVisibility(r7)
            goto L_0x088a
        L_0x0856:
            a89 r6 = r7.c
            vk3 r6 = r6.b
            long r10 = r6.r()
            long r12 = r1.v
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x086c
            androidx.appcompat.widget.AppCompatTextView r6 = r1.c
            int r7 = defpackage.jad.H
            r6.setText(r7)
            goto L_0x0883
        L_0x086c:
            androidx.appcompat.widget.AppCompatTextView r6 = r1.c
            a89 r7 = r7.c
            vk3 r7 = r7.b
            id3 r8 = defpackage.ym.e()
            qra r8 = (defpackage.qra) r8
            yva r8 = r8.v()
            java.lang.CharSequence r7 = r7.p(r8)
            r6.setText(r7)
        L_0x0883:
            androidx.appcompat.widget.AppCompatImageView r6 = r1.o
            r7 = 8
            r6.setVisibility(r7)
        L_0x088a:
            android.content.Context r6 = r1.getContext()
            fu4 r6 = r9.e(r6)
            k2b r6 = r6.f()
            hq2 r6 = r6.a()
            boolean r5 = r5.f()
            if (r5 == 0) goto L_0x08c8
            androidx.appcompat.widget.AppCompatTextView r5 = r1.b
            ws0 r7 = r6.e()
            zs0 r7 = r7.b
            int r7 = r7.j
            r5.setTextColor(r7)
            androidx.appcompat.widget.AppCompatImageView r5 = r1.o
            ws0 r7 = r6.e()
            zs0 r7 = r7.b
            int r7 = r7.k
            r5.setColorFilter(r7)
            androidx.appcompat.widget.AppCompatTextView r1 = r1.c
            ws0 r5 = r6.e()
            zs0 r5 = r5.b
            int r5 = r5.k
            r1.setTextColor(r5)
            goto L_0x08ef
        L_0x08c8:
            androidx.appcompat.widget.AppCompatTextView r5 = r1.b
            ws0 r7 = r6.i()
            zs0 r7 = r7.b
            int r7 = r7.j
            r5.setTextColor(r7)
            androidx.appcompat.widget.AppCompatImageView r5 = r1.o
            ws0 r7 = r6.i()
            zs0 r7 = r7.b
            int r7 = r7.k
            r5.setColorFilter(r7)
            androidx.appcompat.widget.AppCompatTextView r1 = r1.c
            ws0 r5 = r6.i()
            zs0 r5 = r5.b
            int r5 = r5.k
            r1.setTextColor(r5)
        L_0x08ef:
            r1 = r26
            r5 = r28
            r6 = 0
            goto L_0x08ff
        L_0x08f5:
            lb9 r1 = r0.P0
            if (r1 == 0) goto L_0x08ef
            r5 = 8
            r1.setVisibility(r5)
            goto L_0x08ef
        L_0x08ff:
            r0.d(r1, r5, r3, r6)
            qe9 r1 = r2.Y
            qe9 r3 = defpackage.qe9.EDITED
            if (r1 != r3) goto L_0x0916
            a32 r1 = r0.V0
            boolean r1 = r1.K()
            if (r1 != 0) goto L_0x0916
            int r1 = r2.N0
            r3 = 1
            r1 = r1 & r3
            if (r1 != r3) goto L_0x091b
        L_0x0916:
            r3 = r17
            r1 = 8
            goto L_0x0944
        L_0x091b:
            boolean r1 = r2.B()
            if (r1 != 0) goto L_0x0916
            r3 = r17
            r1 = 0
            r3.setVisibility(r1)
            boolean r1 = r25.x()
            if (r1 == 0) goto L_0x0934
            ws0 r1 = r0.a1
            xs0 r1 = r1.c
            int r1 = r1.b
            goto L_0x093a
        L_0x0934:
            ws0 r1 = r0.a1
            xs0 r1 = r1.c
            int r1 = r1.a
        L_0x093a:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r3.setImageTintList(r1)
            r1 = 8
            goto L_0x0947
        L_0x0944:
            r3.setVisibility(r1)
        L_0x0947:
            boolean r3 = r2.v()
            r5 = -1
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r3 != 0) goto L_0x0965
            ru.ok.messages.secret.widgets.TimerView r2 = r0.S0
            if (r2 == 0) goto L_0x09ec
            r2.setVisibility(r1)
            ru.ok.messages.secret.widgets.TimerView r1 = r0.S0
            r1.b(r7)
            r1.x = r5
            r1.y = r5
            r1.z = r5
            goto L_0x09ec
        L_0x0965:
            ru.ok.messages.secret.widgets.TimerView r1 = r0.S0
            if (r1 != 0) goto L_0x0992
            ru.ok.messages.secret.widgets.TimerView r1 = new ru.ok.messages.secret.widgets.TimerView
            android.content.Context r3 = r25.getContext()
            r8 = 0
            r1.<init>(r3, r8)
            r0.S0 = r1
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r1.<init>(r3, r3)
            r3 = 16
            r1.gravity = r3
            ru.ok.messages.secret.widgets.TimerView r3 = r0.S0
            r4.addView(r3, r1)
            ru.ok.messages.secret.widgets.TimerView r1 = r0.S0
            int r3 = r0.w0
            defpackage.iq.N(r1, r3)
            ru.ok.messages.secret.widgets.TimerView r1 = r0.S0
            int r3 = defpackage.nad.e
            r1.setImageResource(r3)
        L_0x0992:
            boolean r1 = r25.x()
            if (r1 != 0) goto L_0x09a6
            boolean r1 = r25.n()
            if (r1 == 0) goto L_0x099f
            goto L_0x09a6
        L_0x099f:
            ws0 r1 = r0.a1
            zs0 r1 = r1.b
            int r1 = r1.f
            goto L_0x09ac
        L_0x09a6:
            a93 r1 = r0.Z0
            o93 r1 = r1.b
            int r1 = r1.a
        L_0x09ac:
            ru.ok.messages.secret.widgets.TimerView r3 = r0.S0
            r3.setArrorColor(r1)
            ru.ok.messages.secret.widgets.TimerView r3 = r0.S0
            r3.setupColorsFrom(r1)
            ru.ok.messages.secret.widgets.TimerView r1 = r0.S0
            r3 = 0
            r1.setVisibility(r3)
            long r9 = r2.L0
            r3 = 0
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x09d0
            ru.ok.messages.secret.widgets.TimerView r1 = r0.S0
            r1.b(r7)
            r1.x = r5
            r1.y = r5
            r1.z = r5
            goto L_0x09ec
        L_0x09d0:
            ru.ok.messages.secret.widgets.TimerView r8 = r0.S0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            int r2 = r2.K0
            long r2 = (long) r2
            long r1 = r1.toMillis(r2)
            long r11 = r1 + r9
            ym r1 = defpackage.ym.v
            ltb r1 = r1.c()
            a33 r1 = r1.a
            long r13 = r1.m()
            r8.a(r9, r11, r13)
        L_0x09ec:
            r25.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg9.f(int, a32, of9, boolean, boolean):void");
    }

    public final void g(Drawable drawable, boolean z2) {
        this.H0.setVisibility(drawable == null ? 8 : 0);
        if (drawable != null) {
            this.H0.setImageDrawable(drawable);
            if (!z2) {
                this.H0.setImageTintList(ColorStateList.valueOf((x() || n()) ? this.a1.c.b : this.a1.c.a));
            }
        }
    }

    public View getContent() {
        return (!u() || q()) ? this : this.M0;
    }

    public Rect getHighlightTextPosition() {
        w();
        return null;
    }

    public p89 getMessageAttachmentsView() {
        return t() ? this.N0.getMediaView() : ld8.Y(this.U0.a.a.a(g20.X)) ? this.K0.getMessageAttachmentsView() : this.I0.getView();
    }

    public Drawable getMessageBackground() {
        if (!m()) {
            return getBackground();
        }
        if (u()) {
            return this.M0.getBackground();
        }
        if (!w() || !n()) {
            return null;
        }
        return this.D0.getBackground();
    }

    public StickerView getStickerView() {
        ve9 ve9 = this.M0;
        if (ve9 == null) {
            return null;
        }
        return ve9.getStickerView();
    }

    public a89 getViewMessage() {
        return this.U0.a;
    }

    public final void h() {
        if (this.H0 != null) {
            ro4 ro4 = this.a;
            int i = ro4.n;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(x() ? ro4.b : ro4.d);
            this.H0.setLayoutParams(layoutParams);
        }
    }

    public final void i(a32 a32, a89 a89) {
        if (TextUtils.isEmpty(a89.a.y) || a89.a.F()) {
            this.D0.setVisibility(8);
        } else if (this.n1 != null) {
            this.D0.setVisibility(0);
            jf9 e = this.n1.e(a32, a89, h88.M(this), false);
            if (this.h1 == null && !a89.a().isEmpty()) {
                hk hkVar = new hk(this.D0, 0);
                this.h1 = hkVar;
                hkVar.a();
            }
            boolean n = n();
            ro4 ro4 = this.a;
            if (n) {
                if (m()) {
                    this.D0.setPadding(0, 0, 0, 0);
                } else {
                    lf9 lf9 = this.D0;
                    int i = ro4.k;
                    lf9.setPadding(i, 0, i, 0);
                    setClipToPadding(false);
                }
                this.D0.setLayout(e);
                return;
            }
            e.a().getPaint().setColor(this.a1.b.d);
            lf9 lf92 = this.D0;
            int i2 = ro4.k;
            lf92.setPadding(i2, 0, i2, 0);
            setClipToPadding(false);
            this.D0.setLayout(e);
        }
    }

    public final boolean j() {
        Layout layout;
        if (this.D0.getVisibility() != 0 || this.U0.a.a.o() || (layout = this.D0.getLayout()) == null) {
            return false;
        }
        int measuredWidth = this.E0.getMeasuredWidth();
        int lineCount = layout.getLineCount();
        return lineCount == 1 ? ((this.D0.getMeasuredWidth() + measuredWidth) - this.D0.getPaddingEnd()) + this.w0 < this.c1 : ct.y(getContext()) ? layout.getWidth() + measuredWidth < this.D0.getMeasuredWidth() : (layout.getLineRight(lineCount - 1) + ((float) measuredWidth)) + ((float) this.D0.getPaddingLeft()) < ((float) this.D0.getMeasuredWidth());
    }

    public final boolean k() {
        MessageAttachmentsLayout messageAttachmentsLayout = this.I0;
        return (messageAttachmentsLayout == null || messageAttachmentsLayout.getVisibility() == 8) ? false : true;
    }

    public final boolean l() {
        AudioAttachView audioAttachView = this.J0;
        return audioAttachView != null && audioAttachView.getVisibility() == 0;
    }

    public final boolean m() {
        a89 a89 = this.U0.a;
        a32 a32 = this.V0;
        ha9 ha9 = a89.a;
        return (ha9.F() || (!TextUtils.isEmpty(a89.v.c(a32)) && ha9.b() == 0)) && a89.c == null;
    }

    public final boolean n() {
        a89 a89 = this.U0.a;
        return !TextUtils.isEmpty(a89.v.c(this.V0));
    }

    public final boolean o() {
        FileAttachView fileAttachView = this.K0;
        return fileAttachView != null && fileAttachView.getVisibility() == 0;
    }

    public final void onAttachedToWindow() {
        of9 of9;
        super.onAttachedToWindow();
        if (this.h1 == null && this.D0 != null && (of9 = this.U0) != null && !of9.a.a().isEmpty()) {
            hk hkVar = new hk(this.D0);
            this.h1 = hkVar;
            hkVar.a();
        }
        hk hkVar2 = this.h1;
        if (hkVar2 != null && hkVar2.c) {
            this.h1.a();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hk hkVar = this.h1;
        if (hkVar != null) {
            hkVar.c = true;
            hk.o.removeCallbacks(hkVar);
            this.h1 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.getPaddingStart()
            int r12 = r10.getPaddingTop()
            boolean r13 = r10.j()
            boolean r14 = r10.s()
            int r15 = r10.c
            if (r14 == 0) goto L_0x0032
            int r12 = r12 + r15
            androidx.appcompat.widget.AppCompatTextView r4 = r10.C0
            int r14 = r4.getMeasuredWidth()
            int r2 = r14 + r11
            androidx.appcompat.widget.AppCompatTextView r14 = r10.C0
            int r14 = r14.getMeasuredHeight()
            int r3 = r14 + r12
            r0 = r11
            r1 = r12
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            androidx.appcompat.widget.AppCompatTextView r14 = r10.C0
            int r14 = r14.getMeasuredHeight()
            int r12 = r12 + r14
        L_0x0032:
            boolean r14 = r10.q()
            ro4 r6 = r10.a
            if (r14 == 0) goto L_0x006e
            boolean r14 = r10.r()
            if (r14 == 0) goto L_0x0043
            fe9 r14 = r10.Q0
            goto L_0x0045
        L_0x0043:
            lb9 r14 = r10.P0
        L_0x0045:
            androidx.appcompat.widget.AppCompatTextView r0 = r10.C0
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x004f
            int r12 = r12 + r15
            goto L_0x0052
        L_0x004f:
            int r0 = r6.b
            int r12 = r12 + r0
        L_0x0052:
            int r0 = r6.b
            int r0 = r0 + r11
            int r1 = r14.getMeasuredWidth()
            int r1 = r1 + r11
            int r2 = r6.b
            int r2 = r2 + r1
            int r1 = r14.getMeasuredHeight()
            int r3 = r1 + r12
            r1 = r12
            r4 = r14
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            int r14 = r14.getMeasuredHeight()
            int r12 = r12 + r14
        L_0x006e:
            boolean r14 = r10.n()
            boolean r0 = r10.w()
            int r7 = r10.v0
            int r8 = r10.z
            if (r0 == 0) goto L_0x0123
            if (r14 == 0) goto L_0x009a
            boolean r0 = r10.m()
            if (r0 == 0) goto L_0x009a
            lf9 r4 = r10.D0
            int r13 = r4.getMeasuredWidth()
            int r2 = r13 + r11
            lf9 r13 = r10.D0
            int r3 = r13.getMeasuredHeight()
            r1 = 0
            r0 = r11
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            goto L_0x0123
        L_0x009a:
            boolean r0 = r10.q()
            if (r0 == 0) goto L_0x00a4
            int r0 = r6.c
        L_0x00a2:
            int r12 = r12 + r0
            goto L_0x00af
        L_0x00a4:
            boolean r0 = r10.W0
            if (r0 != 0) goto L_0x00af
            if (r13 == 0) goto L_0x00ac
            r0 = r8
            goto L_0x00a2
        L_0x00ac:
            int r0 = r10.o
            goto L_0x00a2
        L_0x00af:
            boolean r0 = r10.q()
            if (r0 == 0) goto L_0x00e7
            if (r14 == 0) goto L_0x00e7
            boolean r0 = r10.r()
            if (r0 == 0) goto L_0x00c0
            fe9 r0 = r10.Q0
            goto L_0x00c2
        L_0x00c0:
            lb9 r0 = r10.P0
        L_0x00c2:
            int r0 = r0.getMeasuredWidth()
            lf9 r1 = r10.D0
            int r1 = r1.getMeasuredWidth()
            int r0 = java.lang.Math.max(r0, r1)
            android.widget.LinearLayout r1 = r10.E0
            int r1 = r1.getMeasuredWidth()
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = r0 / 2
            int r0 = r0 + r11
            lf9 r1 = r10.D0
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 / 2
            int r0 = r0 - r1
            goto L_0x00e8
        L_0x00e7:
            r0 = r11
        L_0x00e8:
            lf9 r4 = r10.D0
            int r1 = r4.getMeasuredWidth()
            int r2 = r1 + r0
            lf9 r1 = r10.D0
            int r1 = r1.getMeasuredHeight()
            int r3 = r1 + r12
            r1 = r12
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            lf9 r0 = r10.D0
            int r0 = r0.getMeasuredHeight()
            int r12 = r12 + r0
            if (r13 == 0) goto L_0x0108
            int r12 = r12 + r7
            goto L_0x0123
        L_0x0108:
            boolean r13 = r10.t()
            if (r13 != 0) goto L_0x0123
            boolean r13 = r10.k()
            if (r13 != 0) goto L_0x0123
            boolean r13 = r10.p()
            if (r13 != 0) goto L_0x0123
            boolean r13 = r10.o()
            if (r13 != 0) goto L_0x0123
            int r13 = r10.v
            int r12 = r12 + r13
        L_0x0123:
            boolean r13 = r10.l()
            int r9 = r10.y
            if (r13 == 0) goto L_0x015b
            boolean r13 = r10.q()
            if (r13 != 0) goto L_0x013b
            boolean r13 = r10.W0
            if (r13 != 0) goto L_0x0139
            int r13 = r6.j
            int r12 = r12 + r13
            goto L_0x013c
        L_0x0139:
            int r12 = r12 + r8
            goto L_0x013c
        L_0x013b:
            int r12 = r12 + r9
        L_0x013c:
            ru.ok.messages.media.attaches.AudioAttachView r4 = r10.J0
            int r13 = r4.getMeasuredWidth()
            int r2 = r13 + r11
            ru.ok.messages.media.attaches.AudioAttachView r13 = r10.J0
            int r13 = r13.getMeasuredHeight()
            int r3 = r13 + r12
            r0 = r11
            r1 = r12
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            ru.ok.messages.media.attaches.AudioAttachView r13 = r10.J0
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r12
            int r12 = r13 + r9
        L_0x015b:
            l01 r13 = r10.O0
            if (r13 == 0) goto L_0x0185
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x0185
            int r12 = r12 + r8
            l01 r4 = r10.O0
            int r13 = r4.getMeasuredWidth()
            int r2 = r13 + r11
            l01 r13 = r10.O0
            int r13 = r13.getMeasuredHeight()
            int r3 = r13 + r12
            r0 = r11
            r1 = r12
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            l01 r13 = r10.O0
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r12
            int r12 = r13 + r7
        L_0x0185:
            boolean r13 = r10.u()
            if (r13 == 0) goto L_0x01c8
            boolean r13 = r10.q()
            if (r13 == 0) goto L_0x0192
            int r12 = r12 + r9
        L_0x0192:
            ve9 r4 = r10.M0
            int r13 = r10.getMeasuredWidth()
            int r13 = r13 / 2
            ve9 r0 = r10.M0
            int r0 = r0.getMeasuredWidth()
            int r0 = r0 / 2
            int r0 = r13 - r0
            int r13 = r10.getMeasuredWidth()
            int r13 = r13 / 2
            ve9 r1 = r10.M0
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 / 2
            int r2 = r1 + r13
            ve9 r13 = r10.M0
            int r13 = r13.getMeasuredHeight()
            int r3 = r13 + r12
            r1 = r12
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            ve9 r13 = r10.M0
            int r13 = r13.getMeasuredHeight()
            int r12 = r12 + r13
        L_0x01c8:
            boolean r13 = r10.o()
            if (r13 == 0) goto L_0x0209
            boolean r13 = r10.q()
            if (r13 != 0) goto L_0x01e3
            boolean r13 = r10.W0
            if (r13 != 0) goto L_0x01e1
            boolean r13 = r10.w()
            if (r13 == 0) goto L_0x01df
            goto L_0x01e1
        L_0x01df:
            int r12 = r12 + r9
            goto L_0x01ea
        L_0x01e1:
            int r12 = r12 + r8
            goto L_0x01ea
        L_0x01e3:
            boolean r13 = r10.w()
            if (r13 != 0) goto L_0x01e1
            goto L_0x01df
        L_0x01ea:
            ru.ok.messages.media.attaches.FileAttachView r4 = r10.K0
            int r13 = r4.getMeasuredWidth()
            int r2 = r13 + r11
            ru.ok.messages.media.attaches.FileAttachView r13 = r10.K0
            int r13 = r13.getMeasuredHeight()
            int r3 = r13 + r12
            r0 = r11
            r1 = r12
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            ru.ok.messages.media.attaches.FileAttachView r13 = r10.K0
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r12
            int r12 = r13 + r9
        L_0x0209:
            gl3 r13 = r10.L0
            if (r13 == 0) goto L_0x024f
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x024f
            boolean r13 = r10.r()
            if (r13 == 0) goto L_0x021d
            int r13 = r6.e
        L_0x021b:
            int r12 = r12 + r13
            goto L_0x0231
        L_0x021d:
            lb9 r13 = r10.P0
            if (r13 == 0) goto L_0x022a
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x022a
            int r13 = r6.b
            goto L_0x021b
        L_0x022a:
            boolean r13 = r10.W0
            if (r13 == 0) goto L_0x0231
            int r13 = r6.b
            int r12 = r12 - r13
        L_0x0231:
            gl3 r4 = r10.L0
            int r13 = r4.getMeasuredWidth()
            int r2 = r13 + r11
            gl3 r13 = r10.L0
            int r13 = r13.getMeasuredHeight()
            int r3 = r13 + r12
            r0 = r11
            r1 = r12
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            gl3 r13 = r10.L0
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r9
            int r12 = r12 + r13
        L_0x024f:
            boolean r13 = r10.t()
            if (r13 == 0) goto L_0x0290
            boolean r13 = r10.w()
            if (r13 == 0) goto L_0x025d
        L_0x025b:
            int r12 = r12 + r9
            goto L_0x026d
        L_0x025d:
            boolean r13 = r10.q()
            if (r13 == 0) goto L_0x0264
            goto L_0x025b
        L_0x0264:
            androidx.appcompat.widget.AppCompatTextView r13 = r10.C0
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x025b
            int r12 = r12 + r15
        L_0x026d:
            int r13 = r10.x
            int r0 = r11 + r13
            ru.ok.messages.media.attaches.ShareAttachView r4 = r10.N0
            int r13 = r4.getMeasuredWidth()
            int r2 = r13 + r0
            ru.ok.messages.media.attaches.ShareAttachView r13 = r10.N0
            int r13 = r13.getMeasuredHeight()
            int r3 = r13 + r12
            r1 = r12
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            ru.ok.messages.media.attaches.ShareAttachView r13 = r10.N0
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r12
            int r12 = r10.w
            int r12 = r12 + r13
        L_0x0290:
            boolean r13 = r10.p()
            if (r13 == 0) goto L_0x02c9
            boolean r13 = r10.w()
            if (r13 == 0) goto L_0x029e
        L_0x029c:
            int r12 = r12 + r9
            goto L_0x02ac
        L_0x029e:
            boolean r13 = r10.q()
            if (r13 == 0) goto L_0x02a5
            goto L_0x029c
        L_0x02a5:
            boolean r13 = r10.s()
            if (r13 == 0) goto L_0x02ac
            int r12 = r12 + r15
        L_0x02ac:
            q58 r4 = r10.T0
            int r13 = r4.getMeasuredWidth()
            int r2 = r13 + r11
            q58 r13 = r10.T0
            int r13 = r13.getMeasuredHeight()
            int r3 = r13 + r12
            r0 = r11
            r1 = r12
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            q58 r13 = r10.T0
            int r13 = r13.getMeasuredHeight()
            int r12 = r12 + r13
        L_0x02c9:
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r13 = r10.I0
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x0303
            boolean r13 = r10.w()
            if (r13 == 0) goto L_0x02da
        L_0x02d7:
            int r12 = r12 + r9
        L_0x02d8:
            r1 = r12
            goto L_0x02e9
        L_0x02da:
            boolean r13 = r10.q()
            if (r13 == 0) goto L_0x02e1
            goto L_0x02d7
        L_0x02e1:
            boolean r13 = r10.s()
            if (r13 == 0) goto L_0x02d8
            int r12 = r12 + r15
            goto L_0x02d8
        L_0x02e9:
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r4 = r10.I0
            int r12 = r4.getMeasuredWidth()
            int r2 = r12 + r11
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r12 = r10.I0
            int r12 = r12.getMeasuredHeight()
            int r3 = r12 + r1
            r0 = r11
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r11 = r10.I0
            r11.getMeasuredHeight()
        L_0x0303:
            android.widget.LinearLayout r11 = r10.E0
            int r11 = r11.getVisibility()
            if (r11 != 0) goto L_0x03ab
            boolean r11 = r10.k()
            int r12 = r10.w0
            if (r11 == 0) goto L_0x032e
            of9 r11 = r10.U0
            a89 r11 = r11.a
            ha9 r11 = r11.a
            w28 r11 = r11.x0
            int r13 = r11.G()
            int r13 = r13 + -1
            l20 r11 = r11.F(r13)
            boolean r11 = defpackage.ld8.w(r11)
            if (r11 == 0) goto L_0x032e
            int r11 = r10.x0
            goto L_0x032f
        L_0x032e:
            r11 = r12
        L_0x032f:
            boolean r13 = r10.u()
            if (r13 != 0) goto L_0x0356
            if (r14 == 0) goto L_0x0338
            goto L_0x0356
        L_0x0338:
            int r13 = r10.getMeasuredHeight()
            android.widget.LinearLayout r14 = r10.E0
            int r14 = r14.getMeasuredHeight()
            int r13 = r13 - r14
            int r13 = r13 - r11
            int r14 = r10.getPaddingBottom()
            int r13 = r13 - r14
            int r14 = r10.getMeasuredHeight()
            int r14 = r14 - r11
            int r11 = r10.getPaddingBottom()
        L_0x0352:
            int r14 = r14 - r11
            r1 = r13
            r3 = r14
            goto L_0x0388
        L_0x0356:
            boolean r13 = r10.q()
            if (r13 == 0) goto L_0x0372
            int r13 = r10.getMeasuredHeight()
            android.widget.LinearLayout r14 = r10.E0
            int r14 = r14.getMeasuredHeight()
            int r13 = r13 - r14
            int r13 = r13 - r11
            int r14 = r10.getMeasuredHeight()
            int r14 = r14 - r11
            int r11 = r10.getPaddingBottom()
            goto L_0x0352
        L_0x0372:
            int r13 = r10.getMeasuredHeight()
            android.widget.LinearLayout r14 = r10.E0
            int r14 = r14.getMeasuredHeight()
            int r13 = r13 - r14
            int r13 = r13 - r11
            int r14 = r10.getPaddingBottom()
            int r13 = r13 + r14
            int r14 = r10.getMeasuredHeight()
            goto L_0x0352
        L_0x0388:
            android.widget.LinearLayout r4 = r10.E0
            int r11 = r10.getMeasuredWidth()
            android.widget.LinearLayout r13 = r10.E0
            int r13 = r13.getMeasuredWidth()
            int r11 = r11 - r13
            int r11 = r11 - r12
            int r13 = r10.getPaddingEnd()
            int r0 = r11 - r13
            int r11 = r10.getMeasuredWidth()
            int r11 = r11 - r12
            int r12 = r10.getPaddingEnd()
            int r2 = r11 - r12
            r5 = r10
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
        L_0x03ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg9.onLayout(boolean, int, int, int, int):void");
    }

    public final boolean onLongClick(View view) {
        t3a t3a = this.b1;
        if (t3a == null) {
            return false;
        }
        a89 a89 = this.U0.a;
        t3a.getClass();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r2 = android.view.View.MeasureSpec.getSize(r20)
            int r3 = r19.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r19.getPaddingRight()
            int r2 = r2 - r3
            r0.c1 = r2
            android.content.Context r2 = r19.getContext()
            android.util.Size r2 = defpackage.h88.A(r2)
            int r3 = r0.c1
            int r4 = r2.getWidth()
            int r5 = r2.getHeight()
            int r4 = java.lang.Math.min(r4, r5)
            if (r3 <= r4) goto L_0x003d
            int r3 = r0.c1
            int r4 = r2.getWidth()
            int r4 = r4 * r3
            float r3 = (float) r4
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r3 = r3 / r2
            int r2 = (int) r3
            r0.c1 = r2
        L_0x003d:
            int r2 = r0.c1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            boolean r4 = r19.s()
            int r6 = r0.z0
            int r7 = r0.c
            if (r4 == 0) goto L_0x0078
            boolean r4 = r19.p()
            if (r4 == 0) goto L_0x0065
            androidx.appcompat.widget.AppCompatTextView r4 = r0.C0
            int r8 = r0.c1
            int r8 = java.lang.Math.min(r8, r6)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r4.measure(r8, r1)
            goto L_0x006a
        L_0x0065:
            androidx.appcompat.widget.AppCompatTextView r4 = r0.C0
            r4.measure(r2, r1)
        L_0x006a:
            androidx.appcompat.widget.AppCompatTextView r4 = r0.C0
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r7
            androidx.appcompat.widget.AppCompatTextView r8 = r0.C0
            int r8 = r8.getMeasuredWidth()
            goto L_0x007a
        L_0x0078:
            r4 = 0
            r8 = 0
        L_0x007a:
            boolean r9 = r19.q()
            int r10 = r0.v
            ro4 r11 = r0.a
            if (r9 == 0) goto L_0x0106
            boolean r9 = r19.r()
            if (r9 == 0) goto L_0x008d
            fe9 r9 = r0.Q0
            goto L_0x008f
        L_0x008d:
            lb9 r9 = r0.P0
        L_0x008f:
            androidx.appcompat.widget.AppCompatTextView r12 = r0.C0
            int r12 = r12.getVisibility()
            if (r12 == 0) goto L_0x0099
            int r4 = r4 + r7
            goto L_0x009c
        L_0x0099:
            int r12 = r11.b
            int r4 = r4 + r12
        L_0x009c:
            androidx.appcompat.widget.AppCompatTextView r12 = r0.C0
            r12.measure(r2, r1)
            boolean r12 = r19.p()
            if (r12 == 0) goto L_0x00b5
            int r12 = r0.c1
            int r12 = java.lang.Math.min(r12, r6)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r3)
            r9.measure(r12, r1)
            goto L_0x00b8
        L_0x00b5:
            r9.measure(r2, r1)
        L_0x00b8:
            int r12 = r9.getMeasuredHeight()
            int r12 = r12 + r4
            lf9 r4 = r0.D0
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L_0x00fb
            boolean r4 = r19.x()
            if (r4 != 0) goto L_0x00fb
            boolean r4 = r19.l()
            if (r4 != 0) goto L_0x00fb
            boolean r4 = r19.t()
            if (r4 != 0) goto L_0x00fb
            boolean r4 = r19.o()
            if (r4 != 0) goto L_0x00fb
            gl3 r4 = r0.L0
            if (r4 == 0) goto L_0x00e8
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x00e8
            goto L_0x00fb
        L_0x00e8:
            boolean r4 = r19.k()
            if (r4 != 0) goto L_0x00fb
            boolean r4 = r19.p()
            if (r4 != 0) goto L_0x00fb
            boolean r4 = r19.u()
            if (r4 != 0) goto L_0x00fb
            int r12 = r12 + r10
        L_0x00fb:
            r4 = r12
            int r12 = r9.getMeasuredWidth()
            if (r12 <= r8) goto L_0x0106
            int r8 = r9.getMeasuredWidth()
        L_0x0106:
            android.widget.LinearLayout r9 = r0.E0
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0113
            android.widget.LinearLayout r9 = r0.E0
            r9.measure(r2, r1)
        L_0x0113:
            boolean r9 = r19.n()
            boolean r12 = r19.w()
            int r13 = r0.v0
            int r14 = r0.z
            if (r12 == 0) goto L_0x0193
            lf9 r12 = r0.D0
            r12.measure(r2, r1)
            if (r9 == 0) goto L_0x0141
            boolean r12 = r19.m()
            if (r12 == 0) goto L_0x0141
            lf9 r8 = r0.D0
            int r8 = r8.getMeasuredHeight()
            int r8 = r8 + r4
            lf9 r4 = r0.D0
            int r4 = r4.getMeasuredWidth()
            r18 = r8
            r8 = r4
            r4 = r18
            goto L_0x018e
        L_0x0141:
            boolean r12 = r19.j()
            boolean r15 = r19.q()
            if (r15 == 0) goto L_0x014f
            int r15 = r11.c
        L_0x014d:
            int r4 = r4 + r15
            goto L_0x015a
        L_0x014f:
            boolean r15 = r0.W0
            if (r15 != 0) goto L_0x015a
            if (r12 == 0) goto L_0x0157
            r15 = r14
            goto L_0x014d
        L_0x0157:
            int r15 = r0.o
            goto L_0x014d
        L_0x015a:
            lf9 r15 = r0.D0
            int r15 = r15.getMeasuredHeight()
            int r15 = r15 + r4
            lf9 r4 = r0.D0
            int r4 = r4.getMeasuredWidth()
            if (r4 <= r8) goto L_0x016f
            lf9 r4 = r0.D0
            int r8 = r4.getMeasuredWidth()
        L_0x016f:
            if (r12 == 0) goto L_0x0174
            int r15 = r15 + r13
        L_0x0172:
            r4 = r15
            goto L_0x018e
        L_0x0174:
            boolean r4 = r19.t()
            if (r4 != 0) goto L_0x0172
            boolean r4 = r19.k()
            if (r4 != 0) goto L_0x0172
            boolean r4 = r19.p()
            if (r4 != 0) goto L_0x0172
            boolean r4 = r19.o()
            if (r4 != 0) goto L_0x0172
            int r15 = r15 + r10
            goto L_0x0172
        L_0x018e:
            int r10 = r0.c1
            if (r8 <= r10) goto L_0x0193
            r8 = r10
        L_0x0193:
            boolean r10 = r19.l()
            int r12 = r0.y
            if (r10 == 0) goto L_0x01c9
            ru.ok.messages.media.attaches.AudioAttachView r10 = r0.J0
            r10.measure(r2, r1)
            boolean r10 = r19.q()
            if (r10 != 0) goto L_0x01b0
            boolean r10 = r0.W0
            if (r10 == 0) goto L_0x01ac
            int r4 = r4 + r14
            goto L_0x01b1
        L_0x01ac:
            int r10 = r11.j
            int r4 = r4 + r10
            goto L_0x01b1
        L_0x01b0:
            int r4 = r4 + r12
        L_0x01b1:
            ru.ok.messages.media.attaches.AudioAttachView r10 = r0.J0
            int r10 = r10.getMeasuredHeight()
            int r10 = r10 + r4
            int r4 = r11.j
            int r4 = r4 + r10
            ru.ok.messages.media.attaches.AudioAttachView r10 = r0.J0
            int r10 = r10.getMeasuredWidth()
            if (r10 <= r8) goto L_0x01c9
            ru.ok.messages.media.attaches.AudioAttachView r8 = r0.J0
            int r8 = r8.getMeasuredWidth()
        L_0x01c9:
            l01 r10 = r0.O0
            if (r10 == 0) goto L_0x01d5
            int r10 = r10.getVisibility()
            if (r10 != 0) goto L_0x01d5
            r10 = 1
            goto L_0x01d6
        L_0x01d5:
            r10 = 0
        L_0x01d6:
            int r5 = r0.w0
            if (r10 == 0) goto L_0x0211
            l01 r10 = r0.O0
            r10.measure(r2, r1)
            l01 r10 = r0.O0
            int r10 = r10.getMeasuredHeight()
            int r10 = r10 + r14
            int r10 = r10 + r13
            int r4 = r4 + r10
            l01 r10 = r0.O0
            int r10 = r10.getMeasuredWidth()
            if (r10 <= r8) goto L_0x01f6
            l01 r8 = r0.O0
            int r8 = r8.getMeasuredWidth()
        L_0x01f6:
            l01 r10 = r0.O0
            int r10 = r10.getMeasuredWidth()
            android.widget.LinearLayout r13 = r0.E0
            int r13 = r13.getMeasuredWidth()
            int r13 = r13 + r10
            int r13 = r13 + r5
            l01 r10 = r0.O0
            android.widget.TextView r10 = r10.c
            int r10 = r10.getPaddingRight()
            int r10 = r13 - r10
            if (r10 <= r8) goto L_0x0211
            r8 = r10
        L_0x0211:
            boolean r10 = r19.o()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == 0) goto L_0x027d
            ru.ok.messages.media.attaches.FileAttachView r10 = r0.K0
            r10.getClass()
            fj3 r15 = new fj3
            r3 = -2
            r15.<init>(r3, r3)
            r10.setLayoutParams(r15)
            ru.ok.messages.media.attaches.FileAttachView r10 = r0.K0
            r10.measure(r2, r1)
            boolean r10 = r19.q()
            if (r10 != 0) goto L_0x0241
            boolean r10 = r0.W0
            if (r10 != 0) goto L_0x023f
            boolean r10 = r19.w()
            if (r10 == 0) goto L_0x023d
            goto L_0x023f
        L_0x023d:
            int r4 = r4 + r12
            goto L_0x0248
        L_0x023f:
            int r4 = r4 + r14
            goto L_0x0248
        L_0x0241:
            boolean r10 = r19.w()
            if (r10 != 0) goto L_0x023f
            goto L_0x023d
        L_0x0248:
            ru.ok.messages.media.attaches.FileAttachView r10 = r0.K0
            int r10 = r10.getMeasuredHeight()
            int r10 = r10 + r4
            int r4 = r10 + r12
            ru.ok.messages.media.attaches.FileAttachView r10 = r0.K0
            int r10 = r10.getMeasuredWidth()
            if (r10 <= r8) goto L_0x025a
            r8 = r10
        L_0x025a:
            int r14 = r0.y0
            if (r8 >= r14) goto L_0x0264
            int r8 = r0.c1
            int r8 = java.lang.Math.min(r8, r14)
        L_0x0264:
            if (r10 >= r8) goto L_0x027d
            ru.ok.messages.media.attaches.FileAttachView r10 = r0.K0
            r10.getClass()
            fj3 r14 = new fj3
            r15 = -1
            r14.<init>(r15, r3)
            r10.setLayoutParams(r14)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r13)
            ru.ok.messages.media.attaches.FileAttachView r10 = r0.K0
            r10.measure(r3, r1)
        L_0x027d:
            gl3 r3 = r0.L0
            if (r3 == 0) goto L_0x02cf
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x02cf
            gl3 r3 = r0.L0
            r3.measure(r2, r1)
            boolean r3 = r19.r()
            if (r3 == 0) goto L_0x0296
            int r3 = r11.e
        L_0x0294:
            int r4 = r4 + r3
            goto L_0x02aa
        L_0x0296:
            lb9 r3 = r0.P0
            if (r3 == 0) goto L_0x02a3
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x02a3
            int r3 = r11.b
            goto L_0x0294
        L_0x02a3:
            boolean r3 = r0.W0
            if (r3 == 0) goto L_0x02aa
            int r3 = r11.c
            goto L_0x0294
        L_0x02aa:
            gl3 r3 = r0.L0
            int r3 = r3.getMeasuredHeight()
            int r4 = r4 + r3
            gl3 r3 = r0.L0
            int r3 = r3.getMeasuredWidth()
            if (r3 <= r8) goto L_0x02ba
            r8 = r3
        L_0x02ba:
            int r10 = p1
            if (r8 >= r10) goto L_0x02c4
            int r8 = r0.c1
            int r8 = java.lang.Math.min(r8, r10)
        L_0x02c4:
            if (r3 >= r8) goto L_0x02cf
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r13)
            gl3 r10 = r0.L0
            r10.measure(r3, r1)
        L_0x02cf:
            boolean r3 = r19.u()
            if (r3 == 0) goto L_0x0309
            boolean r3 = r19.q()
            if (r3 == 0) goto L_0x02dc
            int r4 = r4 + r12
        L_0x02dc:
            ve9 r3 = r0.M0
            r3.measure(r2, r1)
            boolean r3 = r19.q()
            if (r3 != 0) goto L_0x02f4
            ve9 r3 = r0.M0
            int r8 = r3.getMeasuredWidth()
            ve9 r3 = r0.M0
            int r4 = r3.getMeasuredHeight()
            goto L_0x0309
        L_0x02f4:
            ve9 r3 = r0.M0
            int r3 = r3.getMeasuredWidth()
            if (r3 <= r8) goto L_0x0302
            ve9 r3 = r0.M0
            int r8 = r3.getMeasuredWidth()
        L_0x0302:
            ve9 r3 = r0.M0
            int r3 = r3.getMeasuredHeight()
            int r4 = r4 + r3
        L_0x0309:
            boolean r3 = r19.t()
            if (r3 == 0) goto L_0x03bd
            boolean r3 = r19.w()
            if (r3 == 0) goto L_0x0317
        L_0x0315:
            int r4 = r4 + r12
            goto L_0x0327
        L_0x0317:
            boolean r3 = r19.q()
            if (r3 == 0) goto L_0x031e
            goto L_0x0315
        L_0x031e:
            androidx.appcompat.widget.AppCompatTextView r3 = r0.C0
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0315
            int r4 = r4 + r7
        L_0x0327:
            ru.ok.messages.media.attaches.ShareAttachView r3 = r0.N0
            c20 r10 = r3.b
            boolean r10 = r10.b()
            if (r10 == 0) goto L_0x033c
            c20 r10 = r3.b
            l20 r10 = r10.g
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x033c
            goto L_0x035d
        L_0x033c:
            ru.ok.messages.media.attaches.ShareAttachView r10 = r0.N0
            c20 r10 = r10.b
            boolean r10 = r10.a()
            if (r10 != 0) goto L_0x035d
            ru.ok.messages.media.attaches.ShareAttachView r10 = r0.N0
            c20 r14 = r10.b
            boolean r14 = r14.b()
            if (r14 == 0) goto L_0x035b
            c20 r10 = r10.b
            l20 r10 = r10.g
            boolean r10 = r10.f()
            if (r10 == 0) goto L_0x035b
            goto L_0x035d
        L_0x035b:
            r10 = 0
            goto L_0x035e
        L_0x035d:
            r10 = 1
        L_0x035e:
            r3.setMatchHeaderWidthToParentWidth(r10)
            ru.ok.messages.media.attaches.ShareAttachView r3 = r0.N0
            int r10 = r0.c1
            int r14 = r0.x
            int r14 = r14 * 2
            int r10 = r10 - r14
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            r3.measure(r10, r1)
            ru.ok.messages.media.attaches.ShareAttachView r3 = r0.N0
            int r3 = r3.getMeasuredWidth()
            if (r8 <= r3) goto L_0x0392
            int r3 = r0.c1
            int r3 = r3 - r14
            int r3 = java.lang.Math.min(r3, r8)
            ru.ok.messages.media.attaches.ShareAttachView r8 = r0.N0
            r10 = 1
            r8.setMatchHeaderWidthToParentWidth(r10)
            ru.ok.messages.media.attaches.ShareAttachView r8 = r0.N0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r13)
            r8.measure(r3, r1)
            goto L_0x03ab
        L_0x0392:
            r10 = 1
            ru.ok.messages.media.attaches.ShareAttachView r3 = r0.N0
            int r3 = r3.getMeasuredWidth()
            int r8 = r0.B0
            if (r3 >= r8) goto L_0x03ab
            ru.ok.messages.media.attaches.ShareAttachView r3 = r0.N0
            r3.setMatchHeaderWidthToParentWidth(r10)
            ru.ok.messages.media.attaches.ShareAttachView r3 = r0.N0
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r13)
            r3.measure(r8, r1)
        L_0x03ab:
            ru.ok.messages.media.attaches.ShareAttachView r3 = r0.N0
            int r3 = r3.getMeasuredWidth()
            int r8 = r3 + r14
            ru.ok.messages.media.attaches.ShareAttachView r3 = r0.N0
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r4
            int r4 = r0.w
            int r4 = r4 + r3
        L_0x03bd:
            boolean r3 = r19.p()
            if (r3 == 0) goto L_0x040f
            boolean r3 = r19.w()
            if (r3 == 0) goto L_0x03cb
        L_0x03c9:
            int r4 = r4 + r12
            goto L_0x03d9
        L_0x03cb:
            boolean r3 = r19.q()
            if (r3 == 0) goto L_0x03d2
            goto L_0x03c9
        L_0x03d2:
            boolean r3 = r19.s()
            if (r3 == 0) goto L_0x03d9
            int r4 = r4 + r7
        L_0x03d9:
            int r3 = r0.c1
            if (r6 <= r3) goto L_0x03f3
            q58 r6 = r0.T0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r13)
            int r8 = r0.c1
            double r14 = (double) r8
            r16 = 4603804719079489536(0x3fe4000000000000, double:0.625)
            double r14 = r14 * r16
            int r8 = (int) r14
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r13)
            r6.measure(r3, r8)
            goto L_0x0402
        L_0x03f3:
            q58 r3 = r0.T0
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r13)
            int r8 = r0.A0
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r13)
            r3.measure(r6, r8)
        L_0x0402:
            q58 r3 = r0.T0
            int r8 = r3.getMeasuredWidth()
            q58 r3 = r0.T0
            int r3 = r3.getMeasuredHeight()
            int r4 = r4 + r3
        L_0x040f:
            android.widget.LinearLayout r3 = r0.E0
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0495
            android.widget.LinearLayout r3 = r0.E0
            int r3 = r3.getMeasuredWidth()
            if (r3 <= r8) goto L_0x0428
            android.widget.LinearLayout r3 = r0.E0
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r5
            int r8 = r3 + r5
        L_0x0428:
            if (r9 != 0) goto L_0x0451
            boolean r3 = r19.j()
            if (r3 == 0) goto L_0x0451
            lf9 r3 = r0.D0
            int r3 = r3.getLineCount()
            r6 = 1
            if (r3 != r6) goto L_0x0451
            lf9 r3 = r0.D0
            int r3 = r3.getMeasuredWidth()
            android.widget.LinearLayout r6 = r0.E0
            int r6 = r6.getMeasuredWidth()
            int r6 = r6 + r3
            int r6 = r6 + r5
            lf9 r3 = r0.D0
            int r3 = r3.getPaddingEnd()
            int r6 = r6 - r3
            if (r6 <= r8) goto L_0x0451
            r8 = r6
        L_0x0451:
            boolean r3 = r19.u()
            if (r3 != 0) goto L_0x0459
            if (r9 == 0) goto L_0x0465
        L_0x0459:
            android.widget.LinearLayout r3 = r0.E0
            int r3 = r3.getMeasuredHeight()
            int r5 = r19.getPaddingBottom()
            int r5 = r5 + r3
            int r4 = r4 + r5
        L_0x0465:
            of9 r3 = r0.U0
            a89 r3 = r3.a
            ha9 r3 = r3.a
            g20 r5 = defpackage.g20.X
            l20 r3 = r3.a(r5)
            boolean r6 = defpackage.ld8.Y(r3)
            if (r6 != 0) goto L_0x0492
            boolean r6 = defpackage.ld8.W(r3)
            if (r6 != 0) goto L_0x0492
            if (r3 == 0) goto L_0x0495
            g20 r6 = r3.a
            if (r6 == r5) goto L_0x0484
            goto L_0x0495
        L_0x0484:
            s10 r3 = r3.j
            if (r3 == 0) goto L_0x0495
            l20 r3 = r3.d
            if (r3 == 0) goto L_0x0495
            boolean r3 = r3.h()
            if (r3 == 0) goto L_0x0495
        L_0x0492:
            int r3 = r11.m
            int r4 = r4 + r3
        L_0x0495:
            int r3 = r0.o1
            if (r3 <= 0) goto L_0x04a4
            android.widget.LinearLayout r5 = r0.E0
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r3
            int r8 = java.lang.Math.max(r5, r8)
        L_0x04a4:
            int r3 = r0.c1
            if (r8 > r3) goto L_0x04b4
            of9 r3 = r0.U0
            a89 r3 = r3.a
            ha9 r3 = r3.a
            boolean r3 = r3.r()
            if (r3 == 0) goto L_0x04b6
        L_0x04b4:
            int r8 = r0.c1
        L_0x04b6:
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r3 = r0.I0
            int r3 = r3.getVisibility()
            r5 = 8
            if (r3 == r5) goto L_0x04fa
            boolean r3 = r19.w()
            if (r3 == 0) goto L_0x04c8
        L_0x04c6:
            int r4 = r4 + r12
            goto L_0x04d6
        L_0x04c8:
            boolean r3 = r19.q()
            if (r3 == 0) goto L_0x04cf
            goto L_0x04c6
        L_0x04cf:
            boolean r3 = r19.s()
            if (r3 == 0) goto L_0x04d6
            int r4 = r4 + r7
        L_0x04d6:
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r3 = r0.I0
            r3.measure(r2, r1)
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r2 = r0.I0
            int r2 = r2.getMeasuredWidth()
            if (r2 <= r8) goto L_0x04ea
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r1 = r0.I0
            int r8 = r1.getMeasuredWidth()
            goto L_0x04f3
        L_0x04ea:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r13)
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r3 = r0.I0
            r3.measure(r2, r1)
        L_0x04f3:
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r1 = r0.I0
            int r1 = r1.getMeasuredHeight()
            int r4 = r4 + r1
        L_0x04fa:
            int r1 = r19.getPaddingLeft()
            int r1 = r1 + r8
            int r2 = r19.getPaddingRight()
            int r2 = r2 + r1
            int r1 = r19.getPaddingTop()
            int r1 = r1 + r4
            int r3 = r19.getPaddingBottom()
            int r3 = r3 + r1
            r0.setMeasuredDimension(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg9.onMeasure(int, int):void");
    }

    public final boolean p() {
        q58 q58 = this.T0;
        return q58 != null && q58.getVisibility() == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.P0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r1 = this;
            boolean r0 = r1.r()
            if (r0 != 0) goto L_0x0013
            lb9 r1 = r1.P0
            if (r1 == 0) goto L_0x0011
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg9.q():boolean");
    }

    public final boolean r() {
        fe9 fe9 = this.Q0;
        return fe9 != null && fe9.getVisibility() == 0;
    }

    public final boolean s() {
        AppCompatTextView appCompatTextView = this.C0;
        return appCompatTextView != null && appCompatTextView.getVisibility() == 0;
    }

    public void setAudioAttachViewDelegate(b30 b30) {
    }

    public void setAudioTranscriptionStateChangeListener(a30 a30) {
        this.m1 = a30;
    }

    public void setHighlighted(boolean z2) {
    }

    public void setLinkListener(dg9 dg9) {
    }

    public void setLottieLayer(gb8 gb8) {
        this.l1 = gb8;
    }

    public void setMessageClickListener(t3a t3a) {
        this.b1 = t3a;
    }

    public void setMessageExpandedStateChangeListener(eg9 eg9) {
    }

    public void setMessageUiItem(of9 of9) {
        this.U0 = of9;
    }

    public void setOnAnyChildDoubleClickListener(fg9 fg9) {
    }

    public void setPipRequestListener(o89 o89) {
        ShareAttachView shareAttachView = this.N0;
        if (shareAttachView != null) {
            shareAttachView.setPipRequestListener(o89);
        }
        FileAttachView fileAttachView = this.K0;
        if (fileAttachView != null) {
            fileAttachView.setPipRequestListener(o89);
        }
        this.I0.getView().setPipRequestListener(o89);
    }

    public void setReactionsWidth(int i) {
        if (this.o1 != i) {
            this.o1 = i;
            requestLayout();
        }
    }

    public void setSelected(boolean z2) {
        super.setSelected(z2);
        ve9 ve9 = this.M0;
        if (ve9 != null) {
            ve9.setSelected(z2);
        }
        this.D0.setSelected(z2);
    }

    public void setTextLayoutRepository(ef9 ef9) {
        this.n1 = ef9;
        fe9 fe9 = this.Q0;
        if (fe9 != null) {
            fe9.setTextLayoutRepository(ef9);
        }
    }

    public final boolean t() {
        ShareAttachView shareAttachView = this.N0;
        return shareAttachView != null && shareAttachView.getVisibility() == 0;
    }

    public final boolean u() {
        ve9 ve9 = this.M0;
        return ve9 != null && ve9.getVisibility() == 0;
    }

    public final boolean v() {
        return this.M0 != null && u() && !q() && this.M0.getStickerView().getSticker() != null && this.M0.getStickerView().getSticker().X == 3;
    }

    public final boolean w() {
        return this.D0.getVisibility() == 0;
    }

    public final boolean x() {
        return this.U0.a.a.o() && !this.U0.a.a.x() && !this.U0.a.a.w() && !this.U0.a.a.E() && !this.U0.a.a.A() && !this.U0.a.a.y() && !this.U0.a.a.F();
    }

    public final void y() {
        if (this.b1 == null) {
            return;
        }
        if (isSelected()) {
            t3a t3a = this.b1;
            a89 a89 = this.U0.a;
            t3a.getClass();
            return;
        }
        mc9 mc9 = this.U0.a.c;
        if (mc9 != null && mc9.a == 1) {
            t3a t3a2 = this.b1;
            a89 a892 = mc9.c;
            t3a2.getClass();
        }
    }

    public final void z(long j) {
        if (this.b1 != null && this.U0.a.a.o()) {
            t3a t3a = this.b1;
            a89 a89 = this.U0.a;
            a89.a.x0.F(0);
            l2a l2a = (l2a) t3a;
            l2a.getClass();
            for (k0a k0a : (Set) l2a.a) {
                if (k0a.b.z != null) {
                    f40 i = ((qra) ym.e()).i();
                    if (i.c.p(a89.a.b)) {
                        i.x(j);
                    }
                }
            }
        }
    }
}
