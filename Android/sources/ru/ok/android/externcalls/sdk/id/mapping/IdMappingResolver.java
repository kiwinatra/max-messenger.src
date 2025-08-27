package ru.ok.android.externcalls.sdk.id.mapping;

import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "", "", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "internalIds", "Ljava/lang/Runnable;", "onSuccess", "onError", "", "resolveExternalsByInternalsIds", "(Ljava/util/List;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantExternalId", "Lrk3;", "onIdResolved", "withInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lrk3;Ljava/lang/Runnable;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface IdMappingResolver {
    void resolveExternalsByInternalsIds(List<ue1> list, Runnable runnable, Runnable runnable2);

    void withInternalId(ParticipantId participantId, rk3 rk3, Runnable runnable);
}
