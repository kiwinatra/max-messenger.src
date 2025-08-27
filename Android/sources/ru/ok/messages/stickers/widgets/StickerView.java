package ru.ok.messages.stickers.widgets;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.uuid.Uuid;
import ru.ok.messages.messages.panels.widgets.MultiImageToggleButton;
import ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView;

public class StickerView extends FrameLayout implements v47, d2a, dq7, bif {
    public static final /* synthetic */ int N0 = 0;
    public u3a A0;
    public ju8 B0;
    public View.OnLongClickListener C0;
    public mq4 D0 = null;
    public boolean E0 = false;
    public boolean F0 = true;
    public boolean G0 = false;
    public cse H0;
    public yre I0;
    public int J0;
    public tj7 K0 = new tj7(29, this);
    public dm4 L0;
    public final w4d M0 = new w4d();
    public final po5 a = ((qra) ym.e()).p();
    public final w47 b = ((w47) ((qra) ym.e()).getAccessor().g(w47.class));
    public final x47 c = ((x47) ((qra) ym.e()).getAccessor().g(x47.class));
    public final wj0 o = ((wj0) ((qra) ym.e()).getAccessor().g(wj0.class));
    public int v;
    public final KeyboardLottieAnimationView v0;
    public int w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public boe y;
    public final MultiImageToggleButton y0;
    public final SimpleDraweeView z;
    public x1a z0;

    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipToPadding(false);
        C();
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.z = simpleDraweeView;
        B();
        addView(simpleDraweeView, new FrameLayout.LayoutParams(-1, -1));
        KeyboardLottieAnimationView keyboardLottieAnimationView = new KeyboardLottieAnimationView(getContext(), (AttributeSet) null);
        this.v0 = keyboardLottieAnimationView;
        addView(keyboardLottieAnimationView, new FrameLayout.LayoutParams(-1, -1));
        keyboardLottieAnimationView.setAutoRepeat(true);
        keyboardLottieAnimationView.setOnFirstFrameListener(new zre(this));
        keyboardLottieAnimationView.setFailureListener(new dre(11));
        keyboardLottieAnimationView.setVisibility(8);
        MultiImageToggleButton multiImageToggleButton = new MultiImageToggleButton(getContext(), (AttributeSet) null, 14);
        this.y0 = multiImageToggleButton;
        multiImageToggleButton.setSelfToggling(false);
        multiImageToggleButton.setListener(new zre(this));
        dse dse = dse.STOPPED;
        ArrayList arrayList = new ArrayList(dse.values().length);
        for (dse dse2 : dse.values()) {
            arrayList.add(ew3.b(context, dse2.a));
        }
        multiImageToggleButton.setDrawables(arrayList);
        int b2 = vo4.b(6);
        this.y0.setPadding(b2, b2, b2, b2);
        int b3 = vo4.b(8);
        b59.x(b3, b3, b3, b3, this, this.y0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(vo4.b(28), vo4.b(28));
        layoutParams.setMarginEnd(vo4.b(2));
        layoutParams.bottomMargin = vo4.b(2);
        layoutParams.gravity = 8388693;
        addView(this.y0, layoutParams);
        setOnClickListener(new t84((View.OnClickListener) new ase(this, 0), 0));
        this.z.setOnClickListener(new t84((View.OnClickListener) new ase(this, 1), 0));
        c();
    }

    public static void f(StickerView stickerView) {
        File stickerFile = stickerView.getStickerFile();
        if (!stickerFile.exists()) {
            stickerView.r(stickerFile);
            ((m48) stickerView.B0).u(1.0f);
            return;
        }
        if (!stickerView.F0) {
            ju8 ju8 = stickerView.B0;
            ju8.getClass();
            if (!(!((m48) ju8).l())) {
                x1a x1a = stickerView.z0;
                if (x1a != null) {
                    x1a.H();
                    return;
                }
                return;
            }
        }
        stickerView.F0 = false;
        stickerView.y(goe.b);
    }

    private File getStickerFile() {
        boe boe = this.y;
        boolean z2 = boe.Y;
        po5 po5 = this.a;
        return z2 ? po5.n(boe.a()) : po5.p(boe.a);
    }

