package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ni  reason: default package */
public final class ni implements Callable {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ni(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    private final Object a() {
        Cursor o = ((i6d) ((zqd) this.c).b).o((d7d) this.b, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "selectedMentionType");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                long j = o.getLong(u);
                int i = o.getInt(u2);
                erd erd = erd.a;
                if (i != 0) {
                    erd erd2 = erd.b;
                    if (i == 1) {
                        erd = erd2;
                    }
                }
                arrayList.add(new yqd(j, erd));
            }
            return arrayList;
        } finally {
            o.close();
        }
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.Object, gqe] */
    private final Object b() {
        Cursor o = ((wqe) this.c).a.o((d7d) this.b, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "name");
            int u3 = kne.u(o, "icon_url");
            int u4 = kne.u(o, "author_id");
            int u5 = kne.u(o, "created_time");
            int u6 = kne.u(o, "updated_time");
            int u7 = kne.u(o, "link");
            int u8 = kne.u(o, "stickers");
            int u9 = kne.u(o, "draft");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                ? obj = new Object();
                obj.a = o.getLong(u);
                if (o.isNull(u2)) {
                    obj.b = null;
                } else {
                    obj.b = o.getString(u2);
                }
                if (o.isNull(u3)) {
                    obj.c = null;
                } else {
                    obj.c = o.getString(u3);
                }
                obj.d = o.getLong(u4);
                obj.e = o.getLong(u5);
                obj.f = o.getLong(u6);
                if (o.isNull(u7)) {
                    obj.g = null;
                } else {
                    obj.g = o.getString(u7);
                }
                obj.h = vzg.J(o.isNull(u8) ? null : o.getString(u8));
                obj.i = o.getInt(u9) != 0;
                arrayList.add(obj);
            }
            o.close();
            return arrayList;
        } catch (Throwable th) {
            o.close();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r4v37, types: [asc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r41 = this;
            r0 = r41
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x0780;
                case 1: goto L_0x0760;
                case 2: goto L_0x06c2;
                case 3: goto L_0x068d;
                case 4: goto L_0x0629;
                case 5: goto L_0x060a;
                case 6: goto L_0x05eb;
                case 7: goto L_0x05cc;
                case 8: goto L_0x05ad;
                case 9: goto L_0x0570;
                case 10: goto L_0x0533;
                case 11: goto L_0x0514;
                case 12: goto L_0x03f2;
                case 13: goto L_0x03d3;
                case 14: goto L_0x038e;
                case 15: goto L_0x036f;
                case 16: goto L_0x0348;
                case 17: goto L_0x0232;
                case 18: goto L_0x0213;
                case 19: goto L_0x01ce;
                case 20: goto L_0x0130;
                case 21: goto L_0x0110;
                case 22: goto L_0x00b2;
                case 23: goto L_0x0093;
                case 24: goto L_0x0073;
                case 25: goto L_0x004f;
                case 26: goto L_0x004a;
                case 27: goto L_0x002b;
                case 28: goto L_0x0026;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.c
            dzf r1 = (defpackage.dzf) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x0021 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0021 }
            lxf r0 = (defpackage.lxf) r0     // Catch:{ all -> 0x0021 }
            r1.c0(r0)     // Catch:{ all -> 0x0021 }
            r2.r()     // Catch:{ all -> 0x0021 }
            r2.l()
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x0026:
            java.lang.Object r0 = r41.b()
            return r0
        L_0x002b:
            java.lang.Object r1 = r0.c
            wqe r1 = (defpackage.wqe) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0045 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0045 }
            r1.a0(r0)     // Catch:{ all -> 0x0045 }
            r2.r()     // Catch:{ all -> 0x0045 }
            r2.l()
            r0 = 0
            return r0
        L_0x0045:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x004a:
            java.lang.Object r0 = r41.a()
            return r0
        L_0x004f:
            java.lang.Object r1 = r0.c
            zqd r1 = (defpackage.zqd) r1
            java.lang.Object r2 = r1.b
            i6d r2 = (defpackage.i6d) r2
            r2.c()
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x006e }
            li r1 = (defpackage.li) r1     // Catch:{ all -> 0x006e }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x006e }
            yqd r0 = (defpackage.yqd) r0     // Catch:{ all -> 0x006e }
            r1.c0(r0)     // Catch:{ all -> 0x006e }
            r2.r()     // Catch:{ all -> 0x006e }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006e }
            r2.l()
            return r0
        L_0x006e:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x0073:
            java.lang.Object r1 = r0.c
            c6d r1 = (defpackage.c6d) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.c     // Catch:{ all -> 0x008e }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x008e }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x008e }
            r1.a0(r0)     // Catch:{ all -> 0x008e }
            r2.r()     // Catch:{ all -> 0x008e }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x008e }
            r2.l()
            return r0
        L_0x008e:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x0093:
            java.lang.Object r1 = r0.c
            kuc r1 = (defpackage.kuc) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x00ad }
            luc r0 = (defpackage.luc) r0     // Catch:{ all -> 0x00ad }
            r1.c0(r0)     // Catch:{ all -> 0x00ad }
            r2.r()     // Catch:{ all -> 0x00ad }
            r2.l()
            r0 = 0
            return r0
        L_0x00ad:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x00b2:
            java.lang.Object r1 = r0.c
            bsc r1 = (defpackage.bsc) r1
            i6d r1 = r1.a
            java.lang.Object r0 = r0.b
            r2 = r0
            d7d r2 = (defpackage.d7d) r2
            r0 = 0
            android.database.Cursor r1 = r1.o(r2, r0)
            java.lang.String r3 = "id"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x0100 }
            java.lang.String r4 = "update_time"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x0100 }
            java.lang.String r5 = "reactions"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x0100 }
            boolean r6 = r1.moveToFirst()     // Catch:{ all -> 0x0100 }
            if (r6 == 0) goto L_0x0102
            boolean r6 = r1.isNull(r3)     // Catch:{ all -> 0x0100 }
            if (r6 == 0) goto L_0x00e2
            r3 = r0
            goto L_0x00e6
        L_0x00e2:
            java.lang.String r3 = r1.getString(r3)     // Catch:{ all -> 0x0100 }
        L_0x00e6:
            long r6 = r1.getLong(r4)     // Catch:{ all -> 0x0100 }
            boolean r4 = r1.isNull(r5)     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x00f1
            goto L_0x00f5
        L_0x00f1:
            java.lang.String r0 = r1.getString(r5)     // Catch:{ all -> 0x0100 }
        L_0x00f5:
            java.util.ArrayList r0 = defpackage.vzg.J(r0)     // Catch:{ all -> 0x0100 }
            asc r4 = new asc     // Catch:{ all -> 0x0100 }
            r4.<init>(r6, r3, r0)     // Catch:{ all -> 0x0100 }
            r0 = r4
            goto L_0x0102
        L_0x0100:
            r0 = move-exception
            goto L_0x0109
        L_0x0102:
            r1.close()
            r2.o()
            return r0
        L_0x0109:
            r1.close()
            r2.o()
            throw r0
        L_0x0110:
            java.lang.Object r1 = r0.c
            bsc r1 = (defpackage.bsc) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x012b }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x012b }
            asc r0 = (defpackage.asc) r0     // Catch:{ all -> 0x012b }
            r1.c0(r0)     // Catch:{ all -> 0x012b }
            r2.r()     // Catch:{ all -> 0x012b }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x012b }
            r2.l()
            return r0
        L_0x012b:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x0130:
            java.lang.Object r1 = r0.c
            oga r1 = (defpackage.oga) r1
            i6d r1 = r1.a
            java.lang.Object r0 = r0.b
            d7d r0 = (defpackage.d7d) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "chat_id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r3 = "message_id"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x01c4 }
            java.lang.String r4 = "time"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x01c4 }
            java.lang.String r5 = "fcm"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x01c4 }
            java.lang.String r6 = "drop_reason"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x01c4 }
            boolean r7 = r1.moveToFirst()     // Catch:{ all -> 0x01c4 }
            if (r7 == 0) goto L_0x01c6
            long r9 = r1.getLong(r0)     // Catch:{ all -> 0x01c4 }
            long r11 = r1.getLong(r3)     // Catch:{ all -> 0x01c4 }
            long r13 = r1.getLong(r4)     // Catch:{ all -> 0x01c4 }
            boolean r0 = r1.isNull(r5)     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0177
            r0 = r2
            goto L_0x017f
        L_0x0177:
            int r0 = r1.getInt(r5)     // Catch:{ all -> 0x01c4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c4 }
        L_0x017f:
            r3 = 0
            if (r0 != 0) goto L_0x0184
            r15 = r2
            goto L_0x0192
        L_0x0184:
            int r0 = r0.intValue()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x018c
            r0 = 1
            goto L_0x018d
        L_0x018c:
            r0 = r3
        L_0x018d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01c4 }
            r15 = r0
        L_0x0192:
            boolean r0 = r1.isNull(r6)     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x019a
            r0 = r2
            goto L_0x019e
        L_0x019a:
            java.lang.String r0 = r1.getString(r6)     // Catch:{ all -> 0x01c4 }
        L_0x019e:
            cd4 r4 = defpackage.hx4.b     // Catch:{ all -> 0x01c4 }
            r4.getClass()     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x01a8
        L_0x01a5:
            r16 = r2
            goto L_0x01bd
        L_0x01a8:
            hx4[] r4 = defpackage.hx4.c     // Catch:{ all -> 0x01c4 }
            int r5 = r4.length     // Catch:{ all -> 0x01c4 }
        L_0x01ab:
            if (r3 >= r5) goto L_0x01a5
            r6 = r4[r3]     // Catch:{ all -> 0x01c4 }
            java.lang.String r7 = r6.a     // Catch:{ all -> 0x01c4 }
            boolean r7 = kotlin.text.StringsKt__StringsJVMKt.equals(r7, r0, true)     // Catch:{ all -> 0x01c4 }
            if (r7 == 0) goto L_0x01ba
            r16 = r6
            goto L_0x01bd
        L_0x01ba:
            int r3 = r3 + 1
            goto L_0x01ab
        L_0x01bd:
            mga r2 = new mga     // Catch:{ all -> 0x01c4 }
            r8 = r2
            r8.<init>(r9, r11, r13, r15, r16)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c6
        L_0x01c4:
            r0 = move-exception
            goto L_0x01ca
        L_0x01c6:
            r1.close()
            return r2
        L_0x01ca:
            r1.close()
            throw r0
        L_0x01ce:
            java.lang.Object r1 = r0.c
            lfa r1 = (defpackage.lfa) r1
            i6d r1 = r1.a
            java.lang.Object r0 = r0.b
            d7d r0 = (defpackage.d7d) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "chat_id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x0209 }
            java.lang.String r2 = "mark"
            int r2 = defpackage.kne.u(r1, r2)     // Catch:{ all -> 0x0209 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0209 }
            int r4 = r1.getCount()     // Catch:{ all -> 0x0209 }
            r3.<init>(r4)     // Catch:{ all -> 0x0209 }
        L_0x01f2:
            boolean r4 = r1.moveToNext()     // Catch:{ all -> 0x0209 }
            if (r4 == 0) goto L_0x020b
            long r4 = r1.getLong(r0)     // Catch:{ all -> 0x0209 }
            long r6 = r1.getLong(r2)     // Catch:{ all -> 0x0209 }
            uea r8 = new uea     // Catch:{ all -> 0x0209 }
            r8.<init>(r4, r6)     // Catch:{ all -> 0x0209 }
            r3.add(r8)     // Catch:{ all -> 0x0209 }
            goto L_0x01f2
        L_0x0209:
            r0 = move-exception
            goto L_0x020f
        L_0x020b:
            r1.close()
            return r3
        L_0x020f:
            r1.close()
            throw r0
        L_0x0213:
            java.lang.Object r1 = r0.c
            gfa r1 = (defpackage.gfa) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x022d }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x022d }
            mj5 r0 = (defpackage.mj5) r0     // Catch:{ all -> 0x022d }
            r1.c0(r0)     // Catch:{ all -> 0x022d }
            r2.r()     // Catch:{ all -> 0x022d }
            r2.l()
            r0 = 0
            return r0
        L_0x022d:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x0232:
            java.lang.Object r1 = r0.c
            gfa r1 = (defpackage.gfa) r1
            i6d r1 = r1.a
            java.lang.Object r0 = r0.b
            d7d r0 = (defpackage.d7d) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "chat_id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x033e }
            java.lang.String r3 = "message_id"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x033e }
            java.lang.String r4 = "type"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x033e }
            java.lang.String r5 = "chat_title"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x033e }
            java.lang.String r6 = "sender_user_name"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x033e }
            java.lang.String r7 = "sender_user_id"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x033e }
            java.lang.String r8 = "time"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x033e }
            java.lang.String r9 = "text"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x033e }
            java.lang.String r10 = "push_id"
            int r10 = defpackage.kne.u(r1, r10)     // Catch:{ all -> 0x033e }
            java.lang.String r11 = "event_key"
            int r11 = defpackage.kne.u(r1, r11)     // Catch:{ all -> 0x033e }
            java.lang.String r12 = "large_image_url"
            int r12 = defpackage.kne.u(r1, r12)     // Catch:{ all -> 0x033e }
            java.lang.String r13 = "fire_m"
            int r13 = defpackage.kne.u(r1, r13)     // Catch:{ all -> 0x033e }
            java.lang.String r14 = "has_any_error"
            int r14 = defpackage.kne.u(r1, r14)     // Catch:{ all -> 0x033e }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x033e }
            int r2 = r1.getCount()     // Catch:{ all -> 0x033e }
            r15.<init>(r2)     // Catch:{ all -> 0x033e }
        L_0x0298:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x033e }
            if (r2 == 0) goto L_0x0340
            long r17 = r1.getLong(r0)     // Catch:{ all -> 0x033e }
            long r19 = r1.getLong(r3)     // Catch:{ all -> 0x033e }
            boolean r2 = r1.isNull(r4)     // Catch:{ all -> 0x033e }
            if (r2 == 0) goto L_0x02ae
            r2 = 0
            goto L_0x02b2
        L_0x02ae:
            java.lang.String r2 = r1.getString(r4)     // Catch:{ all -> 0x033e }
        L_0x02b2:
            ejd r16 = defpackage.pj5.b     // Catch:{ all -> 0x033e }
            r16.getClass()     // Catch:{ all -> 0x033e }
            pj5 r21 = defpackage.ejd.b(r2)     // Catch:{ all -> 0x033e }
            boolean r2 = r1.isNull(r5)     // Catch:{ all -> 0x033e }
            if (r2 == 0) goto L_0x02c4
            r22 = 0
            goto L_0x02ca
        L_0x02c4:
            java.lang.String r2 = r1.getString(r5)     // Catch:{ all -> 0x033e }
            r22 = r2
        L_0x02ca:
            boolean r2 = r1.isNull(r6)     // Catch:{ all -> 0x033e }
            if (r2 == 0) goto L_0x02d3
            r23 = 0
            goto L_0x02d9
        L_0x02d3:
            java.lang.String r2 = r1.getString(r6)     // Catch:{ all -> 0x033e }
            r23 = r2
        L_0x02d9:
            long r24 = r1.getLong(r7)     // Catch:{ all -> 0x033e }
            long r26 = r1.getLong(r8)     // Catch:{ all -> 0x033e }
            boolean r2 = r1.isNull(r9)     // Catch:{ all -> 0x033e }
            if (r2 == 0) goto L_0x02ea
            r28 = 0
            goto L_0x02f0
        L_0x02ea:
            java.lang.String r2 = r1.getString(r9)     // Catch:{ all -> 0x033e }
            r28 = r2
        L_0x02f0:
            long r29 = r1.getLong(r10)     // Catch:{ all -> 0x033e }
            boolean r2 = r1.isNull(r11)     // Catch:{ all -> 0x033e }
            if (r2 == 0) goto L_0x02fd
            r31 = 0
            goto L_0x0303
        L_0x02fd:
            java.lang.String r2 = r1.getString(r11)     // Catch:{ all -> 0x033e }
            r31 = r2
        L_0x0303:
            boolean r2 = r1.isNull(r12)     // Catch:{ all -> 0x033e }
            if (r2 == 0) goto L_0x030c
            r32 = 0
            goto L_0x0312
        L_0x030c:
            java.lang.String r2 = r1.getString(r12)     // Catch:{ all -> 0x033e }
            r32 = r2
        L_0x0312:
            int r2 = r1.getInt(r13)     // Catch:{ all -> 0x033e }
            r16 = 0
            r33 = 1
            if (r2 == 0) goto L_0x031f
            r2 = r33
            goto L_0x0321
        L_0x031f:
            r2 = r16
        L_0x0321:
            int r34 = r1.getInt(r14)     // Catch:{ all -> 0x033e }
            r35 = r0
            if (r34 == 0) goto L_0x032c
            r34 = r33
            goto L_0x032e
        L_0x032c:
            r34 = r16
        L_0x032e:
            mj5 r0 = new mj5     // Catch:{ all -> 0x033e }
            r16 = r0
            r33 = r2
            r16.<init>(r17, r19, r21, r22, r23, r24, r26, r28, r29, r31, r32, r33, r34)     // Catch:{ all -> 0x033e }
            r15.add(r0)     // Catch:{ all -> 0x033e }
            r0 = r35
            goto L_0x0298
        L_0x033e:
            r0 = move-exception
            goto L_0x0344
        L_0x0340:
            r1.close()
            return r15
        L_0x0344:
            r1.close()
            throw r0
        L_0x0348:
            java.lang.Object r0 = r0.c
            r1 = r0
            xx r1 = (defpackage.xx) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.v
            r2 = 1
            r0.set(r2)
            r0 = 10
            r3 = 0
            android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x0363 }
            r1.a()     // Catch:{ all -> 0x0363 }
            android.os.Binder.flushPendingCommands()     // Catch:{ all -> 0x0363 }
            r1.b(r3)
            return r3
        L_0x0363:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.o     // Catch:{ all -> 0x036a }
            r4.set(r2)     // Catch:{ all -> 0x036a }
            throw r0     // Catch:{ all -> 0x036a }
        L_0x036a:
            r0 = move-exception
            r1.b(r3)
            throw r0
        L_0x036f:
            java.lang.Object r1 = r0.c
            xf9 r1 = (defpackage.xf9) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x0389 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0389 }
            sf9 r0 = (defpackage.sf9) r0     // Catch:{ all -> 0x0389 }
            r1.c0(r0)     // Catch:{ all -> 0x0389 }
            r2.r()     // Catch:{ all -> 0x0389 }
            r2.l()
            r0 = 0
            return r0
        L_0x0389:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x038e:
            java.lang.Object r1 = r0.c
            nj5 r1 = (defpackage.nj5) r1
            i6d r1 = r1.a
            java.lang.Object r0 = r0.b
            d7d r0 = (defpackage.d7d) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "chat_id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x03c9 }
            java.lang.String r2 = "last_notify_msg_id"
            int r2 = defpackage.kne.u(r1, r2)     // Catch:{ all -> 0x03c9 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x03c9 }
            int r4 = r1.getCount()     // Catch:{ all -> 0x03c9 }
            r3.<init>(r4)     // Catch:{ all -> 0x03c9 }
        L_0x03b2:
            boolean r4 = r1.moveToNext()     // Catch:{ all -> 0x03c9 }
            if (r4 == 0) goto L_0x03cb
            long r4 = r1.getLong(r0)     // Catch:{ all -> 0x03c9 }
            long r6 = r1.getLong(r2)     // Catch:{ all -> 0x03c9 }
            oj5 r8 = new oj5     // Catch:{ all -> 0x03c9 }
            r8.<init>(r4, r6)     // Catch:{ all -> 0x03c9 }
            r3.add(r8)     // Catch:{ all -> 0x03c9 }
            goto L_0x03b2
        L_0x03c9:
            r0 = move-exception
            goto L_0x03cf
        L_0x03cb:
            r1.close()
            return r3
        L_0x03cf:
            r1.close()
            throw r0
        L_0x03d3:
            java.lang.Object r1 = r0.c
            nj5 r1 = (defpackage.nj5) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x03ed }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x03ed }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x03ed }
            r1.a0(r0)     // Catch:{ all -> 0x03ed }
            r2.r()     // Catch:{ all -> 0x03ed }
            r2.l()
            r0 = 0
            return r0
        L_0x03ed:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x03f2:
            java.lang.Object r1 = r0.c
            bj5 r1 = (defpackage.bj5) r1
            i6d r1 = r1.a
            java.lang.Object r0 = r0.b
            d7d r0 = (defpackage.d7d) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "push_id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x050a }
            java.lang.String r3 = "chat_id"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x050a }
            java.lang.String r4 = "msg_id"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x050a }
            java.lang.String r5 = "analytics_status"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x050a }
            java.lang.String r6 = "suid"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x050a }
            java.lang.String r7 = "content_length"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x050a }
            java.lang.String r8 = "sent_time"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x050a }
            java.lang.String r9 = "event_key"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x050a }
            java.lang.String r10 = "fcm_sent_time"
            int r10 = defpackage.kne.u(r1, r10)     // Catch:{ all -> 0x050a }
            java.lang.String r11 = "received_time"
            int r11 = defpackage.kne.u(r1, r11)     // Catch:{ all -> 0x050a }
            java.lang.String r12 = "push_type"
            int r12 = defpackage.kne.u(r1, r12)     // Catch:{ all -> 0x050a }
            java.lang.String r13 = "time"
            int r13 = defpackage.kne.u(r1, r13)     // Catch:{ all -> 0x050a }
            java.lang.String r14 = "created_time"
            int r14 = defpackage.kne.u(r1, r14)     // Catch:{ all -> 0x050a }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x050a }
            int r2 = r1.getCount()     // Catch:{ all -> 0x050a }
            r15.<init>(r2)     // Catch:{ all -> 0x050a }
        L_0x0458:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x050a }
            if (r2 == 0) goto L_0x050c
            long r17 = r1.getLong(r0)     // Catch:{ all -> 0x050a }
            long r19 = r1.getLong(r3)     // Catch:{ all -> 0x050a }
            long r21 = r1.getLong(r4)     // Catch:{ all -> 0x050a }
            int r2 = r1.getInt(r5)     // Catch:{ all -> 0x050a }
            djd r16 = defpackage.hj5.b     // Catch:{ all -> 0x050a }
            r16.getClass()     // Catch:{ all -> 0x050a }
            r38 = r0
            hj5[] r0 = defpackage.hj5.values()     // Catch:{ all -> 0x050a }
            r39 = r3
            int r3 = r0.length     // Catch:{ all -> 0x050a }
            r16 = 0
            r40 = r4
            r4 = r16
        L_0x0482:
            if (r4 >= r3) goto L_0x0496
            r16 = r3
            r3 = r0[r4]     // Catch:{ all -> 0x050a }
            r23 = r0
            int r0 = r3.a     // Catch:{ all -> 0x050a }
            if (r0 != r2) goto L_0x048f
            goto L_0x0497
        L_0x048f:
            int r4 = r4 + 1
            r3 = r16
            r0 = r23
            goto L_0x0482
        L_0x0496:
            r3 = 0
        L_0x0497:
            if (r3 != 0) goto L_0x049e
            hj5 r0 = defpackage.hj5.UNDEFINED     // Catch:{ all -> 0x050a }
            r23 = r0
            goto L_0x04a0
        L_0x049e:
            r23 = r3
        L_0x04a0:
            boolean r0 = r1.isNull(r6)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x04a9
            r24 = 0
            goto L_0x04b3
        L_0x04a9:
            long r2 = r1.getLong(r6)     // Catch:{ all -> 0x050a }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x050a }
            r24 = r0
        L_0x04b3:
            long r25 = r1.getLong(r7)     // Catch:{ all -> 0x050a }
            boolean r0 = r1.isNull(r8)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x04c0
            r27 = 0
            goto L_0x04ca
        L_0x04c0:
            long r2 = r1.getLong(r8)     // Catch:{ all -> 0x050a }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x050a }
            r27 = r0
        L_0x04ca:
            boolean r0 = r1.isNull(r9)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x04d3
            r28 = 0
            goto L_0x04d9
        L_0x04d3:
            java.lang.String r0 = r1.getString(r9)     // Catch:{ all -> 0x050a }
            r28 = r0
        L_0x04d9:
            long r29 = r1.getLong(r10)     // Catch:{ all -> 0x050a }
            long r31 = r1.getLong(r11)     // Catch:{ all -> 0x050a }
            boolean r0 = r1.isNull(r12)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x04ea
            r33 = 0
            goto L_0x04f0
        L_0x04ea:
            java.lang.String r0 = r1.getString(r12)     // Catch:{ all -> 0x050a }
            r33 = r0
        L_0x04f0:
            long r34 = r1.getLong(r13)     // Catch:{ all -> 0x050a }
            long r36 = r1.getLong(r14)     // Catch:{ all -> 0x050a }
            cj5 r0 = new cj5     // Catch:{ all -> 0x050a }
            r16 = r0
            r16.<init>(r17, r19, r21, r23, r24, r25, r27, r28, r29, r31, r33, r34, r36)     // Catch:{ all -> 0x050a }
            r15.add(r0)     // Catch:{ all -> 0x050a }
            r0 = r38
            r3 = r39
            r4 = r40
            goto L_0x0458
        L_0x050a:
            r0 = move-exception
            goto L_0x0510
        L_0x050c:
            r1.close()
            return r15
        L_0x0510:
            r1.close()
            throw r0
        L_0x0514:
            java.lang.Object r1 = r0.c
            bj5 r1 = (defpackage.bj5) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x052e }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x052e }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x052e }
            r1.a0(r0)     // Catch:{ all -> 0x052e }
            r2.r()     // Catch:{ all -> 0x052e }
            r2.l()
            r0 = 0
            return r0
        L_0x052e:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x0533:
            java.lang.Object r1 = r0.c
            xi5 r1 = (defpackage.xi5) r1
            i6d r1 = r1.a
            java.lang.Object r0 = r0.b
            d7d r0 = (defpackage.d7d) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0566 }
            int r3 = r1.getCount()     // Catch:{ all -> 0x0566 }
            r0.<init>(r3)     // Catch:{ all -> 0x0566 }
        L_0x054b:
            boolean r3 = r1.moveToNext()     // Catch:{ all -> 0x0566 }
            if (r3 == 0) goto L_0x0568
            r3 = 0
            boolean r4 = r1.isNull(r3)     // Catch:{ all -> 0x0566 }
            if (r4 == 0) goto L_0x055a
            r3 = r2
            goto L_0x0562
        L_0x055a:
            long r3 = r1.getLong(r3)     // Catch:{ all -> 0x0566 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0566 }
        L_0x0562:
            r0.add(r3)     // Catch:{ all -> 0x0566 }
            goto L_0x054b
        L_0x0566:
            r0 = move-exception
            goto L_0x056c
        L_0x0568:
            r1.close()
            return r0
        L_0x056c:
            r1.close()
            throw r0
        L_0x0570:
            java.lang.Object r1 = r0.c
            oi5 r1 = (defpackage.oi5) r1
            i6d r1 = r1.a
            java.lang.Object r0 = r0.b
            d7d r0 = (defpackage.d7d) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05a3 }
            int r3 = r1.getCount()     // Catch:{ all -> 0x05a3 }
            r0.<init>(r3)     // Catch:{ all -> 0x05a3 }
        L_0x0588:
            boolean r3 = r1.moveToNext()     // Catch:{ all -> 0x05a3 }
            if (r3 == 0) goto L_0x05a5
            r3 = 0
            boolean r4 = r1.isNull(r3)     // Catch:{ all -> 0x05a3 }
            if (r4 == 0) goto L_0x0597
            r3 = r2
            goto L_0x059f
        L_0x0597:
            long r3 = r1.getLong(r3)     // Catch:{ all -> 0x05a3 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x05a3 }
        L_0x059f:
            r0.add(r3)     // Catch:{ all -> 0x05a3 }
            goto L_0x0588
        L_0x05a3:
            r0 = move-exception
            goto L_0x05a9
        L_0x05a5:
            r1.close()
            return r0
        L_0x05a9:
            r1.close()
            throw r0
        L_0x05ad:
            java.lang.Object r1 = r0.c
            iu4 r1 = (defpackage.iu4) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x05c7 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x05c7 }
            cu4 r0 = (defpackage.cu4) r0     // Catch:{ all -> 0x05c7 }
            r1.c0(r0)     // Catch:{ all -> 0x05c7 }
            r2.r()     // Catch:{ all -> 0x05c7 }
            r2.l()
            r0 = 0
            return r0
        L_0x05c7:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x05cc:
            java.lang.Object r1 = r0.c
            xe4 r1 = (defpackage.xe4) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x05e6 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x05e6 }
            ye4 r0 = (defpackage.ye4) r0     // Catch:{ all -> 0x05e6 }
            r1.c0(r0)     // Catch:{ all -> 0x05e6 }
            r2.r()     // Catch:{ all -> 0x05e6 }
            r2.l()
            r0 = 0
            return r0
        L_0x05e6:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x05eb:
            java.lang.Object r1 = r0.c
            sq3 r1 = (defpackage.sq3) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x0605 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0605 }
            tq3 r0 = (defpackage.tq3) r0     // Catch:{ all -> 0x0605 }
            r1.c0(r0)     // Catch:{ all -> 0x0605 }
            r2.r()     // Catch:{ all -> 0x0605 }
            r2.l()
            r0 = 0
            return r0
        L_0x0605:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x060a:
            java.lang.Object r1 = r0.c
            jc2 r1 = (defpackage.jc2) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x0624 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0624 }
            kc2 r0 = (defpackage.kc2) r0     // Catch:{ all -> 0x0624 }
            r1.c0(r0)     // Catch:{ all -> 0x0624 }
            r2.r()     // Catch:{ all -> 0x0624 }
            r2.l()
            r0 = 0
            return r0
        L_0x0624:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x0629:
            java.lang.String r1 = "DELETE FROM chat_location WHERE message_id IN ("
            java.lang.StringBuilder r1 = defpackage.tr1.o(r1)
            r2 = 1
            java.lang.Object r3 = r0.b
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0638
            r4 = r2
            goto L_0x063c
        L_0x0638:
            int r4 = r3.size()
        L_0x063c:
            defpackage.n79.c(r1, r4)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Object r0 = r0.c
            jc2 r0 = (defpackage.jc2) r0
            i6d r4 = r0.a
            gf6 r1 = r4.d(r1)
            if (r3 != 0) goto L_0x0658
            r1.X(r2)
            goto L_0x0678
        L_0x0658:
            java.util.Iterator r3 = r3.iterator()
        L_0x065c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0678
            java.lang.Object r4 = r3.next()
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x066e
            r1.X(r2)
            goto L_0x0675
        L_0x066e:
            long r4 = r4.longValue()
            r1.k(r2, r4)
        L_0x0675:
            int r2 = r2 + 1
            goto L_0x065c
        L_0x0678:
            i6d r2 = r0.a
            r2.c()
            r1.n()     // Catch:{ all -> 0x0688 }
            r2.r()     // Catch:{ all -> 0x0688 }
            r2.l()
            r0 = 0
            return r0
        L_0x0688:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x068d:
            java.lang.Object r1 = r0.c
            fc1 r1 = (defpackage.fc1) r1
            mi r2 = r1.b
            i6d r1 = r1.a
            gf6 r3 = r2.E()
            r4 = 1
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x06a4
            r3.X(r4)
            goto L_0x06a7
        L_0x06a4:
            r3.h(r4, r0)
        L_0x06a7:
            r1.c()     // Catch:{ all -> 0x06bd }
            r3.n()     // Catch:{ all -> 0x06b8 }
            r1.r()     // Catch:{ all -> 0x06b8 }
            r1.l()     // Catch:{ all -> 0x06bd }
            r2.S(r3)
            r0 = 0
            return r0
        L_0x06b8:
            r0 = move-exception
            r1.l()     // Catch:{ all -> 0x06bd }
            throw r0     // Catch:{ all -> 0x06bd }
        L_0x06bd:
            r0 = move-exception
            r2.S(r3)
            throw r0
        L_0x06c2:
            java.lang.Object r1 = r0.c
            ok r1 = (defpackage.ok) r1
            i6d r1 = r1.a
            java.lang.Object r0 = r0.b
            r2 = r0
            d7d r2 = (defpackage.d7d) r2
            r0 = 0
            android.database.Cursor r1 = r1.o(r2, r0)
            java.lang.String r3 = "id"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x0750 }
            java.lang.String r4 = "name"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x0750 }
            java.lang.String r5 = "icon_url"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x0750 }
            java.lang.String r6 = "icon_lottie_url"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x0750 }
            java.lang.String r7 = "update_time"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x0750 }
            java.lang.String r8 = "animoji_ids"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x0750 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0750 }
            int r10 = r1.getCount()     // Catch:{ all -> 0x0750 }
            r9.<init>(r10)     // Catch:{ all -> 0x0750 }
        L_0x06ff:
            boolean r10 = r1.moveToNext()     // Catch:{ all -> 0x0750 }
            if (r10 == 0) goto L_0x0752
            long r12 = r1.getLong(r3)     // Catch:{ all -> 0x0750 }
            boolean r10 = r1.isNull(r4)     // Catch:{ all -> 0x0750 }
            if (r10 == 0) goto L_0x0711
            r14 = r0
            goto L_0x0716
        L_0x0711:
            java.lang.String r10 = r1.getString(r4)     // Catch:{ all -> 0x0750 }
            r14 = r10
        L_0x0716:
            boolean r10 = r1.isNull(r5)     // Catch:{ all -> 0x0750 }
            if (r10 == 0) goto L_0x071e
            r15 = r0
            goto L_0x0723
        L_0x071e:
            java.lang.String r10 = r1.getString(r5)     // Catch:{ all -> 0x0750 }
            r15 = r10
        L_0x0723:
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x0750 }
            if (r10 == 0) goto L_0x072c
            r16 = r0
            goto L_0x0732
        L_0x072c:
            java.lang.String r10 = r1.getString(r6)     // Catch:{ all -> 0x0750 }
            r16 = r10
        L_0x0732:
            long r17 = r1.getLong(r7)     // Catch:{ all -> 0x0750 }
            boolean r10 = r1.isNull(r8)     // Catch:{ all -> 0x0750 }
            if (r10 == 0) goto L_0x073e
            r10 = r0
            goto L_0x0742
        L_0x073e:
            java.lang.String r10 = r1.getString(r8)     // Catch:{ all -> 0x0750 }
        L_0x0742:
            java.util.ArrayList r19 = defpackage.vzg.J(r10)     // Catch:{ all -> 0x0750 }
            nk r10 = new nk     // Catch:{ all -> 0x0750 }
            r11 = r10
            r11.<init>(r12, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0750 }
            r9.add(r10)     // Catch:{ all -> 0x0750 }
            goto L_0x06ff
        L_0x0750:
            r0 = move-exception
            goto L_0x0759
        L_0x0752:
            r1.close()
            r2.o()
            return r9
        L_0x0759:
            r1.close()
            r2.o()
            throw r0
        L_0x0760:
            java.lang.Object r1 = r0.c
            ok r1 = (defpackage.ok) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x077b }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x077b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x077b }
            r1.a0(r0)     // Catch:{ all -> 0x077b }
            r2.r()     // Catch:{ all -> 0x077b }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x077b }
            r2.l()
            return r0
        L_0x077b:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x0780:
            java.lang.Object r1 = r0.c
            pi r1 = (defpackage.pi) r1
            i6d r2 = r1.a
            r2.c()
            li r1 = r1.b     // Catch:{ all -> 0x079b }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x079b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x079b }
            r1.a0(r0)     // Catch:{ all -> 0x079b }
            r2.r()     // Catch:{ all -> 0x079b }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x079b }
            r2.l()
            return r0
        L_0x079b:
            r0 = move-exception
            r2.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni.call():java.lang.Object");
    }

    public void finalize() {
        switch (this.a) {
            case 9:
                ((d7d) this.b).o();
                return;
            case 10:
                ((d7d) this.b).o();
                return;
            case 12:
                ((d7d) this.b).o();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((d7d) this.b).o();
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((d7d) this.b).o();
                return;
            case 19:
                ((d7d) this.b).o();
                return;
            case 20:
                ((d7d) this.b).o();
                return;
            case 26:
                ((d7d) this.b).o();
                return;
            case 28:
                ((d7d) this.b).o();
                return;
            default:
                super.finalize();
                return;
        }
    }

    public ni(xx xxVar) {
        this.a = 16;
        this.c = xxVar;
    }
}
