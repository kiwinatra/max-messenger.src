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

/* renamed from: pyd  reason: default package */
public final class pyd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ wyd b;
    public final /* synthetic */ Uri c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyd(wyd wyd, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.b = wyd;
        this.c = uri;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pyd pyd = new pyd(this.b, this.c, continuation);
        pyd.a = obj;
        return pyd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pyd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Uri uri;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        KProperty[] kPropertyArr = wyd.E0;
        wyd wyd = this.b;
        Lazy lazy = wyd.y;
        Lazy lazy2 = wyd.z;
        File r = ((po5) lazy.getValue()).r((String) wyd.B0.get());
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
            wyd.r();
        }
        cud cud = ((ltb) wyd.l()).b;
        String absolutePath = r.getAbsolutePath();
        o5a.X(cud, absolutePath, absolutePath);
        o5a.W(((ltb) wyd.l()).b, r.getAbsolutePath());
        Intent intent = new Intent((Application) lazy2.getValue(), ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(r));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", r.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        xag.h(wyd.v0, new u2e(intent));
        return Unit.INSTANCE;
    }
}
