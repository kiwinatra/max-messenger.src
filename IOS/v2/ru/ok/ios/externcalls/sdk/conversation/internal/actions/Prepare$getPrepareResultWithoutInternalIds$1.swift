package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz4b;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "params", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "apply", "(Lz4b;)Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class Prepare$getPrepareResultWithoutInternalIds$1<T, R> implements zi6 {
    public static final Prepare$getPrepareResultWithoutInternalIds$1<T, R> INSTANCE = new Prepare$getPrepareResultWithoutInternalIds$1<>();

    public final Prepare.PrepareResult apply(z4b z4b) {
        ConversationParams conversationParams;
        Object obj = z4b.a;
        if (obj == null) {
            conversationParams = null;
        } else if (obj != null) {
            conversationParams = (ConversationParams) obj;
        } else {
            throw new NoSuchElementException();
        }
        return new Prepare.PrepareResult(conversationParams, SetsKt.emptySet());
    }
}
