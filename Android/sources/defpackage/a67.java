package defpackage;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: a67  reason: default package */
public interface a67 {
    static /* synthetic */ void b(a67 a67, w78 w78, String str, String str2, Object[] objArr, Throwable th, int i) {
        a67.a(w78, str, str2, (i & 8) != 0 ? null : objArr, (i & 16) != 0 ? null : th);
    }

    void a(w78 w78, String str, String str2, Object[] objArr, Throwable th) {
        String j;
        String str3 = str2 == null ? "" : str2;
        if (!(str2 == null || objArr == null)) {
            try {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                j = String.format(locale, str2, Arrays.copyOf(copyOf, copyOf.length));
            } catch (Throwable unused) {
                j = tr1.j(str2, ArraysKt___ArraysKt.joinToString$default(objArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
            }
            str3 = j;
        }
        if (th != null) {
            str3 = tr1.j(str3, djd.f(th));
        }
        if (str3.length() > 0) {
            d(w78, str, str3, th);
        }
    }

    boolean c();

    void d(w78 w78, String str, String str2, Throwable th);
}
