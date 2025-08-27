package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: w38  reason: default package */
public final class w38 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ y38 b;
    public final /* synthetic */ g4g c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w38(y38 y38, g4g g4g, Continuation continuation) {
        super(2, continuation);
        this.b = y38;
        this.c = g4g;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        w38 w38 = new w38(this.b, this.c, continuation);
        w38.a = obj;
        return w38;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w38) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        for (Bitmap bitmap : (List) this.b.d.getValue()) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        ((MediaMetadataRetriever) this.b.f.getValue()).setDataSource(this.c.h().getPath());
        try {
            String extractMetadata = ((MediaMetadataRetriever) this.b.f.getValue()).extractMetadata(9);
            this.b.h = extractMetadata != null ? Long.parseLong(extractMetadata) : this.c.e();
        } catch (Exception e) {
            z68.f(this.b.b, "Can't extract duration", e);
            this.b.h = this.c.e();
        }
        ArrayList arrayList = new ArrayList();
        int i = this.b.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (!e14.f(d14)) {
                return Unit.INSTANCE;
            }
            long j = this.b.h;
            y38 y38 = this.b;
            long j2 = (j / ((long) y38.g)) * ((long) i2) * 1000;
            ce6 ce6 = y38.a;
            Bitmap scaledFrameAtTime = ((MediaMetadataRetriever) y38.f.getValue()).getScaledFrameAtTime(j2, 2, ce6.b, ce6.c);
            if (scaledFrameAtTime != null && e14.f(d14)) {
                arrayList.add(scaledFrameAtTime);
                xme xme = this.b.d;
                xme.getClass();
                xme.m((Object) null, arrayList);
            }
        }
        return Unit.INSTANCE;
    }
}
