package ru.ok.android.externcalls.sdk.factory;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B£\u0001\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b\u000f\u00100¨\u00062"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "", "payload", "Lbmf;", "tokenProvider", "Ltm;", "tokenInfoProvider", "", "chatId", "", "isWatchTogetherEnabledForAll", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "", "onPrepared", "", "onError", "Llx1;", "frameInterceptor", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lwga;", "cameraCapturerFactory", "shouldStartWithVideo", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;Lbmf;Ltm;Ljava/lang/Long;ZLru/ok/android/externcalls/sdk/id/ParticipantId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Llx1;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lwga;Z)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getOpponentId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "Lbmf;", "getTokenProvider", "()Lbmf;", "Ltm;", "getTokenInfoProvider", "()Ltm;", "Ljava/lang/Long;", "getChatId", "()Ljava/lang/Long;", "Z", "()Z", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class StartCallParams extends BaseCallParams<Builder, StartCallParams> {
    private final Long chatId;
    private final boolean isWatchTogetherEnabledForAll;
    private final ParticipantId opponentId;
    private final String payload;
    private final tm tokenInfoProvider;
    private final bmf tokenProvider;

    @SourceDebugExtension({"SMAP\nStartCallParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartCallParams.kt\nru/ok/android/externcalls/sdk/factory/StartCallParams$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "<init>", "()V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "setOpponentId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", "payload", "setPayload", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lbmf;", "tokenProvider", "setTokenProvider", "(Lbmf;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Ltm;", "tokenInfoProvider", "setTokenInfoProvider", "(Ltm;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", "isEnabled", "setWatchTogetherEnabledForAll", "(Z)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", "chatId", "setChatId", "(J)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "build", "()Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Ljava/lang/String;", "Lbmf;", "Ltm;", "isWatchTogetherEnabledForAll", "Z", "Ljava/lang/Long;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder extends BaseCallParams.Builder<StartCallParams> {
        private Long chatId;
        private boolean isWatchTogetherEnabledForAll;
        private ParticipantId opponentId;
        private String payload;
        private tm tokenInfoProvider;
        private bmf tokenProvider;

        public final Builder setChatId(long j) {
            this.chatId = Long.valueOf(j);
            return this;
        }

        public final Builder setOpponentId(ParticipantId participantId) {
            this.opponentId = participantId;
            return this;
        }

        public final Builder setPayload(String str) {
            this.payload = str;
            return this;
        }

        public final Builder setTokenInfoProvider(tm tmVar) {
            this.tokenInfoProvider = tmVar;
            return this;
        }

        @Deprecated(message = "Use setTokenInfoProvider")
        public final Builder setTokenProvider(bmf bmf) {
            this.tokenProvider = bmf;
            return this;
        }

        public final Builder setWatchTogetherEnabledForAll(boolean z) {
            this.isWatchTogetherEnabledForAll = z;
            return this;
        }

        public StartCallParams build() {
            if (this.chatId == null && this.opponentId == null) {
                throw new IllegalArgumentException("target should exist: userId, callId or groupId");
            }
            ParticipantId myId = getMyId();
            if (myId != null) {
                Function1<Conversation, Unit> onPrepared = getOnPrepared();
                if (onPrepared != null) {
                    Function1<Throwable, Unit> onError = getOnError();
                    if (onError != null) {
                        boolean shouldStartWithVideo = getShouldStartWithVideo();
                        ConversationEventsListener eventListener = getEventListener();
                        ParticipantId participantId = this.opponentId;
                        Long l = this.chatId;
                        String str = this.payload;
                        getFrameInterceptor();
                        return new StartCallParams(participantId, str, this.tokenProvider, this.tokenInfoProvider, l, this.isWatchTogetherEnabledForAll, myId, onPrepared, onError, (lx1) null, eventListener, getCameraCapturerFactory(), shouldStartWithVideo, (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("onError callback is required".toString());
                }
                throw new IllegalArgumentException("onPrepared callback is required".toString());
            }
            throw new IllegalArgumentException("Caller id is required".toString());
        }
    }

    public /* synthetic */ StartCallParams(ParticipantId participantId, String str, bmf bmf, tm tmVar, Long l, boolean z, ParticipantId participantId2, Function1 function1, Function1 function12, lx1 lx1, ConversationEventsListener conversationEventsListener, wga wga, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(participantId, str, bmf, tmVar, l, z, participantId2, function1, function12, lx1, conversationEventsListener, wga, z2);
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final ParticipantId getOpponentId() {
        return this.opponentId;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final tm getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final bmf getTokenProvider() {
        return this.tokenProvider;
    }

    public final boolean isWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StartCallParams(ParticipantId participantId, String str, bmf bmf, tm tmVar, Long l, boolean z, ParticipantId participantId2, Function1<? super Conversation, Unit> function1, Function1<? super Throwable, Unit> function12, lx1 lx1, ConversationEventsListener conversationEventsListener, wga wga, boolean z2) {
        super(participantId2, conversationEventsListener, function1, function12, z2, lx1, wga);
        this.opponentId = participantId;
        this.payload = str;
        this.tokenProvider = bmf;
        this.tokenInfoProvider = tmVar;
        this.chatId = l;
        this.isWatchTogetherEnabledForAll = z;
    }
}
