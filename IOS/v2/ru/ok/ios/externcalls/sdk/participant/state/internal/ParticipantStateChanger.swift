package ru.ok.android.externcalls.sdk.participant.state.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\r\u001a\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0012\u001a\u00020\f2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;", "", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "", "newState", "Ln9e;", "listener", "errorListener", "", "changeMyState", "(Ljava/util/Map;Ln9e;Ln9e;)V", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "changeParticipantState", "(Lue1;Ljava/util/Map;Ln9e;Ln9e;)V", "lowerHandForAll", "(Ln9e;Ln9e;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ParticipantStateChanger {
    private final SignalingProvider signalingProvider;

    public ParticipantStateChanger(SignalingProvider signalingProvider2) {
        this.signalingProvider = signalingProvider2;
    }

    public static /* synthetic */ void changeMyState$default(ParticipantStateChanger participantStateChanger, Map map, n9e n9e, n9e n9e2, int i, Object obj) {
        if ((i & 4) != 0) {
            n9e2 = null;
        }
        participantStateChanger.changeMyState(map, n9e, n9e2);
    }

    public static /* synthetic */ void changeParticipantState$default(ParticipantStateChanger participantStateChanger, ue1 ue1, Map map, n9e n9e, n9e n9e2, int i, Object obj) {
        if ((i & 8) != 0) {
            n9e2 = null;
        }
        participantStateChanger.changeParticipantState(ue1, map, n9e, n9e2);
    }

    public static /* synthetic */ void lowerHandForAll$default(ParticipantStateChanger participantStateChanger, n9e n9e, n9e n9e2, int i, Object obj) {
        if ((i & 2) != 0) {
            n9e2 = null;
        }
        participantStateChanger.lowerHandForAll(n9e, n9e2);
    }

    @JvmOverloads
    public final void changeMyState(Map<String, String> map, n9e n9e) {
        changeMyState$default(this, map, n9e, (n9e) null, 4, (Object) null);
    }

    @JvmOverloads
    public final void changeParticipantState(ue1 ue1, Map<String, String> map, n9e n9e) {
        changeParticipantState$default(this, ue1, map, n9e, (n9e) null, 8, (Object) null);
    }

    public final void lowerHandForAll(n9e n9e, n9e n9e2) {
        o9e signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            signaling.d(tf6.a((JSONObject) null, "put-hands-down"), false, n9e, n9e2);
        }
    }

    @JvmOverloads
    public final void changeMyState(Map<String, String> map, n9e n9e, n9e n9e2) {
        o9e signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            signaling.d(tf6.k(map, (ue1) null), false, n9e, n9e2);
        }
    }

    @JvmOverloads
    public final void changeParticipantState(ue1 ue1, Map<String, String> map, n9e n9e, n9e n9e2) {
        o9e signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            signaling.d(tf6.k(map, ue1), false, n9e, n9e2);
        }
    }
}
