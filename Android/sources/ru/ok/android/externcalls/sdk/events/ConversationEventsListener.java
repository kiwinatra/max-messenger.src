package ru.ok.android.externcalls.sdk.events;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

public interface ConversationEventsListener extends RecordEventListener {

    public static class CallEndInfo {
        public final String explanationHtml;
        public final Set<HangupHint> hints;
        public final nw6 reason;

        public CallEndInfo(nw6 nw6, Set<HangupHint> set, String str) {
            this.reason = nw6;
            this.hints = set;
            this.explanationHtml = str;
        }
    }

    void onAnonJoinForbiddenChanged(boolean z) {
    }

    void onCallAccepted() {
    }

    void onCallAcceptedForAll() {
    }

    @Deprecated
    void onCallEnded(CallEndInfo callEndInfo) {
    }

    void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError signalingErrors$CallIsUnfeasibleError) {
    }

    void onCallParticipantsNetworkStatusChanged(List<ConversationParticipant> list) {
    }

    void onCallSignalingConnected() {
    }

    void onCallStartResolutionFailed(List<ParticipantId> list) {
    }

    void onCameraBusy() {
    }

    void onCameraChanged() {
    }

    @Deprecated
    void onConnected() {
    }

    void onCustomData(JSONObject jSONObject) {
    }

    @Deprecated
    void onDestroyed() {
    }

    @Deprecated
    void onDisconnected() {
    }

    ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return null;
    }

    void onJoinLinkUpdated(String str) {
    }

    void onLocalMediaChanged() {
    }

    void onMeInWaitingRoomChanged(boolean z) {
    }

    void onMicChanged(boolean z) {
    }

    void onMicrophoneForciblyMuted() {
    }

    @Deprecated
    void onMigratedToServerTopology() {
    }

    @Deprecated
    void onMuteChanged(vz9 vz9) {
    }

    @Deprecated
    void onMuteStateInitialized(vz9 vz9) {
    }

    void onOpponentFingerprintChanged(long j) {
    }

    @Deprecated
    void onOpponentMediaChanged() {
    }

    void onOpponentRegistered() {
    }

    void onParticipantsAdded(List<ConversationParticipant> list) {
    }

    void onParticipantsChanged(List<ConversationParticipant> list) {
    }

    void onParticipantsDeAnonymized(List<ConversationParticipant> list, Map<ParticipantId, ParticipantId> map) {
    }

    void onParticipantsRemoved(List<ConversationParticipant> list) {
    }

    void onParticipantsUpdated(Collection<ConversationParticipant> collection) {
    }

    void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
    }

    void onRateCall(RateCallData rateCallData) {
    }

    void onRecurringChanged(boolean z) {
    }

    void onRolesChanged(ConversationParticipant conversationParticipant) {
    }

    void onStateChanged(ConversationParticipant conversationParticipant, we1 we1) {
    }

    void onWaitingRoomEnabledChanged(boolean z) {
    }

    void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
    }

    void onCallEnded(ConversationEndInfo conversationEndInfo) {
    }

    void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
    }

    @Deprecated
    void onDestroyed(String str) {
        onDestroyed();
    }
}
