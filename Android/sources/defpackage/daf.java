package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.util.HandledException;

/* renamed from: daf  reason: default package */
public final class daf implements uu3 {
    public String a;
    public final String b;
    public final Context c;
    public final yj9 d;
    public final lfd e;
    public final doa f;
    public final epa g;
    public final s74 h;
    public final m95 i;

    public daf(Context context, yj9 yj9, lfd lfd, doa doa, epa epa, s74 s74, jtb jtb, m95 m95) {
        this.b = context.getString(tmc.tt_contact_account_type);
        this.c = context;
        this.d = yj9;
        this.e = lfd;
        this.f = doa;
        this.g = epa;
        this.h = s74;
        this.i = m95;
    }

    public static Uri c(Uri uri) {
        return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
    }

    public final void a(ArrayList arrayList) {
        List list;
        List r = cjf.r(arrayList, new dre(15), new dre(16));
        km3 km3 = (km3) this.d.a.getValue();
        if (km3 != null) {
            list = km3.s();
        } else {
            z68.e("yj9", "contactController is null");
            list = Collections.emptyList();
        }
        List r2 = cjf.r(list, new uqe(2, r), new dre(17));
        z68.c("daf", "onPhonebookUpdated: phones=%s, serverPhones=%s, contactIds=%s", Integer.valueOf(arrayList.size()), Integer.valueOf(r.size()), Integer.valueOf(r2.size()));
        if (!r2.isEmpty()) {
            b(r2);
        }
    }

    public final void b(Collection collection) {
        z68.c("daf", "sync: count=%s", Integer.valueOf(collection.size()));
        if (!collection.isEmpty()) {
            this.e.c(new s6e(11, this, collection));
        }
    }

