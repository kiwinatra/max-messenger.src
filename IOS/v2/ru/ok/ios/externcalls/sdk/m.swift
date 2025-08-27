package ru.ok.android.externcalls.sdk;

import org.json.JSONObject;

public final /* synthetic */ class m implements n9e {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gz0 c;
    public final /* synthetic */ rk3 o;

    public /* synthetic */ m(ConversationImpl conversationImpl, boolean z, gz0 gz0, rk3 rk3) {
        this.a = conversationImpl;
        this.b = z;
        this.c = gz0;
        this.o = rk3;
    }

    public final void k(JSONObject jSONObject) {
        this.a.lambda$setCallOptionEnabled$23(this.b, this.c, this.o, jSONObject);
    }
}
