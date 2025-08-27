package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import one.me.messages.list.loader.MessageModel;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.ActProfilePhoto;

/* renamed from: hg2  reason: default package */
public final /* synthetic */ class hg2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ hg2(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        StackTraceElement[] stackTrace;
        List s;
        boolean z = true;
        long j = this.b;
        switch (this.a) {
            case 0:
                w62 w62 = (w62) obj;
                z62 z62 = w62.r;
                if (z62 == null) {
                    z62 = z62.g;
                }
                y62 a2 = z62.a();
                a2.c = j;
                w62.r = a2.a();
                return Unit.INSTANCE;
            case 1:
                return Long.valueOf(j);
            case 2:
                if (((a32) obj).b.a != j) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return Integer.valueOf(Intrinsics.compare(((MessageModel) obj).c, j));
            case 4:
                return Integer.valueOf(Intrinsics.compare(((MessageModel) obj).c, j));
            case 5:
                return Integer.valueOf(Intrinsics.compare(((MessageModel) obj).c, j));
            case 6:
                ActContactAvatars.X(j, (Context) obj);
                return Unit.INSTANCE;
            case 7:
                Context context = (Context) obj;
                int i = ActProfilePhoto.C0;
                a32 a32 = (a32) ((my2) ((qx2) ((qra) ((id3) ym.v.c.getValue())).getAccessor().g(qx2.class))).o(j).a.getValue();
                if (a32 != null) {
                    m72 m72 = a32.b;
                    m72.d();
                    String str = m72.i;
                    if (!cvg.A(str)) {
                        cjf.A(str, kl0.v, jl0.b);
                    }
                    t6 t6Var = new t6(gsg.k(new r6(0, a32)), a32.r());
                    Intent intent = new Intent(context, ActProfilePhoto.class);
                    intent.putExtra("ru.ok.tamtam.extra.PHOTO_HOLDER", t6Var);
                    context.startActivity(intent);
                }
                return Unit.INSTANCE;
            case 8:
                return Boolean.valueOf(Intrinsics.areEqual(vzg.w((RLottieImageView) obj, kic.tag_reaction_effects_view), (Object) Long.valueOf(j)));
            case 9:
                if (((dkb) obj).a != j) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                yeg yeg = (yeg) obj;
                int i2 = ThreadExecutorStuckException.a;
                Thread thread = yeg.d;
                String str2 = null;
                String name = thread != null ? thread.getName() : null;
                if (name == null) {
                    name = "";
                }
                long r2 = Duration.m1371getInWholeMillisecondsimpl(Duration.m1388minusLRDsOJo(j, yeg.c));
                if (!(thread == null || (stackTrace = thread.getStackTrace()) == null || (s = ArraysKt___ArraysKt.take((T[]) stackTrace, 3)) == null)) {
                    str2 = CollectionsKt___CollectionsKt.joinToString$default(s, "\n\t\t", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                }
                String p = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.take(yeg.e, 5), "\n\t\t", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                StringBuilder sb = new StringBuilder("WatchdogTask(\n\tsubmitThread='");
                sb.append(yeg.a);
                sb.append("',\n\trunningThread='");
                sb.append(name);
                sb.append("',\n\texecutionTime=");
                sb.append(r2);
                sb.append(",\n\tlocked_stacktrace=\n");
                sb.append(str2);
                return rae.q(sb, "\n\tsubmit_stacktrace=\n\t", p, "\n)");
        }
    }
}
