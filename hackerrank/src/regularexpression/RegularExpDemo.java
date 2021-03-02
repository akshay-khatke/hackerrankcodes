package regularexpression;

public class RegularExpDemo {

	public static void main(String[] args) {
		
		String str="Add     1 to    it and        convert the increased number back to string. Check if the next occurring 786 substring is equal to the increased one";
		
		String replace=str.replaceAll("\\D", "");
		System.out.println(replace);
		String []split=str.split("\\s+");
		for(String word:split) {
		System.out.println(word);
		} 
	}

}
