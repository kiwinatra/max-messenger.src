package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: li  reason: default package */
public final class li extends r75 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li(i6d i6d, int i) {
        super(i6d);
        this.o = i;
    }

    public final String F() {
        switch (this.o) {
            case 0:
                return "INSERT OR REPLACE INTO `animoji` (`id`,`update_time`,`emoji`,`lottie_url`,`lottie_play_url`,`set_id`,`icon_url`) VALUES (?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `animoji_set` (`id`,`name`,`icon_url`,`icon_lottie_url`,`update_time`,`animoji_ids`) VALUES (?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `call_links` (`conversation_id`,`join_link`,`started_at`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `chat_location` (`message_time`,`live_period`,`start_time`,`end_time`,`device_id`,`contact_server_id`,`chat_id`,`message_id`) VALUES (?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `contact_location` (`latitude`,`longitude`,`altitude`,`accuracy`,`bearing`,`speed`,`device_id`,`contact_server_id`,`time`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `contacts` (`id`,`server_id`,`presence`,`presence_type`,`data`) VALUES (nullif(?, 0),?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `default_emoji` (`emoji`,`default_value`) VALUES (?,?)";
            case 7:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `draft_uploads` (`path`,`last_modified`,`upload_type`,`chat_id`,`attach_id`,`video_quality`,`video_start_trim_position`,`video_end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `favorite_sticker_sets` (`id`,`index`) VALUES (?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `favorite_stickers` (`id`,`index`) VALUES (?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `fcm_notifications_analytics` (`push_id`,`chat_id`,`msg_id`,`analytics_status`,`suid`,`content_length`,`sent_time`,`event_key`,`fcm_sent_time`,`received_time`,`push_type`,`time`,`created_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `fcm_notifications_history` (`chat_id`,`last_notify_msg_id`) VALUES (?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `message_uploads` (`path`,`last_modified`,`upload_type`,`message_id`,`chat_id`,`attach_id`,`video_quality`,`video_start_trim_position`,`video_end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return "INSERT OR REPLACE INTO `fcm_notifications` (`chat_id`,`message_id`,`type`,`chat_title`,`sender_user_name`,`sender_user_id`,`time`,`text`,`push_id`,`event_key`,`large_image_url`,`fire_m`,`has_any_error`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return "INSERT OR REPLACE INTO `notifications_read_marks` (`chat_id`,`mark`) VALUES (?,?)";
            case 16:
                return "INSERT OR IGNORE INTO `notifications_tracker_messages` (`chat_id`,`message_id`,`time`,`fcm`,`drop_reason`) VALUES (?,?,?,?,?)";
            case LangUtils.HASH_SEED /*17*/:
                return "INSERT OR ABORT INTO `phones` (`id`,`phonebook_id`,`contact_id`,`phone`,`server_phone`,`email`,`first_name`,`last_name`,`avatar_path`,`type`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `reactions_section` (`id`,`update_time`,`reactions`) VALUES (?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `recent` (`id`,`recent_type`,`recent_time`,`server_id`,`sticker_id`,`emoji`,`gif`,`gif_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `chat_folder` (`id`,`title`,`emoji`,`order`,`filters`,`isHiddenForAllFolder`,`hideIfEmpty`,`elements`,`creatorId`,`filterSubjects`,`widgets`,`options`,`isRemoved`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `folder_and_chats` (`chatId`,`folderId`) VALUES (?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `selected_mentions` (`id`,`selectedMentionType`) VALUES (?,?)";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return "INSERT OR ABORT INTO `events` (`id`,`status`,`entry`,`isCritical`) VALUES (nullif(?, 0),?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `sticker_sets` (`id`,`name`,`icon_url`,`author_id`,`created_time`,`updated_time`,`link`,`stickers`,`draft`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `stickers` (`id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `uploads` (`attach_local_id`,`prepared_path`,`file_name`,`upload_url`,`upload_progress`,`total_bytes`,`upload_status`,`created_time`,`path`,`last_modified`,`upload_type`,`photo_token`,`attach_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `video_conversions` (`finished`,`prepared_path`,`result_path`,`source_uri`,`quality`,`start_trim_position`,`end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v123 */
    /* JADX WARNING: type inference failed for: r1v124 */
    /* JADX WARNING: type inference failed for: r1v125 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(defpackage.gf6 r17, java.lang.Object r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = 0
            r2 = 12
            r3 = 13
            r4 = 11
            r5 = 10
            r6 = 9
            r7 = 8
            r8 = 7
            r9 = 6
            r10 = 5
            r11 = 4
            r12 = 3
            r13 = 2
            r14 = 1
            r15 = r16
            int r15 = r15.o
            switch(r15) {
                case 0: goto L_0x078d;
                case 1: goto L_0x0749;
                case 2: goto L_0x0729;
                case 3: goto L_0x06f4;
                case 4: goto L_0x06b7;
                case 5: goto L_0x068d;
                case 6: goto L_0x0672;
                case 7: goto L_0x0657;
                case 8: goto L_0x05fd;
                case 9: goto L_0x05ee;
                case 10: goto L_0x05df;
                case 11: goto L_0x0566;
                case 12: goto L_0x0557;
                case 13: goto L_0x04f2;
                case 14: goto L_0x0476;
                case 15: goto L_0x0467;
                case 16: goto L_0x0428;
                case 17: goto L_0x03cd;
                case 18: goto L_0x03ae;
                case 19: goto L_0x0385;
                case 20: goto L_0x032c;
                case 21: goto L_0x0274;
                case 22: goto L_0x025f;
                case 23: goto L_0x024b;
                case 24: goto L_0x01f1;
                case 25: goto L_0x019d;
                case 26: goto L_0x0103;
                case 27: goto L_0x00e7;
                case 28: goto L_0x0065;
                default: goto L_0x001d;
            }
        L_0x001d:
            r1 = r18
            m4g r1 = (defpackage.m4g) r1
            boolean r2 = r1.b
            long r2 = (long) r2
            r0.k(r14, r2)
            java.lang.String r2 = r1.c
            if (r2 != 0) goto L_0x002f
            r0.X(r13)
            goto L_0x0032
        L_0x002f:
            r0.h(r13, r2)
        L_0x0032:
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x003a
            r0.X(r12)
            goto L_0x003d
        L_0x003a:
            r0.h(r12, r2)
        L_0x003d:
            l4g r1 = r1.a
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x0047
            r0.X(r11)
            goto L_0x004a
        L_0x0047:
            r0.h(r11, r2)
        L_0x004a:
            qac r2 = r1.b
            int r2 = r2.b
            long r2 = (long) r2
            r0.k(r10, r2)
            float r2 = r1.c
            double r2 = (double) r2
            r0.T(r2, r9)
            float r2 = r1.d
            double r2 = (double) r2
            r0.T(r2, r8)
            boolean r1 = r1.e
            long r1 = (long) r1
            r0.k(r7, r1)
            return
        L_0x0065:
            r1 = r18
            lxf r1 = (defpackage.lxf) r1
            java.lang.String r15 = r1.b
            if (r15 != 0) goto L_0x0071
            r0.X(r14)
            goto L_0x0074
        L_0x0071:
            r0.h(r14, r15)
        L_0x0074:
            java.lang.String r14 = r1.c
            if (r14 != 0) goto L_0x007c
            r0.X(r13)
            goto L_0x007f
        L_0x007c:
            r0.h(r13, r14)
        L_0x007f:
            java.lang.String r13 = r1.d
            if (r13 != 0) goto L_0x0087
            r0.X(r12)
            goto L_0x008a
        L_0x0087:
            r0.h(r12, r13)
        L_0x008a:
            java.lang.String r12 = r1.e
            if (r12 != 0) goto L_0x0092
            r0.X(r11)
            goto L_0x0095
        L_0x0092:
            r0.h(r11, r12)
        L_0x0095:
            float r11 = r1.f
            double r11 = (double) r11
            r0.T(r11, r10)
            long r10 = r1.g
            r0.k(r9, r10)
            wyf r9 = r1.h
            int r9 = r9.a
            long r9 = (long) r9
            r0.k(r8, r9)
            long r8 = r1.j
            r0.k(r7, r8)
            no5 r7 = r1.a
            java.lang.Object r8 = r7.c
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x00b9
            r0.X(r6)
            goto L_0x00bc
        L_0x00b9:
            r0.h(r6, r8)
        L_0x00bc:
            long r8 = r7.a
            r0.k(r5, r8)
            java.lang.Object r5 = r7.b
            xyf r5 = (defpackage.xyf) r5
            int r5 = r5.a
            long r5 = (long) r5
            r0.k(r4, r5)
            uyf r1 = r1.i
            if (r1 == 0) goto L_0x00e0
            java.lang.String r4 = r1.a
            if (r4 != 0) goto L_0x00d7
            r0.X(r2)
            goto L_0x00da
        L_0x00d7:
            r0.h(r2, r4)
        L_0x00da:
            long r1 = r1.b
            r0.k(r3, r1)
            goto L_0x00e6
        L_0x00e0:
            r0.X(r2)
            r0.X(r3)
        L_0x00e6:
            return
        L_0x00e7:
            r1 = r18
            l7f r1 = (defpackage.l7f) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x00f3
            r0.X(r14)
            goto L_0x00f6
        L_0x00f3:
            r0.h(r14, r2)
        L_0x00f6:
            int r2 = r1.b
            long r2 = (long) r2
            r0.k(r13, r2)
            int r1 = r1.c
            long r1 = (long) r1
            r0.k(r12, r1)
            return
        L_0x0103:
            r1 = r18
            soe r1 = (defpackage.soe) r1
            long r2 = r1.a
            r0.k(r14, r2)
            long r2 = r1.b
            r0.k(r13, r2)
            int r2 = r1.c
            long r2 = (long) r2
            r0.k(r12, r2)
            int r2 = r1.d
            long r2 = (long) r2
            r0.k(r11, r2)
            java.lang.String r2 = r1.e
            if (r2 != 0) goto L_0x0125
            r0.X(r10)
            goto L_0x0128
        L_0x0125:
            r0.h(r10, r2)
        L_0x0128:
            long r2 = r1.f
            r0.k(r9, r2)
            java.lang.String r2 = r1.g
            if (r2 != 0) goto L_0x0135
            r0.X(r8)
            goto L_0x0138
        L_0x0135:
            r0.h(r8, r2)
        L_0x0138:
            java.lang.String r2 = r1.h
            if (r2 != 0) goto L_0x0140
            r0.X(r7)
            goto L_0x0143
        L_0x0140:
            r0.h(r7, r2)
        L_0x0143:
            java.lang.String r2 = r1.i
            if (r2 != 0) goto L_0x014b
            r0.X(r6)
            goto L_0x014e
        L_0x014b:
            r0.h(r6, r2)
        L_0x014e:
            java.util.List r2 = r1.j
            r6 = r2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r10 = 0
            r11 = 0
            java.lang.String r7 = ","
            r8 = 0
            r9 = 0
            r12 = 62
            java.lang.String r2 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r6, r7, r8, r9, 0, r10, r11, r12, (java.lang.Object) null)
            if (r2 != 0) goto L_0x0165
            r0.X(r5)
            goto L_0x0168
        L_0x0165:
            r0.h(r5, r2)
        L_0x0168:
            int r2 = r1.k
            int r2 = defpackage.rae.f(r2)
            long r2 = (long) r2
            r0.k(r4, r2)
            long r2 = r1.l
            r4 = 12
            r0.k(r4, r2)
            java.lang.String r2 = r1.m
            if (r2 != 0) goto L_0x0183
            r3 = 13
            r0.X(r3)
            goto L_0x0188
        L_0x0183:
            r3 = 13
            r0.h(r3, r2)
        L_0x0188:
            boolean r2 = r1.n
            long r2 = (long) r2
            r4 = 14
            r0.k(r4, r2)
            int r1 = r1.o
            int r1 = defpackage.rae.d(r1)
            r2 = 15
            long r3 = (long) r1
            r0.k(r2, r3)
            return
        L_0x019d:
            r1 = r18
            gqe r1 = (defpackage.gqe) r1
            long r2 = r1.a
            r0.k(r14, r2)
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x01ae
            r0.X(r13)
            goto L_0x01b1
        L_0x01ae:
            r0.h(r13, r2)
        L_0x01b1:
            java.lang.String r2 = r1.c
            if (r2 != 0) goto L_0x01b9
            r0.X(r12)
            goto L_0x01bc
        L_0x01b9:
            r0.h(r12, r2)
        L_0x01bc:
            long r2 = r1.d
            r0.k(r11, r2)
            long r2 = r1.e
            r0.k(r10, r2)
            long r2 = r1.f
            r0.k(r9, r2)
            java.lang.String r2 = r1.g
            if (r2 != 0) goto L_0x01d3
            r0.X(r8)
            goto L_0x01d6
        L_0x01d3:
            r0.h(r8, r2)
        L_0x01d6:
            java.util.List r2 = r1.h
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>((java.util.Collection<?>) r2)
            java.lang.String r2 = r3.toString()
            if (r2 != 0) goto L_0x01e7
            r0.X(r7)
            goto L_0x01ea
        L_0x01e7:
            r0.h(r7, r2)
        L_0x01ea:
            boolean r1 = r1.i
            long r1 = (long) r1
            r0.k(r6, r1)
            return
        L_0x01f1:
            r1 = r18
            hme r1 = (defpackage.hme) r1
            long r2 = r1.a
            r0.k(r14, r2)
            r78 r2 = r1.b
            int r2 = r2.a
            long r2 = (long) r2
            r0.k(r13, r2)
            ru.ok.tamtam.nano.Protos$LogEvent r2 = new ru.ok.tamtam.nano.Protos$LogEvent
            r2.<init>()
            n78 r3 = r1.c
            long r4 = r3.a
            r2.time = r4
            java.lang.String r4 = r3.c
            r2.type = r4
            java.lang.String r4 = r3.d
            r2.event = r4
            java.util.Map r4 = r3.e
            if (r4 == 0) goto L_0x022f
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0228 }
            r5.<init>()     // Catch:{ IOException -> 0x0228 }
            defpackage.ryg.i0(r4, r5)     // Catch:{ IOException -> 0x0228 }
            byte[] r4 = r5.toByteArray()     // Catch:{ IOException -> 0x0228 }
            r2.params = r4
            goto L_0x022f
        L_0x0228:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x022f:
            long r4 = r3.b
            r2.userId = r4
            long r3 = r3.f
            r2.sessionId = r3
            byte[] r2 = defpackage.ad9.toByteArray(r2)
            if (r2 != 0) goto L_0x0241
            r0.X(r12)
            goto L_0x0244
        L_0x0241:
            r0.l(r12, r2)
        L_0x0244:
            boolean r1 = r1.d
            long r1 = (long) r1
            r0.k(r11, r1)
            return
        L_0x024b:
            r1 = r18
            yqd r1 = (defpackage.yqd) r1
            long r2 = r1.a
            r0.k(r14, r2)
            erd r1 = r1.b
            int r1 = r1.ordinal()
            long r1 = (long) r1
            r0.k(r13, r1)
            return
        L_0x025f:
            r1 = r18
            r32 r1 = (defpackage.r32) r1
            long r2 = r1.a
            r0.k(r14, r2)
            java.lang.String r1 = r1.b
            if (r1 != 0) goto L_0x0270
            r0.X(r13)
            goto L_0x0273
        L_0x0270:
            r0.h(r13, r1)
        L_0x0273:
            return
        L_0x0274:
            r2 = r18
            j5d r2 = (defpackage.j5d) r2
            java.lang.String r3 = r2.a
            if (r3 != 0) goto L_0x0280
            r0.X(r14)
            goto L_0x0283
        L_0x0280:
            r0.h(r14, r3)
        L_0x0283:
            java.lang.String r3 = r2.b
            if (r3 != 0) goto L_0x028b
            r0.X(r13)
            goto L_0x028e
        L_0x028b:
            r0.h(r13, r3)
        L_0x028e:
            java.lang.String r3 = r2.c
            if (r3 != 0) goto L_0x0296
            r0.X(r12)
            goto L_0x0299
        L_0x0296:
            r0.h(r12, r3)
        L_0x0299:
            int r3 = r2.d
            long r12 = (long) r3
            r0.k(r11, r12)
            java.util.Set r3 = r2.e
            java.lang.String r3 = defpackage.tf6.K(r3)
            if (r3 != 0) goto L_0x02ab
            r0.X(r10)
            goto L_0x02ae
        L_0x02ab:
            r0.h(r10, r3)
        L_0x02ae:
            boolean r3 = r2.f
            long r10 = (long) r3
            r0.k(r9, r10)
            boolean r3 = r2.g
            long r9 = (long) r3
            r0.k(r8, r9)
            java.util.List r3 = r2.h
            if (r3 == 0) goto L_0x02c3
            byte[] r3 = defpackage.ua9.b(r3)
            goto L_0x02c4
        L_0x02c3:
            r3 = r1
        L_0x02c4:
            if (r3 != 0) goto L_0x02ca
            r0.X(r7)
            goto L_0x02cd
        L_0x02ca:
            r0.l(r7, r3)
        L_0x02cd:
            java.lang.Long r3 = r2.i
            if (r3 != 0) goto L_0x02d5
            r0.X(r6)
            goto L_0x02dc
        L_0x02d5:
            long r7 = r3.longValue()
            r0.k(r6, r7)
        L_0x02dc:
            java.util.Map r3 = r2.j
            if (r3 == 0) goto L_0x02e9
            n86 r3 = defpackage.m58.p(r3)
            byte[] r3 = defpackage.ad9.toByteArray(r3)
            goto L_0x02ea
        L_0x02e9:
            r3 = r1
        L_0x02ea:
            if (r3 != 0) goto L_0x02f0
            r0.X(r5)
            goto L_0x02f3
        L_0x02f0:
            r0.l(r5, r3)
        L_0x02f3:
            java.util.List r3 = r2.k
            if (r3 == 0) goto L_0x0300
            n86 r3 = defpackage.m58.r(r3)
            byte[] r3 = defpackage.ad9.toByteArray(r3)
            goto L_0x0301
        L_0x0300:
            r3 = r1
        L_0x0301:
            if (r3 != 0) goto L_0x0307
            r0.X(r4)
            goto L_0x030a
        L_0x0307:
            r0.l(r4, r3)
        L_0x030a:
            java.util.Set r3 = r2.l
            if (r3 == 0) goto L_0x0316
            n86 r1 = defpackage.m58.q(r3)
            byte[] r1 = defpackage.ad9.toByteArray(r1)
        L_0x0316:
            if (r1 != 0) goto L_0x031e
            r3 = 12
            r0.X(r3)
            goto L_0x0323
        L_0x031e:
            r3 = 12
            r0.l(r3, r1)
        L_0x0323:
            boolean r1 = r2.m
            long r1 = (long) r1
            r3 = 13
            r0.k(r3, r1)
            return
        L_0x032c:
            r1 = r18
            luc r1 = (defpackage.luc) r1
            long r2 = r1.a
            r0.k(r14, r2)
            cvc r2 = r1.b
            int r2 = r2.a
            long r2 = (long) r2
            r0.k(r13, r2)
            long r2 = r1.c
            r0.k(r12, r2)
            long r2 = r1.d
            r0.k(r11, r2)
            yl4 r2 = r1.e
            if (r2 == 0) goto L_0x0351
            long r2 = r2.b
            r0.k(r10, r2)
            goto L_0x0354
        L_0x0351:
            r0.X(r10)
        L_0x0354:
            e35 r2 = r1.f
            if (r2 == 0) goto L_0x0364
            java.lang.String r2 = r2.a
            if (r2 != 0) goto L_0x0360
            r0.X(r9)
            goto L_0x0367
        L_0x0360:
            r0.h(r9, r2)
            goto L_0x0367
        L_0x0364:
            r0.X(r9)
        L_0x0367:
            jz2 r1 = r1.g
            if (r1 == 0) goto L_0x037e
            java.lang.Object r2 = r1.c
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x0375
            r0.X(r8)
            goto L_0x0378
        L_0x0375:
            r0.l(r8, r2)
        L_0x0378:
            long r1 = r1.b
            r0.k(r7, r1)
            goto L_0x0384
        L_0x037e:
            r0.X(r8)
            r0.X(r7)
        L_0x0384:
            return
        L_0x0385:
            r1 = r18
            asc r1 = (defpackage.asc) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x0391
            r0.X(r14)
            goto L_0x0394
        L_0x0391:
            r0.h(r14, r2)
        L_0x0394:
            long r2 = r1.b
            r0.k(r13, r2)
            org.json.JSONArray r2 = new org.json.JSONArray
            java.util.List r1 = r1.c
            r2.<init>((java.util.Collection<?>) r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x03aa
            r0.X(r12)
            goto L_0x03ad
        L_0x03aa:
            r0.h(r12, r1)
        L_0x03ad:
            return
        L_0x03ae:
            r1 = r18
            vsb r1 = (defpackage.vsb) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x03ba
            r0.X(r14)
            goto L_0x03bd
        L_0x03ba:
            r0.h(r14, r2)
        L_0x03bd:
            java.lang.Long r1 = r1.b
            if (r1 != 0) goto L_0x03c5
            r0.X(r13)
            goto L_0x03cc
        L_0x03c5:
            long r1 = r1.longValue()
            r0.k(r13, r1)
        L_0x03cc:
            return
        L_0x03cd:
            r1 = r18
            ydb r1 = (defpackage.ydb) r1
            long r2 = r1.a
            r0.k(r14, r2)
            long r2 = r1.b
            r0.k(r13, r2)
            int r2 = r1.c
            long r2 = (long) r2
            r0.k(r12, r2)
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x03e9
            r0.X(r11)
            goto L_0x03ec
        L_0x03e9:
            r0.h(r11, r2)
        L_0x03ec:
            long r2 = r1.e
            r0.k(r10, r2)
            java.lang.String r2 = r1.f
            if (r2 != 0) goto L_0x03f9
            r0.X(r9)
            goto L_0x03fc
        L_0x03f9:
            r0.h(r9, r2)
        L_0x03fc:
            java.lang.String r2 = r1.g
            if (r2 != 0) goto L_0x0404
            r0.X(r8)
            goto L_0x0407
        L_0x0404:
            r0.h(r8, r2)
        L_0x0407:
            java.lang.String r2 = r1.h
            if (r2 != 0) goto L_0x040f
            r0.X(r7)
            goto L_0x0412
        L_0x040f:
            r0.h(r7, r2)
        L_0x0412:
            java.lang.String r2 = r1.i
            if (r2 != 0) goto L_0x041a
            r0.X(r6)
            goto L_0x041d
        L_0x041a:
            r0.h(r6, r2)
        L_0x041d:
            int r1 = r1.j
            int r1 = defpackage.tr1.y(r1)
            long r1 = (long) r1
            r0.k(r5, r1)
            return
        L_0x0428:
            r2 = r18
            mga r2 = (defpackage.mga) r2
            long r3 = r2.a
            r0.k(r14, r3)
            long r3 = r2.b
            r0.k(r13, r3)
            long r3 = r2.c
            r0.k(r12, r3)
            java.lang.Boolean r3 = r2.d
            if (r3 != 0) goto L_0x0441
            r3 = r1
            goto L_0x0449
        L_0x0441:
            boolean r3 = r3.booleanValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0449:
            if (r3 != 0) goto L_0x044f
            r0.X(r11)
            goto L_0x0457
        L_0x044f:
            int r3 = r3.intValue()
            long r3 = (long) r3
            r0.k(r11, r3)
        L_0x0457:
            hx4 r2 = r2.e
            if (r2 == 0) goto L_0x045d
            java.lang.String r1 = r2.a
        L_0x045d:
            if (r1 != 0) goto L_0x0463
            r0.X(r10)
            goto L_0x0466
        L_0x0463:
            r0.h(r10, r1)
        L_0x0466:
            return
        L_0x0467:
            r1 = r18
            uea r1 = (defpackage.uea) r1
            long r2 = r1.a
            r0.k(r14, r2)
            long r1 = r1.b
            r0.k(r13, r1)
            return
        L_0x0476:
            r2 = r18
            mj5 r2 = (defpackage.mj5) r2
            long r4 = r2.a
            r0.k(r14, r4)
            long r4 = r2.b
            r0.k(r13, r4)
            pj5 r4 = r2.c
            if (r4 == 0) goto L_0x048a
            java.lang.String r1 = r4.a
        L_0x048a:
            if (r1 != 0) goto L_0x0490
            r0.X(r12)
            goto L_0x0493
        L_0x0490:
            r0.h(r12, r1)
        L_0x0493:
            java.lang.String r1 = r2.d
            if (r1 != 0) goto L_0x049b
            r0.X(r11)
            goto L_0x049e
        L_0x049b:
            r0.h(r11, r1)
        L_0x049e:
            java.lang.String r1 = r2.e
            if (r1 != 0) goto L_0x04a6
            r0.X(r10)
            goto L_0x04a9
        L_0x04a6:
            r0.h(r10, r1)
        L_0x04a9:
            long r4 = r2.f
            r0.k(r9, r4)
            long r4 = r2.g
            r0.k(r8, r4)
            java.lang.String r1 = r2.h
            if (r1 != 0) goto L_0x04bb
            r0.X(r7)
            goto L_0x04be
        L_0x04bb:
            r0.h(r7, r1)
        L_0x04be:
            long r4 = r2.i
            r0.k(r6, r4)
            java.lang.String r1 = r2.j
            if (r1 != 0) goto L_0x04cd
            r4 = 10
            r0.X(r4)
            goto L_0x04d2
        L_0x04cd:
            r4 = 10
            r0.h(r4, r1)
        L_0x04d2:
            java.lang.String r1 = r2.k
            if (r1 != 0) goto L_0x04dc
            r3 = 11
            r0.X(r3)
            goto L_0x04e1
        L_0x04dc:
            r3 = 11
            r0.h(r3, r1)
        L_0x04e1:
            boolean r1 = r2.l
            long r3 = (long) r1
            r1 = 12
            r0.k(r1, r3)
            boolean r1 = r2.m
            long r1 = (long) r1
            r3 = 13
            r0.k(r3, r1)
            return
        L_0x04f2:
            r1 = r18
            sf9 r1 = (defpackage.sf9) r1
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x04fe
            r0.X(r14)
            goto L_0x0501
        L_0x04fe:
            r0.h(r14, r2)
        L_0x0501:
            long r2 = r1.c
            r0.k(r13, r2)
            xyf r2 = r1.d
            int r2 = r2.a
            long r2 = (long) r2
            r0.k(r12, r2)
            ur1 r2 = r1.a
            long r3 = r2.a
            r0.k(r11, r3)
            long r3 = r2.b
            r0.k(r10, r3)
            java.lang.Object r2 = r2.c
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0524
            r0.X(r9)
            goto L_0x0527
        L_0x0524:
            r0.h(r9, r2)
        L_0x0527:
            i20 r1 = r1.e
            if (r1 == 0) goto L_0x0548
            qac r2 = r1.a
            int r2 = r2.b
            long r2 = (long) r2
            r0.k(r8, r2)
            float r2 = r1.b
            double r2 = (double) r2
            r0.T(r2, r7)
            float r2 = r1.c
            double r2 = (double) r2
            r0.T(r2, r6)
            boolean r1 = r1.d
            long r1 = (long) r1
            r3 = 10
            r0.k(r3, r1)
            goto L_0x0556
        L_0x0548:
            r3 = 10
            r0.X(r8)
            r0.X(r7)
            r0.X(r6)
            r0.X(r3)
        L_0x0556:
            return
        L_0x0557:
            r1 = r18
            oj5 r1 = (defpackage.oj5) r1
            long r2 = r1.a
            r0.k(r14, r2)
            long r1 = r1.b
            r0.k(r13, r1)
            return
        L_0x0566:
            r1 = r18
            cj5 r1 = (defpackage.cj5) r1
            long r4 = r1.a
            r0.k(r14, r4)
            long r4 = r1.b
            r0.k(r13, r4)
            long r4 = r1.c
            r0.k(r12, r4)
            hj5 r2 = r1.d
            if (r2 == 0) goto L_0x0580
            int r2 = r2.a
            goto L_0x0583
        L_0x0580:
            djd r2 = defpackage.hj5.b
            r2 = 0
        L_0x0583:
            long r4 = (long) r2
            r0.k(r11, r4)
            java.lang.Long r2 = r1.e
            if (r2 != 0) goto L_0x058f
            r0.X(r10)
            goto L_0x0596
        L_0x058f:
            long r4 = r2.longValue()
            r0.k(r10, r4)
        L_0x0596:
            long r4 = r1.f
            r0.k(r9, r4)
            java.lang.Long r2 = r1.g
            if (r2 != 0) goto L_0x05a3
            r0.X(r8)
            goto L_0x05aa
        L_0x05a3:
            long r4 = r2.longValue()
            r0.k(r8, r4)
        L_0x05aa:
            java.lang.String r2 = r1.h
            if (r2 != 0) goto L_0x05b2
            r0.X(r7)
            goto L_0x05b5
        L_0x05b2:
            r0.h(r7, r2)
        L_0x05b5:
            long r4 = r1.i
            r0.k(r6, r4)
            long r4 = r1.j
            r2 = 10
            r0.k(r2, r4)
            java.lang.String r2 = r1.k
            if (r2 != 0) goto L_0x05cb
            r3 = 11
            r0.X(r3)
            goto L_0x05d0
        L_0x05cb:
            r3 = 11
            r0.h(r3, r2)
        L_0x05d0:
            long r2 = r1.l
            r4 = 12
            r0.k(r4, r2)
            long r1 = r1.m
            r3 = 13
            r0.k(r3, r1)
            return
        L_0x05df:
            r1 = r18
            kh5 r1 = (defpackage.kh5) r1
            long r2 = r1.a
            r0.k(r14, r2)
            long r1 = r1.b
            r0.k(r13, r1)
            return
        L_0x05ee:
            r1 = r18
            bi5 r1 = (defpackage.bi5) r1
            long r2 = r1.a
            r0.k(r14, r2)
            long r1 = r1.b
            r0.k(r13, r1)
            return
        L_0x05fd:
            r1 = r18
            cu4 r1 = (defpackage.cu4) r1
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x0609
            r0.X(r14)
            goto L_0x060c
        L_0x0609:
            r0.h(r14, r2)
        L_0x060c:
            long r2 = r1.c
            r0.k(r13, r2)
            xyf r2 = r1.d
            int r2 = r2.a
            long r2 = (long) r2
            r0.k(r12, r2)
            tt4 r2 = r1.a
            long r3 = r2.a
            r0.k(r11, r3)
            java.lang.String r2 = r2.b
            if (r2 != 0) goto L_0x0628
            r0.X(r10)
            goto L_0x062b
        L_0x0628:
            r0.h(r10, r2)
        L_0x062b:
            i20 r1 = r1.e
            if (r1 == 0) goto L_0x064a
            qac r2 = r1.a
            int r2 = r2.b
            long r2 = (long) r2
            r0.k(r9, r2)
            float r2 = r1.b
            double r2 = (double) r2
            r0.T(r2, r8)
            float r2 = r1.c
            double r2 = (double) r2
            r0.T(r2, r7)
            boolean r1 = r1.d
            long r1 = (long) r1
            r0.k(r6, r1)
            goto L_0x0656
        L_0x064a:
            r0.X(r9)
            r0.X(r8)
            r0.X(r7)
            r0.X(r6)
        L_0x0656:
            return
        L_0x0657:
            r1 = r18
            am4 r1 = (defpackage.am4) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x0663
            r0.X(r14)
            goto L_0x0666
        L_0x0663:
            r0.h(r14, r2)
        L_0x0666:
            java.lang.String r1 = r1.b
            if (r1 != 0) goto L_0x066e
            r0.X(r13)
            goto L_0x0671
        L_0x066e:
            r0.h(r13, r1)
        L_0x0671:
            return
        L_0x0672:
            r1 = r18
            ye4 r1 = (defpackage.ye4) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x067e
            r0.X(r14)
            goto L_0x0681
        L_0x067e:
            r0.h(r14, r2)
        L_0x0681:
            java.lang.String r1 = r1.b
            if (r1 != 0) goto L_0x0689
            r0.X(r13)
            goto L_0x068c
        L_0x0689:
            r0.h(r13, r1)
        L_0x068c:
            return
        L_0x068d:
            r1 = r18
            qn3 r1 = (defpackage.qn3) r1
            long r2 = r1.a
            r0.k(r14, r2)
            long r2 = r1.b
            r0.k(r13, r2)
            int r2 = r1.c
            long r2 = (long) r2
            r0.k(r12, r2)
            int r2 = r1.d
            long r2 = (long) r2
            r0.k(r11, r2)
            um3 r1 = r1.e
            byte[] r1 = r1.d()
            if (r1 != 0) goto L_0x06b3
            r0.X(r10)
            goto L_0x06b6
        L_0x06b3:
            r0.l(r10, r1)
        L_0x06b6:
            return
        L_0x06b7:
            r1 = r18
            tq3 r1 = (defpackage.tq3) r1
            double r2 = r1.b
            r0.T(r2, r14)
            double r2 = r1.c
            r0.T(r2, r13)
            double r2 = r1.d
            r0.T(r2, r12)
            float r2 = r1.e
            double r2 = (double) r2
            r0.T(r2, r11)
            float r2 = r1.f
            double r2 = (double) r2
            r0.T(r2, r10)
            float r2 = r1.g
            double r2 = (double) r2
            r0.T(r2, r9)
            java.lang.String r2 = r1.h
            if (r2 != 0) goto L_0x06e4
            r0.X(r8)
            goto L_0x06e7
        L_0x06e4:
            r0.h(r8, r2)
        L_0x06e7:
            ap0 r1 = r1.a
            long r2 = r1.b
            r0.k(r7, r2)
            long r1 = r1.c
            r0.k(r6, r1)
            return
        L_0x06f4:
            r1 = r18
            kc2 r1 = (defpackage.kc2) r1
            long r2 = r1.b
            r0.k(r14, r2)
            long r2 = r1.c
            r0.k(r13, r2)
            long r2 = r1.d
            r0.k(r12, r2)
            long r2 = r1.e
            r0.k(r11, r2)
            java.lang.String r2 = r1.f
            if (r2 != 0) goto L_0x0714
            r0.X(r10)
            goto L_0x0717
        L_0x0714:
            r0.h(r10, r2)
        L_0x0717:
            lc2 r1 = r1.a
            long r2 = r1.a
            r0.k(r9, r2)
            long r2 = r1.b
            r0.k(r8, r2)
            long r1 = r1.c
            r0.k(r7, r1)
            return
        L_0x0729:
            r1 = r18
            jb1 r1 = (defpackage.jb1) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x0735
            r0.X(r14)
            goto L_0x0738
        L_0x0735:
            r0.h(r14, r2)
        L_0x0738:
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x0740
            r0.X(r13)
            goto L_0x0743
        L_0x0740:
            r0.h(r13, r2)
        L_0x0743:
            long r1 = r1.c
            r0.k(r12, r1)
            return
        L_0x0749:
            r1 = r18
            nk r1 = (defpackage.nk) r1
            long r2 = r1.a
            r0.k(r14, r2)
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x075a
            r0.X(r13)
            goto L_0x075d
        L_0x075a:
            r0.h(r13, r2)
        L_0x075d:
            java.lang.String r2 = r1.c
            if (r2 != 0) goto L_0x0765
            r0.X(r12)
            goto L_0x0768
        L_0x0765:
            r0.h(r12, r2)
        L_0x0768:
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x0770
            r0.X(r11)
            goto L_0x0773
        L_0x0770:
            r0.h(r11, r2)
        L_0x0773:
            long r2 = r1.e
            r0.k(r10, r2)
            org.json.JSONArray r2 = new org.json.JSONArray
            java.util.List r1 = r1.f
            r2.<init>((java.util.Collection<?>) r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0789
            r0.X(r9)
            goto L_0x078c
        L_0x0789:
            r0.h(r9, r1)
        L_0x078c:
            return
        L_0x078d:
            r1 = r18
            dj r1 = (defpackage.dj) r1
            long r2 = r1.a
            r0.k(r14, r2)
            long r2 = r1.b
            r0.k(r13, r2)
            java.lang.String r2 = r1.c
            if (r2 != 0) goto L_0x07a3
            r0.X(r12)
            goto L_0x07a6
        L_0x07a3:
            r0.h(r12, r2)
        L_0x07a6:
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x07ae
            r0.X(r11)
            goto L_0x07b1
        L_0x07ae:
            r0.h(r11, r2)
        L_0x07b1:
            java.lang.String r2 = r1.e
            if (r2 != 0) goto L_0x07b9
            r0.X(r10)
            goto L_0x07bc
        L_0x07b9:
            r0.h(r10, r2)
        L_0x07bc:
            java.lang.Long r2 = r1.f
            if (r2 != 0) goto L_0x07c4
            r0.X(r9)
            goto L_0x07cb
        L_0x07c4:
            long r2 = r2.longValue()
            r0.k(r9, r2)
        L_0x07cb:
            java.lang.String r1 = r1.g
            if (r1 != 0) goto L_0x07d3
            r0.X(r8)
            goto L_0x07d6
        L_0x07d3:
            r0.h(r8, r1)
        L_0x07d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li.Z(gf6, java.lang.Object):void");
    }
}
