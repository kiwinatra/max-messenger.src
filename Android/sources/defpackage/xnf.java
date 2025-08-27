package defpackage;

import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xnf  reason: default package */
public enum xnf {
    ;
    
    public static final nfd a = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [xnf, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r1v1, types: [xnf, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r2v2, types: [xnf, java.lang.Enum] */
    static {
        xnf[] xnfArr;
        w = EnumEntriesKt.enumEntries((E[]) xnfArr);
        a = new nfd(20);
    }

    public static final xnf a(String str) {
        a.getClass();
        return Intrinsics.areEqual((Object) str, (Object) "DIRECT") ? c : Intrinsics.areEqual((Object) str, (Object) "SERVER") ? o : b;
    }
}
