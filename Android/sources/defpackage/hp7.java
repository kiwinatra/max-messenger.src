package defpackage;

/* renamed from: hp7  reason: default package */
public enum hp7 {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false);
    
    public final boolean a;
    public final int b;

    /* access modifiers changed from: public */
    hp7(boolean z) {
        this.a = z;
        this.b = 1 << ordinal();
    }

    public final boolean a(int i) {
        return (this.b & i) != 0;
    }
}
