package ru.ok.android.externcalls.sdk.stereo.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "internalId", "", "invoke", "(Lue1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class StereoRoomManagerImpl$promoteParticipant$1 extends Lambda implements Function1<ue1, Unit> {
    final /* synthetic */ Function1<Throwable, Unit> $onError;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ StereoRoomManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomManagerImpl$promoteParticipant$1(StereoRoomManagerImpl stereoRoomManagerImpl, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        super(1);
        this.this$0 = stereoRoomManagerImpl;
        this.$onSuccess = function0;
        this.$onError = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ue1) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(ue1 ue1) {
        this.this$0.commandExecutor.promoteParticipant(new StereoRoomCommandExecutor.PromoteParticipantParams(ue1, true), this.$onSuccess, this.$onError);
    }
}
