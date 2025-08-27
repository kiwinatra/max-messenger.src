package kotlin.collections.unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\u0002*\u00020\u00032\u0006\u0010 \u001a\u00020\u0013H\b¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010\u001f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H\b¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010\u001f\u001a\u00020\n*\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\b¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010\u001f\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\b¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007¢\u0006\u0004\b.\u0010/\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007¢\u0006\u0004\b0\u00101\u001a=\u00102\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a=\u00102\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a=\u00102\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a=\u00102\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a1\u0010?\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007¢\u0006\u0004\bC\u0010D\u001a1\u0010?\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007¢\u0006\u0004\bE\u0010F\u001a1\u0010?\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007¢\u0006\u0004\bG\u0010H\u001a1\u0010?\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007¢\u0006\u0004\bI\u0010J\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007¢\u0006\u0004\bL\u0010+\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007¢\u0006\u0004\bM\u0010-\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007¢\u0006\u0004\bN\u0010/\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007¢\u0006\u0004\bO\u00101\u001a=\u0010P\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\bø\u0001\u0000¢\u0006\u0004\bQ\u00108\u001a=\u0010P\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\bø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a=\u0010P\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\bø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a=\u0010P\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\bø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a1\u0010U\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007¢\u0006\u0004\bV\u0010D\u001a1\u0010U\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007¢\u0006\u0004\bW\u0010F\u001a1\u0010U\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007¢\u0006\u0004\bX\u0010H\u001a1\u0010U\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007¢\u0006\u0004\bY\u0010J\u001a+\u0010Z\u001a\u00020[*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020[06H\bø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a+\u0010Z\u001a\u00020^*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020^06H\bø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a+\u0010Z\u001a\u00020[*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020[06H\bø\u0001\u0000¢\u0006\u0004\b\\\u0010a\u001a+\u0010Z\u001a\u00020^*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020^06H\bø\u0001\u0000¢\u0006\u0004\b_\u0010b\u001a+\u0010Z\u001a\u00020[*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020[06H\bø\u0001\u0000¢\u0006\u0004\b\\\u0010c\u001a+\u0010Z\u001a\u00020^*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020^06H\bø\u0001\u0000¢\u0006\u0004\b_\u0010d\u001a+\u0010Z\u001a\u00020[*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020[06H\bø\u0001\u0000¢\u0006\u0004\b\\\u0010e\u001a+\u0010Z\u001a\u00020^*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020^06H\bø\u0001\u0000¢\u0006\u0004\b_\u0010f\u0002\u0007\n\u0005\b20\u0001¨\u0006g"}, d2 = {"asList", "", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "asList-GBYM_sE", "([B)Ljava/util/List;", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "asList--ajY-9A", "([I)Ljava/util/List;", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "asList-QwZRm1k", "([J)Ljava/util/List;", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "", "element", "fromIndex", "toIndex", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-EtDCXyQ", "([SSII)I", "elementAt", "index", "elementAt-PpDY95g", "([BI)B", "elementAt-qFRl0hI", "([II)I", "elementAt-r7IrZao", "([JI)J", "elementAt-nggk6HY", "([SI)S", "max", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min-GBYM_sE", "min--ajY-9A", "min-QwZRm1k", "min-rL5Bavg", "minBy", "minBy-JOV_ifY", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-xTcfx_M", "minWith", "minWith-XMRcp5o", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, pn = "kotlin.collections", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
class UArraysKt___UArraysJvmKt {
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: asList--ajY-9A  reason: not valid java name */
    public static final List<UInt> m487asListajY9A(int[] iArr) {
        return new UArraysKt___UArraysJvmKt$asList$1(iArr);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: asList-GBYM_sE  reason: not valid java name */
    public static final List<UByte> m488asListGBYM_sE(byte[] bArr) {
        return new UArraysKt___UArraysJvmKt$asList$3(bArr);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: asList-QwZRm1k  reason: not valid java name */
    public static final List<ULong> m489asListQwZRm1k(long[] jArr) {
        return new UArraysKt___UArraysJvmKt$asList$2(jArr);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: asList-rL5Bavg  reason: not valid java name */
    public static final List<UShort> m490asListrL5Bavg(short[] sArr) {
        return new UArraysKt___UArraysJvmKt$asList$4(sArr);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: binarySearch-2fe2U9s  reason: not valid java name */
    public static final int m491binarySearch2fe2U9s(int[] iArr, int i, int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, UIntArray.m179getSizeimpl(iArr));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int uintCompare = UnsignedKt.uintCompare(iArr[i5], i);
            if (uintCompare < 0) {
                i2 = i5 + 1;
            } else if (uintCompare <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: binarySearch-2fe2U9s$default  reason: not valid java name */
    public static /* synthetic */ int m492binarySearch2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UIntArray.m179getSizeimpl(iArr);
        }
        return m491binarySearch2fe2U9s(iArr, i, i2, i3);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: binarySearch-EtDCXyQ  reason: not valid java name */
    public static final int m493binarySearchEtDCXyQ(short[] sArr, short s, int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UShortArray.m363getSizeimpl(sArr));
        short s2 = s & UShort.MAX_VALUE;
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int uintCompare = UnsignedKt.uintCompare(sArr[i4], s2);
            if (uintCompare < 0) {
                i = i4 + 1;
            } else if (uintCompare <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: binarySearch-EtDCXyQ$default  reason: not valid java name */
    public static /* synthetic */ int m494binarySearchEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m363getSizeimpl(sArr);
        }
        return m493binarySearchEtDCXyQ(sArr, s, i, i2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: binarySearch-K6DWlUc  reason: not valid java name */
    public static final int m495binarySearchK6DWlUc(long[] jArr, long j, int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, ULongArray.m258getSizeimpl(jArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int ulongCompare = UnsignedKt.ulongCompare(jArr[i4], j);
            if (ulongCompare < 0) {
                i = i4 + 1;
            } else if (ulongCompare <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: binarySearch-K6DWlUc$default  reason: not valid java name */
    public static /* synthetic */ int m496binarySearchK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m258getSizeimpl(jArr);
        }
        return m495binarySearchK6DWlUc(jArr, j, i, i2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: binarySearch-WpHrYlw  reason: not valid java name */
    public static final int m497binarySearchWpHrYlw(byte[] bArr, byte b, int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UByteArray.m100getSizeimpl(bArr));
        byte b2 = b & UByte.MAX_VALUE;
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int uintCompare = UnsignedKt.uintCompare(bArr[i4], b2);
            if (uintCompare < 0) {
                i = i4 + 1;
            } else if (uintCompare <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: binarySearch-WpHrYlw$default  reason: not valid java name */
    public static /* synthetic */ int m498binarySearchWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m100getSizeimpl(bArr);
        }
        return m497binarySearchWpHrYlw(bArr, b, i, i2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: elementAt-PpDY95g  reason: not valid java name */
    private static final byte m499elementAtPpDY95g(byte[] bArr, int i) {
        return UByteArray.m99getw2LRezQ(bArr, i);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: elementAt-nggk6HY  reason: not valid java name */
    private static final short m500elementAtnggk6HY(short[] sArr, int i) {
        return UShortArray.m362getMh2AYeg(sArr, i);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: elementAt-qFRl0hI  reason: not valid java name */
    private static final int m501elementAtqFRl0hI(int[] iArr, int i) {
        return UIntArray.m178getpVg5ArA(iArr, i);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: elementAt-r7IrZao  reason: not valid java name */
    private static final long m502elementAtr7IrZao(long[] jArr, int i) {
        return ULongArray.m257getsVKNKU(jArr, i);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InlineOnly
    /* renamed from: maxBy-JOV_ifY  reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m507maxByJOV_ifY(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m102isEmptyimpl(bArr)) {
            return null;
        }
        byte b = UByteArray.m99getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt.getLastIndex(bArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) function1.invoke(UByte.m35boximpl(b));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte b2 = UByteArray.m99getw2LRezQ(bArr, i);
                    Comparable comparable2 = (Comparable) function1.invoke(UByte.m35boximpl(b2));
                    if (comparable.compareTo(comparable2) < 0) {
                        b = b2;
                        comparable = comparable2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return UByte.m35boximpl(b);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InlineOnly
    /* renamed from: maxBy-MShoTSo  reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m508maxByMShoTSo(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m260isEmptyimpl(jArr)) {
            return null;
        }
        long j = ULongArray.m257getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt.getLastIndex(jArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) function1.invoke(ULong.m191boximpl(j));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j2 = ULongArray.m257getsVKNKU(jArr, i);
                    Comparable comparable2 = (Comparable) function1.invoke(ULong.m191boximpl(j2));
                    if (comparable.compareTo(comparable2) < 0) {
                        j = j2;
                        comparable = comparable2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return ULong.m191boximpl(j);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InlineOnly
    /* renamed from: maxBy-jgv0xPQ  reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m509maxByjgv0xPQ(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m181isEmptyimpl(iArr)) {
            return null;
        }
        int i = UIntArray.m178getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt.getLastIndex(iArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) function1.invoke(UInt.m112boximpl(i));
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = UIntArray.m178getpVg5ArA(iArr, i2);
                    Comparable comparable2 = (Comparable) function1.invoke(UInt.m112boximpl(i3));
                    if (comparable.compareTo(comparable2) < 0) {
                        i = i3;
                        comparable = comparable2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return UInt.m112boximpl(i);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InlineOnly
    /* renamed from: maxBy-xTcfx_M  reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m510maxByxTcfx_M(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m365isEmptyimpl(sArr)) {
            return null;
        }
        short s = UShortArray.m362getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt.getLastIndex(sArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) function1.invoke(UShort.m298boximpl(s));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s2 = UShortArray.m362getMh2AYeg(sArr, i);
                    Comparable comparable2 = (Comparable) function1.invoke(UShort.m298boximpl(s2));
                    if (comparable.compareTo(comparable2) < 0) {
                        s = s2;
                        comparable = comparable2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return UShort.m298boximpl(s);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InlineOnly
    /* renamed from: minBy-JOV_ifY  reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m519minByJOV_ifY(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m102isEmptyimpl(bArr)) {
            return null;
        }
        byte b = UByteArray.m99getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt.getLastIndex(bArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) function1.invoke(UByte.m35boximpl(b));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte b2 = UByteArray.m99getw2LRezQ(bArr, i);
                    Comparable comparable2 = (Comparable) function1.invoke(UByte.m35boximpl(b2));
                    if (comparable.compareTo(comparable2) > 0) {
                        b = b2;
                        comparable = comparable2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return UByte.m35boximpl(b);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InlineOnly
    /* renamed from: minBy-MShoTSo  reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m520minByMShoTSo(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m260isEmptyimpl(jArr)) {
            return null;
        }
        long j = ULongArray.m257getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt.getLastIndex(jArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) function1.invoke(ULong.m191boximpl(j));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j2 = ULongArray.m257getsVKNKU(jArr, i);
                    Comparable comparable2 = (Comparable) function1.invoke(ULong.m191boximpl(j2));
                    if (comparable.compareTo(comparable2) > 0) {
                        j = j2;
                        comparable = comparable2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return ULong.m191boximpl(j);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InlineOnly
    /* renamed from: minBy-jgv0xPQ  reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m521minByjgv0xPQ(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m181isEmptyimpl(iArr)) {
            return null;
        }
        int i = UIntArray.m178getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt.getLastIndex(iArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) function1.invoke(UInt.m112boximpl(i));
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = UIntArray.m178getpVg5ArA(iArr, i2);
                    Comparable comparable2 = (Comparable) function1.invoke(UInt.m112boximpl(i3));
                    if (comparable.compareTo(comparable2) > 0) {
                        i = i3;
                        comparable = comparable2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return UInt.m112boximpl(i);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InlineOnly
    /* renamed from: minBy-xTcfx_M  reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m522minByxTcfx_M(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m365isEmptyimpl(sArr)) {
            return null;
        }
        short s = UShortArray.m362getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt.getLastIndex(sArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) function1.invoke(UShort.m298boximpl(s));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s2 = UShortArray.m362getMh2AYeg(sArr, i);
                    Comparable comparable2 = (Comparable) function1.invoke(UShort.m298boximpl(s2));
                    if (comparable.compareTo(comparable2) > 0) {
                        s = s2;
                        comparable = comparable2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return UShort.m298boximpl(s);
    }

    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(int[] iArr, Function1<? super UInt, ? extends BigDecimal> function1) {
        BigDecimal valueOf = BigDecimal.valueOf(0);
        int r1 = UIntArray.m179getSizeimpl(iArr);
        for (int i = 0; i < r1; i++) {
            valueOf = valueOf.add((BigDecimal) rae.m(iArr, i, function1));
        }
        return valueOf;
    }

    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(int[] iArr, Function1<? super UInt, ? extends BigInteger> function1) {
        BigInteger valueOf = BigInteger.valueOf(0);
        int r1 = UIntArray.m179getSizeimpl(iArr);
        for (int i = 0; i < r1; i++) {
            valueOf = valueOf.add((BigInteger) rae.m(iArr, i, function1));
        }
        return valueOf;
    }

    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(long[] jArr, Function1<? super ULong, ? extends BigDecimal> function1) {
        BigDecimal valueOf = BigDecimal.valueOf(0);
        int r1 = ULongArray.m258getSizeimpl(jArr);
        for (int i = 0; i < r1; i++) {
            valueOf = valueOf.add((BigDecimal) rae.n(jArr, i, function1));
        }
        return valueOf;
    }

    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(long[] jArr, Function1<? super ULong, ? extends BigInteger> function1) {
        BigInteger valueOf = BigInteger.valueOf(0);
        int r1 = ULongArray.m258getSizeimpl(jArr);
        for (int i = 0; i < r1; i++) {
            valueOf = valueOf.add((BigInteger) rae.n(jArr, i, function1));
        }
        return valueOf;
    }

    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(byte[] bArr, Function1<? super UByte, ? extends BigDecimal> function1) {
        BigDecimal valueOf = BigDecimal.valueOf(0);
        int r1 = UByteArray.m100getSizeimpl(bArr);
        for (int i = 0; i < r1; i++) {
            valueOf = valueOf.add((BigDecimal) rae.l(bArr, i, function1));
        }
        return valueOf;
    }

    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(byte[] bArr, Function1<? super UByte, ? extends BigInteger> function1) {
        BigInteger valueOf = BigInteger.valueOf(0);
        int r1 = UByteArray.m100getSizeimpl(bArr);
        for (int i = 0; i < r1; i++) {
            valueOf = valueOf.add((BigInteger) rae.l(bArr, i, function1));
        }
        return valueOf;
    }

    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(short[] sArr, Function1<? super UShort, ? extends BigDecimal> function1) {
        BigDecimal valueOf = BigDecimal.valueOf(0);
        int r1 = UShortArray.m363getSizeimpl(sArr);
        for (int i = 0; i < r1; i++) {
            valueOf = valueOf.add((BigDecimal) rae.o(sArr, i, function1));
        }
        return valueOf;
    }

    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(short[] sArr, Function1<? super UShort, ? extends BigInteger> function1) {
        BigInteger valueOf = BigInteger.valueOf(0);
        int r1 = UShortArray.m363getSizeimpl(sArr);
        for (int i = 0; i < r1; i++) {
            valueOf = valueOf.add((BigInteger) rae.o(sArr, i, function1));
        }
        return valueOf;
    }
}
