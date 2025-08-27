package ru.ok.android.externcalls.sdk.waiting_room;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

@SourceDebugExtension({"SMAP\nWaitingRoomParticipants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitingRoomParticipants.kt\nru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$resolveInternalIds$1\n+ 2 WaitingRoomParticipants.kt\nru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants\n*L\n1#1,321:1\n195#2,9:322\n*E\n"})
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "ru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$resolveInternalIds$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$1 implements Runnable {
    final /* synthetic */ ube $emitter$inlined;
    final /* synthetic */ ube $emitter$inlined$1;
    final /* synthetic */ xn1 $page$inlined;
    final /* synthetic */ List $waitingParticipants;
    final /* synthetic */ WaitingRoomParticipants this$0;

    public WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$1(WaitingRoomParticipants waitingRoomParticipants, List list, ube ube, xn1 xn1, ube ube2) {
        this.this$0 = waitingRoomParticipants;
        this.$waitingParticipants = list;
        this.$emitter$inlined = ube;
        this.$page$inlined = xn1;
        this.$emitter$inlined$1 = ube2;
    }

    public final void run() {
        List access$getResolvedWaitingParticipantIds = this.this$0.getResolvedWaitingParticipantIds(this.$waitingParticipants);
        try {
            ((pbe) this.$emitter$inlined).a(new WaitingRoomParticipants.WaitingParticipantsPage(access$getResolvedWaitingParticipantIds, this.$page$inlined.b));
        } catch (Exception e) {
            ((pbe) this.$emitter$inlined$1).d(new RuntimeException(a81.m("Can't resolve internal ids: ", e.getMessage())));
        }
    }
}
