package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: fhg  reason: default package */
public enum fhg implements ihg {
    ;
    
    public static final dbe o = null;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        fhg[] fhgArr;
        w = EnumEntriesKt.enumEntries((E[]) fhgArr);
        o = new dbe(21);
    }

    /* access modifiers changed from: public */
    fhg(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = null;
    }

    public final Integer a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }
}
