package com.ahc.fpldatasite.services;

import org.jsoup.nodes.Element;

import java.io.IOException;

public interface TableParserService {
	String getTable(String url) throws IOException;

	Element getTableElement(String url) throws IOException;
}
