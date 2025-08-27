package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dd4  reason: default package */
public final class dd4 implements wga {
    public final voc a;

    public /* synthetic */ dd4(voc voc) {
        this.a = voc;
    }

    public static we1 a(ue1 ue1, JSONObject jSONObject) {
        JSONObject optJSONObject;
        HashMap hashMap;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("participantState");
        we1 we1 = new we1(ue1);
        HashMap hashMap2 = we1.a;
        if (optJSONObject2 == null) {
            hashMap2.put("hand", new ve1("0", 0));
        } else {
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("state");
            if (optJSONObject3 == null || (optJSONObject = optJSONObject2.optJSONObject("stateUpdateTs")) == null) {
                return null;
            }
            Iterator<String> keys = optJSONObject3.keys();
            if (keys.hasNext()) {
                HashMap hashMap3 = new HashMap(optJSONObject3.length());
                do {
                    String next = keys.next();
                    hashMap3.put(next, optJSONObject3.optString(next));
                } while (keys.hasNext());
                hashMap = hashMap3;
            } else {
                hashMap = MapsKt.emptyMap();
            }
            Iterator<String> keys2 = optJSONObject.keys();
            if (keys2.hasNext()) {
                do {
                    String next2 = keys2.next();
                    String str = (String) hashMap.get(next2);
                    if (str != null) {
                        hashMap2.put(next2, new ve1(str, optJSONObject.optLong(next2)));
                    }
                } while (keys2.hasNext());
            }
        }
        return we1;
    }

    public List b(JSONArray jSONArray) {
        we1 we1;
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                we1 = a(ue1.a(jSONObject.getString("id")), jSONObject);
            } catch (JSONException e) {
                this.a.logException("ParticipantStateParser", "Can't parse one state with index=" + i + " from participantList=" + jSONArray, e);
                we1 = null;
            }
            arrayList.add(we1);
        }
        return CollectionsKt.filterNotNull(arrayList);
    }

    public List c(JSONObject jSONObject) {
        try {
            return b(jSONObject.getJSONArray("participants"));
        } catch (JSONException e) {
            this.a.logException("ParticipantStateParser", "Can't parse state from participantList " + jSONObject, e);
            return CollectionsKt.emptyList();
        }
    }

    public we1 d(JSONObject jSONObject) {
        try {
            ue1 E = tf6.E(jSONObject);
            if (E.a == 0) {
                E = tf6.F(jSONObject);
            }
            return a(E, jSONObject);
        } catch (JSONException e) {
            this.a.logException("ParticipantStateParser", "Can't parse state from " + jSONObject, e);
            return null;
        }
    }
}
