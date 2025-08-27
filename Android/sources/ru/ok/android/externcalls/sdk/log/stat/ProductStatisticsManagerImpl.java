package ru.ok.android.externcalls.sdk.log.stat;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.log.stat.StatisticsManager;
import ru.ok.android.externcalls.sdk.log.stat.item.ProductStatItem;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/ProductStatisticsManagerImpl;", "Lru/ok/android/externcalls/sdk/log/stat/BaseStatisticsManagerImpl;", "Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "timeProvider", "Lru/ok/android/externcalls/sdk/log/stat/StatisticsManager$TimeProvider;", "(Lru/ok/android/externcalls/sdk/log/stat/StatisticsManager$TimeProvider;)V", "getTime", "", "timestamp", "log", "", "statItem", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProductStatisticsManagerImpl extends BaseStatisticsManagerImpl<ProductStatItem> {
    private final StatisticsManager.TimeProvider timeProvider;

    public ProductStatisticsManagerImpl(StatisticsManager.TimeProvider timeProvider2) {
        this.timeProvider = timeProvider2;
    }

    public long getTime(long j) {
        return j == -1 ? this.timeProvider.getCurrentTimeMillis() : j;
    }

    public void log(ProductStatItem productStatItem) {
        sendStat(productStatItem);
    }
}
