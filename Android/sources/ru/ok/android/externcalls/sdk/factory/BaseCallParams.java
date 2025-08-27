package ru.ok.android.externcalls.sdk.factory;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001+Bc\b\u0004\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "B", "T", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Llx1;", "frameInterceptor", "Lwga;", "cameraCapturerFactory", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLlx1;Lwga;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getMyId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "getEventListener", "()Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Lkotlin/jvm/functions/Function1;", "getOnPrepared", "()Lkotlin/jvm/functions/Function1;", "getOnError", "Z", "getShouldStartWithVideo", "()Z", "Llx1;", "getFrameInterceptor", "()Llx1;", "Lwga;", "getCameraCapturerFactory", "()Lwga;", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public abstract class BaseCallParams<B extends Builder<T>, T> {
    private final wga cameraCapturerFactory;
    private final ConversationEventsListener eventListener;
    private final lx1 frameInterceptor;
    private final ParticipantId myId;
    private final Function1<Throwable, Unit> onError;
    private final Function1<Conversation, Unit> onPrepared;
    private final boolean shouldStartWithVideo;

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018¢\u0006\u0004\b\u0016\u0010\u0019J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0007¢\u0006\u0004\b\u0016\u0010\u001bJ\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u0016\u0010\u001dJ'\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b \u0010\u0017J!\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018¢\u0006\u0004\b \u0010\u0019J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00028\u0002H&¢\u0006\u0004\b)\u0010*R*\u0010+\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b\b\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102\"\u0004\b\f\u00103R$\u00104\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b\u0010\u00108R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;\"\u0004\b\u0016\u0010<R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001f\u00109\u001a\u0004\b=\u0010;\"\u0004\b \u0010<R\"\u0010&\u001a\u00020%8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b&\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\"\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\"\u0010C\u001a\u0004\bD\u0010E\"\u0004\b#\u0010F¨\u0006G"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "T", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "callerId", "setMyId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "setEventListener", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lwga;", "factory", "setCameraCapturerFactory", "(Lwga;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "", "onPrepared", "setOnPrepared", "(Lkotlin/jvm/functions/Function1;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lrk3;", "(Lrk3;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "onError", "setOnError", "Llx1;", "frameInterceptor", "setFrameInterceptor", "(Llx1;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "shouldStartWithVideo", "setStartWithVideo", "(Z)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "build", "()Ljava/lang/Object;", "myId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getMyId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "getEventListener", "()Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)V", "cameraCapturerFactory", "Lwga;", "getCameraCapturerFactory", "()Lwga;", "(Lwga;)V", "Lkotlin/jvm/functions/Function1;", "getOnPrepared", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "getOnError", "Z", "getShouldStartWithVideo", "()Z", "setShouldStartWithVideo", "(Z)V", "Llx1;", "getFrameInterceptor", "()Llx1;", "(Llx1;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class Builder<T> {
        private wga cameraCapturerFactory;
        private ConversationEventsListener eventListener;
        private lx1 frameInterceptor;
        private ParticipantId myId;
        private Function1<? super Throwable, Unit> onError;
        private Function1<? super Conversation, Unit> onPrepared;
        private boolean shouldStartWithVideo;

        /* access modifiers changed from: private */
        public static final void setOnPrepared$lambda$6$lambda$5(Function0 function0) {
            function0.invoke();
        }

        public abstract T build();

        public final wga getCameraCapturerFactory() {
            return this.cameraCapturerFactory;
        }

        public final ConversationEventsListener getEventListener() {
            return this.eventListener;
        }

        public final lx1 getFrameInterceptor() {
            return null;
        }

        public final ParticipantId getMyId() {
            return this.myId;
        }

        public final Function1<Throwable, Unit> getOnError() {
            return this.onError;
        }

        public final Function1<Conversation, Unit> getOnPrepared() {
            return this.onPrepared;
        }

        public final boolean getShouldStartWithVideo() {
            return this.shouldStartWithVideo;
        }

        /* renamed from: setCameraCapturerFactory  reason: collision with other method in class */
        public final void m1605setCameraCapturerFactory(wga wga) {
            this.cameraCapturerFactory = wga;
        }

        /* renamed from: setEventListener  reason: collision with other method in class */
        public final void m1606setEventListener(ConversationEventsListener conversationEventsListener) {
            this.eventListener = conversationEventsListener;
        }

        /* renamed from: setFrameInterceptor  reason: collision with other method in class */
        public final void m1607setFrameInterceptor(lx1 lx1) {
        }

        /* renamed from: setMyId  reason: collision with other method in class */
        public final void m1608setMyId(ParticipantId participantId) {
            this.myId = participantId;
        }

        /* renamed from: setOnError  reason: collision with other method in class */
        public final void m1609setOnError(Function1<? super Throwable, Unit> function1) {
            this.onError = function1;
        }

        @Deprecated(message = "deprecated", replaceWith = @ReplaceWith(expression = "setOnPrepared(onPrepared: Consumer<Conversation>)", imports = {}))
        public final Builder<T> setOnPrepared(Runnable runnable) {
            rk3 rk3;
            if (runnable == null) {
                rk3 = new nk3(0);
            } else {
                rk3 = new ok3(0, runnable);
            }
            setOnPrepared(rk3);
            return this;
        }

        public final void setShouldStartWithVideo(boolean z) {
            this.shouldStartWithVideo = z;
        }

        public final Builder<T> setStartWithVideo(boolean z) {
            this.shouldStartWithVideo = z;
            return this;
        }

        public final Builder<T> setCameraCapturerFactory(wga wga) {
            this.cameraCapturerFactory = wga;
            return this;
        }

        public final Builder<T> setEventListener(ConversationEventsListener conversationEventsListener) {
            this.eventListener = conversationEventsListener;
            return this;
        }

        public final Builder<T> setFrameInterceptor(lx1 lx1) {
            return this;
        }

        public final Builder<T> setMyId(ParticipantId participantId) {
            this.myId = participantId;
            return this;
        }

        public final Builder<T> setOnError(Function1<? super Throwable, Unit> function1) {
            this.onError = function1;
            return this;
        }

        public final Builder<T> setOnError(rk3 rk3) {
            this.onError = new BaseCallParams$Builder$setOnError$2$1(rk3);
            return this;
        }

        /* renamed from: setOnPrepared  reason: collision with other method in class */
        public final void m1610setOnPrepared(Function1<? super Conversation, Unit> function1) {
            this.onPrepared = function1;
        }

        public final Builder<T> setOnPrepared(Function1<? super Conversation, Unit> function1) {
            this.onPrepared = function1;
            return this;
        }

        public final Builder<T> setOnPrepared(rk3 rk3) {
            this.onPrepared = new BaseCallParams$Builder$setOnPrepared$2$1(rk3);
            return this;
        }

        @Deprecated(message = "deprecated", replaceWith = @ReplaceWith(expression = "setOnPrepared(onPrepared: Consumer<Conversation>)", imports = {}))
        public final Builder<T> setOnPrepared(Function0<Unit> function0) {
            setOnPrepared((rk3) new ok3(0, new si0(0, function0)));
            return this;
        }
    }

    public BaseCallParams(ParticipantId participantId, ConversationEventsListener conversationEventsListener, Function1<? super Conversation, Unit> function1, Function1<? super Throwable, Unit> function12, boolean z, lx1 lx1, wga wga) {
        this.myId = participantId;
        this.eventListener = conversationEventsListener;
        this.onPrepared = function1;
        this.onError = function12;
        this.shouldStartWithVideo = z;
        this.cameraCapturerFactory = wga;
    }

    public final wga getCameraCapturerFactory() {
        return this.cameraCapturerFactory;
    }

    public final ConversationEventsListener getEventListener() {
        return this.eventListener;
    }

    public final lx1 getFrameInterceptor() {
        return null;
    }

    public final ParticipantId getMyId() {
        return this.myId;
    }

    public final Function1<Throwable, Unit> getOnError() {
        return this.onError;
    }

    public final Function1<Conversation, Unit> getOnPrepared() {
        return this.onPrepared;
    }

    public final boolean getShouldStartWithVideo() {
        return this.shouldStartWithVideo;
    }
}
