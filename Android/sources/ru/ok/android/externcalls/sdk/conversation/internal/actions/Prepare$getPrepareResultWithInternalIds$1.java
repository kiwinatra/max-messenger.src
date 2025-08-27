package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\n \u0002*\u0004\u0018\u00010\t0\t2\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\u001e\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u00042\u000e\u0010\b\u001a\n \u0002*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lz4b;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "kotlin.jvm.PlatformType", "params", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "participants", "", "<anonymous parameter 2>", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "apply", "(Lz4b;Ljava/util/Set;Lkotlin/Unit;)Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class Prepare$getPrepareResultWithInternalIds$1<T1, T2, T3, R> implements aj6 {
    public static final Prepare$getPrepareResultWithInternalIds$1<T1, T2, T3, R> INSTANCE = new Prepare$getPrepareResultWithInternalIds$1<>();

    public final Prepare.PrepareResult apply(z4b z4b, Set<ParticipantId> set, Unit unit) {
        ConversationParams conversationParams;
        Object obj = z4b.a;
        if (obj == null) {
            conversationParams = null;
        } else if (obj != null) {
            conversationParams = (ConversationParams) obj;
        } else {
            throw new NoSuchElementException();
        }
        return new Prepare.PrepareResult(conversationParams, CollectionsKt.toSet(CollectionsKt.filterNotNull(set)));
    }
}
