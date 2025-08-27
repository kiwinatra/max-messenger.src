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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001'B\u0001\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b&\u0010\u001f¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "", "link", "Lbmf;", "tokenProvider", "Ltm;", "tokenInfoProvider", "payload", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Llx1;", "frameInterceptor", "Lwga;", "cameraCapturerFactory", "<init>", "(Ljava/lang/String;Lbmf;Ltm;Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLru/ok/android/externcalls/sdk/events/ConversationEventsListener;Llx1;Lwga;)V", "Ljava/lang/String;", "getLink", "()Ljava/lang/String;", "Lbmf;", "getTokenProvider", "()Lbmf;", "Ltm;", "getTokenInfoProvider", "()Ltm;", "getPayload", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class JoinByLinkParams extends BaseCallParams<Builder, JoinByLinkParams> {
    private final String link;
    private final String payload;
    private final tm tokenInfoProvider;
    private final bmf tokenProvider;

    @SourceDebugExtension({"SMAP\nJoinByLinkParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinByLinkParams.kt\nru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "<init>", "()V", "Lbmf;", "tokenProvider", "setTokenProvider", "(Lbmf;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "Ltm;", "tokenInfoProvider", "setTokenInfoProvider", "(Ltm;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "", "link", "setLink", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "payload", "setPayload", "build", "()Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "Ljava/lang/String;", "Lbmf;", "Ltm;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder extends BaseCallParams.Builder<JoinByLinkParams> {
        private String link;
        private String payload;
        private tm tokenInfoProvider;
        private bmf tokenProvider;

        public final Builder setLink(String str) {
            this.link = str;
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

        public JoinByLinkParams build() {
            String str = this.link;
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
                            return new JoinByLinkParams(str, this.tokenProvider, this.tokenInfoProvider, this.payload, myId, onPrepared, onError, shouldStartWithVideo, eventListener, (lx1) null, getCameraCapturerFactory(), (DefaultConstructorMarker) null);
                        }
                        throw new IllegalArgumentException("onError callback is required".toString());
                    }
                    throw new IllegalArgumentException("onPrepared callback is required".toString());
                }
                throw new IllegalArgumentException("Caller id is required".toString());
            }
            throw new IllegalArgumentException("Link is required".toString());
        }
    }

    public /* synthetic */ JoinByLinkParams(String str, bmf bmf, tm tmVar, String str2, ParticipantId participantId, Function1 function1, Function1 function12, boolean z, ConversationEventsListener conversationEventsListener, lx1 lx1, wga wga, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bmf, tmVar, str2, participantId, function1, function12, z, conversationEventsListener, lx1, wga);
    }

    public final String getLink() {
        return this.link;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private JoinByLinkParams(String str, bmf bmf, tm tmVar, String str2, ParticipantId participantId, Function1<? super Conversation, Unit> function1, Function1<? super Throwable, Unit> function12, boolean z, ConversationEventsListener conversationEventsListener, lx1 lx1, wga wga) {
        super(participantId, conversationEventsListener, function1, function12, z, lx1, wga);
        this.link = str;
        this.tokenProvider = bmf;
        this.tokenInfoProvider = tmVar;
        this.payload = str2;
    }
}
