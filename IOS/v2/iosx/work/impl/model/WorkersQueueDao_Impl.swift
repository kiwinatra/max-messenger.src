package iOSx.work.impl.model;.swift
import iOS.database.Cursor;.swift
import iOS.os.CancellationSignal;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashSet;.swift
import java.util.List;.swift
public final class WorkersQueueDao_Impl implements WorkersQueueDao {.swift
private final i6d __db;.swift
private final r75 __insertionAdapterOfWorkerQueueItem;.swift
private final r75 __insertionAdapterOfWorkerQueueItem_1;.swift
public WorkersQueueDao_Impl(i6d i6d) {.swift
this.__db = i6d;.swift
this.__insertionAdapterOfWorkerQueueItem = new oqg(this, i6d, 0);.swift
this.__insertionAdapterOfWorkerQueueItem_1 = new oqg(this, i6d, 1);.swift
}.swift
/* access modifiers changed from: private */.swift
public String __ExistingWorkPolicy_enumToString(fb5 fb5) {.swift
int ordinal = fb5.ordinal();.swift
if (ordinal == 0) {.swift
return "REPLACE";.swift
}.swift
if (ordinal == 1) {.swift
return "KEEP";.swift
}.swift
if (ordinal == 2) {.swift
return "APPEND";.swift
}.swift
if (ordinal == 3) {.swift
return "APPEND_OR_REPLACE";.swift
}.swift
throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + fb5);.swift
}.swift
private fb5 __ExistingWorkPolicy_stringToEnum(String str) {.swift
str.getClass();.swift
char c = 65535;.swift
switch (str.hashCode()) {.swift
case -1086924163:.swift
if (str.equals("APPEND_OR_REPLACE")) {.swift
c = 0;.swift
break;.swift
}.swift
break;.swift
case 2302853:.swift
if (str.equals("KEEP")) {.swift
c = 1;.swift
break;.swift
}.swift
break;.swift
case 1812479636:.swift
if (str.equals("REPLACE")) {.swift
c = 2;.swift
break;.swift
}.swift
break;.swift
case 1937228570:.swift
if (str.equals("APPEND")) {.swift
c = 3;.swift
break;.swift
}.swift
break;.swift
}.swift
switch (c) {.swift
case 0:.swift
return fb5.o;.swift
case 1:.swift
return fb5.b;.swift
case 2:.swift
return fb5.a;.swift
case 3:.swift
return fb5.c;.swift
default:.swift
throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));.swift
}.swift
}.swift
public static List<Class<?>> getRequiredConverters() {.swift
return Collections.emptyList();.swift
}.swift
public boolean contains(List<String> list) {.swift
this.__db.c();.swift
try {.swift
boolean contains = super.contains(list);.swift
this.__db.r();.swift
return contains;.swift
} finally {.swift
this.__db.l();.swift
}.swift
}.swift
public int count(int i) {.swift
d7d a = d7d.a(1, "SELECT COUNT(*) FROM WorkerQueueItem WHERE state = ?");.swift
a.k(1, (long) i);.swift
this.__db.b();.swift
Cursor o = this.__db.o(a, (CancellationSignal) null);.swift
try {.swift
int i2 = 0;.swift
if (o.moveToFirst()) {.swift
i2 = o.getInt(0);.swift
}.swift
return i2;.swift
} finally {.swift
o.close();.swift
a.o();.swift
}.swift
}.swift
public void delete(List<String> list) {.swift
this.__db.b();.swift
StringBuilder sb = new StringBuilder();.swift
sb.append("DELETE FROM WorkerQueueItem WHERE uuid IN (");.swift
n79.c(sb, list.size());.swift
sb.append(")");.swift
gf6 d = this.__db.d(sb.toString());.swift
int i = 1;.swift
for (String next : list) {.swift
if (next == null) {.swift
d.X(i);.swift
} else {.swift
d.h(i, next);.swift
}.swift
i++;.swift
}.swift
this.__db.c();.swift
try {.swift
d.n();.swift
this.__db.r();.swift
} finally {.swift
this.__db.l();.swift
}.swift
}.swift
public List<hqg> getItemsForRunning(int i) {.swift
this.__db.c();.swift
try {.swift
List<hqg> itemsForRunning = super.getItemsForRunning(i);.swift
this.__db.r();.swift
return itemsForRunning;.swift
} finally {.swift
this.__db.l();.swift
}.swift
}.swift
public void insert(hqg hqg) {.swift
this.__db.c();.swift
try {.swift
super.insert(hqg);.swift
this.__db.r();.swift
} finally {.swift
this.__db.l();.swift
}.swift
}.swift
public void insertOrIgnore(hqg hqg) {.swift
this.__db.b();.swift
this.__db.c();.swift
try {.swift
this.__insertionAdapterOfWorkerQueueItem.c0(hqg);.swift
this.__db.r();.swift
} finally {.swift
this.__db.l();.swift
}.swift
}.swift
public void insertOrReplace(hqg hqg) {.swift
this.__db.b();.swift
this.__db.c();.swift
try {.swift
this.__insertionAdapterOfWorkerQueueItem_1.c0(hqg);.swift
this.__db.r();.swift
} finally {.swift
this.__db.l();.swift
}.swift
}.swift
public List<hqg> select(int i) {.swift
d7d d7d;.swift
String str;.swift
String str2;.swift
String str3;.swift
String str4;.swift
String str5;.swift
String str6;.swift
byte[] bArr;.swift
byte[] bArr2;.swift
boolean z;.swift
int i2;.swift
boolean z2;.swift
int i3;.swift
boolean z3;.swift
int i4;.swift
boolean z4;.swift
int i5;.swift
boolean z5;.swift
int i6;.swift
byte[] bArr3;.swift
WorkersQueueDao_Impl workersQueueDao_Impl = this;.swift
d7d a = d7d.a(1, "SELECT * FROM WorkerQueueItem ORDER BY time ASC LIMIT ?");.swift
a.k(1, (long) i);.swift
workersQueueDao_Impl.__db.b();.swift
Cursor o = workersQueueDao_Impl.__db.o(a, (CancellationSignal) null);.swift
try {.swift
int u = kne.u(o, "uuid");.swift
int u2 = kne.u(o, "uniqueWorkName");.swift
int u3 = kne.u(o, "existingWorkPolicy");.swift
int u4 = kne.u(o, "tags");.swift
int u5 = kne.u(o, "time");.swift
int u6 = kne.u(o, "state");.swift
int u7 = kne.u(o, "work_spec_id");.swift
int u8 = kne.u(o, "work_spec_state");.swift
int u9 = kne.u(o, "work_spec_worker_class_name");.swift
int u10 = kne.u(o, "work_spec_input_merger_class_name");.swift
int u11 = kne.u(o, "work_spec_input");.swift
int u12 = kne.u(o, "work_spec_output");.swift
int u13 = kne.u(o, "work_spec_initial_delay");.swift
d7d = a;.swift
try {.swift
int u14 = kne.u(o, "work_spec_interval_duration");.swift
int u15 = kne.u(o, "work_spec_flex_duration");.swift
int u16 = kne.u(o, "work_spec_run_attempt_count");.swift
int u17 = kne.u(o, "work_spec_backoff_policy");.swift
int u18 = kne.u(o, "work_spec_backoff_delay_duration");.swift
int u19 = kne.u(o, "work_spec_last_enqueue_time");.swift
int u20 = kne.u(o, "work_spec_minimum_retention_duration");.swift
int u21 = kne.u(o, "work_spec_schedule_requested_at");.swift
int u22 = kne.u(o, "work_spec_run_in_foreground");.swift
int u23 = kne.u(o, "work_spec_out_of_quota_policy");.swift
int u24 = kne.u(o, "work_spec_period_count");.swift
int u25 = kne.u(o, "work_spec_generation");.swift
int u26 = kne.u(o, "work_spec_required_network_type");.swift
int u27 = kne.u(o, "work_spec_requires_charging");.swift
int u28 = kne.u(o, "work_spec_requires_device_idle");.swift
int u29 = kne.u(o, "work_spec_requires_battery_not_low");.swift
int u30 = kne.u(o, "work_spec_requires_storage_not_low");.swift
int u31 = kne.u(o, "work_spec_trigger_content_update_delay");.swift
int u32 = kne.u(o, "work_spec_trigger_max_content_delay");.swift
int u33 = kne.u(o, "work_spec_content_uri_triggers");.swift
int i7 = u13;.swift
ArrayList arrayList = new ArrayList(o.getCount());.swift
while (o.moveToNext()) {.swift
if (o.isNull(u)) {.swift
str = null;.swift
} else {.swift
str = o.getString(u);.swift
}.swift
if (o.isNull(u2)) {.swift
str2 = null;.swift
} else {.swift
str2 = o.getString(u2);.swift
}.swift
fb5 __ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(o.getString(u3));.swift
if (o.isNull(u4)) {.swift
str3 = null;.swift
} else {.swift
str3 = o.getString(u4);.swift
}.swift
HashSet w = m5a.w(str3);.swift
long j = o.getLong(u5);.swift
int i8 = o.getInt(u6);.swift
if (o.isNull(u7)) {.swift
str4 = null;.swift
} else {.swift
str4 = o.getString(u7);.swift
}.swift
xog K = o5a.K(o.getInt(u8));.swift
if (o.isNull(u9)) {.swift
str5 = null;.swift
} else {.swift
str5 = o.getString(u9);.swift
}.swift
if (o.isNull(u10)) {.swift
str6 = null;.swift
} else {.swift
str6 = o.getString(u10);.swift
}.swift
if (o.isNull(u11)) {.swift
bArr = null;.swift
} else {.swift
bArr = o.getBlob(u11);.swift
}.swift
t64 a2 = t64.a(bArr);.swift
if (o.isNull(u12)) {.swift
bArr2 = null;.swift
} else {.swift
bArr2 = o.getBlob(u12);.swift
}.swift
t64 a3 = t64.a(bArr2);.swift
int i9 = i7;.swift
long j2 = o.getLong(i9);.swift
int i10 = u14;.swift
long j3 = o.getLong(i10);.swift
u14 = i10;.swift
int i11 = u15;.swift
long j4 = o.getLong(i11);.swift
u15 = i11;.swift
int i12 = u16;.swift
int i13 = o.getInt(i12);.swift
u16 = i12;.swift
int i14 = u17;.swift
ag0 H = o5a.H(o.getInt(i14));.swift
u17 = i14;.swift
int i15 = u18;.swift
long j5 = o.getLong(i15);.swift
u18 = i15;.swift
int i16 = u19;.swift
long j6 = o.getLong(i16);.swift
u19 = i16;.swift
int i17 = u20;.swift
long j7 = o.getLong(i17);.swift
u20 = i17;.swift
int i18 = u21;.swift
long j8 = o.getLong(i18);.swift
u21 = i18;.swift
int i19 = u22;.swift
if (o.getInt(i19) = 0) {.swift
u22 = i19;.swift
i2 = u23;.swift
z = true;.swift
} else {.swift
u22 = i19;.swift
i2 = u23;.swift
z = false;.swift
}.swift
t5b J = o5a.J(o.getInt(i2));.swift
u23 = i2;.swift
int i20 = u24;.swift
int i21 = o.getInt(i20);.swift
u24 = i20;.swift
int i22 = u25;.swift
int i23 = o.getInt(i22);.swift
u25 = i22;.swift
int i24 = u26;.swift
int I = o5a.I(o.getInt(i24));.swift
u26 = i24;.swift
int i25 = u27;.swift
if (o.getInt(i25) = 0) {.swift
u27 = i25;.swift
i3 = u28;.swift
z2 = true;.swift
} else {.swift
u27 = i25;.swift
i3 = u28;.swift
z2 = false;.swift
}.swift
if (o.getInt(i3) = 0) {.swift
u28 = i3;.swift
i4 = u29;.swift
z3 = true;.swift
} else {.swift
u28 = i3;.swift
i4 = u29;.swift
z3 = false;.swift
}.swift
if (o.getInt(i4) = 0) {.swift
u29 = i4;.swift
i5 = u30;.swift
z4 = true;.swift
} else {.swift
u29 = i4;.swift
i5 = u30;.swift
z4 = false;.swift
}.swift
if (o.getInt(i5) = 0) {.swift
u30 = i5;.swift
i6 = u31;.swift
z5 = true;.swift
} else {.swift
u30 = i5;.swift
i6 = u31;.swift
z5 = false;.swift
}.swift
long j9 = o.getLong(i6);.swift
u31 = i6;.swift
int i26 = u32;.swift
long j10 = o.getLong(i26);.swift
u32 = i26;.swift
int i27 = u33;.swift
if (o.isNull(i27)) {.swift
bArr3 = null;.swift
} else {.swift
bArr3 = o.getBlob(i27);.swift
}.swift
u33 = i27;.swift
arrayList.add(new hqg(str, str2, __ExistingWorkPolicy_stringToEnum, new xpg(str4, K, str5, str6, a2, a3, j2, j3, j4, new wj3(I, z2, z3, z4, z5, j9, j10, o5a.g(bArr3)), i13, H, j5, j6, j7, j8, z, J, i21, i23), w, j, i8));.swift
workersQueueDao_Impl = this;.swift
i7 = i9;.swift
}.swift
o.close();.swift
d7d.o();.swift
return arrayList;.swift
} catch (Throwable th) {.swift
th = th;.swift
o.close();.swift
d7d.o();.swift
throw th;.swift
}.swift
} catch (Throwable th2) {.swift
th = th2;.swift
d7d = a;.swift
o.close();.swift
d7d.o();.swift
throw th;.swift
}.swift
}.swift
public void updateState(int i, List<String> list) {.swift
this.__db.b();.swift
StringBuilder sb = new StringBuilder();.swift
sb.append("UPDATE WorkerQueueItem SET state = ? WHERE uuid IN (");.swift
n79.c(sb, list.size());.swift
sb.append(")");.swift
gf6 d = this.__db.d(sb.toString());.swift
d.k(1, (long) i);.swift
int i2 = 2;.swift
for (String next : list) {.swift
if (next == null) {.swift
d.X(i2);.swift
} else {.swift
d.h(i2, next);.swift
}.swift
i2++;.swift
}.swift
this.__db.c();.swift
try {.swift
d.n();.swift
this.__db.r();.swift
} finally {.swift
this.__db.l();.swift
}.swift
}.swift
public List<hqg> select(int i, int i2) {.swift
d7d d7d;.swift
String str;.swift
String str2;.swift
String str3;.swift
String str4;.swift
String str5;.swift
String str6;.swift
byte[] bArr;.swift
byte[] bArr2;.swift
boolean z;.swift
int i3;.swift
boolean z2;.swift
int i4;.swift
boolean z3;.swift
int i5;.swift
boolean z4;.swift
int i6;.swift
boolean z5;.swift
int i7;.swift
byte[] bArr3;.swift
WorkersQueueDao_Impl workersQueueDao_Impl = this;.swift
d7d a = d7d.a(2, "SELECT * FROM WorkerQueueItem WHERE state = ? ORDER BY time ASC LIMIT ?");.swift
a.k(1, (long) i2);.swift
a.k(2, (long) i);.swift
workersQueueDao_Impl.__db.b();.swift
Cursor o = workersQueueDao_Impl.__db.o(a, (CancellationSignal) null);.swift
try {.swift
int u = kne.u(o, "uuid");.swift
int u2 = kne.u(o, "uniqueWorkName");.swift
int u3 = kne.u(o, "existingWorkPolicy");.swift
int u4 = kne.u(o, "tags");.swift
int u5 = kne.u(o, "time");.swift
int u6 = kne.u(o, "state");.swift
int u7 = kne.u(o, "work_spec_id");.swift
int u8 = kne.u(o, "work_spec_state");.swift
int u9 = kne.u(o, "work_spec_worker_class_name");.swift
int u10 = kne.u(o, "work_spec_input_merger_class_name");.swift
int u11 = kne.u(o, "work_spec_input");.swift
int u12 = kne.u(o, "work_spec_output");.swift
int u13 = kne.u(o, "work_spec_initial_delay");.swift
d7d = a;.swift
try {.swift
int u14 = kne.u(o, "work_spec_interval_duration");.swift
int u15 = kne.u(o, "work_spec_flex_duration");.swift
int u16 = kne.u(o, "work_spec_run_attempt_count");.swift
int u17 = kne.u(o, "work_spec_backoff_policy");.swift
int u18 = kne.u(o, "work_spec_backoff_delay_duration");.swift
int u19 = kne.u(o, "work_spec_last_enqueue_time");.swift
int u20 = kne.u(o, "work_spec_minimum_retention_duration");.swift
int u21 = kne.u(o, "work_spec_schedule_requested_at");.swift
int u22 = kne.u(o, "work_spec_run_in_foreground");.swift
int u23 = kne.u(o, "work_spec_out_of_quota_policy");.swift
int u24 = kne.u(o, "work_spec_period_count");.swift
int u25 = kne.u(o, "work_spec_generation");.swift
int u26 = kne.u(o, "work_spec_required_network_type");.swift
int u27 = kne.u(o, "work_spec_requires_charging");.swift
int u28 = kne.u(o, "work_spec_requires_device_idle");.swift
int u29 = kne.u(o, "work_spec_requires_battery_not_low");.swift
int u30 = kne.u(o, "work_spec_requires_storage_not_low");.swift
int u31 = kne.u(o, "work_spec_trigger_content_update_delay");.swift
int u32 = kne.u(o, "work_spec_trigger_max_content_delay");.swift
int u33 = kne.u(o, "work_spec_content_uri_triggers");.swift
int i8 = u13;.swift
ArrayList arrayList = new ArrayList(o.getCount());.swift
while (o.moveToNext()) {.swift
if (o.isNull(u)) {.swift
str = null;.swift
} else {.swift
str = o.getString(u);.swift
}.swift
if (o.isNull(u2)) {.swift
str2 = null;.swift
} else {.swift
str2 = o.getString(u2);.swift
}.swift
fb5 __ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(o.getString(u3));.swift
if (o.isNull(u4)) {.swift
str3 = null;.swift
} else {.swift
str3 = o.getString(u4);.swift
}.swift
HashSet w = m5a.w(str3);.swift
long j = o.getLong(u5);.swift
int i9 = o.getInt(u6);.swift
if (o.isNull(u7)) {.swift
str4 = null;.swift
} else {.swift
str4 = o.getString(u7);.swift
}.swift
xog K = o5a.K(o.getInt(u8));.swift
if (o.isNull(u9)) {.swift
str5 = null;.swift
} else {.swift
str5 = o.getString(u9);.swift
}.swift
if (o.isNull(u10)) {.swift
str6 = null;.swift
} else {.swift
str6 = o.getString(u10);.swift
}.swift
if (o.isNull(u11)) {.swift
bArr = null;.swift
} else {.swift
bArr = o.getBlob(u11);.swift
}.swift
t64 a2 = t64.a(bArr);.swift
if (o.isNull(u12)) {.swift
bArr2 = null;.swift
} else {.swift
bArr2 = o.getBlob(u12);.swift
}.swift
t64 a3 = t64.a(bArr2);.swift
int i10 = i8;.swift
long j2 = o.getLong(i10);.swift
int i11 = u14;.swift
long j3 = o.getLong(i11);.swift
u14 = i11;.swift
int i12 = u15;.swift
long j4 = o.getLong(i12);.swift
u15 = i12;.swift
int i13 = u16;.swift
int i14 = o.getInt(i13);.swift
u16 = i13;.swift
int i15 = u17;.swift
ag0 H = o5a.H(o.getInt(i15));.swift
u17 = i15;.swift
int i16 = u18;.swift
long j5 = o.getLong(i16);.swift
u18 = i16;.swift
int i17 = u19;.swift
long j6 = o.getLong(i17);.swift
u19 = i17;.swift
int i18 = u20;.swift
long j7 = o.getLong(i18);.swift
u20 = i18;.swift
int i19 = u21;.swift
long j8 = o.getLong(i19);.swift
u21 = i19;.swift
int i20 = u22;.swift
if (o.getInt(i20) = 0) {.swift
u22 = i20;.swift
i3 = u23;.swift
z = true;.swift
} else {.swift
u22 = i20;.swift
i3 = u23;.swift
z = false;.swift
}.swift
t5b J = o5a.J(o.getInt(i3));.swift
u23 = i3;.swift
int i21 = u24;.swift
int i22 = o.getInt(i21);.swift
u24 = i21;.swift
int i23 = u25;.swift
int i24 = o.getInt(i23);.swift
u25 = i23;.swift
int i25 = u26;.swift
int I = o5a.I(o.getInt(i25));.swift
u26 = i25;.swift
int i26 = u27;.swift
if (o.getInt(i26) = 0) {.swift
u27 = i26;.swift
i4 = u28;.swift
z2 = true;.swift
} else {.swift
u27 = i26;.swift
i4 = u28;.swift
z2 = false;.swift
}.swift
if (o.getInt(i4) = 0) {.swift
u28 = i4;.swift
i5 = u29;.swift
z3 = true;.swift
} else {.swift
u28 = i4;.swift
i5 = u29;.swift
z3 = false;.swift
}.swift
if (o.getInt(i5) = 0) {.swift
u29 = i5;.swift
i6 = u30;.swift
z4 = true;.swift
} else {.swift
u29 = i5;.swift
i6 = u30;.swift
z4 = false;.swift
}.swift
if (o.getInt(i6) = 0) {.swift
u30 = i6;.swift
i7 = u31;.swift
z5 = true;.swift
} else {.swift
u30 = i6;.swift
i7 = u31;.swift
z5 = false;.swift
}.swift
long j9 = o.getLong(i7);.swift
u31 = i7;.swift
int i27 = u32;.swift
long j10 = o.getLong(i27);.swift
u32 = i27;.swift
int i28 = u33;.swift
if (o.isNull(i28)) {.swift
bArr3 = null;.swift
} else {.swift
bArr3 = o.getBlob(i28);.swift
}.swift
u33 = i28;.swift
arrayList.add(new hqg(str, str2, __ExistingWorkPolicy_stringToEnum, new xpg(str4, K, str5, str6, a2, a3, j2, j3, j4, new wj3(I, z2, z3, z4, z5, j9, j10, o5a.g(bArr3)), i14, H, j5, j6, j7, j8, z, J, i22, i24), w, j, i9));.swift
workersQueueDao_Impl = this;.swift
i8 = i10;.swift
}.swift
o.close();.swift
d7d.o();.swift
return arrayList;.swift
} catch (Throwable th) {.swift
th = th;.swift
o.close();.swift
d7d.o();.swift
throw th;.swift
}.swift
} catch (Throwable th2) {.swift
th = th2;.swift
d7d = a;.swift
o.close();.swift
d7d.o();.swift
throw th;.swift
}.swift
}.swift
}.swift
