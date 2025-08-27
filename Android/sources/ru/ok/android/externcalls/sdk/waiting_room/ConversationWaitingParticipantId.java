package ru.ok.android.externcalls.sdk.waiting_room;

import java.util.Objects;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

public final class ConversationWaitingParticipantId {
    public final long addedTs;
    private final ParticipantId participantId;

    public ConversationWaitingParticipantId(ParticipantId participantId2, long j) {
        this.participantId = participantId2;
        this.addedTs = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConversationWaitingParticipantId.class != obj.getClass()) {
            return false;
        }
        ConversationWaitingParticipantId conversationWaitingParticipantId = (ConversationWaitingParticipantId) obj;
        return this.addedTs == conversationWaitingParticipantId.addedTs && this.participantId.equals(conversationWaitingParticipantId.participantId);
    }

    public long getAddedTs() {
        return this.addedTs;
    }

    public ParticipantId getParticipantId() {
        return this.participantId;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.participantId, Long.valueOf(this.addedTs)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationWaitingParticipantId{participantId=");
        sb.append(this.participantId);
        sb.append(", addedTs=");
        return i2a.j(sb, this.addedTs, '}');
    }
}
