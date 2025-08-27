package ru.ok.android.externcalls.sdk.urlsharing.external;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J:\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH&J2\u0010\u000f\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingManager;", "", "addListener", "", "listener", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;", "removeListener", "start", "url", "", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "stop", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UrlSharingManager {
    static /* synthetic */ void start$default(UrlSharingManager urlSharingManager, String str, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            urlSharingManager.start(str, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
    }

    static /* synthetic */ void stop$default(UrlSharingManager urlSharingManager, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            urlSharingManager.stop(function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
    }

    void addListener(UrlSharingListener urlSharingListener);

    void removeListener(UrlSharingListener urlSharingListener);

    void start(String str, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void stop(Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}
