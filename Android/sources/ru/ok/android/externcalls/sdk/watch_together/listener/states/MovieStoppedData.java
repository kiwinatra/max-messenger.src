package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0014¨\u0006)"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participant", "Lzwd;", "roomId", "Lvt9;", "movieId", "Lau9;", "sourceType", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzwd;Lvt9;Lau9;)V", "component1", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component2", "()Lzwd;", "component3", "()Lvt9;", "component4", "()Lau9;", "copy", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzwd;Lvt9;Lau9;)Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getParticipant", "Lzwd;", "getRoomId", "Lvt9;", "getMovieId", "Lau9;", "getSourceType", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MovieStoppedData {
    private final vt9 movieId;
    private final ParticipantId participant;
    private final zwd roomId;
    private final au9 sourceType;

    public MovieStoppedData(ParticipantId participantId, zwd zwd, vt9 vt9, au9 au9) {
        this.participant = participantId;
        this.roomId = zwd;
        this.movieId = vt9;
        this.sourceType = au9;
    }

    public static /* synthetic */ MovieStoppedData copy$default(MovieStoppedData movieStoppedData, ParticipantId participantId, zwd zwd, vt9 vt9, au9 au9, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieStoppedData.participant;
        }
        if ((i & 2) != 0) {
            zwd = movieStoppedData.roomId;
        }
        if ((i & 4) != 0) {
            vt9 = movieStoppedData.movieId;
        }
        if ((i & 8) != 0) {
            au9 = movieStoppedData.sourceType;
        }
        return movieStoppedData.copy(participantId, zwd, vt9, au9);
    }

    public final ParticipantId component1() {
        return this.participant;
    }

    public final zwd component2() {
        return this.roomId;
    }

    public final vt9 component3() {
        return this.movieId;
    }

    public final au9 component4() {
        return this.sourceType;
    }

    public final MovieStoppedData copy(ParticipantId participantId, zwd zwd, vt9 vt9, au9 au9) {
        return new MovieStoppedData(participantId, zwd, vt9, au9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieStoppedData)) {
            return false;
        }
        MovieStoppedData movieStoppedData = (MovieStoppedData) obj;
        return Intrinsics.areEqual((Object) this.participant, (Object) movieStoppedData.participant) && Intrinsics.areEqual((Object) this.roomId, (Object) movieStoppedData.roomId) && Intrinsics.areEqual((Object) this.movieId, (Object) movieStoppedData.movieId) && this.sourceType == movieStoppedData.sourceType;
    }

    public final vt9 getMovieId() {
        return this.movieId;
    }

    public final ParticipantId getParticipant() {
        return this.participant;
    }

    public final zwd getRoomId() {
        return this.roomId;
    }

    public final au9 getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        return this.sourceType.hashCode() + wzf.i((this.roomId.hashCode() + (this.participant.hashCode() * 31)) * 31, 31, this.movieId.a);
    }

    public String toString() {
        ParticipantId participantId = this.participant;
        zwd zwd = this.roomId;
        vt9 vt9 = this.movieId;
        au9 au9 = this.sourceType;
        return "MovieStoppedData(participant=" + participantId + ", roomId=" + zwd + ", movieId=" + vt9 + ", sourceType=" + au9 + ")";
    }
}
