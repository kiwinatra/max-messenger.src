package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: wa4  reason: default package */
public abstract class wa4 {
    public final LinkedHashSet a = new LinkedHashSet(1);

    public static ra4 a(wa4 wa4, String str, String[] strArr, Set set, ma4 ma4, int i) {
        Set set2 = (i & 2) != 0 ? null : set;
        if ((i & 4) != 0) {
            ma4 = ma4.b;
        }
        ma4 ma42 = ma4;
        boolean z = (i & 8) != 0;
        if (StringsKt__StringsKt.startsWith$default((CharSequence) str, ':', false, 2, (Object) null)) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String lowerCase : strArr) {
                arrayList.add(lowerCase.toLowerCase(Locale.ROOT));
            }
            ra4 ra4 = new ra4(y64.c(str.toLowerCase(Locale.ROOT), "max", (String) null), ma42, new LinkedHashSet(arrayList), z, set2);
            wa4.a.add(ra4);
            return ra4;
        }
        throw new IllegalStateException("invalid route ".concat(str).toString());
    }
}
