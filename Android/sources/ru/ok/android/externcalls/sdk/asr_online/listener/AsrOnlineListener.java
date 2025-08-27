package ru.ok.android.externcalls.sdk.asr_online.listener;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineChunk;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;", "", "onAsrAvailableChanged", "", "isAvailable", "", "onAsrChunk", "asrChunk", "Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AsrOnlineListener {
    void onAsrAvailableChanged(boolean z);

    void onAsrChunk(AsrOnlineChunk asrOnlineChunk);
}
