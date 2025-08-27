package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class d extends ed {
    public static final int x1 = ((int) TimeUnit.SECONDS.toMillis(30));
    public LinearLayout A0;
    public FrameLayout B0;
    public ImageView C0;
    public TextView D0;
    public TextView E0;
    public TextView F0;
    public final boolean G0 = true;
    public final boolean H0;
    public LinearLayout I0;
    public RelativeLayout J0;
    public LinearLayout K0;
    public View L0;
    public OverlayListView M0;
    public c N0;
    public ArrayList O0;
    public HashSet P0;
    public HashSet Q0;
    public HashSet R0;
    public SeekBar S0;
    public ks0 T0;
    public rw8 U0;
    public int V0;
    public int W0;
    public final Context X;
    public int X0;
    public boolean Y;
    public final int Y0;
    public int Z;
    public HashMap Z0;
    public MediaControllerCompat a1;
    public final mv8 b1;
    public PlaybackStateCompat c1;
    public MediaDescriptionCompat d1;
    public lv8 e1;
    public Bitmap f1;
    public Uri g1;
    public boolean h1;
    public Bitmap i1;
    public int j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public int p1;
    public int q1;
    public int r1;
    public Interpolator s1;
    public final Interpolator t1;
    public final Interpolator u1;
    public Button v0;
    public final AccessibilityManager v1;
    public Button w0;
    public final tj7 w1 = new tj7(9, this);
    public final sw8 x;
    public ImageButton x0;
    public final av8 y;
    public MediaRouteExpandCollapseButton y0;
    public final rw8 z;
    public FrameLayout z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 1
            android.view.ContextThemeWrapper r4 = defpackage.zw8.a(r4, r0)
            int r1 = defpackage.zw8.b(r4)
            r3.<init>(r4, r1)
            r3.G0 = r0
            tj7 r1 = new tj7
            r2 = 9
            r1.<init>(r2, r3)
            r3.w1 = r1
            android.content.Context r1 = r3.getContext()
            r3.X = r1
            mv8 r2 = new mv8
            r2.<init>(r3)
            r3.b1 = r2
            sw8 r2 = defpackage.sw8.d(r1)
            r3.x = r2
            ow8 r2 = defpackage.sw8.d
            if (r2 != 0) goto L_0x0030
            r0 = 0
            goto L_0x0037
        L_0x0030:
            ow8 r2 = defpackage.sw8.c()
            r2.getClass()
        L_0x0037:
            r3.H0 = r0
            av8 r0 = new av8
            r2 = 2
            r0.<init>(r3, r2)
            r3.y = r0
            defpackage.sw8.b()
            ow8 r0 = defpackage.sw8.c()
            rw8 r0 = r0.f()
            r3.z = r0
            r3.p()
            android.content.res.Resources r0 = r1.getResources()
            int r2 = defpackage.gec.mr_controller_volume_group_list_padding_top
            int r0 = r0.getDimensionPixelSize(r2)
            r3.Y0 = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r3.v1 = r0
            int r0 = defpackage.ejc.mr_linear_out_slow_in
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.t1 = r0
            int r0 = defpackage.ejc.mr_fast_out_slow_in
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.u1 = r4
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.<init>(android.content.Context):void");
    }

    public static void o(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void h(View view, int i) {
        jv8 jv8 = new jv8(view, view.getLayoutParams().height, i, 0);
        jv8.setDuration((long) this.p1);
        jv8.setInterpolator(this.s1);
        view.startAnimation(jv8);
    }

    public final boolean i() {
        return (this.d1 == null && this.c1 == null) ? false : true;
    }

    public final void j(boolean z2) {
        HashSet hashSet;
        int firstVisiblePosition = this.M0.getFirstVisiblePosition();
        for (int i = 0; i < this.M0.getChildCount(); i++) {
            View childAt = this.M0.getChildAt(i);
            rw8 rw8 = (rw8) this.N0.getItem(firstVisiblePosition + i);
            if (!z2 || (hashSet = this.P0) == null || !hashSet.contains(rw8)) {
                ((LinearLayout) childAt.findViewById(ufc.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO).setDuration(0);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        Iterator it = this.M0.a.iterator();
        while (it.hasNext()) {
            n6b n6b = (n6b) it.next();
            n6b.k = true;
            n6b.l = true;
            ata ata = n6b.m;
            if (ata != null) {
                d dVar = (d) ata.c;
                dVar.R0.remove((rw8) ata.b);
                dVar.N0.notifyDataSetChanged();
            }
        }
        if (!z2) {
            k(false);
        }
    }

    public final void k(boolean z2) {
        this.P0 = null;
        this.Q0 = null;
        this.n1 = false;
        if (this.o1) {
            this.o1 = false;
            t(z2);
        }
        this.M0.setEnabled(true);
    }

    public final int l(int i, int i2) {
        float f;
        float f2;
        if (i >= i2) {
            f = ((float) this.Z) * ((float) i2);
            f2 = (float) i;
        } else {
            f = ((float) this.Z) * 9.0f;
            f2 = 16.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public final int m(boolean z2) {
        if (!z2 && this.K0.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.I0.getPaddingBottom() + this.I0.getPaddingTop();
        if (z2) {
            paddingBottom += this.J0.getMeasuredHeight();
        }
        int measuredHeight = this.K0.getVisibility() == 0 ? this.K0.getMeasuredHeight() + paddingBottom : paddingBottom;
        return (!z2 || this.K0.getVisibility() != 0) ? measuredHeight : this.L0.getMeasuredHeight() + measuredHeight;
    }

    public final boolean n() {
        rw8 rw8 = this.z;
        return rw8.e() && Collections.unmodifiableList(rw8.u).size() > 1;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x.a(kw8.c, this.y, 2);
        boolean z2 = sw8.c;
        p();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(njc.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        kv8 kv8 = new kv8(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(ufc.mr_expandable_area);
        this.z0 = frameLayout;
        frameLayout.setOnClickListener(new gv8(this, 0));
        LinearLayout linearLayout = (LinearLayout) findViewById(ufc.mr_dialog_area);
        this.A0 = linearLayout;
        linearLayout.setOnClickListener(new Object());
        int i = hdc.colorPrimary;
        Context context = this.X;
        int g = zw8.g(i, context);
        if (w53.c(g, zw8.g(16842801, context)) < 3.0d) {
            g = zw8.g(hdc.colorAccent, context);
        }
        Button button = (Button) findViewById(16908314);
        this.v0 = button;
        button.setText(wlc.mr_controller_disconnect);
        this.v0.setTextColor(g);
        this.v0.setOnClickListener(kv8);
        Button button2 = (Button) findViewById(16908313);
        this.w0 = button2;
        button2.setText(wlc.mr_controller_stop_casting);
        this.w0.setTextColor(g);
        this.w0.setOnClickListener(kv8);
        this.F0 = (TextView) findViewById(ufc.mr_name);
        ((ImageButton) findViewById(ufc.mr_close)).setOnClickListener(kv8);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(ufc.mr_custom_control);
        this.B0 = (FrameLayout) findViewById(ufc.mr_default_control);
        gv8 gv8 = new gv8(this, 1);
        ImageView imageView = (ImageView) findViewById(ufc.mr_art);
        this.C0 = imageView;
        imageView.setOnClickListener(gv8);
        findViewById(ufc.mr_control_title_container).setOnClickListener(gv8);
        this.I0 = (LinearLayout) findViewById(ufc.mr_media_main_control);
        this.L0 = findViewById(ufc.mr_control_divider);
        this.J0 = (RelativeLayout) findViewById(ufc.mr_playback_control);
        this.D0 = (TextView) findViewById(ufc.mr_control_title);
        this.E0 = (TextView) findViewById(ufc.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(ufc.mr_control_playback_ctrl);
        this.x0 = imageButton;
        imageButton.setOnClickListener(kv8);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(ufc.mr_volume_control);
        this.K0 = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(ufc.mr_volume_slider);
        this.S0 = seekBar;
        rw8 rw8 = this.z;
        seekBar.setTag(rw8);
        ks0 ks0 = new ks0(this);
        this.T0 = ks0;
        this.S0.setOnSeekBarChangeListener(ks0);
        this.M0 = (OverlayListView) findViewById(ufc.mr_volume_group_list);
        this.O0 = new ArrayList();
        c cVar = new c(this, this.M0.getContext(), this.O0);
        this.N0 = cVar;
        this.M0.setAdapter(cVar);
        this.R0 = new HashSet();
        LinearLayout linearLayout3 = this.I0;
        OverlayListView overlayListView = this.M0;
        boolean n = n();
        int g2 = zw8.g(hdc.colorPrimary, context);
        int g3 = zw8.g(hdc.colorPrimaryDark, context);
        if (n && zw8.c(context) == -570425344) {
            g3 = g2;
            g2 = -1;
        }
        linearLayout3.setBackgroundColor(g2);
        overlayListView.setBackgroundColor(g3);
        linearLayout3.setTag(Integer.valueOf(g2));
        overlayListView.setTag(Integer.valueOf(g3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.S0;
        LinearLayout linearLayout4 = this.I0;
        int c = zw8.c(context);
        if (Color.alpha(c) != 255) {
            c = w53.f(c, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(c, c);
        HashMap hashMap = new HashMap();
        this.Z0 = hashMap;
        hashMap.put(rw8, this.S0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(ufc.mr_group_expand_collapse);
        this.y0 = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.z = new gv8(this, 2);
        this.s1 = this.m1 ? this.t1 : this.u1;
        this.p1 = context.getResources().getInteger(yic.mr_controller_volume_group_list_animation_duration_ms);
        this.q1 = context.getResources().getInteger(yic.mr_controller_volume_group_list_fade_in_duration_ms);
        this.r1 = context.getResources().getInteger(yic.mr_controller_volume_group_list_fade_out_duration_ms);
        this.Y = true;
        s();
    }

    public final void onDetachedFromWindow() {
        this.x.f(this.y);
        p();
        super.onDetachedFromWindow();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.H0 || !this.m1) {
            this.z.k(i == 25 ? -1 : 1);
        }
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void p() {
        MediaControllerCompat mediaControllerCompat = this.a1;
        mv8 mv8 = this.b1;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(mv8);
            this.a1 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(boolean r13) {
        /*
            r12 = this;
            rw8 r0 = r12.U0
            r1 = 1
            if (r0 == 0) goto L_0x000d
            r12.k1 = r1
            boolean r0 = r12.l1
            r13 = r13 | r0
            r12.l1 = r13
            return
        L_0x000d:
            r0 = 0
            r12.k1 = r0
            r12.l1 = r0
            rw8 r2 = r12.z
            boolean r3 = r2.g()
            if (r3 == 0) goto L_0x01d8
            boolean r3 = r2.d()
            if (r3 == 0) goto L_0x0022
            goto L_0x01d8
        L_0x0022:
            boolean r3 = r12.Y
            if (r3 != 0) goto L_0x0027
            return
        L_0x0027:
            android.widget.TextView r3 = r12.F0
            java.lang.String r4 = r2.d
            r3.setText(r4)
            android.widget.Button r3 = r12.v0
            boolean r4 = r2.i
            r5 = 8
            if (r4 == 0) goto L_0x0038
            r4 = r0
            goto L_0x0039
        L_0x0038:
            r4 = r5
        L_0x0039:
            r3.setVisibility(r4)
            boolean r3 = r12.h1
            r4 = 0
            if (r3 == 0) goto L_0x0065
            android.graphics.Bitmap r3 = r12.i1
            if (r3 == 0) goto L_0x0051
            boolean r3 = r3.isRecycled()
            if (r3 == 0) goto L_0x0051
            android.graphics.Bitmap r3 = r12.i1
            java.util.Objects.toString(r3)
            goto L_0x005f
        L_0x0051:
            android.widget.ImageView r3 = r12.C0
            android.graphics.Bitmap r6 = r12.i1
            r3.setImageBitmap(r6)
            android.widget.ImageView r3 = r12.C0
            int r6 = r12.j1
            r3.setBackgroundColor(r6)
        L_0x005f:
            r12.h1 = r0
            r12.i1 = r4
            r12.j1 = r0
        L_0x0065:
            boolean r3 = r12.H0
            if (r3 != 0) goto L_0x008a
            boolean r6 = r12.n()
            if (r6 == 0) goto L_0x008a
            android.widget.LinearLayout r3 = r12.K0
            r3.setVisibility(r5)
            r12.m1 = r1
            androidx.mediarouter.app.OverlayListView r3 = r12.M0
            r3.setVisibility(r0)
            boolean r3 = r12.m1
            if (r3 == 0) goto L_0x0082
            android.view.animation.Interpolator r3 = r12.t1
            goto L_0x0084
        L_0x0082:
            android.view.animation.Interpolator r3 = r12.u1
        L_0x0084:
            r12.s1 = r3
            r12.t(r0)
            goto L_0x00da
        L_0x008a:
            boolean r6 = r12.m1
            if (r6 == 0) goto L_0x0090
            if (r3 == 0) goto L_0x00d5
        L_0x0090:
            boolean r3 = r12.G0
            if (r3 == 0) goto L_0x00d5
            boolean r3 = r2.e()
            if (r3 == 0) goto L_0x00a7
            ow8 r3 = defpackage.sw8.d
            if (r3 != 0) goto L_0x00a0
            r3 = r0
            goto L_0x00a9
        L_0x00a0:
            ow8 r3 = defpackage.sw8.c()
            r3.getClass()
        L_0x00a7:
            int r3 = r2.n
        L_0x00a9:
            if (r3 != r1) goto L_0x00d5
            android.widget.LinearLayout r3 = r12.K0
            int r3 = r3.getVisibility()
            if (r3 != r5) goto L_0x00da
            android.widget.LinearLayout r3 = r12.K0
            r3.setVisibility(r0)
            android.widget.SeekBar r3 = r12.S0
            int r6 = r2.p
            r3.setMax(r6)
            android.widget.SeekBar r3 = r12.S0
            int r6 = r2.o
            r3.setProgress(r6)
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r3 = r12.y0
            boolean r6 = r12.n()
            if (r6 == 0) goto L_0x00d0
            r6 = r0
            goto L_0x00d1
        L_0x00d0:
            r6 = r5
        L_0x00d1:
            r3.setVisibility(r6)
            goto L_0x00da
        L_0x00d5:
            android.widget.LinearLayout r3 = r12.K0
            r3.setVisibility(r5)
        L_0x00da:
            boolean r3 = r12.i()
            if (r3 == 0) goto L_0x01d4
            android.support.v4.media.MediaDescriptionCompat r3 = r12.d1
            if (r3 != 0) goto L_0x00e6
            r3 = r4
            goto L_0x00ea
        L_0x00e6:
            java.lang.CharSequence r3 = r3.getTitle()
        L_0x00ea:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            r6 = r6 ^ r1
            android.support.v4.media.MediaDescriptionCompat r7 = r12.d1
            if (r7 != 0) goto L_0x00f4
            goto L_0x00f8
        L_0x00f4:
            java.lang.CharSequence r4 = r7.getSubtitle()
        L_0x00f8:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            r7 = r7 ^ r1
            int r2 = r2.q
            r8 = -1
            if (r2 == r8) goto L_0x010c
            android.widget.TextView r2 = r12.D0
            int r3 = defpackage.wlc.mr_controller_casting_screen
            r2.setText(r3)
        L_0x0109:
            r3 = r0
            r2 = r1
            goto L_0x0140
        L_0x010c:
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.c1
            if (r2 == 0) goto L_0x0138
            int r2 = r2.getState()
            if (r2 != 0) goto L_0x0117
            goto L_0x0138
        L_0x0117:
            if (r6 != 0) goto L_0x0123
            if (r7 != 0) goto L_0x0123
            android.widget.TextView r2 = r12.D0
            int r3 = defpackage.wlc.mr_controller_no_info_available
            r2.setText(r3)
            goto L_0x0109
        L_0x0123:
            if (r6 == 0) goto L_0x012c
            android.widget.TextView r2 = r12.D0
            r2.setText(r3)
            r2 = r1
            goto L_0x012d
        L_0x012c:
            r2 = r0
        L_0x012d:
            if (r7 == 0) goto L_0x0136
            android.widget.TextView r3 = r12.E0
            r3.setText(r4)
            r3 = r1
            goto L_0x0140
        L_0x0136:
            r3 = r0
            goto L_0x0140
        L_0x0138:
            android.widget.TextView r2 = r12.D0
            int r3 = defpackage.wlc.mr_controller_no_media_selected
            r2.setText(r3)
            goto L_0x0109
        L_0x0140:
            android.widget.TextView r4 = r12.D0
            if (r2 == 0) goto L_0x0146
            r2 = r0
            goto L_0x0147
        L_0x0146:
            r2 = r5
        L_0x0147:
            r4.setVisibility(r2)
            android.widget.TextView r2 = r12.E0
            if (r3 == 0) goto L_0x0150
            r3 = r0
            goto L_0x0151
        L_0x0150:
            r3 = r5
        L_0x0151:
            r2.setVisibility(r3)
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.c1
            if (r2 == 0) goto L_0x01d4
            int r2 = r2.getState()
            r3 = 6
            if (r2 == r3) goto L_0x016b
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.c1
            int r2 = r2.getState()
            r3 = 3
            if (r2 != r3) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r2 = r0
            goto L_0x016c
        L_0x016b:
            r2 = r1
        L_0x016c:
            android.widget.ImageButton r3 = r12.x0
            android.content.Context r3 = r3.getContext()
            r6 = 0
            if (r2 == 0) goto L_0x0188
            android.support.v4.media.session.PlaybackStateCompat r4 = r12.c1
            long r8 = r4.getActions()
            r10 = 514(0x202, double:2.54E-321)
            long r8 = r8 & r10
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0188
            int r2 = defpackage.bdc.mediaRoutePauseDrawable
            int r4 = defpackage.wlc.mr_controller_pause
            goto L_0x01b3
        L_0x0188:
            if (r2 == 0) goto L_0x019c
            android.support.v4.media.session.PlaybackStateCompat r4 = r12.c1
            long r8 = r4.getActions()
            r10 = 1
            long r8 = r8 & r10
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x019c
            int r2 = defpackage.bdc.mediaRouteStopDrawable
            int r4 = defpackage.wlc.mr_controller_stop
            goto L_0x01b3
        L_0x019c:
            if (r2 != 0) goto L_0x01b0
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.c1
            long r8 = r2.getActions()
            r10 = 516(0x204, double:2.55E-321)
            long r8 = r8 & r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01b0
            int r2 = defpackage.bdc.mediaRoutePlayDrawable
            int r4 = defpackage.wlc.mr_controller_play
            goto L_0x01b3
        L_0x01b0:
            r1 = r0
            r2 = r1
            r4 = r2
        L_0x01b3:
            android.widget.ImageButton r6 = r12.x0
            if (r1 == 0) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r0 = r5
        L_0x01b9:
            r6.setVisibility(r0)
            if (r1 == 0) goto L_0x01d4
            android.widget.ImageButton r0 = r12.x0
            int r1 = defpackage.zw8.h(r2, r3)
            r0.setImageResource(r1)
            android.widget.ImageButton r0 = r12.x0
            android.content.res.Resources r1 = r3.getResources()
            java.lang.CharSequence r1 = r1.getText(r4)
            r0.setContentDescription(r1)
        L_0x01d4:
            r12.t(r13)
            return
        L_0x01d8:
            r12.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.q(boolean):void");
    }

    public final void r() {
        MediaDescriptionCompat mediaDescriptionCompat = this.d1;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.d1;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.getIconUri();
        }
        lv8 lv8 = this.e1;
        Bitmap bitmap = lv8 == null ? this.f1 : lv8.a;
        Uri uri2 = lv8 == null ? this.g1 : lv8.b;
        if (bitmap == iconBitmap) {
            if (bitmap != null) {
                return;
            }
            if (uri2 != null && uri2.equals(uri)) {
                return;
            }
            if (uri2 == null && uri == null) {
                return;
            }
        }
        if (!n() || this.H0) {
            lv8 lv82 = this.e1;
            if (lv82 != null) {
                lv82.cancel(true);
            }
            lv8 lv83 = new lv8(this);
            this.e1 = lv83;
            lv83.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.X;
        int t = b0h.t(context);
        getWindow().setLayout(t, -2);
        View decorView = getWindow().getDecorView();
        this.Z = (t - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.V0 = resources.getDimensionPixelSize(gec.mr_controller_volume_group_list_item_icon_size);
        this.W0 = resources.getDimensionPixelSize(gec.mr_controller_volume_group_list_item_height);
        this.X0 = resources.getDimensionPixelSize(gec.mr_controller_volume_group_list_max_height);
        this.f1 = null;
        this.g1 = null;
        r();
        q(false);
    }

    public final void t(boolean z2) {
        this.B0.requestLayout();
        this.B0.getViewTreeObserver().addOnGlobalLayoutListener(new iv8(this, z2));
    }

    public final void u(boolean z2) {
        int i = 0;
        this.L0.setVisibility((this.K0.getVisibility() != 0 || !z2) ? 8 : 0);
        LinearLayout linearLayout = this.I0;
        if (this.K0.getVisibility() == 8 && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }
}