    public final void A() {
        knb a2 = ld9.p.get();
        w4d w4d = this.M0;
        a2.g = w4d;
        String str = !cvg.A(this.y.x) ? this.y.x : this.y.o;
        B();
        boolean A = cvg.A(str);
        SimpleDraweeView simpleDraweeView = this.z;
        if (A) {
            simpleDraweeView.setController((gv4) null);
            return;
        }
        a2.l = simpleDraweeView.getController();
        a2.h = new j5(4, this);
        simpleDraweeView.setController(a2.a());
        qa7 a3 = qa7.a(po5.s(o5a.z(str)));
        ba7 B = ld9.B();
        B.getClass();
        w4d.a(new aa7(B, a3, (Object) null));
    }

    public final void B() {
        removeCallbacks(this.K0);
        if (((sp6) this.z.getHierarchy()).e.a(1) == null) {
            tj7 tj7 = new tj7(29, (StickerView) this.K0.b);
            this.K0 = tj7;
            postDelayed(tj7, 100);
        }
    }

    public final void C() {
        boe boe = this.y;
        if (boe == null || !boe.Y) {
            this.v = vo4.b(Uuid.SIZE_BITS);
            this.w = vo4.b(144);
            return;
        }
        this.v = vo4.b(158);
        this.w = vo4.b(194);
    }

    public final void D() {
        z68.c("ru.ok.messages.stickers.widgets.StickerView", "startAnimation", new Object[0]);
        this.F0 = false;
        o();
        if (cvg.A(this.y.x)) {
            y(goe.a);
            return;
        }
        if (this.J0 == 0) {
            A();
        }
        postDelayed(new yre(this, 0), 100);
    }

