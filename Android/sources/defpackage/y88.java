package defpackage;

/* renamed from: y88  reason: default package */
public final class y88 extends Error {
    public final String a;

    public y88(String str, byte b) {
        super(str, (Throwable) null);
        this.a = str;
    }

    public final String getMessage() {
        return this.a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public y88(String str, int i) {
        this(wj6.k("InvalidPhoneNumber (", str, ")"), (byte) 0);
        switch (i) {
            case 1:
                this(wj6.k("SmsAttemptExceed (Phone: ", str, ")"), (byte) 0);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public y88(String str, Throwable th) {
        this(g63.i(str == null ? "Unspecified" : str, " | ", th != null ? th.getMessage() : null), (byte) 0);
    }
}
