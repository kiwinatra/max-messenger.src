package ru.ok.android.externcalls.sdk.urlsharing.external.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingListener;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutor;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001J7\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012H\u0001J/\u0010\u0014\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012H\u0001R\u000e\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/UrlSharingManagerImpl;", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingManager;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutor;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManager;", "commandsExecutor", "listenerManager", "(Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutor;Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManager;)V", "addListener", "", "listener", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;", "removeListener", "start", "url", "", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "stop", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UrlSharingManagerImpl implements UrlSharingManager, UrlSharingCommandsExecutor, UrlSharingListenerManager {
    private final UrlSharingCommandsExecutor commandsExecutor;
    private final UrlSharingListenerManager listenerManager;

    public UrlSharingManagerImpl(UrlSharingCommandsExecutor urlSharingCommandsExecutor, UrlSharingListenerManager urlSharingListenerManager) {
        this.commandsExecutor = urlSharingCommandsExecutor;
        this.listenerManager = urlSharingListenerManager;
    }

    public void addListener(UrlSharingListener urlSharingListener) {
        this.listenerManager.addListener(urlSharingListener);
    }

    public void removeListener(UrlSharingListener urlSharingListener) {
        this.listenerManager.removeListener(urlSharingListener);
    }

    public void start(String str, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandsExecutor.start(str, function0, function1);
    }

    public void stop(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandsExecutor.stop(function0, function1);
    }
}
