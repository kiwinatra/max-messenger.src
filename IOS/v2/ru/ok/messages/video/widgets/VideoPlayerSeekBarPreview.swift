package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;

public class VideoPlayerSeekBarPreview extends LinearLayout implements SeekBar.OnSeekBarChangeListener, bif {
    public static final /* synthetic */ int C0 = 0;
    public int A0;
    public int B0;
    public final HashSet a = new HashSet();
    public final VideoPlayerSeekBar b;
    public final VideoFramePreview c;
    public final he6 o;
    public final ch v;
    public dm4 v0;
    public oh8 w;
    public final int w0;
    public or7 x;
    public final int x0;
    public f4g y;
    public long y0;
    public dm4 z;
    public long z0;

    public VideoPlayerSeekBarPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ro4.b();
        this.w0 = vo4.b((int) 120.0f);
        this.x0 = vo4.b((int) 146.0f);
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        View inflate = View.inflate(context, ujc.view_video_player_seekbar_preview, this);
        this.c = (VideoFramePreview) inflate.findViewById(lic.video_frame_preview);
        VideoPlayerSeekBar videoPlayerSeekBar = (VideoPlayerSeekBar) inflate.findViewById(lic.video_player_seek_bar);
        this.b = videoPlayerSeekBar;
        videoPlayerSeekBar.setOnSeekBarChangeListener(this);
        this.v = ((qra) ym.e()).d();
        ge6 ge6 = (ge6) ((qra) ym.e()).getAccessor().g(ge6.class);
        ge6.getClass();
        this.o = new he6((jbf) ge6.d.getValue(), (m95) ge6.b.getValue(), ge6.a, (hn4) ge6.c.getValue());
        c();
    }

    public final void a() {
        dm4 dm4 = this.z;
        VideoFramePreview videoFramePreview = this.c;
        if (dm4 != null) {
            dm4.f();
            this.z = null;
            videoFramePreview.setVisibility(4);
            videoFramePreview.setAlpha(1.0f);
        }
        if (videoFramePreview.getVisibility() == 0 && this.v0 == null) {
            dm4 g = this.v.g(videoFramePreview);
            g.v(new q7g(this, 1));
            this.v0 = g;
        }
    }

    public final void c() {
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        int i = k0.x;
        VideoPlayerSeekBar videoPlayerSeekBar = this.b;
        videoPlayerSeekBar.setProgressColor(i);
        videoPlayerSeekBar.setThumbColor(k0.x);
        this.c.c();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jbd.c(this.w);
        jbd.c(this.x);
        dm4 dm4 = this.z;
        if (dm4 != null) {
            dm4.f();
        }
        dm4 dm42 = this.v0;
        if (dm42 != null) {
            dm42.f();
        }
        he6 he6 = this.o;
        t38 t38 = he6.h;
        if (t38 != null) {
            jbd.c(t38.g);
            try {
                t38.h.release();
            } catch (Throwable th) {
                z68.f("t38", "fail to release", th);
            }
            t38.j = 0;
            List<Bitmap> list = (List) t38.f.J();
            if (list != null) {
                for (Bitmap bitmap : list) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
        }
        w0d w0d = he6.i;
        if (w0d != null) {
            i0 i0Var = w0d.g;
            if (i0Var != null) {
                i0Var.a();
                w0d.g = null;
            }
            i0 i0Var2 = w0d.h;
            if (i0Var2 != null) {
                i0Var2.a();
                w0d.h = null;
            }
        }
        this.a.clear();
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z2) {
        float f;
        nh8 nh8;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onProgressChanged(seekBar, i, z2);
        }
        if (z2 && this.y == null) {
            return;
        }
        if (!z2) {
            a();
            return;
        }
        long j = (long) i;
        if (this.y != null) {
            he6 he6 = this.o;
            if (he6.b() && (((ol0) this.y).a == 0 || ((double) Math.abs(this.y0 - j)) > ((double) ((ol0) this.y).a) * 0.01d)) {
                if (jbd.d(this.x)) {
                    lja s = jha.A(1000, TimeUnit.MILLISECONDS, xfd.a()).s(qe.a());
                    or7 or7 = new or7(new p7g(this, 0), new hxf(16), m58.e);
                    s.a(or7);
                    this.x = or7;
                }
                jbd.c(this.w);
                f4g f4g = he6.e;
                if (f4g == null) {
                    z68.f("he6", "You should call setVideoContent before extractFrame!", (Throwable) null);
                    nh8 = uh8.a;
                } else {
                    Uri h = ((ol0) f4g).h();
                    int i2 = t0g.a;
                    String scheme = h.getScheme();
                    if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                        t38 t38 = he6.h;
                        int min = Math.min(t38.i - 1, (int) Math.floor((double) (((float) j) / ((float) (t38.j / ((long) t38.i))))));
                        om0 om0 = t38.f;
                        ob4 ob4 = new ob4(min, 3);
                        om0.getClass();
                        nh8 = new ai8(new mia(new mha(om0, ob4, 1)), new ob4(min, 4), 0);
                    } else {
                        w0d w0d = he6.i;
                        i0 i0Var = w0d.h;
                        if (i0Var != null) {
                            i0Var.a();
                            w0d.h = null;
                        }
                        nh8 = new sh8(0, new dr1((Object) w0d, j, 8));
                    }
                }
                oi8 f2 = nh8.f(qe.a());
                oh8 oh8 = new oh8(new p7g(this, 1), new dr1((Object) this, j, 11), new ivc(12, this));
                f2.a(oh8);
                this.w = oh8;
                this.y0 = j;
            }
            dm4 dm4 = this.v0;
            VideoFramePreview videoFramePreview = this.c;
            if (dm4 != null) {
                dm4.f();
                this.v0 = null;
                videoFramePreview.setVisibility(0);
                videoFramePreview.setAlpha(1.0f);
            }
            if (videoFramePreview.getVisibility() != 0 && this.z == null) {
                videoFramePreview.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                dm4 i3 = this.v.i(videoFramePreview);
                i3.v(new q7g(this, 0));
                this.z = i3;
            }
            AppCompatTextView appCompatTextView = videoFramePreview.w;
            String[] strArr = ghf.c;
            appCompatTextView.setText(b0h.c(j));
            boolean y2 = ct.y(getContext());
            VideoPlayerSeekBar videoPlayerSeekBar = this.b;
            if (y2) {
                int paddingLeft = getPaddingLeft() + videoPlayerSeekBar.getThumb().getBounds().centerX();
                f = Math.min((float) (-this.A0), Math.max((float) ((videoFramePreview.getWidth() - this.B0) - videoPlayerSeekBar.getWidth()), (((float) videoFramePreview.getWidth()) / 2.0f) + ((float) ((videoPlayerSeekBar.getThumbOffset() + paddingLeft) - videoPlayerSeekBar.getWidth()))));
            } else {
                int paddingLeft2 = getPaddingLeft() + videoPlayerSeekBar.getThumb().getBounds().centerX();
                f = Math.min((float) ((videoPlayerSeekBar.getWidth() + this.B0) - videoFramePreview.getWidth()), Math.max((float) this.A0, ((float) (videoPlayerSeekBar.getThumbOffset() + paddingLeft2)) - (((float) videoFramePreview.getWidth()) / 2.0f)));
            }
            videoFramePreview.setTranslationX(f);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStartTrackingTouch(seekBar);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStopTrackingTouch(seekBar);
        }
        if (this.y != null) {
            a();
        }
    }

    public void setSecondaryProgress(long j) {
        this.b.setSecondaryProgress((int) j);
    }

    public void setVideoContent(f4g f4g) {
        int i;
        if (!f4g.equals(this.y)) {
            this.y = f4g;
            int width = f4g.getWidth();
            int height = f4g.getHeight();
            int i2 = this.w0;
            if (width <= 0 || height <= 0) {
                i = i2;
            } else if (width < height) {
                int[] B = iq.B(i2, i2, width, height);
                i2 = B[0];
                i = B[1];
            } else {
                int i3 = this.x0;
                int[] B2 = iq.B(i3, i3, width, height);
                i2 = B2[0];
                i = B2[1];
            }
            VideoFramePreview videoFramePreview = this.c;
            ViewGroup.LayoutParams layoutParams = videoFramePreview.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i;
            videoFramePreview.setLayoutParams(layoutParams);
            he6 he6 = this.o;
            he6.a(f4g, i2, i);
            if (he6.b()) {
                videoFramePreview.setPreviewEnabled(true);
                if (he6.e == null) {
                    z68.f("he6", "You should call setVideoContent before prepare!", (Throwable) null);
                } else if (he6.b()) {
                    Uri h = ((ol0) he6.e).h();
                    int i4 = t0g.a;
                    String scheme = h.getScheme();
                    if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                        t38 t38 = he6.h;
                        if (t38.e == null) {
                            z68.f("t38", "You should call setVideoContent before prepare!", (Throwable) null);
                            return;
                        }
                        gb3 gb3 = new gb3(3, new lc5(25, (Object) t38));
                        jbf jbf = t38.a;
                        jbf.getClass();
                        kbf kbf = (kbf) jbf;
                        lja s = gb3.x(kbf.a()).s(kbf.c());
                        om0 om0 = t38.f;
                        Objects.requireNonNull(om0);
                        or7 or7 = new or7(new rt3(13, (Object) om0), new n77(24), m58.e);
                        s.a(or7);
                        t38.g = or7;
                        return;
                    }
                    w0d w0d = he6.i;
                    f4g f4g2 = w0d.e;
                    if (f4g2 == null) {
                        z68.f("w0d", "You should call setVideoContent before prepare!", (Throwable) null);
                        return;
                    }
                    zy zyVar = ((ol0) f4g2).f;
                    if (zyVar == null) {
                        z68.f("w0d", "Video collage is null", (Throwable) null);
                        return;
                    }
                    w0d.g = w0d.f.f(ra7.d(Uri.parse((String) zyVar.w)).a(), (f0) null);
                }
            } else {
                videoFramePreview.setPreviewEnabled(false);
                videoFramePreview.a(false);
            }
        }
    }
}
