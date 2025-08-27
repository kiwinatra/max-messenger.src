package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: ln6  reason: default package */
public final class ln6 extends SuspendLambda implements Function2 {
    public File a;
    public String b;
    public int c;
    public final /* synthetic */ GalleryViewModel o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ln6(GalleryViewModel galleryViewModel, Continuation continuation) {
        super(2, continuation);
        this.o = galleryViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ln6(this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ln6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        File file;
        File file2;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        GalleryViewModel galleryViewModel = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            tqd tqd = (tqd) CollectionsKt.firstOrNull(y7e.a(galleryViewModel.E));
            if (tqd == null) {
                return Unit.INSTANCE;
            }
            String valueOf = String.valueOf(System.currentTimeMillis());
            file = ((po5) galleryViewModel.d).r(valueOf);
            Uri x = o5a.x(tqd.c.toString());
            str = file.getAbsolutePath();
            if (x != null) {
                q04 b2 = ((osa) galleryViewModel.o()).b();
                kn6 kn6 = new kn6(this.o, valueOf, x, str, (Continuation) null);
                this.a = file;
                this.b = str;
                this.c = 1;
                if (ev0.I(b2, kn6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                file2 = file;
            }
            xme xme = galleryViewModel.C;
            o85 o85 = new o85(new zl6(Uri.fromFile(file), str));
            xme.getClass();
            xme.m((Object) null, o85);
            return Unit.INSTANCE;
        } else if (i == 1) {
            str2 = this.b;
            file2 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        file = file2;
        str = str2;
        xme xme2 = galleryViewModel.C;
        o85 o852 = new o85(new zl6(Uri.fromFile(file), str));
        xme2.getClass();
        xme2.m((Object) null, o852);
        return Unit.INSTANCE;
    }
}
