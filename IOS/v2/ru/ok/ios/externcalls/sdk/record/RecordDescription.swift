package ru.ok.android.externcalls.sdk.record;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B?\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initiator", "Layc;", "type", "", "start", "movieId", "", "externalMovieId", "externalOwnerId", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Layc;JJLjava/lang/String;Ljava/lang/String;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getInitiator", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Layc;", "getType", "()Layc;", "J", "getStart", "()J", "getMovieId", "Ljava/lang/String;", "getExternalMovieId", "()Ljava/lang/String;", "getExternalOwnerId", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class RecordDescription {
    private final String externalMovieId;
    private final String externalOwnerId;
    private final ParticipantId initiator;
    private final long movieId;
    private final long start;
    private final ayc type;

    public RecordDescription(ParticipantId participantId, ayc ayc, long j, long j2, String str, String str2) {
        this.initiator = participantId;
        this.type = ayc;
        this.start = j;
        this.movieId = j2;
        this.externalMovieId = str;
        this.externalOwnerId = str2;
    }

    public final String getExternalMovieId() {
        return this.externalMovieId;
    }

    public final String getExternalOwnerId() {
        return this.externalOwnerId;
    }

    public final ParticipantId getInitiator() {
        return this.initiator;
    }

    public final long getMovieId() {
        return this.movieId;
    }

    public final long getStart() {
        return this.start;
    }

    public final ayc getType() {
        return this.type;
    }
}
