package ru.ok.android.externcalls.sdk.asr.internal.commands;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.exceptions.AsrException;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u0017\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lkotlin/Function1;", "", "", "onError", "Lo9e;", "getSignalingOrPassExceptionToOnError", "(Lkotlin/jvm/functions/Function1;)Lo9e;", "", "fileName", "Lzwd;", "sessionRoomId", "Lkotlin/Function0;", "onSuccess", "startRecord", "(Ljava/lang/String;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "stopRecord", "(Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "getActiveRoomId", "()Lzwd;", "activeRoomId", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AsrCommandsExecutorImpl implements AsrCommandsExecutor {
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;

    public AsrCommandsExecutorImpl(SignalingProvider signalingProvider2, ParticipantStore participantStore2) {
        this.signalingProvider = signalingProvider2;
        this.participantStore = participantStore2;
    }

    private final zwd getActiveRoomId() {
        return this.participantStore.getActiveRoomId();
    }

    private final o9e getSignalingOrPassExceptionToOnError(Function1<? super Throwable, Unit> function1) {
        o9e signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            return signaling;
        }
        if (function1 != null) {
            function1.invoke(new ConversationNotPreparedException());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void startRecord$lambda$0(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void startRecord$lambda$1(Function1 function1, JSONObject jSONObject) {
        if (function1 != null) {
            function1.invoke(new AsrException(jSONObject, (String) null, (Throwable) null, 6, (DefaultConstructorMarker) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void stopRecord$lambda$2(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void stopRecord$lambda$3(Function1 function1, JSONObject jSONObject) {
        if (function1 != null) {
            function1.invoke(new AsrException(jSONObject, (String) null, (Throwable) null, 6, (DefaultConstructorMarker) null));
        }
    }

    public void startRecord(String str, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        if (zwd == null) {
            zwd = getActiveRoomId();
        }
        o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
        if (signalingOrPassExceptionToOnError != null) {
            try {
                rp6 a = tf6.a((JSONObject) null, "asr-start");
                a.a.put("fileName", (Object) str);
                if (zwd instanceof ywd) {
                    a.b(((ywd) zwd).a, "roomId");
                }
                signalingOrPassExceptionToOnError.d(a, false, new jt(0, function0), new kt(0, function1));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stopRecord(zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        if (zwd == null) {
            zwd = getActiveRoomId();
        }
        o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
        if (signalingOrPassExceptionToOnError != null) {
            try {
                rp6 a = tf6.a((JSONObject) null, "asr-stop");
                if (zwd instanceof ywd) {
                    a.b(((ywd) zwd).a, "roomId");
                }
                signalingOrPassExceptionToOnError.d(a, false, new jt(1, function0), new kt(1, function1));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
