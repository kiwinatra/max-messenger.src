package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: mbb  reason: default package */
public final class mbb {
    public final Map a;

    public mbb(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public static final mbb a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        int length = names.length();
        for (int i = 0; i < length; i++) {
            String string = names.getString(i);
            JSONArray jSONArray = jSONObject.getJSONArray(string);
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.has("dimension") && jSONObject2.has("bitrate")) {
                    arrayList.add(new lbb(jSONObject2.getInt("dimension"), jSONObject2.getInt("bitrate")));
                }
            }
            linkedHashMap.put(string.toLowerCase(Locale.ROOT), CollectionsKt.sortedWith(arrayList, new ed7(6)));
        }
        return new mbb(linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mbb) && Intrinsics.areEqual((Object) this.a, (Object) ((mbb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PeerVideoSettingsBitrateTable(bitrateTables=" + this.a + ")";
    }
}
