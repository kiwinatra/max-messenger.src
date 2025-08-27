package ru.ok.android.externcalls.sdk.stereo.hands;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "", "participantId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "addedTs", "", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;J)V", "getAddedTs", "()J", "getParticipantId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StereoHandQueueItem {
    private final long addedTs;
    private final ParticipantId participantId;

    public StereoHandQueueItem(ParticipantId participantId2, long j) {
        this.participantId = participantId2;
        this.addedTs = j;
    }

    public static /* synthetic */ StereoHandQueueItem copy$default(StereoHandQueueItem stereoHandQueueItem, ParticipantId participantId2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId2 = stereoHandQueueItem.participantId;
        }
        if ((i & 2) != 0) {
            j = stereoHandQueueItem.addedTs;
        }
        return stereoHandQueueItem.copy(participantId2, j);
    }

    public final ParticipantId component1() {
        return this.participantId;
    }

    public final long component2() {
        return this.addedTs;
    }

    public final StereoHandQueueItem copy(ParticipantId participantId2, long j) {
        return new StereoHandQueueItem(participantId2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StereoHandQueueItem)) {
            return false;
        }
        StereoHandQueueItem stereoHandQueueItem = (StereoHandQueueItem) obj;
        return Intrinsics.areEqual((Object) this.participantId, (Object) stereoHandQueueItem.participantId) && this.addedTs == stereoHandQueueItem.addedTs;
    }

    public final long getAddedTs() {
        return this.addedTs;
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public int hashCode() {
        return Long.hashCode(this.addedTs) + (this.participantId.hashCode() * 31);
    }

    public String toString() {
        ParticipantId participantId2 = this.participantId;
        long j = this.addedTs;
        return "StereoHandQueueItem(participantId=" + participantId2 + ", addedTs=" + j + ")";
    }
}
