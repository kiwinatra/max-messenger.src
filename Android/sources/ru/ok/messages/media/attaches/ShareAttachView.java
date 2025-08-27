package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Lazy;
import ru.ok.messages.stickers.widgets.StickerView;

public class ShareAttachView extends FrameLayout implements l89, View.OnClickListener {
    public x4e A0;
    public ju8 B0;
    public ro4 a;
    public c20 b;
    public LinearLayout c;
    public FrameLayout o;
    public ShareAttachHeaderView v;
    public ShareAttachBigImageBgView v0;
    public View w;
    public ShareMediaView w0;
    public View x;
    public StickerView x0;
    public ShareAttachHeaderView y;
    public scf y0;
    public ShareAttachBigImageView z;
    public boolean z0 = true;

    public ShareAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public final void a() {
    }

    public final void b(l20 l20, View view) {
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [ru.ok.messages.media.attaches.ShareAttachBigImageBgView, com.facebook.drawee.view.SimpleDraweeView] */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.facebook.drawee.view.SimpleDraweeView, ru.ok.messages.media.attaches.ShareAttachBigImageView, android.view.View, ov4] */
    /* JADX WARNING: type inference failed for: r0v19, types: [p89, android.view.View, ru.ok.messages.media.attaches.ShareMediaView] */
    public final void c() {
        getContext();
        this.a = ro4.b();
        Context context = getContext();
        Lazy lazy = scf.b0;
        this.y0 = j4b.k0(context);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.c, new FrameLayout.LayoutParams(this.z0 ? -1 : -2, -2));
        ShareAttachHeaderView shareAttachHeaderView = new ShareAttachHeaderView(getContext());
        this.v = shareAttachHeaderView;
        ro4 ro4 = this.a;
        int i = ro4.h;
        shareAttachHeaderView.setPadding(i, i, i, ro4.f);
        this.c.addView(this.v, new LinearLayout.LayoutParams(this.z0 ? -1 : -2, -2));
        View view = new View(getContext());
        this.w = view;
        view.setBackgroundColor(this.y0.q);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.a.a);
        layoutParams.setMarginStart(this.a.h);
        layoutParams.setMarginEnd(this.a.h);
        this.c.addView(this.w, layoutParams);
        ShareAttachHeaderView shareAttachHeaderView2 = new ShareAttachHeaderView(getContext());
        this.y = shareAttachHeaderView2;
        int i2 = this.a.h;
        shareAttachHeaderView2.setPadding(i2, i2, i2, 0);
        this.c.addView(this.y, new LinearLayout.LayoutParams(this.z0 ? -1 : -2, -2));
        this.o = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = this.a.f;
        this.c.addView(this.o, layoutParams2);
        ? simpleDraweeView = new SimpleDraweeView(getContext());
        id3 e = ym.e();
        int i3 = bq0.f;
        simpleDraweeView.w0 = e.b(25, 1);
        simpleDraweeView.x0 = ((qra) e).h();
        this.v0 = simpleDraweeView;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.o.addView(this.v0, layoutParams3);
        ? simpleDraweeView2 = new SimpleDraweeView(getContext());
        id3 e2 = ym.e();
        simpleDraweeView2.getContext();
        simpleDraweeView2.v0 = ro4.b();
        simpleDraweeView2.w0 = ((qra) e2).h();
        this.z = simpleDraweeView2;
        ((sp6) simpleDraweeView2.getHierarchy()).h(ydd.m);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.gravity = 17;
        this.o.addView(this.z, layoutParams4);
        ? p89 = new p89(getContext());
        p89.getContext();
        ro4.b();
        int i4 = (int) 9.0f;
        p89.Z0 = (float) vo4.b(i4);
        this.w0 = p89;
        p89.setId(lic.view_share_attach__media);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 17;
        this.o.addView(this.w0, layoutParams5);
        View view2 = new View(getContext());
        this.x = view2;
        view2.setBackgroundColor(this.y0.q);
        this.o.addView(this.x, new FrameLayout.LayoutParams(-1, this.a.a));
        setClickable(true);
        this.a.getClass();
        this.a.getClass();
        b9d a2 = b9d.a(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) vo4.b(i4), (float) vo4.b(i4));
        a2.h = true;
        ((sp6) this.v0.getHierarchy()).n(a2);
        this.v0.setOnClickListener(this);
        this.w0.setAttachClickListener(this);
    }

    public p89 getMediaView() {
        return this.w0;
    }

    public final void onClick(View view) {
        if (this.w0.getVisibility() != 0 || this.A0 == null) {
            callOnClick();
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.b.a() && this.w0.getVisibility() != 0) {
            x10 x10 = this.b.f;
            if (x10.c * 2 >= size || x10.v) {
                this.z.setVisibility(0);
                this.y.setImageVisibility(8);
                x10 x102 = this.b.f;
                if (x102.o > x102.c) {
                    this.v0.setVisibility(0);
                } else {
                    this.v0.setVisibility(8);
                }
            } else {
                this.y.setImageVisibility(0);
                this.z.setVisibility(8);
                this.v0.setVisibility(8);
            }
        }
        if (this.y.J0.getVisibility() != 0 && this.z.getVisibility() == 8 && this.w0.getVisibility() == 8) {
            setPadding(0, 0, 0, this.a.f);
        } else {
            setPadding(0, 0, 0, 0);
        }
        if (this.z.getVisibility() == 0 || this.v0.getVisibility() == 0 || this.w0.getVisibility() == 0) {
            this.x.setVisibility(0);
        } else {
            this.x.setVisibility(8);
        }
        super.onMeasure(i, i2);
    }

    public void setEmbeddedPlayer(boolean z2) {
        this.w0.setEmbeddedPlayer(z2);
    }

    public void setMatchHeaderWidthToParentWidth(boolean z2) {
        if (this.z0 != z2) {
            this.z0 = z2;
            int i = -1;
            this.c.setLayoutParams(new FrameLayout.LayoutParams(z2 ? -1 : -2, -2));
            this.y.setLayoutParams(new LinearLayout.LayoutParams(z2 ? -1 : -2, -2));
            ShareAttachHeaderView shareAttachHeaderView = this.v;
            if (!z2) {
                i = -2;
            }
            shareAttachHeaderView.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
        }
    }

    public void setMediaClickListener(x4e x4e) {
        this.A0 = x4e;
    }

    public void setPipRequestListener(o89 o89) {
        this.w0.setPipRequestListener(o89);
    }
}
