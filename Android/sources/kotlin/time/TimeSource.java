package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.time.ComparableTimeMark;

@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "WithComparableMarks", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeSource {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Monotonic implements WithComparableMarks {
        public static final Monotonic INSTANCE = new Monotonic();

        @JvmInline
        @SinceKotlin(version = "1.9")
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\b@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0004¢\u0006\u0002\n\u0000\u0001\u0002\u0001\u00060\u0003j\u0002`\u0004\u0002\u0004\n\u0002\b!¨\u0006)"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "compareTo", "", "other", "compareTo-6eNON_k", "(JJ)I", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "(J)Z", "hasPassedNow", "hasPassedNow-impl", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(JJ)J", "minus-6eNON_k", "plus", "plus-LRDsOJo", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @WasExperimental(markerClass = {ExperimentalTime.class})
        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j) {
                this.reading = j;
            }

            /* renamed from: box-impl  reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m1496boximpl(long j) {
                return new ValueTimeMark(j);
            }

            /* renamed from: compareTo-6eNON_k  reason: not valid java name */
            public static final int m1497compareTo6eNON_k(long j, long j2) {
                return Duration.m1352compareToLRDsOJo(m1506minus6eNON_k(j, j2), Duration.Companion.m1456getZEROUwyO8pc());
            }

            /* renamed from: compareTo-impl  reason: not valid java name */
            public static int m1498compareToimpl(long j, ComparableTimeMark comparableTimeMark) {
                return m1496boximpl(j).compareTo(comparableTimeMark);
            }

            /* renamed from: constructor-impl  reason: not valid java name */
            public static long m1499constructorimpl(long j) {
                return j;
            }

            /* renamed from: equals-impl  reason: not valid java name */
            public static boolean m1501equalsimpl(long j, Object obj) {
                return (obj instanceof ValueTimeMark) && j == ((ValueTimeMark) obj).m1519unboximpl();
            }

            /* renamed from: equals-impl0  reason: not valid java name */
            public static final boolean m1502equalsimpl0(long j, long j2) {
                return j == j2;
            }

            /* renamed from: hasNotPassedNow-impl  reason: not valid java name */
            public static boolean m1503hasNotPassedNowimpl(long j) {
                return Duration.m1386isNegativeimpl(m1500elapsedNowUwyO8pc(j));
            }

            /* renamed from: hasPassedNow-impl  reason: not valid java name */
            public static boolean m1504hasPassedNowimpl(long j) {
                return !Duration.m1386isNegativeimpl(m1500elapsedNowUwyO8pc(j));
            }

            /* renamed from: hashCode-impl  reason: not valid java name */
            public static int m1505hashCodeimpl(long j) {
                return Long.hashCode(j);
            }

            /* renamed from: minus-6eNON_k  reason: not valid java name */
            public static final long m1506minus6eNON_k(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m1485differenceBetweenfRLX17w(j, j2);
            }

            /* renamed from: toString-impl  reason: not valid java name */
            public static String m1510toStringimpl(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
            public long m1511elapsedNowUwyO8pc() {
                return m1500elapsedNowUwyO8pc(this.reading);
            }

            public boolean equals(Object obj) {
                return m1501equalsimpl(this.reading, obj);
            }

            public boolean hasNotPassedNow() {
                return m1503hasNotPassedNowimpl(this.reading);
            }

            public boolean hasPassedNow() {
                return m1504hasPassedNowimpl(this.reading);
            }

            public int hashCode() {
                return m1505hashCodeimpl(this.reading);
            }

            /* renamed from: minus-UwyO8pc  reason: not valid java name */
            public long m1515minusUwyO8pc(ComparableTimeMark comparableTimeMark) {
                return m1508minusUwyO8pc(this.reading, comparableTimeMark);
            }

            public String toString() {
                return m1510toStringimpl(this.reading);
            }

            /* renamed from: unbox-impl  reason: not valid java name */
            public final /* synthetic */ long m1519unboximpl() {
                return this.reading;
            }

            /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
            public static long m1500elapsedNowUwyO8pc(long j) {
                return MonotonicTimeSource.INSTANCE.m1486elapsedFrom6eNON_k(j);
            }

            /* renamed from: minus-UwyO8pc  reason: not valid java name */
            public static long m1508minusUwyO8pc(long j, ComparableTimeMark comparableTimeMark) {
                if (comparableTimeMark instanceof ValueTimeMark) {
                    return m1506minus6eNON_k(j, ((ValueTimeMark) comparableTimeMark).m1519unboximpl());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + m1510toStringimpl(j) + " and " + comparableTimeMark);
            }

            public int compareTo(ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            /* renamed from: minus-LRDsOJo  reason: not valid java name */
            public long m1512minusLRDsOJo(long j) {
                return m1507minusLRDsOJo(this.reading, j);
            }

            /* renamed from: plus-LRDsOJo  reason: not valid java name */
            public long m1516plusLRDsOJo(long j) {
                return m1509plusLRDsOJo(this.reading, j);
            }

            /* renamed from: minus-LRDsOJo  reason: not valid java name */
            public static long m1507minusLRDsOJo(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m1484adjustReading6QKq23U(j, Duration.m1406unaryMinusUwyO8pc(j2));
            }

            /* renamed from: plus-LRDsOJo  reason: not valid java name */
            public static long m1509plusLRDsOJo(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m1484adjustReading6QKq23U(j, j2);
            }
        }

        private Monotonic() {
        }

        /* renamed from: markNow-z9LOYto  reason: not valid java name */
        public long m1495markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m1487markNowz9LOYto();
        }

        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }
    }

    @SinceKotlin(version = "1.9")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public interface WithComparableMarks extends TimeSource {
        ComparableTimeMark markNow();
    }

    TimeMark markNow();
}
