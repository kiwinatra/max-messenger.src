package ru.ok.android.externcalls.sdk.video.internal;

import android.content.Context;
import android.view.View;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;
import ru.ok.android.externcalls.sdk.video.VideoRender;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0010\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ!\u0010!\u001a\u00020\r2\n\u0010\"\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010#J\u001c\u0010$\u001a\u00020\r2\n\u0010\"\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010%\u001a\u00020&H\u0016J\u001d\u0010'\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010(\u001a\u00020)H\u0016¢\u0006\u0002\u0010*J-\u0010+\u001a\u00020\r2\u000e\u0010\"\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010(\u001a\u00020)H\u0016¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020\r2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0016J\u0014\u0010\u0019\u001a\u00020\r*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/ParticipantVideoViewManagerImpl;", "R", "Landroid/view/View;", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "conversation", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation;", "factory", "Lkotlin/Function1;", "Landroid/content/Context;", "onOwnCameraRendererSet", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "ownVideoTrack", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "getOwnVideoTrack", "()Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "videoRender", "Lru/ok/android/externcalls/sdk/video/VideoRender;", "createVideoViewInstance", "context", "(Landroid/content/Context;)Landroid/view/View;", "rebindParticipantView", "participant", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "rebindParticipantViews", "releaseParticipantView", "renderView", "(Landroid/view/View;)V", "removeOwnVideoParticipantView", "removeParticipantView", "key", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Landroid/view/View;)V", "setMirror", "isMirror", "", "setOwnVideoParticipantView", "decorator", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "(Landroid/view/View;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "setParticipantView", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Landroid/view/View;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "updateDisplayLayout", "displayLayouts", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nParticipantVideoViewManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParticipantVideoViewManagerImpl.kt\nru/ok/android/externcalls/sdk/video/internal/ParticipantVideoViewManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1#2:132\n1855#3,2:133\n1855#3,2:135\n*S KotlinDebug\n*F\n+ 1 ParticipantVideoViewManagerImpl.kt\nru/ok/android/externcalls/sdk/video/internal/ParticipantVideoViewManagerImpl\n*L\n111#1:133,2\n126#1:135,2\n*E\n"})
public final class ParticipantVideoViewManagerImpl<R extends View & VideoSink & RendererView> implements ParticipantVideoViewManager<R> {
    private final Function0<Conversation> conversation;
    private final Function1<Context, R> factory;
    private final Function0<Unit> onOwnCameraRendererSet;
    private final VideoRender<R> videoRender = new VideoRender<>();

    public ParticipantVideoViewManagerImpl(Function0<? extends Conversation> function0, Function1<? super Context, ? extends R> function1, Function0<Unit> function02) {
        this.conversation = function0;
        this.factory = function1;
        this.onOwnCameraRendererSet = function02;
    }

    public ConversationVideoTrackParticipantKey getOwnVideoTrack() {
        Conversation invoke = this.conversation.invoke();
        if (invoke != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(invoke.getMe().getExternalId()).build();
        }
        return null;
    }

    public void rebindParticipantView(ConversationParticipant conversationParticipant) {
        Conversation invoke = this.conversation.invoke();
        if (invoke != null) {
            rebindParticipantView(invoke, conversationParticipant);
        }
    }

    public void rebindParticipantViews() {
        Conversation invoke = this.conversation.invoke();
        if (invoke != null && invoke.getState() == Conversation.State.Connected) {
            for (ConversationParticipant rebindParticipantView : invoke.getParticipants()) {
                rebindParticipantView(invoke, rebindParticipantView);
            }
        }
    }

    public void setMirror(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
        this.videoRender.setMirror(conversationVideoTrackParticipantKey, z);
    }

    public void updateDisplayLayout(Collection<ConversationDisplayLayoutItem> collection) {
        DisplayLayoutSender displayLayoutSender;
        Conversation invoke = this.conversation.invoke();
        if (invoke != null && (displayLayoutSender = invoke.getDisplayLayoutSender()) != null) {
            displayLayoutSender.sendDisplayLayouts(collection);
        }
    }

    private final void rebindParticipantView(Conversation conversation2, ConversationParticipant conversationParticipant) {
        if (conversationParticipant.isUseable()) {
            for (ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey : conversation2.getVideoRenderManager().getRenderers(conversationParticipant.getExternalId()).keySet()) {
                conversation2.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, this.videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
            }
        }
    }

    public R createVideoViewInstance(Context context) {
        return (View) this.factory.invoke(context);
    }

    public void releaseParticipantView(R r) {
        ((RendererView) r).release();
    }

    public void removeOwnVideoParticipantView(R r) {
        ConversationVideoTrackParticipantKey ownVideoTrack = getOwnVideoTrack();
        if (ownVideoTrack != null) {
            removeParticipantView(ownVideoTrack, r);
        }
    }

    public void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
        ConversationParticipant conversationParticipant;
        Conversation invoke = this.conversation.invoke();
        VideoSink videoSink = (VideoSink) r;
        if (this.videoRender.contains(conversationVideoTrackParticipantKey, videoSink)) {
            this.videoRender.removeDelegate(conversationVideoTrackParticipantKey, videoSink);
            if (invoke != null && (conversationParticipant = invoke.getParticipants().get(conversationVideoTrackParticipantKey.getParticipantId())) != null && conversationParticipant.isUseable()) {
                invoke.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, this.videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
            }
        }
    }

    public void setOwnVideoParticipantView(R r, FrameDecorator frameDecorator) {
        setParticipantView(getOwnVideoTrack(), (RendererView) r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r1 = r5.getParticipantId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setParticipantView(ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r5, R r6, ru.ok.android.externcalls.sdk.ui.FrameDecorator r7) {
        /*
            r4 = this;
            kotlin.jvm.functions.Function0<ru.ok.android.externcalls.sdk.Conversation> r0 = r4.conversation
            java.lang.Object r0 = r0.invoke()
            ru.ok.android.externcalls.sdk.Conversation r0 = (ru.ok.android.externcalls.sdk.Conversation) r0
            if (r0 == 0) goto L_0x007b
            ru.ok.android.externcalls.sdk.Conversation$State r1 = r0.getState()
            ru.ok.android.externcalls.sdk.Conversation$State r2 = ru.ok.android.externcalls.sdk.Conversation.State.Connected
            if (r1 == r2) goto L_0x0013
            goto L_0x007b
        L_0x0013:
            if (r5 == 0) goto L_0x007b
            ru.ok.android.externcalls.sdk.video.VideoRender<R> r1 = r4.videoRender
            r2 = r6
            org.webrtc.VideoSink r2 = (org.webrtc.VideoSink) r2
            boolean r1 = r1.contains(r5, r2)
            if (r1 == 0) goto L_0x0021
            goto L_0x007b
        L_0x0021:
            ru.ok.android.externcalls.sdk.id.ParticipantId r1 = r5.getParticipantId()
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection r3 = r0.getParticipants()
            ru.ok.android.externcalls.sdk.ConversationParticipant r3 = r3.get(r1)
            if (r3 == 0) goto L_0x007b
            boolean r3 = r3.isUseable()
            if (r3 != 0) goto L_0x0036
            goto L_0x007b
        L_0x0036:
            ru.ok.android.externcalls.sdk.video.VideoRender<R> r3 = r4.videoRender
            r3.addDelegate(r5, r2)
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r0.getMe()
            ru.ok.android.externcalls.sdk.id.ParticipantId r2 = r2.getExternalId()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0057
            a9g r1 = r5.getType()
            a9g r2 = defpackage.a9g.a
            if (r1 != r2) goto L_0x0057
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r4.onOwnCameraRendererSet
            r1.invoke()
            goto L_0x005e
        L_0x0057:
            r1 = r6
            ru.ok.android.externcalls.sdk.ui.RendererView r1 = (ru.ok.android.externcalls.sdk.ui.RendererView) r1
            r2 = 0
            r1.setMirror(r2)
        L_0x005e:
            ru.ok.android.externcalls.sdk.video.VideoRenderManager r1 = r0.getVideoRenderManager()
            ru.ok.android.externcalls.sdk.video.VideoRender<R> r4 = r4.videoRender
            java.util.List r4 = r4.asOkVideoSink(r5)
            r1.setRenderers(r5, r4)
            ru.ok.android.externcalls.sdk.video.VideoRenderManager r4 = r0.getVideoRenderManager()
            nd1 r4 = r4.getCallRenderer()
            if (r4 == 0) goto L_0x007b
            ru.ok.android.externcalls.sdk.ui.RendererView r6 = (ru.ok.android.externcalls.sdk.ui.RendererView) r6
            r5 = 0
            r6.init((defpackage.nd1) r4, (org.webrtc.RendererCommon.RendererEvents) r5, (ru.ok.android.externcalls.sdk.ui.FrameDecorator) r7)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.video.internal.ParticipantVideoViewManagerImpl.setParticipantView(ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey, android.view.View, ru.ok.android.externcalls.sdk.ui.FrameDecorator):void");
    }
}
