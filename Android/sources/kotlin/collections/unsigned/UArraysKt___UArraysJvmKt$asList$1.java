package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b!¨\u0006\u0017"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "Lkotlin/UInt;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-WZ4Q5Ns", "(I)Z", "get", "index", "get-pVg5ArA", "(I)I", "indexOf", "indexOf-WZ4Q5Ns", "isEmpty", "lastIndexOf", "lastIndexOf-WZ4Q5Ns", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$1 extends AbstractList<UInt> implements RandomAccess {
    final /* synthetic */ int[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$1(int[] iArr) {
        this.$this_asList = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof UInt)) {
            return false;
        }
        return m527containsWZ4Q5Ns(((UInt) obj).m170unboximpl());
    }

    /* renamed from: contains-WZ4Q5Ns  reason: not valid java name */
    public boolean m527containsWZ4Q5Ns(int i) {
        return UIntArray.m174containsWZ4Q5Ns(this.$this_asList, i);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return UInt.m112boximpl(m528getpVg5ArA(i));
    }

    /* renamed from: get-pVg5ArA  reason: not valid java name */
    public int m528getpVg5ArA(int i) {
        return UIntArray.m178getpVg5ArA(this.$this_asList, i);
    }

    public int getSize() {
        return UIntArray.m179getSizeimpl(this.$this_asList);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof UInt)) {
            return -1;
        }
        return m529indexOfWZ4Q5Ns(((UInt) obj).m170unboximpl());
    }

    /* renamed from: indexOf-WZ4Q5Ns  reason: not valid java name */
    public int m529indexOfWZ4Q5Ns(int i) {
        return ArraysKt.indexOf(this.$this_asList, i);
    }

    public boolean isEmpty() {
        return UIntArray.m181isEmptyimpl(this.$this_asList);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof UInt)) {
            return -1;
        }
        return m530lastIndexOfWZ4Q5Ns(((UInt) obj).m170unboximpl());
    }

    /* renamed from: lastIndexOf-WZ4Q5Ns  reason: not valid java name */
    public int m530lastIndexOfWZ4Q5Ns(int i) {
        return ArraysKt.lastIndexOf(this.$this_asList, i);
    }
}
