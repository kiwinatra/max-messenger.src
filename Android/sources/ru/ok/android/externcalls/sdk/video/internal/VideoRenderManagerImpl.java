package ru.ok.android.externcalls.sdk.video.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.webrtc.EglBase;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.renderer.ConversationRenderers;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J/\u0010\u001e\u001a\u001a\u0012\b\u0012\u00060\u001cj\u0002`\u001d\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\u0018\u001a\u00020\u00132\n\u0010\u000f\u001a\u00060\u001cj\u0002`\u001d2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J/\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u001b2\n\u0010\u001a\u001a\u00060$j\u0002`%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R`\u0010/\u001aN\u0012\b\u0012\u00060$j\u0002`%\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100-0,j&\u0012\b\u0012\u00060$j\u0002`%\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100-`.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u0001018VX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058VX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/VideoRenderManagerImpl;", "Lru/ok/android/externcalls/sdk/video/VideoRenderManager;", "Lfl4;", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation$State;", "state", "Lhz0;", "call", "Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;", "conversationRenderers", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "<init>", "(Lkotlin/jvm/functions/Function0;Lhz0;Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lln1;", "key", "", "Lorg/webrtc/VideoSink;", "renderers", "", "setRenderersForMe", "(Lln1;Ljava/util/List;)V", "setRenderersForOthers", "value", "setRenderers", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "participantId", "", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "getRenderers", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/Map;", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Ljava/util/List;)V", "", "isEnabled", "()Z", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getRemoteVideoRenderers", "(Lue1;)Ljava/util/Map;", "Lkotlin/jvm/functions/Function0;", "Lhz0;", "Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "cache", "Ljava/util/HashMap;", "Lnd1;", "getCallRenderer", "()Lnd1;", "callRenderer", "Lorg/webrtc/EglBase$Context;", "getEglBaseContext", "()Lorg/webrtc/EglBase$Context;", "eglBaseContext", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVideoRenderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoRenderManagerImpl.kt\nru/ok/android/externcalls/sdk/video/internal/VideoRenderManagerImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,97:1\n372#2,7:98\n*S KotlinDebug\n*F\n+ 1 VideoRenderManagerImpl.kt\nru/ok/android/externcalls/sdk/video/internal/VideoRenderManagerImpl\n*L\n95#1:98,7\n*E\n"})
public final class VideoRenderManagerImpl implements VideoRenderManager, fl4 {
    private final HashMap<ue1, Map<ln1, List<VideoSink>>> cache = new HashMap<>();
    private final hz0 call;
    private final ConversationRenderers conversationRenderers;
    private final Function0<Conversation.State> state;
    private final ParticipantStore store;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a9g.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoRenderManagerImpl(Function0<? extends Conversation.State> function0, hz0 hz0, ConversationRenderers conversationRenderers2, ParticipantStore participantStore) {
        this.state = function0;
        this.call = hz0;
        this.conversationRenderers = conversationRenderers2;
        this.store = participantStore;
    }

    private final void setRenderersForMe(ln1 ln1, List<? extends VideoSink> list) {
        int ordinal = ln1.a.ordinal();
        if (ordinal == 0) {
            hz0 hz0 = this.call;
            Collection collection = list;
            VideoSink videoSink = (collection == null || collection.isEmpty()) ? null : (VideoSink) list.get(0);
            if (hz0.i()) {
                d dVar = hz0.j1;
                dVar.y0 = videoSink;
                v48 v48 = dVar.x0;
                if (v48 != null) {
                    v48.k(videoSink);
                }
            }
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                hz0 hz02 = this.call;
                ue1 ue1 = hz02.n1.a.a;
                if (ue1 != null) {
                    l15 l15 = new l15();
                    l15.a = ue1;
                    l15.b = a9g.c;
                    l15.e();
                    hz02.C1.getClass();
                }
            } else if (ordinal == 3 || ordinal == 4) {
                setRenderers(ln1, list);
                hz0 hz03 = this.call;
                if (hz03.i()) {
                    hz03.r1.Q(ln1, list);
                    hz03.C1.getClass();
                }
            } else {
                throw new RuntimeException("Unknown track type");
            }
        }
    }

    private final void setRenderersForOthers(ln1 ln1, List<? extends VideoSink> list) {
        setRenderers(ln1, list);
        hz0 hz0 = this.call;
        if (hz0.i()) {
            hz0.r1.Q(ln1, list);
            hz0.C1.getClass();
        }
    }

    public nd1 getCallRenderer() {
        if (this.state.invoke() != Conversation.State.Finished) {
            return this.call.w0;
        }
        return null;
    }

    public EglBase.Context getEglBaseContext() {
        if (this.call.v0 == null || this.state.invoke() == Conversation.State.Finished) {
            return null;
        }
        return this.call.v0.getEglBaseContext();
    }

    public Map<ln1, List<VideoSink>> getRemoteVideoRenderers(ue1 ue1) {
        Map<ln1, List<VideoSink>> map = this.cache.get(ue1);
        return map == null ? MapsKt.emptyMap() : map;
    }

    public Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId) {
        return this.conversationRenderers.getRenderers(participantId);
    }

    public boolean isEnabled() {
        return true;
    }

    public void setRenderers(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, List<? extends VideoSink> list) {
        ConversationParticipant conversationParticipant = this.store.get(conversationVideoTrackParticipantKey.getParticipantId());
        if (conversationParticipant != null && conversationParticipant.isUseable()) {
            l15 l15 = new l15();
            l15.b = conversationVideoTrackParticipantKey.getType();
            l15.a = conversationParticipant.getCallParticipant().a;
            l15.c = conversationVideoTrackParticipantKey.getMovieId();
            ln1 e = l15.e();
            this.conversationRenderers.setRenderers(conversationVideoTrackParticipantKey, list);
            if (conversationParticipant == this.store.getMe()) {
                setRenderersForMe(e, list);
            } else {
                setRenderersForOthers(e, list);
            }
        }
    }

    private final void setRenderers(ln1 ln1, List<? extends VideoSink> list) {
        HashMap<ue1, Map<ln1, List<VideoSink>>> hashMap = this.cache;
        ue1 ue1 = ln1.b;
        Map<ln1, List<VideoSink>> map = hashMap.get(ue1);
        if (map == null) {
            map = new HashMap<>();
            hashMap.put(ue1, map);
        }
        map.put(ln1, list);
    }
}
