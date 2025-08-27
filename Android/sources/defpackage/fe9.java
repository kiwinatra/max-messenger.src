package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import kotlin.Lazy;
import ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.views.widgets.BlockedAttachView;
import ru.ok.messages.views.widgets.TamAvatarView;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* renamed from: fe9  reason: default package */
public final class fe9 extends FrameLayout {
    public p7d A0;
    public ee9 B0;
    public final scf C0;
    public ws0 D0;
    public or7 E0;
    public l20 F0;
    public ef9 G0;
    public a89 H0;
    public final ro4 a;
    public final o20 b;
    public final ConstraintLayout c;
    public final AppCompatTextView o;
    public final AppCompatTextView v;
    public final VideoInfoTextView v0 = new VideoInfoTextView(getContext());
    public final lf9 w;
    public l2d w0;
    public final FrameLayout x;
    public TamAvatarView x0;
    public final DraweeViewWithSensitiveWarningIcon y;
    public BlockedAttachView y0;
    public final LiveVideoPlaceHolderView z;
    public hk z0;

    public fe9(Context context) {
        super(context);
        id3 e = ym.e();
        getContext();
        ro4 b2 = ro4.b();
        this.a = b2;
        this.b = ((qra) e).h();
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        this.C0 = j4b.k0(context2);
        ct.b(this);
        int i = b2.j;
        WeakHashMap weakHashMap = gag.a;
        setPaddingRelative(i, 0, i, 0);
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        this.c = constraintLayout;
        ct.b(constraintLayout);
        this.c.setPaddingRelative(b2.h, 0, b2.b, 0);
        pj3 pj3 = new pj3();
        pj3.d(this.c);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.o = appCompatTextView;
        appCompatTextView.setId(lic.view_message_reply__tv_author);
        this.o.setTextSize(14.0f);
        cvg.x(this.o).b();
        pj3.f(this.o.getId(), -2);
        pj3.g(this.o.getId(), -2);
        pj3.e(this.o.getId(), 6, 0, 6);
        pj3.e(this.o.getId(), 3, 0, 3);
        this.c.addView(this.o);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.v = appCompatTextView2;
        appCompatTextView2.setId(lic.view_message_reply__forward);
        this.v.setTextSize(0, b2.T);
        this.v.setText(getContext().getString(qad.r3));
        this.v.setClickable(false);
        pj3.o(this.v.getId(), 4, b2.b);
        pj3.o(this.v.getId(), 3, b2.b);
        pj3.f(this.v.getId(), -2);
        pj3.g(this.v.getId(), -2);
        pj3.e(this.v.getId(), 3, this.o.getId(), 4);
        pj3.e(this.v.getId(), 6, 0, 6);
        this.c.addView(this.v);
        lf9 lf9 = new lf9(getContext(), 0);
        this.w = lf9;
        lf9.setId(lic.view_message_reply__tv_text);
        this.w.setStartDrawablePadding(b2.d);
        pj3.f(this.w.getId(), -2);
        pj3.g(this.w.getId(), -2);
        pj3.o(this.w.getId(), 3, b2.b);
        pj3.e(this.w.getId(), 3, this.v.getId(), 4);
        pj3.e(this.w.getId(), 6, 0, 6);
        this.c.addView(this.w);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        frameLayout.setId(lic.view_message_reply__attach_layout);
        int i2 = (int) 140.0f;
        pj3.f(this.x.getId(), vo4.b(i2));
        pj3.g(this.x.getId(), vo4.b(i2));
        pj3.o(this.x.getId(), 3, b2.b);
        pj3.e(this.x.getId(), 3, this.w.getId(), 4);
        pj3.e(this.x.getId(), 6, 0, 6);
        this.c.addView(this.x);
        DraweeViewWithSensitiveWarningIcon draweeViewWithSensitiveWarningIcon = new DraweeViewWithSensitiveWarningIcon(getContext());
        this.y = draweeViewWithSensitiveWarningIcon;
        ((sp6) draweeViewWithSensitiveWarningIcon.getHierarchy()).h(ydd.m);
        this.x.addView(this.y, new FrameLayout.LayoutParams(-1, -1));
        LiveVideoPlaceHolderView liveVideoPlaceHolderView = new LiveVideoPlaceHolderView(getContext());
        this.z = liveVideoPlaceHolderView;
        this.x.addView(liveVideoPlaceHolderView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        int i3 = b2.b;
        layoutParams.setMargins(i3, i3, i3, i3);
        this.x.addView(this.v0, layoutParams);
        pj3.a(this.c);
        addView(this.c, new FrameLayout.LayoutParams(-2, -2));
        this.c.setBackground(new de9(this));
        setClickable(true);
        setOnClickListener(new be9(this, 0));
        setOnLongClickListener(new ce9(this, 0));
        this.w.setOnLongClickListener(new ce9(this, 1));
        this.w.setOnClickListener(new be9(this, 1));
        this.w.setLinksClickable(false);
    }

    public final void a(int i) {
        b(this.w.getDefaultMovementMethod(), i);
    }

    public final void b(q23 q23, int i) {
        if (this.w.getMovementMethod() != q23) {
            this.w.setMovementMethod(q23);
        }
        if (i != -1) {
            this.w.setStartDrawable(iq.E(i, this.D0.c.e, this.w.getContext()));
            return;
        }
        this.w.setStartDrawable((Drawable) null);
    }

    public final void c(View view) {
        FrameLayout frameLayout = this.x;
        if (!(frameLayout == null || view == frameLayout)) {
            frameLayout.setVisibility(8);
        }
        l2d l2d = this.w0;
        if (!(l2d == null || view == l2d)) {
            l2d.setVisibility(8);
        }
        TamAvatarView tamAvatarView = this.x0;
        if (!(tamAvatarView == null || view == tamAvatarView)) {
            tamAvatarView.setVisibility(8);
        }
        VideoInfoTextView videoInfoTextView = this.v0;
        if (!(videoInfoTextView == null || view == videoInfoTextView)) {
            videoInfoTextView.setVisibility(8);
        }
        LiveVideoPlaceHolderView liveVideoPlaceHolderView = this.z;
        if (!(liveVideoPlaceHolderView == null || view == liveVideoPlaceHolderView)) {
            liveVideoPlaceHolderView.setVisibility(8);
        }
        BlockedAttachView blockedAttachView = this.y0;
        if (blockedAttachView != null && view != blockedAttachView) {
            blockedAttachView.setVisibility(8);
        }
    }

    public final void onAttachedToWindow() {
        a89 a89;
        super.onAttachedToWindow();
        if (this.z0 == null && this.w != null && (a89 = this.H0) != null && !a89.a().isEmpty()) {
            hk hkVar = new hk(this.w);
            this.z0 = hkVar;
            hkVar.a();
        }
        hk hkVar2 = this.z0;
        if (hkVar2 != null && hkVar2.c) {
            this.z0.a();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jbd.c(this.E0);
        hk hkVar = this.z0;
        if (hkVar != null) {
            hkVar.c = true;
            hk.o.removeCallbacks(hkVar);
            this.z0 = null;
        }
    }

    public void setListener(ee9 ee9) {
        this.B0 = ee9;
    }

    public void setTextLayoutRepository(ef9 ef9) {
        this.G0 = ef9;
    }
}
