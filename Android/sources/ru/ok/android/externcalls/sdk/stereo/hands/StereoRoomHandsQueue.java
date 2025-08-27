package ru.ok.android.externcalls.sdk.stereo.hands;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J8\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "", "getQueue", "", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "getTotalCount", "", "hasMore", "", "loadMoreElements", "", "onSuccess", "Lkotlin/Function1;", "onError", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StereoRoomHandsQueue {
    static /* synthetic */ void loadMoreElements$default(StereoRoomHandsQueue stereoRoomHandsQueue, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            stereoRoomHandsQueue.loadMoreElements(function1, function12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreElements");
    }

    Collection<StereoHandQueueItem> getQueue();

    int getTotalCount();

    boolean hasMore();

    void loadMoreElements(Function1<? super StereoRoomHandsQueue, Unit> function1, Function1<? super Throwable, Unit> function12);
}
