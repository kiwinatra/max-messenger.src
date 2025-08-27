package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\b¨\u0006\u001d"}, d2 = {"checkInfiniteSumDefined", "", "value", "duration", "Lkotlin/time/Duration;", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "infinityOfSign", "(J)J", "saturatingAdd", "unit", "Lkotlin/time/DurationUnit;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingFiniteDiff", "value1", "value2", "saturatingOriginsDiff", "origin1", "origin2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4  reason: not valid java name */
    private static final long m1481checkInfiniteSumDefinedPjuGub4(long j, long j2, long j3) {
        if (!Duration.m1385isInfiniteimpl(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j) {
        return j < 0 ? Duration.Companion.m1455getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.Companion.m1454getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j) {
        return ((j - 1) | 1) == LongCompanionObject.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o  reason: not valid java name */
    public static final long m1482saturatingAddNuflL3o(long j, DurationUnit durationUnit, long j2) {
        long r4 = Duration.m1399toLongimpl(j2, durationUnit);
        if (((j - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m1481checkInfiniteSumDefinedPjuGub4(j, j2, r4);
        }
        if ((1 | (r4 - 1)) == LongCompanionObject.MAX_VALUE) {
            return m1483saturatingAddInHalvesNuflL3o(j, durationUnit, j2);
        }
        long j3 = j + r4;
        if (((j ^ j3) & (r4 ^ j3)) >= 0) {
            return j3;
        }
        if (j < 0) {
            return Long.MIN_VALUE;
        }
        return LongCompanionObject.MAX_VALUE;
    }

    /* renamed from: saturatingAddInHalves-NuflL3o  reason: not valid java name */
    private static final long m1483saturatingAddInHalvesNuflL3o(long j, DurationUnit durationUnit, long j2) {
        long r0 = Duration.m1356divUwyO8pc(j2, 2);
        long r2 = Duration.m1399toLongimpl(r0, durationUnit);
        return (1 | (r2 - 1)) == LongCompanionObject.MAX_VALUE ? r2 : m1482saturatingAddNuflL3o(m1482saturatingAddNuflL3o(j, durationUnit, r0), durationUnit, Duration.m1388minusLRDsOJo(j2, r0));
    }

    public static final long saturatingDiff(long j, long j2, DurationUnit durationUnit) {
        return (1 | (j2 - 1)) == LongCompanionObject.MAX_VALUE ? Duration.m1406unaryMinusUwyO8pc(infinityOfSign(j2)) : saturatingFiniteDiff(j, j2, durationUnit);
    }

    private static final long saturatingFiniteDiff(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return DurationKt.toDuration(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m1406unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        long convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1, durationUnit2, durationUnit);
        long j4 = (j % convertDurationUnit) - (j2 % convertDurationUnit);
        Duration.Companion companion = Duration.Companion;
        return Duration.m1389plusLRDsOJo(DurationKt.toDuration((j / convertDurationUnit) - (j2 / convertDurationUnit), durationUnit2), DurationKt.toDuration(j4, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j, long j2, DurationUnit durationUnit) {
        return ((j2 - 1) | 1) == LongCompanionObject.MAX_VALUE ? j == j2 ? Duration.Companion.m1456getZEROUwyO8pc() : Duration.m1406unaryMinusUwyO8pc(infinityOfSign(j2)) : (1 | (j - 1)) == LongCompanionObject.MAX_VALUE ? infinityOfSign(j) : saturatingFiniteDiff(j, j2, durationUnit);
    }
}
