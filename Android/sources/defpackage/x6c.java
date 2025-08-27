package defpackage;

import android.content.Context;
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

/* renamed from: x6c  reason: default package */
public final class x6c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ k7c b;
    public final /* synthetic */ Uri c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x6c(k7c k7c, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.b = k7c;
        this.c = uri;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        x6c x6c = new x6c(this.b, this.c, continuation);
        x6c.a = obj;
        return x6c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x6c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Uri uri;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        KProperty[] kPropertyArr = k7c.M0;
        k7c k7c = this.b;
        Lazy lazy = k7c.v0;
        Context context = k7c.K0;
        File r = ((po5) lazy.getValue()).r((String) k7c.J0.get());
        try {
            Result.Companion companion = Result.Companion;
            if (!r.exists() && (uri = this.c) != null) {
                j4b.R(context.getContentResolver().openInputStream(uri), r);
            }
            obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r4 = Result.m26exceptionOrNullimpl(obj2);
        if (r4 != null) {
            z68.f(d14.getClass().getName(), "failed to copy picked image, e:", r4);
            k7c.w();
        }
        Lazy lazy2 = k7c.Z;
        String absolutePath = r.getAbsolutePath();
        o5a.X((bud) lazy2.getValue(), absolutePath, absolutePath);
        o5a.W((bud) lazy2.getValue(), r.getAbsolutePath());
        Intent intent = new Intent(context, ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(r));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", r.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        xag.h(k7c.x0, new x4c(intent));
        return Unit.INSTANCE;
    }
}
