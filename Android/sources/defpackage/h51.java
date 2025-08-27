package defpackage;

/* renamed from: h51  reason: default package */
public final class h51 implements voc {
    public final void log(String str, String str2) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "CallsSdk", g63.j("[", str, "] ", str2), (Throwable) null);
        }
    }

    public final void logException(String str, String str2, Throwable th) {
        z68.h("CallsSdk", th, "[%s] %s", str, str2);
    }
}
