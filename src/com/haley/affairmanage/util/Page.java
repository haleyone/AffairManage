package com.haley.affairmanage.util;

public class Page {
	private int everyPage;               //ÿҳ��ʾ��¼��
	private int totalCount;               //�ܼ�¼��
	private int totalPage;               //��ҳ��
	private int currentPage;               //��ǰҳ
	private int beginIndex;               //��ѯ��ʼ��
	private boolean hasPrePage;               //�Ƿ�����һҳ
	private boolean hasNextPage;               //�Ƿ�����һҳ
	public Page(int everyPage, int totalCount, int totalPage, int currentPage, int beginIndex, boolean hasPrePage,
			boolean hasNextPage) {
		this.everyPage = everyPage;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.beginIndex = beginIndex;
		this.hasPrePage = hasPrePage;
		this.hasNextPage = hasNextPage;
	}
	
}
