package ru.ok.android.externcalls.sdk.video;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.ui.RendererView;

@SourceDebugExtension({"SMAP\nVideoRender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoRender.kt\nru/ok/android/externcalls/sdk/video/VideoRender\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n72#2,2:55\n1#3:57\n1855#4,2:58\n1855#4,2:60\n*S KotlinDebug\n*F\n+ 1 VideoRender.kt\nru/ok/android/externcalls/sdk/video/VideoRender\n*L\n26#1:55,2\n26#1:57\n35#1:58,2\n39#1:60,2\n*E\n"})
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u0019*\u000e\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\u00020\u00032\u00020\u0004:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\n\u0010\r\u001a\u00060\bj\u0002`\tJ\u0006\u0010\u0012\u001a\u00020\fJ\u0012\u0010\u0013\u001a\u00020\u00142\n\u0010\r\u001a\u00060\bj\u0002`\tJ\u001f\u0010\u0013\u001a\u00020\u00142\n\u0010\r\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\f2\n\u0010\r\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\f2\n\u0010\r\u001a\u00060\bj\u0002`\t2\u0006\u0010\u0018\u001a\u00020\u0014R$\u0010\u0006\u001a\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/video/VideoRender;", "T", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "", "()V", "delegates", "Ljava/util/concurrent/ConcurrentHashMap;", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "", "addDelegate", "", "key", "render", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lorg/webrtc/VideoSink;)V", "asOkVideoSink", "", "clear", "contains", "", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lorg/webrtc/VideoSink;)Z", "removeDelegate", "setMirror", "mirror", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VideoRender<T extends VideoSink & RendererView> {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LOG_TAG = "VideoRender";
    private final ConcurrentHashMap<ConversationVideoTrackParticipantKey, List<T>> delegates = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/video/VideoRender$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        r0 = new java.util.concurrent.CopyOnWriteArrayList<>();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void addDelegate(ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r3, T r4) {
        /*
            r2 = this;
            boolean r0 = r2.contains(r3, r4)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "adding "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " to "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoRender"
            ru.ok.android.externcalls.sdk.log.GlobalRTCLogger.log(r1, r0)
            java.util.concurrent.ConcurrentHashMap<ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey, java.util.List<T>> r2 = r2.delegates
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L_0x0037
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.Object r2 = r2.putIfAbsent(r3, r0)
            if (r2 != 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            java.util.List r0 = (java.util.List) r0
            r0.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.video.VideoRender.addDelegate(ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey, org.webrtc.VideoSink):void");
    }

    public final List<VideoSink> asOkVideoSink(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        return CollectionsKt.listOf(new VideoSinkWrapper(conversationVideoTrackParticipantKey, this.delegates));
    }

    public final void clear() {
        for (List clear : this.delegates.values()) {
            clear.clear();
        }
        this.delegates.clear();
    }

    public final boolean contains(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        List list = this.delegates.get(conversationVideoTrackParticipantKey);
        return list != null && !list.isEmpty();
    }

    public final void removeDelegate(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, T t) {
        GlobalRTCLogger.log(LOG_TAG, "removing " + t + " from " + conversationVideoTrackParticipantKey);
        List list = this.delegates.get(conversationVideoTrackParticipantKey);
        if (list != null) {
            list.remove(t);
        }
    }

    public final void setMirror(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
        List<VideoSink> list = this.delegates.get(conversationVideoTrackParticipantKey);
        if (list != null) {
            for (VideoSink videoSink : list) {
                ((RendererView) videoSink).setMirror(z);
            }
        }
    }

    public final boolean contains(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, T t) {
        List list = this.delegates.get(conversationVideoTrackParticipantKey);
        return list != null && list.contains(t);
    }
}
