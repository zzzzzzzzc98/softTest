package demo;

import demo.StringDemo;
import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testStringDemo1 extends TestCase {
		private StringDemo str;
		protected void setUp(){
			str = new StringDemo();
		}	
		public void testSmallString1() {
			assertEquals("һ����д��ĸ��Сд",str.smallString("A"),"a");
			
		}
		public void testSmallString2() {
			assertEquals("һ��Сд��ĸ��Сд",str.smallString("b"),"b");
			
		}
		public void testSmallString3() {
			assertEquals("һ��Сд��ĸ���д",str.smallString("a"),"A");
			
		}
		public void testSmallString4() {
			assertEquals("������д��ĸ��Сд",str.smallString("AB"),"ab");
			
		}
		public void testSmallString5() {
			assertEquals("����Сд��ĸ��Сд",str.smallString("ab"),"ab");
			
		}
		public void testSmallString6() {
			assertEquals("������д��ĸ�����Сд",str.smallString("BA"),"ab");
			
		}
		public void testSmallString7() {
			assertEquals("һ����д��ĸһ��Сд��ĸ��Сд",str.smallString("Ab"),"ab");
			
		}
		public void testSmallString8() {
			assertEquals("һ����д��ĸһ��Сд��ĸ���д",str.smallString("Ab"),"AB");
			
		}
		public void testSmallString9() {
			assertEquals("һ���ַ�����Сд�ַ���",str.smallString("ZZC IS HANDSOME"),"zzc is handsome");
			
		}
		public void testSmallString10() {
			assertEquals("һ���ַ������д�ַ���",str.smallString("Zzc is handsome"),"zzc is handsome");
		}

}
