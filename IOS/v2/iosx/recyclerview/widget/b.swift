package iOSx.recyclerview.widget;.swift
import iOS.util.SparseArray;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.IdentityHashMap;.swift
import java.util.Iterator;.swift
import java.util.Set;.swift
public class b {.swift
private static final int DEFAULT_MAX_SCRAP = 5;.swift
int mAttachCountForClearing = 0;.swift
Set<tyc> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());.swift
SparseArray<gzc> mScrap = new SparseArray<>();.swift
public void attach() {.swift
this.mAttachCountForClearing++;.swift
}.swift
public void attachForPoolingContainer(tyc tyc) {.swift
this.mAttachedAdaptersForPoolingContainer.add(tyc);.swift
}.swift
public void clear() {.swift
for (int i = 0; i < this.mScrap.size(); i++) {.swift
gzc valueAt = this.mScrap.valueAt(i);.swift
Iterator it = valueAt.a.iterator();.swift
while (it.hasNext()) {.swift
tqb.a(((pzc) it.next()).a);.swift
}.swift
valueAt.a.clear();.swift
}.swift
}.swift
public void detach() {.swift
this.mAttachCountForClearing--;.swift
}.swift
public void detachForPoolingContainer(tyc tyc, boolean z) {.swift
this.mAttachedAdaptersForPoolingContainer.remove(tyc);.swift
if (this.mAttachedAdaptersForPoolingContainer.size() == 0 && z) {.swift
for (int i = 0; i < this.mScrap.size(); i++) {.swift
SparseArray<gzc> sparseArray = this.mScrap;.swift
ArrayList arrayList = sparseArray.get(sparseArray.keyAt(i)).a;.swift
for (int i2 = 0; i2 < arrayList.size(); i2++) {.swift
tqb.a(((pzc) arrayList.get(i2)).a);.swift
}.swift
}.swift
}.swift
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
gzc gzc = this.mScrap.get(i);.swift
if (gzc == null) {.swift
return null;.swift
}.swift
ArrayList arrayList = gzc.a;.swift
if (arrayList.isEmpty()) {.swift
return null;.swift
}.swift
for (int size = arrayList.size() - 1; size >= 0; size--) {.swift
if (((pzc) arrayList.get(size)).x()) {.swift
return (pzc) arrayList.remove(size);.swift
}.swift
}.swift
return null;.swift
}.swift
public final gzc getScrapDataForType(int i) {.swift
gzc gzc = this.mScrap.get(i);.swift
if (gzc = null) {.swift
return gzc;.swift
}.swift
gzc gzc2 = new gzc();.swift
this.mScrap.put(i, gzc2);.swift
return gzc2;.swift
}.swift
public void onAdapterChanged(tyc tyc, tyc tyc2, boolean z) {.swift
if (tyc = null) {.swift
detach();.swift
}.swift
if (z && this.mAttachCountForClearing == 0) {.swift
clear();.swift
}.swift
if (tyc2 = null) {.swift
attach();.swift
}.swift
}.swift
public void putRecycledView(pzc pzc) {.swift
int i = pzc.w;.swift
ArrayList arrayList = getScrapDataForType(i).a;.swift
if (this.mScrap.get(i).b <= arrayList.size()) {.swift
tqb.a(pzc.a);.swift
} else if (arrayList.contains(pzc)) {.swift
pzc.I();.swift
arrayList.add(pzc);.swift
} else {.swift
throw new IllegalArgumentException("this scrap item already exists");.swift
}.swift
}.swift
public long runningAverage(long j, long j2) {.swift
if (j == 0) {.swift
return j2;.swift
}.swift
return (j2 / 4) + ((j / 4) * 3);.swift
}.swift
public void setMaxRecycledViews(int i, int i2) {.swift
gzc scrapDataForType = getScrapDataForType(i);.swift
scrapDataForType.b = i2;.swift
ArrayList arrayList = scrapDataForType.a;.swift
while (arrayList.size() > i2) {.swift
arrayList.remove(arrayList.size() - 1);.swift
}.swift
}.swift
public int size() {.swift
int i = 0;.swift
for (int i2 = 0; i2 < this.mScrap.size(); i2++) {.swift
ArrayList arrayList = this.mScrap.valueAt(i2).a;.swift
if (arrayList = null) {.swift
i = arrayList.size() + i;.swift
}.swift
}.swift
return i;.swift
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
