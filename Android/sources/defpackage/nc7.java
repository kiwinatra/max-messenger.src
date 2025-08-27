package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: nc7  reason: default package */
public enum nc7 {
    SEND_5_MESSAGES("messageSent"),
    CREATE_FOLDER("folderCreated"),
    SEND_AUDIO_MESSAGE("voiceMessageSent"),
    ADD_2_REACTIONS("reactionSet"),
    SEND_3_STICKERS("stickerSent"),
    CREATE_2_GROUP_CHATS("groupChatCreated"),
    MADE_2_PIN("pinMade"),
    PARTICIPATED_IN_CALL("callMade");
    
    public final String a;

    static {
        nc7[] nc7Arr;
        Y = EnumEntriesKt.enumEntries((E[]) nc7Arr);
    }

    /* access modifiers changed from: public */
    nc7(String str) {
        this.a = str;
    }
}
