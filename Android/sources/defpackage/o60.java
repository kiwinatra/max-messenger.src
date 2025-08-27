package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: o60  reason: default package */
public final class o60 implements JavaAudioDeviceModule.AudioRecordStateCallback, JavaAudioDeviceModule.AudioRecordErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback, JavaAudioDeviceModule.AudioTrackErrorCallback {
    public final voc a;

    public /* synthetic */ o60(voc voc) {
        this.a = voc;
    }

    public xn1 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("participants");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("id");
                arrayList.add(new qn1(new rn1(ue1.a(jSONObject3.getString("id")), jSONObject3.getLong("addedTs")), tf6.m(jSONObject2)));
            }
            return new xn1(arrayList, jSONObject.optInt("totalCount", 0), jSONObject.optBoolean("hasMore", false));
        } catch (JSONException e) {
            this.a.log("WaitingRoomParticipantsParser", "can't parse waiting room participants " + e.getMessage());
            return null;
        }
    }

    public ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(ue1.a(string));
            } catch (Throwable th) {
                this.a.logException("ParticipantParser", a81.m("Can't parse id ", string), th);
            }
        }
        return arrayList;
    }

    public void onWebRtcAudioRecordError(String str) {
        this.a.log("AudioRecordCallback", "Audio record error: " + str);
    }

    public void onWebRtcAudioRecordInitError(String str) {
        this.a.log("AudioRecordCallback", "Audio record init error: " + str);
    }

    public void onWebRtcAudioRecordStart() {
        this.a.log("AudioRecordCallback", "Audio record did start");
    }

    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        this.a.log("AudioRecordCallback", "Audio record start error: [" + audioRecordStartErrorCode + "] " + str);
    }

    public void onWebRtcAudioRecordStop() {
        this.a.log("AudioRecordCallback", "Audio record did stop");
    }

    public void onWebRtcAudioTrackError(String str) {
        this.a.log("AudioRecordCallback", "Audio track error: " + str);
    }

    public void onWebRtcAudioTrackInitError(String str) {
        this.a.log("AudioRecordCallback", "Audio track init error: " + str);
    }

    public void onWebRtcAudioTrackStart() {
        this.a.log("AudioRecordCallback", "Audio track did start");
    }

    public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        this.a.log("AudioRecordCallback", "Audio track start error: [" + audioTrackStartErrorCode + "] " + str);
    }

    public void onWebRtcAudioTrackStop() {
        this.a.log("AudioRecordCallback", "Audio track did stop");
    }
}
