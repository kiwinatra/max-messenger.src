package ru.ok.android.externcalls.sdk;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0013\u001a\u00020\f*\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\n\u0010\u0012\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\f*\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00020\u0005*\u00060\u000fj\u0002`\u00102\u0006\u0010\u001b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\" \u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e*\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\" \u0010%\u001a\n \u001f*\u0004\u0018\u00010\u00000\u0000*\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "id", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "createConversationParticipantFromInternal", "(Lue1;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;)Lru/ok/android/externcalls/sdk/ConversationParticipant;", "Lye1;", "callParticipant", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "localIdMappings", "", "setCallParticipantExt", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Lye1;Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "oldParticipantId", "deAnonymizeParticipantId", "deAnonymizeExt", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Lye1;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;)V", "", "isReportedExt", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Z", "reported", "setReportedExt", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Z)V", "idsMappingWrapper", "newConversationParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;)Lru/ok/android/externcalls/sdk/ConversationParticipant;", "Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "kotlin.jvm.PlatformType", "getLocalParticipantIdExt", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "localParticipantIdExt", "getInternalIdExt", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lue1;", "internalIdExt", "calls-sdk_release"}, k = 2, mv = {1, 9, 0})
public final class ConversationParticipantExtensionsKt {
    public static final ConversationParticipant createConversationParticipantFromInternal(ue1 ue1, IdMappingWrapper idMappingWrapper) {
        return ConversationParticipant.fromInternal(ue1, idMappingWrapper);
    }

    public static final void deAnonymizeExt(ConversationParticipant conversationParticipant, ye1 ye1, ParticipantId participantId, ParticipantId participantId2, LocalIdMappings localIdMappings) {
        conversationParticipant.deAnonymize(ye1, participantId, participantId2, localIdMappings);
    }

    public static final ue1 getInternalIdExt(ConversationParticipant conversationParticipant) {
        return conversationParticipant.getInternalId();
    }

    public static final LocalParticipantId getLocalParticipantIdExt(ConversationParticipant conversationParticipant) {
        return conversationParticipant.getLocalParticipantId();
    }

    public static final boolean isReportedExt(ConversationParticipant conversationParticipant) {
        return conversationParticipant.isReported();
    }

    public static final ConversationParticipant newConversationParticipant(ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        return ConversationParticipant.fromExternal(participantId, idMappingWrapper);
    }

    public static final void setCallParticipantExt(ConversationParticipant conversationParticipant, ye1 ye1, LocalIdMappings localIdMappings) {
        conversationParticipant.setCallParticipant(ye1, localIdMappings);
    }

    public static final void setReportedExt(ConversationParticipant conversationParticipant, boolean z) {
        conversationParticipant.setReported(z);
    }

    public static /* synthetic */ void setReportedExt$default(ConversationParticipant conversationParticipant, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        setReportedExt(conversationParticipant, z);
    }
}
