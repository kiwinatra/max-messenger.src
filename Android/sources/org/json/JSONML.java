package org.json;

import kotlin.text.Typography;

public class JSONML {
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0170, code lost:
        r7 = r9.nextToken();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0176, code lost:
        if ((r7 instanceof java.lang.String) == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0178, code lost:
        r7 = (java.lang.String) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x017a, code lost:
        if (r12 == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018c, code lost:
        throw r9.syntaxError("Missing value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0181, code lost:
        r7 = org.json.XML.stringToValue(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0181, code lost:
        r7 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object parse(org.json.XMLTokener r9, boolean r10, org.json.JSONArray r11, boolean r12) throws org.json.JSONException {
        /*
        L_0x0000:
            boolean r0 = r9.more()
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r0 = r9.nextContent()
            java.lang.Character r1 = org.json.XML.LT
            if (r0 != r1) goto L_0x01b0
            java.lang.Object r0 = r9.nextToken()
            boolean r1 = r0 instanceof java.lang.Character
            java.lang.String r2 = "'."
            java.lang.String r3 = "Misshaped tag"
            if (r1 == 0) goto L_0x00c0
            java.lang.Character r1 = org.json.XML.SLASH
            if (r0 != r1) goto L_0x004d
            java.lang.Object r10 = r9.nextToken()
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L_0x0036
            java.lang.Object r11 = r9.nextToken()
            java.lang.Character r12 = org.json.XML.GT
            if (r11 != r12) goto L_0x002f
            return r10
        L_0x002f:
            java.lang.String r10 = "Misshaped close tag"
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x0036:
            org.json.JSONException r9 = new org.json.JSONException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Expected a closing name instead of '"
            r11.<init>(r12)
            r11.append(r10)
            r11.append(r2)
            java.lang.String r10 = r11.toString()
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x004d:
            java.lang.Character r1 = org.json.XML.BANG
            if (r0 != r1) goto L_0x00b0
            char r0 = r9.next()
            r1 = 45
            if (r0 != r1) goto L_0x0069
            char r0 = r9.next()
            if (r0 != r1) goto L_0x0065
            java.lang.String r0 = "-->"
            r9.skipPast(r0)
            goto L_0x0000
        L_0x0065:
            r9.back()
            goto L_0x0000
        L_0x0069:
            r1 = 91
            if (r0 != r1) goto L_0x0091
            java.lang.Object r0 = r9.nextToken()
            java.lang.String r2 = "CDATA"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x008a
            char r0 = r9.next()
            if (r0 != r1) goto L_0x008a
            if (r11 == 0) goto L_0x0000
            java.lang.String r0 = r9.nextCDATA()
            r11.put((java.lang.Object) r0)
            goto L_0x0000
        L_0x008a:
            java.lang.String r10 = "Expected 'CDATA['"
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x0091:
            r0 = 1
        L_0x0092:
            java.lang.Object r1 = r9.nextMeta()
            if (r1 == 0) goto L_0x00a9
            java.lang.Character r2 = org.json.XML.LT
            if (r1 != r2) goto L_0x009f
            int r0 = r0 + 1
            goto L_0x00a5
        L_0x009f:
            java.lang.Character r2 = org.json.XML.GT
            if (r1 != r2) goto L_0x00a5
            int r0 = r0 + -1
        L_0x00a5:
            if (r0 > 0) goto L_0x0092
            goto L_0x0000
        L_0x00a9:
            java.lang.String r10 = "Missing '>' after '<!'."
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x00b0:
            java.lang.Character r1 = org.json.XML.QUEST
            if (r0 != r1) goto L_0x00bb
            java.lang.String r0 = "?>"
            r9.skipPast(r0)
            goto L_0x0000
        L_0x00bb:
            org.json.JSONException r9 = r9.syntaxError(r3)
            throw r9
        L_0x00c0:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x019a
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r4 = "tagName"
            if (r10 == 0) goto L_0x00dd
            r1.put((java.lang.Object) r0)
            if (r11 == 0) goto L_0x00e5
            r11.put((java.lang.Object) r1)
            goto L_0x00e5
        L_0x00dd:
            r2.put((java.lang.String) r4, (java.lang.Object) r0)
            if (r11 == 0) goto L_0x00e5
            r11.put((java.lang.Object) r2)
        L_0x00e5:
            r5 = 0
        L_0x00e6:
            r6 = r5
        L_0x00e7:
            if (r6 != 0) goto L_0x00ed
            java.lang.Object r6 = r9.nextToken()
        L_0x00ed:
            if (r6 == 0) goto L_0x0195
            boolean r7 = r6 instanceof java.lang.String
            if (r7 != 0) goto L_0x014e
            if (r10 == 0) goto L_0x00fe
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x00fe
            r1.put((java.lang.Object) r2)
        L_0x00fe:
            java.lang.Character r4 = org.json.XML.SLASH
            if (r6 != r4) goto L_0x0115
            java.lang.Object r0 = r9.nextToken()
            java.lang.Character r4 = org.json.XML.GT
            if (r0 != r4) goto L_0x0110
            if (r11 != 0) goto L_0x0000
            if (r10 == 0) goto L_0x010f
            return r1
        L_0x010f:
            return r2
        L_0x0110:
            org.json.JSONException r9 = r9.syntaxError(r3)
            throw r9
        L_0x0115:
            java.lang.Character r4 = org.json.XML.GT
            if (r6 != r4) goto L_0x0149
            java.lang.Object r3 = parse(r9, r10, r1, r12)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0000
            boolean r4 = r3.equals(r0)
            if (r4 == 0) goto L_0x013a
            if (r10 != 0) goto L_0x0134
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0134
            java.lang.String r0 = "childNodes"
            r2.put((java.lang.String) r0, (java.lang.Object) r1)
        L_0x0134:
            if (r11 != 0) goto L_0x0000
            if (r10 == 0) goto L_0x0139
            return r1
        L_0x0139:
            return r2
        L_0x013a:
            java.lang.String r10 = "Mismatched '"
            java.lang.String r11 = "' and '"
            java.lang.String r12 = "'"
            java.lang.String r10 = defpackage.rae.p(r10, r0, r11, r3, r12)
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x0149:
            org.json.JSONException r9 = r9.syntaxError(r3)
            throw r9
        L_0x014e:
            java.lang.String r6 = (java.lang.String) r6
            if (r10 != 0) goto L_0x0168
            boolean r7 = r4.equals(r6)
            if (r7 != 0) goto L_0x0161
            java.lang.String r7 = "childNode"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x0161
            goto L_0x0168
        L_0x0161:
            java.lang.String r10 = "Reserved attribute."
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x0168:
            java.lang.Object r7 = r9.nextToken()
            java.lang.Character r8 = org.json.XML.EQ
            if (r7 != r8) goto L_0x018d
            java.lang.Object r7 = r9.nextToken()
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x0186
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x017d
            goto L_0x0181
        L_0x017d:
            java.lang.Object r7 = org.json.XML.stringToValue(r7)
        L_0x0181:
            r2.accumulate(r6, r7)
            goto L_0x00e6
        L_0x0186:
            java.lang.String r10 = "Missing value"
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x018d:
            java.lang.String r8 = ""
            r2.accumulate(r6, r8)
            r6 = r7
            goto L_0x00e7
        L_0x0195:
            org.json.JSONException r9 = r9.syntaxError(r3)
            throw r9
        L_0x019a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Bad tagName '"
            r10.<init>(r11)
            r10.append(r0)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x01b0:
            if (r11 == 0) goto L_0x0000
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x01c5
            if (r12 == 0) goto L_0x01bf
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = org.json.XML.unescape(r0)
            goto L_0x01c5
        L_0x01bf:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = org.json.XML.stringToValue(r0)
        L_0x01c5:
            r11.put((java.lang.Object) r0)
            goto L_0x0000
        L_0x01ca:
            java.lang.String r10 = "Bad XML"
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONML.parse(org.json.XMLTokener, boolean, org.json.JSONArray, boolean):java.lang.Object");
    }

    public static JSONArray toJSONArray(String str) throws JSONException {
        return (JSONArray) parse(new XMLTokener(str), true, (JSONArray) null, false);
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        return (JSONObject) parse(new XMLTokener(str), false, (JSONArray) null, false);
    }

    public static String toString(JSONArray jSONArray) throws JSONException {
        int i;
        StringBuilder sb = new StringBuilder("<");
        String string = jSONArray.getString(0);
        XML.noSpace(string);
        String escape = XML.escape(string);
        sb.append(escape);
        Object opt = jSONArray.opt(1);
        if (opt instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) opt;
            for (String next : jSONObject.keySet()) {
                Object opt2 = jSONObject.opt(next);
                XML.noSpace(next);
                if (opt2 != null) {
                    sb.append(' ');
                    sb.append(XML.escape(next));
                    sb.append("=\"");
                    sb.append(XML.escape(opt2.toString()));
                    sb.append(Typography.quote);
                }
            }
            i = 2;
        } else {
            i = 1;
        }
        int length = jSONArray.length();
        if (i >= length) {
            sb.append("/>");
        } else {
            sb.append(Typography.greater);
            do {
                Object obj = jSONArray.get(i);
                i++;
                if (obj != null) {
                    if (obj instanceof String) {
                        sb.append(XML.escape(obj.toString()));
                        continue;
                    } else if (obj instanceof JSONObject) {
                        sb.append(toString((JSONObject) obj));
                        continue;
                    } else if (obj instanceof JSONArray) {
                        sb.append(toString((JSONArray) obj));
                        continue;
                    } else {
                        sb.append(obj.toString());
                        continue;
                    }
                }
            } while (i < length);
            sb.append("</");
            sb.append(escape);
            sb.append(Typography.greater);
        }
        return sb.toString();
    }

    public static JSONArray toJSONArray(String str, boolean z) throws JSONException {
        return (JSONArray) parse(new XMLTokener(str), true, (JSONArray) null, z);
    }

    public static JSONObject toJSONObject(String str, boolean z) throws JSONException {
        return (JSONObject) parse(new XMLTokener(str), false, (JSONArray) null, z);
    }

    public static JSONArray toJSONArray(XMLTokener xMLTokener, boolean z) throws JSONException {
        return (JSONArray) parse(xMLTokener, true, (JSONArray) null, z);
    }

    public static JSONObject toJSONObject(XMLTokener xMLTokener) throws JSONException {
        return (JSONObject) parse(xMLTokener, false, (JSONArray) null, false);
    }

    public static JSONArray toJSONArray(XMLTokener xMLTokener) throws JSONException {
        return (JSONArray) parse(xMLTokener, true, (JSONArray) null, false);
    }

    public static JSONObject toJSONObject(XMLTokener xMLTokener, boolean z) throws JSONException {
        return (JSONObject) parse(xMLTokener, false, (JSONArray) null, z);
    }

    public static String toString(JSONObject jSONObject) throws JSONException {
        StringBuilder sb = new StringBuilder();
        String optString = jSONObject.optString("tagName");
        if (optString == null) {
            return XML.escape(jSONObject.toString());
        }
        XML.noSpace(optString);
        String escape = XML.escape(optString);
        sb.append(Typography.less);
        sb.append(escape);
        for (String next : jSONObject.keySet()) {
            if (!"tagName".equals(next) && !"childNodes".equals(next)) {
                XML.noSpace(next);
                Object opt = jSONObject.opt(next);
                if (opt != null) {
                    sb.append(' ');
                    sb.append(XML.escape(next));
                    sb.append("=\"");
                    sb.append(XML.escape(opt.toString()));
                    sb.append(Typography.quote);
                }
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childNodes");
        if (optJSONArray == null) {
            sb.append("/>");
        } else {
            sb.append(Typography.greater);
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = optJSONArray.get(i);
                if (obj != null) {
                    if (obj instanceof String) {
                        sb.append(XML.escape(obj.toString()));
                    } else if (obj instanceof JSONObject) {
                        sb.append(toString((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        sb.append(toString((JSONArray) obj));
                    } else {
                        sb.append(obj.toString());
                    }
                }
            }
            sb.append("</");
            sb.append(escape);
            sb.append(Typography.greater);
        }
        return sb.toString();
    }
}
