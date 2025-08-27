package ru.ok.android.externcalls.sdk.factory;

import java.util.Collection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B£\u0001\b\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00140\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR!\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b\u000e\u0010-R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b\u000f\u0010-¨\u0006/"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/CreateConfParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initialIds", "Lbmf;", "tokenProvider", "Ltm;", "tokenInfoProvider", "", "payload", "", "isAnonForbidden", "isWatchTogetherEnabledForAll", "shouldStartWithVideo", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "", "onPrepared", "", "onError", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Llx1;", "frameInterceptor", "Lwga;", "cameraCapturerFactory", "<init>", "(Ljava/util/Collection;Lbmf;Ltm;Ljava/lang/String;ZZZLru/ok/android/externcalls/sdk/id/ParticipantId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Llx1;Lwga;)V", "Ljava/util/Collection;", "getInitialIds", "()Ljava/util/Collection;", "Lbmf;", "getTokenProvider", "()Lbmf;", "Ltm;", "getTokenInfoProvider", "()Ltm;", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "Z", "()Z", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class CreateConfParams extends BaseCallParams<Builder, CreateConfParams> {
    private final Collection<ParticipantId> initialIds;
    private final boolean isAnonForbidden;
    private final boolean isWatchTogetherEnabledForAll;
    private final String payload;
    private final tm tokenInfoProvider;
    private final bmf tokenProvider;

    @SourceDebugExtension({"SMAP\nCreateConfParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateConfParams.kt\nru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00002\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010 R \u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/CreateConfParams;", "<init>", "()V", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initialIds", "setInitialIds", "(Ljava/util/Collection;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "", "isAnonForbidden", "setAnonForbidden", "(Z)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "", "payload", "setPayload", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "Lbmf;", "tokenProvider", "setTokenProvider", "(Lbmf;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "Ltm;", "tokenInfoProvider", "setTokenInfoProvider", "(Ltm;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "isWatchTogetherEnabledForAll", "setWatchTogetherEnabledForAll", "build", "()Lru/ok/android/externcalls/sdk/factory/CreateConfParams;", "Lbmf;", "Ltm;", "Ljava/util/Collection;", "Ljava/lang/String;", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder extends BaseCallParams.Builder<CreateConfParams> {
        private Collection<ParticipantId> initialIds = CollectionsKt.emptyList();
        private boolean isAnonForbidden;
        private boolean isWatchTogetherEnabledForAll = true;
        private String payload;
        private tm tokenInfoProvider;
        private bmf tokenProvider;

        public final Builder setAnonForbidden(boolean z) {
            this.isAnonForbidden = z;
            return this;
        }

        public final Builder setInitialIds(Collection<ParticipantId> collection) {
            this.initialIds = collection;
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

        public CreateConfParams build() {
            ParticipantId myId = getMyId();
            if (myId != null) {
                Function1<Conversation, Unit> onPrepared = getOnPrepared();
                if (onPrepared != null) {
                    Function1<Throwable, Unit> onError = getOnError();
                    if (onError != null) {
                        ConversationEventsListener eventListener = getEventListener();
                        boolean shouldStartWithVideo = getShouldStartWithVideo();
                        getFrameInterceptor();
                        bmf bmf = this.tokenProvider;
                        tm tmVar = this.tokenInfoProvider;
                        boolean z = this.isAnonForbidden;
                        return new CreateConfParams(this.initialIds, bmf, tmVar, this.payload, z, this.isWatchTogetherEnabledForAll, shouldStartWithVideo, myId, onPrepared, onError, eventListener, (lx1) null, getCameraCapturerFactory(), (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("onError callback is required".toString());
                }
                throw new IllegalArgumentException("onPrepared callback is required".toString());
            }
            throw new IllegalArgumentException("Caller id is required".toString());
        }
    }

    public /* synthetic */ CreateConfParams(Collection collection, bmf bmf, tm tmVar, String str, boolean z, boolean z2, boolean z3, ParticipantId participantId, Function1 function1, Function1 function12, ConversationEventsListener conversationEventsListener, lx1 lx1, wga wga, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, bmf, tmVar, str, z, z2, z3, participantId, function1, function12, conversationEventsListener, lx1, wga);
    }

    public final Collection<ParticipantId> getInitialIds() {
        return this.initialIds;
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

    public final boolean isAnonForbidden() {
        return this.isAnonForbidden;
    }

    public final boolean isWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CreateConfParams(Collection<ParticipantId> collection, bmf bmf, tm tmVar, String str, boolean z, boolean z2, boolean z3, ParticipantId participantId, Function1<? super Conversation, Unit> function1, Function1<? super Throwable, Unit> function12, ConversationEventsListener conversationEventsListener, lx1 lx1, wga wga) {
        super(participantId, conversationEventsListener, function1, function12, z3, lx1, wga);
        this.initialIds = collection;
        this.tokenProvider = bmf;
        this.tokenInfoProvider = tmVar;
        this.payload = str;
        this.isAnonForbidden = z;
        this.isWatchTogetherEnabledForAll = z2;
    }
}
