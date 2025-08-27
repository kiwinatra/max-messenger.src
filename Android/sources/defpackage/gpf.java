package defpackage;

/* renamed from: gpf  reason: default package */
public final class gpf implements voc {
    public final yof a;
    public final voc b;

    public gpf(yof yof, voc voc) {
        this.a = yof;
        this.b = voc;
    }

    public final void log(String str, String str2) {
        this.b.log(str, str2);
    }

    public final void logException(String str, String str2, Throwable th) {
        this.b.logException(str, str2, th);
    }

    public final void reportException(String str, String str2, Throwable th) {
        this.b.reportException(str, str2, th);
        yof yof = this.a;
        yof.getClass();
        try {
            ((rof) yof.b.getValue()).a((String) null, th);
        } catch (Throwable unused) {
        }
    }
}
