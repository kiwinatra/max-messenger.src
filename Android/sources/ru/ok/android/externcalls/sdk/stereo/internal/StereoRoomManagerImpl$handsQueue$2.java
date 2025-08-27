package ru.ok.android.externcalls.sdk.stereo.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class StereoRoomManagerImpl$handsQueue$2 extends FunctionReferenceImpl implements Function1<ue1, ParticipantId> {
    public StereoRoomManagerImpl$handsQueue$2(Object obj) {
        super(1, obj, StereoRoomManagerImpl.class, "getExternalId", "getExternalId(Lru/ok/android/webrtc/participant/CallParticipant$ParticipantId;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", 0);
    }

    public final ParticipantId invoke(ue1 ue1) {
        return ((StereoRoomManagerImpl) this.receiver).getExternalId(ue1);
    }
}
