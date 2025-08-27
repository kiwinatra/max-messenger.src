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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001/B\u0001\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u000f\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b.\u0010!¨\u00060"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/AnswerCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "", "conversationId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "", "answerAsContact", "Lbmf;", "tokenProvider", "Ltm;", "tokenInfoProvider", "conversationParams", "myId", "shouldStartWithVideo", "Llx1;", "frameInterceptor", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "", "onPrepared", "", "onError", "Lwga;", "cameraCapturerFactory", "<init>", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;ZLbmf;Ltm;Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;ZLlx1;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lwga;)V", "Ljava/lang/String;", "getConversationId", "()Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getOpponentId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Z", "getAnswerAsContact", "()Z", "Lbmf;", "getTokenProvider", "()Lbmf;", "Ltm;", "getTokenInfoProvider", "()Ltm;", "getConversationParams", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AnswerCallParams extends BaseCallParams<Builder, AnswerCallParams> {
    private final boolean answerAsContact;
    private final String conversationId;
    private final String conversationParams;
    private final ParticipantId opponentId;
    private final tm tokenInfoProvider;
    private final bmf tokenProvider;

    @SourceDebugExtension({"SMAP\nAnswerCallParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerCallParams.kt\nru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u00002\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006#"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/AnswerCallParams;", "<init>", "()V", "", "conversationId", "setConversationId", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "setOpponentId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "", "answerAsContact", "setAnswerAsContact", "(Z)Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "Lbmf;", "tokenProvider", "setTokenProvider", "(Lbmf;)Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "Ltm;", "tokenInfoProvider", "setTokenInfoProvider", "(Ltm;)Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "conversationParams", "setConversationParams", "build", "()Lru/ok/android/externcalls/sdk/factory/AnswerCallParams;", "Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Z", "Lbmf;", "Ltm;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder extends BaseCallParams.Builder<AnswerCallParams> {
        private boolean answerAsContact;
        private String conversationId;
        private String conversationParams;
        private ParticipantId opponentId;
        private tm tokenInfoProvider;
        private bmf tokenProvider;

        public final Builder setAnswerAsContact(boolean z) {
            this.answerAsContact = z;
            return this;
        }

        public final Builder setConversationId(String str) {
            this.conversationId = str;
            return this;
        }

        public final Builder setConversationParams(String str) {
            this.conversationParams = str;
            return this;
        }

        public final Builder setOpponentId(ParticipantId participantId) {
            this.opponentId = participantId;
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

        public AnswerCallParams build() {
            String str = this.conversationId;
            if (str != null) {
                ParticipantId participantId = this.opponentId;
                if (participantId != null) {
                    ParticipantId myId = getMyId();
                    if (myId != null) {
                        Function1<Conversation, Unit> onPrepared = getOnPrepared();
                        if (onPrepared != null) {
                            Function1<Throwable, Unit> onError = getOnError();
                            if (onError != null) {
                                ConversationEventsListener eventListener = getEventListener();
                                boolean shouldStartWithVideo = getShouldStartWithVideo();
                                boolean z = this.answerAsContact;
                                getFrameInterceptor();
                                return new AnswerCallParams(str, participantId, z, this.tokenProvider, this.tokenInfoProvider, this.conversationParams, myId, shouldStartWithVideo, (lx1) null, eventListener, onPrepared, onError, getCameraCapturerFactory(), (DefaultConstructorMarker) null);
                            }
                            throw new IllegalArgumentException("onError callback is required".toString());
                        }
                        throw new IllegalArgumentException("onPrepared callback is required".toString());
                    }
                    throw new IllegalArgumentException("Caller id is required".toString());
                }
                throw new IllegalArgumentException("Opponent id is required".toString());
            }
            throw new IllegalArgumentException("Conversation id is required".toString());
        }
    }

    public /* synthetic */ AnswerCallParams(String str, ParticipantId participantId, boolean z, bmf bmf, tm tmVar, String str2, ParticipantId participantId2, boolean z2, lx1 lx1, ConversationEventsListener conversationEventsListener, Function1 function1, Function1 function12, wga wga, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, participantId, z, bmf, tmVar, str2, participantId2, z2, lx1, conversationEventsListener, function1, function12, wga);
    }

    public final boolean getAnswerAsContact() {
        return this.answerAsContact;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationParams() {
        return this.conversationParams;
    }

    public final ParticipantId getOpponentId() {
        return this.opponentId;
    }

    public final tm getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final bmf getTokenProvider() {
        return this.tokenProvider;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AnswerCallParams(String str, ParticipantId participantId, boolean z, bmf bmf, tm tmVar, String str2, ParticipantId participantId2, boolean z2, lx1 lx1, ConversationEventsListener conversationEventsListener, Function1<? super Conversation, Unit> function1, Function1<? super Throwable, Unit> function12, wga wga) {
        super(participantId2, conversationEventsListener, function1, function12, z2, lx1, wga);
        this.conversationId = str;
        this.opponentId = participantId;
        this.answerAsContact = z;
        this.tokenProvider = bmf;
        this.tokenInfoProvider = tmVar;
        this.conversationParams = str2;
    }
}
