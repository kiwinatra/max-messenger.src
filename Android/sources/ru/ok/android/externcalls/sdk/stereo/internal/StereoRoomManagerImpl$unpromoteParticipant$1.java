package ru.ok.android.externcalls.sdk.stereo.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class StereoRoomManagerImpl$unpromoteParticipant$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<Throwable, Unit> $onError;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ ParticipantId $participantId;
    final /* synthetic */ StereoRoomManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomManagerImpl$unpromoteParticipant$1(StereoRoomManagerImpl stereoRoomManagerImpl, ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        super(0);
        this.this$0 = stereoRoomManagerImpl;
        this.$participantId = participantId;
        this.$onSuccess = function0;
        this.$onError = function1;
    }

    public final void invoke() {
        this.this$0.unpromoteParticipantImpl(this.$participantId, this.$onSuccess, this.$onError);
    }
}
