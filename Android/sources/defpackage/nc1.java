package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* renamed from: nc1  reason: default package */
public final class nc1 {
    public final Lazy a;

    public nc1(Lazy lazy) {
        this.a = lazy;
    }

    public final af1 a(Conversation conversation, ConversationParticipant conversationParticipant, boolean z) {
        bf1 bf1;
        boolean z2 = z;
        ze1 b = f9b.b(conversationParticipant.getExternalId());
        ft8 audioOptionState = conversationParticipant.getAudioOptionState();
        ft8 videoOptionState = conversationParticipant.getVideoOptionState();
        ft8 screenshareOptionState = conversationParticipant.getScreenshareOptionState();
        boolean isAudioEnabled = conversationParticipant.isAudioEnabled();
        boolean booleanValue = (!z2 || !conversationParticipant.isScreenCaptureEnabled()) ? false : ((Boolean) ((kgd) this.a.getValue()).b.getValue()).booleanValue();
        x8g x8g = new x8g(conversationParticipant.isVideoEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(a9g.a).build(), z2);
        x8g x8g2 = new x8g(conversationParticipant.isScreenCaptureEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(a9g.b).build(), false);
        boolean isCallAccepted = conversationParticipant.isCallAccepted();
        long acceptCallEpochMs = conversationParticipant.getAcceptCallEpochMs();
        boolean isConnected = conversationParticipant.isConnected();
        boolean isPrimarySpeaker = conversationParticipant.isPrimarySpeaker();
        boolean isTalking = conversationParticipant.isTalking();
        boolean isHandRaised = conversation.getParticipantStatesManager().isHandRaised(conversationParticipant.getExternalId());
        boolean isCreator = conversationParticipant.isCreator();
        boolean isAdmin = conversationParticipant.isAdmin();
        List<st9> movies = conversationParticipant.getMovies();
        boolean hasRegisteredPeers = conversationParticipant.hasRegisteredPeers();
        boolean z3 = conversation.getParticipantMediaStat(conversationParticipant) != null;
        int ordinal = conversationParticipant.getNetworkStatus().ordinal();
        if (ordinal == 0) {
            bf1 = bf1.a;
        } else if (ordinal == 1) {
            bf1 = bf1.b;
        } else if (ordinal == 2) {
            bf1 = bf1.c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new af1(b, audioOptionState, videoOptionState, screenshareOptionState, isAudioEnabled, booleanValue, x8g, x8g2, isCreator, isAdmin, isConnected, isCallAccepted, acceptCallEpochMs, z, isPrimarySpeaker, isTalking, isHandRaised, hasRegisteredPeers, z3, movies, bf1);
    }
}
