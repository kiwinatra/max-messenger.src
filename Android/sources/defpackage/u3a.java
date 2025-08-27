package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* renamed from: u3a  reason: default package */
public final class u3a extends q2 implements o4a {
    public final float[] o;
    public VideoView v;

    public u3a(Context context, float[] fArr) {
        super(context);
        this.o = fArr;
        L((ViewGroup) null, ujc.view_raw_video_player);
    }

    public final BitmapDrawable B() {
        return this.v.getVideoScreenShot();
    }

    public final void M() {
        float[] fArr = this.o;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        VideoView videoView = (VideoView) ((View) this.c).findViewById(lic.view_raw_video_player__v_video);
        this.v = videoView;
        videoView.setOnClickListener(new t84((View.OnClickListener) new u99(5, (Object) this), 0));
        this.v.setOnLongClickListener(new z20(12, this));
    }

    public final void g(int i, int i2) {
        this.v.d();
    }

    public final void i(e9g e9g) {
        this.v.a(e9g);
    }

    public final void m(r7g r7g) {
    }

    public final void release() {
        this.v.b();
    }
}
