package com.poscoict.guestbook.dao.test;

import java.util.List;

import com.poscoict.guestbook.dao.GuestbookDao;
import com.poscoict.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		//testFindAll();
//		testInsert();
		testDelete();
		
	}
	
	
	private static void testInsert() {
		GuestbookVo vo = new GuestbookVo();
		
		vo.setName("김선혁");
		vo.setPassword("1234");
		vo.setMesssage("ㅎㅇㅎㅇ");
		
		
		boolean result = new GuestbookDao().insert(vo);
		System.out.println(result ? "success" : "fail");
	}
	
	
	private static boolean testFindAll() {
		List<GuestbookVo> list = new GuestbookDao().findAll();
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}

		return list.size() == 3;
	}
	
	private static void testDelete()	{
		GuestbookVo vo = new GuestbookVo();
		vo.setPassword("1234");
		vo.setNo(7);
		
		boolean result = new GuestbookDao().delete(vo);
		System.out.println(result ? "success" : "fail");

	}
	

	
}
