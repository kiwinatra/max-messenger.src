package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Lazy;

public class ShareAttachHeaderView extends ConstraintLayout {
    public ro4 E0;
    public o20 F0;
    public int G0;
    public int H0;
    public AppCompatTextView I0;
    public AppCompatTextView J0;
    public AppCompatTextView K0;
    public SimpleDraweeView L0;
    public scf M0;

    public ShareAttachHeaderView(Context context) {
        super(context);
        P();
    }

    public void L(int i) {
        boolean z = this.L0.getVisibility() == 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (z ? this.G0 - (this.H0 * 2) : 0), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.K0.measure(makeMeasureSpec, makeMeasureSpec2);
        this.I0.measure(makeMeasureSpec, makeMeasureSpec2);
        if (z) {
            int measuredHeight = this.I0.getMeasuredHeight() + this.K0.getMeasuredHeight();
            if (measuredHeight < this.G0) {
                this.L0.getLayoutParams().width = measuredHeight;
                this.L0.getLayoutParams().height = measuredHeight;
                return;
            }
            this.L0.getLayoutParams().width = this.G0;
            this.L0.getLayoutParams().height = this.G0;
        }
    }

    public void M(l20 l20, c20 c20) {
        if (c20.b()) {
            l20 l202 = c20.g;
            if (l202.f() || l202.i()) {
                this.L0.setVisibility(8);
                return;
            }
        }
        if (c20.a()) {
            this.L0.setImageURI(Uri.parse(c20.f.a()));
        } else {
            this.L0.setVisibility(8);
        }
    }

    public void N(boolean z, l20 l20, c20 c20) {
        if (c20.h || l20.s) {
            this.I0.setVisibility(8);
            this.J0.setVisibility(8);
            this.L0.setVisibility(8);
            this.K0.setVisibility(0);
            this.K0.setText(getContext().getString(qad.s9));
            this.K0.setGravity(17);
            return;
        }
        AppCompatTextView appCompatTextView = this.K0;
        appCompatTextView.getContext();
        appCompatTextView.setText(c20.e);
        this.K0.setGravity(8388611);
        String str = c20.c;
        if (TextUtils.isEmpty(str)) {
            this.I0.setVisibility(8);
        } else {
            AppCompatTextView appCompatTextView2 = this.I0;
            appCompatTextView2.getContext();
            appCompatTextView2.setText(str);
            this.I0.setVisibility(0);
        }
        String str2 = c20.d;
        if (TextUtils.isEmpty(str2)) {
            this.J0.setVisibility(8);
        } else {
            AppCompatTextView appCompatTextView3 = this.J0;
            appCompatTextView3.getContext();
            appCompatTextView3.setText(str2);
            this.J0.setVisibility(0);
        }
        M(l20, c20);
        zs0 zs0 = this.M0.c(z).b;
        this.I0.setTextColor(zs0.d);
        AppCompatTextView appCompatTextView4 = this.K0;
        int i = zs0.e;
        appCompatTextView4.setTextColor(i);
        this.J0.setTextColor(i);
    }

    public void O() {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.L0 = simpleDraweeView;
        simpleDraweeView.setId(lic.view_share_attach__iv_small_image);
        ((sp6) this.L0.getHierarchy()).h(ydd.m);
        float f = (float) this.E0.d;
        b9d a = b9d.a(f, f, f, f);
        a.h = true;
        ((sp6) this.L0.getHierarchy()).n(a);
        iq.t(this.L0, this.H0);
        int i = this.E0.D;
        fj3 fj3 = new fj3(this.H0 + i, i);
        fj3.X = true;
        fj3.W = true;
        addView(this.L0, fj3);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.K0 = appCompatTextView;
        appCompatTextView.setId(lic.view_share_attach__tv_host);
        this.K0.setIncludeFontPadding(false);
        this.K0.setMaxLines(1);
        this.K0.setTextColor(this.M0.w);
        this.K0.setTextSize(0, this.E0.S);
        AppCompatTextView appCompatTextView2 = this.K0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView2.setEllipsize(truncateAt);
        this.K0.setGravity(8388611);
        this.K0.setTextAlignment(5);
        fj3 fj32 = new fj3(-2, -2);
        fj32.W = true;
        fj32.X = true;
        fj32.E = c44.DEFAULT_ASPECT_RATIO;
        addView(this.K0, fj32);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.I0 = appCompatTextView3;
        appCompatTextView3.setId(lic.view_share_attach__tv_title);
        this.I0.setIncludeFontPadding(false);
        this.I0.setMaxLines(2);
        this.I0.setTextSize(0, this.E0.T);
        this.I0.setTypeface(Typeface.DEFAULT_BOLD);
        this.I0.setEllipsize(truncateAt);
        this.I0.setGravity(8388611);
        this.I0.setTextAlignment(5);
        fj3 fj33 = new fj3(-2, -2);
        fj33.W = true;
        fj33.X = true;
        fj33.E = c44.DEFAULT_ASPECT_RATIO;
        addView(this.I0, fj33);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.J0 = appCompatTextView4;
        appCompatTextView4.setId(lic.view_share_attach__tv_description);
        this.J0.setMaxLines(3);
        this.J0.setTextColor(this.M0.w);
        this.J0.setTextSize(0, this.E0.T);
        this.J0.setEllipsize(truncateAt);
        this.J0.setGravity(8388611);
        this.J0.setTextAlignment(5);
        fj3 fj34 = new fj3(-2, -2);
        fj34.W = true;
        fj34.X = true;
        fj34.E = c44.DEFAULT_ASPECT_RATIO;
        addView(this.J0, fj34);
        pj3 pj3 = new pj3();
        pj3.d(this);
        pj3.e(this.L0.getId(), 3, 0, 3);
        pj3.e(this.L0.getId(), 7, 0, 7);
        pj3.j(this.L0.getId()).d.y = "1:1";
        pj3.e(this.K0.getId(), 6, 0, 6);
        pj3.e(this.K0.getId(), 3, 0, 3);
        pj3.e(this.K0.getId(), 7, this.L0.getId(), 6);
        pj3.e(this.I0.getId(), 6, 0, 6);
        pj3.e(this.I0.getId(), 3, this.K0.getId(), 4);
        pj3.e(this.I0.getId(), 7, this.L0.getId(), 6);
        lj3 lj3 = pj3.j(lic.view_share_attach_header__vertical_barrier).d;
        lj3.h0 = 1;
        lj3.f0 = 3;
        lj3.g0 = 0;
        lj3.a = false;
        lj3.i0 = new int[]{this.L0.getId(), this.K0.getId(), this.I0.getId()};
        pj3.e(this.J0.getId(), 6, 0, 6);
        pj3.e(this.J0.getId(), 3, lic.view_share_attach_header__vertical_barrier, 3);
        pj3.e(this.J0.getId(), 7, 0, 7);
        pj3.e(this.J0.getId(), 4, 0, 4);
        pj3.a(this);
    }

    public final void P() {
        id3 e = ym.e();
        getContext();
        this.E0 = ro4.b();
        this.F0 = ((qra) e).h();
        ro4 ro4 = this.E0;
        this.G0 = ro4.D;
        this.H0 = ro4.h;
        Context context = getContext();
        Lazy lazy = scf.b0;
        this.M0 = j4b.k0(context);
        O();
    }

    public final void onMeasure(int i, int i2) {
        L(i);
        super.onMeasure(i, i2);
    }

    public void setImageVisibility(int i) {
        this.L0.setVisibility(i);
    }

    public ShareAttachHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        P();
    }
}
