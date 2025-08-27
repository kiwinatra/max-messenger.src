package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: d4g  reason: default package */
public final class d4g implements Serializable {
    public final fo3 a;
    public final String b;
    public final String c;
    public final String o;
    public final int v;
    public final long w;
    public final List x;

    public d4g(ccd ccd) {
        this.a = (fo3) ccd.d;
        this.b = (String) ccd.e;
        this.o = (String) ccd.f;
        this.c = (String) ccd.g;
        this.v = ccd.b;
        this.w = ccd.c;
        this.x = (List) ccd.h;
    }

    public final String toString() {
        int o2 = kv0.o(this.x);
        return "VideoConference{owner=" + this.a + ", joinLink='" + this.b + "', conversationId='" + this.c + "', callName='" + this.o + "', participantsCount=" + this.v + ", startedAt=" + this.w + ", previewParticipantIds=" + o2 + "}";
    }
}
