package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Lazy;

public class MusicAttachView extends RelativeLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, wx9 {
    public final ro4 a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView o;
    public final SimpleDraweeView v;
    public final FrameLayout w;
    public final scf x;
    public final xx9 y = new xx9(this);

    public MusicAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        ro4 b2 = ro4.b();
        this.a = b2;
        int i = b2.j;
        WeakHashMap weakHashMap = gag.a;
        setPaddingRelative(i, 0, i, 0);
        nb9 nb9 = (nb9) ((qra) ym.e()).getAccessor().g(nb9.class);
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        this.x = j4b.k0(context2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.w = frameLayout;
        frameLayout.setOnClickListener(this);
        this.w.setId(lic.view_music_attach__ll_play);
        int i2 = this.a.B;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        ro4 ro4 = this.a;
        layoutParams.topMargin = ro4.b;
        layoutParams.setMarginEnd(ro4.h);
        addView(this.w, layoutParams);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.v = simpleDraweeView;
        ((sp6) simpleDraweeView.getHierarchy()).h(ydd.m);
        b9d b9d = new b9d();
        b9d.b = true;
        ((sp6) this.v.getHierarchy()).n(b9d);
        this.w.addView(this.v, new FrameLayout.LayoutParams(-1, -1));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.o = appCompatTextView;
        appCompatTextView.setId(lic.view_music_attach__tv_name);
        this.o.setTypeface(Typeface.create("sans-serif", 0));
        this.o.setMaxLines(1);
        this.o.setTextSize(0, this.a.T);
        AppCompatTextView appCompatTextView2 = this.o;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView2.setEllipsize(truncateAt);
        this.o.setTextColor(this.x.G);
        this.o.setGravity(8388611);
        this.o.setIncludeFontPadding(false);
        this.o.setTextAlignment(5);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, lic.view_music_attach__ll_play);
        layoutParams2.addRule(17, lic.view_music_attach__ll_play);
        layoutParams2.addRule(10, -1);
        this.o.setPaddingRelative(0, 0, this.a.e, 0);
        addView(this.o, layoutParams2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.c = appCompatTextView3;
        appCompatTextView3.setId(lic.view_music_attach__tv_artist);
        this.c.setTypeface(Typeface.create("sans-serif", 0));
        this.c.setMaxLines(1);
        this.c.setTextSize(0, this.a.T);
        this.c.setEllipsize(truncateAt);
        this.c.setTextColor(this.x.w);
        this.c.setIncludeFontPadding(false);
        iq.u(this.c, this.a.b);
        this.c.setTextAlignment(5);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(1, lic.view_music_attach__ll_play);
        layoutParams3.addRule(17, lic.view_music_attach__ll_play);
        layoutParams3.addRule(3, lic.view_music_attach__tv_name);
        addView(this.c, layoutParams3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView4;
        appCompatTextView4.setTextSize(0, this.a.S);
        this.b.setTextColor(this.x.w);
        this.b.setGravity(17);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, this.a.p);
        layoutParams4.addRule(1, lic.view_music_attach__ll_play);
        layoutParams4.addRule(17, lic.view_music_attach__ll_play);
        layoutParams4.addRule(3, lic.view_music_attach__tv_artist);
        addView(this.b, layoutParams4);
    }

    private Drawable getPlayPauseSelector() {
        return i8b.T(i8b.K(Integer.valueOf(this.x.r), (Integer) null, (Integer) null), i8b.K(Integer.valueOf(j4b.l0(0.8f, this.x.r)), (Integer) null, (Integer) null), (GradientDrawable) null);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xx9 xx9 = this.y;
        getContext();
        if (xx9.d) {
            xx9.getClass();
            if (0 != 0) {
                xx9.getClass();
            }
        }
    }

    public final void onClick(View view) {
        if (view.getId() == lic.view_music_attach__ll_play) {
            xx9 xx9 = this.y;
            if (xx9.c != null) {
                xx9.getClass();
                if (!xx9.a.c.p(0)) {
                    xx9.b.z();
                }
                gg9 gg9 = (gg9) xx9.c;
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
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y.d = true;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.y.getClass();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.y.getClass();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        xx9 xx9 = this.y;
        int progress = seekBar.getProgress();
        x20 x20 = xx9.c;
        if (x20 != null) {
            ((gg9) x20).z((long) progress);
        }
        y64.C(500, new o99(4, xx9));
    }

    public void setArtistName(CharSequence charSequence) {
        this.c.setVisibility(0);
        this.c.setText(charSequence);
    }

    public void setDurationText(String str) {
        this.b.setText(str);
    }

    public void setListener(x20 x20) {
        this.y.c = x20;
    }

    public void setPlayButtonPauseSelector(boolean z) {
        Drawable playPauseSelector = getPlayPauseSelector();
        this.w.setForeground(new ev4(playPauseSelector, iq.E(nad.a1, this.x.t, getContext())));
    }

    public void setPlayButtonPlaySelector(boolean z) {
        Drawable playPauseSelector = getPlayPauseSelector();
        this.w.setForeground(new ev4(playPauseSelector, iq.E(nad.h1, this.x.t, getContext())));
    }

    public void setPlayButtonPreview(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.v.setImageURI(str);
        } else {
            this.v.setController((gv4) null);
        }
    }

    public void setTrackName(CharSequence charSequence) {
        this.o.setText(charSequence);
    }

    public final void z() {
        if (!(this.w.getForeground() instanceof r20)) {
            this.w.setForeground(new r20(getContext()));
        }
        this.w.getForeground().setLevel(0);
    }
}
