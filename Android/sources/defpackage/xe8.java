package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.widget.ProgressBar;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xe8  reason: default package */
public class xe8 implements ya3, nj6, cla, b80, pi8 {
    public static final int[] o = {16843067, 16843068};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ xe8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static tv4[] h(tv4 tv4, tv4 tv42, tv4 tv43) {
        float f = tv4.a;
        float f2 = tv42.a;
        float f3 = f - f2;
        float f4 = tv4.b;
        float f5 = tv42.b;
        float f6 = f4 - f5;
        float f7 = tv43.a;
        float f8 = f2 - f7;
        float f9 = tv43.b;
        float f10 = f5 - f9;
        float f11 = (f + f2) / 2.0f;
        float f12 = (f4 + f5) / 2.0f;
        float f13 = (f2 + f7) / 2.0f;
        float f14 = (f9 + f5) / 2.0f;
        float sqrt = (float) Math.sqrt((double) ((f6 * f6) + (f3 * f3)));
        float sqrt2 = (float) Math.sqrt((double) ((f10 * f10) + (f8 * f8)));
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float f17 = sqrt2 / (sqrt + sqrt2);
        if (Float.isNaN(f17)) {
            f17 = c44.DEFAULT_ASPECT_RATIO;
        }
        float f18 = tv42.a - ((f15 * f17) + f13);
        float f19 = f5 - ((f16 * f17) + f14);
        return new tv4[]{new tv4(f11 + f18, f12 + f19), new tv4(f13 + f18, f14 + f19)};
    }

