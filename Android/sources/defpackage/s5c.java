package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.profile.ProfileScreen;

/* renamed from: s5c  reason: default package */
public final class s5c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s5c(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.b = profileScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        s5c s5c = new s5c(continuation, this.b);
        s5c.a = obj;
        return s5c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s5c) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof t4c) {
            r4c r4c = r4c.b;
            long j = ((t4c) v5a).b;
            ta4 W0 = r4c.W0();
            W0.b(":settings/folder/by-chat?id=" + j, (Bundle) null);
        } else if (v5a instanceof v4c) {
            r4c r4c2 = r4c.b;
            long j2 = ((v4c) v5a).b;
            ta4 W02 = r4c2.W0();
            W02.b(":profile/attaches?id=" + j2, (Bundle) null);
        } else if (v5a instanceof b5c) {
            r4c.b.o1(((b5c) v5a).b);
        } else if (v5a instanceof d5c) {
            r4c r4c3 = r4c.b;
            long j3 = ((d5c) v5a).b;
            ta4 W03 = r4c3.W0();
            zqd zqd = new zqd(9);
            zqd.b = ":chats";
            zqd.z(Long.valueOf(j3), "id");
            zqd.z("local", "type");
            zqd.z("true", "open_search_field");
            W03.c(zqd.p(), (Bundle) null);
        } else if (v5a instanceof w4c) {
            w4c w4c = (w4c) v5a;
            r4c.b.r1(w4c.b, w4c.c.a);
        } else {
            boolean z = v5a instanceof a5c;
            ProfileScreen profileScreen = this.b;
            if (z) {
                a5c a5c = (a5c) v5a;
                ((tq1) profileScreen.C0.getValue()).c(rq1.PROFILE, a5c.d);
                int ordinal = a5c.c.ordinal();
                Lazy lazy = profileScreen.o;
                boolean z2 = a5c.d;
                long j4 = a5c.b;
                if (ordinal == 1) {
                    lf1 lf1 = (lf1) lazy.getValue();
                    ix2 ix2 = new ix2(v5a, 2);
                    lf1.c();
                    boolean booleanValue = ((Boolean) lf1.m.getValue()).booleanValue();
                    eng eng = lf1.a;
                    if (!booleanValue) {
                        eng.a();
                    } else {
                        rje rje = new rje(new dl1(j4, z2));
                        if (lf1.e().a(z2, eng)) {
                            lf1.a(rje, ix2);
                        } else {
                            lf1.h(z2);
                            lf1.h = rje;
                            lf1.l = ix2;
                            lf1.i = z2;
                        }
                    }
                } else if (ordinal == 2) {
                    ((lf1) lazy.getValue()).j(j4, z2, new ix2(v5a, 1));
                }
            } else if (v5a instanceof y4c) {
                y4c y4c = (y4c) v5a;
                int ordinal2 = y4c.c.ordinal();
                long j5 = y4c.b;
                if (ordinal2 == 0) {
                    r4c.b.W0().b(wj6.j(j5, ":profile/edit?id=", "&type=local_chat"), (Bundle) null);
                } else if (ordinal2 == 1) {
                    r4c.b.W0().b(wj6.j(j5, ":profile/edit?id=", "&type=server_chat"), (Bundle) null);
                } else if (ordinal2 == 2) {
                    r4c.b.W0().b(wj6.j(j5, ":profile/edit?id=", "&type=contact"), (Bundle) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (Intrinsics.areEqual((Object) v5a, (Object) c5c.b)) {
                KProperty[] kPropertyArr = ProfileScreen.D0;
                if (profileScreen.getRouter().e().size() == 1) {
                    i9d i9d = (i9d) CollectionsKt.firstOrNull(profileScreen.getRouter().e());
                    if (Intrinsics.areEqual((Object) i9d != null ? i9d.a : null, (Object) profileScreen)) {
                        r4c.b.t1();
                    }
                }
                r4c.b.W0().b(":chat-list", (Bundle) null);
            } else if (v5a instanceof u4c) {
                Context context = profileScreen.getContext();
                Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, String.valueOf(((u4c) v5a).b));
                ArrayList arrayList = gsg.j;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(withAppendedPath);
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    z68.f("gsg", "viewContact: ", e);
                    hi7.a0(qad.B5, context);
                }
            } else if (v5a instanceof pa4) {
                r4c.b.Y0((pa4) v5a);
            } else if (v5a instanceof s4c) {
                r4c r4c4 = r4c.b;
                ((s4c) v5a).getClass();
                r4c4.n1(0);
            } else if (v5a instanceof z4c) {
                r4c.b.q1(((z4c) v5a).b);
            } else if (v5a instanceof x4c) {
                profileScreen.startActivityForResult(((x4c) v5a).b, 666);
            }
        }
        return Unit.INSTANCE;
    }
}
