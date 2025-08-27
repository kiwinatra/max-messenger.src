package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* renamed from: f9b  reason: default package */
public abstract class f9b {
    public static final af1 a() {
        ze1 ze1 = ze1.c;
        ParticipantId participantId = new ParticipantId(String.valueOf(0), false, ze1.b);
        ft8 ft8 = ft8.a;
        List emptyList = CollectionsKt.emptyList();
        bf1 bf1 = bf1.a;
        x8g x8g = r6;
        x8g x8g2 = new x8g(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(participantId).build(), false);
        x8g x8g3 = r6;
        x8g x8g4 = new x8g(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(participantId).setType(a9g.b).build(), false);
        return new af1(ze1, ft8, ft8, ft8, false, false, x8g, x8g3, false, false, false, false, 0, true, false, false, false, false, false, emptyList, bf1);
    }

    public static final ze1 b(ParticipantId participantId) {
        Integer intOrNull;
        int i = 0;
        List y = StringsKt__StringsKt.split$default((CharSequence) participantId.id, new String[]{":"}, false, 0, 6, (Object) null);
        if (y.size() > 1 && (intOrNull = StringsKt.toIntOrNull((String) y.get(1))) != null) {
            i = intOrNull.intValue();
        }
        return new ze1(Long.parseLong((String) CollectionsKt.first(y)), i);
    }

    public static final ParticipantId c(long j) {
        return ParticipantId.authorized(String.valueOf(j));
    }
}
