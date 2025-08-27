package defpackage;

import java.util.AbstractCollection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: hr3  reason: default package */
public final class hr3 extends ij0 {
    public final /* synthetic */ int b = 1;
    public final AbstractCollection c;

    public hr3(long j, a00 a00) {
        super(j);
        this.c = a00;
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "ContactNotFoundEvent{contactServerIds=" + ((LinkedHashSet) this.c) + '}';
            default:
                return "SharePreviewEvent{attaches=" + ((a00) this.c) + '}';
        }
    }

    public hr3(List list) {
        this.c = new LinkedHashSet(list);
    }
}
