package kotlin.time;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010&\u001a\u0015\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a\u001d\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002¢\u0006\u0002\u00106\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0002\u001a)\u00108\u001a\u00020\u0005*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\b\u001a)\u0010=\u001a\u000203*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\b\u001a\u001c\u0010>\u001a\u00020\u0007*\u00020\b2\u0006\u0010?\u001a\u00020\u0007H\n¢\u0006\u0004\b@\u0010A\u001a\u001c\u0010>\u001a\u00020\u0007*\u00020\u00052\u0006\u0010?\u001a\u00020\u0007H\n¢\u0006\u0004\bB\u0010C\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\b2\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010G\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010H\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"\u001e\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"\u001e\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"\u001e\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0004¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010¨\u0006J"}, d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "parseDuration", "value", "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "skipWhile", "startIndex", "predicate", "Lkotlin/Function1;", "", "substringWhile", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1494:1\n1447#1,6:1496\n1450#1,3:1502\n1447#1,6:1505\n1447#1,6:1511\n1450#1,3:1520\n1#2:1495\n1734#3,3:1517\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1496,6\n1405#1:1502,3\n1408#1:1505,6\n1411#1:1511,6\n1447#1:1520,3\n1436#1:1517,3\n*E\n"})
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    /* access modifiers changed from: private */
    public static final long durationOf(long j, int i) {
        return Duration.m1353constructorimpl((j << 1) + ((long) i));
    }

    /* access modifiers changed from: private */
    public static final long durationOfMillis(long j) {
        return Duration.m1353constructorimpl((j << 1) + 1);
    }

    /* access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? durationOfMillis(RangesKt.coerceIn(j, -4611686018427387903L, (long) MAX_MILLIS)) : durationOfNanos(millisToNanos(j));
    }

    /* access modifiers changed from: private */
    public static final long durationOfNanos(long j) {
        return Duration.m1353constructorimpl(j << 1);
    }

    /* access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? durationOfMillis(nanosToMillis(j)) : durationOfNanos(j);
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(double d) {
    }

    /* access modifiers changed from: private */
    public static final long millisToNanos(long j) {
        return j * ((long) NANOS_IN_MILLIS);
    }

    /* access modifiers changed from: private */
    public static final long nanosToMillis(long j) {
        return j / ((long) NANOS_IN_MILLIS);
    }

    /* access modifiers changed from: private */
    public static final long parseDuration(String str, boolean z) {
        DurationUnit durationUnit;
        long j;
        int i;
        boolean z2;
        boolean z3;
        long r6;
        String str2;
        String str3 = str;
        int length = str.length();
        if (length != 0) {
            Duration.Companion companion = Duration.Companion;
            long r3 = companion.m1456getZEROUwyO8pc();
            char charAt = str3.charAt(0);
            boolean z4 = true;
            int i2 = (charAt == '+' || charAt == '-') ? 1 : 0;
            boolean z5 = i2 > 0;
            boolean z6 = z5 && StringsKt__StringsKt.startsWith$default((CharSequence) str3, '-', false, 2, (Object) null);
            if (length > i2) {
                char c = '.';
                String str4 = "Unexpected order of duration components";
                char c2 = '0';
                if (str3.charAt(i2) == 'P') {
                    int i3 = i2 + 1;
                    if (i3 != length) {
                        DurationUnit durationUnit2 = null;
                        boolean z7 = false;
                        while (i3 < length) {
                            if (str3.charAt(i3) != 'T') {
                                int i4 = i3;
                                while (i4 < str.length() && (('0' <= (r11 = str3.charAt(i4)) && r11 < ':') || StringsKt__StringsKt.contains$default((CharSequence) "+-.", r11, false, 2, (Object) null))) {
                                    i4++;
                                }
                                String substring = str3.substring(i3, i4);
                                if (substring.length() != 0) {
                                    int length2 = substring.length() + i3;
                                    if (length2 < 0 || length2 >= str.length()) {
                                        throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                                    }
                                    char charAt2 = str3.charAt(length2);
                                    int i5 = length2 + 1;
                                    DurationUnit durationUnitByIsoChar = DurationUnitKt__DurationUnitKt.durationUnitByIsoChar(charAt2, z7);
                                    if (durationUnit2 == null || durationUnit2.compareTo(durationUnitByIsoChar) > 0) {
                                        int k = StringsKt__StringsKt.indexOf$default((CharSequence) substring, c, 0, false, 6, (Object) null);
                                        if (durationUnitByIsoChar != DurationUnit.SECONDS || k <= 0) {
                                            str2 = str4;
                                            r3 = Duration.m1389plusLRDsOJo(r3, toDuration(parseOverLongIsoComponent(substring), durationUnitByIsoChar));
                                        } else {
                                            str2 = str4;
                                            r3 = Duration.m1389plusLRDsOJo(Duration.m1389plusLRDsOJo(r3, toDuration(parseOverLongIsoComponent(substring.substring(0, k)), durationUnitByIsoChar)), toDuration(Double.parseDouble(substring.substring(k)), durationUnitByIsoChar));
                                        }
                                        durationUnit2 = durationUnitByIsoChar;
                                        i3 = i5;
                                        str4 = str2;
                                        z4 = true;
                                        c = '.';
                                    } else {
                                        throw new IllegalArgumentException(str4);
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else if (z7 || (i3 = i3 + 1) == length) {
                                throw new IllegalArgumentException();
                            } else {
                                z7 = z4;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    String str5 = str4;
                    if (z) {
                        throw new IllegalArgumentException();
                    } else if (StringsKt__StringsJVMKt.regionMatches(str3, i2, "Infinity", 0, Math.max(length - i2, 8), true)) {
                        r3 = companion.m1454getINFINITEUwyO8pc();
                    } else {
                        boolean z8 = !z5;
                        if (z5 && str3.charAt(i2) == '(' && StringsKt.last(str) == ')') {
                            int i6 = i2 + 1;
                            length--;
                            if (i6 != length) {
                                z3 = false;
                                durationUnit = null;
                                i = i6;
                                j = r3;
                                z2 = true;
                            } else {
                                throw new IllegalArgumentException("No components");
                            }
                        } else {
                            durationUnit = null;
                            long j2 = r3;
                            z2 = z8;
                            i = i2;
                            z3 = false;
                            j = j2;
                        }
                        while (i < length) {
                            if (z3 && z2) {
                                while (i < str.length() && str3.charAt(i) == ' ') {
                                    i++;
                                }
                            }
                            int i7 = i;
                            while (i7 < str.length() && ((c2 <= (r8 = str3.charAt(i7)) && r8 < ':') || r8 == '.')) {
                                i7++;
                            }
                            String substring2 = str3.substring(i, i7);
                            if (substring2.length() != 0) {
                                int length3 = substring2.length() + i;
                                int i8 = length3;
                                while (i8 < str.length() && 'a' <= (r10 = str3.charAt(i8)) && r10 < '{') {
                                    i8++;
                                }
                                String substring3 = str3.substring(length3, i8);
                                int length4 = length3 + substring3.length();
                                DurationUnit durationUnitByShortName = DurationUnitKt__DurationUnitKt.durationUnitByShortName(substring3);
                                if (durationUnit == null || durationUnit.compareTo(durationUnitByShortName) > 0) {
                                    String str6 = str5;
                                    int k2 = StringsKt__StringsKt.indexOf$default((CharSequence) substring2, '.', 0, false, 6, (Object) null);
                                    if (k2 > 0) {
                                        r6 = Duration.m1389plusLRDsOJo(Duration.m1389plusLRDsOJo(j, toDuration(Long.parseLong(substring2.substring(0, k2)), durationUnitByShortName)), toDuration(Double.parseDouble(substring2.substring(k2)), durationUnitByShortName));
                                        if (length4 < length) {
                                            throw new IllegalArgumentException("Fractional component must be last");
                                        }
                                    } else {
                                        r6 = Duration.m1389plusLRDsOJo(j, toDuration(Long.parseLong(substring2), durationUnitByShortName));
                                    }
                                    durationUnit = durationUnitByShortName;
                                    i = length4;
                                    str5 = str6;
                                    z3 = true;
                                    c2 = '0';
                                } else {
                                    throw new IllegalArgumentException(str5);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        r3 = j;
                    }
                }
                return z6 ? Duration.m1406unaryMinusUwyO8pc(r3) : r3;
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    private static final long parseOverLongIsoComponent(String str) {
        int length = str.length();
        int i = (length <= 0 || !StringsKt__StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i > 16) {
            IntRange intRange = new IntRange(i, StringsKt.getLastIndex(str));
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (it.hasNext()) {
                    char charAt = str.charAt(((IntIterator) it).nextInt());
                    if ('0' <= charAt) {
                        if (charAt >= ':') {
                        }
                    }
                }
            }
            if (str.charAt(0) == '-') {
                return Long.MIN_VALUE;
            }
            return LongCompanionObject.MAX_VALUE;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(str, "+", false, 2, (Object) null)) {
            str = StringsKt___StringsKt.drop(str, 1);
        }
        return Long.parseLong(str);
    }

    private static final int skipWhile(String str, int i, Function1<? super Character, Boolean> function1) {
        while (i < str.length() && function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    private static final String substringWhile(String str, int i, Function1<? super Character, Boolean> function1) {
        int i2 = i;
        while (i2 < str.length() && function1.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        return str.substring(i, i2);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalTime.class})
    /* renamed from: times-kIfJnKk  reason: not valid java name */
    private static final long m1479timeskIfJnKk(double d, long j) {
        return Duration.m1390timesUwyO8pc(j, d);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalTime.class})
    /* renamed from: times-mvk6XK0  reason: not valid java name */
    private static final long m1480timesmvk6XK0(int i, long j) {
        return Duration.m1391timesUwyO8pc(j, i);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(int i, DurationUnit durationUnit) {
        if (durationUnit.compareTo(DurationUnit.SECONDS) <= 0) {
            return durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow((long) i, durationUnit, DurationUnit.NANOSECONDS));
        }
        return toDuration((long) i, durationUnit);
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(long j) {
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(long j, DurationUnit durationUnit) {
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long convertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(MAX_NANOS, durationUnit2, durationUnit);
        if ((-convertDurationUnitOverflow) > j || j > convertDurationUnitOverflow) {
            return durationOfMillis(RangesKt.coerceIn(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, (long) MAX_MILLIS));
        }
        return durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j, durationUnit, durationUnit2));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(double d, DurationUnit durationUnit) {
        double convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, durationUnit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(convertDurationUnit)) {
            long roundToLong = MathKt.roundToLong(convertDurationUnit);
            if (-4611686018426999999L > roundToLong || roundToLong >= 4611686018427000000L) {
                return durationOfMillisNormalized(MathKt.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, durationUnit, DurationUnit.MILLISECONDS)));
            }
            return durationOfNanos(roundToLong);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }
}
