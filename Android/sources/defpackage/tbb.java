package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: tbb  reason: default package */
public enum tbb {
    APP_INIT("app_init"),
    EVENT_OPEN_CHATS("open_chats_to_render"),
    EVENT_OPEN_CHAT("open_chat_to_render");
    
    public final String a;

    static {
        tbb[] tbbArr;
        w = EnumEntriesKt.enumEntries((E[]) tbbArr);
    }

    /* access modifiers changed from: public */
    tbb(String str) {
        this.a = str;
    }
}
