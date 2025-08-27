package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.util.Xml;
import android.widget.Toast;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.richvector.VectorPath;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: hi7  reason: default package */
public abstract class hi7 {
    public static Context a;
    public static Boolean b;
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final oj4 g = new oj4(5);
    public static final byte[] h = {112, 114, 111, 0};
    public static final byte[] i = {112, 114, 109, 0};
    public static Handler j;

    public static f96 A(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), foc.FontFamily);
                String string = obtainAttributes.getString(foc.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(foc.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(foc.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(foc.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(foc.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(foc.FontFamily_fontProviderFetchTimeout, 500);
                String string4 = obtainAttributes.getString(foc.FontFamily_fontProviderSystemFontFamily);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), foc.FontFamilyFont);
                                int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(foc.FontFamilyFont_fontWeight) ? foc.FontFamilyFont_fontWeight : foc.FontFamilyFont_android_fontWeight, HttpStatus.SC_BAD_REQUEST);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(foc.FontFamilyFont_fontStyle) ? foc.FontFamilyFont_fontStyle : foc.FontFamilyFont_android_fontStyle, 0);
                                int i3 = obtainAttributes2.hasValue(foc.FontFamilyFont_ttcIndex) ? foc.FontFamilyFont_ttcIndex : foc.FontFamilyFont_android_ttcIndex;
                                String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(foc.FontFamilyFont_fontVariationSettings) ? foc.FontFamilyFont_fontVariationSettings : foc.FontFamilyFont_android_fontVariationSettings);
                                int i4 = obtainAttributes2.getInt(i3, 0);
                                int i5 = obtainAttributes2.hasValue(foc.FontFamilyFont_font) ? foc.FontFamilyFont_font : foc.FontFamilyFont_android_font;
                                int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                                String string6 = obtainAttributes2.getString(i5);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    c0(xmlResourceParser);
                                }
                                arrayList.add(new h96(string6, i2, string5, i4, resourceId2, z));
                            } else {
                                c0(xmlResourceParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new g96((h96[]) arrayList.toArray(new h96[0]));
                }
                while (xmlResourceParser.next() != 3) {
                    c0(xmlResourceParser);
                }
                return new i96(new soc(string, string2, string3, K(resources2, resourceId)), integer, integer2, string4);
            }
            c0(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static j63 B(int i2, l8b l8b) {
        int g2 = l8b.g();
        if (l8b.g() == 1684108385) {
            l8b.H(8);
            String q = l8b.q(g2 - 16);
            return new j63("und", q, q);
        }
        i8b.V("Failed to parse comment attribute: " + ty.g(i2));
        return null;
    }

    public static wm C(l8b l8b) {
        int g2 = l8b.g();
        if (l8b.g() == 1684108385) {
            int g3 = l8b.g() & 16777215;
            String str = g3 == 13 ? "image/jpeg" : g3 == 14 ? "image/png" : null;
            if (str == null) {
                i2a.m(g3, "Unrecognized cover art flags: ");
                return null;
            }
            l8b.H(4);
            int i2 = g2 - 16;
            byte[] bArr = new byte[i2];
            l8b.e(0, bArr, i2);
            return new wm(str, (String) null, 3, bArr);
        }
        i8b.V("Failed to parse cover art attribute");
        return null;
    }

    public static nff D(int i2, l8b l8b, String str) {
        int g2 = l8b.g();
        if (l8b.g() == 1684108385 && g2 >= 22) {
            l8b.H(10);
            int A = l8b.A();
            if (A > 0) {
                String h2 = wj6.h(A, "");
                int A2 = l8b.A();
                if (A2 > 0) {
                    h2 = h2 + "/" + A2;
                }
                return new nff(str, (String) null, tb7.t(h2));
            }
        }
        i8b.V("Failed to parse index/count attribute: " + ty.g(i2));
        return null;
    }

    public static int E(l8b l8b) {
        int g2 = l8b.g();
        if (l8b.g() == 1684108385) {
            l8b.H(8);
            int i2 = g2 - 16;
            if (i2 == 1) {
                return l8b.u();
            }
            if (i2 == 2) {
                return l8b.A();
            }
            if (i2 == 3) {
                return l8b.x();
            }
            if (i2 == 4 && (l8b.a[l8b.b] & ByteCompanionObject.MIN_VALUE) == 0) {
                return l8b.y();
            }
        }
        i8b.V("Failed to parse data atom to int");
        return -1;
    }

    public static u77 F(int i2, String str, l8b l8b, boolean z, boolean z2) {
        int E = E(l8b);
        if (z2) {
            E = Math.min(1, E);
        }
        if (E >= 0) {
            return z ? new nff(str, (String) null, tb7.t(Integer.toString(E))) : new j63("und", str, Integer.toString(E));
        }
        i8b.V("Failed to parse uint8 attribute: " + ty.g(i2));
        return null;
    }

    public static nff G(int i2, l8b l8b, String str) {
        int g2 = l8b.g();
        if (l8b.g() == 1684108385) {
            l8b.H(8);
            return new nff(str, (String) null, tb7.t(l8b.q(g2 - 16)));
        }
        i8b.V("Failed to parse text attribute: " + ty.g(i2));
        return null;
    }

    public static int J(InputStream inputStream, byte[] bArr, int i2) {
        inputStream.getClass();
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    public static List K(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (e96.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static int[] L(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) tf6.h0(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static sn4[] M(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, sn4[] sn4Arr) {
        byte[] bArr3 = kr7.X;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(kr7.v, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int h0 = (int) tf6.h0(fileInputStream, 1);
                byte[] g0 = tf6.g0(fileInputStream, (int) tf6.h0(fileInputStream, 4), (int) tf6.h0(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(g0);
                    try {
                        sn4[] N = N(byteArrayInputStream, h0, sn4Arr);
                        byteArrayInputStream.close();
                        return N;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, kr7.Y)) {
            int h02 = (int) tf6.h0(fileInputStream, 2);
            byte[] g02 = tf6.g0(fileInputStream, (int) tf6.h0(fileInputStream, 4), (int) tf6.h0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(g02);
                try {
                    sn4[] O = O(byteArrayInputStream2, bArr2, h02, sn4Arr);
                    byteArrayInputStream2.close();
                    return O;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static sn4[] N(ByteArrayInputStream byteArrayInputStream, int i2, sn4[] sn4Arr) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new sn4[0];
        }
        if (i2 == sn4Arr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                iArr[i4] = (int) tf6.h0(byteArrayInputStream, 2);
                strArr[i4] = new String(tf6.f0(byteArrayInputStream, (int) tf6.h0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            while (i3 < i2) {
                sn4 sn4 = sn4Arr[i3];
                if (sn4.b.equals(strArr[i3])) {
                    int i5 = iArr[i3];
                    sn4.e = i5;
                    sn4.h = L(byteArrayInputStream, i5);
                    i3++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return sn4Arr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static sn4[] O(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, sn4[] sn4Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new sn4[0];
        }
        if (i2 == sn4Arr.length) {
            int i3 = 0;
            while (i3 < i2) {
                tf6.h0(byteArrayInputStream, 2);
                String str = new String(tf6.f0(byteArrayInputStream, (int) tf6.h0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long h0 = tf6.h0(byteArrayInputStream, 4);
                int h02 = (int) tf6.h0(byteArrayInputStream, 2);
                sn4 sn4 = null;
                if (sn4Arr.length > 0) {
                    int indexOf = str.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str.indexOf(":");
                    }
                    String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= sn4Arr.length) {
                            break;
                        } else if (sn4Arr[i4].b.equals(substring)) {
                            sn4 = sn4Arr[i4];
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                if (sn4 != null) {
                    sn4.d = h0;
                    int[] L = L(byteArrayInputStream, h02);
                    if (Arrays.equals(bArr, kr7.z)) {
                        sn4.e = h02;
                        sn4.h = L;
                    }
                    i3++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str));
                }
            }
            return sn4Arr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static sn4[] P(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, kr7.w)) {
            int h0 = (int) tf6.h0(fileInputStream, 1);
            byte[] g0 = tf6.g0(fileInputStream, (int) tf6.h0(fileInputStream, 4), (int) tf6.h0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(g0);
                try {
                    sn4[] Q = Q(byteArrayInputStream, str, h0);
                    byteArrayInputStream.close();
                    return Q;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static sn4[] Q(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i3 = i2;
        if (byteArrayInputStream.available() == 0) {
            return new sn4[0];
        }
        sn4[] sn4Arr = new sn4[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int h0 = (int) tf6.h0(byteArrayInputStream2, 2);
            String str2 = str;
            sn4Arr[i4] = new sn4(str2, new String(tf6.f0(byteArrayInputStream2, (int) tf6.h0(byteArrayInputStream2, 2)), StandardCharsets.UTF_8), tf6.h0(byteArrayInputStream2, 4), h0, (int) tf6.h0(byteArrayInputStream2, 4), (int) tf6.h0(byteArrayInputStream2, 4), new int[h0], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i3) {
            sn4 sn4 = sn4Arr[i5];
            int available = byteArrayInputStream.available() - sn4.f;
            int i6 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = sn4.i;
                if (available2 <= available) {
                    break;
                }
                i6 += (int) tf6.h0(byteArrayInputStream2, 2);
                treeMap.put(Integer.valueOf(i6), 1);
                for (int h02 = (int) tf6.h0(byteArrayInputStream2, 2); h02 > 0; h02--) {
                    tf6.h0(byteArrayInputStream2, 2);
                    int h03 = (int) tf6.h0(byteArrayInputStream2, 1);
                    if (!(h03 == 6 || h03 == 7)) {
                        while (h03 > 0) {
                            tf6.h0(byteArrayInputStream2, 1);
                            for (int h04 = (int) tf6.h0(byteArrayInputStream2, 1); h04 > 0; h04--) {
                                tf6.h0(byteArrayInputStream2, 2);
                            }
                            h03--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                sn4.h = L(byteArrayInputStream2, sn4.e);
                int i7 = sn4.g;
                BitSet valueOf = BitSet.valueOf(tf6.f0(byteArrayInputStream2, (((i7 * 2) + 7) & -8) / 8));
                for (int i8 = 0; i8 < i7; i8++) {
                    int i9 = valueOf.get(i8) ? 2 : 0;
                    if (valueOf.get(i8 + i7)) {
                        i9 |= 4;
                    }
                    if (i9 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i8));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i8), Integer.valueOf(i9 | num.intValue()));
                    }
                }
                i5++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return sn4Arr;
    }

    public static String R(StringBuilder sb, int i2, int i3) {
        int i4;
        int i5;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i6 = i2;
        int i7 = i6;
        while (i6 <= i3) {
            if (i6 == i3) {
                i4 = i6;
            } else if (sb.charAt(i6) == '/') {
                i4 = i6 + 1;
            } else {
                i6++;
            }
            int i8 = i7 + 1;
            if (i6 == i8 && sb.charAt(i7) == '.') {
                sb.delete(i7, i4);
                i3 -= i4 - i7;
            } else {
                if (i6 == i7 + 2 && sb.charAt(i7) == '.' && sb.charAt(i8) == '.') {
                    i5 = sb.lastIndexOf("/", i7 - 2) + 1;
                    int i9 = i5 > i2 ? i5 : i2;
                    sb.delete(i9, i4);
                    i3 -= i4 - i9;
                } else {
                    i5 = i6 + 1;
                }
                i7 = i5;
            }
            i6 = i7;
        }
        return sb.toString();
    }

    public static void S(k44 k44) {
        k44.k = -3.4028235E38f;
        k44.j = IntCompanionObject.MIN_VALUE;
        CharSequence charSequence = k44.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                k44.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = k44.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static String T(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] w = w(str2);
        if (w[0] != -1) {
            sb.append(str2);
            R(sb, w[1], w[2]);
            return sb.toString();
        }
        int[] w2 = w(str);
        if (w[3] == 0) {
            sb.append(str, 0, w2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (w[2] == 0) {
            sb.append(str, 0, w2[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i2 = w[1];
            if (i2 != 0) {
                int i3 = w2[0] + 1;
                sb.append(str, 0, i3);
                sb.append(str2);
                return R(sb, w[1] + i3, i3 + w[2]);
            } else if (str2.charAt(i2) == '/') {
                sb.append(str, 0, w2[1]);
                sb.append(str2);
                int i4 = w2[1];
                return R(sb, i4, w[2] + i4);
            } else {
                int i5 = w2[0] + 2;
                int i6 = w2[1];
                if (i5 >= i6 || i6 != w2[2]) {
                    int lastIndexOf = str.lastIndexOf(47, w2[2] - 1);
                    int i7 = lastIndexOf == -1 ? w2[1] : lastIndexOf + 1;
                    sb.append(str, 0, i7);
                    sb.append(str2);
                    return R(sb, w2[1], i7 + w[2]);
                }
                sb.append(str, 0, i6);
                sb.append('/');
                sb.append(str2);
                int i8 = w2[1];
                return R(sb, i8, w[2] + i8 + 1);
            }
        }
    }

    public static float U(float f2, int i2, int i3, int i4) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i2 == 0) {
            f3 = (float) i4;
        } else if (i2 == 1) {
            f3 = (float) i3;
        } else if (i2 != 2) {
            return -3.4028235E38f;
        } else {
            return f2;
        }
        return f2 * f3;
    }

    public static Uri V(String str, String str2) {
        return Uri.parse(T(str, str2));
    }

    public static srd W(sz szVar, Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return null;
        }
        szVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            pz pzVar = (pz) szVar.a.get(it.next());
            if (pzVar != null) {
                arrayList.add(pzVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return new srd(szVar.c, arrayList, stringArrayList);
        }
        return null;
    }

    public static long X(long j2, long j3) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (numberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        long j4 = ((j2 ^ j3) >>> 63) + LongCompanionObject.MAX_VALUE;
        boolean z = false;
        boolean z2 = numberOfLeadingZeros < 64;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        boolean z3 = i2 < 0;
        if (j3 == Long.MIN_VALUE) {
            z = true;
        }
        if (z2 || (z & z3)) {
            return j4;
        }
        long j5 = j2 * j3;
        return (i2 == 0 || j5 / j2 == j3) ? j5 : j4;
    }

    public static final void Y(b2g b2g, String str, int i2) {
        VectorPath findPath = b2g.findPath(str);
        if (findPath != null) {
            findPath.setFillColor(i2);
            b2g.invalidatePath();
        }
    }

    public static void Z(Context context, String str) {
        b0(1, context, str);
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void a0(int i2, Context context) {
        b0(0, context, context.getString(i2));
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static void b0(int i2, Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Toast.makeText(context, str, i2).show();
                return;
            }
            if (j == null) {
                j = new Handler(Looper.getMainLooper());
            }
            j.post(new kh1((Object) context, (Object) str, i2, 16));
        }
    }

    public static ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) (((bArr[11] & UByte.MAX_VALUE) << 8) | (bArr[10] & UByte.MAX_VALUE))) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000).array());
        return arrayList;
    }

    public static void c0(XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static String d0(int i2) {
        return a81.j(i2, "ProfileItemId(value=", ")");
    }

    public static void e0(it0 it0, byte[] bArr) {
        long j2;
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = it0.v;
            int i3 = it0.w;
            int i4 = it0.x;
            if (bArr2 != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
            j2 = it0.o;
            if (j2 == it0.a.b) {
                throw new IllegalStateException("no more bytes".toString());
            }
        } while (it0.b(j2 == -1 ? 0 : j2 + ((long) (it0.x - it0.w))) != -1);
    }

    public static boolean f0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, sn4[] sn4Arr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j2;
        ArrayList arrayList;
        int length;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        sn4[] sn4Arr2 = sn4Arr;
        byte[] bArr3 = kr7.v;
        int i2 = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                tf6.A0(sn4Arr2.length, byteArrayOutputStream5);
                int i3 = 2;
                int i4 = 2;
                for (sn4 sn4 : sn4Arr2) {
                    tf6.z0(byteArrayOutputStream5, sn4.c, 4);
                    tf6.z0(byteArrayOutputStream5, sn4.d, 4);
                    tf6.z0(byteArrayOutputStream5, (long) sn4.g, 4);
                    String s = s(sn4.a, sn4.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = s.getBytes(charset).length;
                    tf6.A0(length2, byteArrayOutputStream5);
                    i4 = i4 + 14 + length2;
                    byteArrayOutputStream5.write(s.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i4 == byteArray.length) {
                    vqg vqg = new vqg(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(vqg);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < sn4Arr2.length) {
                        try {
                            sn4 sn42 = sn4Arr2[i5];
                            tf6.A0(i5, byteArrayOutputStream6);
                            tf6.A0(sn42.e, byteArrayOutputStream6);
                            i6 = i6 + 4 + (sn42.e * 2);
                            int[] iArr = sn42.h;
                            int length3 = iArr.length;
                            int i7 = i2;
                            while (i2 < length3) {
                                int i8 = iArr[i2];
                                tf6.A0(i8 - i7, byteArrayOutputStream6);
                                i2++;
                                i7 = i8;
                            }
                            i5++;
                            i2 = 0;
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i6 == byteArray2.length) {
                        vqg vqg2 = new vqg(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(vqg2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < sn4Arr2.length) {
                            try {
                                sn4 sn43 = sn4Arr2[i9];
                                int i11 = 0;
                                for (Map.Entry value : sn43.i.entrySet()) {
                                    i11 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                h0(byteArrayOutputStream2, sn43);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                i0(byteArrayOutputStream3, sn43);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                tf6.A0(i9, byteArrayOutputStream7);
                                int length4 = byteArray3.length + i3 + byteArray4.length;
                                int i12 = i10 + 6;
                                ArrayList arrayList4 = arrayList3;
                                tf6.z0(byteArrayOutputStream7, (long) length4, 4);
                                tf6.A0(i11, byteArrayOutputStream7);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i10 = i12 + length4;
                                i9++;
                                arrayList3 = arrayList4;
                                i3 = 2;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i10 == byteArray5.length) {
                            vqg vqg3 = new vqg(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(vqg3);
                            long j3 = (long) 4;
                            long size = j3 + j3 + 4 + ((long) (arrayList2.size() * 16));
                            tf6.z0(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i13 = 0;
                            while (i13 < arrayList2.size()) {
                                vqg vqg4 = (vqg) arrayList2.get(i13);
                                int i14 = vqg4.a;
                                if (i14 == 1) {
                                    j2 = 0;
                                } else if (i14 == 2) {
                                    j2 = 1;
                                } else if (i14 == 3) {
                                    j2 = 2;
                                } else if (i14 == 4) {
                                    j2 = 3;
                                } else if (i14 == 5) {
                                    j2 = 4;
                                } else {
                                    throw null;
                                }
                                tf6.z0(byteArrayOutputStream4, j2, 4);
                                tf6.z0(byteArrayOutputStream4, size, 4);
                                boolean z = vqg4.c;
                                byte[] bArr4 = vqg4.b;
                                if (z) {
                                    byte[] h2 = tf6.h(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(h2);
                                    tf6.z0(byteArrayOutputStream4, (long) h2.length, 4);
                                    tf6.z0(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    length = h2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    tf6.z0(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    tf6.z0(byteArrayOutputStream4, 0, 4);
                                    length = bArr4.length;
                                }
                                size += (long) length;
                                i13++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i15));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th8) {
                th.addSuppressed(th8);
            }
        } else {
            byte[] bArr5 = kr7.w;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] h3 = h(sn4Arr2, bArr5);
                tf6.z0(byteArrayOutputStream4, (long) sn4Arr2.length, 1);
                tf6.z0(byteArrayOutputStream4, (long) h3.length, 4);
                byte[] h4 = tf6.h(h3);
                tf6.z0(byteArrayOutputStream4, (long) h4.length, 4);
                byteArrayOutputStream4.write(h4);
                return true;
            }
            byte[] bArr6 = kr7.y;
            if (Arrays.equals(bArr2, bArr6)) {
                tf6.z0(byteArrayOutputStream4, (long) sn4Arr2.length, 1);
                for (sn4 sn44 : sn4Arr2) {
                    String s2 = s(sn44.a, sn44.b, bArr6);
                    Charset charset2 = StandardCharsets.UTF_8;
                    tf6.A0(s2.getBytes(charset2).length, byteArrayOutputStream4);
                    tf6.A0(sn44.h.length, byteArrayOutputStream4);
                    tf6.z0(byteArrayOutputStream4, (long) (sn44.i.size() * 4), 4);
                    tf6.z0(byteArrayOutputStream4, sn44.c, 4);
                    byteArrayOutputStream4.write(s2.getBytes(charset2));
                    for (Integer intValue : sn44.i.keySet()) {
                        tf6.A0(intValue.intValue(), byteArrayOutputStream4);
                        tf6.A0(0, byteArrayOutputStream4);
                    }
                    for (int A0 : sn44.h) {
                        tf6.A0(A0, byteArrayOutputStream4);
                    }
                }
                return true;
            }
            byte[] bArr7 = kr7.x;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] h5 = h(sn4Arr2, bArr7);
                tf6.z0(byteArrayOutputStream4, (long) sn4Arr2.length, 1);
                tf6.z0(byteArrayOutputStream4, (long) h5.length, 4);
                byte[] h6 = tf6.h(h5);
                tf6.z0(byteArrayOutputStream4, (long) h6.length, 4);
                byteArrayOutputStream4.write(h6);
                return true;
            }
            byte[] bArr8 = kr7.z;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            tf6.A0(sn4Arr2.length, byteArrayOutputStream4);
            for (sn4 sn45 : sn4Arr2) {
                String s3 = s(sn45.a, sn45.b, bArr8);
                Charset charset3 = StandardCharsets.UTF_8;
                tf6.A0(s3.getBytes(charset3).length, byteArrayOutputStream4);
                TreeMap treeMap = sn45.i;
                tf6.A0(treeMap.size(), byteArrayOutputStream4);
                tf6.A0(sn45.h.length, byteArrayOutputStream4);
                tf6.z0(byteArrayOutputStream4, sn45.c, 4);
                byteArrayOutputStream4.write(s3.getBytes(charset3));
                for (Integer intValue2 : treeMap.keySet()) {
                    tf6.A0(intValue2.intValue(), byteArrayOutputStream4);
                }
                for (int A02 : sn45.h) {
                    tf6.A0(A02, byteArrayOutputStream4);
                }
            }
            return true;
        }
        throw th2;
        throw th;
        throw th4;
        throw th5;
        throw th3;
    }

    public static long g(long j2, long j3) {
        long j4 = j2 + j3;
        boolean z = false;
        boolean z2 = (j2 ^ j3) < 0;
        if ((j2 ^ j4) >= 0) {
            z = true;
        }
        if (z2 || z) {
            return j4;
        }
        throw new ArithmeticException(wj6.m(tr1.n(j2, "overflow: checkedAdd(", ", "), j3, ")"));
    }

    public static void g0(ByteArrayOutputStream byteArrayOutputStream, sn4 sn4, String str) {
        Charset charset = StandardCharsets.UTF_8;
        tf6.A0(str.getBytes(charset).length, byteArrayOutputStream);
        tf6.A0(sn4.e, byteArrayOutputStream);
        tf6.z0(byteArrayOutputStream, (long) sn4.f, 4);
        tf6.z0(byteArrayOutputStream, sn4.c, 4);
        tf6.z0(byteArrayOutputStream, (long) sn4.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static byte[] h(sn4[] sn4Arr, byte[] bArr) {
        int i2 = 0;
        for (sn4 sn4 : sn4Arr) {
            i2 += ((((sn4.g * 2) + 7) & -8) / 8) + (sn4.e * 2) + s(sn4.a, sn4.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + sn4.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, kr7.x)) {
            for (sn4 sn42 : sn4Arr) {
                g0(byteArrayOutputStream, sn42, s(sn42.a, sn42.b, bArr));
                i0(byteArrayOutputStream, sn42);
                int[] iArr = sn42.h;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    tf6.A0(i5 - i4, byteArrayOutputStream);
                    i3++;
                    i4 = i5;
                }
                h0(byteArrayOutputStream, sn42);
            }
        } else {
            for (sn4 sn43 : sn4Arr) {
                g0(byteArrayOutputStream, sn43, s(sn43.a, sn43.b, bArr));
            }
            for (sn4 sn44 : sn4Arr) {
                i0(byteArrayOutputStream, sn44);
                int[] iArr2 = sn44.h;
                int length2 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr2[i6];
                    tf6.A0(i8 - i7, byteArrayOutputStream);
                    i6++;
                    i7 = i8;
                }
                h0(byteArrayOutputStream, sn44);
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static void h0(ByteArrayOutputStream byteArrayOutputStream, sn4 sn4) {
        byte[] bArr = new byte[((((sn4.g * 2) + 7) & -8) / 8)];
        for (Map.Entry entry : sn4.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + sn4.g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static hdd i(Bundle bundle, Bundle bundle2) {
        if (bundle != null) {
            bundle.setClassLoader(hdd.class.getClassLoader());
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                linkedHashMap.put((String) parcelableArrayList.get(i2), parcelableArrayList2.get(i2));
            }
            return new hdd(linkedHashMap);
        } else if (bundle2 == null) {
            return new hdd();
        } else {
            HashMap hashMap = new HashMap();
            for (String next : bundle2.keySet()) {
                hashMap.put(next, bundle2.get(next));
            }
            return new hdd(hashMap);
        }
    }

    public static void i0(ByteArrayOutputStream byteArrayOutputStream, sn4 sn4) {
        int i2 = 0;
        for (Map.Entry entry : sn4.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                tf6.A0(intValue - i2, byteArrayOutputStream);
                tf6.A0(0, byteArrayOutputStream);
                i2 = intValue;
            }
        }
    }

    public static yag j(Class cls) {
        try {
            return (yag) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    public static float j0() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static long k(long j2, long j3, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j4 = j2 / j3;
        long j5 = j2 - (j3 * j4);
        int i2 = (j5 > 0 ? 1 : (j5 == 0 ? 0 : -1));
        if (i2 == 0) {
            return j4;
        }
        int i3 = ((int) ((j2 ^ j3) >> 63)) | 1;
        switch (sa8.a[roundingMode.ordinal()]) {
            case 1:
                if (i2 == 0) {
                    return j4;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j4;
            case 3:
                if (i3 >= 0) {
                    return j4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i3 <= 0) {
                    return j4;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j5);
                int i4 = ((abs - (Math.abs(j3) - abs)) > 0 ? 1 : ((abs - (Math.abs(j3) - abs)) == 0 ? 0 : -1));
                if (i4 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j4) == 0)) {
                        return j4;
                    }
                } else if (i4 <= 0) {
                    return j4;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j4 + ((long) i3);
    }

    public static int k0(int i2) {
        if (i2 == 90) {
            return 91;
        }
        if (i2 == 91) {
            return 92;
        }
        if (i2 == 93) {
            return 94;
        }
        if (i2 == 94) {
            return 95;
        }
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return 15;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return 16;
            case 16:
                return 17;
            case LangUtils.HASH_SEED /*17*/:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case LangUtils.HASH_OFFSET /*37*/:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case SavedMessagesIconDrawable.SMALL_SIZE /*40*/:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case kotlin.io.encoding.Base64.mimeLineLength /*76*/:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i2) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case 100:
                        return HttpStatus.SC_SWITCHING_PROTOCOLS;
                    case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                        return HttpStatus.SC_PROCESSING;
                    case HttpStatus.SC_PROCESSING /*102*/:
                        return 103;
                    case 103:
                        return 104;
                    default:
                        return 0;
                }
        }
    }

    public static final boolean l(int i2, int i3) {
        return i2 == i3;
    }

    public static String m(String str) {
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        for (String next : queryParameterNames) {
            if (next.equals(ApiProtocol.KEY_TOKEN)) {
                clearQuery.appendQueryParameter(next, "<HIDDEN>");
            } else {
                clearQuery.appendQueryParameter(next, parse.getQueryParameter(next));
            }
        }
        return clearQuery.build().toString();
    }

    public static String n(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(ApiProtocol.PARAM_JOIN_LINK)) {
                jSONObject.put(ApiProtocol.PARAM_JOIN_LINK, (Object) "<HIDDEN>");
            }
            if (jSONObject.has("conversation")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("conversation");
                if (jSONObject2.has(ApiProtocol.PARAM_JOIN_LINK)) {
                    jSONObject2.put(ApiProtocol.PARAM_JOIN_LINK, (Object) "<HIDDEN>");
                }
            }
            if (jSONObject.has(ApiProtocol.KEY_ENDPOINT)) {
                jSONObject.put(ApiProtocol.KEY_ENDPOINT, (Object) m(jSONObject.getString(ApiProtocol.KEY_ENDPOINT)));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    public static long o(long j2, m72 m72) {
        Comparable comparable;
        Long a2;
        long j3 = m72.g0;
        pt4 pt4 = m72.f0;
        if (pt4 == null) {
            j3 = 0;
        } else if (j3 == 0 && (pt4.a() == null || ((a2 = pt4.a()) != null && a2.longValue() == 0))) {
            j3 = m72.h0;
        }
        long j4 = 0L;
        Comparable[] comparableArr = {Long.valueOf(m72.P), Long.valueOf(j2), Long.valueOf(j3)};
        if (comparableArr.length == 0) {
            comparable = null;
        } else {
            Comparable comparable2 = comparableArr[0];
            int lastIndex = ArraysKt.getLastIndex((T[]) comparableArr);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Comparable comparable3 = comparableArr[i2];
                    if (comparable2.compareTo(comparable3) < 0) {
                        comparable2 = comparable3;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
            comparable = comparable2;
        }
        if (comparable != null) {
            j4 = comparable;
        }
        long longValue = ((Number) j4).longValue();
        return longValue == 0 ? m72.k : longValue;
    }

    public static long r(long j2, long j3) {
        j4b.i(j2, "a");
        j4b.i(j3, "b");
        if (j2 == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j2;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j5 = j3 >> numberOfTrailingZeros2;
        while (j4 != j5) {
            long j6 = j4 - j5;
            long j7 = (j6 >> 63) & j6;
            long j8 = (j6 - j7) - j7;
            j5 += j7;
            j4 = j8 >> Long.numberOfTrailingZeros(j8);
        }
        return j4 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static String s(String str, String str2, byte[] bArr) {
        byte[] bArr2 = kr7.z;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = kr7.y;
        String str3 = "!";
        String str4 = (!equals && !Arrays.equals(bArr, bArr3)) ? str3 : ":";
        if (str.length() <= 0) {
            return str3.equals(str4) ? str2.replace(":", str3) : ":".equals(str4) ? str2.replace(str3, ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains(str3) || str2.contains(":")) {
            return str3.equals(str4) ? str2.replace(":", str3) : ":".equals(str4) ? str2.replace(str3, ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder o = tr1.o(str);
        if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
            str3 = ":";
        }
        return wj6.n(o, str3, str2);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [k96[], java.io.Serializable] */
    public static ni0 t(Context context, soc soc) {
        Cursor cursor;
        soc soc2 = soc;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) soc2.c;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = (String) soc2.o;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                oj4 oj4 = g;
                Collections.sort(arrayList, oj4);
                List list = (List) soc2.b;
                if (list == null) {
                    list = K(resources, 0);
                }
                int i2 = 0;
                loop1:
                while (true) {
                    cursor = null;
                    if (i2 >= list.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i2));
                    Collections.sort(arrayList2, oj4);
                    if (arrayList.size() == arrayList2.size()) {
                        int i3 = 0;
                        while (i3 < arrayList.size()) {
                            if (Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                                i3++;
                            }
                        }
                        break loop1;
                    }
                    i2++;
                }
                if (resolveContentProvider == null) {
                    return new ni0(1, (Serializable) null, 7);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                try {
                    String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                    String[] strArr2 = {(String) soc2.v};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, (String) null, (CancellationSignal) null);
                        } catch (RemoteException unused) {
                        }
                    }
                    if (cursor != null) {
                        if (cursor.getCount() > 0) {
                            int columnIndex = cursor.getColumnIndex("result_code");
                            arrayList3 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex("file_id");
                            int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursor.getColumnIndex("font_weight");
                            int columnIndex6 = cursor.getColumnIndex("font_italic");
                            while (cursor.moveToNext()) {
                                arrayList3.add(new k96(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : HttpStatus.SC_BAD_REQUEST, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                            }
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return new ni0(0, (Serializable) (k96[]) arrayList3.toArray(new k96[0]), 7);
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    throw th;
                }
            } else {
                throw new PackageManager.NameNotFoundException(g63.j("Found content provider ", str, ", but package was not ", str3));
            }
        } else {
            throw new PackageManager.NameNotFoundException(a81.m("No package found for authority: ", str));
        }
    }

    public static long u(byte b2, byte b3) {
        byte b4;
        byte b5 = b2 & UByte.MAX_VALUE;
        byte b6 = b2 & 3;
        if (b6 != 0) {
            b4 = 2;
            if (!(b6 == 1 || b6 == 2)) {
                b4 = b3 & 63;
            }
        } else {
            b4 = 1;
        }
        int i2 = b5 >> 3;
        int i3 = i2 & 3;
        return ((long) b4) * ((long) (i2 >= 16 ? 2500 << i3 : i2 >= 12 ? 10000 << (i2 & 1) : i3 == 3 ? 60000 : 10000 << i3));
    }

    public static final int v(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int[] w(String str) {
        int i2;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i3 = indexOf4 + 2;
        if (i3 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i3) == '/') {
            i2 = str.indexOf(47, indexOf4 + 3);
            if (i2 == -1 || i2 > indexOf2) {
                i2 = indexOf2;
            }
        } else {
            i2 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i2;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static int x(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return w53.b((double) (f6 * fArr[0]), (double) (f4 * fArr[1]), (double) (f5 * fArr[2]));
    }

    public static pq4 y(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return ff4.a.U(j2, runnable, coroutineContext);
    }

    public static float z(int i2) {
        float f2 = ((float) i2) / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    public abstract void H(l1 l1Var, l1 l1Var2);

    public abstract void I(l1 l1Var, Thread thread);

    public abstract boolean d(n1 n1Var, y0 y0Var, y0 y0Var2);

    public abstract boolean e(n1 n1Var, Object obj, Object obj2);

    public abstract boolean f(n1 n1Var, l1 l1Var, l1 l1Var2);

    public abstract y0 p(n1 n1Var);

    public abstract l1 q(n1 n1Var);
}
