package ru.ok.android.externcalls.sdk.watch_together.listener;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "", "onVideoStarted", "", "startInfo", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStartedData;", "onVideoStatesChanged", "states", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "onVideoStopped", "stopInfo", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface WatchTogetherListener {
    void onVideoStarted(MovieStartedData movieStartedData);

    void onVideoStatesChanged(MovieStates movieStates);

    void onVideoStopped(MovieStoppedData movieStoppedData);
}
