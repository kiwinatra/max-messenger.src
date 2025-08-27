package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001cB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001d\u0010\b\u001a\u00020\u00038VX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038VX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038VX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u0002\u0004\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "endExclusive", "getEndExclusive-s-VKNKU$annotations", "()V", "getEndExclusive-s-VKNKU", "()J", "getEndInclusive-s-VKNKU", "getStart-s-VKNKU", "contains", "", "value", "contains-VKZWuLQ", "(J)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class ULongRange extends ULongProgression implements ClosedRange<ULong>, OpenEndRange<ULong> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final ULongRange EMPTY = new ULongRange(-1, 0, (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ULongRange getEMPTY() {
            return ULongRange.EMPTY;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ULongRange(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: getEndExclusive-s-VKNKU$annotations  reason: not valid java name */
    public static /* synthetic */ void m1254getEndExclusivesVKNKU$annotations() {
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m1255containsVKZWuLQ(((ULong) comparable).m249unboximpl());
    }

    /* renamed from: contains-VKZWuLQ  reason: not valid java name */
    public boolean m1255containsVKZWuLQ(long j) {
        return Long.compareUnsigned(m1250getFirstsVKNKU(), j) <= 0 && Long.compareUnsigned(j, m1251getLastsVKNKU()) <= 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ULongRange) {
            if (!isEmpty() || !((ULongRange) obj).isEmpty()) {
                ULongRange uLongRange = (ULongRange) obj;
                if (!(m1250getFirstsVKNKU() == uLongRange.m1250getFirstsVKNKU() && m1251getLastsVKNKU() == uLongRange.m1251getLastsVKNKU())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return ULong.m191boximpl(m1256getEndExclusivesVKNKU());
    }

    /* renamed from: getEndExclusive-s-VKNKU  reason: not valid java name */
    public long m1256getEndExclusivesVKNKU() {
        if (m1251getLastsVKNKU() != -1) {
            return ULong.m197constructorimpl(ULong.m197constructorimpl(((long) 1) & 4294967295L) + m1251getLastsVKNKU());
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return ULong.m191boximpl(m1257getEndInclusivesVKNKU());
    }

    /* renamed from: getEndInclusive-s-VKNKU  reason: not valid java name */
    public long m1257getEndInclusivesVKNKU() {
        return m1251getLastsVKNKU();
    }

    public /* bridge */ /* synthetic */ Comparable getStart() {
        return ULong.m191boximpl(m1258getStartsVKNKU());
    }

    /* renamed from: getStart-s-VKNKU  reason: not valid java name */
    public long m1258getStartsVKNKU() {
        return m1250getFirstsVKNKU();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return ((int) ULong.m197constructorimpl(m1251getLastsVKNKU() ^ ULong.m197constructorimpl(m1251getLastsVKNKU() >>> 32))) + (((int) ULong.m197constructorimpl(m1250getFirstsVKNKU() ^ ULong.m197constructorimpl(m1250getFirstsVKNKU() >>> 32))) * 31);
    }

    public boolean isEmpty() {
        return Long.compareUnsigned(m1250getFirstsVKNKU(), m1251getLastsVKNKU()) > 0;
    }

    public String toString() {
        return ULong.m243toStringimpl(m1250getFirstsVKNKU()) + ".." + ULong.m243toStringimpl(m1251getLastsVKNKU());
    }

    private ULongRange(long j, long j2) {
        super(j, j2, 1, (DefaultConstructorMarker) null);
    }
}
