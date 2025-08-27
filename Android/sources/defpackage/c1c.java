package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: c1c  reason: default package */
public final class c1c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ j1c b;
    public final /* synthetic */ Uri c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1c(j1c j1c, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.b = j1c;
        this.c = uri;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c1c c1c = new c1c(this.b, this.c, continuation);
        c1c.a = obj;
        return c1c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c1c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Uri uri;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        KProperty[] kPropertyArr = j1c.A0;
        j1c j1c = this.b;
        Lazy lazy = j1c.x;
        Lazy lazy2 = j1c.y;
        File r = ((po5) lazy.getValue()).r((String) j1c.z0.get());
        try {
            Result.Companion companion = Result.Companion;
            if (!r.exists() && (uri = this.c) != null) {
                j4b.R(((Application) lazy2.getValue()).getContentResolver().openInputStream(uri), r);
            }
            obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r4 = Result.m26exceptionOrNullimpl(obj2);
        if (r4 != null) {
            z68.f(d14.getClass().getName(), "failed to copy picked image, e:", r4);
            j1c.m();
        }
        Lazy lazy3 = j1c.c;
        String absolutePath = r.getAbsolutePath();
        o5a.X((bud) lazy3.getValue(), absolutePath, absolutePath);
        o5a.W((bud) lazy3.getValue(), r.getAbsolutePath());
        Intent intent = new Intent((Application) lazy2.getValue(), ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(r));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", r.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        xag.h(j1c.w0, new zzb(intent));
        return Unit.INSTANCE;
    }
}
