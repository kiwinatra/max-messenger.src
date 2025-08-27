package ru.ok.android.externcalls.sdk.stereo.hands;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class StereoRoomHandsQueueImpl$loadMoreElements$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<StereoRoomHandsQueue, Unit> $onSuccess;
    final /* synthetic */ StereoRoomHandsQueueImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomHandsQueueImpl$loadMoreElements$1(Function1<? super StereoRoomHandsQueue, Unit> function1, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
        super(0);
        this.$onSuccess = function1;
        this.this$0 = stereoRoomHandsQueueImpl;
    }

    public final void invoke() {
        Function1<StereoRoomHandsQueue, Unit> function1 = this.$onSuccess;
        if (function1 != null) {
            function1.invoke(this.this$0);
        }
    }
}
