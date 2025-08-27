package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SessionRoomParticipantsDataProviderImpl$getRoomParticipants$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<SessionRoomParticipants, Unit> $onSuccess;
    final /* synthetic */ Collection<ue1> $participantIds;
    final /* synthetic */ zwd $roomId;
    final /* synthetic */ SessionRoomParticipantsDataProviderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionRoomParticipantsDataProviderImpl$getRoomParticipants$1(Function1<? super SessionRoomParticipants, Unit> function1, zwd zwd, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, Collection<ue1> collection) {
        super(0);
        this.$onSuccess = function1;
        this.$roomId = zwd;
        this.this$0 = sessionRoomParticipantsDataProviderImpl;
        this.$participantIds = collection;
    }

    public final void invoke() {
        Function1<SessionRoomParticipants, Unit> function1 = this.$onSuccess;
        zwd zwd = this.$roomId;
        function1.invoke(new SessionRoomParticipants(zwd, this.this$0.mapInternalIdsToSessionRoomParticipants(zwd, this.$participantIds)));
    }
}
