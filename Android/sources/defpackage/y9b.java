package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.VideoRender;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;

/* renamed from: y9b  reason: default package */
public final class y9b implements x9b {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final VideoRender o = new VideoRender();
    public final ConcurrentHashMap.KeySetView v = ConcurrentHashMap.newKeySet();

    public y9b(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy3;
        this.b = lazy;
        this.c = lazy2;
    }

    public final Conversation c() {
        return ((jz3) this.b.getValue()).a();
    }

    public final void clear() {
        ConcurrentHashMap.KeySetView<w9b> keySetView = this.v;
        for (w9b w9b : keySetView) {
            on1 on1 = (on1) w9b;
            on1.c();
            on1.w = null;
            on1.x = false;
        }
        this.o.clear();
        keySetView.clear();
    }

    public final RendererView createVideoViewInstance(Context context) {
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        textureViewRenderer.setId(View.generateViewId());
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL, RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        return textureViewRenderer;
    }

    /* renamed from: d */
    public final void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, TextureViewRenderer textureViewRenderer) {
        Conversation c2 = c();
        if (c2 != null) {
            VideoRender videoRender = this.o;
            if (videoRender.contains(conversationVideoTrackParticipantKey, textureViewRenderer)) {
                videoRender.removeDelegate(conversationVideoTrackParticipantKey, textureViewRenderer);
                textureViewRenderer.clearImage();
                ConversationParticipant conversationParticipant = c2.getParticipants().get(conversationVideoTrackParticipantKey.getParticipantId());
                if (conversationParticipant != null && conversationParticipant.isUseable()) {
                    c2.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
                }
            }
        }
    }

    public final ConversationVideoTrackParticipantKey getOwnVideoTrack() {
        Conversation c2 = c();
        if (c2 != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(c2.getMe().getExternalId()).build();
        }
        return null;
    }

    public final void onCameraChanged() {
        TextureViewRenderer textureViewRenderer;
        for (w9b w9b : this.v) {
            boolean b2 = ((q11) this.a.getValue()).b();
            on1 on1 = (on1) w9b;
            x8g x8g = on1.y;
            if (!(x8g == null || !x8g.c || (textureViewRenderer = on1.c) == null)) {
                textureViewRenderer.setMirror(b2);
            }
        }
    }

    public final void rebindParticipantViews() {
        Conversation c2 = c();
        if (c2 != null) {
            for (ConversationParticipant conversationParticipant : c2.getParticipants()) {
                VideoRenderManager videoRenderManager = c2.getVideoRenderManager();
                if (conversationParticipant.isUseable()) {
                    for (ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey : videoRenderManager.getRenderers(conversationParticipant.getExternalId()).keySet()) {
                        videoRenderManager.setRenderers(conversationVideoTrackParticipantKey, this.o.asOkVideoSink(conversationVideoTrackParticipantKey));
                    }
                }
            }
        }
    }

    public final void releaseParticipantView(RendererView rendererView) {
        ((TextureViewRenderer) rendererView).release();
    }

    public final void removeOwnVideoParticipantView(RendererView rendererView) {
        removeParticipantView(((v9b) ((h9b) this.c.getValue())).c().a.q().b, (TextureViewRenderer) rendererView);
    }

    public final void setOwnVideoParticipantView(RendererView rendererView, FrameDecorator frameDecorator) {
        setParticipantView(((v9b) ((h9b) this.c.getValue())).c().a.q().b, (TextureViewRenderer) rendererView);
    }

    public final void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, RendererView rendererView, FrameDecorator frameDecorator) {
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) rendererView;
        Conversation c2 = c();
        if (c2 != null && conversationVideoTrackParticipantKey != null) {
            VideoRender videoRender = this.o;
            if (!videoRender.contains(conversationVideoTrackParticipantKey, textureViewRenderer)) {
                videoRender.addDelegate(conversationVideoTrackParticipantKey, textureViewRenderer);
                textureViewRenderer.setMirror(Intrinsics.areEqual((Object) c2.getMe().getExternalId(), (Object) conversationVideoTrackParticipantKey.getParticipantId()) && conversationVideoTrackParticipantKey.getType() == a9g.a && ((q11) this.a.getValue()).b());
                VideoRenderManager videoRenderManager = c2.getVideoRenderManager();
                videoRenderManager.setRenderers(conversationVideoTrackParticipantKey, videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
                nd1 callRenderer = videoRenderManager.getCallRenderer();
                if (callRenderer != null) {
                    RendererView.init$default(textureViewRenderer, callRenderer, (RendererCommon.RendererEvents) null, (FrameDecorator) null, 4, (Object) null);
                }
            }
        }
    }

    public final void updateDisplayLayout(Collection collection) {
        Conversation c2 = c();
        DisplayLayoutSender displayLayoutSender = c2 != null ? c2.getDisplayLayoutSender() : null;
        if (displayLayoutSender != null) {
            displayLayoutSender.sendDisplayLayouts(collection);
        }
    }
}
