package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import kotlin.Lazy;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.video.widgets.doubleTap.DoubleTapVideoViewWrapper;
import ru.ok.messages.views.widgets.VideoThumbnailView;

/* renamed from: x2a  reason: default package */
public final class x2a extends q2 implements o4a, bif, SeekBar.OnSeekBarChangeListener {
    public View A0;
    public LiveVideoPlaceHolderView B0;
    public r7g C0;
    public ImageView X;
    public VideoPlayerSeekBarPreview Y;
    public VideoThumbnailView Z;
    public final ch o;
    public final nd v;
    public TextView v0;
    public VideoView w;
    public TextView w0;
    public PinchToZoomVideoViewWrapper x;
    public ImageButton x0;
    public ImageButton y;
    public View y0;
    public ImageButton z;
    public View z0;

    public x2a(Context context, View view, ch chVar, nd ndVar) {
        super(context);
        this.o = chVar;
        this.v = ndVar;
        J(view);
    }

    public static void a0(View view, boolean z2) {
        if (z2) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final BitmapDrawable B() {
        return this.w.getVideoScreenShot();
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [n70, java.lang.Object] */
    public final void M() {
        this.w = (VideoView) ((View) this.c).findViewById(lic.view_full_screen_video_player__v_video);
        this.x = (PinchToZoomVideoViewWrapper) ((View) this.c).findViewById(lic.view_full_screen_video_player__pinch_to_zoom_v_video_wrapper);
        this.y = (ImageButton) ((View) this.c).findViewById(lic.view_full_screen_video_player__btn_play);
        this.z = (ImageButton) ((View) this.c).findViewById(lic.view_full_screen_video_player__btn_pause);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(lic.view_full_screen_video_player__progress);
        this.X = imageView;
        imageView.setImageDrawable(new r20(((View) this.c).getContext(), 0));
        this.Y = (VideoPlayerSeekBarPreview) ((View) this.c).findViewById(lic.view_video_player_controls__sb_seek_preview);
        this.Z = (VideoThumbnailView) ((View) this.c).findViewById(lic.view_full_screen_video_player__iv_thumbnail);
        this.v0 = (TextView) ((View) this.c).findViewById(lic.view_video_player_controls__tv_time);
        this.w0 = (TextView) ((View) this.c).findViewById(lic.view_video_player_controls__tv_duration);
        this.x0 = (ImageButton) ((View) this.c).findViewById(lic.view_video_player_controls__btn_settings);
        this.y0 = ((View) this.c).findViewById(lic.view_full_screen_video_player__controls);
        this.z0 = ((View) this.c).findViewById(lic.view_video_player_controls__v_background);
        this.A0 = ((View) this.c).findViewById(lic.view_video_player_controls__cl_content);
        this.B0 = (LiveVideoPlaceHolderView) ((View) this.c).findViewById(lic.view_full_screen_video_player__live_placeholder);
        ((ViewGroup) this.y0).setClipChildren(false);
        ((ViewGroup) this.A0).setClipChildren(false);
        y64.n(this.y, new w2a(this, 0));
        y64.n(this.z, new w2a(this, 1));
        y64.n(this.x0, new w2a(this, 2));
        this.Y.a.add(this);
        c();
        ch chVar = this.o;
        Context context = (Context) this.b;
        s2a s2a = new s2a(context, (DoubleTapVideoViewWrapper) ((View) this.c).findViewById(lic.view_full_screen_video_player__double_tap_wrapper), chVar);
        ? obj = new Object();
        obj.c = false;
        obj.a = 0;
        new m0a(s2a, new r2a((n70) obj), context, this.v).z = this;
    }

    public final void Z(Rect rect) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y0.getLayoutParams();
        marginLayoutParams.topMargin = rect.top;
        marginLayoutParams.bottomMargin = rect.bottom;
        this.y0.setLayoutParams(marginLayoutParams);
        View view = this.A0;
        view.setPadding(rect.left, view.getPaddingTop(), rect.right, this.A0.getPaddingBottom());
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [s8g, qb6, android.graphics.drawable.Drawable] */
    public final void c() {
        Lazy lazy = scf.b0;
        Context context = (Context) this.b;
        scf k0 = j4b.k0(context);
        ImageButton imageButton = this.y;
        int i = k0.u;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(i, mode);
        this.z.setColorFilter(k0.u, mode);
        ImageButton imageButton2 = this.y;
        int i2 = k0.s;
        imageButton2.setBackground(i8b.T(i8b.K(Integer.valueOf(i2), (Integer) null, (Integer) null), i8b.K(Integer.valueOf(j4b.l0(0.8f, i2)), (Integer) null, (Integer) null), (GradientDrawable) null));
        this.z.setBackground(i8b.T(i8b.K(Integer.valueOf(i2), (Integer) null, (Integer) null), i8b.K(Integer.valueOf(j4b.l0(0.8f, i2)), (Integer) null, (Integer) null), (GradientDrawable) null));
        TextView textView = this.w0;
        int i3 = k0.x;
        textView.setTextColor(i3);
        this.v0.setTextColor(i3);
        ImageButton imageButton3 = this.x0;
        ? qb6 = new qb6(iq.E(sad.a, i3, context));
        qb6.z = new RectF();
        qb6.X = new Path();
        ym ymVar = ym.v;
        ro4 b = ro4.b();
        qb6.v = b;
        Paint paint = new Paint();
        qb6.x = paint;
        paint.setColor(-16777216);
        paint.setTextSize(b.Q);
        paint.setStrokeWidth((float) b.a);
        paint.setTypeface(s8g.Y);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        qb6.y = paint2;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        imageButton3.setImageDrawable(qb6);
        this.x0.setBackground(k0.d());
        this.Y.c();
        this.z0.setBackgroundColor(k0.n);
    }

    public final void g(int i, int i2) {
        this.w.d();
        VideoThumbnailView videoThumbnailView = this.Z;
        videoThumbnailView.x0 = i;
        videoThumbnailView.y0 = i2;
        videoThumbnailView.requestLayout();
    }

    public final void i(e9g e9g) {
        this.w.a(e9g);
    }

    public final void m(r7g r7g) {
        Drawable drawable;
        this.C0 = r7g;
        ch chVar = this.o;
        if (chVar.q()) {
            gsf gsf = new gsf();
            gsf.S(new odg());
            gsf.I(chVar.a.b());
            gsf.p(lic.view_full_screen_video_player__v_video);
            gsf.p(lic.view_full_screen_video_player__iv_thumbnail);
            esf.a((ViewGroup) ((View) this.c), gsf);
        }
        int i = 0;
        boolean z2 = r7g.a;
        boolean z3 = r7g.c;
        if (z2) {
            a0(this.y0, true);
            boolean z4 = r7g.i;
            boolean z5 = r7g.b;
            if (z3) {
                if (z5) {
                    a0(this.z, true);
                    this.y.setVisibility(8);
                } else {
                    this.z.setVisibility(8);
                    a0(this.y, !z4);
                }
                a0(this.X, true);
            } else {
                if (z5) {
                    a0(this.z, true);
                    this.y.setVisibility(8);
                } else {
                    this.z.setVisibility(8);
                    a0(this.y, !z4);
                }
                this.X.setVisibility(8);
            }
            a0(this.v0, true);
            String str = null;
            if (r7g.g) {
                this.Y.setVisibility(8);
                int i2 = nad.i2;
                TextView textView = this.v0;
                Context context = (Context) this.b;
                if (i2 != -1) {
                    try {
                        drawable = ew3.b(context, i2);
                    } catch (Resources.NotFoundException unused) {
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                } else {
                    drawable = null;
                }
                hsg.D(drawable, (Drawable) null, (Drawable) null, (Drawable) null, textView);
                this.v0.setText(qad.pa);
                this.w0.setVisibility(8);
            } else {
                this.v0.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                a0(this.Y, true);
                VideoPlayerSeekBar videoPlayerSeekBar = this.Y.b;
                long j = r7g.j;
                videoPlayerSeekBar.setMax((int) j);
                long j2 = r7g.k;
                videoPlayerSeekBar.setProgress((int) j2);
                this.Y.setSecondaryProgress(r7g.l);
                if (j >= 0) {
                    TextView textView2 = this.w0;
                    String[] strArr = ghf.c;
                    textView2.setText(b0h.c(j));
                    this.w0.setVisibility(0);
                } else {
                    this.w0.setVisibility(8);
                }
                a0(this.w0, true);
                TextView textView3 = this.v0;
                String[] strArr2 = ghf.c;
                textView3.setText(b0h.c(j2));
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.Y;
                int width = this.w0.getWidth();
                videoPlayerSeekBarPreview.A0 = -this.v0.getWidth();
                videoPlayerSeekBarPreview.B0 = width;
            }
            if (r7g.f) {
                a0(this.x0, true);
                qac qac = r7g.m;
                if (qac != null) {
                    str = qac.a;
                }
                s8g s8g = (s8g) this.x0.getDrawable();
                s8g.w = str;
                if (!cvg.A(str)) {
                    int measureText = cvg.A(s8g.w) ? 0 : (int) s8g.x.measureText(s8g.w);
                    RectF rectF = s8g.z;
                    int intrinsicWidth = s8g.getIntrinsicWidth() - measureText;
                    ro4 ro4 = s8g.v;
                    rectF.set((float) (intrinsicWidth - ro4.b), (((float) s8g.getIntrinsicHeight()) - s8g.x.getTextSize()) - ((float) ro4.d), (float) s8g.getIntrinsicWidth(), (float) (s8g.getIntrinsicHeight() - ro4.b));
                    Path path = s8g.X;
                    path.reset();
                    float f = rectF.left;
                    float f2 = (float) ro4.b;
                    RectF rectF2 = new RectF(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
                    float f3 = (float) ro4.b;
                    path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
                }
                s8g.invalidateSelf();
                this.x0.requestLayout();
            } else {
                this.x0.setVisibility(8);
            }
        } else {
            this.y0.setVisibility(8);
            a0(this.X, z3);
            this.y.setVisibility(8);
            this.z.setVisibility(8);
            this.Y.setVisibility(8);
            this.w0.setVisibility(8);
            this.v0.setVisibility(8);
            this.x0.setVisibility(8);
        }
        k20 k20 = r7g.o;
        Drawable drawable2 = r7g.p;
        if (drawable2 != null) {
            this.Z.n(k20, drawable2);
        } else {
            Uri uri = r7g.q;
            if (uri != null) {
                this.Z.o(k20, uri);
            }
        }
        f4g f4g = r7g.n;
        if (f4g != null) {
            this.Y.setVideoContent(f4g);
        }
        VideoView videoView = this.w;
        if (!r7g.s) {
            i = 4;
        }
        videoView.setVisibility(i);
        this.x.setEnabled(r7g.t);
        if (r7g.h) {
            LiveVideoPlaceHolderView liveVideoPlaceHolderView = this.B0;
            liveVideoPlaceHolderView.J0 = k20;
            liveVideoPlaceHolderView.M();
            a0(this.B0, true);
            return;
        }
        this.B0.setVisibility(8);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z2) {
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        N(new k2a(8));
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        N(new a0(8, seekBar));
    }

    public final void release() {
        this.w.b();
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.x;
        pinchToZoomVideoViewWrapper.c = qlb.b;
        pinchToZoomVideoViewWrapper.v = 1.0f;
    }
}
