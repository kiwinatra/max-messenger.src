package defpackage;

import android.view.TextureView;
import ru.ok.messages.video.widgets.VideoView;

/* renamed from: qcf  reason: default package */
public final class qcf extends TextureView {
    public pcf a;

    public final void onDetachedFromWindow() {
        e9g e9g;
        pcf pcf = this.a;
        if (!(pcf == null || (e9g = ((VideoView) ((jrf) pcf).b).o) == null)) {
            e9g.D();
        }
        super.onDetachedFromWindow();
    }

    public void setListener(pcf pcf) {
        this.a = pcf;
    }
}
