/**
 * @Author: Dastan Alam harsh mahilang
 * @Date:   2025-02-11 12:26:19 AM   00:02
 * @Last Modified by:   Dastan Alam harsh mahilang
 * @Last Modified time: 2025-02-11 12:26:57 AM   00:02
 */


public class Elc {
    
		public static void main(String[] args) {
			NeoVector<String> vector=new NeoVector<>();
			vector.add("A");
			vector.add("B");
			vector.add("C");

			System.out.println("size of the vector is : "+vector.size());
			System.out.println("Capacity of the vector is : "+vector.capacity());

			for (int i = 0; i <15; i++) {
				vector.add("element :"+i);

			}

			System.out.println("size of the vector is : "+vector.size());
			System.out.println("Capacity of the vector is : "+vector.capacity());

			System.out.println("is my vector is empty "+vector.isEmpty());


			System.out.println("orginal vector"+vector);

			System.out.println("fist postition element "+vector.get(0));

			vector.remove(2);
			System.out.println("after remove vector"+vector);
		}
}
