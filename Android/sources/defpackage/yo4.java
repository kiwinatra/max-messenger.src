package defpackage;

import android.os.Handler;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;

/* renamed from: yo4  reason: default package */
public final /* synthetic */ class yo4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap4 b;

    public /* synthetic */ yo4(ap4 ap4, int i) {
        this.a = i;
        this.b = ap4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ap4 ap4 = this.b;
                for (fbb fbb : ap4.I0.values()) {
                    ap4.Y(fbb, fbb.C());
                }
                return;
            default:
                ap4 ap42 = this.b;
                if (ap42.I()) {
                    for (Map.Entry entry : ap42.I0.entrySet()) {
                        ue1 ue1 = (ue1) entry.getKey();
                        if (((fbb) entry.getValue()).C() != PeerConnection.IceConnectionState.CONNECTED) {
                            ye1 z = ap42.z(ue1);
                            ap42.b = true;
                            ur9.d(ap42.v, "DIRECT_CONNECTION_TIMEOUT", z != null ? z.k : null);
                            fm1 fm1 = ap42.w0;
                            if (fm1 != null) {
                                hz0 hz0 = (hz0) fm1;
                                if (ap42.H(xnf.c)) {
                                    hz0.T0.log("OKRTCCall", "onTopologyUpgradeProposed");
                                    o9e o9e = hz0.x;
                                    rp6 a2 = tf6.a((JSONObject) null, "switch-topology");
                                    JSONObject jSONObject = a2.a;
                                    try {
                                        jSONObject.put("topology", (Object) "SERVER");
                                        jSONObject.put("force", false);
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                    o9e.i(a2);
                                    Handler handler = hz0.y;
                                    haf haf = hz0.H0;
                                    handler.removeCallbacks(haf);
                                    hz0.X.b.getClass();
                                    handler.postDelayed(haf, (long) 30000);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
