package com.my.tracker.personalize;

import android.text.TextUtils;
import com.my.tracker.obfuscated.x2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

final class d extends b {
    public static c b(JSONObject jSONObject) {
        String a = a(jSONObject, "sku", ApiProtocol.PARAM_PAYLOAD, "value", "discount_value", "price", "discount_price");
        if (a != null) {
            return new c((Object) null, a);
        }
        String optString = jSONObject.optString("sku");
        if (TextUtils.isEmpty(optString)) {
            return a("Invalid value for key: ", "sku");
        }
        String optString2 = jSONObject.optString(ApiProtocol.PARAM_PAYLOAD);
        if (TextUtils.isEmpty(optString2)) {
            return a("Invalid value for key: ", ApiProtocol.PARAM_PAYLOAD);
        }
        int optInt = jSONObject.optInt("value");
        int optInt2 = jSONObject.optInt("discount_value");
        return new c(new PersonalizeItem(optString, optString2, jSONObject.optDouble("price"), jSONObject.optDouble("discount_price"), optInt, optInt2), (String) null);
    }

    public static c c(JSONObject jSONObject) {
        String str;
        StringBuilder sb;
        String a = a(jSONObject, "offer_id", "subitems");
        if (a != null) {
            return new c((Object) null, a);
        }
        int optInt = jSONObject.optInt("offer_id");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("subitems");
        if (optJSONArray == null) {
            return a("No value for key: ", "subitems");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            c b = b(optJSONArray.optJSONObject(i));
            String a2 = b.a();
            if (!TextUtils.isEmpty(a2)) {
                str = "Can't parse item " + i + " with errors: " + a2;
                arrayList2.add(str);
                sb = new StringBuilder("PersonalizePlacementsParser: ");
            } else {
                PersonalizeItem personalizeItem = (PersonalizeItem) b.b();
                if (personalizeItem == null) {
                    str = "Can't parse item " + i + " without errors";
                    arrayList2.add(str);
                    sb = new StringBuilder("PersonalizePlacementsParser: ");
                } else {
                    arrayList.add(personalizeItem);
                }
            }
            sb.append(str);
            x2.a(sb.toString());
        }
        return arrayList2.size() > 0 ? new c((Object) null, String.join(", ", arrayList2)) : new c(new PersonalizeOffer(optInt, arrayList), (String) null);
    }

    public static c d(JSONObject jSONObject) {
        String a = a(jSONObject, "placement_id", "test_id", "group_id", "offer");
        if (a != null) {
            return new c((Object) null, a);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("offer");
        if (optJSONObject == null) {
            return a("Invalid value for key: ", "offer");
        }
        c c = c(optJSONObject);
        String a2 = c.a();
        if (a2 != null) {
            x2.a("PersonalizePlacementsParser: Can't parse offer's object with error: ".concat(a2));
            return new c((Object) null, a2);
        }
        PersonalizeOffer personalizeOffer = (PersonalizeOffer) c.b();
        if (personalizeOffer == null) {
            return a("Can't parse offer's object without error from parser", null);
        }
        String optString = jSONObject.optString("placement_id");
        return TextUtils.isEmpty(optString) ? a("Invalid value for key: ", "placement_id") : new c(new PersonalizePlacement(optString, jSONObject.optInt("group_id"), jSONObject.optInt("test_id"), personalizeOffer), (String) null);
    }

    public c a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("errors");
        ArrayList arrayList = new ArrayList();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                arrayList.add(next + ": " + optString);
            }
            return new c((Object) null, String.join(", ", arrayList));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return a("No value for key: ", "data");
        }
        if (optJSONArray.length() == 0) {
            return a("No placements in the list");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            c d = d(optJSONArray.optJSONObject(i));
            String a = d.a();
            if (a != null) {
                x2.a("PersonalizePlacementsParser: Placement parsing error: ".concat(a));
            } else {
                PersonalizePlacement personalizePlacement = (PersonalizePlacement) d.b();
                if (personalizePlacement != null) {
                    arrayList2.add(personalizePlacement);
                }
            }
        }
        return arrayList2.isEmpty() ? a("No placements in the list") : new c(arrayList2, (String) null);
    }

    public static c a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String append : strArr) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        x2.a("PersonalizePlacementsParser: " + sb2);
        return new c((Object) null, sb2);
    }

    public static String a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                String m = a81.m("No value for key: ", str);
                x2.a("PersonalizePlacementsParser: " + m);
                return m;
            }
        }
        return null;
    }
}
