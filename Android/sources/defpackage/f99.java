package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: f99  reason: default package */
public enum f99 {
    CLICK("clicked_clickable_element"),
    COPY("clicked_copy"),
    OPEN_LINK("clicked_open_link"),
    OPEN_MAIL("clicked_open_mail"),
    CALL("clicked_call");
    
    public final String a;

    static {
        f99[] f99Arr;
        y = EnumEntriesKt.enumEntries((E[]) f99Arr);
    }

    /* access modifiers changed from: public */
    f99(String str) {
        this.a = str;
    }
}
