package ru.ok.android.externcalls.sdk.watch_together.internal.commands;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JZ\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0015\u0010\u0014J=\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0016\u0010\u0014JP\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b!\u0010\"ø\u0001\u0001\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "", "Lvt9;", "movieId", "Liu9;", "volume", "Lzt9;", "meta", "", "moveToAdminOnHangup", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "play-yj_a6ag", "(Lvt9;FLzt9;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "play", "stop", "(Lvt9;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Lvt9;FZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "setVolume", "setMuted", "(Lvt9;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lvt9;JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface WatchTogetherCommandsExecutor {
    void pause(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    /* renamed from: play-yj_a6ag  reason: not valid java name */
    void m1619playyj_a6ag(vt9 vt9, float f, zt9 zt9, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void resume(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void setMuted(vt9 vt9, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void setPosition(vt9 vt9, long j, TimeUnit timeUnit, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    /* renamed from: setVolume-F2PwOSs  reason: not valid java name */
    void m1620setVolumeF2PwOSs(vt9 vt9, float f, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void stop(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}
