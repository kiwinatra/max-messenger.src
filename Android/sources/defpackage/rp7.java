package defpackage;

/* renamed from: rp7  reason: default package */
public enum rp7 implements jm7 {
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(np7.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS);
    
    public final int a;
    public final np7 b;

    /* access modifiers changed from: public */
    rp7(np7 np7) {
        this.a = 1 << ordinal();
        this.b = np7;
    }

    public final boolean a() {
        return false;
    }

    public final int getMask() {
        return this.a;
    }
}
