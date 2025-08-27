package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.PlatformRandomKt;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: v02  reason: default package */
public class v02 implements m30, zi6, qk3, yef, wv9, ola, s28, ki {
    public static final v02 a = new Object();
    public static final v02 b = new Object();
    public static final v02 c = new Object();
    public static final v02 o = new Object();
    public static final v02 v = new Object();
    public static final v02 w = new Object();

    public static final boolean d(int i) {
        int i2 = ozf.b;
        char c2 = (char) i;
        return ('a' <= c2 && c2 < '{') || ('A' <= c2 && c2 < '[') || (('0' <= c2 && c2 < ':') || c2 == '-' || c2 == '_' || c2 == '.' || c2 == '~');
    }

    public static RectF e(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.Q0 || !(view instanceof q8f)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        q8f q8f = (q8f) view;
        int contentWidth = q8f.getContentWidth();
        int contentHeight = q8f.getContentHeight();
        int j = (int) ct.j(24, q8f.getContext());
        if (contentWidth < j) {
            contentWidth = j;
        }
        int right = (q8f.getRight() + q8f.getLeft()) / 2;
        int bottom = (q8f.getBottom() + q8f.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF((float) (right - i), (float) (bottom - (contentHeight / 2)), (float) (i + right), (float) ((right / 2) + bottom));
    }

    public static ao0 f() {
        try {
            j5h j5h = cvg.h;
            vzg.n(j5h, "IBitmapDescriptorFactory is not initialized");
            u4h u4h = (u4h) j5h;
            Parcel R = u4h.R(u4h.H0(), 4);
            p67 L0 = hha.L0(R.readStrongBinder());
            R.recycle();
            return new ao0(new y35(L0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static ao0 g(Bitmap bitmap) {
        vzg.n(bitmap, "image must not be null");
        try {
            j5h j5h = cvg.h;
            vzg.n(j5h, "IBitmapDescriptorFactory is not initialized");
            u4h u4h = (u4h) j5h;
            Parcel H0 = u4h.H0();
            hzg.b(H0, bitmap);
            Parcel R = u4h.R(H0, 6);
            p67 L0 = hha.L0(R.readStrongBinder());
            R.recycle();
            return new ao0(new y35(L0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static int h(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case Protos.Attaches.Attach.LOCATION:
                return 3062500;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return 8000;
            case 16:
                return 256000;
            case LangUtils.HASH_SEED:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static List j(List list, Collection collection) {
        boolean isEmpty = list.isEmpty();
        cx4 cx4 = cx4.b;
        if (isEmpty) {
            return CollectionsKt.sortedWith(collection, cx4);
        }
        if (collection.isEmpty()) {
            return list;
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.addAll(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ix4 ix4 = (ix4) it.next();
            int g = CollectionsKt__CollectionsKt.binarySearch$default(createListBuilder, ix4, cx4.b, 0, 0, 12, (Object) null);
            if (g >= 0) {
                ix4 ix42 = (ix4) createListBuilder.get(g);
                createListBuilder.set(g, new ix4(ix42.a, ix42.b, ix42.c + ix4.c));
            } else {
                createListBuilder.add((-g) - 1, ix4);
            }
        }
        if (createListBuilder.size() > 15) {
            Random asJavaRandom = PlatformRandomKt.asJavaRandom(kotlin.random.Random.Default);
            int i = 0;
            while (createListBuilder.size() > 14) {
                i += ((ix4) createListBuilder.remove(asJavaRandom.nextInt(createListBuilder.size()))).c;
            }
            ix4 ix43 = new ix4("unknown", "max_size_exceeded", i);
            int g2 = CollectionsKt__CollectionsKt.binarySearch$default(createListBuilder, ix43, cx4.b, 0, 0, 12, (Object) null);
            if (g2 >= 0) {
                ix4 ix44 = (ix4) createListBuilder.get(g2);
                createListBuilder.set(g2, new ix4(ix44.a, ix44.b, ix44.c + i));
            } else {
                createListBuilder.add((-g2) - 1, ix43);
            }
        }
        return CollectionsKt.build(createListBuilder);
    }

    public static q51 k(JSONObject jSONObject) {
        String optString;
        ue1 b2;
        String optString2 = jSONObject.optString("key");
        int i = 0;
        jSONObject.optInt("totalCount", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            return new q51(optString2, CollectionsKt.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        if (length >= 0) {
            while (true) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (optString = optJSONObject.optString("participantId")) == null || (b2 = ue1.b(optString)) == null)) {
                    arrayList.add(b2);
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new q51(optString2, arrayList);
    }

    public static q72 l(String str) {
        for (q72 q72 : q72.v) {
            if (Intrinsics.areEqual((Object) q72.a, (Object) str)) {
                return q72;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public void a() {
    }

    public void accept(Object obj) {
        z68.f(pga.c, "onLogout: failed", (Throwable) obj);
    }

    public Object apply(Object obj) {
        return ((OneMeRoomDatabase) obj).F();
    }

    public int c(CharSequence charSequence, int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            char c2 = 2;
            if (i2 >= i) {
                return z ? 1 : 2;
            }
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            zef zef = bff.a;
            if (directionality == 0) {
                c2 = 1;
            } else if (directionality == 1 || directionality == 2) {
                c2 = 0;
            }
            if (c2 == 0) {
                return 0;
            }
            if (c2 == 1) {
                z = true;
            }
            i2++;
        }
    }

    public void load() {
        synchronized (h88.e) {
            Object obj = h88.f;
            synchronized (obj) {
                if (!h88.g) {
                    long b2 = h88.b();
                    synchronized (obj) {
                        h88.h = b2;
                        h88.g = true;
                    }
                }
            }
        }
    }

    public Object m(pf9 pf9) {
        long j = 0;
        try {
            j = ryg.d0(pf9, 0);
        } catch (Throwable th) {
            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            for (xm a2 : ytd.a) {
                a2.a(th);
            }
            xtd.a.getClass();
            int ordinal = xtd.b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(j);
    }

    public void n(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF e = e(tabLayout, view);
        RectF e2 = e(tabLayout, view2);
        drawable.setBounds(xg.c((int) e.left, f, (int) e2.left), drawable.getBounds().top, xg.c((int) e.right, f, (int) e2.right), drawable.getBounds().bottom);
    }
}
