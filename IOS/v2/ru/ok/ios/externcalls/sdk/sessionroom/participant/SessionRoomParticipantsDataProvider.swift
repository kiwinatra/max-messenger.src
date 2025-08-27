package ru.ok.android.externcalls.sdk.sessionroom.participant;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\r\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H'¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0012\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H'¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "", "Lzwd;", "roomId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants;", "", "onSuccess", "", "onError", "getRoomParticipants", "(Lzwd;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "getAllInRoomParticipants", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface SessionRoomParticipantsDataProvider {
    void getAllInRoomParticipants(Function1<? super List<SessionRoomParticipants>, Unit> function1, Function1<? super Throwable, Unit> function12);

    void getParticipantRoomId(ParticipantId participantId, Function1<? super zwd, Unit> function1, Function1<? super Throwable, Unit> function12);

    void getRoomParticipants(zwd zwd, Function1<? super SessionRoomParticipants, Unit> function1, Function1<? super Throwable, Unit> function12);
}
