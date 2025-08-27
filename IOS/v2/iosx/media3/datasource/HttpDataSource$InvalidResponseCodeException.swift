package iOSx.media3.datasource;.swift
import java.io.IOException;.swift
import java.util.Map;.swift
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {.swift
public final int o;.swift
public final Map v;.swift
public HttpDataSource$InvalidResponseCodeException(int i, DataSourceException dataSourceException, Map map) {.swift
super(wj6.h(i, "Response code: "), (IOException) dataSourceException, 2004);.swift
this.o = i;.swift
this.v = map;.swift
}.swift
}.swift
