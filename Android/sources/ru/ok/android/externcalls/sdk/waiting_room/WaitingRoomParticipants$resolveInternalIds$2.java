package ru.ok.android.externcalls.sdk.waiting_room;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWaitingRoomParticipants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitingRoomParticipants.kt\nru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$resolveInternalIds$2\n*L\n1#1,321:1\n*E\n"})
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class WaitingRoomParticipants$resolveInternalIds$2 implements Runnable {
    final /* synthetic */ Function1<Throwable, Unit> $onError;

    public WaitingRoomParticipants$resolveInternalIds$2(Function1<? super Throwable, Unit> function1) {
        this.$onError = function1;
    }

    public final void run() {
        this.$onError.invoke(new RuntimeException("Can't resolve extenral ids"));
    }
}
