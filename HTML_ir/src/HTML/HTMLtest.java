package HTML;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HTMLtest {

	@Test
	void test() {
		Node html = new Node("html", null);
		Node head = new Node("head", null);
		html.addChild(head);
		Node title = new Node("title", null);
		head.addChild(title);
		Node titleText = new Node(null, "Ma huh?");
		title.addChild(titleText);
		Node script = new Node("script", null);
		head.addChild(script);
		Node scriptText = new Node(null, "alert('Juuuuw')");
		script.addChild(scriptText);
		
		Node nonsense = new Node("nonsense", null);
		head.addChild(nonsense);
		head.removeChild(nonsense);
		
		
		assertEquals( 
				"<html>" + "<head>" +
				"<title>Ma huh?</title>" +
				"<script>alert('Juuuuw')</script>" +
				"</head>" + "</html>", html.toString());
	}

}
