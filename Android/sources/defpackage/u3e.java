package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import org.apache.http.HttpStatus;

/* renamed from: u3e  reason: default package */
public final class u3e extends SuspendLambda implements Function2 {
    public final /* synthetic */ y3e a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u3e(y3e y3e, Continuation continuation) {
        super(2, continuation);
        this.a = y3e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new u3e(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u3e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        y3e y3e;
        xme xme;
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List createListBuilder = CollectionsKt.createListBuilder();
        KProperty[] kPropertyArr = y3e.I0;
        y3e y3e2 = this.a;
        if (((akd) y3e2.o()).x()) {
            tmd tmd = r5;
            tmd tmd2 = new tmd(jnd.a, new igf(vza.B), 0, uza.g, (h1e) null, new igf(vza.A), new d1e(y3e2.l().r(), !y3e2.l().r() || (y3e2.l().r() && y3e2.m().a())), Integer.valueOf(nad.j1), y3e2.l().r() && !y3e2.m().a(), 16);
            createListBuilder.add(tmd);
        }
        Integer valueOf = (!((akd) y3e2.o()).x() || !y3e2.l().r()) ? null : Integer.valueOf(nad.k1);
        tmd tmd3 = r5;
        String str = "ALL";
        tmd tmd4 = new tmd(((akd) y3e2.o()).x() ? jnd.b : jnd.a, new igf(vza.C), 0, uza.h, (h1e) null, (ngf) null, new b1e(y3e.n(((hq) y3e2.l()).g.getString("app.privacy.search_by_phone", "ALL")), valueOf), (Integer) null, false, 432);
        createListBuilder.add(tmd3);
        createListBuilder.add(new tmd(jnd.b, new igf(vza.k), 0, uza.d, (h1e) null, (ngf) null, new b1e(y3e.n(((hq) y3e2.l()).g.getString("app.privacy.incoming.call", str)), valueOf), (Integer) null, false, 432));
        createListBuilder.add(new tmd(jnd.c, new igf(vza.h), 0, uza.b, (h1e) null, (ngf) null, new b1e(y3e.n(((hq) y3e2.l()).g.getString("app.privacy.chats.invite", str)), valueOf), (Integer) null, false, 432));
        igf igf = new igf(vza.g);
        long j = uza.a;
        jnd jnd = jnd.o;
        createListBuilder.add(new smd(igf, 1, j));
        createListBuilder.add(new tmd(jnd, new igf(vza.D), 1, uza.i, (h1e) null, (ngf) null, new b1e(((hq) y3e2.l()).g.getBoolean("app.privacy.online.show", true) ? new igf(qad.P1) : new igf(qad.C5), (Integer) null), (Integer) null, false, 432));
        createListBuilder.add(new tmd(jnd, new igf(vza.i), 2, uza.c, (h1e) null, new igf(vza.j), a1e.a, (Integer) null, false, HttpStatus.SC_BAD_REQUEST));
        ArrayList arrayList = y3e2.D0;
        boolean z2 = !arrayList.isEmpty();
        wvd wvd = y3e2.C0;
        abe abe = y3e2.c;
        if (wvd != null) {
            createListBuilder.add(new smd(new igf(vza.z), 3, uza.f));
            kgf kgf = new kgf(vza.m, ArraysKt.toList((T[]) new Object[]{wvd.b}));
            mgf mgf = new mgf(wvd.c + "\n" + wvd.o);
            if (z2) {
                jnd = jnd.a;
            }
            Context context = (Context) abe.a.invoke();
            String string = context.getString(vza.l);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            js9 js9 = fu4.k;
            int i = a81.g(js9, context).e;
            float f = (float) 8;
            y3e = y3e2;
            shapeDrawable.setIntrinsicHeight(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
            shapeDrawable.setIntrinsicWidth(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            z = z2;
            shapeDrawable.setBounds(0, 0, shapeDrawable.getIntrinsicWidth(), shapeDrawable.getIntrinsicHeight());
            shapeDrawable.getPaint().setColor(i);
            SpannableString spannableString = new SpannableString(a81.m(" ", string));
            spannableString.setSpan(new bq5((Drawable) shapeDrawable, vp5.c, 4), 0, 1, 17);
            spannableString.setSpan(new aif(js9.e(context).f(), new duc(21)), 0, spannableString.length(), 17);
            createListBuilder.add(new tmd(jnd, kgf, 3, wvd.a, (h1e) null, mgf, new e1e(new mgf(spannableString)), (Integer) null, false, HttpStatus.SC_BAD_REQUEST));
        } else {
            y3e = y3e2;
            z = z2;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wvd wvd2 = (wvd) it.next();
            long j2 = wvd2.a;
            mgf mgf2 = new mgf(wvd2.b);
            mgf mgf3 = new mgf(wvd2.c + "\n" + wvd2.o);
            jnd jnd2 = jnd.b;
            Lazy lazy = abe.b;
            String r = j4b.r((Context) abe.a.invoke(), ((qjd) ((x23) lazy.getValue())).u(), wvd2.a, ((qjd) ((x23) lazy.getValue())).m(), false);
            if (r == null) {
                r = "";
            }
            createListBuilder.add(new tmd(jnd2, mgf2, 3, j2, (h1e) null, mgf3, new e1e(new mgf(r)), (Integer) null, false, HttpStatus.SC_BAD_REQUEST));
        }
        if (z) {
            createListBuilder.add(new tmd(jnd.c, new igf(vza.y), 3, uza.e, h1e.c, (ngf) null, (f1e) null, (Integer) null, false, 480));
        }
        List build = CollectionsKt.build(createListBuilder);
        y3e y3e3 = y3e;
        do {
            xme = y3e3.Z;
            value = xme.getValue();
            List list = (List) value;
        } while (!xme.b(value, build));
        return Unit.INSTANCE;
    }
}
