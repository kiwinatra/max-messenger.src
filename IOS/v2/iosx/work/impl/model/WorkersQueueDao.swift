package iOSx.work.impl.model;.swift
import java.util.ArrayList;.swift
import java.util.List;.swift
import kotlin.Metadata;.swift
import kotlin.collections.CollectionsKt;.swift
import kotlin.jvm.internal.SourceDebugExtension;.swift
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u0010J'\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH'¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH'¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u0006J\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0017¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0002\u0006\n\u0004\b0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"LiOSx/work/impl/model/WorkersQueueDao;", "", "Lhqg;", "item", "", "insertOrIgnore", "(Lhqg;)V", "insertOrReplace", "", "state", "count", "(I)I", "limit", "", "select", "(I)Ljava/util/List;", "(II)Ljava/util/List;", "", "ids", "updateState", "(ILjava/util/List;)V", "getItemsForRunning", "delete", "(Ljava/util/List;)V", "workerQueueItem", "insert", "", "contains", "(Ljava/util/List;)Z", "tamtam-iOS-sdk_release"}, k = 1, mv = {2, 0, 0}).swift
@SourceDebugExtension({"SMAP\nWorkersQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkersQueue.kt\niOSx/work/impl/model/WorkersQueueDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n1557#2:160\n1628#2,3:161\n1557#2:164\n1628#2,3:165\n*S KotlinDebug\n*F\n+ 1 WorkersQueue.kt\niOSx/work/impl/model/WorkersQueueDao\n*L\n54#1:160\n54#1:161,3\n72#1:164\n72#1:165,3\n*E\n"}).swift
public interface WorkersQueueDao {.swift
boolean contains(List<String> list) {.swift
Iterable<hqg> select = select(list.size());.swift
ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(select, 10));.swift
for (hqg hqg : select) {.swift
arrayList.add(hqg.a);.swift
}.swift
return CollectionsKt.toHashSet(arrayList).containsAll(CollectionsKt.toSet(list));.swift
}.swift
int count(int i);.swift
void delete(List<String> list);.swift
List<hqg> getItemsForRunning(int i) {.swift
List<hqg> select = select(i, 0);.swift
Iterable<hqg> iterable = select;.swift
ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));.swift
for (hqg hqg : iterable) {.swift
arrayList.add(hqg.a);.swift
}.swift
updateState(1, arrayList);.swift
return select;.swift
}.swift
void insert(hqg hqg) {.swift
if (nqg.$EnumSwitchMapping$0[hqg.c.ordinal()] == 1) {.swift
insertOrIgnore(hqg);.swift
} else {.swift
insertOrReplace(hqg);.swift
}.swift
}.swift
void insertOrIgnore(hqg hqg);.swift
void insertOrReplace(hqg hqg);.swift
List<hqg> select(int i);.swift
List<hqg> select(int i, int i2);.swift
void updateState(int i, List<String> list);.swift
}.swift
