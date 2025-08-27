package ru.ok.android.externcalls.sdk.media.mute;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006Je\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017JY\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0018\u0010\u0019J_\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u001c\u0010\u001dJS\u0010\u001e\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020 2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H&¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/MediaMuteManager;", "", "Lru/ok/android/externcalls/sdk/media/mute/listener/MediaMuteManagerListener;", "listener", "", "addListener", "(Lru/ok/android/externcalls/sdk/media/mute/listener/MediaMuteManagerListener;)V", "removeListener", "", "Let8;", "Lft8;", "statesToUpdate", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Lzwd;", "roomId", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "updateMediaOptionsForParticipant", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "updateMediaOptionsForAll", "(Ljava/util/Map;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "mediaOptions", "requestToEnableMediaForParticipant", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "requestToEnableMediaForAll", "(Ljava/util/Set;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lgt8;", "getMediaOptionsForCall", "(Lzwd;)Lgt8;", "getMediaOptionsForCurrentUser", "()Lgt8;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface MediaMuteManager {
    static /* synthetic */ gt8 getMediaOptionsForCall$default(MediaMuteManager mediaMuteManager, zwd zwd, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                zwd = null;
            }
            return mediaMuteManager.getMediaOptionsForCall(zwd);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMediaOptionsForCall");
    }

    static /* synthetic */ void requestToEnableMediaForAll$default(MediaMuteManager mediaMuteManager, Set set, zwd zwd, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                zwd = null;
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            mediaMuteManager.requestToEnableMediaForAll(set, zwd, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestToEnableMediaForAll");
    }

    static /* synthetic */ void requestToEnableMediaForParticipant$default(MediaMuteManager mediaMuteManager, Set set, ParticipantId participantId, zwd zwd, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            mediaMuteManager.requestToEnableMediaForParticipant(set, participantId, (i & 4) != 0 ? null : zwd, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestToEnableMediaForParticipant");
    }

    static /* synthetic */ void updateMediaOptionsForAll$default(MediaMuteManager mediaMuteManager, Map map, zwd zwd, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                zwd = null;
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            mediaMuteManager.updateMediaOptionsForAll(map, zwd, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMediaOptionsForAll");
    }

    static /* synthetic */ void updateMediaOptionsForParticipant$default(MediaMuteManager mediaMuteManager, Map map, ParticipantId participantId, zwd zwd, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            mediaMuteManager.updateMediaOptionsForParticipant(map, participantId, (i & 4) != 0 ? null : zwd, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMediaOptionsForParticipant");
    }

    void addListener(MediaMuteManagerListener mediaMuteManagerListener);

    gt8 getMediaOptionsForCall(zwd zwd);

    gt8 getMediaOptionsForCurrentUser();

    void removeListener(MediaMuteManagerListener mediaMuteManagerListener);

    void requestToEnableMediaForAll(Set<? extends et8> set, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void requestToEnableMediaForParticipant(Set<? extends et8> set, ParticipantId participantId, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void setAudioPlayoutMuted(boolean z);

    void updateMediaOptionsForAll(Map<et8, ? extends ft8> map, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void updateMediaOptionsForParticipant(Map<et8, ? extends ft8> map, ParticipantId participantId, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}
