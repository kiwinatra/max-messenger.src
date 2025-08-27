package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@ExperimentalUnsignedTypes
@JvmInline
@SinceKotlin(version = "1.3")
@SourceDebugExtension({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1734#2,3:88\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n63#1:88,3\n*E\n"})
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0001\u0007\u0001\u00020\b\u0002\u0004\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/ULongArray;", "", "Lkotlin/ULong;", "size", "", "constructor-impl", "(I)[J", "storage", "", "([J)[J", "getSize-impl", "([J)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-VKZWuLQ", "([JJ)Z", "containsAll", "elements", "containsAll-impl", "([JLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([JLjava/lang/Object;)Z", "get", "index", "get-s-VKNKU", "([JI)J", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([J)Z", "iterator", "", "iterator-impl", "([J)Ljava/util/Iterator;", "set", "", "value", "set-k8EXiF4", "([JIJ)V", "toString", "", "toString-impl", "([J)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ULongArray implements Collection<ULong>, KMappedMarker {
    private final long[] storage;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0002J\u0013\u0010\n\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b!¨\u0006\r"}, d2 = {"Lkotlin/ULongArray$Iterator;", "", "Lkotlin/ULong;", "array", "", "([J)V", "index", "", "hasNext", "", "next", "next-s-VKNKU", "()J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Iterator implements java.util.Iterator<ULong>, KMappedMarker {
        private final long[] array;
        private int index;

        public Iterator(long[] jArr) {
            this.array = jArr;
        }

        public boolean hasNext() {
            return this.index < this.array.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return ULong.m191boximpl(m267nextsVKNKU());
        }

        /* renamed from: next-s-VKNKU  reason: not valid java name */
        public long m267nextsVKNKU() {
            int i = this.index;
            long[] jArr = this.array;
            if (i < jArr.length) {
                this.index = i + 1;
                return ULong.m197constructorimpl(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.index));
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    private /* synthetic */ ULongArray(long[] jArr) {
        this.storage = jArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ULongArray m250boximpl(long[] jArr) {
        return new ULongArray(jArr);
    }

    @PublishedApi
    /* renamed from: constructor-impl  reason: not valid java name */
    public static long[] m252constructorimpl(long[] jArr) {
        return jArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* renamed from: containsAll-impl  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m254containsAllimpl(long[] r4, java.util.Collection<kotlin.ULong> r5) {
        /*
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            java.util.Iterator r5 = r5.iterator()
        L_0x0011:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof kotlin.ULong
            if (r2 == 0) goto L_0x002c
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r2 = r0.m249unboximpl()
            boolean r0 = kotlin.collections.ArraysKt.contains((long[]) r4, (long) r2)
            if (r0 == 0) goto L_0x002c
            goto L_0x0011
        L_0x002c:
            r1 = 0
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ULongArray.m254containsAllimpl(long[], java.util.Collection):boolean");
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m255equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof ULongArray) && Intrinsics.areEqual((Object) jArr, (Object) ((ULongArray) obj).m266unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m256equalsimpl0(long[] jArr, long[] jArr2) {
        return Intrinsics.areEqual((Object) jArr, (Object) jArr2);
    }

    /* renamed from: get-s-VKNKU  reason: not valid java name */
    public static final long m257getsVKNKU(long[] jArr, int i) {
        return ULong.m197constructorimpl(jArr[i]);
    }

    /* renamed from: getSize-impl  reason: not valid java name */
    public static int m258getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    @PublishedApi
    public static /* synthetic */ void getStorage$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m259hashCodeimpl(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static boolean m260isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    /* renamed from: iterator-impl  reason: not valid java name */
    public static java.util.Iterator<ULong> m261iteratorimpl(long[] jArr) {
        return new Iterator(jArr);
    }

    /* renamed from: set-k8EXiF4  reason: not valid java name */
    public static final void m262setk8EXiF4(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m263toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-VKZWuLQ  reason: not valid java name */
    public boolean m264addVKZWuLQ(long j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends ULong> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof ULong)) {
            return false;
        }
        return m265containsVKZWuLQ(((ULong) obj).m249unboximpl());
    }

    /* renamed from: contains-VKZWuLQ  reason: not valid java name */
    public boolean m265containsVKZWuLQ(long j) {
        return m253containsVKZWuLQ(this.storage, j);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return m254containsAllimpl(this.storage, collection);
    }

    public boolean equals(Object obj) {
        return m255equalsimpl(this.storage, obj);
    }

    /* renamed from: getSize */
    public int size() {
        return m258getSizeimpl(this.storage);
    }

    public int hashCode() {
        return m259hashCodeimpl(this.storage);
    }

    public boolean isEmpty() {
        return m260isEmptyimpl(this.storage);
    }

    public java.util.Iterator<ULong> iterator() {
        return m261iteratorimpl(this.storage);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        return m263toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long[] m266unboximpl() {
        return this.storage;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long[] m251constructorimpl(int i) {
        return m252constructorimpl(new long[i]);
    }

    /* renamed from: contains-VKZWuLQ  reason: not valid java name */
    public static boolean m253containsVKZWuLQ(long[] jArr, long j) {
        return ArraysKt.contains(jArr, j);
    }

    public <T> T[] toArray(T[] tArr) {
        return CollectionToArray.toArray(this, tArr);
    }
}
