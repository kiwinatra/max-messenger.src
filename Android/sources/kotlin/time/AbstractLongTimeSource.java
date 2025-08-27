package kotlin.time;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;

@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "zero", "", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {
    private final DurationUnit unit;
    private final Lazy zero$delegate = LazyKt.lazy(new AbstractLongTimeSource$zero$2(this));

    @SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00020\u0007X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", "offset", "Lkotlin/time/Duration;", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", "", "other", "", "hashCode", "", "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LongTimeMark implements ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        private final AbstractLongTimeSource timeSource;

        public /* synthetic */ LongTimeMark(long j, AbstractLongTimeSource abstractLongTimeSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }

        /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
        public long m1335elapsedNowUwyO8pc() {
            return Duration.m1388minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        public boolean equals(Object obj) {
            return (obj instanceof LongTimeMark) && Intrinsics.areEqual((Object) this.timeSource, (Object) ((LongTimeMark) obj).timeSource) && Duration.m1358equalsimpl0(m1338minusUwyO8pc((ComparableTimeMark) obj), Duration.Companion.m1456getZEROUwyO8pc());
        }

        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        public int hashCode() {
            return Long.hashCode(this.startedAt) + (Duration.m1381hashCodeimpl(this.offset) * 37);
        }

        /* renamed from: minus-LRDsOJo  reason: not valid java name */
        public ComparableTimeMark m1337minusLRDsOJo(long j) {
            return ComparableTimeMark.DefaultImpls.m1348minusLRDsOJo(this, j);
        }

        /* renamed from: minus-UwyO8pc  reason: not valid java name */
        public long m1338minusUwyO8pc(ComparableTimeMark comparableTimeMark) {
            if (comparableTimeMark instanceof LongTimeMark) {
                LongTimeMark longTimeMark = (LongTimeMark) comparableTimeMark;
                if (Intrinsics.areEqual((Object) this.timeSource, (Object) longTimeMark.timeSource)) {
                    return Duration.m1389plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), Duration.m1388minusLRDsOJo(this.offset, longTimeMark.offset));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + comparableTimeMark);
        }

        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + Duration.m1402toStringimpl(this.offset) + ", " + this.timeSource + ')';
        }

        private LongTimeMark(long j, AbstractLongTimeSource abstractLongTimeSource, long j2) {
            this.startedAt = j;
            this.timeSource = abstractLongTimeSource;
            this.offset = j2;
        }

        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        /* renamed from: plus-LRDsOJo  reason: not valid java name */
        public ComparableTimeMark m1340plusLRDsOJo(long j) {
            DurationUnit unit = this.timeSource.getUnit();
            if (Duration.m1385isInfiniteimpl(j)) {
                return new LongTimeMark(LongSaturatedMathKt.m1482saturatingAddNuflL3o(this.startedAt, unit, j), this.timeSource, Duration.Companion.m1456getZEROUwyO8pc(), (DefaultConstructorMarker) null);
            }
            long r1 = Duration.m1405truncateToUwyO8pc$kotlin_stdlib(j, unit);
            long r11 = Duration.m1389plusLRDsOJo(Duration.m1388minusLRDsOJo(j, r1), this.offset);
            long r12 = LongSaturatedMathKt.m1482saturatingAddNuflL3o(this.startedAt, unit, r1);
            long r3 = Duration.m1405truncateToUwyO8pc$kotlin_stdlib(r11, unit);
            long r13 = LongSaturatedMathKt.m1482saturatingAddNuflL3o(r12, unit, r3);
            long r112 = Duration.m1388minusLRDsOJo(r11, r3);
            long r32 = Duration.m1373getInWholeNanosecondsimpl(r112);
            if (!(r13 == 0 || r32 == 0 || (r13 ^ r32) >= 0)) {
                long duration = DurationKt.toDuration(MathKt.getSign(r32), unit);
                r13 = LongSaturatedMathKt.m1482saturatingAddNuflL3o(r13, unit, duration);
                r112 = Duration.m1388minusLRDsOJo(r112, duration);
            }
            if ((1 | (r13 - 1)) == LongCompanionObject.MAX_VALUE) {
                r112 = Duration.Companion.m1456getZEROUwyO8pc();
            }
            return new LongTimeMark(r13, this.timeSource, r112, (DefaultConstructorMarker) null);
        }
    }

    public AbstractLongTimeSource(DurationUnit durationUnit) {
        this.unit = durationUnit;
    }

    /* access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    private final long getZero() {
        return ((Number) this.zero$delegate.getValue()).longValue();
    }

    public final DurationUnit getUnit() {
        return this.unit;
    }

    public abstract long read();

    public ComparableTimeMark markNow() {
        return new LongTimeMark(adjustedRead(), this, Duration.Companion.m1456getZEROUwyO8pc(), (DefaultConstructorMarker) null);
    }
}
