package defpackage;

/* renamed from: z3h  reason: default package */
public enum z3h {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);
    
    public final int a;

    /* access modifiers changed from: public */
    z3h(int i) {
        this.a = i;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }
}
