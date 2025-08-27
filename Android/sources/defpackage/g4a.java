package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import kotlin.Lazy;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.views.widgets.VideoThumbnailView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* renamed from: g4a  reason: default package */
public final class g4a extends q2 implements o4a, bif {
    public ImageButton X;
    public ImageButton Y;
    public ImageButton Z;
    public final ch o;
    public final float[] v;
    public VideoPlayerSeekBar v0;
    public VideoView w;
    public VideoThumbnailView w0;
    public ImageButton x;
    public LayerDrawable x0;
    public ImageButton y;
    public ImageView z;

    public g4a(Context context, ch chVar, float[] fArr) {
        super(context);
        this.o = chVar;
        this.v = fArr;
        L((ViewGroup) null, ujc.view_small_video_player);
    }

    public static StateListDrawable Z(scf scf) {
        int i = scf.s;
        return i8b.T(i8b.K(Integer.valueOf(i), (Integer) null, (Integer) null), i8b.K(Integer.valueOf(j4b.l0(0.8f, i)), (Integer) null, (Integer) null), (GradientDrawable) null);
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

    public final void M() {
        float[] fArr = this.v;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        this.w = (VideoView) ((View) this.c).findViewById(lic.view_small_video_player__v_video);
        this.x = (ImageButton) ((View) this.c).findViewById(lic.view_small_video_player__ib_play);
        this.y = (ImageButton) ((View) this.c).findViewById(lic.view_small_video_player__ib_pause);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(lic.view_small_video_player__progress);
        this.z = imageView;
        imageView.setImageDrawable(new r20(((View) this.c).getContext(), 0));
        this.v0 = (VideoPlayerSeekBar) ((View) this.c).findViewById(lic.view_small_video_player__sb_seek);
        LayerDrawable layerDrawable = (LayerDrawable) ((Context) this.b).getResources().getDrawable(nad.D2);
        this.x0 = layerDrawable;
        this.v0.setProgressDrawable(layerDrawable);
        this.X = (ImageButton) ((View) this.c).findViewById(lic.view_small_video_player__ib_pip);
        this.Y = (ImageButton) ((View) this.c).findViewById(lic.view_small_video_player__ib_full_screen);
        this.Z = (ImageButton) ((View) this.c).findViewById(lic.view_small_video_player__ib_close);
        this.w0 = (VideoThumbnailView) ((View) this.c).findViewById(lic.view_small_video_player__iv_thumbnail);
        y64.n(this.w, new f4a(this, 0));
        y64.n(this.x, new f4a(this, 1));
        y64.n(this.y, new f4a(this, 2));
        y64.n(this.X, new f4a(this, 3));
        y64.n(this.Y, new f4a(this, 4));
        y64.n(this.Z, new f4a(this, 5));
        y64.n(this.w0, new f4a(this, 6));
        this.w.setOnLongClickListener(new z20(14, this));
        c();
    }

    public final void c() {
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0((Context) this.b);
        iq.a0(this.x0.findDrawableByLayerId(16908288), k0.s);
        Drawable findDrawableByLayerId = this.x0.findDrawableByLayerId(16908301);
        int i = k0.u;
        iq.a0(findDrawableByLayerId, i);
        iq.a0(this.x0.findDrawableByLayerId(16908303), j4b.l0(0.3f, i));
        ImageButton imageButton = this.x;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(i, mode);
        this.y.setColorFilter(i, mode);
        this.X.setColorFilter(i, mode);
        this.Y.setColorFilter(i, mode);
        this.Z.setColorFilter(i, mode);
        this.x.setBackground(Z(k0));
        this.y.setBackground(Z(k0));
        this.X.setBackground(Z(k0));
        this.Y.setBackground(Z(k0));
        this.Z.setBackground(Z(k0));
    }

    public final void g(int i, int i2) {
        this.w.d();
        VideoThumbnailView videoThumbnailView = this.w0;
        videoThumbnailView.x0 = i;
        videoThumbnailView.y0 = i2;
        videoThumbnailView.requestLayout();
    }

    public final void i(e9g e9g) {
        this.w.a(e9g);
    }

    public final void m(r7g r7g) {
        ch chVar = this.o;
        if (chVar.q()) {
            gsf gsf = new gsf();
            gsf.S(new odg());
            gsf.I(chVar.a.b());
            gsf.p(lic.view_small_video_player__v_video);
            gsf.p(lic.view_small_video_player__iv_thumbnail);
            esf.a((ViewGroup) ((View) this.c), gsf);
        }
        boolean z2 = r7g.a;
        boolean z3 = r7g.c;
        if (z2) {
            if (z3) {
                this.y.setVisibility(8);
                this.x.setVisibility(8);
            } else if (r7g.b) {
                a0(this.y, true);
                this.x.setVisibility(8);
            } else {
                this.y.setVisibility(8);
                a0(this.x, true);
            }
            a0(this.Y, true);
            if (r7g.d) {
                a0(this.Z, true);
                this.X.setVisibility(8);
            } else {
                this.Z.setVisibility(8);
                a0(this.X, true);
            }
        } else {
            this.y.setVisibility(8);
            this.x.setVisibility(8);
            this.Z.setVisibility(8);
            this.X.setVisibility(8);
            this.Y.setVisibility(8);
        }
        a0(this.z, z3);
        if (r7g.g) {
            this.v0.setVisibility(8);
        } else {
            a0(this.v0, true);
            VideoPlayerSeekBar videoPlayerSeekBar = this.v0;
            videoPlayerSeekBar.setMax((int) r7g.j);
            videoPlayerSeekBar.setProgress((int) r7g.k);
            this.v0.setSecondaryProgress((int) r7g.l);
        }
        k20 k20 = r7g.o;
        Drawable drawable = r7g.p;
        if (drawable != null) {
            this.w0.n(k20, drawable);
            return;
        }
        Uri uri = r7g.q;
        if (uri != null) {
            this.w0.o(k20, uri);
        }
    }

    public final void release() {
        this.w.b();
    }
}
