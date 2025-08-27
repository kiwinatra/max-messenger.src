package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0016\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\b¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\b¢\u0006\u0002\u0010\f\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0001\u001a\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u000eH\u0001\u001a\u0011\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u000eH\b\u001a\u0011\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u000eH\b\u001a\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u000eH\b\u001a\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\b\u001a\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u000eH\b¢\u0006\u0002\u0010\u001e\u001a\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0019H\u0001\u001a\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0001¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0001¢\u0006\u0004\b$\u0010\"\u001a\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0019H\u0001\u001a\u0011\u0010&\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0019H\b\u001a\u0011\u0010'\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0019H\b\u001a\u0018\u0010'\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000eH\u0000¨\u0006("}, d2 = {"doubleToUInt", "Lkotlin/UInt;", "value", "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "floatToUInt", "", "(F)I", "floatToULong", "(F)J", "uintCompare", "", "v1", "v2", "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "uintToFloat", "uintToLong", "", "uintToString", "", "base", "uintToULong", "(I)J", "ulongCompare", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToFloat", "ulongToString", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "UnsignedKt")
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d) {
        if (Double.isNaN(d) || d <= uintToDouble(0)) {
            return 0;
        }
        if (d >= uintToDouble(-1)) {
            return -1;
        }
        if (d <= 2.147483647E9d) {
            return UInt.m118constructorimpl((int) d);
        }
        return UInt.m118constructorimpl(UInt.m118constructorimpl(IntCompanionObject.MAX_VALUE) + UInt.m118constructorimpl((int) (d - ((double) IntCompanionObject.MAX_VALUE))));
    }

    @PublishedApi
    public static final long doubleToULong(double d) {
        if (Double.isNaN(d) || d <= ulongToDouble(0)) {
            return 0;
        }
        if (d >= ulongToDouble(-1)) {
            return -1;
        }
        return d < 9.223372036854776E18d ? ULong.m197constructorimpl((long) d) : ULong.m197constructorimpl(ULong.m197constructorimpl((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @PublishedApi
    @InlineOnly
    private static final int floatToUInt(float f) {
        return doubleToUInt((double) f);
    }

    @PublishedApi
    @InlineOnly
    private static final long floatToULong(float f) {
        return doubleToULong((double) f);
    }

    @PublishedApi
    public static final int uintCompare(int i, int i2) {
        return Intrinsics.compare(i ^ IntCompanionObject.MIN_VALUE, i2 ^ IntCompanionObject.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: uintDivide-J1ME1BU  reason: not valid java name */
    public static final int m374uintDivideJ1ME1BU(int i, int i2) {
        return UInt.m118constructorimpl((int) ((((long) i) & 4294967295L) / (((long) i2) & 4294967295L)));
    }

    @PublishedApi
    /* renamed from: uintRemainder-J1ME1BU  reason: not valid java name */
    public static final int m375uintRemainderJ1ME1BU(int i, int i2) {
        return UInt.m118constructorimpl((int) ((((long) i) & 4294967295L) % (((long) i2) & 4294967295L)));
    }

    @PublishedApi
    public static final double uintToDouble(int i) {
        return (((double) ((i >>> 31) << 30)) * ((double) 2)) + ((double) (Integer.MAX_VALUE & i));
    }

    @PublishedApi
    @InlineOnly
    private static final float uintToFloat(int i) {
        return (float) uintToDouble(i);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToLong(int i) {
        return ((long) i) & 4294967295L;
    }

    @InlineOnly
    private static final String uintToString(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToULong(int i) {
        return ULong.m197constructorimpl(((long) i) & 4294967295L);
    }

    @PublishedApi
    public static final int ulongCompare(long j, long j2) {
        return Intrinsics.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: ulongDivide-eb3DHEI  reason: not valid java name */
    public static final long m376ulongDivideeb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return Long.compareUnsigned(j, j2) < 0 ? ULong.m197constructorimpl(0) : ULong.m197constructorimpl(1);
        }
        if (j >= 0) {
            return ULong.m197constructorimpl(j / j2);
        }
        int i = 1;
        long j3 = ((j >>> 1) / j2) << 1;
        if (Long.compareUnsigned(ULong.m197constructorimpl(j - (j3 * j2)), ULong.m197constructorimpl(j2)) < 0) {
            i = 0;
        }
        return ULong.m197constructorimpl(j3 + ((long) i));
    }

    @PublishedApi
    /* renamed from: ulongRemainder-eb3DHEI  reason: not valid java name */
    public static final long m377ulongRemaindereb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return Long.compareUnsigned(j, j2) < 0 ? j : ULong.m197constructorimpl(j - j2);
        }
        if (j >= 0) {
            return ULong.m197constructorimpl(j % j2);
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (Long.compareUnsigned(ULong.m197constructorimpl(j3), ULong.m197constructorimpl(j2)) < 0) {
            j2 = 0;
        }
        return ULong.m197constructorimpl(j3 - j2);
    }

    @PublishedApi
    public static final double ulongToDouble(long j) {
        return (((double) (j >>> 11)) * ((double) 2048)) + ((double) (j & 2047));
    }

    @PublishedApi
    @InlineOnly
    private static final float ulongToFloat(long j) {
        return (float) ulongToDouble(j);
    }

    @InlineOnly
    private static final String ulongToString(long j) {
        return ulongToString(j, 10);
    }

    @InlineOnly
    private static final String uintToString(int i, int i2) {
        return ulongToString(((long) i) & 4294967295L, i2);
    }

    public static final String ulongToString(long j, int i) {
        if (j >= 0) {
            return Long.toString(j, CharsKt.checkRadix(i));
        }
        long j2 = (long) i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        return Long.toString(j3, CharsKt.checkRadix(i)) + Long.toString(j4, CharsKt.checkRadix(i));
    }
}
