package defpackage;

import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* renamed from: q7g  reason: default package */
public final class q7g extends fqc {
    public final /* synthetic */ int h;
    public final /* synthetic */ VideoPlayerSeekBarPreview i;

    public /* synthetic */ q7g(VideoPlayerSeekBarPreview videoPlayerSeekBarPreview, int i2) {
        this.h = i2;
        this.i = videoPlayerSeekBarPreview;
    }

    public final void D() {
        switch (this.h) {
            case 0:
                this.i.z = null;
                return;
            default:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.i;
                videoPlayerSeekBarPreview.c.setVisibility(4);
                videoPlayerSeekBarPreview.c.setAlpha(1.0f);
                videoPlayerSeekBarPreview.v0 = null;
                return;
        }
    }

    public void E() {
        switch (this.h) {
            case 0:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.i;
                videoPlayerSeekBarPreview.c.setVisibility(0);
                videoPlayerSeekBarPreview.c.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                return;
            default:
                return;
        }
    }
}
