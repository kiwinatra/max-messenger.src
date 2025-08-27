package defpackage;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* renamed from: e58  reason: default package */
public final class e58 implements xvb {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ContentResolver c;

    public /* synthetic */ e58(Executor executor, ContentResolver contentResolver, int i) {
        this.a = i;
        this.b = executor;
        this.c = contentResolver;
    }

    public final void a(zi0 zi0, yvb yvb) {
        switch (this.a) {
            case 0:
                ik0 ik0 = (ik0) yvb;
                bwb bwb = ik0.c;
                ik0.h("local", "thumbnail_bitmap");
                zi0 zi02 = zi0;
                bwb bwb2 = bwb;
                yvb yvb2 = yvb;
                yvb yvb3 = yvb;
                d58 d58 = new d58(this, zi02, bwb2, yvb2, bwb, yvb3, ik0.a, new CancellationSignal());
                ik0.a(new o38(d58, 2));
                this.b.execute(d58);
                return;
            default:
                ik0 ik02 = (ik0) yvb;
                bwb bwb3 = ik02.c;
                ik02.h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                r38 r38 = new r38(this, zi0, bwb3, yvb, bwb3, yvb, ik02.a);
                ik02.a(new o38(r38, 3));
                this.b.execute(r38);
                return;
        }
    }
}
