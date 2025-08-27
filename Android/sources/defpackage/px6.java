package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Debug;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: px6  reason: default package */
public final class px6 extends SuspendLambda implements Function2 {
    public File a;
    public int b;
    public final /* synthetic */ qx6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public px6(qx6 qx6, Continuation continuation) {
        super(2, continuation);
        this.c = qx6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new px6(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((px6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        File file;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        qx6 qx6 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            File i2 = ((po5) qx6.c.getValue()).i("oneme_heap_dump.hprof");
            Debug.dumpHprofData(i2.getAbsolutePath());
            gc8 t0 = ((osa) ((gaf) qx6.b.getValue())).c().t0();
            ox6 ox6 = new ox6(qx6, i2, (Continuation) null);
            this.a = i2;
            this.b = 1;
            if (ev0.I(t0, ox6, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            file = i2;
        } else if (i == 1) {
            file = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Context context = (Context) qx6.a.getValue();
        Uri f = ((po5) qx6.c.getValue()).f(context, file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.STREAM", f);
        Intent createChooser = Intent.createChooser(intent, (CharSequence) null);
        createChooser.addFlags(268435456);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(createChooser, 65536)) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, f, 3);
        }
        context.startActivity(createChooser);
        return Unit.INSTANCE;
    }
}
