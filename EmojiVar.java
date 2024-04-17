class EmojiVar
{
	public static void main(String[] args)
	{
		int 😀 = 5;
		System.out.println(😀);
	}
}

/*
javac EmojiVar.java 
EmojiVar.java:5: error: illegal character: '\ud83d\ude00'
		int 😀 = 5;
		    ^
EmojiVar.java:5: error: not a statement
		int 😀 = 5;
		^
EmojiVar.java:6: error: illegal character: '\ud83d\ude00'
		System.out.println(😀);
		                   ^
3 errors

*/