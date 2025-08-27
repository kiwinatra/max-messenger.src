package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: hx4  reason: default package */
public enum hx4 {
    DO_NOT_DISTURB_MODE("do_not_disturb_mode"),
    CHAT_MUTED("chat_muted"),
    SKIPPED_NOTIF_MESSAGE("skipped_notif_message"),
    NOTIFICATIONS_LIMIT("notifications_limit"),
    MESSAGES_LIMIT("messages_limit"),
    NOTIFICATION_CHANNEL_DISABLED("notif_channel_disabled"),
    NOTIFICATION_GROUP_CHANNEL_DISABLED("notif_group_channel_disabled"),
    SYSTEM_APP_NOTIF_DISABLED("system_app_notif_disabled");
    
    public static final cd4 b = null;
    public static final hx4[] c = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v3, types: [cd4, java.lang.Object] */
    static {
        hx4[] hx4Arr;
        v0 = EnumEntriesKt.enumEntries((E[]) hx4Arr);
        b = new Object();
        c = values();
    }

    /* access modifiers changed from: public */
    hx4(String str) {
        this.a = str;
    }
}
