package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Lazy;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.views.widgets.VideoThumbnailView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* renamed from: n2a  reason: default package */
public final class n2a extends q2 implements o4a, bif {
    public LayerDrawable X;
    public final ch o;
    public final float[] v;
    public VideoView w;
    public VideoPlayerSeekBar x;
    public VideoThumbnailView y;
    public ImageView z;

    public n2a(Context context, ch chVar, float[] fArr) {
        super(context);
        this.o = chVar;
        this.v = fArr;
        L((ViewGroup) null, ujc.view_constructor_video_player);
    }

    public final BitmapDrawable B() {
        return this.w.getVideoScreenShot();
    }

    public final void M() {
        float[] fArr = this.v;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        this.w = (VideoView) ((View) this.c).findViewById(lic.view_constructor_video_player__v_video);
        this.x = (VideoPlayerSeekBar) ((View) this.c).findViewById(lic.view_constructor_video_player__sb_seek);
        this.X = (LayerDrawable) ((Context) this.b).getResources().getDrawable(nad.D2);
        this.y = (VideoThumbnailView) ((View) this.c).findViewById(lic.view_constructor_video_player__iv_thumbnail);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(lic.view_constructor_video_player__progress);
        this.z = imageView;
        imageView.setImageDrawable(new r20(((View) this.c).getContext(), 0));
        y64.n(this.w, new m2a(this, 0));
        y64.n(this.y, new m2a(this, 1));
        this.w.setOnLongClickListener(new z20(11, this));
        c();
    }

    public final void c() {
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0((Context) this.b);
        iq.a0(this.X.findDrawableByLayerId(16908288), k0.s);
        Drawable findDrawableByLayerId = this.X.findDrawableByLayerId(16908301);
        int i = k0.u;
        iq.a0(findDrawableByLayerId, i);
        iq.a0(this.X.findDrawableByLayerId(16908303), j4b.l0(0.3f, i));
    }

    public final void g(int i, int i2) {
        this.w.d();
        VideoThumbnailView videoThumbnailView = this.y;
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
            gsf.p(lic.view_constructor_video_player__v_video);
            gsf.p(lic.view_constructor_video_player__iv_thumbnail);
            esf.a((ViewGroup) ((View) this.c), gsf);
        }
        ImageView imageView = this.z;
        if (r7g.c) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.x.setVisibility(0);
        VideoPlayerSeekBar videoPlayerSeekBar = this.x;
        videoPlayerSeekBar.setMax((int) r7g.j);
        videoPlayerSeekBar.setProgress((int) r7g.k);
        this.x.setSecondaryProgress((int) r7g.l);
        VideoPlayerSeekBar videoPlayerSeekBar2 = this.x;
        if (r7g.b) {
            videoPlayerSeekBar2.setVisibility(0);
        } else {
            videoPlayerSeekBar2.setVisibility(8);
        }
        k20 k20 = r7g.o;
        Drawable drawable = r7g.p;
        if (drawable != null) {
            this.y.n(k20, drawable);
            return;
        }
        Uri uri = r7g.q;
        if (uri != null) {
            this.y.o(k20, uri);
        }
    }

    public final void release() {
        this.w.b();
    }
}
