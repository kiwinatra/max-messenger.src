package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001cB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001d\u0010\b\u001a\u00020\u00038VX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038VX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038VX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u0002\u0004\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "endExclusive", "getEndExclusive-pVg5ArA$annotations", "()V", "getEndExclusive-pVg5ArA", "()I", "getEndInclusive-pVg5ArA", "getStart-pVg5ArA", "contains", "", "value", "contains-WZ4Q5Ns", "(I)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UIntRange extends UIntProgression implements ClosedRange<UInt>, OpenEndRange<UInt> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final UIntRange EMPTY = new UIntRange(-1, 0, (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/UIntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/UIntRange;", "getEMPTY", "()Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final UIntRange getEMPTY() {
            return UIntRange.EMPTY;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UIntRange(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: getEndExclusive-pVg5ArA$annotations  reason: not valid java name */
    public static /* synthetic */ void m1245getEndExclusivepVg5ArA$annotations() {
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m1246containsWZ4Q5Ns(((UInt) comparable).m170unboximpl());
    }

    /* renamed from: contains-WZ4Q5Ns  reason: not valid java name */
    public boolean m1246containsWZ4Q5Ns(int i) {
        return Integer.compareUnsigned(m1241getFirstpVg5ArA(), i) <= 0 && Integer.compareUnsigned(i, m1242getLastpVg5ArA()) <= 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof UIntRange) {
            if (!isEmpty() || !((UIntRange) obj).isEmpty()) {
                UIntRange uIntRange = (UIntRange) obj;
                if (!(m1241getFirstpVg5ArA() == uIntRange.m1241getFirstpVg5ArA() && m1242getLastpVg5ArA() == uIntRange.m1242getLastpVg5ArA())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return UInt.m112boximpl(m1247getEndExclusivepVg5ArA());
    }

    /* renamed from: getEndExclusive-pVg5ArA  reason: not valid java name */
    public int m1247getEndExclusivepVg5ArA() {
        if (m1242getLastpVg5ArA() != -1) {
            return UInt.m118constructorimpl(m1242getLastpVg5ArA() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return UInt.m112boximpl(m1248getEndInclusivepVg5ArA());
    }

    /* renamed from: getEndInclusive-pVg5ArA  reason: not valid java name */
    public int m1248getEndInclusivepVg5ArA() {
        return m1242getLastpVg5ArA();
    }

    public /* bridge */ /* synthetic */ Comparable getStart() {
        return UInt.m112boximpl(m1249getStartpVg5ArA());
    }

    /* renamed from: getStart-pVg5ArA  reason: not valid java name */
    public int m1249getStartpVg5ArA() {
        return m1241getFirstpVg5ArA();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return m1242getLastpVg5ArA() + (m1241getFirstpVg5ArA() * 31);
    }

    public boolean isEmpty() {
        return Integer.compareUnsigned(m1241getFirstpVg5ArA(), m1242getLastpVg5ArA()) > 0;
    }

    public String toString() {
        return UInt.m164toStringimpl(m1241getFirstpVg5ArA()) + ".." + UInt.m164toStringimpl(m1242getLastpVg5ArA());
    }

    private UIntRange(int i, int i2) {
        super(i, i2, 1, (DefaultConstructorMarker) null);
    }
}