    public static boolean t(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            bg5.p("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            bg5.p("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    public void A(rt6 rt6, o14 o14, hq7 hq7) {
        String str;
        o9e o9e = (o9e) ((Function0) this.c).invoke();
        if (o9e == null) {
            hq7.invoke(new IllegalStateException("Signaling is not ready or released"));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", (Object) "get-participant-list-chunk");
        jSONObject.put(NewHtcHomeBadger.COUNT, 0);
        int[] iArr = jr6.$EnumSwitchMapping$0;
        x8b[] x8bArr = x8b.a;
        int i = iArr[0];
        if (i == 1) {
            str = "GRID";
        } else if (i == 2) {
            str = "SIDE";
        } else if (i == 3) {
            str = "ADMIN";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        jSONObject.put("listType", (Object) str);
        zwd zwd = (zwd) rt6.b;
        if (zwd instanceof ywd) {
            jSONObject.put("roomId", ((ywd) zwd).a);
        }
        o9e.j(jSONObject, new vy0(this, rt6, hq7, o14), new ir6(this, hq7, 0));
    }

    public cz B() {
        File file = (File) this.b;
        if (file.exists()) {
            File file2 = (File) this.c;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                String valueOf = String.valueOf(file);
                new StringBuilder(String.valueOf(file2).length() + valueOf.length() + 37);
            }
        }
        try {
            return new cz(file, 0);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb = new StringBuilder(valueOf2.length() + 16);
                sb.append("Couldn't create ");
                sb.append(valueOf2);
                throw new IOException(sb.toString(), e);
            }
            try {
                return new cz(file, 0);
            } catch (FileNotFoundException e2) {
                String valueOf3 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf3.length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(valueOf3);
                throw new IOException(sb2.toString(), e2);
            }
        }
    }

    public Drawable C(Drawable drawable, boolean z) {
        if (drawable instanceof pqg) {
            ((qqg) ((pqg) drawable)).getClass();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = C(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 18:
                Void voidR = (Void) obj;
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                return;
            case 21:
                Void voidR2 = (Void) obj;
                ((do1) this.b).b((uv1) this.c);
                return;
            case 25:
                ((pi8) this.c).a(obj);
                return;
            default:
                Void voidR3 = (Void) obj;
                ((tk3) this.b).accept(new nc0(0, (Surface) this.c));
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 8:
                ((ya3) this.b).b();
                return;
            case 19:
                ((cla) this.b).b();
                return;
            case 23:
                ((zvb) ((cwb) this.b)).p((Throwable) null);
                return;
            default:
                ((pi8) this.c).b();
                return;
        }
    }

    public void c(mq4 mq4) {
        AtomicReference atomicReference;
        switch (this.a) {
            case 8:
                ((ya3) this.b).c(mq4);
                return;
            case 19:
                qq4.c((AtomicReference) this.c, mq4);
                return;
            case 23:
                break;
            default:
                qq4.c((AtomicReference) this.b, mq4);
                return;
        }
        do {
            atomicReference = (AtomicReference) this.c;
            if (atomicReference.compareAndSet((Object) null, mq4)) {
                return;
            }
        } while (atomicReference.get() == null);
        mq4.dispose();
    }

    public void d(Object obj) {
        switch (this.a) {
            case 19:
                ((cla) this.b).d(obj);
                return;
            default:
                try {
                    y64.L((cwb) this.b, obj);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
        }
    }

    public void e(zp8 zp8, int i) {
        uo8 uo8 = (uo8) this.b;
        if ((uo8.a.getFlags() & 4) != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, pt7.a(zp8, MediaDescriptionCompat.CREATOR));
            bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i);
            uo8.a.sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, (ResultReceiver) null);
            return;
        }
        throw new UnsupportedOperationException("This session doesn't support queue management operations");
    }

    public l04 f() {
        return new l04(this);
    }

    public void g(Throwable th) {
        switch (this.a) {
            case 18:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            case 21:
                ((do1) this.b).d(th);
                return;
            default:
                bs0.r("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof x3f);
                ((tk3) this.b).accept(new nc0(1, (Surface) this.c));
                return;
        }
    }

    public void i() {
        aqg aqg = (aqg) this.b;
        if (aqg != null) {
            ((AtomicBoolean) aqg.b).set(true);
            ((ScheduledFuture) aqg.a).cancel(true);
        }
        this.b = null;
    }

    public void j() {
        this.b = null;
        this.c = null;
    }

    public pa k() {
        return new pa((rv4) this.b);
    }

    public void l(long j, l8b l8b) {
        if (l8b.a() >= 9) {
            int g = l8b.g();
            int g2 = l8b.g();
            int u = l8b.u();
            if (g == 434 && g2 == 1195456820 && u == 3) {
                q8.f(j, l8b, (zpf[]) this.c);
            }
        }
    }

    public void m(xf5 xf5, qtf qtf) {
        int i = 0;
        while (true) {
            zpf[] zpfArr = (zpf[]) this.c;
            if (i < zpfArr.length) {
                qtf.a();
                qtf.b();
                zpf B = xf5.B(qtf.e, 3);
                ea6 ea6 = (ea6) ((List) this.b).get(i);
                String str = ea6.n;
                n79.f("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                ba6 ba6 = new ba6();
                qtf.b();
                ba6.a = qtf.f;
                ba6.m = vq9.l(str);
                ba6.e = ea6.e;
                ba6.d = ea6.d;
                ba6.F = ea6.G;
                ba6.p = ea6.q;
                B.e(new ea6(ba6));
                zpfArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public Bitmap n(int i) {
        Object obj;
        jk3 jk3 = (jk3) this.c;
        synchronized (jk3) {
            gt0 gt0 = (gt0) ((SparseArray) jk3.a).get(i);
            if (gt0 == null) {
                obj = null;
            } else {
                obj = gt0.c.pollFirst();
                if (((gt0) jk3.b) != gt0) {
                    jk3.q(gt0);
                    gt0 gt02 = (gt0) jk3.b;
                    if (gt02 == null) {
                        jk3.b = gt0;
                        jk3.c = gt0;
                    } else {
                        gt0.d = gt02;
                        gt02.a = gt0;
                        jk3.b = gt0;
                    }
                }
            }
        }
        if (obj != null) {
            synchronized (this) {
                ((HashSet) this.b).remove(obj);
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || !t(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    public Integer o(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!(bigInteger2 == null || bigInteger == null)) {
            BigInteger bigInteger3 = (BigInteger) this.b;
            BigInteger bigInteger4 = (BigInteger) this.c;
            this.b = bigInteger;
            this.c = bigInteger2;
            if (!(bigInteger3 == null || bigInteger4 == null)) {
                if (bigInteger3.compareTo(bigInteger) > 0 || bigInteger4.compareTo(bigInteger2) > 0) {
                    this.b = null;
                    this.c = null;
                } else {
                    BigInteger subtract = bigInteger.subtract(bigInteger3);
                    BigInteger subtract2 = bigInteger2.subtract(bigInteger4);
                    if (subtract.compareTo(BigInteger.ZERO) > 0) {
                        return Integer.valueOf(RangesKt___RangesKt.coerceIn((int) ((subtract2.floatValue() * ((float) 100)) / subtract.floatValue()), (ClosedRange<Integer>) new IntRange(0, 100)));
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 8:
                ya3 ya3 = (ya3) this.b;
                try {
                    if (((nsb) ((na3) this.c).c).test(th)) {
                        ya3.b();
                        return;
                    } else {
                        ya3.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    ya3.onError(new CompositeException(th, th2));
                    return;
                }
            case 19:
                ((cla) this.b).onError(th);
                return;
            case 23:
                ((zvb) ((cwb) this.b)).p(th);
                return;
            default:
                ((pi8) this.c).onError(th);
                return;
        }
    }

    public vo8 p() {
        MediaController.PlaybackInfo playbackInfo = ((uo8) this.b).a.getPlaybackInfo();
        if (playbackInfo != null) {
            return new vo8(playbackInfo.getPlaybackType(), new k30(new j30(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
        return null;
    }

    public mob q() {
        uo8 uo8 = (uo8) this.b;
        h67 a2 = uo8.e.a();
        if (a2 != null) {
            try {
                return a2.getPlaybackState();
            } catch (RemoteException unused) {
            }
        }
        PlaybackState playbackState = uo8.a.getPlaybackState();
        if (playbackState != null) {
            return mob.a(playbackState);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xo8, wo8] */
    public xo8 r() {
        return new wo8(((uo8) this.b).a.getTransportControls());
    }

    public void s(JSONObject jSONObject) {
        ce7 ce7;
        xv1 xv1 = (xv1) this.c;
        xv1.getClass();
        try {
            ce7 = new ce7(tf6.E(jSONObject), jSONObject.getString("message"), jSONObject.getBoolean("direct"));
        } catch (JSONException e) {
            ((voc) xv1.b).logException("ChatParser", "Can't parse chat message", e);
            ce7 = null;
        }
        if (ce7 != null) {
            ((wb2) this.b).onNewMessage(ce7);
        }
    }

    public void u(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = (ProgressBar) this.b;
        g6d w = g6d.w(progressBar.getContext(), attributeSet, o, i, 0);
        Drawable r = w.r(0);
        if (r != null) {
            if (r instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) r;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable C = C(animationDrawable.getFrame(i2), true);
                    C.setLevel(10000);
                    animationDrawable2.addFrame(C, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                r = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(r);
        }
        Drawable r2 = w.r(1);
        if (r2 != null) {
            progressBar.setProgressDrawable(C(r2, false));
        }
        w.x();
    }

    public void v(String str) {
        ((voc) this.b).log("OKWSSignaling", str);
    }

    public void w(MotionEvent motionEvent) {
        ArrayList arrayList = (ArrayList) this.c;
        arrayList.add(new tv4(motionEvent.getX(), motionEvent.getY()));
        int size = arrayList.size();
        rv4 rv4 = (rv4) this.b;
        if (size == 2) {
            float f = ((tv4) arrayList.get(0)).a;
            float f2 = ((tv4) arrayList.get(0)).b;
            float f3 = ((tv4) arrayList.get(1)).a;
            float f4 = ((tv4) arrayList.get(1)).b;
            rv4.a.add(new sv4(new float[]{f, f2, f3, f4}, 1));
            Path path = rv4.b;
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
        }
        if (arrayList.size() > 3) {
            tv4[] h = h((tv4) arrayList.get(0), (tv4) arrayList.get(1), (tv4) arrayList.get(2));
            tv4[] h2 = h((tv4) arrayList.get(1), (tv4) arrayList.get(2), (tv4) arrayList.get(3));
            float f5 = ((tv4) arrayList.get(1)).a;
            float f6 = ((tv4) arrayList.get(1)).b;
            tv4 tv4 = h[1];
            float f7 = tv4.a;
            tv4 tv42 = h2[0];
            float f8 = tv42.a;
            float f9 = ((tv4) arrayList.get(2)).a;
            float f10 = ((tv4) arrayList.get(2)).b;
            float f11 = tv4.b;
            float f12 = tv42.b;
            rv4.a.add(new sv4(new float[]{f5, f6, f7, f11, f8, f12, f9, f10}, 2));
            Path path2 = rv4.b;
            path2.moveTo(f5, f6);
            float f13 = f9;
            path2.cubicTo(f7, f11, f8, f12, f13, f10);
            arrayList.remove(0);
        }
    }

    public void x(Exception exc, boolean z) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        tb7 p = tb7.p(hashSet);
        hashSet.clear();
        lx5 r = p.listIterator(0);
        while (r.hasNext()) {
            je4 je4 = (je4) r.next();
            je4.getClass();
            je4.j(exc, z ? 1 : 3);
        }
    }

    public Object y() {
        Object obj;
        jk3 jk3 = (jk3) this.c;
        synchronized (jk3) {
            gt0 gt0 = (gt0) jk3.c;
            if (gt0 == null) {
                obj = null;
            } else {
                Object pollLast = gt0.c.pollLast();
                if (gt0.c.isEmpty()) {
                    jk3.q(gt0);
                    ((SparseArray) jk3.a).remove(gt0.b);
                }
                obj = pollLast;
            }
        }
        if (obj != null) {
            synchronized (this) {
                ((HashSet) this.b).remove(obj);
            }
        }
        return obj;
    }

    public void z(zp8 zp8) {
        uo8 uo8 = (uo8) this.b;
        if ((uo8.a.getFlags() & 4) != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, pt7.a(zp8, MediaDescriptionCompat.CREATOR));
            uo8.a.sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, (ResultReceiver) null);
            return;
        }
        throw new UnsupportedOperationException("This session doesn't support queue management operations");
    }

    public /* synthetic */ xe8(int i, boolean z) {
        this.a = i;
    }

    public xe8(Lazy lazy) {
        this.a = 0;
        this.b = xe8.class.getName();
        this.c = lazy;
    }

    public xe8(rv4 rv4) {
        this.a = 11;
        this.c = new ArrayList();
        this.b = rv4;
    }

    public xe8(List list) {
        this.a = 29;
        this.b = list;
        this.c = new zpf[list.size()];
    }

    public xe8(na3 na3, ya3 ya3) {
        this.a = 8;
        this.c = na3;
        this.b = ya3;
    }

    public xe8(File file) {
        this.a = 3;
        this.b = file;
        this.c = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public xe8(ProgressBar progressBar) {
        this.a = 1;
        this.b = progressBar;
    }

    public xe8(vof vof) {
        this.a = 28;
        this.b = vof.a;
        this.c = vof.b;
    }

    public xe8(Context context, ox8 ox8) {
        this.a = 17;
        if (ox8 != null) {
            this.c = Collections.synchronizedSet(new HashSet());
            this.b = new uo8(context, ox8);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public xe8(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = new HashSet();
                this.c = new jk3(3);
                return;
            case 9:
                this.b = new LinkedHashMap();
                return;
            case 10:
                this.b = new HashSet();
                return;
            case 20:
                this.b = new char[256];
                this.c = new byte[256];
                return;
            default:
                this.b = Choreographer.getInstance();
                this.c = Looper.myLooper();
                return;
        }
    }

    public xe8(xr1 xr1) {
        this.a = 6;
        this.c = xr1;
        this.b = null;
    }
}
