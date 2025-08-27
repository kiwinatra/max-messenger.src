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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB}\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinAnonByLinkParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/JoinAnonByLinkParams$Builder;", "", "link", "token", "apiEndpoint", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "", "shouldStartWithVideo", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "", "onPrepared", "", "onError", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Llx1;", "frameInterceptor", "Lwga;", "cameraCapturerFactory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Llx1;Lwga;)V", "Ljava/lang/String;", "getLink", "()Ljava/lang/String;", "getToken", "getApiEndpoint", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class JoinAnonByLinkParams extends BaseCallParams<Builder, JoinAnonByLinkParams> {
    private final String apiEndpoint;
    private final String link;
    private final String token;

    @SourceDebugExtension({"SMAP\nJoinAnonByLinkParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinAnonByLinkParams.kt\nru/ok/android/externcalls/sdk/factory/JoinAnonByLinkParams$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005H\u0007J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinAnonByLinkParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/JoinAnonByLinkParams;", "()V", "apiEndpoint", "", "link", "token", "build", "setLink", "setToken", "setTokenInfo", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder extends BaseCallParams.Builder<JoinAnonByLinkParams> {
        private String apiEndpoint;
        private String link;
        private String token;

        public final Builder setLink(String str) {
            this.link = str;
            return this;
        }

        @Deprecated(message = "Use setTokenInfo")
        public final Builder setToken(String str) {
            this.token = str;
            return this;
        }

        public final Builder setTokenInfo(String str, String str2) {
            this.token = str;
            this.apiEndpoint = str2;
            return this;
        }

        public JoinAnonByLinkParams build() {
            String str = this.link;
            if (str != null) {
                ParticipantId myId = getMyId();
                if (myId != null) {
                    Function1<Conversation, Unit> onPrepared = getOnPrepared();
                    if (onPrepared != null) {
                        Function1<Throwable, Unit> onError = getOnError();
                        if (onError != null) {
                            String str2 = this.token;
                            if (str2 != null) {
                                String str3 = this.apiEndpoint;
                                ConversationEventsListener eventListener = getEventListener();
                                boolean shouldStartWithVideo = getShouldStartWithVideo();
                                getFrameInterceptor();
                                return new JoinAnonByLinkParams(str, str2, str3, myId, shouldStartWithVideo, onPrepared, onError, eventListener, (lx1) null, getCameraCapturerFactory(), (DefaultConstructorMarker) null);
                            }
                            throw new IllegalArgumentException("Token is required".toString());
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

    public /* synthetic */ JoinAnonByLinkParams(String str, String str2, String str3, ParticipantId participantId, boolean z, Function1 function1, Function1 function12, ConversationEventsListener conversationEventsListener, lx1 lx1, wga wga, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, participantId, z, function1, function12, conversationEventsListener, lx1, wga);
    }

    public final String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private JoinAnonByLinkParams(String str, String str2, String str3, ParticipantId participantId, boolean z, Function1<? super Conversation, Unit> function1, Function1<? super Throwable, Unit> function12, ConversationEventsListener conversationEventsListener, lx1 lx1, wga wga) {
        super(participantId, conversationEventsListener, function1, function12, z, lx1, wga);
        this.link = str;
        this.token = str2;
        this.apiEndpoint = str3;
    }
}
