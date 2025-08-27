package ru.ok.android.externcalls.sdk.asr;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/AsrInfo;", "", "initiator", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "movieId", "", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/lang/Long;)V", "getInitiator", "()Lru/ok/android/externcalls/sdk/ConversationParticipant;", "getMovieId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AsrInfo {
    private final ConversationParticipant initiator;
    private final Long movieId;

    public AsrInfo(ConversationParticipant conversationParticipant, Long l) {
        this.initiator = conversationParticipant;
        this.movieId = l;
    }

    public final ConversationParticipant getInitiator() {
        return this.initiator;
    }

    public final Long getMovieId() {
        return this.movieId;
    }
}
