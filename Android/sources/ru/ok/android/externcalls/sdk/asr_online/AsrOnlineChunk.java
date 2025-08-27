package ru.ok.android.externcalls.sdk.asr_online;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk;", "", "participantId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "text", "", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;)V", "getParticipantId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AsrOnlineChunk {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ParticipantId participantId;
    private final String text;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk$Companion;", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lpt;", "asrRecvDataPackage", "Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk;", "chunkFromPackage$calls_sdk_release", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lpt;)Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk;", "chunkFromPackage", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        private Companion() {
        }

        public final AsrOnlineChunk chunkFromPackage$calls_sdk_release(ParticipantStore participantStore, pt ptVar) {
            ue1 ue1 = ptVar.a;
            ParticipantId participantId = null;
            ConversationParticipant byInternal = ue1 != null ? participantStore.getByInternal(ue1) : null;
            if (byInternal != null) {
                participantId = byInternal.getExternalId();
            }
            return new AsrOnlineChunk(participantId, ptVar.b);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AsrOnlineChunk(ParticipantId participantId2, String str) {
        this.participantId = participantId2;
        this.text = str;
    }

    public static /* synthetic */ AsrOnlineChunk copy$default(AsrOnlineChunk asrOnlineChunk, ParticipantId participantId2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId2 = asrOnlineChunk.participantId;
        }
        if ((i & 2) != 0) {
            str = asrOnlineChunk.text;
        }
        return asrOnlineChunk.copy(participantId2, str);
    }

    public final ParticipantId component1() {
        return this.participantId;
    }

    public final String component2() {
        return this.text;
    }

    public final AsrOnlineChunk copy(ParticipantId participantId2, String str) {
        return new AsrOnlineChunk(participantId2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsrOnlineChunk)) {
            return false;
        }
        AsrOnlineChunk asrOnlineChunk = (AsrOnlineChunk) obj;
        return Intrinsics.areEqual((Object) this.participantId, (Object) asrOnlineChunk.participantId) && Intrinsics.areEqual((Object) this.text, (Object) asrOnlineChunk.text);
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
        return "AsrOnlineChunk(participantId=" + participantId2 + ", text=" + str + ")";
    }
}
