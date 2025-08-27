package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ne7  reason: default package */
public final class ne7 {
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final hs7 e;
    public final hs7 f;
    public final hs7 g;
    public final hs7 h;
    public final hs7 i;
    public final hs7 j;
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    public ne7(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77, hs7 hs78, hs7 hs79, hs7 hs710) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
        this.d = hs74;
        this.e = hs75;
        this.f = hs76;
        this.g = hs77;
        this.h = hs78;
        this.i = hs79;
        this.j = hs710;
    }

    public final Map a(long j2) {
        return (Map) this.k.get(Long.valueOf(j2));
    }

    public final void b(long j2) {
        z68.a("ne7", "postEvent: chat.id =  " + j2);
        ((sv0) this.c.get()).c(new nuf(j2, d(j2)));
    }

    public final synchronized void c(long j2, long j3) {
        try {
            z68.c("ne7", "removeTyping: chatId = " + j2 + ", sender = " + j3, new Object[0]);
            Map a2 = a(j2);
            if (a2 != null) {
                a2.remove(Long.valueOf(j3));
                if (a2.isEmpty()) {
                    z68.c("ne7", "removeTyping: remove chat notifs, chatId = " + j2, new Object[0]);
                    this.k.remove(Long.valueOf(j2));
                }
                b(j2);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [java.lang.Object, java.util.function.ToLongFunction] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String d(long r10) {
        /*
            r9 = this;
            java.util.Map r0 = r9.a(r10)
            java.lang.String r1 = "ne7"
            r2 = 0
            r3 = 1
            java.lang.String r4 = "getNotifList: there is no notifs for chat, chatId = "
            if (r0 == 0) goto L_0x004b
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x0013
            goto L_0x004b
        L_0x0013:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ NoSuchElementException -> 0x001d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ NoSuchElementException -> 0x001d }
            r5.<init>(r0)     // Catch:{ NoSuchElementException -> 0x001d }
            goto L_0x0021
        L_0x001d:
            java.util.List r5 = java.util.Collections.emptyList()
        L_0x0021:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0038
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            defpackage.z68.a(r1, r0)
        L_0x0036:
            r5 = r2
            goto L_0x005b
        L_0x0038:
            int r0 = r5.size()
            if (r0 <= r3) goto L_0x005b
            me7 r0 = new me7
            r0.<init>()
            java.util.Comparator r0 = java.util.Comparator.comparingLong(r0)
            r5.sort(r0)
            goto L_0x005b
        L_0x004b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            defpackage.z68.a(r1, r0)
            goto L_0x0036
        L_0x005b:
            if (r5 != 0) goto L_0x006f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "typingText: there is no notifs for chat, chatId = "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            defpackage.z68.a(r1, r9)
            return r2
        L_0x006f:
            hs7 r0 = r9.h
            java.lang.Object r0 = r0.get()
            r62 r0 = (defpackage.r62) r0
            a32 r10 = r0.G(r10)
            if (r10 != 0) goto L_0x0094
            hs7 r9 = r9.d
            java.lang.Object r9 = r9.get()
            m95 r9 = (defpackage.m95) r9
            ru.ok.tamtam.util.HandledException r10 = new ru.ok.tamtam.util.HandledException
            java.lang.String r11 = "chat is null"
            r10.<init>(r11)
            uta r9 = (defpackage.uta) r9
            r9.c(r10, r3)
            java.lang.String r9 = ""
            return r9
        L_0x0094:
            boolean r10 = r10.N()
            r11 = 0
            java.lang.Object r0 = r5.get(r11)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            oaa r0 = (defpackage.oaa) r0
            java.lang.Object r11 = r5.get(r11)
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getKey()
            java.lang.Long r11 = (java.lang.Long) r11
            long r6 = r11.longValue()
            r11 = 2
            if (r10 == 0) goto L_0x0114
            hs7 r9 = r9.e
            java.lang.Object r9 = r9.get()
            yva r9 = (defpackage.yva) r9
            r9.getClass()
            b10 r10 = r0.b
            android.content.Context r9 = r9.a
            if (r10 == 0) goto L_0x010c
            int r10 = r10.ordinal()
            if (r10 == r11) goto L_0x0104
            r11 = 3
            if (r10 == r11) goto L_0x00fc
            r11 = 4
            if (r10 == r11) goto L_0x00f4
            r11 = 5
            if (r10 == r11) goto L_0x00ec
            r11 = 9
            if (r10 == r11) goto L_0x00e4
            int r10 = defpackage.tmc.tt_typing
            java.lang.String r9 = r9.getString(r10)
            goto L_0x01e8
        L_0x00e4:
            int r10 = defpackage.tmc.tt_typing_file
            java.lang.String r9 = r9.getString(r10)
            goto L_0x01e8
        L_0x00ec:
            int r10 = defpackage.tmc.tt_typing_sticker
            java.lang.String r9 = r9.getString(r10)
            goto L_0x01e8
        L_0x00f4:
            int r10 = defpackage.tmc.tt_typing_audio
            java.lang.String r9 = r9.getString(r10)
            goto L_0x01e8
        L_0x00fc:
            int r10 = defpackage.tmc.tt_typing_video
            java.lang.String r9 = r9.getString(r10)
            goto L_0x01e8
        L_0x0104:
            int r10 = defpackage.tmc.tt_typing_photo
            java.lang.String r9 = r9.getString(r10)
            goto L_0x01e8
        L_0x010c:
            int r10 = defpackage.tmc.tt_typing
            java.lang.String r9 = r9.getString(r10)
            goto L_0x01e8
        L_0x0114:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r0 = r5.size()
            java.lang.String r1 = "MISSED_CONTACT_IN_TYPING"
            hs7 r4 = r9.j
            hs7 r8 = r9.i
            if (r0 != r3) goto L_0x014b
            java.lang.Object r9 = r8.get()
            km3 r9 = (defpackage.km3) r9
            vk3 r9 = r9.o(r6)
            if (r9 == 0) goto L_0x0141
            boolean r11 = r9.B()
            if (r11 == 0) goto L_0x0138
            goto L_0x0141
        L_0x0138:
            java.lang.String r9 = r9.f()
            r10.append(r9)
            goto L_0x01e4
        L_0x0141:
            java.lang.Object r9 = r4.get()
            nd r9 = (defpackage.nd) r9
            r9.e(r1)
            return r2
        L_0x014b:
            int r0 = r5.size()
            if (r0 != r11) goto L_0x019b
            java.util.Iterator r9 = r5.iterator()
        L_0x0155:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x01e4
            java.lang.Object r11 = r9.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r0 = r8.get()
            km3 r0 = (defpackage.km3) r0
            java.lang.Object r11 = r11.getKey()
            java.lang.Long r11 = (java.lang.Long) r11
            long r2 = r11.longValue()
            vk3 r11 = r0.o(r2)
            if (r11 == 0) goto L_0x0191
            boolean r0 = r11.B()
            if (r0 == 0) goto L_0x017e
            goto L_0x0191
        L_0x017e:
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = ", "
            r10.append(r0)
        L_0x0189:
            java.lang.String r11 = r11.f()
            r10.append(r11)
            goto L_0x0155
        L_0x0191:
            java.lang.Object r11 = r4.get()
            nd r11 = (defpackage.nd) r11
            r11.e(r1)
            goto L_0x0155
        L_0x019b:
            java.util.Iterator r11 = r5.iterator()
        L_0x019f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01cf
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r8.get()
            km3 r2 = (defpackage.km3) r2
            java.lang.Object r0 = r0.getKey()
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            vk3 r0 = r2.p(r6, r3)
            boolean r0 = r0.B()
            if (r0 == 0) goto L_0x019f
            java.lang.Object r0 = r4.get()
            nd r0 = (defpackage.nd) r0
            r0.e(r1)
            goto L_0x019f
        L_0x01cf:
            hs7 r9 = r9.a
            java.lang.Object r9 = r9.get()
            android.content.Context r9 = (android.content.Context) r9
            int r11 = defpackage.zjc.tt_chat_subtitle_count
            int r0 = r5.size()
            java.lang.String r9 = defpackage.ghf.s(r11, r0, r9)
            r10.append(r9)
        L_0x01e4:
            java.lang.String r9 = r10.toString()
        L_0x01e8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne7.d(long):java.lang.String");
    }
}
