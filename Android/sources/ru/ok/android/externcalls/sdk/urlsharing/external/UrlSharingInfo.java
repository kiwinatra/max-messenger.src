package ru.ok.android.externcalls.sdk.urlsharing.external;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingInfo;", "", "url", "", "initiatorId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "getInitiatorId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UrlSharingInfo {
    private final ParticipantId initiatorId;
    private final String url;

    public UrlSharingInfo(String str, ParticipantId participantId) {
        this.url = str;
        this.initiatorId = participantId;
    }

    public static /* synthetic */ UrlSharingInfo copy$default(UrlSharingInfo urlSharingInfo, String str, ParticipantId participantId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlSharingInfo.url;
        }
        if ((i & 2) != 0) {
            participantId = urlSharingInfo.initiatorId;
        }
        return urlSharingInfo.copy(str, participantId);
    }

    public final String component1() {
        return this.url;
    }

    public final ParticipantId component2() {
        return this.initiatorId;
    }

    public final UrlSharingInfo copy(String str, ParticipantId participantId) {
        return new UrlSharingInfo(str, participantId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlSharingInfo)) {
            return false;
        }
        UrlSharingInfo urlSharingInfo = (UrlSharingInfo) obj;
        return Intrinsics.areEqual((Object) this.url, (Object) urlSharingInfo.url) && Intrinsics.areEqual((Object) this.initiatorId, (Object) urlSharingInfo.initiatorId);
    }

    public final ParticipantId getInitiatorId() {
        return this.initiatorId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        ParticipantId participantId = this.initiatorId;
        return hashCode + (participantId == null ? 0 : participantId.hashCode());
    }

    public String toString() {
        String str = this.url;
        ParticipantId participantId = this.initiatorId;
        return "UrlSharingInfo(url=" + str + ", initiatorId=" + participantId + ")";
    }
}
