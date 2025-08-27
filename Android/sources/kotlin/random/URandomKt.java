package kotlin.random;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0003*\u00020\rH\u0007¢\u0006\u0002\u0010\u0019\u001a\u001b\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a\u0011\u0010!\u001a\u00020\b*\u00020\rH\u0007¢\u0006\u0002\u0010\"\u001a\u001b\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010$\u001a#\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u001e\u001a\u00020'H\u0007¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"checkUIntRangeBounds", "", "from", "Lkotlin/UInt;", "until", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "Lkotlin/ULong;", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "nextUBytes", "Lkotlin/UByteArray;", "Lkotlin/random/Random;", "size", "", "(Lkotlin/random/Random;I)[B", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "nextUInt", "(Lkotlin/random/Random;)I", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
public final class URandomKt {
    /* renamed from: checkUIntRangeBounds-J1ME1BU  reason: not valid java name */
    public static final void m1232checkUIntRangeBoundsJ1ME1BU(int i, int i2) {
        if (Integer.compareUnsigned(i2, i) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m112boximpl(i), UInt.m112boximpl(i2)).toString());
        }
    }

    /* renamed from: checkULongRangeBounds-eb3DHEI  reason: not valid java name */
    public static final void m1233checkULongRangeBoundseb3DHEI(long j, long j2) {
        if (Long.compareUnsigned(j2, j) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m191boximpl(j), ULong.m191boximpl(j2)).toString());
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final byte[] nextUBytes(Random random, int i) {
        return UByteArray.m94constructorimpl(random.nextBytes(i));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: nextUBytes-EVgfTAA  reason: not valid java name */
    public static final byte[] m1234nextUBytesEVgfTAA(Random random, byte[] bArr) {
        random.nextBytes(bArr);
        return bArr;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: nextUBytes-Wvrt4B4  reason: not valid java name */
    public static final byte[] m1235nextUBytesWvrt4B4(Random random, byte[] bArr, int i, int i2) {
        random.nextBytes(bArr, i, i2);
        return bArr;
    }

    /* renamed from: nextUBytes-Wvrt4B4$default  reason: not valid java name */
    public static /* synthetic */ byte[] m1236nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m100getSizeimpl(bArr);
        }
        return m1235nextUBytesWvrt4B4(random, bArr, i, i2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(Random random) {
        return UInt.m118constructorimpl(random.nextInt());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextUInt-a8DCA5k  reason: not valid java name */
    public static final int m1237nextUInta8DCA5k(Random random, int i, int i2) {
        m1232checkUIntRangeBoundsJ1ME1BU(i, i2);
        return UInt.m118constructorimpl(random.nextInt(i ^ IntCompanionObject.MIN_VALUE, i2 ^ IntCompanionObject.MIN_VALUE) ^ IntCompanionObject.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextUInt-qCasIEU  reason: not valid java name */
    public static final int m1238nextUIntqCasIEU(Random random, int i) {
        return m1237nextUInta8DCA5k(random, 0, i);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(Random random) {
        return ULong.m197constructorimpl(random.nextLong());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextULong-V1Xi4fY  reason: not valid java name */
    public static final long m1239nextULongV1Xi4fY(Random random, long j) {
        return m1240nextULongjmpaWc(random, 0, j);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextULong-jmpaW-c  reason: not valid java name */
    public static final long m1240nextULongjmpaWc(Random random, long j, long j2) {
        m1233checkULongRangeBoundseb3DHEI(j, j2);
        return ULong.m197constructorimpl(random.nextLong(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(Random random, UIntRange uIntRange) {
        if (uIntRange.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + uIntRange);
        } else if (Integer.compareUnsigned(uIntRange.m1242getLastpVg5ArA(), -1) < 0) {
            return m1237nextUInta8DCA5k(random, uIntRange.m1241getFirstpVg5ArA(), UInt.m118constructorimpl(uIntRange.m1242getLastpVg5ArA() + 1));
        } else {
            if (Integer.compareUnsigned(uIntRange.m1241getFirstpVg5ArA(), 0) > 0) {
                return UInt.m118constructorimpl(m1237nextUInta8DCA5k(random, UInt.m118constructorimpl(uIntRange.m1241getFirstpVg5ArA() - 1), uIntRange.m1242getLastpVg5ArA()) + 1);
            }
            return nextUInt(random);
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(Random random, ULongRange uLongRange) {
        if (uLongRange.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + uLongRange);
        } else if (Long.compareUnsigned(uLongRange.m1251getLastsVKNKU(), -1) < 0) {
            return m1240nextULongjmpaWc(random, uLongRange.m1250getFirstsVKNKU(), ULong.m197constructorimpl(ULong.m197constructorimpl(((long) 1) & 4294967295L) + uLongRange.m1251getLastsVKNKU()));
        } else if (Long.compareUnsigned(uLongRange.m1250getFirstsVKNKU(), 0) <= 0) {
            return nextULong(random);
        } else {
            long j = ((long) 1) & 4294967295L;
            return ULong.m197constructorimpl(ULong.m197constructorimpl(j) + m1240nextULongjmpaWc(random, ULong.m197constructorimpl(uLongRange.m1250getFirstsVKNKU() - ULong.m197constructorimpl(j)), uLongRange.m1251getLastsVKNKU()));
        }
    }
}
