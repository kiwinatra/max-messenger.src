package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SessionRoomParticipantsDataProviderImpl$getAllInRoomParticipants$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<List<SessionRoomParticipants>, Unit> $onSuccess;
    final /* synthetic */ Set<ywd> $roomIds;
    final /* synthetic */ SessionRoomParticipantsDataProviderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionRoomParticipantsDataProviderImpl$getAllInRoomParticipants$1(Set<ywd> set, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, Function1<? super List<SessionRoomParticipants>, Unit> function1) {
        super(0);
        this.$roomIds = set;
        this.this$0 = sessionRoomParticipantsDataProviderImpl;
        this.$onSuccess = function1;
    }

    public final void invoke() {
        ArrayList arrayList = new ArrayList();
        for (ywd next : this.$roomIds) {
            SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl = this.this$0;
            arrayList.add(new SessionRoomParticipants(next, sessionRoomParticipantsDataProviderImpl.mapInternalIdsToSessionRoomParticipants(next, sessionRoomParticipantsDataProviderImpl.getRoomParticipantIds(next))));
        }
        this.$onSuccess.invoke(arrayList);
    }
}
