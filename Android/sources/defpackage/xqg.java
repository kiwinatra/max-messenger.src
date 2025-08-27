package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: xqg  reason: default package */
public enum xqg {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');
    
    public final char a;
    public final char b;

    static {
        xqg[] xqgArr;
        y = EnumEntriesKt.enumEntries((E[]) xqgArr);
    }

    /* access modifiers changed from: public */
    xqg(char c, char c2) {
        this.a = c;
        this.b = c2;
    }
}
