package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

/* renamed from: dq1  reason: default package */
public final class dq1 implements ConversationEventsListener, vk1, MediaConnectionListener {
    public final Lazy a = LazyKt.lazy(new lj1(15));
    public final Lazy b = LazyKt.lazy(new lj1(16));

    public final CopyOnWriteArraySet a() {
        return (CopyOnWriteArraySet) this.a.getValue();
    }

    public final void b(String str) {
        for (vk1 b2 : (CopyOnWriteArraySet) this.b.getValue()) {
            b2.b(str);
        }
    }

    public final void c(al1 al1) {
        a().add(al1);
    }

    public final void onAnonJoinForbiddenChanged(boolean z) {
        for (al1 onAnonJoinForbiddenChanged : a()) {
            onAnonJoinForbiddenChanged.onAnonJoinForbiddenChanged(z);
        }
    }

    public final void onCallAccepted() {
        for (al1 onCallAccepted : a()) {
            onCallAccepted.onCallAccepted();
        }
    }

    public final void onCallAcceptedForAll() {
        for (al1 onCallAcceptedForAll : a()) {
            onCallAcceptedForAll.onCallAcceptedForAll();
        }
    }

    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        for (al1 onCallEnded : a()) {
            onCallEnded.onCallEnded(conversationEndInfo);
        }
    }

    public final void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError signalingErrors$CallIsUnfeasibleError) {
        for (al1 onCallIsUnfeasibleError : a()) {
            onCallIsUnfeasibleError.onCallIsUnfeasibleError(signalingErrors$CallIsUnfeasibleError);
        }
    }

    public final void onCallParticipantsNetworkStatusChanged(List list) {
        for (al1 onCallParticipantsNetworkStatusChanged : a()) {
            onCallParticipantsNetworkStatusChanged.onCallParticipantsNetworkStatusChanged(list);
        }
    }

    public final void onCallSignalingConnected() {
        for (al1 onCallSignalingConnected : a()) {
            onCallSignalingConnected.onCallSignalingConnected();
        }
    }

    public final void onCallStartResolutionFailed(List list) {
        for (al1 onCallStartResolutionFailed : a()) {
            onCallStartResolutionFailed.onCallStartResolutionFailed(list);
        }
    }

    public final void onCameraBusy() {
        for (al1 onCameraBusy : a()) {
            onCameraBusy.onCameraBusy();
        }
    }

    public final void onCameraChanged() {
        for (al1 onCameraChanged : a()) {
            onCameraChanged.onCameraChanged();
        }
    }

    public final void onCustomData(JSONObject jSONObject) {
        for (al1 onCustomData : a()) {
            onCustomData.onCustomData(jSONObject);
        }
    }

    public final void onDestroyed() {
        for (al1 onDestroyed : a()) {
            onDestroyed.onDestroyed();
        }
    }

    public final void onJoinLinkUpdated(String str) {
        for (al1 onJoinLinkUpdated : a()) {
            onJoinLinkUpdated.onJoinLinkUpdated(str);
        }
    }

    public final void onLocalMediaChanged() {
        for (al1 onLocalMediaChanged : a()) {
            onLocalMediaChanged.onLocalMediaChanged();
        }
    }

    public final void onMeInWaitingRoomChanged(boolean z) {
        for (al1 onMeInWaitingRoomChanged : a()) {
            onMeInWaitingRoomChanged.onMeInWaitingRoomChanged(z);
        }
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        for (al1 onMediaConnected : a()) {
            onMediaConnected.onMediaConnected(connectedInfo);
        }
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        for (al1 onMediaDisconnected : a()) {
            onMediaDisconnected.onMediaDisconnected(disconnectedInfo);
        }
    }

    public final void onMicChanged(boolean z) {
        for (al1 onMicChanged : a()) {
            onMicChanged.onMicChanged(z);
        }
    }

    public final void onMicrophoneForciblyMuted() {
        for (al1 onMicrophoneForciblyMuted : a()) {
            onMicrophoneForciblyMuted.onMicrophoneForciblyMuted();
        }
    }

    public final void onMigratedToServerTopology() {
        for (al1 onMigratedToServerTopology : a()) {
            onMigratedToServerTopology.onMigratedToServerTopology();
        }
    }

    public final void onMuteChanged(vz9 vz9) {
        for (al1 onMuteChanged : a()) {
            onMuteChanged.onMuteChanged(vz9);
        }
    }

    public final void onMuteStateInitialized(vz9 vz9) {
        for (al1 onMuteStateInitialized : a()) {
            onMuteStateInitialized.onMuteStateInitialized(vz9);
        }
    }

    public final void onOpponentFingerprintChanged(long j) {
        for (al1 onOpponentFingerprintChanged : a()) {
            onOpponentFingerprintChanged.onOpponentFingerprintChanged(j);
        }
    }

    public final void onOpponentMediaChanged() {
        for (al1 onOpponentMediaChanged : a()) {
            onOpponentMediaChanged.onOpponentMediaChanged();
        }
    }

    public final void onOpponentRegistered() {
        for (al1 onOpponentRegistered : a()) {
            onOpponentRegistered.onOpponentRegistered();
        }
    }

    public final void onParticipantsAdded(List list) {
        for (al1 onParticipantsAdded : a()) {
            onParticipantsAdded.onParticipantsAdded(list);
        }
    }

    public final void onParticipantsChanged(List list) {
        for (al1 onParticipantsChanged : a()) {
            onParticipantsChanged.onParticipantsChanged(list);
        }
    }

    public final void onParticipantsDeAnonymized(List list, Map map) {
        for (al1 onParticipantsDeAnonymized : a()) {
            onParticipantsDeAnonymized.onParticipantsDeAnonymized(list, map);
        }
    }

    public final void onParticipantsRemoved(List list) {
        for (al1 onParticipantsRemoved : a()) {
            onParticipantsRemoved.onParticipantsRemoved(list);
        }
    }

    public final void onParticipantsUpdated(Collection collection) {
        for (al1 onParticipantsUpdated : a()) {
            onParticipantsUpdated.onParticipantsUpdated(collection);
        }
    }

    public final void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
        for (al1 onPinChanged : a()) {
            onPinChanged.onPinChanged(conversationParticipant, z);
        }
    }

    public final void onRateCall(RateCallData rateCallData) {
        for (al1 onRateCall : a()) {
            onRateCall.onRateCall(rateCallData);
        }
    }

    public final void onRecurringChanged(boolean z) {
        for (al1 onRecurringChanged : a()) {
            onRecurringChanged.onRecurringChanged(z);
        }
    }

    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        for (al1 onRolesChanged : a()) {
            onRolesChanged.onRolesChanged(conversationParticipant);
        }
    }

    public final void onStateChanged(ConversationParticipant conversationParticipant, we1 we1) {
        for (al1 onStateChanged : a()) {
            onStateChanged.onStateChanged(conversationParticipant, we1);
        }
    }

    public final void onWaitingRoomEnabledChanged(boolean z) {
        for (al1 onWaitingRoomEnabledChanged : a()) {
            onWaitingRoomEnabledChanged.onWaitingRoomEnabledChanged(z);
        }
    }

    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        for (al1 onWaitingRoomParticipantsChanged : a()) {
            onWaitingRoomParticipantsChanged.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        }
    }

    public final void onDestroyed(String str) {
        for (al1 onDestroyed : a()) {
            onDestroyed.onDestroyed(str);
        }
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        for (al1 onDestroyed : a()) {
            onDestroyed.onDestroyed(conversationDestroyedInfo);
        }
    }
}
