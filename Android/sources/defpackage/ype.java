package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: ype  reason: default package */
public enum ype {
    SUGGEST("SUGGEST"),
    SHOWCASE("SHOWCASE"),
    SEARCH("SEARCH"),
    RECENTS("RECENTS"),
    FORWARD("FORWARD"),
    KEYBOARD_FAVORITE("KEYBOARD_FAVORITE"),
    KEYBOARD_FAVORITE_SET("KEYBOARD_FAVORITE_SET"),
    SET("SET"),
    SIMILAR("SIMILAR"),
    SIMILAR_TAB("SIMILAR_TAB");
    
    public static final t9a b = null;
    public final String a;

    static {
        ype[] ypeArr;
        w0 = EnumEntriesKt.enumEntries((E[]) ypeArr);
        b = new t9a(19);
    }

    /* access modifiers changed from: public */
    ype(String str) {
        this.a = str;
    }
}
