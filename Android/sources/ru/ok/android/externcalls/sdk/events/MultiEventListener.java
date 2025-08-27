package ru.ok.android.externcalls.sdk.events;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0003B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u001e\u0010\u0013\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u001e\u0010\u001a\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ\u001e\u0010\u001b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0011J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u0011J\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u0011J\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u0011J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+01H\u0016¢\u0006\u0004\b;\u00105J\u001d\u0010<\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+01H\u0016¢\u0006\u0004\b<\u00105J\u001d\u0010=\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+01H\u0016¢\u0006\u0004\b=\u00105J\u001d\u0010>\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+0\u000bH\u0016¢\u0006\u0004\b>\u0010\u0006J1\u0010B\u001a\u00020\u000f2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020+012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002020@H\u0016¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+01H\u0016¢\u0006\u0004\bD\u00105J\u0017\u0010F\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020+H\u0016¢\u0006\u0004\bF\u0010GJ!\u0010I\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010+2\u0006\u0010H\u001a\u00020\bH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010#J\u0017\u0010O\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bQ\u0010PJ\u0017\u0010S\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010#J\u0017\u0010U\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\bH\u0016¢\u0006\u0004\bU\u0010#J\u0017\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\bH\u0016¢\u0006\u0004\bW\u0010#J\u0017\u0010Y\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010ZJ\u001b\u0010\\\u001a\u0004\u0018\u0001022\b\u0010[\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u000fH\u0016¢\u0006\u0004\b^\u0010\u0011J\u000f\u0010_\u001a\u00020\u000fH\u0016¢\u0006\u0004\b_\u0010\u0011J\u000f\u0010`\u001a\u00020\u000fH\u0016¢\u0006\u0004\b`\u0010\u0011J\u0017\u0010c\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u000fH\u0016¢\u0006\u0004\be\u0010\u0011J\u0017\u0010h\u001a\u00020\u000f2\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bh\u0010iJ\u0017\u0010h\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bh\u0010lJ\u0017\u0010n\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020mH\u0016¢\u0006\u0004\bn\u0010oJ\u0019\u0010q\u001a\u00020\u000f2\b\u0010p\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bq\u0010dJ\u0017\u0010q\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020rH\u0016¢\u0006\u0004\bq\u0010sJ\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020tH\u0016¢\u0006\u0004\bu\u0010vR\u001e\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010wR\u0014\u0010{\u001a\u00020x8\u0016X\u0005¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006|"}, d2 = {"Lru/ok/android/externcalls/sdk/events/MultiEventListener;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "", "Lru/ok/android/externcalls/sdk/events/ListenersCollection;", "container", "<init>", "(Ljava/util/Collection;)V", "element", "", "add", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "onOpponentMediaChanged", "onLocalMediaChanged", "onCameraChanged", "onCameraBusy", "onMicrophoneForciblyMuted", "mute", "onMicChanged", "(Z)V", "onCallAccepted", "onCallAcceptedForAll", "onOpponentRegistered", "Lorg/json/JSONObject;", "data", "onCustomData", "(Lorg/json/JSONObject;)V", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "id", "Lwe1;", "newState", "onStateChanged", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Lwe1;)V", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "externalIds", "onCallStartResolutionFailed", "(Ljava/util/List;)V", "", "fingerprint", "onOpponentFingerprintChanged", "(J)V", "participants", "onParticipantsAdded", "onParticipantsChanged", "onParticipantsRemoved", "onParticipantsUpdated", "deAnonymizedlParticipants", "", "deAnonymizedToOriginalIds", "onParticipantsDeAnonymized", "(Ljava/util/List;Ljava/util/Map;)V", "onCallParticipantsNetworkStatusChanged", "conversationParticipant", "onRolesChanged", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "byMe", "onPinChanged", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Z)V", "recurring", "onRecurringChanged", "Lvz9;", "muteEvent", "onMuteStateInitialized", "(Lvz9;)V", "onMuteChanged", "isAnonJoinForbidden", "onAnonJoinForbiddenChanged", "isEnabled", "onWaitingRoomEnabledChanged", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "onWaitingRoomParticipantsChanged", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "participant", "onExternalByInternalResolution", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "onConnected", "onCallSignalingConnected", "onMigratedToServerTopology", "", "link", "onJoinLinkUpdated", "(Ljava/lang/String;)V", "onDisconnected", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener$CallEndInfo;", "endInfo", "onCallEnded", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener$CallEndInfo;)V", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndInfo;", "info", "(Lru/ok/android/externcalls/sdk/events/end/ConversationEndInfo;)V", "Lru/ok/android/webrtc/SignalingErrors$CallIsUnfeasibleError;", "onCallIsUnfeasibleError", "(Lru/ok/android/webrtc/SignalingErrors$CallIsUnfeasibleError;)V", "reason", "onDestroyed", "Lru/ok/android/externcalls/sdk/events/destroy/ConversationDestroyedInfo;", "(Lru/ok/android/externcalls/sdk/events/destroy/ConversationDestroyedInfo;)V", "Lru/ok/android/externcalls/sdk/rate/RateCallData;", "onRateCall", "(Lru/ok/android/externcalls/sdk/rate/RateCallData;)V", "Ljava/util/Collection;", "", "getSize", "()I", "size", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMultiEventListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiEventListener.kt\nru/ok/android/externcalls/sdk/events/MultiEventListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1855#2,2:79\n1855#2,2:81\n1855#2,2:83\n1855#2,2:85\n1855#2,2:87\n1855#2,2:89\n1855#2,2:91\n1855#2,2:93\n1855#2,2:95\n1855#2,2:97\n1855#2,2:99\n1855#2,2:101\n1855#2,2:103\n1855#2,2:105\n1855#2,2:107\n1855#2,2:109\n1855#2,2:111\n1855#2,2:113\n1855#2,2:115\n1855#2,2:117\n1855#2,2:119\n1855#2,2:121\n1855#2,2:123\n1855#2,2:125\n1855#2,2:127\n1855#2,2:129\n1855#2,2:131\n1855#2,2:133\n1855#2,2:136\n1855#2,2:138\n1855#2,2:140\n1855#2,2:142\n1855#2,2:144\n1855#2,2:146\n1855#2,2:148\n1855#2,2:150\n1855#2,2:152\n1855#2,2:154\n1855#2,2:156\n1#3:135\n*S KotlinDebug\n*F\n+ 1 MultiEventListener.kt\nru/ok/android/externcalls/sdk/events/MultiEventListener\n*L\n20#1:79,2\n21#1:81,2\n23#1:83,2\n24#1:85,2\n26#1:87,2\n27#1:89,2\n29#1:91,2\n30#1:93,2\n31#1:95,2\n32#1:97,2\n33#1:99,2\n34#1:101,2\n35#1:103,2\n37#1:105,2\n38#1:107,2\n39#1:109,2\n40#1:111,2\n44#1:113,2\n46#1:115,2\n48#1:117,2\n49#1:119,2\n50#1:121,2\n52#1:123,2\n53#1:125,2\n55#1:127,2\n57#1:129,2\n58#1:131,2\n59#1:133,2\n63#1:136,2\n64#1:138,2\n65#1:140,2\n66#1:142,2\n67#1:144,2\n69#1:146,2\n70#1:148,2\n72#1:150,2\n73#1:152,2\n74#1:154,2\n76#1:156,2\n*E\n"})
public final class MultiEventListener implements ConversationEventsListener, Collection<ConversationEventsListener>, KMutableCollection {
    private final Collection<ConversationEventsListener> container;

