package defpackage;

/* renamed from: y8c  reason: default package */
public enum y8c {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public final String a;

    /* access modifiers changed from: public */
    y8c(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
