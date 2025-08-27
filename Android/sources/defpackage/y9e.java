package defpackage;

import java.util.Iterator;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y9e  reason: default package */
public enum y9e {
    ;
    
    public static final ece b = null;
    public final String a;

    static {
        y9e[] y9eArr;
        o = EnumEntriesKt.enumEntries((E[]) y9eArr);
        b = new ece(18);
    }

    /* access modifiers changed from: public */
    y9e(String str) {
        this.a = str;
    }

    public static final y9e a(String str) {
        Object obj;
        b.getClass();
        Iterator it = o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((y9e) obj).a, (Object) str)) {
                break;
            }
        }
        return (y9e) obj;
    }
}
