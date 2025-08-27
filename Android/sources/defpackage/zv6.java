package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zv6  reason: default package */
public final class zv6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ srd c;
    public final /* synthetic */ a o;
    public final /* synthetic */ gaf v;
    public final /* synthetic */ x6 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zv6(Intent intent, srd srd, a aVar, osa osa, x6 x6Var, Continuation continuation) {
        super(2, continuation);
        this.b = intent;
        this.c = srd;
        this.o = aVar;
        this.v = osa;
        this.w = x6Var;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zv6(this.b, this.c, this.o, (osa) this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zv6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        scf scf;
        Intent intent = this.b;
        srd srd = this.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        a aVar = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Rect rect = (Rect) intent.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE");
            Uri uri = (Uri) intent.getParcelableExtra("ru.ok.tamtam.extra.URI");
            String path = uri.getPath();
            ltb ltb = (ltb) srd.b;
            ltb ltb2 = (ltb) srd.b;
            tcf tcf = (tcf) srd.c;
            String r = m5a.r(path, rect, ltb.b);
            if (aVar.O1() == null) {
                return Unit.INSTANCE;
            }
            File a2 = nf0.a((po5) srd.a, r);
            new File(r).delete();
            new File(uri.toString()).delete();
            nf0.f(Uri.fromFile(a2), ltb2.a, tcf.g());
            b M1 = aVar.M1();
            m5 m5Var = M1 instanceof m5 ? (m5) M1 : null;
            if (m5Var == null || (scf = m5Var.K0()) == null) {
                scf = tcf.c();
            }
            tcf.h(scf, ltb2.a);
            ((nd) srd.o).e("ACTION_CUSTOM_BG_SET");
            gc8 c2 = ((osa) this.v).c();
            yv6 yv6 = new yv6(this.w, (Continuation) null);
            this.a = 1;
            if (ev0.I(c2, yv6, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                z68.f("srd", "onCropImageAsChatBackgroundResult: failed to set bachground", th);
                Context G2 = aVar.G2();
                int i2 = qad.V8;
                Handler handler = hi7.j;
                hi7.b0(0, G2, G2.getString(i2));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
