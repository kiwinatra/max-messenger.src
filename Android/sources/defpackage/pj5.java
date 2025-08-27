package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: pj5  reason: default package */
public enum pj5 {
    MESSAGE("Message"),
    CHAT_MESSAGE("ChatMessage"),
    CHANNEL_MESSAGE("ChatMessage-channel"),
    CHAT_SYSTEM_MESSAGE("ChatSystemMessage"),
    CHAT_REPLY("ChatReply"),
    GROUP_CHAT("GroupChat"),
    SCHEDULED("Scheduled"),
    UNKNOWN("Unknown");
    
    public static final ejd b = null;
    public static final pj5[] c = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, ejd] */
    static {
        pj5[] pj5Arr;
        v0 = EnumEntriesKt.enumEntries((E[]) pj5Arr);
        b = new Object();
        c = values();
    }

    /* access modifiers changed from: public */
    pj5(String str) {
        this.a = str;
    }
}
