package defpackage;

/* renamed from: fw0  reason: default package */
public enum fw0 {
    CALLBACK("CALLBACK"),
    LINK("LINK"),
    REQUEST_CONTACT("REQUEST_CONTACT"),
    REQUEST_GEO_LOCATION("REQUEST_GEO_LOCATION"),
    CHAT("CHAT"),
    OPEN_APP("OPEN_APP"),
    MESSAGE("MESSAGE"),
    UNKNOWN("UNKNOWN");
    
    public static final fw0[] X = null;
    public final String a;

    static {
        X = values();
    }

    /* access modifiers changed from: public */
    fw0(String str) {
        this.a = str;
    }
}
