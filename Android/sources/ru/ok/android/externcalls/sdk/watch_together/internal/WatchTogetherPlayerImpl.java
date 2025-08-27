package ru.ok.android.externcalls.sdk.watch_together.internal;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J[\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J>\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u001b\u0010\u0011JF\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJN\u0010#\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b#\u0010$JQ\u0010'\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J>\u0010(\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b(\u0010\u0011J\u0018\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b0\u0010,R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/WatchTogetherPlayerImpl;", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;)V", "Lvt9;", "movieId", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "pause", "(Lvt9;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Liu9;", "volume", "Lzt9;", "meta", "", "moveToAdminOnHangup", "play-yj_a6ag", "(Lvt9;FLzt9;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "play", "resume", "isMuted", "setMuted", "(Lvt9;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lvt9;JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "setVolume-F2PwOSs", "(Lvt9;FZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "setVolume", "stop", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class WatchTogetherPlayerImpl implements WatchTogetherPlayer, WatchTogetherCommandsExecutor, WatchTogetherListenerManager {
    private final WatchTogetherCommandsExecutor commandExecutor;
    private final WatchTogetherListenerManager listenerManager;

    public WatchTogetherPlayerImpl(WatchTogetherCommandsExecutor watchTogetherCommandsExecutor, WatchTogetherListenerManager watchTogetherListenerManager) {
        this.commandExecutor = watchTogetherCommandsExecutor;
        this.listenerManager = watchTogetherListenerManager;
    }

    public void addListener(WatchTogetherListener watchTogetherListener) {
        this.listenerManager.addListener(watchTogetherListener);
    }

    public MovieStates getMovieStates() {
        return this.listenerManager.getMovieStates();
    }

    public void pause(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.pause(vt9, function0, function1);
    }

    /* renamed from: play-yj_a6ag  reason: not valid java name */
    public void m1615playyj_a6ag(vt9 vt9, float f, zt9 zt9, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.m1619playyj_a6ag(vt9, f, zt9, z, function0, function1);
    }

    public void removeListener(WatchTogetherListener watchTogetherListener) {
        this.listenerManager.removeListener(watchTogetherListener);
    }

    public void resume(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.resume(vt9, function0, function1);
    }

    public void setMuted(vt9 vt9, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.setMuted(vt9, z, function0, function1);
    }

    public void setPosition(vt9 vt9, long j, TimeUnit timeUnit, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.setPosition(vt9, j, timeUnit, function0, function1);
    }

    /* renamed from: setVolume-F2PwOSs  reason: not valid java name */
    public void m1616setVolumeF2PwOSs(vt9 vt9, float f, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.m1620setVolumeF2PwOSs(vt9, f, z, function0, function1);
    }

    public void stop(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.stop(vt9, function0, function1);
    }
}
