package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\"\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00078BX\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "typeToString", "", "type", "computeJavaType", "forceWrapper", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1557#3:232\n1628#3,3:233\n1557#3:236\n1628#3,3:237\n1557#3:240\n1628#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class TypesJVMKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.TypesJVMKt.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    @ExperimentalStdlibApi
    public static final Type computeJavaType(KType kType, boolean z) {
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) classifier);
        }
        if (classifier instanceof KClass) {
            KClass kClass = (KClass) classifier;
            Class javaObjectType = z ? JvmClassMappingKt.getJavaObjectType(kClass) : JvmClassMappingKt.getJavaClass(kClass);
            List<KTypeProjection> arguments = kType.getArguments();
            if (arguments.isEmpty()) {
                return javaObjectType;
            }
            if (!javaObjectType.isArray()) {
                return createPossiblyInnerType(javaObjectType, arguments);
            }
            if (javaObjectType.getComponentType().isPrimitive()) {
                return javaObjectType;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.singleOrNull(arguments);
            if (kTypeProjection != null) {
                KVariance component1 = kTypeProjection.component1();
                KType component2 = kTypeProjection.component2();
                int i = component1 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[component1.ordinal()];
                if (i == -1 || i == 1) {
                    return javaObjectType;
                }
                if (i == 2 || i == 3) {
                    Type computeJavaType$default = computeJavaType$default(component2, false, 1, (Object) null);
                    return computeJavaType$default instanceof Class ? javaObjectType : new GenericArrayTypeImpl(computeJavaType$default);
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
    }

    public static /* synthetic */ Type computeJavaType$default(KType kType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return computeJavaType(kType, z);
    }

    @ExperimentalStdlibApi
    private static final Type createPossiblyInnerType(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            Iterable<KTypeProjection> iterable = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (KTypeProjection javaType : iterable) {
                arrayList.add(getJavaType(javaType));
            }
            return new ParameterizedTypeImpl(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            Iterable<KTypeProjection> iterable2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
            for (KTypeProjection javaType2 : iterable2) {
                arrayList2.add(getJavaType(javaType2));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type createPossiblyInnerType = createPossiblyInnerType(declaringClass, list.subList(length, list.size()));
            Iterable<KTypeProjection> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10));
            for (KTypeProjection javaType3 : subList) {
                arrayList3.add(getJavaType(javaType3));
            }
            return new ParameterizedTypeImpl(cls, createPossiblyInnerType, arrayList3);
        }
    }

    public static final Type getJavaType(KType kType) {
        Type javaType;
        if (!(kType instanceof KTypeBase) || (javaType = ((KTypeBase) kType).getJavaType()) == null) {
            return computeJavaType$default(kType, false, 1, (Object) null);
        }
        return javaType;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    @LowPriorityInOverloadResolution
    public static /* synthetic */ void getJavaType$annotations(KType kType) {
    }

    /* access modifiers changed from: private */
    public static final String typeToString(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        Sequence generateSequence = SequencesKt.generateSequence(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        return ((Class) SequencesKt.last(generateSequence)).getName() + StringsKt__StringsJVMKt.repeat("[]", SequencesKt.count(generateSequence));
    }

    @ExperimentalStdlibApi
    private static /* synthetic */ void getJavaType$annotations(KTypeProjection kTypeProjection) {
    }

    private static final Type getJavaType(KTypeProjection kTypeProjection) {
        KVariance variance = kTypeProjection.getVariance();
        if (variance == null) {
            return WildcardTypeImpl.Companion.getSTAR();
        }
        KType type = kTypeProjection.getType();
        int i = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            return new WildcardTypeImpl((Type) null, computeJavaType(type, true));
        }
        if (i == 2) {
            return computeJavaType(type, true);
        }
        if (i == 3) {
            return new WildcardTypeImpl(computeJavaType(type, true), (Type) null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
