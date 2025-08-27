package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@SourceDebugExtension({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,660:1\n476#1,53:663\n476#1,53:716\n37#2,2:661\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n471#1:663,53\n473#1:716,53\n46#1:661,2\n*E\n"})
@SinceKotlin(version = "1.4")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u0000 [*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001[B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140)H\bJ\u000b\u0010*\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010-\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\b¢\u0006\u0002\u0010.J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\bJM\u00103\u001a\u00020\u00172>\u00104\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001705H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0014H\u0016J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\r\u0010<\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0018\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0004H\u0002J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010B\u001a\u00020\u0017H\u0002J\u0015\u0010C\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010D\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010E\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010.J\u000b\u0010F\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010G\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u000b\u0010H\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010I\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0018\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0014J\u0018\u0010M\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0002J\u0018\u0010N\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0002J\u0016\u0010O\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010P\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010QJ\u001d\u0010R\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0000¢\u0006\u0002\bSJ\u0017\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\bU\u0010VJ)\u0010T\u001a\b\u0012\u0004\u0012\u0002HW0\u000b\"\u0004\b\u0001\u0010W2\f\u0010X\u001a\b\u0012\u0004\u0012\u0002HW0\u000bH\u0000¢\u0006\u0004\bU\u0010YJ\u0015\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0002\u0010VJ'\u0010Z\u001a\b\u0012\u0004\u0012\u0002HW0\u000b\"\u0004\b\u0001\u0010W2\f\u0010X\u001a\b\u0012\u0004\u0012\u0002HW0\u000bH\u0016¢\u0006\u0002\u0010YR\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\\"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "elementData", "", "", "[Ljava/lang/Object;", "head", "<set-?>", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "contains", "copyCollectionElements", "internalIndex", "copyElements", "newCapacity", "decremented", "ensureCapacity", "minCapacity", "filterInPlace", "predicate", "Lkotlin/Function1;", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", "indexOf", "(Ljava/lang/Object;)I", "internalGet", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "isEmpty", "last", "lastIndexOf", "lastOrNull", "negativeMod", "nullifyNonEmpty", "internalFromIndex", "internalToIndex", "positiveMod", "registerModification", "remove", "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "removeRange", "fromIndex", "toIndex", "removeRangeShiftPreceding", "removeRangeShiftSucceeding", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "testRemoveRange", "testRemoveRange$kotlin_stdlib", "testToArray", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int defaultMinCapacity = 10;
    private static final Object[] emptyElementData = new Object[0];
    private Object[] elementData;
    private int head;
    private int size;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "()V", "defaultMinCapacity", "", "emptyElementData", "", "[Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ArrayDeque(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = emptyElementData;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(wj6.h(i, "Illegal Capacity: "));
        }
        this.elementData = objArr;
    }

    private final void copyCollectionElements(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.elementData.length;
        while (i < length && it.hasNext()) {
            this.elementData[i] = it.next();
            i++;
        }
        int i2 = this.head;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.elementData[i3] = it.next();
        }
        this.size = collection.size() + size();
    }

    private final void copyElements(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.elementData;
        ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, (T[]) objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i2 = this.head;
        ArraysKt___ArraysJvmKt.copyInto((T[]) objArr3, (T[]) objArr, length - i2, 0, i2);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int decremented(int i) {
        return i == 0 ? ArraysKt___ArraysKt.getLastIndex((T[]) this.elementData) : i - 1;
    }

    private final void ensureCapacity(int i) {
        if (i >= 0) {
            Object[] objArr = this.elementData;
            if (i > objArr.length) {
                if (objArr == emptyElementData) {
                    this.elementData = new Object[RangesKt.coerceAtLeast(i, 10)];
                } else {
                    copyElements(AbstractList.Companion.newCapacity$kotlin_stdlib(objArr.length, i));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean filterInPlace(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x009e
            java.lang.Object[] r0 = r11.elementData
            int r0 = r0.length
            if (r0 != 0) goto L_0x000e
            goto L_0x009e
        L_0x000e:
            int r0 = r11.head
            int r2 = r11.size()
            int r2 = r2 + r0
            int r0 = r11.positiveMod(r2)
            int r2 = r11.head
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0044
            r5 = r2
        L_0x0020:
            if (r2 >= r0) goto L_0x003e
            java.lang.Object[] r6 = r11.elementData
            r6 = r6[r2]
            java.lang.Object r7 = r12.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x003a
            java.lang.Object[] r7 = r11.elementData
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003b
        L_0x003a:
            r1 = r4
        L_0x003b:
            int r2 = r2 + 1
            goto L_0x0020
        L_0x003e:
            java.lang.Object[] r12 = r11.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.fill((T[]) r12, r3, (int) r5, (int) r0)
            goto L_0x0090
        L_0x0044:
            java.lang.Object[] r5 = r11.elementData
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0049:
            if (r2 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.elementData
            r9 = r8[r2]
            r8[r2] = r3
            java.lang.Object r8 = r12.invoke(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.elementData
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = r4
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0049
        L_0x0069:
            int r2 = r11.positiveMod(r6)
            r5 = r2
        L_0x006e:
            if (r1 >= r0) goto L_0x008f
            java.lang.Object[] r2 = r11.elementData
            r6 = r2[r1]
            r2[r1] = r3
            java.lang.Object r2 = r12.invoke(r6)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x008b
            java.lang.Object[] r2 = r11.elementData
            r2[r5] = r6
            int r5 = r11.incremented(r5)
            goto L_0x008c
        L_0x008b:
            r7 = r4
        L_0x008c:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008f:
            r1 = r7
        L_0x0090:
            if (r1 == 0) goto L_0x009e
            r11.registerModification()
            int r12 = r11.head
            int r5 = r5 - r12
            int r12 = r11.negativeMod(r5)
            r11.size = r12
        L_0x009e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.ArrayDeque.filterInPlace(kotlin.jvm.functions.Function1):boolean");
    }

    private final int incremented(int i) {
        if (i == ArraysKt___ArraysKt.getLastIndex((T[]) this.elementData)) {
            return 0;
        }
        return i + 1;
    }

    @InlineOnly
    private final E internalGet(int i) {
        return this.elementData[i];
    }

    @InlineOnly
    private final int internalIndex(int i) {
        return positiveMod(this.head + i);
    }

    private final int negativeMod(int i) {
        return i < 0 ? i + this.elementData.length : i;
    }

    private final void nullifyNonEmpty(int i, int i2) {
        if (i < i2) {
            ArraysKt___ArraysJvmKt.fill((T[]) this.elementData, null, i, i2);
            return;
        }
        Object[] objArr = this.elementData;
        ArraysKt___ArraysJvmKt.fill((T[]) objArr, null, i, objArr.length);
        ArraysKt___ArraysJvmKt.fill((T[]) this.elementData, null, 0, i2);
    }

    private final int positiveMod(int i) {
        Object[] objArr = this.elementData;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final void registerModification() {
        this.modCount++;
    }

    private final void removeRangeShiftPreceding(int i, int i2) {
        int positiveMod = positiveMod((i - 1) + this.head);
        int positiveMod2 = positiveMod((i2 - 1) + this.head);
        while (i > 0) {
            int i3 = positiveMod + 1;
            int min = Math.min(i, Math.min(i3, positiveMod2 + 1));
            Object[] objArr = this.elementData;
            int i4 = positiveMod2 - min;
            int i5 = positiveMod - min;
            ArraysKt___ArraysJvmKt.copyInto((T[]) objArr, (T[]) objArr, i4 + 1, i5 + 1, i3);
            positiveMod = negativeMod(i5);
            positiveMod2 = negativeMod(i4);
            i -= min;
        }
    }

    private final void removeRangeShiftSucceeding(int i, int i2) {
        int positiveMod = positiveMod(this.head + i2);
        int positiveMod2 = positiveMod(this.head + i);
        int size2 = size();
        while (true) {
            size2 -= i2;
            if (size2 > 0) {
                Object[] objArr = this.elementData;
                i2 = Math.min(size2, Math.min(objArr.length - positiveMod, objArr.length - positiveMod2));
                Object[] objArr2 = this.elementData;
                int i3 = positiveMod + i2;
                ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, (T[]) objArr2, positiveMod2, positiveMod, i3);
                positiveMod = positiveMod(i3);
                positiveMod2 = positiveMod(positiveMod2 + i2);
            } else {
                return;
            }
        }
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity(collection.size() + size());
        copyCollectionElements(positiveMod(size() + this.head), collection);
        return true;
    }

    public final void addFirst(E e) {
        registerModification();
        ensureCapacity(size() + 1);
        int decremented = decremented(this.head);
        this.head = decremented;
        this.elementData[decremented] = e;
        this.size = size() + 1;
    }

    public final void addLast(E e) {
        registerModification();
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(size() + this.head)] = e;
        this.size = size() + 1;
    }

    public void clear() {
        if (!isEmpty()) {
            registerModification();
            nullifyNonEmpty(this.head, positiveMod(size() + this.head));
        }
        this.head = 0;
        this.size = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (!isEmpty()) {
            return this.elementData[this.head];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.elementData[this.head];
    }

    public E get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return this.elementData[positiveMod(this.head + i)];
    }

    public int getSize() {
        return this.size;
    }

    public int indexOf(Object obj) {
        int i;
        int positiveMod = positiveMod(size() + this.head);
        int i2 = this.head;
        if (i2 < positiveMod) {
            while (i2 < positiveMod) {
                if (Intrinsics.areEqual(obj, this.elementData[i2])) {
                    i = this.head;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < positiveMod) {
            return -1;
        } else {
            int length = this.elementData.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < positiveMod) {
                        if (Intrinsics.areEqual(obj, this.elementData[i3])) {
                            i2 = i3 + this.elementData.length;
                            i = this.head;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (Intrinsics.areEqual(obj, this.elementData[i2])) {
                    i = this.head;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r2.head;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void internalStructure$kotlin_stdlib(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Object[], kotlin.Unit> r3) {
        /*
            r2 = this;
            int r0 = r2.head
            int r1 = r2.size()
            int r1 = r1 + r0
            int r0 = r2.positiveMod(r1)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x001b
            int r1 = r2.head
            if (r1 >= r0) goto L_0x0016
            goto L_0x001b
        L_0x0016:
            java.lang.Object[] r0 = r2.elementData
            int r0 = r0.length
            int r1 = r1 - r0
            goto L_0x001d
        L_0x001b:
            int r1 = r2.head
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = r2.toArray()
            r3.invoke(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.ArrayDeque.internalStructure$kotlin_stdlib(kotlin.jvm.functions.Function2):void");
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (!isEmpty()) {
            return this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public int lastIndexOf(Object obj) {
        int i;
        int i2;
        int positiveMod = positiveMod(size() + this.head);
        int i3 = this.head;
        if (i3 < positiveMod) {
            i = positiveMod - 1;
            if (i3 <= i) {
                while (!Intrinsics.areEqual(obj, this.elementData[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.head;
            }
            return -1;
        }
        if (i3 > positiveMod) {
            int i4 = positiveMod - 1;
            while (true) {
                if (-1 >= i4) {
                    int lastIndex = ArraysKt___ArraysKt.getLastIndex((T[]) this.elementData);
                    int i5 = this.head;
                    if (i5 <= lastIndex) {
                        while (!Intrinsics.areEqual(obj, this.elementData[i])) {
                            if (i != i5) {
                                lastIndex = i - 1;
                            }
                        }
                        i2 = this.head;
                    }
                } else if (Intrinsics.areEqual(obj, this.elementData[i4])) {
                    i = i4 + this.elementData.length;
                    i2 = this.head;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008f
            java.lang.Object[] r0 = r11.elementData
            int r0 = r0.length
            if (r0 != 0) goto L_0x000e
            goto L_0x008f
        L_0x000e:
            int r0 = r11.head
            int r2 = r11.size()
            int r2 = r2 + r0
            int r0 = r11.positiveMod(r2)
            int r2 = r11.head
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x003f
            r5 = r2
        L_0x0020:
            if (r2 >= r0) goto L_0x0039
            java.lang.Object[] r6 = r11.elementData
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x0035
            java.lang.Object[] r7 = r11.elementData
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0036
        L_0x0035:
            r1 = r4
        L_0x0036:
            int r2 = r2 + 1
            goto L_0x0020
        L_0x0039:
            java.lang.Object[] r12 = r11.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.fill((T[]) r12, r3, (int) r5, (int) r0)
            goto L_0x0081
        L_0x003f:
            java.lang.Object[] r5 = r11.elementData
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0044:
            if (r2 >= r5) goto L_0x005f
            java.lang.Object[] r8 = r11.elementData
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x005b
            java.lang.Object[] r8 = r11.elementData
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005c
        L_0x005b:
            r7 = r4
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x0044
        L_0x005f:
            int r2 = r11.positiveMod(r6)
            r5 = r2
        L_0x0064:
            if (r1 >= r0) goto L_0x0080
            java.lang.Object[] r2 = r11.elementData
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x007c
            java.lang.Object[] r2 = r11.elementData
            r2[r5] = r6
            int r5 = r11.incremented(r5)
            goto L_0x007d
        L_0x007c:
            r7 = r4
        L_0x007d:
            int r1 = r1 + 1
            goto L_0x0064
        L_0x0080:
            r1 = r7
        L_0x0081:
            if (r1 == 0) goto L_0x008f
            r11.registerModification()
            int r12 = r11.head
            int r5 = r5 - r12
            int r12 = r11.negativeMod(r5)
            r11.size = r12
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.ArrayDeque.removeAll(java.util.Collection):boolean");
    }

    public E removeAt(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        if (i == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int positiveMod = positiveMod(this.head + i);
        E e = this.elementData[positiveMod];
        if (i < (size() >> 1)) {
            int i2 = this.head;
            if (positiveMod >= i2) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto((T[]) objArr, (T[]) objArr, i2 + 1, i2, positiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, (T[]) objArr2, 1, 0, positiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.head;
                ArraysKt___ArraysJvmKt.copyInto((T[]) objArr3, (T[]) objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i4 = this.head;
            objArr4[i4] = null;
            this.head = incremented(i4);
        } else {
            int positiveMod2 = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
            if (positiveMod <= positiveMod2) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto((T[]) objArr5, (T[]) objArr5, positiveMod, positiveMod + 1, positiveMod2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto((T[]) objArr6, (T[]) objArr6, positiveMod, positiveMod + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt___ArraysJvmKt.copyInto((T[]) objArr7, (T[]) objArr7, 0, 1, positiveMod2 + 1);
            }
            this.elementData[positiveMod2] = null;
        }
        this.size = size() - 1;
        return e;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            registerModification();
            E[] eArr = this.elementData;
            int i = this.head;
            E e = eArr[i];
            eArr[i] = null;
            this.head = incremented(i);
            this.size = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (!isEmpty()) {
            registerModification();
            int positiveMod = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
            E[] eArr = this.elementData;
            E e = eArr[positiveMod];
            eArr[positiveMod] = null;
            this.size = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public void removeRange(int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, size());
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == size()) {
                clear();
            } else if (i3 == 1) {
                remove(i);
            } else {
                registerModification();
                if (i < size() - i2) {
                    removeRangeShiftPreceding(i, i2);
                    int positiveMod = positiveMod(this.head + i3);
                    nullifyNonEmpty(this.head, positiveMod);
                    this.head = positiveMod;
                } else {
                    removeRangeShiftSucceeding(i, i2);
                    int positiveMod2 = positiveMod(size() + this.head);
                    nullifyNonEmpty(negativeMod(positiveMod2 - i3), positiveMod2);
                }
                this.size = size() - i3;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008c
            java.lang.Object[] r0 = r11.elementData
            int r0 = r0.length
            if (r0 != 0) goto L_0x000e
            goto L_0x008c
        L_0x000e:
            int r0 = r11.head
            int r2 = r11.size()
            int r2 = r2 + r0
            int r0 = r11.positiveMod(r2)
            int r2 = r11.head
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x003e
            r5 = r2
        L_0x0020:
            if (r2 >= r0) goto L_0x0038
            java.lang.Object[] r6 = r11.elementData
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0034
            java.lang.Object[] r7 = r11.elementData
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0035
        L_0x0034:
            r1 = r4
        L_0x0035:
            int r2 = r2 + 1
            goto L_0x0020
        L_0x0038:
            java.lang.Object[] r12 = r11.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.fill((T[]) r12, r3, (int) r5, (int) r0)
            goto L_0x007e
        L_0x003e:
            java.lang.Object[] r5 = r11.elementData
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0043:
            if (r2 >= r5) goto L_0x005d
            java.lang.Object[] r8 = r11.elementData
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0059
            java.lang.Object[] r8 = r11.elementData
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005a
        L_0x0059:
            r7 = r4
        L_0x005a:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x005d:
            int r2 = r11.positiveMod(r6)
            r5 = r2
        L_0x0062:
            if (r1 >= r0) goto L_0x007d
            java.lang.Object[] r2 = r11.elementData
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x0079
            java.lang.Object[] r2 = r11.elementData
            r2[r5] = r6
            int r5 = r11.incremented(r5)
            goto L_0x007a
        L_0x0079:
            r7 = r4
        L_0x007a:
            int r1 = r1 + 1
            goto L_0x0062
        L_0x007d:
            r1 = r7
        L_0x007e:
            if (r1 == 0) goto L_0x008c
            r11.registerModification()
            int r12 = r11.head
            int r5 = r5 - r12
            int r12 = r11.negativeMod(r5)
            r11.size = r12
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.ArrayDeque.retainAll(java.util.Collection):boolean");
    }

    public E set(int i, E e) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        int positiveMod = positiveMod(this.head + i);
        E[] eArr = this.elementData;
        E e2 = eArr[positiveMod];
        eArr[positiveMod] = e;
        return e2;
    }

    public final void testRemoveRange$kotlin_stdlib(int i, int i2) {
        removeRange(i, i2);
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] tArr) {
        return toArray(tArr);
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < size()) {
            tArr = ArraysKt__ArraysJVMKt.arrayOfNulls(tArr, size());
        }
        int positiveMod = positiveMod(size() + this.head);
        int i = this.head;
        if (i < positiveMod) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.elementData, (Object[]) tArr, 0, i, positiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto((T[]) objArr, tArr, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, tArr, objArr2.length - this.head, 0, positiveMod);
        }
        return CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(size(), tArr);
    }

    public void add(int i, E e) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            registerModification();
            ensureCapacity(size() + 1);
            int positiveMod = positiveMod(this.head + i);
            if (i < ((size() + 1) >> 1)) {
                int decremented = decremented(positiveMod);
                int decremented2 = decremented(this.head);
                int i2 = this.head;
                if (decremented >= i2) {
                    Object[] objArr = this.elementData;
                    objArr[decremented2] = objArr[i2];
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr, (T[]) objArr, i2, i2 + 1, decremented + 1);
                } else {
                    Object[] objArr2 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, (T[]) objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.elementData;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr3, (T[]) objArr3, 0, 1, decremented + 1);
                }
                this.elementData[decremented] = e;
                this.head = decremented2;
            } else {
                int positiveMod2 = positiveMod(size() + this.head);
                if (positiveMod < positiveMod2) {
                    Object[] objArr4 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr4, (T[]) objArr4, positiveMod + 1, positiveMod, positiveMod2);
                } else {
                    Object[] objArr5 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr5, (T[]) objArr5, 1, 0, positiveMod2);
                    Object[] objArr6 = this.elementData;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr6, (T[]) objArr6, positiveMod + 1, positiveMod, objArr6.length - 1);
                }
                this.elementData[positiveMod] = e;
            }
            this.size = size() + 1;
        }
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        registerModification();
        ensureCapacity(collection.size() + size());
        int positiveMod = positiveMod(size() + this.head);
        int positiveMod2 = positiveMod(this.head + i);
        int size2 = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.head;
            int i3 = i2 - size2;
            if (positiveMod2 < i2) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto((T[]) objArr, (T[]) objArr, i3, i2, objArr.length);
                if (size2 >= positiveMod2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, (T[]) objArr2, objArr2.length - size2, 0, positiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr3, (T[]) objArr3, objArr3.length - size2, 0, size2);
                    Object[] objArr4 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr4, (T[]) objArr4, 0, size2, positiveMod2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto((T[]) objArr5, (T[]) objArr5, i3, i2, positiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                i3 += objArr6.length;
                int i4 = positiveMod2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr6, (T[]) objArr6, i3, i2, positiveMod2);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr6, (T[]) objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr7, (T[]) objArr7, 0, this.head + length, positiveMod2);
                }
            }
            this.head = i3;
            copyCollectionElements(negativeMod(positiveMod2 - size2), collection);
        } else {
            int i5 = positiveMod2 + size2;
            if (positiveMod2 < positiveMod) {
                int i6 = size2 + positiveMod;
                Object[] objArr8 = this.elementData;
                if (i6 <= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr8, (T[]) objArr8, i5, positiveMod2, positiveMod);
                } else if (i5 >= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr8, (T[]) objArr8, i5 - objArr8.length, positiveMod2, positiveMod);
                } else {
                    int length2 = positiveMod - (i6 - objArr8.length);
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr8, (T[]) objArr8, 0, length2, positiveMod);
                    Object[] objArr9 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr9, (T[]) objArr9, i5, positiveMod2, length2);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto((T[]) objArr10, (T[]) objArr10, size2, 0, positiveMod);
                Object[] objArr11 = this.elementData;
                if (i5 >= objArr11.length) {
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr11, (T[]) objArr11, i5 - objArr11.length, positiveMod2, objArr11.length);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr11, (T[]) objArr11, 0, objArr11.length - size2, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr12, (T[]) objArr12, i5, positiveMod2, objArr12.length - size2);
                }
            }
            copyCollectionElements(positiveMod2, collection);
        }
        return true;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(Collection<? extends E> collection) {
        Object[] array = collection.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }
}
