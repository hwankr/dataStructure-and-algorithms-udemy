package linkedList;

public class App {
	public static void main(String[] args) {
		
		LinkedList<Person> people = new LinkedList<>();
		
//		names.insert("Adam");
//		names.insert("Daniel");
//		names.insert("Ana");
//		names.traverse();
//		
//		names.remove("Michael");
//		names.traverse();
		
		Person p = new Person(23, "Adam");
		people.insert(p);
		people.insert(new Person(34, "Daniel"));
		people.insert(new Person(56, "Michael"));
		
		people.remove(p);
		people.traverse();
	}
}
