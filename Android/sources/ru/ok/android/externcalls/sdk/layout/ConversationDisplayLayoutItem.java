package ru.ok.android.externcalls.sdk.layout;

public final class ConversationDisplayLayoutItem {
    private final y4g layout;
    private final ConversationVideoTrackParticipantKey videoTrackParticipantKey;

    public ConversationDisplayLayoutItem(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, y4g y4g) {
        this.videoTrackParticipantKey = conversationVideoTrackParticipantKey;
        this.layout = y4g;
    }

    public y4g getLayout() {
        return this.layout;
    }

    public ConversationVideoTrackParticipantKey getVideoTrackParticipantKey() {
        return this.videoTrackParticipantKey;
    }
}
