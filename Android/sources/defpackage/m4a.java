package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import ru.ok.messages.media.trim.ActTrimVideo;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.VideoView;

/* renamed from: m4a  reason: default package */
public final class m4a extends q2 implements bif, sma, f2a {
    public AppCompatImageButton A0;
    public ProgressBar B0;
    public scf C0;
    public ImageButton X;
    public ImageButton Y;
    public TextView Z;
    public final FrgTrimVideo o;
    public final fj v;
    public TextView v0;
    public final FrgTrimVideo w;
    public RangeSeekBarView w0;
    public final ch x;
    public ViewGroup x0;
    public b33 y;
    public TextView y0;
    public VideoView z;
    public AppCompatImageButton z0;

    public m4a(Context context, ViewGroup viewGroup, FrgTrimVideo frgTrimVideo, fj fjVar, FrgTrimVideo frgTrimVideo2, ch chVar) {
        super(context);
        this.o = frgTrimVideo;
        this.v = fjVar;
        this.w = frgTrimVideo2;
        this.x = chVar;
        L(viewGroup, ujc.cl_trim_video);
    }

    public final void M() {
        ImageButton imageButton = (ImageButton) ((View) this.c).findViewById(lic.trim_video__btn_play);
        this.X = imageButton;
        y64.n(imageButton, new l4a(this, 0));
        ImageButton imageButton2 = (ImageButton) ((View) this.c).findViewById(lic.trim_video__btn_pause);
        this.Y = imageButton2;
        y64.n(imageButton2, new l4a(this, 1));
        RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) ((View) this.c).findViewById(lic.trim_video__range_seek_bar_view);
        this.w0 = rangeSeekBarView;
        rangeSeekBarView.setOnChangeRangeSeekBarListener(this);
        this.Z = (TextView) ((View) this.c).findViewById(lic.trim_video__startTime);
        this.v0 = (TextView) ((View) this.c).findViewById(lic.trim_video__endTime);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ((View) this.c).findViewById(lic.trim_video__close);
        this.z0 = appCompatImageButton;
        y64.n(appCompatImageButton, new l4a(this, 2));
        TextView textView = (TextView) ((View) this.c).findViewById(lic.trim_video__reset);
        this.y0 = textView;
        y64.n(textView, new l4a(this, 3));
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ((View) this.c).findViewById(lic.trim_video__apply);
        this.A0 = appCompatImageButton2;
        y64.n(appCompatImageButton2, new l4a(this, 4));
        this.B0 = (ProgressBar) ((View) this.c).findViewById(lic.trim_video__apply_progress);
        this.x0 = (ViewGroup) ((View) this.c).findViewById(lic.trim_video__bottom_group);
        VideoView videoView = (VideoView) ((View) this.c).findViewById(lic.trim_video__view_video);
        this.z = videoView;
        y64.n(videoView, new l4a(this, 5));
        c();
        ViewGroup viewGroup = this.x0;
        y3a y3a = new y3a(2, (Object) this);
        WeakHashMap weakHashMap = gag.a;
        v9g.u(viewGroup, y3a);
        t9g.c(this.x0);
    }

    public final void R(Object obj) {
        c2a c2a = (c2a) obj;
        super.R(c2a);
        this.z.a(c2a);
    }

    public final void Z(long j, long j2, long j3, long j4) {
        RangeSeekBarView rangeSeekBarView = this.w0;
        rangeSeekBarView.C0 = j4;
        rangeSeekBarView.G0 = this.o;
        float f = (float) j4;
        rangeSeekBarView.B0 = ((float) j) / f;
        rangeSeekBarView.z0 = ((float) j2) / f;
        rangeSeekBarView.A0 = ((float) j3) / f;
        rangeSeekBarView.x0 = 1000.0f / f;
        rangeSeekBarView.y0 = 1.0f;
        rangeSeekBarView.D0 = true;
        RangeSeekBarView.P0 = 1.0f;
        RangeSeekBarView.Q0 = 1.0f;
        rangeSeekBarView.invalidate();
        TextView textView = this.Z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        textView.setText(j4b.t(timeUnit.toSeconds(j2)));
        this.v0.setText(j4b.t(timeUnit.toSeconds(j3)));
    }

    public final void a0(boolean z2) {
        if (z2) {
            this.y0.setAlpha(1.0f);
            this.y0.setBackground(this.C0.d());
            return;
        }
        this.y0.setAlpha(0.3f);
        this.y0.setBackground((Drawable) null);
    }

    public final void c() {
        if (((View) this.c) != null) {
            Lazy lazy = scf.b0;
            scf k0 = j4b.k0((Context) this.b);
            this.C0 = k0;
            ((View) this.c).setBackgroundColor(k0.n);
            scf scf = this.C0;
            Toolbar toolbar = (Toolbar) ((View) this.c).findViewById(lic.trim_video__toolbar);
            iq.O(toolbar, ro4.b().t);
            obd obd = new obd(this.v, toolbar);
            obd.x = scf;
            b33 b33 = new b33(obd);
            this.y = b33;
            Toolbar toolbar2 = (Toolbar) b33.c;
            if (toolbar2 != null) {
                toolbar2.setNavigationIcon((Drawable) null);
            }
            this.y.k(qad.Z9);
            b33 b332 = this.y;
            View view = (View) b332.y;
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.gravity = 17;
                ((View) b332.y).setLayoutParams(layoutParams);
            } else {
                TextView textView = (TextView) b332.w;
                if (textView != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams2.gravity = 17;
                    ((TextView) b332.w).setLayoutParams(layoutParams2);
                }
            }
            TextView textView2 = (TextView) b332.x;
            if (textView2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams3.gravity = 17;
                ((TextView) b332.x).setLayoutParams(layoutParams3);
            }
            this.X.setColorFilter(this.C0.u);
            this.Y.setColorFilter(this.C0.u);
            ImageButton imageButton = this.X;
            scf scf2 = this.C0;
            imageButton.setBackground(i8b.T(i8b.K(Integer.valueOf(scf2.s), (Integer) null, (Integer) null), i8b.K(Integer.valueOf(j4b.l0(0.8f, scf2.s)), (Integer) null, (Integer) null), (GradientDrawable) null));
            ImageButton imageButton2 = this.Y;
            scf scf3 = this.C0;
            imageButton2.setBackground(i8b.T(i8b.K(Integer.valueOf(scf3.s), (Integer) null, (Integer) null), i8b.K(Integer.valueOf(j4b.l0(0.8f, scf3.s)), (Integer) null, (Integer) null), (GradientDrawable) null));
            this.Z.setTextColor(this.C0.N);
            this.v0.setTextColor(this.C0.N);
            ru4.g(this.z0.getDrawable(), this.C0.x);
            ru4.g(this.A0.getDrawable(), this.C0.l);
            this.z0.setBackground(this.C0.d());
            this.A0.setBackground(this.C0.d());
            this.y0.setTextColor(this.C0.x);
            if (this.y0.getAlpha() == 1.0f) {
                this.y0.setBackground(this.C0.d());
            }
            this.y0.setBackground(this.C0.d());
            this.x0.setBackgroundColor(this.C0.n);
            ru4.g(this.B0.getIndeterminateDrawable(), this.C0.l);
        }
    }

    public final void c0(boolean z2, boolean z3) {
        ch chVar = this.x;
        if (z2) {
            chVar.i((Toolbar) this.y.c);
            chVar.i(this.x0);
        } else {
            chVar.g((Toolbar) this.y.c);
            chVar.g(this.x0);
        }
        FrgTrimVideo frgTrimVideo = this.w;
        if (z2) {
            if (frgTrimVideo.M1() != null) {
                ((ActTrimVideo) frgTrimVideo.M1()).M((View.OnSystemUiVisibilityChangeListener) null);
            }
        } else if (frgTrimVideo.M1() != null) {
            ((ActTrimVideo) frgTrimVideo.M1()).G((View.OnSystemUiVisibilityChangeListener) null);
        }
        if (z3) {
            if (z2) {
                chVar.i(this.Y);
            } else {
                chVar.g(this.Y);
            }
        } else if (z2) {
            chVar.i(this.X);
        }
    }
}
