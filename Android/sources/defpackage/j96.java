package defpackage;

import kotlin.enums.EnumEntriesKt;
import org.apache.http.HttpStatus;

/* renamed from: j96  reason: default package */
public enum j96 {
    Regular(HttpStatus.SC_BAD_REQUEST),
    Medium(500),
    Semibold(600);
    
    public final int a;

    static {
        j96[] j96Arr;
        w = EnumEntriesKt.enumEntries((E[]) j96Arr);
    }

    /* access modifiers changed from: public */
    j96(int i) {
        this.a = i;
    }
}
