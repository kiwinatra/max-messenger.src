package ru.ok.android.externcalls.sdk.factory;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 Bu\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/JoinCallParams$Builder;", "", "conversationId", "", "chatId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Llx1;", "frameInterceptor", "Lwga;", "cameraCapturerFactory", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLru/ok/android/externcalls/sdk/events/ConversationEventsListener;Llx1;Lwga;)V", "Ljava/lang/String;", "getConversationId", "()Ljava/lang/String;", "Ljava/lang/Long;", "getChatId", "()Ljava/lang/Long;", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class JoinCallParams extends BaseCallParams<Builder, JoinCallParams> {
    private final Long chatId;
    private final String conversationId;

    @SourceDebugExtension({"SMAP\nJoinCallParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinCallParams.kt\nru/ok/android/externcalls/sdk/factory/JoinCallParams$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/JoinCallParams;", "()V", "chatId", "", "Ljava/lang/Long;", "conversationId", "", "build", "setChatId", "setConversationId", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder extends BaseCallParams.Builder<JoinCallParams> {
        private Long chatId;
        private String conversationId;

        public final Builder setChatId(long j) {
            this.chatId = Long.valueOf(j);
            return this;
        }

        public final Builder setConversationId(String str) {
            this.conversationId = str;
            return this;
        }

        public JoinCallParams build() {
            String str = this.conversationId;
            if (str != null) {
                ParticipantId myId = getMyId();
                if (myId != null) {
                    Function1<Conversation, Unit> onPrepared = getOnPrepared();
                    if (onPrepared != null) {
                        Function1<Throwable, Unit> onError = getOnError();
                        if (onError != null) {
                            ConversationEventsListener eventListener = getEventListener();
                            boolean shouldStartWithVideo = getShouldStartWithVideo();
                            getFrameInterceptor();
                            return new JoinCallParams(str, this.chatId, myId, onPrepared, onError, shouldStartWithVideo, eventListener, (lx1) null, getCameraCapturerFactory(), (DefaultConstructorMarker) null);
                        }
                        throw new IllegalArgumentException("onError callback is required".toString());
                    }
                    throw new IllegalArgumentException("onPrepared callback is required".toString());
                }
                throw new IllegalArgumentException("Caller id is required".toString());
            }
            throw new IllegalArgumentException("Conversation id is required".toString());
        }
    }

    public /* synthetic */ JoinCallParams(String str, Long l, ParticipantId participantId, Function1 function1, Function1 function12, boolean z, ConversationEventsListener conversationEventsListener, lx1 lx1, wga wga, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, participantId, function1, function12, z, conversationEventsListener, lx1, wga);
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private JoinCallParams(String str, Long l, ParticipantId participantId, Function1<? super Conversation, Unit> function1, Function1<? super Throwable, Unit> function12, boolean z, ConversationEventsListener conversationEventsListener, lx1 lx1, wga wga) {
        super(participantId, conversationEventsListener, function1, function12, z, lx1, wga);
        this.conversationId = str;
        this.chatId = l;
    }
}