    public final void D0() {
        z68.c("ru.ok.messages.stickers.widgets.StickerView", "onVideoEnd", new Object[0]);
        if (this.G0 && !this.F0) {
            this.y0.setCurrentStateIndex(dse.STOPPED.ordinal());
            String str = this.y.o;
            SimpleDraweeView simpleDraweeView = this.z;
            simpleDraweeView.setImageURI(str);
            simpleDraweeView.setVisibility(0);
            x1a x1a = this.z0;
            if (x1a == null) {
                w();
            } else {
                View o2 = x1a.o();
                dm4 dm4 = this.L0;
                if (dm4 != null) {
                    dm4.v((fqc) null);
                    this.L0.f();
                    this.L0 = null;
                }
                ch s = kne.s(getContext());
                dm4 g = s.g(o2);
                dm4 dm42 = dm4.o;
                if (g == dm42) {
                    g.getClass();
                } else {
                    ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) g.b;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.setDuration(300);
                    } else {
                        Animation animation = (Animation) g.c;
                        if (animation != null) {
                            animation.setDuration(300);
                        }
                    }
                }
                Interpolator k = s.a.k();
                if (g != dm42) {
                    ViewPropertyAnimator viewPropertyAnimator2 = (ViewPropertyAnimator) g.b;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.setInterpolator(k);
                    } else {
                        Animation animation2 = (Animation) g.c;
                        if (animation2 != null) {
                            animation2.setInterpolator(k);
                        }
                    }
                }
                g.v(new bse(this, o2, 1));
                this.L0 = g;
            }
            cse cse = this.H0;
            if (cse != null) {
                ((ve9) cse).b(true);
            }
        }
    }

    public final void W0(Throwable th) {
        z68.a("ru.ok.messages.stickers.widgets.StickerView", "videoPlayerError");
        this.z.setClickable(true);
        cse cse = this.H0;
        if (cse != null) {
            ((ve9) cse).b(true);
        }
    }

    public final void a() {
        s();
    }

    public final void b() {
        this.G0 = true;
        cse cse = this.H0;
        if (cse != null) {
            ((ve9) cse).b(false);
        }
    }

    public final void c() {
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        int i = k0.u;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        MultiImageToggleButton multiImageToggleButton = this.y0;
        multiImageToggleButton.setColorFilter(i, mode);
        int i2 = k0.s;
        multiImageToggleButton.setBackground(i8b.T(i8b.K(Integer.valueOf(i2), (Integer) null, (Integer) null), i8b.K(Integer.valueOf(j4b.l0(0.8f, i2)), (Integer) null, (Integer) null), (GradientDrawable) null));
    }

    public final void clearAnimation() {
        super.clearAnimation();
        dm4 dm4 = this.L0;
        if (dm4 != null) {
            dm4.f();
            this.L0 = null;
        }
    }

    public final void d() {
    }

    public final void e(long j, float f) {
    }

    public final void g() {
        o();
    }

    public String getDownloadContext() {
        Locale locale = Locale.ENGLISH;
        return tr1.j(this.y.a(), "_view");
    }

    public int getMaxHeight() {
        return this.w;
    }

    public boe getSticker() {
        return this.y;
    }

    public final void h() {
    }

    public final void j(File file) {
        clearAnimation();
        post(new yre(this, 1));
        boe boe = this.y;
        if (boe != null && boe.Y) {
            mq4 mq4 = this.D0;
            if (mq4 != null) {
                mq4.dispose();
            }
            this.D0 = xfd.b().c(new s6e(6, this, file));
        }
        if (!((sjd) tr1.h((qra) ym.e())).h().f(true)) {
            ((qra) ym.e()).J().c(new wsc(this.y.a, 1));
        }
    }

    public final void l() {
        s();
    }

    public final void m() {
        v();
    }

    public final void o() {
        boe boe = this.y;
        if (boe != null) {
            this.y0.setCurrentStateIndex((this.F0 || !boe.w0) ? dse.STOPPED.ordinal() : ((m48) this.B0).l() ? dse.PLAYING_WITH_SOUND.ordinal() : dse.PLAYING_WITHOUT_SOUND.ordinal());
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.K0);
        SimpleDraweeView simpleDraweeView = this.z;
        simpleDraweeView.setClickable(true);
        this.b.c(this);
        this.c.c(this);
        this.F0 = true;
        z();
        this.J0 = 0;
        yre yre = this.I0;
        if (yre != null) {
            removeCallbacks(yre);
        }
        simpleDraweeView.setVisibility(0);
        mq4 mq4 = this.D0;
        if (mq4 != null) {
            mq4.dispose();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        boe boe = this.y;
        if (boe != null) {
            if (this.x) {
                i3 = this.w;
            } else {
                i3 = boe.c;
                int i4 = this.v;
                if (i3 < i4 || i3 > (i4 = this.w)) {
                    i3 = i4;
                }
            }
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = Math.min(i3, (View.MeasureSpec.getSize(i2) - getPaddingBottom()) - getPaddingTop());
            }
            boe boe2 = this.y;
            float f = ((float) boe2.b) / ((float) boe2.c);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) (f * ((float) i3))), 1073741824);
            int i5 = makeMeasureSpec;
            i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + i3, 1073741824);
            i = i5;
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r3 = r8.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(defpackage.boe r8) {
        /*
            r7 = this;
            r0 = 1
            r7.F0 = r0
            r7.z()
            boe r1 = r7.y
            r2 = 0
            if (r1 == 0) goto L_0x001a
            int r3 = r8.b
            int r4 = r1.b
            if (r4 != r3) goto L_0x001a
            int r1 = r1.c
            int r3 = r8.c
            if (r1 == r3) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r1 = r2
            goto L_0x001b
        L_0x001a:
            r1 = r0
        L_0x001b:
            r7.y = r8
            boolean r3 = r8.w0
            ru.ok.messages.messages.panels.widgets.MultiImageToggleButton r4 = r7.y0
            if (r4 == 0) goto L_0x002b
            if (r3 == 0) goto L_0x0027
            r3 = r2
            goto L_0x0028
        L_0x0027:
            r3 = 4
        L_0x0028:
            r4.setVisibility(r3)
        L_0x002b:
            boe r3 = r7.y
            r4 = 0
            ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView r5 = r7.v0
            if (r3 == 0) goto L_0x0064
            java.lang.String r3 = r3.v0
            boolean r3 = defpackage.cvg.A(r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x0064
        L_0x003b:
            r7.w0 = r0
            boolean r3 = r7.x
            if (r3 == 0) goto L_0x0044
            int r3 = r7.w
            goto L_0x0046
        L_0x0044:
            int r3 = r7.v
        L_0x0046:
            r6 = 350(0x15e, float:4.9E-43)
            int r3 = java.lang.Math.max(r6, r3)
            boe r6 = r7.y
            java.lang.String r6 = r6.v0
            boolean r3 = r5.a(r3, r3, r6)
            r7.w0 = r2
            r5.setVisibility(r2)
            if (r3 == 0) goto L_0x0060
            boolean r3 = r7.x0
            if (r3 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r0 = r2
        L_0x0061:
            r7.x0 = r2
            goto L_0x0071
        L_0x0064:
            r5.getClass()
            one.me.rlottie.RLottieImageViewUtils.release(r5)
            r5.x = r4
            r3 = 8
            r5.setVisibility(r3)
        L_0x0071:
            if (r0 == 0) goto L_0x007b
            com.facebook.drawee.view.SimpleDraweeView r0 = r7.z
            r0.setVisibility(r2)
            r7.A()
        L_0x007b:
            java.lang.String r0 = r8.o
            boolean r3 = defpackage.cvg.D(r0)
            if (r3 == 0) goto L_0x0092
            android.net.Uri r0 = defpackage.o5a.x(r0)
            qa7 r0 = defpackage.qa7.a(r0)
            ba7 r3 = defpackage.ld9.B()
            r3.f(r0, r4)
        L_0x0092:
            java.lang.String r8 = r8.x
            boolean r0 = defpackage.cvg.D(r8)
            if (r0 == 0) goto L_0x00a9
            android.net.Uri r8 = defpackage.o5a.x(r8)
            qa7 r8 = defpackage.qa7.a(r8)
            ba7 r0 = defpackage.ld9.B()
            r0.f(r8, r4)
        L_0x00a9:
            r7.o()
            r7.J0 = r2
            yre r8 = r7.I0
            if (r8 == 0) goto L_0x00b5
            r7.removeCallbacks(r8)
        L_0x00b5:
            r7.C()
            if (r1 == 0) goto L_0x00bd
            r7.requestLayout()
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.stickers.widgets.StickerView.p(boe):void");
    }

    public final void r(File file) {
        this.z.setClickable(false);
        if (this.J0 == 0) {
            startAnimation(AnimationUtils.loadAnimation(getContext(), kad.a));
        }
        boe boe = this.y;
        boolean z2 = boe.Y;
        String str = boe.w;
        if (z2) {
            this.c.b(str, file, this, boe.a());
            return;
        }
        this.b.b(str, file, this, String.valueOf(boe.a));
    }

    public final void s() {
        int i = this.J0 + 1;
        this.J0 = i;
        if (i > 6) {
            post(new yre(this, 2));
            return;
        }
        yre yre = new yre(this, 3);
        this.I0 = yre;
        postDelayed(yre, (long) (((i * i) * 1000) / 2));
    }

    public void setClickable(boolean z2) {
        super.setClickable(z2);
        this.z.setClickable(z2);
    }

    public void setListener(cse cse) {
        this.H0 = cse;
    }

    public void setLottieLayer(gb8 gb8) {
        if (gb8 != null) {
            if (gb8.a == null) {
                gb8.a = Collections.newSetFromMap(new WeakHashMap());
            }
            gb8.a.add(this.v0);
        }
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.z.setOnLongClickListener(onLongClickListener);
        u3a u3a = this.A0;
        if (u3a != null) {
            u3a.v.setOnLongClickListener(onLongClickListener);
        }
        this.C0 = onLongClickListener;
    }

    public void setStickerMediaPlayerController(ju8 ju8) {
        this.B0 = ju8;
    }

    public void setUseMaxHeight(boolean z2) {
        this.x = z2;
    }

    public final boolean t(int i, KeyEvent keyEvent) {
        x1a x1a = this.z0;
        if (x1a == null) {
            return false;
        }
        return x1a.t(i, keyEvent);
    }

    public final void u() {
        removeCallbacks(this.K0);
        SimpleDraweeView simpleDraweeView = this.z;
        if (((sp6) simpleDraweeView.getHierarchy()).e.a(1) != null) {
            ((sp6) simpleDraweeView.getHierarchy()).i((Drawable) null, 1);
        }
    }

    public final void v() {
        if (this.H0 != null) {
            if (!this.F0) {
                this.F0 = true;
                this.z.setVisibility(0);
                z();
                o();
            }
            ve9 ve9 = (ve9) this.H0;
            ue9 ue9 = ve9.z;
            if (ue9 != null) {
                gg9 gg9 = (gg9) ue9;
                if (gg9.b1 != null) {
                    a89 a89 = gg9.U0.a;
                }
            }
            ve9.b(true);
        }
    }

    public final void w() {
        z68.a("ru.ok.messages.stickers.widgets.StickerView", "onFadeAnimationEnd");
        this.z.setClickable(!this.E0);
        if (!this.E0 || this.F0) {
            this.F0 = true;
            o();
            return;
        }
        z68.a("ru.ok.messages.stickers.widgets.StickerView", "re-start playing animation");
        postDelayed(new yre(this, 1), 200);
    }

    public final void x(boolean z2) {
        if (!(!this.F0) && (!cvg.A(this.y.w))) {
            SimpleDraweeView simpleDraweeView = this.z;
            simpleDraweeView.setClickable(false);
            File stickerFile = getStickerFile();
            if (stickerFile.exists()) {
                D();
                return;
            }
            z9f h = tr1.h((qra) ym.e());
            if (z2 || ((sjd) h).h().f(true)) {
                r(stickerFile);
                return;
            }
            simpleDraweeView.setClickable(true);
            this.F0 = true;
        }
    }

    public final void y(goe goe) {
        boe boe = this.y;
        if (boe == null) {
            z68.n("ru.ok.messages.stickers.widgets.StickerView", (IOException) null, "playSticker, sticker is null", Arrays.copyOf(new Object[0], 0));
            return;
        }
        z68.c("ru.ok.messages.stickers.widgets.StickerView", "playSticker, stickerId = %d", Long.valueOf(boe.a));
        z();
        ((m48) this.B0).j = false;
        u3a u3a = new u3a(getContext(), (float[]) null);
        this.A0 = u3a;
        u3a.v.setOnLongClickListener(this.C0);
        u3a u3a2 = this.A0;
        ju8 ju8 = this.B0;
        ((qra) ym.e()).o();
        u3a u3a3 = u3a2;
        ju8 ju82 = ju8;
        x1a x1a = new x1a(u3a3, ju82, this.a, ((qra) ym.e()).c(), this);
        this.z0 = x1a;
        boe boe2 = this.y;
        x1a.x = boe2;
        xre xre = new xre(boe2, new w1a(x1a, boe2, 0), new w1a(x1a, boe2, 1));
        x1a.w = xre;
        m48 m48 = (m48) ju8;
        m48.t(xre, x1a);
        m48.r(0);
        u3a2.i(x1a);
        r7g a2 = x1a.y.a();
        a2.r = true;
        a2.e = false;
        x1a.y = new r7g(a2);
        int ordinal = goe.ordinal();
        if (ordinal == 1) {
            ((nd) x1a.W().b).c(1, "change_volume_audio_sticker");
            m48.u(1.0f);
        } else if (ordinal == 2) {
            ((nd) x1a.W().b).c(0, "change_volume_audio_sticker");
            m48.w();
        }
        View o2 = this.z0.o();
        addView(o2, new FrameLayout.LayoutParams(-1, -1));
        this.y0.bringToFront();
        if (cvg.A(this.y.x)) {
            x1a x1a2 = this.z0;
            m48 m482 = (m48) x1a2.b;
            if (m482.g == x1a2 && m482.f != null) {
                m482.o();
                return;
            }
            return;
        }
        o2.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        dm4 dm4 = this.L0;
        if (dm4 != null) {
            dm4.v((fqc) null);
            this.L0.f();
            this.L0 = null;
        }
        ch s = kne.s(getContext());
        dm4 i = s.i(o2);
        dm4 dm42 = dm4.o;
        if (i == dm42) {
            i.getClass();
        } else {
            ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) i.b;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.setDuration(300);
            } else {
                Animation animation = (Animation) i.c;
                if (animation != null) {
                    animation.setDuration(300);
                }
            }
        }
        Interpolator k = s.a.k();
        if (i != dm42) {
            ViewPropertyAnimator viewPropertyAnimator2 = (ViewPropertyAnimator) i.b;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.setInterpolator(k);
            } else {
                Animation animation2 = (Animation) i.c;
                if (animation2 != null) {
                    animation2.setInterpolator(k);
                }
            }
        }
        i.v(new bse(this, o2, 0));
        this.L0 = i;
    }

    public final void z() {
        this.G0 = false;
        x1a x1a = this.z0;
        if (x1a != null) {
            x1a.I(false);
            removeView(this.z0.o());
            this.z0 = null;
            clearAnimation();
        }
    }
}
