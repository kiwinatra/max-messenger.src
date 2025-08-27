package ru.ok.android.externcalls.analytics.internal.storage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/storage/FileCacheException;", "", "cause", "(Ljava/lang/Throwable;)V", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FileCacheException extends Throwable {
    public FileCacheException(Throwable th) {
        super("File cache error", th);
    }
}