    public final Uri d() {
        return ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.a).appendQueryParameter("account_type", this.b).build();
    }

    public final void e(vk3 vk3, String str, String str2, String str3) {
        Context context = this.c;
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList arrayList = new ArrayList();
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(c(ContactsContract.RawContacts.CONTENT_URI)).withValue("account_name", this.a);
        String str4 = this.b;
        arrayList.add(withValue.withValue("account_type", str4).withValue("sync1", Long.valueOf(vk3.r())).build());
        arrayList.add(ContentProviderOperation.newInsert(c(ContactsContract.Settings.CONTENT_URI)).withValue("account_name", this.a).withValue("account_type", str4).withValue("ungrouped_visible", 1).build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        arrayList.add(ContentProviderOperation.newInsert(c(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
        arrayList.add(ContentProviderOperation.newInsert(c(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str3).withValue("data2", 2).build());
        arrayList.add(ContentProviderOperation.newInsert(c(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", context.getString(tmc.tt_contact_mimetype)).withValue("data1", Long.valueOf(vk3.r())).withValue("data2", Long.valueOf(vk3.s())).withValue("data3", vk3.f()).build());
        try {
            contentResolver.applyBatch("com.android.contacts", arrayList);
        } catch (Exception e2) {
            z68.f("daf", "Exception when add for contact our mime type", e2);
            ((uta) this.i).c(new HandledException(e2), true);
        }
    }

    public final void f(Set set) {
        z68.c("daf", "removeContacts: count=%s", Integer.valueOf(set.size()));
        if (!set.isEmpty()) {
            try {
                z68.c("daf", "removeContacts: deleted count=%s", Integer.valueOf(this.c.getContentResolver().delete(d(), set.size() == 0 ? null : String.format("%1$s IN (%2$s)", new Object[]{"sync1", cvg.E(set)}), (String[]) null)));
            } catch (Exception e2) {
                z68.f("daf", "removeContacts exception", e2);
                ((uta) this.i).c(new HandledException(e2), true);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x054d A[SYNTHETIC, Splitter:B:238:0x054d] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0556 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(java.util.Collection r35) {
        /*
            r34 = this;
            r1 = r34
            r2 = 0
            doa r0 = r1.f
            boolean r4 = r0.e()
            java.lang.String r5 = "daf"
            if (r4 != 0) goto L_0x0013
            java.lang.String r0 = "syncWorker: not authorized, return"
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            return
        L_0x0013:
            epa r4 = r1.g
            kotlin.Lazy r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            edb r4 = (defpackage.edb) r4
            java.lang.String[] r6 = defpackage.edb.g
            boolean r4 = r4.b(r6)
            if (r4 != 0) goto L_0x002b
            java.lang.String r0 = "syncWorker: no permissions, return"
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            return
        L_0x002b:
            boolean r4 = r0.e()
            r6 = 0
            if (r4 != 0) goto L_0x0034
            r0 = r6
            goto L_0x0042
        L_0x0034:
            jtb r0 = r0.c()
            ltb r0 = (defpackage.ltb) r0
            u80 r0 = r0.d
            java.lang.String r4 = "auth.account.name"
            java.lang.String r0 = r0.f(r4, r6)
        L_0x0042:
            r1.a = r0
            boolean r0 = defpackage.cvg.A(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "syncWorker: accountName empty, return"
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            return
        L_0x0050:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r4 = r35.iterator()
        L_0x0059:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00a4
            java.lang.Object r7 = r4.next()
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            yj9 r9 = r1.d
            kotlin.Lazy r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            km3 r9 = (defpackage.km3) r9
            if (r9 == 0) goto L_0x007a
            vk3 r7 = r9.p(r7, r2)
            goto L_0x0082
        L_0x007a:
            java.lang.String r7 = "yj9"
            java.lang.String r8 = "contact is null"
            defpackage.z68.f(r7, r8, r6)
            r7 = r6
        L_0x0082:
            if (r7 == 0) goto L_0x0059
            boolean r8 = r7.C()
            if (r8 == 0) goto L_0x0059
            vm3 r8 = r7.a
            um3 r8 = r8.c
            sm3 r8 = r8.i
            if (r8 != 0) goto L_0x0059
            boolean r8 = r7.B()
            if (r8 != 0) goto L_0x0059
            long r8 = r7.r()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r0.put(r8, r7)
            goto L_0x0059
        L_0x00a4:
            android.content.Context r4 = r1.c
            android.content.ContentResolver r7 = r4.getContentResolver()
            java.lang.String r13 = "sync1"
            java.lang.String r14 = "_id"
            java.lang.String r15 = "contact_id"
            java.lang.String[] r9 = new java.lang.String[]{r13, r14, r15}
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            android.net.Uri r8 = r34.d()
            if (r35 == 0) goto L_0x00d5
            int r10 = r35.size()
            if (r10 != 0) goto L_0x00c6
            goto L_0x00d5
        L_0x00c6:
            java.lang.String r10 = defpackage.cvg.E(r35)
            java.lang.Object[] r10 = new java.lang.Object[]{r13, r10}
            java.lang.String r11 = "%1$s IN (%2$s)"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            goto L_0x00d6
        L_0x00d5:
            r10 = r6
        L_0x00d6:
            r11 = 0
            r16 = 0
            r3 = r12
            r12 = r16
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x0128
            java.lang.String r8 = "getRawContacts: count=%s"
            int r9 = r7.getCount()     // Catch:{ all -> 0x011c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x011c }
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x011c }
            defpackage.z68.c(r5, r8, r9)     // Catch:{ all -> 0x011c }
            int r8 = r7.getColumnIndex(r13)     // Catch:{ all -> 0x011c }
            int r9 = r7.getColumnIndex(r14)     // Catch:{ all -> 0x011c }
            int r10 = r7.getColumnIndex(r15)     // Catch:{ all -> 0x011c }
        L_0x00ff:
            boolean r11 = r7.moveToNext()     // Catch:{ all -> 0x011c }
            if (r11 == 0) goto L_0x0128
            caf r11 = new caf     // Catch:{ all -> 0x011c }
            long r18 = r7.getLong(r8)     // Catch:{ all -> 0x011c }
            long r20 = r7.getLong(r9)     // Catch:{ all -> 0x011c }
            long r22 = r7.getLong(r10)     // Catch:{ all -> 0x011c }
            r17 = r11
            r17.<init>(r18, r20, r22)     // Catch:{ all -> 0x011c }
            r3.add(r11)     // Catch:{ all -> 0x011c }
            goto L_0x00ff
        L_0x011c:
            r0 = move-exception
            r1 = r0
            r7.close()     // Catch:{ all -> 0x0122 }
            goto L_0x0127
        L_0x0122:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L_0x0127:
            throw r1
        L_0x0128:
            if (r7 == 0) goto L_0x012d
            r7.close()
        L_0x012d:
            java.util.Collection r7 = r0.values()
            java.util.HashSet r8 = new java.util.HashSet
            r9 = 0
            if (r7 == 0) goto L_0x0171
            boolean r11 = r7 instanceof java.util.Collection
            if (r11 == 0) goto L_0x0145
            r11 = r7
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0145
            goto L_0x0171
        L_0x0145:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x014e:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x0175
            java.lang.Object r12 = r7.next()
            vk3 r12 = (defpackage.vk3) r12     // Catch:{ all -> 0x016a }
            long r12 = r12.s()     // Catch:{ all -> 0x016a }
            java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x016a }
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x014e
            r11.add(r14)     // Catch:{ all -> 0x016a }
            goto L_0x014e
        L_0x016a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0171:
            java.util.List r11 = java.util.Collections.emptyList()
        L_0x0175:
            r8.<init>(r11)
            s74 r7 = r1.h
            a74 r7 = (defpackage.a74) r7
            c7d r7 = r7.e
            ueb r7 = r7.c()
            r7.getClass()
            java.lang.String r11 = "SELECT phone, server_phone FROM phones"
            d7d r11 = defpackage.d7d.a(r2, r11)
            i6d r7 = r7.a
            r7.b()
            android.database.Cursor r7 = r7.o(r11, r6)
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x01c0 }
            int r13 = r7.getCount()     // Catch:{ all -> 0x01c0 }
            r12.<init>(r13)     // Catch:{ all -> 0x01c0 }
        L_0x019d:
            boolean r13 = r7.moveToNext()     // Catch:{ all -> 0x01c0 }
            if (r13 == 0) goto L_0x01c3
            boolean r13 = r7.isNull(r2)     // Catch:{ all -> 0x01c0 }
            if (r13 == 0) goto L_0x01ac
            r13 = r6
        L_0x01aa:
            r14 = 1
            goto L_0x01b1
        L_0x01ac:
            java.lang.String r13 = r7.getString(r2)     // Catch:{ all -> 0x01c0 }
            goto L_0x01aa
        L_0x01b1:
            long r9 = r7.getLong(r14)     // Catch:{ all -> 0x01c0 }
            rdb r14 = new rdb     // Catch:{ all -> 0x01c0 }
            r14.<init>(r13, r9)     // Catch:{ all -> 0x01c0 }
            r12.add(r14)     // Catch:{ all -> 0x01c0 }
            r9 = 0
            goto L_0x019d
        L_0x01c0:
            r0 = move-exception
            goto L_0x065b
        L_0x01c3:
            r7.close()
            r11.o()
            java.util.ArrayList r7 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r12, 10)
            r7.<init>(r9)
            java.util.Iterator r9 = r12.iterator()
        L_0x01d6:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01f3
            java.lang.Object r10 = r9.next()
            rdb r10 = (defpackage.rdb) r10
            u7b r11 = new u7b
            java.lang.String r12 = r10.a
            long r13 = r10.b
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r11.<init>(r12, r10)
            r7.add(r11)
            goto L_0x01d6
        L_0x01f3:
            int r9 = r7.size()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x0200:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0222
            java.lang.Object r9 = r7.next()
            r11 = r9
            u7b r11 = (defpackage.u7b) r11     // Catch:{ all -> 0x021b }
            java.lang.Object r11 = r11.a     // Catch:{ all -> 0x021b }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x021b }
            u7b r9 = (defpackage.u7b) r9     // Catch:{ all -> 0x021b }
            java.lang.Object r9 = r9.b     // Catch:{ all -> 0x021b }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x021b }
            r10.put(r11, r9)     // Catch:{ all -> 0x021b }
            goto L_0x0200
        L_0x021b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0222:
            m95 r7 = r1.i
            java.util.Collection r9 = defpackage.o54.o(r4, r7)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0231:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x02a4
            java.lang.Object r12 = r9.next()
            wdb r12 = (defpackage.wdb) r12
            java.lang.String r13 = r12.c
            java.lang.Object r13 = r10.get(r13)
            java.lang.Long r13 = (java.lang.Long) r13
            boolean r14 = r8.contains(r13)
            if (r14 == 0) goto L_0x028d
            if (r13 == 0) goto L_0x0252
            long r13 = r13.longValue()
            goto L_0x0254
        L_0x0252:
            r13 = 0
        L_0x0254:
            r12.d = r13
            xdb r6 = new xdb
            r35 = r3
            long r2 = r12.a
            int r15 = r12.b
            r16 = r8
            java.lang.String r8 = r12.c
            r31 = r9
            java.lang.String r9 = r12.e
            r32 = r10
            java.lang.String r10 = r12.f
            r33 = r7
            java.lang.String r7 = r12.g
            int r12 = r12.h
            r18 = 0
            r26 = 0
            r17 = r6
            r20 = r2
            r22 = r15
            r23 = r8
            r24 = r13
            r27 = r9
            r28 = r10
            r29 = r7
            r30 = r12
            r17.<init>(r18, r20, r22, r23, r24, r26, r27, r28, r29, r30)
            r11.add(r6)
            goto L_0x0297
        L_0x028d:
            r35 = r3
            r33 = r7
            r16 = r8
            r31 = r9
            r32 = r10
        L_0x0297:
            r3 = r35
            r8 = r16
            r9 = r31
            r10 = r32
            r7 = r33
            r2 = 0
            r6 = 0
            goto L_0x0231
        L_0x02a4:
            r35 = r3
            r33 = r7
            baf r2 = new baf
            r3 = 0
            r2.<init>(r3)
            java.util.Collections.sort(r11, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r3 = r11.iterator()
        L_0x02ba:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x02d0
            java.lang.Object r6 = r3.next()
            xdb r6 = (defpackage.xdb) r6
            long r7 = r6.w
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r2.put(r7, r6)
            goto L_0x02ba
        L_0x02d0:
            java.util.Collection r2 = r2.values()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Collection r7 = r0.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x02e6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0359
            java.lang.Object r8 = r7.next()
            vk3 r8 = (defpackage.vk3) r8
            boolean r9 = r2 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0300
            r9 = r2
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0300
            goto L_0x0325
        L_0x0300:
            java.util.Iterator r9 = r2.iterator()
        L_0x0304:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0325
            java.lang.Object r10 = r9.next()
            xdb r10 = (defpackage.xdb) r10     // Catch:{ all -> 0x031e }
            long r10 = r10.w     // Catch:{ all -> 0x031e }
            long r12 = r8.s()     // Catch:{ all -> 0x031e }
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x0304
            r3.add(r8)
            goto L_0x02e6
        L_0x031e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0325:
            boolean r9 = r35.isEmpty()
            if (r9 == 0) goto L_0x032c
            goto L_0x02e6
        L_0x032c:
            java.util.Iterator r9 = r35.iterator()
        L_0x0330:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02e6
            java.lang.Object r10 = r9.next()
            caf r10 = (defpackage.caf) r10     // Catch:{ all -> 0x0352 }
            long r10 = r10.a     // Catch:{ all -> 0x0352 }
            long r12 = r8.r()     // Catch:{ all -> 0x0352 }
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x0330
            long r8 = r8.r()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.add(r8)
            goto L_0x02e6
        L_0x0352:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0359:
            java.util.Iterator r7 = r35.iterator()
        L_0x035d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x037f
            java.lang.Object r8 = r7.next()
            caf r8 = (defpackage.caf) r8
            long r9 = r8.a
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            boolean r9 = r0.containsKey(r9)
            if (r9 != 0) goto L_0x035d
            long r8 = r8.a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.add(r8)
            goto L_0x035d
        L_0x037f:
            r1.f(r6)
            int r0 = r3.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r6 = "updateContacts: count=%s"
            defpackage.z68.c(r5, r6, r0)
            java.util.Iterator r3 = r3.iterator()
            r6 = 0
            r7 = 0
        L_0x0399:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0645
            java.lang.Object r0 = r3.next()
            r8 = r0
            vk3 r8 = (defpackage.vk3) r8
            nqd r0 = new nqd
            r9 = 22
            r0.<init>(r9, r8)
            java.util.List r0 = defpackage.cjf.q(r2, r0)
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x03b8
            goto L_0x0399
        L_0x03b8:
            java.util.Iterator r9 = r35.iterator()
        L_0x03bc:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x03db
            java.lang.Object r10 = r9.next()
            r11 = r10
            caf r11 = (defpackage.caf) r11     // Catch:{ all -> 0x03d4 }
            long r11 = r11.a     // Catch:{ all -> 0x03d4 }
            long r13 = r8.r()     // Catch:{ all -> 0x03d4 }
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x03bc
            goto L_0x03dc
        L_0x03d4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x03db:
            r10 = 0
        L_0x03dc:
            caf r10 = (defpackage.caf) r10
            if (r10 == 0) goto L_0x061f
            java.util.Iterator r9 = r0.iterator()
        L_0x03e4:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0402
            java.lang.Object r11 = r9.next()
            r12 = r11
            xdb r12 = (defpackage.xdb) r12     // Catch:{ all -> 0x03fb }
            int r12 = r12.o     // Catch:{ all -> 0x03fb }
            long r12 = (long) r12     // Catch:{ all -> 0x03fb }
            long r14 = r10.c     // Catch:{ all -> 0x03fb }
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x03e4
            goto L_0x0403
        L_0x03fb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0402:
            r11 = 0
        L_0x0403:
            xdb r11 = (defpackage.xdb) r11
            if (r11 != 0) goto L_0x0434
            java.lang.String r9 = "updateContacts: phoneDb for update not found, delete old entry and create it again"
            defpackage.z68.c(r5, r9, new java.lang.Object[0])
            long r9 = r8.r()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.Set r9 = java.util.Collections.singleton(r9)
            r1.f(r9)
            r9 = 0
            java.lang.Object r0 = r0.get(r9)
            xdb r0 = (defpackage.xdb) r0
            java.lang.String r9 = r0.y
            java.lang.String r10 = r0.z
            java.lang.String r0 = r0.v
            r1.e(r8, r9, r10, r0)
            r8 = 1
            int r6 = r6 + r8
            r16 = r2
            r23 = r3
            r2 = r8
            goto L_0x0619
        L_0x0434:
            java.lang.String r9 = r11.y
            java.lang.String r12 = r11.z
            java.lang.String r11 = r11.v
            java.lang.String r13 = "vnd.android.cursor.item/phone_v2"
            java.lang.String r14 = "vnd.android.cursor.item/name"
            android.content.ContentResolver r17 = r4.getContentResolver()
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI
            android.net.Uri r18 = c(r0)
            java.lang.String r15 = "data1"
            r16 = r2
            java.lang.String r2 = "data2"
            r23 = r3
            java.lang.String r3 = "data3"
            java.lang.String r0 = "mimetype"
            java.lang.String[] r19 = new java.lang.String[]{r15, r2, r3, r0}
            java.lang.String r20 = "raw_contact_id = ?"
            r25 = r6
            r24 = r7
            long r6 = r10.b
            java.lang.String r10 = java.lang.String.valueOf(r6)
            java.lang.String[] r21 = new java.lang.String[]{r10}
            r22 = 0
            android.database.Cursor r10 = r17.query(r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0557 }
            if (r10 == 0) goto L_0x04f2
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r26 = 0
            r27 = 0
        L_0x047c:
            boolean r28 = r10.moveToNext()     // Catch:{ all -> 0x04b1 }
            if (r28 == 0) goto L_0x04e5
            int r1 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x04b1 }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x04b1 }
            r28 = r0
            int r0 = defpackage.tmc.tt_contact_mimetype     // Catch:{ all -> 0x04b1 }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x04b1 }
            boolean r0 = defpackage.cvg.c(r1, r0)     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x04bb
            int r0 = r10.getColumnIndex(r15)     // Catch:{ all -> 0x04b1 }
            long r17 = r10.getLong(r0)     // Catch:{ all -> 0x04b1 }
            int r0 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x04b1 }
            long r19 = r10.getLong(r0)     // Catch:{ all -> 0x04b1 }
            int r0 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x04b1 }
            java.lang.String r21 = r10.getString(r0)     // Catch:{ all -> 0x04b1 }
            goto L_0x04e0
        L_0x04b1:
            r0 = move-exception
            r1 = r0
            r17 = r3
            r22 = r13
            r21 = r15
            goto L_0x054b
        L_0x04bb:
            boolean r0 = defpackage.cvg.c(r1, r14)     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x04d2
            int r0 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x04b1 }
            java.lang.String r22 = r10.getString(r0)     // Catch:{ all -> 0x04b1 }
            int r0 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x04b1 }
            java.lang.String r26 = r10.getString(r0)     // Catch:{ all -> 0x04b1 }
            goto L_0x04e0
        L_0x04d2:
            boolean r0 = defpackage.cvg.c(r1, r13)     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x04e0
            int r0 = r10.getColumnIndex(r15)     // Catch:{ all -> 0x04b1 }
            java.lang.String r27 = r10.getString(r0)     // Catch:{ all -> 0x04b1 }
        L_0x04e0:
            r1 = r34
            r0 = r28
            goto L_0x047c
        L_0x04e5:
            r0 = r21
            r1 = r22
            r22 = r13
            r21 = r15
            r15 = r26
            r13 = r27
            goto L_0x04fe
        L_0x04f2:
            r22 = r13
            r21 = r15
            r0 = 0
            r1 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
        L_0x04fe:
            long r26 = r8.r()     // Catch:{ all -> 0x0541 }
            int r17 = (r26 > r17 ? 1 : (r26 == r17 ? 0 : -1))
            if (r17 != 0) goto L_0x053e
            long r17 = r8.s()     // Catch:{ all -> 0x0541 }
            int r17 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r17 != 0) goto L_0x053e
            r17 = r3
            java.lang.String r3 = r8.f()     // Catch:{ all -> 0x053b }
            boolean r0 = defpackage.cvg.c(r0, r3)     // Catch:{ all -> 0x053b }
            if (r0 == 0) goto L_0x0545
            boolean r0 = defpackage.cvg.c(r1, r9)     // Catch:{ all -> 0x053b }
            if (r0 == 0) goto L_0x0545
            boolean r0 = defpackage.cvg.c(r15, r12)     // Catch:{ all -> 0x053b }
            if (r0 == 0) goto L_0x0545
            boolean r0 = defpackage.cvg.c(r13, r11)     // Catch:{ all -> 0x053b }
            if (r0 == 0) goto L_0x0545
            if (r10 == 0) goto L_0x0534
            r10.close()     // Catch:{ Exception -> 0x0532 }
            goto L_0x0534
        L_0x0532:
            r0 = move-exception
            goto L_0x055e
        L_0x0534:
            r7 = r24
            r6 = r25
            r2 = 1
            goto L_0x0619
        L_0x053b:
            r0 = move-exception
        L_0x053c:
            r1 = r0
            goto L_0x054b
        L_0x053e:
            r17 = r3
            goto L_0x0545
        L_0x0541:
            r0 = move-exception
            r17 = r3
            goto L_0x053c
        L_0x0545:
            if (r10 == 0) goto L_0x0563
            r10.close()     // Catch:{ Exception -> 0x0532 }
            goto L_0x0563
        L_0x054b:
            if (r10 == 0) goto L_0x0556
            r10.close()     // Catch:{ all -> 0x0551 }
            goto L_0x0556
        L_0x0551:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch:{ Exception -> 0x0532 }
        L_0x0556:
            throw r1     // Catch:{ Exception -> 0x0532 }
        L_0x0557:
            r0 = move-exception
            r17 = r3
            r22 = r13
            r21 = r15
        L_0x055e:
            java.lang.String r1 = "needUpdate: exception"
            defpackage.z68.f(r5, r1, r0)
        L_0x0563:
            android.content.ContentResolver r0 = r4.getContentResolver()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri r3 = android.provider.ContactsContract.Data.CONTENT_URI
            android.net.Uri r10 = c(r3)
            android.content.ContentProviderOperation$Builder r10 = android.content.ContentProviderOperation.newUpdate(r10)
            java.lang.String r13 = java.lang.String.valueOf(r6)
            java.lang.String[] r13 = new java.lang.String[]{r13, r14}
            java.lang.String r14 = "raw_contact_id = ? AND mimetype =?"
            android.content.ContentProviderOperation$Builder r10 = r10.withSelection(r14, r13)
            android.content.ContentProviderOperation$Builder r9 = r10.withValue(r2, r9)
            r10 = r17
            android.content.ContentProviderOperation$Builder r9 = r9.withValue(r10, r12)
            android.content.ContentProviderOperation r9 = r9.build()
            r1.add(r9)
            android.net.Uri r9 = c(r3)
            android.content.ContentProviderOperation$Builder r9 = android.content.ContentProviderOperation.newUpdate(r9)
            java.lang.String r12 = java.lang.String.valueOf(r6)
            r13 = r22
            java.lang.String[] r12 = new java.lang.String[]{r12, r13}
            android.content.ContentProviderOperation$Builder r9 = r9.withSelection(r14, r12)
            r12 = r21
            android.content.ContentProviderOperation$Builder r9 = r9.withValue(r12, r11)
            android.content.ContentProviderOperation r9 = r9.build()
            r1.add(r9)
            android.net.Uri r3 = c(r3)
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newUpdate(r3)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = defpackage.tmc.tt_contact_mimetype
            java.lang.String r7 = r4.getString(r7)
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}
            java.lang.String r7 = "raw_contact_id = ? AND mimetype = ?"
            android.content.ContentProviderOperation$Builder r3 = r3.withSelection(r7, r6)
            long r6 = r8.r()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r12, r6)
            long r6 = r8.s()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            android.content.ContentProviderOperation$Builder r2 = r3.withValue(r2, r6)
            java.lang.String r3 = r8.f()
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r10, r3)
            android.content.ContentProviderOperation r2 = r2.build()
            r1.add(r2)
            java.lang.String r2 = "com.android.contacts"
            r0.applyBatch(r2, r1)     // Catch:{ Exception -> 0x0602 }
            r2 = 1
            goto L_0x0615
        L_0x0602:
            r0 = move-exception
            java.lang.String r1 = "Exception when update for contact our mime type"
            defpackage.z68.f(r5, r1, r0)
            ru.ok.tamtam.util.HandledException r1 = new ru.ok.tamtam.util.HandledException
            r1.<init>(r0)
            r7 = r33
            uta r7 = (defpackage.uta) r7
            r2 = 1
            r7.c(r1, r2)
        L_0x0615:
            int r7 = r24 + 1
            r6 = r25
        L_0x0619:
            r1 = 0
            r24 = r7
            r7 = r34
            goto L_0x063c
        L_0x061f:
            r16 = r2
            r23 = r3
            r25 = r6
            r24 = r7
            r1 = 0
            r2 = 1
            java.lang.Object r0 = r0.get(r1)
            xdb r0 = (defpackage.xdb) r0
            java.lang.String r3 = r0.y
            java.lang.String r6 = r0.z
            java.lang.String r0 = r0.v
            r7 = r34
            r7.e(r8, r3, r6, r0)
            int r6 = r25 + 1
        L_0x063c:
            r1 = r7
            r2 = r16
            r3 = r23
            r7 = r24
            goto L_0x0399
        L_0x0645:
            r25 = r6
            r24 = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "updateContacts: inserted=%s, updated=%s"
            defpackage.z68.c(r5, r1, r0)
            return
        L_0x065b:
            r7.close()
            r11.o()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daf.g(java.util.Collection):void");
    }
}
