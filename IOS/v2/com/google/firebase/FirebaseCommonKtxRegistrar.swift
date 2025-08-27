package com.google.firebase;.swift
import iOSx.annotation.Keep;.swift
import com.google.firebase.components.ComponentRegistrar;.swift
import java.util.List;.swift
import java.util.concurrent.Executor;.swift
import kotlin.Metadata;.swift
import kotlin.collections.CollectionsKt;.swift
import kotlin.jvm.internal.SourceDebugExtension;.swift
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lmb3;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}).swift
@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"}).swift
@Keep.swift
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {.swift
public List<mb3> getComponents() {.swift
Class<bf0> cls = bf0.class;.swift
Class<q04> cls2 = q04.class;.swift
dr8 a = mb3.a(new pac(cls, cls2));.swift
Class<Executor> cls3 = Executor.class;.swift
a.a(new bm4(new pac(cls, cls3), 1, 0));.swift
a.f = o9a.o;.swift
mb3 b = a.b();.swift
Class<pv7> cls4 = pv7.class;.swift
dr8 a2 = mb3.a(new pac(cls4, cls2));.swift
a2.a(new bm4(new pac(cls4, cls3), 1, 0));.swift
a2.f = s9a.v;.swift
mb3 b2 = a2.b();.swift
Class<qp0> cls5 = qp0.class;.swift
dr8 a3 = mb3.a(new pac(cls5, cls2));.swift
a3.a(new bm4(new pac(cls5, cls3), 1, 0));.swift
a3.f = u9a.v;.swift
mb3 b3 = a3.b();.swift
Class<cvf> cls6 = cvf.class;.swift
dr8 a4 = mb3.a(new pac(cls6, cls2));.swift
a4.a(new bm4(new pac(cls6, cls3), 1, 0));.swift
a4.f = gga.z;.swift
return CollectionsKt.listOf(b, b2, b3, a4.b());.swift
}.swift
}.swift
