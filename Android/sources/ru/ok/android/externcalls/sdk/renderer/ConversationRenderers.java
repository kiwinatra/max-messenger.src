package ru.ok.android.externcalls.sdk.renderer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\r2\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tRZ\u0010\u0003\u001aN\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00070\u0004j&\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u0007`\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;", "", "()V", "renderersMap", "Ljava/util/HashMap;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "", "Lorg/webrtc/VideoSink;", "Lkotlin/collections/HashMap;", "getRenderers", "", "participantId", "setRenderers", "", "key", "renderers", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationRenderers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationRenderers.kt\nru/ok/android/externcalls/sdk/renderer/ConversationRenderers\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,34:1\n372#2,7:35\n372#2,7:42\n*S KotlinDebug\n*F\n+ 1 ConversationRenderers.kt\nru/ok/android/externcalls/sdk/renderer/ConversationRenderers\n*L\n19#1:35,7\n28#1:42,7\n*E\n"})
public final class ConversationRenderers {
    private final HashMap<ParticipantId, Map<ConversationVideoTrackParticipantKey, List<VideoSink>>> renderersMap = new HashMap<>();

    public final Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId) {
        HashMap hashMap = new HashMap();
        HashMap<ParticipantId, Map<ConversationVideoTrackParticipantKey, List<VideoSink>>> hashMap2 = this.renderersMap;
        Map<ConversationVideoTrackParticipantKey, List<VideoSink>> map = hashMap2.get(participantId);
        if (map == null) {
            map = new HashMap<>();
            hashMap2.put(participantId, map);
        }
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((ConversationVideoTrackParticipantKey) entry.getKey(), (List) entry.getValue());
        }
        return hashMap;
    }

    public final void setRenderers(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, List<? extends VideoSink> list) {
        HashMap<ParticipantId, Map<ConversationVideoTrackParticipantKey, List<VideoSink>>> hashMap = this.renderersMap;
        ParticipantId participantId = conversationVideoTrackParticipantKey.getParticipantId();
        Map<ConversationVideoTrackParticipantKey, List<VideoSink>> map = hashMap.get(participantId);
        if (map == null) {
            map = new HashMap<>();
            hashMap.put(participantId, map);
        }
        map.put(conversationVideoTrackParticipantKey, list);
    }
}
