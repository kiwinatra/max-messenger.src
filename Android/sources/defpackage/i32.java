package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.profile.screens.members.ChatAdminsScreen;

/* renamed from: i32  reason: default package */
public final /* synthetic */ class i32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAdminsScreen b;

    public /* synthetic */ i32(ChatAdminsScreen chatAdminsScreen, int i) {
        this.a = i;
        this.b = chatAdminsScreen;
    }

    public final Object invoke() {
        ChatAdminsScreen chatAdminsScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatAdminsScreen.Z;
                return new q32(chatAdminsScreen.d0());
            default:
                KProperty[] kPropertyArr2 = ChatAdminsScreen.Z;
                f fVar = new f(chatAdminsScreen.c0());
                s01 s01 = new s01(chatAdminsScreen.c0());
                long d0 = chatAdminsScreen.d0();
                jxb jxb = jxb.a;
                return new i49((Function1) fVar, (gh4) new h32(d0, jxb.c(), jxb.e(), jxb.getAccessor().h(ptb.class), jxb.d(), jxb.getAccessor().h(ttb.class), jxb.g()), (Function0) s01);
        }
    }
}
