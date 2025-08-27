package ru.ok.android.externcalls.sdk.media.mute.internal.command;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010Jc\u0010\u001b\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u000e\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001f\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u000e\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J_\u0010!\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\n\u0010\u0015\u001a\u00060\bj\u0002`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b!\u0010\u001cJS\u0010\"\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010#JY\u0010$\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\n\u0010\u0015\u001a\u00060\bj\u0002`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b$\u0010 JM\u0010%\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020'2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R0\u0010\f\u001a\u001e\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lkotlin/Function0;", "Lhz0;", "getCall", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getInternalId", "Lzwd;", "getActiveRoomId", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "Let8;", "Lft8;", "statesToUpdate", "participantId", "roomId", "", "onSuccess", "", "onError", "updateMediaOptions", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "mediaOptions", "requestToEnableMedia", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "updateMediaOptionsForParticipant", "updateMediaOptionsForAll", "(Ljava/util/Map;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "requestToEnableMediaForParticipant", "requestToEnableMediaForAll", "(Ljava/util/Set;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lgt8;", "getMediaOptionsForCall", "(Lzwd;)Lgt8;", "getMediaOptionsForCurrentUser", "()Lgt8;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Lht8;", "paramsCreator", "Lht8;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MediaMuteCommandExecutorImpl implements MediaMuteCommandExecutor {
    private final Function0<zwd> getActiveRoomId;
    private final Function0<hz0> getCall;
    private final Function1<ParticipantId, ue1> getInternalId;
    private final ht8 paramsCreator = new Object();
    private final SignalingProvider signalingProvider;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, ht8] */
    public MediaMuteCommandExecutorImpl(SignalingProvider signalingProvider2, Function0<hz0> function0, Function1<? super ParticipantId, ue1> function1, Function0<? extends zwd> function02) {
        this.signalingProvider = signalingProvider2;
        this.getCall = function0;
        this.getInternalId = function1;
        this.getActiveRoomId = function02;
    }

    private final void requestToEnableMedia(Set<? extends et8> set, ParticipantId participantId, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            ue1 invoke = this.getInternalId.invoke(participantId);
            if (participantId == null || invoke != null) {
                try {
                    ht8 ht8 = this.paramsCreator;
                    if (zwd == null) {
                        zwd = this.getActiveRoomId.invoke();
                    }
                    ht8.getClass();
                    o9e.j(ht8.a(set, invoke, zwd), new jt(5, function0), new kt(5, function1));
                } catch (JSONException e) {
                    if (function1 != null) {
                        function1.invoke(new RuntimeException("Error while creating params", e));
                    }
                }
            } else if (function1 != null) {
                function1.invoke(new IllegalStateException("Participant is not prepared"));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void requestToEnableMedia$lambda$2(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void requestToEnableMedia$lambda$3(Function1 function1, JSONObject jSONObject) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Error response " + jSONObject));
        }
    }

    private final void updateMediaOptions(Map<et8, ? extends ft8> map, ParticipantId participantId, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            ue1 invoke = this.getInternalId.invoke(participantId);
            if (participantId == null || invoke != null) {
                try {
                    ht8 ht8 = this.paramsCreator;
                    if (zwd == null) {
                        zwd = this.getActiveRoomId.invoke();
                    }
                    ht8.getClass();
                    o9e.j(ht8.b(map, invoke, zwd), new jt(6, function0), new kt(6, function1));
                } catch (JSONException e) {
                    if (function1 != null) {
                        function1.invoke(new RuntimeException("Error while creating params", e));
                    }
                }
            } else if (function1 != null) {
                function1.invoke(new IllegalStateException("Participant is not prepared"));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void updateMediaOptions$lambda$0(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void updateMediaOptions$lambda$1(Function1 function1, JSONObject jSONObject) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Error response " + jSONObject));
        }
    }

    public gt8 getMediaOptionsForCall(zwd zwd) {
        gt8 gt8;
        hz0 invoke = this.getCall.invoke();
        if (zwd == null) {
            zwd = this.getActiveRoomId.invoke();
        }
        if (invoke != null) {
            kz9 h = invoke.J1.h(zwd);
            gt8 = new gt8(h.a, h.b, h.c, h.d);
        } else {
            gt8 = null;
        }
        return gt8 == null ? new gt8() : gt8;
    }

    public gt8 getMediaOptionsForCurrentUser() {
        gt8 gt8;
        hz0 invoke = this.getCall.invoke();
        if (invoke != null) {
            kz9 kz9 = invoke.J1.i;
            gt8 = new gt8(kz9.a, kz9.b, kz9.c, kz9.d);
        } else {
            gt8 = null;
        }
        return gt8 == null ? new gt8() : gt8;
    }

    public void requestToEnableMediaForAll(Set<? extends et8> set, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        requestToEnableMedia(set, (ParticipantId) null, zwd, function0, function1);
    }

    public void requestToEnableMediaForParticipant(Set<? extends et8> set, ParticipantId participantId, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        requestToEnableMedia(set, participantId, zwd, function0, function1);
    }

    public void setAudioPlayoutMuted(boolean z) {
        hz0 invoke = this.getCall.invoke();
        if (invoke != null) {
            t6e t6e = invoke.i1;
            t6e.getClass();
            t6e.a.execute(new q6e(t6e, z, 1));
        }
    }

    public void updateMediaOptionsForAll(Map<et8, ? extends ft8> map, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        updateMediaOptions(map, (ParticipantId) null, zwd, function0, function1);
    }

    public void updateMediaOptionsForParticipant(Map<et8, ? extends ft8> map, ParticipantId participantId, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        updateMediaOptions(map, participantId, zwd, function0, function1);
    }
}
