package defpackage;

import androidx.fragment.app.b;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: ag6  reason: default package */
public final /* synthetic */ class ag6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ ag6(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g3(true);
                return;
            case 1:
                this.b.v3();
                return;
            default:
                b M1 = this.b.M1();
                if (M1 != null) {
                    M1.finish();
                    M1.overridePendingTransition(0, qcc.fullscreen_to_pip);
                    return;
                }
                return;
        }
    }
}
