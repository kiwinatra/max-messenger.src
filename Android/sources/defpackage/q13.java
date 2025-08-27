package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.messages.stickers.FrgGifsLoader;
import ru.ok.messages.stickers.FrgStickerPreview;
import ru.ok.messages.stickers.FrgStickersLoader;
import ru.ok.messages.views.ProfileFragment;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: q13  reason: default package */
public final class q13 implements ma5, Provider, vye {
    public static final cx4 x = new cx4(16);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;
    public Object v;
    public Object w;

    public /* synthetic */ q13() {
        this.a = 2;
    }

    public static void j(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    public static int l(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public ExecutorService a() {
        switch (this.a) {
            case 3:
                return (ExecutorService) this.c;
            default:
                return (ExecutorService) ((Lazy) this.w).getValue();
        }
    }

    public ExecutorService b() {
        switch (this.a) {
            case 3:
                return (ExecutorService) this.v;
            default:
                return ((aua) ((Lazy) this.o).getValue()).c();
        }
    }

    public ExecutorService c() {
        switch (this.a) {
            case 3:
                return (ExecutorService) this.o;
            default:
                return (ExecutorService) ((Lazy) this.b).getValue();
        }
    }

    public int d(long j) {
        long[] jArr = (long[]) this.c;
        int b2 = v0g.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public ExecutorService e() {
        switch (this.a) {
            case 3:
                return (ExecutorService) this.b;
            default:
                return (ExecutorService) ((Lazy) this.v).getValue();
        }
    }

    public ExecutorService f() {
        switch (this.a) {
            case 3:
                return (ExecutorService) this.b;
            default:
                return (ExecutorService) ((Lazy) this.v).getValue();
        }
    }

    public ExecutorService g() {
        switch (this.a) {
            case 3:
                return (ExecutorService) this.b;
            default:
                return (ExecutorService) ((Lazy) this.v).getValue();
        }
    }

    public Object get() {
        return new nbd((lzf) ((Provider) this.b).get(), (lzf) ((Provider) this.c).get(), (va0) ((Provider) this.o).get(), (agd) ((Provider) this.v).get(), (Provider) this.w);
    }

    public hc0 h() {
        String str = ((Size) this.b) == null ? " resolution" : "";
        if (((vy4) this.c) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Range) this.o) == null) {
            str = tr1.j(str, " expectedFrameRateRange");
        }
        if (((Boolean) this.w) == null) {
            str = tr1.j(str, " zslDisabled");
        }
        if (str.isEmpty()) {
            return new hc0((Size) this.b, (vy4) this.c, (Range) this.o, (je3) this.v, ((Boolean) this.w).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void i() {
        FrgStickerPreview frgStickerPreview = (FrgStickerPreview) this.v;
        if (frgStickerPreview != null && ((m5) this.c).Z) {
            c cVar = (c) this.b;
            cVar.getClass();
            xe0 xe0 = new xe0(cVar);
            xe0.j(frgStickerPreview);
            xe0.e(false);
            this.v = null;
        }
    }

    public long k(int i) {
        return ((long[]) this.c)[i];
    }

    public void m(m7f m7f, cl4 cl4) {
        String str;
        String str2 = (String) m7f.b;
        boolean z = cvg.c(str2, "ru.ok.tamtam.GIF_SECTION") || ((boe) m7f.a).Y;
        if (cl4 == null) {
            d6a d6a = (d6a) this.o;
            ype ype = (ype) m7f.c;
            if (z) {
                d6a.getClass();
                String q = d6a.q(ype);
                boolean isEmpty = TextUtils.isEmpty(q);
                nd ndVar = (nd) d6a.b;
                if (isEmpty) {
                    ndVar.e("GIF_SENT");
                } else {
                    ndVar.f("GIF_SENT", q);
                }
            } else if (ype == ype.SEARCH) {
                d6a.getClass();
                xpe xpe = (xpe) m7f.o;
                int ordinal = xpe.ordinal();
                if (ordinal == 0) {
                    str = "favorite_sticker";
                } else if (ordinal == 1) {
                    str = "my_set_sticker";
                } else if (ordinal == 2) {
                    str = "installed_set_sticker";
                } else if (ordinal == 3) {
                    str = "recent_sticker";
                } else if (ordinal != 4) {
                    Locale locale = Locale.ENGLISH;
                    z68.f("d6a", "Unknown search send source value " + xpe, (Throwable) null);
                    str = null;
                } else {
                    str = "vitrine_sticker";
                }
                boolean isEmpty2 = TextUtils.isEmpty(str);
                nd ndVar2 = (nd) d6a.b;
                if (isEmpty2) {
                    ndVar2.f("STICKER_SENT", "search");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("value", "search");
                    hashMap.put("param1", str);
                    ndVar2.g("STICKER_SENT", hashMap);
                }
            } else {
                d6a.getClass();
                String q2 = d6a.q(ype);
                boolean isEmpty3 = TextUtils.isEmpty(q2);
                nd ndVar3 = (nd) d6a.b;
                if (isEmpty3) {
                    ndVar3.e("STICKER_SENT");
                } else {
                    ndVar3.f("STICKER_SENT", q2);
                }
            }
        }
        FrgBaseProfile frgBaseProfile = ((ProfileFragment) ((lpe) this.w)).l1;
        if (frgBaseProfile != null && frgBaseProfile.q3() && frgBaseProfile.P1 != null) {
            str2.equals("ru.ok.tamtam.GIF_SECTION");
            frgBaseProfile.P1.getClass();
            throw null;
        }
    }

    public boolean n(float[] fArr) {
        w7b[] w7bArr = (w7b[]) this.v;
        if (w7bArr != null && w7bArr.length > 0) {
            int length = w7bArr.length;
            int i = 0;
            while (i < length) {
                w7bArr[i].getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public List p(long j) {
        vtf vtf = (vtf) this.b;
        vtf.getClass();
        ArrayList arrayList = new ArrayList();
        vtf.g(j, vtf.h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        vtf.i(j2, false, vtf.h, treeMap);
        Map map = (Map) this.v;
        vtf.h(j2, (Map) this.o, map, vtf.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((Map) this.w).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                ytf ytf = (ytf) map.get(pair.first);
                ytf.getClass();
                arrayList2.add(new n44((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, decodeByteArray, ytf.c, 0, ytf.e, ytf.b, 0, IntCompanionObject.MIN_VALUE, -3.4028235E38f, ytf.f, ytf.g, false, -16777216, ytf.j, c44.DEFAULT_ASPECT_RATIO));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ytf ytf2 = (ytf) map.get(entry.getKey());
            ytf2.getClass();
            l44 l44 = (l44) entry.getValue();
            CharSequence charSequence = l44.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (xl4 xl4 : (xl4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), xl4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(xl4), spannableStringBuilder.getSpanEnd(xl4), "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == 10) {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == 10) {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            l44.e = ytf2.c;
            l44.f = ytf2.d;
            l44.g = ytf2.e;
            l44.h = ytf2.b;
            l44.l = ytf2.f;
            l44.k = ytf2.i;
            l44.j = ytf2.h;
            l44.p = ytf2.j;
            arrayList2.add(l44.a());
        }
        return arrayList2;
    }

    public int t() {
        return ((long[]) this.c).length;
    }

    public q13(Lazy lazy) {
        this.a = 4;
        this.o = lazy;
        this.v = LazyKt.lazy(new kf6(this, 0));
        this.w = LazyKt.lazy(new kf6(this, 1));
        this.b = LazyKt.lazy(new kf6(this, 2));
        this.c = LazyKt.lazy(new kf6(this, 3));
    }

    public q13(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = 0;
        this.b = context;
        this.c = q13.class.getName();
        this.o = lazy;
        this.v = lazy2;
        this.w = lazy3;
    }

    public q13(int i) {
        this.a = 3;
        this.b = Executors.newFixedThreadPool(2, new j5a("FrescoIoBoundExecutor", 1));
        this.c = Executors.newFixedThreadPool(i, new j5a("FrescoDecodeExecutor", 1));
        this.o = Executors.newFixedThreadPool(i, new j5a("FrescoBackgroundExecutor", 1));
        this.v = Executors.newFixedThreadPool(1, new j5a("FrescoLightWeightBackgroundExecutor", 1));
        this.w = Executors.newScheduledThreadPool(i, new j5a("FrescoBackgroundExecutor", 1));
    }

    public q13(aqg aqg, Provider provider) {
        this.a = 6;
        v9a v9a = gsg.i;
        gga gga = hsg.i;
        nfd nfd = b0h.a;
        this.b = v9a;
        this.c = gga;
        this.o = nfd;
        this.v = aqg;
        this.w = provider;
    }

    public q13(m5 m5Var, c cVar, r62 r62, d6a d6a, lpe lpe) {
        this.a = 7;
        this.c = m5Var;
        this.b = cVar;
        this.o = d6a;
        this.w = lpe;
        if (cVar.E("ru.ok.messages.stickers.FrgStickersLoader") == null) {
            FrgStickersLoader frgStickersLoader = new FrgStickersLoader();
            Bundle bundle = new Bundle();
            bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", -1);
            frgStickersLoader.L2(bundle);
            b59.d(cVar, frgStickersLoader, "ru.ok.messages.stickers.FrgStickersLoader");
        }
        if (cVar.E("ru.ok.messages.stickers.FrgGifsLoader") == null) {
            b59.d(cVar, new FrgGifsLoader(), "ru.ok.messages.stickers.FrgGifsLoader");
        }
    }

    public q13(vtf vtf, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 8;
        this.b = vtf;
        this.v = hashMap2;
        this.w = hashMap3;
        this.o = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        vtf.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public q13(int[] iArr, int i, w7b[] w7bArr) {
        j53 j53;
        int[] iArr2 = iArr;
        int i2 = i;
        this.a = 1;
        int i3 = 0;
        this.w = new float[3];
        this.v = w7bArr;
        int[] iArr3 = new int[32768];
        this.c = iArr3;
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            int i5 = iArr2[i4];
            int l = l(Color.blue(i5), 8, 5) | (l(Color.red(i5), 8, 5) << 10) | (l(Color.green(i5), 8, 5) << 5);
            iArr2[i4] = l;
            iArr3[l] = iArr3[l] + 1;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr3[i7] > 0) {
                int rgb = Color.rgb(l((i7 >> 10) & 31, 5, 8), l((i7 >> 5) & 31, 5, 8), l(i7 & 31, 5, 8));
                float[] fArr = (float[]) this.w;
                ThreadLocal threadLocal = w53.a;
                w53.a(Color.red(rgb), Color.green(rgb), Color.blue(rgb), fArr);
                if (n(fArr)) {
                    iArr3[i7] = 0;
                }
            }
            if (iArr3[i7] > 0) {
                i6++;
            }
        }
        int[] iArr4 = new int[i6];
        this.b = iArr4;
        int i8 = 0;
        for (int i9 = 0; i9 < 32768; i9++) {
            if (iArr3[i9] > 0) {
                iArr4[i8] = i9;
                i8++;
            }
        }
        if (i6 <= i2) {
            this.o = new ArrayList();
            while (i3 < i6) {
                int i10 = iArr4[i3];
                ((ArrayList) this.o).add(new y7b(Color.rgb(l((i10 >> 10) & 31, 5, 8), l((i10 >> 5) & 31, 5, 8), l(i10 & 31, 5, 8)), iArr3[i10]));
                i3++;
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i2, x);
        priorityQueue.offer(new j53(this, 0, ((int[]) this.b).length - 1));
        while (priorityQueue.size() < i2 && (j53 = (j53) priorityQueue.poll()) != null) {
            int i11 = j53.b;
            int i12 = j53.a;
            if ((i11 + 1) - i12 <= 1) {
                break;
            } else if ((i11 + 1) - i12 > 1) {
                int i13 = j53.e - j53.d;
                int i14 = j53.g - j53.f;
                int i15 = j53.i - j53.h;
                int i16 = (i13 < i14 || i13 < i15) ? (i14 < i13 || i14 < i15) ? -1 : -2 : -3;
                q13 q13 = j53.j;
                int[] iArr5 = (int[]) q13.b;
                j(i16, i12, i11, iArr5);
                Arrays.sort(iArr5, i12, j53.b + 1);
                j(i16, i12, j53.b, iArr5);
                int i17 = j53.c / 2;
                int i18 = i3;
                int i19 = i12;
                while (true) {
                    int i20 = j53.b;
                    if (i19 > i20) {
                        break;
                    }
                    i18 += ((int[]) q13.c)[iArr5[i19]];
                    if (i18 >= i17) {
                        i12 = Math.min(i20 - 1, i19);
                        break;
                    }
                    i19++;
                }
                j53 j532 = new j53(q13, i12 + 1, j53.b);
                j53.b = i12;
                j53.a();
                priorityQueue.offer(j532);
                priorityQueue.offer(j53);
                i3 = 0;
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            j53 j533 = (j53) it.next();
            q13 q132 = j533.j;
            int[] iArr6 = (int[]) q132.b;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            for (int i25 = j533.a; i25 <= j533.b; i25++) {
                int i26 = iArr6[i25];
                int i27 = ((int[]) q132.c)[i26];
                i22 += i27;
                i21 = (((i26 >> 10) & 31) * i27) + i21;
                i23 = (((i26 >> 5) & 31) * i27) + i23;
                i24 += i27 * (i26 & 31);
            }
            float f = (float) i22;
            y7b y7b = new y7b(Color.rgb(l(Math.round(((float) i21) / f), 5, 8), l(Math.round(((float) i23) / f), 5, 8), l(Math.round(((float) i24) / f), 5, 8)), i22);
            if (!n(y7b.b())) {
                arrayList.add(y7b);
            }
        }
        this.o = arrayList;
    }

    public q13(q4 q4Var, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = 5;
        this.b = q4Var;
        this.o = lazy;
        this.v = lazy2;
        this.w = lazy3;
        this.c = lazy4;
    }
}
