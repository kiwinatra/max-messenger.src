package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* renamed from: iq4  reason: default package */
public final class iq4 {
    public final ConversationVideoTrackParticipantKey a;
    public final int b;
    public final int c;

    public iq4(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, int i, int i2) {
        this.a = conversationVideoTrackParticipantKey;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq4)) {
            return false;
        }
        iq4 iq4 = (iq4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) iq4.a) && this.b == iq4.b && this.c == iq4.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rae.h(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayLayout(track=");
        sb.append(this.a);
        sb.append(", w=");
        sb.append(this.b);
        sb.append(", h=");
        return wj6.l(sb, this.c, ")");
    }
}
