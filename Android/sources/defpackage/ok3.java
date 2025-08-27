package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* renamed from: ok3  reason: default package */
public final /* synthetic */ class ok3 implements rk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ok3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return;
            case 1:
                xh4 xh4 = (xh4) this.b;
                PeerConnection peerConnection = (PeerConnection) obj;
                synchronized (xh4.w) {
                    try {
                        for (String str : xh4.y.keySet()) {
                            xh4.u(str, (ln1) xh4.y.get(str), (List) null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                ((PeerConnection) obj).removeIceCandidates((IceCandidate[]) this.b);
                return;
            case 3:
                ((PeerConnection) obj).getStats(new y3a(5, (Object) (one) this.b));
                return;
            case 4:
                StereoRoomManagerImpl.withInternalId$lambda$11((Function1) this.b, (ue1) obj);
                return;
            default:
                ((pbe) ((ube) this.b)).a((ue1) obj);
                return;
        }
    }
}
