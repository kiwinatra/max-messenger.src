package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ht8  reason: default package */
public final class ht8 {
    public static JSONObject a(Set set, ue1 ue1, zwd zwd) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) ue1 != null ? ue1.c() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int ordinal = ((et8) it.next()).ordinal();
            if (ordinal == 0) {
                str = "AUDIO";
            } else if (ordinal == 1) {
                str = "VIDEO";
            } else if (ordinal == 2) {
                str = "SCREEN_SHARING";
            } else if (ordinal == 3) {
                str = "MOVIE_SHARING";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            jSONArray.put((Object) str);
        }
        jSONObject.put("requestedMedia", (Object) jSONArray);
        jSONObject.put("command", (Object) "mute-participant");
        if (zwd instanceof ywd) {
            jSONObject.put("roomId", ((ywd) zwd).a);
        }
        return jSONObject;
    }

    public static JSONObject b(Map map, ue1 ue1, zwd zwd) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) ue1 != null ? ue1.c() : null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("AUDIO", (Object) tf6.Q((ft8) map.get(et8.a)));
        jSONObject2.put("VIDEO", (Object) tf6.Q((ft8) map.get(et8.b)));
        jSONObject2.put("SCREEN_SHARING", (Object) tf6.Q((ft8) map.get(et8.c)));
        jSONObject2.put("MOVIE_SHARING", (Object) tf6.Q((ft8) map.get(et8.o)));
        jSONObject.put("muteStates", (Object) jSONObject2);
        jSONObject.put("command", (Object) "mute-participant");
        if (zwd instanceof ywd) {
            jSONObject.put("roomId", ((ywd) zwd).a);
        }
        return jSONObject;
    }
}
