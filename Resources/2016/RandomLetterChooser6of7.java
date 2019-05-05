public class RandomLetterChooser2
{
 
private String[] words ;
 
    public RandomLetterChooser2( String[] someWords )
    {
		words = new String[someWords.length];
		for( int i =0 ; i < someWords.length ;i++)
			words[i] = someWords[i] ; //copy values
    }
 
 
	public String getNext(){
	if( words.length ==0)
		return "NONE";
 
	int rand = (int)(Math.random() * words.length);
	
	while( words[rand] == null)
		rand = (int)(Math.random() * words.length);
	
	String word = words[rand];
	words[rand]= null;
 
	return word;
	}
}
