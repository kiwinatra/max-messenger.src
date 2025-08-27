package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class WorkersQueueDao_Impl implements WorkersQueueDao {
    private final i6d __db;
    private final r75 __insertionAdapterOfWorkerQueueItem;
    private final r75 __insertionAdapterOfWorkerQueueItem_1;

    public WorkersQueueDao_Impl(i6d i6d) {
        this.__db = i6d;
        this.__insertionAdapterOfWorkerQueueItem = new oqg(this, i6d, 0);
        this.__insertionAdapterOfWorkerQueueItem_1 = new oqg(this, i6d, 1);
    }

    /* access modifiers changed from: private */
    public String __ExistingWorkPolicy_enumToString(fb5 fb5) {
        int ordinal = fb5.ordinal();
        if (ordinal == 0) {
            return "REPLACE";
        }
        if (ordinal == 1) {
            return "KEEP";
        }
        if (ordinal == 2) {
            return "APPEND";
        }
        if (ordinal == 3) {
            return "APPEND_OR_REPLACE";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + fb5);
    }

    private fb5 __ExistingWorkPolicy_stringToEnum(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1086924163:
                if (str.equals("APPEND_OR_REPLACE")) {
                    c = 0;
                    break;
                }
                break;
            case 2302853:
                if (str.equals("KEEP")) {
                    c = 1;
                    break;
                }
                break;
            case 1812479636:
                if (str.equals("REPLACE")) {
                    c = 2;
                    break;
                }
                break;
            case 1937228570:
                if (str.equals("APPEND")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return fb5.o;
            case 1:
                return fb5.b;
            case 2:
                return fb5.a;
            case 3:
                return fb5.c;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public boolean contains(List<String> list) {
        this.__db.c();
        try {
            boolean contains = super.contains(list);
            this.__db.r();
            return contains;
        } finally {
            this.__db.l();
        }
    }

    public int count(int i) {
        d7d a = d7d.a(1, "SELECT COUNT(*) FROM WorkerQueueItem WHERE state = ?");
        a.k(1, (long) i);
        this.__db.b();
        Cursor o = this.__db.o(a, (CancellationSignal) null);
        try {
            int i2 = 0;
            if (o.moveToFirst()) {
                i2 = o.getInt(0);
            }
            return i2;
        } finally {
            o.close();
            a.o();
        }
    }

    public void delete(List<String> list) {
        this.__db.b();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM WorkerQueueItem WHERE uuid IN (");
        n79.c(sb, list.size());
        sb.append(")");
        gf6 d = this.__db.d(sb.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                d.X(i);
            } else {
                d.h(i, next);
            }
            i++;
        }
        this.__db.c();
        try {
            d.n();
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public List<hqg> getItemsForRunning(int i) {
        this.__db.c();
        try {
            List<hqg> itemsForRunning = super.getItemsForRunning(i);
            this.__db.r();
            return itemsForRunning;
        } finally {
            this.__db.l();
        }
    }

    public void insert(hqg hqg) {
        this.__db.c();
        try {
            super.insert(hqg);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public void insertOrIgnore(hqg hqg) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfWorkerQueueItem.c0(hqg);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public void insertOrReplace(hqg hqg) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfWorkerQueueItem_1.c0(hqg);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public List<hqg> select(int i) {
        d7d d7d;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        byte[] bArr3;
        WorkersQueueDao_Impl workersQueueDao_Impl = this;
        d7d a = d7d.a(1, "SELECT * FROM WorkerQueueItem ORDER BY time ASC LIMIT ?");
        a.k(1, (long) i);
        workersQueueDao_Impl.__db.b();
        Cursor o = workersQueueDao_Impl.__db.o(a, (CancellationSignal) null);
        try {
            int u = kne.u(o, "uuid");
            int u2 = kne.u(o, "uniqueWorkName");
            int u3 = kne.u(o, "existingWorkPolicy");
            int u4 = kne.u(o, "tags");
            int u5 = kne.u(o, "time");
            int u6 = kne.u(o, "state");
            int u7 = kne.u(o, "work_spec_id");
            int u8 = kne.u(o, "work_spec_state");
            int u9 = kne.u(o, "work_spec_worker_class_name");
            int u10 = kne.u(o, "work_spec_input_merger_class_name");
            int u11 = kne.u(o, "work_spec_input");
            int u12 = kne.u(o, "work_spec_output");
            int u13 = kne.u(o, "work_spec_initial_delay");
            d7d = a;
            try {
                int u14 = kne.u(o, "work_spec_interval_duration");
                int u15 = kne.u(o, "work_spec_flex_duration");
                int u16 = kne.u(o, "work_spec_run_attempt_count");
                int u17 = kne.u(o, "work_spec_backoff_policy");
                int u18 = kne.u(o, "work_spec_backoff_delay_duration");
                int u19 = kne.u(o, "work_spec_last_enqueue_time");
                int u20 = kne.u(o, "work_spec_minimum_retention_duration");
                int u21 = kne.u(o, "work_spec_schedule_requested_at");
                int u22 = kne.u(o, "work_spec_run_in_foreground");
                int u23 = kne.u(o, "work_spec_out_of_quota_policy");
                int u24 = kne.u(o, "work_spec_period_count");
                int u25 = kne.u(o, "work_spec_generation");
                int u26 = kne.u(o, "work_spec_required_network_type");
                int u27 = kne.u(o, "work_spec_requires_charging");
                int u28 = kne.u(o, "work_spec_requires_device_idle");
                int u29 = kne.u(o, "work_spec_requires_battery_not_low");
                int u30 = kne.u(o, "work_spec_requires_storage_not_low");
                int u31 = kne.u(o, "work_spec_trigger_content_update_delay");
                int u32 = kne.u(o, "work_spec_trigger_max_content_delay");
                int u33 = kne.u(o, "work_spec_content_uri_triggers");
                int i7 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    if (o.isNull(u)) {
                        str = null;
                    } else {
                        str = o.getString(u);
                    }
                    if (o.isNull(u2)) {
                        str2 = null;
                    } else {
                        str2 = o.getString(u2);
                    }
                    fb5 __ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(o.getString(u3));
                    if (o.isNull(u4)) {
                        str3 = null;
                    } else {
                        str3 = o.getString(u4);
                    }
                    HashSet w = m5a.w(str3);
                    long j = o.getLong(u5);
                    int i8 = o.getInt(u6);
                    if (o.isNull(u7)) {
                        str4 = null;
                    } else {
                        str4 = o.getString(u7);
                    }
                    xog K = o5a.K(o.getInt(u8));
                    if (o.isNull(u9)) {
                        str5 = null;
                    } else {
                        str5 = o.getString(u9);
                    }
                    if (o.isNull(u10)) {
                        str6 = null;
                    } else {
                        str6 = o.getString(u10);
                    }
                    if (o.isNull(u11)) {
                        bArr = null;
                    } else {
                        bArr = o.getBlob(u11);
                    }
                    t64 a2 = t64.a(bArr);
                    if (o.isNull(u12)) {
                        bArr2 = null;
                    } else {
                        bArr2 = o.getBlob(u12);
                    }
                    t64 a3 = t64.a(bArr2);
                    int i9 = i7;
                    long j2 = o.getLong(i9);
                    int i10 = u14;
                    long j3 = o.getLong(i10);
                    u14 = i10;
                    int i11 = u15;
                    long j4 = o.getLong(i11);
                    u15 = i11;
                    int i12 = u16;
                    int i13 = o.getInt(i12);
                    u16 = i12;
                    int i14 = u17;
                    ag0 H = o5a.H(o.getInt(i14));
                    u17 = i14;
                    int i15 = u18;
                    long j5 = o.getLong(i15);
                    u18 = i15;
                    int i16 = u19;
                    long j6 = o.getLong(i16);
                    u19 = i16;
                    int i17 = u20;
                    long j7 = o.getLong(i17);
                    u20 = i17;
                    int i18 = u21;
                    long j8 = o.getLong(i18);
                    u21 = i18;
                    int i19 = u22;
                    if (o.getInt(i19) != 0) {
                        u22 = i19;
                        i2 = u23;
                        z = true;
                    } else {
                        u22 = i19;
                        i2 = u23;
                        z = false;
                    }
                    t5b J = o5a.J(o.getInt(i2));
                    u23 = i2;
                    int i20 = u24;
                    int i21 = o.getInt(i20);
                    u24 = i20;
                    int i22 = u25;
                    int i23 = o.getInt(i22);
                    u25 = i22;
                    int i24 = u26;
                    int I = o5a.I(o.getInt(i24));
                    u26 = i24;
                    int i25 = u27;
                    if (o.getInt(i25) != 0) {
                        u27 = i25;
                        i3 = u28;
                        z2 = true;
                    } else {
                        u27 = i25;
                        i3 = u28;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        u28 = i3;
                        i4 = u29;
                        z3 = true;
                    } else {
                        u28 = i3;
                        i4 = u29;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        u29 = i4;
                        i5 = u30;
                        z4 = true;
                    } else {
                        u29 = i4;
                        i5 = u30;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        u30 = i5;
                        i6 = u31;
                        z5 = true;
                    } else {
                        u30 = i5;
                        i6 = u31;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    u31 = i6;
                    int i26 = u32;
                    long j10 = o.getLong(i26);
                    u32 = i26;
                    int i27 = u33;
                    if (o.isNull(i27)) {
                        bArr3 = null;
                    } else {
                        bArr3 = o.getBlob(i27);
                    }
                    u33 = i27;
                    arrayList.add(new hqg(str, str2, __ExistingWorkPolicy_stringToEnum, new xpg(str4, K, str5, str6, a2, a3, j2, j3, j4, new wj3(I, z2, z3, z4, z5, j9, j10, o5a.g(bArr3)), i13, H, j5, j6, j7, j8, z, J, i21, i23), w, j, i8));
                    workersQueueDao_Impl = this;
                    i7 = i9;
                }
                o.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public void updateState(int i, List<String> list) {
        this.__db.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE WorkerQueueItem SET state = ? WHERE uuid IN (");
        n79.c(sb, list.size());
        sb.append(")");
        gf6 d = this.__db.d(sb.toString());
        d.k(1, (long) i);
        int i2 = 2;
        for (String next : list) {
            if (next == null) {
                d.X(i2);
            } else {
                d.h(i2, next);
            }
            i2++;
        }
        this.__db.c();
        try {
            d.n();
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public List<hqg> select(int i, int i2) {
        d7d d7d;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        byte[] bArr3;
        WorkersQueueDao_Impl workersQueueDao_Impl = this;
        d7d a = d7d.a(2, "SELECT * FROM WorkerQueueItem WHERE state = ? ORDER BY time ASC LIMIT ?");
        a.k(1, (long) i2);
        a.k(2, (long) i);
        workersQueueDao_Impl.__db.b();
        Cursor o = workersQueueDao_Impl.__db.o(a, (CancellationSignal) null);
        try {
            int u = kne.u(o, "uuid");
            int u2 = kne.u(o, "uniqueWorkName");
            int u3 = kne.u(o, "existingWorkPolicy");
            int u4 = kne.u(o, "tags");
            int u5 = kne.u(o, "time");
            int u6 = kne.u(o, "state");
            int u7 = kne.u(o, "work_spec_id");
            int u8 = kne.u(o, "work_spec_state");
            int u9 = kne.u(o, "work_spec_worker_class_name");
            int u10 = kne.u(o, "work_spec_input_merger_class_name");
            int u11 = kne.u(o, "work_spec_input");
            int u12 = kne.u(o, "work_spec_output");
            int u13 = kne.u(o, "work_spec_initial_delay");
            d7d = a;
            try {
                int u14 = kne.u(o, "work_spec_interval_duration");
                int u15 = kne.u(o, "work_spec_flex_duration");
                int u16 = kne.u(o, "work_spec_run_attempt_count");
                int u17 = kne.u(o, "work_spec_backoff_policy");
                int u18 = kne.u(o, "work_spec_backoff_delay_duration");
                int u19 = kne.u(o, "work_spec_last_enqueue_time");
                int u20 = kne.u(o, "work_spec_minimum_retention_duration");
                int u21 = kne.u(o, "work_spec_schedule_requested_at");
                int u22 = kne.u(o, "work_spec_run_in_foreground");
                int u23 = kne.u(o, "work_spec_out_of_quota_policy");
                int u24 = kne.u(o, "work_spec_period_count");
                int u25 = kne.u(o, "work_spec_generation");
                int u26 = kne.u(o, "work_spec_required_network_type");
                int u27 = kne.u(o, "work_spec_requires_charging");
                int u28 = kne.u(o, "work_spec_requires_device_idle");
                int u29 = kne.u(o, "work_spec_requires_battery_not_low");
                int u30 = kne.u(o, "work_spec_requires_storage_not_low");
                int u31 = kne.u(o, "work_spec_trigger_content_update_delay");
                int u32 = kne.u(o, "work_spec_trigger_max_content_delay");
                int u33 = kne.u(o, "work_spec_content_uri_triggers");
                int i8 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    if (o.isNull(u)) {
                        str = null;
                    } else {
                        str = o.getString(u);
                    }
                    if (o.isNull(u2)) {
                        str2 = null;
                    } else {
                        str2 = o.getString(u2);
                    }
                    fb5 __ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(o.getString(u3));
                    if (o.isNull(u4)) {
                        str3 = null;
                    } else {
                        str3 = o.getString(u4);
                    }
                    HashSet w = m5a.w(str3);
                    long j = o.getLong(u5);
                    int i9 = o.getInt(u6);
                    if (o.isNull(u7)) {
                        str4 = null;
                    } else {
                        str4 = o.getString(u7);
                    }
                    xog K = o5a.K(o.getInt(u8));
                    if (o.isNull(u9)) {
                        str5 = null;
                    } else {
                        str5 = o.getString(u9);
                    }
                    if (o.isNull(u10)) {
                        str6 = null;
                    } else {
                        str6 = o.getString(u10);
                    }
                    if (o.isNull(u11)) {
                        bArr = null;
                    } else {
                        bArr = o.getBlob(u11);
                    }
                    t64 a2 = t64.a(bArr);
                    if (o.isNull(u12)) {
                        bArr2 = null;
                    } else {
                        bArr2 = o.getBlob(u12);
                    }
                    t64 a3 = t64.a(bArr2);
                    int i10 = i8;
                    long j2 = o.getLong(i10);
                    int i11 = u14;
                    long j3 = o.getLong(i11);
                    u14 = i11;
                    int i12 = u15;
                    long j4 = o.getLong(i12);
                    u15 = i12;
                    int i13 = u16;
                    int i14 = o.getInt(i13);
                    u16 = i13;
                    int i15 = u17;
                    ag0 H = o5a.H(o.getInt(i15));
                    u17 = i15;
                    int i16 = u18;
                    long j5 = o.getLong(i16);
                    u18 = i16;
                    int i17 = u19;
                    long j6 = o.getLong(i17);
                    u19 = i17;
                    int i18 = u20;
                    long j7 = o.getLong(i18);
                    u20 = i18;
                    int i19 = u21;
                    long j8 = o.getLong(i19);
                    u21 = i19;
                    int i20 = u22;
                    if (o.getInt(i20) != 0) {
                        u22 = i20;
                        i3 = u23;
                        z = true;
                    } else {
                        u22 = i20;
                        i3 = u23;
                        z = false;
                    }
                    t5b J = o5a.J(o.getInt(i3));
                    u23 = i3;
                    int i21 = u24;
                    int i22 = o.getInt(i21);
                    u24 = i21;
                    int i23 = u25;
                    int i24 = o.getInt(i23);
                    u25 = i23;
                    int i25 = u26;
                    int I = o5a.I(o.getInt(i25));
                    u26 = i25;
                    int i26 = u27;
                    if (o.getInt(i26) != 0) {
                        u27 = i26;
                        i4 = u28;
                        z2 = true;
                    } else {
                        u27 = i26;
                        i4 = u28;
                        z2 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        u28 = i4;
                        i5 = u29;
                        z3 = true;
                    } else {
                        u28 = i4;
                        i5 = u29;
                        z3 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        u29 = i5;
                        i6 = u30;
                        z4 = true;
                    } else {
                        u29 = i5;
                        i6 = u30;
                        z4 = false;
                    }
                    if (o.getInt(i6) != 0) {
                        u30 = i6;
                        i7 = u31;
                        z5 = true;
                    } else {
                        u30 = i6;
                        i7 = u31;
                        z5 = false;
                    }
                    long j9 = o.getLong(i7);
                    u31 = i7;
                    int i27 = u32;
                    long j10 = o.getLong(i27);
                    u32 = i27;
                    int i28 = u33;
                    if (o.isNull(i28)) {
                        bArr3 = null;
                    } else {
                        bArr3 = o.getBlob(i28);
                    }
                    u33 = i28;
                    arrayList.add(new hqg(str, str2, __ExistingWorkPolicy_stringToEnum, new xpg(str4, K, str5, str6, a2, a3, j2, j3, j4, new wj3(I, z2, z3, z4, z5, j9, j10, o5a.g(bArr3)), i14, H, j5, j6, j7, j8, z, J, i22, i24), w, j, i9));
                    workersQueueDao_Impl = this;
                    i8 = i10;
                }
                o.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a;
            o.close();
            d7d.o();
            throw th;
        }
    }
}
