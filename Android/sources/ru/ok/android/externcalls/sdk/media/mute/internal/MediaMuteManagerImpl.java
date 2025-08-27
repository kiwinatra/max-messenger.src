package ru.ok.android.externcalls.sdk.media.mute.internal;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u0018\u001a\u00020\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010\u001d\u001a\u00020\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b!\u0010\"JT\u0010&\u001a\u00020\u00132\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$0#2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015H\u0001¢\u0006\u0004\b&\u0010'J`\u0010(\u001a\u00020\u00132\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$0#2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015H\u0001¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b.\u0010-R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/internal/MediaMuteManagerImpl;", "Lru/ok/android/externcalls/sdk/media/mute/MediaMuteManager;", "Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "Lru/ok/android/externcalls/sdk/media/mute/internal/listener/MediaMuteListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;Lru/ok/android/externcalls/sdk/media/mute/internal/listener/MediaMuteListenerManager;)V", "Lzwd;", "roomId", "Lgt8;", "getMediaOptionsForCall", "(Lzwd;)Lgt8;", "getMediaOptionsForCurrentUser", "()Lgt8;", "", "Let8;", "mediaOptions", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestToEnableMediaForAll", "(Ljava/util/Set;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "requestToEnableMediaForParticipant", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "mute", "setAudioPlayoutMuted", "(Z)V", "", "Lft8;", "statesToUpdate", "updateMediaOptionsForAll", "(Ljava/util/Map;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "updateMediaOptionsForParticipant", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/media/mute/listener/MediaMuteManagerListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/media/mute/listener/MediaMuteManagerListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "Lru/ok/android/externcalls/sdk/media/mute/internal/listener/MediaMuteListenerManager;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MediaMuteManagerImpl implements MediaMuteManager, MediaMuteCommandExecutor, MediaMuteListenerManager {
    private final MediaMuteCommandExecutor commandExecutor;
    private final MediaMuteListenerManager listenerManager;

    public MediaMuteManagerImpl(MediaMuteCommandExecutor mediaMuteCommandExecutor, MediaMuteListenerManager mediaMuteListenerManager) {
        this.commandExecutor = mediaMuteCommandExecutor;
        this.listenerManager = mediaMuteListenerManager;
    }

    public void addListener(MediaMuteManagerListener mediaMuteManagerListener) {
        this.listenerManager.addListener(mediaMuteManagerListener);
    }

    public gt8 getMediaOptionsForCall(zwd zwd) {
        return this.commandExecutor.getMediaOptionsForCall(zwd);
    }

    public gt8 getMediaOptionsForCurrentUser() {
        return this.commandExecutor.getMediaOptionsForCurrentUser();
    }

    public void removeListener(MediaMuteManagerListener mediaMuteManagerListener) {
        this.listenerManager.removeListener(mediaMuteManagerListener);
    }

    public void requestToEnableMediaForAll(Set<? extends et8> set, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.requestToEnableMediaForAll(set, zwd, function0, function1);
    }

    public void requestToEnableMediaForParticipant(Set<? extends et8> set, ParticipantId participantId, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.requestToEnableMediaForParticipant(set, participantId, zwd, function0, function1);
    }

    public void setAudioPlayoutMuted(boolean z) {
        this.commandExecutor.setAudioPlayoutMuted(z);
    }

    public void updateMediaOptionsForAll(Map<et8, ? extends ft8> map, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.updateMediaOptionsForAll(map, zwd, function0, function1);
    }

    public void updateMediaOptionsForParticipant(Map<et8, ? extends ft8> map, ParticipantId participantId, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.updateMediaOptionsForParticipant(map, participantId, zwd, function0, function1);
    }
}
