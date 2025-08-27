package ru.ok.android.externcalls.sdk.chat.message;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;", "", "participantId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "text", "", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;)V", "getParticipantId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OutboundMessage {
    private final ParticipantId participantId;
    private final String text;

    public OutboundMessage(ParticipantId participantId2, String str) {
        this.participantId = participantId2;
        this.text = str;
    }

    public static /* synthetic */ OutboundMessage copy$default(OutboundMessage outboundMessage, ParticipantId participantId2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId2 = outboundMessage.participantId;
        }
        if ((i & 2) != 0) {
            str = outboundMessage.text;
        }
        return outboundMessage.copy(participantId2, str);
    }

    public final ParticipantId component1() {
        return this.participantId;
    }

    public final String component2() {
        return this.text;
    }

    public final OutboundMessage copy(ParticipantId participantId2, String str) {
        return new OutboundMessage(participantId2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutboundMessage)) {
            return false;
        }
        OutboundMessage outboundMessage = (OutboundMessage) obj;
        return Intrinsics.areEqual((Object) this.participantId, (Object) outboundMessage.participantId) && Intrinsics.areEqual((Object) this.text, (Object) outboundMessage.text);
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        ParticipantId participantId2 = this.participantId;
        return this.text.hashCode() + ((participantId2 == null ? 0 : participantId2.hashCode()) * 31);
    }

    public String toString() {
        ParticipantId participantId2 = this.participantId;
        String str = this.text;
        return "OutboundMessage(participantId=" + participantId2 + ", text=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OutboundMessage(ParticipantId participantId2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : participantId2, str);
    }
}
