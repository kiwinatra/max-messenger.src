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

/* renamed from: h2a  reason: default package */
public final class h2a extends q2 implements o4a, bif {
    public ImageView X;
    public LayerDrawable Y;
    public final ch o;
    public final float[] v;
    public VideoView w;
    public VideoPlayerSeekBar x;
    public VideoThumbnailView y;
    public ImageButton z;

    public h2a(Context context, ch chVar, float[] fArr) {
        super(context);
        this.o = chVar;
        this.v = fArr;
        L((ViewGroup) null, ujc.view_auto_play_video_player);
    }

    public static void Z(View view, boolean z2) {
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
        this.w = (VideoView) ((View) this.c).findViewById(lic.view_auto_play_video_player__v_video);
        this.x = (VideoPlayerSeekBar) ((View) this.c).findViewById(lic.view_auto_play_video_player__sb_seek);
        this.Y = (LayerDrawable) ((Context) this.b).getResources().getDrawable(nad.D2);
        this.y = (VideoThumbnailView) ((View) this.c).findViewById(lic.view_auto_play_video_player__iv_thumbnail);
        ImageButton imageButton = (ImageButton) ((View) this.c).findViewById(lic.view_auto_play_video_player__ib_sound);
        this.z = imageButton;
        Drawable drawable = ((View) this.c).getResources().getDrawable(nad.B1);
        Drawable drawable2 = ((View) this.c).getResources().getDrawable(nad.D1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        imageButton.setImageDrawable(stateListDrawable);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(lic.view_auto_play_video_player__progress);
        this.X = imageView;
        imageView.setImageDrawable(new r20(((View) this.c).getContext(), 0));
        y64.n(this.w, new g2a(this, 0));
        y64.n(this.y, new g2a(this, 1));
        y64.n(this.z, new g2a(this, 2));
        this.w.setOnLongClickListener(new z20(10, this));
        c();
    }

    public final void c() {
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0((Context) this.b);
        iq.a0(this.Y.findDrawableByLayerId(16908288), k0.s);
        Drawable findDrawableByLayerId = this.Y.findDrawableByLayerId(16908301);
        int i = k0.u;
        iq.a0(findDrawableByLayerId, i);
        iq.a0(this.Y.findDrawableByLayerId(16908303), j4b.l0(0.3f, i));
        this.z.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        ImageButton imageButton = this.z;
        int i2 = k0.s;
        imageButton.setBackground(i8b.T(i8b.K(Integer.valueOf(i2), (Integer) null, (Integer) null), i8b.K(Integer.valueOf(j4b.l0(0.8f, i2)), (Integer) null, (Integer) null), (GradientDrawable) null));
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
            gsf.p(lic.view_auto_play_video_player__v_video);
            gsf.p(lic.view_auto_play_video_player__iv_thumbnail);
            esf.a((ViewGroup) ((View) this.c), gsf);
        }
        Z(this.X, r7g.c);
        if (r7g.g) {
            this.x.setVisibility(8);
        } else {
            Z(this.x, true);
            VideoPlayerSeekBar videoPlayerSeekBar = this.x;
            videoPlayerSeekBar.setMax((int) r7g.j);
            videoPlayerSeekBar.setProgress((int) r7g.k);
            this.x.setSecondaryProgress((int) r7g.l);
        }
        VideoPlayerSeekBar videoPlayerSeekBar2 = this.x;
        boolean z2 = r7g.b;
        Z(videoPlayerSeekBar2, z2);
        if (r7g.r) {
            this.z.setVisibility(8);
        } else {
            this.z.setSelected(r7g.e);
            Z(this.z, z2);
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
