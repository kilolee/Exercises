package other;

import java.util.Arrays;
/**
 * 用数组实现一个栈
 * @author ASUS
 *
 */
public class Q037 {

	public static class Stack {
		// 栈的内容
		private Object[] data;
		// 栈内的元素个数
		private int size = 0;

		public Stack() {
			data = new Object[0];
		}

		/**
		 * 判断栈是否满
		 * 
		 * @return
		 */
		public boolean isFull() {
			// 当数组长度与栈内元素个数相同或者数组长度为0并且元素个数为0时
			return (data.length == size) || (data.length == 0 && size == 0);
		}

		/**
		 * 判断栈是否空
		 * 
		 * @return
		 */
		public boolean isEmpty() {
			return size == 0;
		}

		/**
		 * 数组扩容10个
		 */
		public void increData() {
			data = Arrays.copyOf(data, data.length + 10);
		}

		/**
		 * 入栈操作
		 * 
		 * @param obj
		 */
		public void push(Object obj) {
			if (isFull()) {
				increData();
			}
			size++;
			data[size - 1] = obj;
		}

		/**
		 * 出栈操作
		 * 
		 * @return
		 */
		public Object pop() {
			Object object = data[size - 1];
			data[size - 1] = null;
			size--;
			return object;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(1);
		stack.push("123");
		stack.push("helloWorld");
		Object object = stack.pop();
		System.out.println(object);
		object = stack.pop();
		System.out.println(object);
		object = stack.pop();
		System.out.println(object);
	}

}
