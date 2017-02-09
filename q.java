package cn.itcast.util;

import java.util.List;
@SuppressWarnings("unchecked")
public class QueryResult {

	private int count;
	@SuppressWarnings("unchecked")
	private List list;

	
	public QueryResult(int count, List list) {
		this.count = count;
		this.list = list;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
}
