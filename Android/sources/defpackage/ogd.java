package defpackage;

import org.webrtc.ScreenCapturerAndroid;

/* renamed from: ogd  reason: default package */
public final /* synthetic */ class ogd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScreenCapturerAndroid b;

    public /* synthetic */ ogd(ScreenCapturerAndroid screenCapturerAndroid, int i) {
        this.a = i;
        this.b = screenCapturerAndroid;
    }

    public final void run() {
        int i = this.a;
        ScreenCapturerAndroid screenCapturerAndroid = this.b;
        switch (i) {
            case 0:
                screenCapturerAndroid.lambda$new$0();
                return;
            default:
                screenCapturerAndroid.updateVirtualDisplay();
                return;
        }
    }
}
