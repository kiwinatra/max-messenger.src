package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.media.CamcorderProfile;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import javax.inject.Provider;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import org.webrtc.MediaStreamTrack;

/* renamed from: ekd  reason: default package */
public final class ekd implements zi6, qk3, mx3, zq1, fn8, Provider, op7, zm8 {
    public static final ekd X = new ekd(5);
    public static final ekd Y = new ekd(5);
    public static final ekd Z = new ekd(5);
    public static final /* synthetic */ ekd b = new ekd(1);
    public static final gl1 c = new gl1(21);
    public static final ekd o = new ekd(2);
    public static final ekd v = new ekd(3);
    public static final /* synthetic */ ekd v0 = new ekd(6);
    public static final ekd w = new ekd(4);
    public static final ekd x = new ekd(5);
    public static final ekd y = new ekd(5);
    public static final ekd z = new ekd(5);
    public final /* synthetic */ int a;

    public /* synthetic */ ekd(int i) {
        this.a = i;
    }

    public static LinearLayout e(Context context, Collection collection, Function1 function1) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ow3 ow3 = (ow3) it.next();
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setOnClickListener(new pb(28, function1, ow3));
            Integer num = ow3.d;
            js9 js9 = fu4.k;
            if (num != null) {
                int intValue = num.intValue();
                ImageView imageView = new ImageView(frameLayout.getContext());
                imageView.setImageResource(intValue);
                Integer num2 = ow3.e;
                if (num2 != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(js9.e(imageView.getContext()).f().i(num2.intValue())));
                }
                float f = (float) 24;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                layoutParams.gravity = 8388627;
                layoutParams.setMarginStart(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
                frameLayout.addView(imageView, layoutParams);
                b0h.H(frameLayout, new x2(ow3, imageView, (Continuation) null, 9));
            }
            TextView textView = new TextView(frameLayout.getContext());
            puf.k.b(textView, uy4.b);
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(js9.e(textView.getContext()).f().getText().e);
            textView.setText(ow3.b.a(textView.getContext()));
            Integer num3 = ow3.c;
            if (num3 != null) {
                textView.setTextColor(js9.e(textView.getContext()).f().i(num3.intValue()));
            }
            b0h.H(textView, new sa((Object) ow3, (Continuation) null, 6, false));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388627;
            layoutParams2.setMarginStart(MathKt.roundToInt((ow3.d != null ? (float) 44 : (float) 4) * vo4.c().getDisplayMetrics().density));
            layoutParams2.setMarginEnd(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
            float f2 = (float) 12;
            layoutParams2.topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
            layoutParams2.bottomMargin = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
            frameLayout.addView(textView, layoutParams2);
            linearLayout.addView(frameLayout, -1, -2);
        }
        return linearLayout;
    }

    public long a() {
        throw new NoSuchElementException();
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                hga.d.getClass();
                z68.b(hga.f, "onSelfReadMarkChanged: failed to remove tracker messages", (Throwable) obj);
                return;
            default:
                n54.D(new OnErrorNotImplementedException((Throwable) obj));
                return;
        }
    }

    public Object apply(Object obj) {
        return jha.n((List) obj);
    }

    public long b() {
        throw new NoSuchElementException();
    }

    public CamcorderProfile c(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    public boolean d(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    public hn8 f(dn8 dn8) {
        String str;
        if (t0g.a < 31) {
            return new dbe(19).f(dn8);
        }
        int g = uq9.g(dn8.c.Z);
        switch (g) {
            case -2:
                str = "none";
                break;
            case -1:
                str = "unknown";
                break;
            case 0:
                str = "default";
                break;
            case 1:
                str = MediaStreamTrack.AUDIO_TRACK_KIND;
                break;
            case 2:
                str = MediaStreamTrack.VIDEO_TRACK_KIND;
                break;
            case 3:
                str = "text";
                break;
            case 4:
                str = "image";
                break;
            case 5:
                str = "metadata";
                break;
            case 6:
                str = "camera motion";
                break;
            default:
                if (g < 10000) {
                    str = "?";
                    break;
                } else {
                    StringBuilder sb = new StringBuilder(20);
                    sb.append("custom (");
                    sb.append(g);
                    sb.append(")");
                    str = sb.toString();
                    break;
                }
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Creating an asynchronous MediaCodec adapter for track type ".concat(valueOf);
        }
        return new fj(g).f(dn8);
    }

    public HashMap g(Object obj) {
        ConcurrentHashMap concurrentHashMap = gl.a;
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map map = (Map) gl.a.get(cls);
        HashMap hashMap2 = map;
        if (map == null) {
            HashMap hashMap3 = new HashMap();
            gl.a(cls, hashMap3, new HashMap());
            hashMap2 = hashMap3;
        }
        if (!hashMap2.isEmpty()) {
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put(entry.getKey(), new d95(obj, (Method) entry.getValue()));
            }
        }
        return hashMap;
    }

    public Object get() {
        return new k40(Executors.newSingleThreadExecutor());
    }

    public HashMap h(Object obj) {
        ConcurrentHashMap concurrentHashMap = gl.a;
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map map = (Map) gl.b.get(cls);
        HashMap hashMap2 = map;
        if (map == null) {
            HashMap hashMap3 = new HashMap();
            gl.a(cls, new HashMap(), hashMap3);
            hashMap2 = hashMap3;
        }
        if (!hashMap2.isEmpty()) {
            for (Map.Entry entry : hashMap2.entrySet()) {
                HashSet hashSet = new HashSet();
                for (Method t85 : (Set) entry.getValue()) {
                    hashSet.add(new t85(obj, t85));
                }
                hashMap.put(entry.getKey(), hashSet);
            }
        }
        return hashMap;
    }

    public Object n(Task task) {
        Intent intent = (Intent) ((Bundle) task.f()).getParcelable("notification_data");
        if (intent != null) {
            return new b43(intent);
        }
        return null;
    }

    public boolean next() {
        return false;
    }

    public Object parse(sp7 sp7) {
        if (sp7.peek() == 0) {
            return null;
        }
        sp7.A();
        return null;
    }
}
