package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: d32  reason: default package */
public abstract class d32 {
    public static final pg3 a = new pg3(hra.R, new igf(jra.a), og3.b);
    public static final Lazy b = LazyKt.lazy(new lj1(23));

    public static i8e a(a32 a32) {
        long j = a32.a;
        int i = jra.E;
        vk3 m = a32.m();
        String f = m != null ? m.f() : null;
        if (f != null) {
            return new i8e(j, new kgf(i, ArraysKt.toList((T[]) new Object[]{f})), new igf(qad.N1), CollectionsKt.listOf(new pg3(hra.Q, new igf(jra.A), og3.a), a));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static i8e b(long j) {
        return new i8e(j, new igf(jra.b), (ngf) null, CollectionsKt.listOf(new pg3(hra.T, new igf(jra.B), og3.a), a));
    }

    public static i8e c(long j) {
        return new i8e(j, new igf(jra.j), (ngf) null, CollectionsKt.listOf(new pg3(hra.T, new igf(jra.i), og3.a), a));
    }

    public static i8e d(a32 a32) {
        long j = a32.a;
        int i = jra.d;
        a32.l0();
        kgf kgf = new kgf(i, ArraysKt.toList((T[]) new Object[]{a32.X}));
        igf igf = new igf(qad.K0);
        int i2 = hra.I;
        igf igf2 = new igf(jra.f);
        og3 og3 = og3.a;
        return new i8e(j, kgf, igf, CollectionsKt.listOf(new pg3(i2, igf2, og3), new pg3(hra.B, new igf(jra.c), og3), a));
    }

    public static i8e e(a32 a32) {
        long j = a32.a;
        int i = jra.m;
        a32.l0();
        return new i8e(j, new kgf(i, ArraysKt.toList((T[]) new Object[]{a32.X})), (ngf) null, CollectionsKt.listOf(new pg3(hra.S, new igf(jra.h), og3.a), a));
    }

    public static i8e f(a32 a32) {
        long j = a32.a;
        int i = jra.m;
        a32.l0();
        kgf kgf = new kgf(i, ArraysKt.toList((T[]) new Object[]{a32.X}));
        igf igf = new igf(qad.q1);
        int i2 = hra.I;
        igf igf2 = new igf(jra.r);
        og3 og3 = og3.a;
        return new i8e(j, kgf, igf, CollectionsKt.listOf(new pg3(i2, igf2, og3), new pg3(hra.C, new igf(jra.k), og3), a));
    }

    public static i8e g(a32 a32) {
        long j = a32.a;
        int i = jra.K;
        a32.l0();
        kgf kgf = new kgf(i, ArraysKt.toList((T[]) new Object[]{a32.X}));
        igf igf = new igf(qad.R0);
        int i2 = hra.S;
        igf igf2 = new igf(jra.l);
        og3 og3 = og3.a;
        return new i8e(j, kgf, igf, CollectionsKt.listOf(new pg3(i2, igf2, og3), new pg3(hra.T, new igf(jra.k), og3), a));
    }

    public static i8e h(a32 a32) {
        long j = a32.a;
        int i = jra.e;
        a32.l0();
        return new i8e(j, new kgf(i, ArraysKt.toList((T[]) new Object[]{a32.X})), (ngf) null, CollectionsKt.listOf(new pg3(hra.U, new igf(jra.C), og3.a), a));
    }

    public static i8e i(a32 a32) {
        long j = a32.a;
        int i = jra.e;
        a32.l0();
        return new i8e(j, new kgf(i, ArraysKt.toList((T[]) new Object[]{a32.X})), (ngf) null, CollectionsKt.listOf(new pg3(hra.I, new igf(jra.f), og3.a), a));
    }

    public static i8e j(a32 a32) {
        long j = a32.a;
        int i = jra.o;
        a32.l0();
        return new i8e(j, new kgf(i, ArraysKt.toList((T[]) new Object[]{a32.X})), (ngf) null, CollectionsKt.listOf(new pg3(hra.U, new igf(jra.D), og3.a), (pg3) b.getValue()));
    }

    public static i8e k(a32 a32) {
        long j = a32.a;
        int i = jra.o;
        a32.l0();
        return new i8e(j, new kgf(i, ArraysKt.toList((T[]) new Object[]{a32.X})), (ngf) null, CollectionsKt.listOf(new pg3(hra.I, new igf(jra.r), og3.a), (pg3) b.getValue()));
    }

    public static i8e l(a32 a32) {
        igf igf = new igf(jra.O);
        int i = hra.W;
        igf igf2 = new igf(jra.M);
        og3 og3 = og3.c;
        return new i8e(a32.a, igf, (ngf) null, CollectionsKt.listOf(new pg3(i, igf2, og3), new pg3(hra.X, new igf(jra.N), og3), new pg3(hra.V, new igf(jra.L), og3), new pg3(hra.Y, new igf(jra.P), og3.a), a));
    }

    public static i8e m() {
        return new i8e(LongCompanionObject.MAX_VALUE, new mgf("Действие находится в разработке!"), new mgf("Возвращайтесь позже :)"), CollectionsKt.listOf(new pg3(IntCompanionObject.MIN_VALUE, new mgf("Вернусь позже"), og3.c)));
    }
}
