package defpackage;

import android.graphics.Bitmap;
import ru.ok.messages.video.widgets.VideoFramePreview;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* renamed from: p7g  reason: default package */
public final /* synthetic */ class p7g implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerSeekBarPreview b;

    public /* synthetic */ p7g(VideoPlayerSeekBarPreview videoPlayerSeekBarPreview, int i) {
        this.a = i;
        this.b = videoPlayerSeekBarPreview;
    }

    public final void accept(Object obj) {
        VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.b;
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                int i = VideoPlayerSeekBarPreview.C0;
                videoPlayerSeekBarPreview.getClass();
                if (System.currentTimeMillis() - videoPlayerSeekBarPreview.z0 > 1000) {
                    videoPlayerSeekBarPreview.c.a(true);
                    return;
                }
                return;
            default:
                int i2 = VideoPlayerSeekBarPreview.C0;
                videoPlayerSeekBarPreview.getClass();
                videoPlayerSeekBarPreview.z0 = System.currentTimeMillis();
                jbd.c(videoPlayerSeekBarPreview.x);
                VideoFramePreview videoFramePreview = videoPlayerSeekBarPreview.c;
                videoFramePreview.v.setImageBitmap((Bitmap) obj);
                videoFramePreview.a(false);
                return;
        }
    }
}
