package ru.ok.android.externcalls.sdk.watch_together;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherError;", "", "(Ljava/lang/String;I)V", "LIMIT_EXCEEDED", "MOVIE_NOT_FOUND", "PLAY_NOT_ALLOWED", "CANT_PARSE_MOVIE_TYPE", "PLAY_PARSE_ERROR", "UNKNOWN_ERROR", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum WatchTogetherError {
    LIMIT_EXCEEDED,
    MOVIE_NOT_FOUND,
    PLAY_NOT_ALLOWED,
    CANT_PARSE_MOVIE_TYPE,
    PLAY_PARSE_ERROR,
    UNKNOWN_ERROR;

    static {
        WatchTogetherError[] $values;
        $ENTRIES = EnumEntriesKt.enumEntries((E[]) $values);
    }

    public static EnumEntries<WatchTogetherError> getEntries() {
        return $ENTRIES;
    }
}
