package ru.ok.android.externcalls.sdk.watch_together.internal.listener;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "", "addListener", "", "listener", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "getMovieStates", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "removeListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface WatchTogetherListenerManager {
    void addListener(WatchTogetherListener watchTogetherListener);

    MovieStates getMovieStates();

    void removeListener(WatchTogetherListener watchTogetherListener);
}
