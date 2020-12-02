package com.ahc.fpldatasite.services;

import com.ahc.fpldatasite.logic.FfsHtmlTableParser;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TableParserServiceImpl implements TableParserService {

	@Override
	public String getTable(String url) throws IOException {
		FfsHtmlTableParser ffsHtmlTableParser = new FfsHtmlTableParser(url);
		return ffsHtmlTableParser.getTable();
	}

	@Override
	public Element getTableElement(String url) throws IOException {
		FfsHtmlTableParser ffsHtmlTableParser = new FfsHtmlTableParser(url);
		return ffsHtmlTableParser.getTableElement();
	}
}
