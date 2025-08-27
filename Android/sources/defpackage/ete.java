package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: ete  reason: default package */
public enum ete {
    RECENT("recent"),
    FAVORITE("favorite"),
    SET("set");
    
    public static final u9a b = null;
    public final String a;

    static {
        ete[] eteArr;
        x = EnumEntriesKt.enumEntries((E[]) eteArr);
        b = new u9a(19);
    }

    /* access modifiers changed from: public */
    ete(String str) {
        this.a = str;
    }
}
