package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: b8e  reason: default package */
public final class b8e extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c8e c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b8e(c8e c8e, Continuation continuation) {
        super(2, continuation);
        this.c = c8e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        b8e b8e = new b8e(this.c, continuation);
        b8e.b = obj;
        return b8e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b8e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        c8e c8e = this.c;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            if (!((doa) c8e.b.getValue()).e() || !e14.f(d142)) {
                return Unit.INSTANCE;
            }
            this.b = d142;
            this.a = 1;
            Object d = e14.d(new z7e(c8e, (Continuation) null), this);
            if (d == coroutine_suspended) {
                return coroutine_suspended;
            }
            d14 d143 = d142;
            obj = d;
            d14 = d143;
        } else if (i == 1) {
            d14 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<w7e> list = (List) obj;
        e14.e(d14);
        if (!list.isEmpty()) {
            Context context = c8e.a;
            context.getClass();
            list.getClass();
            if (Build.VERSION.SDK_INT <= 32) {
                ArrayList arrayList = new ArrayList(list);
                for (w7e w7e : list) {
                    w7e.getClass();
                }
                list = arrayList;
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            for (w7e w7e2 : list) {
                w7e2.getClass();
                ShortcutInfo.Builder intents = new ShortcutInfo.Builder(w7e2.a, w7e2.b).setShortLabel(w7e2.d).setIntents(w7e2.c);
                IconCompat iconCompat = w7e2.f;
                if (iconCompat != null) {
                    intents.setIcon(v67.d(iconCompat, w7e2.a));
                }
                if (!TextUtils.isEmpty(w7e2.e)) {
                    intents.setLongLabel(w7e2.e);
                }
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    intents.setDisabledMessage((CharSequence) null);
                }
                ws wsVar = w7e2.g;
                if (wsVar != null) {
                    intents.setCategories(wsVar);
                }
                intents.setRank(0);
                int i2 = Build.VERSION.SDK_INT;
                y68 y68 = w7e2.h;
                if (y68 != null) {
                    intents.setLocusId(y68.b);
                }
                intents.setLongLived(w7e2.i);
                if (i2 >= 33) {
                    xy4.c(intents);
                }
                arrayList2.add(intents.build());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList2)) {
                z = false;
            } else {
                y7e.A(context).getClass();
                y7e.A(context).getClass();
                Iterator it = ((ArrayList) y7e.z(context)).iterator();
                if (it.hasNext()) {
                    rae.w(it.next());
                    throw null;
                }
            }
            Boxing.boxBoolean(z);
        } else {
            c8e.c();
        }
        return Unit.INSTANCE;
    }
}
