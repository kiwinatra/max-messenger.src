package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.KotlinNothingValueException;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eH\u0002\u001a(\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002\u001a@\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0000\u001a@\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0000\u001a \u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u001a5\u0010 \u001a\u00020\u0011*\u00020\u000b2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\b\u001a\u001c\u0010'\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a$\u0010(\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002\u001a<\u0010,\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0011H\u0002\u001a\u001c\u0010/\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a\u0015\u00100\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\b\u001a,\u00101\u001a\u00020\u0011*\u0002022\u0006\u0010!\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0011H\u0002\u001a<\u00101\u001a\u00020\u0011*\u0002022\u0006\u0010!\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0011H\u0002\u001a*\u00109\u001a\u00020:*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u00109\u001a\u00020:*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a*\u0010=\u001a\u000202*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u0010=\u001a\u000202*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a&\u0010>\u001a\u0004\u0018\u000102*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a&\u0010A\u001a\u0004\u0018\u000102*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a&\u0010B\u001a\u0004\u0018\u000102*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a$\u0010C\u001a\u000202*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a*\u0010D\u001a\u00020\u0011*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u0010D\u001a\u00020\u0011*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a,\u0010E\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<2\u0006\u0010+\u001a\u00020\u0011H\u0003\u001a*\u0010F\u001a\u00020\u000e*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0001\u001a\u0016\u0010F\u001a\u00020\u000e*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a,\u0010G\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<2\u0006\u0010+\u001a\u00020\u0011H\u0003\u001a*\u0010H\u001a\u00020I*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u0010H\u001a\u00020I*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0015\u0010J\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\b\u001a\u0014\u0010K\u001a\u00020:*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\u0002\u001a\u001c\u0010L\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a\u001c\u0010M\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a\u0014\u0010N\u001a\u00020O*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\u0002\u001a,\u0010P\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\u0011H\u0002\u001a,\u0010S\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0002\u001a,\u0010T\u001a\u00020)*\u00020\u000b2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0002\u001a\u001c\u0010U\u001a\u00020\u0011*\u00020\u000b2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0011H\u0002\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020:2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a*\u0010V\u001a\u00020\u000b*\u0002022\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u0002022\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020I2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a$\u0010W\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u0011H\u0003\u001a,\u0010\\\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\u001a,\u0010]\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\u001a,\u0010^\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\u001a,\u0010_\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"BYTE_TO_LOWER_CASE_HEX_DIGITS", "", "getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations", "()V", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "HEX_DIGITS_TO_LONG_DECIMAL", "", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "checkFormatLength", "formatLength", "formattedStringLength", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "index", "endIndex", "part", "ignoreCase", "", "partName", "checkNewLineAt", "checkNumberOfDigits", "", "startIndex", "typeHexLength", "checkPrefixSuffixNumberOfDigits", "prefix", "suffix", "checkZeroDigits", "decimalFromHexDigitAt", "formatByteAt", "", "byteToDigits", "destination", "", "destinationOffset", "bytePrefix", "byteSuffix", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "hexToByteArrayNoLineAndGroupSeparator", "bytesFormat", "Lkotlin/text/HexFormat$BytesHexFormat;", "hexToByteArrayNoLineAndGroupSeparatorSlowPath", "hexToByteArrayShortByteSeparatorNoPrefixAndSuffix", "hexToByteArraySlowPath", "hexToInt", "hexToIntImpl", "hexToLong", "hexToLongImpl", "hexToShort", "", "longDecimalFromHexDigitAt", "parseByteAt", "parseInt", "parseLong", "throwInvalidDigitAt", "", "throwInvalidNumberOfDigits", "specifier", "expected", "throwInvalidPrefixSuffix", "throwNotContainedAt", "toCharArrayIfNotEmpty", "toHexString", "toHexStringImpl", "numberFormat", "Lkotlin/text/HexFormat$NumberHexFormat;", "digits", "bits", "toHexStringNoLineAndGroupSeparator", "toHexStringNoLineAndGroupSeparatorSlowPath", "toHexStringShortByteSeparatorNoPrefixAndSuffix", "toHexStringSlowPath", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1249:1\n1198#1,7:1251\n1198#1,7:1258\n1198#1,7:1265\n1198#1,7:1272\n1198#1,7:1279\n1198#1,7:1286\n1198#1,7:1293\n1198#1,7:1300\n1209#1,5:1307\n1209#1,5:1312\n1198#1,7:1317\n1198#1,7:1324\n1209#1,5:1331\n1218#1,5:1336\n1#2:1250\n1188#3,3:1341\n1188#3,3:1344\n1188#3,3:1347\n1188#3,3:1350\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n457#1:1251,7\n490#1:1258,7\n494#1:1265,7\n497#1:1272,7\n538#1:1279,7\n541#1:1286,7\n546#1:1293,7\n551#1:1300,7\n558#1:1307,5\n559#1:1312,5\n1153#1:1317,7\n1155#1:1324,7\n1183#1:1331,5\n1191#1:1336,5\n43#1:1341,3\n44#1:1344,3\n55#1:1347,3\n56#1:1350,3\n*E\n"})
public final class HexExtensionsKt {
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = LOWER_CASE_HEX_DIGITS.charAt(i2 & 15) | (LOWER_CASE_HEX_DIGITS.charAt(i2 >> 4) << 8);
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = UPPER_CASE_HEX_DIGITS.charAt(i3 & 15) | (UPPER_CASE_HEX_DIGITS.charAt(i3 >> 4) << 8);
        }
        BYTE_TO_UPPER_CASE_HEX_DIGITS = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < LOWER_CASE_HEX_DIGITS.length()) {
            iArr3[LOWER_CASE_HEX_DIGITS.charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < UPPER_CASE_HEX_DIGITS.length()) {
            iArr3[UPPER_CASE_HEX_DIGITS.charAt(i7)] = i8;
            i7++;
            i8++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < LOWER_CASE_HEX_DIGITS.length()) {
            jArr[LOWER_CASE_HEX_DIGITS.charAt(i10)] = (long) i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < UPPER_CASE_HEX_DIGITS.length()) {
            jArr[UPPER_CASE_HEX_DIGITS.charAt(i)] = (long) i12;
            i++;
            i12++;
        }
        HEX_DIGITS_TO_LONG_DECIMAL = jArr;
    }

    private static final long charsPerSet(long j, int i, int i2) {
        if (i > 0) {
            long j2 = (long) i;
            return ((j2 - 1) * ((long) i2)) + (j * j2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final int checkContainsAt(String str, int i, int i2, String str2, boolean z, String str3) {
        if (str2.length() == 0) {
            return i;
        }
        int length = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (!CharsKt__CharKt.equals(str2.charAt(i3), str.charAt(i + i3), z)) {
                throwNotContainedAt(str, i, i2, str2, str3);
            }
        }
        return str2.length() + i;
    }

    private static final int checkFormatLength(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ULong.m243toStringimpl(ULong.m197constructorimpl(j)));
    }

    private static final int checkNewLineAt(String str, int i, int i2) {
        if (str.charAt(i) == 13) {
            int i3 = i + 1;
            return (i3 >= i2 || str.charAt(i3) != 10) ? i3 : i + 2;
        } else if (str.charAt(i) == 10) {
            return i + 1;
        } else {
            StringBuilder o = wj6.o(i, "Expected a new line at index ", ", but was ");
            o.append(str.charAt(i));
            throw new NumberFormatException(o.toString());
        }
    }

    private static final void checkNumberOfDigits(String str, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 1) {
            throwInvalidNumberOfDigits(str, i, i2, "at least", 1);
        } else if (i4 > i3) {
            checkZeroDigits(str, i, (i4 + i) - i3);
        }
    }

    private static final void checkPrefixSuffixNumberOfDigits(String str, int i, int i2, String str2, String str3, boolean z, int i3) {
        if ((i2 - i) - str2.length() <= str3.length()) {
            throwInvalidPrefixSuffix(str, i, i2, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (!CharsKt__CharKt.equals(str2.charAt(i4), str.charAt(i + i4), z)) {
                    throwNotContainedAt(str, i, i2, str2, "prefix");
                }
            }
            i += str2.length();
        }
        int length2 = i2 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i5 = 0; i5 < length3; i5++) {
                if (!CharsKt__CharKt.equals(str3.charAt(i5), str.charAt(length2 + i5), z)) {
                    throwNotContainedAt(str, length2, i2, str3, "suffix");
                }
            }
        }
        checkNumberOfDigits(str, i, length2, i3);
    }

    private static final void checkZeroDigits(String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == '0') {
                i++;
            } else {
                StringBuilder o = wj6.o(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                o.append(str.charAt(i));
                o.append("'.\nThe result won't fit the type being parsed.");
                throw new NumberFormatException(o.toString());
            }
        }
    }

    private static final int decimalFromHexDigitAt(String str, int i) {
        int i2;
        char charAt = str.charAt(i);
        if ((charAt >>> 8) == 0 && (i2 = HEX_DIGITS_TO_DECIMAL[charAt]) >= 0) {
            return i2;
        }
        throwInvalidDigitAt(str, i);
        throw new KotlinNothingValueException();
    }

    private static final int formatByteAt(byte[] bArr, int i, String str, String str2, int[] iArr, char[] cArr, int i2) {
        return toCharArrayIfNotEmpty(str2, cArr, formatByteAt(bArr, i, iArr, cArr, toCharArrayIfNotEmpty(str, cArr, i2)));
    }

    private static final int formattedStringLength(int i, int i2, int i3, int i4) {
        if (i > 0) {
            long j = (long) i2;
            return checkFormatLength((((long) i) * (((((long) i3) + 2) + ((long) i4)) + j)) - j);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return BYTE_TO_LOWER_CASE_HEX_DIGITS;
    }

    @ExperimentalStdlibApi
    public static /* synthetic */ void getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations() {
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final byte hexToByte(String str, HexFormat hexFormat) {
        return hexToByte(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final byte[] hexToByteArray(String str, HexFormat hexFormat) {
        return hexToByteArray(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String str, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() ? hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(str, i, i2, bytesHexFormat) : hexToByteArrayNoLineAndGroupSeparatorSlowPath(str, i, i2, bytesHexFormat);
    }

    @ExperimentalStdlibApi
    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String str, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        long length = (long) byteSeparator.length();
        long length2 = ((long) bytePrefix.length()) + 2 + ((long) byteSuffix.length()) + length;
        long j = (long) (i2 - i);
        int i3 = (int) ((j + length) / length2);
        if ((((long) i3) * length2) - length != j) {
            return null;
        }
        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase$kotlin_stdlib();
        byte[] bArr = new byte[i3];
        if (bytePrefix.length() != 0) {
            int length3 = bytePrefix.length();
            for (int i4 = 0; i4 < length3; i4++) {
                if (!CharsKt__CharKt.equals(bytePrefix.charAt(i4), str.charAt(i + i4), ignoreCase$kotlin_stdlib)) {
                    throwNotContainedAt(str, i, i2, bytePrefix, "byte prefix");
                }
            }
            i += bytePrefix.length();
        }
        String i5 = g63.i(byteSuffix, byteSeparator, bytePrefix);
        int i6 = i3 - 1;
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i7] = parseByteAt(str, r13);
            r13 += 2;
            if (i5.length() != 0) {
                int length4 = i5.length();
                for (int i8 = 0; i8 < length4; i8++) {
                    if (!CharsKt__CharKt.equals(i5.charAt(i8), str.charAt(r13 + i8), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, r13, i2, i5, "byte suffix + byte separator + byte prefix");
                    }
                }
                r13 = i5.length() + r13;
            }
        }
        bArr[i6] = parseByteAt(str, r13);
        int i9 = r13 + 2;
        if (byteSuffix.length() != 0) {
            int length5 = byteSuffix.length();
            for (int i10 = 0; i10 < length5; i10++) {
                if (!CharsKt__CharKt.equals(byteSuffix.charAt(i10), str.charAt(i9 + i10), ignoreCase$kotlin_stdlib)) {
                    throwNotContainedAt(str, i9, i2, byteSuffix, "byte suffix");
                }
            }
        }
        return bArr;
    }

    @ExperimentalStdlibApi
    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String str, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length <= 1) {
            int i3 = i2 - i;
            int i4 = 2;
            if (length == 0) {
                if ((i3 & 1) != 0) {
                    return null;
                }
                int i5 = i3 >> 1;
                byte[] bArr = new byte[i5];
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr[i7] = parseByteAt(str, i6);
                    i6 += 2;
                }
                return bArr;
            } else if (i3 % 3 != 2) {
                return null;
            } else {
                int i8 = (i3 / 3) + 1;
                byte[] bArr2 = new byte[i8];
                char charAt = bytesHexFormat.getByteSeparator().charAt(0);
                bArr2[0] = parseByteAt(str, 0);
                for (int i9 = 1; i9 < i8; i9++) {
                    if (str.charAt(i4) != charAt) {
                        String byteSeparator = bytesHexFormat.getByteSeparator();
                        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase$kotlin_stdlib();
                        if (byteSeparator.length() != 0) {
                            int length2 = byteSeparator.length();
                            for (int i10 = 0; i10 < length2; i10++) {
                                if (!CharsKt__CharKt.equals(byteSeparator.charAt(i10), str.charAt(i4 + i10), ignoreCase$kotlin_stdlib)) {
                                    throwNotContainedAt(str, i4, i2, byteSeparator, "byte separator");
                                }
                            }
                            byteSeparator.length();
                        }
                    }
                    bArr2[i9] = parseByteAt(str, i4 + 1);
                    i4 += 3;
                }
                return bArr2;
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0127  */
    @kotlin.ExperimentalStdlibApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final byte[] hexToByteArraySlowPath(java.lang.String r18, int r19, int r20, kotlin.text.HexFormat.BytesHexFormat r21) {
        /*
            r0 = r18
            r1 = r20
            int r9 = r21.getBytesPerLine()
            int r10 = r21.getBytesPerGroup()
            java.lang.String r11 = r21.getBytePrefix()
            java.lang.String r12 = r21.getByteSuffix()
            java.lang.String r13 = r21.getByteSeparator()
            java.lang.String r14 = r21.getGroupSeparator()
            boolean r15 = r21.getIgnoreCase$kotlin_stdlib()
            int r2 = r1 - r19
            int r5 = r14.length()
            int r6 = r13.length()
            int r7 = r11.length()
            int r8 = r12.length()
            r3 = r9
            r4 = r10
            int r2 = parsedByteArrayMaxSize(r2, r3, r4, r5, r6, r7, r8)
            byte[] r3 = new byte[r2]
            r5 = r19
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x003f:
            if (r5 >= r1) goto L_0x015a
            if (r7 != r9) goto L_0x004b
            int r5 = checkNewLineAt(r0, r5, r1)
            r7 = 0
        L_0x0048:
            r8 = 0
            goto L_0x00cb
        L_0x004b:
            if (r8 != r10) goto L_0x0087
            int r8 = r14.length()
            if (r8 != 0) goto L_0x0056
            r19 = r7
            goto L_0x0084
        L_0x0056:
            int r8 = r14.length()
            r4 = 0
        L_0x005b:
            if (r4 >= r8) goto L_0x007d
            r19 = r7
            char r7 = r14.charAt(r4)
            r16 = r8
            int r8 = r5 + r4
            char r8 = r0.charAt(r8)
            boolean r7 = kotlin.text.CharsKt__CharKt.equals(r7, r8, r15)
            if (r7 != 0) goto L_0x0076
            java.lang.String r7 = "group separator"
            throwNotContainedAt(r0, r5, r1, r14, r7)
        L_0x0076:
            int r4 = r4 + 1
            r7 = r19
            r8 = r16
            goto L_0x005b
        L_0x007d:
            r19 = r7
            int r4 = r14.length()
            int r5 = r5 + r4
        L_0x0084:
            r7 = r19
            goto L_0x0048
        L_0x0087:
            r19 = r7
            if (r8 == 0) goto L_0x00c7
            int r4 = r13.length()
            if (r4 != 0) goto L_0x0094
            r17 = r8
            goto L_0x00c2
        L_0x0094:
            int r4 = r13.length()
            r7 = 0
        L_0x0099:
            if (r7 >= r4) goto L_0x00bb
            r16 = r4
            char r4 = r13.charAt(r7)
            r17 = r8
            int r8 = r5 + r7
            char r8 = r0.charAt(r8)
            boolean r4 = kotlin.text.CharsKt__CharKt.equals(r4, r8, r15)
            if (r4 != 0) goto L_0x00b4
            java.lang.String r4 = "byte separator"
            throwNotContainedAt(r0, r5, r1, r13, r4)
        L_0x00b4:
            int r7 = r7 + 1
            r4 = r16
            r8 = r17
            goto L_0x0099
        L_0x00bb:
            r17 = r8
            int r4 = r13.length()
            int r5 = r5 + r4
        L_0x00c2:
            r7 = r19
            r8 = r17
            goto L_0x00cb
        L_0x00c7:
            r17 = r8
            r7 = r19
        L_0x00cb:
            int r7 = r7 + 1
            int r8 = r8 + 1
            int r4 = r11.length()
            if (r4 != 0) goto L_0x00da
            r19 = r7
            r17 = r8
            goto L_0x010a
        L_0x00da:
            int r4 = r11.length()
            r19 = r7
            r7 = 0
        L_0x00e1:
            if (r7 >= r4) goto L_0x0103
            r16 = r4
            char r4 = r11.charAt(r7)
            r17 = r8
            int r8 = r5 + r7
            char r8 = r0.charAt(r8)
            boolean r4 = kotlin.text.CharsKt__CharKt.equals(r4, r8, r15)
            if (r4 != 0) goto L_0x00fc
            java.lang.String r4 = "byte prefix"
            throwNotContainedAt(r0, r5, r1, r11, r4)
        L_0x00fc:
            int r7 = r7 + 1
            r4 = r16
            r8 = r17
            goto L_0x00e1
        L_0x0103:
            r17 = r8
            int r4 = r11.length()
            int r5 = r5 + r4
        L_0x010a:
            int r4 = r1 + -2
            if (r4 >= r5) goto L_0x0114
            java.lang.String r4 = "exactly"
            r7 = 2
            throwInvalidNumberOfDigits(r0, r5, r1, r4, r7)
        L_0x0114:
            int r4 = r6 + 1
            byte r7 = parseByteAt(r0, r5)
            r3[r6] = r7
            int r5 = r5 + 2
            int r6 = r12.length()
            if (r6 != 0) goto L_0x0127
            r16 = r4
            goto L_0x0152
        L_0x0127:
            int r6 = r12.length()
            r7 = 0
        L_0x012c:
            if (r7 >= r6) goto L_0x014a
            char r8 = r12.charAt(r7)
            r16 = r4
            int r4 = r5 + r7
            char r4 = r0.charAt(r4)
            boolean r4 = kotlin.text.CharsKt__CharKt.equals(r8, r4, r15)
            if (r4 != 0) goto L_0x0145
            java.lang.String r4 = "byte suffix"
            throwNotContainedAt(r0, r5, r1, r12, r4)
        L_0x0145:
            int r7 = r7 + 1
            r4 = r16
            goto L_0x012c
        L_0x014a:
            r16 = r4
            int r4 = r12.length()
            int r4 = r4 + r5
            r5 = r4
        L_0x0152:
            r7 = r19
            r6 = r16
            r8 = r17
            goto L_0x003f
        L_0x015a:
            if (r6 != r2) goto L_0x015d
            goto L_0x0161
        L_0x015d:
            byte[] r3 = java.util.Arrays.copyOf(r3, r6)
        L_0x0161:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexExtensionsKt.hexToByteArraySlowPath(java.lang.String, int, int, kotlin.text.HexFormat$BytesHexFormat):byte[]");
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final int hexToInt(String str, HexFormat hexFormat) {
        return hexToInt(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final int hexToIntImpl(String str, int i, int i2, HexFormat hexFormat, int i3) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.isDigitsOnly$kotlin_stdlib()) {
            checkNumberOfDigits(str, i, i2, i3);
            return parseInt(str, i, i2);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i, i2, prefix, suffix, number.getIgnoreCase$kotlin_stdlib(), i3);
        return parseInt(str, prefix.length() + i, i2 - suffix.length());
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final long hexToLong(String str, HexFormat hexFormat) {
        return hexToLong(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final long hexToLongImpl(String str, int i, int i2, HexFormat hexFormat, int i3) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.isDigitsOnly$kotlin_stdlib()) {
            checkNumberOfDigits(str, i, i2, i3);
            return parseLong(str, i, i2);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i, i2, prefix, suffix, number.getIgnoreCase$kotlin_stdlib(), i3);
        return parseLong(str, prefix.length() + i, i2 - suffix.length());
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final short hexToShort(String str, HexFormat hexFormat) {
        return hexToShort(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    private static final long longDecimalFromHexDigitAt(String str, int i) {
        char charAt = str.charAt(i);
        if ((charAt >>> 8) == 0) {
            long j = HEX_DIGITS_TO_LONG_DECIMAL[charAt];
            if (j >= 0) {
                return j;
            }
        }
        throwInvalidDigitAt(str, i);
        throw new KotlinNothingValueException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = HEX_DIGITS_TO_DECIMAL;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final byte parseByteAt(java.lang.String r4, int r5) {
        /*
            char r0 = r4.charAt(r5)
            int r1 = r0 >>> 8
            if (r1 != 0) goto L_0x002a
            int[] r1 = HEX_DIGITS_TO_DECIMAL
            r0 = r1[r0]
            if (r0 < 0) goto L_0x002a
            int r5 = r5 + 1
            char r2 = r4.charAt(r5)
            int r3 = r2 >>> 8
            if (r3 != 0) goto L_0x0021
            r1 = r1[r2]
            if (r1 < 0) goto L_0x0021
            int r4 = r0 << 4
            r4 = r4 | r1
            byte r4 = (byte) r4
            return r4
        L_0x0021:
            throwInvalidDigitAt(r4, r5)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L_0x002a:
            throwInvalidDigitAt(r4, r5)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexExtensionsKt.parseByteAt(java.lang.String, int):byte");
    }

    private static final int parseInt(String str, int i, int i2) {
        int i3;
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 << 4;
            char charAt = str.charAt(i);
            if ((charAt >>> 8) != 0 || (i3 = HEX_DIGITS_TO_DECIMAL[charAt]) < 0) {
                throwInvalidDigitAt(str, i);
                throw new KotlinNothingValueException();
            }
            i4 = i5 | i3;
            i++;
        }
        return i4;
    }

    private static final long parseLong(String str, int i, int i2) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char charAt = str.charAt(i);
            if ((charAt >>> 8) == 0) {
                long j3 = HEX_DIGITS_TO_LONG_DECIMAL[charAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            throwInvalidDigitAt(str, i);
            throw new KotlinNothingValueException();
        }
        return j;
    }

    public static final int parsedByteArrayMaxSize(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long j;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        if (i10 > 0) {
            long j2 = ((long) i6) + 2 + ((long) i7);
            long charsPerSet = charsPerSet(j2, i12, i14);
            if (i11 <= i12) {
                j = charsPerSet(j2, i11, i14);
            } else {
                j = charsPerSet(charsPerSet, i11 / i12, i13);
                int i15 = i11 % i12;
                if (i15 != 0) {
                    j = j + ((long) i13) + charsPerSet(j2, i15, i14);
                }
            }
            long j3 = (long) i10;
            long wholeElementsPerSet = wholeElementsPerSet(j3, j, 1);
            long j4 = j3 - ((j + 1) * wholeElementsPerSet);
            long wholeElementsPerSet2 = wholeElementsPerSet(j4, charsPerSet, i13);
            long j5 = j4 - ((charsPerSet + ((long) i13)) * wholeElementsPerSet2);
            long wholeElementsPerSet3 = wholeElementsPerSet(j5, j2, i14);
            if (j5 - ((j2 + ((long) i14)) * wholeElementsPerSet3) > 0) {
                i8 = i2;
                i9 = 1;
            } else {
                i9 = 0;
                i8 = i2;
            }
            return (int) ((wholeElementsPerSet2 * ((long) i12)) + (wholeElementsPerSet * ((long) i8)) + wholeElementsPerSet3 + ((long) i9));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final Void throwInvalidDigitAt(String str, int i) {
        StringBuilder o = wj6.o(i, "Expected a hexadecimal digit at index ", ", but was ");
        o.append(str.charAt(i));
        throw new NumberFormatException(o.toString());
    }

    private static final void throwInvalidNumberOfDigits(String str, int i, int i2, String str2, int i3) {
        String substring = str.substring(i, i2);
        throw new NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was \"" + substring + "\" of length " + (i2 - i));
    }

    private static final void throwInvalidPrefixSuffix(String str, int i, int i2, String str2, String str3) {
        String substring = str.substring(i, i2);
        StringBuilder r = rae.r("Expected a hexadecimal number with prefix \"", str2, "\" and suffix \"", str3, "\", but was ");
        r.append(substring);
        throw new NumberFormatException(r.toString());
    }

    private static final void throwNotContainedAt(String str, int i, int i2, String str2, String str3) {
        String substring = str.substring(i, RangesKt.coerceAtMost(str2.length() + i, i2));
        StringBuilder r = rae.r("Expected ", str3, " \"", str2, "\" at index ");
        r.append(i);
        r.append(", but was ");
        r.append(substring);
        throw new NumberFormatException(r.toString());
    }

    private static final int toCharArrayIfNotEmpty(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(byte[] bArr, HexFormat hexFormat) {
        return toHexString(bArr, 0, bArr.length, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final String toHexStringImpl(long j, HexFormat.NumberHexFormat numberHexFormat, String str, int i) {
        String str2 = str;
        if ((i & 3) == 0) {
            int i2 = i >> 2;
            int minLength = numberHexFormat.getMinLength();
            int coerceAtLeast = RangesKt.coerceAtLeast(minLength - i2, 0);
            String prefix = numberHexFormat.getPrefix();
            String suffix = numberHexFormat.getSuffix();
            boolean removeLeadingZeros = numberHexFormat.getRemoveLeadingZeros();
            int checkFormatLength = checkFormatLength(((long) prefix.length()) + ((long) coerceAtLeast) + ((long) i2) + ((long) suffix.length()));
            char[] cArr = new char[checkFormatLength];
            int charArrayIfNotEmpty = toCharArrayIfNotEmpty(prefix, cArr, 0);
            if (coerceAtLeast > 0) {
                int i3 = coerceAtLeast + charArrayIfNotEmpty;
                ArraysKt.fill(cArr, str2.charAt(0), charArrayIfNotEmpty, i3);
                charArrayIfNotEmpty = i3;
            }
            int i4 = i;
            for (int i5 = 0; i5 < i2; i5++) {
                i4 -= 4;
                int i6 = (int) ((j >> i4) & 15);
                removeLeadingZeros = removeLeadingZeros && i6 == 0 && (i4 >> 2) >= minLength;
                if (!removeLeadingZeros) {
                    cArr[charArrayIfNotEmpty] = str2.charAt(i6);
                    charArrayIfNotEmpty++;
                }
            }
            int charArrayIfNotEmpty2 = toCharArrayIfNotEmpty(suffix, cArr, charArrayIfNotEmpty);
            return charArrayIfNotEmpty2 == checkFormatLength ? StringsKt__StringsJVMKt.concatToString(cArr) : StringsKt__StringsJVMKt.concatToString$default(cArr, 0, charArrayIfNotEmpty2, 1, (Object) null);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @ExperimentalStdlibApi
    private static final String toHexStringNoLineAndGroupSeparator(byte[] bArr, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() ? toHexStringShortByteSeparatorNoPrefixAndSuffix(bArr, i, i2, bytesHexFormat, iArr) : toHexStringNoLineAndGroupSeparatorSlowPath(bArr, i, i2, bytesHexFormat, iArr);
    }

    @ExperimentalStdlibApi
    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] bArr, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[formattedStringLength(i2 - i, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int formatByteAt = formatByteAt(bArr, i, bytePrefix, byteSuffix, iArr, cArr, 0);
        while (true) {
            i++;
            if (i >= i2) {
                return StringsKt__StringsJVMKt.concatToString(cArr);
            }
            formatByteAt = formatByteAt(bArr, i, bytePrefix, byteSuffix, iArr, cArr, toCharArrayIfNotEmpty(byteSeparator, cArr, formatByteAt));
        }
    }

    @ExperimentalStdlibApi
    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] bArr, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length <= 1) {
            int i3 = i2 - i;
            int i4 = 0;
            if (length == 0) {
                char[] cArr = new char[checkFormatLength(((long) i3) * 2)];
                while (i < i2) {
                    i4 = formatByteAt(bArr, i, iArr, cArr, i4);
                    i++;
                }
                return StringsKt__StringsJVMKt.concatToString(cArr);
            }
            char[] cArr2 = new char[checkFormatLength((((long) i3) * 3) - 1)];
            char charAt = bytesHexFormat.getByteSeparator().charAt(0);
            int formatByteAt = formatByteAt(bArr, i, iArr, cArr2, 0);
            for (int i5 = i + 1; i5 < i2; i5++) {
                cArr2[formatByteAt] = charAt;
                formatByteAt = formatByteAt(bArr, i5, iArr, cArr2, formatByteAt + 1);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @ExperimentalStdlibApi
    private static final String toHexStringSlowPath(byte[] bArr, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i3;
        int i4;
        int i5 = i2;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int formattedStringLength = formattedStringLength(i5 - i, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[formattedStringLength];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < i5; i9++) {
            if (i7 == bytesPerLine) {
                cArr[i6] = 10;
                i6++;
                i4 = 0;
                i3 = 0;
            } else if (i8 == bytesPerGroup) {
                i6 = toCharArrayIfNotEmpty(groupSeparator, cArr, i6);
                i4 = i7;
                i3 = 0;
            } else {
                i4 = i7;
                i3 = i8;
            }
            if (i3 != 0) {
                i6 = toCharArrayIfNotEmpty(byteSeparator, cArr, i6);
            }
            i6 = formatByteAt(bArr, i9, bytePrefix, byteSuffix, iArr, cArr, i6);
            i8 = i3 + 1;
            i7 = i4 + 1;
        }
        if (i6 == formattedStringLength) {
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final long wholeElementsPerSet(long j, long j2, int i) {
        if (j <= 0 || j2 <= 0) {
            return 0;
        }
        long j3 = (long) i;
        return (j + j3) / (j2 + j3);
    }

    @ExperimentalStdlibApi
    private static final byte hexToByte(String str, int i, int i2, HexFormat hexFormat) {
        return (byte) hexToIntImpl(str, i, i2, hexFormat, 2);
    }

    public static /* synthetic */ byte hexToByte$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, i, i2, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final byte[] hexToByteArray(String str, int i, int i2, HexFormat hexFormat) {
        byte[] hexToByteArrayNoLineAndGroupSeparator;
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        if (i == i2) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        if (!bytes.getNoLineAndGroupSeparator$kotlin_stdlib() || (hexToByteArrayNoLineAndGroupSeparator = hexToByteArrayNoLineAndGroupSeparator(str, i, i2, bytes)) == null) {
            return hexToByteArraySlowPath(str, i, i2, bytes);
        }
        return hexToByteArrayNoLineAndGroupSeparator;
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, i, i2, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final int hexToInt(String str, int i, int i2, HexFormat hexFormat) {
        return hexToIntImpl(str, i, i2, hexFormat, 8);
    }

    public static /* synthetic */ int hexToInt$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, i, i2, hexFormat);
    }

    @ExperimentalStdlibApi
    public static final long hexToLong(String str, int i, int i2, HexFormat hexFormat) {
        return hexToLongImpl(str, i, i2, hexFormat, 16);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, i, i2, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final short hexToShort(String str, int i, int i2, HexFormat hexFormat) {
        return (short) hexToIntImpl(str, i, i2, hexFormat, 4);
    }

    public static /* synthetic */ short hexToShort$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, i, i2, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(byte[] bArr, int i, int i2, HexFormat hexFormat) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, bArr.length);
        if (i == i2) {
            return "";
        }
        int[] iArr = hexFormat.getUpperCase() ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        if (bytes.getNoLineAndGroupSeparator$kotlin_stdlib()) {
            return toHexStringNoLineAndGroupSeparator(bArr, i, i2, bytes, iArr);
        }
        return toHexStringSlowPath(bArr, i, i2, bytes, iArr);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, i, i2, hexFormat);
    }

    public static final int formattedStringLength(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i > 0) {
            int i8 = i - 1;
            int i9 = i8 / i2;
            int i10 = (i2 - 1) / i3;
            int i11 = i % i2;
            if (i11 != 0) {
                i2 = i11;
            }
            int i12 = (i10 * i9) + ((i2 - 1) / i3);
            return checkFormatLength(((((long) i6) + 2 + ((long) i7)) * ((long) i)) + (((long) ((i8 - i9) - i12)) * ((long) i5)) + (((long) i12) * ((long) i4)) + ((long) i9));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final int formatByteAt(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & UByte.MAX_VALUE];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        return i2 + 2;
    }

    public static /* synthetic */ String toHexString$default(byte b, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(b, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(s, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(int i, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(i, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(j, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(byte b, HexFormat hexFormat) {
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (!number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            return toHexStringImpl((long) b, number, str, 8);
        }
        char[] cArr = {str.charAt((b >> 4) & 15), str.charAt(b & 15)};
        if (number.getRemoveLeadingZeros()) {
            return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(b & UByte.MAX_VALUE) - 24) >> 2, 1), 0, 2, (Object) null);
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(short s, HexFormat hexFormat) {
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (!number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            return toHexStringImpl((long) s, number, str, 16);
        }
        char[] cArr = {str.charAt((s >> 12) & 15), str.charAt((s >> 8) & 15), str.charAt((s >> 4) & 15), str.charAt(s & 15)};
        if (number.getRemoveLeadingZeros()) {
            return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(s & UShort.MAX_VALUE) - 16) >> 2, 3), 0, 2, (Object) null);
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(int i, HexFormat hexFormat) {
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (!number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            return toHexStringImpl((long) i, number, str, 32);
        }
        char[] cArr = {str.charAt((i >> 28) & 15), str.charAt((i >> 24) & 15), str.charAt((i >> 20) & 15), str.charAt((i >> 16) & 15), str.charAt((i >> 12) & 15), str.charAt((i >> 8) & 15), str.charAt((i >> 4) & 15), str.charAt(i & 15)};
        if (number.getRemoveLeadingZeros()) {
            return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros(i) >> 2, 7), 0, 2, (Object) null);
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(long j, HexFormat hexFormat) {
        long j2 = j;
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (!number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            return toHexStringImpl(j2, number, str, 64);
        }
        char[] cArr = {str.charAt((int) ((j2 >> 60) & 15)), str.charAt((int) ((j2 >> 56) & 15)), str.charAt((int) ((j2 >> 52) & 15)), str.charAt((int) ((j2 >> 48) & 15)), str.charAt((int) ((j2 >> 44) & 15)), str.charAt((int) ((j2 >> 40) & 15)), str.charAt((int) ((j2 >> 36) & 15)), str.charAt((int) ((j2 >> 32) & 15)), str.charAt((int) ((j2 >> 28) & 15)), str.charAt((int) ((j2 >> 24) & 15)), str.charAt((int) ((j2 >> 20) & 15)), str.charAt((int) ((j2 >> 16) & 15)), str.charAt((int) ((j2 >> 12) & 15)), str.charAt((int) ((j2 >> 8) & 15)), str.charAt((int) ((j2 >> 4) & 15)), str.charAt((int) (15 & j2))};
        if (number.getRemoveLeadingZeros()) {
            return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Long.numberOfLeadingZeros(j) >> 2, 15), 0, 2, (Object) null);
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }
}
