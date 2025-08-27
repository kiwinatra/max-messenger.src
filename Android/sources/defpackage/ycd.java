package defpackage;

import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ycd  reason: default package */
public final class ycd extends SuspendLambda implements Function2 {
    public final /* synthetic */ File a;
    public final /* synthetic */ zcd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ycd(File file, zcd zcd, Continuation continuation) {
        super(2, continuation);
        this.a = file;
        this.b = zcd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ycd(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ycd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [hgd, tgg, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File file = this.a;
        ? obj2 = new Object();
        obj2.b = file;
        obj2.a = Environment.DIRECTORY_MOVIES;
        obj2.c = sq9.VIDEO_MP4;
        obj2.o = MediaStore.Video.Media.getContentUri("external_primary");
        zcd zcd = this.b;
        return ((me) zcd.a).d(obj2, zcd.a.a());
    }
}
