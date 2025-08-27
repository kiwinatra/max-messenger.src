package ru.ok.android.externcalls.sdk.api;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ok/android/externcalls/sdk/api/JoinByIdResponse;", "json", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OkApiService$joinToConversation$1<T, R> implements zi6 {
    public static final OkApiService$joinToConversation$1<T, R> INSTANCE = new OkApiService$joinToConversation$1<>();

    public final JoinByIdResponse apply(JSONObject jSONObject) {
        return new JoinByIdResponse(jSONObject.optBoolean(ApiProtocol.KEY_P2P_FORBIDDEN, false), jSONObject.optString(ApiProtocol.KEY_ENDPOINT), jSONObject.optInt(ApiProtocol.KEY_DEVICE_IDX));
    }
}
