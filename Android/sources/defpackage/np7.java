package defpackage;

/* renamed from: np7  reason: default package */
public enum np7 {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_YAML_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    ALLOW_MISSING_VALUES(false),
    ALLOW_TRAILING_COMMA(false),
    STRICT_DUPLICATE_DETECTION(false),
    INCLUDE_SOURCE_IN_LOCATION(true);
    
    public final boolean a;
    public final int b;

    /* access modifiers changed from: public */
    np7(boolean z) {
        this.b = 1 << ordinal();
        this.a = z;
    }

    public final boolean a(int i) {
        return (this.b & i) != 0;
    }
}
