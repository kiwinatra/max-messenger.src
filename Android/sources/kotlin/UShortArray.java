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
@SourceDebugExtension({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1734#2,3:88\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n63#1:88,3\n*E\n"})
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0001\u0007\u0001\u00020\b\u0002\u0004\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "size", "", "constructor-impl", "(I)[S", "storage", "", "([S)[S", "getSize-impl", "([S)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-xj2QHRw", "([SS)Z", "containsAll", "elements", "containsAll-impl", "([SLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([SLjava/lang/Object;)Z", "get", "index", "get-Mh2AYeg", "([SI)S", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([S)Z", "iterator", "", "iterator-impl", "([S)Ljava/util/Iterator;", "set", "", "value", "set-01HTLdE", "([SIS)V", "toString", "", "toString-impl", "([S)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UShortArray implements Collection<UShort>, KMappedMarker {
    private final short[] storage;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0002J\u0013\u0010\n\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b!¨\u0006\r"}, d2 = {"Lkotlin/UShortArray$Iterator;", "", "Lkotlin/UShort;", "array", "", "([S)V", "index", "", "hasNext", "", "next", "next-Mh2AYeg", "()S", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Iterator implements java.util.Iterator<UShort>, KMappedMarker {
        private final short[] array;
        private int index;

        public Iterator(short[] sArr) {
            this.array = sArr;
        }

        public boolean hasNext() {
            return this.index < this.array.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return UShort.m298boximpl(m372nextMh2AYeg());
        }

        /* renamed from: next-Mh2AYeg  reason: not valid java name */
        public short m372nextMh2AYeg() {
            int i = this.index;
            short[] sArr = this.array;
            if (i < sArr.length) {
                this.index = i + 1;
                return UShort.m304constructorimpl(sArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.index));
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    private /* synthetic */ UShortArray(short[] sArr) {
        this.storage = sArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UShortArray m355boximpl(short[] sArr) {
        return new UShortArray(sArr);
    }

    @PublishedApi
    /* renamed from: constructor-impl  reason: not valid java name */
    public static short[] m357constructorimpl(short[] sArr) {
        return sArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* renamed from: containsAll-impl  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m359containsAllimpl(short[] r3, java.util.Collection<kotlin.UShort> r4) {
        /*
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            java.util.Iterator r4 = r4.iterator()
        L_0x0011:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r4.next()
            boolean r2 = r0 instanceof kotlin.UShort
            if (r2 == 0) goto L_0x002c
            kotlin.UShort r0 = (kotlin.UShort) r0
            short r0 = r0.m354unboximpl()
            boolean r0 = kotlin.collections.ArraysKt.contains((short[]) r3, (short) r0)
            if (r0 == 0) goto L_0x002c
            goto L_0x0011
        L_0x002c:
            r1 = 0
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UShortArray.m359containsAllimpl(short[], java.util.Collection):boolean");
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m360equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof UShortArray) && Intrinsics.areEqual((Object) sArr, (Object) ((UShortArray) obj).m371unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m361equalsimpl0(short[] sArr, short[] sArr2) {
        return Intrinsics.areEqual((Object) sArr, (Object) sArr2);
    }

    /* renamed from: get-Mh2AYeg  reason: not valid java name */
    public static final short m362getMh2AYeg(short[] sArr, int i) {
        return UShort.m304constructorimpl(sArr[i]);
    }

    /* renamed from: getSize-impl  reason: not valid java name */
    public static int m363getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    @PublishedApi
    public static /* synthetic */ void getStorage$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m364hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static boolean m365isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    /* renamed from: iterator-impl  reason: not valid java name */
    public static java.util.Iterator<UShort> m366iteratorimpl(short[] sArr) {
        return new Iterator(sArr);
    }

    /* renamed from: set-01HTLdE  reason: not valid java name */
    public static final void m367set01HTLdE(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m368toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-xj2QHRw  reason: not valid java name */
    public boolean m369addxj2QHRw(short s) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends UShort> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof UShort)) {
            return false;
        }
        return m370containsxj2QHRw(((UShort) obj).m354unboximpl());
    }

    /* renamed from: contains-xj2QHRw  reason: not valid java name */
    public boolean m370containsxj2QHRw(short s) {
        return m358containsxj2QHRw(this.storage, s);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return m359containsAllimpl(this.storage, collection);
    }

    public boolean equals(Object obj) {
        return m360equalsimpl(this.storage, obj);
    }

    /* renamed from: getSize */
    public int size() {
        return m363getSizeimpl(this.storage);
    }

    public int hashCode() {
        return m364hashCodeimpl(this.storage);
    }

    public boolean isEmpty() {
        return m365isEmptyimpl(this.storage);
    }

    public java.util.Iterator<UShort> iterator() {
        return m366iteratorimpl(this.storage);
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
        return m368toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short[] m371unboximpl() {
        return this.storage;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short[] m356constructorimpl(int i) {
        return m357constructorimpl(new short[i]);
    }

    /* renamed from: contains-xj2QHRw  reason: not valid java name */
    public static boolean m358containsxj2QHRw(short[] sArr, short s) {
        return ArraysKt.contains(sArr, s);
    }

    public <T> T[] toArray(T[] tArr) {
        return CollectionToArray.toArray(this, tArr);
    }
}
