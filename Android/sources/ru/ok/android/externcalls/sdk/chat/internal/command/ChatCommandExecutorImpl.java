package ru.ok.android.externcalls.sdk.chat.internal.command;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;", "signalingProvider", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "participantStore", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "sendMessage", "", "message", "Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChatCommandExecutorImpl implements ChatCommandExecutor {
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;

    public ChatCommandExecutorImpl(SignalingProvider signalingProvider2, ParticipantStore participantStore2) {
        this.signalingProvider = signalingProvider2;
        this.participantStore = participantStore2;
    }

    /* access modifiers changed from: private */
    public static final void sendMessage$lambda$2(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void sendMessage$lambda$3(Function1 function1, JSONObject jSONObject) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Send message error " + jSONObject));
        }
    }

    public void sendMessage(OutboundMessage outboundMessage, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        ConversationParticipant conversationParticipant;
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            ParticipantId participantId = outboundMessage.getParticipantId();
            JSONObject jSONObject = null;
            if (participantId != null) {
                conversationParticipant = this.participantStore.getByExternal(participantId);
                if (conversationParticipant == null) {
                    if (function1 != null) {
                        function1.invoke(new NullPointerException("Couldn't find a ConversationParticipant for participantId=" + participantId));
                        return;
                    }
                    return;
                }
            } else {
                conversationParticipant = null;
            }
            ue1 internalId = conversationParticipant != null ? conversationParticipant.getInternalId() : null;
            String text = outboundMessage.getText();
            if (internalId != null) {
                try {
                    jSONObject = new JSONObject();
                    tf6.b(internalId, jSONObject, true);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
            rp6 a = tf6.a(jSONObject, "chat-message");
            a.a.put("message", (Object) text);
            o9e.d(a, false, new jt(2, function0), new kt(2, function1));
        }
    }
}
