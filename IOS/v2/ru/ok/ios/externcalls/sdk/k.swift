package ru.ok.android.externcalls.sdk;

import org.json.JSONObject;

public final /* synthetic */ class k implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk3 b;

    public /* synthetic */ k(rk3 rk3, int i) {
        this.a = i;
        this.b = rk3;
    }

    public final void k(JSONObject jSONObject) {
        int i = this.a;
        rk3 rk3 = this.b;
        switch (i) {
            case 0:
                ConversationImpl.lambda$addParticipant$25(rk3, jSONObject);
                return;
            case 1:
                ConversationImpl.lambda$setCallOptionEnabled$24(rk3, jSONObject);
                return;
            default:
                ConversationImpl.lambda$addParticipant$27(rk3, jSONObject);
                return;
        }
    }
}
