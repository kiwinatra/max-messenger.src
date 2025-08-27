package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.util.Printer;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oc8  reason: default package */
public final class oc8 implements Printer {
    public long a;
    public long b;
    public long c;
    public final LinkedList d = new LinkedList();

    public static String a(String str) {
        int i;
        String r = StringsKt__StringsKt.removePrefix(StringsKt__StringsKt.removePrefix(str, (CharSequence) ">>>>> Dispatching to "), (CharSequence) "<<<<< Finished to ");
        int n = StringsKt__StringsKt.lastIndexOf$default((CharSequence) r, ": ", 0, false, 6, (Object) null);
        int l = StringsKt__StringsKt.indexOf$default((CharSequence) r, "} ", 0, false, 6, (Object) null);
        String substring = r.substring(0, l + 1);
        if (n <= 0 && l <= 0) {
            return r;
        }
        int l2 = StringsKt__StringsKt.indexOf$default((CharSequence) r, "DispatchedContinuation[Dispatchers.Main", 0, false, 6, (Object) null);
        if (l2 >= 0) {
            int i2 = l2 + 39;
            int l3 = StringsKt__StringsKt.indexOf$default((CharSequence) r, ".immediate", i2, false, 4, (Object) null);
            i = l3 >= 0 ? StringsKt__StringsKt.indexOf$default((CharSequence) r, ", Continuation at ", l3 + 10, false, 4, (Object) null) : StringsKt__StringsKt.indexOf$default((CharSequence) r, ", Continuation at ", i2, false, 4, (Object) null);
            if (i >= 0) {
                i += 18;
            }
        } else {
            i = l + 2;
        }
        int m = StringsKt__StringsKt.lastIndexOf$default((CharSequence) r, ']', 0, false, 6, (Object) null);
        Integer valueOf = Integer.valueOf(m);
        Integer num = null;
        if (m <= i) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : r.length();
        int m2 = StringsKt__StringsKt.lastIndexOf$default((CharSequence) r, '@', 0, false, 6, (Object) null);
        Integer valueOf2 = Integer.valueOf(m2);
        if (m2 > i) {
            num = valueOf2;
        }
        String substring2 = r.substring(i, Math.min(num != null ? num.intValue() : r.length(), intValue));
        return !Intrinsics.areEqual((Object) substring2, (Object) "null") ? substring2 : g63.i(substring, " ", r.substring(n + 2));
    }

    public final void println(String str) {
        if (str == null) {
            return;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(str, ">>>>> Dispatching to ", false, 2, (Object) null)) {
            String a2 = a(str);
            if (Trace.isEnabled()) {
                Trace.beginSection(a2);
            }
            this.a = SystemClock.uptimeMillis();
            this.c++;
        } else if (StringsKt__StringsJVMKt.startsWith$default(str, "<<<<< Finished to ", false, 2, (Object) null)) {
            if (Trace.isEnabled()) {
                Trace.endSection();
            }
            this.c--;
            this.b = System.currentTimeMillis();
            this.d.add(new nc8(this.a, this.b, this.c, a(str)));
            this.a = 0;
            this.b = 0;
        }
    }
}
