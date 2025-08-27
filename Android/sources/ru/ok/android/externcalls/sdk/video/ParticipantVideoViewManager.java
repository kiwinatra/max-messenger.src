package ru.ok.android.externcalls.sdk.video;

import android.content.Context;
import android.view.View;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.video.internal.ParticipantVideoViewManagerImpl;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 '*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001'J\b\u0010\t\u001a\u00020\nH\u0016J\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J!\u0010\u0017\u001a\u00020\n2\n\u0010\u0018\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001c\u0010\u001a\u001a\u00020\n2\n\u0010\u0018\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0016¢\u0006\u0002\u0010 J%\u0010!\u001a\u00020\n2\u000e\u0010\u0018\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J-\u0010!\u001a\u00020\n2\u000e\u0010\u0018\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0016¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016R\u001a\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "R", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "", "ownVideoTrack", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "getOwnVideoTrack", "()Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "clear", "", "createVideoViewInstance", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Lru/ok/android/externcalls/sdk/ui/RendererView;", "rebindParticipantView", "participant", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "rebindParticipantViews", "releaseParticipantView", "renderView", "(Lru/ok/android/externcalls/sdk/ui/RendererView;)V", "removeOwnVideoParticipantView", "removeParticipantView", "key", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lru/ok/android/externcalls/sdk/ui/RendererView;)V", "setMirror", "isMirror", "", "setOwnVideoParticipantView", "decorator", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "(Lru/ok/android/externcalls/sdk/ui/RendererView;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "setParticipantView", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lru/ok/android/externcalls/sdk/ui/RendererView;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "updateDisplayLayout", "displayLayouts", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ParticipantVideoViewManager<R extends RendererView> {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0010\b\u0001\u0010\u0005*\u00020\u0006*\u00020\u0007*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\u00050\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0007¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager$Companion;", "", "()V", "newInstance", "Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "T", "Landroid/view/View;", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "conversation", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation;", "factory", "Lkotlin/Function1;", "Landroid/content/Context;", "ownCameraCallback", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ ParticipantVideoViewManager newInstance$default(Companion companion, Function0 function0, Function1 function1, Function0 function02, int i, Object obj) {
            if ((i & 4) != 0) {
                function02 = ParticipantVideoViewManager$Companion$newInstance$1.INSTANCE;
            }
            return companion.newInstance(function0, function1, function02);
        }

        @JvmStatic
        public final <T extends View & VideoSink & RendererView> ParticipantVideoViewManager<T> newInstance(Function0<? extends Conversation> function0, Function1<? super Context, ? extends T> function1, Function0<Unit> function02) {
            return new ParticipantVideoViewManagerImpl(function0, function1, function02);
        }
    }

    @JvmStatic
    static <T extends View & VideoSink & RendererView> ParticipantVideoViewManager<T> newInstance(Function0<? extends Conversation> function0, Function1<? super Context, ? extends T> function1, Function0<Unit> function02) {
        return Companion.newInstance(function0, function1, function02);
    }

    /* access modifiers changed from: private */
    static VideoFrame setParticipantView$lambda$0(VideoFrame videoFrame) {
        return videoFrame;
    }

    void clear() {
    }

    R createVideoViewInstance(Context context);

    ConversationVideoTrackParticipantKey getOwnVideoTrack();

    void rebindParticipantView(ConversationParticipant conversationParticipant) {
    }

    void rebindParticipantViews() {
    }

    void releaseParticipantView(R r) {
    }

    void removeOwnVideoParticipantView(R r) {
    }

    void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
    }

    void setMirror(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
    }

    void setOwnVideoParticipantView(R r, FrameDecorator frameDecorator) {
    }

    void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r, FrameDecorator frameDecorator) {
    }

    void updateDisplayLayout(Collection<ConversationDisplayLayoutItem> collection) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.android.externcalls.sdk.ui.FrameDecorator, java.lang.Object] */
    void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
        setParticipantView(conversationVideoTrackParticipantKey, r, new Object());
    }
}
