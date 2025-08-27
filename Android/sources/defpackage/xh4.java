package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* renamed from: xh4  reason: default package */
public final class xh4 extends qj3 {
    public static final a9g[] X = {a9g.a, a9g.b};
    public final ConcurrentHashMap w = new ConcurrentHashMap();
    public final HashMap x = new HashMap();
    public final ConcurrentHashMap y = new ConcurrentHashMap();
    public final ConcurrentHashMap z = new ConcurrentHashMap();

    public xh4(yu9 yu9, voc voc, xab xab, wie wie) {
        super(yu9, voc, xab, wie);
    }

    public final void a(ue1 ue1, VideoFrame videoFrame) {
        l15 l15 = new l15();
        l15.a = ue1;
        l15.b = a9g.b;
        List<n8g> list = (List) this.w.get(l15.e());
        if (list != null) {
            for (n8g a : list) {
                a.a(videoFrame);
            }
        }
    }

    public final void d() {
        ((yu9) this.a).i("DefaultRemoteVideoTracks.clearRemoteVideoRenderers", new ok3(1, this));
    }

    public final void e(ue1 ue1, String str) {
        a9g[] a9gArr = X;
        for (int i = 0; i < 2; i++) {
            a9g a9g = a9gArr[i];
            l15 l15 = new l15();
            l15.b = a9g;
            l15.a = ue1;
            p(str, l15.e(), (List) null);
        }
    }

    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages((Object) null);
        synchronized (this.w) {
            try {
                for (List<n8g> it : this.w.values()) {
                    for (n8g n8g : it) {
                        n8g.a = null;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ((fbb) ((yu9) this.a).b).i("DefaultRemoteVideoTracks.closeOnExecutor", new ne4(2, this));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [org.webrtc.MediaStream[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(org.webrtc.RtpReceiver r3, org.webrtc.MediaStream[] r4) {
        /*
            r2 = this;
            wh4 r0 = new wh4
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            java.lang.String r3 = "DefaultRemoteVideoTracks.handleVideoTracksOnExecutor"
            java.lang.Object r2 = r2.a
            yu9 r2 = (defpackage.yu9) r2
            r2.i(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh4.k(org.webrtc.RtpReceiver, org.webrtc.MediaStream[]):void");
    }

    public final void p(String str, ln1 ln1, List list) {
        ((yu9) this.a).i("DefaultRemoteVideoTracks.setRemoteVideoRenderersOnExecutor", new vh4(this, str, ln1, list));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, n8g, org.webrtc.VideoSink] */
    public final void u(String str, ln1 ln1, List list) {
        synchronized (this.w) {
            try {
                VideoTrack videoTrack = (VideoTrack) this.x.get(str);
                if (videoTrack == null) {
                    ((voc) this.b).log("DefaultRemoteVideoTracks", "no " + ln1 + " track");
                    return;
                }
                List<n8g> list2 = (List) this.w.get(ln1);
                if (list2 == null) {
                    ((voc) this.b).log("DefaultRemoteVideoTracks", "no renderers for " + ln1 + " track");
                } else {
                    for (n8g n8g : list2) {
                        n8g.a = null;
                        try {
                            videoTrack.removeSink(n8g);
                        } catch (Exception unused) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ? obj = new Object();
                        obj.a = (VideoSink) it.next();
                        arrayList.add(obj);
                        if (ln1.a == a9g.a && !videoTrack.isDisposed()) {
                            videoTrack.addSink(obj);
                        }
                    }
                }
                ln1 ln12 = (ln1) this.y.get(str);
                if (ln12 != null) {
                    this.y.remove(str);
                    this.z.remove(ln12);
                }
                this.y.put(str, ln1);
                this.z.put(ln1, str);
                this.w.put(ln1, Collections.unmodifiableList(arrayList));
            } finally {
            }
        }
    }
}
