package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: gv2  reason: default package */
public final class gv2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ov2 c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gv2(int i, ov2 ov2, long j, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = ov2;
        this.o = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gv2(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gv2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        vk3 m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            int i3 = ngc.oneme_chat_action_add_to_folder;
            ov2 ov2 = this.c;
            long j = this.o;
            int i4 = this.b;
            if (i4 == i3 || i4 == (i = ngc.oneme_chat_action_remove_from_folder)) {
                KProperty[] kPropertyArr = ov2.O0;
                a32 a32 = (a32) ((my2) ov2.k()).o(j).a.getValue();
                if (a32 == null) {
                    return Unit.INSTANCE;
                }
                xag.h(ov2.F0, new a4b(a32.b.a));
            } else if (i4 == i) {
                xag.h(ov2.F0, new a4b(j));
            } else if (i4 == ngc.oneme_chat_action_delete_channel) {
                KProperty[] kPropertyArr2 = ov2.O0;
                a32 a322 = (a32) ((my2) ov2.k()).o(j).a.getValue();
                if (a322 == null) {
                    return Unit.INSTANCE;
                }
                xag.h(ov2.G0, a322.d() ? d32.d(a322) : d32.e(a322));
            } else if (i4 == ngc.oneme_chat_action_delete_chat) {
                KProperty[] kPropertyArr3 = ov2.O0;
                a32 a323 = (a32) ((my2) ov2.k()).o(j).a.getValue();
                if (a323 == null) {
                    return Unit.INSTANCE;
                }
                xag.h(ov2.G0, a323.N() ? d32.g(a323) : a323.d() ? d32.f(a323) : d32.e(a323));
            } else if (i4 == ngc.oneme_chat_action_leave) {
                KProperty[] kPropertyArr4 = ov2.O0;
                a32 a324 = (a32) ((my2) ov2.k()).o(j).a.getValue();
                if (a324 == null) {
                    return Unit.INSTANCE;
                }
                xag.h(ov2.G0, a324.d() ? a324.K() ? d32.i(a324) : d32.k(a324) : a324.K() ? d32.h(a324) : d32.j(a324));
            } else if (i4 == ngc.oneme_chat_action_close_chat) {
                xag.h(ov2.G0, d32.c(j));
            } else if (i4 == ngc.oneme_chat_action_close_channel) {
                xag.h(ov2.G0, d32.b(j));
            } else if (i4 == ngc.oneme_chat_action_block) {
                KProperty[] kPropertyArr5 = ov2.O0;
                a32 a325 = (a32) ((my2) ov2.k()).o(j).a.getValue();
                if ((a325 != null ? a325.m() : null) != null) {
                    xag.h(ov2.G0, d32.a(a325));
                }
            } else if (i4 == ngc.oneme_chat_action_add_favorite) {
                akd akd = (akd) ((bud) ov2.X.getValue());
                akd.getClass();
                int r = (int) akd.r(PmsKey.f65maxfavoritechats, (long) 5);
                int L = ((my2) ov2.k()).n().L();
                s85 s85 = ov2.G0;
                if (L < r) {
                    r62 n = ((my2) ov2.k()).n();
                    n.getClass();
                    z68.c("r62", "addToFavorites: " + j, new Object[0]);
                    n.k0(j, System.currentTimeMillis(), true);
                    xag.h(s85, new Object());
                } else {
                    xag.h(s85, new q8e(new kgf(qad.u2, ArraysKt.toList((T[]) new Object[]{Boxing.boxInt(r)}))));
                }
            } else if (i4 == ngc.oneme_chat_action_remove_favorite) {
                KProperty[] kPropertyArr6 = ov2.O0;
                ((my2) ov2.k()).n().f0(j, true);
            } else if (i4 == ngc.oneme_chat_action_mark_as_unread) {
                KProperty[] kPropertyArr7 = ov2.O0;
                a32 a326 = (a32) ((my2) ov2.k()).o(j).a.getValue();
                if (a326 == null) {
                    return Unit.INSTANCE;
                }
                ysc ysc = (ysc) ov2.x0.getValue();
                a32 D = ysc.a().D(a326.b.a);
                if (D != null) {
                    ysc.c(D);
                }
            } else if (i4 == ngc.oneme_chat_action_mark_as_read) {
                KProperty[] kPropertyArr8 = ov2.O0;
                a32 a327 = (a32) ((my2) ov2.k()).o(j).a.getValue();
                if (a327 == null) {
                    return Unit.INSTANCE;
                }
                ((ysc) ov2.x0.getValue()).b(a327);
            } else if (i4 == ngc.oneme_chat_action_unmute) {
                KProperty[] kPropertyArr9 = ov2.O0;
                ((my2) ov2.k()).n().q0(j);
            } else if (i4 == ngc.oneme_chat_action_mute) {
                KProperty[] kPropertyArr10 = ov2.O0;
                a32 a328 = (a32) ((my2) ov2.k()).o(j).a.getValue();
                if (a328 == null) {
                    return Unit.INSTANCE;
                }
                xag.h(ov2.G0, d32.l(a328));
            } else if (i4 == ngc.oneme_chat_action_select) {
                xag.h(ov2.G0, d32.m());
            } else if (i4 == ngc.oneme_chat_action_move_rights_and_leave) {
                KProperty[] kPropertyArr11 = ov2.O0;
                a32 a329 = (a32) ((my2) ov2.k()).o(j).a.getValue();
                if (a329 == null) {
                    return Unit.INSTANCE;
                }
                boolean K = a329.K();
                s85 s852 = ov2.F0;
                if (K) {
                    xag.h(s852, new rt9(j));
                } else {
                    ox2.b.getClass();
                    a81.r(":profile/change-owner?chat_id=" + j + "&leave_chat=true", s852);
                }
            } else {
                int i5 = ngc.oneme_confirm_delete;
                long j2 = this.o;
                if (i4 == i5) {
                    e1d.a((e1d) ov2.y.getValue(), j2);
                } else if (i4 == ngc.oneme_confirm_delete_for_all) {
                    e1d.a((e1d) ov2.y.getValue(), j2);
                } else if (i4 == ngc.oneme_confirm_leave) {
                    KProperty[] kPropertyArr12 = ov2.O0;
                    ((my2) ov2.k()).n().X(j);
                } else if (i4 == ngc.oneme_confirm_block) {
                    KProperty[] kPropertyArr13 = ov2.O0;
                    a32 a3210 = (a32) ((my2) ov2.k()).o(j).a.getValue();
                    if (a3210 == null || (m = a3210.m()) == null) {
                        return Unit.INSTANCE;
                    }
                    long r2 = m.r();
                    this.a = 1;
                    if (((hl3) ov2.y0.getValue()).a(r2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i4 == ngc.oneme_confirm_mute_1_hour) {
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(1, DurationUnit.HOURS);
                    this.a = 2;
                    if (ov2.j(ov2, j2, duration) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i4 == ngc.oneme_confirm_mute_4_hour) {
                    Duration.Companion companion2 = Duration.Companion;
                    long duration2 = DurationKt.toDuration(4, DurationUnit.HOURS);
                    this.a = 3;
                    if (ov2.j(ov2, j2, duration2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i4 == ngc.oneme_confirm_mute_1_day) {
                    Duration.Companion companion3 = Duration.Companion;
                    long duration3 = DurationKt.toDuration(1, DurationUnit.DAYS);
                    this.a = 4;
                    if (ov2.j(ov2, j2, duration3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i4 == ngc.oneme_confirm_mute_infinite) {
                    this.a = 5;
                    KProperty[] kPropertyArr14 = ov2.O0;
                    ((my2) ov2.k()).n().Y(j, -1);
                    if (Unit.INSTANCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
