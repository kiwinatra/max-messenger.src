package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: kn5  reason: default package */
public final class kn5 {
    public final String a;

    public /* synthetic */ kn5(String str, byte b) {
        this.a = str;
    }

    public static String b(long j) {
        if (j == LongCompanionObject.MAX_VALUE) {
            return "Long.MAX_VALUE";
        }
        if (j == Long.MIN_VALUE) {
            return "Long.MIN_VALUE";
        }
        if (j < 0) {
            return String.valueOf(j);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.ENGLISH, "%td.%tm/%tH:%tM:%tS", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(j), Long.valueOf(j), Long.valueOf(j), Long.valueOf(j)}, 5));
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return g63.i(str, " : ", str2);
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append(this.a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public void c(String str) {
        z68.c(this.a, str, new Object[0]);
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            e(this.a, str, objArr);
        }
    }

    public kn5(String str, int i) {
        switch (i) {
            case 3:
                this.a = a81.l("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
                return;
            default:
                str.getClass();
                this.a = str;
                return;
        }
    }
}
