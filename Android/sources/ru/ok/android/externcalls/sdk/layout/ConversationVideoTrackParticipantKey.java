package ru.ok.android.externcalls.sdk.layout;

import java.util.Objects;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

public class ConversationVideoTrackParticipantKey {
    private final vt9 movieId;
    private final ParticipantId participantId;
    private final a9g type;

    public static class Builder {
        /* access modifiers changed from: private */
        public vt9 movieId;
        /* access modifiers changed from: private */
        public ParticipantId participantId;
        /* access modifiers changed from: private */
        public a9g type = a9g.a;

        public ConversationVideoTrackParticipantKey build() {
            Objects.requireNonNull(this.participantId);
            Objects.requireNonNull(this.type);
            return new ConversationVideoTrackParticipantKey(this, 0);
        }

        public Builder setMovieId(vt9 vt9) {
            this.movieId = vt9;
            return this;
        }

        public Builder setParticipantId(ParticipantId participantId2) {
            this.participantId = participantId2;
            return this;
        }

        public Builder setType(a9g a9g) {
            this.type = a9g;
            return this;
        }
    }

    public /* synthetic */ ConversationVideoTrackParticipantKey(Builder builder, int i) {
        this(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = (ConversationVideoTrackParticipantKey) obj;
        return this.participantId.equals(conversationVideoTrackParticipantKey.participantId) && this.type == conversationVideoTrackParticipantKey.type && Objects.equals(this.movieId, conversationVideoTrackParticipantKey.movieId);
    }

    public vt9 getMovieId() {
        return this.movieId;
    }

    public ParticipantId getParticipantId() {
        return this.participantId;
    }

    public a9g getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.participantId, this.type, this.movieId});
    }

    public String toString() {
        return "ConversationVideoTrackParticipantKey{participantId=" + this.participantId + ", type=" + this.type + ", movieId=" + this.movieId + '}';
    }

    private ConversationVideoTrackParticipantKey(Builder builder) {
        this.participantId = builder.participantId;
        this.type = builder.type;
        this.movieId = builder.movieId;
    }
}
