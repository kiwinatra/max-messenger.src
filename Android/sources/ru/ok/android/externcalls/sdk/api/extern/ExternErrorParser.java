package ru.ok.android.externcalls.sdk.api.extern;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser;", "", "Lvoc;", "log", "<init>", "(Lvoc;)V", "Lru/ok/android/api/core/ApiInvocationException;", "exception", "", "parseErrorCode", "(Lru/ok/android/api/core/ApiInvocationException;)I", "", "parseExtendedError", "(Lru/ok/android/api/core/ApiInvocationException;)Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "parse", "(Lru/ok/android/api/core/ApiInvocationException;)Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "Lvoc;", "Companion", "ErrorDescription", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nExternErrorParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternErrorParser.kt\nru/ok/android/externcalls/sdk/api/extern/ExternErrorParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n731#2,9:60\n37#3,2:69\n1#4:71\n*S KotlinDebug\n*F\n+ 1 ExternErrorParser.kt\nru/ok/android/externcalls/sdk/api/extern/ExternErrorParser\n*L\n33#1:60,9\n33#1:69,2\n*E\n"})
public final class ExternErrorParser {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LOG_TAG = "ExternErrorParser";
    private final voc log;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "", "errorCode", "", "extendedError", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getExtendedError", "()Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorDescription {
        private final int errorCode;
        private final String extendedError;

        public ErrorDescription(int i, String str) {
            this.errorCode = i;
            this.extendedError = str;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getExtendedError() {
            return this.extendedError;
        }
    }

    public ExternErrorParser(voc voc) {
        this.log = voc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[Catch:{ NumberFormatException -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int parseErrorCode(ru.ok.android.api.core.ApiInvocationException r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r5 = r5.b     // Catch:{ NumberFormatException -> 0x003e }
            if (r5 == 0) goto L_0x006a
            kotlin.text.Regex r1 = new kotlin.text.Regex     // Catch:{ NumberFormatException -> 0x003e }
            java.lang.String r2 = " : "
            r1.<init>((java.lang.String) r2)     // Catch:{ NumberFormatException -> 0x003e }
            java.util.List r5 = r1.split(r5, r0)     // Catch:{ NumberFormatException -> 0x003e }
            boolean r1 = r5.isEmpty()     // Catch:{ NumberFormatException -> 0x003e }
            r2 = 1
            if (r1 != 0) goto L_0x0040
            int r1 = r5.size()     // Catch:{ NumberFormatException -> 0x003e }
            java.util.ListIterator r1 = r5.listIterator(r1)     // Catch:{ NumberFormatException -> 0x003e }
        L_0x001f:
            boolean r3 = r1.hasPrevious()     // Catch:{ NumberFormatException -> 0x003e }
            if (r3 == 0) goto L_0x0040
            java.lang.Object r3 = r1.previous()     // Catch:{ NumberFormatException -> 0x003e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NumberFormatException -> 0x003e }
            int r3 = r3.length()     // Catch:{ NumberFormatException -> 0x003e }
            if (r3 != 0) goto L_0x0032
            goto L_0x001f
        L_0x0032:
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ NumberFormatException -> 0x003e }
            int r1 = r1.nextIndex()     // Catch:{ NumberFormatException -> 0x003e }
            int r1 = r1 + r2
            java.util.List r5 = kotlin.collections.CollectionsKt.take(r5, r1)     // Catch:{ NumberFormatException -> 0x003e }
            goto L_0x0044
        L_0x003e:
            r5 = move-exception
            goto L_0x0061
        L_0x0040:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ NumberFormatException -> 0x003e }
        L_0x0044:
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ NumberFormatException -> 0x003e }
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ NumberFormatException -> 0x003e }
            java.lang.Object[] r5 = r5.toArray(r1)     // Catch:{ NumberFormatException -> 0x003e }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ NumberFormatException -> 0x003e }
            int r1 = r5.length     // Catch:{ NumberFormatException -> 0x003e }
            r3 = 2
            if (r1 < r3) goto L_0x006a
            r1 = r5[r2]     // Catch:{ NumberFormatException -> 0x003e }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NumberFormatException -> 0x003e }
            if (r1 != 0) goto L_0x006a
            r5 = r5[r2]     // Catch:{ NumberFormatException -> 0x003e }
            int r0 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x003e }
            goto L_0x006a
        L_0x0061:
            voc r4 = r4.log
            java.lang.String r1 = "ExternErrorParser"
            java.lang.String r2 = "errorcode.parse.failed"
            r4.reportException(r1, r2, r5)
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.api.extern.ExternErrorParser.parseErrorCode(ru.ok.android.api.core.ApiInvocationException):int");
    }

    private final String parseExtendedError(ApiInvocationException apiInvocationException) {
        try {
            String str = apiInvocationException.w;
            JSONObject jSONObject = str != null ? new JSONObject(str) : null;
            if (jSONObject != null) {
                return jSONObject.getString("extended_code");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final ErrorDescription parse(ApiInvocationException apiInvocationException) {
        return new ErrorDescription(parseErrorCode(apiInvocationException), parseExtendedError(apiInvocationException));
    }
}
