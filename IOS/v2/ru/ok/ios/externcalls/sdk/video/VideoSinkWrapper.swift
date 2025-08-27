package ru.ok.android.externcalls.sdk.video;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B/\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\u001c\u0010\u0006\u001a\u0018\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R$\u0010\u0006\u001a\u0018\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/video/VideoSinkWrapper;", "T", "Lorg/webrtc/VideoSink;", "key", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "delegates", "", "", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Ljava/util/Map;)V", "onFrame", "", "frame", "Lorg/webrtc/VideoFrame;", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVideoSinkWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoSinkWrapper.kt\nru/ok/android/externcalls/sdk/video/VideoSinkWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,17:1\n1855#2,2:18\n*S KotlinDebug\n*F\n+ 1 VideoSinkWrapper.kt\nru/ok/android/externcalls/sdk/video/VideoSinkWrapper\n*L\n12#1:18,2\n*E\n"})
public final class VideoSinkWrapper<T extends VideoSink> implements VideoSink {
    private final Map<ConversationVideoTrackParticipantKey, List<T>> delegates;
    private final ConversationVideoTrackParticipantKey key;

    public VideoSinkWrapper(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, Map<ConversationVideoTrackParticipantKey, ? extends List<? extends T>> map) {
        this.key = conversationVideoTrackParticipantKey;
        this.delegates = map;
    }

    public void onFrame(VideoFrame videoFrame) {
        List<VideoSink> list = this.delegates.get(this.key);
        if (list != null) {
            for (VideoSink onFrame : list) {
                onFrame.onFrame(videoFrame);
            }
        }
    }

    public String toString() {
        ParticipantId participantId = this.key.getParticipantId();
        int hashCode = hashCode();
        return participantId + "[" + hashCode + "]";
    }
}
