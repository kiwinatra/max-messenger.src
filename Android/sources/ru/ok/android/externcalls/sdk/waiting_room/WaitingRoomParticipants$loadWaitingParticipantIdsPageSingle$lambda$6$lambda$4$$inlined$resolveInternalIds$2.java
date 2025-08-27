package ru.ok.android.externcalls.sdk.waiting_room;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWaitingRoomParticipants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitingRoomParticipants.kt\nru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$resolveInternalIds$2\n+ 2 WaitingRoomParticipants.kt\nru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants\n*L\n1#1,321:1\n203#2:322\n*E\n"})
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "ru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$resolveInternalIds$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$2 implements Runnable {
    final /* synthetic */ ube $emitter$inlined;

    public WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$2(ube ube) {
        this.$emitter$inlined = ube;
    }

    public final void run() {
        RuntimeException runtimeException = new RuntimeException("Can't resolve extenral ids");
        ((pbe) this.$emitter$inlined).d(new RuntimeException(a81.m("Can't resolve internal ids: ", runtimeException.getMessage())));
    }
}
