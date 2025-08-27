package defpackage;

import android.net.Uri;

/* renamed from: zb8  reason: default package */
public final class zb8 extends j3h {
    public static final zb8 b = new j3h(8);

    public static pa4 n1(long j, Long l, Long l2) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chats?id=" + j + "&type=local");
        if (l2 != null) {
            sb.append("&message_id=" + l2);
        }
        sb.append("&load_mark=" + l);
        return new pa4(sb.toString());
    }

    public static pa4 o1(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chat-list?message_push=" + z);
        if (str != null) {
            sb.append("&folder_id=".concat(str));
        }
        return new pa4(sb.toString());
    }

    public static Uri p1(long j, String str) {
        nfd nfd = kfg.c;
        zqd zqd = new zqd(9);
        zqd.b = ":webapp:root";
        zqd.z(Long.valueOf(j), "bot_id");
        zqd.z("url", "entry_point");
        zqd.z(str, "start_param");
        return zqd.p();
    }

    public static pa4 q1(long j, kfg kfg, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(":webapp:root?bot_id=" + j + "&entry_point=" + kfg.a);
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new pa4(sb.toString());
    }
}
