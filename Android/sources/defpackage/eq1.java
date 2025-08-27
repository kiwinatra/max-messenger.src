package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: eq1  reason: default package */
public abstract class eq1 {
    public static final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lj1(17));

    public static final boolean a(e9d e9d) {
        String str;
        Object obj;
        Object obj2;
        Lazy lazy = a;
        Iterator it = ((List) lazy.getValue()).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (e9d.g((String) obj) != null) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            Iterator it2 = e9d.e().iterator();
            loop1:
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                i9d i9d = (i9d) obj2;
                Iterable<String> iterable = (List) lazy.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (String str3 : iterable) {
                        String str4 = i9d.b;
                        if (str4 != null && StringsKt__StringsKt.contains$default((CharSequence) str4, (CharSequence) str3, false, 2, (Object) null)) {
                            break loop1;
                        }
                    }
                    continue;
                }
            }
            i9d i9d2 = (i9d) obj2;
            if (i9d2 != null) {
                str = i9d2.b;
            }
            str2 = str;
        }
        if (str2 != null) {
            e9d.D(str2);
        }
        return str2 != null;
    }
}
