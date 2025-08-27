package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: xga  reason: default package */
public final class xga implements g8b, umb, nj6, uoe, qk3, Grouping {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ xga(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static String e(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        String.format("Released audio source successfully: 0x%x", new Object[]{Integer.valueOf(((m70) this.b).hashCode())});
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 7:
                Integer num = (Integer) obj;
                z68.c(((h5f) this.b).b, "Connection restored", new Object[0]);
                return;
            default:
                ((UploadFileAttachWorker) this.b).g((tf9) obj);
                return;
        }
    }

    public void b(gpe gpe) {
    }

    public void c() {
        PipScreen pipScreen = (PipScreen) this.b;
        if (pipScreen.getRouter().n()) {
            hn requireActivity = pipScreen.requireActivity();
            Intent intent = new Intent(pipScreen.requireActivity(), pipScreen.requireActivity().getClass());
            intent.setFlags(131072);
            requireActivity.startActivity(intent);
            return;
        }
        pipScreen.requireActivity().finish();
    }

    public Object d() {
        return this.b;
    }

    public void f(gpe gpe) {
        KProperty[] kPropertyArr = StickerSetBottomSheet.x0;
        ((upe) ((StickerSetBottomSheet) this.b).y.getValue()).l(gpe.a);
    }

    public void g(Throwable th) {
        String.format("An error occurred while attempting to release audio source: 0x%x", new Object[]{Integer.valueOf(((m70) this.b).hashCode())});
    }

    public boolean h() {
        return true;
    }

    public void i(String str) {
        meg meg = ((leg) this.b).b;
        meg.getClass();
        meg.q.v("handleWebSocketClosed, reason=" + str);
        meg.d();
    }

    public void j() {
        meg meg = ((leg) this.b).b;
        meg.q.v("handleWebSocketOpen");
        meg.n.onConnected();
        xv1 xv1 = meg.m;
        if (xv1 != null) {
            synchronized (((o9e) xv1.b).f) {
                try {
                    o9e o9e = (o9e) xv1.b;
                    if (o9e.q) {
                        o9e.t = o9e.s;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public Object k() {
        return this.b;
    }

    public Object keyOf(Object obj) {
        return ((Thread) obj).getState();
    }

    public boolean l(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((nie) it.next()).c));
        }
        Set set = CollectionsKt.toSet(arrayList);
        boolean z = !Intrinsics.areEqual((Object) set, (Object) (Set) this.b);
        this.b = set;
        return z;
    }

    public Iterator sourceIterator() {
        return ((Iterable) this.b).iterator();
    }

    public xga() {
        this.a = 4;
        this.b = SetsKt.emptySet();
    }

    public xga(String str) {
        this.a = 9;
        this.b = Executors.newCachedThreadPool(new sof(new AtomicInteger(0), str));
    }

    public xga(Context context) {
        boolean isEmpty;
        this.a = 6;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(ew3.c(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    e.getMessage();
                }
            }
        }
    }
}
