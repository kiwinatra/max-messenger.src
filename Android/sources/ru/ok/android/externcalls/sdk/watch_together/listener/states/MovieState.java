package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B=\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0018\u001a\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJU\u0010\u001e\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010\u0015R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b\u000b\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001b\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieState;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Lyt9;", "position", "", "isPlaying", "Liu9;", "volume", "isMuted", "Lst9;", "movie", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lyt9;ZFZLst9;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component2", "()Lyt9;", "component3", "()Z", "component4-_pGdNCs", "()F", "component4", "component5", "component6", "()Lst9;", "copy-brw6TxU", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lyt9;ZFZLst9;)Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieState;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getParticipantId", "Lyt9;", "getPosition", "Z", "F", "getVolume-_pGdNCs", "Lst9;", "getMovie", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MovieState {
    private final boolean isMuted;
    private final boolean isPlaying;
    private final st9 movie;
    private final ParticipantId participantId;
    private final yt9 position;
    private final float volume;

    public /* synthetic */ MovieState(ParticipantId participantId2, yt9 yt9, boolean z, float f, boolean z2, st9 st9, DefaultConstructorMarker defaultConstructorMarker) {
        this(participantId2, yt9, z, f, z2, st9);
    }

    /* renamed from: copy-brw6TxU$default  reason: not valid java name */
    public static /* synthetic */ MovieState m1621copybrw6TxU$default(MovieState movieState, ParticipantId participantId2, yt9 yt9, boolean z, float f, boolean z2, st9 st9, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId2 = movieState.participantId;
        }
        if ((i & 2) != 0) {
            yt9 = movieState.position;
        }
        yt9 yt92 = yt9;
        if ((i & 4) != 0) {
            z = movieState.isPlaying;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            f = movieState.volume;
        }
        float f2 = f;
        if ((i & 16) != 0) {
            z2 = movieState.isMuted;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            st9 = movieState.movie;
        }
        return movieState.m1623copybrw6TxU(participantId2, yt92, z3, f2, z4, st9);
    }

    public final ParticipantId component1() {
        return this.participantId;
    }

    public final yt9 component2() {
        return this.position;
    }

    public final boolean component3() {
        return this.isPlaying;
    }

    /* renamed from: component4-_pGdNCs  reason: not valid java name */
    public final float m1622component4_pGdNCs() {
        return this.volume;
    }

    public final boolean component5() {
        return this.isMuted;
    }

    public final st9 component6() {
        return this.movie;
    }

    /* renamed from: copy-brw6TxU  reason: not valid java name */
    public final MovieState m1623copybrw6TxU(ParticipantId participantId2, yt9 yt9, boolean z, float f, boolean z2, st9 st9) {
        return new MovieState(participantId2, yt9, z, f, z2, st9, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieState)) {
            return false;
        }
        MovieState movieState = (MovieState) obj;
        if (!Intrinsics.areEqual((Object) this.participantId, (Object) movieState.participantId) || !Intrinsics.areEqual((Object) this.position, (Object) movieState.position) || this.isPlaying != movieState.isPlaying) {
            return false;
        }
        float f = this.volume;
        float f2 = movieState.volume;
        float f3 = iu9.a;
        return Float.compare(f, f2) == 0 && this.isMuted == movieState.isMuted && Intrinsics.areEqual((Object) this.movie, (Object) movieState.movie);
    }

    public final st9 getMovie() {
        return this.movie;
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final yt9 getPosition() {
        return this.position;
    }

    /* renamed from: getVolume-_pGdNCs  reason: not valid java name */
    public final float m1624getVolume_pGdNCs() {
        return this.volume;
    }

    public int hashCode() {
        int e = g63.e((this.position.hashCode() + (this.participantId.hashCode() * 31)) * 31, 31, this.isPlaying);
        float f = this.volume;
        float f2 = iu9.a;
        int e2 = g63.e(g63.c(e, f, 31), 31, this.isMuted);
        st9 st9 = this.movie;
        return e2 + (st9 == null ? 0 : st9.hashCode());
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public String toString() {
        ParticipantId participantId2 = this.participantId;
        yt9 yt9 = this.position;
        boolean z = this.isPlaying;
        float f = this.volume;
        float f2 = iu9.a;
        return "MovieState(participantId=" + participantId2 + ", position=" + yt9 + ", isPlaying=" + z + ", volume=" + ("MovieVolume(value=" + f + ")") + ", isMuted=" + this.isMuted + ", movie=" + this.movie + ")";
    }

    private MovieState(ParticipantId participantId2, yt9 yt9, boolean z, float f, boolean z2, st9 st9) {
        this.participantId = participantId2;
        this.position = yt9;
        this.isPlaying = z;
        this.volume = f;
        this.isMuted = z2;
        this.movie = st9;
    }
}
