package ru.ok.android.externcalls.sdk.video;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.EglBase;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u001a\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000f\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u00062\u0013\u0010\r\u001a\u000f\u0012\t\u0012\u00070\b¢\u0006\u0002\b\f\u0018\u00010\u0007H'¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/video/VideoRenderManager;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "participantId", "", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "", "Lorg/webrtc/VideoSink;", "getRenderers", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/Map;", "key", "Lkotlin/jvm/JvmSuppressWildcards;", "renderers", "", "setRenderers", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Ljava/util/List;)V", "Lnd1;", "getCallRenderer", "()Lnd1;", "callRenderer", "Lorg/webrtc/EglBase$Context;", "getEglBaseContext", "()Lorg/webrtc/EglBase$Context;", "eglBaseContext", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface VideoRenderManager {
    nd1 getCallRenderer();

    EglBase.Context getEglBaseContext();

    Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId);

    void setRenderers(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, List<VideoSink> list);
}
