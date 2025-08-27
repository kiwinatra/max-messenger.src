package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000f\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorBase;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "participantStatesManager", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestAttention", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lywd;", "roomId", "joinRoom", "(Lywd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "leaveRoom", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomCommandExecutorImpl extends SessionRoomCommandExecutorBase implements SessionRoomCommandExecutor {
    private final ParticipantStatesManagerImpl participantStatesManager;
    private final SignalingProvider signalingProvider;

    public SessionRoomCommandExecutorImpl(ParticipantStatesManagerImpl participantStatesManagerImpl, SignalingProvider signalingProvider2) {
        this.participantStatesManager = participantStatesManagerImpl;
        this.signalingProvider = signalingProvider2;
    }

    /* access modifiers changed from: private */
    public static final void joinRoom$lambda$2(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void joinRoom$lambda$3(SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        sessionRoomCommandExecutorImpl.parseErrorResponse("joinRoom", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void leaveRoom$lambda$4(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void leaveRoom$lambda$5(SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        sessionRoomCommandExecutorImpl.parseErrorResponse("leaveRoom", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void requestAttention$lambda$0(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void requestAttention$lambda$1(SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        sessionRoomCommandExecutorImpl.parseErrorResponse("requestAttention", jSONObject, function1);
    }

    public void joinRoom(ywd ywd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            if (ywd != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("command", (Object) "switch-room");
                jSONObject.put("toRoomId", ywd.a);
                o9e.d(new rp6(jSONObject), false, new jt(14, function0), new wwd(this, function1, 0));
                return;
            }
            throw new IllegalArgumentException("Session room id is required".toString());
        }
    }

    public void leaveRoom(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "switch-room");
            o9e.d(new rp6(jSONObject), false, new jt(15, function0), new wwd(this, function1, 1));
        }
    }

    public void requestAttention(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        ParticipantStatesManagerImpl participantStatesManagerImpl = this.participantStatesManager;
        ParticipantStatesManagerImpl.State state = ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED;
        if (!participantStatesManagerImpl.isOwnStateOn(state)) {
            this.participantStatesManager.updateOwnState(state, ParticipantStatesManagerImpl.Companion.getSTATE_ON(), new jt(16, function0), new wwd(this, function1, 2));
        } else if (function0 != null) {
            function0.invoke();
        }
    }
}
