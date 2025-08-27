package ru.ok.android.externcalls.sdk.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "it", "Lru/ok/android/externcalls/sdk/api/JoinByLinkResponse;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OkApiService$getJoinConversationParamsExt$1<T, R> implements zi6 {
    public static final OkApiService$getJoinConversationParamsExt$1<T, R> INSTANCE = new OkApiService$getJoinConversationParamsExt$1<>();

    public final ConversationParams apply(JoinByLinkResponse joinByLinkResponse) {
        return joinByLinkResponse.toParams();
    }
}
