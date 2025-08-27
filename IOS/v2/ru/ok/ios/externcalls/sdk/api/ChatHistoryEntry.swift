package ru.ok.android.externcalls.sdk.api;

import ru.ok.android.externcalls.sdk.ConversationParticipant;

public class ChatHistoryEntry extends q9e {
    public final ConversationParticipant sender;

    public ChatHistoryEntry(String str, boolean z, ConversationParticipant conversationParticipant) {
        super(str, z);
        this.sender = conversationParticipant;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.sender.equals(((ChatHistoryEntry) obj).sender);
    }

    public int hashCode() {
        return this.sender.hashCode() + (super.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChatHistoryEntry{sender=");
        sb.append(this.sender);
        sb.append(", message='");
        sb.append(this.message);
        sb.append("', direct=");
        return tr1.m(sb, this.direct, "}");
    }
}
