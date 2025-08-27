package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\f\u0002\u0004\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeMark {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(TimeMark timeMark) {
            return Duration.m1386isNegativeimpl(timeMark.m1490elapsedNowUwyO8pc());
        }

        public static boolean hasPassedNow(TimeMark timeMark) {
            return !Duration.m1386isNegativeimpl(timeMark.m1490elapsedNowUwyO8pc());
        }

        /* renamed from: minus-LRDsOJo  reason: not valid java name */
        public static TimeMark m1493minusLRDsOJo(TimeMark timeMark, long j) {
            return timeMark.m1492plusLRDsOJo(Duration.m1406unaryMinusUwyO8pc(j));
        }

        /* renamed from: plus-LRDsOJo  reason: not valid java name */
        public static TimeMark m1494plusLRDsOJo(TimeMark timeMark, long j) {
            return new AdjustedTimeMark(timeMark, j, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
    long m1490elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    /* renamed from: minus-LRDsOJo  reason: not valid java name */
    TimeMark m1491minusLRDsOJo(long j);

    /* renamed from: plus-LRDsOJo  reason: not valid java name */
    TimeMark m1492plusLRDsOJo(long j);
}
