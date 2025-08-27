package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: d9b  reason: default package */
public final class d9b extends qj3 {
    public final ConcurrentHashMap X = new ConcurrentHashMap();
    public final ConcurrentHashMap Y = new ConcurrentHashMap();
    public final ConcurrentHashMap Z = new ConcurrentHashMap();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final HashMap z = new HashMap();

    public d9b(yu9 yu9, voc voc, xab xab, wie wie) {
        super(yu9, voc, xab, wie);
    }

    public final void a(ue1 ue1, VideoFrame videoFrame) {
        l15 l15 = new l15();
        l15.a = ue1;
        l15.b = a9g.b;
        List<VideoSink> list = (List) this.X.get(l15.e());
        if (list != null) {
            for (VideoSink onFrame : list) {
                onFrame.onFrame(videoFrame);
            }
        }
    }

    public final void d() {
        ur9.e();
        this.X.clear();
        this.z.clear();
    }

    public final void e(ue1 ue1, String str) {
        ur9.e();
        HashMap hashMap = this.z;
        Set<ln1> set = (Set) hashMap.get(ue1);
        if (set != null) {
            for (ln1 remove : set) {
                this.X.remove(remove);
            }
            hashMap.remove(ue1);
        }
    }

    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages((Object) null);
        ((fbb) ((yu9) this.a).b).i("ParticipantsAgnosticRemoteVideoTracks.closeInternal", new o99(15, this));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [org.webrtc.MediaStream[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(org.webrtc.RtpReceiver r3, org.webrtc.MediaStream[] r4) {
        /*
            r2 = this;
            wh4 r0 = new wh4
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            java.lang.String r3 = "DefaultRemoteVideoTracks.handleVideoTracksOnExecutor"
            java.lang.Object r2 = r2.a
            yu9 r2 = (defpackage.yu9) r2
            r2.i(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9b.k(org.webrtc.RtpReceiver, org.webrtc.MediaStream[]):void");
    }

    public final void p(String str, ln1 ln1, List list) {
        ur9.e();
        ConcurrentHashMap concurrentHashMap = this.X;
        HashMap hashMap = this.z;
        if (list == null) {
            concurrentHashMap.remove(ln1);
            Set set = (Set) hashMap.get(ln1.b);
            if (set != null) {
                set.remove(ln1);
                return;
            }
            return;
        }
        concurrentHashMap.put(ln1, list);
        Set set2 = (Set) hashMap.get(ln1.b);
        if (set2 == null) {
            set2 = new HashSet();
            hashMap.put(ln1.b, set2);
        }
        set2.add(ln1);
    }
}
