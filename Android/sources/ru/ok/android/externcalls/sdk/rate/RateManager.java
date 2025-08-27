package ru.ok.android.externcalls.sdk.rate;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/RateManager;", "", "rateHints", "", "Lru/ok/android/externcalls/sdk/rate/RateHint;", "getRateHints", "()Ljava/util/List;", "shouldRateConversation", "", "getShouldRateConversation", "()Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RateManager {
    List<RateHint> getRateHints();

    boolean getShouldRateConversation() {
        return !getRateHints().isEmpty();
    }
}
