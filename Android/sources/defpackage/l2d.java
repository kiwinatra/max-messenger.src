package defpackage;

import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import ru.ok.messages.media.attaches.ShareAttachHeaderView;

/* renamed from: l2d  reason: default package */
public final class l2d extends ShareAttachHeaderView {
    public final void L(int i) {
    }

    public final void M(l20 l20, c20 c20) {
        String a = c20.a() ? c20.f.a() : c20.b() ? ld8.E(c20.g) : null;
        BitmapDrawable b = this.F0.b(l20, false);
        if (a == null && b == null) {
            this.L0.setVisibility(8);
            return;
        }
        this.L0.setVisibility(0);
        this.L0.setImageURI(po5.s(a));
        ((sp6) this.L0.getHierarchy()).i(b, 1);
    }

    public final void N(boolean z, l20 l20, c20 c20) {
        super.N(z, l20, c20);
        this.K0.setGravity(8388611);
        this.K0.setTextColor(this.M0.w);
        this.I0.setTextColor(this.M0.G);
        this.J0.setTextColor(this.M0.w);
    }

    public final void O() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setPadding(0, this.E0.d, 0, 0);
        addView(relativeLayout, new fj3(-2, -2));
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.L0 = simpleDraweeView;
        simpleDraweeView.setId(lic.view_share_attach__iv_small_image);
        ((sp6) this.L0.getHierarchy()).h(ydd.m);
        float f = (float) this.E0.d;
        b9d a = b9d.a(f, f, f, f);
        a.h = true;
        ((sp6) this.L0.getHierarchy()).n(a);
        int i = this.E0.D;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(20, -1);
        layoutParams.setMarginEnd(this.E0.h);
        relativeLayout.addView(this.L0, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.K0 = appCompatTextView;
        appCompatTextView.setId(lic.view_share_attach__tv_host);
        this.K0.setIncludeFontPadding(false);
        this.K0.setMaxLines(1);
        this.K0.setTextColor(this.M0.w);
        this.K0.setTextSize(0, this.E0.S);
        this.K0.setPadding(0, 0, 0, this.E0.a);
        AppCompatTextView appCompatTextView2 = this.K0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView2.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, lic.view_share_attach__iv_small_image);
        layoutParams2.addRule(17, lic.view_share_attach__iv_small_image);
        relativeLayout.addView(this.K0, layoutParams2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.I0 = appCompatTextView3;
        appCompatTextView3.setId(lic.view_share_attach__tv_title);
        this.I0.setIncludeFontPadding(false);
        this.I0.setMaxLines(1);
        this.I0.setTextColor(this.M0.G);
        this.I0.setTextSize(0, this.E0.T);
        this.I0.setTypeface(Typeface.DEFAULT_BOLD);
        this.I0.setPadding(0, 0, 0, this.E0.a);
        this.I0.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(1, lic.view_share_attach__iv_small_image);
        layoutParams3.addRule(17, lic.view_share_attach__iv_small_image);
        layoutParams3.addRule(3, lic.view_share_attach__tv_host);
        relativeLayout.addView(this.I0, layoutParams3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.J0 = appCompatTextView4;
        appCompatTextView4.setMaxLines(1);
        this.J0.setId(lic.view_share_attach__tv_description);
        this.J0.setIncludeFontPadding(false);
        this.J0.setTextColor(this.M0.w);
        this.J0.setTextSize(0, this.E0.T);
        this.J0.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(1, lic.view_share_attach__iv_small_image);
        layoutParams4.addRule(17, lic.view_share_attach__iv_small_image);
        layoutParams4.addRule(3, lic.view_share_attach__tv_title);
        relativeLayout.addView(this.J0, layoutParams4);
    }
}
