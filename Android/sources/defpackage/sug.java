package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sug  reason: default package */
public final class sug {
    public final boolean a;
    public final List b;
    public final boolean c;

    public sug(ArrayList arrayList, boolean z, boolean z2) {
        this.a = z;
        this.b = arrayList;
        this.c = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleConversationParticipantsResult{isMeRestricted=");
        sb.append(this.a);
        sb.append(", responders=");
        sb.append(this.b);
        sb.append(", callToGroup=");
        return wzf.l(sb, this.c, '}');
    }
}