    public MultiEventListener(Collection<ConversationEventsListener> collection) {
        this.container = collection;
    }

    public boolean add(ConversationEventsListener conversationEventsListener) {
        return this.container.add(conversationEventsListener);
    }

    public boolean addAll(Collection<? extends ConversationEventsListener> collection) {
        return this.container.addAll(collection);
    }

    public void clear() {
        this.container.clear();
    }

    public boolean contains(ConversationEventsListener conversationEventsListener) {
        return this.container.contains(conversationEventsListener);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.container.containsAll(collection);
    }

    public int getSize() {
        return this.container.size();
    }

    public boolean isEmpty() {
        return this.container.isEmpty();
    }

    public Iterator<ConversationEventsListener> iterator() {
        return this.container.iterator();
    }

    public void onAnonJoinForbiddenChanged(boolean z) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onAnonJoinForbiddenChanged(z);
        }
    }

    public void onCallAccepted() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCallAccepted();
        }
    }

    public void onCallAcceptedForAll() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCallAcceptedForAll();
        }
    }

    public void onCallEnded(ConversationEventsListener.CallEndInfo callEndInfo) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCallEnded(callEndInfo);
        }
    }

    public void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError signalingErrors$CallIsUnfeasibleError) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCallIsUnfeasibleError(signalingErrors$CallIsUnfeasibleError);
        }
    }

    public void onCallParticipantsNetworkStatusChanged(List<? extends ConversationParticipant> list) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCallParticipantsNetworkStatusChanged(list);
        }
    }

    public void onCallSignalingConnected() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCallSignalingConnected();
        }
    }

    public void onCallStartResolutionFailed(List<ParticipantId> list) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCallStartResolutionFailed(list);
        }
    }

    public void onCameraBusy() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCameraBusy();
        }
    }

    public void onCameraChanged() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCameraChanged();
        }
    }

    public void onConnected() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onConnected();
        }
    }

    public void onCustomData(JSONObject jSONObject) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCustomData(jSONObject);
        }
    }

    public void onDestroyed(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onDestroyed(str);
        }
    }

    public void onDisconnected() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onDisconnected();
        }
    }

    public ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ParticipantId onExternalByInternalResolution = ((ConversationEventsListener) it.next()).onExternalByInternalResolution(conversationParticipant);
            if (onExternalByInternalResolution != null) {
                return onExternalByInternalResolution;
            }
        }
        return null;
    }

    public void onJoinLinkUpdated(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onJoinLinkUpdated(str);
        }
    }

    public void onLocalMediaChanged() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onLocalMediaChanged();
        }
    }

    public void onMeInWaitingRoomChanged(boolean z) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onMeInWaitingRoomChanged(z);
        }
    }

    public void onMicChanged(boolean z) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onMicChanged(z);
        }
    }

    public void onMicrophoneForciblyMuted() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onMicrophoneForciblyMuted();
        }
    }

    public void onMigratedToServerTopology() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onMigratedToServerTopology();
        }
    }

    public void onMuteChanged(vz9 vz9) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onMuteChanged(vz9);
        }
    }

    public void onMuteStateInitialized(vz9 vz9) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onMuteStateInitialized(vz9);
        }
    }

    public void onOpponentFingerprintChanged(long j) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onOpponentFingerprintChanged(j);
        }
    }

    public void onOpponentMediaChanged() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onOpponentMediaChanged();
        }
    }

    public void onOpponentRegistered() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onOpponentRegistered();
        }
    }

    public void onParticipantsAdded(List<? extends ConversationParticipant> list) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onParticipantsAdded(list);
        }
    }

    public void onParticipantsChanged(List<? extends ConversationParticipant> list) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onParticipantsChanged(list);
        }
    }

    public void onParticipantsDeAnonymized(List<? extends ConversationParticipant> list, Map<ParticipantId, ParticipantId> map) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onParticipantsDeAnonymized(list, map);
        }
    }

    public void onParticipantsRemoved(List<? extends ConversationParticipant> list) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onParticipantsRemoved(list);
        }
    }

    public void onParticipantsUpdated(Collection<? extends ConversationParticipant> collection) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onParticipantsUpdated(collection);
        }
    }

    public void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onPinChanged(conversationParticipant, z);
        }
    }

    public void onRateCall(RateCallData rateCallData) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onRateCall(rateCallData);
        }
    }

    public void onRecurringChanged(boolean z) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onRecurringChanged(z);
        }
    }

    public void onRolesChanged(ConversationParticipant conversationParticipant) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onRolesChanged(conversationParticipant);
        }
    }

    public void onStateChanged(ConversationParticipant conversationParticipant, we1 we1) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onStateChanged(conversationParticipant, we1);
        }
    }

    public void onWaitingRoomEnabledChanged(boolean z) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onWaitingRoomEnabledChanged(z);
        }
    }

    public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        }
    }

    public boolean remove(ConversationEventsListener conversationEventsListener) {
        return this.container.remove(conversationEventsListener);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        return this.container.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        return this.container.retainAll(collection);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof ConversationEventsListener)) {
            return false;
        }
        return contains((ConversationEventsListener) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof ConversationEventsListener)) {
            return false;
        }
        return remove((ConversationEventsListener) obj);
    }

    public <T> T[] toArray(T[] tArr) {
        return CollectionToArray.toArray(this, tArr);
    }

    public void onCallEnded(ConversationEndInfo conversationEndInfo) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onCallEnded(conversationEndInfo);
        }
    }

    public void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ConversationEventsListener) it.next()).onDestroyed(conversationDestroyedInfo);
        }
    }
}
