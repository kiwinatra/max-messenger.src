package defpackage;

/* renamed from: dya  reason: default package */
public final class dya extends pq9 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dya(int i) {
        super(2, 3);
        this.c = i;
        switch (i) {
            case 1:
                super(3, 4);
                this.d = new Object();
                return;
            case 2:
                super(14, 15);
                this.d = new v9a(7);
                return;
            default:
                this.d = new Object();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0151, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0152, code lost:
        kotlin.io.CloseableKt.closeFinally(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0155, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.af6 r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.Object r1 = r5.d
            int r5 = r5.c
            switch(r5) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0040;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r5 = "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"
            java.lang.String r2 = "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`"
            java.lang.String r3 = "DROP TABLE `WorkSpec`"
            java.lang.String r4 = "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`"
            defpackage.wj6.r(r6, r5, r2, r3, r4)
            java.lang.String r5 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"
            r6.V(r5)
            java.lang.String r5 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"
            r6.V(r5)
            v9a r1 = (defpackage.v9a) r1
            r1.getClass()
            java.lang.String r5 = "UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0"
            r6.V(r5)
            android.content.ContentValues r5 = new android.content.ContentValues
            r1 = 1
            r5.<init>(r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "last_enqueue_time"
            r5.put(r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r6.t0(r5, r0)
            return
        L_0x0040:
            java.lang.String r5 = "CREATE TABLE IF NOT EXISTS `_new_phones` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `phonebook_id` INTEGER NOT NULL, `contact_id` INTEGER NOT NULL, `phone` TEXT NOT NULL, `server_phone` INTEGER NOT NULL, `email` TEXT, `first_name` TEXT NOT NULL, `last_name` TEXT, `avatar_path` TEXT, `type` INTEGER NOT NULL)"
            java.lang.String r0 = "INSERT INTO `_new_phones` (`id`,`phonebook_id`,`contact_id`,`phone`,`server_phone`,`email`,`first_name`,`avatar_path`,`type`) SELECT `id`,`phonebook_id`,`contact_id`,`phone`,`server_phone`,`email`,`name`,`avatar_path`,`type` FROM `phones`"
            java.lang.String r2 = "DROP TABLE `phones`"
            java.lang.String r3 = "ALTER TABLE `_new_phones` RENAME TO `phones`"
            defpackage.wj6.r(r6, r5, r0, r2, r3)
            java.lang.String r5 = "CREATE INDEX IF NOT EXISTS `index_phones_phonebook_id` ON `phones` (`phonebook_id`)"
            r6.V(r5)
            java.lang.String r5 = "CREATE INDEX IF NOT EXISTS `index_phones_type` ON `phones` (`type`)"
            r6.V(r5)
            java.lang.String r5 = "CREATE INDEX IF NOT EXISTS `index_phones_server_phone` ON `phones` (`server_phone`)"
            r6.V(r5)
            js9 r1 = (defpackage.js9) r1
            r1.getClass()
            java.lang.String r5 = "DELETE FROM phones"
            r6.V(r5)
            return
        L_0x0065:
            java.lang.String r5 = "CREATE TABLE IF NOT EXISTS `_new_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )"
            java.lang.String r2 = "INSERT INTO `_new_messages` (`id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`ttl`,`channel_views`,`channel_forwards`,`view_time`,`zoom`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender`) SELECT `id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`ttl`,`channel_views`,`channel_forwards`,`view_time`,`zoom`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender` FROM `messages`"
            java.lang.String r3 = "DROP TABLE `messages`"
            java.lang.String r4 = "ALTER TABLE `_new_messages` RENAME TO `messages`"
            defpackage.wj6.r(r6, r5, r2, r3, r4)
            java.lang.String r5 = "CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)"
            java.lang.String r2 = "CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)"
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)"
            java.lang.String r4 = "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)"
            defpackage.wj6.r(r6, r5, r2, r3, r4)
            java.lang.String r5 = "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)"
            r6.V(r5)
            java.lang.String r5 = "CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)"
            r6.V(r5)
            java.lang.String r5 = "PRAGMA foreign_key_check(`messages`)"
            android.database.Cursor r5 = r6.r0(r5)
            int r2 = r5.getCount()     // Catch:{ all -> 0x00b1 }
            if (r2 > 0) goto L_0x00b4
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00b1 }
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r5, r0)
            java.lang.String r5 = "CREATE TABLE IF NOT EXISTS `_new_stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sticker_id` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `url` TEXT, `update_time` INTEGER NOT NULL, `mp4_url` TEXT, `first_url` TEXT, `preview_url` TEXT, `tags` TEXT NOT NULL, `sticker_type` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `lottie_url` TEXT, `audio` INTEGER NOT NULL, `author_type` INTEGER NOT NULL)"
            r6.V(r5)
            java.lang.String r5 = "INSERT INTO `_new_stickers` (`id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type`) SELECT `id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type` FROM `stickers`"
            r6.V(r5)
            java.lang.String r5 = "DROP TABLE `stickers`"
            r6.V(r5)
            java.lang.String r5 = "ALTER TABLE `_new_stickers` RENAME TO `stickers`"
            r6.V(r5)
            wc8 r1 = (defpackage.wc8) r1
            r1.getClass()
            return
        L_0x00b1:
            r6 = move-exception
            goto L_0x0150
        L_0x00b4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r6.<init>()     // Catch:{ all -> 0x00b1 }
            int r1 = r5.getCount()     // Catch:{ all -> 0x00b1 }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00b1 }
            r2.<init>()     // Catch:{ all -> 0x00b1 }
        L_0x00c2:
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x00f3
            boolean r3 = r5.isFirst()     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x00df
            java.lang.String r3 = "Foreign key violation(s) detected in '"
            r6.append(r3)     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = r5.getString(r0)     // Catch:{ all -> 0x00b1 }
            r6.append(r3)     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = "'.\n"
            r6.append(r3)     // Catch:{ all -> 0x00b1 }
        L_0x00df:
            r3 = 3
            java.lang.String r3 = r5.getString(r3)     // Catch:{ all -> 0x00b1 }
            boolean r4 = r2.containsKey(r3)     // Catch:{ all -> 0x00b1 }
            if (r4 != 0) goto L_0x00c2
            r4 = 2
            java.lang.String r4 = r5.getString(r4)     // Catch:{ all -> 0x00b1 }
            r2.put(r3, r4)     // Catch:{ all -> 0x00b1 }
            goto L_0x00c2
        L_0x00f3:
            java.lang.String r0 = "Number of different violations discovered: "
            r6.append(r0)     // Catch:{ all -> 0x00b1 }
            java.util.Set r0 = r2.keySet()     // Catch:{ all -> 0x00b1 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b1 }
            r6.append(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "\nNumber of rows in violation: "
            r6.append(r0)     // Catch:{ all -> 0x00b1 }
            r6.append(r1)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "\nViolation(s) detected in the following constraint(s):\n"
            r6.append(r0)     // Catch:{ all -> 0x00b1 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x00b1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00b1 }
        L_0x0118:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x0146
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00b1 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x00b1 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b1 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = "\tParent Table = "
            r6.append(r3)     // Catch:{ all -> 0x00b1 }
            r6.append(r1)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = ", Foreign Key Constraint Index = "
            r6.append(r1)     // Catch:{ all -> 0x00b1 }
            r6.append(r2)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "\n"
            r6.append(r1)     // Catch:{ all -> 0x00b1 }
            goto L_0x0118
        L_0x0146:
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00b1 }
            android.database.sqlite.SQLiteConstraintException r0 = new android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x00b1 }
            r0.<init>(r6)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x0150:
            throw r6     // Catch:{ all -> 0x0151 }
        L_0x0151:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dya.a(af6):void");
    }
}
