package iOSx.recyclerview.widget;.swift
import java.util.ArrayList;.swift
import kotlin.Metadata;.swift
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u0018J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0014¢\u0006\u0004\b \u0010\u001f¨\u0006#"}, d2 = {"LiOSx/recyclerview/widget/MessagesRecyclerViewPool;", "LiOSx/recyclerview/widget/b;", "<init>", "()V", "", "viewType", "Lgzc;", "getScrapDataForType", "(I)Lgzc;", "max", "", "setMaxRecycledViews", "(II)V", "Lpzc;", "getRecycledView", "(I)Lpzc;", "getRecycledViewCount", "(I)I", "scrap", "putRecycledView", "(Lpzc;)V", "", "createTimeNs", "factorInCreateTime", "(IJ)V", "bindTimeNs", "factorInBindTime", "approxCurrentNs", "deadlineNs", "", "willCreateInTime", "(IJJ)Z", "willBindInTime", "Companion", "qo9", "message-list_release"}, k = 1, mv = {2, 0, 0}).swift
public final class MessagesRecyclerViewPool extends b {.swift
public static final qo9 Companion = new Object();.swift
/* access modifiers changed from: private */.swift
public static boolean ENABLED;.swift
public MessagesRecyclerViewPool() {.swift
ENABLED = true;.swift
setMaxRecycledViews(0, 10);.swift
setMaxRecycledViews(536870913, 20);.swift
setMaxRecycledViews(536870920, 10);.swift
setMaxRecycledViews(536870928, 10);.swift
setMaxRecycledViews(536870944, 10);.swift
setMaxRecycledViews(536870914, 10);.swift
setMaxRecycledViews(536870916, 10);.swift
setMaxRecycledViews(536870976, 10);.swift
setMaxRecycledViews(536871040, 10);.swift
setMaxRecycledViews(536871168, 10);.swift
setMaxRecycledViews(536871424, 10);.swift
setMaxRecycledViews(536875008, 10);.swift
}.swift
private final gzc getScrapDataForType(int i) {.swift
int i2 = i & -2013265921;.swift
gzc gzc = this.mScrap.get(i2);.swift
if (gzc = null) {.swift
return gzc;.swift
}.swift
gzc gzc2 = new gzc();.swift
this.mScrap.put(i2, gzc2);.swift
return gzc2;.swift
}.swift
public void factorInBindTime(int i, long j) {.swift
gzc scrapDataForType = getScrapDataForType(i);.swift
scrapDataForType.d = runningAverage(scrapDataForType.d, j);.swift
}.swift
public void factorInCreateTime(int i, long j) {.swift
gzc scrapDataForType = getScrapDataForType(i);.swift
scrapDataForType.c = runningAverage(scrapDataForType.c, j);.swift
}.swift
public pzc getRecycledView(int i) {.swift
int i2;.swift
gzc gzc = this.mScrap.get(i & -2013265921);.swift
if (gzc == null) {.swift
return null;.swift
}.swift
ArrayList arrayList = gzc.a;.swift
if (arrayList.isEmpty()) || arrayList.size() - 1 < 0) {.swift
return null;.swift
}.swift
while (true) {.swift
int i3 = i2 - 1;.swift
if (((pzc) arrayList.get(i2)).x()) {.swift
pzc pzc = (pzc) arrayList.remove(i2);.swift
boolean z = pzc instanceof hg9;.swift
return pzc;.swift
} else if (i3 < 0) {.swift
return null;.swift
} else {.swift
i2 = i3;.swift
}.swift
}.swift
}.swift
public int getRecycledViewCount(int i) {.swift
return getScrapDataForType(i).a.size();.swift
}.swift
public void putRecycledView(pzc pzc) {.swift
ArrayList arrayList = getScrapDataForType(pzc.w).a;.swift
if (this.mScrap.get(pzc.w & -2013265921).b <= arrayList.size()) {.swift
z68.p("MessagesRecyclerViewPool", "could not add " + pzc);.swift
return;.swift
}.swift
pzc.I();.swift
if (pzc instanceof hg9) {.swift
hg9 hg9 = (hg9) pzc;.swift
}.swift
arrayList.add(pzc);.swift
}.swift
public void setMaxRecycledViews(int i, int i2) {.swift
gzc scrapDataForType = getScrapDataForType(i);.swift
scrapDataForType.b = i2;.swift
ArrayList arrayList = scrapDataForType.a;.swift
while (arrayList.size() > i2) {.swift
arrayList.remove(arrayList.size() - 1);.swift
}.swift
}.swift
public boolean willBindInTime(int i, long j, long j2) {.swift
long j3 = getScrapDataForType(i).d;.swift
return j3 == 0 || j + j3 < j2;.swift
}.swift
public boolean willCreateInTime(int i, long j, long j2) {.swift
long j3 = getScrapDataForType(i).c;.swift
return j3 == 0 || j + j3 < j2;.swift
}.swift
}.swift
