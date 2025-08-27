package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: e35  reason: default package */
public final class e35 {
    public String a;

    public e35(String str) {
        this.a = a81.l("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return g63.i(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            c(this.a, str, objArr);
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            c(this.a, str, objArr);
        }
    }
}
