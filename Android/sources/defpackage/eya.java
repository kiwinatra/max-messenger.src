package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;

/* renamed from: eya  reason: default package */
public final class eya extends ty {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ i6d o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eya(WorkDatabase_Impl workDatabase_Impl) {
        super(16, 5);
        this.o = workDatabase_Impl;
    }

    private final a7d z(af6 af6) {
        af6 af62 = af6;
        HashMap hashMap = new HashMap(13);
        hashMap.put("attach_local_id", new v8f("attach_local_id", 0, 1, "TEXT", false, (String) null));
        hashMap.put("prepared_path", new v8f("prepared_path", 0, 1, "TEXT", false, (String) null));
        hashMap.put("file_name", new v8f("file_name", 0, 1, "TEXT", false, (String) null));
        hashMap.put("upload_url", new v8f("upload_url", 0, 1, "TEXT", false, (String) null));
        hashMap.put("upload_progress", new v8f("upload_progress", 0, 1, "REAL", true, (String) null));
        hashMap.put("total_bytes", new v8f("total_bytes", 0, 1, "INTEGER", true, (String) null));
        hashMap.put("upload_status", new v8f("upload_status", 0, 1, "INTEGER", false, (String) null));
        hashMap.put("created_time", new v8f("created_time", 0, 1, "INTEGER", true, (String) null));
        hashMap.put(ClientCookie.PATH_ATTR, new v8f(ClientCookie.PATH_ATTR, 1, 1, "TEXT", true, (String) null));
        hashMap.put("last_modified", new v8f("last_modified", 2, 1, "INTEGER", true, (String) null));
        hashMap.put("upload_type", new v8f("upload_type", 3, 1, "INTEGER", true, (String) null));
        hashMap.put("photo_token", new v8f("photo_token", 0, 1, "TEXT", false, (String) null));
        z8f z8f = new z8f("uploads", hashMap, wzf.m(hashMap, "attach_id", new v8f("attach_id", 0, 1, "INTEGER", false, (String) null), 0), new HashSet(0));
        z8f a = z8f.a(af62, "uploads");
        if (!z8f.equals(a)) {
            return new a7d(false, wzf.k("uploads(ru.ok.tamtam.android.upload.UploadDb).\n Expected:\n", z8f, "\n Found:\n", a));
        }
        HashMap hashMap2 = new HashMap(10);
        v8f v8f = r12;
        v8f v8f2 = new v8f(ClientCookie.PATH_ATTR, 0, 1, "TEXT", false, (String) null);
        hashMap2.put(ClientCookie.PATH_ATTR, v8f);
        hashMap2.put("last_modified", new v8f("last_modified", 0, 1, "INTEGER", true, (String) null));
        hashMap2.put("upload_type", new v8f("upload_type", 0, 1, "INTEGER", false, (String) null));
        hashMap2.put("message_id", new v8f("message_id", 1, 1, "INTEGER", true, (String) null));
        hashMap2.put("chat_id", new v8f("chat_id", 2, 1, "INTEGER", true, (String) null));
        hashMap2.put("attach_id", new v8f("attach_id", 3, 1, "TEXT", true, (String) null));
        hashMap2.put("video_quality", new v8f("video_quality", 0, 1, "INTEGER", false, (String) null));
        hashMap2.put("video_start_trim_position", new v8f("video_start_trim_position", 0, 1, "REAL", false, (String) null));
        hashMap2.put("video_end_trim_position", new v8f("video_end_trim_position", 0, 1, "REAL", false, (String) null));
        Object obj = "video_end_trim_position";
        Object obj2 = "video_start_trim_position";
        Object obj3 = "video_quality";
        z8f z8f2 = new z8f("message_uploads", hashMap2, wzf.m(hashMap2, "mute", new v8f("mute", 0, 1, "INTEGER", false, "false"), 0), new HashSet(0));
        z8f a2 = z8f.a(af62, "message_uploads");
        if (!z8f2.equals(a2)) {
            return new a7d(false, wzf.k("message_uploads(ru.ok.tamtam.android.upload.message.MessageUploadDb).\n Expected:\n", z8f2, "\n Found:\n", a2));
        }
        HashMap hashMap3 = new HashMap(8);
        hashMap3.put("finished", new v8f("finished", 0, 1, "INTEGER", true, (String) null));
        hashMap3.put("prepared_path", new v8f("prepared_path", 0, 1, "TEXT", false, (String) null));
        hashMap3.put("result_path", new v8f("result_path", 0, 1, "TEXT", false, (String) null));
        hashMap3.put("source_uri", new v8f("source_uri", 1, 1, "TEXT", true, (String) null));
        hashMap3.put("quality", new v8f("quality", 2, 1, "INTEGER", true, (String) null));
        hashMap3.put("start_trim_position", new v8f("start_trim_position", 3, 1, "REAL", true, (String) null));
        hashMap3.put("end_trim_position", new v8f("end_trim_position", 4, 1, "REAL", true, (String) null));
        z8f z8f3 = new z8f("video_conversions", hashMap3, wzf.m(hashMap3, "mute", new v8f("mute", 5, 1, "INTEGER", true, "false"), 0), new HashSet(0));
        z8f a3 = z8f.a(af62, "video_conversions");
        if (!z8f3.equals(a3)) {
            return new a7d(false, wzf.k("video_conversions(ru.ok.tamtam.android.video.converter.VideoConversionDb).\n Expected:\n", z8f3, "\n Found:\n", a3));
        }
        HashMap hashMap4 = new HashMap(9);
        hashMap4.put("latitude", new v8f("latitude", 0, 1, "REAL", true, (String) null));
        hashMap4.put("longitude", new v8f("longitude", 0, 1, "REAL", true, (String) null));
        hashMap4.put("altitude", new v8f("altitude", 0, 1, "REAL", true, "0"));
        hashMap4.put("accuracy", new v8f("accuracy", 0, 1, "REAL", true, "0"));
        hashMap4.put("bearing", new v8f("bearing", 0, 1, "REAL", true, "0"));
        hashMap4.put("speed", new v8f("speed", 0, 1, "REAL", true, "0"));
        hashMap4.put("device_id", new v8f("device_id", 0, 1, "TEXT", true, (String) null));
        hashMap4.put("contact_server_id", new v8f("contact_server_id", 1, 1, "INTEGER", true, (String) null));
        String str = "mute";
        Object obj4 = "attach_id";
        z8f z8f4 = new z8f("contact_location", hashMap4, wzf.m(hashMap4, "time", new v8f("time", 2, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a4 = z8f.a(af62, "contact_location");
        if (!z8f4.equals(a4)) {
            return new a7d(false, wzf.k("contact_location(ru.ok.tamtam.android.location.live.model.ContactLocationDb).\n Expected:\n", z8f4, "\n Found:\n", a4));
        }
        HashMap hashMap5 = new HashMap(8);
        hashMap5.put("message_time", new v8f("message_time", 0, 1, "INTEGER", true, (String) null));
        hashMap5.put("live_period", new v8f("live_period", 0, 1, "INTEGER", true, (String) null));
        hashMap5.put("start_time", new v8f("start_time", 0, 1, "INTEGER", true, (String) null));
        hashMap5.put("end_time", new v8f("end_time", 0, 1, "INTEGER", true, (String) null));
        hashMap5.put("device_id", new v8f("device_id", 0, 1, "TEXT", true, (String) null));
        hashMap5.put("contact_server_id", new v8f("contact_server_id", 1, 1, "INTEGER", true, (String) null));
        hashMap5.put("chat_id", new v8f("chat_id", 2, 1, "INTEGER", true, (String) null));
        z8f z8f5 = new z8f("chat_location", hashMap5, wzf.m(hashMap5, "message_id", new v8f("message_id", 3, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a5 = z8f.a(af62, "chat_location");
        if (!z8f5.equals(a5)) {
            return new a7d(false, wzf.k("chat_location(ru.ok.tamtam.android.location.live.model.ChatLocationDb).\n Expected:\n", z8f5, "\n Found:\n", a5));
        }
        HashMap hashMap6 = new HashMap(3);
        hashMap6.put("conversation_id", new v8f("conversation_id", 1, 1, "TEXT", true, (String) null));
        hashMap6.put(ApiProtocol.KEY_JOIN_LINK, new v8f(ApiProtocol.KEY_JOIN_LINK, 0, 1, "TEXT", true, (String) null));
        z8f z8f6 = new z8f("call_links", hashMap6, wzf.m(hashMap6, "started_at", new v8f("started_at", 0, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a6 = z8f.a(af62, "call_links");
        if (!z8f6.equals(a6)) {
            return new a7d(false, wzf.k("call_links(ru.ok.tamtam.android.calls.links.db.CallLinkEntryDb).\n Expected:\n", z8f6, "\n Found:\n", a6));
        }
        HashMap hashMap7 = new HashMap(9);
        hashMap7.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        hashMap7.put("name", new v8f("name", 0, 1, "TEXT", false, (String) null));
        hashMap7.put("icon_url", new v8f("icon_url", 0, 1, "TEXT", false, (String) null));
        hashMap7.put("author_id", new v8f("author_id", 0, 1, "INTEGER", true, (String) null));
        hashMap7.put("created_time", new v8f("created_time", 0, 1, "INTEGER", true, (String) null));
        hashMap7.put("updated_time", new v8f("updated_time", 0, 1, "INTEGER", true, (String) null));
        hashMap7.put("link", new v8f("link", 0, 1, "TEXT", true, (String) null));
        hashMap7.put("stickers", new v8f("stickers", 0, 1, "TEXT", true, (String) null));
        String str2 = "icon_url";
        z8f z8f7 = new z8f("sticker_sets", hashMap7, wzf.m(hashMap7, "draft", new v8f("draft", 0, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a7 = z8f.a(af62, "sticker_sets");
        if (!z8f7.equals(a7)) {
            return new a7d(false, wzf.k("sticker_sets(ru.ok.tamtam.android.stickers.sets.StickerSetDb).\n Expected:\n", z8f7, "\n Found:\n", a7));
        }
        HashMap hashMap8 = new HashMap(2);
        hashMap8.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        z8f z8f8 = new z8f("favorite_sticker_sets", hashMap8, wzf.m(hashMap8, "index", new v8f("index", 0, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a8 = z8f.a(af62, "favorite_sticker_sets");
        if (!z8f8.equals(a8)) {
            return new a7d(false, wzf.k("favorite_sticker_sets(ru.ok.tamtam.android.stickers.sets.favorite.FavoriteStickerSetDb).\n Expected:\n", z8f8, "\n Found:\n", a8));
        }
        HashMap hashMap9 = new HashMap(2);
        hashMap9.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        z8f z8f9 = new z8f("favorite_stickers", hashMap9, wzf.m(hashMap9, "index", new v8f("index", 0, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a9 = z8f.a(af62, "favorite_stickers");
        if (!z8f9.equals(a9)) {
            return new a7d(false, wzf.k("favorite_stickers(ru.ok.tamtam.android.stickers.favorite.FavoriteStickerDb).\n Expected:\n", z8f9, "\n Found:\n", a9));
        }
        HashMap hashMap10 = new HashMap(8);
        hashMap10.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        hashMap10.put("recent_type", new v8f("recent_type", 0, 1, "INTEGER", true, (String) null));
        hashMap10.put("recent_time", new v8f("recent_time", 0, 1, "INTEGER", true, (String) null));
        hashMap10.put("server_id", new v8f("server_id", 0, 1, "INTEGER", true, "0"));
        hashMap10.put("sticker_id", new v8f("sticker_id", 0, 1, "INTEGER", false, (String) null));
        hashMap10.put("emoji", new v8f("emoji", 0, 1, "TEXT", false, (String) null));
        hashMap10.put("gif", new v8f("gif", 0, 1, "BLOB", false, (String) null));
        String str3 = "stickers";
        String str4 = "server_id";
        z8f z8f10 = new z8f("recent", hashMap10, wzf.m(hashMap10, "gif_id", new v8f("gif_id", 0, 1, "INTEGER", false, (String) null), 0), new HashSet(0));
        z8f a10 = z8f.a(af62, "recent");
        if (!z8f10.equals(a10)) {
            return new a7d(false, wzf.k("recent(ru.ok.tamtam.android.stickers.recents.RecentDb).\n Expected:\n", z8f10, "\n Found:\n", a10));
        }
        HashMap hashMap11 = new HashMap(2);
        hashMap11.put("emoji", new v8f("emoji", 1, 1, "TEXT", true, (String) null));
        z8f z8f11 = new z8f("default_emoji", hashMap11, wzf.m(hashMap11, "default_value", new v8f("default_value", 0, 1, "TEXT", true, (String) null), 0), new HashSet(0));
        z8f a11 = z8f.a(af62, "default_emoji");
        if (!z8f11.equals(a11)) {
            return new a7d(false, wzf.k("default_emoji(ru.ok.tamtam.android.stickers.emoji.DefaultEmojiDb).\n Expected:\n", z8f11, "\n Found:\n", a11));
        }
        HashMap hashMap12 = new HashMap(13);
        hashMap12.put("chat_id", new v8f("chat_id", 1, 1, "INTEGER", true, (String) null));
        hashMap12.put("message_id", new v8f("message_id", 2, 1, "INTEGER", true, (String) null));
        hashMap12.put("type", new v8f("type", 0, 1, "TEXT", true, (String) null));
        hashMap12.put("chat_title", new v8f("chat_title", 0, 1, "TEXT", false, (String) null));
        hashMap12.put("sender_user_name", new v8f("sender_user_name", 0, 1, "TEXT", false, (String) null));
        hashMap12.put("sender_user_id", new v8f("sender_user_id", 0, 1, "INTEGER", true, (String) null));
        hashMap12.put("time", new v8f("time", 0, 1, "INTEGER", true, (String) null));
        hashMap12.put("text", new v8f("text", 0, 1, "TEXT", true, (String) null));
        hashMap12.put("push_id", new v8f("push_id", 0, 1, "INTEGER", true, (String) null));
        hashMap12.put("event_key", new v8f("event_key", 0, 1, "TEXT", false, (String) null));
        hashMap12.put("large_image_url", new v8f("large_image_url", 0, 1, "TEXT", false, "NULL"));
        hashMap12.put("fire_m", new v8f("fire_m", 0, 1, "INTEGER", true, "0"));
        String str5 = "type";
        String str6 = "chat_title";
        z8f z8f12 = new z8f("fcm_notifications", hashMap12, wzf.m(hashMap12, "has_any_error", new v8f("has_any_error", 0, 1, "INTEGER", true, "0"), 0), new HashSet(0));
        z8f a12 = z8f.a(af62, "fcm_notifications");
        if (!z8f12.equals(a12)) {
            return new a7d(false, wzf.k("fcm_notifications(ru.ok.tamtam.android.notifications.messages.newpush.fcm.storage.model.FcmNotification).\n Expected:\n", z8f12, "\n Found:\n", a12));
        }
        HashMap hashMap13 = new HashMap(2);
        hashMap13.put("chat_id", new v8f("chat_id", 1, 1, "INTEGER", true, (String) null));
        z8f z8f13 = new z8f("fcm_notifications_history", hashMap13, wzf.m(hashMap13, "last_notify_msg_id", new v8f("last_notify_msg_id", 0, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a13 = z8f.a(af62, "fcm_notifications_history");
        if (!z8f13.equals(a13)) {
            return new a7d(false, wzf.k("fcm_notifications_history(ru.ok.tamtam.android.notifications.messages.newpush.fcm.history.model.FcmNotificationHistoryDb).\n Expected:\n", z8f13, "\n Found:\n", a13));
        }
        HashMap hashMap14 = new HashMap(13);
        hashMap14.put("push_id", new v8f("push_id", 0, 1, "INTEGER", true, (String) null));
        hashMap14.put("chat_id", new v8f("chat_id", 1, 1, "INTEGER", true, (String) null));
        hashMap14.put("msg_id", new v8f("msg_id", 2, 1, "INTEGER", true, (String) null));
        hashMap14.put("analytics_status", new v8f("analytics_status", 0, 1, "INTEGER", true, (String) null));
        hashMap14.put("suid", new v8f("suid", 0, 1, "INTEGER", false, (String) null));
        hashMap14.put("content_length", new v8f("content_length", 0, 1, "INTEGER", true, (String) null));
        hashMap14.put("sent_time", new v8f("sent_time", 0, 1, "INTEGER", false, (String) null));
        hashMap14.put("event_key", new v8f("event_key", 0, 1, "TEXT", false, (String) null));
        hashMap14.put("fcm_sent_time", new v8f("fcm_sent_time", 0, 1, "INTEGER", true, (String) null));
        hashMap14.put("received_time", new v8f("received_time", 0, 1, "INTEGER", true, (String) null));
        hashMap14.put("push_type", new v8f("push_type", 0, 1, "TEXT", true, (String) null));
        hashMap14.put("time", new v8f("time", 0, 1, "INTEGER", true, (String) null));
        z8f z8f14 = new z8f("fcm_notifications_analytics", hashMap14, wzf.m(hashMap14, "created_time", new v8f("created_time", 0, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a14 = z8f.a(af62, "fcm_notifications_analytics");
        if (!z8f14.equals(a14)) {
            return new a7d(false, wzf.k("fcm_notifications_analytics(ru.ok.tamtam.android.notifications.messages.newpush.fcm.analytics.model.FcmAnalyticsEntryDb).\n Expected:\n", z8f14, "\n Found:\n", a14));
        }
        HashMap hashMap15 = new HashMap(2);
        hashMap15.put("chat_id", new v8f("chat_id", 1, 1, "INTEGER", true, (String) null));
        z8f z8f15 = new z8f("notifications_read_marks", hashMap15, wzf.m(hashMap15, "mark", new v8f("mark", 0, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a15 = z8f.a(af62, "notifications_read_marks");
        if (!z8f15.equals(a15)) {
            return new a7d(false, wzf.k("notifications_read_marks(ru.ok.tamtam.android.notifications.messages.newpush.readmarks.model.NotificationReadMarkDb).\n Expected:\n", z8f15, "\n Found:\n", a15));
        }
        HashMap hashMap16 = new HashMap(5);
        hashMap16.put("chat_id", new v8f("chat_id", 2, 1, "INTEGER", true, (String) null));
        hashMap16.put("message_id", new v8f("message_id", 1, 1, "INTEGER", true, (String) null));
        hashMap16.put("time", new v8f("time", 0, 1, "INTEGER", true, (String) null));
        hashMap16.put("fcm", new v8f("fcm", 0, 1, "INTEGER", false, (String) null));
        z8f z8f16 = new z8f("notifications_tracker_messages", hashMap16, wzf.m(hashMap16, "drop_reason", new v8f("drop_reason", 0, 1, "TEXT", false, (String) null), 0), new HashSet(0));
        z8f a16 = z8f.a(af62, "notifications_tracker_messages");
        if (!z8f16.equals(a16)) {
            return new a7d(false, wzf.k("notifications_tracker_messages(ru.ok.tamtam.android.notifications.messages.tracker.storage.model.NotificationsTrackerMessageDb).\n Expected:\n", z8f16, "\n Found:\n", a16));
        }
        HashMap hashMap17 = new HashMap(9);
        hashMap17.put(ClientCookie.PATH_ATTR, new v8f(ClientCookie.PATH_ATTR, 0, 1, "TEXT", true, (String) null));
        hashMap17.put("last_modified", new v8f("last_modified", 0, 1, "INTEGER", true, (String) null));
        hashMap17.put("upload_type", new v8f("upload_type", 0, 1, "INTEGER", true, (String) null));
        hashMap17.put("chat_id", new v8f("chat_id", 1, 1, "INTEGER", true, (String) null));
        hashMap17.put(obj4, new v8f("attach_id", 2, 1, "TEXT", true, (String) null));
        hashMap17.put(obj3, new v8f("video_quality", 0, 1, "INTEGER", false, (String) null));
        hashMap17.put(obj2, new v8f("video_start_trim_position", 0, 1, "REAL", false, (String) null));
        hashMap17.put(obj, new v8f("video_end_trim_position", 0, 1, "REAL", false, (String) null));
        z8f z8f17 = new z8f("draft_uploads", hashMap17, wzf.m(hashMap17, str, new v8f("mute", 0, 1, "INTEGER", false, "false"), 0), new HashSet(0));
        z8f a17 = z8f.a(af62, "draft_uploads");
        if (!z8f17.equals(a17)) {
            return new a7d(false, wzf.k("draft_uploads(ru.ok.tamtam.android.upload.draft.DraftUploadDb).\n Expected:\n", z8f17, "\n Found:\n", a17));
        }
        HashMap hashMap18 = new HashMap(13);
        hashMap18.put("id", new v8f("id", 1, 1, "TEXT", true, (String) null));
        hashMap18.put("title", new v8f("title", 0, 1, "TEXT", true, (String) null));
        hashMap18.put("emoji", new v8f("emoji", 0, 1, "TEXT", false, "NULL"));
        hashMap18.put("order", new v8f("order", 0, 1, "INTEGER", true, (String) null));
        hashMap18.put("filters", new v8f("filters", 0, 1, "TEXT", true, (String) null));
        hashMap18.put("isHiddenForAllFolder", new v8f("isHiddenForAllFolder", 0, 1, "INTEGER", true, (String) null));
        hashMap18.put("hideIfEmpty", new v8f("hideIfEmpty", 0, 1, "INTEGER", true, "0"));
        hashMap18.put("elements", new v8f("elements", 0, 1, "BLOB", false, "NULL"));
        hashMap18.put("creatorId", new v8f("creatorId", 0, 1, "INTEGER", false, "NULL"));
        hashMap18.put("filterSubjects", new v8f("filterSubjects", 0, 1, "BLOB", false, "NULL"));
        hashMap18.put("widgets", new v8f("widgets", 0, 1, "BLOB", false, "NULL"));
        hashMap18.put("options", new v8f("options", 0, 1, "BLOB", false, "NULL"));
        HashSet m = wzf.m(hashMap18, "isRemoved", new v8f("isRemoved", 0, 1, "INTEGER", true, "0"), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new y8f("index_chat_folder_filters", false, Arrays.asList(new String[]{"filters"}), Arrays.asList(new String[]{"ASC"})));
        z8f z8f18 = new z8f("chat_folder", hashMap18, m, hashSet);
        z8f a18 = z8f.a(af62, "chat_folder");
        if (!z8f18.equals(a18)) {
            return new a7d(false, wzf.k("chat_folder(ru.ok.tamtam.android.folders.db.RoomChatFolder).\n Expected:\n", z8f18, "\n Found:\n", a18));
        }
        HashMap hashMap19 = new HashMap(2);
        hashMap19.put(ApiProtocol.PARAM_CHAT_ID, new v8f(ApiProtocol.PARAM_CHAT_ID, 1, 1, "INTEGER", true, (String) null));
        z8f z8f19 = new z8f("folder_and_chats", hashMap19, wzf.m(hashMap19, "folderId", new v8f("folderId", 2, 1, "TEXT", true, (String) null), 0), new HashSet(0));
        z8f a19 = z8f.a(af62, "folder_and_chats");
        if (!z8f19.equals(a19)) {
            return new a7d(false, wzf.k("folder_and_chats(ru.ok.tamtam.android.folders.db.ChatAndFolderCrossRef).\n Expected:\n", z8f19, "\n Found:\n", a19));
        }
        HashMap hashMap20 = new HashMap(2);
        hashMap20.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        z8f z8f20 = new z8f("selected_mentions", hashMap20, wzf.m(hashMap20, "selectedMentionType", new v8f("selectedMentionType", 0, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a20 = z8f.a(af62, "selected_mentions");
        if (!z8f20.equals(a20)) {
            return new a7d(false, wzf.k("selected_mentions(ru.ok.tamtam.mentions.SelectedMention).\n Expected:\n", z8f20, "\n Found:\n", a20));
        }
        HashSet hashSet2 = new HashSet(5);
        hashSet2.add("normalizedTitle");
        hashSet2.add("originalTitle");
        hashSet2.add("normalizedTitleWithoutEmoji");
        hashSet2.add("originalTitleWithoutEmoji");
        hashSet2.add("sortTime");
        String str7 = str6;
        vi6 vi6 = new vi6(str7, hashSet2, "CREATE VIRTUAL TABLE IF NOT EXISTS `chat_title` USING FTS4(`normalizedTitle` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `normalizedTitleWithoutEmoji` TEXT, `originalTitleWithoutEmoji` TEXT, `sortTime` INTEGER NOT NULL)");
        vi6 a21 = vi6.a(af62, str7);
        if (!vi6.equals(a21)) {
            return new a7d(false, "chat_title(ru.ok.tamtam.android.chat.ChatTitle).\n Expected:\n" + vi6 + "\n Found:\n" + a21);
        }
        HashSet hashSet3 = new HashSet(5);
        hashSet3.add("link");
        hashSet3.add("allNormalizedTitles");
        hashSet3.add("allOriginalTitles");
        hashSet3.add("allNormalizedTitlesWithoutEmoji");
        hashSet3.add("allOriginalTitlesWithoutEmoji");
        vi6 vi62 = new vi6("contact_title", hashSet3, "CREATE VIRTUAL TABLE IF NOT EXISTS `contact_title` USING FTS4(`link` TEXT NOT NULL, `allNormalizedTitles` TEXT NOT NULL, `allOriginalTitles` TEXT NOT NULL, `allNormalizedTitlesWithoutEmoji` TEXT, `allOriginalTitlesWithoutEmoji` TEXT)");
        vi6 a22 = vi6.a(af62, "contact_title");
        if (!vi62.equals(a22)) {
            return new a7d(false, "contact_title(ru.ok.tamtam.android.contacts.ContactTitle).\n Expected:\n" + vi62 + "\n Found:\n" + a22);
        }
        HashMap hashMap21 = new HashMap(33);
        hashMap21.put("uuid", new v8f("uuid", 1, 1, "TEXT", true, (String) null));
        hashMap21.put("uniqueWorkName", new v8f("uniqueWorkName", 0, 1, "TEXT", true, (String) null));
        hashMap21.put("existingWorkPolicy", new v8f("existingWorkPolicy", 0, 1, "TEXT", true, (String) null));
        hashMap21.put("tags", new v8f("tags", 0, 1, "TEXT", true, (String) null));
        hashMap21.put("time", new v8f("time", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("state", new v8f("state", 0, 1, "INTEGER", true, "0"));
        hashMap21.put("work_spec_id", new v8f("work_spec_id", 0, 1, "TEXT", true, (String) null));
        hashMap21.put("work_spec_state", new v8f("work_spec_state", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_worker_class_name", new v8f("work_spec_worker_class_name", 0, 1, "TEXT", true, (String) null));
        hashMap21.put("work_spec_input_merger_class_name", new v8f("work_spec_input_merger_class_name", 0, 1, "TEXT", false, (String) null));
        hashMap21.put("work_spec_input", new v8f("work_spec_input", 0, 1, "BLOB", true, (String) null));
        hashMap21.put("work_spec_output", new v8f("work_spec_output", 0, 1, "BLOB", true, (String) null));
        hashMap21.put("work_spec_initial_delay", new v8f("work_spec_initial_delay", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_interval_duration", new v8f("work_spec_interval_duration", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_flex_duration", new v8f("work_spec_flex_duration", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_run_attempt_count", new v8f("work_spec_run_attempt_count", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_backoff_policy", new v8f("work_spec_backoff_policy", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_backoff_delay_duration", new v8f("work_spec_backoff_delay_duration", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_last_enqueue_time", new v8f("work_spec_last_enqueue_time", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_minimum_retention_duration", new v8f("work_spec_minimum_retention_duration", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_schedule_requested_at", new v8f("work_spec_schedule_requested_at", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_run_in_foreground", new v8f("work_spec_run_in_foreground", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_out_of_quota_policy", new v8f("work_spec_out_of_quota_policy", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_period_count", new v8f("work_spec_period_count", 0, 1, "INTEGER", true, "0"));
        hashMap21.put("work_spec_generation", new v8f("work_spec_generation", 0, 1, "INTEGER", true, "0"));
        hashMap21.put("work_spec_required_network_type", new v8f("work_spec_required_network_type", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_requires_charging", new v8f("work_spec_requires_charging", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_requires_device_idle", new v8f("work_spec_requires_device_idle", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_requires_battery_not_low", new v8f("work_spec_requires_battery_not_low", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_requires_storage_not_low", new v8f("work_spec_requires_storage_not_low", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_trigger_content_update_delay", new v8f("work_spec_trigger_content_update_delay", 0, 1, "INTEGER", true, (String) null));
        hashMap21.put("work_spec_trigger_max_content_delay", new v8f("work_spec_trigger_max_content_delay", 0, 1, "INTEGER", true, (String) null));
        HashSet m2 = wzf.m(hashMap21, "work_spec_content_uri_triggers", new v8f("work_spec_content_uri_triggers", 0, 1, "BLOB", true, (String) null), 0);
        HashSet hashSet4 = new HashSet(4);
        hashSet4.add(new y8f("index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration", true, Arrays.asList(new String[]{"uniqueWorkName", "work_spec_interval_duration"}), Arrays.asList(new String[]{"ASC", "ASC"})));
        hashSet4.add(new y8f("index_WorkerQueueItem_work_spec_schedule_requested_at", false, Arrays.asList(new String[]{"work_spec_schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
        hashSet4.add(new y8f("index_WorkerQueueItem_work_spec_last_enqueue_time", false, Arrays.asList(new String[]{"work_spec_last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
        hashSet4.add(new y8f("index_WorkerQueueItem_time", false, Arrays.asList(new String[]{"time"}), Arrays.asList(new String[]{"ASC"})));
        z8f z8f21 = new z8f("WorkerQueueItem", hashMap21, m2, hashSet4);
        z8f a23 = z8f.a(af62, "WorkerQueueItem");
        if (!z8f21.equals(a23)) {
            return new a7d(false, wzf.k("WorkerQueueItem(androidx.work.impl.model.WorkerQueueItem).\n Expected:\n", z8f21, "\n Found:\n", a23));
        }
        HashMap hashMap22 = new HashMap(8);
        hashMap22.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        String str8 = str5;
        hashMap22.put(str8, new v8f("type", 0, 1, "INTEGER", true, (String) null));
        hashMap22.put("status", new v8f("status", 0, 1, "INTEGER", true, (String) null));
        hashMap22.put("fails_count", new v8f("fails_count", 0, 1, "INTEGER", true, (String) null));
        hashMap22.put("depends_request_id", new v8f("depends_request_id", 0, 1, "INTEGER", true, (String) null));
        hashMap22.put("dependency_type", new v8f("dependency_type", 0, 1, "INTEGER", true, (String) null));
        hashMap22.put("data", new v8f("data", 0, 1, "BLOB", true, (String) null));
        z8f z8f22 = new z8f("tasks", hashMap22, wzf.m(hashMap22, "created_time", new v8f("created_time", 0, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a24 = z8f.a(af62, "tasks");
        if (!z8f22.equals(a24)) {
            return new a7d(false, wzf.k("tasks(one.me.sdk.tasks.db.TaskEntity).\n Expected:\n", z8f22, "\n Found:\n", a24));
        }
        HashMap hashMap23 = new HashMap(5);
        hashMap23.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        String str9 = str4;
        hashMap23.put(str9, new v8f("server_id", 0, 1, "INTEGER", true, (String) null));
        hashMap23.put("presence", new v8f("presence", 0, 1, "INTEGER", true, (String) null));
        hashMap23.put("presence_type", new v8f("presence_type", 0, 1, "INTEGER", true, (String) null));
        HashSet m3 = wzf.m(hashMap23, "data", new v8f("data", 0, 1, "BLOB", true, (String) null), 0);
        HashSet hashSet5 = new HashSet(1);
        Object obj5 = "emoji";
        String str10 = "chat_id";
        String str11 = "time";
        hashSet5.add(new y8f("index_contacts_server_id", false, Arrays.asList(new String[]{str9}), Arrays.asList(new String[]{"ASC"})));
        z8f z8f23 = new z8f("contacts", hashMap23, m3, hashSet5);
        z8f a25 = z8f.a(af62, "contacts");
        if (!z8f23.equals(a25)) {
            return new a7d(false, wzf.k("contacts(ru.ok.tamtam.android.contacts.db.ContactEntity).\n Expected:\n", z8f23, "\n Found:\n", a25));
        }
        HashMap hashMap24 = new HashMap(10);
        hashMap24.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        hashMap24.put("phonebook_id", new v8f("phonebook_id", 0, 1, "INTEGER", true, (String) null));
        hashMap24.put("contact_id", new v8f("contact_id", 0, 1, "INTEGER", true, (String) null));
        hashMap24.put("phone", new v8f("phone", 0, 1, "TEXT", true, (String) null));
        hashMap24.put("server_phone", new v8f("server_phone", 0, 1, "INTEGER", true, (String) null));
        hashMap24.put("email", new v8f("email", 0, 1, "TEXT", false, (String) null));
        hashMap24.put("first_name", new v8f("first_name", 0, 1, "TEXT", true, (String) null));
        hashMap24.put("last_name", new v8f("last_name", 0, 1, "TEXT", false, (String) null));
        hashMap24.put("avatar_path", new v8f("avatar_path", 0, 1, "TEXT", false, (String) null));
        HashSet m4 = wzf.m(hashMap24, str8, new v8f("type", 0, 1, "INTEGER", true, (String) null), 0);
        HashSet hashSet6 = new HashSet(3);
        hashSet6.add(new y8f("index_phones_phonebook_id", false, Arrays.asList(new String[]{"phonebook_id"}), Arrays.asList(new String[]{"ASC"})));
        hashSet6.add(new y8f("index_phones_type", false, Arrays.asList(new String[]{str8}), Arrays.asList(new String[]{"ASC"})));
        hashSet6.add(new y8f("index_phones_server_phone", false, Arrays.asList(new String[]{"server_phone"}), Arrays.asList(new String[]{"ASC"})));
        z8f z8f24 = new z8f("phones", hashMap24, m4, hashSet6);
        z8f a26 = z8f.a(af62, "phones");
        if (!z8f24.equals(a26)) {
            return new a7d(false, wzf.k("phones(ru.ok.tamtam.android.phone.PhoneEntity).\n Expected:\n", z8f24, "\n Found:\n", a26));
        }
        HashMap hashMap25 = new HashMap(4);
        hashMap25.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        hashMap25.put("status", new v8f("status", 0, 1, "INTEGER", true, (String) null));
        hashMap25.put("entry", new v8f("entry", 0, 1, "BLOB", true, (String) null));
        z8f z8f25 = new z8f("events", hashMap25, wzf.m(hashMap25, "isCritical", new v8f("isCritical", 0, 1, "INTEGER", true, "0"), 0), new HashSet(0));
        z8f a27 = z8f.a(af62, "events");
        if (!z8f25.equals(a27)) {
            return new a7d(false, wzf.k("events(ru.ok.tamtam.android.stats.StatEntity).\n Expected:\n", z8f25, "\n Found:\n", a27));
        }
        HashMap hashMap26 = new HashMap(15);
        hashMap26.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        hashMap26.put("sticker_id", new v8f("sticker_id", 0, 1, "INTEGER", true, (String) null));
        hashMap26.put("width", new v8f("width", 0, 1, "INTEGER", true, (String) null));
        hashMap26.put("height", new v8f("height", 0, 1, "INTEGER", true, (String) null));
        hashMap26.put("url", new v8f("url", 0, 1, "TEXT", false, (String) null));
        hashMap26.put("update_time", new v8f("update_time", 0, 1, "INTEGER", true, (String) null));
        hashMap26.put("mp4_url", new v8f("mp4_url", 0, 1, "TEXT", false, (String) null));
        hashMap26.put("first_url", new v8f("first_url", 0, 1, "TEXT", false, (String) null));
        hashMap26.put("preview_url", new v8f("preview_url", 0, 1, "TEXT", false, (String) null));
        hashMap26.put("tags", new v8f("tags", 0, 1, "TEXT", true, (String) null));
        hashMap26.put("sticker_type", new v8f("sticker_type", 0, 1, "INTEGER", true, (String) null));
        hashMap26.put("set_id", new v8f("set_id", 0, 1, "INTEGER", true, (String) null));
        hashMap26.put("lottie_url", new v8f("lottie_url", 0, 1, "TEXT", false, (String) null));
        hashMap26.put(MediaStreamTrack.AUDIO_TRACK_KIND, new v8f(MediaStreamTrack.AUDIO_TRACK_KIND, 0, 1, "INTEGER", true, (String) null));
        String str12 = str3;
        z8f z8f26 = new z8f(str12, hashMap26, wzf.m(hashMap26, "author_type", new v8f("author_type", 0, 1, "INTEGER", true, (String) null), 0), new HashSet(0));
        z8f a28 = z8f.a(af62, str12);
        if (!z8f26.equals(a28)) {
            return new a7d(false, wzf.k("stickers(ru.ok.tamtam.android.stickers.db.StickerEntity).\n Expected:\n", z8f26, "\n Found:\n", a28));
        }
        HashMap hashMap27 = new HashMap(6);
        hashMap27.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        hashMap27.put(str9, new v8f("server_id", 0, 1, "INTEGER", true, (String) null));
        hashMap27.put("data", new v8f("data", 0, 1, "BLOB", true, (String) null));
        hashMap27.put("favourite_index", new v8f("favourite_index", 0, 1, "INTEGER", true, (String) null));
        hashMap27.put("sort_time", new v8f("sort_time", 0, 1, "INTEGER", true, (String) null));
        HashSet m5 = wzf.m(hashMap27, "cid", new v8f("cid", 0, 1, "INTEGER", true, "0"), 0);
        HashSet hashSet7 = new HashSet(4);
        String str13 = str8;
        Object obj6 = "status";
        hashSet7.add(new y8f("index_chats_server_id", false, Arrays.asList(new String[]{str9}), Arrays.asList(new String[]{"ASC"})));
        hashSet7.add(new y8f("index_chats_cid", false, Arrays.asList(new String[]{"cid"}), Arrays.asList(new String[]{"ASC"})));
        hashSet7.add(new y8f("index_chats_favourite_index", false, Arrays.asList(new String[]{"favourite_index"}), Arrays.asList(new String[]{"ASC"})));
        hashSet7.add(new y8f("index_chats_favourite_index_sort_time_id", false, Arrays.asList(new String[]{"favourite_index", "sort_time", "id"}), Arrays.asList(new String[]{"ASC", "DESC", "DESC"})));
        z8f z8f27 = new z8f("chats", hashMap27, m5, hashSet7);
        z8f a29 = z8f.a(af62, "chats");
        if (!z8f27.equals(a29)) {
            return new a7d(false, wzf.k("chats(ru.ok.tamtam.android.chat.ChatEntity).\n Expected:\n", z8f27, "\n Found:\n", a29));
        }
        HashMap hashMap28 = new HashMap(36);
        hashMap28.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        hashMap28.put(str9, new v8f("server_id", 0, 1, "INTEGER", true, (String) null));
        String str14 = str11;
        hashMap28.put(str14, new v8f("time", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("update_time", new v8f("update_time", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("sender", new v8f("sender", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("cid", new v8f("cid", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("text", new v8f("text", 0, 1, "TEXT", false, (String) null));
        hashMap28.put("delivery_status", new v8f("delivery_status", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put(obj6, new v8f("status", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("time_local", new v8f("time_local", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("error", new v8f("error", 0, 1, "TEXT", false, (String) null));
        hashMap28.put("localized_error", new v8f("localized_error", 0, 1, "TEXT", false, (String) null));
        hashMap28.put("attaches", new v8f("attaches", 0, 1, "BLOB", false, (String) null));
        hashMap28.put("media_type", new v8f("media_type", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("detect_share", new v8f("detect_share", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("msg_link_type", new v8f("msg_link_type", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("msg_link_id", new v8f("msg_link_id", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("inserted_from_msg_link", new v8f("inserted_from_msg_link", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("msg_link_chat_id", new v8f("msg_link_chat_id", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("msg_link_chat_name", new v8f("msg_link_chat_name", 0, 1, "TEXT", false, (String) null));
        hashMap28.put("msg_link_chat_link", new v8f("msg_link_chat_link", 0, 1, "TEXT", false, (String) null));
        hashMap28.put("msg_link_out_chat_id", new v8f("msg_link_out_chat_id", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("msg_link_out_msg_id", new v8f("msg_link_out_msg_id", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put(str13, new v8f("type", 0, 1, "INTEGER", true, (String) null));
        String str15 = str10;
        hashMap28.put(str15, new v8f("chat_id", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("ttl", new v8f("ttl", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("channel_views", new v8f("channel_views", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("channel_forwards", new v8f("channel_forwards", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("view_time", new v8f("view_time", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("zoom", new v8f("zoom", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("options", new v8f("options", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("live_until", new v8f("live_until", 0, 1, "INTEGER", true, (String) null));
        hashMap28.put("elements", new v8f("elements", 0, 1, "BLOB", true, (String) null));
        hashMap28.put("reactions", new v8f("reactions", 0, 1, "BLOB", false, (String) null));
        hashMap28.put("delayed_attrs_time_to_fire", new v8f("delayed_attrs_time_to_fire", 0, 1, "INTEGER", false, (String) null));
        HashSet m6 = wzf.m(hashMap28, "delayed_attrs_notify_sender", new v8f("delayed_attrs_notify_sender", 0, 1, "INTEGER", false, (String) null), 1);
        m6.add(new w8f("chats", "NO ACTION", "NO ACTION", Arrays.asList(new String[]{str15}), Arrays.asList(new String[]{"id"})));
        HashSet hashSet8 = new HashSet(6);
        Object obj7 = "update_time";
        hashSet8.add(new y8f("index_messages_chat_id", false, Arrays.asList(new String[]{str15}), Arrays.asList(new String[]{"ASC"})));
        hashSet8.add(new y8f("index_messages_cid", false, Arrays.asList(new String[]{"cid"}), Arrays.asList(new String[]{"ASC"})));
        hashSet8.add(new y8f("index_messages_server_id", false, Arrays.asList(new String[]{str9}), Arrays.asList(new String[]{"ASC"})));
        hashSet8.add(new y8f("index_messages_chat_id_time", false, Arrays.asList(new String[]{str15, str14}), Arrays.asList(new String[]{"ASC", "ASC"})));
        hashSet8.add(new y8f("index_messages_chat_id_media_type", false, Arrays.asList(new String[]{str15, "media_type"}), Arrays.asList(new String[]{"ASC", "ASC"})));
        hashSet8.add(new y8f("index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender", false, Arrays.asList(new String[]{"delayed_attrs_time_to_fire", "delayed_attrs_notify_sender"}), Arrays.asList(new String[]{"ASC", "ASC"})));
        z8f z8f28 = new z8f("messages", hashMap28, m6, hashSet8);
        z8f a30 = z8f.a(af62, "messages");
        if (!z8f28.equals(a30)) {
            return new a7d(false, wzf.k("messages(ru.ok.tamtam.android.messages.MessageEntity).\n Expected:\n", z8f28, "\n Found:\n", a30));
        }
        HashMap hashMap29 = new HashMap(7);
        hashMap29.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        Object obj8 = obj7;
        hashMap29.put(obj8, new v8f("update_time", 0, 1, "INTEGER", true, (String) null));
        hashMap29.put(obj5, new v8f("emoji", 0, 1, "TEXT", true, (String) null));
        hashMap29.put("lottie_url", new v8f("lottie_url", 0, 1, "TEXT", false, (String) null));
        hashMap29.put("lottie_play_url", new v8f("lottie_play_url", 0, 1, "TEXT", false, (String) null));
        hashMap29.put("set_id", new v8f("set_id", 0, 1, "INTEGER", false, (String) null));
        String str16 = str2;
        z8f z8f29 = new z8f("animoji", hashMap29, wzf.m(hashMap29, str16, new v8f("icon_url", 0, 1, "TEXT", false, "NULL"), 0), new HashSet(0));
        z8f a31 = z8f.a(af62, "animoji");
        if (!z8f29.equals(a31)) {
            return new a7d(false, wzf.k("animoji(ru.ok.tamtam.android.animoji.db.AnimojiEntity).\n Expected:\n", z8f29, "\n Found:\n", a31));
        }
        HashMap hashMap30 = new HashMap(6);
        hashMap30.put("id", new v8f("id", 1, 1, "INTEGER", true, (String) null));
        hashMap30.put("name", new v8f("name", 0, 1, "TEXT", true, (String) null));
        hashMap30.put(str16, new v8f("icon_url", 0, 1, "TEXT", true, (String) null));
        hashMap30.put("icon_lottie_url", new v8f("icon_lottie_url", 0, 1, "TEXT", false, (String) null));
        hashMap30.put(obj8, new v8f("update_time", 0, 1, "INTEGER", true, (String) null));
        z8f z8f30 = new z8f("animoji_set", hashMap30, wzf.m(hashMap30, "animoji_ids", new v8f("animoji_ids", 0, 1, "TEXT", true, (String) null), 0), new HashSet(0));
        z8f a32 = z8f.a(af62, "animoji_set");
        if (!z8f30.equals(a32)) {
            return new a7d(false, wzf.k("animoji_set(ru.ok.tamtam.android.animoji.db.AnimojiSetEntity).\n Expected:\n", z8f30, "\n Found:\n", a32));
        }
        HashMap hashMap31 = new HashMap(3);
        hashMap31.put("id", new v8f("id", 1, 1, "TEXT", true, (String) null));
        hashMap31.put(obj8, new v8f("update_time", 0, 1, "INTEGER", true, (String) null));
        z8f z8f31 = new z8f("reactions_section", hashMap31, wzf.m(hashMap31, "reactions", new v8f("reactions", 0, 1, "TEXT", true, (String) null), 0), new HashSet(0));
        z8f a33 = z8f.a(af62, "reactions_section");
        if (!z8f31.equals(a33)) {
            return new a7d(false, wzf.k("reactions_section(ru.ok.tamtam.android.animoji.db.ReactionsSectionEntity).\n Expected:\n", z8f31, "\n Found:\n", a33));
        }
        HashMap hashMap32 = new HashMap(2);
        hashMap32.put("user_id", new v8f("user_id", 1, 1, "INTEGER", true, (String) null));
        HashSet m7 = wzf.m(hashMap32, str15, new v8f("chat_id", 0, 1, "INTEGER", true, (String) null), 0);
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new y8f("index_saved_msg_chat_chat_id", true, Arrays.asList(new String[]{str15}), Arrays.asList(new String[]{"ASC"})));
        z8f z8f32 = new z8f("saved_msg_chat", hashMap32, m7, hashSet9);
        z8f a34 = z8f.a(af62, "saved_msg_chat");
        return !z8f32.equals(a34) ? new a7d(false, wzf.k("saved_msg_chat(ru.ok.tamtam.android.chat.SavedMessagesChatEntity).\n Expected:\n", z8f32, "\n Found:\n", a34)) : new a7d(true, (String) null);
    }

    public final void b(af6 af6) {
        switch (this.c) {
            case 0:
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `uploads` (`attach_local_id` TEXT, `prepared_path` TEXT, `file_name` TEXT, `upload_url` TEXT, `upload_progress` REAL NOT NULL, `total_bytes` INTEGER NOT NULL, `upload_status` INTEGER, `created_time` INTEGER NOT NULL, `path` TEXT NOT NULL, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER NOT NULL, `photo_token` TEXT, `attach_id` INTEGER, PRIMARY KEY(`path`, `last_modified`, `upload_type`))", "CREATE TABLE IF NOT EXISTS `message_uploads` (`path` TEXT, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER, `message_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `attach_id` TEXT NOT NULL, `video_quality` INTEGER, `video_start_trim_position` REAL, `video_end_trim_position` REAL, `mute` INTEGER DEFAULT false, PRIMARY KEY(`message_id`, `chat_id`, `attach_id`))", "CREATE TABLE IF NOT EXISTS `video_conversions` (`finished` INTEGER NOT NULL, `prepared_path` TEXT, `result_path` TEXT, `source_uri` TEXT NOT NULL, `quality` INTEGER NOT NULL, `start_trim_position` REAL NOT NULL, `end_trim_position` REAL NOT NULL, `mute` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`source_uri`, `quality`, `start_trim_position`, `end_trim_position`, `mute`))", "CREATE TABLE IF NOT EXISTS `contact_location` (`latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL DEFAULT 0, `accuracy` REAL NOT NULL DEFAULT 0, `bearing` REAL NOT NULL DEFAULT 0, `speed` REAL NOT NULL DEFAULT 0, `device_id` TEXT NOT NULL, `contact_server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`contact_server_id`, `time`))");
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `chat_location` (`message_time` INTEGER NOT NULL, `live_period` INTEGER NOT NULL, `start_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `device_id` TEXT NOT NULL, `contact_server_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, PRIMARY KEY(`contact_server_id`, `chat_id`, `message_id`))", "CREATE TABLE IF NOT EXISTS `call_links` (`conversation_id` TEXT NOT NULL, `join_link` TEXT NOT NULL, `started_at` INTEGER NOT NULL, PRIMARY KEY(`conversation_id`))", "CREATE TABLE IF NOT EXISTS `sticker_sets` (`id` INTEGER NOT NULL, `name` TEXT, `icon_url` TEXT, `author_id` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, `updated_time` INTEGER NOT NULL, `link` TEXT NOT NULL, `stickers` TEXT NOT NULL, `draft` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `favorite_sticker_sets` (`id` INTEGER NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `favorite_stickers` (`id` INTEGER NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `recent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `recent_type` INTEGER NOT NULL, `recent_time` INTEGER NOT NULL, `server_id` INTEGER NOT NULL DEFAULT 0, `sticker_id` INTEGER, `emoji` TEXT, `gif` BLOB, `gif_id` INTEGER)", "CREATE TABLE IF NOT EXISTS `default_emoji` (`emoji` TEXT NOT NULL, `default_value` TEXT NOT NULL, PRIMARY KEY(`emoji`))", "CREATE TABLE IF NOT EXISTS `fcm_notifications` (`chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `chat_title` TEXT, `sender_user_name` TEXT, `sender_user_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `text` TEXT NOT NULL, `push_id` INTEGER NOT NULL, `event_key` TEXT, `large_image_url` TEXT DEFAULT NULL, `fire_m` INTEGER NOT NULL DEFAULT 0, `has_any_error` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`chat_id`, `message_id`))");
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `fcm_notifications_history` (`chat_id` INTEGER NOT NULL, `last_notify_msg_id` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))", "CREATE TABLE IF NOT EXISTS `fcm_notifications_analytics` (`push_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `msg_id` INTEGER NOT NULL, `analytics_status` INTEGER NOT NULL, `suid` INTEGER, `content_length` INTEGER NOT NULL, `sent_time` INTEGER, `event_key` TEXT, `fcm_sent_time` INTEGER NOT NULL, `received_time` INTEGER NOT NULL, `push_type` TEXT NOT NULL, `time` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, PRIMARY KEY(`chat_id`, `msg_id`))", "CREATE TABLE IF NOT EXISTS `notifications_read_marks` (`chat_id` INTEGER NOT NULL, `mark` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))", "CREATE TABLE IF NOT EXISTS `notifications_tracker_messages` (`chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `fcm` INTEGER, `drop_reason` TEXT, PRIMARY KEY(`message_id`, `chat_id`))");
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `draft_uploads` (`path` TEXT NOT NULL, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `attach_id` TEXT NOT NULL, `video_quality` INTEGER, `video_start_trim_position` REAL, `video_end_trim_position` REAL, `mute` INTEGER DEFAULT false, PRIMARY KEY(`chat_id`, `attach_id`))", "CREATE TABLE IF NOT EXISTS `chat_folder` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `emoji` TEXT DEFAULT NULL, `order` INTEGER NOT NULL, `filters` TEXT NOT NULL, `isHiddenForAllFolder` INTEGER NOT NULL, `hideIfEmpty` INTEGER NOT NULL DEFAULT 0, `elements` BLOB DEFAULT NULL, `creatorId` INTEGER DEFAULT NULL, `filterSubjects` BLOB DEFAULT NULL, `widgets` BLOB DEFAULT NULL, `options` BLOB DEFAULT NULL, `isRemoved` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_chat_folder_filters` ON `chat_folder` (`filters`)", "CREATE TABLE IF NOT EXISTS `folder_and_chats` (`chatId` INTEGER NOT NULL, `folderId` TEXT NOT NULL, PRIMARY KEY(`chatId`, `folderId`))");
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `selected_mentions` (`id` INTEGER NOT NULL, `selectedMentionType` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE VIRTUAL TABLE IF NOT EXISTS `chat_title` USING FTS4(`normalizedTitle` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `normalizedTitleWithoutEmoji` TEXT, `originalTitleWithoutEmoji` TEXT, `sortTime` INTEGER NOT NULL)", "CREATE VIRTUAL TABLE IF NOT EXISTS `contact_title` USING FTS4(`link` TEXT NOT NULL, `allNormalizedTitles` TEXT NOT NULL, `allOriginalTitles` TEXT NOT NULL, `allNormalizedTitlesWithoutEmoji` TEXT, `allOriginalTitlesWithoutEmoji` TEXT)", "CREATE TABLE IF NOT EXISTS `WorkerQueueItem` (`uuid` TEXT NOT NULL, `uniqueWorkName` TEXT NOT NULL, `existingWorkPolicy` TEXT NOT NULL, `tags` TEXT NOT NULL, `time` INTEGER NOT NULL, `state` INTEGER NOT NULL DEFAULT 0, `work_spec_id` TEXT NOT NULL, `work_spec_state` INTEGER NOT NULL, `work_spec_worker_class_name` TEXT NOT NULL, `work_spec_input_merger_class_name` TEXT, `work_spec_input` BLOB NOT NULL, `work_spec_output` BLOB NOT NULL, `work_spec_initial_delay` INTEGER NOT NULL, `work_spec_interval_duration` INTEGER NOT NULL, `work_spec_flex_duration` INTEGER NOT NULL, `work_spec_run_attempt_count` INTEGER NOT NULL, `work_spec_backoff_policy` INTEGER NOT NULL, `work_spec_backoff_delay_duration` INTEGER NOT NULL, `work_spec_last_enqueue_time` INTEGER NOT NULL, `work_spec_minimum_retention_duration` INTEGER NOT NULL, `work_spec_schedule_requested_at` INTEGER NOT NULL, `work_spec_run_in_foreground` INTEGER NOT NULL, `work_spec_out_of_quota_policy` INTEGER NOT NULL, `work_spec_period_count` INTEGER NOT NULL DEFAULT 0, `work_spec_generation` INTEGER NOT NULL DEFAULT 0, `work_spec_required_network_type` INTEGER NOT NULL, `work_spec_requires_charging` INTEGER NOT NULL, `work_spec_requires_device_idle` INTEGER NOT NULL, `work_spec_requires_battery_not_low` INTEGER NOT NULL, `work_spec_requires_storage_not_low` INTEGER NOT NULL, `work_spec_trigger_content_update_delay` INTEGER NOT NULL, `work_spec_trigger_max_content_delay` INTEGER NOT NULL, `work_spec_content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`uuid`))");
                wj6.r(af6, "CREATE UNIQUE INDEX IF NOT EXISTS `index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration` ON `WorkerQueueItem` (`uniqueWorkName`, `work_spec_interval_duration`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_schedule_requested_at` ON `WorkerQueueItem` (`work_spec_schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_last_enqueue_time` ON `WorkerQueueItem` (`work_spec_last_enqueue_time`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_time` ON `WorkerQueueItem` (`time`)");
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `tasks` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `status` INTEGER NOT NULL, `fails_count` INTEGER NOT NULL, `depends_request_id` INTEGER NOT NULL, `dependency_type` INTEGER NOT NULL, `data` BLOB NOT NULL, `created_time` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `presence` INTEGER NOT NULL, `presence_type` INTEGER NOT NULL, `data` BLOB NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_contacts_server_id` ON `contacts` (`server_id`)", "CREATE TABLE IF NOT EXISTS `phones` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `phonebook_id` INTEGER NOT NULL, `contact_id` INTEGER NOT NULL, `phone` TEXT NOT NULL, `server_phone` INTEGER NOT NULL, `email` TEXT, `first_name` TEXT NOT NULL, `last_name` TEXT, `avatar_path` TEXT, `type` INTEGER NOT NULL)");
                wj6.r(af6, "CREATE INDEX IF NOT EXISTS `index_phones_phonebook_id` ON `phones` (`phonebook_id`)", "CREATE INDEX IF NOT EXISTS `index_phones_type` ON `phones` (`type`)", "CREATE INDEX IF NOT EXISTS `index_phones_server_phone` ON `phones` (`server_phone`)", "CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `status` INTEGER NOT NULL, `entry` BLOB NOT NULL, `isCritical` INTEGER NOT NULL DEFAULT 0)");
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sticker_id` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `url` TEXT, `update_time` INTEGER NOT NULL, `mp4_url` TEXT, `first_url` TEXT, `preview_url` TEXT, `tags` TEXT NOT NULL, `sticker_type` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `lottie_url` TEXT, `audio` INTEGER NOT NULL, `author_type` INTEGER NOT NULL)", "CREATE TABLE IF NOT EXISTS `chats` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `data` BLOB NOT NULL, `favourite_index` INTEGER NOT NULL, `sort_time` INTEGER NOT NULL, `cid` INTEGER NOT NULL DEFAULT 0)", "CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)", "CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)");
                wj6.r(af6, "CREATE INDEX IF NOT EXISTS `index_chats_favourite_index` ON `chats` (`favourite_index`)", "CREATE INDEX IF NOT EXISTS `index_chats_favourite_index_sort_time_id` ON `chats` (`favourite_index` ASC, `sort_time` DESC, `id` DESC)", "CREATE TABLE IF NOT EXISTS `messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
                wj6.r(af6, "CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)", "CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                wj6.r(af6, "CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)", "CREATE TABLE IF NOT EXISTS `animoji` (`id` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `emoji` TEXT NOT NULL, `lottie_url` TEXT, `lottie_play_url` TEXT, `set_id` INTEGER, `icon_url` TEXT DEFAULT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `animoji_set` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `icon_lottie_url` TEXT, `update_time` INTEGER NOT NULL, `animoji_ids` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `reactions_section` (`id` TEXT NOT NULL, `update_time` INTEGER NOT NULL, `reactions` TEXT NOT NULL, PRIMARY KEY(`id`))");
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `saved_msg_chat` (`user_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, PRIMARY KEY(`user_id`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_saved_msg_chat_chat_id` ON `saved_msg_chat` (`chat_id`)", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9a28e1a697cef90dd4d44b0a70a4fe31')");
                return;
            default:
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                wj6.r(af6, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                wj6.r(af6, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                af6.V("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                af6.V("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                af6.V("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                return;
        }
    }

    public final void e(af6 af6) {
        switch (this.c) {
            case 0:
                wj6.r(af6, "DROP TABLE IF EXISTS `uploads`", "DROP TABLE IF EXISTS `message_uploads`", "DROP TABLE IF EXISTS `video_conversions`", "DROP TABLE IF EXISTS `contact_location`");
                wj6.r(af6, "DROP TABLE IF EXISTS `chat_location`", "DROP TABLE IF EXISTS `call_links`", "DROP TABLE IF EXISTS `sticker_sets`", "DROP TABLE IF EXISTS `favorite_sticker_sets`");
                wj6.r(af6, "DROP TABLE IF EXISTS `favorite_stickers`", "DROP TABLE IF EXISTS `recent`", "DROP TABLE IF EXISTS `default_emoji`", "DROP TABLE IF EXISTS `fcm_notifications`");
                wj6.r(af6, "DROP TABLE IF EXISTS `fcm_notifications_history`", "DROP TABLE IF EXISTS `fcm_notifications_analytics`", "DROP TABLE IF EXISTS `notifications_read_marks`", "DROP TABLE IF EXISTS `notifications_tracker_messages`");
                wj6.r(af6, "DROP TABLE IF EXISTS `draft_uploads`", "DROP TABLE IF EXISTS `chat_folder`", "DROP TABLE IF EXISTS `folder_and_chats`", "DROP TABLE IF EXISTS `selected_mentions`");
                wj6.r(af6, "DROP TABLE IF EXISTS `chat_title`", "DROP TABLE IF EXISTS `contact_title`", "DROP TABLE IF EXISTS `WorkerQueueItem`", "DROP TABLE IF EXISTS `tasks`");
                wj6.r(af6, "DROP TABLE IF EXISTS `contacts`", "DROP TABLE IF EXISTS `phones`", "DROP TABLE IF EXISTS `events`", "DROP TABLE IF EXISTS `stickers`");
                wj6.r(af6, "DROP TABLE IF EXISTS `chats`", "DROP TABLE IF EXISTS `messages`", "DROP TABLE IF EXISTS `animoji`", "DROP TABLE IF EXISTS `animoji_set`");
                af6.V("DROP TABLE IF EXISTS `reactions_section`");
                af6.V("DROP TABLE IF EXISTS `saved_msg_chat`");
                List<o13> list = ((OneMeRoomDatabase_Impl) this.o).g;
                if (list != null) {
                    for (o13 o13 : list) {
                        o13.getClass();
                    }
                    return;
                }
                return;
            default:
                wj6.r(af6, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
                af6.V("DROP TABLE IF EXISTS `WorkName`");
                af6.V("DROP TABLE IF EXISTS `WorkProgress`");
                af6.V("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.o;
                List list2 = workDatabase_Impl.g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((o13) workDatabase_Impl.g.get(i)).getClass();
                    }
                    return;
                }
                return;
        }
    }

    public final void o() {
        switch (this.c) {
            case 0:
                List<o13> list = ((OneMeRoomDatabase_Impl) this.o).g;
                if (list != null) {
                    for (o13 o13 : list) {
                        o13.getClass();
                    }
                    return;
                }
                return;
            default:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.o;
                List list2 = workDatabase_Impl.g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((o13) workDatabase_Impl.g.get(i)).getClass();
                    }
                    return;
                }
                return;
        }
    }

    public final void s(af6 af6) {
        switch (this.c) {
            case 0:
                ((OneMeRoomDatabase_Impl) this.o).a = af6;
                af6.V("PRAGMA foreign_keys = ON");
                ((OneMeRoomDatabase_Impl) this.o).m(af6);
                List<o13> list = ((OneMeRoomDatabase_Impl) this.o).g;
                if (list != null) {
                    for (o13 a : list) {
                        a.a(af6);
                    }
                    return;
                }
                return;
            default:
                ((WorkDatabase_Impl) this.o).a = af6;
                af6.V("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.o).m(af6);
                List list2 = ((WorkDatabase_Impl) this.o).g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((o13) ((WorkDatabase_Impl) this.o).g.get(i)).a(af6);
                    }
                    return;
                }
                return;
        }
    }

    public final void u(af6 af6) {
        switch (this.c) {
            case 0:
                gsg.g(af6);
                return;
            default:
                gsg.g(af6);
                return;
        }
    }

    public final a7d w(af6 af6) {
        af6 af62 = af6;
        switch (this.c) {
            case 0:
                return z(af6);
            default:
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new v8f("work_spec_id", 1, 1, "TEXT", true, (String) null));
                HashSet m = wzf.m(hashMap, "prerequisite_id", new v8f("prerequisite_id", 2, 1, "TEXT", true, (String) null), 2);
                m.add(new w8f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                m.add(new w8f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new y8f("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                hashSet.add(new y8f("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
                z8f z8f = new z8f("Dependency", hashMap, m, hashSet);
                z8f a = z8f.a(af62, "Dependency");
                if (!z8f.equals(a)) {
                    return new a7d(false, wzf.k("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", z8f, "\n Found:\n", a));
                }
                HashMap hashMap2 = new HashMap(27);
                hashMap2.put("id", new v8f("id", 1, 1, "TEXT", true, (String) null));
                hashMap2.put("state", new v8f("state", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("worker_class_name", new v8f("worker_class_name", 0, 1, "TEXT", true, (String) null));
                hashMap2.put("input_merger_class_name", new v8f("input_merger_class_name", 0, 1, "TEXT", false, (String) null));
                hashMap2.put("input", new v8f("input", 0, 1, "BLOB", true, (String) null));
                hashMap2.put("output", new v8f("output", 0, 1, "BLOB", true, (String) null));
                hashMap2.put("initial_delay", new v8f("initial_delay", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("interval_duration", new v8f("interval_duration", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("flex_duration", new v8f("flex_duration", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("run_attempt_count", new v8f("run_attempt_count", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("backoff_policy", new v8f("backoff_policy", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("backoff_delay_duration", new v8f("backoff_delay_duration", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("last_enqueue_time", new v8f("last_enqueue_time", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("minimum_retention_duration", new v8f("minimum_retention_duration", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("schedule_requested_at", new v8f("schedule_requested_at", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("run_in_foreground", new v8f("run_in_foreground", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("out_of_quota_policy", new v8f("out_of_quota_policy", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("period_count", new v8f("period_count", 0, 1, "INTEGER", true, "0"));
                hashMap2.put("generation", new v8f("generation", 0, 1, "INTEGER", true, "0"));
                hashMap2.put("required_network_type", new v8f("required_network_type", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("requires_charging", new v8f("requires_charging", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("requires_device_idle", new v8f("requires_device_idle", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("requires_battery_not_low", new v8f("requires_battery_not_low", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("requires_storage_not_low", new v8f("requires_storage_not_low", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("trigger_content_update_delay", new v8f("trigger_content_update_delay", 0, 1, "INTEGER", true, (String) null));
                hashMap2.put("trigger_max_content_delay", new v8f("trigger_max_content_delay", 0, 1, "INTEGER", true, (String) null));
                HashSet m2 = wzf.m(hashMap2, "content_uri_triggers", new v8f("content_uri_triggers", 0, 1, "BLOB", true, (String) null), 0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new y8f("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
                hashSet2.add(new y8f("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
                z8f z8f2 = new z8f("WorkSpec", hashMap2, m2, hashSet2);
                z8f a2 = z8f.a(af62, "WorkSpec");
                if (!z8f2.equals(a2)) {
                    return new a7d(false, wzf.k("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", z8f2, "\n Found:\n", a2));
                }
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put("tag", new v8f("tag", 1, 1, "TEXT", true, (String) null));
                HashSet m3 = wzf.m(hashMap3, "work_spec_id", new v8f("work_spec_id", 2, 1, "TEXT", true, (String) null), 1);
                m3.add(new w8f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new y8f("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                z8f z8f3 = new z8f("WorkTag", hashMap3, m3, hashSet3);
                z8f a3 = z8f.a(af62, "WorkTag");
                if (!z8f3.equals(a3)) {
                    return new a7d(false, wzf.k("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", z8f3, "\n Found:\n", a3));
                }
                HashMap hashMap4 = new HashMap(3);
                hashMap4.put("work_spec_id", new v8f("work_spec_id", 1, 1, "TEXT", true, (String) null));
                hashMap4.put("generation", new v8f("generation", 2, 1, "INTEGER", true, "0"));
                HashSet m4 = wzf.m(hashMap4, "system_id", new v8f("system_id", 0, 1, "INTEGER", true, (String) null), 1);
                m4.add(new w8f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                z8f z8f4 = new z8f("SystemIdInfo", hashMap4, m4, new HashSet(0));
                z8f a4 = z8f.a(af62, "SystemIdInfo");
                if (!z8f4.equals(a4)) {
                    return new a7d(false, wzf.k("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", z8f4, "\n Found:\n", a4));
                }
                HashMap hashMap5 = new HashMap(2);
                hashMap5.put("name", new v8f("name", 1, 1, "TEXT", true, (String) null));
                HashSet m5 = wzf.m(hashMap5, "work_spec_id", new v8f("work_spec_id", 2, 1, "TEXT", true, (String) null), 1);
                m5.add(new w8f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new y8f("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                z8f z8f5 = new z8f("WorkName", hashMap5, m5, hashSet4);
                z8f a5 = z8f.a(af62, "WorkName");
                if (!z8f5.equals(a5)) {
                    return new a7d(false, wzf.k("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", z8f5, "\n Found:\n", a5));
                }
                HashMap hashMap6 = new HashMap(2);
                hashMap6.put("work_spec_id", new v8f("work_spec_id", 1, 1, "TEXT", true, (String) null));
                HashSet m6 = wzf.m(hashMap6, "progress", new v8f("progress", 0, 1, "BLOB", true, (String) null), 1);
                m6.add(new w8f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                z8f z8f6 = new z8f("WorkProgress", hashMap6, m6, new HashSet(0));
                z8f a6 = z8f.a(af62, "WorkProgress");
                if (!z8f6.equals(a6)) {
                    return new a7d(false, wzf.k("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", z8f6, "\n Found:\n", a6));
                }
                HashMap hashMap7 = new HashMap(2);
                hashMap7.put("key", new v8f("key", 1, 1, "TEXT", true, (String) null));
                z8f z8f7 = new z8f("Preference", hashMap7, wzf.m(hashMap7, "long_value", new v8f("long_value", 0, 1, "INTEGER", false, (String) null), 0), new HashSet(0));
                z8f a7 = z8f.a(af62, "Preference");
                return !z8f7.equals(a7) ? new a7d(false, wzf.k("Preference(androidx.work.impl.model.Preference).\n Expected:\n", z8f7, "\n Found:\n", a7)) : new a7d(true, (String) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eya(OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl) {
        super(12, 5);
        this.o = oneMeRoomDatabase_Impl;
    }
}
