package ru.ok.android.externcalls.sdk.stereo.hands;

import java.time.Clock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@SourceDebugExtension({"SMAP\nStereoRoomHandsQueueImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoRoomHandsQueueImpl.kt\nru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl$onHandUp$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1855#2,2:103\n1855#2,2:105\n*S KotlinDebug\n*F\n+ 1 StereoRoomHandsQueueImpl.kt\nru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl$onHandUp$1\n*L\n61#1:103,2\n71#1:105,2\n*E\n"})
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class StereoRoomHandsQueueImpl$onHandUp$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ un1 $event;
    final /* synthetic */ StereoRoomHandsQueueImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomHandsQueueImpl$onHandUp$1(un1 un1, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
        super(0);
        this.$event = un1;
        this.this$0 = stereoRoomHandsQueueImpl;
    }

    public final void invoke() {
        StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl = this.this$0;
        for (ue1 invoke : this.$event.c) {
            ParticipantId participantId = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke(invoke);
            if (participantId != null) {
                ((sjf) stereoRoomHandsQueueImpl.timeProvider).getClass();
                stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId, Clock.systemUTC().millis()), false);
            }
        }
        StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl2 = this.this$0;
        for (ue1 invoke2 : this.$event.b) {
            ParticipantId participantId2 = (ParticipantId) stereoRoomHandsQueueImpl2.getExternalId.invoke(invoke2);
            if (participantId2 != null) {
                ((sjf) stereoRoomHandsQueueImpl2.timeProvider).getClass();
                stereoRoomHandsQueueImpl2.participantHandChanged(new StereoHandQueueItem(participantId2, Clock.systemUTC().millis()), true);
            }
        }
        this.this$0.totalCount = this.$event.a;
        this.this$0.notifyHandsStatusChanged();
    }
}
