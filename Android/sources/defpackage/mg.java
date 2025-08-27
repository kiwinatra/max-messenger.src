package defpackage;

import android.view.Choreographer;
import org.webrtc.RenderSynchronizer;

/* renamed from: mg  reason: default package */
public final /* synthetic */ class mg implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void doFrame(long j) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return;
            case 1:
                ((Runnable) this.b).run();
                return;
            default:
                ((RenderSynchronizer) this.b).onDisplayRefreshCycleBegin(j);
                return;
        }
    }
}
