package ru.ok.android.externcalls.sdk.events;

import ru.ok.android.externcalls.sdk.ConversationParticipant;

public interface RecordEventListener {
    void onRecordDataChanged() {
    }

    void onRecordError(String str) {
    }

    void onRecordStarted() {
    }

    void onRecordStopped(ConversationParticipant conversationParticipant) {
    }
}
