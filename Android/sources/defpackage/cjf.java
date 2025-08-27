package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.BaseInterpolator;
import com.google.firebase.components.DependencyCycleException;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.time.DurationKt;
import org.webrtc.RTCStats;

/* renamed from: cjf  reason: default package */
public abstract class cjf {
    public static final String[] a = {"standard", "accelerate", "decelerate", "linear"};
    public static final String[] b = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final float[] c = {c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, c44.DEFAULT_ASPECT_RATIO};
    public static final float[] d = {1.0f, 1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO};
    public static final float[] e = {1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f};
    public static final float[] f = {c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f};
    public static final /* synthetic */ int g = 0;

    public static String A(String str, kl0 kl0, jl0 jl0) {
        int ordinal = kl0.ordinal();
        jl0 jl02 = jl0.a;
        String str2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : jl0 == jl02 ? "sqr_720" : "w_1440" : jl0 == jl02 ? "sqr_480" : "w_1080" : jl0 == jl02 ? "sqr_192" : "w_480" : jl0 == jl02 ? "sqr_96" : "w_240" : jl0 == jl02 ? "sqr_64" : "w_180";
        if (cvg.A(str)) {
            return null;
        }
        return g63.i(str, "&fn=", str2);
    }

    public static boolean B(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static long C(String str) {
        if (cvg.A(str)) {
            return 0;
        }
        try {
            return new File(str).lastModified();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Object D(File file) {
        ObjectInputStream objectInputStream;
        Throwable th;
        FileInputStream fileInputStream;
        if (!o(file)) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    Object readObject = objectInputStream.readObject();
                    g(fileInputStream, objectInputStream);
                    return readObject;
                } catch (Throwable th2) {
                    th = th2;
                    g(fileInputStream, objectInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                g(fileInputStream, objectInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            objectInputStream = null;
            g(fileInputStream, objectInputStream);
            throw th;
        }
    }

    public static StaticLayout E(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, zef zef) {
        StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, i, i2, textPaint, i3).setAlignment(alignment).setLineSpacing(c44.DEFAULT_ASPECT_RATIO, 1.0f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i4).setMaxLines(i5).setTextDirection(gsg.j(zef)).setBreakStrategy(0).setHyphenationFrequency(0).setIndents((int[]) null, (int[]) null);
        indents.setJustificationMode(0);
        indents.setUseLineSpacingFromFallbacks(false);
        return indents.build();
    }

    public static ArrayList F(Collection collection, zi6 zi6) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object apply : collection) {
            try {
                arrayList.add(zi6.apply(apply));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static void G(List list, int i, int i2) {
        Object obj = list.get(i);
        list.remove(i);
        list.add(i2, obj);
    }

    public static final int H(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [bvd, hvd] */
    public static bvd I(long j) {
        ? hvd = new hvd(j);
        hvd.l = false;
        hvd.m = s58.x;
        return hvd;
    }

    public static mff J(int i, g1g g1g, String str) {
        int h = g1g.h();
        if (g1g.h() == 1684108385 && h >= 22) {
            g1g.I(10);
            int A = g1g.A();
            if (A > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(A);
                String sb2 = sb.toString();
                int A2 = g1g.A();
                if (A2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(A2);
                    sb2 = sb3.toString();
                }
                return new mff(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(ty.f(i));
        if (valueOf2.length() != 0) {
            "Failed to parse index/count attribute: ".concat(valueOf2);
        }
        return null;
    }

    public static mff K(int i, g1g g1g, String str) {
        int h = g1g.h();
        if (g1g.h() == 1684108385) {
            g1g.I(8);
            return new mff(str, (String) null, g1g.r(h - 16));
        }
        String valueOf = String.valueOf(ty.f(i));
        if (valueOf.length() != 0) {
            "Failed to parse text attribute: ".concat(valueOf);
        }
        return null;
    }

    public static t77 L(int i, String str, g1g g1g, boolean z, boolean z2) {
        int i2;
        g1g.I(4);
        if (g1g.h() == 1684108385) {
            g1g.I(8);
            i2 = g1g.v();
        } else {
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            return z ? new mff(str, (String) null, Integer.toString(i2)) : new i63("und", str, Integer.toString(i2));
        }
        String valueOf = String.valueOf(ty.f(i));
        if (valueOf.length() != 0) {
            "Failed to parse uint8 attribute: ".concat(valueOf);
        }
        return null;
    }

    public static void M(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static void N(List list) {
        if (!list.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(list);
            list.clear();
            list.addAll(linkedHashSet);
        }
    }

    public static final void O(KClass kClass, Object obj, String str, Integer num) {
        try {
            Field declaredField = JvmClassMappingKt.getJavaClass(kClass).getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, num);
        } catch (Throwable unused) {
        }
    }

    public static final void P(Drawable drawable, Drawable.Callback callback, drf drf) {
        if (drawable != null) {
            drawable.setCallback(callback);
            crf crf = drawable instanceof crf ? (crf) drawable : null;
            if (crf != null) {
                crf.l(drf);
            }
        }
    }

    public static ArrayList Q(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() <= 0 || arrayList.size() > 1000) {
            while (arrayList.size() != 0) {
                List subList = arrayList.subList(0, arrayList.size() <= 1000 ? arrayList.size() : 1000);
                ArrayList arrayList3 = new ArrayList(subList.size());
                arrayList3.addAll(subList);
                subList.clear();
                arrayList2.add(arrayList3);
            }
        } else {
            arrayList2.add(arrayList);
        }
        return arrayList2;
    }

    public static boolean R(File file, Object obj) {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                try {
                    objectOutputStream.writeObject(obj);
                    g(fileOutputStream2, objectOutputStream);
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        z68.f("cjf", "Failed to store object to file", e);
                        g(fileOutputStream, objectOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        g(fileOutputStream, objectOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    g(fileOutputStream, objectOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                objectOutputStream = null;
                fileOutputStream = fileOutputStream2;
                z68.f("cjf", "Failed to store object to file", e);
                g(fileOutputStream, objectOutputStream);
                return false;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = null;
                fileOutputStream = fileOutputStream2;
                g(fileOutputStream, objectOutputStream);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            objectOutputStream = null;
            z68.f("cjf", "Failed to store object to file", e);
            g(fileOutputStream, objectOutputStream);
            return false;
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream = null;
            g(fileOutputStream, objectOutputStream);
            throw th;
        }
    }

    public static final void S(fwf fwf) {
        fwf.e(n5g.class, new jcb(1));
        fwf.e(ipb.class, new jcb(2));
        fwf.e(mce.class, new jcb(3));
        fwf.e(lb5.class, new jcb(4));
        fwf.e(bx0.class, new jcb(5));
        fwf.e(i4g.class, new jcb(6));
        fwf.e(cdd.class, new fm8(21));
    }

    public static Object a(RTCStats rTCStats, String str) {
        return rTCStats.getMembers().get(str);
    }

    public static void b(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            new StringBuilder(str.length() + String.valueOf(GLES20.glGetShaderInfoLog(glCreateShader)).length() + 10);
        }
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        f();
    }

    public static final void c(mdf mdf, cef cef, String str) {
        Logger logger = fef.i;
        StringBuilder sb = new StringBuilder();
        sb.append(cef.f);
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        sb.append(String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)));
        sb.append(": ");
        sb.append(mdf.c);
        logger.fine(sb.toString());
    }

    public static boolean d(Iterable iterable, nsb nsb) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Object test : iterable) {
            try {
                if (nsb.test(test)) {
                    return true;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return false;
    }

    public static void f() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            if (valueOf.length() != 0) {
                "glError: ".concat(valueOf);
            }
            i = glGetError;
        }
        if (i != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i));
            if (valueOf2.length() != 0) {
                "glError: ".concat(valueOf2);
            }
        }
    }

    public static void g(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    z68.c("cjf", "Failed to close output stream: " + e2.getMessage(), new Object[0]);
                }
            }
        }
    }

    public static ArrayList h(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static long[] i(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }

    public static long[] j(Set set) {
        if (set == null) {
            return null;
        }
        long[] jArr = new long[set.size()];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final void k(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static ObjectAnimator l(View view, isf isf, int i, int i2, float f2, float f3, float f4, float f5, BaseInterpolator baseInterpolator, yrf yrf) {
        float f6;
        float f7;
        View view2 = view;
        isf isf2 = isf;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) isf2.b.getTag(yfc.transition_position);
        if (iArr != null) {
            f6 = ((float) (iArr[0] - i)) + translationX;
            f7 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f6 = f2;
            f7 = f3;
        }
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        if (f6 == f4 && f7 == f5) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f6, f4}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f7, f5})});
        jsf jsf = new jsf(view, isf2.b, translationX, translationY);
        yrf.a(jsf);
        ofPropertyValuesHolder.addListener(jsf);
        ofPropertyValuesHolder.setInterpolator(baseInterpolator);
        return ofPropertyValuesHolder;
    }

    public static void m(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                mb3 mb3 = (mb3) it.next();
                p54 p54 = new p54(mb3);
                Iterator it2 = mb3.b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        pac pac = (pac) it2.next();
                        boolean z = !(mb3.e == 0);
                        q54 q54 = new q54(pac, z);
                        if (!hashMap.containsKey(q54)) {
                            hashMap.put(q54, new HashSet());
                        }
                        Set set = (Set) hashMap.get(q54);
                        if (set.isEmpty() || z) {
                            set.add(p54);
                        } else {
                            throw new IllegalArgumentException("Multiple components provide " + pac + ".");
                        }
                    }
                }
            } else {
                for (Set<p54> it3 : hashMap.values()) {
                    for (p54 p542 : it3) {
                        for (bm4 bm4 : p542.a.c) {
                            if (bm4.c == 0) {
                                Set<p54> set2 = (Set) hashMap.get(new q54(bm4.a, bm4.b == 2));
                                if (set2 != null) {
                                    for (p54 p543 : set2) {
                                        p542.b.add(p543);
                                        p543.c.add(p542);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    p54 p544 = (p54) it4.next();
                    if (p544.c.isEmpty()) {
                        hashSet2.add(p544);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    p54 p545 = (p54) hashSet2.iterator().next();
                    hashSet2.remove(p545);
                    i++;
                    Iterator it5 = p545.b.iterator();
                    while (it5.hasNext()) {
                        p54 p546 = (p54) it5.next();
                        p546.c.remove(p545);
                        if (p546.c.isEmpty()) {
                            hashSet2.add(p546);
                        }
                    }
                }
                if (i != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        p54 p547 = (p54) it6.next();
                        if (!p547.c.isEmpty() && !p547.b.isEmpty()) {
                            arrayList2.add(p547.a);
                        }
                    }
                    throw new DependencyCycleException(arrayList2);
                }
                return;
            }
        }
    }

    public static boolean n(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean o(File file) {
        if (file == null) {
            return false;
        }
        try {
            return file.exists() && file.canRead();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean p(String str) {
        return !cvg.A(str) && o(new File(str));
    }

    public static List q(Iterable iterable, nsb nsb) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            try {
                if (nsb.test(next)) {
                    arrayList.add(next);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static List r(List list, nsb nsb, zi6 zi6) {
        if (list == null || ((list instanceof Collection) && list.isEmpty())) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            try {
                if (nsb.test(next)) {
                    arrayList.add(zi6.apply(next));
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static Object s(Iterable iterable, nsb nsb) {
        if (iterable == null) {
            return null;
        }
        for (Object next : iterable) {
            if (nsb == null) {
                return next;
            }
            try {
                if (nsb.test(next)) {
                    return next;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return null;
    }

    public static float t(float f2) {
        if (f2 == c44.DEFAULT_ASPECT_RATIO) {
            return 1.0f;
        }
        return c44.DEFAULT_ASPECT_RATIO;
    }

    public static void u(Iterable iterable, qk3 qk3) {
        if (iterable != null) {
            for (Object accept : iterable) {
                try {
                    qk3.accept(accept);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
    }

    public static final String v(long j) {
        String m = j <= ((long) -999500000) ? wj6.m(new StringBuilder(), (j - ((long) 500000000)) / ((long) 1000000000), " s ") : j <= ((long) -999500) ? wj6.m(new StringBuilder(), (j - ((long) 500000)) / ((long) DurationKt.NANOS_IN_MILLIS), " ms") : j <= 0 ? wj6.m(new StringBuilder(), (j - ((long) 500)) / ((long) 1000), " µs") : j < ((long) 999500) ? wj6.m(new StringBuilder(), (j + ((long) 500)) / ((long) 1000), " µs") : j < ((long) 999500000) ? wj6.m(new StringBuilder(), (j + ((long) 500000)) / ((long) DurationKt.NANOS_IN_MILLIS), " ms") : wj6.m(new StringBuilder(), (j + ((long) 500000000)) / ((long) 1000000000), " s ");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%6s", Arrays.copyOf(new Object[]{m}, 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0226, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03c1, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0544  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0558  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ykb w(defpackage.qt1 r12) {
        /*
            lcc r0 = defpackage.lcc.c
            r0.getClass()
            bs6 r0 = r0.a     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            zz7 r0 = r0.e()     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            jcc r0 = (defpackage.jcc) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r3 = r12.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x002b
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x002b
            r3 = r5
            goto L_0x002c
        L_0x002b:
            r3 = r6
        L_0x002c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk.class
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x003c
            androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk
            r3.<init>(r12)
            r1.add(r3)
        L_0x003c:
            java.lang.Object r3 = r12.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk> r3 = androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class
            boolean r3 = r0.a(r3, r6)
            if (r3 == 0) goto L_0x0052
            androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk r3 = new androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk
            r3.<init>()
            r1.add(r3)
        L_0x0052:
            java.util.HashSet r3 = androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.a
            java.lang.String r7 = android.os.Build.DEVICE
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r8)
            boolean r3 = r3.contains(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.class
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x0070
            androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk
            r3.<init>()
            r1.add(r3)
        L_0x0070:
            java.util.HashSet r3 = androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk.a
            java.lang.String r7 = android.os.Build.MODEL
            java.lang.String r9 = r7.toLowerCase(r8)
            boolean r3 = r3.contains(r9)
            if (r3 == 0) goto L_0x008e
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r3 = r12.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x008e
            r3 = r5
            goto L_0x008f
        L_0x008e:
            r3 = r6
        L_0x008f:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x009f
            androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk
            r3.<init>()
            r1.add(r3)
        L_0x009f:
            java.lang.Object r3 = r12.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x00af
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x00af
            r3 = r5
            goto L_0x00b0
        L_0x00af:
            r3 = r6
        L_0x00b0:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x00c0
            androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk
            r3.<init>(r12)
            r1.add(r3)
        L_0x00c0:
            java.lang.String r3 = android.os.Build.HARDWARE
            java.lang.String r9 = "samsungexynos7420"
            boolean r9 = r9.equalsIgnoreCase(r3)
            if (r9 != 0) goto L_0x00d2
            java.lang.String r9 = "universal7420"
            boolean r3 = r9.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00e2
        L_0x00d2:
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r3 = r12.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r5) goto L_0x00e2
            r3 = r5
            goto L_0x00e3
        L_0x00e2:
            r3 = r6
        L_0x00e3:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x00f3
            androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk
            r3.<init>()
            r1.add(r3)
        L_0x00f3:
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0103
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x0103
            r2 = r5
            goto L_0x0104
        L_0x0103:
            r2 = r6
        L_0x0104:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x0114
            androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0114:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk> r2 = androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk.class
            boolean r2 = r0.a(r2, r6)
            if (r2 == 0) goto L_0x0124
            androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0124:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.a
            java.lang.String r2 = r7.toUpperCase(r8)
            java.util.List r3 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.a
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0142
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x0142
            r2 = r5
            goto L_0x0143
        L_0x0142:
            r2 = r6
        L_0x0143:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x0153
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0153:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.a
            java.lang.String r2 = r7.toUpperCase(r8)
            java.util.List r3 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.a
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0171
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x0171
            r2 = r5
            goto L_0x0172
        L_0x0171:
            r2 = r6
        L_0x0172:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x0182
            androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0182:
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r3 = "motorola"
            boolean r8 = r3.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x0195
            java.lang.String r8 = "MotoG3"
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x0195
            goto L_0x01e3
        L_0x0195:
            java.lang.String r8 = "samsung"
            boolean r9 = r8.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01a6
            java.lang.String r9 = "SM-G532F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01a6
            goto L_0x01e3
        L_0x01a6:
            boolean r9 = r8.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01b5
            java.lang.String r9 = "SM-J700F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01b5
            goto L_0x01e3
        L_0x01b5:
            boolean r9 = r8.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01c4
            java.lang.String r9 = "SM-A920F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01c4
            goto L_0x01e3
        L_0x01c4:
            boolean r8 = r8.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x01d3
            java.lang.String r8 = "SM-J415F"
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x01d3
            goto L_0x01e3
        L_0x01d3:
            java.lang.String r8 = "xiaomi"
            boolean r2 = r8.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x01e5
            java.lang.String r2 = "Mi A1"
            boolean r2 = r2.equalsIgnoreCase(r7)
            if (r2 == 0) goto L_0x01e5
        L_0x01e3:
            r2 = r5
            goto L_0x01e6
        L_0x01e5:
            r2 = r6
        L_0x01e6:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x01f6
            androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk
            r2.<init>()
            r1.add(r2)
        L_0x01f6:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.a
            java.util.Iterator r2 = r2.iterator()
        L_0x01fc:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0226
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = android.os.Build.MODEL
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r8 = r8.toUpperCase(r9)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L_0x01fc
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x0226
            r2 = r5
            goto L_0x0227
        L_0x0226:
            r2 = r6
        L_0x0227:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0237
            androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0237:
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r7 = "SAMSUNG"
            boolean r2 = r2.equalsIgnoreCase(r7)
            if (r2 == 0) goto L_0x0257
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r2 >= r7) goto L_0x0257
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0257
            r2 = r5
            goto L_0x0258
        L_0x0257:
            r2 = r6
        L_0x0258:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0268
            androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0268:
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r7 = r12.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x027a
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x027a
            r7 = r5
            goto L_0x027b
        L_0x027a:
            r7 = r6
        L_0x027b:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x028b
            androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk
            r7.<init>()
            r1.add(r7)
        L_0x028b:
            java.lang.Object r7 = r12.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x029b
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x029b
            r7 = r5
            goto L_0x029c
        L_0x029b:
            r7 = r6
        L_0x029c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x02ac
            androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk
            r7.<init>()
            r1.add(r7)
        L_0x02ac:
            java.lang.Object r7 = r12.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x02bc
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x02bc
            r7 = r5
            goto L_0x02bd
        L_0x02bc:
            r7 = r6
        L_0x02bd:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x02cd
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk
            r7.<init>()
            r1.add(r7)
        L_0x02cd:
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.a
            java.lang.String r7 = android.os.Build.MODEL
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r9 = r7.toLowerCase(r8)
            java.util.List r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.b
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x02ef
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r9 = r12.a(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != 0) goto L_0x02ef
            r9 = r5
            goto L_0x02f0
        L_0x02ef:
            r9 = r6
        L_0x02f0:
            java.util.List r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.a
            java.lang.String r11 = r7.toLowerCase(r8)
            boolean r10 = r10.contains(r11)
            if (r9 != 0) goto L_0x0301
            if (r10 == 0) goto L_0x02ff
            goto L_0x0301
        L_0x02ff:
            r9 = r6
            goto L_0x0302
        L_0x0301:
            r9 = r5
        L_0x0302:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk> r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.class
            boolean r9 = r0.a(r10, r9)
            if (r9 == 0) goto L_0x0312
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk r9 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk
            r9.<init>()
            r1.add(r9)
        L_0x0312:
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.a
            java.lang.String r9 = r7.toLowerCase(r8)
            java.util.List r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.a
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x0330
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r9 = r12.a(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != r5) goto L_0x0330
            r9 = r5
            goto L_0x0331
        L_0x0330:
            r9 = r6
        L_0x0331:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk> r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.class
            boolean r9 = r0.a(r10, r9)
            if (r9 == 0) goto L_0x0341
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk r9 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk
            r9.<init>()
            r1.add(r9)
        L_0x0341:
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.a
            java.lang.String r7 = r7.toLowerCase(r8)
            java.util.List r8 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.a
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x035f
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r7 = r12.a(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x035f
            r7 = r5
            goto L_0x0360
        L_0x035f:
            r7 = r6
        L_0x0360:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x0370
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk
            r7.<init>()
            r1.add(r7)
        L_0x0370:
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0380
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x0380
            r2 = r5
            goto L_0x0381
        L_0x0380:
            r2 = r6
        L_0x0381:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk> r4 = androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk.class
            boolean r2 = r0.a(r4, r2)
            if (r2 == 0) goto L_0x0391
            androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0391:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.b
            java.util.Iterator r2 = r2.iterator()
        L_0x0397:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03c1
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r7 = android.os.Build.MODEL
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toUpperCase(r8)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0397
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x03c1
            r2 = r5
            goto L_0x03c2
        L_0x03c1:
            r2 = r6
        L_0x03c2:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk> r4 = androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.class
            boolean r2 = r0.a(r4, r2)
            if (r2 == 0) goto L_0x03d2
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk
            r2.<init>(r12)
            r1.add(r2)
        L_0x03d2:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "HUAWEI"
            boolean r7 = r4.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x03e7
            java.lang.String r7 = "HUAWEI ALE-L04"
            java.lang.String r8 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x03e7
            goto L_0x043f
        L_0x03e7:
            java.lang.String r7 = "Samsung"
            boolean r8 = r7.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x03fa
            java.lang.String r8 = "sm-j320f"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x03fa
            goto L_0x043f
        L_0x03fa:
            boolean r8 = r7.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x040b
            java.lang.String r8 = "sm-j700f"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x040b
            goto L_0x043f
        L_0x040b:
            boolean r8 = r7.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x041c
            java.lang.String r8 = "sm-j111f"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x041c
            goto L_0x043f
        L_0x041c:
            java.lang.String r8 = "OPPO"
            boolean r8 = r8.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x042f
            java.lang.String r8 = "A37F"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x042f
            goto L_0x043f
        L_0x042f:
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0441
            java.lang.String r7 = "sm-j510fn"
            java.lang.String r8 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x0441
        L_0x043f:
            r7 = r5
            goto L_0x0442
        L_0x0441:
            r7 = r6
        L_0x0442:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x0452
            androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk
            r7.<init>()
            r1.add(r7)
        L_0x0452:
            java.lang.String r7 = "Huawei"
            boolean r2 = r7.equalsIgnoreCase(r2)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0468
            androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0468:
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.e()
            if (r2 != 0) goto L_0x04ab
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.f()
            if (r2 != 0) goto L_0x04ab
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.i()
            if (r2 != 0) goto L_0x04ab
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.g()
            if (r2 != 0) goto L_0x04ab
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r7 = "pixel 4 xl"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0491
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r7 != r8) goto L_0x0491
            goto L_0x04ab
        L_0x0491:
            java.lang.String r7 = android.os.Build.BRAND
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L_0x04a2
            java.lang.String r3 = "moto e13"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x04a2
            goto L_0x04ab
        L_0x04a2:
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.h()
            if (r2 == 0) goto L_0x04a9
            goto L_0x04ab
        L_0x04a9:
            r2 = r6
            goto L_0x04ac
        L_0x04ab:
            r2 = r5
        L_0x04ac:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x04bc
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk
            r2.<init>()
            r1.add(r2)
        L_0x04bc:
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r3 = "Pixel 8"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x04d6
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r12 = r12.a(r3)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != 0) goto L_0x04d6
            r12 = r5
            goto L_0x04d7
        L_0x04d6:
            r12 = r6
        L_0x04d7:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk.class
            boolean r12 = r0.a(r3, r12)
            if (r12 == 0) goto L_0x04e7
            androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk r12 = new androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk
            r12.<init>()
            r1.add(r12)
        L_0x04e7:
            java.util.HashSet r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.a
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r7 = r2.toLowerCase(r3)
            boolean r12 = r12.contains(r7)
            if (r12 != 0) goto L_0x053c
            int r12 = android.os.Build.VERSION.SDK_INT
            r7 = 31
            if (r12 < r7) goto L_0x0507
            java.lang.String r12 = "Spreadtrum"
            java.lang.String r7 = android.os.Build.SOC_MANUFACTURER
            boolean r12 = r12.equalsIgnoreCase(r7)
            if (r12 != 0) goto L_0x053c
        L_0x0507:
            java.lang.String r12 = android.os.Build.HARDWARE
            java.lang.String r7 = r12.toLowerCase(r3)
            java.lang.String r8 = "ums"
            boolean r7 = r7.startsWith(r8)
            if (r7 != 0) goto L_0x053c
            java.lang.String r7 = android.os.Build.BRAND
            java.lang.String r8 = "itel"
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x052c
            java.lang.String r12 = r12.toLowerCase(r3)
            java.lang.String r3 = "sp"
            boolean r12 = r12.startsWith(r3)
            if (r12 == 0) goto L_0x052c
            goto L_0x053c
        L_0x052c:
            boolean r12 = r4.equalsIgnoreCase(r7)
            if (r12 == 0) goto L_0x053b
            java.lang.String r12 = "FIG-LX1"
            boolean r12 = r12.equalsIgnoreCase(r2)
            if (r12 == 0) goto L_0x053b
            goto L_0x053c
        L_0x053b:
            r5 = r6
        L_0x053c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk> r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class
            boolean r12 = r0.a(r12, r5)
            if (r12 == 0) goto L_0x054c
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk r12 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk
            r12.<init>()
            r1.add(r12)
        L_0x054c:
            boolean r12 = androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.e()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk> r2 = androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class
            boolean r12 = r0.a(r2, r12)
            if (r12 == 0) goto L_0x0560
            androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk r12 = new androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk
            r12.<init>()
            r1.add(r12)
        L_0x0560:
            ykb r12 = new ykb
            r12.<init>((java.util.List) r1)
            defpackage.ykb.k(r12)
            return r12
        L_0x0569:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unexpected error in QuirkSettings StateObservable"
            r0.<init>(r1, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjf.w(qt1):ykb");
    }

    public static final Sequence x(View view) {
        return SequencesKt.sequence(new qag(view, (Continuation) null));
    }

    public static File y(File file, String str) {
        String str2;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        int lastIndexOf = str.lastIndexOf(46);
        int i = 0;
        while (i < 100) {
            if (lastIndexOf != -1) {
                str2 = str.substring(0, lastIndexOf) + "(" + (i + 1) + ")" + str.substring(lastIndexOf);
            } else {
                StringBuilder m = g63.m(str, "(");
                m.append(i + 1);
                m.append(")");
                str2 = m.toString();
            }
            File file3 = new File(file, str2);
            if (!file3.exists()) {
                return file3;
            }
            i++;
            file2 = file3;
        }
        return file2;
    }

    public static Object z(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ti7.c(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public abstract cjf e(Object obj);
}
