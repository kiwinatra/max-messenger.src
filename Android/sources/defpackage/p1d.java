package defpackage;

import org.webrtc.RenderSynchronizer;

/* renamed from: p1d  reason: default package */
public final /* synthetic */ class p1d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RenderSynchronizer b;

    public /* synthetic */ p1d(RenderSynchronizer renderSynchronizer, int i) {
        this.a = i;
        this.b = renderSynchronizer;
    }

    public final void run() {
        int i = this.a;
        RenderSynchronizer renderSynchronizer = this.b;
        switch (i) {
            case 0:
                renderSynchronizer.lambda$registerListener$1();
                return;
            default:
                renderSynchronizer.lambda$new$0();
                return;
        }
    }
}
