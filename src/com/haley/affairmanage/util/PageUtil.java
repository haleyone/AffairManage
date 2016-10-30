package com.haley.affairmanage.util;

public class PageUtil {
	public static Page createPage(int everyPage, int totalCount, int currentPage){
		everyPage = getEveryPage(everyPage);
		currentPage = getCurrentPage(currentPage);
		int totalPage = getTotalPage(everyPage,totalCount);
		int beginIndex = getBeginIndex(everyPage,currentPage);
		boolean hasPrePage = getHasPrePage(currentPage);
		boolean hasNextPage = getHasNextPage(totalPage,currentPage);
		return new Page(everyPage,totalCount,totalPage,currentPage,beginIndex,hasPrePage,hasNextPage);
		
	}

	public static boolean getHasNextPage(int totalPage, int currentPage) {
		// TODO Auto-generated method stub
		return currentPage == totalPage || totalPage == 0 ? false:true;
	}

	public static boolean getHasPrePage(int currentPage) {
		// TODO Auto-generated method stub
		return currentPage == 1 ? false : true;
	}

	public static int getBeginIndex(int everyPage, int currentPage) {
		// TODO Auto-generated method stub
		return (currentPage-1) * everyPage;
	}

	public static int getTotalPage(int everyPage, int totalCount) {
		int totalPage = 0;
		if(totalCount !=0 && totalCount % everyPage ==0){
			totalPage = totalCount / everyPage;
		}else{
			totalPage = totalCount / everyPage + 1;
		}
		return totalPage;
	}

	public static int getCurrentPage(int currentPage) {
		// TODO Auto-generated method stub
		return currentPage == 0 ? 1 : currentPage;
	}

	public static int getEveryPage(int everyPage) {
		// TODO Auto-generated method stub
		return everyPage == 0?10:everyPage;
	}
}