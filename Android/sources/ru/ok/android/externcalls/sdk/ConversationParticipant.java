package ru.ok.android.externcalls.sdk;

import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

public class ConversationParticipant {
    private static final String LOG_TAG = "ConversationParticipant";
    private ye1 callParticipant;
    private ParticipantId externalId;
    private ue1 internalId;
    private final LocalParticipantId localParticipantId = LocalParticipantId.nextId();
    private boolean reported;

    private ConversationParticipant() {
    }

    public static ConversationParticipant fromExternal(ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setExternalId(participantId);
        ue1 byExternal = idMappingWrapper.getByExternal(participantId);
        if (byExternal != null) {
            conversationParticipant.setInternalId(byExternal);
        }
        return conversationParticipant;
    }

    public static ConversationParticipant fromInternal(ue1 ue1, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setInternalId(ue1);
        ParticipantId byInternal = idMappingWrapper.getByInternal(ue1);
        if (byInternal != null) {
            conversationParticipant.setExternalId(byInternal);
        }
        return conversationParticipant;
    }

    public void deAnonymize(ye1 ye1, ParticipantId participantId, ParticipantId participantId2, LocalIdMappings localIdMappings) {
        this.externalId = participantId2;
        this.callParticipant = ye1;
        localIdMappings.deAnonymizeMapping(participantId, this);
    }

    public long getAcceptCallEpochMs() {
        ye1 ye1 = this.callParticipant;
        if (ye1 != null) {
            return ye1.m;
        }
        return 0;
    }

    public String getAcceptedCallClientType() {
        ye1 ye1 = this.callParticipant;
        if (ye1 == null) {
            return null;
        }
        return ye1.k;
    }

    public String getAcceptedCallPlatform() {
        ye1 ye1 = this.callParticipant;
        if (ye1 == null) {
            return null;
        }
        return ye1.l;
    }

    public ft8 getAudioOptionState() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null ? ye1.b.a : ft8.a;
    }

    public ye1 getCallParticipant() {
        return this.callParticipant;
    }

    public ParticipantId getExternalId() {
        return this.externalId;
    }

    public ue1 getInternalId() {
        return this.internalId;
    }

    public LocalParticipantId getLocalParticipantId() {
        return this.localParticipantId;
    }

    public List<st9> getMovies() {
        ye1 ye1 = this.callParticipant;
        return ye1 == null ? Collections.emptyList() : ye1.q;
    }

    public a7a getNetworkStatus() {
        ye1 ye1 = this.callParticipant;
        return ye1 == null ? a7a.a : ye1.i;
    }

    public ft8 getScreenshareOptionState() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null ? ye1.b.c : ft8.a;
    }

    public ft8 getVideoOptionState() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null ? ye1.b.b : ft8.a;
    }

    public ft8 getWatchTogetherOptionState() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null ? ye1.b.d : ft8.a;
    }

    public boolean hasRegisteredPeers() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && (ye1.j != null || !ye1.f.isEmpty());
    }

    public boolean isAdmin() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && ye1.e.contains(xe1.b);
    }

    public boolean isAnimojiEnabled() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && ye1.c.g;
    }

    public boolean isAudioEnabled() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && ye1.c.e;
    }

    public boolean isCallAccepted() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && ye1.b();
    }

    public boolean isConnected() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && ye1.g;
    }

    public boolean isCreator() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && ye1.e.contains(xe1.a);
    }

    public boolean isPrimarySpeaker() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && ye1.c();
    }

    public boolean isReported() {
        return this.reported;
    }

    public boolean isScreenCaptureEnabled() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && ye1.c.b;
    }

    public boolean isTalking() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && ye1.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.callParticipant;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isUseable() {
        /*
            r1 = this;
            boolean r0 = r1.isReported()
            if (r0 == 0) goto L_0x0010
            ye1 r1 = r1.callParticipant
            if (r1 == 0) goto L_0x0010
            ue1 r1 = r1.a
            if (r1 == 0) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationParticipant.isUseable():boolean");
    }

    public boolean isVideoEnabled() {
        ye1 ye1 = this.callParticipant;
        return ye1 != null && ye1.c.f;
    }

    public void setCallParticipant(ye1 ye1, LocalIdMappings localIdMappings) {
        this.callParticipant = ye1;
        if (ye1 != null) {
            this.internalId = ye1.a;
        }
        localIdMappings.addMappings(this);
    }

    public void setDeviceIndex(int i, LocalIdMappings localIdMappings) {
        ue1 ue1;
        GlobalRTCLogger globalRTCLogger = GlobalRTCLogger.INSTANCE;
        StringBuilder o = wj6.o(i, "updateDeviceIndex ", " for ");
        o.append(this.externalId);
        GlobalRTCLogger.log(LOG_TAG, o.toString());
        if (this.externalId != null) {
            ParticipantId participantId = this.externalId;
            this.externalId = new ParticipantId(participantId.id, participantId.isAnon, i);
        }
        ue1 ue12 = this.internalId;
        if (ue12 != null) {
            this.internalId = new ue1(ue12.b, i, ue12.a);
        }
        ye1 ye1 = this.callParticipant;
        if (!(ye1 == null || (ue1 = ye1.a) == null)) {
            ye1.a = new ue1(ue1.b, i, ue1.a);
            e51 e51 = ye1.p;
            if (e51 != null) {
                ye1.p = new e51(e51.a, e51.b, i);
            }
        }
        localIdMappings.addMappings(this);
    }

    public void setExternalId(ParticipantId participantId) {
        this.externalId = participantId;
    }

    public void setInternalId(ue1 ue1) {
        this.internalId = ue1;
        ye1 ye1 = this.callParticipant;
        if (ye1 != null) {
            ye1.a = ue1;
        }
    }

    public void setReported(boolean z) {
        this.reported = z;
    }

    public String toString() {
        return this.externalId + "|" + this.internalId + "|" + this.callParticipant;
    }
}
