package ru.ok.android.externcalls.sdk.log.stat;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.log.stat.item.StatItem;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\bJ\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/StatisticsManager;", "S", "Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;", "", "log", "", "statItem", "(Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;)V", "TimeProvider", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StatisticsManager<S extends StatItem> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/StatisticsManager$TimeProvider;", "", "getCurrentTimeMillis", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface TimeProvider {
        long getCurrentTimeMillis();
    }

    void log(S s);
}
