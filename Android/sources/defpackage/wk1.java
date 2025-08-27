package defpackage;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.StatsReport;

/* renamed from: wk1  reason: default package */
public final /* synthetic */ class wk1 implements xne {
    public final /* synthetic */ tgg a;
    public final /* synthetic */ long b;

    public /* synthetic */ wk1(tgg tgg, long j) {
        this.a = tgg;
        this.b = j;
    }

    public final void a(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, qr0[] qr0Arr, Map map, gm1 gm1) {
        tgg tgg = this.a;
        soc soc = new soc((voc) tgg.o, statsReportArr);
        HashMap hashMap = new HashMap();
        p7d p7d = (p7d) tgg.a;
        hashMap.put("vcid", ((yoc) p7d.b).conversationId);
        String str = (String) soc.o;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hashMap.put("local_connection_type", str);
        String str3 = (String) soc.c;
        if (str3 == null) {
            str3 = str2;
        }
        hashMap.put("remote_connection_type", str3);
        String str4 = (String) soc.v;
        if (str4 == null) {
            str4 = str2;
        }
        hashMap.put("local_address", str4);
        String str5 = (String) soc.w;
        if (str5 != null) {
            str2 = str5;
        }
        hashMap.put("remote_address", str2);
        hashMap.put("network_type", ur9.b((ConnectivityManager) tgg.b, (TelephonyManager) tgg.c));
        hashMap.put("stat_time_delta", String.valueOf(this.b));
        ((yoc) p7d.b).log(yoc.COLLECTOR_WEBRTC, "callStatConnect", (Map) hashMap);
    }
}
