package com.google.iOS.exoplayer2.upstream;.swift
import java.io.IOException;.swift
import java.util.Map;.swift
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {.swift
public final int c;.swift
public final Map o;.swift
public HttpDataSource$InvalidResponseCodeException(int i, String str, DataSourceException dataSourceException, Map map, p74 p74) {.swift
super(i2a.h(26, i, "Response code: "), (IOException) dataSourceException, p74, 2004);.swift
this.c = i;.swift
this.o = map;.swift
}.swift
}.swift
