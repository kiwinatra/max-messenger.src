package ru.ok.android.externcalls.sdk.api;

import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.rate.Question;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.util.compressor.LZ4;

public class ConversationParams {
    private static final String LOG_TAG = "ConversationParams";
    public static final op7 PARSER = new zb2(24);
    public String clientType;
    public int deviceIndex;
    public String endpoint;
    public String id;
    public boolean isP2PForbidden;
    public Integer ispAsNo;
    public String ispAsOrg;
    public String locCc;
    public String locReg;
    public RateCallData rateCallData;
    public List<PeerConnection.IceServer> stunTurnServers = new ArrayList();
    public String token;

    public static ConversationParams decode(String str) {
        int parseInt;
        try {
            String[] split = str.split(":");
            if (split.length < 2 || (parseInt = Integer.parseInt(split[0])) <= 0) {
                return null;
            }
            byte[] bArr = new byte[parseInt];
            if (LZ4.a(Base64.decode(split[1], 0), bArr) != parseInt) {
                return null;
            }
            return parseCallParamsCompact(new JSONObject(new String(bArr)));
        } catch (Throwable th) {
            throw new RuntimeException("Error decode conversation params", th);
        }
    }

    public static ConversationParams parseCallParams(JSONObject jSONObject) {
        try {
            ConversationParams conversationParams = new ConversationParams();
            conversationParams.token = jSONObject.getString(ApiProtocol.KEY_TOKEN);
            conversationParams.deviceIndex = jSONObject.optInt(ApiProtocol.KEY_DEVICE_IDX, 0);
            conversationParams.clientType = jSONObject.optString(ApiProtocol.KEY_CLIENT_TYPE);
            conversationParams.rateCallData = parseRateCallData(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject(ApiProtocol.KEY_TURN_SERVER);
            if (optJSONObject == null) {
                GlobalRTCLogger.logException(LOG_TAG, "null turn", new NullPointerException("null turn"));
            } else {
                JSONArray optJSONArray = optJSONObject.optJSONArray("urls");
                String optString = optJSONObject.optString("username", (String) null);
                String optString2 = optJSONObject.optString("credential", (String) null);
                if (!(optJSONArray == null || optString == null || optString2 == null)) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(optJSONArray.getString(i)).setUsername(optString).setPassword(optString2).createIceServer());
                    }
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(ApiProtocol.KEY_STUN_SERVER);
            if (optJSONObject2 == null) {
                GlobalRTCLogger.logException(LOG_TAG, "null stun", new NullPointerException("null stun"));
            } else {
                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("urls");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(optJSONArray2.getString(i2)).createIceServer());
                    }
                }
            }
            conversationParams.endpoint = jSONObject.optString(ApiProtocol.KEY_ENDPOINT);
            if (jSONObject.has("isp_as_no")) {
                conversationParams.ispAsNo = Integer.valueOf(jSONObject.optInt("isp_as_no"));
            }
            conversationParams.ispAsOrg = jSONObject.optString("isp_as_org");
            conversationParams.locCc = jSONObject.optString("loc_cc");
            conversationParams.locReg = jSONObject.optString("loc_reg");
            return conversationParams;
        } catch (JSONException e) {
            GlobalRTCLogger.logException(LOG_TAG, "json exception", e);
            return null;
        }
    }

    private static ConversationParams parseCallParamsCompact(JSONObject jSONObject) {
        ConversationParams conversationParams = new ConversationParams();
        try {
            conversationParams.token = jSONObject.getString("tkn");
            conversationParams.clientType = jSONObject.optString("srcp");
            String optString = jSONObject.optString("trne", (String) null);
            String optString2 = jSONObject.optString("trnu", (String) null);
            String optString3 = jSONObject.optString("trnp", (String) null);
            if (!(optString == null || optString.isEmpty() || optString2 == null || optString3 == null)) {
                for (String str : optString.split(",")) {
                    if (!str.isEmpty()) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(str).setUsername(optString2).setPassword(optString3).createIceServer());
                    }
                }
            }
            String optString4 = jSONObject.optString("stne", (String) null);
            if (optString4 != null && !optString4.isEmpty()) {
                for (String str2 : optString4.split(",")) {
                    if (!str2.isEmpty()) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(str2).createIceServer());
                    }
                }
            }
            conversationParams.endpoint = jSONObject.optString("wse");
            return conversationParams;
        } catch (JSONException e) {
            throw new RuntimeException("No token provided", e);
        }
    }

    public static RateCallData parseRateCallData(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        int optInt = jSONObject.optInt("max_rate_for_question", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("questions");
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                arrayList2.add(new Question(jSONObject2.getInt("id"), jSONObject2.getString("text")));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        return new RateCallData(optInt, arrayList);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationParams{endpoint='");
        sb.append(this.endpoint);
        sb.append("', token='");
        sb.append(this.token);
        sb.append("', rateCallData=");
        sb.append(this.rateCallData);
        sb.append(", deviceIndex=");
        sb.append(this.deviceIndex);
        sb.append(", stunTurnServers=");
        sb.append(this.stunTurnServers);
        sb.append(", ispAsNo=");
        sb.append(this.ispAsNo);
        sb.append(", ispAsOrg='");
        sb.append(this.ispAsOrg);
        sb.append("', locCc='");
        sb.append(this.locCc);
        sb.append("', locReg='");
        return wj6.n(sb, this.locReg, "'}");
    }

    /* access modifiers changed from: private */
    public static ConversationParams parseCallParams(sp7 sp7) throws IOException, JsonTypeMismatchException {
        return parseCallParams(kr7.E(sp7));
    }
}
