package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.BuilderInference;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\bø\u0001\u0000\u001aC\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\bø\u0001\u0000\u001a\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u0007H\b\u001a5\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\u0019\u001aN\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\b\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u001f\b\u0001\u0010\u001d\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0002\b\u001fH\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aF\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\b\"\u0004\b\u0000\u0010\u001b2\u001f\b\u0001\u0010\u001d\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0002\b\u001fH\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a!\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00182\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0002\u0010#\u001a3\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00070\u0018\"\u0004\b\u0000\u0010\u00072\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0018H\u0000¢\u0006\u0002\u0010%\u001a\u0012\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007H\b\u001a+\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010(\u001a%\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020!2\b\u0010*\u001a\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010+\u001a3\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020!2\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00070\u0018\"\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010(\u001a\u0015\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u0007H\b\u001a+\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010(\u001a%\u0010-\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0002\b0\u001a\b\u00101\u001a\u00020\u001eH\u0001\u001a\b\u00102\u001a\u00020\u001eH\u0001\u001a%\u00103\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018H\u0000¢\u0006\u0002\u00104\u001aS\u00105\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010*\u001a\u0002H\u00072\u001a\u00106\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000707j\n\u0012\u0006\b\u0000\u0012\u0002H\u0007`82\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u0006¢\u0006\u0002\u00109\u001a>\u00105\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000e\u001aE\u00105\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070;*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\b2\b\u0010*\u001a\u0004\u0018\u0001H\u00072\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u0006¢\u0006\u0002\u0010<\u001ag\u0010=\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010>*\b\u0012\u0004\u0012\u0002H>0;*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\u0010?\u001a\u0004\u0018\u0001H>2\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\u0016\b\u0004\u0010@\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H>0\u000eH\bø\u0001\u0000¢\u0006\u0002\u0010A\u001a,\u0010B\u001a\u00020C\"\t\b\u0000\u0010\u0007¢\u0006\u0002\bD*\b\u0012\u0004\u0012\u0002H\u00070\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002H\b\u001aH\u0010E\u001a\u0002HF\"\u0010\b\u0000\u0010G*\u0006\u0012\u0002\b\u00030\u0002*\u0002HF\"\u0004\b\u0001\u0010F*\u0002HG2\f\u0010H\u001a\b\u0012\u0004\u0012\u0002HF0IH\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010J\u001a\u0019\u0010K\u001a\u00020C\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0002H\b\u001a,\u0010L\u001a\u00020C\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\u001e\u0010M\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\bH\u0000\u001a!\u0010N\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\b\u001a!\u0010N\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\bH\b\u001a&\u0010O\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070P2\u0006\u0010Q\u001a\u00020RH\u0007\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0002\u0007\n\u0005\b20\u0001¨\u0006S"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "", "T", "", "getLastIndex", "(Ljava/util/List;)I", "List", "size", "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "MutableList", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "elements", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "buildList", "E", "capacity", "builderAction", "", "Lkotlin/ExtensionFunctionType;", "collectionToArrayCommonImpl", "", "collection", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "emptyList", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "listOfNotNull", "element", "(Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "rangeCheck", "fromIndex", "toIndex", "rangeCheck$CollectionsKt__CollectionsKt", "throwCountOverflow", "throwIndexOverflow", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "binarySearch", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "comparison", "", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "binarySearchBy", "K", "key", "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "containsAll", "", "Lkotlin/internal/OnlyInputTypes;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "optimizeReadOnlyList", "orEmpty", "shuffled", "", "random", "Lkotlin/random/Random;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,526:1\n1#2:527\n*E\n"})
class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> List<T> List(int i, Function1<? super Integer, ? extends T> function1) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(function1.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> List<T> MutableList(int i, Function1<? super Integer, ? extends T> function1) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(function1.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> ArrayList<T> arrayListOf() {
        return new ArrayList<>();
    }

    public static final <T> Collection<T> asCollection(T[] tArr) {
        return new ArrayAsCollection(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T t, int i, int i2) {
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compareValues = ComparisonsKt.compareValues((Comparable) list.get(i4), t);
            if (compareValues < 0) {
                i = i4 + 1;
            } else if (compareValues <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return binarySearch(list, comparable, i, i2);
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(List<? extends T> list, K k, int i, int i2, Function1<? super T, ? extends K> function1) {
        return binarySearch(list, i, i2, new CollectionsKt__CollectionsKt$binarySearchBy$1(function1, k));
    }

    public static /* synthetic */ int binarySearchBy$default(List list, Comparable comparable, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return binarySearch(list, i, i2, new CollectionsKt__CollectionsKt$binarySearchBy$1(function1, comparable));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final <E> List<E> buildList(@BuilderInference Function1<? super List<E>, Unit> function1) {
        List createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        function1.invoke(createListBuilder);
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    public static final Object[] collectionToArrayCommonImpl(Collection<?> collection) {
        int i = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        for (Object obj : collection) {
            objArr[i] = obj;
            i++;
        }
        return objArr;
    }

    @InlineOnly
    private static final <T> boolean containsAll(Collection<? extends T> collection, Collection<? extends T> collection2) {
        return collection.containsAll(collection2);
    }

    public static <T> List<T> emptyList() {
        return EmptyList.INSTANCE;
    }

    public static IntRange getIndices(Collection<?> collection) {
        return new IntRange(0, collection.size() - 1);
    }

    public static <T> int getLastIndex(List<? extends T> list) {
        return list.size() - 1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <C extends java.util.Collection<?> & R, R> R ifEmpty(C r1, kotlin.jvm.functions.Function0<? extends R> r2) {
        /*
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x000a
            java.lang.Object r1 = r2.invoke()
        L_0x000a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt__CollectionsKt.ifEmpty(java.util.Collection, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    @InlineOnly
    private static final <T> boolean isNotEmpty(Collection<? extends T> collection) {
        return !collection.isEmpty();
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> boolean isNullOrEmpty(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> List<T> listOf(T... tArr) {
        return tArr.length > 0 ? ArraysKt___ArraysJvmKt.asList(tArr) : emptyList();
    }

    public static <T> List<T> listOfNotNull(T t) {
        return t != null ? CollectionsKt__CollectionsJVMKt.listOf(t) : emptyList();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> List<T> mutableListOf() {
        return new ArrayList();
    }

    public static final <T> List<T> optimizeReadOnlyList(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : CollectionsKt__CollectionsJVMKt.listOf(list.get(0)) : emptyList();
    }

    @InlineOnly
    private static final <T> Collection<T> orEmpty(Collection<? extends T> collection) {
        return collection == null ? emptyList() : collection;
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(a81.l("fromIndex (", i2, ") is greater than toIndex (", i3, ")."));
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException(a81.j(i2, "fromIndex (", ") is less than zero."));
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException(a81.l("toIndex (", i3, ") is greater than size (", i, ")."));
        }
    }

    @SinceKotlin(version = "1.3")
    public static final <T> List<T> shuffled(Iterable<? extends T> iterable, Random random) {
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        CollectionsKt___CollectionsKt.shuffle(mutableList, random);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static <T> ArrayList<T> arrayListOf(T... tArr) {
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new ArrayAsCollection(tArr, true));
    }

    public static /* synthetic */ int binarySearch$default(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return binarySearch(list, obj, comparator, i, i2);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final <E> List<E> buildList(int i, @BuilderInference Function1<? super List<E>, Unit> function1) {
        List createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(i);
        function1.invoke(createListBuilder);
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    @InlineOnly
    private static final <T> List<T> listOf() {
        return emptyList();
    }

    public static <T> List<T> listOfNotNull(T... tArr) {
        return ArraysKt___ArraysKt.filterNotNull(tArr);
    }

    public static <T> List<T> mutableListOf(T... tArr) {
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(tArr, true));
    }

    @InlineOnly
    private static final <T> List<T> orEmpty(List<? extends T> list) {
        return list == null ? emptyList() : list;
    }

    public static /* synthetic */ int binarySearch$default(List list, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return binarySearch(list, i, i2, function1);
    }

    public static final <T> int binarySearch(List<? extends T> list, T t, Comparator<? super T> comparator, int i, int i2) {
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compare = comparator.compare(list.get(i4), t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static final <T> T[] collectionToArrayCommonImpl(Collection<?> collection, T[] tArr) {
        int i = 0;
        if (collection.isEmpty()) {
            return CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(0, tArr);
        }
        if (tArr.length < collection.size()) {
            tArr = ArraysKt__ArraysJVMKt.arrayOfNulls(tArr, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            tArr[i] = it.next();
            i++;
        }
        return CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(collection.size(), tArr);
    }

    public static final <T> int binarySearch(List<? extends T> list, int i, int i2, Function1<? super T, Integer> function1) {
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = function1.invoke(list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else if (intValue <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }
}
