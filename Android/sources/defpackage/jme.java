package defpackage;

/* renamed from: jme  reason: default package */
public enum jme {
    callStart("callStart"),
    callError("callError"),
    callDevices("callDevices"),
    callIceConnectionState("callIceConnectionState"),
    callAcceptedOutgoing("callAcceptedOutgoing"),
    callAcceptIncoming("callAcceptIncoming"),
    callAcceptConcurrent("callAcceptConcurrent"),
    callPreferH264Sdp("callPreferH264Sdp"),
    callHangup("callHangup"),
    app_event("app_event"),
    callStartMultiparty("callStartMultiparty"),
    callReconnect("callReconnect"),
    switches_to_bad_net("switches_to_bad_net"),
    switches_to_good_net("switches_to_good_net");
    
    public final String a;

    /* access modifiers changed from: public */
    jme(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
