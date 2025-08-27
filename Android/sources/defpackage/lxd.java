package defpackage;

import android.net.Uri;
import android.os.ConditionVariable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.MapsKt;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: lxd  reason: default package */
public final class lxd {
    public volatile ConditionVariable a;

    public final void a(g8f g8f, List list, kxd kxd) {
        kof kof = kof.a;
        String a2 = kof.a();
        if (a2 != null) {
            Collection<ix4> d = kof.b().d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("buildUuid", (Object) g8f.e);
            jSONObject.put("deviceId", (Object) g8f.h);
            jSONObject.put("sessions", (Object) hsg.J(list));
            if (!d.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (ix4 ix4 : d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("event", (Object) ix4.a);
                    jSONObject2.put("reason", (Object) ix4.b);
                    jSONObject2.put(NewHtcHomeBadger.COUNT, ix4.c);
                    jSONArray.put((Object) jSONObject2);
                }
                jSONObject.put("drops", (Object) jSONArray);
            }
            kof kof2 = kof.a;
            Object obj = kof.c().get(iq.c);
            if ((obj instanceof l04 ? (l04) obj : null) == null) {
                MapsKt.toMap(new LinkedHashMap());
            }
            d19 d19 = new d19(Uri.parse(l04.b()).buildUpon().appendEncodedPath("api/crash/trackSession").appendQueryParameter("crashToken", a2).toString(), (h57) pf6.i("application/json; charset=utf-8", jSONObject.toString()));
            ConditionVariable conditionVariable = new ConditionVariable();
            this.a = conditionVariable;
            ipf.b(new po1(d19, this, d, conditionVariable, kxd, 9));
        }
    }
}
