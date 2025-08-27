package ru.ok.android.externcalls.sdk.stereo.internal.listener;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomListenerManager;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;", "()V", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "addListener", "", "listener", "onHandStatusChange", "event", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$HandStatusUpdated;", "onListenersChanged", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$ListenersUpdated;", "onOwnPromotionChanged", "isPromoted", "", "onPromotionRequestUpdated", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$PromotionRequestUpdated;", "removeListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStereoRoomListenerManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoRoomListenerManagerImpl.kt\nru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1855#2,2:33\n1855#2,2:35\n1855#2,2:37\n1855#2,2:39\n*S KotlinDebug\n*F\n+ 1 StereoRoomListenerManagerImpl.kt\nru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl\n*L\n18#1:33,2\n22#1:35,2\n26#1:37,2\n30#1:39,2\n*E\n"})
public final class StereoRoomListenerManagerImpl implements StereoRoomListenerManager, StereoRoomManagerListener {
    private final CopyOnWriteArrayList<StereoRoomManagerListener> listeners = new CopyOnWriteArrayList<>();

    public void addListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listeners.add(stereoRoomManagerListener);
    }

    public void onHandStatusChange(StereoRoomManagerListener.HandStatusUpdated handStatusUpdated) {
        for (StereoRoomManagerListener onHandStatusChange : this.listeners) {
            onHandStatusChange.onHandStatusChange(handStatusUpdated);
        }
    }

    public void onListenersChanged(StereoRoomManagerListener.ListenersUpdated listenersUpdated) {
        for (StereoRoomManagerListener onListenersChanged : this.listeners) {
            onListenersChanged.onListenersChanged(listenersUpdated);
        }
    }

    public void onOwnPromotionChanged(boolean z) {
        for (StereoRoomManagerListener onOwnPromotionChanged : this.listeners) {
            onOwnPromotionChanged.onOwnPromotionChanged(z);
        }
    }

    public void onPromotionRequestUpdated(StereoRoomManagerListener.PromotionRequestUpdated promotionRequestUpdated) {
        for (StereoRoomManagerListener onPromotionRequestUpdated : this.listeners) {
            onPromotionRequestUpdated.onPromotionRequestUpdated(promotionRequestUpdated);
        }
    }

    public void removeListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listeners.remove(stereoRoomManagerListener);
    }
}
