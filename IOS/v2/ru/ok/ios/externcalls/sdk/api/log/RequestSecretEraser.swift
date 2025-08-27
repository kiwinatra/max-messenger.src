package ru.ok.android.externcalls.sdk.api.log;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0007\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/api/log/RequestSecretEraser;", "", "secretKeys", "", "", "erasedSubstitution", "(Ljava/util/Set;Ljava/lang/String;)V", "eraseSecrets", "jsonString", "", "jsonArray", "Lorg/json/JSONArray;", "json", "Lorg/json/JSONObject;", "getJsonArrayOrNull", "getJsonObjectOrNull", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RequestSecretEraser {
    private final String erasedSubstitution;
    private final Set<String> secretKeys;

    public RequestSecretEraser(Set<String> set, String str) {
        this.secretKeys = set;
        this.erasedSubstitution = str;
    }

    private final JSONArray getJsonArrayOrNull(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getJsonObjectOrNull(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String eraseSecrets(String str) throws JSONException {
        JSONObject jsonObjectOrNull = getJsonObjectOrNull(str);
        JSONArray jsonArrayOrNull = getJsonArrayOrNull(str);
        if (jsonObjectOrNull != null) {
            eraseSecrets(jsonObjectOrNull);
            return jsonObjectOrNull.toString();
        } else if (jsonArrayOrNull == null) {
            return this.erasedSubstitution;
        } else {
            eraseSecrets(jsonArrayOrNull);
            return jsonArrayOrNull.toString();
        }
    }

    private final void eraseSecrets(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (this.secretKeys.contains(next)) {
                jSONObject.put(next, (Object) this.erasedSubstitution);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                eraseSecrets(optJSONObject);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(next);
            if (optJSONArray != null) {
                eraseSecrets(optJSONArray);
            }
        }
    }

    private final void eraseSecrets(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                eraseSecrets(optJSONObject);
            }
            JSONArray optJSONArray = jSONArray.optJSONArray(i);
            if (optJSONArray != null) {
                eraseSecrets(optJSONArray);
            }
        }
    }
}
