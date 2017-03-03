package other;

import java.util.Arrays;
/**
 * ������ʵ��һ��ջ
 * @author ASUS
 *
 */
public class Q037 {

	public static class Stack {
		// ջ������
		private Object[] data;
		// ջ�ڵ�Ԫ�ظ���
		private int size = 0;

		public Stack() {
			data = new Object[0];
		}

		/**
		 * �ж�ջ�Ƿ���
		 * 
		 * @return
		 */
		public boolean isFull() {
			// �����鳤����ջ��Ԫ�ظ�����ͬ�������鳤��Ϊ0����Ԫ�ظ���Ϊ0ʱ
			return (data.length == size) || (data.length == 0 && size == 0);
		}

		/**
		 * �ж�ջ�Ƿ��
		 * 
		 * @return
		 */
		public boolean isEmpty() {
			return size == 0;
		}

		/**
		 * ��������10��
		 */
		public void increData() {
			data = Arrays.copyOf(data, data.length + 10);
		}

		/**
		 * ��ջ����
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
		 * ��ջ����
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
