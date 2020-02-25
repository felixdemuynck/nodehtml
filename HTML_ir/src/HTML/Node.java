package HTML;

public class Node {
	
	private String tag;
	private String text;
	private Node firstChild;
	private Node lastChild;
	private Node nextSibling;
	
	public Node(String tag, String text) {
		this.tag = tag;
		this.text = text;}	
	
//	this gebruiken als verwarring namen kan optreden
// 	onderscheid input <-> gedefinieerde String "tag"

	public void addChild(Node child) {
// 		CONSTANTE TIJD DMV LASTCHILD
		if (this.firstChild != null) {
			lastChild.nextSibling = child;
			lastChild = child;}
		else {
			firstChild = child;
			lastChild = child;}

		
//		ALTERNATIEF 1
//		if(this.firstChild == null) {
//			this.firstChild = child;}
//		else {
//	
//			Node next = this.firstChild;
//			while(next.nextSibling != null) {
//				next = next.nextSibling;}
//				
//			next.nextSibling = child;}
		
		
//		ALTERNATIEF 2
//		if (firstChild != null) {
//			Node nextChild = firstChild;
//			while (nextChild != null)
//				nextChild = nextChild.nextSibling;
//			nextChild.nextSibling = child;
		}
	
	
	public void removeChild(Node exchild) {
		
		if (firstChild == exchild) {
			firstChild = firstChild.nextSibling;
			if (firstChild == null)
				lastChild = null;}
		
		else {
		Node currentChild = firstChild;
		
		while (currentChild.nextSibling != exchild) {
			currentChild = currentChild.nextSibling;}
		if (currentChild.nextSibling.nextSibling == null) {
			lastChild = currentChild;}
		currentChild.nextSibling = currentChild.nextSibling.nextSibling;
		}
			
	}
	
	public String toString() {
		if (text != null) {
			return text;}
		
		String result = "<" + tag + ">";
		
		Node next = this.firstChild;
		while(next != null) {
			result += next.toString();
			next = next.nextSibling;
		}
		result += "</" + tag + ">";
		return result;
				
	}

	
}
