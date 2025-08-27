package ru.ok.android.externcalls.sdk.watch_together;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jd\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0015\u0010\u0014JA\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0016\u0010\u0014JT\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b'\u0010&J\u000f\u0010)\u001a\u00020(H'¢\u0006\u0004\b)\u0010*ø\u0001\u0001\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006+À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "", "Lvt9;", "movieId", "Liu9;", "volume", "Lzt9;", "meta", "", "moveToAdminOnHangup", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "play-yj_a6ag", "(Lvt9;FLzt9;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "play", "stop", "(Lvt9;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Lvt9;FZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "setVolume", "setMuted", "(Lvt9;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lvt9;JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface WatchTogetherPlayer {
    static /* synthetic */ void pause$default(WatchTogetherPlayer watchTogetherPlayer, vt9 vt9, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            watchTogetherPlayer.pause(vt9, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
    }

    /* renamed from: play-yj_a6ag$default  reason: not valid java name */
    static void m1611playyj_a6ag$default(WatchTogetherPlayer watchTogetherPlayer, vt9 vt9, float f, zt9 zt9, boolean z, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                float f2 = iu9.a;
                f = iu9.a;
            }
            float f3 = f;
            zt9 zt92 = (i & 4) != 0 ? null : zt9;
            if ((i & 8) != 0) {
                z = false;
            }
            watchTogetherPlayer.m1613playyj_a6ag(vt9, f3, zt92, z, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? null : function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play-yj_a6ag");
    }

    static /* synthetic */ void resume$default(WatchTogetherPlayer watchTogetherPlayer, vt9 vt9, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            watchTogetherPlayer.resume(vt9, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
    }

    static /* synthetic */ void setMuted$default(WatchTogetherPlayer watchTogetherPlayer, vt9 vt9, boolean z, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            watchTogetherPlayer.setMuted(vt9, z, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMuted");
    }

    static /* synthetic */ void setPosition$default(WatchTogetherPlayer watchTogetherPlayer, vt9 vt9, long j, TimeUnit timeUnit, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            watchTogetherPlayer.setPosition(vt9, j, timeUnit, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPosition");
    }

    /* renamed from: setVolume-F2PwOSs$default  reason: not valid java name */
    static /* synthetic */ void m1612setVolumeF2PwOSs$default(WatchTogetherPlayer watchTogetherPlayer, vt9 vt9, float f, boolean z, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            watchTogetherPlayer.m1614setVolumeF2PwOSs(vt9, f, z, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setVolume-F2PwOSs");
    }

    static /* synthetic */ void stop$default(WatchTogetherPlayer watchTogetherPlayer, vt9 vt9, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            watchTogetherPlayer.stop(vt9, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
    }

    void addListener(WatchTogetherListener watchTogetherListener);

    MovieStates getMovieStates();

    void pause(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    /* renamed from: play-yj_a6ag  reason: not valid java name */
    void m1613playyj_a6ag(vt9 vt9, float f, zt9 zt9, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void removeListener(WatchTogetherListener watchTogetherListener);

    void resume(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void setMuted(vt9 vt9, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void setPosition(vt9 vt9, long j, TimeUnit timeUnit, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    /* renamed from: setVolume-F2PwOSs  reason: not valid java name */
    void m1614setVolumeF2PwOSs(vt9 vt9, float f, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void stop(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}
