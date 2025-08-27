package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: h7a  reason: default package */
public final class h7a extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l7a c;
    public final /* synthetic */ Uri o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h7a(l7a l7a, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.c = l7a;
        this.o = uri;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h7a h7a = new h7a(this.c, this.o, continuation);
        h7a.b = obj;
        return h7a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h7a) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            File r = ((po5) this.c.b.getValue()).r(this.c.k);
            Uri uri = this.o;
            l7a l7a = this.c;
            try {
                Result.Companion companion = Result.Companion;
                if (!r.exists() && uri != null) {
                    j4b.R(((Context) l7a.c.getValue()).getContentResolver().openInputStream(uri), r);
                }
                obj2 = Result.m23constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            l7a l7a2 = this.c;
            Throwable r3 = Result.m26exceptionOrNullimpl(obj2);
            if (r3 != null) {
                z68.f(d14.getClass().getName(), "failed to copy picked image, e:", r3);
                l7a2.b();
            }
            String absolutePath = r.getAbsolutePath();
            o5a.X((bud) this.c.d.getValue(), absolutePath, absolutePath);
            o5a.W((bud) this.c.d.getValue(), r.getAbsolutePath());
            Intent intent = new Intent((Context) this.c.c.getValue(), ActAvatarCrop.class);
            intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(r));
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", r.getAbsolutePath());
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
            n6e n6e = this.c.g;
            pd0 pd0 = new pd0(intent);
            this.a = 1;
            if (n6e.a(pd0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
