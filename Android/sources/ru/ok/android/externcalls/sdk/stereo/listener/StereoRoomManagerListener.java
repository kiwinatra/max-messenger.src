package ru.ok.android.externcalls.sdk.stereo.listener;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoHandQueueItem;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;", "", "onHandStatusChange", "", "event", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$HandStatusUpdated;", "onListenersChanged", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$ListenersUpdated;", "onOwnPromotionChanged", "isPromoted", "", "onPromotionRequestUpdated", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$PromotionRequestUpdated;", "HandStatusUpdated", "ListenersUpdated", "PromotionRequestUpdated", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StereoRoomManagerListener {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$HandStatusUpdated;", "", "totalCount", "", "raisedHands", "", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "(ILjava/util/List;)V", "getRaisedHands", "()Ljava/util/List;", "getTotalCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandStatusUpdated {
        private final List<StereoHandQueueItem> raisedHands;
        private final int totalCount;

        public HandStatusUpdated(int i, List<StereoHandQueueItem> list) {
            this.totalCount = i;
            this.raisedHands = list;
        }

        public static /* synthetic */ HandStatusUpdated copy$default(HandStatusUpdated handStatusUpdated, int i, List<StereoHandQueueItem> list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = handStatusUpdated.totalCount;
            }
            if ((i2 & 2) != 0) {
                list = handStatusUpdated.raisedHands;
            }
            return handStatusUpdated.copy(i, list);
        }

        public final int component1() {
            return this.totalCount;
        }

        public final List<StereoHandQueueItem> component2() {
            return this.raisedHands;
        }

        public final HandStatusUpdated copy(int i, List<StereoHandQueueItem> list) {
            return new HandStatusUpdated(i, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandStatusUpdated)) {
                return false;
            }
            HandStatusUpdated handStatusUpdated = (HandStatusUpdated) obj;
            return this.totalCount == handStatusUpdated.totalCount && Intrinsics.areEqual((Object) this.raisedHands, (Object) handStatusUpdated.raisedHands);
        }

        public final List<StereoHandQueueItem> getRaisedHands() {
            return this.raisedHands;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            return this.raisedHands.hashCode() + (Integer.hashCode(this.totalCount) * 31);
        }

        public String toString() {
            int i = this.totalCount;
            List<StereoHandQueueItem> list = this.raisedHands;
            return "HandStatusUpdated(totalCount=" + i + ", raisedHands=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005HÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00052\u0012\b\u0002\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$ListenersUpdated;", "", "totalCount", "", "addedParticipantIds", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "removedParticipantIds", "(ILjava/util/List;Ljava/util/List;)V", "getAddedParticipantIds", "()Ljava/util/List;", "getRemovedParticipantIds", "getTotalCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ListenersUpdated {
        private final List<ParticipantId> addedParticipantIds;
        private final List<ParticipantId> removedParticipantIds;
        private final int totalCount;

        public ListenersUpdated(int i, List<ParticipantId> list, List<ParticipantId> list2) {
            this.totalCount = i;
            this.addedParticipantIds = list;
            this.removedParticipantIds = list2;
        }

        public static /* synthetic */ ListenersUpdated copy$default(ListenersUpdated listenersUpdated, int i, List<ParticipantId> list, List<ParticipantId> list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = listenersUpdated.totalCount;
            }
            if ((i2 & 2) != 0) {
                list = listenersUpdated.addedParticipantIds;
            }
            if ((i2 & 4) != 0) {
                list2 = listenersUpdated.removedParticipantIds;
            }
            return listenersUpdated.copy(i, list, list2);
        }

        public final int component1() {
            return this.totalCount;
        }

        public final List<ParticipantId> component2() {
            return this.addedParticipantIds;
        }

        public final List<ParticipantId> component3() {
            return this.removedParticipantIds;
        }

        public final ListenersUpdated copy(int i, List<ParticipantId> list, List<ParticipantId> list2) {
            return new ListenersUpdated(i, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenersUpdated)) {
                return false;
            }
            ListenersUpdated listenersUpdated = (ListenersUpdated) obj;
            return this.totalCount == listenersUpdated.totalCount && Intrinsics.areEqual((Object) this.addedParticipantIds, (Object) listenersUpdated.addedParticipantIds) && Intrinsics.areEqual((Object) this.removedParticipantIds, (Object) listenersUpdated.removedParticipantIds);
        }

        public final List<ParticipantId> getAddedParticipantIds() {
            return this.addedParticipantIds;
        }

        public final List<ParticipantId> getRemovedParticipantIds() {
            return this.removedParticipantIds;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            return this.removedParticipantIds.hashCode() + rae.i(this.addedParticipantIds, Integer.hashCode(this.totalCount) * 31, 31);
        }

        public String toString() {
            int i = this.totalCount;
            List<ParticipantId> list = this.addedParticipantIds;
            List<ParticipantId> list2 = this.removedParticipantIds;
            StringBuilder sb = new StringBuilder("ListenersUpdated(totalCount=");
            sb.append(i);
            sb.append(", addedParticipantIds=");
            sb.append(list);
            sb.append(", removedParticipantIds=");
            return tr1.l(sb, list2, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$PromotionRequestUpdated;", "", "approved", "", "(Z)V", "getApproved", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PromotionRequestUpdated {
        private final boolean approved;

        public PromotionRequestUpdated(boolean z) {
            this.approved = z;
        }

        public static /* synthetic */ PromotionRequestUpdated copy$default(PromotionRequestUpdated promotionRequestUpdated, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = promotionRequestUpdated.approved;
            }
            return promotionRequestUpdated.copy(z);
        }

        public final boolean component1() {
            return this.approved;
        }

        public final PromotionRequestUpdated copy(boolean z) {
            return new PromotionRequestUpdated(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromotionRequestUpdated) && this.approved == ((PromotionRequestUpdated) obj).approved;
        }

        public final boolean getApproved() {
            return this.approved;
        }

        public int hashCode() {
            return Boolean.hashCode(this.approved);
        }

        public String toString() {
            boolean z = this.approved;
            return "PromotionRequestUpdated(approved=" + z + ")";
        }
    }

    void onHandStatusChange(HandStatusUpdated handStatusUpdated);

    void onListenersChanged(ListenersUpdated listenersUpdated);

    void onOwnPromotionChanged(boolean z);

    void onPromotionRequestUpdated(PromotionRequestUpdated promotionRequestUpdated);
}
